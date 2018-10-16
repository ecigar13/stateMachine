package state;

import stateMachine.Calculator;

public interface StateInterface {
  public void changeState(char c, Calculator calculator);

  public void getMessage();
}
