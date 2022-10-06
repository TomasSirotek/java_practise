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




    }
}
