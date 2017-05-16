package tiendm.pattern.visitor;

public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		System.out.println("Accept Mouse");
		computerPartVisitor.visit(this);
	}

}
