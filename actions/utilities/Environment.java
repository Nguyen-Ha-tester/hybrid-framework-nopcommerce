package utilities;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;;

@Sources({ "file:environmentConfig/${env}.properties" })
public interface Environment extends Config {
	@Key("app.url")
	String appURL();

	@Key("app.user")
	String getAppUserName();

	@Key("app.pass")
	String getAppPassword();

	@Key("DB.Host")
	String getDbHost();

	@Key("DB.User")
	String getDbUser();

	@Key("DB.Password")
	String getDbPassword();

}
