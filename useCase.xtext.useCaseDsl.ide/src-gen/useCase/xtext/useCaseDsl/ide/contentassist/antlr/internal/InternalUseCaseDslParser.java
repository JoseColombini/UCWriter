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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MainFlow", "KW_System", "User", "UC", "FullStop", "Colon", "RULE_CHAR", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=12;
    public static final int User=6;
    public static final int RULE_BEGIN=11;
    public static final int KW_System=5;
    public static final int RULE_STRING=15;
    public static final int UC=7;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_CHAR=10;
    public static final int Colon=9;
    public static final int EOF=-1;
    public static final int FullStop=8;
    public static final int RULE_ID=13;
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=19;
    public static final int MainFlow=4;
    public static final int RULE_INT=14;
    public static final int RULE_ML_COMMENT=16;

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
    // InternalUseCaseDslParser.g:61:1: entryRuleUseCase : ruleUseCase EOF ;
    public final void entryRuleUseCase() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:62:1: ( ruleUseCase EOF )
            // InternalUseCaseDslParser.g:63:1: ruleUseCase EOF
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
    // InternalUseCaseDslParser.g:70:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
    public final void ruleUseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:74:2: ( ( ( rule__UseCase__Group__0 ) ) )
            // InternalUseCaseDslParser.g:75:2: ( ( rule__UseCase__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:75:2: ( ( rule__UseCase__Group__0 ) )
            // InternalUseCaseDslParser.g:76:3: ( rule__UseCase__Group__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup()); 
            // InternalUseCaseDslParser.g:77:3: ( rule__UseCase__Group__0 )
            // InternalUseCaseDslParser.g:77:4: rule__UseCase__Group__0
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


    // $ANTLR start "entryRuleMainFlow"
    // InternalUseCaseDslParser.g:86:1: entryRuleMainFlow : ruleMainFlow EOF ;
    public final void entryRuleMainFlow() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:87:1: ( ruleMainFlow EOF )
            // InternalUseCaseDslParser.g:88:1: ruleMainFlow EOF
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
    // InternalUseCaseDslParser.g:95:1: ruleMainFlow : ( ( rule__MainFlow__Group__0 ) ) ;
    public final void ruleMainFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:99:2: ( ( ( rule__MainFlow__Group__0 ) ) )
            // InternalUseCaseDslParser.g:100:2: ( ( rule__MainFlow__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:100:2: ( ( rule__MainFlow__Group__0 ) )
            // InternalUseCaseDslParser.g:101:3: ( rule__MainFlow__Group__0 )
            {
             before(grammarAccess.getMainFlowAccess().getGroup()); 
            // InternalUseCaseDslParser.g:102:3: ( rule__MainFlow__Group__0 )
            // InternalUseCaseDslParser.g:102:4: rule__MainFlow__Group__0
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
    // InternalUseCaseDslParser.g:111:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:112:1: ( ruleStep EOF )
            // InternalUseCaseDslParser.g:113:1: ruleStep EOF
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
    // InternalUseCaseDslParser.g:120:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:124:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalUseCaseDslParser.g:125:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:125:2: ( ( rule__Step__Group__0 ) )
            // InternalUseCaseDslParser.g:126:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalUseCaseDslParser.g:127:3: ( rule__Step__Group__0 )
            // InternalUseCaseDslParser.g:127:4: rule__Step__Group__0
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
    // InternalUseCaseDslParser.g:136:1: entryRuleUserStep : ruleUserStep EOF ;
    public final void entryRuleUserStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:137:1: ( ruleUserStep EOF )
            // InternalUseCaseDslParser.g:138:1: ruleUserStep EOF
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
    // InternalUseCaseDslParser.g:145:1: ruleUserStep : ( ( rule__UserStep__Group__0 ) ) ;
    public final void ruleUserStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:149:2: ( ( ( rule__UserStep__Group__0 ) ) )
            // InternalUseCaseDslParser.g:150:2: ( ( rule__UserStep__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:150:2: ( ( rule__UserStep__Group__0 ) )
            // InternalUseCaseDslParser.g:151:3: ( rule__UserStep__Group__0 )
            {
             before(grammarAccess.getUserStepAccess().getGroup()); 
            // InternalUseCaseDslParser.g:152:3: ( rule__UserStep__Group__0 )
            // InternalUseCaseDslParser.g:152:4: rule__UserStep__Group__0
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
    // InternalUseCaseDslParser.g:161:1: entryRuleSystemStep : ruleSystemStep EOF ;
    public final void entryRuleSystemStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:162:1: ( ruleSystemStep EOF )
            // InternalUseCaseDslParser.g:163:1: ruleSystemStep EOF
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
    // InternalUseCaseDslParser.g:170:1: ruleSystemStep : ( ( rule__SystemStep__Group__0 ) ) ;
    public final void ruleSystemStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:174:2: ( ( ( rule__SystemStep__Group__0 ) ) )
            // InternalUseCaseDslParser.g:175:2: ( ( rule__SystemStep__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:175:2: ( ( rule__SystemStep__Group__0 ) )
            // InternalUseCaseDslParser.g:176:3: ( rule__SystemStep__Group__0 )
            {
             before(grammarAccess.getSystemStepAccess().getGroup()); 
            // InternalUseCaseDslParser.g:177:3: ( rule__SystemStep__Group__0 )
            // InternalUseCaseDslParser.g:177:4: rule__SystemStep__Group__0
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
    // InternalUseCaseDslParser.g:186:1: entryRuleLongName : ruleLongName EOF ;
    public final void entryRuleLongName() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:187:1: ( ruleLongName EOF )
            // InternalUseCaseDslParser.g:188:1: ruleLongName EOF
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
    // InternalUseCaseDslParser.g:195:1: ruleLongName : ( ( rule__LongName__Group__0 ) ) ;
    public final void ruleLongName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:199:2: ( ( ( rule__LongName__Group__0 ) ) )
            // InternalUseCaseDslParser.g:200:2: ( ( rule__LongName__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:200:2: ( ( rule__LongName__Group__0 ) )
            // InternalUseCaseDslParser.g:201:3: ( rule__LongName__Group__0 )
            {
             before(grammarAccess.getLongNameAccess().getGroup()); 
            // InternalUseCaseDslParser.g:202:3: ( rule__LongName__Group__0 )
            // InternalUseCaseDslParser.g:202:4: rule__LongName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LongName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLongNameAccess().getGroup()); 

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
    // InternalUseCaseDslParser.g:210:1: rule__Step__TypeAlternatives_2_0 : ( ( ruleUserStep ) | ( ruleSystemStep ) );
    public final void rule__Step__TypeAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:214:1: ( ( ruleUserStep ) | ( ruleSystemStep ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==FullStop) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==User) ) {
                    alt1=1;
                }
                else if ( (LA1_1==KW_System) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalUseCaseDslParser.g:215:2: ( ruleUserStep )
                    {
                    // InternalUseCaseDslParser.g:215:2: ( ruleUserStep )
                    // InternalUseCaseDslParser.g:216:3: ruleUserStep
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
                    // InternalUseCaseDslParser.g:221:2: ( ruleSystemStep )
                    {
                    // InternalUseCaseDslParser.g:221:2: ( ruleSystemStep )
                    // InternalUseCaseDslParser.g:222:3: ruleSystemStep
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


    // $ANTLR start "rule__LongName__Alternatives_0"
    // InternalUseCaseDslParser.g:231:1: rule__LongName__Alternatives_0 : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) );
    public final void rule__LongName__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:235:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt2=2;
                }
                break;
            case RULE_CHAR:
                {
                alt2=3;
                }
                break;
            case Colon:
                {
                alt2=4;
                }
                break;
            case FullStop:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalUseCaseDslParser.g:236:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:236:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:237:3: RULE_ID
                    {
                     before(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:242:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:242:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:243:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_0_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:248:2: ( RULE_CHAR )
                    {
                    // InternalUseCaseDslParser.g:248:2: ( RULE_CHAR )
                    // InternalUseCaseDslParser.g:249:3: RULE_CHAR
                    {
                     before(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_0_2()); 
                    match(input,RULE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:254:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:254:2: ( Colon )
                    // InternalUseCaseDslParser.g:255:3: Colon
                    {
                     before(grammarAccess.getLongNameAccess().getColonKeyword_0_3()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getColonKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:260:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:260:2: ( FullStop )
                    // InternalUseCaseDslParser.g:261:3: FullStop
                    {
                     before(grammarAccess.getLongNameAccess().getFullStopKeyword_0_4()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getFullStopKeyword_0_4()); 

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
    // $ANTLR end "rule__LongName__Alternatives_0"


    // $ANTLR start "rule__UseCase__Group__0"
    // InternalUseCaseDslParser.g:270:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:274:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCaseDslParser.g:275:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalUseCaseDslParser.g:282:1: rule__UseCase__Group__0__Impl : ( UC ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:286:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:287:1: ( UC )
            {
            // InternalUseCaseDslParser.g:287:1: ( UC )
            // InternalUseCaseDslParser.g:288:2: UC
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
    // InternalUseCaseDslParser.g:297:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:301:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCaseDslParser.g:302:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalUseCaseDslParser.g:309:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NumberAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:313:1: ( ( ( rule__UseCase__NumberAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:314:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:314:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            // InternalUseCaseDslParser.g:315:2: ( rule__UseCase__NumberAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNumberAssignment_1()); 
            // InternalUseCaseDslParser.g:316:2: ( rule__UseCase__NumberAssignment_1 )
            // InternalUseCaseDslParser.g:316:3: rule__UseCase__NumberAssignment_1
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
    // InternalUseCaseDslParser.g:324:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:328:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCaseDslParser.g:329:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCaseDslParser.g:336:1: rule__UseCase__Group__2__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:340:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:341:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:341:1: ( Colon )
            // InternalUseCaseDslParser.g:342:2: Colon
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
    // InternalUseCaseDslParser.g:351:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:355:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCaseDslParser.g:356:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:363:1: rule__UseCase__Group__3__Impl : ( ( ( rule__UseCase__NameAssignment_3 ) ) ( ( rule__UseCase__NameAssignment_3 )* ) ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:367:1: ( ( ( ( rule__UseCase__NameAssignment_3 ) ) ( ( rule__UseCase__NameAssignment_3 )* ) ) )
            // InternalUseCaseDslParser.g:368:1: ( ( ( rule__UseCase__NameAssignment_3 ) ) ( ( rule__UseCase__NameAssignment_3 )* ) )
            {
            // InternalUseCaseDslParser.g:368:1: ( ( ( rule__UseCase__NameAssignment_3 ) ) ( ( rule__UseCase__NameAssignment_3 )* ) )
            // InternalUseCaseDslParser.g:369:2: ( ( rule__UseCase__NameAssignment_3 ) ) ( ( rule__UseCase__NameAssignment_3 )* )
            {
            // InternalUseCaseDslParser.g:369:2: ( ( rule__UseCase__NameAssignment_3 ) )
            // InternalUseCaseDslParser.g:370:3: ( rule__UseCase__NameAssignment_3 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_3()); 
            // InternalUseCaseDslParser.g:371:3: ( rule__UseCase__NameAssignment_3 )
            // InternalUseCaseDslParser.g:371:4: rule__UseCase__NameAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__UseCase__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getNameAssignment_3()); 

            }

            // InternalUseCaseDslParser.g:374:2: ( ( rule__UseCase__NameAssignment_3 )* )
            // InternalUseCaseDslParser.g:375:3: ( rule__UseCase__NameAssignment_3 )*
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_3()); 
            // InternalUseCaseDslParser.g:376:3: ( rule__UseCase__NameAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=FullStop && LA3_0<=RULE_CHAR)||LA3_0==RULE_ID||LA3_0==RULE_ANY_OTHER) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:376:4: rule__UseCase__NameAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__UseCase__NameAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__UseCase__Group__3__Impl"


    // $ANTLR start "rule__UseCase__Group__4"
    // InternalUseCaseDslParser.g:385:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:389:1: ( rule__UseCase__Group__4__Impl )
            // InternalUseCaseDslParser.g:390:2: rule__UseCase__Group__4__Impl
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
    // InternalUseCaseDslParser.g:396:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__MainflowAssignment_4 ) ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:400:1: ( ( ( rule__UseCase__MainflowAssignment_4 ) ) )
            // InternalUseCaseDslParser.g:401:1: ( ( rule__UseCase__MainflowAssignment_4 ) )
            {
            // InternalUseCaseDslParser.g:401:1: ( ( rule__UseCase__MainflowAssignment_4 ) )
            // InternalUseCaseDslParser.g:402:2: ( rule__UseCase__MainflowAssignment_4 )
            {
             before(grammarAccess.getUseCaseAccess().getMainflowAssignment_4()); 
            // InternalUseCaseDslParser.g:403:2: ( rule__UseCase__MainflowAssignment_4 )
            // InternalUseCaseDslParser.g:403:3: rule__UseCase__MainflowAssignment_4
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
    // InternalUseCaseDslParser.g:412:1: rule__MainFlow__Group__0 : rule__MainFlow__Group__0__Impl rule__MainFlow__Group__1 ;
    public final void rule__MainFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:416:1: ( rule__MainFlow__Group__0__Impl rule__MainFlow__Group__1 )
            // InternalUseCaseDslParser.g:417:2: rule__MainFlow__Group__0__Impl rule__MainFlow__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:424:1: rule__MainFlow__Group__0__Impl : ( () ) ;
    public final void rule__MainFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:428:1: ( ( () ) )
            // InternalUseCaseDslParser.g:429:1: ( () )
            {
            // InternalUseCaseDslParser.g:429:1: ( () )
            // InternalUseCaseDslParser.g:430:2: ()
            {
             before(grammarAccess.getMainFlowAccess().getMainFlowAction_0()); 
            // InternalUseCaseDslParser.g:431:2: ()
            // InternalUseCaseDslParser.g:431:3: 
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
    // InternalUseCaseDslParser.g:439:1: rule__MainFlow__Group__1 : rule__MainFlow__Group__1__Impl rule__MainFlow__Group__2 ;
    public final void rule__MainFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:443:1: ( rule__MainFlow__Group__1__Impl rule__MainFlow__Group__2 )
            // InternalUseCaseDslParser.g:444:2: rule__MainFlow__Group__1__Impl rule__MainFlow__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalUseCaseDslParser.g:451:1: rule__MainFlow__Group__1__Impl : ( MainFlow ) ;
    public final void rule__MainFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:455:1: ( ( MainFlow ) )
            // InternalUseCaseDslParser.g:456:1: ( MainFlow )
            {
            // InternalUseCaseDslParser.g:456:1: ( MainFlow )
            // InternalUseCaseDslParser.g:457:2: MainFlow
            {
             before(grammarAccess.getMainFlowAccess().getMainFlowKeyword_1()); 
            match(input,MainFlow,FOLLOW_2); 
             after(grammarAccess.getMainFlowAccess().getMainFlowKeyword_1()); 

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
    // InternalUseCaseDslParser.g:466:1: rule__MainFlow__Group__2 : rule__MainFlow__Group__2__Impl rule__MainFlow__Group__3 ;
    public final void rule__MainFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:470:1: ( rule__MainFlow__Group__2__Impl rule__MainFlow__Group__3 )
            // InternalUseCaseDslParser.g:471:2: rule__MainFlow__Group__2__Impl rule__MainFlow__Group__3
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
    // InternalUseCaseDslParser.g:478:1: rule__MainFlow__Group__2__Impl : ( Colon ) ;
    public final void rule__MainFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:482:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:483:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:483:1: ( Colon )
            // InternalUseCaseDslParser.g:484:2: Colon
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
    // InternalUseCaseDslParser.g:493:1: rule__MainFlow__Group__3 : rule__MainFlow__Group__3__Impl rule__MainFlow__Group__4 ;
    public final void rule__MainFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:497:1: ( rule__MainFlow__Group__3__Impl rule__MainFlow__Group__4 )
            // InternalUseCaseDslParser.g:498:2: rule__MainFlow__Group__3__Impl rule__MainFlow__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalUseCaseDslParser.g:505:1: rule__MainFlow__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__MainFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:509:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:510:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:510:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:511:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:520:1: rule__MainFlow__Group__4 : rule__MainFlow__Group__4__Impl rule__MainFlow__Group__5 ;
    public final void rule__MainFlow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:524:1: ( rule__MainFlow__Group__4__Impl rule__MainFlow__Group__5 )
            // InternalUseCaseDslParser.g:525:2: rule__MainFlow__Group__4__Impl rule__MainFlow__Group__5
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
    // InternalUseCaseDslParser.g:532:1: rule__MainFlow__Group__4__Impl : ( ( ( rule__MainFlow__StepsAssignment_4 ) ) ( ( rule__MainFlow__StepsAssignment_4 )* ) ) ;
    public final void rule__MainFlow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:536:1: ( ( ( ( rule__MainFlow__StepsAssignment_4 ) ) ( ( rule__MainFlow__StepsAssignment_4 )* ) ) )
            // InternalUseCaseDslParser.g:537:1: ( ( ( rule__MainFlow__StepsAssignment_4 ) ) ( ( rule__MainFlow__StepsAssignment_4 )* ) )
            {
            // InternalUseCaseDslParser.g:537:1: ( ( ( rule__MainFlow__StepsAssignment_4 ) ) ( ( rule__MainFlow__StepsAssignment_4 )* ) )
            // InternalUseCaseDslParser.g:538:2: ( ( rule__MainFlow__StepsAssignment_4 ) ) ( ( rule__MainFlow__StepsAssignment_4 )* )
            {
            // InternalUseCaseDslParser.g:538:2: ( ( rule__MainFlow__StepsAssignment_4 ) )
            // InternalUseCaseDslParser.g:539:3: ( rule__MainFlow__StepsAssignment_4 )
            {
             before(grammarAccess.getMainFlowAccess().getStepsAssignment_4()); 
            // InternalUseCaseDslParser.g:540:3: ( rule__MainFlow__StepsAssignment_4 )
            // InternalUseCaseDslParser.g:540:4: rule__MainFlow__StepsAssignment_4
            {
            pushFollow(FOLLOW_10);
            rule__MainFlow__StepsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMainFlowAccess().getStepsAssignment_4()); 

            }

            // InternalUseCaseDslParser.g:543:2: ( ( rule__MainFlow__StepsAssignment_4 )* )
            // InternalUseCaseDslParser.g:544:3: ( rule__MainFlow__StepsAssignment_4 )*
            {
             before(grammarAccess.getMainFlowAccess().getStepsAssignment_4()); 
            // InternalUseCaseDslParser.g:545:3: ( rule__MainFlow__StepsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:545:4: rule__MainFlow__StepsAssignment_4
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
    // InternalUseCaseDslParser.g:554:1: rule__MainFlow__Group__5 : rule__MainFlow__Group__5__Impl ;
    public final void rule__MainFlow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:558:1: ( rule__MainFlow__Group__5__Impl )
            // InternalUseCaseDslParser.g:559:2: rule__MainFlow__Group__5__Impl
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
    // InternalUseCaseDslParser.g:565:1: rule__MainFlow__Group__5__Impl : ( RULE_END ) ;
    public final void rule__MainFlow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:569:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:570:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:570:1: ( RULE_END )
            // InternalUseCaseDslParser.g:571:2: RULE_END
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
    // InternalUseCaseDslParser.g:581:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:585:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalUseCaseDslParser.g:586:2: rule__Step__Group__0__Impl rule__Step__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalUseCaseDslParser.g:593:1: rule__Step__Group__0__Impl : ( () ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:597:1: ( ( () ) )
            // InternalUseCaseDslParser.g:598:1: ( () )
            {
            // InternalUseCaseDslParser.g:598:1: ( () )
            // InternalUseCaseDslParser.g:599:2: ()
            {
             before(grammarAccess.getStepAccess().getStepAction_0()); 
            // InternalUseCaseDslParser.g:600:2: ()
            // InternalUseCaseDslParser.g:600:3: 
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
    // InternalUseCaseDslParser.g:608:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:612:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalUseCaseDslParser.g:613:2: rule__Step__Group__1__Impl rule__Step__Group__2
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
    // InternalUseCaseDslParser.g:620:1: rule__Step__Group__1__Impl : ( ( rule__Step__NameAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:624:1: ( ( ( rule__Step__NameAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:625:1: ( ( rule__Step__NameAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:625:1: ( ( rule__Step__NameAssignment_1 ) )
            // InternalUseCaseDslParser.g:626:2: ( rule__Step__NameAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getNameAssignment_1()); 
            // InternalUseCaseDslParser.g:627:2: ( rule__Step__NameAssignment_1 )
            // InternalUseCaseDslParser.g:627:3: rule__Step__NameAssignment_1
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
    // InternalUseCaseDslParser.g:635:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:639:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalUseCaseDslParser.g:640:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalUseCaseDslParser.g:647:1: rule__Step__Group__2__Impl : ( ( rule__Step__TypeAssignment_2 ) ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:651:1: ( ( ( rule__Step__TypeAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:652:1: ( ( rule__Step__TypeAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:652:1: ( ( rule__Step__TypeAssignment_2 ) )
            // InternalUseCaseDslParser.g:653:2: ( rule__Step__TypeAssignment_2 )
            {
             before(grammarAccess.getStepAccess().getTypeAssignment_2()); 
            // InternalUseCaseDslParser.g:654:2: ( rule__Step__TypeAssignment_2 )
            // InternalUseCaseDslParser.g:654:3: rule__Step__TypeAssignment_2
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
    // InternalUseCaseDslParser.g:662:1: rule__Step__Group__3 : rule__Step__Group__3__Impl ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:666:1: ( rule__Step__Group__3__Impl )
            // InternalUseCaseDslParser.g:667:2: rule__Step__Group__3__Impl
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
    // InternalUseCaseDslParser.g:673:1: rule__Step__Group__3__Impl : ( ( ( rule__Step__SentenceAssignment_3 ) ) ( ( rule__Step__SentenceAssignment_3 )* ) ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:677:1: ( ( ( ( rule__Step__SentenceAssignment_3 ) ) ( ( rule__Step__SentenceAssignment_3 )* ) ) )
            // InternalUseCaseDslParser.g:678:1: ( ( ( rule__Step__SentenceAssignment_3 ) ) ( ( rule__Step__SentenceAssignment_3 )* ) )
            {
            // InternalUseCaseDslParser.g:678:1: ( ( ( rule__Step__SentenceAssignment_3 ) ) ( ( rule__Step__SentenceAssignment_3 )* ) )
            // InternalUseCaseDslParser.g:679:2: ( ( rule__Step__SentenceAssignment_3 ) ) ( ( rule__Step__SentenceAssignment_3 )* )
            {
            // InternalUseCaseDslParser.g:679:2: ( ( rule__Step__SentenceAssignment_3 ) )
            // InternalUseCaseDslParser.g:680:3: ( rule__Step__SentenceAssignment_3 )
            {
             before(grammarAccess.getStepAccess().getSentenceAssignment_3()); 
            // InternalUseCaseDslParser.g:681:3: ( rule__Step__SentenceAssignment_3 )
            // InternalUseCaseDslParser.g:681:4: rule__Step__SentenceAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Step__SentenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getSentenceAssignment_3()); 

            }

            // InternalUseCaseDslParser.g:684:2: ( ( rule__Step__SentenceAssignment_3 )* )
            // InternalUseCaseDslParser.g:685:3: ( rule__Step__SentenceAssignment_3 )*
            {
             before(grammarAccess.getStepAccess().getSentenceAssignment_3()); 
            // InternalUseCaseDslParser.g:686:3: ( rule__Step__SentenceAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=FullStop && LA5_0<=RULE_CHAR)||LA5_0==RULE_ID||LA5_0==RULE_ANY_OTHER) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:686:4: rule__Step__SentenceAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Step__SentenceAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStepAccess().getSentenceAssignment_3()); 

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
    // $ANTLR end "rule__Step__Group__3__Impl"


    // $ANTLR start "rule__UserStep__Group__0"
    // InternalUseCaseDslParser.g:696:1: rule__UserStep__Group__0 : rule__UserStep__Group__0__Impl rule__UserStep__Group__1 ;
    public final void rule__UserStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:700:1: ( rule__UserStep__Group__0__Impl rule__UserStep__Group__1 )
            // InternalUseCaseDslParser.g:701:2: rule__UserStep__Group__0__Impl rule__UserStep__Group__1
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
    // InternalUseCaseDslParser.g:708:1: rule__UserStep__Group__0__Impl : ( () ) ;
    public final void rule__UserStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:712:1: ( ( () ) )
            // InternalUseCaseDslParser.g:713:1: ( () )
            {
            // InternalUseCaseDslParser.g:713:1: ( () )
            // InternalUseCaseDslParser.g:714:2: ()
            {
             before(grammarAccess.getUserStepAccess().getUserStepAction_0()); 
            // InternalUseCaseDslParser.g:715:2: ()
            // InternalUseCaseDslParser.g:715:3: 
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
    // InternalUseCaseDslParser.g:723:1: rule__UserStep__Group__1 : rule__UserStep__Group__1__Impl rule__UserStep__Group__2 ;
    public final void rule__UserStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:727:1: ( rule__UserStep__Group__1__Impl rule__UserStep__Group__2 )
            // InternalUseCaseDslParser.g:728:2: rule__UserStep__Group__1__Impl rule__UserStep__Group__2
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
    // InternalUseCaseDslParser.g:735:1: rule__UserStep__Group__1__Impl : ( FullStop ) ;
    public final void rule__UserStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:739:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:740:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:740:1: ( FullStop )
            // InternalUseCaseDslParser.g:741:2: FullStop
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
    // InternalUseCaseDslParser.g:750:1: rule__UserStep__Group__2 : rule__UserStep__Group__2__Impl ;
    public final void rule__UserStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:754:1: ( rule__UserStep__Group__2__Impl )
            // InternalUseCaseDslParser.g:755:2: rule__UserStep__Group__2__Impl
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
    // InternalUseCaseDslParser.g:761:1: rule__UserStep__Group__2__Impl : ( User ) ;
    public final void rule__UserStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:765:1: ( ( User ) )
            // InternalUseCaseDslParser.g:766:1: ( User )
            {
            // InternalUseCaseDslParser.g:766:1: ( User )
            // InternalUseCaseDslParser.g:767:2: User
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
    // InternalUseCaseDslParser.g:777:1: rule__SystemStep__Group__0 : rule__SystemStep__Group__0__Impl rule__SystemStep__Group__1 ;
    public final void rule__SystemStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:781:1: ( rule__SystemStep__Group__0__Impl rule__SystemStep__Group__1 )
            // InternalUseCaseDslParser.g:782:2: rule__SystemStep__Group__0__Impl rule__SystemStep__Group__1
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
    // InternalUseCaseDslParser.g:789:1: rule__SystemStep__Group__0__Impl : ( () ) ;
    public final void rule__SystemStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:793:1: ( ( () ) )
            // InternalUseCaseDslParser.g:794:1: ( () )
            {
            // InternalUseCaseDslParser.g:794:1: ( () )
            // InternalUseCaseDslParser.g:795:2: ()
            {
             before(grammarAccess.getSystemStepAccess().getSystemStepAction_0()); 
            // InternalUseCaseDslParser.g:796:2: ()
            // InternalUseCaseDslParser.g:796:3: 
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
    // InternalUseCaseDslParser.g:804:1: rule__SystemStep__Group__1 : rule__SystemStep__Group__1__Impl rule__SystemStep__Group__2 ;
    public final void rule__SystemStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:808:1: ( rule__SystemStep__Group__1__Impl rule__SystemStep__Group__2 )
            // InternalUseCaseDslParser.g:809:2: rule__SystemStep__Group__1__Impl rule__SystemStep__Group__2
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
    // InternalUseCaseDslParser.g:816:1: rule__SystemStep__Group__1__Impl : ( FullStop ) ;
    public final void rule__SystemStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:820:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:821:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:821:1: ( FullStop )
            // InternalUseCaseDslParser.g:822:2: FullStop
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
    // InternalUseCaseDslParser.g:831:1: rule__SystemStep__Group__2 : rule__SystemStep__Group__2__Impl ;
    public final void rule__SystemStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:835:1: ( rule__SystemStep__Group__2__Impl )
            // InternalUseCaseDslParser.g:836:2: rule__SystemStep__Group__2__Impl
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
    // InternalUseCaseDslParser.g:842:1: rule__SystemStep__Group__2__Impl : ( KW_System ) ;
    public final void rule__SystemStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:846:1: ( ( KW_System ) )
            // InternalUseCaseDslParser.g:847:1: ( KW_System )
            {
            // InternalUseCaseDslParser.g:847:1: ( KW_System )
            // InternalUseCaseDslParser.g:848:2: KW_System
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


    // $ANTLR start "rule__LongName__Group__0"
    // InternalUseCaseDslParser.g:858:1: rule__LongName__Group__0 : rule__LongName__Group__0__Impl rule__LongName__Group__1 ;
    public final void rule__LongName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:862:1: ( rule__LongName__Group__0__Impl rule__LongName__Group__1 )
            // InternalUseCaseDslParser.g:863:2: rule__LongName__Group__0__Impl rule__LongName__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__LongName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LongName__Group__1();

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
    // $ANTLR end "rule__LongName__Group__0"


    // $ANTLR start "rule__LongName__Group__0__Impl"
    // InternalUseCaseDslParser.g:870:1: rule__LongName__Group__0__Impl : ( ( rule__LongName__Alternatives_0 ) ) ;
    public final void rule__LongName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:874:1: ( ( ( rule__LongName__Alternatives_0 ) ) )
            // InternalUseCaseDslParser.g:875:1: ( ( rule__LongName__Alternatives_0 ) )
            {
            // InternalUseCaseDslParser.g:875:1: ( ( rule__LongName__Alternatives_0 ) )
            // InternalUseCaseDslParser.g:876:2: ( rule__LongName__Alternatives_0 )
            {
             before(grammarAccess.getLongNameAccess().getAlternatives_0()); 
            // InternalUseCaseDslParser.g:877:2: ( rule__LongName__Alternatives_0 )
            // InternalUseCaseDslParser.g:877:3: rule__LongName__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__LongName__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getLongNameAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__LongName__Group__0__Impl"


    // $ANTLR start "rule__LongName__Group__1"
    // InternalUseCaseDslParser.g:885:1: rule__LongName__Group__1 : rule__LongName__Group__1__Impl ;
    public final void rule__LongName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:889:1: ( rule__LongName__Group__1__Impl )
            // InternalUseCaseDslParser.g:890:2: rule__LongName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LongName__Group__1__Impl();

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
    // $ANTLR end "rule__LongName__Group__1"


    // $ANTLR start "rule__LongName__Group__1__Impl"
    // InternalUseCaseDslParser.g:896:1: rule__LongName__Group__1__Impl : ( ( RULE_WS )? ) ;
    public final void rule__LongName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:900:1: ( ( ( RULE_WS )? ) )
            // InternalUseCaseDslParser.g:901:1: ( ( RULE_WS )? )
            {
            // InternalUseCaseDslParser.g:901:1: ( ( RULE_WS )? )
            // InternalUseCaseDslParser.g:902:2: ( RULE_WS )?
            {
             before(grammarAccess.getLongNameAccess().getWSTerminalRuleCall_1()); 
            // InternalUseCaseDslParser.g:903:2: ( RULE_WS )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_WS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCaseDslParser.g:903:3: RULE_WS
                    {
                    match(input,RULE_WS,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLongNameAccess().getWSTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__LongName__Group__1__Impl"


    // $ANTLR start "rule__UseCase__NumberAssignment_1"
    // InternalUseCaseDslParser.g:912:1: rule__UseCase__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__UseCase__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:916:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:917:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:917:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:918:3: RULE_INT
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
    // InternalUseCaseDslParser.g:927:1: rule__UseCase__NameAssignment_3 : ( ruleLongName ) ;
    public final void rule__UseCase__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:931:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:932:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:932:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:933:3: ruleLongName
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
    // InternalUseCaseDslParser.g:942:1: rule__UseCase__MainflowAssignment_4 : ( ruleMainFlow ) ;
    public final void rule__UseCase__MainflowAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:946:1: ( ( ruleMainFlow ) )
            // InternalUseCaseDslParser.g:947:2: ( ruleMainFlow )
            {
            // InternalUseCaseDslParser.g:947:2: ( ruleMainFlow )
            // InternalUseCaseDslParser.g:948:3: ruleMainFlow
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


    // $ANTLR start "rule__MainFlow__StepsAssignment_4"
    // InternalUseCaseDslParser.g:957:1: rule__MainFlow__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__MainFlow__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:961:1: ( ( ruleStep ) )
            // InternalUseCaseDslParser.g:962:2: ( ruleStep )
            {
            // InternalUseCaseDslParser.g:962:2: ( ruleStep )
            // InternalUseCaseDslParser.g:963:3: ruleStep
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
    // InternalUseCaseDslParser.g:972:1: rule__Step__NameAssignment_1 : ( RULE_INT ) ;
    public final void rule__Step__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:976:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:977:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:977:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:978:3: RULE_INT
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
    // InternalUseCaseDslParser.g:987:1: rule__Step__TypeAssignment_2 : ( ( rule__Step__TypeAlternatives_2_0 ) ) ;
    public final void rule__Step__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:991:1: ( ( ( rule__Step__TypeAlternatives_2_0 ) ) )
            // InternalUseCaseDslParser.g:992:2: ( ( rule__Step__TypeAlternatives_2_0 ) )
            {
            // InternalUseCaseDslParser.g:992:2: ( ( rule__Step__TypeAlternatives_2_0 ) )
            // InternalUseCaseDslParser.g:993:3: ( rule__Step__TypeAlternatives_2_0 )
            {
             before(grammarAccess.getStepAccess().getTypeAlternatives_2_0()); 
            // InternalUseCaseDslParser.g:994:3: ( rule__Step__TypeAlternatives_2_0 )
            // InternalUseCaseDslParser.g:994:4: rule__Step__TypeAlternatives_2_0
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
    // InternalUseCaseDslParser.g:1002:1: rule__Step__SentenceAssignment_3 : ( ruleLongName ) ;
    public final void rule__Step__SentenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1006:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:1007:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:1007:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:1008:3: ruleLongName
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000082700L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000082702L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});

}