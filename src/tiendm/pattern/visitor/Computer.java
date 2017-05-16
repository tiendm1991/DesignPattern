package tiendm.pattern.visitor;

public class Computer implements ComputerPart{
	ComputerPart [] parts;
	
	
	public Computer() {
		this.parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
	}


	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
		System.out.println("*********************");
		System.out.println("Inner visit computer:");
		for(ComputerPart c : parts){
			c.accept(computerPartVisitor);
		}
		System.out.println("*********************");
	}

}
