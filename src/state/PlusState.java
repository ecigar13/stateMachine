package state;

import stateMachine.Calculator;

public final class PlusState implements OperatorStateInterface {
  private static StateInterface obj;

  public PlusState() {
  }

  /**
   * Save the current state to previous state and assign new state.
   * 
   * @param c
   * @param cal
   */
  public static void changeState(char c, Calculator cal) {
    cal.calculate();
    cal.setPreviousState(cal.getCurrentState());
    cal.setCurrentState(PlusState.getInstance());
  }

  @Override
  public void getMessage() {
    System.out.println("Plus state.");

  }

  public static StateInterface getInstance() {
    if (obj == null) {
      obj = new PlusState();
    }
    return obj;
  }

}
