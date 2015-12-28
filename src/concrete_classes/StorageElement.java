package concrete_classes;

/**
 * @date   28.12.2015
 * @author mzahir
 */

public abstract class StorageElement 
{
	protected int basicSize;
	protected StorageElement container;
	
	public StorageElement(int basicSize) {
		super();
		this.basicSize = basicSize;
	}
	
	
	public abstract int size ();
	public abstract String absoluteAddress ();
	public abstract String ls ();
}