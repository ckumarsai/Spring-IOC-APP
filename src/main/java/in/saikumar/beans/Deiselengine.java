package in.saikumar.beans;

public class Deiselengine implements IEngine {
	public Deiselengine(){
		System.out.println("Deiselengine constructor");
		
	}

	// task-103
	public  void m3(){
		// logic
	}
	@Override
	public boolean start() {
		System.out.println("Deisel engine is started");
		System.out.println("Hello");
		System.out.println("Bunny");
		System.out.println("sunny");
		return true;
	}

}
