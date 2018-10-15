package context;

import state.CalculatorStateInterface;
import state.DigitState;
import state.SecondDigitState;
import state.StateFactory;
import state.EqualState;
import state.ErrorState;
import state.FirstDigitState;
import state.OperatorStateInterface;

public class CalculationContext {
  private CalculatorStateInterface previousState;
  private CalculatorStateInterface currentState;
  StateFactory sFactory;
  private double previousTotal = 0;
  private double numberInput = 0;

  public void input(String c) {
    CalculatorStateInterface s = sFactory.getState(c);
    
    if(!(s instanceof FirstDigitState) && previousState == null) {
      currentState = new ErrorState();
      currentState.getMessage();
    }
    if (s instanceof ErrorState) {
      currentState=s;
      s.getMessage();
    } else if(s instanceof OperatorStateInterface){

    }else if(s instanceof DigitState) {
      s.insert(previousTotal, Double.parseDouble(c));
    }else if(s instanceof )
    cc.setState(s);
  }

  public void calculate() {
    if (currentState instanceof EqualState) {
      System.out.println(previousTotal);
    } else if (currentState instanceof OperatorStateInterface) {
      previousTotal = this.currentState.calculate(previousTotal, numberInput);
    }
    currentState.getMessage();
  }

  public double getNumberInput() {
    return numberInput;
  }

  public void setNumberInput(char numberInput) {
    this.numberInput = Integer.valueOf(numberInput);
  }

  public CalculationContext() {
    this.previousTotal = 0;
    sFactory = new StateFactory();
  }

  public double getTotal() {
    return previousTotal;
  }

  public CalculatorStateInterface getState() {
    return this.currentState;
  }

}
