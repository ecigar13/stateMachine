package state;

import stateMachine.Calculator;

public final class EqualState implements StateInterface {
  private static StateInterface obj;

  private EqualState() {
    // TODO Auto-generated constructor stub
  }

  @Override
  public void getMessage() {
    System.out.println("Equal state.");

  }

  public static void changeState(char c, Calculator cal) {
    cal.calculate();
    cal.setN(0);
    cal.setCurrentState(EqualState.getInstance());
  }

  public static StateInterface getInstance() {
    if (obj == null) {
      obj = new EqualState();
    }
    return obj;
  }

}
