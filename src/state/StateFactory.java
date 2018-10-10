package state;

import com.sun.org.apache.xpath.internal.operations.Plus;

public class StateFactory {
  String operators = "[-+*/]";  //regex for operator

  public StateFactory() {
    // TODO Auto-generated constructor stub
  }

  /**
   * Check if input is number, operator or other things.
   * @param input
   * @return
   */
  public State getState(char input) {
    String temp = Character.toString(input);
    if (Character.isDigit(input)) {
      return new DigitState();
    } else if (temp.matches(operators)) {
      return getOperatorState(input);
    } else
      return new ErrorState();
  }

  /**
   * Check if input is an operator.
   * @param input
   * @return
   */
  public State getOperatorState(char input) {
    if (input == '+') {
      return new PlusState();
    } else if (input == '-') {
      return new MinusState();

    } else if (input == '*') {
      return new MultiplyState();
    } else if (input == '/') {
      return new DivideState();
    } else
      return new ErrorState();
  }
}
