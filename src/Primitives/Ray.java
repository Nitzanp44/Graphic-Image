package Primitives;

/**
 * class ray is a vector with start point
 * @author reut levenberg 318731916 nitzan popovich 206584104
 *
 */
public class Ray 
{
	Point3D pointRay;
	Vector vectorRay;
	
	/**
	 * constructor receiving point and direction vector 
	 * @param point
	 * @param vector
	 */
	public Ray(Point3D p, Vector v)
	{
		pointRay=new Point3D(p);
		vectorRay=v.nurmalized();
	}
	
	/**
	 * getters
	 * @return
	 */
	public Point3D getPointRay() {
		return pointRay;
	}
	
	public Vector getVectorRay() {
		return vectorRay;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pointRay == null) ? 0 : pointRay.hashCode());
		result = prime * result + ((vectorRay == null) ? 0 : vectorRay.hashCode());
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
		Ray other = (Ray) obj;
		if (pointRay == null) {
			if (other.pointRay != null)
				return false;
		} else if (!pointRay.equals(other.pointRay))
			return false;
		if (vectorRay == null) {
			if (other.vectorRay != null)
				return false;
		} else if (!vectorRay.equals(other.vectorRay))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ray [pointRay=" + pointRay + ", vectorRay=" + vectorRay + "]";
	}
	
	
	
	
	

}
