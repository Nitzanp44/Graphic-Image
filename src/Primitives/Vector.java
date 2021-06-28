package Primitives;

/**
 * class vector, vector from the point (0,0,0) to the point.
 * @author reut levenberg 318731916 nitzan popovich 206584104
 *
 */
public class Vector {
	Point3D vector;
	
	/**
	 * constructor receiving a 3 coordinate value and create the point
	 * @param _x
	 * @param _y
	 * @param _z
	 */
	public Vector(Coordinate _x,Coordinate _y,Coordinate _z)
	{
			Point3D p=new Point3D(_x,_y,_z);
			if(p.equals(Point3D.getZero()))
					throw new IllegalArgumentException("ZERO vector");
			vector=p;
	}
	
	/**
	 * constructor receiving a 3 numbers value and create the point
	 * @param _x
	 * @param _y
	 * @param _z
	 */
	public Vector(double _x,double _y,double _z)
	{

		Point3D p=new Point3D(_x,_y,_z);
		if(p.equals(Point3D.getZero()))
				throw new IllegalArgumentException("ZERO vector");
		vector=p;
	}
	
	/**
	 * constructor receiving point
	 * @param p
	 */
	public Vector(Point3D p)
	{

		Point3D v =new Point3D(p);
		if(v.equals(Point3D.getZero()))
				throw new IllegalArgumentException("ZERO vector");
		vector=v;
	}
	
	/**
	 * copy constructor
	 * @param vector
	 */
	public Vector(Vector v)
	{
		vector=new Point3D(v.vector);
	}
	
	/**
	 * adding 2 vectors
	 * @param v
	 * @return
	 */
	public Vector add(Vector v)
	{
		Vector vec=new Vector(vector.add(v));
		return vec;
	}
	
	/**
	 * subtract 2 vectors
	 * @param v
	 * @return
	 */
	public Vector subtract(Vector v)
	{
		Vector vec=new Vector(vector.subtract(v.vector));
		return vec;
	}
	
	/**
	 * multiply by scalar
	 * @param scalar
	 * @return new vector
	 */
	public Vector scale(double s)
	{
		Vector vec=new Vector(vector.x._coord*s,vector.y._coord*s,vector.z._coord*s);
		return vec;
	}
	
	/**
	 * scalar multiplication
	 * @param vector
	 * @return
	 */
	public double dotProduct(Vector v)
	{
		double s=(vector.x._coord*v.vector.x._coord+vector.y._coord*v.vector.y._coord+vector.z._coord*v.vector.z._coord);
		return s;
	}
	
	/**
	 * vector multiplication
	 * @param v
	 * @return
	 */
	public Vector crossProduct(Vector v)
	{
		Vector vec=new Vector(vector.y._coord*v.vector.z._coord-vector.z._coord*v.vector.y._coord,
				vector.z._coord*v.vector.x._coord-vector.x._coord*v.vector.z._coord,
				vector.x._coord*v.vector.y._coord-vector.y._coord*v.vector.x._coord);
		
		return vec;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vector == null) ? 0 : vector.hashCode());
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
		Vector other = (Vector) obj;
		if (vector == null) {
			if (other.vector != null)
				return false;
		} else if (!vector.equals(other.vector))
			return false;
		return true;
	}

	/**
	 * length of the vector squared
	 * @return length squared
	 */
	public double lengthSquared()
	{
		double d=vector.x._coord*vector.x._coord+vector.y._coord*vector.y._coord+vector.z._coord*vector.z._coord;
		return d;
	}
	
	/**
	 * length of the vector 
	 * @return length 
	 */
	public double length()
	{
		return Math.sqrt(this.lengthSquared());
	}
	
	/**
	 * vector normalization
	 * @return the original vector
	 */
	public Vector nurmalize()
	{
	 double l=this.length();
	 this.vector.setX(new Coordinate(this.vector.x._coord/l));
	 this.vector.setY(new Coordinate(this.vector.y._coord/l));
	 this.vector.setZ(new Coordinate(this.vector.z._coord/l));
	 return this;
	}
	
	/**
	* vector normalization
	 * @return new vector
	 */
	public Vector nurmalized()
	{
		Vector vec=new Vector (this.scale(1/this.length()));
		return vec;
	}

	@Override
	public String toString() {
		return "Vector [vector=" + vector +"]";
	}

	/**
	 * return if the vectors have same direction
	 */
	public boolean isDirectional(Vector v1,Vector v2)//אם הם באותו כיוון
	{
		if(this.nurmalized().equals(v1.nurmalized()))
			return true;
		return false;
	}
	
	/**
	 * return if there is Sharp Angle between the vectors
	 */
	public boolean isSharpAngle(Vector v1,Vector v2)//זוית חדה
	{
		if(this.dotProduct(v1)>0)
			return true;
		return false;
	}
	
	/**
	 * return if there is Obtuse Angle between the vectors
	 */
	public boolean isObtuseAngle(Vector v1,Vector v2)//זווית קהה
	{
		if(this.dotProduct(v1)<0)
			return true;
		return false;
	}
	
	/**
	 * return if the vectors are Orthogonal
	 */
	public boolean isOrthogonalAngle(Vector v1,Vector v2)//אורתוגונלים
	{
		if(this.dotProduct(v1)==0)
			return true;
		return false;
	}
	
	/**
	 * return if the vectors have Opposite direction
	 */
	public boolean isOppositeDirectional(Vector v1) //בדיקה אם הם בכיוונים מנוגדים
	{
		if(this.nurmalized().equals(v1.nurmalized().scale(-1)))
			return true;
		return false;
	}

}
