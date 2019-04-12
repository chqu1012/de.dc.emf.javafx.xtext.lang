/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.parser.antlr;

import com.google.inject.Inject;
import de.dc.javafx.xcore.lang.parser.antlr.internal.InternalJavaFXDslParser;
import de.dc.javafx.xcore.lang.services.JavaFXDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class JavaFXDslParser extends AbstractAntlrParser {

	@Inject
	private JavaFXDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalJavaFXDslParser createParser(XtextTokenStream stream) {
		return new InternalJavaFXDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ProjectFX";
	}

	public JavaFXDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JavaFXDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}