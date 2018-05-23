/*
 * Copyright 2018 walmart.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.erik.holamundo;
import java.util.Properties;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author walmart
 */
public class Correo {

//    public void enviarConGMail(String destinatario, String asunto, String cuerpo) {
//    String remitente = "pruebas.wicket";  //Para la dirección nomcuenta@gmail.com
//    Properties props = System.getProperties();
//    props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
//    props.put("mail.smtp.user", remitente);
////    props.put("mail.smtp.clave", "erik.wick99");    //La clave de la cuenta
//    props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
//    props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
//    props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google
//    
//System.out.print("hermilo");
//    Session session = Session.getDefaultInstance(props);
//    MimeMessage message = new MimeMessage(session);
//
//    try {
//        message.setFrom(new InternetAddress(remitente));
//        message.addRecipients(Message.RecipientType.TO, destinatario);   //Se podrían añadir varios de la misma manera
//        message.setSubject(asunto);
//        message.setText(cuerpo);
//        Transport transport = session.getTransport("smtp");
//        transport.connect("smtp.gmail.com", remitente, "erik.wick99");
//        transport.sendMessage(message, message.getAllRecipients());
//        transport.close();
//    }
//    catch (MessagingException me) {
//        me.printStackTrace();   //Si se produce un error
//        System.out.println(me);
//    }
//}

    public static void sendFromGMail(final String from, final String pass, String to, String subject, String body) {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", host);
//        props.put("mail.smtp.user", from);
//        props.put("mail.smtp.password", pass);
//        props.put("mail.smtp.socketFactory.port", "465");
//	props.put("mail.smtp.socketFactory.class",
//				"javax.net.ssl.SSLSocketFactory");
//        props.put("mail.smtp.port", "465");
//        props.put("mail.smtp.auth", "true");
//
//        Session session = Session.getDefaultInstance(props);
        props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

	Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(from, pass);
				}
			});
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            
                message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            

            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }
}