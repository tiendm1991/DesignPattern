package tiendm.pattern.visitor;

public class Demo {
	public static void main(String[] args) {
		ComputerPartVisitor visit = new ComputerDisplay();
		ComputerPart computer = new Computer();
		computer.accept(visit);
		ComputerPart mouse = new Mouse();
		mouse.accept(visit);
	}
}
