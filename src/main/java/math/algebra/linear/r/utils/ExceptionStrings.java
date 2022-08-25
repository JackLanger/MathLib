package math.algebra.linear.r.utils;

/**
 * Collection of Strings used for exceptions.
 *
 * <p>Created by: Jack</p>
 * <p>Date: 24.08.2022</p>
 */
public enum ExceptionStrings {
  /**
   * Message for invallid object input.
   */
  INVALID_OBJECT("The object must be of type IRobject"),
  /**
   * Message for input of different R.
   */
  INVALID_SIZE_EXCEPTION("Both vertices must be of the same space.");


  public static final String NULL_PASSED = "The value passed was null.";
  /**
   * Backing field fo rthe value assigned.
   */
  private final String value;

  /**
   * Returns the value;
   *
   * @return the value associated with the entry
   */
  public String getValue() {

    return value;
  }

  ExceptionStrings(String val) {

    this.value = val;
  }
}
