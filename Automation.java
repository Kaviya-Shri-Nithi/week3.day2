package week3.day2;

public class Automation extends  MultipleLanguage implements Language,TestTool  {

	public void Selenium() {
		
		System.out.println("Selenium");	
	}

	public void Java() {
		
		System.out.println("Java");
	}

	@Override
	public void ruby() {
		
		System.out.println("Ruby");
		
	}

	public static void main(String[] args) 
	{
		Automation auto = new Automation();
		auto.Java();
		auto.python();
		auto.ruby();
		auto.Selenium();

	}

	
}
