package state;

import state.CalculatorStateInterface;

public class StateFactory {
  String operators = "[-+*/=]"; // regex for operator

  public StateFactory() {

  }

  /**
   * Check if input is number, operator or other things.
   * 
   * @param input
   * @return
   */
  public CalculatorStateInterface getState(char input) {
    String temp = Character.toString(input);
    if (Character.isDigit(input)) {
      return new SecondDigitState();
    } else if (temp.matches(operators)) {
      return getOperatorState(input);
    } else
      return new ErrorState();
  }

  /**
   * Check if input is an operator.
   * 
   * @param input
   * @return
   */
  public OperatorStateInterface getOperatorState(char input) {
    if (input == '+') {
      return new PlusState();
    } else if (input == '-') {
      return new MinusState();

    } else if (input == '*') {
      return new MultiplyState();
    } else if (input == '/') {
      return new DivideState();
    } else if (input == '=') {
      return new EqualState();
    }
    return new ErrorState();
  }
}
