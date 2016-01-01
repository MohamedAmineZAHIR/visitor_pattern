package visitor;

import java.util.ArrayList;
import java.util.Collection;

import concrete_classes.Directory;
import concrete_classes.StorageElement;

public class FindDirectoryVisitor extends Visitor 
{
	private String directoryName;
	private ArrayList<String> results = new ArrayList<>();
	
	//  Constructor.
	public FindDirectoryVisitor(String directoryName) {
		this.directoryName = directoryName;
	}

	//  Visitor methods.
	@Override
	public void visitDirectory(StorageElement directory) {
		for (StorageElement se : ((Directory) directory).getComposants()) {
			if (se.getName().equals(this.directoryName))
				results.add(se.absoluteAddress());
			
			//  Recursive call.
			visitDirectory(se);
		}
	}
	
	@Override
	public void visitFile(StorageElement e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitSymbolicLink(StorageElement e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	//Others methods.
	public void showResults () {
		for (String s : results)
			System.out.println(s);
	}
	
	
	
	//  Getters/Setters.
	public ArrayList<String> getResults() {
		return results;
	}
	public void setResults(ArrayList<String> results) {
		this.results = results;
	}
	
}
