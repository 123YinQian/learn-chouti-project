package ch5_3;

class A {
	public int getNumber (int a) {
		return a+1;
	}
}
class B extends A {
	public int getNumber (int a) {
		return a+100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.getNumber(10));
		a = new B();
		System.out.println(a.getNumber(10));
	}
}
