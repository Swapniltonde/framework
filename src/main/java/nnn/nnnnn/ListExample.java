package nnn.nnnnn;
//ListExample
import java.util.*;

public class ListExample {
	
	List exe ;

	public void addElementsToArraylist() {
		
		exe = new ArrayList();
		exe.add(23423);
		exe.add("abcde");
		exe.add(4.4);
		exe.add(exe);
		exe.add(4.4);
	}
	
public void addElementsToLinkedList() {
	exe = new LinkedList();
	exe = new ArrayList();
	exe.add(23423);
	exe.add("abcde");
	exe.add(4.4);
	exe.add(exe);
	exe.add(4.4);
	}

public void addElementsToVector() {
	
	exe = new Vector();
	exe = new ArrayList();
	exe.add(23423);
	exe.add("abcde");
	exe.add(4.4);
	exe.add(exe);
	exe.add(4.4);
}

public void display() {
	
	//System.out.println(exe);
	int len =exe.size();
	for(int i=0;i<len;i++) {
		System.out.println(exe.get(i));
	}
}
}
