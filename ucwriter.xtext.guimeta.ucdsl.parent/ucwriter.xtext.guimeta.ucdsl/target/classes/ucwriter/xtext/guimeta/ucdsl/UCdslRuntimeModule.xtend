/*
 * generated by Xtext 2.21.0
 */
package ucwriter.xtext.guimeta.ucdsl

import org.eclipse.xtext.naming.IQualifiedNameProvider

/** 
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class UCdslRuntimeModule extends AbstractUCdslRuntimeModule {
		override Class<? extends IQualifiedNameProvider>
		bindIQualifiedNameProvider() {
			return typeof (useCaseDslIQualifiedNameProvider);
	}
}