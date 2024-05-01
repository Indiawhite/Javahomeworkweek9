package calculate;

public class Calculator {
    public void addition(int a, int b){
        System.out.println("AddNumber : "  + (a + b));
    }
    public void subtraction(int a , int b){
        System.out.println("SubTraction : " + (a + b));
    }
    public void division (int a , int b){
        System.out.println("Division number : " + (a / b) );
    }
    public void multiplication(int a , int b){
        System.out.println("Multiplication Number : " + (a * b));
    }


    public void calculateResult(int a, int b, char symbol) {
        switch (symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;
            default:
                System.out.println("Invalid symbol.");

        }
    }
}




