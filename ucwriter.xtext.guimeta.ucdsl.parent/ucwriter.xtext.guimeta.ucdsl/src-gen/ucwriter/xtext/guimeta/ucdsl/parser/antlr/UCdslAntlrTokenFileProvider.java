/*
 * generated by Xtext 2.22.0
 */
package ucwriter.xtext.guimeta.ucdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UCdslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("ucwriter/xtext/guimeta/ucdsl/parser/antlr/internal/InternalUCdslParser.tokens");
	}
}
