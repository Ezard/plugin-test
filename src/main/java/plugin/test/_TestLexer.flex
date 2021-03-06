package plugin.test;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static plugin.test.TestTypes.*;

%%

%{
  public _TestLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _TestLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+


%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "FOO"              { return FOO; }


}

[^] { return BAD_CHARACTER; }
