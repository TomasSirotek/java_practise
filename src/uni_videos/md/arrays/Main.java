package uni_videos.md.arrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // normal one
        String[] _1dArray = new String[2];
        _1dArray[0] = "zero position";
        _1dArray[1] = "first position";

        for (String j : _1dArray) {
           System.out.print(j);
        }

        // 2 multidimensional
        String[][] _2dArray = new String[2][2];
        _2dArray[0][0] = "first group ";
        _2dArray[0][1] = "first group";

        _2dArray[1][0] = "second group";
        _2dArray[1][1] = "second group";


        for (int r = 0; r < _2dArray.length; r++) {
            for (int c = 0; c < _2dArray[0].length; c++) {
                System.out.print(_2dArray[r][c] + "" + " , ");
            }
            System.out.println();
        }

        // 3d

        int[][][] _3dArray = new int[3][3][3];

        _3dArray[0][0][0] = 10;
        _3dArray[1][1][0] = 20;
        _3dArray[2][0][0] = 30;

        for (int r = 0; r < _3dArray.length; r++) {
            for (int r2 = 0; r2 < _3dArray[r].length; r2++) {
                for (int c = 0; c < _3dArray[r2].length; c++) {
                    System.out.print(_3dArray[r][r2][c] + "" + " , ");
                }
                System.out.println();
            }
        }

        User[][][] _userArray = new User[2][3][30];

        _userArray[0][0][0] = new User(1,"User 1","email");
        _userArray[0][1][0] = new User(2,"User 2","email2");
        _userArray[0][2][0] = new User(2,"User 2","email2");

        _userArray[1][0][0] = new User(3,"User 3","email3");
        for (int r = 0; r < _userArray.length; r++) {
            for (int r2 = 0; r2 < _userArray[r].length; r2++) {
                for (int c = 0; c < _3dArray[r2].length; c++) {
                    System.out.print(_3dArray[r][r2][c] + "" + " , ");
                }
                System.out.println();
            }
        }


    }

    public static class User {
        public int id;
        public String name;
        public String email;

        public User(int id,String name,String email){
            this.id = id;
            this.name = name;
            this.email = email;
        }
    }
}
