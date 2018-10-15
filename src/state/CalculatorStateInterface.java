package state;

/**
 * Base class for all states.
 * 
 * @author khoa
 *
 */
public interface CalculatorStateInterface {

  public abstract void getMessage();

  public abstract double insert(double a, double b);

}
