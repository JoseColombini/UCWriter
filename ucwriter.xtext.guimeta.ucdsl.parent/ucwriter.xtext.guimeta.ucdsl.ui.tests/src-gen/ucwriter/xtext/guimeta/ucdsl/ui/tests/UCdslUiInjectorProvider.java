/*
 * generated by Xtext 2.21.0
 */
package ucwriter.xtext.guimeta.ucdsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import ucwriter.xtext.guimeta.ucdsl.ui.internal.UcdslActivator;

public class UCdslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return UcdslActivator.getInstance().getInjector("ucwriter.xtext.guimeta.ucdsl.UCdsl");
	}

}