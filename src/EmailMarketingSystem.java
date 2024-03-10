import java.util.List;
import java.util.ArrayList;

class EmailMarketingSystem {
    private List<EmailSubscriber> subscribers;
    private List<Email> sentEmails;

    public EmailMarketingSystem() {
        this.subscribers = new ArrayList<>();
        this.sentEmails = new ArrayList<>();
    }

    public void addSubscriber(EmailSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void sendEmail(Email email) {
        for (EmailSubscriber subscriber : subscribers) {
            // Simulação de envio de email para cada assinante
            System.out.println("Enviando email para: " + subscriber.getEmail());
            System.out.println("Assunto: " + email.getSubject());
            System.out.println("Corpo: " + email.getBody());
            System.out.println("------------");
        }

        sentEmails.add(email);
    }

    public List<Email> getSentEmails() {
        return sentEmails;
    }
}