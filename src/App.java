import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o assunto do email: ");
        String subject = scanner.nextLine();

        System.out.print("Informe o corpo do email: ");
        String body = scanner.nextLine();

        // Criando assinantes
        EmailSubscriber subscriber1 = new EmailSubscriber("email1@example.com");

        EmailSubscriber subscriber2 = new EmailSubscriber("email2@example.com");

        // Criando um sistema de email marketing
        EmailMarketingSystem emailMarketingSystem = new EmailMarketingSystem();

        // Adicionando assinantes ao sistema
        emailMarketingSystem.addSubscriber(subscriber1);
        emailMarketingSystem.addSubscriber(subscriber2);

        // Criando e enviando um email
        Email email = new Email(subject, body);

        emailMarketingSystem.sendEmail(email);

        // Verificando os emails enviados
        List<Email> sentEmails = emailMarketingSystem.getSentEmails();
        System.out.println("Emails enviados:");
        for (Email sentEmail : sentEmails) {
            System.out.println("Assunto: " + sentEmail.getSubject());
            System.out.println("Corpo: " + sentEmail.getBody());
            System.out.println("------------");
        }
    }
}

