package stateMachine;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // setState c
    // change state
    Calculator calculator = new Calculator();
    calculator.input('9');
    calculator.input('+');
    calculator.input('1');
    calculator.input('0');
    calculator.input('+');
    calculator.input('1');
    calculator.input('0');
    calculator.input('-');
    calculator.input('2');

  }

}
