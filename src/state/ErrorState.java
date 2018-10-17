package state;

import stateMachine.Calculator;

public final class ErrorState implements StateInterface {
  private static StateInterface state;

  private ErrorState() {
  }

  public void getMessage() {
    System.out.println("Invalid input.");
  }

  /**
   * Save the operator if it's the current state. Other than that, assign error state 
   * @param c
   * @param cal
   */
  public static void changeState(char c, Calculator cal) {
    if (cal.getCurrentState() instanceof OperatorStateInterface) {
      cal.setPreviousState(cal.getCurrentState());
    }
    cal.setCurrentState(ErrorState.getInstance());
    cal.getCurrentState().getMessage();
  }

  public static StateInterface getInstance() {
    if (state == null) {
      state = new ErrorState();
    }
    return state;
  }

}
