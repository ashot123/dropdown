package mkyong.user;

import java.util.Arrays;
import java.util.List;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

public class DropDownChoicePage extends WebPage {

    //private static final List<String> SEARCH_ENGINES = Arrays.asList("Google", "Bing", "Baidu");

    //make Google selected by default
    private Day selectedDay = Day.MONDAY;

    public DropDownChoicePage(final PageParameters parameters) {

        add(new FeedbackPanel("feedback"));

        DropDownChoice<Day> listSites =
                new DropDownChoice<Day>("sites", new PropertyModel<Day>(this, "selectedDay"), Arrays.asList(Day.values()));

        Form<?> form = new Form<Void>("form") {
            @Override
            protected void onSubmit() {
                //selectedDay =
                info("Selected search engine : " + selectedDay);
            }
        };

        add(form);
        form.add(listSites);

    }
}
