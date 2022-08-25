package math.algebra.linear.r.data;

/**
 * A math.algebra.linear.r.data.VectorR, data representation of a vector in Rx.
 *
 * <p>Created by: Jack</p>
 * <p>Date: 24.08.2022</p>
 */
public class VectorR implements IVector {

  private final double[] data;

  @Override
  public double[] getData() {

    return this.data;
  }

  @Override
  public double getLength() {

    double sum = 0;

    for (double d : data) {
      sum += d * d;
    }

    return Math.sqrt(sum);
  }

  @Override
  public ILine toLine(IVector origin) {

    return new LineR(origin, this);
  }

  @Override
  public IVector getOrigin() {

    return this;
  }

  /**
   * Creates a new math.algebra.linear.r.data.VectorR and populates its data with the values
   * provided.
   *
   * @param data
   */
  public VectorR(double... data) {

    this.data = data;
  }

  /**
   * Creates an empty vector in the Rx with the dimensions provided.
   *
   * @param dimensions the dimensions of the vector.
   */
  public VectorR(int dimensions) {

    data = new double[dimensions];
  }


}
