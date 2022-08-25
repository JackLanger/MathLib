package math.algebra.linear.r.math;

import static org.junit.jupiter.api.Assertions.assertTrue;

import math.algebra.linear.r.data.ILine;
import math.algebra.linear.r.data.IPlane;
import math.algebra.linear.r.data.IRobject;
import math.algebra.linear.r.data.IVector;
import math.algebra.linear.r.data.LineR;
import math.algebra.linear.r.data.PlaneR;
import math.algebra.linear.r.data.VectorR;
import org.junit.jupiter.api.Test;

class ILinearMathTest {

  /**
   * ${END}.
   **/
  @Test
  /* default */ void subtract() {

  }

  /**
   * ${END}.
   **/
  @Test
  /* default */ void mult() {

  }

  /**
   * Test for {@link LinearMath#angle(IRobject, IRobject)}.
   **/
  @Test
  /* default */ void angleBetweenVertices() {

    IVector aDir = new VectorR(-1, 1, -1);
    IVector bDir = new VectorR(-3, -1, -3);
    IVector cDir = new VectorR(2, 2, 2);
    IVector dDir = new VectorR(3, 1, 3);


    LineR gx = new LineR(new VectorR(3), aDir);
    LineR hx = new LineR(new VectorR(3), bDir);

    var alpha = MathLib.linearAlgebra.angle(aDir, bDir);
    var beta = MathLib.linearAlgebra.angle(cDir, dDir);

    System.out.println(alpha);
    System.out.println(beta);

    assertTrue(Math.round(alpha) == 49.00);
    assertTrue(Math.round(beta) == 22.00);
  }


  /**
   * Test for {@link LinearMath#angle(IRobject, IRobject)}.
   **/
  @Test
  /* default */ void angleBetweenPlanes() {

    IPlane ex = new PlaneR(new VectorR(2, -2, 0), new VectorR(2, 4, 1), new VectorR(1, 3, 2));
    IPlane hx = new PlaneR(new VectorR(1, 0, 2), new VectorR(2, 3, 1), new VectorR(1, 2, 1));


    var alpha = MathLib.linearAlgebra.angle(ex, hx);

    System.out.println(alpha);

    assertTrue((Math.round(alpha * 100) / 100.0) == 20.51);
  }


  /**
   * Test for {@link LinearMath#angle(IRobject, IRobject)}.
   **/
  @Test
  /*default*/ void testAngleBetweenTwoLines() {

    ILine gx = new LineR(new VectorR(2, 1, 3), new VectorR(-4, -2, 6));
    ILine hx = new LineR(new VectorR(2, -1, 7), new VectorR(-4, -4, 10));

    var alpha = MathLib.linearAlgebra.angle(gx, hx);

    assertTrue(twoDigits(alpha) == 12.31);
  }

  private double twoDigits(double alpha) {

    return (Math.round(alpha * 100) / 100.0);
  }


}