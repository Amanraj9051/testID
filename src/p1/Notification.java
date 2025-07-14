package p1;

public class Notification {

    private EmailService emailService= new EmailService();

    private WhatsAppService appService=new WhatsAppService();
//    public void send(String msg){
//        emailService.sendEmail(msg);
//    }
    public void send(String msg){
        appService.sendWhatsApp(msg);
    }

    public static void main(String[] args) {
        Notification n = new Notification();
        n.send("@ 5pm");
    }


}
