package lbiao;

public class StuLinkList {
	private StuNode head;

	public StuLinkList(StuNode head) {
		super();
		this.head = head;
	}

	public void addAtHead(StuNode node) {
		node.next = head.next;
		head.next = node;
	}

	public void addAtEnd(StuNode node) {
		
//		StuNode p = head.next;    //注意！ head.next可能为空
//		if (p == null) {
//			node.next = head.next;
//			head.next = node;
//		} else {
//			while (p.next != null) {
//				p = p.next;
//			}
//			{
//				node.next = p.next;
//				p.next = node;
//			}
//		}
//	}

		
//	StuNode p = head;if(p==null)
//	{
//		node.next = head.next;
//		head.next = node;
//	}
//
//	while(p.next!=null){
//		{ p = p.next; 
//		}    
//		
//		{ node.next = p.next; p.next = node;
//	}
//	}

		StuNode p = head;
		while (p.next != null) {
			p = p.next;
		}
		p.next = node;
	}

	public void showDatas() {
		StuNode p = head.next;
		if (p == null) {
			System.out.println(head.student);
		}
		while (p != null) {
			System.out.println(p.student);
			p = p.next;
		}

	}
}
