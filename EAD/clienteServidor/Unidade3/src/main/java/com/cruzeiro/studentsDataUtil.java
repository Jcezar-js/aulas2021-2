package com.cruzeiro;
import java.util.ArrayList;
import java.util.List;

public class studentsDataUtil {
	
	public studentsDataUtil() {	}
	
		public static List<Student> getStudens(){
			
			//criar lista vazia
			List<Student> students = new ArrayList<>();
			
			//adicionar dados a lista
			students.add(new Student("Aluno1","Sobrenome1","email1",1233));
			students.add(new Student("Aluno2","Sobrenome2","email2",1321));
			students.add(new Student("Aluno3","Sobrenome3","email3",4441));
			students.add(new Student("Aluno4","Sobrenome4","email4",1335));
			
			return students;
		}	
}
