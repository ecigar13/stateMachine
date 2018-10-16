package state;

import stateMachine.Calculator;

public class DigitFirstState implements StateInterface {

  public DigitFirstState() {
    // TODO Auto-generated constructor stub
  }

  @Override
  public void changeState(char c, Calculator calculator) {
    // TODO Auto-generated method stub

  }

  @Override
  public void getMessage() {
    System.out.println("FirstDigitState");

  }

}
