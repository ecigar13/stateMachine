package state;

import stateMachine.Calculator;

public final class DigitFirstState implements StateInterface {
  private static StateInterface obj;

  private DigitFirstState() {
    // TODO Auto-generated constructor stub
  }

  /**
   * If n is 0, and input is 0, then change state to DigitFirstState. If input is
   * not 0, then assign it and set state.
   * 
   * Always save the operator to previous state.
   * 
   * @param c
   * @param cal
   */
  public static void changeState(char c, Calculator cal) {
    int t = Character.getNumericValue(c);
    if (cal.getCurrentState() instanceof OperatorStateInterface) {
      cal.setPreviousState(cal.getCurrentState());
    }
    if (cal.getN() == 0 && t == 0) {
      cal.setCurrentState(DigitFirstState.getInstance());
      return;
    } else if (cal.getN() != 0
        && (cal.getCurrentState() instanceof OperatorStateInterface || cal.getCurrentState() instanceof ErrorState)) {
      cal.setN(t);
      cal.setCurrentState(DigitFirstState.getInstance());
    } else {
      DigitSecondState.changeState(c, cal);
      return;
    }

  }

  @Override
  public void getMessage() {
    System.out.println("FirstDigitState");

  }

  public static StateInterface getInstance() {
    if (obj == null) {
      obj = new DigitFirstState();
    }
    return obj;
  }

}
