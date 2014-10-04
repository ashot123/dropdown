package mkyong;

import org.apache.wicket.protocol.http.WebApplication;
import mkyong.user.DropDownChoicePage;

public class WicketApplication extends WebApplication {

	@Override
	public Class<DropDownChoicePage> getHomePage() {

		return DropDownChoicePage.class; // return default page
	}

}
