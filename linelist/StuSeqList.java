package linelist;

public class StuSeqList {
	private Student[] students;
	private int maxlength;// 最大长度
	private int length;// 当前长度

	public boolean insert(int index, Student student) {
		boolean suc = false;
		if (index < 0 || index > maxlength) {
			System.out.println("插入位置出错！");
			return suc;
		}
		if (length + 1 > maxlength) {
			System.out.println("线性表已满!");
			return suc;
		}
		length++;
		for (; index < length; index++) {
			Student stunext = students[index];
			students[index] = student;
			student = stunext;
			suc = true;

		}
		return suc;
	}

	public boolean delete(int index, Student student) {
		boolean suc = false;
		if (index < 0 || index > maxlength) {
			System.out.println("删除位置出错!");
			return suc;
		}
		for (; index < length - 1; index++) {
			students[index] = students[index + 1];
			suc = true;
		}
		length--;
		return suc;
	}

	public StuSeqList(int maxlength, int length) {
		initiate(maxlength);
	}

	private void initiate(int maxlength) {
		students = new Student[maxlength];
		this.maxlength = maxlength;
	}

	public int getLength() {
		return length;
	}

	public int getMaxlength() {
		return maxlength;
	}

}
