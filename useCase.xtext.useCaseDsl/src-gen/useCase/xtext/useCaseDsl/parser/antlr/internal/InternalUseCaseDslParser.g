/*
 * generated by Xtext 2.20.0
 */
parser grammar InternalUseCaseDslParser;

options {
	tokenVocab=InternalUseCaseDslLexer;
	superClass=AbstractInternalAntlrParser;
}

@header {
package useCase.xtext.useCaseDsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import useCase.xtext.useCaseDsl.services.UseCaseDslGrammarAccess;

}

@members {

 	private UseCaseDslGrammarAccess grammarAccess;

    public InternalUseCaseDslParser(TokenStream input, UseCaseDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "UseCaseDocument";
   	}

   	@Override
   	protected UseCaseDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleUseCaseDocument
entryRuleUseCaseDocument returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUseCaseDocumentRule()); }
	iv_ruleUseCaseDocument=ruleUseCaseDocument
	{ $current=$iv_ruleUseCaseDocument.current; }
	EOF;

// Rule UseCaseDocument
ruleUseCaseDocument returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getUseCaseDocumentAccess().getUsecaseUseCaseParserRuleCall_0());
			}
			lv_usecase_0_0=ruleUseCase
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getUseCaseDocumentRule());
				}
				add(
					$current,
					"usecase",
					lv_usecase_0_0,
					"useCase.xtext.useCaseDsl.UseCaseDsl.UseCase");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleUseCase
entryRuleUseCase returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUseCaseRule()); }
	iv_ruleUseCase=ruleUseCase
	{ $current=$iv_ruleUseCase.current; }
	EOF;

// Rule UseCase
ruleUseCase returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=UC
		{
			newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUCKeyword_0());
		}
		(
			(
				lv_number_1_0=RULE_INT
				{
					newLeafNode(lv_number_1_0, grammarAccess.getUseCaseAccess().getNumberINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUseCaseRule());
					}
					setWithLastConsumed(
						$current,
						"number",
						lv_number_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_2=Colon
		{
			newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUseCaseAccess().getNameLongNameParserRuleCall_3_0());
				}
				lv_name_3_0=ruleLongName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUseCaseRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getUseCaseAccess().getPreconditionPreconditionParserRuleCall_4_0());
				}
				lv_precondition_4_0=rulePrecondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUseCaseRule());
					}
					set(
						$current,
						"precondition",
						lv_precondition_4_0,
						"useCase.xtext.useCaseDsl.UseCaseDsl.Precondition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getUseCaseAccess().getPostconditionPostconditionParserRuleCall_5_0());
				}
				lv_postcondition_5_0=rulePostcondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUseCaseRule());
					}
					set(
						$current,
						"postcondition",
						lv_postcondition_5_0,
						"useCase.xtext.useCaseDsl.UseCaseDsl.Postcondition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_6=MAIN
		{
			newLeafNode(otherlv_6, grammarAccess.getUseCaseAccess().getMAINKeyword_6());
		}
		otherlv_7=FLOW
		{
			newLeafNode(otherlv_7, grammarAccess.getUseCaseAccess().getFLOWKeyword_7());
		}
		otherlv_8=Colon
		{
			newLeafNode(otherlv_8, grammarAccess.getUseCaseAccess().getColonKeyword_8());
		}
		this_BEGIN_9=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_9, grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUseCaseAccess().getStepsUseCaseStepParserRuleCall_10_0());
				}
				lv_steps_10_0=ruleUseCaseStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUseCaseRule());
					}
					add(
						$current,
						"steps",
						lv_steps_10_0,
						"useCase.xtext.useCaseDsl.UseCaseDsl.UseCaseStep");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_END_11=RULE_END
		{
			newLeafNode(this_END_11, grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_11());
		}
		(
			(
				otherlv_12=ALTERNATIVE
				{
					newLeafNode(otherlv_12, grammarAccess.getUseCaseAccess().getALTERNATIVEKeyword_12_0_0());
				}
				otherlv_13=FLOW
				{
					newLeafNode(otherlv_13, grammarAccess.getUseCaseAccess().getFLOWKeyword_12_0_1());
				}
			)
			otherlv_14=Colon
			{
				newLeafNode(otherlv_14, grammarAccess.getUseCaseAccess().getColonKeyword_12_1());
			}
			this_BEGIN_15=RULE_BEGIN
			{
				newLeafNode(this_BEGIN_15, grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_12_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getUseCaseAccess().getAlternativeflowsExtensionParserRuleCall_12_3_0());
					}
					lv_alternativeflows_16_0=ruleExtension
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUseCaseRule());
						}
						add(
							$current,
							"alternativeflows",
							lv_alternativeflows_16_0,
							"useCase.xtext.useCaseDsl.UseCaseDsl.Extension");
						afterParserOrEnumRuleCall();
					}
				)
			)+
			this_END_17=RULE_END
			{
				newLeafNode(this_END_17, grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_12_4());
			}
		)?
	)
