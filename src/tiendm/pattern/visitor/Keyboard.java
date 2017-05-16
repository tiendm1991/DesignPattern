package tiendm.pattern.visitor;

public class Keyboard implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		System.out.println("Accept Keyboard");
		computerPartVisitor.visit(this);
	}

}
