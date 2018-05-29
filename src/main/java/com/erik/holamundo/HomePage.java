package com.erik.holamundo;



import javax.mail.Address;
import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.util.time.TimeOfDay;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
private static String USER_NAME = "pruebas.wicket";  // GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = "erik.wick99"; // GMail password
    
	public HomePage(final PageParameters parameters) {
		super(parameters);

Form form = new Form("form") {
        protected void onSubmit() {
            info("Hizo click en el botón");
        }
    };
form.add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
                form.add(new Label("message", "Hola mundo"));
                form.add(new Label("hora", TimeOfDay.now()));
                form.add(new Label("1", "Erik Hermilo Morales Alvarez"));
    Button button1 = new Button("button1") {
        public void onSubmit() {
           
        }
    };

    form.add(button1);

    add(form);

           
	FeedbackPanel feedbackPanel = new FeedbackPanel("feedback");
        add(feedbackPanel);
//                        
//        Link actionOnClickLink = new Link("actionOnClickLink")
//        {
//            public void onClick()
//            {
//             correo();
//             };
//        };  
//        add(actionOnClickLink);
    };
		// TODO Add your page's components here
        public void correo(){
               try{
//                        String a = "hermiloerik@gmail.com";
//                        String asunto = "Correo de prueba enviado desde Java";
//                        String cuerpo = "Esta es una prueba de correo...";

//                        c.enviarConGMail(a, asunto, cuerpo);    
                        String from = USER_NAME;
                        String pass = PASSWORD;
                        String to= "hermiloerik@gmail.com"; // list of recipient email addresses
                        String subject = "Java send mail example";
                        String body = "Welcome to JavaMail!";

                        Correo.sendFromGMail(from, pass, to, subject, body);
                         info("Se envio una Excepcion");
            }catch(Exception e){
        }
        }
}

