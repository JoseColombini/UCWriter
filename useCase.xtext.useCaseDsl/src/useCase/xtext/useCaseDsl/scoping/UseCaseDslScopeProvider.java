/*
 * generated by Xtext 2.20.0
 */
package useCase.xtext.useCaseDsl.scoping;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

import com.google.common.base.Function;
import com.google.inject.Inject;

import useCase.xtext.useCaseDsl.useCaseDsl.Extension;
import useCase.xtext.useCaseDsl.useCaseDsl.ExtensionStep;
import useCase.xtext.useCaseDsl.useCaseDsl.RepeatingStep;
import useCase.xtext.useCaseDsl.useCaseDsl.Step;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCase;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCaseStep;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;



/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class UseCaseDslScopeProvider extends AbstractUseCaseDslScopeProvider {

	@Inject IQualifiedNameProvider iq;
	@Override
	public IScope getScope(EObject context, EReference reference) {
		//Scoping for parent in loops
		if(context instanceof UseCaseStep && context.eContainer() instanceof RepeatingStep 
			&& reference == UseCaseDslPackage.Literals.USE_CASE_STEP__PARENT) {
	
			List<RepeatingStep> candidates = new LinkedList<RepeatingStep>();
			candidates.add((RepeatingStep) context.eContainer());
			

	        return Scopes.scopeFor(candidates, new Function<RepeatingStep, QualifiedName>() {
				@Override
				public QualifiedName apply(RepeatingStep from) {
					String names[] = new String[iq.getFullyQualifiedName(context.eContainer()).getSegmentCount() -1];
					for(int i = 0; i < iq.getFullyQualifiedName(context.eContainer()).getSegmentCount() - 1; i++) {
						names[i] = iq.getFullyQualifiedName(context.eContainer()).getSegment(i + 1);
					}
					return QualifiedName.create(names);
				}
			}, IScope.NULLSCOPE);
		}
		
		//Scoping for extensions
		//Scoping for startFrom
		if(context instanceof Extension && reference == UseCaseDslPackage.Literals.EXTENSION__START_FROM) {
			
			
			UseCase parent = (UseCase) context.eContainer();
			List<Step> candidates = EcoreUtil2.getAllContentsOfType(parent, Step.class);
		
			return Scopes.scopeFor(candidates, new Function<Step, QualifiedName>() {
				@Override
				public QualifiedName apply(Step from) {
					String names[] = new String[iq.getFullyQualifiedName(from).getSegmentCount() -1];
					for(int i = 0; i < iq.getFullyQualifiedName(from).getSegmentCount() - 1; i++) {
						names[i] = iq.getFullyQualifiedName(from).getSegment(i + 1);
					}
					return QualifiedName.create(names);
				}
			}, IScope.NULLSCOPE);
			
		}
		//Scoping for resumeAt
		if(context instanceof Extension && reference == UseCaseDslPackage.Literals.EXTENSION__RESUME_AT) {
			
			UseCase parent = (UseCase) context.eContainer();
			List<Step> candidates = EcoreUtil2.getAllContentsOfType(parent, Step.class);
		
			return Scopes.scopeFor(candidates, new Function<Step, QualifiedName>() {
				@Override
				public QualifiedName apply(Step from) {
					String names[] = new String[iq.getFullyQualifiedName(from).getSegmentCount() -1];
					for(int i = 0; i < iq.getFullyQualifiedName(from).getSegmentCount() - 1; i++) {
						names[i] = iq.getFullyQualifiedName(from).getSegment(i + 1);
					}
					return QualifiedName.create(names);
				}
			}, IScope.NULLSCOPE);
		}
	    return super.getScope(context, reference);
	}
}

