package stateMachine;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // setState c
    // change state
    Calculator calculator = new Calculator();
    calculator.setState('9');
    calculator.setState('+');
    calculator.setState('1');
    calculator.setState('0');
    calculator.setState('+');
    calculator.setState('1');
    calculator.setState('0');
    calculator.setState('-');
    calculator.setState('2');

  }

}
