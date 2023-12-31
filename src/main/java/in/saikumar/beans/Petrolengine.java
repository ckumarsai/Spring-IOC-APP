package in.saikumar.beans;

public class Petrolengine implements IEngine {
	public Petrolengine() {
		System.out.println("Petrolengiine constructor");
		System.out.println("saikumar");
	}

	@Override
	public boolean start() {
		System.out.println("Petrolengiine is dtarted");
		System.out.println("Hello Hii Good Morning gauys");
		return true;
	}

}
