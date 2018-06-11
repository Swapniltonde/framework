package nnn.nnnnn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class SetExample {
	
	Set<String> exe ;
	public void addElementsToHashSet() {//vise versa of LinkedhashSet
		
		exe = new HashSet<String>();
		exe.add("23435");
		exe.add("abcde");
		exe.add("4.4");
		exe.add("exe");
		exe.add("4.4");
	}
	
public void addElementsToLinkedHashSet() {//doing insertion in the same order in which we are inserting
	exe = new LinkedHashSet<String>();
	//exe = new ArrayList();
	exe.add("23435");
	exe.add("abcde");
	exe.add("4.4");
	exe.add("exe");
	exe.add("4.4");
	}

public void addElementsToTreeSet() {//It will print in Ascending order
	
	exe = new TreeSet<String>();
	//exe = new ArrayList();
	exe.add("23435");
	exe.add("abcde");
	exe.add("4.4");
	exe.add("exe");
	exe.add("4.4");
}

public void display() {
	
	System.out.println(exe);
	//int len =exe.size();
	//for(int i=0;i<len;i++) {
		//System.out.println(exe.get(i));
	
for(String values:exe) {//for each loop is used to access every statement
	
	System.out.println(values);
}

}
}