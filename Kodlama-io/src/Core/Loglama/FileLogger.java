package Core.Loglama;


public class FileLogger implements Logger  {

	@Override
	public void log(String data) {
		System.out.println( "Dosya'ya logland� : " + data);
		
	}

}
