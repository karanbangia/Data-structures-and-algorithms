import java.util.*;
 class C extends P{
	int d=20;
	int d2=100;
	public void fun()
	{
		System.out.println("In c fun");
	}
	public void fun2()
	{
		System.out.println("In c fun2");
	}
	public static void main(String[] args) {
		 C obj=new C();
		System.out.println("-------1st case------");
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		obj.fun();
		obj.fun1();
		((P)obj).fun1();
		System.out.println("-------2nd case------");
		P obj2=new C();
		System.out.println(obj2.d);
		System.out.println(obj2.d1);
		System.out.println(((C)obj2).d2);
		obj2.fun();
		obj2.fun1();
		((C)obj2).fun2();
		// System.out.println("-------3st case------");
		// P obj3=new P();
		// System.out.println(obj3.d);
		// System.out.println(obj3.d1);
		// // System.out.println(obj3.d2);
		// obj3.fun();
		// obj3.fun1();
		// // obj3.fun2();
		


	}

}