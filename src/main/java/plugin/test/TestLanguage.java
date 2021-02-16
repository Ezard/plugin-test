package plugin.test;

import com.intellij.lang.Language;

public class TestLanguage extends Language {
	public static final TestLanguage INSTANCE = new TestLanguage();

	public TestLanguage() {
		super("Test");
	}
}
