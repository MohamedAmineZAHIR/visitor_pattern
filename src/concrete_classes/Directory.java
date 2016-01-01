package concrete_classes;

import java.util.ArrayList;

import visitor.Visitor;


public class Directory extends StorageElement
{
	private ArrayList<StorageElement> composants = new ArrayList<>();
	
	//  Constructor.
	public Directory() {
		super(4);
		this.parent = null;
	}
	
	public Directory(String name) {
		super(4);
		this.name = name;
		this.parent = null;
	}
		
	public Directory(StorageElement parent) {
		super(4, parent);
	}

	public Directory(String name, StorageElement parent) {
		super(4, name, parent);
		// TODO Auto-generated constructor stub
	}

	
	
	/* Methods. 
	========================================*/
	@Override
	public void accept(Visitor visitor) {
		visitor.visitDirectory(this);
	}
    //========================================
	
	@Override
	public int size() {
		int size=this.basicSize;
		for (StorageElement element : composants)
			size+=element.size();
		return size;
	}

	@Override
	public String absoluteAddress() {
		return ((this.name != "/") ? this.parent.absoluteAddress()+ this.name + "/": this.name);
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
