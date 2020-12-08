package lbiao;

public class sy {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student stu1 = new Student(1, "张一");
		Student stu2 = new Student(2, "张二");
		Student stu3 = new Student(3, "张三");
		StuNode sn0 = new StuNode(null);//得到一
		StuLinkList sl = new StuLinkList(sn0);//个空链表
		StuNode sn1 = new StuNode(stu1);
		StuNode sn2 = new StuNode(stu2);
		StuNode sn3 = new StuNode(stu3);
//		sl.addAtHead(sn1);
//		sl.addAtHead(sn2);
//		sl.addAtHead(sn3);
		sl.addAtEnd(sn1);
		sl.addAtEnd(sn2);
		sl.addAtEnd(sn3);
		sl.showDatas();
	}

}
