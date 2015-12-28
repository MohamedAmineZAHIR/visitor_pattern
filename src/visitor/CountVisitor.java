package visitor;


import concrete_classes.Directory;
import concrete_classes.File;
import concrete_classes.StorageElement;

public class CountVisitor extends Visitor 
{
	private int counter=0;
	
	@Override
	public void visitDirectory(StorageElement e) {
		for (StorageElement element : ((Directory)e).getComposants()) {
			if (element instanceof File)
				visitFile(element);
			else 
				if (element instanceof Directory)
					visitDirectory(element);
		}
	}

	@Override
	public void visitFile(StorageElement e) {
		counter += (((File) e).size() >= 10) ? 1 : 0;
	}

	@Override
	public void visitSymbolicLink(StorageElement e) {
		
	}

	
	//  Getters/Setters
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	
	
}
