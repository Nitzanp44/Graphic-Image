package Geometries;

//import java.util.List;
import Primitives.*;
//import static Primitives.Util.*;

/**
 * class plane, Sets by point on the plane and vector normal
 * @author reut levenberg 318731916 nitzan popovich 206584104
 *
 */
public class Plane implements Geometry {
	
	Point3D point;
	Vector vectorNormal;
	
	/**
	 * constructor receiving a 3 point value and create plane
	 * @param p1
	 * @param p2
	 * @param p3
	 */
	public Plane (Point3D p1, Point3D p2, Point3D p3)
	{
		point=new Point3D(p1);
		vectorNormal=null;
	}
	
	/**
	 * constructor receiving point and vector normal 
	 * @param p
	 * @param v
	 */
	public Plane(Point3D p,Vector v)
	{
		point=new Point3D(p);
		vectorNormal=new Vector(v);
	}

	/**
	 * getters
	 * @return
	 */
	public Point3D getPoint() {
		return point;
	}

	public Vector getVectorNormal() {
		return vectorNormal;
	}

	@Override
	public String toString() {
		return "Plane [point=" + point + ", vectorNormal=" + vectorNormal + "]";
	}

	public Vector getNormal(Point3D p) {
		
		return vectorNormal;
	}

}
