package interfaces;

public class Main {
	public static void main(String[] args)
{
	alfa a = new alfa();
	beta b=new beta();
	a.demo();
	b.test();
	alfa ab=b;
	ab.demo();
}
}
