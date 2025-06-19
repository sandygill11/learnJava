package interfaceabstract;

import interfaceabstract.Interface.Animal;

public class InterfaceTest implements Animal{

	@Override
	public void animalSound() {
		System.out.println("Bark");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Hibernate");
	}
	
	public static void main(String[] args) {
		
		InterfaceTest obj = new InterfaceTest();
		obj.animalSound();
		obj.sleep();
		
	}
	

}
