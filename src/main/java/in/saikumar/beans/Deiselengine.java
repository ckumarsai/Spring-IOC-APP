package in.saikumar.beans;

public class Deiselengine implements IEngine {
	public Deiselengine(){
		System.out.println("Deiselengine constructor");
		System.out.println("Hi");
	}

	@Override
	public boolean start() {
		System.out.println("Deisel engine is started");
		System.out.println("Hello");
		System.out.println("sunny");
		return true;
	}

}
