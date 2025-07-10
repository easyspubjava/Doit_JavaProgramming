package object;

class Student {
	
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Student){
			Student student = (Student) obj;
			return this.studentId == student.studentId;
		}
		return false;
	}


	@Override
	public String toString(){
		return studentId + "," + studentName;
	}

	@Override
	public int hashCode() {
		return studentId;
	}

	public static void main(String[] args) {
		Student student1 = new Student(100, "김유신");
		Student student2 = new Student(100, "김유신");

		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());

		System.out.println(student1);
		System.out.println(student2);

		System.out.println(student1 == student2);
		System.out.println(student1.equals(student2));


	}
}

