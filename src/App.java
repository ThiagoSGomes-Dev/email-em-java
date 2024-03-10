import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o email: ");
        String email = scanner.nextLine();

        System.out.print("Informe o assunto do email: ");
        String subject = scanner.nextLine();

        System.out.print("Informe o corpo do email: ");
        String body = scanner.nextLine();

        // Criando assinantes
        EmailSubscriber subscribers = new EmailSubscriber(email);

        // Criando um sistema de email marketing
        EmailMarketingSystem emailMarketingSystem = new EmailMarketingSystem();

        // Adicionando assinantes ao sistema
        emailMarketingSystem.addSubscriber(subscribers);

        // Criando e enviando um email
        Email emails = new Email(email, subject, body);

        emailMarketingSystem.sendEmail(emails);

        // Verificando os emails enviados
        List<Email> sentEmails = emailMarketingSystem.getSentEmails();
        System.out.println("Emails enviados:");
        for (Email sentEmail : sentEmails) {
            
            System.out.println("Email: " + sentEmail.getEmail());
            System.out.println("Assunto: " + sentEmail.getSubject());
            System.out.println("Corpo: " + sentEmail.getBody());
            System.out.println("------------");
        }
    }
}

