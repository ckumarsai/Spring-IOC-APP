package in.saikumar.beans;

public class Car {
	private IEngine eng;
	public void setEng(IEngine eng) {
		this.eng=eng;
		System.out.println("setEng method called");
		System.out.println("injucted" + eng.getClass().getName());
	}
	public void drive() {
		boolean status=eng.start();
		if(status) {
			System.out.println("Journey started");
		}else {
			System.out.println("Engine problem");
			System.out.println("Hello");
		}
	}

}
