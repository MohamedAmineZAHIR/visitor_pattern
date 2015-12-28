package concrete_classes;

public class File extends StorageElement
{
	private String content;
	private Directory container;
	
	public File() {
		super(0);
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
