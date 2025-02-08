package string;


public class InnerClassObject {

class Abc {
		
		int a;
		
		public Abc(int a) {
			super();
			this.a = a;
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
	
		InnerClassObject outerClass = new InnerClassObject();
		
		InnerClassObject.Abc innerclass = outerClass.new Abc(3);
		InnerClassObject.Abc innerclass1 = outerClass.new Abc(3); 

		
		System.out.println(innerclass == innerclass1);
		
//		System.out.println(innerclass.a.equals(innerclass.b));
		
    }
}
