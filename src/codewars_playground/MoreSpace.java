package codewars_playground;

public class MoreSpace {
    public static void main(String[] args) {

        System.out.println(bmi(80,1.80));



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
