import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayDuplicateRemove {
public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i : a) {
			System.out.println("printing array  ==" + i);
		}
		String stringtoArr = Arrays.toString(a);
		System.out.println("a==" + stringtoArr);
		System.out.println("***************************");

		List b = new ArrayList();
		b.add(10);
		b.add(30);
		b.add(40);
		b.add(50);
		b.add(60);
		b.add(10);
		b.add(70);
		b.add(80);
		b.add(90);
		System.out.println("arraylist size==" + b.size());
		System.out.println("b=="+b);
		System.out.println("******************************");

		List c = new LinkedList();
		c.add(30);
		c.add(40);
		c.add(50);
		c.add(60);
		c.add(10);
		c.add(70);
		c.add(80);
		c.add(90);
		System.out.println("linkedlist size==" + c.size());
		System.out.println("c==" + c);
	}

}
