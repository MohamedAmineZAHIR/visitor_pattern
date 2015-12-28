package engine;

import concrete_classes.Directory;
import concrete_classes.File;
import visitor.CountVisitor;

public class Main 
{

	public static void main(String[] args) {
		Directory racine = new Directory();
		Directory directory = new Directory(racine);
		
		directory.setComposants(new File("Hola qué tal, muy biene?"));
		directory.setComposants(new File("**** BIENVINIDO ****"));
		directory.setComposants(new File("-----------------------------------------------------------------"));
		
		racine.setComposants(directory);
		
		System.out.println("la taille de l'arborescence" + racine.size());
		
		CountVisitor countVisitor = new CountVisitor();
		
		directory.accept(countVisitor);
		
		System.out.println("Nombre de fichiers contenues dans le répertoire: " + countVisitor.getCounter());
	}

}
