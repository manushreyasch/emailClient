//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//    public class emailTest {
//
//        @SuppressWarnings("resource")
//        public static void main(String args[]) {
//
//            // Spring Bean file you specified in /src/main/resources folder
//            String crunchifyConfFile = "application-bean.xml";
//            ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(crunchifyConfFile);
//
//            // @Service("crunchifyEmail") <-- same annotation you specified in CrunchifyEmailAPI.java
//            emailServer EmailAPI = (emailServer) context.getBean("mailSender");
//            String toAddr = "mchangulihouse@tataunistore.com";
//            String fromAddr = "changurimanu03@gmail.com";
//
//            // email subject
//            String subject = "Hey.. This email sent by Spring MVC Tutorial";
//
//            // email body
//            String body = "There you go.. You got an email.. Let's understand details on how Spring MVC works -- By me";
//            EmailAPI.SenderMethod(toAddr, fromAddr, subject, body);
//    }}
import com.tata.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class emailTest
{
    public static void main(String[] args) {
        //Create the application context
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:application-bean.xml");
        //context.start();
        //Get the mailer instance
        EmailService mailer = (EmailService) context.getBean("emailService");
        //Send a composed mail
        mailer.sendMail("mchangulihouse@tataunistore.com", "Test Subject", "Testing body");

    }
//
//    @Autowired
//    EmailService mailer;
//        @Override
//        public void onApplicationEvent(ContextStartedEvent cse){
//        //Send a composed mail
//        mailer.sendMail("mchangulihouse@tataunistore.com", "Test Subject", "Testing body");
//    }
}