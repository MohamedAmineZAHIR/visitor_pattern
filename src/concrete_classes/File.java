package concrete_classes;

import visitor.Visitor;

public class File extends StorageElement
{
	private String content;
	private Directory container;
	
	public File() {
		super(0);
	}
	
	public File(String content) {
		super(0);
		this.content = content;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitFile(this);
	}
	
	@Override
	public int size() {
		return content.length();
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
		this.setContent("");
	}
	
	public void cat () {
		System.out.println(content);
	}
	
	public int numberOfElements () {
		return size();
	}
	
	
	// Getters/Setters
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Directory getContainer() {
		return container;
	}
	public void setContainer(Directory container) {
		this.container = container;
	}	
}
