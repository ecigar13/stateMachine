package state;

public class ErrorState implements CalculatorStateInterface {

  public ErrorState() {
    // TODO Auto-generated constructor stub
  }

  public void getMessage() {
    System.out.println("Invalid input.");
  }

}
