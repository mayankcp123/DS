public class ConstructorCallTest {
	public static void main(String[] args) {

		
		GirlFriend gf = new GirlFriend();
		gf.loyal();
		
		System.out.println("----------");
		
		Wife wf = new Wife();
		wf.conflicts();
		wf.loyal();
//		fa.netting();
		System.out.println("----------");
		Child ch = new Child();
		ch.play();
		ch.loyal();
		ch.conflicts();
		System.out.println("---------------");
	}
}


class GirlFriend // extends Object
{
	GirlFriend() {
		//super()
		System.out.println("GirlFriend() ctor.....");
	}
	void loyal() {
		System.out.println("GirlFriend is loyal");
	}
}
class Wife extends GirlFriend
{
	Wife() {
		//super(); its a default line of every constructor, implicit/explicit
						// and it is the very FIRST line inside a ctor
		
		System.out.println("\tWife() ctor.....");
	}
	void conflicts() {
		System.out.println("Wifey wife...");
	}
	void loyal() { //OVERRIDING
		System.out.println("Wife has become more loyal....");
	}
}
class Child extends Wife
{
	Child() {
		//super();
		System.out.println("\t\tChild() ctor.....");
	}
	void play() {
		System.out.println("Child is playing....");
	}
	void loyal() {
		System.out.println("Child is loyal to mother..");
	}
	void conflicts() {
		System.out.println("Child has conflicts with his friends.");
	}
}