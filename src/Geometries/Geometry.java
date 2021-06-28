package Geometries;

//import java.util.List;
import Primitives.*;
//import static Primitives.Util.*;

/**
 * interface of geometries
 * @author reut levenberg 318731916 nitzan popovich 206584104
 *
 */
public interface Geometry {
	
	/**
	 * calculate the normal in point on the geometry
	 * @param p
	 * @return
	 */
	public Vector getNormal(Point3D p);

}
