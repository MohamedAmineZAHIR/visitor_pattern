package engine;

import concrete_classes.Directory;
import concrete_classes.File;
import visitor.CountVisitor;

public class Main 
{

	public static void main(String[] args) {
		Directory racine = new Directory("/");
		Directory directory = new Directory(racine);
		File file = new File(">Double-dispatch it's a well-known technique!");
		
		directory.setComposants(new File("Hola qué tal, muy biene?"));
		directory.setComposants(new File("**** BIENVINIDO ****"));
		directory.setComposants(new File("-----------------------------------------------------------------"));
		
		racine.setComposants(directory);
		
		System.out.println("la taille de l'arborescence" + racine.size());
		
		CountVisitor countVisitor = new CountVisitor();
		
		//  Accept depends on two types of receiver: directory and countVisitor.
		directory.accept(countVisitor);
		file.accept(countVisitor);
		
		System.out.println("Nombre de fichiers contenues dans le répertoire: " + countVisitor.getCounter());
		
		System.out.println("#############################################");
		System.out.println("|    TEST DE LA FONCTION ADRESSE ABSOLUT    |");
		System.out.println("#############################################");
		
		Directory mzahir = new Directory("mzahir", racine);
		Directory Study = new Directory("Study", mzahir);
		Directory dba = new Directory("DBA", Study);
		Directory tp = new Directory("TP", dba);
		File dba_tp1 = new File("dba_tp1.sql", tp, "FIRST TP");
		
		System.out.println(dba_tp1.absoluteAddress());
		
	}

}
