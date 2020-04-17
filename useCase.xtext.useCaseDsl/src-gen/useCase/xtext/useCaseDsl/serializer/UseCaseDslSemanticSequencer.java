/*
 * generated by Xtext 2.20.0
 */
package useCase.xtext.useCaseDsl.serializer;

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
import useCase.xtext.useCaseDsl.services.UseCaseDslGrammarAccess;
import useCase.xtext.useCaseDsl.useCaseDsl.DeadEndStep;
import useCase.xtext.useCaseDsl.useCaseDsl.Extension;
import useCase.xtext.useCaseDsl.useCaseDsl.ExtensionStep;
import useCase.xtext.useCaseDsl.useCaseDsl.Postcondition;
import useCase.xtext.useCaseDsl.useCaseDsl.Precondition;
import useCase.xtext.useCaseDsl.useCaseDsl.RepeatingStep;
import useCase.xtext.useCaseDsl.useCaseDsl.Step;
import useCase.xtext.useCaseDsl.useCaseDsl.SystemStep;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCase;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDocument;
import useCase.xtext.useCaseDsl.useCaseDsl.UseCaseDslPackage;
import useCase.xtext.useCaseDsl.useCaseDsl.UserStep;

@SuppressWarnings("all")
public class UseCaseDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UseCaseDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UseCaseDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UseCaseDslPackage.DEAD_END_STEP:
				sequence_DeadEndStep(context, (DeadEndStep) semanticObject); 
				return; 
			case UseCaseDslPackage.EXTENSION:
				sequence_Extension(context, (Extension) semanticObject); 
				return; 
			case UseCaseDslPackage.EXTENSION_STEP:
				sequence_ExtensionStep(context, (ExtensionStep) semanticObject); 
				return; 
			case UseCaseDslPackage.POSTCONDITION:
				sequence_Postcondition(context, (Postcondition) semanticObject); 
				return; 
			case UseCaseDslPackage.PRECONDITION:
				sequence_Precondition(context, (Precondition) semanticObject); 
				return; 
			case UseCaseDslPackage.REPEATING_STEP:
				sequence_UseCaseStep(context, (RepeatingStep) semanticObject); 
				return; 
			case UseCaseDslPackage.STEP:
				sequence_Step(context, (Step) semanticObject); 
				return; 
			case UseCaseDslPackage.SYSTEM_STEP:
				sequence_UseCaseStep(context, (SystemStep) semanticObject); 
				return; 
			case UseCaseDslPackage.USE_CASE:
				sequence_UseCase(context, (UseCase) semanticObject); 
				return; 
			case UseCaseDslPackage.USE_CASE_DOCUMENT:
				sequence_UseCaseDocument(context, (UseCaseDocument) semanticObject); 
				return; 
			case UseCaseDslPackage.USER_STEP:
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
	 *     Step returns ExtensionStep
	 *     ExtensionStep returns ExtensionStep
	 *
	 * Constraint:
	 *     (name=StepName sentence=LongName)
	 */
	protected void sequence_ExtensionStep(ISerializationContext context, ExtensionStep semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCaseDslPackage.Literals.STEP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCaseDslPackage.Literals.STEP__NAME));
			if (transientValues.isValueTransient(semanticObject, UseCaseDslPackage.Literals.EXTENSION_STEP__SENTENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCaseDslPackage.Literals.EXTENSION_STEP__SENTENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExtensionStepAccess().getNameStepNameParserRuleCall_0_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExtensionStepAccess().getSentenceLongNameParserRuleCall_0_3_0(), semanticObject.getSentence());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Extension returns Extension
	 *
	 * Constraint:
	 *     (startFrom+=StepName+ name=CHAR condition=Condition steps+=ExtensionStep* (resumeAt+=StepName+ | end=DeadEndStep))
	 */
	protected void sequence_Extension(ISerializationContext context, Extension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Postcondition returns Postcondition
	 *
	 * Constraint:
	 *     (name='POSTCONDITION' condition=Condition)
	 */
	protected void sequence_Postcondition(ISerializationContext context, Postcondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCaseDslPackage.Literals.POSTCONDITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCaseDslPackage.Literals.POSTCONDITION__NAME));
			if (transientValues.isValueTransient(semanticObject, UseCaseDslPackage.Literals.POSTCONDITION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCaseDslPackage.Literals.POSTCONDITION__CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPostconditionAccess().getNamePOSTCONDITIONKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPostconditionAccess().getConditionConditionParserRuleCall_2_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Precondition returns Precondition
	 *
	 * Constraint:
	 *     (name='PRECONDITION' condition=Condition)
	 */
	protected void sequence_Precondition(ISerializationContext context, Precondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCaseDslPackage.Literals.PRECONDITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCaseDslPackage.Literals.PRECONDITION__NAME));
			if (transientValues.isValueTransient(semanticObject, UseCaseDslPackage.Literals.PRECONDITION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCaseDslPackage.Literals.PRECONDITION__CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPreconditionAccess().getNamePRECONDITIONKeyword_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPreconditionAccess().getConditionConditionParserRuleCall_2_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Step returns Step
	 *
	 * Constraint:
	 *     (name=StepName reference=LongName)
	 */
	protected void sequence_Step(ISerializationContext context, Step semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCaseDslPackage.Literals.STEP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCaseDslPackage.Literals.STEP__NAME));
			if (transientValues.isValueTransient(semanticObject, UseCaseDslPackage.Literals.STEP__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCaseDslPackage.Literals.STEP__REFERENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStepAccess().getNameStepNameParserRuleCall_0_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStepAccess().getReferenceLongNameParserRuleCall_0_2_0(), semanticObject.getReference());
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
	 *     (name=StepName repeatingCondition=Condition (parent+=StepName+ repeatflow+=UseCaseStep)+)
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
	 *     (name=StepName sentence=LongName)
	 */
	protected void sequence_UseCaseStep(ISerializationContext context, SystemStep semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCaseDslPackage.Literals.STEP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCaseDslPackage.Literals.STEP__NAME));
			if (transientValues.isValueTransient(semanticObject, UseCaseDslPackage.Literals.SYSTEM_STEP__SENTENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCaseDslPackage.Literals.SYSTEM_STEP__SENTENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_1_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_1_4_0(), semanticObject.getSentence());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Step returns UserStep
	 *     UseCaseStep returns UserStep
	 *
	 * Constraint:
	 *     (name=StepName sentence=LongName)
	 */
	protected void sequence_UseCaseStep(ISerializationContext context, UserStep semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UseCaseDslPackage.Literals.STEP__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCaseDslPackage.Literals.STEP__NAME));
			if (transientValues.isValueTransient(semanticObject, UseCaseDslPackage.Literals.USER_STEP__SENTENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UseCaseDslPackage.Literals.USER_STEP__SENTENCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_0_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_0_4_0(), semanticObject.getSentence());
		feeder.finish();
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
