package visitor;

import java.util.Collection;

import concrete_classes.StorageElement;

public class FindVisitor extends Visitor 
{

	public Collection<StorageElement> find (String name) {
		return null;
	}
	
	@Override
	public void visitDirectory(StorageElement e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitFile(StorageElement e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitSymbolicLink(StorageElement e) {
		// TODO Auto-generated method stub
		
	}
	
}
