package state;

import stateMachine.Calculator;

public class DigitSecondState implements StateInterface {
  private static StateInterface state;

  private DigitSecondState() {
    // TODO Auto-generated constructor stub
  }

  @Override
  public void changeState(char c, Calculator calculator) {
    // TODO Auto-generated method stub

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
