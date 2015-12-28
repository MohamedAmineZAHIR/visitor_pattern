package engine;

import concrete_classes.Directory;
import concrete_classes.File;

public class Main {

	public static void main(String[] args) {
		Directory racine = new Directory();
		Directory directory = new Directory(racine);
		
		directory.setComposants(new File("Hola qué tal, muy biene?"));
		directory.setComposants(new File("**** BIENVINIDO ****"));
		directory.setComposants(new File("-----------------------------------------------------------------"));
		
		racine.setComposants(directory);
		
		System.out.println(racine.size());
	}

}
