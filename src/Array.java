
public class Array {
public static void main(String[] args) {
	int a[]=new int[7];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	a[5]=60;
	a[6]=70;
	//System.out.println(a);
	System.out.println(a[6]);
	System.out.println("array Length ="+ a.length);
	System.out.println("NORMAL FOR LOOP");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println("************************");
	System.out.println("ENHANCED FOR LOOP");
	for (int i : a) {
		System.out.println(i);
	}
	String b[]=new String[0];
	b[0]="aa";
	b[1]="ab";
	b[2]="ac";
	b[3]="ad";
	b[4]="ae";
	b[5]="af";
	b[6]="ag";
	b[7]="ah";
	System.out.println("************************");
	System.out.println(b[2]);
	System.out.println(b[4]);
}
}
