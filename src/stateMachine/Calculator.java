package stateMachine;

import state.*;

public class Calculator {
  StateInterface previousState;
  StateInterface currentState;
  StateInterface errorState; // for error handling

  String operators = "[-+*/=]"; // regex for operator
  int acc;
  int n;

  public Calculator() {
    acc = 0;
    n = 0;
    currentState = DigitFirstState.getInstance();
    previousState = DigitFirstState.getInstance();
  }

  /**
   * Process input and change state.
   * 
   * @param c
   */
  public void input(char c) {
    changeState(c, this);
    System.out.println("Input: " + c);
    System.out.println("n: " + n);
    System.out.println("Total: " + acc);
    System.out.print("Previous state: ");
    previousState.getMessage();
    System.out.print("Current state: ");
    currentState.getMessage();
    System.out.println();

  }

  /**
   * Do calculation based on the saved state of the operator.
   */
  public void calculate() {
    if (previousState instanceof MinusState) {
      acc -= n;
    } else if (previousState instanceof PlusState) {
      acc += n;
    } else {
      acc = n;
      n = 0;
    }
  }

  /**
   * Change state based on input. Number assignment is done in Calculator class.
   * Then perform state change. I can put this inside state if required.
   * 
   * @param c
   * @param cal
   */
  public void changeState(char c, Calculator cal) {
    String temp = Character.toString(c);
    if (Character.isDigit(c)) {
      DigitFirstState.changeState(c, cal);
    } else if (temp.matches(operators)) {
      setOperatorState(c, cal);
    } else {
      ErrorState.changeState(c, cal);

    }

  }

  /**
   * Check if input is an operator.
   * 
   * @param c
   */
  public void setOperatorState(char c, Calculator cal) {

    if (c == '+') {
      PlusState.changeState(c, cal);
    } else if (c == '-') {
      MinusState.changeState(c, cal);
    } else {
      EqualState.changeState(c, cal);
    }
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }

  public StateInterface getPreviousState() {
    return previousState;
  }

  public void setPreviousState(StateInterface s) {
    this.previousState = s;
  }

  public StateInterface getCurrentState() {
    return currentState;
  }

  public void setCurrentState(StateInterface s) {
    this.currentState = s;
  }

  public StateInterface getErrorState() {
    return errorState;
  }

  public void setErrorState(StateInterface errorState) {
    this.errorState = errorState;
  }

  public int getAccumulate() {
    return acc;
  }

  public void setAccumulate(int acc) {
    this.acc = acc;
  }

}
