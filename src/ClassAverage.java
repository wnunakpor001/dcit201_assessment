public class ClassAverage{
    public static double calculateClassAverage(double num1, double num2){
        return (num1 + num2 )/2 ;
    }
    public static double calculateClassAverage(double num1, double num2, double num3){
        return (num1 + num2 + num3)/3;
    }
    public static double calculateClassAverage(double[] numbers){
        double sum = 0;
        for ( double c : numbers){
            sum += c;
        }
        return sum/ numbers.length;
    }
    public static void main(String[] args){
        double[] arr = {10,20,30,40};
        calculateClassAverage(arr);
        System.out.println(calculateClassAverage(arr));
        System.out.println(calculateClassAverage(24.0,12));
    }
}
