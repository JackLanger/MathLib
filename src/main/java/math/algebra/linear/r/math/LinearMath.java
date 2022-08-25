package math.algebra.linear.r.math;

import static math.algebra.linear.r.utils.ValidateUtils.isSameSize;

import kotlin.NotImplementedError;
import math.algebra.linear.r.data.ILine;
import math.algebra.linear.r.data.IPlane;
import math.algebra.linear.r.data.IRobject;
import math.algebra.linear.r.data.IVector;
import math.algebra.linear.r.data.VectorR;
import math.algebra.linear.r.utils.ExceptionStrings;
import org.jetbrains.annotations.Nullable;

/**
 * Linear mathematics object.
 *
 * <p>Created by: Jack</p>
 * <p>Date: 24.08.2022</p>
 */
public class LinearMath implements ILinearAlgebra {

  private double anglePlainVertice(IPlane plane, IVector vertice) {

    double sin = getCosalpha(plane.getNormal(), vertice);
    return Math.toDegrees(Math.asin(sin));  // 180*PI*radiant
  }


  private double angleVertices(IVector first, IVector second) {

    var cosAlpha = getCosalpha(first, second);
    var acosAlpha = Math.acos(cosAlpha);
    return Math.toDegrees(acosAlpha);   // method to convert from radians to degree (180°PI*rad)
  }

  private double getCosalpha(IVector first, IVector second) {

    double fLenght = first.getLength();
    double sLenght = second.getLength();

    return mult(first, second) / (fLenght * sLenght);
  }

  public double mult(IVector first, IVector second) {

    double skalar = 0;


    double[] fData = first.getData();
    double[] sData = second.getData();

    if (isSameSize(fData, sData)) {
      for (int i = 0; i < fData.length; i++) {
        skalar += fData[i] * sData[i];
      }
    } else {
      throw new IllegalArgumentException(ExceptionStrings.INVALID_SIZE_EXCEPTION.getValue());
    }

    return skalar;
  }

  public IVector subtract(IVector direction, IVector origin) {

    var oData = origin.getData();
    var dData = direction.getData();
    if (isSameSize(oData, dData)) {
      double[] temp = new double[oData.length];

      for (int i = 0; i < oData.length; i++) {
        temp[i] = dData[i] - oData[i];
      }

      return new VectorR(temp);
    } else {
      throw new IllegalArgumentException(ExceptionStrings.INVALID_SIZE_EXCEPTION.getValue());
    }
  }

  public IVector mult(IVector dirVect, double lambda) {

    var data = dirVect.getData();
    var temp = new double[data.length];

    for (int i = 0; i < data.length; i++) {
      temp[i] = data[i] * lambda;
    }
    return new VectorR(temp);
  }

  public <T extends IRobject> double angle(T first, T second) {

    if (first == null || second == null) {
      throw new IllegalArgumentException(ExceptionStrings.NULL_PASSED);
    }
    Double angle = .0;
    if (first instanceof IVector fVector) {
      angle = calcAngle(second, fVector);
    } else if (first instanceof IPlane fPlane) {
      angle = calcAngle(second, fPlane.getNormal());
    } else if (first instanceof ILine fLine) {
      angle = calcAngle(second, fLine.getDirection());
    }
    return angle;
  }

  @Override
  public IVector intercepts(ILine first, ILine second) {

    throw new NotImplementedError("not yet implemented");
  }

  @Nullable
  private <T extends IRobject> Double calcAngle(T second, IVector fVector) {

    if (second instanceof IVector sVector) {
      return angleVertices(fVector, sVector);
    }

    if (second instanceof IPlane sPlane) {
      return anglePlainVertice(sPlane, fVector);
    }

    if (second instanceof ILine sLine) {
      return angleVertices(fVector, sLine.getDirection());
    }

    throw new IllegalArgumentException(ExceptionStrings.INVALID_OBJECT.getValue());
  }


}
