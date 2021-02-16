package plugin.test;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts.Label;
import com.intellij.openapi.util.NlsSafe;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public class TestFileType extends LanguageFileType {
	public static final TestFileType INSTANCE = new TestFileType();

	public TestFileType() {
		super(TestLanguage.INSTANCE);
	}

	@Override
	public @NonNls
	@NotNull String getName() {
		return "Test";
	}

	@Override
	public @Label @NotNull String getDescription() {
		return "Description";
	}

	@Override
	public @NlsSafe @NotNull String getDefaultExtension() {
		return "test";
	}

	@Override
	public @Nullable Icon getIcon() {
		return null;
	}
}