;

// Entry rule entryRuleExtension
entryRuleExtension returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExtensionRule()); }
	iv_ruleExtension=ruleExtension
	{ $current=$iv_ruleExtension.current; }
	EOF;

// Rule Extension
ruleExtension returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_startFrom_0_0=RULE_INT
					{
						newLeafNode(lv_startFrom_0_0, grammarAccess.getExtensionAccess().getStartFromINTTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtensionRule());
						}
						addWithLastConsumed(
							$current,
							"startFrom",
							lv_startFrom_0_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_1=FullStop
			{
				newLeafNode(otherlv_1, grammarAccess.getExtensionAccess().getFullStopKeyword_0_1());
			}
		)+
		(
			(
				lv_name_2_0=RULE_CHAR
				{
					newLeafNode(lv_name_2_0, grammarAccess.getExtensionAccess().getNameCHARTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExtensionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"useCase.xtext.useCaseDsl.UseCaseDsl.CHAR");
				}
			)
		)
		otherlv_3=FullStop
		{
			newLeafNode(otherlv_3, grammarAccess.getExtensionAccess().getFullStopKeyword_2());
		}
		otherlv_4=IF
		{
			newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getIFKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExtensionAccess().getConditionConditionParserRuleCall_4_0());
				}
				lv_condition_5_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExtensionRule());
					}
					set(
						$current,
						"condition",
						lv_condition_5_0,
						"useCase.xtext.useCaseDsl.UseCaseDsl.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_BEGIN_6=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_6, grammarAccess.getExtensionAccess().getBEGINTerminalRuleCall_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExtensionAccess().getStepsExtensionStepParserRuleCall_6_0());
				}
				lv_steps_7_0=ruleExtensionStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExtensionRule());
					}
					add(
						$current,
						"steps",
						lv_steps_7_0,
						"useCase.xtext.useCaseDsl.UseCaseDsl.ExtensionStep");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				this_INT_8=RULE_INT
				{
					newLeafNode(this_INT_8, grammarAccess.getExtensionAccess().getINTTerminalRuleCall_7_0_0());
				}
				otherlv_9=FullStop
				{
					newLeafNode(otherlv_9, grammarAccess.getExtensionAccess().getFullStopKeyword_7_0_1());
				}
				otherlv_10=RETURN
				{
					newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getRETURNKeyword_7_0_2());
				}
				otherlv_11=TO
				{
					newLeafNode(otherlv_11, grammarAccess.getExtensionAccess().getTOKeyword_7_0_3());
				}
				(
					(
						(
							lv_resumeAt_12_0=RULE_INT
							{
								newLeafNode(lv_resumeAt_12_0, grammarAccess.getExtensionAccess().getResumeAtINTTerminalRuleCall_7_0_4_0_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getExtensionRule());
								}
								addWithLastConsumed(
									$current,
									"resumeAt",
									lv_resumeAt_12_0,
									"org.eclipse.xtext.common.Terminals.INT");
							}
						)
					)
					(
						otherlv_13=FullStop
						{
							newLeafNode(otherlv_13, grammarAccess.getExtensionAccess().getFullStopKeyword_7_0_4_1());
						}
					)?
				)+
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getExtensionAccess().getEndDeadEndStepParserRuleCall_7_1_0());
					}
					lv_end_14_0=ruleDeadEndStep
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtensionRule());
						}
						set(
							$current,
							"end",
							lv_end_14_0,
							"useCase.xtext.useCaseDsl.UseCaseDsl.DeadEndStep");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		this_END_15=RULE_END
		{
			newLeafNode(this_END_15, grammarAccess.getExtensionAccess().getENDTerminalRuleCall_8());
		}
	)
