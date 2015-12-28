package concrete_classes;

import java.util.ArrayList;

import visitor.Visitor;


public class Directory extends StorageElement
{
	private ArrayList<StorageElement> composants = new ArrayList<>();
	
	//  Constructor.
	public Directory() {
		super(4);
	}
	
		
	public Directory(StorageElement container) {
		super(4, container);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitDirectory(this);
	}
	
	@Override
	public int size() {
		int size=this.basicSize;
		for (StorageElement element : composants)
			size+=element.size();
		return size;
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
		for (StorageElement element : composants)
			element.reset();
	}
	
	/**
	 * 
	 * @return nombre d'éléments du premier niveau du rep.
	 */
	public int numberOfElements () {
		return this.composants.size();
	}
	
	
	/* Getters/Setters */
	public ArrayList<StorageElement> getComposants() {
		return composants;
	}
	public void setComposants(ArrayList<StorageElement> composants) {
		this.composants = composants;
	}
	public void setComposants(StorageElement composant) {
		this.composants.add(composant);
	}
}
