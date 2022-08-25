package math.algebra.linear.r.data;

import math.algebra.linear.r.data.util.Plaindirections;

/**
 * Plain object, representation of a plan in the R3.
 *
 * <p>Created by: Jack</p>
 * <p>Date: 24.08.2022</p>
 */
public interface IPlane extends IRobject {

  /**
   * Returns the normal Vector of the Plane. The Normal vector is the vector that is orthogonal to
   * the plane.
   *
   * @return
   */
  IVector getNormal();

  /**
   * Returns a List of directions
   *
   * @return
   */
  Plaindirections getDirections();

}
