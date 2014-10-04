package mkyong.user;

import java.util.Arrays;
import java.util.List;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.PropertyModel;

public class DropDownChoicePage extends WebPage {

	private static final List<String> SEARCH_ENGINES = Arrays.asList("Google", "Bing", "Baidu");

	//make Google selected by default
	private String selected = "Google";
	public DropDownChoicePage(final PageParameters parameters) {

		add(new FeedbackPanel("feedback"));

		DropDownChoice<String> listSites = new DropDownChoice<String>(
				"sites", new PropertyModel<String>(this, "selected"), SEARCH_ENGINES);

		Form<?> form = new Form<Void>("form") {
			@Override
			protected void onSubmit() {
				info("Selected search engine : " + selected);
			}
		};

		add(form);
		form.add(listSites);

	}
}
