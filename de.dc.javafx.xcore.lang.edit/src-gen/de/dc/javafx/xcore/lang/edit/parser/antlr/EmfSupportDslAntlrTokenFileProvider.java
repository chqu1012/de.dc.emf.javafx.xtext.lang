/*
 * generated by Xtext 2.17.0
 */
package de.dc.javafx.xcore.lang.edit.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EmfSupportDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/dc/javafx/xcore/lang/edit/parser/antlr/internal/InternalEmfSupportDsl.tokens");
	}
}