package tiendm.pattern.transfer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentBO {
	List<StudentVO> students;
	
	public void createList(){
		students = new ArrayList<>();
		students.add(new StudentVO("1", "Tien"));
		students.add(new StudentVO("2", "Manh"));
	}
	
	public List<StudentVO> getAllStudents(){
		return students;
	}
	
	public void update(String id, String name){
		for(StudentVO student:students){
			if(student.getId().equalsIgnoreCase(id)){
				student.setName(name);
				return;
			}
		}
	}
	
	public void addStudent(StudentVO student){
		students.add(student);
	}
	public StudentVO deleteStudent(String id){
		Iterator<StudentVO> it = students.iterator();
		while (it.hasNext()) {
			StudentVO student = it.next();
			if(student.getId().equals(id)){
				it.remove();
				return student;
			}
		}
		return null;
	}
	
	public StudentVO getStudent(String id){
		for(StudentVO student:students){
			if(student.getId().equalsIgnoreCase(id)){
				return student;
			}
		}
		return null;
	}

	public List<StudentVO> getStudents() {
		return students;
	}

	public void setStudents(List<StudentVO> students) {
		this.students = students;
	}
	
}
