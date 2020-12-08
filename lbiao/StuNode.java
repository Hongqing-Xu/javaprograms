package lbiao;

public class StuNode {
	Student student;
	StuNode next;

	public StuNode(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public StuNode getNext() {
		return next;
	}

	public void setNext(StuNode next) {
		this.next = next;
	}

}
