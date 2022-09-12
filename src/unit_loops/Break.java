package unit_loops;

public class Break {
    public static void main(String[] args) {
        // Break - Continue
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i);
            if(i == 3){
                continue;
            }
        }

        int i = 0;

        do{
            i++;
        } while (i < 5);

        while (i < 5){
            i++;
        }

    }
}
