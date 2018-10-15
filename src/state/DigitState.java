package state;

public interface DigitState extends CalculatorStateInterface {
  public double insert(double first, double second);

  public int insert(int first, int second);

  public double removeDigit(double first);

  public int removeDigit(int first);
}
