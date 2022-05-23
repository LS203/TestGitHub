package Home;

public class personalmobile {

	public String company="Samsung";
	private Long serialnumber=7809999l;
	protected Boolean Touchscreen=true;
	float Mobilesize =6.9f;
	int size=65;
	double priceindollars=600.70;
	static String [] applications= {"whatsapp","gmail","telegram"};
	
public static void attendMeeting() 
	{
		System.out.println("Am attending a meeting");
		}
  private  void playMusic()
	{  
		
	}
	
	protected void textmessages()
	{
		
	}
static	int docalculation(int a,int b)
	{ int output=a+b;
	System.out.println(output);
	   return output;
	 }
public static void verifyscreensize(int screensize)

{ if(screensize>13)
	System.out.println("testcase pass");
else 
{
	System.out.println("test fail");
}
	
	}
	public static void main(String[] args) {
		
		/*attendMeeting();
		docalculation(958,226);
		System.out.println(applications[1]);*/
		verifyscreensize(16);
		
	}
	
	}


