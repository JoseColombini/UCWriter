package useCase.xtext.useCaseDsl

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.IQualifiedNameConverter 
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage
import useCase.xtext.useCaseDsl.useCaseDsl.Extension;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCase

class useCaseDslIQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	@Inject
	IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();
	
	override QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof Extension) {
			val nodes = NodeModelUtils.findNodesForFeature(obj,
							UseCaseDslPackage.Literals.EXTENSION__START_FROM);
							
	 		for (node : nodes) {
	 			val text = NodeModelUtils.getTokenText(node);
				if (text !== null) {
//					var Qname = iq.getFullyQualifiedName(obj);
//					var myname = Qname.skipLast(1);
					var a = obj.eContainer();
					var FN = (a as UseCase).getName() + "." + text + "." + (obj as Extension).getName();	
	 				return converter.toQualifiedName(FN);
	 			}
			}
		}
		return super.getFullyQualifiedName(obj);
	}
}