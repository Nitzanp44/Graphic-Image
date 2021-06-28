package Geometries;

import Primitives.*;

/**
 * class sphere, is a radial geometry, define by center point and radius
 * @author reut levenberg 318731916 nitzan popovich 206584104
 *
 */

public class Sphere extends RadialGeometry
{
	Point3D center;
	
	/**
	 * constructor receiving a point value and radius
	 * @param r
	 * @param c
	 */
	public Sphere(double r, Point3D c) 
	{
		super(r);
		center=new Point3D(c);
		// TODO Auto-generated constructor stub
	}

	/**
	 * geteers
	 * @return
	 */
	public Point3D getCenter() {
		return center;
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
		return "Sphere [center=" + center + ", _radius=" + _radius + "]";
	}

}
