package Stock;

public class stocksinglton {
	private static stock s1;
public static stock getstock()
{if(s1==null)
	s1=new stock();
	return s1;
	
}
}
