/*
 * generated by Xtext 2.21.0
 */
package org.xtext.assingment2.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.assingment2.parser.antlr.internal.InternalMathinterpreterParser;
import org.xtext.assingment2.services.MathinterpreterGrammarAccess;

public class MathinterpreterParser extends AbstractAntlrParser {

	@Inject
	private MathinterpreterGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMathinterpreterParser createParser(XtextTokenStream stream) {
		return new InternalMathinterpreterParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MathinterpreterGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MathinterpreterGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}