;

// Entry rule entryRuleUseCaseStep
entryRuleUseCaseStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUseCaseStepRule()); }
	iv_ruleUseCaseStep=ruleUseCaseStep
	{ $current=$iv_ruleUseCaseStep.current; }
	EOF;

// Rule UseCaseStep
ruleUseCaseStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getUseCaseStepAccess().getUserStepAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_name_1_0=RULE_INT
					{
						newLeafNode(lv_name_1_0, grammarAccess.getUseCaseStepAccess().getNameINTTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUseCaseStepRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_2=FullStop
			{
				newLeafNode(otherlv_2, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_0_2());
			}
			otherlv_3=USER
			{
				newLeafNode(otherlv_3, grammarAccess.getUseCaseStepAccess().getUSERKeyword_0_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_0_4_0());
					}
					lv_sentence_4_0=ruleLongName
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
						}
						set(
							$current,
							"sentence",
							lv_sentence_4_0,
							"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getUseCaseStepAccess().getSystemStepAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_name_6_0=RULE_INT
					{
						newLeafNode(lv_name_6_0, grammarAccess.getUseCaseStepAccess().getNameINTTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUseCaseStepRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_6_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_7=FullStop
			{
				newLeafNode(otherlv_7, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_1_2());
			}
			otherlv_8=SYSTEM
			{
				newLeafNode(otherlv_8, grammarAccess.getUseCaseStepAccess().getSYSTEMKeyword_1_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_1_4_0());
					}
					lv_sentence_9_0=ruleLongName
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
						}
						set(
							$current,
							"sentence",
							lv_sentence_9_0,
							"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getUseCaseStepAccess().getRepeatingStepAction_2_0(),
						$current);
				}
			)
			(
				(
					lv_name_11_0=RULE_INT
					{
						newLeafNode(lv_name_11_0, grammarAccess.getUseCaseStepAccess().getNameINTTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUseCaseStepRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_11_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_12=FullStop
			{
				newLeafNode(otherlv_12, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_2());
			}
			otherlv_13=WHILE
			{
				newLeafNode(otherlv_13, grammarAccess.getUseCaseStepAccess().getWHILEKeyword_2_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getUseCaseStepAccess().getRepeatingConditionConditionParserRuleCall_2_4_0());
					}
					lv_repeatingCondition_14_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
						}
						set(
							$current,
							"repeatingCondition",
							lv_repeatingCondition_14_0,
							"useCase.xtext.useCaseDsl.UseCaseDsl.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_BEGIN_15=RULE_BEGIN
			{
				newLeafNode(this_BEGIN_15, grammarAccess.getUseCaseStepAccess().getBEGINTerminalRuleCall_2_5());
			}
			(
				(
					(
						(
							lv_parent_16_0=RULE_INT
							{
								newLeafNode(lv_parent_16_0, grammarAccess.getUseCaseStepAccess().getParentINTTerminalRuleCall_2_6_0_0_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getUseCaseStepRule());
								}
								addWithLastConsumed(
									$current,
									"parent",
									lv_parent_16_0,
									"org.eclipse.xtext.common.Terminals.INT");
							}
						)
					)
					otherlv_17=FullStop
					{
						newLeafNode(otherlv_17, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_6_0_1());
					}
				)+
				(
					(
						{
							newCompositeNode(grammarAccess.getUseCaseStepAccess().getRepeatflowUseCaseStepParserRuleCall_2_6_1_0());
						}
						lv_repeatflow_18_0=ruleUseCaseStep
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
							}
							add(
								$current,
								"repeatflow",
								lv_repeatflow_18_0,
								"useCase.xtext.useCaseDsl.UseCaseDsl.UseCaseStep");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)+
			this_END_19=RULE_END
			{
				newLeafNode(this_END_19, grammarAccess.getUseCaseStepAccess().getENDTerminalRuleCall_2_7());
			}
		)
	)
;

// Entry rule entryRuleExtensionStep
entryRuleExtensionStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExtensionStepRule()); }
	iv_ruleExtensionStep=ruleExtensionStep
	{ $current=$iv_ruleExtensionStep.current; }
	EOF;

// Rule ExtensionStep
ruleExtensionStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_name_0_0=RULE_INT
					{
						newLeafNode(lv_name_0_0, grammarAccess.getExtensionStepAccess().getNameINTTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getExtensionStepRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_0_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_1=FullStop
			{
				newLeafNode(otherlv_1, grammarAccess.getExtensionStepAccess().getFullStopKeyword_0_1());
			}
			(
				otherlv_2=USER
				{
					newLeafNode(otherlv_2, grammarAccess.getExtensionStepAccess().getUSERKeyword_0_2_0());
				}
				    |
				otherlv_3=SYSTEM
				{
					newLeafNode(otherlv_3, grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_0_2_1());
				}
				    |
				otherlv_4=WHILE
				{
					newLeafNode(otherlv_4, grammarAccess.getExtensionStepAccess().getWHILEKeyword_0_2_2());
				}
			)?
			(
				(
					{
						newCompositeNode(grammarAccess.getExtensionStepAccess().getSentenceLongNameParserRuleCall_0_3_0());
					}
					lv_sentence_5_0=ruleLongName
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExtensionStepRule());
						}
						set(
							$current,
							"sentence",
							lv_sentence_5_0,
							"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getExtensionStepAccess().getDeadEndStepParserRuleCall_1());
		}
		this_DeadEndStep_6=ruleDeadEndStep
		{
			$current = $this_DeadEndStep_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDeadEndStep
entryRuleDeadEndStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeadEndStepRule()); }
	iv_ruleDeadEndStep=ruleDeadEndStep
	{ $current=$iv_ruleDeadEndStep.current; }
	EOF;

// Rule DeadEndStep
ruleDeadEndStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_INT
				{
					newLeafNode(lv_name_0_0, grammarAccess.getDeadEndStepAccess().getNameINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeadEndStepRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_1=FullStop
		{
			newLeafNode(otherlv_1, grammarAccess.getDeadEndStepAccess().getFullStopKeyword_1());
		}
		(
			otherlv_2=USER
			{
				newLeafNode(otherlv_2, grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0());
			}
			    |
			otherlv_3=SYSTEM
			{
				newLeafNode(otherlv_3, grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1());
			}
			    |
			otherlv_4=WHILE
			{
				newLeafNode(otherlv_4, grammarAccess.getDeadEndStepAccess().getWHILEKeyword_2_2());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getDeadEndStepAccess().getSentenceLongNameParserRuleCall_3_0());
				}
				lv_sentence_5_0=ruleLongName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeadEndStepRule());
					}
					set(
						$current,
						"sentence",
						lv_sentence_5_0,
						"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_6=UC
		{
			newLeafNode(otherlv_6, grammarAccess.getDeadEndStepAccess().getUCKeyword_4());
		}
		otherlv_7=END
		{
			newLeafNode(otherlv_7, grammarAccess.getDeadEndStepAccess().getENDKeyword_5());
		}
	)
;

// Entry rule entryRulePrecondition
entryRulePrecondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPreconditionRule()); }
	iv_rulePrecondition=rulePrecondition
	{ $current=$iv_rulePrecondition.current; }
	EOF;

