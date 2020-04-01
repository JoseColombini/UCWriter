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
    	return "UseCase";
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
					add(
						$current,
						"name",
						lv_name_3_0,
						"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			(
				{
					newCompositeNode(grammarAccess.getUseCaseAccess().getMainflowMainFlowParserRuleCall_4_0());
				}
				lv_mainflow_4_0=ruleMainFlow
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUseCaseRule());
					}
					set(
						$current,
						"mainflow",
						lv_mainflow_4_0,
						"useCase.xtext.useCaseDsl.UseCaseDsl.MainFlow");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMainFlow
entryRuleMainFlow returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMainFlowRule()); }
	iv_ruleMainFlow=ruleMainFlow
	{ $current=$iv_ruleMainFlow.current; }
	EOF;

// Rule MainFlow
ruleMainFlow returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMainFlowAccess().getMainFlowAction_0(),
					$current);
			}
		)
		otherlv_1=MainFlow
		{
			newLeafNode(otherlv_1, grammarAccess.getMainFlowAccess().getMainFlowKeyword_1());
		}
		otherlv_2=Colon
		{
			newLeafNode(otherlv_2, grammarAccess.getMainFlowAccess().getColonKeyword_2());
		}
		this_BEGIN_3=RULE_BEGIN
		{
			newLeafNode(this_BEGIN_3, grammarAccess.getMainFlowAccess().getBEGINTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMainFlowAccess().getStepsStepParserRuleCall_4_0());
				}
				lv_steps_4_0=ruleStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMainFlowRule());
					}
					add(
						$current,
						"steps",
						lv_steps_4_0,
						"useCase.xtext.useCaseDsl.UseCaseDsl.Step");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_END_5=RULE_END
		{
			newLeafNode(this_END_5, grammarAccess.getMainFlowAccess().getENDTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleStep
entryRuleStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStepRule()); }
	iv_ruleStep=ruleStep
	{ $current=$iv_ruleStep.current; }
	EOF;

// Rule Step
ruleStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStepAccess().getStepAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_INT
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStepAccess().getNameINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStepRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getStepAccess().getTypeUserStepParserRuleCall_2_0_0());
					}
					lv_type_2_1=ruleUserStep
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStepRule());
						}
						set(
							$current,
							"type",
							lv_type_2_1,
							"useCase.xtext.useCaseDsl.UseCaseDsl.UserStep");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getStepAccess().getTypeSystemStepParserRuleCall_2_0_1());
					}
					lv_type_2_2=ruleSystemStep
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStepRule());
						}
						set(
							$current,
							"type",
							lv_type_2_2,
							"useCase.xtext.useCaseDsl.UseCaseDsl.SystemStep");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStepAccess().getSentenceLongNameParserRuleCall_3_0());
				}
				lv_sentence_3_0=ruleLongName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStepRule());
					}
					add(
						$current,
						"sentence",
						lv_sentence_3_0,
						"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleUserStep
entryRuleUserStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUserStepRule()); }
	iv_ruleUserStep=ruleUserStep
	{ $current=$iv_ruleUserStep.current; }
	EOF;

// Rule UserStep
ruleUserStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getUserStepAccess().getUserStepAction_0(),
					$current);
			}
		)
		otherlv_1=FullStop
		{
			newLeafNode(otherlv_1, grammarAccess.getUserStepAccess().getFullStopKeyword_1());
		}
		otherlv_2=User
		{
			newLeafNode(otherlv_2, grammarAccess.getUserStepAccess().getUserKeyword_2());
		}
	)
;

// Entry rule entryRuleSystemStep
entryRuleSystemStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSystemStepRule()); }
	iv_ruleSystemStep=ruleSystemStep
	{ $current=$iv_ruleSystemStep.current; }
	EOF;

// Rule SystemStep
ruleSystemStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSystemStepAccess().getSystemStepAction_0(),
					$current);
			}
		)
		otherlv_1=FullStop
		{
			newLeafNode(otherlv_1, grammarAccess.getSystemStepAccess().getFullStopKeyword_1());
		}
		otherlv_2=KW_System
		{
			newLeafNode(otherlv_2, grammarAccess.getSystemStepAccess().getSystemKeyword_2());
		}
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
		(
			this_ID_0=RULE_ID
			{
				$current.merge(this_ID_0);
			}
			{
				newLeafNode(this_ID_0, grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0_0());
			}
			    |
			this_ANY_OTHER_1=RULE_ANY_OTHER
			{
				$current.merge(this_ANY_OTHER_1);
			}
			{
				newLeafNode(this_ANY_OTHER_1, grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_0_1());
			}
			    |
			this_CHAR_2=RULE_CHAR
			{
				$current.merge(this_CHAR_2);
			}
			{
				newLeafNode(this_CHAR_2, grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_0_2());
			}
			    |
			kw=Colon
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getLongNameAccess().getColonKeyword_0_3());
			}
			    |
			kw=FullStop
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getLongNameAccess().getFullStopKeyword_0_4());
			}
		)
		(
			this_WS_5=RULE_WS
			{
				$current.merge(this_WS_5);
			}
			{
				newLeafNode(this_WS_5, grammarAccess.getLongNameAccess().getWSTerminalRuleCall_1());
			}
		)?
	)
;
