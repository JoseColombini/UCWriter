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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MainFlow", "KW_System", "User", "UC", "FullStop", "Colon", "Semicolon", "RULE_CHAR", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=13;
    public static final int User=6;
    public static final int RULE_BEGIN=12;
    public static final int KW_System=5;
    public static final int RULE_STRING=16;
    public static final int UC=7;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_CHAR=11;
    public static final int Colon=9;
    public static final int EOF=-1;
    public static final int FullStop=8;
    public static final int RULE_ID=14;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=20;
    public static final int Semicolon=10;
    public static final int MainFlow=4;
    public static final int RULE_INT=15;
    public static final int RULE_ML_COMMENT=17;

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
    		tokenNameToValue.put("Semicolon", "';'");
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
    // InternalUseCaseDslParser.g:62:1: entryRuleUseCase : ruleUseCase EOF ;
    public final void entryRuleUseCase() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:63:1: ( ruleUseCase EOF )
            // InternalUseCaseDslParser.g:64:1: ruleUseCase EOF
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
    // InternalUseCaseDslParser.g:71:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
    public final void ruleUseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:75:2: ( ( ( rule__UseCase__Group__0 ) ) )
            // InternalUseCaseDslParser.g:76:2: ( ( rule__UseCase__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:76:2: ( ( rule__UseCase__Group__0 ) )
            // InternalUseCaseDslParser.g:77:3: ( rule__UseCase__Group__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup()); 
            // InternalUseCaseDslParser.g:78:3: ( rule__UseCase__Group__0 )
            // InternalUseCaseDslParser.g:78:4: rule__UseCase__Group__0
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
    // InternalUseCaseDslParser.g:87:1: entryRuleMainFlow : ruleMainFlow EOF ;
    public final void entryRuleMainFlow() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:88:1: ( ruleMainFlow EOF )
            // InternalUseCaseDslParser.g:89:1: ruleMainFlow EOF
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
    // InternalUseCaseDslParser.g:96:1: ruleMainFlow : ( ( rule__MainFlow__Group__0 ) ) ;
    public final void ruleMainFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:100:2: ( ( ( rule__MainFlow__Group__0 ) ) )
            // InternalUseCaseDslParser.g:101:2: ( ( rule__MainFlow__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:101:2: ( ( rule__MainFlow__Group__0 ) )
            // InternalUseCaseDslParser.g:102:3: ( rule__MainFlow__Group__0 )
            {
             before(grammarAccess.getMainFlowAccess().getGroup()); 
            // InternalUseCaseDslParser.g:103:3: ( rule__MainFlow__Group__0 )
            // InternalUseCaseDslParser.g:103:4: rule__MainFlow__Group__0
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
    // InternalUseCaseDslParser.g:112:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:113:1: ( ruleStep EOF )
            // InternalUseCaseDslParser.g:114:1: ruleStep EOF
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
    // InternalUseCaseDslParser.g:121:1: ruleStep : ( ( rule__Step__Group__0 ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:125:2: ( ( ( rule__Step__Group__0 ) ) )
            // InternalUseCaseDslParser.g:126:2: ( ( rule__Step__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:126:2: ( ( rule__Step__Group__0 ) )
            // InternalUseCaseDslParser.g:127:3: ( rule__Step__Group__0 )
            {
             before(grammarAccess.getStepAccess().getGroup()); 
            // InternalUseCaseDslParser.g:128:3: ( rule__Step__Group__0 )
            // InternalUseCaseDslParser.g:128:4: rule__Step__Group__0
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
    // InternalUseCaseDslParser.g:137:1: entryRuleUserStep : ruleUserStep EOF ;
    public final void entryRuleUserStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:138:1: ( ruleUserStep EOF )
            // InternalUseCaseDslParser.g:139:1: ruleUserStep EOF
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
    // InternalUseCaseDslParser.g:146:1: ruleUserStep : ( ( rule__UserStep__Group__0 ) ) ;
    public final void ruleUserStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:150:2: ( ( ( rule__UserStep__Group__0 ) ) )
            // InternalUseCaseDslParser.g:151:2: ( ( rule__UserStep__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:151:2: ( ( rule__UserStep__Group__0 ) )
            // InternalUseCaseDslParser.g:152:3: ( rule__UserStep__Group__0 )
            {
             before(grammarAccess.getUserStepAccess().getGroup()); 
            // InternalUseCaseDslParser.g:153:3: ( rule__UserStep__Group__0 )
            // InternalUseCaseDslParser.g:153:4: rule__UserStep__Group__0
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
    // InternalUseCaseDslParser.g:162:1: entryRuleSystemStep : ruleSystemStep EOF ;
    public final void entryRuleSystemStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:163:1: ( ruleSystemStep EOF )
            // InternalUseCaseDslParser.g:164:1: ruleSystemStep EOF
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
    // InternalUseCaseDslParser.g:171:1: ruleSystemStep : ( ( rule__SystemStep__Group__0 ) ) ;
    public final void ruleSystemStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:175:2: ( ( ( rule__SystemStep__Group__0 ) ) )
            // InternalUseCaseDslParser.g:176:2: ( ( rule__SystemStep__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:176:2: ( ( rule__SystemStep__Group__0 ) )
            // InternalUseCaseDslParser.g:177:3: ( rule__SystemStep__Group__0 )
            {
             before(grammarAccess.getSystemStepAccess().getGroup()); 
            // InternalUseCaseDslParser.g:178:3: ( rule__SystemStep__Group__0 )
            // InternalUseCaseDslParser.g:178:4: rule__SystemStep__Group__0
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


    // $ANTLR start "entryRuleSentence"
    // InternalUseCaseDslParser.g:187:1: entryRuleSentence : ruleSentence EOF ;
    public final void entryRuleSentence() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:188:1: ( ruleSentence EOF )
            // InternalUseCaseDslParser.g:189:1: ruleSentence EOF
            {
             before(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getSentenceRule()); 
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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalUseCaseDslParser.g:196:1: ruleSentence : ( ( RULE_STRING )* ) ;
    public final void ruleSentence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:200:2: ( ( ( RULE_STRING )* ) )
            // InternalUseCaseDslParser.g:201:2: ( ( RULE_STRING )* )
            {
            // InternalUseCaseDslParser.g:201:2: ( ( RULE_STRING )* )
            // InternalUseCaseDslParser.g:202:3: ( RULE_STRING )*
            {
             before(grammarAccess.getSentenceAccess().getSTRINGTerminalRuleCall()); 
            // InternalUseCaseDslParser.g:203:3: ( RULE_STRING )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:203:4: RULE_STRING
            	    {
            	    match(input,RULE_STRING,FOLLOW_3); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSentenceAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleSentence"


    // $ANTLR start "rule__Step__TypeAlternatives_1_0"
    // InternalUseCaseDslParser.g:211:1: rule__Step__TypeAlternatives_1_0 : ( ( ruleUserStep ) | ( ruleSystemStep ) );
    public final void rule__Step__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:215:1: ( ( ruleUserStep ) | ( ruleSystemStep ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==FullStop) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==KW_System) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==User) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
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
                    // InternalUseCaseDslParser.g:216:2: ( ruleUserStep )
                    {
                    // InternalUseCaseDslParser.g:216:2: ( ruleUserStep )
                    // InternalUseCaseDslParser.g:217:3: ruleUserStep
                    {
                     before(grammarAccess.getStepAccess().getTypeUserStepParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUserStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getTypeUserStepParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:222:2: ( ruleSystemStep )
                    {
                    // InternalUseCaseDslParser.g:222:2: ( ruleSystemStep )
                    // InternalUseCaseDslParser.g:223:3: ruleSystemStep
                    {
                     before(grammarAccess.getStepAccess().getTypeSystemStepParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSystemStep();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getTypeSystemStepParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Step__TypeAlternatives_1_0"


    // $ANTLR start "rule__UseCase__Group__0"
    // InternalUseCaseDslParser.g:232:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:236:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCaseDslParser.g:237:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
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
    // InternalUseCaseDslParser.g:244:1: rule__UseCase__Group__0__Impl : ( UC ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:248:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:249:1: ( UC )
            {
            // InternalUseCaseDslParser.g:249:1: ( UC )
            // InternalUseCaseDslParser.g:250:2: UC
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
    // InternalUseCaseDslParser.g:259:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:263:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCaseDslParser.g:264:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
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
    // InternalUseCaseDslParser.g:271:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NumberAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:275:1: ( ( ( rule__UseCase__NumberAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:276:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:276:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            // InternalUseCaseDslParser.g:277:2: ( rule__UseCase__NumberAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNumberAssignment_1()); 
            // InternalUseCaseDslParser.g:278:2: ( rule__UseCase__NumberAssignment_1 )
            // InternalUseCaseDslParser.g:278:3: rule__UseCase__NumberAssignment_1
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
    // InternalUseCaseDslParser.g:286:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:290:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCaseDslParser.g:291:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
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
    // InternalUseCaseDslParser.g:298:1: rule__UseCase__Group__2__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:302:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:303:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:303:1: ( Colon )
            // InternalUseCaseDslParser.g:304:2: Colon
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
    // InternalUseCaseDslParser.g:313:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:317:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCaseDslParser.g:318:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
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
    // InternalUseCaseDslParser.g:325:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__NameAssignment_3 ) ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:329:1: ( ( ( rule__UseCase__NameAssignment_3 ) ) )
            // InternalUseCaseDslParser.g:330:1: ( ( rule__UseCase__NameAssignment_3 ) )
            {
            // InternalUseCaseDslParser.g:330:1: ( ( rule__UseCase__NameAssignment_3 ) )
            // InternalUseCaseDslParser.g:331:2: ( rule__UseCase__NameAssignment_3 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_3()); 
            // InternalUseCaseDslParser.g:332:2: ( rule__UseCase__NameAssignment_3 )
            // InternalUseCaseDslParser.g:332:3: rule__UseCase__NameAssignment_3
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
    // InternalUseCaseDslParser.g:340:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:344:1: ( rule__UseCase__Group__4__Impl )
            // InternalUseCaseDslParser.g:345:2: rule__UseCase__Group__4__Impl
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
    // InternalUseCaseDslParser.g:351:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__MainflowAssignment_4 ) ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:355:1: ( ( ( rule__UseCase__MainflowAssignment_4 ) ) )
            // InternalUseCaseDslParser.g:356:1: ( ( rule__UseCase__MainflowAssignment_4 ) )
            {
            // InternalUseCaseDslParser.g:356:1: ( ( rule__UseCase__MainflowAssignment_4 ) )
            // InternalUseCaseDslParser.g:357:2: ( rule__UseCase__MainflowAssignment_4 )
            {
             before(grammarAccess.getUseCaseAccess().getMainflowAssignment_4()); 
            // InternalUseCaseDslParser.g:358:2: ( rule__UseCase__MainflowAssignment_4 )
            // InternalUseCaseDslParser.g:358:3: rule__UseCase__MainflowAssignment_4
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
    // InternalUseCaseDslParser.g:367:1: rule__MainFlow__Group__0 : rule__MainFlow__Group__0__Impl rule__MainFlow__Group__1 ;
    public final void rule__MainFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:371:1: ( rule__MainFlow__Group__0__Impl rule__MainFlow__Group__1 )
            // InternalUseCaseDslParser.g:372:2: rule__MainFlow__Group__0__Impl rule__MainFlow__Group__1
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
    // InternalUseCaseDslParser.g:379:1: rule__MainFlow__Group__0__Impl : ( () ) ;
    public final void rule__MainFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:383:1: ( ( () ) )
            // InternalUseCaseDslParser.g:384:1: ( () )
            {
            // InternalUseCaseDslParser.g:384:1: ( () )
            // InternalUseCaseDslParser.g:385:2: ()
            {
             before(grammarAccess.getMainFlowAccess().getMainFlowAction_0()); 
            // InternalUseCaseDslParser.g:386:2: ()
            // InternalUseCaseDslParser.g:386:3: 
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
    // InternalUseCaseDslParser.g:394:1: rule__MainFlow__Group__1 : rule__MainFlow__Group__1__Impl rule__MainFlow__Group__2 ;
    public final void rule__MainFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:398:1: ( rule__MainFlow__Group__1__Impl rule__MainFlow__Group__2 )
            // InternalUseCaseDslParser.g:399:2: rule__MainFlow__Group__1__Impl rule__MainFlow__Group__2
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
    // InternalUseCaseDslParser.g:406:1: rule__MainFlow__Group__1__Impl : ( MainFlow ) ;
    public final void rule__MainFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:410:1: ( ( MainFlow ) )
            // InternalUseCaseDslParser.g:411:1: ( MainFlow )
            {
            // InternalUseCaseDslParser.g:411:1: ( MainFlow )
            // InternalUseCaseDslParser.g:412:2: MainFlow
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
    // InternalUseCaseDslParser.g:421:1: rule__MainFlow__Group__2 : rule__MainFlow__Group__2__Impl rule__MainFlow__Group__3 ;
    public final void rule__MainFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:425:1: ( rule__MainFlow__Group__2__Impl rule__MainFlow__Group__3 )
            // InternalUseCaseDslParser.g:426:2: rule__MainFlow__Group__2__Impl rule__MainFlow__Group__3
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
    // InternalUseCaseDslParser.g:433:1: rule__MainFlow__Group__2__Impl : ( Colon ) ;
    public final void rule__MainFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:437:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:438:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:438:1: ( Colon )
            // InternalUseCaseDslParser.g:439:2: Colon
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
    // InternalUseCaseDslParser.g:448:1: rule__MainFlow__Group__3 : rule__MainFlow__Group__3__Impl rule__MainFlow__Group__4 ;
    public final void rule__MainFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:452:1: ( rule__MainFlow__Group__3__Impl rule__MainFlow__Group__4 )
            // InternalUseCaseDslParser.g:453:2: rule__MainFlow__Group__3__Impl rule__MainFlow__Group__4
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
    // InternalUseCaseDslParser.g:460:1: rule__MainFlow__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__MainFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:464:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:465:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:465:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:466:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:475:1: rule__MainFlow__Group__4 : rule__MainFlow__Group__4__Impl rule__MainFlow__Group__5 ;
    public final void rule__MainFlow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:479:1: ( rule__MainFlow__Group__4__Impl rule__MainFlow__Group__5 )
            // InternalUseCaseDslParser.g:480:2: rule__MainFlow__Group__4__Impl rule__MainFlow__Group__5
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
    // InternalUseCaseDslParser.g:487:1: rule__MainFlow__Group__4__Impl : ( ( ( rule__MainFlow__StepsAssignment_4 ) ) ( ( rule__MainFlow__StepsAssignment_4 )* ) ) ;
    public final void rule__MainFlow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:491:1: ( ( ( ( rule__MainFlow__StepsAssignment_4 ) ) ( ( rule__MainFlow__StepsAssignment_4 )* ) ) )
            // InternalUseCaseDslParser.g:492:1: ( ( ( rule__MainFlow__StepsAssignment_4 ) ) ( ( rule__MainFlow__StepsAssignment_4 )* ) )
            {
            // InternalUseCaseDslParser.g:492:1: ( ( ( rule__MainFlow__StepsAssignment_4 ) ) ( ( rule__MainFlow__StepsAssignment_4 )* ) )
            // InternalUseCaseDslParser.g:493:2: ( ( rule__MainFlow__StepsAssignment_4 ) ) ( ( rule__MainFlow__StepsAssignment_4 )* )
            {
            // InternalUseCaseDslParser.g:493:2: ( ( rule__MainFlow__StepsAssignment_4 ) )
            // InternalUseCaseDslParser.g:494:3: ( rule__MainFlow__StepsAssignment_4 )
            {
             before(grammarAccess.getMainFlowAccess().getStepsAssignment_4()); 
            // InternalUseCaseDslParser.g:495:3: ( rule__MainFlow__StepsAssignment_4 )
            // InternalUseCaseDslParser.g:495:4: rule__MainFlow__StepsAssignment_4
            {
            pushFollow(FOLLOW_10);
            rule__MainFlow__StepsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMainFlowAccess().getStepsAssignment_4()); 

            }

            // InternalUseCaseDslParser.g:498:2: ( ( rule__MainFlow__StepsAssignment_4 )* )
            // InternalUseCaseDslParser.g:499:3: ( rule__MainFlow__StepsAssignment_4 )*
            {
             before(grammarAccess.getMainFlowAccess().getStepsAssignment_4()); 
            // InternalUseCaseDslParser.g:500:3: ( rule__MainFlow__StepsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_INT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:500:4: rule__MainFlow__StepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MainFlow__StepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalUseCaseDslParser.g:509:1: rule__MainFlow__Group__5 : rule__MainFlow__Group__5__Impl ;
    public final void rule__MainFlow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:513:1: ( rule__MainFlow__Group__5__Impl )
            // InternalUseCaseDslParser.g:514:2: rule__MainFlow__Group__5__Impl
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
    // InternalUseCaseDslParser.g:520:1: rule__MainFlow__Group__5__Impl : ( RULE_END ) ;
    public final void rule__MainFlow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:524:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:525:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:525:1: ( RULE_END )
            // InternalUseCaseDslParser.g:526:2: RULE_END
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
    // InternalUseCaseDslParser.g:536:1: rule__Step__Group__0 : rule__Step__Group__0__Impl rule__Step__Group__1 ;
    public final void rule__Step__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:540:1: ( rule__Step__Group__0__Impl rule__Step__Group__1 )
            // InternalUseCaseDslParser.g:541:2: rule__Step__Group__0__Impl rule__Step__Group__1
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
    // InternalUseCaseDslParser.g:548:1: rule__Step__Group__0__Impl : ( () ) ;
    public final void rule__Step__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:552:1: ( ( () ) )
            // InternalUseCaseDslParser.g:553:1: ( () )
            {
            // InternalUseCaseDslParser.g:553:1: ( () )
            // InternalUseCaseDslParser.g:554:2: ()
            {
             before(grammarAccess.getStepAccess().getStepAction_0()); 
            // InternalUseCaseDslParser.g:555:2: ()
            // InternalUseCaseDslParser.g:555:3: 
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
    // InternalUseCaseDslParser.g:563:1: rule__Step__Group__1 : rule__Step__Group__1__Impl rule__Step__Group__2 ;
    public final void rule__Step__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:567:1: ( rule__Step__Group__1__Impl rule__Step__Group__2 )
            // InternalUseCaseDslParser.g:568:2: rule__Step__Group__1__Impl rule__Step__Group__2
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
    // InternalUseCaseDslParser.g:575:1: rule__Step__Group__1__Impl : ( ( rule__Step__TypeAssignment_1 ) ) ;
    public final void rule__Step__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:579:1: ( ( ( rule__Step__TypeAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:580:1: ( ( rule__Step__TypeAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:580:1: ( ( rule__Step__TypeAssignment_1 ) )
            // InternalUseCaseDslParser.g:581:2: ( rule__Step__TypeAssignment_1 )
            {
             before(grammarAccess.getStepAccess().getTypeAssignment_1()); 
            // InternalUseCaseDslParser.g:582:2: ( rule__Step__TypeAssignment_1 )
            // InternalUseCaseDslParser.g:582:3: rule__Step__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Step__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getTypeAssignment_1()); 

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
    // InternalUseCaseDslParser.g:590:1: rule__Step__Group__2 : rule__Step__Group__2__Impl rule__Step__Group__3 ;
    public final void rule__Step__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:594:1: ( rule__Step__Group__2__Impl rule__Step__Group__3 )
            // InternalUseCaseDslParser.g:595:2: rule__Step__Group__2__Impl rule__Step__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalUseCaseDslParser.g:602:1: rule__Step__Group__2__Impl : ( ( rule__Step__SentenceAssignment_2 ) ) ;
    public final void rule__Step__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:606:1: ( ( ( rule__Step__SentenceAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:607:1: ( ( rule__Step__SentenceAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:607:1: ( ( rule__Step__SentenceAssignment_2 ) )
            // InternalUseCaseDslParser.g:608:2: ( rule__Step__SentenceAssignment_2 )
            {
             before(grammarAccess.getStepAccess().getSentenceAssignment_2()); 
            // InternalUseCaseDslParser.g:609:2: ( rule__Step__SentenceAssignment_2 )
            // InternalUseCaseDslParser.g:609:3: rule__Step__SentenceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Step__SentenceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getSentenceAssignment_2()); 

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
    // InternalUseCaseDslParser.g:617:1: rule__Step__Group__3 : rule__Step__Group__3__Impl ;
    public final void rule__Step__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:621:1: ( rule__Step__Group__3__Impl )
            // InternalUseCaseDslParser.g:622:2: rule__Step__Group__3__Impl
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
    // InternalUseCaseDslParser.g:628:1: rule__Step__Group__3__Impl : ( Semicolon ) ;
    public final void rule__Step__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:632:1: ( ( Semicolon ) )
            // InternalUseCaseDslParser.g:633:1: ( Semicolon )
            {
            // InternalUseCaseDslParser.g:633:1: ( Semicolon )
            // InternalUseCaseDslParser.g:634:2: Semicolon
            {
             before(grammarAccess.getStepAccess().getSemicolonKeyword_3()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getStepAccess().getSemicolonKeyword_3()); 

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
    // InternalUseCaseDslParser.g:644:1: rule__UserStep__Group__0 : rule__UserStep__Group__0__Impl rule__UserStep__Group__1 ;
    public final void rule__UserStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:648:1: ( rule__UserStep__Group__0__Impl rule__UserStep__Group__1 )
            // InternalUseCaseDslParser.g:649:2: rule__UserStep__Group__0__Impl rule__UserStep__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUseCaseDslParser.g:656:1: rule__UserStep__Group__0__Impl : ( () ) ;
    public final void rule__UserStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:660:1: ( ( () ) )
            // InternalUseCaseDslParser.g:661:1: ( () )
            {
            // InternalUseCaseDslParser.g:661:1: ( () )
            // InternalUseCaseDslParser.g:662:2: ()
            {
             before(grammarAccess.getUserStepAccess().getUserStepAction_0()); 
            // InternalUseCaseDslParser.g:663:2: ()
            // InternalUseCaseDslParser.g:663:3: 
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
    // InternalUseCaseDslParser.g:671:1: rule__UserStep__Group__1 : rule__UserStep__Group__1__Impl rule__UserStep__Group__2 ;
    public final void rule__UserStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:675:1: ( rule__UserStep__Group__1__Impl rule__UserStep__Group__2 )
            // InternalUseCaseDslParser.g:676:2: rule__UserStep__Group__1__Impl rule__UserStep__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalUseCaseDslParser.g:683:1: rule__UserStep__Group__1__Impl : ( ( rule__UserStep__NameAssignment_1 ) ) ;
    public final void rule__UserStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:687:1: ( ( ( rule__UserStep__NameAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:688:1: ( ( rule__UserStep__NameAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:688:1: ( ( rule__UserStep__NameAssignment_1 ) )
            // InternalUseCaseDslParser.g:689:2: ( rule__UserStep__NameAssignment_1 )
            {
             before(grammarAccess.getUserStepAccess().getNameAssignment_1()); 
            // InternalUseCaseDslParser.g:690:2: ( rule__UserStep__NameAssignment_1 )
            // InternalUseCaseDslParser.g:690:3: rule__UserStep__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UserStep__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserStepAccess().getNameAssignment_1()); 

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
    // InternalUseCaseDslParser.g:698:1: rule__UserStep__Group__2 : rule__UserStep__Group__2__Impl rule__UserStep__Group__3 ;
    public final void rule__UserStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:702:1: ( rule__UserStep__Group__2__Impl rule__UserStep__Group__3 )
            // InternalUseCaseDslParser.g:703:2: rule__UserStep__Group__2__Impl rule__UserStep__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__UserStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserStep__Group__3();

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
    // InternalUseCaseDslParser.g:710:1: rule__UserStep__Group__2__Impl : ( FullStop ) ;
    public final void rule__UserStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:714:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:715:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:715:1: ( FullStop )
            // InternalUseCaseDslParser.g:716:2: FullStop
            {
             before(grammarAccess.getUserStepAccess().getFullStopKeyword_2()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUserStepAccess().getFullStopKeyword_2()); 

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


    // $ANTLR start "rule__UserStep__Group__3"
    // InternalUseCaseDslParser.g:725:1: rule__UserStep__Group__3 : rule__UserStep__Group__3__Impl ;
    public final void rule__UserStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:729:1: ( rule__UserStep__Group__3__Impl )
            // InternalUseCaseDslParser.g:730:2: rule__UserStep__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserStep__Group__3__Impl();

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
    // $ANTLR end "rule__UserStep__Group__3"


    // $ANTLR start "rule__UserStep__Group__3__Impl"
    // InternalUseCaseDslParser.g:736:1: rule__UserStep__Group__3__Impl : ( User ) ;
    public final void rule__UserStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:740:1: ( ( User ) )
            // InternalUseCaseDslParser.g:741:1: ( User )
            {
            // InternalUseCaseDslParser.g:741:1: ( User )
            // InternalUseCaseDslParser.g:742:2: User
            {
             before(grammarAccess.getUserStepAccess().getUserKeyword_3()); 
            match(input,User,FOLLOW_2); 
             after(grammarAccess.getUserStepAccess().getUserKeyword_3()); 

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
    // $ANTLR end "rule__UserStep__Group__3__Impl"


    // $ANTLR start "rule__SystemStep__Group__0"
    // InternalUseCaseDslParser.g:752:1: rule__SystemStep__Group__0 : rule__SystemStep__Group__0__Impl rule__SystemStep__Group__1 ;
    public final void rule__SystemStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:756:1: ( rule__SystemStep__Group__0__Impl rule__SystemStep__Group__1 )
            // InternalUseCaseDslParser.g:757:2: rule__SystemStep__Group__0__Impl rule__SystemStep__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalUseCaseDslParser.g:764:1: rule__SystemStep__Group__0__Impl : ( () ) ;
    public final void rule__SystemStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:768:1: ( ( () ) )
            // InternalUseCaseDslParser.g:769:1: ( () )
            {
            // InternalUseCaseDslParser.g:769:1: ( () )
            // InternalUseCaseDslParser.g:770:2: ()
            {
             before(grammarAccess.getSystemStepAccess().getSystemStepAction_0()); 
            // InternalUseCaseDslParser.g:771:2: ()
            // InternalUseCaseDslParser.g:771:3: 
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
    // InternalUseCaseDslParser.g:779:1: rule__SystemStep__Group__1 : rule__SystemStep__Group__1__Impl rule__SystemStep__Group__2 ;
    public final void rule__SystemStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:783:1: ( rule__SystemStep__Group__1__Impl rule__SystemStep__Group__2 )
            // InternalUseCaseDslParser.g:784:2: rule__SystemStep__Group__1__Impl rule__SystemStep__Group__2
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
    // InternalUseCaseDslParser.g:791:1: rule__SystemStep__Group__1__Impl : ( ( rule__SystemStep__NameAssignment_1 ) ) ;
    public final void rule__SystemStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:795:1: ( ( ( rule__SystemStep__NameAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:796:1: ( ( rule__SystemStep__NameAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:796:1: ( ( rule__SystemStep__NameAssignment_1 ) )
            // InternalUseCaseDslParser.g:797:2: ( rule__SystemStep__NameAssignment_1 )
            {
             before(grammarAccess.getSystemStepAccess().getNameAssignment_1()); 
            // InternalUseCaseDslParser.g:798:2: ( rule__SystemStep__NameAssignment_1 )
            // InternalUseCaseDslParser.g:798:3: rule__SystemStep__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemStep__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemStepAccess().getNameAssignment_1()); 

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
    // InternalUseCaseDslParser.g:806:1: rule__SystemStep__Group__2 : rule__SystemStep__Group__2__Impl rule__SystemStep__Group__3 ;
    public final void rule__SystemStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:810:1: ( rule__SystemStep__Group__2__Impl rule__SystemStep__Group__3 )
            // InternalUseCaseDslParser.g:811:2: rule__SystemStep__Group__2__Impl rule__SystemStep__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__SystemStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemStep__Group__3();

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
    // InternalUseCaseDslParser.g:818:1: rule__SystemStep__Group__2__Impl : ( FullStop ) ;
    public final void rule__SystemStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:822:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:823:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:823:1: ( FullStop )
            // InternalUseCaseDslParser.g:824:2: FullStop
            {
             before(grammarAccess.getSystemStepAccess().getFullStopKeyword_2()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getSystemStepAccess().getFullStopKeyword_2()); 

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


    // $ANTLR start "rule__SystemStep__Group__3"
    // InternalUseCaseDslParser.g:833:1: rule__SystemStep__Group__3 : rule__SystemStep__Group__3__Impl ;
    public final void rule__SystemStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:837:1: ( rule__SystemStep__Group__3__Impl )
            // InternalUseCaseDslParser.g:838:2: rule__SystemStep__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemStep__Group__3__Impl();

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
    // $ANTLR end "rule__SystemStep__Group__3"


    // $ANTLR start "rule__SystemStep__Group__3__Impl"
    // InternalUseCaseDslParser.g:844:1: rule__SystemStep__Group__3__Impl : ( KW_System ) ;
    public final void rule__SystemStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:848:1: ( ( KW_System ) )
            // InternalUseCaseDslParser.g:849:1: ( KW_System )
            {
            // InternalUseCaseDslParser.g:849:1: ( KW_System )
            // InternalUseCaseDslParser.g:850:2: KW_System
            {
             before(grammarAccess.getSystemStepAccess().getSystemKeyword_3()); 
            match(input,KW_System,FOLLOW_2); 
             after(grammarAccess.getSystemStepAccess().getSystemKeyword_3()); 

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
    // $ANTLR end "rule__SystemStep__Group__3__Impl"


    // $ANTLR start "rule__UseCase__NumberAssignment_1"
    // InternalUseCaseDslParser.g:860:1: rule__UseCase__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__UseCase__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:864:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:865:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:865:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:866:3: RULE_INT
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
    // InternalUseCaseDslParser.g:875:1: rule__UseCase__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__UseCase__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:879:1: ( ( RULE_ID ) )
            // InternalUseCaseDslParser.g:880:2: ( RULE_ID )
            {
            // InternalUseCaseDslParser.g:880:2: ( RULE_ID )
            // InternalUseCaseDslParser.g:881:3: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // InternalUseCaseDslParser.g:890:1: rule__UseCase__MainflowAssignment_4 : ( ruleMainFlow ) ;
    public final void rule__UseCase__MainflowAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:894:1: ( ( ruleMainFlow ) )
            // InternalUseCaseDslParser.g:895:2: ( ruleMainFlow )
            {
            // InternalUseCaseDslParser.g:895:2: ( ruleMainFlow )
            // InternalUseCaseDslParser.g:896:3: ruleMainFlow
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
    // InternalUseCaseDslParser.g:905:1: rule__MainFlow__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__MainFlow__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:909:1: ( ( ruleStep ) )
            // InternalUseCaseDslParser.g:910:2: ( ruleStep )
            {
            // InternalUseCaseDslParser.g:910:2: ( ruleStep )
            // InternalUseCaseDslParser.g:911:3: ruleStep
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


    // $ANTLR start "rule__Step__TypeAssignment_1"
    // InternalUseCaseDslParser.g:920:1: rule__Step__TypeAssignment_1 : ( ( rule__Step__TypeAlternatives_1_0 ) ) ;
    public final void rule__Step__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:924:1: ( ( ( rule__Step__TypeAlternatives_1_0 ) ) )
            // InternalUseCaseDslParser.g:925:2: ( ( rule__Step__TypeAlternatives_1_0 ) )
            {
            // InternalUseCaseDslParser.g:925:2: ( ( rule__Step__TypeAlternatives_1_0 ) )
            // InternalUseCaseDslParser.g:926:3: ( rule__Step__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getStepAccess().getTypeAlternatives_1_0()); 
            // InternalUseCaseDslParser.g:927:3: ( rule__Step__TypeAlternatives_1_0 )
            // InternalUseCaseDslParser.g:927:4: rule__Step__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Step__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getTypeAlternatives_1_0()); 

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
    // $ANTLR end "rule__Step__TypeAssignment_1"


    // $ANTLR start "rule__Step__SentenceAssignment_2"
    // InternalUseCaseDslParser.g:935:1: rule__Step__SentenceAssignment_2 : ( ruleSentence ) ;
    public final void rule__Step__SentenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:939:1: ( ( ruleSentence ) )
            // InternalUseCaseDslParser.g:940:2: ( ruleSentence )
            {
            // InternalUseCaseDslParser.g:940:2: ( ruleSentence )
            // InternalUseCaseDslParser.g:941:3: ruleSentence
            {
             before(grammarAccess.getStepAccess().getSentenceSentenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSentence();

            state._fsp--;

             after(grammarAccess.getStepAccess().getSentenceSentenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Step__SentenceAssignment_2"


    // $ANTLR start "rule__UserStep__NameAssignment_1"
    // InternalUseCaseDslParser.g:950:1: rule__UserStep__NameAssignment_1 : ( RULE_INT ) ;
    public final void rule__UserStep__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:954:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:955:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:955:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:956:3: RULE_INT
            {
             before(grammarAccess.getUserStepAccess().getNameINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUserStepAccess().getNameINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__UserStep__NameAssignment_1"


    // $ANTLR start "rule__SystemStep__NameAssignment_1"
    // InternalUseCaseDslParser.g:965:1: rule__SystemStep__NameAssignment_1 : ( RULE_INT ) ;
    public final void rule__SystemStep__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:969:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:970:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:970:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:971:3: RULE_INT
            {
             before(grammarAccess.getSystemStepAccess().getNameINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSystemStepAccess().getNameINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SystemStep__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});

}