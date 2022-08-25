package math.algebra.linear.r.data;

import math.algebra.linear.r.data.util.Plaindirections;

/**
 * Plane object in R.
 *
 * <p>Created by: Jack</p>
 * <p>Date: 24.08.2022</p>
 */
public class PlaneR implements IPlane {

  private final IVector dirOne;
  private final IVector dirTwo;
  private final IVector origin;

  @Override
  public IVector getNormal() {

    var fData = this.dirOne.getData();
    var sData = this.dirTwo.getData();

    var x = fData[1] * sData[2] - fData[2] * sData[1];
    var y = fData[2] * sData[0] - fData[0] * sData[2];
    var z = fData[0] * sData[1] - fData[1] * sData[0];

    return new VectorR(x, y, z);
  }

  @Override
  public Plaindirections getDirections() {

    return new Plaindirections(dirOne, dirTwo);
  }

  @Override
  public IVector getOrigin() {

    return this.origin;
  }

  public PlaneR(IVector origin, IVector first, IVector second) {

    this.origin = origin;
    this.dirOne = first;
    this.dirTwo = second;
  }

}
