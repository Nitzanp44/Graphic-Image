package Geometries;

import Primitives.*;

/**
 * abstract class Common to the circular geometries, contain radius
 * @author reut levenberg 318731916 nitzan popovich 206584104
 *
 */

public abstract class RadialGeometry implements Geometry {
	
	double _radius;
	
	/**
	 * copy constructor 
	 * @param r
	 */
	public RadialGeometry(RadialGeometry r)
	{
		_radius=r._radius;
	}

	/**
	 * constructor receiving a number for the radius
	 * @param r
	 */
	public RadialGeometry(double r) {
		_radius=r;
		// TODO Auto-generated constructor stub
	}

	/**
	 * get radius
	 * @return
	 */
	public double get_radius() {
		return _radius;
	}
	
	@Override
	public abstract Vector getNormal(Point3D p);
}