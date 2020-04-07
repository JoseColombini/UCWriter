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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MainFlow", "KW_System", "User", "UC", "QuotationMark", "Apostrophe", "FullStop", "Colon", "RULE_CHAR", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=14;
    public static final int User=6;
    public static final int RULE_BEGIN=13;
    public static final int KW_System=5;
    public static final int RULE_STRING=17;
    public static final int UC=7;
    public static final int QuotationMark=8;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_CHAR=12;
    public static final int Colon=11;
    public static final int EOF=-1;
    public static final int Apostrophe=9;
    public static final int FullStop=10;
    public static final int RULE_ID=15;
    public static final int RULE_WS=20;
    public static final int RULE_ANY_OTHER=21;
    public static final int MainFlow=4;
    public static final int RULE_INT=16;
    public static final int RULE_ML_COMMENT=18;

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
    		tokenNameToValue.put("UC", "'UC'");
    		tokenNameToValue.put("User", "'User'");
    		tokenNameToValue.put("KW_System", "'System'");
    		tokenNameToValue.put("MainFlow", "'MainFlow'");
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
    // InternalUseCaseDslParser.g:63:1: entryRuleUseCase : ruleUseCase EOF ;
    public final void entryRuleUseCase() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalUseCaseDslParser.g:67:1: ( ruleUseCase EOF )
            // InternalUseCaseDslParser.g:68:1: ruleUseCase EOF
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
    // InternalUseCaseDslParser.g:78:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
    public final void ruleUseCase() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:83:2: ( ( ( rule__UseCase__Group__0 ) ) )
            // InternalUseCaseDslParser.g:84:2: ( ( rule__UseCase__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:84:2: ( ( rule__UseCase__Group__0 ) )
            // InternalUseCaseDslParser.g:85:3: ( rule__UseCase__Group__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup()); 
            // InternalUseCaseDslParser.g:86:3: ( rule__UseCase__Group__0 )
            // InternalUseCaseDslParser.g:86:4: rule__UseCase__Group__0
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


    // $ANTLR start "entryRuleMainFlow"
    // InternalUseCaseDslParser.g:96:1: entryRuleMainFlow : ruleMainFlow EOF ;
    public final void entryRuleMainFlow() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:97:1: ( ruleMainFlow EOF )
            // InternalUseCaseDslParser.g:98:1: ruleMainFlow EOF
            {
             before(grammarAccess.getMainFlowRule()); 
            pushFollow(FOLLOW_1);
            ruleMainFlow();

            state._fsp--;

             after(grammarAccess.getMainFlowRule()); 
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
    // $ANTLR end "entryRuleMainFlow"


    // $ANTLR start "ruleMainFlow"
    // InternalUseCaseDslParser.g:105:1: ruleMainFlow : ( ( rule__MainFlow__Group__0 ) ) ;
    public final void ruleMainFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:109:2: ( ( ( rule__MainFlow__Group__0 ) ) )
            // InternalUseCaseDslParser.g:110:2: ( ( rule__MainFlow__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:110:2: ( ( rule__MainFlow__Group__0 ) )
            // InternalUseCaseDslParser.g:111:3: ( rule__MainFlow__Group__0 )
            {
             before(grammarAccess.getMainFlowAccess().getGroup()); 
            // InternalUseCaseDslParser.g:112:3: ( rule__MainFlow__Group__0 )
            // InternalUseCaseDslParser.g:112:4: rule__MainFlow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainFlow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainFlowAccess().getGroup()); 

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
    // $ANTLR end "ruleMainFlow"


    // $ANTLR start "entryRuleStep"
    // InternalUseCaseDslParser.g:121:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:122:1: ( ruleStep EOF )
            // InternalUseCaseDslParser.g:123:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalUseCaseDslParser.g:130:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:134:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalUseCaseDslParser.g:135:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:135:2: ( ( rule__Step__Group__0 ) )
            // InternalUseCaseDslParser.g:136:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalUseCaseDslParser.g:137:3: ( rule__Step__Group__0 )
            // InternalUseCaseDslParser.g:137:4: rule__Step__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getGroup()); 

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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleUserStep"
    // InternalUseCaseDslParser.g:146:1: entryRuleUserStep : ruleUserStep EOF ;
    public final void entryRuleUserStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:147:1: ( ruleUserStep EOF )
            // InternalUseCaseDslParser.g:148:1: ruleUserStep EOF
            {
             before(grammarAccess.getUserStepRule()); 
            pushFollow(FOLLOW_1);
            ruleUserStep();

            state._fsp--;

             after(grammarAccess.getUserStepRule()); 
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
    // $ANTLR end "entryRuleUserStep"


    // $ANTLR start "ruleUserStep"
    // InternalUseCaseDslParser.g:155:1: ruleUserStep : ( ( rule__UserStep__Group__0 ) ) ;
    public final void ruleUserStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:159:2: ( ( ( rule__UserStep__Group__0 ) ) )
            // InternalUseCaseDslParser.g:160:2: ( ( rule__UserStep__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:160:2: ( ( rule__UserStep__Group__0 ) )
            // InternalUseCaseDslParser.g:161:3: ( rule__UserStep__Group__0 )
            {
             before(grammarAccess.getUserStepAccess().getGroup()); 
            // InternalUseCaseDslParser.g:162:3: ( rule__UserStep__Group__0 )
            // InternalUseCaseDslParser.g:162:4: rule__UserStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UserStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserStepAccess().getGroup()); 

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
    // $ANTLR end "ruleUserStep"


    // $ANTLR start "entryRuleSystemStep"
    // InternalUseCaseDslParser.g:171:1: entryRuleSystemStep : ruleSystemStep EOF ;
    public final void entryRuleSystemStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:172:1: ( ruleSystemStep EOF )
            // InternalUseCaseDslParser.g:173:1: ruleSystemStep EOF
            {
             before(grammarAccess.getSystemStepRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemStep();

            state._fsp--;

             after(grammarAccess.getSystemStepRule()); 
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
    // $ANTLR end "entryRuleSystemStep"


    // $ANTLR start "ruleSystemStep"
    // InternalUseCaseDslParser.g:180:1: ruleSystemStep : ( ( rule__SystemStep__Group__0 ) ) ;
    public final void ruleSystemStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:184:2: ( ( ( rule__SystemStep__Group__0 ) ) )
            // InternalUseCaseDslParser.g:185:2: ( ( rule__SystemStep__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:185:2: ( ( rule__SystemStep__Group__0 ) )
            // InternalUseCaseDslParser.g:186:3: ( rule__SystemStep__Group__0 )
            {
             before(grammarAccess.getSystemStepAccess().getGroup()); 
            // InternalUseCaseDslParser.g:187:3: ( rule__SystemStep__Group__0 )
            // InternalUseCaseDslParser.g:187:4: rule__SystemStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemStepAccess().getGroup()); 

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
    // $ANTLR end "ruleSystemStep"


    // $ANTLR start "entryRuleLongName"
    // InternalUseCaseDslParser.g:196:1: entryRuleLongName : ruleLongName EOF ;
    public final void entryRuleLongName() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:197:1: ( ruleLongName EOF )
            // InternalUseCaseDslParser.g:198:1: ruleLongName EOF
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
    // InternalUseCaseDslParser.g:205:1: ruleLongName : ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) ) ;
    public final void ruleLongName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:209:2: ( ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) ) )
            // InternalUseCaseDslParser.g:210:2: ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) )
            {
            // InternalUseCaseDslParser.g:210:2: ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) )
            // InternalUseCaseDslParser.g:211:3: ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* )
            {
            // InternalUseCaseDslParser.g:211:3: ( ( rule__LongName__Alternatives ) )
            // InternalUseCaseDslParser.g:212:4: ( rule__LongName__Alternatives )
            {
             before(grammarAccess.getLongNameAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:213:4: ( rule__LongName__Alternatives )
            // InternalUseCaseDslParser.g:213:5: rule__LongName__Alternatives
            {
            pushFollow(FOLLOW_3);
            rule__LongName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLongNameAccess().getAlternatives()); 

            }

            // InternalUseCaseDslParser.g:216:3: ( ( rule__LongName__Alternatives )* )
            // InternalUseCaseDslParser.g:217:4: ( rule__LongName__Alternatives )*
            {
             before(grammarAccess.getLongNameAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:218:4: ( rule__LongName__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=QuotationMark && LA1_0<=Colon)||LA1_0==RULE_ID||LA1_0==RULE_ANY_OTHER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:218:5: rule__LongName__Alternatives
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


    // $ANTLR start "rule__Step__TypeAlternatives_2_0"
    // InternalUseCaseDslParser.g:227:1: rule__Step__TypeAlternatives_2_0 : ( ( ruleUserStep ) | ( ruleSystemStep ) );
    public final void rule__Step__TypeAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:231:1: ( ( ruleUserStep ) | ( ruleSystemStep ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FullStop) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==KW_System) ) {
                    alt2=2;
                }
                else if ( (LA2_1==User) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUseCaseDslParser.g:232:2: ( ruleUserStep )
                    {
                    // InternalUseCaseDslParser.g:232:2: ( ruleUserStep )
                    // InternalUseCaseDslParser.g:233:3: ruleUserStep
                    {
                     before(grammarAccess.getStepAccess().getTypeUserStepParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUserStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getTypeUserStepParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:238:2: ( ruleSystemStep )
                    {
                    // InternalUseCaseDslParser.g:238:2: ( ruleSystemStep )
                    // InternalUseCaseDslParser.g:239:3: ruleSystemStep
                    {
                     before(grammarAccess.getStepAccess().getTypeSystemStepParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getTypeSystemStepParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__Step__TypeAlternatives_2_0"


    // $ANTLR start "rule__LongName__Alternatives"
    // InternalUseCaseDslParser.g:248:1: rule__LongName__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) );
    public final void rule__LongName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:252:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt3=2;
                }
                break;
            case Colon:
                {
                alt3=3;
                }
                break;
            case FullStop:
                {
                alt3=4;
                }
                break;
            case QuotationMark:
                {
                alt3=5;
                }
                break;
            case Apostrophe:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalUseCaseDslParser.g:253:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:253:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:254:3: RULE_ID
                    {
                     before(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:259:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:259:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:260:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:265:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:265:2: ( Colon )
                    // InternalUseCaseDslParser.g:266:3: Colon
                    {
                     before(grammarAccess.getLongNameAccess().getColonKeyword_2()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getColonKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:271:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:271:2: ( FullStop )
                    // InternalUseCaseDslParser.g:272:3: FullStop
                    {
                     before(grammarAccess.getLongNameAccess().getFullStopKeyword_3()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getFullStopKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:277:2: ( QuotationMark )
                    {
                    // InternalUseCaseDslParser.g:277:2: ( QuotationMark )
                    // InternalUseCaseDslParser.g:278:3: QuotationMark
                    {
                     before(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_4()); 
                    match(input,QuotationMark,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUseCaseDslParser.g:283:2: ( Apostrophe )
                    {
                    // InternalUseCaseDslParser.g:283:2: ( Apostrophe )
                    // InternalUseCaseDslParser.g:284:3: Apostrophe
                    {
                     before(grammarAccess.getLongNameAccess().getApostropheKeyword_5()); 
                    match(input,Apostrophe,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getApostropheKeyword_5()); 

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


    // $ANTLR start "rule__UseCase__Group__0"
    // InternalUseCaseDslParser.g:293:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:297:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCaseDslParser.g:298:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUseCaseDslParser.g:305:1: rule__UseCase__Group__0__Impl : ( UC ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:309:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:310:1: ( UC )
            {
            // InternalUseCaseDslParser.g:310:1: ( UC )
            // InternalUseCaseDslParser.g:311:2: UC
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
    // InternalUseCaseDslParser.g:320:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:324:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCaseDslParser.g:325:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCaseDslParser.g:332:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NumberAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:336:1: ( ( ( rule__UseCase__NumberAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:337:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:337:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            // InternalUseCaseDslParser.g:338:2: ( rule__UseCase__NumberAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNumberAssignment_1()); 
            // InternalUseCaseDslParser.g:339:2: ( rule__UseCase__NumberAssignment_1 )
            // InternalUseCaseDslParser.g:339:3: rule__UseCase__NumberAssignment_1
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
    // InternalUseCaseDslParser.g:347:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:351:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCaseDslParser.g:352:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:359:1: rule__UseCase__Group__2__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:363:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:364:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:364:1: ( Colon )
            // InternalUseCaseDslParser.g:365:2: Colon
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
    // InternalUseCaseDslParser.g:374:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:378:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCaseDslParser.g:379:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:386:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__NameAssignment_3 ) ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:390:1: ( ( ( rule__UseCase__NameAssignment_3 ) ) )
            // InternalUseCaseDslParser.g:391:1: ( ( rule__UseCase__NameAssignment_3 ) )
            {
            // InternalUseCaseDslParser.g:391:1: ( ( rule__UseCase__NameAssignment_3 ) )
            // InternalUseCaseDslParser.g:392:2: ( rule__UseCase__NameAssignment_3 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_3()); 
            // InternalUseCaseDslParser.g:393:2: ( rule__UseCase__NameAssignment_3 )
            // InternalUseCaseDslParser.g:393:3: rule__UseCase__NameAssignment_3
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
    // InternalUseCaseDslParser.g:401:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:405:1: ( rule__UseCase__Group__4__Impl )
            // InternalUseCaseDslParser.g:406:2: rule__UseCase__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group__4__Impl();

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
    // InternalUseCaseDslParser.g:412:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__MainflowAssignment_4 ) ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:416:1: ( ( ( rule__UseCase__MainflowAssignment_4 ) ) )
            // InternalUseCaseDslParser.g:417:1: ( ( rule__UseCase__MainflowAssignment_4 ) )
            {
            // InternalUseCaseDslParser.g:417:1: ( ( rule__UseCase__MainflowAssignment_4 ) )
            // InternalUseCaseDslParser.g:418:2: ( rule__UseCase__MainflowAssignment_4 )
            {
             before(grammarAccess.getUseCaseAccess().getMainflowAssignment_4()); 
            // InternalUseCaseDslParser.g:419:2: ( rule__UseCase__MainflowAssignment_4 )
            // InternalUseCaseDslParser.g:419:3: rule__UseCase__MainflowAssignment_4
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


    // $ANTLR start "rule__MainFlow__Group__0"
    // InternalUseCaseDslParser.g:428:1: rule__MainFlow__Group__0 : rule__MainFlow__Group__0__Impl rule__MainFlow__Group__1 ;
    public final void rule__MainFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:432:1: ( rule__MainFlow__Group__0__Impl rule__MainFlow__Group__1 )
            // InternalUseCaseDslParser.g:433:2: rule__MainFlow__Group__0__Impl rule__MainFlow__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MainFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainFlow__Group__1();

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
    // $ANTLR end "rule__MainFlow__Group__0"


    // $ANTLR start "rule__MainFlow__Group__0__Impl"
    // InternalUseCaseDslParser.g:440:1: rule__MainFlow__Group__0__Impl : ( () ) ;
    public final void rule__MainFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:444:1: ( ( () ) )
            // InternalUseCaseDslParser.g:445:1: ( () )
            {
            // InternalUseCaseDslParser.g:445:1: ( () )
            // InternalUseCaseDslParser.g:446:2: ()
            {
             before(grammarAccess.getMainFlowAccess().getMainFlowAction_0()); 
            // InternalUseCaseDslParser.g:447:2: ()
            // InternalUseCaseDslParser.g:447:3: 
            {
            }

             after(grammarAccess.getMainFlowAccess().getMainFlowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainFlow__Group__0__Impl"


    // $ANTLR start "rule__MainFlow__Group__1"
    // InternalUseCaseDslParser.g:455:1: rule__MainFlow__Group__1 : rule__MainFlow__Group__1__Impl rule__MainFlow__Group__2 ;
    public final void rule__MainFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:459:1: ( rule__MainFlow__Group__1__Impl rule__MainFlow__Group__2 )
            // InternalUseCaseDslParser.g:460:2: rule__MainFlow__Group__1__Impl rule__MainFlow__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MainFlow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainFlow__Group__2();

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
    // $ANTLR end "rule__MainFlow__Group__1"


    // $ANTLR start "rule__MainFlow__Group__1__Impl"
    // InternalUseCaseDslParser.g:467:1: rule__MainFlow__Group__1__Impl : ( ( rule__MainFlow__NameAssignment_1 ) ) ;
    public final void rule__MainFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:471:1: ( ( ( rule__MainFlow__NameAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:472:1: ( ( rule__MainFlow__NameAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:472:1: ( ( rule__MainFlow__NameAssignment_1 ) )
            // InternalUseCaseDslParser.g:473:2: ( rule__MainFlow__NameAssignment_1 )
            {
             before(grammarAccess.getMainFlowAccess().getNameAssignment_1()); 
            // InternalUseCaseDslParser.g:474:2: ( rule__MainFlow__NameAssignment_1 )
            // InternalUseCaseDslParser.g:474:3: rule__MainFlow__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MainFlow__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMainFlowAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MainFlow__Group__1__Impl"


    // $ANTLR start "rule__MainFlow__Group__2"
    // InternalUseCaseDslParser.g:482:1: rule__MainFlow__Group__2 : rule__MainFlow__Group__2__Impl rule__MainFlow__Group__3 ;
    public final void rule__MainFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:486:1: ( rule__MainFlow__Group__2__Impl rule__MainFlow__Group__3 )
            // InternalUseCaseDslParser.g:487:2: rule__MainFlow__Group__2__Impl rule__MainFlow__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__MainFlow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainFlow__Group__3();

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
    // $ANTLR end "rule__MainFlow__Group__2"


    // $ANTLR start "rule__MainFlow__Group__2__Impl"
    // InternalUseCaseDslParser.g:494:1: rule__MainFlow__Group__2__Impl : ( Colon ) ;
    public final void rule__MainFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:498:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:499:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:499:1: ( Colon )
            // InternalUseCaseDslParser.g:500:2: Colon
            {
             before(grammarAccess.getMainFlowAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getMainFlowAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__MainFlow__Group__2__Impl"


    // $ANTLR start "rule__MainFlow__Group__3"
    // InternalUseCaseDslParser.g:509:1: rule__MainFlow__Group__3 : rule__MainFlow__Group__3__Impl rule__MainFlow__Group__4 ;
    public final void rule__MainFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:513:1: ( rule__MainFlow__Group__3__Impl rule__MainFlow__Group__4 )
            // InternalUseCaseDslParser.g:514:2: rule__MainFlow__Group__3__Impl rule__MainFlow__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__MainFlow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainFlow__Group__4();

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
    // $ANTLR end "rule__MainFlow__Group__3"


    // $ANTLR start "rule__MainFlow__Group__3__Impl"
    // InternalUseCaseDslParser.g:521:1: rule__MainFlow__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__MainFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:525:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:526:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:526:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:527:2: RULE_BEGIN
            {
             before(grammarAccess.getMainFlowAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getMainFlowAccess().getBEGINTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__MainFlow__Group__3__Impl"


    // $ANTLR start "rule__MainFlow__Group__4"
    // InternalUseCaseDslParser.g:536:1: rule__MainFlow__Group__4 : rule__MainFlow__Group__4__Impl rule__MainFlow__Group__5 ;
    public final void rule__MainFlow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:540:1: ( rule__MainFlow__Group__4__Impl rule__MainFlow__Group__5 )
            // InternalUseCaseDslParser.g:541:2: rule__MainFlow__Group__4__Impl rule__MainFlow__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__MainFlow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainFlow__Group__5();

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
    // $ANTLR end "rule__MainFlow__Group__4"


    // $ANTLR start "rule__MainFlow__Group__4__Impl"
    // InternalUseCaseDslParser.g:548:1: rule__MainFlow__Group__4__Impl : ( ( ( rule__MainFlow__StepsAssignment_4 ) ) ( ( rule__MainFlow__StepsAssignment_4 )* ) ) ;
    public final void rule__MainFlow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:552:1: ( ( ( ( rule__MainFlow__StepsAssignment_4 ) ) ( ( rule__MainFlow__StepsAssignment_4 )* ) ) )
            // InternalUseCaseDslParser.g:553:1: ( ( ( rule__MainFlow__StepsAssignment_4 ) ) ( ( rule__MainFlow__StepsAssignment_4 )* ) )
            {
            // InternalUseCaseDslParser.g:553:1: ( ( ( rule__MainFlow__StepsAssignment_4 ) ) ( ( rule__MainFlow__StepsAssignment_4 )* ) )
            // InternalUseCaseDslParser.g:554:2: ( ( rule__MainFlow__StepsAssignment_4 ) ) ( ( rule__MainFlow__StepsAssignment_4 )* )
            {
            // InternalUseCaseDslParser.g:554:2: ( ( rule__MainFlow__StepsAssignment_4 ) )
            // InternalUseCaseDslParser.g:555:3: ( rule__MainFlow__StepsAssignment_4 )
            {
             before(grammarAccess.getMainFlowAccess().getStepsAssignment_4()); 
            // InternalUseCaseDslParser.g:556:3: ( rule__MainFlow__StepsAssignment_4 )
            // InternalUseCaseDslParser.g:556:4: rule__MainFlow__StepsAssignment_4
            {
            pushFollow(FOLLOW_10);
            rule__MainFlow__StepsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMainFlowAccess().getStepsAssignment_4()); 

            }

            // InternalUseCaseDslParser.g:559:2: ( ( rule__MainFlow__StepsAssignment_4 )* )
            // InternalUseCaseDslParser.g:560:3: ( rule__MainFlow__StepsAssignment_4 )*
            {
             before(grammarAccess.getMainFlowAccess().getStepsAssignment_4()); 
            // InternalUseCaseDslParser.g:561:3: ( rule__MainFlow__StepsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:561:4: rule__MainFlow__StepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MainFlow__StepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMainFlowAccess().getStepsAssignment_4()); 

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
    // $ANTLR end "rule__MainFlow__Group__4__Impl"


    // $ANTLR start "rule__MainFlow__Group__5"
    // InternalUseCaseDslParser.g:570:1: rule__MainFlow__Group__5 : rule__MainFlow__Group__5__Impl ;
    public final void rule__MainFlow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:574:1: ( rule__MainFlow__Group__5__Impl )
            // InternalUseCaseDslParser.g:575:2: rule__MainFlow__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainFlow__Group__5__Impl();

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
    // $ANTLR end "rule__MainFlow__Group__5"


    // $ANTLR start "rule__MainFlow__Group__5__Impl"
    // InternalUseCaseDslParser.g:581:1: rule__MainFlow__Group__5__Impl : ( RULE_END ) ;
    public final void rule__MainFlow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:585:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:586:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:586:1: ( RULE_END )
            // InternalUseCaseDslParser.g:587:2: RULE_END
            {
             before(grammarAccess.getMainFlowAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getMainFlowAccess().getENDTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__MainFlow__Group__5__Impl"


    // $ANTLR start "rule__Step__Group__0"
    // InternalUseCaseDslParser.g:597:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:601:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalUseCaseDslParser.g:602:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Step__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__1();

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
    // $ANTLR end "rule__Step__Group__0"


    // $ANTLR start "rule__Step__Group__0__Impl"
    // InternalUseCaseDslParser.g:609:1: rule__Step__Group__0__Impl : ( () ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:613:1: ( ( () ) )
            // InternalUseCaseDslParser.g:614:1: ( () )
            {
            // InternalUseCaseDslParser.g:614:1: ( () )
            // InternalUseCaseDslParser.g:615:2: ()
            {
             before(grammarAccess.getStepAccess().getStepAction_0()); 
            // InternalUseCaseDslParser.g:616:2: ()
            // InternalUseCaseDslParser.g:616:3: 
            {
            }

             after(grammarAccess.getStepAccess().getStepAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Group__0__Impl"


    // $ANTLR start "rule__Step__Group__1"
    // InternalUseCaseDslParser.g:624:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:628:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalUseCaseDslParser.g:629:2: rule__Step__Group__1__Impl rule__Step__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Step__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__2();

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
    // $ANTLR end "rule__Step__Group__1"


    // $ANTLR start "rule__Step__Group__1__Impl"
    // InternalUseCaseDslParser.g:636:1: rule__Step__Group__1__Impl : ( ( rule__Step__NameAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:640:1: ( ( ( rule__Step__NameAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:641:1: ( ( rule__Step__NameAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:641:1: ( ( rule__Step__NameAssignment_1 ) )
            // InternalUseCaseDslParser.g:642:2: ( rule__Step__NameAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getNameAssignment_1()); 
            // InternalUseCaseDslParser.g:643:2: ( rule__Step__NameAssignment_1 )
            // InternalUseCaseDslParser.g:643:3: rule__Step__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Step__Group__1__Impl"


    // $ANTLR start "rule__Step__Group__2"
    // InternalUseCaseDslParser.g:651:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:655:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalUseCaseDslParser.g:656:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Step__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Step__Group__3();

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
    // $ANTLR end "rule__Step__Group__2"


    // $ANTLR start "rule__Step__Group__2__Impl"
    // InternalUseCaseDslParser.g:663:1: rule__Step__Group__2__Impl : ( ( rule__Step__TypeAssignment_2 ) ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:667:1: ( ( ( rule__Step__TypeAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:668:1: ( ( rule__Step__TypeAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:668:1: ( ( rule__Step__TypeAssignment_2 ) )
            // InternalUseCaseDslParser.g:669:2: ( rule__Step__TypeAssignment_2 )
            {
             before(grammarAccess.getStepAccess().getTypeAssignment_2()); 
            // InternalUseCaseDslParser.g:670:2: ( rule__Step__TypeAssignment_2 )
            // InternalUseCaseDslParser.g:670:3: rule__Step__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Step__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Step__Group__2__Impl"


    // $ANTLR start "rule__Step__Group__3"
    // InternalUseCaseDslParser.g:678:1: rule__Step__Group__3 : rule__Step__Group__3__Impl ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:682:1: ( rule__Step__Group__3__Impl )
            // InternalUseCaseDslParser.g:683:2: rule__Step__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Step__Group__3__Impl();

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
    // $ANTLR end "rule__Step__Group__3"


    // $ANTLR start "rule__Step__Group__3__Impl"
    // InternalUseCaseDslParser.g:689:1: rule__Step__Group__3__Impl : ( ( rule__Step__SentenceAssignment_3 ) ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:693:1: ( ( ( rule__Step__SentenceAssignment_3 ) ) )
            // InternalUseCaseDslParser.g:694:1: ( ( rule__Step__SentenceAssignment_3 ) )
            {
            // InternalUseCaseDslParser.g:694:1: ( ( rule__Step__SentenceAssignment_3 ) )
            // InternalUseCaseDslParser.g:695:2: ( rule__Step__SentenceAssignment_3 )
            {
             before(grammarAccess.getStepAccess().getSentenceAssignment_3()); 
            // InternalUseCaseDslParser.g:696:2: ( rule__Step__SentenceAssignment_3 )
            // InternalUseCaseDslParser.g:696:3: rule__Step__SentenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Step__SentenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getSentenceAssignment_3()); 

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
    // $ANTLR end "rule__Step__Group__3__Impl"


    // $ANTLR start "rule__UserStep__Group__0"
    // InternalUseCaseDslParser.g:705:1: rule__UserStep__Group__0 : rule__UserStep__Group__0__Impl rule__UserStep__Group__1 ;
    public final void rule__UserStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:709:1: ( rule__UserStep__Group__0__Impl rule__UserStep__Group__1 )
            // InternalUseCaseDslParser.g:710:2: rule__UserStep__Group__0__Impl rule__UserStep__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__UserStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserStep__Group__1();

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
    // $ANTLR end "rule__UserStep__Group__0"


    // $ANTLR start "rule__UserStep__Group__0__Impl"
    // InternalUseCaseDslParser.g:717:1: rule__UserStep__Group__0__Impl : ( () ) ;
    public final void rule__UserStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:721:1: ( ( () ) )
            // InternalUseCaseDslParser.g:722:1: ( () )
            {
            // InternalUseCaseDslParser.g:722:1: ( () )
            // InternalUseCaseDslParser.g:723:2: ()
            {
             before(grammarAccess.getUserStepAccess().getUserStepAction_0()); 
            // InternalUseCaseDslParser.g:724:2: ()
            // InternalUseCaseDslParser.g:724:3: 
            {
            }

             after(grammarAccess.getUserStepAccess().getUserStepAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStep__Group__0__Impl"


    // $ANTLR start "rule__UserStep__Group__1"
    // InternalUseCaseDslParser.g:732:1: rule__UserStep__Group__1 : rule__UserStep__Group__1__Impl rule__UserStep__Group__2 ;
    public final void rule__UserStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:736:1: ( rule__UserStep__Group__1__Impl rule__UserStep__Group__2 )
            // InternalUseCaseDslParser.g:737:2: rule__UserStep__Group__1__Impl rule__UserStep__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__UserStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserStep__Group__2();

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
    // $ANTLR end "rule__UserStep__Group__1"


    // $ANTLR start "rule__UserStep__Group__1__Impl"
    // InternalUseCaseDslParser.g:744:1: rule__UserStep__Group__1__Impl : ( FullStop ) ;
    public final void rule__UserStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:748:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:749:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:749:1: ( FullStop )
            // InternalUseCaseDslParser.g:750:2: FullStop
            {
             before(grammarAccess.getUserStepAccess().getFullStopKeyword_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUserStepAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__UserStep__Group__1__Impl"


    // $ANTLR start "rule__UserStep__Group__2"
    // InternalUseCaseDslParser.g:759:1: rule__UserStep__Group__2 : rule__UserStep__Group__2__Impl ;
    public final void rule__UserStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:763:1: ( rule__UserStep__Group__2__Impl )
            // InternalUseCaseDslParser.g:764:2: rule__UserStep__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserStep__Group__2__Impl();

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
    // $ANTLR end "rule__UserStep__Group__2"


    // $ANTLR start "rule__UserStep__Group__2__Impl"
    // InternalUseCaseDslParser.g:770:1: rule__UserStep__Group__2__Impl : ( User ) ;
    public final void rule__UserStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:774:1: ( ( User ) )
            // InternalUseCaseDslParser.g:775:1: ( User )
            {
            // InternalUseCaseDslParser.g:775:1: ( User )
            // InternalUseCaseDslParser.g:776:2: User
            {
             before(grammarAccess.getUserStepAccess().getUserKeyword_2()); 
            match(input,User,FOLLOW_2); 
             after(grammarAccess.getUserStepAccess().getUserKeyword_2()); 

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
    // $ANTLR end "rule__UserStep__Group__2__Impl"


    // $ANTLR start "rule__SystemStep__Group__0"
    // InternalUseCaseDslParser.g:786:1: rule__SystemStep__Group__0 : rule__SystemStep__Group__0__Impl rule__SystemStep__Group__1 ;
    public final void rule__SystemStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:790:1: ( rule__SystemStep__Group__0__Impl rule__SystemStep__Group__1 )
            // InternalUseCaseDslParser.g:791:2: rule__SystemStep__Group__0__Impl rule__SystemStep__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__SystemStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemStep__Group__1();

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
    // $ANTLR end "rule__SystemStep__Group__0"


    // $ANTLR start "rule__SystemStep__Group__0__Impl"
    // InternalUseCaseDslParser.g:798:1: rule__SystemStep__Group__0__Impl : ( () ) ;
    public final void rule__SystemStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:802:1: ( ( () ) )
            // InternalUseCaseDslParser.g:803:1: ( () )
            {
            // InternalUseCaseDslParser.g:803:1: ( () )
            // InternalUseCaseDslParser.g:804:2: ()
            {
             before(grammarAccess.getSystemStepAccess().getSystemStepAction_0()); 
            // InternalUseCaseDslParser.g:805:2: ()
            // InternalUseCaseDslParser.g:805:3: 
            {
            }

             after(grammarAccess.getSystemStepAccess().getSystemStepAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemStep__Group__0__Impl"


    // $ANTLR start "rule__SystemStep__Group__1"
    // InternalUseCaseDslParser.g:813:1: rule__SystemStep__Group__1 : rule__SystemStep__Group__1__Impl rule__SystemStep__Group__2 ;
    public final void rule__SystemStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:817:1: ( rule__SystemStep__Group__1__Impl rule__SystemStep__Group__2 )
            // InternalUseCaseDslParser.g:818:2: rule__SystemStep__Group__1__Impl rule__SystemStep__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__SystemStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemStep__Group__2();

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
    // $ANTLR end "rule__SystemStep__Group__1"


    // $ANTLR start "rule__SystemStep__Group__1__Impl"
    // InternalUseCaseDslParser.g:825:1: rule__SystemStep__Group__1__Impl : ( FullStop ) ;
    public final void rule__SystemStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:829:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:830:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:830:1: ( FullStop )
            // InternalUseCaseDslParser.g:831:2: FullStop
            {
             before(grammarAccess.getSystemStepAccess().getFullStopKeyword_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getSystemStepAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__SystemStep__Group__1__Impl"


    // $ANTLR start "rule__SystemStep__Group__2"
    // InternalUseCaseDslParser.g:840:1: rule__SystemStep__Group__2 : rule__SystemStep__Group__2__Impl ;
    public final void rule__SystemStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:844:1: ( rule__SystemStep__Group__2__Impl )
            // InternalUseCaseDslParser.g:845:2: rule__SystemStep__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemStep__Group__2__Impl();

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
    // $ANTLR end "rule__SystemStep__Group__2"


    // $ANTLR start "rule__SystemStep__Group__2__Impl"
    // InternalUseCaseDslParser.g:851:1: rule__SystemStep__Group__2__Impl : ( KW_System ) ;
    public final void rule__SystemStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:855:1: ( ( KW_System ) )
            // InternalUseCaseDslParser.g:856:1: ( KW_System )
            {
            // InternalUseCaseDslParser.g:856:1: ( KW_System )
            // InternalUseCaseDslParser.g:857:2: KW_System
            {
             before(grammarAccess.getSystemStepAccess().getSystemKeyword_2()); 
            match(input,KW_System,FOLLOW_2); 
             after(grammarAccess.getSystemStepAccess().getSystemKeyword_2()); 

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
    // $ANTLR end "rule__SystemStep__Group__2__Impl"


    // $ANTLR start "rule__UseCase__NumberAssignment_1"
    // InternalUseCaseDslParser.g:867:1: rule__UseCase__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__UseCase__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:871:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:872:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:872:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:873:3: RULE_INT
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
    // InternalUseCaseDslParser.g:882:1: rule__UseCase__NameAssignment_3 : ( ruleLongName ) ;
    public final void rule__UseCase__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:886:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:887:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:887:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:888:3: ruleLongName
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
    // InternalUseCaseDslParser.g:897:1: rule__UseCase__MainflowAssignment_4 : ( ruleMainFlow ) ;
    public final void rule__UseCase__MainflowAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:901:1: ( ( ruleMainFlow ) )
            // InternalUseCaseDslParser.g:902:2: ( ruleMainFlow )
            {
            // InternalUseCaseDslParser.g:902:2: ( ruleMainFlow )
            // InternalUseCaseDslParser.g:903:3: ruleMainFlow
            {
             before(grammarAccess.getUseCaseAccess().getMainflowMainFlowParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMainFlow();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getMainflowMainFlowParserRuleCall_4_0()); 

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


    // $ANTLR start "rule__MainFlow__NameAssignment_1"
    // InternalUseCaseDslParser.g:912:1: rule__MainFlow__NameAssignment_1 : ( ( MainFlow ) ) ;
    public final void rule__MainFlow__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:916:1: ( ( ( MainFlow ) ) )
            // InternalUseCaseDslParser.g:917:2: ( ( MainFlow ) )
            {
            // InternalUseCaseDslParser.g:917:2: ( ( MainFlow ) )
            // InternalUseCaseDslParser.g:918:3: ( MainFlow )
            {
             before(grammarAccess.getMainFlowAccess().getNameMainFlowKeyword_1_0()); 
            // InternalUseCaseDslParser.g:919:3: ( MainFlow )
            // InternalUseCaseDslParser.g:920:4: MainFlow
            {
             before(grammarAccess.getMainFlowAccess().getNameMainFlowKeyword_1_0()); 
            match(input,MainFlow,FOLLOW_2); 
             after(grammarAccess.getMainFlowAccess().getNameMainFlowKeyword_1_0()); 

            }

             after(grammarAccess.getMainFlowAccess().getNameMainFlowKeyword_1_0()); 

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
    // $ANTLR end "rule__MainFlow__NameAssignment_1"


    // $ANTLR start "rule__MainFlow__StepsAssignment_4"
    // InternalUseCaseDslParser.g:931:1: rule__MainFlow__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__MainFlow__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:935:1: ( ( ruleStep ) )
            // InternalUseCaseDslParser.g:936:2: ( ruleStep )
            {
            // InternalUseCaseDslParser.g:936:2: ( ruleStep )
            // InternalUseCaseDslParser.g:937:3: ruleStep
            {
             before(grammarAccess.getMainFlowAccess().getStepsStepParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getMainFlowAccess().getStepsStepParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__MainFlow__StepsAssignment_4"


    // $ANTLR start "rule__Step__NameAssignment_1"
    // InternalUseCaseDslParser.g:946:1: rule__Step__NameAssignment_1 : ( RULE_INT ) ;
    public final void rule__Step__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:950:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:951:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:951:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:952:3: RULE_INT
            {
             before(grammarAccess.getStepAccess().getNameINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getNameINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Step__NameAssignment_1"


    // $ANTLR start "rule__Step__TypeAssignment_2"
    // InternalUseCaseDslParser.g:961:1: rule__Step__TypeAssignment_2 : ( ( rule__Step__TypeAlternatives_2_0 ) ) ;
    public final void rule__Step__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:965:1: ( ( ( rule__Step__TypeAlternatives_2_0 ) ) )
            // InternalUseCaseDslParser.g:966:2: ( ( rule__Step__TypeAlternatives_2_0 ) )
            {
            // InternalUseCaseDslParser.g:966:2: ( ( rule__Step__TypeAlternatives_2_0 ) )
            // InternalUseCaseDslParser.g:967:3: ( rule__Step__TypeAlternatives_2_0 )
            {
             before(grammarAccess.getStepAccess().getTypeAlternatives_2_0()); 
            // InternalUseCaseDslParser.g:968:3: ( rule__Step__TypeAlternatives_2_0 )
            // InternalUseCaseDslParser.g:968:4: rule__Step__TypeAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Step__TypeAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getTypeAlternatives_2_0()); 

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
    // $ANTLR end "rule__Step__TypeAssignment_2"


    // $ANTLR start "rule__Step__SentenceAssignment_3"
    // InternalUseCaseDslParser.g:976:1: rule__Step__SentenceAssignment_3 : ( ruleLongName ) ;
    public final void rule__Step__SentenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:980:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:981:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:981:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:982:3: ruleLongName
            {
             before(grammarAccess.getStepAccess().getSentenceLongNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLongName();

            state._fsp--;

             after(grammarAccess.getStepAccess().getSentenceLongNameParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Step__SentenceAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000208F02L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000208F00L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});

}