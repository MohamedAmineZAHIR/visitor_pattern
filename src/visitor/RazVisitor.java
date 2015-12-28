package visitor;

import concrete_classes.StorageElement;

/**
 * Classe Remit à zéro.
 * @author mzahir
 *
 */
public class RazVisitor extends Visitor
{

	@Override
	public void visitDirectory(StorageElement e) {
		e.reset();
	}

	@Override
	public void visitFile(StorageElement e) {
		e.reset();
	}

	@Override
	public void visitSymbolicLink(StorageElement e) {
		e.reset();
	}
}
