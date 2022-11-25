package codewars_playground;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MoreSpace {
    public static void main(String[] args) {

        System.out.println(bmi(80,1.80));

        System.out.println(findUniq(new double[]{0,1,0}));

    }

    public static double findUniq(double arr[]) {
        var test = 3;
        double arr2[] = null;

        return Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue() == 1).findFirst().get().getKey();
    }

    public static String bmi(double weight, double height) {
        double underweight = 18.5;
        double normal = 25.0;
        double overweight = 30;
        double obese = 30;

        double result = (height * height) / weight;
        String resultBack = "";

        if(result <= underweight){
            resultBack = "Underweight";
        }else if(result <= normal){
            resultBack = "Normal";
        }else if (result <= overweight){
            resultBack = "Overweight";
        }else if(result > obese) {
            resultBack = "Obese";
        }
        return resultBack;
    }
}
