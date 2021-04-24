
/**
 * Represents abstract prototype and implements 
 * Cloneable interface
 * 
 */

public abstract class GameUnit implements Cloneable {

	private Point3D position;
	
	public GameUnit() {
		position = Point3D.ZERO;
	}
	
	public GameUnit(float x, float y, float z) {
		position = new Point3D(x, y, z);
	}
	
	public void move(Point3D direction, float distance) {
		Point3D finalMove = new Point3D(0, 0, 0);
		finalMove = finalMove.multiply(distance);
		position = position.add(distance);
	}
	
	public Point3D getPosition() {
		return position;
	}
	
	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		GameUnit unit = (GameUnit)super.clone();
		unit.initialize();
		return unit;
	}
	
	protected abstract void reset();
	
	protected void initialize() {
		this.position = Point3D.ZERO;
		reset();
	}
}
