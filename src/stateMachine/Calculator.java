package stateMachine;

import com.sun.corba.se.spi.orbutil.fsm.State;

import state.*;

public class Calculator {
  StateInterface previousState;
  StateInterface currentState;

  int accumulate;
  int n;

  public Calculator() {
    accumulate = 0;
    n = 0;
  }

  public void input(char c) {
    s.input(c);

  }

  public void changeState(char c, this) {
    s.changeState(c,this);
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }

  public StateInterface getPreviousState() {
    return previousState;
  }

  public void setPreviousState(StateInterface previousState) {
    this.previousState = previousState;
  }

  public StateInterface getCurrentState() {
    return currentState;
  }

  public void setCurrentState(StateInterface currentState) {
    this.currentState = currentState;
  }

}
