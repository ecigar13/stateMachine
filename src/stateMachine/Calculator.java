package stateMachine;

import context.CalculationContext;

public class Calculator {

  CalculationContext cc;

  public Calculator() {
    this.cc = new CalculationContext();
  }

  public void setState(char c) {
    cc.setState(c);

  }

}
