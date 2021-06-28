package Geometries;

import Primitives.*;

/**
 * class tube, is a radial geometry, define by ray and radius
 * @author reut levenberg 318731916 nitzan popovich 206584104
 *
 */

public class Tube extends RadialGeometry {
	
	Ray _axisRay;
	
	/**
	  * constructor receiving ray and radius
	 * @param r
	 * @param _axisRay
	 */
	public Tube(RadialGeometry r, Ray _axisRay) {
		super(r);
		this._axisRay = _axisRay;
	}

	/**
	 * getters
	 * @return
	 */
	public Ray get_axisRay() {
		return _axisRay;
	}

	public double getRadius()
	{
		return super.get_radius();
	}
	
	@Override
	public Vector getNormal(Point3D p)
	{
		return null;
	}

	@Override
	public String toString() {
		return "Tube [_axisRay=" + _axisRay + ", _radius=" + _radius + "]";
	}	

}
