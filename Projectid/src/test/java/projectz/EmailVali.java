package projectz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.Assert;

public class EmailVali {

	private static Pattern pattern;
	private static Matcher matcher;


	private static final String EMAIL_PATTERN ="^([a-zA-Z0-9]{1,9})@gmail.com$";
	public EmailVali() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}

	/**
	 * Validate hex with regular expression
	 *
	 * @param hex
	 *            hex for validation
	 * @return true valid hex, false invalid hex
	 */
	public static boolean validate(final String hex) {

		matcher = pattern.matcher(hex);
		return matcher.matches();
	}


	public void ValidEmailTest2(String temp) {

		boolean valid = EmailVali.validate(temp);
		System.out.println("Email is valid : " + temp + " , " + valid);
		Assert.assertEquals(valid, true);

	}

	public static void main(String[] args) throws Throwable {

		EmailVali gg = new EmailVali();
		gg.ValidEmailTest2("abcd1232@gmail.com");

	}

}
