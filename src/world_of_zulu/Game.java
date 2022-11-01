package world_of_zulu;


    /**
     *  This class is the main class of the "World of Zuul" application.
     *  "World of Zuul" is a very simple, text based adventure game.  Users
     *  can walk around some scenery. That's all. It should really be extended
     *  to make it more interesting!
     *
     *  To play this game, create an instance of this class and call the "play"
     *  method.
     *
     *  This main class creates and initialises all the others: it creates all
     *  rooms, creates the parser and starts the game.  It also evaluates and
     *  executes the commands that the parser returns.
     *
     * @author  Michael Kölling and David J. Barnes
     * @version 2011.07.31
     */

    public class Game
    {
        private Parser parser;
        private Room currentRoom;

        /**
         * Create the game and initialise its internal map.
         */
        public Game()
        {
            createRooms();
            parser = new Parser();
        }

        /**
         * Create all the rooms and link their exits together.
         */
        private void createRooms()
        {
            Room entrance, mainLobby, vault, securityOffice, serverRoom;
            Item mainLobbyItem,mainLobbyItem2;

            entrance = new Room("outside entrance of the National Bank");
            mainLobby = new Room("in a bank lobby and you fear no fear");
            vault = new Room("in the vault");
            securityOffice = new Room("in a security office");
            serverRoom = new Room("in the server room");

            mainLobbyItem = new Item("Hackable camera",30);
            mainLobbyItem2 = new Item("Used chewing gum",2);
            // initialise room exits
            entrance.setExit("north",mainLobby);
            mainLobby.setExit("down",vault);
            mainLobby.setItems(mainLobbyItem);
            mainLobby.setItems(mainLobbyItem2);
            vault.setExit("up",mainLobby);
            securityOffice.setExit("east",mainLobby);
            serverRoom.setExit("west",securityOffice);

            currentRoom = entrance;
        }

        /**
         *  Main play routine.  Loops until end of play.
         */
        public void play()
        {
            printWelcome();

            // Enter the main command loop.  Here we repeatedly read commands and
            // execute them until the game is over.

            boolean finished = false;
            while (!finished) {
                Command command = parser.getCommand();
                finished = processCommand(command);
            }
            System.out.println("Thank you for playing.  Good bye.");
        }

        /**
         * Print out the opening message for the player.
         */
        private void printWelcome()
        {
            System.out.println("\u001B[31m");
            System.out.println();
            System.out.println("Welcome to the World of Robbers");
            System.out.println("World of Robbers is a new, incredibly exciting action game.");
            System.out.println("Your goal is simple : Hit the bank's main vault, hack the server ,fly to Bahami ... do NOT get CAUGHT");
            System.out.println("Type 'help' if you need help.");
            System.out.println();

            printLocationInfo();
            System.out.println();
        }

        /**
         * Given a command, process (that is: execute) the command.
         * @param command The command to be processed.
         * @return true If the command ends the game, false otherwise.
         */
        private boolean processCommand(Command command)
        {
            boolean wantToQuit = false;

            if(command.isUnknown()) {
                System.out.println("I don't know what you mean...");
                return false;
            }

            String commandWord = command.getCommandWord();
            if (commandWord.equals("help")) {
                printHelp();
            }
            else if (commandWord.equals("go")) {
                goRoom(command);
            }
            else if (commandWord.equals("look")) {
                look();
            }
            else if (commandWord.equals("suicide")) {
                suicide();
                wantToQuit = quit(command);
            }
            else if (commandWord.equals("quit")) {
                wantToQuit = quit(command);
            }

            return wantToQuit;
        }

        private void suicide() {
            System.out.println("You gave up on your dream, took a shotgun and painted your surrounding with your dump brain");
        }

        // implementations of user commands:

        /**
         * Print out some help information.
         * Here we print some stupid, cryptic message and a list of the
         * command words.
         */
        private void printHelp()
        {
            System.out.println("You are lost. You are an pleb robber. You have no hope for ever being rich.. You wander");
            System.out.println("around at the bank");
            System.out.println();
            System.out.println("Your command words are:");
            System.out.println(parser.showCommands());
        }

        /**
         * Try to go in one direction. If there is an exit, enter
         * the new room, otherwise print an error message.
         */
        private void goRoom(Command command)
        {
            if(!command.hasSecondWord()) {
                // if there is no second word, we don't know where to go...
                System.out.println("Go where?");
                return;
            }

            String direction = command.getSecondWord();

            // Try to leave current room.
            Room nextRoom = currentRoom.getExit(direction);

            if (nextRoom == null) {
                System.out.println("There is no door!");
            }
            else {
                currentRoom = nextRoom;
                printLocationInfo();
                System.out.println();
            }
        }

        /**
         * "Quit" was entered. Check the rest of the command to see
         * whether we really quit the game.
         * @return true, if this command quits the game, false otherwise.
         */
        private boolean quit(Command command)
        {
            if(command.hasSecondWord()) {
                System.out.println("Quit what?");
                return false;
            }
            else {
                return true;  // signal that we want to quit
            }
        }
        /**
         * "Look" was entered. Prints out the current option of directions in the current room
         */
        private void look()
        {
            System.out.println(currentRoom.getLongDescription());
        }

        private void printLocationInfo()
        {
            System.out.println(currentRoom.getLongDescription());
            currentRoom.getItems().forEach(entry -> System.out.println("Item found -> " + entry.getDescription() + ", Weight: " + entry.getWeight()));
         //   currentRoom.getItems().stream().map(Item::getDescription).forEach(System.out::println);
        }
    }

