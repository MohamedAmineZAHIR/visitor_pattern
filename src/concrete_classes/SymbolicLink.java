package concrete_classes;

import visitor.Visitor;

public class SymbolicLink extends StorageElement
{
	public SymbolicLink() {
		super(0);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitSymbolicLink(this);
	}
	
	@Override
	public int size() {
		return this.basicSize;
	}

	@Override
	public String absoluteAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ls() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void reset () {
		
	}
	
}
