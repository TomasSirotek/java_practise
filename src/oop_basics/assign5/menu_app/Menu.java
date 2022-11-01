package oop_basics.assign5.menu_app;

import java.io.IOException;
import java.util.Scanner;

/**
 * Abstract class implementing the basic functionality of a console based
 * menu class. A menu can be created by sub-classing this class and implement
 * the abstract method doAction(option).
 *
 * The constructor of the sub-class must invoke the super-class constructor by
 * the instruction
 *
 *          super(“some header”, “menuoption1", "menuoption2");
 *
 * Note, that this instruction must be the first instruction of the sub-class
 * constructor.
 *
 * @author bhp
 */
public abstract class Menu
{
    // value used to exit the menu.
    // the value can be changed by the sub-class constructor.
    protected int EXIT_OPTION = 0;

    // The menu header text
    private String header;

    // The list of menu options texts.
    private String[] menuItems;

    /**
     * Abstract method stating what should be done, when a
     * menu option is selected.
     * The method must be overridden by the sub-class.
     * @param option the menu option that has been selected.
     */
    protected abstract void doAction(int option);


    /**
     * Creates an instance of the class with the given header text and
     * menu options.
     * @param header    The header text of the menu.
     * @param menuItems The list of menu items texts.
     */
    public Menu(String header, String[] menuItems)
    {
        this.header = header;
        this.menuItems = menuItems;
    }

    /**
     * Executes the menu until the EXIT_OPTION has been selected.
     * This is an implementation of the Template Method design pattern.
     */
    public void run() throws IOException {
        boolean done = false;
        while (!done)
        {
            showMenu();
            int option = getOption();
            doAction(option);
            if (option == EXIT_OPTION)
            {
                done = true;
            }else {
                pause();
            }
        }
    }
    /**
     * Returns a valid menu-option input from the keyboard.
     * The method continues prompting for an option value, until
     * a valid option has been input.
     * @return A valid menu option.
     */
    private int getOption()
    {
        String input = null;
        while (input == null){
            System.out.println("Input valid input");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            try{
                int option = Integer.parseInt(input);
                if(option <= menuItems.length && option >= 0){
                    return option;
                }else {
                    System.out.println("Need valid number!");
                    input = null;
                }
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
        }
        return 0;
    }

    /**
     * Prints out a console menu
     with a header text and a list
     * of menu options. The menu
     options will be assigned the numbers
     * from 1 to the number of
     options in the menu.
     */
    private void showMenu()
    {
        System.out.println("*****" + header + "*****");
        System.out.println("0 -> STOP");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ": " + menuItems[i]);
        }
        System.out.print("Choose your option : ");
    }

    /**
     * Waits until the 'enter' key is pressed.
     */
    protected void pause() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Waiting please press enter to continue");
        scanner.nextLine();
    }

    /**
     * Clears the screen by writing several empty lines.
     */
    protected void clear()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

