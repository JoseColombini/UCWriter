package ucwriter.xtext.guimeta.ucdsl

import org.eclipse.xtext.naming.IQualifiedNameProvider

/** 
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class UCdslRunTimeModule extends AbstractUCdslRuntimeModule {
		override Class<? extends IQualifiedNameProvider>
		bindIQualifiedNameProvider() {
			return typeof (useCaseDslIQualifiedNameProvider);
	}
}