// Rule Precondition
rulePrecondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=PRECONDITION
				{
					newLeafNode(lv_name_0_0, grammarAccess.getPreconditionAccess().getNamePRECONDITIONKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPreconditionRule());
					}
					setWithLastConsumed($current, "name", lv_name_0_0, "PRECONDITION");
				}
			)
		)
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getPreconditionAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPreconditionAccess().getConditionConditionParserRuleCall_2_0());
				}
				lv_condition_2_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPreconditionRule());
					}
					set(
						$current,
						"condition",
						lv_condition_2_0,
						"useCase.xtext.useCaseDsl.UseCaseDsl.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePostcondition
entryRulePostcondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPostconditionRule()); }
	iv_rulePostcondition=rulePostcondition
	{ $current=$iv_rulePostcondition.current; }
	EOF;

// Rule Postcondition
rulePostcondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=POSTCONDITION
				{
					newLeafNode(lv_name_0_0, grammarAccess.getPostconditionAccess().getNamePOSTCONDITIONKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPostconditionRule());
					}
					setWithLastConsumed($current, "name", lv_name_0_0, "POSTCONDITION");
				}
			)
		)
		otherlv_1=Colon
		{
			newLeafNode(otherlv_1, grammarAccess.getPostconditionAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPostconditionAccess().getConditionConditionParserRuleCall_2_0());
				}
				lv_condition_2_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPostconditionRule());
					}
					set(
						$current,
						"condition",
						lv_condition_2_0,
						"useCase.xtext.useCaseDsl.UseCaseDsl.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLongName
entryRuleLongName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLongNameRule()); }
	iv_ruleLongName=ruleLongName
	{ $current=$iv_ruleLongName.current.getText(); }
	EOF;

