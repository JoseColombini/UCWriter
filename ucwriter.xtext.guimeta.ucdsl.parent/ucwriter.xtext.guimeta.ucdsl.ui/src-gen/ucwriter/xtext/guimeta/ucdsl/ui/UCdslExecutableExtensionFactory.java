/*
 * generated by Xtext 2.21.0
 */
package ucwriter.xtext.guimeta.ucdsl.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import ucwriter.xtext.guimeta.ucdsl.ui.internal.UcdslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class UCdslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(UcdslActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		UcdslActivator activator = UcdslActivator.getInstance();
		return activator != null ? activator.getInjector(UcdslActivator.UCWRITER_XTEXT_GUIMETA_UCDSL_UCDSL) : null;
	}

}