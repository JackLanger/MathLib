package math.algebra.linear.r.data;

/**
 * Interface to get access to vector data.
 *
 * <p>Created by: Jack</p>
 * <p>Date: 24.08.2022</p>
 */
public interface IVector extends IRobject {

  /**
   * Returns the data.
   *
   * @return the data of the vector.
   */
  double[] getData();

  /**
   * Returns the Length of the vector.
   *
   * @return the length of the vector.
   */
  double getLength();

  /**
   * Creates a line from a vector by adding another vector
   *
   * @param origin the start point of the line vector
   * @return a Line object that represents an infinit line in the R
   */
  ILine toLine(IVector origin);

}
