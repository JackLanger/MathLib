package math.algebra.linear.r.data;

/**
 * Object for the Rx.
 *
 * <p>Created by: Jack</p>
 * <p>Date: 24.08.2022</p>
 */
public interface IRobject {

  /**
   * Returns the origin.
   *
   * @return the origin or location in space of the RObject if the R Object is a vector this will
   *     return the vector itself.
   */
  IVector getOrigin();

}
