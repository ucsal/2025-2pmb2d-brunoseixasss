import br.com.mariojp.solid.dip.EmailNotifier;
import br.com.mariojp.solid.dip.SmtpClient;
import br.com.mariojp.solid.dip.User;

public class Main {
	public static void main(String[] args) {
		System.setProperty("SMTP_AVAILABLE", "true");
		var notifier = new EmailNotifier(new SmtpClient());
		notifier.welcome(new User("Ana", "ana@example.com"));
		System.out.println("Email enviado!");
	}
}