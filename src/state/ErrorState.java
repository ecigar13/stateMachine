package state;

import stateMachine.Calculator;

public final class ErrorState implements StateInterface {
  private static StateInterface state;

  private ErrorState() {
    // TODO Auto-generated constructor stub
  }

  public void getMessage() {
    System.out.println("Invalid input.");
  }

  @Override
  public void changeState(char c, Calculator calculator) {
    if (Character.isDigit(c) && (c >= '0' && c <= '9')) {
      // update c
      calculator.setN(Integer.valueOf(c));
      updateCurrentState(calculator, this.getInstance());
    } else if (Character.isDigit(c) && (c >= '1' && c <= '9')) {
    } else {
      updateCurrentState(calculator, DigitSecondState.getInstance());
    }
  }

  public static StateInterface getInstance() {
    if (state == null) {
      state = new ErrorState();
    }
    return state;
  }

  public void updateCurrentState(Calculator c, StateInterface instance) {
    // implement
    c.setCurrentState(instance);
  }

}
