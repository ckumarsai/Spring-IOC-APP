package in.saikumar.beans;

public class Petrolengine implements IEngine {
	public Petrolengine() {
		System.out.println("Petrolengiine constructor");
	}

	@Override
	public boolean start() {
		System.out.println("Petrolengiine is dtarted");
		return true;
	}

}
