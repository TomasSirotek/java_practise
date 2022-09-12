package just_playground;

public class User {

    public int i;
    public int maxValue;
    // constructor
    public User(){
        maxValue = 10;
        displayValues();
    }

    // methods
    public void displayValues(){
        for (i = 0; i  <  maxValue ; ++i) {
            System.out.println(i);
        }

    }
}
