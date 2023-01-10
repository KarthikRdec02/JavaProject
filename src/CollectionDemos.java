import java.util.ArrayList;
import java.util.List;
//import com.sun.org.apache.xpath.internal.operations.Equals;

public class CollectionDemos {
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(20);
		a.add(55.62);
		a.add(true);
		a.add("karthik");
		a.add(null);
		a.add(20);
		a.add('k');
		a.add(11);
		System.out.println(a);

		List b = new ArrayList();
		b.add(22);
		b.add(55.33);
		b.add(true);
		b.add("karthiktamil");
		b.add(null);
		b.add(21);
		b.add('k');
		b.add(12);
		b.add("nirai");
		System.out.println(b);

		System.out.println(a.size());
		System.out.println("B.LIST SIZE =" + b.size());
		System.out.println(a.get(4));
		System.out.println(a.indexOf('k'));
		System.out.println(a.lastIndexOf(20));
		System.out.println(a.contains("karthik"));
		System.out.println(a.contains("true"));
		// System.out.println(a.add("Tamil"));
		System.out.println(a.set(1, 3334));
		System.out.println(a);
		System.out.println(a.isEmpty());
		System.out.println(b.addAll(a));
		System.out.println(b);
		System.out.println(a.equals(b));
		System.out.println("RETAIN=" + a.retainAll(b));
		// System.out.println(b);
		System.out.println("REMOVE =" + b.removeAll(a));
		System.out.println(b);
		System.out.println(a);
		for (Object object : a) {
			System.out.println("print a as loop==" + a);
		}
		System.out.println("***********************************");
		for (int i = 0; i < 5; i++) {

			System.out.println("print for loop ==" + b);

		}
	}
}
