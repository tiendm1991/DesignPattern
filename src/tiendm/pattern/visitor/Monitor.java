package tiendm.pattern.visitor;

public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		System.out.println("Accept Monitor");
		computerPartVisitor.visit(this);
	}

}
