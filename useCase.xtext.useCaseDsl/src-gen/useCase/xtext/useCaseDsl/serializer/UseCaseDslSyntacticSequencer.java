/*
 * generated by Xtext 2.20.0
 */
package useCase.xtext.useCaseDsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import useCase.xtext.useCaseDsl.services.UseCaseDslGrammarAccess;

@SuppressWarnings("all")
public class UseCaseDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected UseCaseDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DeadEndStep___SYSTEMKeyword_2_1_or_USERKeyword_2_0_or_WHILEKeyword_2_2__q;
	protected AbstractElementAlias match_ExtensionStep___SYSTEMKeyword_0_2_1_or_USERKeyword_0_2_0_or_WHILEKeyword_0_2_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (UseCaseDslGrammarAccess) access;
		match_DeadEndStep___SYSTEMKeyword_2_1_or_USERKeyword_2_0_or_WHILEKeyword_2_2__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getDeadEndStepAccess().getWHILEKeyword_2_2()));
		match_ExtensionStep___SYSTEMKeyword_0_2_1_or_USERKeyword_0_2_0_or_WHILEKeyword_0_2_2__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_0_2_1()), new TokenAlias(false, false, grammarAccess.getExtensionStepAccess().getUSERKeyword_0_2_0()), new TokenAlias(false, false, grammarAccess.getExtensionStepAccess().getWHILEKeyword_0_2_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBEGINRule())
			return getBEGINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNLRule())
			return getNLToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal NL:
	 * 	(' ')*('\r')?('\n');
	 */
	protected String getNLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_DeadEndStep___SYSTEMKeyword_2_1_or_USERKeyword_2_0_or_WHILEKeyword_2_2__q.equals(syntax))
				emit_DeadEndStep___SYSTEMKeyword_2_1_or_USERKeyword_2_0_or_WHILEKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ExtensionStep___SYSTEMKeyword_0_2_1_or_USERKeyword_0_2_0_or_WHILEKeyword_0_2_2__q.equals(syntax))
				emit_ExtensionStep___SYSTEMKeyword_0_2_1_or_USERKeyword_0_2_0_or_WHILEKeyword_0_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('USER' | 'SYSTEM' | 'WHILE')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=INT '.' (ambiguity) 'UC' 'END' (rule end)
	 *     name=INT '.' (ambiguity) sentence=LongName
	 */
	protected void emit_DeadEndStep___SYSTEMKeyword_2_1_or_USERKeyword_2_0_or_WHILEKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('USER' | 'SYSTEM' | 'WHILE')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=INT '.' (ambiguity) sentence=LongName
	 */
	protected void emit_ExtensionStep___SYSTEMKeyword_0_2_1_or_USERKeyword_0_2_0_or_WHILEKeyword_0_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
