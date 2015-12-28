package concrete_classes;

import java.util.ArrayList;


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
