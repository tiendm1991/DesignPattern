package tiendm.pattern.transfer;

public class Demo {
	public static void main(String[] args) {
		StudentBO stuBo = new StudentBO();
		stuBo.createList();
		System.out.println(stuBo.getAllStudents());
		stuBo.update("2", "Kieu Phong");
		System.out.println(stuBo.getAllStudents());
		System.out.println(stuBo.getStudent("2"));
		stuBo.addStudent(new StudentVO("3", "Doan Du"));
		System.out.println(stuBo.getAllStudents());
		stuBo.deleteStudent("2");
		System.out.println(stuBo.getAllStudents());
	}
}
