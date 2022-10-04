package uni_videos.arrays;

public class Main {
    public static void main(String[] args) {
        User[] u = new User[2];
        u[0] = new User("Tomas");
        u[1] = new User("Adam");

        for (User us : u ){
            System.out.print(us.getName());
        }

    }
}
