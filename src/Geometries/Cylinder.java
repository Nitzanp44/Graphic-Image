package Geometries;

import Primitives.*;

/**
 * class cylinder is a tube with final height
 * @author reut levenberg 318731916 nitzan popovich 206584104
 *
 */
public class Cylinder extends Tube {
	
	double _height;
	
	/**
	 * constructor receiving ray, radius and height
	 * @param r
	 * @param _axisRay
	 * @param _height
	 */
	public Cylinder(RadialGeometry r, Ray _axisRay, double _height) {
		super(r, _axisRay);
		this._height = _height;
	}

	/**
	 * getters
	 * @return
	 */
	public double get_height() {
		return _height;
	}
	
	public Ray get_axisRay() {
		return super.get_axisRay();
	}

	public double getRadius()
	{
		return super.get_radius();
	}

	@Override
	public String toString() {
		return "Cylinder [_height=" + _height + ", _axisRay=" + _axisRay + ", _radius=" + _radius + "]";
	}
	
	@Override
	public Vector getNormal(Point3D p)
	{
		return null;
	}

}
