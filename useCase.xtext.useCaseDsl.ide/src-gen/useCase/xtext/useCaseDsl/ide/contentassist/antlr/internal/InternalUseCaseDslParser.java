package useCase.xtext.useCaseDsl.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import useCase.xtext.useCaseDsl.services.UseCaseDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALTERNATIVEFLOW", "POSTCONDITION", "PRECONDITION", "MAINFLOW", "RETURN", "SYSTEM", "WHILE", "USER", "AND", "END", "IF", "OR", "TO", "UC", "QuotationMark", "Apostrophe", "FullStop", "Colon", "RULE_CHAR", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int SYSTEM=9;
    public static final int RULE_END=24;
    public static final int RULE_BEGIN=23;
    public static final int PRECONDITION=6;
    public static final int MAINFLOW=7;
    public static final int RULE_STRING=27;
    public static final int UC=17;
    public static final int QuotationMark=18;
    public static final int RULE_SL_COMMENT=29;
    public static final int RETURN=8;
    public static final int RULE_CHAR=22;
    public static final int Colon=21;
    public static final int ALTERNATIVEFLOW=4;
    public static final int EOF=-1;
    public static final int IF=14;
    public static final int Apostrophe=19;
    public static final int POSTCONDITION=5;
    public static final int FullStop=20;
    public static final int OR=15;
    public static final int RULE_ID=25;
    public static final int RULE_WS=30;
    public static final int RULE_ANY_OTHER=31;
    public static final int USER=11;
    public static final int RULE_INT=26;
    public static final int AND=12;
    public static final int RULE_ML_COMMENT=28;
    public static final int WHILE=10;
    public static final int END=13;
    public static final int TO=16;

    // delegates
    // delegators


        public InternalUseCaseDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUseCaseDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUseCaseDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUseCaseDslParser.g"; }


    	private UseCaseDslGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("QuotationMark", "'\"'");
    		tokenNameToValue.put("Apostrophe", "'\''");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("IF", "'IF'");
    		tokenNameToValue.put("OR", "'OR'");
    		tokenNameToValue.put("TO", "'TO'");
    		tokenNameToValue.put("UC", "'UC'");
    		tokenNameToValue.put("AND", "'AND'");
    		tokenNameToValue.put("END", "'END'");
    		tokenNameToValue.put("USER", "'USER'");
    		tokenNameToValue.put("WHILE", "'WHILE'");
    		tokenNameToValue.put("RETURN", "'RETURN'");
    		tokenNameToValue.put("SYSTEM", "'SYSTEM'");
    		tokenNameToValue.put("MAINFLOW", "'MAINFLOW'");
    		tokenNameToValue.put("PRECONDITION", "'PRECONDITION'");
    		tokenNameToValue.put("POSTCONDITION", "'POSTCONDITION'");
    		tokenNameToValue.put("ALTERNATIVEFLOW", "'ALTERNATIVEFLOW'");
    	}

    	public void setGrammarAccess(UseCaseDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleUseCase"
    // InternalUseCaseDslParser.g:73:1: entryRuleUseCase : ruleUseCase EOF ;
    public final void entryRuleUseCase() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:74:1: ( ruleUseCase EOF )
            // InternalUseCaseDslParser.g:75:1: ruleUseCase EOF
            {
             before(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleUseCase();

            state._fsp--;

             after(grammarAccess.getUseCaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // InternalUseCaseDslParser.g:82:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
    public final void ruleUseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:86:2: ( ( ( rule__UseCase__Group__0 ) ) )
            // InternalUseCaseDslParser.g:87:2: ( ( rule__UseCase__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:87:2: ( ( rule__UseCase__Group__0 ) )
            // InternalUseCaseDslParser.g:88:3: ( rule__UseCase__Group__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup()); 
            // InternalUseCaseDslParser.g:89:3: ( rule__UseCase__Group__0 )
            // InternalUseCaseDslParser.g:89:4: rule__UseCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleExtension"
    // InternalUseCaseDslParser.g:98:1: entryRuleExtension : ruleExtension EOF ;
    public final void entryRuleExtension() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:99:1: ( ruleExtension EOF )
            // InternalUseCaseDslParser.g:100:1: ruleExtension EOF
            {
             before(grammarAccess.getExtensionRule()); 
            pushFollow(FOLLOW_1);
            ruleExtension();

            state._fsp--;

             after(grammarAccess.getExtensionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // InternalUseCaseDslParser.g:107:1: ruleExtension : ( ( rule__Extension__Group__0 ) ) ;
    public final void ruleExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:111:2: ( ( ( rule__Extension__Group__0 ) ) )
            // InternalUseCaseDslParser.g:112:2: ( ( rule__Extension__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:112:2: ( ( rule__Extension__Group__0 ) )
            // InternalUseCaseDslParser.g:113:3: ( rule__Extension__Group__0 )
            {
             before(grammarAccess.getExtensionAccess().getGroup()); 
            // InternalUseCaseDslParser.g:114:3: ( rule__Extension__Group__0 )
            // InternalUseCaseDslParser.g:114:4: rule__Extension__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleUseCaseStep"
    // InternalUseCaseDslParser.g:123:1: entryRuleUseCaseStep : ruleUseCaseStep EOF ;
    public final void entryRuleUseCaseStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:124:1: ( ruleUseCaseStep EOF )
            // InternalUseCaseDslParser.g:125:1: ruleUseCaseStep EOF
            {
             before(grammarAccess.getUseCaseStepRule()); 
            pushFollow(FOLLOW_1);
            ruleUseCaseStep();

            state._fsp--;

             after(grammarAccess.getUseCaseStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUseCaseStep"


    // $ANTLR start "ruleUseCaseStep"
    // InternalUseCaseDslParser.g:132:1: ruleUseCaseStep : ( ( rule__UseCaseStep__Alternatives ) ) ;
    public final void ruleUseCaseStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:136:2: ( ( ( rule__UseCaseStep__Alternatives ) ) )
            // InternalUseCaseDslParser.g:137:2: ( ( rule__UseCaseStep__Alternatives ) )
            {
            // InternalUseCaseDslParser.g:137:2: ( ( rule__UseCaseStep__Alternatives ) )
            // InternalUseCaseDslParser.g:138:3: ( rule__UseCaseStep__Alternatives )
            {
             before(grammarAccess.getUseCaseStepAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:139:3: ( rule__UseCaseStep__Alternatives )
            // InternalUseCaseDslParser.g:139:4: rule__UseCaseStep__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseCaseStep"


    // $ANTLR start "entryRuleExtensionStep"
    // InternalUseCaseDslParser.g:148:1: entryRuleExtensionStep : ruleExtensionStep EOF ;
    public final void entryRuleExtensionStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:149:1: ( ruleExtensionStep EOF )
            // InternalUseCaseDslParser.g:150:1: ruleExtensionStep EOF
            {
             before(grammarAccess.getExtensionStepRule()); 
            pushFollow(FOLLOW_1);
            ruleExtensionStep();

            state._fsp--;

             after(grammarAccess.getExtensionStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtensionStep"


    // $ANTLR start "ruleExtensionStep"
    // InternalUseCaseDslParser.g:157:1: ruleExtensionStep : ( ( rule__ExtensionStep__Alternatives ) ) ;
    public final void ruleExtensionStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:161:2: ( ( ( rule__ExtensionStep__Alternatives ) ) )
            // InternalUseCaseDslParser.g:162:2: ( ( rule__ExtensionStep__Alternatives ) )
            {
            // InternalUseCaseDslParser.g:162:2: ( ( rule__ExtensionStep__Alternatives ) )
            // InternalUseCaseDslParser.g:163:3: ( rule__ExtensionStep__Alternatives )
            {
             before(grammarAccess.getExtensionStepAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:164:3: ( rule__ExtensionStep__Alternatives )
            // InternalUseCaseDslParser.g:164:4: rule__ExtensionStep__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExtensionStepAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtensionStep"


    // $ANTLR start "entryRuleDeadEndStep"
    // InternalUseCaseDslParser.g:173:1: entryRuleDeadEndStep : ruleDeadEndStep EOF ;
    public final void entryRuleDeadEndStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:174:1: ( ruleDeadEndStep EOF )
            // InternalUseCaseDslParser.g:175:1: ruleDeadEndStep EOF
            {
             before(grammarAccess.getDeadEndStepRule()); 
            pushFollow(FOLLOW_1);
            ruleDeadEndStep();

            state._fsp--;

             after(grammarAccess.getDeadEndStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeadEndStep"


    // $ANTLR start "ruleDeadEndStep"
    // InternalUseCaseDslParser.g:182:1: ruleDeadEndStep : ( ( rule__DeadEndStep__Group__0 ) ) ;
    public final void ruleDeadEndStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:186:2: ( ( ( rule__DeadEndStep__Group__0 ) ) )
            // InternalUseCaseDslParser.g:187:2: ( ( rule__DeadEndStep__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:187:2: ( ( rule__DeadEndStep__Group__0 ) )
            // InternalUseCaseDslParser.g:188:3: ( rule__DeadEndStep__Group__0 )
            {
             before(grammarAccess.getDeadEndStepAccess().getGroup()); 
            // InternalUseCaseDslParser.g:189:3: ( rule__DeadEndStep__Group__0 )
            // InternalUseCaseDslParser.g:189:4: rule__DeadEndStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeadEndStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeadEndStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeadEndStep"


    // $ANTLR start "entryRulePrecondition"
    // InternalUseCaseDslParser.g:198:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:199:1: ( rulePrecondition EOF )
            // InternalUseCaseDslParser.g:200:1: rulePrecondition EOF
            {
             before(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_1);
            rulePrecondition();

            state._fsp--;

             after(grammarAccess.getPreconditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalUseCaseDslParser.g:207:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:211:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // InternalUseCaseDslParser.g:212:2: ( ( rule__Precondition__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:212:2: ( ( rule__Precondition__Group__0 ) )
            // InternalUseCaseDslParser.g:213:3: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // InternalUseCaseDslParser.g:214:3: ( rule__Precondition__Group__0 )
            // InternalUseCaseDslParser.g:214:4: rule__Precondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRulePostcondition"
    // InternalUseCaseDslParser.g:223:1: entryRulePostcondition : rulePostcondition EOF ;
    public final void entryRulePostcondition() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:224:1: ( rulePostcondition EOF )
            // InternalUseCaseDslParser.g:225:1: rulePostcondition EOF
            {
             before(grammarAccess.getPostconditionRule()); 
            pushFollow(FOLLOW_1);
            rulePostcondition();

            state._fsp--;

             after(grammarAccess.getPostconditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePostcondition"


    // $ANTLR start "rulePostcondition"
    // InternalUseCaseDslParser.g:232:1: rulePostcondition : ( ( rule__Postcondition__Group__0 ) ) ;
    public final void rulePostcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:236:2: ( ( ( rule__Postcondition__Group__0 ) ) )
            // InternalUseCaseDslParser.g:237:2: ( ( rule__Postcondition__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:237:2: ( ( rule__Postcondition__Group__0 ) )
            // InternalUseCaseDslParser.g:238:3: ( rule__Postcondition__Group__0 )
            {
             before(grammarAccess.getPostconditionAccess().getGroup()); 
            // InternalUseCaseDslParser.g:239:3: ( rule__Postcondition__Group__0 )
            // InternalUseCaseDslParser.g:239:4: rule__Postcondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPostconditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePostcondition"


    // $ANTLR start "entryRuleLongName"
    // InternalUseCaseDslParser.g:248:1: entryRuleLongName : ruleLongName EOF ;
    public final void entryRuleLongName() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:249:1: ( ruleLongName EOF )
            // InternalUseCaseDslParser.g:250:1: ruleLongName EOF
            {
             before(grammarAccess.getLongNameRule()); 
            pushFollow(FOLLOW_1);
            ruleLongName();

            state._fsp--;

             after(grammarAccess.getLongNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLongName"


    // $ANTLR start "ruleLongName"
    // InternalUseCaseDslParser.g:257:1: ruleLongName : ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) ) ;
    public final void ruleLongName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:261:2: ( ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) ) )
            // InternalUseCaseDslParser.g:262:2: ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) )
            {
            // InternalUseCaseDslParser.g:262:2: ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) )
            // InternalUseCaseDslParser.g:263:3: ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* )
            {
            // InternalUseCaseDslParser.g:263:3: ( ( rule__LongName__Alternatives ) )
            // InternalUseCaseDslParser.g:264:4: ( rule__LongName__Alternatives )
            {
             before(grammarAccess.getLongNameAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:265:4: ( rule__LongName__Alternatives )
            // InternalUseCaseDslParser.g:265:5: rule__LongName__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__LongName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLongNameAccess().getAlternatives()); 

            }

            // InternalUseCaseDslParser.g:268:3: ( ( rule__LongName__Alternatives )* )
            // InternalUseCaseDslParser.g:269:4: ( rule__LongName__Alternatives )*
            {
             before(grammarAccess.getLongNameAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:270:4: ( rule__LongName__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=QuotationMark && LA1_0<=RULE_CHAR)||LA1_0==RULE_ID||LA1_0==RULE_ANY_OTHER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:270:5: rule__LongName__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__LongName__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLongNameAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLongName"


    // $ANTLR start "entryRuleCondition"
    // InternalUseCaseDslParser.g:280:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:281:1: ( ruleCondition EOF )
            // InternalUseCaseDslParser.g:282:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalUseCaseDslParser.g:289:1: ruleCondition : ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:293:2: ( ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) ) )
            // InternalUseCaseDslParser.g:294:2: ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) )
            {
            // InternalUseCaseDslParser.g:294:2: ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) )
            // InternalUseCaseDslParser.g:295:3: ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* )
            {
            // InternalUseCaseDslParser.g:295:3: ( ( rule__Condition__Alternatives ) )
            // InternalUseCaseDslParser.g:296:4: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:297:4: ( rule__Condition__Alternatives )
            // InternalUseCaseDslParser.g:297:5: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_4);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }

            // InternalUseCaseDslParser.g:300:3: ( ( rule__Condition__Alternatives )* )
            // InternalUseCaseDslParser.g:301:4: ( rule__Condition__Alternatives )*
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:302:4: ( rule__Condition__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==AND||LA2_0==OR||(LA2_0>=QuotationMark && LA2_0<=RULE_CHAR)||LA2_0==RULE_ID||LA2_0==RULE_ANY_OTHER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:302:5: rule__Condition__Alternatives
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Condition__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "rule__Extension__Alternatives_8"
    // InternalUseCaseDslParser.g:311:1: rule__Extension__Alternatives_8 : ( ( ( rule__Extension__Group_8_0__0 ) ) | ( ( rule__Extension__EndAssignment_8_1 ) ) );
    public final void rule__Extension__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:315:1: ( ( ( rule__Extension__Group_8_0__0 ) ) | ( ( rule__Extension__EndAssignment_8_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==FullStop) ) {
                    int LA3_2 = input.LA(3);

                    if ( ((LA3_2>=SYSTEM && LA3_2<=USER)||(LA3_2>=UC && LA3_2<=RULE_CHAR)||LA3_2==RULE_ID||LA3_2==RULE_ANY_OTHER) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==RETURN) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUseCaseDslParser.g:316:2: ( ( rule__Extension__Group_8_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:316:2: ( ( rule__Extension__Group_8_0__0 ) )
                    // InternalUseCaseDslParser.g:317:3: ( rule__Extension__Group_8_0__0 )
                    {
                     before(grammarAccess.getExtensionAccess().getGroup_8_0()); 
                    // InternalUseCaseDslParser.g:318:3: ( rule__Extension__Group_8_0__0 )
                    // InternalUseCaseDslParser.g:318:4: rule__Extension__Group_8_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extension__Group_8_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtensionAccess().getGroup_8_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:322:2: ( ( rule__Extension__EndAssignment_8_1 ) )
                    {
                    // InternalUseCaseDslParser.g:322:2: ( ( rule__Extension__EndAssignment_8_1 ) )
                    // InternalUseCaseDslParser.g:323:3: ( rule__Extension__EndAssignment_8_1 )
                    {
                     before(grammarAccess.getExtensionAccess().getEndAssignment_8_1()); 
                    // InternalUseCaseDslParser.g:324:3: ( rule__Extension__EndAssignment_8_1 )
                    // InternalUseCaseDslParser.g:324:4: rule__Extension__EndAssignment_8_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extension__EndAssignment_8_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtensionAccess().getEndAssignment_8_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Alternatives_8"


    // $ANTLR start "rule__UseCaseStep__Alternatives"
    // InternalUseCaseDslParser.g:332:1: rule__UseCaseStep__Alternatives : ( ( ( rule__UseCaseStep__Group_0__0 ) ) | ( ( rule__UseCaseStep__Group_1__0 ) ) | ( ( rule__UseCaseStep__Group_2__0 ) ) );
    public final void rule__UseCaseStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:336:1: ( ( ( rule__UseCaseStep__Group_0__0 ) ) | ( ( rule__UseCaseStep__Group_1__0 ) ) | ( ( rule__UseCaseStep__Group_2__0 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==FullStop) ) {
                    switch ( input.LA(3) ) {
                    case USER:
                        {
                        alt4=1;
                        }
                        break;
                    case SYSTEM:
                        {
                        alt4=2;
                        }
                        break;
                    case WHILE:
                        {
                        alt4=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUseCaseDslParser.g:337:2: ( ( rule__UseCaseStep__Group_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:337:2: ( ( rule__UseCaseStep__Group_0__0 ) )
                    // InternalUseCaseDslParser.g:338:3: ( rule__UseCaseStep__Group_0__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_0()); 
                    // InternalUseCaseDslParser.g:339:3: ( rule__UseCaseStep__Group_0__0 )
                    // InternalUseCaseDslParser.g:339:4: rule__UseCaseStep__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCaseStep__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUseCaseStepAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:343:2: ( ( rule__UseCaseStep__Group_1__0 ) )
                    {
                    // InternalUseCaseDslParser.g:343:2: ( ( rule__UseCaseStep__Group_1__0 ) )
                    // InternalUseCaseDslParser.g:344:3: ( rule__UseCaseStep__Group_1__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_1()); 
                    // InternalUseCaseDslParser.g:345:3: ( rule__UseCaseStep__Group_1__0 )
                    // InternalUseCaseDslParser.g:345:4: rule__UseCaseStep__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCaseStep__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUseCaseStepAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:349:2: ( ( rule__UseCaseStep__Group_2__0 ) )
                    {
                    // InternalUseCaseDslParser.g:349:2: ( ( rule__UseCaseStep__Group_2__0 ) )
                    // InternalUseCaseDslParser.g:350:3: ( rule__UseCaseStep__Group_2__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_2()); 
                    // InternalUseCaseDslParser.g:351:3: ( rule__UseCaseStep__Group_2__0 )
                    // InternalUseCaseDslParser.g:351:4: rule__UseCaseStep__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCaseStep__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUseCaseStepAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Alternatives"


    // $ANTLR start "rule__ExtensionStep__Alternatives"
    // InternalUseCaseDslParser.g:359:1: rule__ExtensionStep__Alternatives : ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ruleDeadEndStep ) );
    public final void rule__ExtensionStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:363:1: ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ruleDeadEndStep ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalUseCaseDslParser.g:364:2: ( ( rule__ExtensionStep__Group_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:364:2: ( ( rule__ExtensionStep__Group_0__0 ) )
                    // InternalUseCaseDslParser.g:365:3: ( rule__ExtensionStep__Group_0__0 )
                    {
                     before(grammarAccess.getExtensionStepAccess().getGroup_0()); 
                    // InternalUseCaseDslParser.g:366:3: ( rule__ExtensionStep__Group_0__0 )
                    // InternalUseCaseDslParser.g:366:4: rule__ExtensionStep__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtensionStep__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtensionStepAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:370:2: ( ruleDeadEndStep )
                    {
                    // InternalUseCaseDslParser.g:370:2: ( ruleDeadEndStep )
                    // InternalUseCaseDslParser.g:371:3: ruleDeadEndStep
                    {
                     before(grammarAccess.getExtensionStepAccess().getDeadEndStepParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDeadEndStep();

                    state._fsp--;

                     after(grammarAccess.getExtensionStepAccess().getDeadEndStepParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Alternatives"


    // $ANTLR start "rule__ExtensionStep__Alternatives_0_2"
    // InternalUseCaseDslParser.g:380:1: rule__ExtensionStep__Alternatives_0_2 : ( ( USER ) | ( SYSTEM ) | ( WHILE ) );
    public final void rule__ExtensionStep__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:384:1: ( ( USER ) | ( SYSTEM ) | ( WHILE ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case USER:
                {
                alt6=1;
                }
                break;
            case SYSTEM:
                {
                alt6=2;
                }
                break;
            case WHILE:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalUseCaseDslParser.g:385:2: ( USER )
                    {
                    // InternalUseCaseDslParser.g:385:2: ( USER )
                    // InternalUseCaseDslParser.g:386:3: USER
                    {
                     before(grammarAccess.getExtensionStepAccess().getUSERKeyword_0_2_0()); 
                    match(input,USER,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getUSERKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:391:2: ( SYSTEM )
                    {
                    // InternalUseCaseDslParser.g:391:2: ( SYSTEM )
                    // InternalUseCaseDslParser.g:392:3: SYSTEM
                    {
                     before(grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_0_2_1()); 
                    match(input,SYSTEM,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_0_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:397:2: ( WHILE )
                    {
                    // InternalUseCaseDslParser.g:397:2: ( WHILE )
                    // InternalUseCaseDslParser.g:398:3: WHILE
                    {
                     before(grammarAccess.getExtensionStepAccess().getWHILEKeyword_0_2_2()); 
                    match(input,WHILE,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getWHILEKeyword_0_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Alternatives_0_2"


    // $ANTLR start "rule__DeadEndStep__Alternatives_2"
    // InternalUseCaseDslParser.g:407:1: rule__DeadEndStep__Alternatives_2 : ( ( USER ) | ( SYSTEM ) | ( WHILE ) );
    public final void rule__DeadEndStep__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:411:1: ( ( USER ) | ( SYSTEM ) | ( WHILE ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case USER:
                {
                alt7=1;
                }
                break;
            case SYSTEM:
                {
                alt7=2;
                }
                break;
            case WHILE:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalUseCaseDslParser.g:412:2: ( USER )
                    {
                    // InternalUseCaseDslParser.g:412:2: ( USER )
                    // InternalUseCaseDslParser.g:413:3: USER
                    {
                     before(grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0()); 
                    match(input,USER,FOLLOW_2); 
                     after(grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:418:2: ( SYSTEM )
                    {
                    // InternalUseCaseDslParser.g:418:2: ( SYSTEM )
                    // InternalUseCaseDslParser.g:419:3: SYSTEM
                    {
                     before(grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1()); 
                    match(input,SYSTEM,FOLLOW_2); 
                     after(grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:424:2: ( WHILE )
                    {
                    // InternalUseCaseDslParser.g:424:2: ( WHILE )
                    // InternalUseCaseDslParser.g:425:3: WHILE
                    {
                     before(grammarAccess.getDeadEndStepAccess().getWHILEKeyword_2_2()); 
                    match(input,WHILE,FOLLOW_2); 
                     after(grammarAccess.getDeadEndStepAccess().getWHILEKeyword_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeadEndStep__Alternatives_2"


    // $ANTLR start "rule__LongName__Alternatives"
    // InternalUseCaseDslParser.g:434:1: rule__LongName__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) );
    public final void rule__LongName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:438:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt8=2;
                }
                break;
            case RULE_CHAR:
                {
                alt8=3;
                }
                break;
            case Colon:
                {
                alt8=4;
                }
                break;
            case FullStop:
                {
                alt8=5;
                }
                break;
            case QuotationMark:
                {
                alt8=6;
                }
                break;
            case Apostrophe:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalUseCaseDslParser.g:439:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:439:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:440:3: RULE_ID
                    {
                     before(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:445:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:445:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:446:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:451:2: ( RULE_CHAR )
                    {
                    // InternalUseCaseDslParser.g:451:2: ( RULE_CHAR )
                    // InternalUseCaseDslParser.g:452:3: RULE_CHAR
                    {
                     before(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2()); 
                    match(input,RULE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:457:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:457:2: ( Colon )
                    // InternalUseCaseDslParser.g:458:3: Colon
                    {
                     before(grammarAccess.getLongNameAccess().getColonKeyword_3()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:463:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:463:2: ( FullStop )
                    // InternalUseCaseDslParser.g:464:3: FullStop
                    {
                     before(grammarAccess.getLongNameAccess().getFullStopKeyword_4()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUseCaseDslParser.g:469:2: ( QuotationMark )
                    {
                    // InternalUseCaseDslParser.g:469:2: ( QuotationMark )
                    // InternalUseCaseDslParser.g:470:3: QuotationMark
                    {
                     before(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5()); 
                    match(input,QuotationMark,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUseCaseDslParser.g:475:2: ( Apostrophe )
                    {
                    // InternalUseCaseDslParser.g:475:2: ( Apostrophe )
                    // InternalUseCaseDslParser.g:476:3: Apostrophe
                    {
                     before(grammarAccess.getLongNameAccess().getApostropheKeyword_6()); 
                    match(input,Apostrophe,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getApostropheKeyword_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongName__Alternatives"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalUseCaseDslParser.g:485:1: rule__Condition__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) | ( AND ) | ( OR ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:489:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) | ( AND ) | ( OR ) )
            int alt9=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt9=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt9=2;
                }
                break;
            case RULE_CHAR:
                {
                alt9=3;
                }
                break;
            case Colon:
                {
                alt9=4;
                }
                break;
            case FullStop:
                {
                alt9=5;
                }
                break;
            case QuotationMark:
                {
                alt9=6;
                }
                break;
            case Apostrophe:
                {
                alt9=7;
                }
                break;
            case AND:
                {
                alt9=8;
                }
                break;
            case OR:
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalUseCaseDslParser.g:490:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:490:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:491:3: RULE_ID
                    {
                     before(grammarAccess.getConditionAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:496:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:496:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:497:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:502:2: ( RULE_CHAR )
                    {
                    // InternalUseCaseDslParser.g:502:2: ( RULE_CHAR )
                    // InternalUseCaseDslParser.g:503:3: RULE_CHAR
                    {
                     before(grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2()); 
                    match(input,RULE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:508:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:508:2: ( Colon )
                    // InternalUseCaseDslParser.g:509:3: Colon
                    {
                     before(grammarAccess.getConditionAccess().getColonKeyword_3()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:514:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:514:2: ( FullStop )
                    // InternalUseCaseDslParser.g:515:3: FullStop
                    {
                     before(grammarAccess.getConditionAccess().getFullStopKeyword_4()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUseCaseDslParser.g:520:2: ( QuotationMark )
                    {
                    // InternalUseCaseDslParser.g:520:2: ( QuotationMark )
                    // InternalUseCaseDslParser.g:521:3: QuotationMark
                    {
                     before(grammarAccess.getConditionAccess().getQuotationMarkKeyword_5()); 
                    match(input,QuotationMark,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getQuotationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUseCaseDslParser.g:526:2: ( Apostrophe )
                    {
                    // InternalUseCaseDslParser.g:526:2: ( Apostrophe )
                    // InternalUseCaseDslParser.g:527:3: Apostrophe
                    {
                     before(grammarAccess.getConditionAccess().getApostropheKeyword_6()); 
                    match(input,Apostrophe,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getApostropheKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUseCaseDslParser.g:532:2: ( AND )
                    {
                    // InternalUseCaseDslParser.g:532:2: ( AND )
                    // InternalUseCaseDslParser.g:533:3: AND
                    {
                     before(grammarAccess.getConditionAccess().getANDKeyword_7()); 
                    match(input,AND,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getANDKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUseCaseDslParser.g:538:2: ( OR )
                    {
                    // InternalUseCaseDslParser.g:538:2: ( OR )
                    // InternalUseCaseDslParser.g:539:3: OR
                    {
                     before(grammarAccess.getConditionAccess().getORKeyword_8()); 
                    match(input,OR,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getORKeyword_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__UseCase__Group__0"
    // InternalUseCaseDslParser.g:548:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:552:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCaseDslParser.g:553:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__UseCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__0"


    // $ANTLR start "rule__UseCase__Group__0__Impl"
    // InternalUseCaseDslParser.g:560:1: rule__UseCase__Group__0__Impl : ( UC ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:564:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:565:1: ( UC )
            {
            // InternalUseCaseDslParser.g:565:1: ( UC )
            // InternalUseCaseDslParser.g:566:2: UC
            {
             before(grammarAccess.getUseCaseAccess().getUCKeyword_0()); 
            match(input,UC,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getUCKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__0__Impl"


    // $ANTLR start "rule__UseCase__Group__1"
    // InternalUseCaseDslParser.g:575:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:579:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCaseDslParser.g:580:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__UseCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__1"


    // $ANTLR start "rule__UseCase__Group__1__Impl"
    // InternalUseCaseDslParser.g:587:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NumberAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:591:1: ( ( ( rule__UseCase__NumberAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:592:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:592:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            // InternalUseCaseDslParser.g:593:2: ( rule__UseCase__NumberAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNumberAssignment_1()); 
            // InternalUseCaseDslParser.g:594:2: ( rule__UseCase__NumberAssignment_1 )
            // InternalUseCaseDslParser.g:594:3: rule__UseCase__NumberAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__NumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getNumberAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__1__Impl"


    // $ANTLR start "rule__UseCase__Group__2"
    // InternalUseCaseDslParser.g:602:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:606:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCaseDslParser.g:607:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__UseCase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__2"


    // $ANTLR start "rule__UseCase__Group__2__Impl"
    // InternalUseCaseDslParser.g:614:1: rule__UseCase__Group__2__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:618:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:619:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:619:1: ( Colon )
            // InternalUseCaseDslParser.g:620:2: Colon
            {
             before(grammarAccess.getUseCaseAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__2__Impl"


    // $ANTLR start "rule__UseCase__Group__3"
    // InternalUseCaseDslParser.g:629:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:633:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCaseDslParser.g:634:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__UseCase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__3"


    // $ANTLR start "rule__UseCase__Group__3__Impl"
    // InternalUseCaseDslParser.g:641:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__NameAssignment_3 ) ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:645:1: ( ( ( rule__UseCase__NameAssignment_3 ) ) )
            // InternalUseCaseDslParser.g:646:1: ( ( rule__UseCase__NameAssignment_3 ) )
            {
            // InternalUseCaseDslParser.g:646:1: ( ( rule__UseCase__NameAssignment_3 ) )
            // InternalUseCaseDslParser.g:647:2: ( rule__UseCase__NameAssignment_3 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_3()); 
            // InternalUseCaseDslParser.g:648:2: ( rule__UseCase__NameAssignment_3 )
            // InternalUseCaseDslParser.g:648:3: rule__UseCase__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__3__Impl"


    // $ANTLR start "rule__UseCase__Group__4"
    // InternalUseCaseDslParser.g:656:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:660:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCaseDslParser.g:661:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__UseCase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__4"


    // $ANTLR start "rule__UseCase__Group__4__Impl"
    // InternalUseCaseDslParser.g:668:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__PreconditionAssignment_4 )? ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:672:1: ( ( ( rule__UseCase__PreconditionAssignment_4 )? ) )
            // InternalUseCaseDslParser.g:673:1: ( ( rule__UseCase__PreconditionAssignment_4 )? )
            {
            // InternalUseCaseDslParser.g:673:1: ( ( rule__UseCase__PreconditionAssignment_4 )? )
            // InternalUseCaseDslParser.g:674:2: ( rule__UseCase__PreconditionAssignment_4 )?
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionAssignment_4()); 
            // InternalUseCaseDslParser.g:675:2: ( rule__UseCase__PreconditionAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==PRECONDITION) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUseCaseDslParser.g:675:3: rule__UseCase__PreconditionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__PreconditionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getPreconditionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__4__Impl"


    // $ANTLR start "rule__UseCase__Group__5"
    // InternalUseCaseDslParser.g:683:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:687:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCaseDslParser.g:688:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__UseCase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__5"


    // $ANTLR start "rule__UseCase__Group__5__Impl"
    // InternalUseCaseDslParser.g:695:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__PostconditionAssignment_5 )? ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:699:1: ( ( ( rule__UseCase__PostconditionAssignment_5 )? ) )
            // InternalUseCaseDslParser.g:700:1: ( ( rule__UseCase__PostconditionAssignment_5 )? )
            {
            // InternalUseCaseDslParser.g:700:1: ( ( rule__UseCase__PostconditionAssignment_5 )? )
            // InternalUseCaseDslParser.g:701:2: ( rule__UseCase__PostconditionAssignment_5 )?
            {
             before(grammarAccess.getUseCaseAccess().getPostconditionAssignment_5()); 
            // InternalUseCaseDslParser.g:702:2: ( rule__UseCase__PostconditionAssignment_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==POSTCONDITION) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCaseDslParser.g:702:3: rule__UseCase__PostconditionAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__PostconditionAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getPostconditionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__5__Impl"


    // $ANTLR start "rule__UseCase__Group__6"
    // InternalUseCaseDslParser.g:710:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:714:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCaseDslParser.g:715:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__UseCase__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__6"


    // $ANTLR start "rule__UseCase__Group__6__Impl"
    // InternalUseCaseDslParser.g:722:1: rule__UseCase__Group__6__Impl : ( ( rule__UseCase__MainflowAssignment_6 ) ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:726:1: ( ( ( rule__UseCase__MainflowAssignment_6 ) ) )
            // InternalUseCaseDslParser.g:727:1: ( ( rule__UseCase__MainflowAssignment_6 ) )
            {
            // InternalUseCaseDslParser.g:727:1: ( ( rule__UseCase__MainflowAssignment_6 ) )
            // InternalUseCaseDslParser.g:728:2: ( rule__UseCase__MainflowAssignment_6 )
            {
             before(grammarAccess.getUseCaseAccess().getMainflowAssignment_6()); 
            // InternalUseCaseDslParser.g:729:2: ( rule__UseCase__MainflowAssignment_6 )
            // InternalUseCaseDslParser.g:729:3: rule__UseCase__MainflowAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__MainflowAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getMainflowAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__6__Impl"


    // $ANTLR start "rule__UseCase__Group__7"
    // InternalUseCaseDslParser.g:737:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:741:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCaseDslParser.g:742:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__UseCase__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__7"


    // $ANTLR start "rule__UseCase__Group__7__Impl"
    // InternalUseCaseDslParser.g:749:1: rule__UseCase__Group__7__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:753:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:754:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:754:1: ( Colon )
            // InternalUseCaseDslParser.g:755:2: Colon
            {
             before(grammarAccess.getUseCaseAccess().getColonKeyword_7()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__7__Impl"


    // $ANTLR start "rule__UseCase__Group__8"
    // InternalUseCaseDslParser.g:764:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:768:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // InternalUseCaseDslParser.g:769:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__UseCase__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__8"


    // $ANTLR start "rule__UseCase__Group__8__Impl"
    // InternalUseCaseDslParser.g:776:1: rule__UseCase__Group__8__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:780:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:781:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:781:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:782:2: RULE_BEGIN
            {
             before(grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_8()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__8__Impl"


    // $ANTLR start "rule__UseCase__Group__9"
    // InternalUseCaseDslParser.g:791:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl rule__UseCase__Group__10 ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:795:1: ( rule__UseCase__Group__9__Impl rule__UseCase__Group__10 )
            // InternalUseCaseDslParser.g:796:2: rule__UseCase__Group__9__Impl rule__UseCase__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__UseCase__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__9"


    // $ANTLR start "rule__UseCase__Group__9__Impl"
    // InternalUseCaseDslParser.g:803:1: rule__UseCase__Group__9__Impl : ( ( ( rule__UseCase__StepsAssignment_9 ) ) ( ( rule__UseCase__StepsAssignment_9 )* ) ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:807:1: ( ( ( ( rule__UseCase__StepsAssignment_9 ) ) ( ( rule__UseCase__StepsAssignment_9 )* ) ) )
            // InternalUseCaseDslParser.g:808:1: ( ( ( rule__UseCase__StepsAssignment_9 ) ) ( ( rule__UseCase__StepsAssignment_9 )* ) )
            {
            // InternalUseCaseDslParser.g:808:1: ( ( ( rule__UseCase__StepsAssignment_9 ) ) ( ( rule__UseCase__StepsAssignment_9 )* ) )
            // InternalUseCaseDslParser.g:809:2: ( ( rule__UseCase__StepsAssignment_9 ) ) ( ( rule__UseCase__StepsAssignment_9 )* )
            {
            // InternalUseCaseDslParser.g:809:2: ( ( rule__UseCase__StepsAssignment_9 ) )
            // InternalUseCaseDslParser.g:810:3: ( rule__UseCase__StepsAssignment_9 )
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_9()); 
            // InternalUseCaseDslParser.g:811:3: ( rule__UseCase__StepsAssignment_9 )
            // InternalUseCaseDslParser.g:811:4: rule__UseCase__StepsAssignment_9
            {
            pushFollow(FOLLOW_11);
            rule__UseCase__StepsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getStepsAssignment_9()); 

            }

            // InternalUseCaseDslParser.g:814:2: ( ( rule__UseCase__StepsAssignment_9 )* )
            // InternalUseCaseDslParser.g:815:3: ( rule__UseCase__StepsAssignment_9 )*
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_9()); 
            // InternalUseCaseDslParser.g:816:3: ( rule__UseCase__StepsAssignment_9 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_INT) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:816:4: rule__UseCase__StepsAssignment_9
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__UseCase__StepsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getStepsAssignment_9()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__9__Impl"


    // $ANTLR start "rule__UseCase__Group__10"
    // InternalUseCaseDslParser.g:825:1: rule__UseCase__Group__10 : rule__UseCase__Group__10__Impl rule__UseCase__Group__11 ;
    public final void rule__UseCase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:829:1: ( rule__UseCase__Group__10__Impl rule__UseCase__Group__11 )
            // InternalUseCaseDslParser.g:830:2: rule__UseCase__Group__10__Impl rule__UseCase__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__UseCase__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__10"


    // $ANTLR start "rule__UseCase__Group__10__Impl"
    // InternalUseCaseDslParser.g:837:1: rule__UseCase__Group__10__Impl : ( RULE_END ) ;
    public final void rule__UseCase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:841:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:842:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:842:1: ( RULE_END )
            // InternalUseCaseDslParser.g:843:2: RULE_END
            {
             before(grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_10()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__10__Impl"


    // $ANTLR start "rule__UseCase__Group__11"
    // InternalUseCaseDslParser.g:852:1: rule__UseCase__Group__11 : rule__UseCase__Group__11__Impl ;
    public final void rule__UseCase__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:856:1: ( rule__UseCase__Group__11__Impl )
            // InternalUseCaseDslParser.g:857:2: rule__UseCase__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__11"


    // $ANTLR start "rule__UseCase__Group__11__Impl"
    // InternalUseCaseDslParser.g:863:1: rule__UseCase__Group__11__Impl : ( ( rule__UseCase__Group_11__0 )? ) ;
    public final void rule__UseCase__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:867:1: ( ( ( rule__UseCase__Group_11__0 )? ) )
            // InternalUseCaseDslParser.g:868:1: ( ( rule__UseCase__Group_11__0 )? )
            {
            // InternalUseCaseDslParser.g:868:1: ( ( rule__UseCase__Group_11__0 )? )
            // InternalUseCaseDslParser.g:869:2: ( rule__UseCase__Group_11__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_11()); 
            // InternalUseCaseDslParser.g:870:2: ( rule__UseCase__Group_11__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ALTERNATIVEFLOW) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUseCaseDslParser.g:870:3: rule__UseCase__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__11__Impl"


    // $ANTLR start "rule__UseCase__Group_11__0"
    // InternalUseCaseDslParser.g:879:1: rule__UseCase__Group_11__0 : rule__UseCase__Group_11__0__Impl rule__UseCase__Group_11__1 ;
    public final void rule__UseCase__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:883:1: ( rule__UseCase__Group_11__0__Impl rule__UseCase__Group_11__1 )
            // InternalUseCaseDslParser.g:884:2: rule__UseCase__Group_11__0__Impl rule__UseCase__Group_11__1
            {
            pushFollow(FOLLOW_6);
            rule__UseCase__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_11__0"


    // $ANTLR start "rule__UseCase__Group_11__0__Impl"
    // InternalUseCaseDslParser.g:891:1: rule__UseCase__Group_11__0__Impl : ( ( rule__UseCase__DeclareofflowAssignment_11_0 ) ) ;
    public final void rule__UseCase__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:895:1: ( ( ( rule__UseCase__DeclareofflowAssignment_11_0 ) ) )
            // InternalUseCaseDslParser.g:896:1: ( ( rule__UseCase__DeclareofflowAssignment_11_0 ) )
            {
            // InternalUseCaseDslParser.g:896:1: ( ( rule__UseCase__DeclareofflowAssignment_11_0 ) )
            // InternalUseCaseDslParser.g:897:2: ( rule__UseCase__DeclareofflowAssignment_11_0 )
            {
             before(grammarAccess.getUseCaseAccess().getDeclareofflowAssignment_11_0()); 
            // InternalUseCaseDslParser.g:898:2: ( rule__UseCase__DeclareofflowAssignment_11_0 )
            // InternalUseCaseDslParser.g:898:3: rule__UseCase__DeclareofflowAssignment_11_0
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__DeclareofflowAssignment_11_0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getDeclareofflowAssignment_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_11__0__Impl"


    // $ANTLR start "rule__UseCase__Group_11__1"
    // InternalUseCaseDslParser.g:906:1: rule__UseCase__Group_11__1 : rule__UseCase__Group_11__1__Impl rule__UseCase__Group_11__2 ;
    public final void rule__UseCase__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:910:1: ( rule__UseCase__Group_11__1__Impl rule__UseCase__Group_11__2 )
            // InternalUseCaseDslParser.g:911:2: rule__UseCase__Group_11__1__Impl rule__UseCase__Group_11__2
            {
            pushFollow(FOLLOW_9);
            rule__UseCase__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_11__1"


    // $ANTLR start "rule__UseCase__Group_11__1__Impl"
    // InternalUseCaseDslParser.g:918:1: rule__UseCase__Group_11__1__Impl : ( Colon ) ;
    public final void rule__UseCase__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:922:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:923:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:923:1: ( Colon )
            // InternalUseCaseDslParser.g:924:2: Colon
            {
             before(grammarAccess.getUseCaseAccess().getColonKeyword_11_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getColonKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_11__1__Impl"


    // $ANTLR start "rule__UseCase__Group_11__2"
    // InternalUseCaseDslParser.g:933:1: rule__UseCase__Group_11__2 : rule__UseCase__Group_11__2__Impl rule__UseCase__Group_11__3 ;
    public final void rule__UseCase__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:937:1: ( rule__UseCase__Group_11__2__Impl rule__UseCase__Group_11__3 )
            // InternalUseCaseDslParser.g:938:2: rule__UseCase__Group_11__2__Impl rule__UseCase__Group_11__3
            {
            pushFollow(FOLLOW_5);
            rule__UseCase__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_11__2"


    // $ANTLR start "rule__UseCase__Group_11__2__Impl"
    // InternalUseCaseDslParser.g:945:1: rule__UseCase__Group_11__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCase__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:949:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:950:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:950:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:951:2: RULE_BEGIN
            {
             before(grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_11_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_11__2__Impl"


    // $ANTLR start "rule__UseCase__Group_11__3"
    // InternalUseCaseDslParser.g:960:1: rule__UseCase__Group_11__3 : rule__UseCase__Group_11__3__Impl rule__UseCase__Group_11__4 ;
    public final void rule__UseCase__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:964:1: ( rule__UseCase__Group_11__3__Impl rule__UseCase__Group_11__4 )
            // InternalUseCaseDslParser.g:965:2: rule__UseCase__Group_11__3__Impl rule__UseCase__Group_11__4
            {
            pushFollow(FOLLOW_10);
            rule__UseCase__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_11__3"


    // $ANTLR start "rule__UseCase__Group_11__3__Impl"
    // InternalUseCaseDslParser.g:972:1: rule__UseCase__Group_11__3__Impl : ( ( ( rule__UseCase__AlternativeflowsAssignment_11_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_11_3 )* ) ) ;
    public final void rule__UseCase__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:976:1: ( ( ( ( rule__UseCase__AlternativeflowsAssignment_11_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_11_3 )* ) ) )
            // InternalUseCaseDslParser.g:977:1: ( ( ( rule__UseCase__AlternativeflowsAssignment_11_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_11_3 )* ) )
            {
            // InternalUseCaseDslParser.g:977:1: ( ( ( rule__UseCase__AlternativeflowsAssignment_11_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_11_3 )* ) )
            // InternalUseCaseDslParser.g:978:2: ( ( rule__UseCase__AlternativeflowsAssignment_11_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_11_3 )* )
            {
            // InternalUseCaseDslParser.g:978:2: ( ( rule__UseCase__AlternativeflowsAssignment_11_3 ) )
            // InternalUseCaseDslParser.g:979:3: ( rule__UseCase__AlternativeflowsAssignment_11_3 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_11_3()); 
            // InternalUseCaseDslParser.g:980:3: ( rule__UseCase__AlternativeflowsAssignment_11_3 )
            // InternalUseCaseDslParser.g:980:4: rule__UseCase__AlternativeflowsAssignment_11_3
            {
            pushFollow(FOLLOW_11);
            rule__UseCase__AlternativeflowsAssignment_11_3();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_11_3()); 

            }

            // InternalUseCaseDslParser.g:983:2: ( ( rule__UseCase__AlternativeflowsAssignment_11_3 )* )
            // InternalUseCaseDslParser.g:984:3: ( rule__UseCase__AlternativeflowsAssignment_11_3 )*
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_11_3()); 
            // InternalUseCaseDslParser.g:985:3: ( rule__UseCase__AlternativeflowsAssignment_11_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_INT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:985:4: rule__UseCase__AlternativeflowsAssignment_11_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__UseCase__AlternativeflowsAssignment_11_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_11_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_11__3__Impl"


    // $ANTLR start "rule__UseCase__Group_11__4"
    // InternalUseCaseDslParser.g:994:1: rule__UseCase__Group_11__4 : rule__UseCase__Group_11__4__Impl ;
    public final void rule__UseCase__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:998:1: ( rule__UseCase__Group_11__4__Impl )
            // InternalUseCaseDslParser.g:999:2: rule__UseCase__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_11__4"


    // $ANTLR start "rule__UseCase__Group_11__4__Impl"
    // InternalUseCaseDslParser.g:1005:1: rule__UseCase__Group_11__4__Impl : ( RULE_END ) ;
    public final void rule__UseCase__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1009:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1010:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1010:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1011:2: RULE_END
            {
             before(grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_11_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_11__4__Impl"


    // $ANTLR start "rule__Extension__Group__0"
    // InternalUseCaseDslParser.g:1021:1: rule__Extension__Group__0 : rule__Extension__Group__0__Impl rule__Extension__Group__1 ;
    public final void rule__Extension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1025:1: ( rule__Extension__Group__0__Impl rule__Extension__Group__1 )
            // InternalUseCaseDslParser.g:1026:2: rule__Extension__Group__0__Impl rule__Extension__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Extension__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__0"


    // $ANTLR start "rule__Extension__Group__0__Impl"
    // InternalUseCaseDslParser.g:1033:1: rule__Extension__Group__0__Impl : ( ( rule__Extension__StartFromAssignment_0 ) ) ;
    public final void rule__Extension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1037:1: ( ( ( rule__Extension__StartFromAssignment_0 ) ) )
            // InternalUseCaseDslParser.g:1038:1: ( ( rule__Extension__StartFromAssignment_0 ) )
            {
            // InternalUseCaseDslParser.g:1038:1: ( ( rule__Extension__StartFromAssignment_0 ) )
            // InternalUseCaseDslParser.g:1039:2: ( rule__Extension__StartFromAssignment_0 )
            {
             before(grammarAccess.getExtensionAccess().getStartFromAssignment_0()); 
            // InternalUseCaseDslParser.g:1040:2: ( rule__Extension__StartFromAssignment_0 )
            // InternalUseCaseDslParser.g:1040:3: rule__Extension__StartFromAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Extension__StartFromAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getStartFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__0__Impl"


    // $ANTLR start "rule__Extension__Group__1"
    // InternalUseCaseDslParser.g:1048:1: rule__Extension__Group__1 : rule__Extension__Group__1__Impl rule__Extension__Group__2 ;
    public final void rule__Extension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1052:1: ( rule__Extension__Group__1__Impl rule__Extension__Group__2 )
            // InternalUseCaseDslParser.g:1053:2: rule__Extension__Group__1__Impl rule__Extension__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Extension__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__1"


    // $ANTLR start "rule__Extension__Group__1__Impl"
    // InternalUseCaseDslParser.g:1060:1: rule__Extension__Group__1__Impl : ( FullStop ) ;
    public final void rule__Extension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1064:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1065:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1065:1: ( FullStop )
            // InternalUseCaseDslParser.g:1066:2: FullStop
            {
             before(grammarAccess.getExtensionAccess().getFullStopKeyword_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__1__Impl"


    // $ANTLR start "rule__Extension__Group__2"
    // InternalUseCaseDslParser.g:1075:1: rule__Extension__Group__2 : rule__Extension__Group__2__Impl rule__Extension__Group__3 ;
    public final void rule__Extension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1079:1: ( rule__Extension__Group__2__Impl rule__Extension__Group__3 )
            // InternalUseCaseDslParser.g:1080:2: rule__Extension__Group__2__Impl rule__Extension__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Extension__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__2"


    // $ANTLR start "rule__Extension__Group__2__Impl"
    // InternalUseCaseDslParser.g:1087:1: rule__Extension__Group__2__Impl : ( ( rule__Extension__NameAssignment_2 ) ) ;
    public final void rule__Extension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1091:1: ( ( ( rule__Extension__NameAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:1092:1: ( ( rule__Extension__NameAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:1092:1: ( ( rule__Extension__NameAssignment_2 ) )
            // InternalUseCaseDslParser.g:1093:2: ( rule__Extension__NameAssignment_2 )
            {
             before(grammarAccess.getExtensionAccess().getNameAssignment_2()); 
            // InternalUseCaseDslParser.g:1094:2: ( rule__Extension__NameAssignment_2 )
            // InternalUseCaseDslParser.g:1094:3: rule__Extension__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Extension__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__2__Impl"


    // $ANTLR start "rule__Extension__Group__3"
    // InternalUseCaseDslParser.g:1102:1: rule__Extension__Group__3 : rule__Extension__Group__3__Impl rule__Extension__Group__4 ;
    public final void rule__Extension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1106:1: ( rule__Extension__Group__3__Impl rule__Extension__Group__4 )
            // InternalUseCaseDslParser.g:1107:2: rule__Extension__Group__3__Impl rule__Extension__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Extension__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__3"


    // $ANTLR start "rule__Extension__Group__3__Impl"
    // InternalUseCaseDslParser.g:1114:1: rule__Extension__Group__3__Impl : ( FullStop ) ;
    public final void rule__Extension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1118:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1119:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1119:1: ( FullStop )
            // InternalUseCaseDslParser.g:1120:2: FullStop
            {
             before(grammarAccess.getExtensionAccess().getFullStopKeyword_3()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__3__Impl"


    // $ANTLR start "rule__Extension__Group__4"
    // InternalUseCaseDslParser.g:1129:1: rule__Extension__Group__4 : rule__Extension__Group__4__Impl rule__Extension__Group__5 ;
    public final void rule__Extension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1133:1: ( rule__Extension__Group__4__Impl rule__Extension__Group__5 )
            // InternalUseCaseDslParser.g:1134:2: rule__Extension__Group__4__Impl rule__Extension__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Extension__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__4"


    // $ANTLR start "rule__Extension__Group__4__Impl"
    // InternalUseCaseDslParser.g:1141:1: rule__Extension__Group__4__Impl : ( IF ) ;
    public final void rule__Extension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1145:1: ( ( IF ) )
            // InternalUseCaseDslParser.g:1146:1: ( IF )
            {
            // InternalUseCaseDslParser.g:1146:1: ( IF )
            // InternalUseCaseDslParser.g:1147:2: IF
            {
             before(grammarAccess.getExtensionAccess().getIFKeyword_4()); 
            match(input,IF,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getIFKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__4__Impl"


    // $ANTLR start "rule__Extension__Group__5"
    // InternalUseCaseDslParser.g:1156:1: rule__Extension__Group__5 : rule__Extension__Group__5__Impl rule__Extension__Group__6 ;
    public final void rule__Extension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1160:1: ( rule__Extension__Group__5__Impl rule__Extension__Group__6 )
            // InternalUseCaseDslParser.g:1161:2: rule__Extension__Group__5__Impl rule__Extension__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Extension__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__5"


    // $ANTLR start "rule__Extension__Group__5__Impl"
    // InternalUseCaseDslParser.g:1168:1: rule__Extension__Group__5__Impl : ( ( rule__Extension__ConditionAssignment_5 ) ) ;
    public final void rule__Extension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1172:1: ( ( ( rule__Extension__ConditionAssignment_5 ) ) )
            // InternalUseCaseDslParser.g:1173:1: ( ( rule__Extension__ConditionAssignment_5 ) )
            {
            // InternalUseCaseDslParser.g:1173:1: ( ( rule__Extension__ConditionAssignment_5 ) )
            // InternalUseCaseDslParser.g:1174:2: ( rule__Extension__ConditionAssignment_5 )
            {
             before(grammarAccess.getExtensionAccess().getConditionAssignment_5()); 
            // InternalUseCaseDslParser.g:1175:2: ( rule__Extension__ConditionAssignment_5 )
            // InternalUseCaseDslParser.g:1175:3: rule__Extension__ConditionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Extension__ConditionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getConditionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__5__Impl"


    // $ANTLR start "rule__Extension__Group__6"
    // InternalUseCaseDslParser.g:1183:1: rule__Extension__Group__6 : rule__Extension__Group__6__Impl rule__Extension__Group__7 ;
    public final void rule__Extension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1187:1: ( rule__Extension__Group__6__Impl rule__Extension__Group__7 )
            // InternalUseCaseDslParser.g:1188:2: rule__Extension__Group__6__Impl rule__Extension__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Extension__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__6"


    // $ANTLR start "rule__Extension__Group__6__Impl"
    // InternalUseCaseDslParser.g:1195:1: rule__Extension__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__Extension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1199:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:1200:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:1200:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:1201:2: RULE_BEGIN
            {
             before(grammarAccess.getExtensionAccess().getBEGINTerminalRuleCall_6()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getBEGINTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__6__Impl"


    // $ANTLR start "rule__Extension__Group__7"
    // InternalUseCaseDslParser.g:1210:1: rule__Extension__Group__7 : rule__Extension__Group__7__Impl rule__Extension__Group__8 ;
    public final void rule__Extension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1214:1: ( rule__Extension__Group__7__Impl rule__Extension__Group__8 )
            // InternalUseCaseDslParser.g:1215:2: rule__Extension__Group__7__Impl rule__Extension__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Extension__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__7"


    // $ANTLR start "rule__Extension__Group__7__Impl"
    // InternalUseCaseDslParser.g:1222:1: rule__Extension__Group__7__Impl : ( ( ( rule__Extension__StepsAssignment_7 ) ) ( ( rule__Extension__StepsAssignment_7 )* ) ) ;
    public final void rule__Extension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1226:1: ( ( ( ( rule__Extension__StepsAssignment_7 ) ) ( ( rule__Extension__StepsAssignment_7 )* ) ) )
            // InternalUseCaseDslParser.g:1227:1: ( ( ( rule__Extension__StepsAssignment_7 ) ) ( ( rule__Extension__StepsAssignment_7 )* ) )
            {
            // InternalUseCaseDslParser.g:1227:1: ( ( ( rule__Extension__StepsAssignment_7 ) ) ( ( rule__Extension__StepsAssignment_7 )* ) )
            // InternalUseCaseDslParser.g:1228:2: ( ( rule__Extension__StepsAssignment_7 ) ) ( ( rule__Extension__StepsAssignment_7 )* )
            {
            // InternalUseCaseDslParser.g:1228:2: ( ( rule__Extension__StepsAssignment_7 ) )
            // InternalUseCaseDslParser.g:1229:3: ( rule__Extension__StepsAssignment_7 )
            {
             before(grammarAccess.getExtensionAccess().getStepsAssignment_7()); 
            // InternalUseCaseDslParser.g:1230:3: ( rule__Extension__StepsAssignment_7 )
            // InternalUseCaseDslParser.g:1230:4: rule__Extension__StepsAssignment_7
            {
            pushFollow(FOLLOW_11);
            rule__Extension__StepsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getStepsAssignment_7()); 

            }

            // InternalUseCaseDslParser.g:1233:2: ( ( rule__Extension__StepsAssignment_7 )* )
            // InternalUseCaseDslParser.g:1234:3: ( rule__Extension__StepsAssignment_7 )*
            {
             before(grammarAccess.getExtensionAccess().getStepsAssignment_7()); 
            // InternalUseCaseDslParser.g:1235:3: ( rule__Extension__StepsAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1235:4: rule__Extension__StepsAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Extension__StepsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getExtensionAccess().getStepsAssignment_7()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__7__Impl"


    // $ANTLR start "rule__Extension__Group__8"
    // InternalUseCaseDslParser.g:1244:1: rule__Extension__Group__8 : rule__Extension__Group__8__Impl rule__Extension__Group__9 ;
    public final void rule__Extension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1248:1: ( rule__Extension__Group__8__Impl rule__Extension__Group__9 )
            // InternalUseCaseDslParser.g:1249:2: rule__Extension__Group__8__Impl rule__Extension__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Extension__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__8"


    // $ANTLR start "rule__Extension__Group__8__Impl"
    // InternalUseCaseDslParser.g:1256:1: rule__Extension__Group__8__Impl : ( ( rule__Extension__Alternatives_8 ) ) ;
    public final void rule__Extension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1260:1: ( ( ( rule__Extension__Alternatives_8 ) ) )
            // InternalUseCaseDslParser.g:1261:1: ( ( rule__Extension__Alternatives_8 ) )
            {
            // InternalUseCaseDslParser.g:1261:1: ( ( rule__Extension__Alternatives_8 ) )
            // InternalUseCaseDslParser.g:1262:2: ( rule__Extension__Alternatives_8 )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives_8()); 
            // InternalUseCaseDslParser.g:1263:2: ( rule__Extension__Alternatives_8 )
            // InternalUseCaseDslParser.g:1263:3: rule__Extension__Alternatives_8
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Alternatives_8();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getAlternatives_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__8__Impl"


    // $ANTLR start "rule__Extension__Group__9"
    // InternalUseCaseDslParser.g:1271:1: rule__Extension__Group__9 : rule__Extension__Group__9__Impl ;
    public final void rule__Extension__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1275:1: ( rule__Extension__Group__9__Impl )
            // InternalUseCaseDslParser.g:1276:2: rule__Extension__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__9"


    // $ANTLR start "rule__Extension__Group__9__Impl"
    // InternalUseCaseDslParser.g:1282:1: rule__Extension__Group__9__Impl : ( RULE_END ) ;
    public final void rule__Extension__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1286:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1287:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1287:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1288:2: RULE_END
            {
             before(grammarAccess.getExtensionAccess().getENDTerminalRuleCall_9()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getENDTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group__9__Impl"


    // $ANTLR start "rule__Extension__Group_8_0__0"
    // InternalUseCaseDslParser.g:1298:1: rule__Extension__Group_8_0__0 : rule__Extension__Group_8_0__0__Impl rule__Extension__Group_8_0__1 ;
    public final void rule__Extension__Group_8_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1302:1: ( rule__Extension__Group_8_0__0__Impl rule__Extension__Group_8_0__1 )
            // InternalUseCaseDslParser.g:1303:2: rule__Extension__Group_8_0__0__Impl rule__Extension__Group_8_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Extension__Group_8_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group_8_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_8_0__0"


    // $ANTLR start "rule__Extension__Group_8_0__0__Impl"
    // InternalUseCaseDslParser.g:1310:1: rule__Extension__Group_8_0__0__Impl : ( RULE_INT ) ;
    public final void rule__Extension__Group_8_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1314:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:1315:1: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:1315:1: ( RULE_INT )
            // InternalUseCaseDslParser.g:1316:2: RULE_INT
            {
             before(grammarAccess.getExtensionAccess().getINTTerminalRuleCall_8_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getINTTerminalRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_8_0__0__Impl"


    // $ANTLR start "rule__Extension__Group_8_0__1"
    // InternalUseCaseDslParser.g:1325:1: rule__Extension__Group_8_0__1 : rule__Extension__Group_8_0__1__Impl rule__Extension__Group_8_0__2 ;
    public final void rule__Extension__Group_8_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1329:1: ( rule__Extension__Group_8_0__1__Impl rule__Extension__Group_8_0__2 )
            // InternalUseCaseDslParser.g:1330:2: rule__Extension__Group_8_0__1__Impl rule__Extension__Group_8_0__2
            {
            pushFollow(FOLLOW_17);
            rule__Extension__Group_8_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group_8_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_8_0__1"


    // $ANTLR start "rule__Extension__Group_8_0__1__Impl"
    // InternalUseCaseDslParser.g:1337:1: rule__Extension__Group_8_0__1__Impl : ( FullStop ) ;
    public final void rule__Extension__Group_8_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1341:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1342:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1342:1: ( FullStop )
            // InternalUseCaseDslParser.g:1343:2: FullStop
            {
             before(grammarAccess.getExtensionAccess().getFullStopKeyword_8_0_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getFullStopKeyword_8_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_8_0__1__Impl"


    // $ANTLR start "rule__Extension__Group_8_0__2"
    // InternalUseCaseDslParser.g:1352:1: rule__Extension__Group_8_0__2 : rule__Extension__Group_8_0__2__Impl rule__Extension__Group_8_0__3 ;
    public final void rule__Extension__Group_8_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1356:1: ( rule__Extension__Group_8_0__2__Impl rule__Extension__Group_8_0__3 )
            // InternalUseCaseDslParser.g:1357:2: rule__Extension__Group_8_0__2__Impl rule__Extension__Group_8_0__3
            {
            pushFollow(FOLLOW_18);
            rule__Extension__Group_8_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group_8_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_8_0__2"


    // $ANTLR start "rule__Extension__Group_8_0__2__Impl"
    // InternalUseCaseDslParser.g:1364:1: rule__Extension__Group_8_0__2__Impl : ( RETURN ) ;
    public final void rule__Extension__Group_8_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1368:1: ( ( RETURN ) )
            // InternalUseCaseDslParser.g:1369:1: ( RETURN )
            {
            // InternalUseCaseDslParser.g:1369:1: ( RETURN )
            // InternalUseCaseDslParser.g:1370:2: RETURN
            {
             before(grammarAccess.getExtensionAccess().getRETURNKeyword_8_0_2()); 
            match(input,RETURN,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getRETURNKeyword_8_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_8_0__2__Impl"


    // $ANTLR start "rule__Extension__Group_8_0__3"
    // InternalUseCaseDslParser.g:1379:1: rule__Extension__Group_8_0__3 : rule__Extension__Group_8_0__3__Impl rule__Extension__Group_8_0__4 ;
    public final void rule__Extension__Group_8_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1383:1: ( rule__Extension__Group_8_0__3__Impl rule__Extension__Group_8_0__4 )
            // InternalUseCaseDslParser.g:1384:2: rule__Extension__Group_8_0__3__Impl rule__Extension__Group_8_0__4
            {
            pushFollow(FOLLOW_5);
            rule__Extension__Group_8_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group_8_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_8_0__3"


    // $ANTLR start "rule__Extension__Group_8_0__3__Impl"
    // InternalUseCaseDslParser.g:1391:1: rule__Extension__Group_8_0__3__Impl : ( TO ) ;
    public final void rule__Extension__Group_8_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1395:1: ( ( TO ) )
            // InternalUseCaseDslParser.g:1396:1: ( TO )
            {
            // InternalUseCaseDslParser.g:1396:1: ( TO )
            // InternalUseCaseDslParser.g:1397:2: TO
            {
             before(grammarAccess.getExtensionAccess().getTOKeyword_8_0_3()); 
            match(input,TO,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getTOKeyword_8_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_8_0__3__Impl"


    // $ANTLR start "rule__Extension__Group_8_0__4"
    // InternalUseCaseDslParser.g:1406:1: rule__Extension__Group_8_0__4 : rule__Extension__Group_8_0__4__Impl ;
    public final void rule__Extension__Group_8_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1410:1: ( rule__Extension__Group_8_0__4__Impl )
            // InternalUseCaseDslParser.g:1411:2: rule__Extension__Group_8_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Group_8_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_8_0__4"


    // $ANTLR start "rule__Extension__Group_8_0__4__Impl"
    // InternalUseCaseDslParser.g:1417:1: rule__Extension__Group_8_0__4__Impl : ( ( rule__Extension__ResumeAtAssignment_8_0_4 ) ) ;
    public final void rule__Extension__Group_8_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1421:1: ( ( ( rule__Extension__ResumeAtAssignment_8_0_4 ) ) )
            // InternalUseCaseDslParser.g:1422:1: ( ( rule__Extension__ResumeAtAssignment_8_0_4 ) )
            {
            // InternalUseCaseDslParser.g:1422:1: ( ( rule__Extension__ResumeAtAssignment_8_0_4 ) )
            // InternalUseCaseDslParser.g:1423:2: ( rule__Extension__ResumeAtAssignment_8_0_4 )
            {
             before(grammarAccess.getExtensionAccess().getResumeAtAssignment_8_0_4()); 
            // InternalUseCaseDslParser.g:1424:2: ( rule__Extension__ResumeAtAssignment_8_0_4 )
            // InternalUseCaseDslParser.g:1424:3: rule__Extension__ResumeAtAssignment_8_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Extension__ResumeAtAssignment_8_0_4();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getResumeAtAssignment_8_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_8_0__4__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_0__0"
    // InternalUseCaseDslParser.g:1433:1: rule__UseCaseStep__Group_0__0 : rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1 ;
    public final void rule__UseCaseStep__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1437:1: ( rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1 )
            // InternalUseCaseDslParser.g:1438:2: rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__UseCaseStep__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_0__0"


    // $ANTLR start "rule__UseCaseStep__Group_0__0__Impl"
    // InternalUseCaseDslParser.g:1445:1: rule__UseCaseStep__Group_0__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1449:1: ( ( () ) )
            // InternalUseCaseDslParser.g:1450:1: ( () )
            {
            // InternalUseCaseDslParser.g:1450:1: ( () )
            // InternalUseCaseDslParser.g:1451:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getUserStepAction_0_0()); 
            // InternalUseCaseDslParser.g:1452:2: ()
            // InternalUseCaseDslParser.g:1452:3: 
            {
            }

             after(grammarAccess.getUseCaseStepAccess().getUserStepAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_0__0__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_0__1"
    // InternalUseCaseDslParser.g:1460:1: rule__UseCaseStep__Group_0__1 : rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2 ;
    public final void rule__UseCaseStep__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1464:1: ( rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2 )
            // InternalUseCaseDslParser.g:1465:2: rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2
            {
            pushFollow(FOLLOW_13);
            rule__UseCaseStep__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_0__1"


    // $ANTLR start "rule__UseCaseStep__Group_0__1__Impl"
    // InternalUseCaseDslParser.g:1472:1: rule__UseCaseStep__Group_0__1__Impl : ( ( rule__UseCaseStep__NameAssignment_0_1 ) ) ;
    public final void rule__UseCaseStep__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1476:1: ( ( ( rule__UseCaseStep__NameAssignment_0_1 ) ) )
            // InternalUseCaseDslParser.g:1477:1: ( ( rule__UseCaseStep__NameAssignment_0_1 ) )
            {
            // InternalUseCaseDslParser.g:1477:1: ( ( rule__UseCaseStep__NameAssignment_0_1 ) )
            // InternalUseCaseDslParser.g:1478:2: ( rule__UseCaseStep__NameAssignment_0_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_0_1()); 
            // InternalUseCaseDslParser.g:1479:2: ( rule__UseCaseStep__NameAssignment_0_1 )
            // InternalUseCaseDslParser.g:1479:3: rule__UseCaseStep__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_0__1__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_0__2"
    // InternalUseCaseDslParser.g:1487:1: rule__UseCaseStep__Group_0__2 : rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3 ;
    public final void rule__UseCaseStep__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1491:1: ( rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3 )
            // InternalUseCaseDslParser.g:1492:2: rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3
            {
            pushFollow(FOLLOW_19);
            rule__UseCaseStep__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_0__2"


    // $ANTLR start "rule__UseCaseStep__Group_0__2__Impl"
    // InternalUseCaseDslParser.g:1499:1: rule__UseCaseStep__Group_0__2__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1503:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1504:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1504:1: ( FullStop )
            // InternalUseCaseDslParser.g:1505:2: FullStop
            {
             before(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_0_2()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_0__2__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_0__3"
    // InternalUseCaseDslParser.g:1514:1: rule__UseCaseStep__Group_0__3 : rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4 ;
    public final void rule__UseCaseStep__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1518:1: ( rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4 )
            // InternalUseCaseDslParser.g:1519:2: rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4
            {
            pushFollow(FOLLOW_7);
            rule__UseCaseStep__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_0__3"


    // $ANTLR start "rule__UseCaseStep__Group_0__3__Impl"
    // InternalUseCaseDslParser.g:1526:1: rule__UseCaseStep__Group_0__3__Impl : ( USER ) ;
    public final void rule__UseCaseStep__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1530:1: ( ( USER ) )
            // InternalUseCaseDslParser.g:1531:1: ( USER )
            {
            // InternalUseCaseDslParser.g:1531:1: ( USER )
            // InternalUseCaseDslParser.g:1532:2: USER
            {
             before(grammarAccess.getUseCaseStepAccess().getUSERKeyword_0_3()); 
            match(input,USER,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getUSERKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_0__3__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_0__4"
    // InternalUseCaseDslParser.g:1541:1: rule__UseCaseStep__Group_0__4 : rule__UseCaseStep__Group_0__4__Impl ;
    public final void rule__UseCaseStep__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1545:1: ( rule__UseCaseStep__Group_0__4__Impl )
            // InternalUseCaseDslParser.g:1546:2: rule__UseCaseStep__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_0__4"


    // $ANTLR start "rule__UseCaseStep__Group_0__4__Impl"
    // InternalUseCaseDslParser.g:1552:1: rule__UseCaseStep__Group_0__4__Impl : ( ( rule__UseCaseStep__SentenceAssignment_0_4 ) ) ;
    public final void rule__UseCaseStep__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1556:1: ( ( ( rule__UseCaseStep__SentenceAssignment_0_4 ) ) )
            // InternalUseCaseDslParser.g:1557:1: ( ( rule__UseCaseStep__SentenceAssignment_0_4 ) )
            {
            // InternalUseCaseDslParser.g:1557:1: ( ( rule__UseCaseStep__SentenceAssignment_0_4 ) )
            // InternalUseCaseDslParser.g:1558:2: ( rule__UseCaseStep__SentenceAssignment_0_4 )
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_0_4()); 
            // InternalUseCaseDslParser.g:1559:2: ( rule__UseCaseStep__SentenceAssignment_0_4 )
            // InternalUseCaseDslParser.g:1559:3: rule__UseCaseStep__SentenceAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__SentenceAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_0__4__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_1__0"
    // InternalUseCaseDslParser.g:1568:1: rule__UseCaseStep__Group_1__0 : rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1 ;
    public final void rule__UseCaseStep__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1572:1: ( rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1 )
            // InternalUseCaseDslParser.g:1573:2: rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__UseCaseStep__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1__0"


    // $ANTLR start "rule__UseCaseStep__Group_1__0__Impl"
    // InternalUseCaseDslParser.g:1580:1: rule__UseCaseStep__Group_1__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1584:1: ( ( () ) )
            // InternalUseCaseDslParser.g:1585:1: ( () )
            {
            // InternalUseCaseDslParser.g:1585:1: ( () )
            // InternalUseCaseDslParser.g:1586:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getSystemStepAction_1_0()); 
            // InternalUseCaseDslParser.g:1587:2: ()
            // InternalUseCaseDslParser.g:1587:3: 
            {
            }

             after(grammarAccess.getUseCaseStepAccess().getSystemStepAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1__0__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_1__1"
    // InternalUseCaseDslParser.g:1595:1: rule__UseCaseStep__Group_1__1 : rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2 ;
    public final void rule__UseCaseStep__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1599:1: ( rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2 )
            // InternalUseCaseDslParser.g:1600:2: rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__UseCaseStep__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1__1"


    // $ANTLR start "rule__UseCaseStep__Group_1__1__Impl"
    // InternalUseCaseDslParser.g:1607:1: rule__UseCaseStep__Group_1__1__Impl : ( ( rule__UseCaseStep__NameAssignment_1_1 ) ) ;
    public final void rule__UseCaseStep__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1611:1: ( ( ( rule__UseCaseStep__NameAssignment_1_1 ) ) )
            // InternalUseCaseDslParser.g:1612:1: ( ( rule__UseCaseStep__NameAssignment_1_1 ) )
            {
            // InternalUseCaseDslParser.g:1612:1: ( ( rule__UseCaseStep__NameAssignment_1_1 ) )
            // InternalUseCaseDslParser.g:1613:2: ( rule__UseCaseStep__NameAssignment_1_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_1_1()); 
            // InternalUseCaseDslParser.g:1614:2: ( rule__UseCaseStep__NameAssignment_1_1 )
            // InternalUseCaseDslParser.g:1614:3: rule__UseCaseStep__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1__1__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_1__2"
    // InternalUseCaseDslParser.g:1622:1: rule__UseCaseStep__Group_1__2 : rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3 ;
    public final void rule__UseCaseStep__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1626:1: ( rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3 )
            // InternalUseCaseDslParser.g:1627:2: rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3
            {
            pushFollow(FOLLOW_20);
            rule__UseCaseStep__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1__2"


    // $ANTLR start "rule__UseCaseStep__Group_1__2__Impl"
    // InternalUseCaseDslParser.g:1634:1: rule__UseCaseStep__Group_1__2__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1638:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1639:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1639:1: ( FullStop )
            // InternalUseCaseDslParser.g:1640:2: FullStop
            {
             before(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_1_2()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1__2__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_1__3"
    // InternalUseCaseDslParser.g:1649:1: rule__UseCaseStep__Group_1__3 : rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4 ;
    public final void rule__UseCaseStep__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1653:1: ( rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4 )
            // InternalUseCaseDslParser.g:1654:2: rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4
            {
            pushFollow(FOLLOW_7);
            rule__UseCaseStep__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1__3"


    // $ANTLR start "rule__UseCaseStep__Group_1__3__Impl"
    // InternalUseCaseDslParser.g:1661:1: rule__UseCaseStep__Group_1__3__Impl : ( SYSTEM ) ;
    public final void rule__UseCaseStep__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1665:1: ( ( SYSTEM ) )
            // InternalUseCaseDslParser.g:1666:1: ( SYSTEM )
            {
            // InternalUseCaseDslParser.g:1666:1: ( SYSTEM )
            // InternalUseCaseDslParser.g:1667:2: SYSTEM
            {
             before(grammarAccess.getUseCaseStepAccess().getSYSTEMKeyword_1_3()); 
            match(input,SYSTEM,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getSYSTEMKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1__3__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_1__4"
    // InternalUseCaseDslParser.g:1676:1: rule__UseCaseStep__Group_1__4 : rule__UseCaseStep__Group_1__4__Impl ;
    public final void rule__UseCaseStep__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1680:1: ( rule__UseCaseStep__Group_1__4__Impl )
            // InternalUseCaseDslParser.g:1681:2: rule__UseCaseStep__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1__4"


    // $ANTLR start "rule__UseCaseStep__Group_1__4__Impl"
    // InternalUseCaseDslParser.g:1687:1: rule__UseCaseStep__Group_1__4__Impl : ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) ) ;
    public final void rule__UseCaseStep__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1691:1: ( ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) ) )
            // InternalUseCaseDslParser.g:1692:1: ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) )
            {
            // InternalUseCaseDslParser.g:1692:1: ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) )
            // InternalUseCaseDslParser.g:1693:2: ( rule__UseCaseStep__SentenceAssignment_1_4 )
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_1_4()); 
            // InternalUseCaseDslParser.g:1694:2: ( rule__UseCaseStep__SentenceAssignment_1_4 )
            // InternalUseCaseDslParser.g:1694:3: rule__UseCaseStep__SentenceAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__SentenceAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1__4__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_2__0"
    // InternalUseCaseDslParser.g:1703:1: rule__UseCaseStep__Group_2__0 : rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1 ;
    public final void rule__UseCaseStep__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1707:1: ( rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1 )
            // InternalUseCaseDslParser.g:1708:2: rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__UseCaseStep__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__0"


    // $ANTLR start "rule__UseCaseStep__Group_2__0__Impl"
    // InternalUseCaseDslParser.g:1715:1: rule__UseCaseStep__Group_2__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1719:1: ( ( () ) )
            // InternalUseCaseDslParser.g:1720:1: ( () )
            {
            // InternalUseCaseDslParser.g:1720:1: ( () )
            // InternalUseCaseDslParser.g:1721:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatingStepAction_2_0()); 
            // InternalUseCaseDslParser.g:1722:2: ()
            // InternalUseCaseDslParser.g:1722:3: 
            {
            }

             after(grammarAccess.getUseCaseStepAccess().getRepeatingStepAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__0__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_2__1"
    // InternalUseCaseDslParser.g:1730:1: rule__UseCaseStep__Group_2__1 : rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2 ;
    public final void rule__UseCaseStep__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1734:1: ( rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2 )
            // InternalUseCaseDslParser.g:1735:2: rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2
            {
            pushFollow(FOLLOW_13);
            rule__UseCaseStep__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__1"


    // $ANTLR start "rule__UseCaseStep__Group_2__1__Impl"
    // InternalUseCaseDslParser.g:1742:1: rule__UseCaseStep__Group_2__1__Impl : ( ( rule__UseCaseStep__NameAssignment_2_1 ) ) ;
    public final void rule__UseCaseStep__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1746:1: ( ( ( rule__UseCaseStep__NameAssignment_2_1 ) ) )
            // InternalUseCaseDslParser.g:1747:1: ( ( rule__UseCaseStep__NameAssignment_2_1 ) )
            {
            // InternalUseCaseDslParser.g:1747:1: ( ( rule__UseCaseStep__NameAssignment_2_1 ) )
            // InternalUseCaseDslParser.g:1748:2: ( rule__UseCaseStep__NameAssignment_2_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_2_1()); 
            // InternalUseCaseDslParser.g:1749:2: ( rule__UseCaseStep__NameAssignment_2_1 )
            // InternalUseCaseDslParser.g:1749:3: rule__UseCaseStep__NameAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__1__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_2__2"
    // InternalUseCaseDslParser.g:1757:1: rule__UseCaseStep__Group_2__2 : rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3 ;
    public final void rule__UseCaseStep__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1761:1: ( rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3 )
            // InternalUseCaseDslParser.g:1762:2: rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3
            {
            pushFollow(FOLLOW_21);
            rule__UseCaseStep__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__2"


    // $ANTLR start "rule__UseCaseStep__Group_2__2__Impl"
    // InternalUseCaseDslParser.g:1769:1: rule__UseCaseStep__Group_2__2__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1773:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1774:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1774:1: ( FullStop )
            // InternalUseCaseDslParser.g:1775:2: FullStop
            {
             before(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_2()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__2__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_2__3"
    // InternalUseCaseDslParser.g:1784:1: rule__UseCaseStep__Group_2__3 : rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4 ;
    public final void rule__UseCaseStep__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1788:1: ( rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4 )
            // InternalUseCaseDslParser.g:1789:2: rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4
            {
            pushFollow(FOLLOW_16);
            rule__UseCaseStep__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__3"


    // $ANTLR start "rule__UseCaseStep__Group_2__3__Impl"
    // InternalUseCaseDslParser.g:1796:1: rule__UseCaseStep__Group_2__3__Impl : ( WHILE ) ;
    public final void rule__UseCaseStep__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1800:1: ( ( WHILE ) )
            // InternalUseCaseDslParser.g:1801:1: ( WHILE )
            {
            // InternalUseCaseDslParser.g:1801:1: ( WHILE )
            // InternalUseCaseDslParser.g:1802:2: WHILE
            {
             before(grammarAccess.getUseCaseStepAccess().getWHILEKeyword_2_3()); 
            match(input,WHILE,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getWHILEKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__3__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_2__4"
    // InternalUseCaseDslParser.g:1811:1: rule__UseCaseStep__Group_2__4 : rule__UseCaseStep__Group_2__4__Impl rule__UseCaseStep__Group_2__5 ;
    public final void rule__UseCaseStep__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1815:1: ( rule__UseCaseStep__Group_2__4__Impl rule__UseCaseStep__Group_2__5 )
            // InternalUseCaseDslParser.g:1816:2: rule__UseCaseStep__Group_2__4__Impl rule__UseCaseStep__Group_2__5
            {
            pushFollow(FOLLOW_9);
            rule__UseCaseStep__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__4"


    // $ANTLR start "rule__UseCaseStep__Group_2__4__Impl"
    // InternalUseCaseDslParser.g:1823:1: rule__UseCaseStep__Group_2__4__Impl : ( ( rule__UseCaseStep__RepeatingConditionAssignment_2_4 ) ) ;
    public final void rule__UseCaseStep__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1827:1: ( ( ( rule__UseCaseStep__RepeatingConditionAssignment_2_4 ) ) )
            // InternalUseCaseDslParser.g:1828:1: ( ( rule__UseCaseStep__RepeatingConditionAssignment_2_4 ) )
            {
            // InternalUseCaseDslParser.g:1828:1: ( ( rule__UseCaseStep__RepeatingConditionAssignment_2_4 ) )
            // InternalUseCaseDslParser.g:1829:2: ( rule__UseCaseStep__RepeatingConditionAssignment_2_4 )
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatingConditionAssignment_2_4()); 
            // InternalUseCaseDslParser.g:1830:2: ( rule__UseCaseStep__RepeatingConditionAssignment_2_4 )
            // InternalUseCaseDslParser.g:1830:3: rule__UseCaseStep__RepeatingConditionAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__RepeatingConditionAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getRepeatingConditionAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__4__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_2__5"
    // InternalUseCaseDslParser.g:1838:1: rule__UseCaseStep__Group_2__5 : rule__UseCaseStep__Group_2__5__Impl rule__UseCaseStep__Group_2__6 ;
    public final void rule__UseCaseStep__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1842:1: ( rule__UseCaseStep__Group_2__5__Impl rule__UseCaseStep__Group_2__6 )
            // InternalUseCaseDslParser.g:1843:2: rule__UseCaseStep__Group_2__5__Impl rule__UseCaseStep__Group_2__6
            {
            pushFollow(FOLLOW_5);
            rule__UseCaseStep__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__5"


    // $ANTLR start "rule__UseCaseStep__Group_2__5__Impl"
    // InternalUseCaseDslParser.g:1850:1: rule__UseCaseStep__Group_2__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCaseStep__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1854:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:1855:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:1855:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:1856:2: RULE_BEGIN
            {
             before(grammarAccess.getUseCaseStepAccess().getBEGINTerminalRuleCall_2_5()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getBEGINTerminalRuleCall_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__5__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_2__6"
    // InternalUseCaseDslParser.g:1865:1: rule__UseCaseStep__Group_2__6 : rule__UseCaseStep__Group_2__6__Impl rule__UseCaseStep__Group_2__7 ;
    public final void rule__UseCaseStep__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1869:1: ( rule__UseCaseStep__Group_2__6__Impl rule__UseCaseStep__Group_2__7 )
            // InternalUseCaseDslParser.g:1870:2: rule__UseCaseStep__Group_2__6__Impl rule__UseCaseStep__Group_2__7
            {
            pushFollow(FOLLOW_10);
            rule__UseCaseStep__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__6"


    // $ANTLR start "rule__UseCaseStep__Group_2__6__Impl"
    // InternalUseCaseDslParser.g:1877:1: rule__UseCaseStep__Group_2__6__Impl : ( ( ( rule__UseCaseStep__Group_2_6__0 ) ) ( ( rule__UseCaseStep__Group_2_6__0 )* ) ) ;
    public final void rule__UseCaseStep__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1881:1: ( ( ( ( rule__UseCaseStep__Group_2_6__0 ) ) ( ( rule__UseCaseStep__Group_2_6__0 )* ) ) )
            // InternalUseCaseDslParser.g:1882:1: ( ( ( rule__UseCaseStep__Group_2_6__0 ) ) ( ( rule__UseCaseStep__Group_2_6__0 )* ) )
            {
            // InternalUseCaseDslParser.g:1882:1: ( ( ( rule__UseCaseStep__Group_2_6__0 ) ) ( ( rule__UseCaseStep__Group_2_6__0 )* ) )
            // InternalUseCaseDslParser.g:1883:2: ( ( rule__UseCaseStep__Group_2_6__0 ) ) ( ( rule__UseCaseStep__Group_2_6__0 )* )
            {
            // InternalUseCaseDslParser.g:1883:2: ( ( rule__UseCaseStep__Group_2_6__0 ) )
            // InternalUseCaseDslParser.g:1884:3: ( rule__UseCaseStep__Group_2_6__0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_2_6()); 
            // InternalUseCaseDslParser.g:1885:3: ( rule__UseCaseStep__Group_2_6__0 )
            // InternalUseCaseDslParser.g:1885:4: rule__UseCaseStep__Group_2_6__0
            {
            pushFollow(FOLLOW_11);
            rule__UseCaseStep__Group_2_6__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getGroup_2_6()); 

            }

            // InternalUseCaseDslParser.g:1888:2: ( ( rule__UseCaseStep__Group_2_6__0 )* )
            // InternalUseCaseDslParser.g:1889:3: ( rule__UseCaseStep__Group_2_6__0 )*
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_2_6()); 
            // InternalUseCaseDslParser.g:1890:3: ( rule__UseCaseStep__Group_2_6__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1890:4: rule__UseCaseStep__Group_2_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__UseCaseStep__Group_2_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getUseCaseStepAccess().getGroup_2_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__6__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_2__7"
    // InternalUseCaseDslParser.g:1899:1: rule__UseCaseStep__Group_2__7 : rule__UseCaseStep__Group_2__7__Impl ;
    public final void rule__UseCaseStep__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1903:1: ( rule__UseCaseStep__Group_2__7__Impl )
            // InternalUseCaseDslParser.g:1904:2: rule__UseCaseStep__Group_2__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__7"


    // $ANTLR start "rule__UseCaseStep__Group_2__7__Impl"
    // InternalUseCaseDslParser.g:1910:1: rule__UseCaseStep__Group_2__7__Impl : ( RULE_END ) ;
    public final void rule__UseCaseStep__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1914:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1915:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1915:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1916:2: RULE_END
            {
             before(grammarAccess.getUseCaseStepAccess().getENDTerminalRuleCall_2_7()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getENDTerminalRuleCall_2_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2__7__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_2_6__0"
    // InternalUseCaseDslParser.g:1926:1: rule__UseCaseStep__Group_2_6__0 : rule__UseCaseStep__Group_2_6__0__Impl rule__UseCaseStep__Group_2_6__1 ;
    public final void rule__UseCaseStep__Group_2_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1930:1: ( rule__UseCaseStep__Group_2_6__0__Impl rule__UseCaseStep__Group_2_6__1 )
            // InternalUseCaseDslParser.g:1931:2: rule__UseCaseStep__Group_2_6__0__Impl rule__UseCaseStep__Group_2_6__1
            {
            pushFollow(FOLLOW_13);
            rule__UseCaseStep__Group_2_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2_6__0"


    // $ANTLR start "rule__UseCaseStep__Group_2_6__0__Impl"
    // InternalUseCaseDslParser.g:1938:1: rule__UseCaseStep__Group_2_6__0__Impl : ( ( rule__UseCaseStep__FatherAssignment_2_6_0 ) ) ;
    public final void rule__UseCaseStep__Group_2_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1942:1: ( ( ( rule__UseCaseStep__FatherAssignment_2_6_0 ) ) )
            // InternalUseCaseDslParser.g:1943:1: ( ( rule__UseCaseStep__FatherAssignment_2_6_0 ) )
            {
            // InternalUseCaseDslParser.g:1943:1: ( ( rule__UseCaseStep__FatherAssignment_2_6_0 ) )
            // InternalUseCaseDslParser.g:1944:2: ( rule__UseCaseStep__FatherAssignment_2_6_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getFatherAssignment_2_6_0()); 
            // InternalUseCaseDslParser.g:1945:2: ( rule__UseCaseStep__FatherAssignment_2_6_0 )
            // InternalUseCaseDslParser.g:1945:3: rule__UseCaseStep__FatherAssignment_2_6_0
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__FatherAssignment_2_6_0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getFatherAssignment_2_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2_6__0__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_2_6__1"
    // InternalUseCaseDslParser.g:1953:1: rule__UseCaseStep__Group_2_6__1 : rule__UseCaseStep__Group_2_6__1__Impl rule__UseCaseStep__Group_2_6__2 ;
    public final void rule__UseCaseStep__Group_2_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1957:1: ( rule__UseCaseStep__Group_2_6__1__Impl rule__UseCaseStep__Group_2_6__2 )
            // InternalUseCaseDslParser.g:1958:2: rule__UseCaseStep__Group_2_6__1__Impl rule__UseCaseStep__Group_2_6__2
            {
            pushFollow(FOLLOW_5);
            rule__UseCaseStep__Group_2_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2_6__1"


    // $ANTLR start "rule__UseCaseStep__Group_2_6__1__Impl"
    // InternalUseCaseDslParser.g:1965:1: rule__UseCaseStep__Group_2_6__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_2_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1969:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1970:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1970:1: ( FullStop )
            // InternalUseCaseDslParser.g:1971:2: FullStop
            {
             before(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_6_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2_6__1__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_2_6__2"
    // InternalUseCaseDslParser.g:1980:1: rule__UseCaseStep__Group_2_6__2 : rule__UseCaseStep__Group_2_6__2__Impl ;
    public final void rule__UseCaseStep__Group_2_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1984:1: ( rule__UseCaseStep__Group_2_6__2__Impl )
            // InternalUseCaseDslParser.g:1985:2: rule__UseCaseStep__Group_2_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2_6__2"


    // $ANTLR start "rule__UseCaseStep__Group_2_6__2__Impl"
    // InternalUseCaseDslParser.g:1991:1: rule__UseCaseStep__Group_2_6__2__Impl : ( ( rule__UseCaseStep__RepeatflowAssignment_2_6_2 ) ) ;
    public final void rule__UseCaseStep__Group_2_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1995:1: ( ( ( rule__UseCaseStep__RepeatflowAssignment_2_6_2 ) ) )
            // InternalUseCaseDslParser.g:1996:1: ( ( rule__UseCaseStep__RepeatflowAssignment_2_6_2 ) )
            {
            // InternalUseCaseDslParser.g:1996:1: ( ( rule__UseCaseStep__RepeatflowAssignment_2_6_2 ) )
            // InternalUseCaseDslParser.g:1997:2: ( rule__UseCaseStep__RepeatflowAssignment_2_6_2 )
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatflowAssignment_2_6_2()); 
            // InternalUseCaseDslParser.g:1998:2: ( rule__UseCaseStep__RepeatflowAssignment_2_6_2 )
            // InternalUseCaseDslParser.g:1998:3: rule__UseCaseStep__RepeatflowAssignment_2_6_2
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__RepeatflowAssignment_2_6_2();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getRepeatflowAssignment_2_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2_6__2__Impl"


    // $ANTLR start "rule__ExtensionStep__Group_0__0"
    // InternalUseCaseDslParser.g:2007:1: rule__ExtensionStep__Group_0__0 : rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1 ;
    public final void rule__ExtensionStep__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2011:1: ( rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1 )
            // InternalUseCaseDslParser.g:2012:2: rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__ExtensionStep__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_0__0"


    // $ANTLR start "rule__ExtensionStep__Group_0__0__Impl"
    // InternalUseCaseDslParser.g:2019:1: rule__ExtensionStep__Group_0__0__Impl : ( ( rule__ExtensionStep__NameAssignment_0_0 ) ) ;
    public final void rule__ExtensionStep__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2023:1: ( ( ( rule__ExtensionStep__NameAssignment_0_0 ) ) )
            // InternalUseCaseDslParser.g:2024:1: ( ( rule__ExtensionStep__NameAssignment_0_0 ) )
            {
            // InternalUseCaseDslParser.g:2024:1: ( ( rule__ExtensionStep__NameAssignment_0_0 ) )
            // InternalUseCaseDslParser.g:2025:2: ( rule__ExtensionStep__NameAssignment_0_0 )
            {
             before(grammarAccess.getExtensionStepAccess().getNameAssignment_0_0()); 
            // InternalUseCaseDslParser.g:2026:2: ( rule__ExtensionStep__NameAssignment_0_0 )
            // InternalUseCaseDslParser.g:2026:3: rule__ExtensionStep__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionStepAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_0__0__Impl"


    // $ANTLR start "rule__ExtensionStep__Group_0__1"
    // InternalUseCaseDslParser.g:2034:1: rule__ExtensionStep__Group_0__1 : rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2 ;
    public final void rule__ExtensionStep__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2038:1: ( rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2 )
            // InternalUseCaseDslParser.g:2039:2: rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2
            {
            pushFollow(FOLLOW_22);
            rule__ExtensionStep__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_0__1"


    // $ANTLR start "rule__ExtensionStep__Group_0__1__Impl"
    // InternalUseCaseDslParser.g:2046:1: rule__ExtensionStep__Group_0__1__Impl : ( FullStop ) ;
    public final void rule__ExtensionStep__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2050:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2051:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2051:1: ( FullStop )
            // InternalUseCaseDslParser.g:2052:2: FullStop
            {
             before(grammarAccess.getExtensionStepAccess().getFullStopKeyword_0_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getExtensionStepAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_0__1__Impl"


    // $ANTLR start "rule__ExtensionStep__Group_0__2"
    // InternalUseCaseDslParser.g:2061:1: rule__ExtensionStep__Group_0__2 : rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3 ;
    public final void rule__ExtensionStep__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2065:1: ( rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3 )
            // InternalUseCaseDslParser.g:2066:2: rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3
            {
            pushFollow(FOLLOW_22);
            rule__ExtensionStep__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_0__2"


    // $ANTLR start "rule__ExtensionStep__Group_0__2__Impl"
    // InternalUseCaseDslParser.g:2073:1: rule__ExtensionStep__Group_0__2__Impl : ( ( rule__ExtensionStep__Alternatives_0_2 )? ) ;
    public final void rule__ExtensionStep__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2077:1: ( ( ( rule__ExtensionStep__Alternatives_0_2 )? ) )
            // InternalUseCaseDslParser.g:2078:1: ( ( rule__ExtensionStep__Alternatives_0_2 )? )
            {
            // InternalUseCaseDslParser.g:2078:1: ( ( rule__ExtensionStep__Alternatives_0_2 )? )
            // InternalUseCaseDslParser.g:2079:2: ( rule__ExtensionStep__Alternatives_0_2 )?
            {
             before(grammarAccess.getExtensionStepAccess().getAlternatives_0_2()); 
            // InternalUseCaseDslParser.g:2080:2: ( rule__ExtensionStep__Alternatives_0_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=SYSTEM && LA17_0<=USER)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUseCaseDslParser.g:2080:3: rule__ExtensionStep__Alternatives_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtensionStep__Alternatives_0_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtensionStepAccess().getAlternatives_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_0__2__Impl"


    // $ANTLR start "rule__ExtensionStep__Group_0__3"
    // InternalUseCaseDslParser.g:2088:1: rule__ExtensionStep__Group_0__3 : rule__ExtensionStep__Group_0__3__Impl ;
    public final void rule__ExtensionStep__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2092:1: ( rule__ExtensionStep__Group_0__3__Impl )
            // InternalUseCaseDslParser.g:2093:2: rule__ExtensionStep__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_0__3"


    // $ANTLR start "rule__ExtensionStep__Group_0__3__Impl"
    // InternalUseCaseDslParser.g:2099:1: rule__ExtensionStep__Group_0__3__Impl : ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) ) ;
    public final void rule__ExtensionStep__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2103:1: ( ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) ) )
            // InternalUseCaseDslParser.g:2104:1: ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) )
            {
            // InternalUseCaseDslParser.g:2104:1: ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) )
            // InternalUseCaseDslParser.g:2105:2: ( rule__ExtensionStep__SentenceAssignment_0_3 )
            {
             before(grammarAccess.getExtensionStepAccess().getSentenceAssignment_0_3()); 
            // InternalUseCaseDslParser.g:2106:2: ( rule__ExtensionStep__SentenceAssignment_0_3 )
            // InternalUseCaseDslParser.g:2106:3: rule__ExtensionStep__SentenceAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__SentenceAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getExtensionStepAccess().getSentenceAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_0__3__Impl"


    // $ANTLR start "rule__DeadEndStep__Group__0"
    // InternalUseCaseDslParser.g:2115:1: rule__DeadEndStep__Group__0 : rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1 ;
    public final void rule__DeadEndStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2119:1: ( rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1 )
            // InternalUseCaseDslParser.g:2120:2: rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DeadEndStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeadEndStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeadEndStep__Group__0"


    // $ANTLR start "rule__DeadEndStep__Group__0__Impl"
    // InternalUseCaseDslParser.g:2127:1: rule__DeadEndStep__Group__0__Impl : ( ( rule__DeadEndStep__NameAssignment_0 ) ) ;
    public final void rule__DeadEndStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2131:1: ( ( ( rule__DeadEndStep__NameAssignment_0 ) ) )
            // InternalUseCaseDslParser.g:2132:1: ( ( rule__DeadEndStep__NameAssignment_0 ) )
            {
            // InternalUseCaseDslParser.g:2132:1: ( ( rule__DeadEndStep__NameAssignment_0 ) )
            // InternalUseCaseDslParser.g:2133:2: ( rule__DeadEndStep__NameAssignment_0 )
            {
             before(grammarAccess.getDeadEndStepAccess().getNameAssignment_0()); 
            // InternalUseCaseDslParser.g:2134:2: ( rule__DeadEndStep__NameAssignment_0 )
            // InternalUseCaseDslParser.g:2134:3: rule__DeadEndStep__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DeadEndStep__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeadEndStepAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeadEndStep__Group__0__Impl"


    // $ANTLR start "rule__DeadEndStep__Group__1"
    // InternalUseCaseDslParser.g:2142:1: rule__DeadEndStep__Group__1 : rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2 ;
    public final void rule__DeadEndStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2146:1: ( rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2 )
            // InternalUseCaseDslParser.g:2147:2: rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__DeadEndStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeadEndStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeadEndStep__Group__1"


    // $ANTLR start "rule__DeadEndStep__Group__1__Impl"
    // InternalUseCaseDslParser.g:2154:1: rule__DeadEndStep__Group__1__Impl : ( FullStop ) ;
    public final void rule__DeadEndStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2158:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2159:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2159:1: ( FullStop )
            // InternalUseCaseDslParser.g:2160:2: FullStop
            {
             before(grammarAccess.getDeadEndStepAccess().getFullStopKeyword_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getDeadEndStepAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeadEndStep__Group__1__Impl"


    // $ANTLR start "rule__DeadEndStep__Group__2"
    // InternalUseCaseDslParser.g:2169:1: rule__DeadEndStep__Group__2 : rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3 ;
    public final void rule__DeadEndStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2173:1: ( rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3 )
            // InternalUseCaseDslParser.g:2174:2: rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__DeadEndStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeadEndStep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeadEndStep__Group__2"


    // $ANTLR start "rule__DeadEndStep__Group__2__Impl"
    // InternalUseCaseDslParser.g:2181:1: rule__DeadEndStep__Group__2__Impl : ( ( rule__DeadEndStep__Alternatives_2 )? ) ;
    public final void rule__DeadEndStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2185:1: ( ( ( rule__DeadEndStep__Alternatives_2 )? ) )
            // InternalUseCaseDslParser.g:2186:1: ( ( rule__DeadEndStep__Alternatives_2 )? )
            {
            // InternalUseCaseDslParser.g:2186:1: ( ( rule__DeadEndStep__Alternatives_2 )? )
            // InternalUseCaseDslParser.g:2187:2: ( rule__DeadEndStep__Alternatives_2 )?
            {
             before(grammarAccess.getDeadEndStepAccess().getAlternatives_2()); 
            // InternalUseCaseDslParser.g:2188:2: ( rule__DeadEndStep__Alternatives_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=SYSTEM && LA18_0<=USER)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUseCaseDslParser.g:2188:3: rule__DeadEndStep__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeadEndStep__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeadEndStepAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeadEndStep__Group__2__Impl"


    // $ANTLR start "rule__DeadEndStep__Group__3"
    // InternalUseCaseDslParser.g:2196:1: rule__DeadEndStep__Group__3 : rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4 ;
    public final void rule__DeadEndStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2200:1: ( rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4 )
            // InternalUseCaseDslParser.g:2201:2: rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__DeadEndStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeadEndStep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeadEndStep__Group__3"


    // $ANTLR start "rule__DeadEndStep__Group__3__Impl"
    // InternalUseCaseDslParser.g:2208:1: rule__DeadEndStep__Group__3__Impl : ( ( rule__DeadEndStep__SentenceAssignment_3 )? ) ;
    public final void rule__DeadEndStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2212:1: ( ( ( rule__DeadEndStep__SentenceAssignment_3 )? ) )
            // InternalUseCaseDslParser.g:2213:1: ( ( rule__DeadEndStep__SentenceAssignment_3 )? )
            {
            // InternalUseCaseDslParser.g:2213:1: ( ( rule__DeadEndStep__SentenceAssignment_3 )? )
            // InternalUseCaseDslParser.g:2214:2: ( rule__DeadEndStep__SentenceAssignment_3 )?
            {
             before(grammarAccess.getDeadEndStepAccess().getSentenceAssignment_3()); 
            // InternalUseCaseDslParser.g:2215:2: ( rule__DeadEndStep__SentenceAssignment_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=QuotationMark && LA19_0<=RULE_CHAR)||LA19_0==RULE_ID||LA19_0==RULE_ANY_OTHER) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUseCaseDslParser.g:2215:3: rule__DeadEndStep__SentenceAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeadEndStep__SentenceAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeadEndStepAccess().getSentenceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeadEndStep__Group__3__Impl"


    // $ANTLR start "rule__DeadEndStep__Group__4"
    // InternalUseCaseDslParser.g:2223:1: rule__DeadEndStep__Group__4 : rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5 ;
    public final void rule__DeadEndStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2227:1: ( rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5 )
            // InternalUseCaseDslParser.g:2228:2: rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__DeadEndStep__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeadEndStep__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeadEndStep__Group__4"


    // $ANTLR start "rule__DeadEndStep__Group__4__Impl"
    // InternalUseCaseDslParser.g:2235:1: rule__DeadEndStep__Group__4__Impl : ( UC ) ;
    public final void rule__DeadEndStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2239:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:2240:1: ( UC )
            {
            // InternalUseCaseDslParser.g:2240:1: ( UC )
            // InternalUseCaseDslParser.g:2241:2: UC
            {
             before(grammarAccess.getDeadEndStepAccess().getUCKeyword_4()); 
            match(input,UC,FOLLOW_2); 
             after(grammarAccess.getDeadEndStepAccess().getUCKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeadEndStep__Group__4__Impl"


    // $ANTLR start "rule__DeadEndStep__Group__5"
    // InternalUseCaseDslParser.g:2250:1: rule__DeadEndStep__Group__5 : rule__DeadEndStep__Group__5__Impl ;
    public final void rule__DeadEndStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2254:1: ( rule__DeadEndStep__Group__5__Impl )
            // InternalUseCaseDslParser.g:2255:2: rule__DeadEndStep__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeadEndStep__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeadEndStep__Group__5"


    // $ANTLR start "rule__DeadEndStep__Group__5__Impl"
    // InternalUseCaseDslParser.g:2261:1: rule__DeadEndStep__Group__5__Impl : ( END ) ;
    public final void rule__DeadEndStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2265:1: ( ( END ) )
            // InternalUseCaseDslParser.g:2266:1: ( END )
            {
            // InternalUseCaseDslParser.g:2266:1: ( END )
            // InternalUseCaseDslParser.g:2267:2: END
            {
             before(grammarAccess.getDeadEndStepAccess().getENDKeyword_5()); 
            match(input,END,FOLLOW_2); 
             after(grammarAccess.getDeadEndStepAccess().getENDKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeadEndStep__Group__5__Impl"


    // $ANTLR start "rule__Precondition__Group__0"
    // InternalUseCaseDslParser.g:2277:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2281:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalUseCaseDslParser.g:2282:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Precondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__0"


    // $ANTLR start "rule__Precondition__Group__0__Impl"
    // InternalUseCaseDslParser.g:2289:1: rule__Precondition__Group__0__Impl : ( ( rule__Precondition__NameAssignment_0 ) ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2293:1: ( ( ( rule__Precondition__NameAssignment_0 ) ) )
            // InternalUseCaseDslParser.g:2294:1: ( ( rule__Precondition__NameAssignment_0 ) )
            {
            // InternalUseCaseDslParser.g:2294:1: ( ( rule__Precondition__NameAssignment_0 ) )
            // InternalUseCaseDslParser.g:2295:2: ( rule__Precondition__NameAssignment_0 )
            {
             before(grammarAccess.getPreconditionAccess().getNameAssignment_0()); 
            // InternalUseCaseDslParser.g:2296:2: ( rule__Precondition__NameAssignment_0 )
            // InternalUseCaseDslParser.g:2296:3: rule__Precondition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__0__Impl"


    // $ANTLR start "rule__Precondition__Group__1"
    // InternalUseCaseDslParser.g:2304:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl rule__Precondition__Group__2 ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2308:1: ( rule__Precondition__Group__1__Impl rule__Precondition__Group__2 )
            // InternalUseCaseDslParser.g:2309:2: rule__Precondition__Group__1__Impl rule__Precondition__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Precondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Precondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__1"


    // $ANTLR start "rule__Precondition__Group__1__Impl"
    // InternalUseCaseDslParser.g:2316:1: rule__Precondition__Group__1__Impl : ( Colon ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2320:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:2321:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:2321:1: ( Colon )
            // InternalUseCaseDslParser.g:2322:2: Colon
            {
             before(grammarAccess.getPreconditionAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPreconditionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__1__Impl"


    // $ANTLR start "rule__Precondition__Group__2"
    // InternalUseCaseDslParser.g:2331:1: rule__Precondition__Group__2 : rule__Precondition__Group__2__Impl ;
    public final void rule__Precondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2335:1: ( rule__Precondition__Group__2__Impl )
            // InternalUseCaseDslParser.g:2336:2: rule__Precondition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__2"


    // $ANTLR start "rule__Precondition__Group__2__Impl"
    // InternalUseCaseDslParser.g:2342:1: rule__Precondition__Group__2__Impl : ( ( rule__Precondition__ConditionAssignment_2 ) ) ;
    public final void rule__Precondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2346:1: ( ( ( rule__Precondition__ConditionAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:2347:1: ( ( rule__Precondition__ConditionAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:2347:1: ( ( rule__Precondition__ConditionAssignment_2 ) )
            // InternalUseCaseDslParser.g:2348:2: ( rule__Precondition__ConditionAssignment_2 )
            {
             before(grammarAccess.getPreconditionAccess().getConditionAssignment_2()); 
            // InternalUseCaseDslParser.g:2349:2: ( rule__Precondition__ConditionAssignment_2 )
            // InternalUseCaseDslParser.g:2349:3: rule__Precondition__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Precondition__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPreconditionAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__Group__2__Impl"


    // $ANTLR start "rule__Postcondition__Group__0"
    // InternalUseCaseDslParser.g:2358:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2362:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalUseCaseDslParser.g:2363:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Postcondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__0"


    // $ANTLR start "rule__Postcondition__Group__0__Impl"
    // InternalUseCaseDslParser.g:2370:1: rule__Postcondition__Group__0__Impl : ( ( rule__Postcondition__NameAssignment_0 ) ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2374:1: ( ( ( rule__Postcondition__NameAssignment_0 ) ) )
            // InternalUseCaseDslParser.g:2375:1: ( ( rule__Postcondition__NameAssignment_0 ) )
            {
            // InternalUseCaseDslParser.g:2375:1: ( ( rule__Postcondition__NameAssignment_0 ) )
            // InternalUseCaseDslParser.g:2376:2: ( rule__Postcondition__NameAssignment_0 )
            {
             before(grammarAccess.getPostconditionAccess().getNameAssignment_0()); 
            // InternalUseCaseDslParser.g:2377:2: ( rule__Postcondition__NameAssignment_0 )
            // InternalUseCaseDslParser.g:2377:3: rule__Postcondition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPostconditionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__0__Impl"


    // $ANTLR start "rule__Postcondition__Group__1"
    // InternalUseCaseDslParser.g:2385:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2389:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalUseCaseDslParser.g:2390:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Postcondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__1"


    // $ANTLR start "rule__Postcondition__Group__1__Impl"
    // InternalUseCaseDslParser.g:2397:1: rule__Postcondition__Group__1__Impl : ( Colon ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2401:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:2402:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:2402:1: ( Colon )
            // InternalUseCaseDslParser.g:2403:2: Colon
            {
             before(grammarAccess.getPostconditionAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPostconditionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__1__Impl"


    // $ANTLR start "rule__Postcondition__Group__2"
    // InternalUseCaseDslParser.g:2412:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2416:1: ( rule__Postcondition__Group__2__Impl )
            // InternalUseCaseDslParser.g:2417:2: rule__Postcondition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__2"


    // $ANTLR start "rule__Postcondition__Group__2__Impl"
    // InternalUseCaseDslParser.g:2423:1: rule__Postcondition__Group__2__Impl : ( ( rule__Postcondition__ConditionAssignment_2 ) ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2427:1: ( ( ( rule__Postcondition__ConditionAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:2428:1: ( ( rule__Postcondition__ConditionAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:2428:1: ( ( rule__Postcondition__ConditionAssignment_2 ) )
            // InternalUseCaseDslParser.g:2429:2: ( rule__Postcondition__ConditionAssignment_2 )
            {
             before(grammarAccess.getPostconditionAccess().getConditionAssignment_2()); 
            // InternalUseCaseDslParser.g:2430:2: ( rule__Postcondition__ConditionAssignment_2 )
            // InternalUseCaseDslParser.g:2430:3: rule__Postcondition__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Postcondition__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPostconditionAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__Group__2__Impl"


    // $ANTLR start "rule__UseCase__NumberAssignment_1"
    // InternalUseCaseDslParser.g:2439:1: rule__UseCase__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__UseCase__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2443:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:2444:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:2444:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:2445:3: RULE_INT
            {
             before(grammarAccess.getUseCaseAccess().getNumberINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getNumberINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__NumberAssignment_1"


    // $ANTLR start "rule__UseCase__NameAssignment_3"
    // InternalUseCaseDslParser.g:2454:1: rule__UseCase__NameAssignment_3 : ( ruleLongName ) ;
    public final void rule__UseCase__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2458:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:2459:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:2459:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:2460:3: ruleLongName
            {
             before(grammarAccess.getUseCaseAccess().getNameLongNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLongName();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getNameLongNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__NameAssignment_3"


    // $ANTLR start "rule__UseCase__PreconditionAssignment_4"
    // InternalUseCaseDslParser.g:2469:1: rule__UseCase__PreconditionAssignment_4 : ( rulePrecondition ) ;
    public final void rule__UseCase__PreconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2473:1: ( ( rulePrecondition ) )
            // InternalUseCaseDslParser.g:2474:2: ( rulePrecondition )
            {
            // InternalUseCaseDslParser.g:2474:2: ( rulePrecondition )
            // InternalUseCaseDslParser.g:2475:3: rulePrecondition
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionPreconditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePrecondition();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getPreconditionPreconditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__PreconditionAssignment_4"


    // $ANTLR start "rule__UseCase__PostconditionAssignment_5"
    // InternalUseCaseDslParser.g:2484:1: rule__UseCase__PostconditionAssignment_5 : ( rulePostcondition ) ;
    public final void rule__UseCase__PostconditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2488:1: ( ( rulePostcondition ) )
            // InternalUseCaseDslParser.g:2489:2: ( rulePostcondition )
            {
            // InternalUseCaseDslParser.g:2489:2: ( rulePostcondition )
            // InternalUseCaseDslParser.g:2490:3: rulePostcondition
            {
             before(grammarAccess.getUseCaseAccess().getPostconditionPostconditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePostcondition();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getPostconditionPostconditionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__PostconditionAssignment_5"


    // $ANTLR start "rule__UseCase__MainflowAssignment_6"
    // InternalUseCaseDslParser.g:2499:1: rule__UseCase__MainflowAssignment_6 : ( ( MAINFLOW ) ) ;
    public final void rule__UseCase__MainflowAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2503:1: ( ( ( MAINFLOW ) ) )
            // InternalUseCaseDslParser.g:2504:2: ( ( MAINFLOW ) )
            {
            // InternalUseCaseDslParser.g:2504:2: ( ( MAINFLOW ) )
            // InternalUseCaseDslParser.g:2505:3: ( MAINFLOW )
            {
             before(grammarAccess.getUseCaseAccess().getMainflowMAINFLOWKeyword_6_0()); 
            // InternalUseCaseDslParser.g:2506:3: ( MAINFLOW )
            // InternalUseCaseDslParser.g:2507:4: MAINFLOW
            {
             before(grammarAccess.getUseCaseAccess().getMainflowMAINFLOWKeyword_6_0()); 
            match(input,MAINFLOW,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getMainflowMAINFLOWKeyword_6_0()); 

            }

             after(grammarAccess.getUseCaseAccess().getMainflowMAINFLOWKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__MainflowAssignment_6"


    // $ANTLR start "rule__UseCase__StepsAssignment_9"
    // InternalUseCaseDslParser.g:2518:1: rule__UseCase__StepsAssignment_9 : ( ruleUseCaseStep ) ;
    public final void rule__UseCase__StepsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2522:1: ( ( ruleUseCaseStep ) )
            // InternalUseCaseDslParser.g:2523:2: ( ruleUseCaseStep )
            {
            // InternalUseCaseDslParser.g:2523:2: ( ruleUseCaseStep )
            // InternalUseCaseDslParser.g:2524:3: ruleUseCaseStep
            {
             before(grammarAccess.getUseCaseAccess().getStepsUseCaseStepParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCaseStep();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getStepsUseCaseStepParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__StepsAssignment_9"


    // $ANTLR start "rule__UseCase__DeclareofflowAssignment_11_0"
    // InternalUseCaseDslParser.g:2533:1: rule__UseCase__DeclareofflowAssignment_11_0 : ( ( ALTERNATIVEFLOW ) ) ;
    public final void rule__UseCase__DeclareofflowAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2537:1: ( ( ( ALTERNATIVEFLOW ) ) )
            // InternalUseCaseDslParser.g:2538:2: ( ( ALTERNATIVEFLOW ) )
            {
            // InternalUseCaseDslParser.g:2538:2: ( ( ALTERNATIVEFLOW ) )
            // InternalUseCaseDslParser.g:2539:3: ( ALTERNATIVEFLOW )
            {
             before(grammarAccess.getUseCaseAccess().getDeclareofflowALTERNATIVEFLOWKeyword_11_0_0()); 
            // InternalUseCaseDslParser.g:2540:3: ( ALTERNATIVEFLOW )
            // InternalUseCaseDslParser.g:2541:4: ALTERNATIVEFLOW
            {
             before(grammarAccess.getUseCaseAccess().getDeclareofflowALTERNATIVEFLOWKeyword_11_0_0()); 
            match(input,ALTERNATIVEFLOW,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getDeclareofflowALTERNATIVEFLOWKeyword_11_0_0()); 

            }

             after(grammarAccess.getUseCaseAccess().getDeclareofflowALTERNATIVEFLOWKeyword_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__DeclareofflowAssignment_11_0"


    // $ANTLR start "rule__UseCase__AlternativeflowsAssignment_11_3"
    // InternalUseCaseDslParser.g:2552:1: rule__UseCase__AlternativeflowsAssignment_11_3 : ( ruleExtension ) ;
    public final void rule__UseCase__AlternativeflowsAssignment_11_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2556:1: ( ( ruleExtension ) )
            // InternalUseCaseDslParser.g:2557:2: ( ruleExtension )
            {
            // InternalUseCaseDslParser.g:2557:2: ( ruleExtension )
            // InternalUseCaseDslParser.g:2558:3: ruleExtension
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsExtensionParserRuleCall_11_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExtension();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getAlternativeflowsExtensionParserRuleCall_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__AlternativeflowsAssignment_11_3"


    // $ANTLR start "rule__Extension__StartFromAssignment_0"
    // InternalUseCaseDslParser.g:2567:1: rule__Extension__StartFromAssignment_0 : ( RULE_INT ) ;
    public final void rule__Extension__StartFromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2571:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:2572:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:2572:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:2573:3: RULE_INT
            {
             before(grammarAccess.getExtensionAccess().getStartFromINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getStartFromINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__StartFromAssignment_0"


    // $ANTLR start "rule__Extension__NameAssignment_2"
    // InternalUseCaseDslParser.g:2582:1: rule__Extension__NameAssignment_2 : ( RULE_CHAR ) ;
    public final void rule__Extension__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2586:1: ( ( RULE_CHAR ) )
            // InternalUseCaseDslParser.g:2587:2: ( RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:2587:2: ( RULE_CHAR )
            // InternalUseCaseDslParser.g:2588:3: RULE_CHAR
            {
             before(grammarAccess.getExtensionAccess().getNameCHARTerminalRuleCall_2_0()); 
            match(input,RULE_CHAR,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getNameCHARTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__NameAssignment_2"


    // $ANTLR start "rule__Extension__ConditionAssignment_5"
    // InternalUseCaseDslParser.g:2597:1: rule__Extension__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__Extension__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2601:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:2602:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:2602:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:2603:3: ruleCondition
            {
             before(grammarAccess.getExtensionAccess().getConditionConditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getConditionConditionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__ConditionAssignment_5"


    // $ANTLR start "rule__Extension__StepsAssignment_7"
    // InternalUseCaseDslParser.g:2612:1: rule__Extension__StepsAssignment_7 : ( ruleExtensionStep ) ;
    public final void rule__Extension__StepsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2616:1: ( ( ruleExtensionStep ) )
            // InternalUseCaseDslParser.g:2617:2: ( ruleExtensionStep )
            {
            // InternalUseCaseDslParser.g:2617:2: ( ruleExtensionStep )
            // InternalUseCaseDslParser.g:2618:3: ruleExtensionStep
            {
             before(grammarAccess.getExtensionAccess().getStepsExtensionStepParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleExtensionStep();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getStepsExtensionStepParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__StepsAssignment_7"


    // $ANTLR start "rule__Extension__ResumeAtAssignment_8_0_4"
    // InternalUseCaseDslParser.g:2627:1: rule__Extension__ResumeAtAssignment_8_0_4 : ( RULE_INT ) ;
    public final void rule__Extension__ResumeAtAssignment_8_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2631:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:2632:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:2632:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:2633:3: RULE_INT
            {
             before(grammarAccess.getExtensionAccess().getResumeAtINTTerminalRuleCall_8_0_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getResumeAtINTTerminalRuleCall_8_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__ResumeAtAssignment_8_0_4"


    // $ANTLR start "rule__Extension__EndAssignment_8_1"
    // InternalUseCaseDslParser.g:2642:1: rule__Extension__EndAssignment_8_1 : ( ruleDeadEndStep ) ;
    public final void rule__Extension__EndAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2646:1: ( ( ruleDeadEndStep ) )
            // InternalUseCaseDslParser.g:2647:2: ( ruleDeadEndStep )
            {
            // InternalUseCaseDslParser.g:2647:2: ( ruleDeadEndStep )
            // InternalUseCaseDslParser.g:2648:3: ruleDeadEndStep
            {
             before(grammarAccess.getExtensionAccess().getEndDeadEndStepParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeadEndStep();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getEndDeadEndStepParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__EndAssignment_8_1"


    // $ANTLR start "rule__UseCaseStep__NameAssignment_0_1"
    // InternalUseCaseDslParser.g:2657:1: rule__UseCaseStep__NameAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__UseCaseStep__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2661:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:2662:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:2662:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:2663:3: RULE_INT
            {
             before(grammarAccess.getUseCaseStepAccess().getNameINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getNameINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__NameAssignment_0_1"


    // $ANTLR start "rule__UseCaseStep__SentenceAssignment_0_4"
    // InternalUseCaseDslParser.g:2672:1: rule__UseCaseStep__SentenceAssignment_0_4 : ( ruleLongName ) ;
    public final void rule__UseCaseStep__SentenceAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2676:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:2677:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:2677:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:2678:3: ruleLongName
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLongName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__SentenceAssignment_0_4"


    // $ANTLR start "rule__UseCaseStep__NameAssignment_1_1"
    // InternalUseCaseDslParser.g:2687:1: rule__UseCaseStep__NameAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__UseCaseStep__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2691:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:2692:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:2692:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:2693:3: RULE_INT
            {
             before(grammarAccess.getUseCaseStepAccess().getNameINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getNameINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__NameAssignment_1_1"


    // $ANTLR start "rule__UseCaseStep__SentenceAssignment_1_4"
    // InternalUseCaseDslParser.g:2702:1: rule__UseCaseStep__SentenceAssignment_1_4 : ( ruleLongName ) ;
    public final void rule__UseCaseStep__SentenceAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2706:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:2707:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:2707:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:2708:3: ruleLongName
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_1_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLongName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__SentenceAssignment_1_4"


    // $ANTLR start "rule__UseCaseStep__NameAssignment_2_1"
    // InternalUseCaseDslParser.g:2717:1: rule__UseCaseStep__NameAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__UseCaseStep__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2721:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:2722:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:2722:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:2723:3: RULE_INT
            {
             before(grammarAccess.getUseCaseStepAccess().getNameINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getNameINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__NameAssignment_2_1"


    // $ANTLR start "rule__UseCaseStep__RepeatingConditionAssignment_2_4"
    // InternalUseCaseDslParser.g:2732:1: rule__UseCaseStep__RepeatingConditionAssignment_2_4 : ( ruleCondition ) ;
    public final void rule__UseCaseStep__RepeatingConditionAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2736:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:2737:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:2737:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:2738:3: ruleCondition
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatingConditionConditionParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getRepeatingConditionConditionParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__RepeatingConditionAssignment_2_4"


    // $ANTLR start "rule__UseCaseStep__FatherAssignment_2_6_0"
    // InternalUseCaseDslParser.g:2747:1: rule__UseCaseStep__FatherAssignment_2_6_0 : ( RULE_INT ) ;
    public final void rule__UseCaseStep__FatherAssignment_2_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2751:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:2752:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:2752:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:2753:3: RULE_INT
            {
             before(grammarAccess.getUseCaseStepAccess().getFatherINTTerminalRuleCall_2_6_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFatherINTTerminalRuleCall_2_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__FatherAssignment_2_6_0"


    // $ANTLR start "rule__UseCaseStep__RepeatflowAssignment_2_6_2"
    // InternalUseCaseDslParser.g:2762:1: rule__UseCaseStep__RepeatflowAssignment_2_6_2 : ( ruleUseCaseStep ) ;
    public final void rule__UseCaseStep__RepeatflowAssignment_2_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2766:1: ( ( ruleUseCaseStep ) )
            // InternalUseCaseDslParser.g:2767:2: ( ruleUseCaseStep )
            {
            // InternalUseCaseDslParser.g:2767:2: ( ruleUseCaseStep )
            // InternalUseCaseDslParser.g:2768:3: ruleUseCaseStep
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatflowUseCaseStepParserRuleCall_2_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCaseStep();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getRepeatflowUseCaseStepParserRuleCall_2_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__RepeatflowAssignment_2_6_2"


    // $ANTLR start "rule__ExtensionStep__NameAssignment_0_0"
    // InternalUseCaseDslParser.g:2777:1: rule__ExtensionStep__NameAssignment_0_0 : ( RULE_INT ) ;
    public final void rule__ExtensionStep__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2781:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:2782:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:2782:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:2783:3: RULE_INT
            {
             before(grammarAccess.getExtensionStepAccess().getNameINTTerminalRuleCall_0_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExtensionStepAccess().getNameINTTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__NameAssignment_0_0"


    // $ANTLR start "rule__ExtensionStep__SentenceAssignment_0_3"
    // InternalUseCaseDslParser.g:2792:1: rule__ExtensionStep__SentenceAssignment_0_3 : ( ruleLongName ) ;
    public final void rule__ExtensionStep__SentenceAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2796:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:2797:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:2797:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:2798:3: ruleLongName
            {
             before(grammarAccess.getExtensionStepAccess().getSentenceLongNameParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLongName();

            state._fsp--;

             after(grammarAccess.getExtensionStepAccess().getSentenceLongNameParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__SentenceAssignment_0_3"


    // $ANTLR start "rule__DeadEndStep__NameAssignment_0"
    // InternalUseCaseDslParser.g:2807:1: rule__DeadEndStep__NameAssignment_0 : ( RULE_INT ) ;
    public final void rule__DeadEndStep__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2811:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:2812:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:2812:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:2813:3: RULE_INT
            {
             before(grammarAccess.getDeadEndStepAccess().getNameINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeadEndStepAccess().getNameINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeadEndStep__NameAssignment_0"


    // $ANTLR start "rule__DeadEndStep__SentenceAssignment_3"
    // InternalUseCaseDslParser.g:2822:1: rule__DeadEndStep__SentenceAssignment_3 : ( ruleLongName ) ;
    public final void rule__DeadEndStep__SentenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2826:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:2827:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:2827:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:2828:3: ruleLongName
            {
             before(grammarAccess.getDeadEndStepAccess().getSentenceLongNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLongName();

            state._fsp--;

             after(grammarAccess.getDeadEndStepAccess().getSentenceLongNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeadEndStep__SentenceAssignment_3"


    // $ANTLR start "rule__Precondition__NameAssignment_0"
    // InternalUseCaseDslParser.g:2837:1: rule__Precondition__NameAssignment_0 : ( ( PRECONDITION ) ) ;
    public final void rule__Precondition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2841:1: ( ( ( PRECONDITION ) ) )
            // InternalUseCaseDslParser.g:2842:2: ( ( PRECONDITION ) )
            {
            // InternalUseCaseDslParser.g:2842:2: ( ( PRECONDITION ) )
            // InternalUseCaseDslParser.g:2843:3: ( PRECONDITION )
            {
             before(grammarAccess.getPreconditionAccess().getNamePRECONDITIONKeyword_0_0()); 
            // InternalUseCaseDslParser.g:2844:3: ( PRECONDITION )
            // InternalUseCaseDslParser.g:2845:4: PRECONDITION
            {
             before(grammarAccess.getPreconditionAccess().getNamePRECONDITIONKeyword_0_0()); 
            match(input,PRECONDITION,FOLLOW_2); 
             after(grammarAccess.getPreconditionAccess().getNamePRECONDITIONKeyword_0_0()); 

            }

             after(grammarAccess.getPreconditionAccess().getNamePRECONDITIONKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__NameAssignment_0"


    // $ANTLR start "rule__Precondition__ConditionAssignment_2"
    // InternalUseCaseDslParser.g:2856:1: rule__Precondition__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Precondition__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2860:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:2861:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:2861:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:2862:3: ruleCondition
            {
             before(grammarAccess.getPreconditionAccess().getConditionConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPreconditionAccess().getConditionConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Precondition__ConditionAssignment_2"


    // $ANTLR start "rule__Postcondition__NameAssignment_0"
    // InternalUseCaseDslParser.g:2871:1: rule__Postcondition__NameAssignment_0 : ( ( POSTCONDITION ) ) ;
    public final void rule__Postcondition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2875:1: ( ( ( POSTCONDITION ) ) )
            // InternalUseCaseDslParser.g:2876:2: ( ( POSTCONDITION ) )
            {
            // InternalUseCaseDslParser.g:2876:2: ( ( POSTCONDITION ) )
            // InternalUseCaseDslParser.g:2877:3: ( POSTCONDITION )
            {
             before(grammarAccess.getPostconditionAccess().getNamePOSTCONDITIONKeyword_0_0()); 
            // InternalUseCaseDslParser.g:2878:3: ( POSTCONDITION )
            // InternalUseCaseDslParser.g:2879:4: POSTCONDITION
            {
             before(grammarAccess.getPostconditionAccess().getNamePOSTCONDITIONKeyword_0_0()); 
            match(input,POSTCONDITION,FOLLOW_2); 
             after(grammarAccess.getPostconditionAccess().getNamePOSTCONDITIONKeyword_0_0()); 

            }

             after(grammarAccess.getPostconditionAccess().getNamePOSTCONDITIONKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__NameAssignment_0"


    // $ANTLR start "rule__Postcondition__ConditionAssignment_2"
    // InternalUseCaseDslParser.g:2890:1: rule__Postcondition__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Postcondition__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2894:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:2895:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:2895:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:2896:3: ruleCondition
            {
             before(grammarAccess.getPostconditionAccess().getConditionConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPostconditionAccess().getConditionConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Postcondition__ConditionAssignment_2"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\6\uffff\7\25\1\uffff\7\25\1\uffff";
    static final String dfa_3s = "\1\32\1\24\1\11\12\21\1\uffff\7\21\1\uffff";
    static final String dfa_4s = "\1\32\1\24\13\37\1\uffff\7\37\1\uffff";
    static final String dfa_5s = "\15\uffff\1\2\7\uffff\1\1";
    static final String dfa_6s = "\26\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\4\1\5\1\3\5\uffff\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\23\1\24\1\22\1\21\1\20\2\uffff\1\16\1\25\4\uffff\1\17",
            "\1\15\1\23\1\24\1\22\1\21\1\20\2\uffff\1\16\1\25\4\uffff\1\17",
            "\1\15\1\23\1\24\1\22\1\21\1\20\2\uffff\1\16\1\25\4\uffff\1\17",
            "\1\15\1\23\1\24\1\22\1\21\1\20\2\uffff\1\16\1\25\4\uffff\1\17",
            "\1\15\1\23\1\24\1\22\1\21\1\20\2\uffff\1\16\1\25\4\uffff\1\17",
            "\1\15\1\23\1\24\1\22\1\21\1\20\2\uffff\1\16\1\25\4\uffff\1\17",
            "\1\15\1\23\1\24\1\22\1\21\1\20\2\uffff\1\16\1\25\4\uffff\1\17",
            "",
            "\1\15\1\23\1\24\1\22\1\21\1\20\2\uffff\1\16\1\25\4\uffff\1\17",
            "\1\15\1\23\1\24\1\22\1\21\1\20\2\uffff\1\16\1\25\4\uffff\1\17",
            "\1\15\1\23\1\24\1\22\1\21\1\20\2\uffff\1\16\1\25\4\uffff\1\17",
            "\1\15\1\23\1\24\1\22\1\21\1\20\2\uffff\1\16\1\25\4\uffff\1\17",
            "\1\15\1\23\1\24\1\22\1\21\1\20\2\uffff\1\16\1\25\4\uffff\1\17",
            "\1\15\1\23\1\24\1\22\1\21\1\20\2\uffff\1\16\1\25\4\uffff\1\17",
            "\1\15\1\23\1\24\1\22\1\21\1\20\2\uffff\1\16\1\25\4\uffff\1\17",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "359:1: rule__ExtensionStep__Alternatives : ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ruleDeadEndStep ) );";
        }
    }
    static final String dfa_8s = "\30\uffff";
    static final String dfa_9s = "\1\32\1\24\1\10\12\21\1\15\1\uffff\7\21\1\uffff\1\30";
    static final String dfa_10s = "\1\32\1\24\13\37\1\15\1\uffff\7\37\1\uffff\1\32";
    static final String dfa_11s = "\16\uffff\1\2\7\uffff\1\1\1\uffff";
    static final String dfa_12s = "\30\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2",
            "\1\16\1\4\1\5\1\3\5\uffff\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\15\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\15\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\15\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\15\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\15\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\15\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\27",
            "",
            "\1\15\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\15\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\15\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\15\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\15\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\15\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\15\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "",
            "\1\16\1\uffff\1\26"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1235:3: ( rule__Extension__StepsAssignment_7 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000827C0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000827C9002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000827C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000827C9000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000827C0E00L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000827E0E00L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002000L});

}