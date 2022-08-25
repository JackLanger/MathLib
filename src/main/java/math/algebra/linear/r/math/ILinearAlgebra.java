package math.algebra.linear.r.math;

import math.algebra.linear.r.data.ILine;
import math.algebra.linear.r.data.IRobject;
import math.algebra.linear.r.data.IVector;

/**
 * collection of methods used in linear mathematics.
 *
 * <p>Created by: Jack</p>
 * <p>Date: 24.08.2022</p>
 */
public interface ILinearAlgebra {

  IVector subtract(IVector direction, IVector origin);

  IVector mult(IVector dirVect, double lambda);

  /**
   * Calculates the angle between two objects in R, where the angle between two vertices can be
   * calculated by:
   *
   * <p>
   * acos (a*b /  |a|*|b|  ).
   * </p>
   *
   * <p>
   * and the angle between a plane and a vector by: <p>asin (a*b /  |a|*|b|  ).</p>
   * </p>
   *
   * @param first  first object
   * @param second second object
   * @param <T>    A representation of a line plane or vector
   * @return the angle between.
   * @throws IllegalArgumentException if object supplied that is not supported
   */
  <T extends IRobject> double angle(T first, T second);

  IVector intercepts(ILine first, ILine second);

}
