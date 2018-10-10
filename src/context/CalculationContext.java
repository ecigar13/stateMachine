package context;

import state.State;

public class CalculationContext implements State {
  private State previousState;
  private State currentState;
  private int total;

  public int getTotal() {
    return total;
  }

  public void setState(State state) {
    this.currentState = state;
  }

  public State get() {
    return this.currentState;
  }

  public CalculationContext() {
    this.total = 0;
  }

  @Override
  public void calculate() {
    this.currentState.calculate();

  }

}
