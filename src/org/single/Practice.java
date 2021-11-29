package org.single;

public class Practice {
	
	static Practice a;
	
	public static Practice get() {
		int before = System.identityHashCode(a);
		System.out.println(before);
		if (a==null) {
			a = new Practice();
			int after = System.identityHashCode(a);
			
			System.out.println(after);
			
		}
		return a;

	}
	private void empName() {
		System.out.println("SGR");

	}
	public static void main(String[] args) {
		
		Practice practice = get();
		int identityHashCode = System.identityHashCode(practice);
		System.out.println(identityHashCode);
		
		Practice practice2 = get();
		int identityHashCode2 = System.identityHashCode(practice2);
		System.out.println(identityHashCode2);
		
		a.empName();
		int after1 = System.identityHashCode(a);
		System.out.println(after1);
		
		practice.empName();
<<<<<<< HEAD
		System.out.println("changes made in perf, have to move to master");
=======
		System.out.println("commit dev to master");
>>>>>>> 56f3981d40538a38ea843457ab62c195cd4ce3db
		
		
		
		
	}

}
