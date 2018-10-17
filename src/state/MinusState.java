package state;

import stateMachine.Calculator;

public final class MinusState implements OperatorStateInterface {
  private static StateInterface obj;

  private MinusState() {
    // TODO Auto-generated constructor stub
  }

  @Override
  public void getMessage() {
    System.out.println("Minus state.");

  }

  public static StateInterface getInstance() {
    if (obj == null) {
      obj = new MinusState();
    }
    return obj;
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
    cal.setCurrentState(MinusState.getInstance());
  }

}
