package interfaceabstract;

abstract class Z800 implements Bike {
	@Override
    public void start() {
        System.out.println("Car starting...");
    }
	
//	In Java, if a class implements an interface, it is expected to implement all the interface’s methods.
//
//	However, if the class is declared abstract, it is allowed to leave some or all methods unimplemented.
//
//	The responsibility then passes to the first concrete subclass to implement the remaining methods.
//

	
}
