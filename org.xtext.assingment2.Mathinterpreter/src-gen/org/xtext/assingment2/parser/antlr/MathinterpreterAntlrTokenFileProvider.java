/*
 * generated by Xtext 2.21.0
 */
package org.xtext.assingment2.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MathinterpreterAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/assingment2/parser/antlr/internal/InternalMathinterpreter.tokens");
	}
}