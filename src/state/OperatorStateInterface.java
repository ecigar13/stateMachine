package state;

public interface OperatorStateInterface extends CalculatorStateInterface {

  public abstract double calculate(double previousTotal, double numberInput);
}
