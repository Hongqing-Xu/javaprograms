package linelist;

public class yz {

	public static void main(String[] args) {
		StuSeqList sl = new StuSeqList(3, 1);
		Student stu1 = new Student(1, "ÕÅÈı");
		System.out.println(sl.insert(0, stu1));
		System.out.println(sl.insert(1, stu1));
		System.out.println(sl.insert(1, stu1));
		System.out.println(sl.insert(4, stu1));
		System.out.println(sl.delete(1, stu1));
		System.out.println(sl.delete(0, stu1));
		System.out.println(sl.delete(1, stu1));
		System.out.println(sl.delete(4, stu1));

	}

}
