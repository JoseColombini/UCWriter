/*
 * generated by Xtext 2.21.0
 */
package ucwriter.xtext.guimeta.ucdsl.validation;


import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

import ucwriter.xtext.guimeta.ucdsl.uCdsl.Extension;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.ExtensionStep;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.RepeatingStep;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.Step;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCase;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCaseStep;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class UCdslValidator extends AbstractUCdslValidator {
	
	
	public static final String INVALID_NAME = "invalidName";
	public static final String INVALID_REFERENCE = "invalidReference";
	
	@Check
	public void checkStepNameAreUniq(Step step) {
		EObject parent = step.eContainer();
		EList<EObject> compare = parent.eContents();   // EcoreUtil2.getAllContentsOfType(parent, Step.class);
		Iterator<EObject> it = compare.iterator();
		while(it.hasNext()) {
			EObject a = it.next();
			if(a instanceof Step && a != step  && ((Step) a).getName().equals(step.getName())) {
				error("Step name are not unique in context",
						UCdslPackage.Literals.STEP__NAME,
						INVALID_NAME);
				return;
			}
		}
	}	
		

	
	@Inject IQualifiedNameProvider iq;
	@Check
	public void checkStepParent(UseCaseStep step) {
		if (step.eContainer() instanceof Step) {
			String nameparent = ((iq.getFullyQualifiedName(step.eContainer())).skipFirst(1)).toString();
			String nameref = ((iq.getFullyQualifiedName(step.getParent())).skipFirst(1)).toString();
			if(! nameparent.equals(nameref)  /*((Step) step.eContainer()).getName().equals(step.getParent().getName())*/) {
				error("This step is not his parent",
						UCdslPackage.Literals.USE_CASE_STEP__PARENT,
						INVALID_REFERENCE);
			}
		}
	}
	
	@Check
	public void checkStepNameSequence(Step step) {
		EObject parent = step.eContainer();

		if (parent instanceof UseCase) {
			EList<UseCaseStep> compare = ((UseCase) parent).getSteps();
			Iterator<UseCaseStep> it = compare.iterator();
			if(it.hasNext()) {
				UseCaseStep a = it.next();
				if(a == step) {
					if(Integer.parseInt(step.getName()) != 1) {
						warning("Step name are not linear",
								UCdslPackage.Literals.STEP__NAME,
								INVALID_NAME);
						return;						
					}
				}else {
					while(it.hasNext()) {
						UseCaseStep b = it.next();
						if(b == step && Integer.parseInt(step.getName()) - 1 != Integer.parseInt(a.getName())) {
							warning("Step name are not linear",
									UCdslPackage.Literals.STEP__NAME,
									INVALID_NAME);
							return;
						}
					a = b;
					}			
				}		
			}
		}
		
		if (parent instanceof Extension) {
			EList<ExtensionStep> compare = ((Extension) parent).getSteps();
			Iterator<ExtensionStep> it = compare.iterator();
			if(it.hasNext()) {
				ExtensionStep a = it.next();
				if(a == step) {
					if(Integer.parseInt(step.getName()) != 1) {
						warning("Step name are not linear",
								UCdslPackage.Literals.STEP__NAME,
								INVALID_NAME);
						return;						
					}
				}else {
					while(it.hasNext()) {
						ExtensionStep b = it.next();
						if(b == step && Integer.parseInt(step.getName()) - 1 != Integer.parseInt(a.getName())) {
							warning("Step name are not linear",
									UCdslPackage.Literals.STEP__NAME,
									INVALID_NAME);
							return;
						}
					a = b;
					}			
				}		
			}
		}
		if (parent instanceof RepeatingStep) {
			EList<UseCaseStep> compare = ((RepeatingStep) parent).getSteps();
			Iterator<UseCaseStep> it = compare.iterator();
			if(it.hasNext()) {
				UseCaseStep a = it.next();
				if(a == step) {
					if(Integer.parseInt(step.getName()) != 1) {
						warning("Step name are not linear",
								UCdslPackage.Literals.STEP__NAME,
								INVALID_NAME);
						return;						
					}
				}else {
					while(it.hasNext()) {
						UseCaseStep b = it.next();
						if(b == step && Integer.parseInt(step.getName()) - 1 != Integer.parseInt(a.getName())) {
							warning("Step name are not linear",
									UCdslPackage.Literals.STEP__NAME,
									INVALID_NAME);
							return;
						}
					a = b;
					}			
				}		
			}
		}
	}		

		

	
	
	@Check
	public void checkExtensionName(Extension extension) {
		EObject parent = extension.eContainer();
		List<Extension> compare = ((UseCase) parent).getAlternativeflows();
		Iterator<Extension> it = compare.iterator();
		while (it.hasNext()) {
			Extension a = it.next();
			if (a != extension && a.getName().equals(extension.getName()) && a.getStartFrom() == extension.getStartFrom()) {
				error("This extension name is not unique",
						UCdslPackage.Literals.EXTENSION__NAME,
						INVALID_NAME);
			}
		}
//		it = compare.iterator();
//		if(it.hasNext()) {
//			do {
//				Extension a = it.next();
//				if(a.getStartFrom() )
//			}while(it.hasNext())
//		}
	}
	
	@Check
	public void checkIncludeName(Step step) {
		EObject parent = step.eContainer();
		while(!(parent instanceof UseCase)) {
			parent = parent.eContainer();
		}
		if(parent == step.getReference()) {
			error("Call this use case",
					UCdslPackage.Literals.STEP__REFERENCE,
					INVALID_REFERENCE);
		}
	}
	
}