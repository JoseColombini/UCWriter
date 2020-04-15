/*
 * generated by Xtext 2.20.0
 */
package useCase.xtext.useCaseDsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import useCase.xtext.useCaseDsl.ide.contentassist.antlr.internal.InternalUseCaseDslParser;
import useCase.xtext.useCaseDsl.services.UseCaseDslGrammarAccess;

public class UseCaseDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(UseCaseDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, UseCaseDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExtensionAccess().getAlternatives_8(), "rule__Extension__Alternatives_8");
			builder.put(grammarAccess.getStepAccess().getAlternatives(), "rule__Step__Alternatives");
			builder.put(grammarAccess.getUseCaseStepAccess().getAlternatives(), "rule__UseCaseStep__Alternatives");
			builder.put(grammarAccess.getExtensionStepAccess().getAlternatives(), "rule__ExtensionStep__Alternatives");
			builder.put(grammarAccess.getExtensionStepAccess().getAlternatives_0_2(), "rule__ExtensionStep__Alternatives_0_2");
			builder.put(grammarAccess.getDeadEndStepAccess().getAlternatives_2(), "rule__DeadEndStep__Alternatives_2");
			builder.put(grammarAccess.getLongNameAccess().getAlternatives(), "rule__LongName__Alternatives");
			builder.put(grammarAccess.getConditionAccess().getAlternatives(), "rule__Condition__Alternatives");
			builder.put(grammarAccess.getUseCaseAccess().getGroup(), "rule__UseCase__Group__0");
			builder.put(grammarAccess.getUseCaseAccess().getGroup_11(), "rule__UseCase__Group_11__0");
			builder.put(grammarAccess.getExtensionAccess().getGroup(), "rule__Extension__Group__0");
			builder.put(grammarAccess.getExtensionAccess().getGroup_8_0(), "rule__Extension__Group_8_0__0");
			builder.put(grammarAccess.getUseCaseStepAccess().getGroup_0(), "rule__UseCaseStep__Group_0__0");
			builder.put(grammarAccess.getUseCaseStepAccess().getGroup_1(), "rule__UseCaseStep__Group_1__0");
			builder.put(grammarAccess.getUseCaseStepAccess().getGroup_2(), "rule__UseCaseStep__Group_2__0");
			builder.put(grammarAccess.getUseCaseStepAccess().getGroup_2_6(), "rule__UseCaseStep__Group_2_6__0");
			builder.put(grammarAccess.getExtensionStepAccess().getGroup_0(), "rule__ExtensionStep__Group_0__0");
			builder.put(grammarAccess.getDeadEndStepAccess().getGroup(), "rule__DeadEndStep__Group__0");
			builder.put(grammarAccess.getPreconditionAccess().getGroup(), "rule__Precondition__Group__0");
			builder.put(grammarAccess.getPostconditionAccess().getGroup(), "rule__Postcondition__Group__0");
			builder.put(grammarAccess.getUseCaseAccess().getNumberAssignment_1(), "rule__UseCase__NumberAssignment_1");
			builder.put(grammarAccess.getUseCaseAccess().getNameAssignment_3(), "rule__UseCase__NameAssignment_3");
			builder.put(grammarAccess.getUseCaseAccess().getPreconditionAssignment_4(), "rule__UseCase__PreconditionAssignment_4");
			builder.put(grammarAccess.getUseCaseAccess().getPostconditionAssignment_5(), "rule__UseCase__PostconditionAssignment_5");
			builder.put(grammarAccess.getUseCaseAccess().getMainflowAssignment_6(), "rule__UseCase__MainflowAssignment_6");
			builder.put(grammarAccess.getUseCaseAccess().getStepsAssignment_9(), "rule__UseCase__StepsAssignment_9");
			builder.put(grammarAccess.getUseCaseAccess().getDeclareofflowAssignment_11_0(), "rule__UseCase__DeclareofflowAssignment_11_0");
			builder.put(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_11_3(), "rule__UseCase__AlternativeflowsAssignment_11_3");
			builder.put(grammarAccess.getExtensionAccess().getStartFromAssignment_0(), "rule__Extension__StartFromAssignment_0");
			builder.put(grammarAccess.getExtensionAccess().getNameAssignment_2(), "rule__Extension__NameAssignment_2");
			builder.put(grammarAccess.getExtensionAccess().getConditionAssignment_5(), "rule__Extension__ConditionAssignment_5");
			builder.put(grammarAccess.getExtensionAccess().getStepsAssignment_7(), "rule__Extension__StepsAssignment_7");
			builder.put(grammarAccess.getExtensionAccess().getResumeAtAssignment_8_0_4(), "rule__Extension__ResumeAtAssignment_8_0_4");
			builder.put(grammarAccess.getExtensionAccess().getEndAssignment_8_1(), "rule__Extension__EndAssignment_8_1");
			builder.put(grammarAccess.getUseCaseStepAccess().getNameAssignment_0_1(), "rule__UseCaseStep__NameAssignment_0_1");
			builder.put(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_0_4(), "rule__UseCaseStep__SentenceAssignment_0_4");
			builder.put(grammarAccess.getUseCaseStepAccess().getNameAssignment_1_1(), "rule__UseCaseStep__NameAssignment_1_1");
			builder.put(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_1_4(), "rule__UseCaseStep__SentenceAssignment_1_4");
			builder.put(grammarAccess.getUseCaseStepAccess().getNameAssignment_2_1(), "rule__UseCaseStep__NameAssignment_2_1");
			builder.put(grammarAccess.getUseCaseStepAccess().getRepeatingConditionAssignment_2_4(), "rule__UseCaseStep__RepeatingConditionAssignment_2_4");
			builder.put(grammarAccess.getUseCaseStepAccess().getFatherAssignment_2_6_0(), "rule__UseCaseStep__FatherAssignment_2_6_0");
			builder.put(grammarAccess.getUseCaseStepAccess().getRepeatflowAssignment_2_6_2(), "rule__UseCaseStep__RepeatflowAssignment_2_6_2");
			builder.put(grammarAccess.getExtensionStepAccess().getNameAssignment_0_0(), "rule__ExtensionStep__NameAssignment_0_0");
			builder.put(grammarAccess.getExtensionStepAccess().getSentenceAssignment_0_3(), "rule__ExtensionStep__SentenceAssignment_0_3");
			builder.put(grammarAccess.getDeadEndStepAccess().getNameAssignment_0(), "rule__DeadEndStep__NameAssignment_0");
			builder.put(grammarAccess.getDeadEndStepAccess().getSentenceAssignment_3(), "rule__DeadEndStep__SentenceAssignment_3");
			builder.put(grammarAccess.getPreconditionAccess().getNameAssignment_0(), "rule__Precondition__NameAssignment_0");
			builder.put(grammarAccess.getPreconditionAccess().getConditionAssignment_2(), "rule__Precondition__ConditionAssignment_2");
			builder.put(grammarAccess.getPostconditionAccess().getNameAssignment_0(), "rule__Postcondition__NameAssignment_0");
			builder.put(grammarAccess.getPostconditionAccess().getConditionAssignment_2(), "rule__Postcondition__ConditionAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private UseCaseDslGrammarAccess grammarAccess;

	@Override
	protected InternalUseCaseDslParser createParser() {
		InternalUseCaseDslParser result = new InternalUseCaseDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new UseCaseDslTokenSource(super.createLexer(stream));
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UseCaseDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UseCaseDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
