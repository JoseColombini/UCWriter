/*
 * generated by Xtext 2.21.0
 */
package ucwriter.xtext.guimeta.ucdsl.parser.antlr;

import com.google.inject.Inject;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import ucwriter.xtext.guimeta.ucdsl.parser.antlr.internal.InternalUCdslParser;
import ucwriter.xtext.guimeta.ucdsl.services.UCdslGrammarAccess;

public class UCdslParser extends AbstractAntlrParser {

	@Inject
	private UCdslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new UCdslTokenSource(super.createLexer(stream));
	}
	
	/**
	 * Indentation aware languages do not support partial parsing since the lexer is inherently stateful.
	 * Override and return {@code true} if your terminal splitting is stateless.
	 */
	@Override
	protected boolean isReparseSupported() {
		return false;
	}

	@Override
	protected InternalUCdslParser createParser(XtextTokenStream stream) {
		return new InternalUCdslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "UseCaseDocument";
	}

	public UCdslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UCdslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}