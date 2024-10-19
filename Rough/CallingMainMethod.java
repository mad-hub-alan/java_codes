package test;


class Maddy{
	public static void main(String[] args) {
		
		int num = 137;
		
		int res1 = num/10;
		int res2 = num%10;
		
		System.out.println("/ : "+res1);
		System.out.println("% : "+res2);
		
	}
}
public class CallingMainMethod {
	
	class A {
		String name;
	}
	
	public static void main(String[] args) {
		CallingMainMethod outer = new CallingMainMethod();
		A[] arr = new A[10];
		
		// Initialize each element in the array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = outer.new A();
		}
		
		arr[0].name = "Maddy";
		arr[1].name = "Sandy";
		arr[2].name = "Maddy";
		arr[3].name = "Sandy";
		arr[4].name = "Maddy";
		arr[5].name = "Sandy";
		arr[6].name = "Maddy";
		arr[7].name = "Sandy";
		arr[8].name = "Maddy";
		arr[9].name = "Sandy";
		
		// Print each element's name
		for (A each : arr) {
			System.out.println(each.name);
		}
		
		System.out.println(arr[1]);
		System.out.println(arr[9]);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+"->"+arr[i].name);
		}
		
		Maddy madhu = new Maddy();
		
		madhu.main(args); 	// invoking main method by Maddy instance(madhu)
		
		Maddy.main(args);	// calling main method using Class name
	}
}
