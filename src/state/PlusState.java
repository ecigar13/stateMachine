package state;

public class PlusState implements OperatorStateInterface {

  public PlusState() {
  }

  @Override
  public double calculate(double previousTotal, double numberInput) {
    return previousTotal + numberInput;

  }

  @Override
  public void getMessage() {
    System.out.println("Plus state.");

  }

  @Override
  public double insert(double a, double b) {
    // TODO Auto-generated method stub

  }

}
