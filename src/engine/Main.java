package engine;

import concrete_classes.Directory;
import concrete_classes.File;
import visitor.CountVisitor;
import visitor.FindDirectoryVisitor;
import visitor.Visitor;

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
		
		Directory zahir = new Directory("mzahir", racine);
		Directory Study = new Directory("Study", zahir);
		Directory dba = new Directory("DBA", Study);
		Directory tp = new Directory("TP", dba);
		File dba_tp1 = new File("dba_tp1.sql", tp, "FIRST TP");
		
		System.out.println(dba.absoluteAddress());
		
		
		System.out.println("#############################################");
		System.out.println("|     TEST DE LA FONCTION FIND DIRECTORY    |");
		System.out.println("#############################################");
		
		Directory root = new Directory("/");
		
		Directory mzahir = new Directory("mzahir", root);
		Directory mserhani = new Directory("mserhani", root);
		Directory test = new Directory("DBA", root);
		
		root.getComposants().add(mzahir);
		root.getComposants().add(mserhani);
		root.getComposants().add(test);
		
		Directory studies = new Directory("Studies", mzahir);
		Directory dbas = new Directory("DBA", studies);
		
		mzahir.getComposants().add(studies);
		studies.getComposants().add(dbas);
		
		Directory studies2 = new Directory("Studies", mserhani);
		Directory dbas2 = new Directory("DBA", studies2);
		
		mserhani.getComposants().add(studies2);
		studies2.getComposants().add(dbas2);
		
		FindDirectoryVisitor findVisitor = new FindDirectoryVisitor("DBA");
		root.accept(findVisitor);
		System.out.println(findVisitor.getResults().size());
		findVisitor.showResults();
	}

}
