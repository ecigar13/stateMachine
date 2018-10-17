package stateMachine;

public class Main {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.input('0');
    calculator.input('9');
    calculator.input('+');
    calculator.input('1');
    calculator.input('0');
    calculator.input('+');
    calculator.input('.');
    calculator.input('1');
    calculator.input('0');
    calculator.input('-');
    calculator.input('2');
    calculator.input('2');
    // invalid input
    calculator.input('.');
    calculator.input('=');
    System.out.println("Done");
  }

}
