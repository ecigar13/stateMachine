package state;

public class SecondDigitState implements DigitState {
  public double insert(double first, double second) {
    return first * 10 + second;
  }

  public int insert(int first, int second) {
    return first * 10 + second;
  }

  public double removeDigit(double first) {
    return first / 10;
  }

  public int removeDigit(int first) {
    return first / 10;
  }

  @Override
  public void getMessage() {
    System.out.println("Second digit state.");

  }

}
