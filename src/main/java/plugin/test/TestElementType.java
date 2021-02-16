package plugin.test;

import com.intellij.psi.tree.IElementType;

public class TestElementType extends IElementType {

	public TestElementType(String debugName) {
		super(debugName, TestLanguage.INSTANCE);
	}
}
