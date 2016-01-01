package concrete_classes;

import visitor.Visitor;

/**
 * @date   28.12.2015
 * @author mzahir
 */

public abstract class StorageElement 
{
	protected int basicSize;
	protected String name;
	protected StorageElement parent;
	
	public StorageElement(int basicSize) {
		super();
		this.basicSize = basicSize;
	}
	
	public StorageElement(int basicSize, StorageElement parent) {
		super();
		this.basicSize = basicSize;
		this.parent = parent;
	}
	
	public StorageElement(int basicSize, String name, StorageElement parent) {
		super();
		this.basicSize = basicSize;
		this.name = name;
		this.parent = parent;
	}

	public abstract int size ();
	public abstract String absoluteAddress ();
	public abstract String ls ();
	public abstract void reset ();
	
	/**
	 * Accept is double dispatch operation. Its meaning depends on the kind of request and the types of two receivers:
	 * 1- The Visitor's
	 * 2- Storage element (in this case).
	 * @param visitor
	 */
	public abstract void accept(Visitor visitor);
}