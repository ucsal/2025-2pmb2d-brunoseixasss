package br.com.mariojp.solid.dip;

public class DryRunMailSender implements MailSender {
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("DRY_RUN: Email para " + to + " não enviado. Assunto: " + subject);
    }
}
