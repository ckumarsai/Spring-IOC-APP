package in.saikumar.beans;

public class Deiselengine implements IEngine {
	public Deiselengine(){
		System.out.println("Deiselengine constructor");
	}

	@Override
	public boolean start() {
		System.out.println("Deisel engine is started");
		return true;
	}

}
