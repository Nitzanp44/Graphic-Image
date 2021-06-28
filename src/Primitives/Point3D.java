package Primitives;

/**
 * 
 * @author reut levenberg 318731916 nitzan popovich 206584104
 * Class point3D is the base on coordinate class, Sets a point in space by 3 coordinate.
 *
 */
public class Point3D {
	Coordinate x;
	Coordinate y;
	Coordinate z;
	public final static Point3D ZERO=new Point3D(0,0,0);
	
	/**
	 * constructor receiving a 3 coordinate value 
	 * @param _x
	 * @param _y
	 * @param _z
	 */
	public Point3D(Coordinate _x,Coordinate _y,Coordinate _z)
	{
		x=_x;
		y=_y;
		z=_z;
	}
	
	/**
	 * constructor receiving a 3 numbers value
	 * @param _x
	 * @param _y
	 * @param _z
	 */
	public Point3D(double _x,double _y,double _z)
	{
		x=new Coordinate(_x);
		y=new Coordinate(_y);
		z=new Coordinate(_z);
	}
	
	/**
	 * copy constructor
	 * @param p
	 */
	public Point3D(Point3D p)
	{
		x=new Coordinate(p.x);
		y=new Coordinate(p.y);
		z=new Coordinate(p.z);
	}
	
	/**
	 * Create a vector by subtracting 2 points
	 * @param p, receiving point3D
	 * @return new vector
	 */
	public Vector subtract(Point3D p)
	{
		Vector v=new Vector(x._coord-p.x._coord,y._coord-p.y._coord,z._coord-p.z._coord);
		return v;
	}
	
	/**
	 * Adding a vector to a point
	 * @param vecvor
	 * @return point3D
	 */
	public Point3D add(Vector v)
	{
		Point3D p=new Point3D(v.vector.x._coord+x._coord,v.vector.y._coord+y._coord,v.vector.z._coord+z._coord);
		return p;
	}
	
	/**
	 * Calculates a distance between 2 points squares
	 * @param point3D
	 * @return distance squares
	 */
	public double distanceSquared(Point3D p)
	{
		double d=(x._coord-p.x._coord)*(x._coord-p.x._coord)+(y._coord-p.y._coord)*(y._coord-p.y._coord)+(z._coord-p.z._coord)*(z._coord-p.z._coord);
		return d;
	}
	
	/**
	 * Calculates a distance between 2 points 
	 * @param point3D
	 * @return distance 
	 */
	public double distance(Point3D p)
	{
		double d=this.distanceSquared(p);
		return Math.sqrt(d);
	}

	/**
	 * getter and setters the coordinate of the point
	 * @return
	 */
	public Coordinate getX() {
		return x;
	}

	public void setX(Coordinate x) {
		this.x = x;
	}

	public Coordinate getY() {
		return y;
	}

	public void setY(Coordinate y) {
		this.y = y;
	}

	public Coordinate getZ() {
		return z;
	}

	public void setZ(Coordinate z) {
		this.z = z;
	}

	public static Point3D getZero() {
		return ZERO;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		result = prime * result + ((y == null) ? 0 : y.hashCode());
		result = prime * result + ((z == null) ? 0 : z.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point3D other = (Point3D) obj;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		if (y == null) {
			if (other.y != null)
				return false;
		} else if (!y.equals(other.y))
			return false;
		if (z == null) {
			if (other.z != null)
				return false;
		} else if (!z.equals(other.z))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Point3D [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	

}
