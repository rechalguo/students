package rechal.apps.coll.shiro;

import org.apache.shiro.web.filter.authc.LogoutFilter;

public class LogoutExtFilter extends LogoutFilter {

	public LogoutExtFilter(String redirectUrl) {
		this.setRedirectUrl(redirectUrl);
	}
}
