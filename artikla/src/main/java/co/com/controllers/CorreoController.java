package co.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class CorreoController {
	//Importante hacer la inyección de dependencia de JavaMailSender:
    @Autowired
    private JavaMailSender mailSender;

    //Pasamos por parametro: destinatario, asunto y el mensaje
    public void sendEmail(String to, String nombre,int modoUsuario) {
    	//Modo usuario ---> 0 = solicitado . 1 = solicitante
    	String subject = "Nuevo Amigo - Artikla";
    	String content = "Cordia Saludo" + nombre +"%0D%0A";
    	if(modoUsuario == 0) {
    		content += "Usted ha aceptado una solicitud de match";
    	}else {
    		content += "Se ha aceptado su solicitud de match";
    	}
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(to);
        email.setSubject(subject);
        email.setText(content);
       
        mailSender.send(email);
    }
}
