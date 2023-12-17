package oopWithlayered.coreLoging;

public class MailLogger implements Logger {
	public void log(Object data) {
		System.out.println("mail gönderildi :"+data);
		
	}

}
