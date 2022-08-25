package math.algebra.linear.r.data;

/**
 * .
 *
 * <p>Created by: Jack</p>
 * <p>Date: 24.08.2022</p>
 */
public interface ILine extends IRobject {


  /**
   * Returns the direction of the line.
   *
   * @return a {@link IVector} representing the lines direction.
   */
  IVector getDirection();

  /**
   * Returns a point along the line.
   *
   * @param lambda The distance onn the line
   * @return a {@link IVector} representing the point
   */
  IVector getPoint(double lambda);

}
