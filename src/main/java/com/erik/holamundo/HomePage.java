package com.erik.holamundo;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.util.time.TimeOfDay;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
                add(new Label("message", "Hola mundo"));
                add(new Label("hora", TimeOfDay.now()));
                add(new Label("1", "Erik Hermilo Morales Alvarez"));

		// TODO Add your page's components here

    }
}
