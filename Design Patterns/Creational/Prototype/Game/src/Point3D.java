
/**
 * Represents a demo 3D point in space
 *
 */
public class Point3D {

	private float x;
	private float y;
	private float z;
	
	public final static Point3D ZERO = new Point3D(0, 0, 0);
	
	public Point3D(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Point3D multiply(float distance) {
		x *= distance;
		y *= distance;
		z *= distance;
		return this;
	}
	
	public Point3D add(float distance) {
		x += distance;
		y += distance;
		z += distance;
		return this;
	}
}
