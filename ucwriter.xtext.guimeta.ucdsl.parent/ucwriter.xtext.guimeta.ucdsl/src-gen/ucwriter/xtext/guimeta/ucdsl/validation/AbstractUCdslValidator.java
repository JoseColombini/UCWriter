/*
 * generated by Xtext 2.21.0
 */
package ucwriter.xtext.guimeta.ucdsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractUCdslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage.eINSTANCE);
		return result;
	}
}