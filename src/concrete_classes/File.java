package concrete_classes;

import visitor.Visitor;

public class File extends StorageElement
{
	private String content;
	
	public File() {
		super(0);
	}
	
	public File(String content) {
		super(0);
		this.content = content;
	}
	
	public File(String name, StorageElement parent, String content) {
		super(0, name, parent);
		this.content = content;
	}

	

	//  Methods.
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
		return this.parent.absoluteAddress() + this.name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
