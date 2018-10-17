package state;

import stateMachine.Calculator;

public final class DigitSecondState implements StateInterface {
  private static StateInterface state;

  private DigitSecondState() {
  }

  public static void changeState(char c, Calculator cal) {
    int t = Character.getNumericValue(c);
    cal.setN(cal.getN() * 10 + t);
    cal.setCurrentState(DigitSecondState.getInstance());
  }

  @Override
  public void getMessage() {
    System.out.println("DigitSecondState.");

  }

  public static StateInterface getInstance() {
    if (state == null) {
      state = new DigitSecondState();
    }
    return state;
  }

}
