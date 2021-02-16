package plugin.test;

import com.intellij.codeInsight.completion.CompletionContributor;

public class TestCompletionContributor extends CompletionContributor {

	public TestCompletionContributor() {
		System.out.println("here");
	}
}
