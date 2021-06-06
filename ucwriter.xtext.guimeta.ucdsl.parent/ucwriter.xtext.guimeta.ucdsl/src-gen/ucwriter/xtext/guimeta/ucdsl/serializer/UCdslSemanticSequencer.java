/*
 * generated by Xtext 2.22.0
 */
package ucwriter.xtext.guimeta.ucdsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import ucwriter.xtext.guimeta.ucdsl.services.UCdslGrammarAccess;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.DeadEndStep;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.ExtensioCondition;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.Extension;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.ExtensionStep;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.Postcondition;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.Precondition;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.RepeatingCondition;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.RepeatingStep;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.SystemStep;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.UCdslPackage;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCase;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCaseDocument;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.UseCaseStep;
import ucwriter.xtext.guimeta.ucdsl.uCdsl.UserStep;

@SuppressWarnings("all")
public class UCdslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UCdslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UCdslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UCdslPackage.DEAD_END_STEP:
				sequence_DeadEndStep(context, (DeadEndStep) semanticObject); 
				return; 
			case UCdslPackage.EXTENSIO_CONDITION:
				sequence_ExtensioCondition(context, (ExtensioCondition) semanticObject); 
				return; 
			case UCdslPackage.EXTENSION:
				sequence_Extension(context, (Extension) semanticObject); 
				return; 
			case UCdslPackage.EXTENSION_STEP:
				sequence_ExtensionStep(context, (ExtensionStep) semanticObject); 
				return; 
			case UCdslPackage.POSTCONDITION:
				sequence_Postcondition(context, (Postcondition) semanticObject); 
				return; 
			case UCdslPackage.PRECONDITION:
				sequence_Precondition(context, (Precondition) semanticObject); 
				return; 
			case UCdslPackage.REPEATING_CONDITION:
				sequence_RepeatingCondition(context, (RepeatingCondition) semanticObject); 
				return; 
			case UCdslPackage.REPEATING_STEP:
				sequence_UseCaseStep(context, (RepeatingStep) semanticObject); 
				return; 
			case UCdslPackage.SYSTEM_STEP:
				sequence_UseCaseStep(context, (SystemStep) semanticObject); 
				return; 
			case UCdslPackage.USE_CASE:
				sequence_UseCase(context, (UseCase) semanticObject); 
				return; 
			case UCdslPackage.USE_CASE_DOCUMENT:
				sequence_UseCaseDocument(context, (UseCaseDocument) semanticObject); 
				return; 
			case UCdslPackage.USE_CASE_STEP:
				sequence_UseCaseStep(context, (UseCaseStep) semanticObject); 
				return; 
			case UCdslPackage.USER_STEP:
				sequence_UseCaseStep(context, (UserStep) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Step returns DeadEndStep
	 *     ExtensionStep returns DeadEndStep
	 *     DeadEndStep returns DeadEndStep
	 *
	 * Constraint:
	 *     (name=StepName sentence=LongName?)
	 */
	protected void sequence_DeadEndStep(ISerializationContext context, DeadEndStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExtensioCondition returns ExtensioCondition
	 *
	 * Constraint:
	 *     condition=Condition
	 */
	protected void sequence_ExtensioCondition(ISerializationContext context, ExtensioCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UCdslPackage.Literals.EXTENSIO_CONDITION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UCdslPackage.Literals.EXTENSIO_CONDITION__CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExtensioConditionAccess().getConditionConditionParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Step returns ExtensionStep
	 *     ExtensionStep returns ExtensionStep
	 *
	 * Constraint:
	 *     ((name=StepName reference=[UseCase|LongName]) | (name=StepName sentence=LongName))
	 */
	protected void sequence_ExtensionStep(ISerializationContext context, ExtensionStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Extension returns Extension
	 *
	 * Constraint:
	 *     (
	 *         (startFrom=[UseCaseStep|QualifiedStepName] | startFrom=[ExtensionStep|QualifiedExtensionStepName]) 
	 *         name=CHAR 
	 *         condition=ExtensioCondition 
	 *         steps+=ExtensionStep* 
	 *         (resumeAt=[UseCaseStep|QualifiedStepName] | resumeAt=[ExtensionStep|QualifiedExtensionStepName] | end=DeadEndStep)
	 *     )
	 */
	protected void sequence_Extension(ISerializationContext context, Extension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Postcondition returns Postcondition
	 *
	 * Constraint:
	 *     condition=Condition
	 */
	protected void sequence_Postcondition(ISerializationContext context, Postcondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UCdslPackage.Literals.POSTCONDITION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UCdslPackage.Literals.POSTCONDITION__CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPostconditionAccess().getConditionConditionParserRuleCall_2_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Precondition returns Precondition
	 *
	 * Constraint:
	 *     condition=Condition
	 */
	protected void sequence_Precondition(ISerializationContext context, Precondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UCdslPackage.Literals.PRECONDITION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UCdslPackage.Literals.PRECONDITION__CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPreconditionAccess().getConditionConditionParserRuleCall_2_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RepeatingCondition returns RepeatingCondition
	 *
	 * Constraint:
	 *     condition=Condition
	 */
	protected void sequence_RepeatingCondition(ISerializationContext context, RepeatingCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UCdslPackage.Literals.REPEATING_CONDITION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UCdslPackage.Literals.REPEATING_CONDITION__CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRepeatingConditionAccess().getConditionConditionParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UseCaseDocument returns UseCaseDocument
	 *
	 * Constraint:
	 *     usecase+=UseCase+
	 */
	protected void sequence_UseCaseDocument(ISerializationContext context, UseCaseDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Step returns RepeatingStep
	 *     UseCaseStep returns RepeatingStep
	 *
	 * Constraint:
	 *     (parent=[RepeatingStep|QualifiedStepName]? name=StepName condition=RepeatingCondition steps+=UseCaseStep+)
	 */
	protected void sequence_UseCaseStep(ISerializationContext context, RepeatingStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Step returns SystemStep
	 *     UseCaseStep returns SystemStep
	 *
	 * Constraint:
	 *     (parent=[RepeatingStep|QualifiedStepName]? name=StepName sentence=LongName)
	 */
	protected void sequence_UseCaseStep(ISerializationContext context, SystemStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Step returns UseCaseStep
	 *     UseCaseStep returns UseCaseStep
	 *
	 * Constraint:
	 *     (parent=[RepeatingStep|QualifiedStepName]? name=StepName reference=[UseCase|LongName])
	 */
	protected void sequence_UseCaseStep(ISerializationContext context, UseCaseStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Step returns UserStep
	 *     UseCaseStep returns UserStep
	 *
	 * Constraint:
	 *     (parent=[RepeatingStep|QualifiedStepName]? name=StepName sentence=LongName)
	 */
	protected void sequence_UseCaseStep(ISerializationContext context, UserStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UseCase returns UseCase
	 *
	 * Constraint:
	 *     (
	 *         number=INT 
	 *         name=LongName 
	 *         precondition=Precondition? 
	 *         postcondition=Postcondition? 
	 *         steps+=UseCaseStep+ 
	 *         alternativeflows+=Extension*
	 *     )
	 */
	protected void sequence_UseCase(ISerializationContext context, UseCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
