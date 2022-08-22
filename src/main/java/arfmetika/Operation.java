package arfmetika;

public class Operation {

    public static void helloName(String name) {
        System.out.println("Hello + " + name + " bro welcome to our project !!!");
    }

    public double sumTwoNums(double num1, double num2) {
        return num1 + num2;
    }

    public double powNumberToN(double num, int degree) {

        double result = 1;
        for (int i = 0; i < degree; i++) {
            result = result * num;
        }
        return result;
    }
}
