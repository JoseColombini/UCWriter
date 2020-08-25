package ucwriter.xtext.guimeta.ucdsl;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import ucwriter.xtext.guimeta.ucdsl.useCaseDslIQualifiedNameProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class UCdslRunTimeModule /* implements AbstractUCdslRuntimeModule  */{
  public /* Class<? extends IQualifiedNameProvider> */Object bindIQualifiedNameProvider() {
    return useCaseDslIQualifiedNameProvider.class;
  }
}
