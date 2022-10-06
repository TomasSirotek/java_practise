package unit_loops;

public class DefaultLoops {
    public static void main(String[] args) {

        // incrementing from 7 to 20
        for (int i = 7; i < 21; i++) {
            System.out.println(i);
        }

        // decrementing from 1250 until 480
        for (int i = 1250; i >= 480; i--) {
            System.out.println(i);
        }

        // While loops
        // print from 1 to 10 and then stops
        int i = 0;

        while(i < 10){
            i++;
            System.out.println("Running" + i);

        }

    }
}