// Rule LongName
ruleLongName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0());
		}
		    |
		this_ANY_OTHER_1=RULE_ANY_OTHER
		{
			$current.merge(this_ANY_OTHER_1);
		}
		{
			newLeafNode(this_ANY_OTHER_1, grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1());
		}
		    |
		this_CHAR_2=RULE_CHAR
		{
			$current.merge(this_CHAR_2);
		}
		{
			newLeafNode(this_CHAR_2, grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2());
		}
		    |
		kw=Colon
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLongNameAccess().getColonKeyword_3());
		}
		    |
		kw=FullStop
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLongNameAccess().getFullStopKeyword_4());
		}
		    |
		kw=QuotationMark
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5());
		}
		    |
		kw=Apostrophe
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLongNameAccess().getApostropheKeyword_6());
		}
	)+
;

// Entry rule entryRuleCondition
entryRuleCondition returns [String current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current.getText(); }
	EOF;

// Rule Condition
ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getConditionAccess().getIDTerminalRuleCall_0());
		}
		    |
		this_ANY_OTHER_1=RULE_ANY_OTHER
		{
			$current.merge(this_ANY_OTHER_1);
		}
		{
			newLeafNode(this_ANY_OTHER_1, grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1());
		}
		    |
		this_CHAR_2=RULE_CHAR
		{
			$current.merge(this_CHAR_2);
		}
		{
			newLeafNode(this_CHAR_2, grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2());
		}
		    |
		kw=Colon
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConditionAccess().getColonKeyword_3());
		}
		    |
		kw=FullStop
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConditionAccess().getFullStopKeyword_4());
		}
		    |
		kw=QuotationMark
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConditionAccess().getQuotationMarkKeyword_5());
		}
		    |
		kw=Apostrophe
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConditionAccess().getApostropheKeyword_6());
		}
		    |
		kw=AND
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConditionAccess().getANDKeyword_7());
		}
		    |
		kw=OR
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getConditionAccess().getORKeyword_8());
		}
	)+
;
