package visitor;

import concrete_classes.StorageElement;

public abstract class Visitor 
{
	public abstract void visitDirectory(StorageElement e);
	public abstract void visitFile(StorageElement e);
	public abstract void visitSymbolicLink(StorageElement e);
}
