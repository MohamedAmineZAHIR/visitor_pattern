package concrete_classes;

/**
 * @date   28.12.2015
 * @author mzahir
 */

public class StorageElement 
{
	protected int basicSize;
	protected Directory container;
	
	public StorageElement(int basicSize) {
		super();
		this.basicSize = basicSize;
	}
}