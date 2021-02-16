package plugin.test;

import com.intellij.psi.tree.IElementType;

public class TestTokenType extends IElementType {

	public TestTokenType(String debugName) {
		super(debugName, TestLanguage.INSTANCE);
	}

	@Override
	public String toString() {
		return "TestTokenType." + super.toString();
	}
}
