package Core.Loglama;

public class MailLogger implements Logger  {

	@Override
	public void log(String data) {
		System.out.println( "Mail g�nderildi  : " + data);
		
	}
 
}
