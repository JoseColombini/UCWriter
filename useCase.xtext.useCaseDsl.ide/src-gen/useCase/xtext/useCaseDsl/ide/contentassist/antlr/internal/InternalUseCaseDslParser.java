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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AlternativeFlow", "MainFlow", "Return", "KW_System", "User", "AND", "END", "IF", "OR", "UC", "To", "QuotationMark", "Apostrophe", "FullStop", "Colon", "RULE_CHAR", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=21;
    public static final int User=8;
    public static final int RULE_BEGIN=20;
    public static final int KW_System=7;
    public static final int AlternativeFlow=4;
    public static final int RULE_STRING=24;
    public static final int UC=13;
    public static final int QuotationMark=15;
    public static final int RULE_SL_COMMENT=26;
    public static final int RULE_CHAR=19;
    public static final int To=14;
    public static final int Colon=18;
    public static final int EOF=-1;
    public static final int IF=11;
    public static final int Apostrophe=16;
    public static final int FullStop=17;
    public static final int Return=6;
    public static final int OR=12;
    public static final int RULE_ID=22;
    public static final int RULE_WS=27;
    public static final int RULE_ANY_OTHER=28;
    public static final int MainFlow=5;
    public static final int RULE_INT=23;
    public static final int AND=9;
    public static final int RULE_ML_COMMENT=25;
    public static final int END=10;

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
    		tokenNameToValue.put("UC", "'UC'");
    		tokenNameToValue.put("To", "'to'");
    		tokenNameToValue.put("AND", "'AND'");
    		tokenNameToValue.put("END", "'END'");
    		tokenNameToValue.put("User", "'User'");
    		tokenNameToValue.put("Return", "'Return'");
    		tokenNameToValue.put("KW_System", "'System'");
    		tokenNameToValue.put("MainFlow", "'MainFlow'");
    		tokenNameToValue.put("AlternativeFlow", "'AlternativeFlow'");
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
    // InternalUseCaseDslParser.g:70:1: entryRuleUseCase : ruleUseCase EOF ;
    public final void entryRuleUseCase() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

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

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // InternalUseCaseDslParser.g:85:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
    public final void ruleUseCase() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:90:2: ( ( ( rule__UseCase__Group__0 ) ) )
            // InternalUseCaseDslParser.g:91:2: ( ( rule__UseCase__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:91:2: ( ( rule__UseCase__Group__0 ) )
            // InternalUseCaseDslParser.g:92:3: ( rule__UseCase__Group__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup()); 
            // InternalUseCaseDslParser.g:93:3: ( rule__UseCase__Group__0 )
            // InternalUseCaseDslParser.g:93:4: rule__UseCase__Group__0
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleExtension"
    // InternalUseCaseDslParser.g:103:1: entryRuleExtension : ruleExtension EOF ;
    public final void entryRuleExtension() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:104:1: ( ruleExtension EOF )
            // InternalUseCaseDslParser.g:105:1: ruleExtension EOF
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
    // InternalUseCaseDslParser.g:112:1: ruleExtension : ( ( rule__Extension__Group__0 ) ) ;
    public final void ruleExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:116:2: ( ( ( rule__Extension__Group__0 ) ) )
            // InternalUseCaseDslParser.g:117:2: ( ( rule__Extension__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:117:2: ( ( rule__Extension__Group__0 ) )
            // InternalUseCaseDslParser.g:118:3: ( rule__Extension__Group__0 )
            {
             before(grammarAccess.getExtensionAccess().getGroup()); 
            // InternalUseCaseDslParser.g:119:3: ( rule__Extension__Group__0 )
            // InternalUseCaseDslParser.g:119:4: rule__Extension__Group__0
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
    // InternalUseCaseDslParser.g:128:1: entryRuleUseCaseStep : ruleUseCaseStep EOF ;
    public final void entryRuleUseCaseStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:129:1: ( ruleUseCaseStep EOF )
            // InternalUseCaseDslParser.g:130:1: ruleUseCaseStep EOF
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
    // InternalUseCaseDslParser.g:137:1: ruleUseCaseStep : ( ( rule__UseCaseStep__Alternatives ) ) ;
    public final void ruleUseCaseStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:141:2: ( ( ( rule__UseCaseStep__Alternatives ) ) )
            // InternalUseCaseDslParser.g:142:2: ( ( rule__UseCaseStep__Alternatives ) )
            {
            // InternalUseCaseDslParser.g:142:2: ( ( rule__UseCaseStep__Alternatives ) )
            // InternalUseCaseDslParser.g:143:3: ( rule__UseCaseStep__Alternatives )
            {
             before(grammarAccess.getUseCaseStepAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:144:3: ( rule__UseCaseStep__Alternatives )
            // InternalUseCaseDslParser.g:144:4: rule__UseCaseStep__Alternatives
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
    // InternalUseCaseDslParser.g:153:1: entryRuleExtensionStep : ruleExtensionStep EOF ;
    public final void entryRuleExtensionStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:154:1: ( ruleExtensionStep EOF )
            // InternalUseCaseDslParser.g:155:1: ruleExtensionStep EOF
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
    // InternalUseCaseDslParser.g:162:1: ruleExtensionStep : ( ( rule__ExtensionStep__Group__0 ) ) ;
    public final void ruleExtensionStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:166:2: ( ( ( rule__ExtensionStep__Group__0 ) ) )
            // InternalUseCaseDslParser.g:167:2: ( ( rule__ExtensionStep__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:167:2: ( ( rule__ExtensionStep__Group__0 ) )
            // InternalUseCaseDslParser.g:168:3: ( rule__ExtensionStep__Group__0 )
            {
             before(grammarAccess.getExtensionStepAccess().getGroup()); 
            // InternalUseCaseDslParser.g:169:3: ( rule__ExtensionStep__Group__0 )
            // InternalUseCaseDslParser.g:169:4: rule__ExtensionStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionStepAccess().getGroup()); 

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
    // InternalUseCaseDslParser.g:178:1: entryRuleDeadEndStep : ruleDeadEndStep EOF ;
    public final void entryRuleDeadEndStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:179:1: ( ruleDeadEndStep EOF )
            // InternalUseCaseDslParser.g:180:1: ruleDeadEndStep EOF
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
    // InternalUseCaseDslParser.g:187:1: ruleDeadEndStep : ( ( rule__DeadEndStep__Group__0 ) ) ;
    public final void ruleDeadEndStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:191:2: ( ( ( rule__DeadEndStep__Group__0 ) ) )
            // InternalUseCaseDslParser.g:192:2: ( ( rule__DeadEndStep__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:192:2: ( ( rule__DeadEndStep__Group__0 ) )
            // InternalUseCaseDslParser.g:193:3: ( rule__DeadEndStep__Group__0 )
            {
             before(grammarAccess.getDeadEndStepAccess().getGroup()); 
            // InternalUseCaseDslParser.g:194:3: ( rule__DeadEndStep__Group__0 )
            // InternalUseCaseDslParser.g:194:4: rule__DeadEndStep__Group__0
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


    // $ANTLR start "entryRuleLongName"
    // InternalUseCaseDslParser.g:203:1: entryRuleLongName : ruleLongName EOF ;
    public final void entryRuleLongName() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:204:1: ( ruleLongName EOF )
            // InternalUseCaseDslParser.g:205:1: ruleLongName EOF
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
    // InternalUseCaseDslParser.g:212:1: ruleLongName : ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) ) ;
    public final void ruleLongName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:216:2: ( ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) ) )
            // InternalUseCaseDslParser.g:217:2: ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) )
            {
            // InternalUseCaseDslParser.g:217:2: ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) )
            // InternalUseCaseDslParser.g:218:3: ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* )
            {
            // InternalUseCaseDslParser.g:218:3: ( ( rule__LongName__Alternatives ) )
            // InternalUseCaseDslParser.g:219:4: ( rule__LongName__Alternatives )
            {
             before(grammarAccess.getLongNameAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:220:4: ( rule__LongName__Alternatives )
            // InternalUseCaseDslParser.g:220:5: rule__LongName__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__LongName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLongNameAccess().getAlternatives()); 

            }

            // InternalUseCaseDslParser.g:223:3: ( ( rule__LongName__Alternatives )* )
            // InternalUseCaseDslParser.g:224:4: ( rule__LongName__Alternatives )*
            {
             before(grammarAccess.getLongNameAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:225:4: ( rule__LongName__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=QuotationMark && LA1_0<=RULE_CHAR)||LA1_0==RULE_ID||LA1_0==RULE_ANY_OTHER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:225:5: rule__LongName__Alternatives
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
    // InternalUseCaseDslParser.g:235:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:236:1: ( ruleCondition EOF )
            // InternalUseCaseDslParser.g:237:1: ruleCondition EOF
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
    // InternalUseCaseDslParser.g:244:1: ruleCondition : ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:248:2: ( ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) ) )
            // InternalUseCaseDslParser.g:249:2: ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) )
            {
            // InternalUseCaseDslParser.g:249:2: ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) )
            // InternalUseCaseDslParser.g:250:3: ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* )
            {
            // InternalUseCaseDslParser.g:250:3: ( ( rule__Condition__Alternatives ) )
            // InternalUseCaseDslParser.g:251:4: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:252:4: ( rule__Condition__Alternatives )
            // InternalUseCaseDslParser.g:252:5: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_4);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }

            // InternalUseCaseDslParser.g:255:3: ( ( rule__Condition__Alternatives )* )
            // InternalUseCaseDslParser.g:256:4: ( rule__Condition__Alternatives )*
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:257:4: ( rule__Condition__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==AND||LA2_0==OR||(LA2_0>=QuotationMark && LA2_0<=RULE_CHAR)||LA2_0==RULE_ID||LA2_0==RULE_ANY_OTHER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:257:5: rule__Condition__Alternatives
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
    // InternalUseCaseDslParser.g:266:1: rule__Extension__Alternatives_8 : ( ( ( rule__Extension__Group_8_0__0 ) ) | ( ( rule__Extension__EndAssignment_8_1 ) ) );
    public final void rule__Extension__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:270:1: ( ( ( rule__Extension__Group_8_0__0 ) ) | ( ( rule__Extension__EndAssignment_8_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==FullStop) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==Return) ) {
                        alt3=1;
                    }
                    else if ( ((LA3_2>=KW_System && LA3_2<=User)||(LA3_2>=QuotationMark && LA3_2<=RULE_CHAR)||LA3_2==RULE_ID||LA3_2==RULE_ANY_OTHER) ) {
                        alt3=2;
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
                    // InternalUseCaseDslParser.g:271:2: ( ( rule__Extension__Group_8_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:271:2: ( ( rule__Extension__Group_8_0__0 ) )
                    // InternalUseCaseDslParser.g:272:3: ( rule__Extension__Group_8_0__0 )
                    {
                     before(grammarAccess.getExtensionAccess().getGroup_8_0()); 
                    // InternalUseCaseDslParser.g:273:3: ( rule__Extension__Group_8_0__0 )
                    // InternalUseCaseDslParser.g:273:4: rule__Extension__Group_8_0__0
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
                    // InternalUseCaseDslParser.g:277:2: ( ( rule__Extension__EndAssignment_8_1 ) )
                    {
                    // InternalUseCaseDslParser.g:277:2: ( ( rule__Extension__EndAssignment_8_1 ) )
                    // InternalUseCaseDslParser.g:278:3: ( rule__Extension__EndAssignment_8_1 )
                    {
                     before(grammarAccess.getExtensionAccess().getEndAssignment_8_1()); 
                    // InternalUseCaseDslParser.g:279:3: ( rule__Extension__EndAssignment_8_1 )
                    // InternalUseCaseDslParser.g:279:4: rule__Extension__EndAssignment_8_1
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
    // InternalUseCaseDslParser.g:287:1: rule__UseCaseStep__Alternatives : ( ( ( rule__UseCaseStep__Group_0__0 ) ) | ( ( rule__UseCaseStep__Group_1__0 ) ) );
    public final void rule__UseCaseStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:291:1: ( ( ( rule__UseCaseStep__Group_0__0 ) ) | ( ( rule__UseCaseStep__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==FullStop) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==KW_System) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==User) ) {
                        alt4=1;
                    }
                    else {
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
                    // InternalUseCaseDslParser.g:292:2: ( ( rule__UseCaseStep__Group_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:292:2: ( ( rule__UseCaseStep__Group_0__0 ) )
                    // InternalUseCaseDslParser.g:293:3: ( rule__UseCaseStep__Group_0__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_0()); 
                    // InternalUseCaseDslParser.g:294:3: ( rule__UseCaseStep__Group_0__0 )
                    // InternalUseCaseDslParser.g:294:4: rule__UseCaseStep__Group_0__0
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
                    // InternalUseCaseDslParser.g:298:2: ( ( rule__UseCaseStep__Group_1__0 ) )
                    {
                    // InternalUseCaseDslParser.g:298:2: ( ( rule__UseCaseStep__Group_1__0 ) )
                    // InternalUseCaseDslParser.g:299:3: ( rule__UseCaseStep__Group_1__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_1()); 
                    // InternalUseCaseDslParser.g:300:3: ( rule__UseCaseStep__Group_1__0 )
                    // InternalUseCaseDslParser.g:300:4: rule__UseCaseStep__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCaseStep__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUseCaseStepAccess().getGroup_1()); 

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


    // $ANTLR start "rule__ExtensionStep__Alternatives_2"
    // InternalUseCaseDslParser.g:308:1: rule__ExtensionStep__Alternatives_2 : ( ( User ) | ( KW_System ) );
    public final void rule__ExtensionStep__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:312:1: ( ( User ) | ( KW_System ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==User) ) {
                alt5=1;
            }
            else if ( (LA5_0==KW_System) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUseCaseDslParser.g:313:2: ( User )
                    {
                    // InternalUseCaseDslParser.g:313:2: ( User )
                    // InternalUseCaseDslParser.g:314:3: User
                    {
                     before(grammarAccess.getExtensionStepAccess().getUserKeyword_2_0()); 
                    match(input,User,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getUserKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:319:2: ( KW_System )
                    {
                    // InternalUseCaseDslParser.g:319:2: ( KW_System )
                    // InternalUseCaseDslParser.g:320:3: KW_System
                    {
                     before(grammarAccess.getExtensionStepAccess().getSystemKeyword_2_1()); 
                    match(input,KW_System,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getSystemKeyword_2_1()); 

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
    // $ANTLR end "rule__ExtensionStep__Alternatives_2"


    // $ANTLR start "rule__LongName__Alternatives"
    // InternalUseCaseDslParser.g:329:1: rule__LongName__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) );
    public final void rule__LongName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:333:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt6=2;
                }
                break;
            case RULE_CHAR:
                {
                alt6=3;
                }
                break;
            case Colon:
                {
                alt6=4;
                }
                break;
            case FullStop:
                {
                alt6=5;
                }
                break;
            case QuotationMark:
                {
                alt6=6;
                }
                break;
            case Apostrophe:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalUseCaseDslParser.g:334:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:334:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:335:3: RULE_ID
                    {
                     before(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:340:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:340:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:341:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:346:2: ( RULE_CHAR )
                    {
                    // InternalUseCaseDslParser.g:346:2: ( RULE_CHAR )
                    // InternalUseCaseDslParser.g:347:3: RULE_CHAR
                    {
                     before(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2()); 
                    match(input,RULE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:352:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:352:2: ( Colon )
                    // InternalUseCaseDslParser.g:353:3: Colon
                    {
                     before(grammarAccess.getLongNameAccess().getColonKeyword_3()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:358:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:358:2: ( FullStop )
                    // InternalUseCaseDslParser.g:359:3: FullStop
                    {
                     before(grammarAccess.getLongNameAccess().getFullStopKeyword_4()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUseCaseDslParser.g:364:2: ( QuotationMark )
                    {
                    // InternalUseCaseDslParser.g:364:2: ( QuotationMark )
                    // InternalUseCaseDslParser.g:365:3: QuotationMark
                    {
                     before(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5()); 
                    match(input,QuotationMark,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUseCaseDslParser.g:370:2: ( Apostrophe )
                    {
                    // InternalUseCaseDslParser.g:370:2: ( Apostrophe )
                    // InternalUseCaseDslParser.g:371:3: Apostrophe
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
    // InternalUseCaseDslParser.g:380:1: rule__Condition__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) | ( AND ) | ( OR ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:384:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) | ( AND ) | ( OR ) )
            int alt7=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt7=2;
                }
                break;
            case RULE_CHAR:
                {
                alt7=3;
                }
                break;
            case Colon:
                {
                alt7=4;
                }
                break;
            case FullStop:
                {
                alt7=5;
                }
                break;
            case QuotationMark:
                {
                alt7=6;
                }
                break;
            case Apostrophe:
                {
                alt7=7;
                }
                break;
            case AND:
                {
                alt7=8;
                }
                break;
            case OR:
                {
                alt7=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalUseCaseDslParser.g:385:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:385:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:386:3: RULE_ID
                    {
                     before(grammarAccess.getConditionAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:391:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:391:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:392:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:397:2: ( RULE_CHAR )
                    {
                    // InternalUseCaseDslParser.g:397:2: ( RULE_CHAR )
                    // InternalUseCaseDslParser.g:398:3: RULE_CHAR
                    {
                     before(grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2()); 
                    match(input,RULE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:403:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:403:2: ( Colon )
                    // InternalUseCaseDslParser.g:404:3: Colon
                    {
                     before(grammarAccess.getConditionAccess().getColonKeyword_3()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:409:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:409:2: ( FullStop )
                    // InternalUseCaseDslParser.g:410:3: FullStop
                    {
                     before(grammarAccess.getConditionAccess().getFullStopKeyword_4()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUseCaseDslParser.g:415:2: ( QuotationMark )
                    {
                    // InternalUseCaseDslParser.g:415:2: ( QuotationMark )
                    // InternalUseCaseDslParser.g:416:3: QuotationMark
                    {
                     before(grammarAccess.getConditionAccess().getQuotationMarkKeyword_5()); 
                    match(input,QuotationMark,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getQuotationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUseCaseDslParser.g:421:2: ( Apostrophe )
                    {
                    // InternalUseCaseDslParser.g:421:2: ( Apostrophe )
                    // InternalUseCaseDslParser.g:422:3: Apostrophe
                    {
                     before(grammarAccess.getConditionAccess().getApostropheKeyword_6()); 
                    match(input,Apostrophe,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getApostropheKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUseCaseDslParser.g:427:2: ( AND )
                    {
                    // InternalUseCaseDslParser.g:427:2: ( AND )
                    // InternalUseCaseDslParser.g:428:3: AND
                    {
                     before(grammarAccess.getConditionAccess().getANDKeyword_7()); 
                    match(input,AND,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getANDKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUseCaseDslParser.g:433:2: ( OR )
                    {
                    // InternalUseCaseDslParser.g:433:2: ( OR )
                    // InternalUseCaseDslParser.g:434:3: OR
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
    // InternalUseCaseDslParser.g:443:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:447:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCaseDslParser.g:448:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
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
    // InternalUseCaseDslParser.g:455:1: rule__UseCase__Group__0__Impl : ( UC ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:459:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:460:1: ( UC )
            {
            // InternalUseCaseDslParser.g:460:1: ( UC )
            // InternalUseCaseDslParser.g:461:2: UC
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
    // InternalUseCaseDslParser.g:470:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:474:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCaseDslParser.g:475:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
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
    // InternalUseCaseDslParser.g:482:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NumberAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:486:1: ( ( ( rule__UseCase__NumberAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:487:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:487:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            // InternalUseCaseDslParser.g:488:2: ( rule__UseCase__NumberAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNumberAssignment_1()); 
            // InternalUseCaseDslParser.g:489:2: ( rule__UseCase__NumberAssignment_1 )
            // InternalUseCaseDslParser.g:489:3: rule__UseCase__NumberAssignment_1
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
    // InternalUseCaseDslParser.g:497:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:501:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCaseDslParser.g:502:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
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
    // InternalUseCaseDslParser.g:509:1: rule__UseCase__Group__2__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:513:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:514:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:514:1: ( Colon )
            // InternalUseCaseDslParser.g:515:2: Colon
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
    // InternalUseCaseDslParser.g:524:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:528:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCaseDslParser.g:529:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
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
    // InternalUseCaseDslParser.g:536:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__NameAssignment_3 ) ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:540:1: ( ( ( rule__UseCase__NameAssignment_3 ) ) )
            // InternalUseCaseDslParser.g:541:1: ( ( rule__UseCase__NameAssignment_3 ) )
            {
            // InternalUseCaseDslParser.g:541:1: ( ( rule__UseCase__NameAssignment_3 ) )
            // InternalUseCaseDslParser.g:542:2: ( rule__UseCase__NameAssignment_3 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_3()); 
            // InternalUseCaseDslParser.g:543:2: ( rule__UseCase__NameAssignment_3 )
            // InternalUseCaseDslParser.g:543:3: rule__UseCase__NameAssignment_3
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
    // InternalUseCaseDslParser.g:551:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:555:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCaseDslParser.g:556:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:563:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__MainflowAssignment_4 ) ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:567:1: ( ( ( rule__UseCase__MainflowAssignment_4 ) ) )
            // InternalUseCaseDslParser.g:568:1: ( ( rule__UseCase__MainflowAssignment_4 ) )
            {
            // InternalUseCaseDslParser.g:568:1: ( ( rule__UseCase__MainflowAssignment_4 ) )
            // InternalUseCaseDslParser.g:569:2: ( rule__UseCase__MainflowAssignment_4 )
            {
             before(grammarAccess.getUseCaseAccess().getMainflowAssignment_4()); 
            // InternalUseCaseDslParser.g:570:2: ( rule__UseCase__MainflowAssignment_4 )
            // InternalUseCaseDslParser.g:570:3: rule__UseCase__MainflowAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__MainflowAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getMainflowAssignment_4()); 

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
    // InternalUseCaseDslParser.g:578:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:582:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCaseDslParser.g:583:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCaseDslParser.g:590:1: rule__UseCase__Group__5__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:594:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:595:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:595:1: ( Colon )
            // InternalUseCaseDslParser.g:596:2: Colon
            {
             before(grammarAccess.getUseCaseAccess().getColonKeyword_5()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getColonKeyword_5()); 

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
    // InternalUseCaseDslParser.g:605:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:609:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCaseDslParser.g:610:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCaseDslParser.g:617:1: rule__UseCase__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:621:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:622:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:622:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:623:2: RULE_BEGIN
            {
             before(grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_6()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_6()); 

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
    // InternalUseCaseDslParser.g:632:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:636:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCaseDslParser.g:637:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
            {
            pushFollow(FOLLOW_10);
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
    // InternalUseCaseDslParser.g:644:1: rule__UseCase__Group__7__Impl : ( ( ( rule__UseCase__StepsAssignment_7 ) ) ( ( rule__UseCase__StepsAssignment_7 )* ) ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:648:1: ( ( ( ( rule__UseCase__StepsAssignment_7 ) ) ( ( rule__UseCase__StepsAssignment_7 )* ) ) )
            // InternalUseCaseDslParser.g:649:1: ( ( ( rule__UseCase__StepsAssignment_7 ) ) ( ( rule__UseCase__StepsAssignment_7 )* ) )
            {
            // InternalUseCaseDslParser.g:649:1: ( ( ( rule__UseCase__StepsAssignment_7 ) ) ( ( rule__UseCase__StepsAssignment_7 )* ) )
            // InternalUseCaseDslParser.g:650:2: ( ( rule__UseCase__StepsAssignment_7 ) ) ( ( rule__UseCase__StepsAssignment_7 )* )
            {
            // InternalUseCaseDslParser.g:650:2: ( ( rule__UseCase__StepsAssignment_7 ) )
            // InternalUseCaseDslParser.g:651:3: ( rule__UseCase__StepsAssignment_7 )
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_7()); 
            // InternalUseCaseDslParser.g:652:3: ( rule__UseCase__StepsAssignment_7 )
            // InternalUseCaseDslParser.g:652:4: rule__UseCase__StepsAssignment_7
            {
            pushFollow(FOLLOW_11);
            rule__UseCase__StepsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getStepsAssignment_7()); 

            }

            // InternalUseCaseDslParser.g:655:2: ( ( rule__UseCase__StepsAssignment_7 )* )
            // InternalUseCaseDslParser.g:656:3: ( rule__UseCase__StepsAssignment_7 )*
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_7()); 
            // InternalUseCaseDslParser.g:657:3: ( rule__UseCase__StepsAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:657:4: rule__UseCase__StepsAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__UseCase__StepsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getStepsAssignment_7()); 

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
    // $ANTLR end "rule__UseCase__Group__7__Impl"


    // $ANTLR start "rule__UseCase__Group__8"
    // InternalUseCaseDslParser.g:666:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:670:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // InternalUseCaseDslParser.g:671:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
            {
            pushFollow(FOLLOW_12);
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
    // InternalUseCaseDslParser.g:678:1: rule__UseCase__Group__8__Impl : ( RULE_END ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:682:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:683:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:683:1: ( RULE_END )
            // InternalUseCaseDslParser.g:684:2: RULE_END
            {
             before(grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_8()); 

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
    // InternalUseCaseDslParser.g:693:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:697:1: ( rule__UseCase__Group__9__Impl )
            // InternalUseCaseDslParser.g:698:2: rule__UseCase__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group__9__Impl();

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
    // InternalUseCaseDslParser.g:704:1: rule__UseCase__Group__9__Impl : ( ( rule__UseCase__Group_9__0 )? ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:708:1: ( ( ( rule__UseCase__Group_9__0 )? ) )
            // InternalUseCaseDslParser.g:709:1: ( ( rule__UseCase__Group_9__0 )? )
            {
            // InternalUseCaseDslParser.g:709:1: ( ( rule__UseCase__Group_9__0 )? )
            // InternalUseCaseDslParser.g:710:2: ( rule__UseCase__Group_9__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_9()); 
            // InternalUseCaseDslParser.g:711:2: ( rule__UseCase__Group_9__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==AlternativeFlow) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUseCaseDslParser.g:711:3: rule__UseCase__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getGroup_9()); 

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


    // $ANTLR start "rule__UseCase__Group_9__0"
    // InternalUseCaseDslParser.g:720:1: rule__UseCase__Group_9__0 : rule__UseCase__Group_9__0__Impl rule__UseCase__Group_9__1 ;
    public final void rule__UseCase__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:724:1: ( rule__UseCase__Group_9__0__Impl rule__UseCase__Group_9__1 )
            // InternalUseCaseDslParser.g:725:2: rule__UseCase__Group_9__0__Impl rule__UseCase__Group_9__1
            {
            pushFollow(FOLLOW_6);
            rule__UseCase__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_9__1();

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
    // $ANTLR end "rule__UseCase__Group_9__0"


    // $ANTLR start "rule__UseCase__Group_9__0__Impl"
    // InternalUseCaseDslParser.g:732:1: rule__UseCase__Group_9__0__Impl : ( ( rule__UseCase__DeclareofflowAssignment_9_0 ) ) ;
    public final void rule__UseCase__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:736:1: ( ( ( rule__UseCase__DeclareofflowAssignment_9_0 ) ) )
            // InternalUseCaseDslParser.g:737:1: ( ( rule__UseCase__DeclareofflowAssignment_9_0 ) )
            {
            // InternalUseCaseDslParser.g:737:1: ( ( rule__UseCase__DeclareofflowAssignment_9_0 ) )
            // InternalUseCaseDslParser.g:738:2: ( rule__UseCase__DeclareofflowAssignment_9_0 )
            {
             before(grammarAccess.getUseCaseAccess().getDeclareofflowAssignment_9_0()); 
            // InternalUseCaseDslParser.g:739:2: ( rule__UseCase__DeclareofflowAssignment_9_0 )
            // InternalUseCaseDslParser.g:739:3: rule__UseCase__DeclareofflowAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__DeclareofflowAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getDeclareofflowAssignment_9_0()); 

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
    // $ANTLR end "rule__UseCase__Group_9__0__Impl"


    // $ANTLR start "rule__UseCase__Group_9__1"
    // InternalUseCaseDslParser.g:747:1: rule__UseCase__Group_9__1 : rule__UseCase__Group_9__1__Impl rule__UseCase__Group_9__2 ;
    public final void rule__UseCase__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:751:1: ( rule__UseCase__Group_9__1__Impl rule__UseCase__Group_9__2 )
            // InternalUseCaseDslParser.g:752:2: rule__UseCase__Group_9__1__Impl rule__UseCase__Group_9__2
            {
            pushFollow(FOLLOW_9);
            rule__UseCase__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_9__2();

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
    // $ANTLR end "rule__UseCase__Group_9__1"


    // $ANTLR start "rule__UseCase__Group_9__1__Impl"
    // InternalUseCaseDslParser.g:759:1: rule__UseCase__Group_9__1__Impl : ( Colon ) ;
    public final void rule__UseCase__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:763:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:764:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:764:1: ( Colon )
            // InternalUseCaseDslParser.g:765:2: Colon
            {
             before(grammarAccess.getUseCaseAccess().getColonKeyword_9_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getColonKeyword_9_1()); 

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
    // $ANTLR end "rule__UseCase__Group_9__1__Impl"


    // $ANTLR start "rule__UseCase__Group_9__2"
    // InternalUseCaseDslParser.g:774:1: rule__UseCase__Group_9__2 : rule__UseCase__Group_9__2__Impl rule__UseCase__Group_9__3 ;
    public final void rule__UseCase__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:778:1: ( rule__UseCase__Group_9__2__Impl rule__UseCase__Group_9__3 )
            // InternalUseCaseDslParser.g:779:2: rule__UseCase__Group_9__2__Impl rule__UseCase__Group_9__3
            {
            pushFollow(FOLLOW_5);
            rule__UseCase__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_9__3();

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
    // $ANTLR end "rule__UseCase__Group_9__2"


    // $ANTLR start "rule__UseCase__Group_9__2__Impl"
    // InternalUseCaseDslParser.g:786:1: rule__UseCase__Group_9__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCase__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:790:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:791:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:791:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:792:2: RULE_BEGIN
            {
             before(grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_9_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_9_2()); 

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
    // $ANTLR end "rule__UseCase__Group_9__2__Impl"


    // $ANTLR start "rule__UseCase__Group_9__3"
    // InternalUseCaseDslParser.g:801:1: rule__UseCase__Group_9__3 : rule__UseCase__Group_9__3__Impl rule__UseCase__Group_9__4 ;
    public final void rule__UseCase__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:805:1: ( rule__UseCase__Group_9__3__Impl rule__UseCase__Group_9__4 )
            // InternalUseCaseDslParser.g:806:2: rule__UseCase__Group_9__3__Impl rule__UseCase__Group_9__4
            {
            pushFollow(FOLLOW_10);
            rule__UseCase__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_9__4();

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
    // $ANTLR end "rule__UseCase__Group_9__3"


    // $ANTLR start "rule__UseCase__Group_9__3__Impl"
    // InternalUseCaseDslParser.g:813:1: rule__UseCase__Group_9__3__Impl : ( ( ( rule__UseCase__AlternativeflowsAssignment_9_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_9_3 )* ) ) ;
    public final void rule__UseCase__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:817:1: ( ( ( ( rule__UseCase__AlternativeflowsAssignment_9_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_9_3 )* ) ) )
            // InternalUseCaseDslParser.g:818:1: ( ( ( rule__UseCase__AlternativeflowsAssignment_9_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_9_3 )* ) )
            {
            // InternalUseCaseDslParser.g:818:1: ( ( ( rule__UseCase__AlternativeflowsAssignment_9_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_9_3 )* ) )
            // InternalUseCaseDslParser.g:819:2: ( ( rule__UseCase__AlternativeflowsAssignment_9_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_9_3 )* )
            {
            // InternalUseCaseDslParser.g:819:2: ( ( rule__UseCase__AlternativeflowsAssignment_9_3 ) )
            // InternalUseCaseDslParser.g:820:3: ( rule__UseCase__AlternativeflowsAssignment_9_3 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_9_3()); 
            // InternalUseCaseDslParser.g:821:3: ( rule__UseCase__AlternativeflowsAssignment_9_3 )
            // InternalUseCaseDslParser.g:821:4: rule__UseCase__AlternativeflowsAssignment_9_3
            {
            pushFollow(FOLLOW_11);
            rule__UseCase__AlternativeflowsAssignment_9_3();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_9_3()); 

            }

            // InternalUseCaseDslParser.g:824:2: ( ( rule__UseCase__AlternativeflowsAssignment_9_3 )* )
            // InternalUseCaseDslParser.g:825:3: ( rule__UseCase__AlternativeflowsAssignment_9_3 )*
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_9_3()); 
            // InternalUseCaseDslParser.g:826:3: ( rule__UseCase__AlternativeflowsAssignment_9_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_INT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:826:4: rule__UseCase__AlternativeflowsAssignment_9_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__UseCase__AlternativeflowsAssignment_9_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_9_3()); 

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
    // $ANTLR end "rule__UseCase__Group_9__3__Impl"


    // $ANTLR start "rule__UseCase__Group_9__4"
    // InternalUseCaseDslParser.g:835:1: rule__UseCase__Group_9__4 : rule__UseCase__Group_9__4__Impl ;
    public final void rule__UseCase__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:839:1: ( rule__UseCase__Group_9__4__Impl )
            // InternalUseCaseDslParser.g:840:2: rule__UseCase__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_9__4__Impl();

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
    // $ANTLR end "rule__UseCase__Group_9__4"


    // $ANTLR start "rule__UseCase__Group_9__4__Impl"
    // InternalUseCaseDslParser.g:846:1: rule__UseCase__Group_9__4__Impl : ( RULE_END ) ;
    public final void rule__UseCase__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:850:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:851:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:851:1: ( RULE_END )
            // InternalUseCaseDslParser.g:852:2: RULE_END
            {
             before(grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_9_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_9_4()); 

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
    // $ANTLR end "rule__UseCase__Group_9__4__Impl"


    // $ANTLR start "rule__Extension__Group__0"
    // InternalUseCaseDslParser.g:862:1: rule__Extension__Group__0 : rule__Extension__Group__0__Impl rule__Extension__Group__1 ;
    public final void rule__Extension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:866:1: ( rule__Extension__Group__0__Impl rule__Extension__Group__1 )
            // InternalUseCaseDslParser.g:867:2: rule__Extension__Group__0__Impl rule__Extension__Group__1
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
    // InternalUseCaseDslParser.g:874:1: rule__Extension__Group__0__Impl : ( ( rule__Extension__StartFromAssignment_0 ) ) ;
    public final void rule__Extension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:878:1: ( ( ( rule__Extension__StartFromAssignment_0 ) ) )
            // InternalUseCaseDslParser.g:879:1: ( ( rule__Extension__StartFromAssignment_0 ) )
            {
            // InternalUseCaseDslParser.g:879:1: ( ( rule__Extension__StartFromAssignment_0 ) )
            // InternalUseCaseDslParser.g:880:2: ( rule__Extension__StartFromAssignment_0 )
            {
             before(grammarAccess.getExtensionAccess().getStartFromAssignment_0()); 
            // InternalUseCaseDslParser.g:881:2: ( rule__Extension__StartFromAssignment_0 )
            // InternalUseCaseDslParser.g:881:3: rule__Extension__StartFromAssignment_0
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
    // InternalUseCaseDslParser.g:889:1: rule__Extension__Group__1 : rule__Extension__Group__1__Impl rule__Extension__Group__2 ;
    public final void rule__Extension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:893:1: ( rule__Extension__Group__1__Impl rule__Extension__Group__2 )
            // InternalUseCaseDslParser.g:894:2: rule__Extension__Group__1__Impl rule__Extension__Group__2
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
    // InternalUseCaseDslParser.g:901:1: rule__Extension__Group__1__Impl : ( FullStop ) ;
    public final void rule__Extension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:905:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:906:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:906:1: ( FullStop )
            // InternalUseCaseDslParser.g:907:2: FullStop
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
    // InternalUseCaseDslParser.g:916:1: rule__Extension__Group__2 : rule__Extension__Group__2__Impl rule__Extension__Group__3 ;
    public final void rule__Extension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:920:1: ( rule__Extension__Group__2__Impl rule__Extension__Group__3 )
            // InternalUseCaseDslParser.g:921:2: rule__Extension__Group__2__Impl rule__Extension__Group__3
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
    // InternalUseCaseDslParser.g:928:1: rule__Extension__Group__2__Impl : ( ( rule__Extension__NameAssignment_2 ) ) ;
    public final void rule__Extension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:932:1: ( ( ( rule__Extension__NameAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:933:1: ( ( rule__Extension__NameAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:933:1: ( ( rule__Extension__NameAssignment_2 ) )
            // InternalUseCaseDslParser.g:934:2: ( rule__Extension__NameAssignment_2 )
            {
             before(grammarAccess.getExtensionAccess().getNameAssignment_2()); 
            // InternalUseCaseDslParser.g:935:2: ( rule__Extension__NameAssignment_2 )
            // InternalUseCaseDslParser.g:935:3: rule__Extension__NameAssignment_2
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
    // InternalUseCaseDslParser.g:943:1: rule__Extension__Group__3 : rule__Extension__Group__3__Impl rule__Extension__Group__4 ;
    public final void rule__Extension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:947:1: ( rule__Extension__Group__3__Impl rule__Extension__Group__4 )
            // InternalUseCaseDslParser.g:948:2: rule__Extension__Group__3__Impl rule__Extension__Group__4
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
    // InternalUseCaseDslParser.g:955:1: rule__Extension__Group__3__Impl : ( FullStop ) ;
    public final void rule__Extension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:959:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:960:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:960:1: ( FullStop )
            // InternalUseCaseDslParser.g:961:2: FullStop
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
    // InternalUseCaseDslParser.g:970:1: rule__Extension__Group__4 : rule__Extension__Group__4__Impl rule__Extension__Group__5 ;
    public final void rule__Extension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:974:1: ( rule__Extension__Group__4__Impl rule__Extension__Group__5 )
            // InternalUseCaseDslParser.g:975:2: rule__Extension__Group__4__Impl rule__Extension__Group__5
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
    // InternalUseCaseDslParser.g:982:1: rule__Extension__Group__4__Impl : ( IF ) ;
    public final void rule__Extension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:986:1: ( ( IF ) )
            // InternalUseCaseDslParser.g:987:1: ( IF )
            {
            // InternalUseCaseDslParser.g:987:1: ( IF )
            // InternalUseCaseDslParser.g:988:2: IF
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
    // InternalUseCaseDslParser.g:997:1: rule__Extension__Group__5 : rule__Extension__Group__5__Impl rule__Extension__Group__6 ;
    public final void rule__Extension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1001:1: ( rule__Extension__Group__5__Impl rule__Extension__Group__6 )
            // InternalUseCaseDslParser.g:1002:2: rule__Extension__Group__5__Impl rule__Extension__Group__6
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
    // InternalUseCaseDslParser.g:1009:1: rule__Extension__Group__5__Impl : ( ( rule__Extension__ConditionAssignment_5 ) ) ;
    public final void rule__Extension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1013:1: ( ( ( rule__Extension__ConditionAssignment_5 ) ) )
            // InternalUseCaseDslParser.g:1014:1: ( ( rule__Extension__ConditionAssignment_5 ) )
            {
            // InternalUseCaseDslParser.g:1014:1: ( ( rule__Extension__ConditionAssignment_5 ) )
            // InternalUseCaseDslParser.g:1015:2: ( rule__Extension__ConditionAssignment_5 )
            {
             before(grammarAccess.getExtensionAccess().getConditionAssignment_5()); 
            // InternalUseCaseDslParser.g:1016:2: ( rule__Extension__ConditionAssignment_5 )
            // InternalUseCaseDslParser.g:1016:3: rule__Extension__ConditionAssignment_5
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
    // InternalUseCaseDslParser.g:1024:1: rule__Extension__Group__6 : rule__Extension__Group__6__Impl rule__Extension__Group__7 ;
    public final void rule__Extension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1028:1: ( rule__Extension__Group__6__Impl rule__Extension__Group__7 )
            // InternalUseCaseDslParser.g:1029:2: rule__Extension__Group__6__Impl rule__Extension__Group__7
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
    // InternalUseCaseDslParser.g:1036:1: rule__Extension__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__Extension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1040:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:1041:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:1041:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:1042:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:1051:1: rule__Extension__Group__7 : rule__Extension__Group__7__Impl rule__Extension__Group__8 ;
    public final void rule__Extension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1055:1: ( rule__Extension__Group__7__Impl rule__Extension__Group__8 )
            // InternalUseCaseDslParser.g:1056:2: rule__Extension__Group__7__Impl rule__Extension__Group__8
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
    // InternalUseCaseDslParser.g:1063:1: rule__Extension__Group__7__Impl : ( ( ( rule__Extension__StepsAssignment_7 ) ) ( ( rule__Extension__StepsAssignment_7 )* ) ) ;
    public final void rule__Extension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1067:1: ( ( ( ( rule__Extension__StepsAssignment_7 ) ) ( ( rule__Extension__StepsAssignment_7 )* ) ) )
            // InternalUseCaseDslParser.g:1068:1: ( ( ( rule__Extension__StepsAssignment_7 ) ) ( ( rule__Extension__StepsAssignment_7 )* ) )
            {
            // InternalUseCaseDslParser.g:1068:1: ( ( ( rule__Extension__StepsAssignment_7 ) ) ( ( rule__Extension__StepsAssignment_7 )* ) )
            // InternalUseCaseDslParser.g:1069:2: ( ( rule__Extension__StepsAssignment_7 ) ) ( ( rule__Extension__StepsAssignment_7 )* )
            {
            // InternalUseCaseDslParser.g:1069:2: ( ( rule__Extension__StepsAssignment_7 ) )
            // InternalUseCaseDslParser.g:1070:3: ( rule__Extension__StepsAssignment_7 )
            {
             before(grammarAccess.getExtensionAccess().getStepsAssignment_7()); 
            // InternalUseCaseDslParser.g:1071:3: ( rule__Extension__StepsAssignment_7 )
            // InternalUseCaseDslParser.g:1071:4: rule__Extension__StepsAssignment_7
            {
            pushFollow(FOLLOW_11);
            rule__Extension__StepsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getStepsAssignment_7()); 

            }

            // InternalUseCaseDslParser.g:1074:2: ( ( rule__Extension__StepsAssignment_7 )* )
            // InternalUseCaseDslParser.g:1075:3: ( rule__Extension__StepsAssignment_7 )*
            {
             before(grammarAccess.getExtensionAccess().getStepsAssignment_7()); 
            // InternalUseCaseDslParser.g:1076:3: ( rule__Extension__StepsAssignment_7 )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1076:4: rule__Extension__StepsAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Extension__StepsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalUseCaseDslParser.g:1085:1: rule__Extension__Group__8 : rule__Extension__Group__8__Impl rule__Extension__Group__9 ;
    public final void rule__Extension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1089:1: ( rule__Extension__Group__8__Impl rule__Extension__Group__9 )
            // InternalUseCaseDslParser.g:1090:2: rule__Extension__Group__8__Impl rule__Extension__Group__9
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
    // InternalUseCaseDslParser.g:1097:1: rule__Extension__Group__8__Impl : ( ( rule__Extension__Alternatives_8 ) ) ;
    public final void rule__Extension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1101:1: ( ( ( rule__Extension__Alternatives_8 ) ) )
            // InternalUseCaseDslParser.g:1102:1: ( ( rule__Extension__Alternatives_8 ) )
            {
            // InternalUseCaseDslParser.g:1102:1: ( ( rule__Extension__Alternatives_8 ) )
            // InternalUseCaseDslParser.g:1103:2: ( rule__Extension__Alternatives_8 )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives_8()); 
            // InternalUseCaseDslParser.g:1104:2: ( rule__Extension__Alternatives_8 )
            // InternalUseCaseDslParser.g:1104:3: rule__Extension__Alternatives_8
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
    // InternalUseCaseDslParser.g:1112:1: rule__Extension__Group__9 : rule__Extension__Group__9__Impl ;
    public final void rule__Extension__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1116:1: ( rule__Extension__Group__9__Impl )
            // InternalUseCaseDslParser.g:1117:2: rule__Extension__Group__9__Impl
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
    // InternalUseCaseDslParser.g:1123:1: rule__Extension__Group__9__Impl : ( RULE_END ) ;
    public final void rule__Extension__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1127:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1128:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1128:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1129:2: RULE_END
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
    // InternalUseCaseDslParser.g:1139:1: rule__Extension__Group_8_0__0 : rule__Extension__Group_8_0__0__Impl rule__Extension__Group_8_0__1 ;
    public final void rule__Extension__Group_8_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1143:1: ( rule__Extension__Group_8_0__0__Impl rule__Extension__Group_8_0__1 )
            // InternalUseCaseDslParser.g:1144:2: rule__Extension__Group_8_0__0__Impl rule__Extension__Group_8_0__1
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
    // InternalUseCaseDslParser.g:1151:1: rule__Extension__Group_8_0__0__Impl : ( RULE_INT ) ;
    public final void rule__Extension__Group_8_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1155:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:1156:1: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:1156:1: ( RULE_INT )
            // InternalUseCaseDslParser.g:1157:2: RULE_INT
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
    // InternalUseCaseDslParser.g:1166:1: rule__Extension__Group_8_0__1 : rule__Extension__Group_8_0__1__Impl rule__Extension__Group_8_0__2 ;
    public final void rule__Extension__Group_8_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1170:1: ( rule__Extension__Group_8_0__1__Impl rule__Extension__Group_8_0__2 )
            // InternalUseCaseDslParser.g:1171:2: rule__Extension__Group_8_0__1__Impl rule__Extension__Group_8_0__2
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
    // InternalUseCaseDslParser.g:1178:1: rule__Extension__Group_8_0__1__Impl : ( FullStop ) ;
    public final void rule__Extension__Group_8_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1182:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1183:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1183:1: ( FullStop )
            // InternalUseCaseDslParser.g:1184:2: FullStop
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
    // InternalUseCaseDslParser.g:1193:1: rule__Extension__Group_8_0__2 : rule__Extension__Group_8_0__2__Impl rule__Extension__Group_8_0__3 ;
    public final void rule__Extension__Group_8_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1197:1: ( rule__Extension__Group_8_0__2__Impl rule__Extension__Group_8_0__3 )
            // InternalUseCaseDslParser.g:1198:2: rule__Extension__Group_8_0__2__Impl rule__Extension__Group_8_0__3
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
    // InternalUseCaseDslParser.g:1205:1: rule__Extension__Group_8_0__2__Impl : ( Return ) ;
    public final void rule__Extension__Group_8_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1209:1: ( ( Return ) )
            // InternalUseCaseDslParser.g:1210:1: ( Return )
            {
            // InternalUseCaseDslParser.g:1210:1: ( Return )
            // InternalUseCaseDslParser.g:1211:2: Return
            {
             before(grammarAccess.getExtensionAccess().getReturnKeyword_8_0_2()); 
            match(input,Return,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getReturnKeyword_8_0_2()); 

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
    // InternalUseCaseDslParser.g:1220:1: rule__Extension__Group_8_0__3 : rule__Extension__Group_8_0__3__Impl rule__Extension__Group_8_0__4 ;
    public final void rule__Extension__Group_8_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1224:1: ( rule__Extension__Group_8_0__3__Impl rule__Extension__Group_8_0__4 )
            // InternalUseCaseDslParser.g:1225:2: rule__Extension__Group_8_0__3__Impl rule__Extension__Group_8_0__4
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
    // InternalUseCaseDslParser.g:1232:1: rule__Extension__Group_8_0__3__Impl : ( To ) ;
    public final void rule__Extension__Group_8_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1236:1: ( ( To ) )
            // InternalUseCaseDslParser.g:1237:1: ( To )
            {
            // InternalUseCaseDslParser.g:1237:1: ( To )
            // InternalUseCaseDslParser.g:1238:2: To
            {
             before(grammarAccess.getExtensionAccess().getToKeyword_8_0_3()); 
            match(input,To,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getToKeyword_8_0_3()); 

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
    // InternalUseCaseDslParser.g:1247:1: rule__Extension__Group_8_0__4 : rule__Extension__Group_8_0__4__Impl ;
    public final void rule__Extension__Group_8_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1251:1: ( rule__Extension__Group_8_0__4__Impl )
            // InternalUseCaseDslParser.g:1252:2: rule__Extension__Group_8_0__4__Impl
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
    // InternalUseCaseDslParser.g:1258:1: rule__Extension__Group_8_0__4__Impl : ( ( rule__Extension__ResumeAtAssignment_8_0_4 ) ) ;
    public final void rule__Extension__Group_8_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1262:1: ( ( ( rule__Extension__ResumeAtAssignment_8_0_4 ) ) )
            // InternalUseCaseDslParser.g:1263:1: ( ( rule__Extension__ResumeAtAssignment_8_0_4 ) )
            {
            // InternalUseCaseDslParser.g:1263:1: ( ( rule__Extension__ResumeAtAssignment_8_0_4 ) )
            // InternalUseCaseDslParser.g:1264:2: ( rule__Extension__ResumeAtAssignment_8_0_4 )
            {
             before(grammarAccess.getExtensionAccess().getResumeAtAssignment_8_0_4()); 
            // InternalUseCaseDslParser.g:1265:2: ( rule__Extension__ResumeAtAssignment_8_0_4 )
            // InternalUseCaseDslParser.g:1265:3: rule__Extension__ResumeAtAssignment_8_0_4
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
    // InternalUseCaseDslParser.g:1274:1: rule__UseCaseStep__Group_0__0 : rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1 ;
    public final void rule__UseCaseStep__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1278:1: ( rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1 )
            // InternalUseCaseDslParser.g:1279:2: rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1
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
    // InternalUseCaseDslParser.g:1286:1: rule__UseCaseStep__Group_0__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1290:1: ( ( () ) )
            // InternalUseCaseDslParser.g:1291:1: ( () )
            {
            // InternalUseCaseDslParser.g:1291:1: ( () )
            // InternalUseCaseDslParser.g:1292:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getUserStepAction_0_0()); 
            // InternalUseCaseDslParser.g:1293:2: ()
            // InternalUseCaseDslParser.g:1293:3: 
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
    // InternalUseCaseDslParser.g:1301:1: rule__UseCaseStep__Group_0__1 : rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2 ;
    public final void rule__UseCaseStep__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1305:1: ( rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2 )
            // InternalUseCaseDslParser.g:1306:2: rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2
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
    // InternalUseCaseDslParser.g:1313:1: rule__UseCaseStep__Group_0__1__Impl : ( ( rule__UseCaseStep__NameAssignment_0_1 ) ) ;
    public final void rule__UseCaseStep__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1317:1: ( ( ( rule__UseCaseStep__NameAssignment_0_1 ) ) )
            // InternalUseCaseDslParser.g:1318:1: ( ( rule__UseCaseStep__NameAssignment_0_1 ) )
            {
            // InternalUseCaseDslParser.g:1318:1: ( ( rule__UseCaseStep__NameAssignment_0_1 ) )
            // InternalUseCaseDslParser.g:1319:2: ( rule__UseCaseStep__NameAssignment_0_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_0_1()); 
            // InternalUseCaseDslParser.g:1320:2: ( rule__UseCaseStep__NameAssignment_0_1 )
            // InternalUseCaseDslParser.g:1320:3: rule__UseCaseStep__NameAssignment_0_1
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
    // InternalUseCaseDslParser.g:1328:1: rule__UseCaseStep__Group_0__2 : rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3 ;
    public final void rule__UseCaseStep__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1332:1: ( rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3 )
            // InternalUseCaseDslParser.g:1333:2: rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3
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
    // InternalUseCaseDslParser.g:1340:1: rule__UseCaseStep__Group_0__2__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1344:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1345:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1345:1: ( FullStop )
            // InternalUseCaseDslParser.g:1346:2: FullStop
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
    // InternalUseCaseDslParser.g:1355:1: rule__UseCaseStep__Group_0__3 : rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4 ;
    public final void rule__UseCaseStep__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1359:1: ( rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4 )
            // InternalUseCaseDslParser.g:1360:2: rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4
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
    // InternalUseCaseDslParser.g:1367:1: rule__UseCaseStep__Group_0__3__Impl : ( User ) ;
    public final void rule__UseCaseStep__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1371:1: ( ( User ) )
            // InternalUseCaseDslParser.g:1372:1: ( User )
            {
            // InternalUseCaseDslParser.g:1372:1: ( User )
            // InternalUseCaseDslParser.g:1373:2: User
            {
             before(grammarAccess.getUseCaseStepAccess().getUserKeyword_0_3()); 
            match(input,User,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getUserKeyword_0_3()); 

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
    // InternalUseCaseDslParser.g:1382:1: rule__UseCaseStep__Group_0__4 : rule__UseCaseStep__Group_0__4__Impl ;
    public final void rule__UseCaseStep__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1386:1: ( rule__UseCaseStep__Group_0__4__Impl )
            // InternalUseCaseDslParser.g:1387:2: rule__UseCaseStep__Group_0__4__Impl
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
    // InternalUseCaseDslParser.g:1393:1: rule__UseCaseStep__Group_0__4__Impl : ( ( rule__UseCaseStep__SentenceAssignment_0_4 ) ) ;
    public final void rule__UseCaseStep__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1397:1: ( ( ( rule__UseCaseStep__SentenceAssignment_0_4 ) ) )
            // InternalUseCaseDslParser.g:1398:1: ( ( rule__UseCaseStep__SentenceAssignment_0_4 ) )
            {
            // InternalUseCaseDslParser.g:1398:1: ( ( rule__UseCaseStep__SentenceAssignment_0_4 ) )
            // InternalUseCaseDslParser.g:1399:2: ( rule__UseCaseStep__SentenceAssignment_0_4 )
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_0_4()); 
            // InternalUseCaseDslParser.g:1400:2: ( rule__UseCaseStep__SentenceAssignment_0_4 )
            // InternalUseCaseDslParser.g:1400:3: rule__UseCaseStep__SentenceAssignment_0_4
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
    // InternalUseCaseDslParser.g:1409:1: rule__UseCaseStep__Group_1__0 : rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1 ;
    public final void rule__UseCaseStep__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1413:1: ( rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1 )
            // InternalUseCaseDslParser.g:1414:2: rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1
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
    // InternalUseCaseDslParser.g:1421:1: rule__UseCaseStep__Group_1__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1425:1: ( ( () ) )
            // InternalUseCaseDslParser.g:1426:1: ( () )
            {
            // InternalUseCaseDslParser.g:1426:1: ( () )
            // InternalUseCaseDslParser.g:1427:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getSystemStepAction_1_0()); 
            // InternalUseCaseDslParser.g:1428:2: ()
            // InternalUseCaseDslParser.g:1428:3: 
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
    // InternalUseCaseDslParser.g:1436:1: rule__UseCaseStep__Group_1__1 : rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2 ;
    public final void rule__UseCaseStep__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1440:1: ( rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2 )
            // InternalUseCaseDslParser.g:1441:2: rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2
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
    // InternalUseCaseDslParser.g:1448:1: rule__UseCaseStep__Group_1__1__Impl : ( ( rule__UseCaseStep__NameAssignment_1_1 ) ) ;
    public final void rule__UseCaseStep__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1452:1: ( ( ( rule__UseCaseStep__NameAssignment_1_1 ) ) )
            // InternalUseCaseDslParser.g:1453:1: ( ( rule__UseCaseStep__NameAssignment_1_1 ) )
            {
            // InternalUseCaseDslParser.g:1453:1: ( ( rule__UseCaseStep__NameAssignment_1_1 ) )
            // InternalUseCaseDslParser.g:1454:2: ( rule__UseCaseStep__NameAssignment_1_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_1_1()); 
            // InternalUseCaseDslParser.g:1455:2: ( rule__UseCaseStep__NameAssignment_1_1 )
            // InternalUseCaseDslParser.g:1455:3: rule__UseCaseStep__NameAssignment_1_1
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
    // InternalUseCaseDslParser.g:1463:1: rule__UseCaseStep__Group_1__2 : rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3 ;
    public final void rule__UseCaseStep__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1467:1: ( rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3 )
            // InternalUseCaseDslParser.g:1468:2: rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3
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
    // InternalUseCaseDslParser.g:1475:1: rule__UseCaseStep__Group_1__2__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1479:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1480:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1480:1: ( FullStop )
            // InternalUseCaseDslParser.g:1481:2: FullStop
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
    // InternalUseCaseDslParser.g:1490:1: rule__UseCaseStep__Group_1__3 : rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4 ;
    public final void rule__UseCaseStep__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1494:1: ( rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4 )
            // InternalUseCaseDslParser.g:1495:2: rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4
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
    // InternalUseCaseDslParser.g:1502:1: rule__UseCaseStep__Group_1__3__Impl : ( KW_System ) ;
    public final void rule__UseCaseStep__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1506:1: ( ( KW_System ) )
            // InternalUseCaseDslParser.g:1507:1: ( KW_System )
            {
            // InternalUseCaseDslParser.g:1507:1: ( KW_System )
            // InternalUseCaseDslParser.g:1508:2: KW_System
            {
             before(grammarAccess.getUseCaseStepAccess().getSystemKeyword_1_3()); 
            match(input,KW_System,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getSystemKeyword_1_3()); 

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
    // InternalUseCaseDslParser.g:1517:1: rule__UseCaseStep__Group_1__4 : rule__UseCaseStep__Group_1__4__Impl ;
    public final void rule__UseCaseStep__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1521:1: ( rule__UseCaseStep__Group_1__4__Impl )
            // InternalUseCaseDslParser.g:1522:2: rule__UseCaseStep__Group_1__4__Impl
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
    // InternalUseCaseDslParser.g:1528:1: rule__UseCaseStep__Group_1__4__Impl : ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) ) ;
    public final void rule__UseCaseStep__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1532:1: ( ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) ) )
            // InternalUseCaseDslParser.g:1533:1: ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) )
            {
            // InternalUseCaseDslParser.g:1533:1: ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) )
            // InternalUseCaseDslParser.g:1534:2: ( rule__UseCaseStep__SentenceAssignment_1_4 )
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_1_4()); 
            // InternalUseCaseDslParser.g:1535:2: ( rule__UseCaseStep__SentenceAssignment_1_4 )
            // InternalUseCaseDslParser.g:1535:3: rule__UseCaseStep__SentenceAssignment_1_4
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


    // $ANTLR start "rule__ExtensionStep__Group__0"
    // InternalUseCaseDslParser.g:1544:1: rule__ExtensionStep__Group__0 : rule__ExtensionStep__Group__0__Impl rule__ExtensionStep__Group__1 ;
    public final void rule__ExtensionStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1548:1: ( rule__ExtensionStep__Group__0__Impl rule__ExtensionStep__Group__1 )
            // InternalUseCaseDslParser.g:1549:2: rule__ExtensionStep__Group__0__Impl rule__ExtensionStep__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ExtensionStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group__1();

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
    // $ANTLR end "rule__ExtensionStep__Group__0"


    // $ANTLR start "rule__ExtensionStep__Group__0__Impl"
    // InternalUseCaseDslParser.g:1556:1: rule__ExtensionStep__Group__0__Impl : ( ( rule__ExtensionStep__NameAssignment_0 ) ) ;
    public final void rule__ExtensionStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1560:1: ( ( ( rule__ExtensionStep__NameAssignment_0 ) ) )
            // InternalUseCaseDslParser.g:1561:1: ( ( rule__ExtensionStep__NameAssignment_0 ) )
            {
            // InternalUseCaseDslParser.g:1561:1: ( ( rule__ExtensionStep__NameAssignment_0 ) )
            // InternalUseCaseDslParser.g:1562:2: ( rule__ExtensionStep__NameAssignment_0 )
            {
             before(grammarAccess.getExtensionStepAccess().getNameAssignment_0()); 
            // InternalUseCaseDslParser.g:1563:2: ( rule__ExtensionStep__NameAssignment_0 )
            // InternalUseCaseDslParser.g:1563:3: rule__ExtensionStep__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionStepAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ExtensionStep__Group__0__Impl"


    // $ANTLR start "rule__ExtensionStep__Group__1"
    // InternalUseCaseDslParser.g:1571:1: rule__ExtensionStep__Group__1 : rule__ExtensionStep__Group__1__Impl rule__ExtensionStep__Group__2 ;
    public final void rule__ExtensionStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1575:1: ( rule__ExtensionStep__Group__1__Impl rule__ExtensionStep__Group__2 )
            // InternalUseCaseDslParser.g:1576:2: rule__ExtensionStep__Group__1__Impl rule__ExtensionStep__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ExtensionStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group__2();

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
    // $ANTLR end "rule__ExtensionStep__Group__1"


    // $ANTLR start "rule__ExtensionStep__Group__1__Impl"
    // InternalUseCaseDslParser.g:1583:1: rule__ExtensionStep__Group__1__Impl : ( FullStop ) ;
    public final void rule__ExtensionStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1587:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1588:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1588:1: ( FullStop )
            // InternalUseCaseDslParser.g:1589:2: FullStop
            {
             before(grammarAccess.getExtensionStepAccess().getFullStopKeyword_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getExtensionStepAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__ExtensionStep__Group__1__Impl"


    // $ANTLR start "rule__ExtensionStep__Group__2"
    // InternalUseCaseDslParser.g:1598:1: rule__ExtensionStep__Group__2 : rule__ExtensionStep__Group__2__Impl rule__ExtensionStep__Group__3 ;
    public final void rule__ExtensionStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1602:1: ( rule__ExtensionStep__Group__2__Impl rule__ExtensionStep__Group__3 )
            // InternalUseCaseDslParser.g:1603:2: rule__ExtensionStep__Group__2__Impl rule__ExtensionStep__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ExtensionStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group__3();

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
    // $ANTLR end "rule__ExtensionStep__Group__2"


    // $ANTLR start "rule__ExtensionStep__Group__2__Impl"
    // InternalUseCaseDslParser.g:1610:1: rule__ExtensionStep__Group__2__Impl : ( ( rule__ExtensionStep__Alternatives_2 )? ) ;
    public final void rule__ExtensionStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1614:1: ( ( ( rule__ExtensionStep__Alternatives_2 )? ) )
            // InternalUseCaseDslParser.g:1615:1: ( ( rule__ExtensionStep__Alternatives_2 )? )
            {
            // InternalUseCaseDslParser.g:1615:1: ( ( rule__ExtensionStep__Alternatives_2 )? )
            // InternalUseCaseDslParser.g:1616:2: ( rule__ExtensionStep__Alternatives_2 )?
            {
             before(grammarAccess.getExtensionStepAccess().getAlternatives_2()); 
            // InternalUseCaseDslParser.g:1617:2: ( rule__ExtensionStep__Alternatives_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=KW_System && LA12_0<=User)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUseCaseDslParser.g:1617:3: rule__ExtensionStep__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtensionStep__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtensionStepAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__ExtensionStep__Group__2__Impl"


    // $ANTLR start "rule__ExtensionStep__Group__3"
    // InternalUseCaseDslParser.g:1625:1: rule__ExtensionStep__Group__3 : rule__ExtensionStep__Group__3__Impl ;
    public final void rule__ExtensionStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1629:1: ( rule__ExtensionStep__Group__3__Impl )
            // InternalUseCaseDslParser.g:1630:2: rule__ExtensionStep__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group__3__Impl();

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
    // $ANTLR end "rule__ExtensionStep__Group__3"


    // $ANTLR start "rule__ExtensionStep__Group__3__Impl"
    // InternalUseCaseDslParser.g:1636:1: rule__ExtensionStep__Group__3__Impl : ( ( rule__ExtensionStep__SentenceAssignment_3 ) ) ;
    public final void rule__ExtensionStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1640:1: ( ( ( rule__ExtensionStep__SentenceAssignment_3 ) ) )
            // InternalUseCaseDslParser.g:1641:1: ( ( rule__ExtensionStep__SentenceAssignment_3 ) )
            {
            // InternalUseCaseDslParser.g:1641:1: ( ( rule__ExtensionStep__SentenceAssignment_3 ) )
            // InternalUseCaseDslParser.g:1642:2: ( rule__ExtensionStep__SentenceAssignment_3 )
            {
             before(grammarAccess.getExtensionStepAccess().getSentenceAssignment_3()); 
            // InternalUseCaseDslParser.g:1643:2: ( rule__ExtensionStep__SentenceAssignment_3 )
            // InternalUseCaseDslParser.g:1643:3: rule__ExtensionStep__SentenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__SentenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExtensionStepAccess().getSentenceAssignment_3()); 

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
    // $ANTLR end "rule__ExtensionStep__Group__3__Impl"


    // $ANTLR start "rule__DeadEndStep__Group__0"
    // InternalUseCaseDslParser.g:1652:1: rule__DeadEndStep__Group__0 : rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1 ;
    public final void rule__DeadEndStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1656:1: ( rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1 )
            // InternalUseCaseDslParser.g:1657:2: rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalUseCaseDslParser.g:1664:1: rule__DeadEndStep__Group__0__Impl : ( ruleExtensionStep ) ;
    public final void rule__DeadEndStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1668:1: ( ( ruleExtensionStep ) )
            // InternalUseCaseDslParser.g:1669:1: ( ruleExtensionStep )
            {
            // InternalUseCaseDslParser.g:1669:1: ( ruleExtensionStep )
            // InternalUseCaseDslParser.g:1670:2: ruleExtensionStep
            {
             before(grammarAccess.getDeadEndStepAccess().getExtensionStepParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExtensionStep();

            state._fsp--;

             after(grammarAccess.getDeadEndStepAccess().getExtensionStepParserRuleCall_0()); 

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
    // InternalUseCaseDslParser.g:1679:1: rule__DeadEndStep__Group__1 : rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2 ;
    public final void rule__DeadEndStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1683:1: ( rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2 )
            // InternalUseCaseDslParser.g:1684:2: rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2
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
    // InternalUseCaseDslParser.g:1691:1: rule__DeadEndStep__Group__1__Impl : ( UC ) ;
    public final void rule__DeadEndStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1695:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:1696:1: ( UC )
            {
            // InternalUseCaseDslParser.g:1696:1: ( UC )
            // InternalUseCaseDslParser.g:1697:2: UC
            {
             before(grammarAccess.getDeadEndStepAccess().getUCKeyword_1()); 
            match(input,UC,FOLLOW_2); 
             after(grammarAccess.getDeadEndStepAccess().getUCKeyword_1()); 

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
    // InternalUseCaseDslParser.g:1706:1: rule__DeadEndStep__Group__2 : rule__DeadEndStep__Group__2__Impl ;
    public final void rule__DeadEndStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1710:1: ( rule__DeadEndStep__Group__2__Impl )
            // InternalUseCaseDslParser.g:1711:2: rule__DeadEndStep__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeadEndStep__Group__2__Impl();

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
    // InternalUseCaseDslParser.g:1717:1: rule__DeadEndStep__Group__2__Impl : ( END ) ;
    public final void rule__DeadEndStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1721:1: ( ( END ) )
            // InternalUseCaseDslParser.g:1722:1: ( END )
            {
            // InternalUseCaseDslParser.g:1722:1: ( END )
            // InternalUseCaseDslParser.g:1723:2: END
            {
             before(grammarAccess.getDeadEndStepAccess().getENDKeyword_2()); 
            match(input,END,FOLLOW_2); 
             after(grammarAccess.getDeadEndStepAccess().getENDKeyword_2()); 

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


    // $ANTLR start "rule__UseCase__NumberAssignment_1"
    // InternalUseCaseDslParser.g:1733:1: rule__UseCase__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__UseCase__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1737:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:1738:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:1738:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:1739:3: RULE_INT
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
    // InternalUseCaseDslParser.g:1748:1: rule__UseCase__NameAssignment_3 : ( ruleLongName ) ;
    public final void rule__UseCase__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1752:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:1753:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:1753:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:1754:3: ruleLongName
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


    // $ANTLR start "rule__UseCase__MainflowAssignment_4"
    // InternalUseCaseDslParser.g:1763:1: rule__UseCase__MainflowAssignment_4 : ( ( MainFlow ) ) ;
    public final void rule__UseCase__MainflowAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1767:1: ( ( ( MainFlow ) ) )
            // InternalUseCaseDslParser.g:1768:2: ( ( MainFlow ) )
            {
            // InternalUseCaseDslParser.g:1768:2: ( ( MainFlow ) )
            // InternalUseCaseDslParser.g:1769:3: ( MainFlow )
            {
             before(grammarAccess.getUseCaseAccess().getMainflowMainFlowKeyword_4_0()); 
            // InternalUseCaseDslParser.g:1770:3: ( MainFlow )
            // InternalUseCaseDslParser.g:1771:4: MainFlow
            {
             before(grammarAccess.getUseCaseAccess().getMainflowMainFlowKeyword_4_0()); 
            match(input,MainFlow,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getMainflowMainFlowKeyword_4_0()); 

            }

             after(grammarAccess.getUseCaseAccess().getMainflowMainFlowKeyword_4_0()); 

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
    // $ANTLR end "rule__UseCase__MainflowAssignment_4"


    // $ANTLR start "rule__UseCase__StepsAssignment_7"
    // InternalUseCaseDslParser.g:1782:1: rule__UseCase__StepsAssignment_7 : ( ruleUseCaseStep ) ;
    public final void rule__UseCase__StepsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1786:1: ( ( ruleUseCaseStep ) )
            // InternalUseCaseDslParser.g:1787:2: ( ruleUseCaseStep )
            {
            // InternalUseCaseDslParser.g:1787:2: ( ruleUseCaseStep )
            // InternalUseCaseDslParser.g:1788:3: ruleUseCaseStep
            {
             before(grammarAccess.getUseCaseAccess().getStepsUseCaseStepParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCaseStep();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getStepsUseCaseStepParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__UseCase__StepsAssignment_7"


    // $ANTLR start "rule__UseCase__DeclareofflowAssignment_9_0"
    // InternalUseCaseDslParser.g:1797:1: rule__UseCase__DeclareofflowAssignment_9_0 : ( ( AlternativeFlow ) ) ;
    public final void rule__UseCase__DeclareofflowAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1801:1: ( ( ( AlternativeFlow ) ) )
            // InternalUseCaseDslParser.g:1802:2: ( ( AlternativeFlow ) )
            {
            // InternalUseCaseDslParser.g:1802:2: ( ( AlternativeFlow ) )
            // InternalUseCaseDslParser.g:1803:3: ( AlternativeFlow )
            {
             before(grammarAccess.getUseCaseAccess().getDeclareofflowAlternativeFlowKeyword_9_0_0()); 
            // InternalUseCaseDslParser.g:1804:3: ( AlternativeFlow )
            // InternalUseCaseDslParser.g:1805:4: AlternativeFlow
            {
             before(grammarAccess.getUseCaseAccess().getDeclareofflowAlternativeFlowKeyword_9_0_0()); 
            match(input,AlternativeFlow,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getDeclareofflowAlternativeFlowKeyword_9_0_0()); 

            }

             after(grammarAccess.getUseCaseAccess().getDeclareofflowAlternativeFlowKeyword_9_0_0()); 

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
    // $ANTLR end "rule__UseCase__DeclareofflowAssignment_9_0"


    // $ANTLR start "rule__UseCase__AlternativeflowsAssignment_9_3"
    // InternalUseCaseDslParser.g:1816:1: rule__UseCase__AlternativeflowsAssignment_9_3 : ( ruleExtension ) ;
    public final void rule__UseCase__AlternativeflowsAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1820:1: ( ( ruleExtension ) )
            // InternalUseCaseDslParser.g:1821:2: ( ruleExtension )
            {
            // InternalUseCaseDslParser.g:1821:2: ( ruleExtension )
            // InternalUseCaseDslParser.g:1822:3: ruleExtension
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsExtensionParserRuleCall_9_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExtension();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getAlternativeflowsExtensionParserRuleCall_9_3_0()); 

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
    // $ANTLR end "rule__UseCase__AlternativeflowsAssignment_9_3"


    // $ANTLR start "rule__Extension__StartFromAssignment_0"
    // InternalUseCaseDslParser.g:1831:1: rule__Extension__StartFromAssignment_0 : ( RULE_INT ) ;
    public final void rule__Extension__StartFromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1835:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:1836:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:1836:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:1837:3: RULE_INT
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
    // InternalUseCaseDslParser.g:1846:1: rule__Extension__NameAssignment_2 : ( RULE_CHAR ) ;
    public final void rule__Extension__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1850:1: ( ( RULE_CHAR ) )
            // InternalUseCaseDslParser.g:1851:2: ( RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:1851:2: ( RULE_CHAR )
            // InternalUseCaseDslParser.g:1852:3: RULE_CHAR
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
    // InternalUseCaseDslParser.g:1861:1: rule__Extension__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__Extension__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1865:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:1866:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:1866:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:1867:3: ruleCondition
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
    // InternalUseCaseDslParser.g:1876:1: rule__Extension__StepsAssignment_7 : ( ruleExtensionStep ) ;
    public final void rule__Extension__StepsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1880:1: ( ( ruleExtensionStep ) )
            // InternalUseCaseDslParser.g:1881:2: ( ruleExtensionStep )
            {
            // InternalUseCaseDslParser.g:1881:2: ( ruleExtensionStep )
            // InternalUseCaseDslParser.g:1882:3: ruleExtensionStep
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
    // InternalUseCaseDslParser.g:1891:1: rule__Extension__ResumeAtAssignment_8_0_4 : ( RULE_INT ) ;
    public final void rule__Extension__ResumeAtAssignment_8_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1895:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:1896:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:1896:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:1897:3: RULE_INT
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
    // InternalUseCaseDslParser.g:1906:1: rule__Extension__EndAssignment_8_1 : ( ruleDeadEndStep ) ;
    public final void rule__Extension__EndAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1910:1: ( ( ruleDeadEndStep ) )
            // InternalUseCaseDslParser.g:1911:2: ( ruleDeadEndStep )
            {
            // InternalUseCaseDslParser.g:1911:2: ( ruleDeadEndStep )
            // InternalUseCaseDslParser.g:1912:3: ruleDeadEndStep
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
    // InternalUseCaseDslParser.g:1921:1: rule__UseCaseStep__NameAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__UseCaseStep__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1925:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:1926:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:1926:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:1927:3: RULE_INT
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
    // InternalUseCaseDslParser.g:1936:1: rule__UseCaseStep__SentenceAssignment_0_4 : ( ruleLongName ) ;
    public final void rule__UseCaseStep__SentenceAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1940:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:1941:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:1941:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:1942:3: ruleLongName
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
    // InternalUseCaseDslParser.g:1951:1: rule__UseCaseStep__NameAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__UseCaseStep__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1955:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:1956:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:1956:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:1957:3: RULE_INT
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
    // InternalUseCaseDslParser.g:1966:1: rule__UseCaseStep__SentenceAssignment_1_4 : ( ruleLongName ) ;
    public final void rule__UseCaseStep__SentenceAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1970:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:1971:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:1971:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:1972:3: ruleLongName
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


    // $ANTLR start "rule__ExtensionStep__NameAssignment_0"
    // InternalUseCaseDslParser.g:1981:1: rule__ExtensionStep__NameAssignment_0 : ( RULE_INT ) ;
    public final void rule__ExtensionStep__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1985:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:1986:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:1986:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:1987:3: RULE_INT
            {
             before(grammarAccess.getExtensionStepAccess().getNameINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExtensionStepAccess().getNameINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ExtensionStep__NameAssignment_0"


    // $ANTLR start "rule__ExtensionStep__SentenceAssignment_3"
    // InternalUseCaseDslParser.g:1996:1: rule__ExtensionStep__SentenceAssignment_3 : ( ruleLongName ) ;
    public final void rule__ExtensionStep__SentenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2000:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:2001:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:2001:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:2002:3: ruleLongName
            {
             before(grammarAccess.getExtensionStepAccess().getSentenceLongNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLongName();

            state._fsp--;

             after(grammarAccess.getExtensionStepAccess().getSentenceLongNameParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ExtensionStep__SentenceAssignment_3"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\27\1\21\1\6\2\17\7\15\1\uffff\7\15\1\uffff";
    static final String dfa_3s = "\1\27\1\21\12\34\1\uffff\7\34\1\uffff";
    static final String dfa_4s = "\14\uffff\1\2\7\uffff\1\1";
    static final String dfa_5s = "\25\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\14\1\4\1\3\6\uffff\1\12\1\13\1\11\1\10\1\7\2\uffff\1\5\5\uffff\1\6",
            "\1\12\1\13\1\11\1\10\1\7\2\uffff\1\5\5\uffff\1\6",
            "\1\12\1\13\1\11\1\10\1\7\2\uffff\1\5\5\uffff\1\6",
            "\1\14\1\uffff\1\22\1\23\1\21\1\20\1\17\2\uffff\1\15\1\24\4\uffff\1\16",
            "\1\14\1\uffff\1\22\1\23\1\21\1\20\1\17\2\uffff\1\15\1\24\4\uffff\1\16",
            "\1\14\1\uffff\1\22\1\23\1\21\1\20\1\17\2\uffff\1\15\1\24\4\uffff\1\16",
            "\1\14\1\uffff\1\22\1\23\1\21\1\20\1\17\2\uffff\1\15\1\24\4\uffff\1\16",
            "\1\14\1\uffff\1\22\1\23\1\21\1\20\1\17\2\uffff\1\15\1\24\4\uffff\1\16",
            "\1\14\1\uffff\1\22\1\23\1\21\1\20\1\17\2\uffff\1\15\1\24\4\uffff\1\16",
            "\1\14\1\uffff\1\22\1\23\1\21\1\20\1\17\2\uffff\1\15\1\24\4\uffff\1\16",
            "",
            "\1\14\1\uffff\1\22\1\23\1\21\1\20\1\17\2\uffff\1\15\1\24\4\uffff\1\16",
            "\1\14\1\uffff\1\22\1\23\1\21\1\20\1\17\2\uffff\1\15\1\24\4\uffff\1\16",
            "\1\14\1\uffff\1\22\1\23\1\21\1\20\1\17\2\uffff\1\15\1\24\4\uffff\1\16",
            "\1\14\1\uffff\1\22\1\23\1\21\1\20\1\17\2\uffff\1\15\1\24\4\uffff\1\16",
            "\1\14\1\uffff\1\22\1\23\1\21\1\20\1\17\2\uffff\1\15\1\24\4\uffff\1\16",
            "\1\14\1\uffff\1\22\1\23\1\21\1\20\1\17\2\uffff\1\15\1\24\4\uffff\1\16",
            "\1\14\1\uffff\1\22\1\23\1\21\1\20\1\17\2\uffff\1\15\1\24\4\uffff\1\16",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 1076:3: ( rule__Extension__StepsAssignment_7 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000104F8002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000104F9202L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000104F8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000104F9200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000104F8180L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000400L});

}