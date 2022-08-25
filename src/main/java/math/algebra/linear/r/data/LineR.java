package math.algebra.linear.r.data;

import math.algebra.linear.r.math.MathLib;

/**
 * .
 *
 * <p>Created by: Jack</p>
 * <p>Date: 24.08.2022</p>
 */
public class LineR implements ILine {

  private final IVector origin;
  private final IVector direction;

  @Override
  public IVector getOrigin() {

    return this.origin;
  }

  @Override
  public IVector getDirection() {

    return this.direction;
  }

  @Override
  public IVector getPoint(double lambda) {

    IVector dirVect = MathLib.linearAlgebra.subtract(direction, origin);

    return MathLib.linearAlgebra.mult(dirVect, lambda);
  }

  public LineR(double[] orig, double[] dir) {

    this.origin = new VectorR(orig);
    this.direction = new VectorR(orig);
  }

  public LineR(IVector orig, IVector dir) {

    this.origin = orig;
    this.direction = dir;
  }


}
