package Geometries;

import Primitives.*;

/**
 *  class sphere, is a polygon with 3 vertices 
 * @author reut levenberg 318731916 nitzan popovich 206584104
 *
 */

public class Triangle extends Polygon{
	
	/**
	 * constructor receiving a 3 point value 
	 * @param p1
	 * @param p2
	 * @param p3
	 */
	public Triangle(Point3D p1, Point3D p2, Point3D p3)
	{
		super(p1,p2,p3);
	}

	@Override
	public String toString() {
		return "Triangle [_vertices=" + _vertices + ", _plane=" + _plane + "]";
	}
	
}
