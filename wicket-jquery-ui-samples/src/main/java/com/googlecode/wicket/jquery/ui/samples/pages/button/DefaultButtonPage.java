package com.googlecode.wicket.jquery.ui.samples.pages.button;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;

import com.googlecode.wicket.jquery.ui.form.button.Button;
import com.googlecode.wicket.jquery.ui.panel.JQueryFeedbackPanel;

public class DefaultButtonPage extends AbstractButtonPage
{
	private static final long serialVersionUID = 1L;
	
	public DefaultButtonPage()
	{
		this.init();
	}
	
	private void init()
	{
		final Form<Void> form = new Form<Void>("form");
		this.add(form);

		// FeedbackPanel //
		form.add(new JQueryFeedbackPanel("feedback"));
		
		// Buttons //
		form.add(new Button("button1", new Model<String>("Submit")) { //the model here is used to retrieve the button's text afterward 

			private static final long serialVersionUID = 1L;

			@Override
			public void onSubmit()
			{
				DefaultButtonPage.this.info(this);		
			}			
		});

		form.add(new Button("button2", new Model<String>("Submit, with client click")) { //idem as previous comment

			private static final long serialVersionUID = 1L;

			@Override
			protected String getOnClickScript()
			{
				return "alert('The button has been clicked!');";
			}

			@Override
			public void onSubmit()
			{
				DefaultButtonPage.this.info(this);	
			}			
		});
	}

	private void info(Component component)
	{
		this.info(String.format("'%s' has been clicked", component.getDefaultModelObjectAsString()));
	}
}
