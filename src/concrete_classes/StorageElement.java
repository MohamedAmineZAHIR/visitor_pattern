package concrete_classes;

import visitor.Visitor;

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
	
	public StorageElement(int basicSize, StorageElement container) {
		super();
		this.basicSize = basicSize;
		this.container = container;
	}

	public abstract int size ();
	public abstract String absoluteAddress ();
	public abstract String ls ();
	public abstract void reset ();
	public abstract void accept(Visitor visitor);
}