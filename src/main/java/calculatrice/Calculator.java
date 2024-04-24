package calculatrice;

public class Calculator {

    public double add(double... numbers) {
        double result = 0;
        for (double num : numbers) {
            result += num;
        }
        return result;
    }

    public double subtract(double... numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public double multiply(double... numbers) {
        double result = 1;
        for (double num : numbers) {
            result *= num;
        }
        return result;
    }

    public double divide(double num1, double num2) {

        if(num2!=0){
        return num1/num2;}

        throw new IllegalArgumentException("division par zero");


    }
    public double sum(double... numbers) {
        return add(numbers);
    }
}