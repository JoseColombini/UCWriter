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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "POSTCONDITION", "PRECONDITION", "ALTERNATIVE", "RETURN", "SYSTEM", "WHILE", "FLOW", "MAIN", "USER", "AND", "END", "IF", "OR", "TO", "UC", "QuotationMark", "Apostrophe", "FullStop", "Colon", "RULE_CHAR", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int SYSTEM=8;
    public static final int RULE_END=25;
    public static final int RULE_BEGIN=24;
    public static final int PRECONDITION=5;
    public static final int RULE_STRING=28;
    public static final int FLOW=10;
    public static final int UC=18;
    public static final int QuotationMark=19;
    public static final int RULE_SL_COMMENT=30;
    public static final int RETURN=7;
    public static final int ALTERNATIVE=6;
    public static final int RULE_CHAR=23;
    public static final int MAIN=11;
    public static final int Colon=22;
    public static final int EOF=-1;
    public static final int IF=15;
    public static final int Apostrophe=20;
    public static final int POSTCONDITION=4;
    public static final int FullStop=21;
    public static final int OR=16;
    public static final int RULE_ID=26;
    public static final int RULE_WS=31;
    public static final int RULE_ANY_OTHER=32;
    public static final int USER=12;
    public static final int RULE_INT=27;
    public static final int AND=13;
    public static final int RULE_ML_COMMENT=29;
    public static final int WHILE=9;
    public static final int END=14;
    public static final int TO=17;

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
    		tokenNameToValue.put("FLOW", "'FLOW'");
    		tokenNameToValue.put("MAIN", "'MAIN'");
    		tokenNameToValue.put("USER", "'USER'");
    		tokenNameToValue.put("WHILE", "'WHILE'");
    		tokenNameToValue.put("RETURN", "'RETURN'");
    		tokenNameToValue.put("SYSTEM", "'SYSTEM'");
    		tokenNameToValue.put("ALTERNATIVE", "'ALTERNATIVE'");
    		tokenNameToValue.put("PRECONDITION", "'PRECONDITION'");
    		tokenNameToValue.put("POSTCONDITION", "'POSTCONDITION'");
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



    // $ANTLR start "entryRuleUseCaseDocument"
    // InternalUseCaseDslParser.g:74:1: entryRuleUseCaseDocument : ruleUseCaseDocument EOF ;
    public final void entryRuleUseCaseDocument() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:75:1: ( ruleUseCaseDocument EOF )
            // InternalUseCaseDslParser.g:76:1: ruleUseCaseDocument EOF
            {
             before(grammarAccess.getUseCaseDocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleUseCaseDocument();

            state._fsp--;

             after(grammarAccess.getUseCaseDocumentRule()); 
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
    // $ANTLR end "entryRuleUseCaseDocument"


    // $ANTLR start "ruleUseCaseDocument"
    // InternalUseCaseDslParser.g:83:1: ruleUseCaseDocument : ( ( ( rule__UseCaseDocument__UsecaseAssignment ) ) ( ( rule__UseCaseDocument__UsecaseAssignment )* ) ) ;
    public final void ruleUseCaseDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:87:2: ( ( ( ( rule__UseCaseDocument__UsecaseAssignment ) ) ( ( rule__UseCaseDocument__UsecaseAssignment )* ) ) )
            // InternalUseCaseDslParser.g:88:2: ( ( ( rule__UseCaseDocument__UsecaseAssignment ) ) ( ( rule__UseCaseDocument__UsecaseAssignment )* ) )
            {
            // InternalUseCaseDslParser.g:88:2: ( ( ( rule__UseCaseDocument__UsecaseAssignment ) ) ( ( rule__UseCaseDocument__UsecaseAssignment )* ) )
            // InternalUseCaseDslParser.g:89:3: ( ( rule__UseCaseDocument__UsecaseAssignment ) ) ( ( rule__UseCaseDocument__UsecaseAssignment )* )
            {
            // InternalUseCaseDslParser.g:89:3: ( ( rule__UseCaseDocument__UsecaseAssignment ) )
            // InternalUseCaseDslParser.g:90:4: ( rule__UseCaseDocument__UsecaseAssignment )
            {
             before(grammarAccess.getUseCaseDocumentAccess().getUsecaseAssignment()); 
            // InternalUseCaseDslParser.g:91:4: ( rule__UseCaseDocument__UsecaseAssignment )
            // InternalUseCaseDslParser.g:91:5: rule__UseCaseDocument__UsecaseAssignment
            {
            pushFollow(FOLLOW_3);
            rule__UseCaseDocument__UsecaseAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseDocumentAccess().getUsecaseAssignment()); 

            }

            // InternalUseCaseDslParser.g:94:3: ( ( rule__UseCaseDocument__UsecaseAssignment )* )
            // InternalUseCaseDslParser.g:95:4: ( rule__UseCaseDocument__UsecaseAssignment )*
            {
             before(grammarAccess.getUseCaseDocumentAccess().getUsecaseAssignment()); 
            // InternalUseCaseDslParser.g:96:4: ( rule__UseCaseDocument__UsecaseAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==UC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:96:5: rule__UseCaseDocument__UsecaseAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__UseCaseDocument__UsecaseAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getUseCaseDocumentAccess().getUsecaseAssignment()); 

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
    // $ANTLR end "ruleUseCaseDocument"


    // $ANTLR start "entryRuleUseCase"
    // InternalUseCaseDslParser.g:106:1: entryRuleUseCase : ruleUseCase EOF ;
    public final void entryRuleUseCase() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:107:1: ( ruleUseCase EOF )
            // InternalUseCaseDslParser.g:108:1: ruleUseCase EOF
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
    // InternalUseCaseDslParser.g:115:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
    public final void ruleUseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:119:2: ( ( ( rule__UseCase__Group__0 ) ) )
            // InternalUseCaseDslParser.g:120:2: ( ( rule__UseCase__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:120:2: ( ( rule__UseCase__Group__0 ) )
            // InternalUseCaseDslParser.g:121:3: ( rule__UseCase__Group__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup()); 
            // InternalUseCaseDslParser.g:122:3: ( rule__UseCase__Group__0 )
            // InternalUseCaseDslParser.g:122:4: rule__UseCase__Group__0
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
    // InternalUseCaseDslParser.g:131:1: entryRuleExtension : ruleExtension EOF ;
    public final void entryRuleExtension() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:132:1: ( ruleExtension EOF )
            // InternalUseCaseDslParser.g:133:1: ruleExtension EOF
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
    // InternalUseCaseDslParser.g:140:1: ruleExtension : ( ( rule__Extension__Group__0 ) ) ;
    public final void ruleExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:144:2: ( ( ( rule__Extension__Group__0 ) ) )
            // InternalUseCaseDslParser.g:145:2: ( ( rule__Extension__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:145:2: ( ( rule__Extension__Group__0 ) )
            // InternalUseCaseDslParser.g:146:3: ( rule__Extension__Group__0 )
            {
             before(grammarAccess.getExtensionAccess().getGroup()); 
            // InternalUseCaseDslParser.g:147:3: ( rule__Extension__Group__0 )
            // InternalUseCaseDslParser.g:147:4: rule__Extension__Group__0
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
    // InternalUseCaseDslParser.g:156:1: entryRuleUseCaseStep : ruleUseCaseStep EOF ;
    public final void entryRuleUseCaseStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:157:1: ( ruleUseCaseStep EOF )
            // InternalUseCaseDslParser.g:158:1: ruleUseCaseStep EOF
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
    // InternalUseCaseDslParser.g:165:1: ruleUseCaseStep : ( ( rule__UseCaseStep__Alternatives ) ) ;
    public final void ruleUseCaseStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:169:2: ( ( ( rule__UseCaseStep__Alternatives ) ) )
            // InternalUseCaseDslParser.g:170:2: ( ( rule__UseCaseStep__Alternatives ) )
            {
            // InternalUseCaseDslParser.g:170:2: ( ( rule__UseCaseStep__Alternatives ) )
            // InternalUseCaseDslParser.g:171:3: ( rule__UseCaseStep__Alternatives )
            {
             before(grammarAccess.getUseCaseStepAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:172:3: ( rule__UseCaseStep__Alternatives )
            // InternalUseCaseDslParser.g:172:4: rule__UseCaseStep__Alternatives
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
    // InternalUseCaseDslParser.g:181:1: entryRuleExtensionStep : ruleExtensionStep EOF ;
    public final void entryRuleExtensionStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:182:1: ( ruleExtensionStep EOF )
            // InternalUseCaseDslParser.g:183:1: ruleExtensionStep EOF
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
    // InternalUseCaseDslParser.g:190:1: ruleExtensionStep : ( ( rule__ExtensionStep__Alternatives ) ) ;
    public final void ruleExtensionStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:194:2: ( ( ( rule__ExtensionStep__Alternatives ) ) )
            // InternalUseCaseDslParser.g:195:2: ( ( rule__ExtensionStep__Alternatives ) )
            {
            // InternalUseCaseDslParser.g:195:2: ( ( rule__ExtensionStep__Alternatives ) )
            // InternalUseCaseDslParser.g:196:3: ( rule__ExtensionStep__Alternatives )
            {
             before(grammarAccess.getExtensionStepAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:197:3: ( rule__ExtensionStep__Alternatives )
            // InternalUseCaseDslParser.g:197:4: rule__ExtensionStep__Alternatives
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
    // InternalUseCaseDslParser.g:206:1: entryRuleDeadEndStep : ruleDeadEndStep EOF ;
    public final void entryRuleDeadEndStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:207:1: ( ruleDeadEndStep EOF )
            // InternalUseCaseDslParser.g:208:1: ruleDeadEndStep EOF
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
    // InternalUseCaseDslParser.g:215:1: ruleDeadEndStep : ( ( rule__DeadEndStep__Group__0 ) ) ;
    public final void ruleDeadEndStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:219:2: ( ( ( rule__DeadEndStep__Group__0 ) ) )
            // InternalUseCaseDslParser.g:220:2: ( ( rule__DeadEndStep__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:220:2: ( ( rule__DeadEndStep__Group__0 ) )
            // InternalUseCaseDslParser.g:221:3: ( rule__DeadEndStep__Group__0 )
            {
             before(grammarAccess.getDeadEndStepAccess().getGroup()); 
            // InternalUseCaseDslParser.g:222:3: ( rule__DeadEndStep__Group__0 )
            // InternalUseCaseDslParser.g:222:4: rule__DeadEndStep__Group__0
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
    // InternalUseCaseDslParser.g:231:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:232:1: ( rulePrecondition EOF )
            // InternalUseCaseDslParser.g:233:1: rulePrecondition EOF
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
    // InternalUseCaseDslParser.g:240:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:244:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // InternalUseCaseDslParser.g:245:2: ( ( rule__Precondition__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:245:2: ( ( rule__Precondition__Group__0 ) )
            // InternalUseCaseDslParser.g:246:3: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // InternalUseCaseDslParser.g:247:3: ( rule__Precondition__Group__0 )
            // InternalUseCaseDslParser.g:247:4: rule__Precondition__Group__0
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
    // InternalUseCaseDslParser.g:256:1: entryRulePostcondition : rulePostcondition EOF ;
    public final void entryRulePostcondition() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:257:1: ( rulePostcondition EOF )
            // InternalUseCaseDslParser.g:258:1: rulePostcondition EOF
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
    // InternalUseCaseDslParser.g:265:1: rulePostcondition : ( ( rule__Postcondition__Group__0 ) ) ;
    public final void rulePostcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:269:2: ( ( ( rule__Postcondition__Group__0 ) ) )
            // InternalUseCaseDslParser.g:270:2: ( ( rule__Postcondition__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:270:2: ( ( rule__Postcondition__Group__0 ) )
            // InternalUseCaseDslParser.g:271:3: ( rule__Postcondition__Group__0 )
            {
             before(grammarAccess.getPostconditionAccess().getGroup()); 
            // InternalUseCaseDslParser.g:272:3: ( rule__Postcondition__Group__0 )
            // InternalUseCaseDslParser.g:272:4: rule__Postcondition__Group__0
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
    // InternalUseCaseDslParser.g:281:1: entryRuleLongName : ruleLongName EOF ;
    public final void entryRuleLongName() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:282:1: ( ruleLongName EOF )
            // InternalUseCaseDslParser.g:283:1: ruleLongName EOF
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
    // InternalUseCaseDslParser.g:290:1: ruleLongName : ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) ) ;
    public final void ruleLongName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:294:2: ( ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) ) )
            // InternalUseCaseDslParser.g:295:2: ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) )
            {
            // InternalUseCaseDslParser.g:295:2: ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) )
            // InternalUseCaseDslParser.g:296:3: ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* )
            {
            // InternalUseCaseDslParser.g:296:3: ( ( rule__LongName__Alternatives ) )
            // InternalUseCaseDslParser.g:297:4: ( rule__LongName__Alternatives )
            {
             before(grammarAccess.getLongNameAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:298:4: ( rule__LongName__Alternatives )
            // InternalUseCaseDslParser.g:298:5: rule__LongName__Alternatives
            {
            pushFollow(FOLLOW_4);
            rule__LongName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLongNameAccess().getAlternatives()); 

            }

            // InternalUseCaseDslParser.g:301:3: ( ( rule__LongName__Alternatives )* )
            // InternalUseCaseDslParser.g:302:4: ( rule__LongName__Alternatives )*
            {
             before(grammarAccess.getLongNameAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:303:4: ( rule__LongName__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=QuotationMark && LA2_0<=RULE_CHAR)||LA2_0==RULE_ID||LA2_0==RULE_ANY_OTHER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:303:5: rule__LongName__Alternatives
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__LongName__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalUseCaseDslParser.g:313:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:314:1: ( ruleCondition EOF )
            // InternalUseCaseDslParser.g:315:1: ruleCondition EOF
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
    // InternalUseCaseDslParser.g:322:1: ruleCondition : ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:326:2: ( ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) ) )
            // InternalUseCaseDslParser.g:327:2: ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) )
            {
            // InternalUseCaseDslParser.g:327:2: ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) )
            // InternalUseCaseDslParser.g:328:3: ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* )
            {
            // InternalUseCaseDslParser.g:328:3: ( ( rule__Condition__Alternatives ) )
            // InternalUseCaseDslParser.g:329:4: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:330:4: ( rule__Condition__Alternatives )
            // InternalUseCaseDslParser.g:330:5: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_5);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }

            // InternalUseCaseDslParser.g:333:3: ( ( rule__Condition__Alternatives )* )
            // InternalUseCaseDslParser.g:334:4: ( rule__Condition__Alternatives )*
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:335:4: ( rule__Condition__Alternatives )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AND||LA3_0==OR||(LA3_0>=QuotationMark && LA3_0<=RULE_CHAR)||LA3_0==RULE_ID||LA3_0==RULE_ANY_OTHER) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:335:5: rule__Condition__Alternatives
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Condition__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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


    // $ANTLR start "entryRuleStepName"
    // InternalUseCaseDslParser.g:345:1: entryRuleStepName : ruleStepName EOF ;
    public final void entryRuleStepName() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:346:1: ( ruleStepName EOF )
            // InternalUseCaseDslParser.g:347:1: ruleStepName EOF
            {
             before(grammarAccess.getStepNameRule()); 
            pushFollow(FOLLOW_1);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getStepNameRule()); 
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
    // $ANTLR end "entryRuleStepName"


    // $ANTLR start "ruleStepName"
    // InternalUseCaseDslParser.g:354:1: ruleStepName : ( RULE_INT ) ;
    public final void ruleStepName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:358:2: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:359:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:359:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:360:3: RULE_INT
            {
             before(grammarAccess.getStepNameAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStepNameAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStepName"


    // $ANTLR start "rule__Extension__Alternatives_7"
    // InternalUseCaseDslParser.g:369:1: rule__Extension__Alternatives_7 : ( ( ( rule__Extension__Group_7_0__0 ) ) | ( ( rule__Extension__EndAssignment_7_1 ) ) );
    public final void rule__Extension__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:373:1: ( ( ( rule__Extension__Group_7_0__0 ) ) | ( ( rule__Extension__EndAssignment_7_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==FullStop) ) {
                    int LA4_2 = input.LA(3);

                    if ( ((LA4_2>=SYSTEM && LA4_2<=WHILE)||LA4_2==USER||(LA4_2>=UC && LA4_2<=RULE_CHAR)||LA4_2==RULE_ID||LA4_2==RULE_ANY_OTHER) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==RETURN) ) {
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
                    // InternalUseCaseDslParser.g:374:2: ( ( rule__Extension__Group_7_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:374:2: ( ( rule__Extension__Group_7_0__0 ) )
                    // InternalUseCaseDslParser.g:375:3: ( rule__Extension__Group_7_0__0 )
                    {
                     before(grammarAccess.getExtensionAccess().getGroup_7_0()); 
                    // InternalUseCaseDslParser.g:376:3: ( rule__Extension__Group_7_0__0 )
                    // InternalUseCaseDslParser.g:376:4: rule__Extension__Group_7_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extension__Group_7_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtensionAccess().getGroup_7_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:380:2: ( ( rule__Extension__EndAssignment_7_1 ) )
                    {
                    // InternalUseCaseDslParser.g:380:2: ( ( rule__Extension__EndAssignment_7_1 ) )
                    // InternalUseCaseDslParser.g:381:3: ( rule__Extension__EndAssignment_7_1 )
                    {
                     before(grammarAccess.getExtensionAccess().getEndAssignment_7_1()); 
                    // InternalUseCaseDslParser.g:382:3: ( rule__Extension__EndAssignment_7_1 )
                    // InternalUseCaseDslParser.g:382:4: rule__Extension__EndAssignment_7_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extension__EndAssignment_7_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtensionAccess().getEndAssignment_7_1()); 

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
    // $ANTLR end "rule__Extension__Alternatives_7"


    // $ANTLR start "rule__UseCaseStep__Alternatives"
    // InternalUseCaseDslParser.g:390:1: rule__UseCaseStep__Alternatives : ( ( ( rule__UseCaseStep__Group_0__0 ) ) | ( ( rule__UseCaseStep__Group_1__0 ) ) | ( ( rule__UseCaseStep__Group_2__0 ) ) );
    public final void rule__UseCaseStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:394:1: ( ( ( rule__UseCaseStep__Group_0__0 ) ) | ( ( rule__UseCaseStep__Group_1__0 ) ) | ( ( rule__UseCaseStep__Group_2__0 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==FullStop) ) {
                    switch ( input.LA(3) ) {
                    case USER:
                        {
                        alt5=1;
                        }
                        break;
                    case SYSTEM:
                        {
                        alt5=2;
                        }
                        break;
                    case WHILE:
                        {
                        alt5=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUseCaseDslParser.g:395:2: ( ( rule__UseCaseStep__Group_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:395:2: ( ( rule__UseCaseStep__Group_0__0 ) )
                    // InternalUseCaseDslParser.g:396:3: ( rule__UseCaseStep__Group_0__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_0()); 
                    // InternalUseCaseDslParser.g:397:3: ( rule__UseCaseStep__Group_0__0 )
                    // InternalUseCaseDslParser.g:397:4: rule__UseCaseStep__Group_0__0
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
                    // InternalUseCaseDslParser.g:401:2: ( ( rule__UseCaseStep__Group_1__0 ) )
                    {
                    // InternalUseCaseDslParser.g:401:2: ( ( rule__UseCaseStep__Group_1__0 ) )
                    // InternalUseCaseDslParser.g:402:3: ( rule__UseCaseStep__Group_1__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_1()); 
                    // InternalUseCaseDslParser.g:403:3: ( rule__UseCaseStep__Group_1__0 )
                    // InternalUseCaseDslParser.g:403:4: rule__UseCaseStep__Group_1__0
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
                    // InternalUseCaseDslParser.g:407:2: ( ( rule__UseCaseStep__Group_2__0 ) )
                    {
                    // InternalUseCaseDslParser.g:407:2: ( ( rule__UseCaseStep__Group_2__0 ) )
                    // InternalUseCaseDslParser.g:408:3: ( rule__UseCaseStep__Group_2__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_2()); 
                    // InternalUseCaseDslParser.g:409:3: ( rule__UseCaseStep__Group_2__0 )
                    // InternalUseCaseDslParser.g:409:4: rule__UseCaseStep__Group_2__0
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
    // InternalUseCaseDslParser.g:417:1: rule__ExtensionStep__Alternatives : ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ruleDeadEndStep ) );
    public final void rule__ExtensionStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:421:1: ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ruleDeadEndStep ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalUseCaseDslParser.g:422:2: ( ( rule__ExtensionStep__Group_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:422:2: ( ( rule__ExtensionStep__Group_0__0 ) )
                    // InternalUseCaseDslParser.g:423:3: ( rule__ExtensionStep__Group_0__0 )
                    {
                     before(grammarAccess.getExtensionStepAccess().getGroup_0()); 
                    // InternalUseCaseDslParser.g:424:3: ( rule__ExtensionStep__Group_0__0 )
                    // InternalUseCaseDslParser.g:424:4: rule__ExtensionStep__Group_0__0
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
                    // InternalUseCaseDslParser.g:428:2: ( ruleDeadEndStep )
                    {
                    // InternalUseCaseDslParser.g:428:2: ( ruleDeadEndStep )
                    // InternalUseCaseDslParser.g:429:3: ruleDeadEndStep
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
    // InternalUseCaseDslParser.g:438:1: rule__ExtensionStep__Alternatives_0_2 : ( ( USER ) | ( SYSTEM ) | ( WHILE ) );
    public final void rule__ExtensionStep__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:442:1: ( ( USER ) | ( SYSTEM ) | ( WHILE ) )
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
                    // InternalUseCaseDslParser.g:443:2: ( USER )
                    {
                    // InternalUseCaseDslParser.g:443:2: ( USER )
                    // InternalUseCaseDslParser.g:444:3: USER
                    {
                     before(grammarAccess.getExtensionStepAccess().getUSERKeyword_0_2_0()); 
                    match(input,USER,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getUSERKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:449:2: ( SYSTEM )
                    {
                    // InternalUseCaseDslParser.g:449:2: ( SYSTEM )
                    // InternalUseCaseDslParser.g:450:3: SYSTEM
                    {
                     before(grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_0_2_1()); 
                    match(input,SYSTEM,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_0_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:455:2: ( WHILE )
                    {
                    // InternalUseCaseDslParser.g:455:2: ( WHILE )
                    // InternalUseCaseDslParser.g:456:3: WHILE
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
    // InternalUseCaseDslParser.g:465:1: rule__DeadEndStep__Alternatives_2 : ( ( USER ) | ( SYSTEM ) | ( WHILE ) );
    public final void rule__DeadEndStep__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:469:1: ( ( USER ) | ( SYSTEM ) | ( WHILE ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case USER:
                {
                alt8=1;
                }
                break;
            case SYSTEM:
                {
                alt8=2;
                }
                break;
            case WHILE:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalUseCaseDslParser.g:470:2: ( USER )
                    {
                    // InternalUseCaseDslParser.g:470:2: ( USER )
                    // InternalUseCaseDslParser.g:471:3: USER
                    {
                     before(grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0()); 
                    match(input,USER,FOLLOW_2); 
                     after(grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:476:2: ( SYSTEM )
                    {
                    // InternalUseCaseDslParser.g:476:2: ( SYSTEM )
                    // InternalUseCaseDslParser.g:477:3: SYSTEM
                    {
                     before(grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1()); 
                    match(input,SYSTEM,FOLLOW_2); 
                     after(grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:482:2: ( WHILE )
                    {
                    // InternalUseCaseDslParser.g:482:2: ( WHILE )
                    // InternalUseCaseDslParser.g:483:3: WHILE
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
    // InternalUseCaseDslParser.g:492:1: rule__LongName__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) );
    public final void rule__LongName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:496:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) )
            int alt9=7;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalUseCaseDslParser.g:497:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:497:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:498:3: RULE_ID
                    {
                     before(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:503:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:503:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:504:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:509:2: ( RULE_CHAR )
                    {
                    // InternalUseCaseDslParser.g:509:2: ( RULE_CHAR )
                    // InternalUseCaseDslParser.g:510:3: RULE_CHAR
                    {
                     before(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2()); 
                    match(input,RULE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:515:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:515:2: ( Colon )
                    // InternalUseCaseDslParser.g:516:3: Colon
                    {
                     before(grammarAccess.getLongNameAccess().getColonKeyword_3()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:521:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:521:2: ( FullStop )
                    // InternalUseCaseDslParser.g:522:3: FullStop
                    {
                     before(grammarAccess.getLongNameAccess().getFullStopKeyword_4()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUseCaseDslParser.g:527:2: ( QuotationMark )
                    {
                    // InternalUseCaseDslParser.g:527:2: ( QuotationMark )
                    // InternalUseCaseDslParser.g:528:3: QuotationMark
                    {
                     before(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5()); 
                    match(input,QuotationMark,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUseCaseDslParser.g:533:2: ( Apostrophe )
                    {
                    // InternalUseCaseDslParser.g:533:2: ( Apostrophe )
                    // InternalUseCaseDslParser.g:534:3: Apostrophe
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
    // InternalUseCaseDslParser.g:543:1: rule__Condition__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) | ( AND ) | ( OR ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:547:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) | ( AND ) | ( OR ) )
            int alt10=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt10=2;
                }
                break;
            case RULE_CHAR:
                {
                alt10=3;
                }
                break;
            case Colon:
                {
                alt10=4;
                }
                break;
            case FullStop:
                {
                alt10=5;
                }
                break;
            case QuotationMark:
                {
                alt10=6;
                }
                break;
            case Apostrophe:
                {
                alt10=7;
                }
                break;
            case AND:
                {
                alt10=8;
                }
                break;
            case OR:
                {
                alt10=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalUseCaseDslParser.g:548:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:548:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:549:3: RULE_ID
                    {
                     before(grammarAccess.getConditionAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:554:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:554:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:555:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:560:2: ( RULE_CHAR )
                    {
                    // InternalUseCaseDslParser.g:560:2: ( RULE_CHAR )
                    // InternalUseCaseDslParser.g:561:3: RULE_CHAR
                    {
                     before(grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2()); 
                    match(input,RULE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:566:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:566:2: ( Colon )
                    // InternalUseCaseDslParser.g:567:3: Colon
                    {
                     before(grammarAccess.getConditionAccess().getColonKeyword_3()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:572:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:572:2: ( FullStop )
                    // InternalUseCaseDslParser.g:573:3: FullStop
                    {
                     before(grammarAccess.getConditionAccess().getFullStopKeyword_4()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUseCaseDslParser.g:578:2: ( QuotationMark )
                    {
                    // InternalUseCaseDslParser.g:578:2: ( QuotationMark )
                    // InternalUseCaseDslParser.g:579:3: QuotationMark
                    {
                     before(grammarAccess.getConditionAccess().getQuotationMarkKeyword_5()); 
                    match(input,QuotationMark,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getQuotationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUseCaseDslParser.g:584:2: ( Apostrophe )
                    {
                    // InternalUseCaseDslParser.g:584:2: ( Apostrophe )
                    // InternalUseCaseDslParser.g:585:3: Apostrophe
                    {
                     before(grammarAccess.getConditionAccess().getApostropheKeyword_6()); 
                    match(input,Apostrophe,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getApostropheKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUseCaseDslParser.g:590:2: ( AND )
                    {
                    // InternalUseCaseDslParser.g:590:2: ( AND )
                    // InternalUseCaseDslParser.g:591:3: AND
                    {
                     before(grammarAccess.getConditionAccess().getANDKeyword_7()); 
                    match(input,AND,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getANDKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUseCaseDslParser.g:596:2: ( OR )
                    {
                    // InternalUseCaseDslParser.g:596:2: ( OR )
                    // InternalUseCaseDslParser.g:597:3: OR
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
    // InternalUseCaseDslParser.g:606:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:610:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCaseDslParser.g:611:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:618:1: rule__UseCase__Group__0__Impl : ( UC ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:622:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:623:1: ( UC )
            {
            // InternalUseCaseDslParser.g:623:1: ( UC )
            // InternalUseCaseDslParser.g:624:2: UC
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
    // InternalUseCaseDslParser.g:633:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:637:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCaseDslParser.g:638:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:645:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NumberAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:649:1: ( ( ( rule__UseCase__NumberAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:650:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:650:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            // InternalUseCaseDslParser.g:651:2: ( rule__UseCase__NumberAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNumberAssignment_1()); 
            // InternalUseCaseDslParser.g:652:2: ( rule__UseCase__NumberAssignment_1 )
            // InternalUseCaseDslParser.g:652:3: rule__UseCase__NumberAssignment_1
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
    // InternalUseCaseDslParser.g:660:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:664:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCaseDslParser.g:665:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCaseDslParser.g:672:1: rule__UseCase__Group__2__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:676:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:677:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:677:1: ( Colon )
            // InternalUseCaseDslParser.g:678:2: Colon
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
    // InternalUseCaseDslParser.g:687:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:691:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCaseDslParser.g:692:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCaseDslParser.g:699:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__NameAssignment_3 ) ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:703:1: ( ( ( rule__UseCase__NameAssignment_3 ) ) )
            // InternalUseCaseDslParser.g:704:1: ( ( rule__UseCase__NameAssignment_3 ) )
            {
            // InternalUseCaseDslParser.g:704:1: ( ( rule__UseCase__NameAssignment_3 ) )
            // InternalUseCaseDslParser.g:705:2: ( rule__UseCase__NameAssignment_3 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_3()); 
            // InternalUseCaseDslParser.g:706:2: ( rule__UseCase__NameAssignment_3 )
            // InternalUseCaseDslParser.g:706:3: rule__UseCase__NameAssignment_3
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
    // InternalUseCaseDslParser.g:714:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:718:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCaseDslParser.g:719:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCaseDslParser.g:726:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__PreconditionAssignment_4 )? ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:730:1: ( ( ( rule__UseCase__PreconditionAssignment_4 )? ) )
            // InternalUseCaseDslParser.g:731:1: ( ( rule__UseCase__PreconditionAssignment_4 )? )
            {
            // InternalUseCaseDslParser.g:731:1: ( ( rule__UseCase__PreconditionAssignment_4 )? )
            // InternalUseCaseDslParser.g:732:2: ( rule__UseCase__PreconditionAssignment_4 )?
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionAssignment_4()); 
            // InternalUseCaseDslParser.g:733:2: ( rule__UseCase__PreconditionAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==PRECONDITION) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCaseDslParser.g:733:3: rule__UseCase__PreconditionAssignment_4
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
    // InternalUseCaseDslParser.g:741:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:745:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCaseDslParser.g:746:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
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
    // InternalUseCaseDslParser.g:753:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__PostconditionAssignment_5 )? ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:757:1: ( ( ( rule__UseCase__PostconditionAssignment_5 )? ) )
            // InternalUseCaseDslParser.g:758:1: ( ( rule__UseCase__PostconditionAssignment_5 )? )
            {
            // InternalUseCaseDslParser.g:758:1: ( ( rule__UseCase__PostconditionAssignment_5 )? )
            // InternalUseCaseDslParser.g:759:2: ( rule__UseCase__PostconditionAssignment_5 )?
            {
             before(grammarAccess.getUseCaseAccess().getPostconditionAssignment_5()); 
            // InternalUseCaseDslParser.g:760:2: ( rule__UseCase__PostconditionAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==POSTCONDITION) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUseCaseDslParser.g:760:3: rule__UseCase__PostconditionAssignment_5
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
    // InternalUseCaseDslParser.g:768:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:772:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCaseDslParser.g:773:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalUseCaseDslParser.g:780:1: rule__UseCase__Group__6__Impl : ( MAIN ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:784:1: ( ( MAIN ) )
            // InternalUseCaseDslParser.g:785:1: ( MAIN )
            {
            // InternalUseCaseDslParser.g:785:1: ( MAIN )
            // InternalUseCaseDslParser.g:786:2: MAIN
            {
             before(grammarAccess.getUseCaseAccess().getMAINKeyword_6()); 
            match(input,MAIN,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getMAINKeyword_6()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:795:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:799:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCaseDslParser.g:800:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:807:1: rule__UseCase__Group__7__Impl : ( FLOW ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:811:1: ( ( FLOW ) )
            // InternalUseCaseDslParser.g:812:1: ( FLOW )
            {
            // InternalUseCaseDslParser.g:812:1: ( FLOW )
            // InternalUseCaseDslParser.g:813:2: FLOW
            {
             before(grammarAccess.getUseCaseAccess().getFLOWKeyword_7()); 
            match(input,FLOW,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getFLOWKeyword_7()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:822:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:826:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // InternalUseCaseDslParser.g:827:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCaseDslParser.g:834:1: rule__UseCase__Group__8__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:838:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:839:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:839:1: ( Colon )
            // InternalUseCaseDslParser.g:840:2: Colon
            {
             before(grammarAccess.getUseCaseAccess().getColonKeyword_8()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getColonKeyword_8()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:849:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl rule__UseCase__Group__10 ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:853:1: ( rule__UseCase__Group__9__Impl rule__UseCase__Group__10 )
            // InternalUseCaseDslParser.g:854:2: rule__UseCase__Group__9__Impl rule__UseCase__Group__10
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:861:1: rule__UseCase__Group__9__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:865:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:866:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:866:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:867:2: RULE_BEGIN
            {
             before(grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_9()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_9()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:876:1: rule__UseCase__Group__10 : rule__UseCase__Group__10__Impl rule__UseCase__Group__11 ;
    public final void rule__UseCase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:880:1: ( rule__UseCase__Group__10__Impl rule__UseCase__Group__11 )
            // InternalUseCaseDslParser.g:881:2: rule__UseCase__Group__10__Impl rule__UseCase__Group__11
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
    // InternalUseCaseDslParser.g:888:1: rule__UseCase__Group__10__Impl : ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) ) ;
    public final void rule__UseCase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:892:1: ( ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) ) )
            // InternalUseCaseDslParser.g:893:1: ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) )
            {
            // InternalUseCaseDslParser.g:893:1: ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) )
            // InternalUseCaseDslParser.g:894:2: ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* )
            {
            // InternalUseCaseDslParser.g:894:2: ( ( rule__UseCase__StepsAssignment_10 ) )
            // InternalUseCaseDslParser.g:895:3: ( rule__UseCase__StepsAssignment_10 )
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 
            // InternalUseCaseDslParser.g:896:3: ( rule__UseCase__StepsAssignment_10 )
            // InternalUseCaseDslParser.g:896:4: rule__UseCase__StepsAssignment_10
            {
            pushFollow(FOLLOW_13);
            rule__UseCase__StepsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 

            }

            // InternalUseCaseDslParser.g:899:2: ( ( rule__UseCase__StepsAssignment_10 )* )
            // InternalUseCaseDslParser.g:900:3: ( rule__UseCase__StepsAssignment_10 )*
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 
            // InternalUseCaseDslParser.g:901:3: ( rule__UseCase__StepsAssignment_10 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_INT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:901:4: rule__UseCase__StepsAssignment_10
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UseCase__StepsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 

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
    // $ANTLR end "rule__UseCase__Group__10__Impl"


    // $ANTLR start "rule__UseCase__Group__11"
    // InternalUseCaseDslParser.g:910:1: rule__UseCase__Group__11 : rule__UseCase__Group__11__Impl rule__UseCase__Group__12 ;
    public final void rule__UseCase__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:914:1: ( rule__UseCase__Group__11__Impl rule__UseCase__Group__12 )
            // InternalUseCaseDslParser.g:915:2: rule__UseCase__Group__11__Impl rule__UseCase__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__UseCase__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__12();

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
    // InternalUseCaseDslParser.g:922:1: rule__UseCase__Group__11__Impl : ( RULE_END ) ;
    public final void rule__UseCase__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:926:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:927:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:927:1: ( RULE_END )
            // InternalUseCaseDslParser.g:928:2: RULE_END
            {
             before(grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_11()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__UseCase__Group__12"
    // InternalUseCaseDslParser.g:937:1: rule__UseCase__Group__12 : rule__UseCase__Group__12__Impl ;
    public final void rule__UseCase__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:941:1: ( rule__UseCase__Group__12__Impl )
            // InternalUseCaseDslParser.g:942:2: rule__UseCase__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group__12__Impl();

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
    // $ANTLR end "rule__UseCase__Group__12"


    // $ANTLR start "rule__UseCase__Group__12__Impl"
    // InternalUseCaseDslParser.g:948:1: rule__UseCase__Group__12__Impl : ( ( rule__UseCase__Group_12__0 )? ) ;
    public final void rule__UseCase__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:952:1: ( ( ( rule__UseCase__Group_12__0 )? ) )
            // InternalUseCaseDslParser.g:953:1: ( ( rule__UseCase__Group_12__0 )? )
            {
            // InternalUseCaseDslParser.g:953:1: ( ( rule__UseCase__Group_12__0 )? )
            // InternalUseCaseDslParser.g:954:2: ( rule__UseCase__Group_12__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_12()); 
            // InternalUseCaseDslParser.g:955:2: ( rule__UseCase__Group_12__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ALTERNATIVE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCaseDslParser.g:955:3: rule__UseCase__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__12__Impl"


    // $ANTLR start "rule__UseCase__Group_12__0"
    // InternalUseCaseDslParser.g:964:1: rule__UseCase__Group_12__0 : rule__UseCase__Group_12__0__Impl rule__UseCase__Group_12__1 ;
    public final void rule__UseCase__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:968:1: ( rule__UseCase__Group_12__0__Impl rule__UseCase__Group_12__1 )
            // InternalUseCaseDslParser.g:969:2: rule__UseCase__Group_12__0__Impl rule__UseCase__Group_12__1
            {
            pushFollow(FOLLOW_7);
            rule__UseCase__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_12__1();

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
    // $ANTLR end "rule__UseCase__Group_12__0"


    // $ANTLR start "rule__UseCase__Group_12__0__Impl"
    // InternalUseCaseDslParser.g:976:1: rule__UseCase__Group_12__0__Impl : ( ( rule__UseCase__Group_12_0__0 ) ) ;
    public final void rule__UseCase__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:980:1: ( ( ( rule__UseCase__Group_12_0__0 ) ) )
            // InternalUseCaseDslParser.g:981:1: ( ( rule__UseCase__Group_12_0__0 ) )
            {
            // InternalUseCaseDslParser.g:981:1: ( ( rule__UseCase__Group_12_0__0 ) )
            // InternalUseCaseDslParser.g:982:2: ( rule__UseCase__Group_12_0__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup_12_0()); 
            // InternalUseCaseDslParser.g:983:2: ( rule__UseCase__Group_12_0__0 )
            // InternalUseCaseDslParser.g:983:3: rule__UseCase__Group_12_0__0
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_12_0__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getGroup_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_12__0__Impl"


    // $ANTLR start "rule__UseCase__Group_12__1"
    // InternalUseCaseDslParser.g:991:1: rule__UseCase__Group_12__1 : rule__UseCase__Group_12__1__Impl rule__UseCase__Group_12__2 ;
    public final void rule__UseCase__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:995:1: ( rule__UseCase__Group_12__1__Impl rule__UseCase__Group_12__2 )
            // InternalUseCaseDslParser.g:996:2: rule__UseCase__Group_12__1__Impl rule__UseCase__Group_12__2
            {
            pushFollow(FOLLOW_11);
            rule__UseCase__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_12__2();

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
    // $ANTLR end "rule__UseCase__Group_12__1"


    // $ANTLR start "rule__UseCase__Group_12__1__Impl"
    // InternalUseCaseDslParser.g:1003:1: rule__UseCase__Group_12__1__Impl : ( Colon ) ;
    public final void rule__UseCase__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1007:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:1008:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:1008:1: ( Colon )
            // InternalUseCaseDslParser.g:1009:2: Colon
            {
             before(grammarAccess.getUseCaseAccess().getColonKeyword_12_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getColonKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_12__1__Impl"


    // $ANTLR start "rule__UseCase__Group_12__2"
    // InternalUseCaseDslParser.g:1018:1: rule__UseCase__Group_12__2 : rule__UseCase__Group_12__2__Impl rule__UseCase__Group_12__3 ;
    public final void rule__UseCase__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1022:1: ( rule__UseCase__Group_12__2__Impl rule__UseCase__Group_12__3 )
            // InternalUseCaseDslParser.g:1023:2: rule__UseCase__Group_12__2__Impl rule__UseCase__Group_12__3
            {
            pushFollow(FOLLOW_6);
            rule__UseCase__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_12__3();

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
    // $ANTLR end "rule__UseCase__Group_12__2"


    // $ANTLR start "rule__UseCase__Group_12__2__Impl"
    // InternalUseCaseDslParser.g:1030:1: rule__UseCase__Group_12__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCase__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1034:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:1035:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:1035:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:1036:2: RULE_BEGIN
            {
             before(grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_12_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_12__2__Impl"


    // $ANTLR start "rule__UseCase__Group_12__3"
    // InternalUseCaseDslParser.g:1045:1: rule__UseCase__Group_12__3 : rule__UseCase__Group_12__3__Impl rule__UseCase__Group_12__4 ;
    public final void rule__UseCase__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1049:1: ( rule__UseCase__Group_12__3__Impl rule__UseCase__Group_12__4 )
            // InternalUseCaseDslParser.g:1050:2: rule__UseCase__Group_12__3__Impl rule__UseCase__Group_12__4
            {
            pushFollow(FOLLOW_12);
            rule__UseCase__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_12__4();

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
    // $ANTLR end "rule__UseCase__Group_12__3"


    // $ANTLR start "rule__UseCase__Group_12__3__Impl"
    // InternalUseCaseDslParser.g:1057:1: rule__UseCase__Group_12__3__Impl : ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) ) ;
    public final void rule__UseCase__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1061:1: ( ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) ) )
            // InternalUseCaseDslParser.g:1062:1: ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) )
            {
            // InternalUseCaseDslParser.g:1062:1: ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) )
            // InternalUseCaseDslParser.g:1063:2: ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* )
            {
            // InternalUseCaseDslParser.g:1063:2: ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) )
            // InternalUseCaseDslParser.g:1064:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 
            // InternalUseCaseDslParser.g:1065:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )
            // InternalUseCaseDslParser.g:1065:4: rule__UseCase__AlternativeflowsAssignment_12_3
            {
            pushFollow(FOLLOW_13);
            rule__UseCase__AlternativeflowsAssignment_12_3();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 

            }

            // InternalUseCaseDslParser.g:1068:2: ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* )
            // InternalUseCaseDslParser.g:1069:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )*
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 
            // InternalUseCaseDslParser.g:1070:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_INT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1070:4: rule__UseCase__AlternativeflowsAssignment_12_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UseCase__AlternativeflowsAssignment_12_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 

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
    // $ANTLR end "rule__UseCase__Group_12__3__Impl"


    // $ANTLR start "rule__UseCase__Group_12__4"
    // InternalUseCaseDslParser.g:1079:1: rule__UseCase__Group_12__4 : rule__UseCase__Group_12__4__Impl ;
    public final void rule__UseCase__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1083:1: ( rule__UseCase__Group_12__4__Impl )
            // InternalUseCaseDslParser.g:1084:2: rule__UseCase__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_12__4__Impl();

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
    // $ANTLR end "rule__UseCase__Group_12__4"


    // $ANTLR start "rule__UseCase__Group_12__4__Impl"
    // InternalUseCaseDslParser.g:1090:1: rule__UseCase__Group_12__4__Impl : ( RULE_END ) ;
    public final void rule__UseCase__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1094:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1095:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1095:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1096:2: RULE_END
            {
             before(grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_12_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_12_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_12__4__Impl"


    // $ANTLR start "rule__UseCase__Group_12_0__0"
    // InternalUseCaseDslParser.g:1106:1: rule__UseCase__Group_12_0__0 : rule__UseCase__Group_12_0__0__Impl rule__UseCase__Group_12_0__1 ;
    public final void rule__UseCase__Group_12_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1110:1: ( rule__UseCase__Group_12_0__0__Impl rule__UseCase__Group_12_0__1 )
            // InternalUseCaseDslParser.g:1111:2: rule__UseCase__Group_12_0__0__Impl rule__UseCase__Group_12_0__1
            {
            pushFollow(FOLLOW_10);
            rule__UseCase__Group_12_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_12_0__1();

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
    // $ANTLR end "rule__UseCase__Group_12_0__0"


    // $ANTLR start "rule__UseCase__Group_12_0__0__Impl"
    // InternalUseCaseDslParser.g:1118:1: rule__UseCase__Group_12_0__0__Impl : ( ALTERNATIVE ) ;
    public final void rule__UseCase__Group_12_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1122:1: ( ( ALTERNATIVE ) )
            // InternalUseCaseDslParser.g:1123:1: ( ALTERNATIVE )
            {
            // InternalUseCaseDslParser.g:1123:1: ( ALTERNATIVE )
            // InternalUseCaseDslParser.g:1124:2: ALTERNATIVE
            {
             before(grammarAccess.getUseCaseAccess().getALTERNATIVEKeyword_12_0_0()); 
            match(input,ALTERNATIVE,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getALTERNATIVEKeyword_12_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_12_0__0__Impl"


    // $ANTLR start "rule__UseCase__Group_12_0__1"
    // InternalUseCaseDslParser.g:1133:1: rule__UseCase__Group_12_0__1 : rule__UseCase__Group_12_0__1__Impl ;
    public final void rule__UseCase__Group_12_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1137:1: ( rule__UseCase__Group_12_0__1__Impl )
            // InternalUseCaseDslParser.g:1138:2: rule__UseCase__Group_12_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_12_0__1__Impl();

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
    // $ANTLR end "rule__UseCase__Group_12_0__1"


    // $ANTLR start "rule__UseCase__Group_12_0__1__Impl"
    // InternalUseCaseDslParser.g:1144:1: rule__UseCase__Group_12_0__1__Impl : ( FLOW ) ;
    public final void rule__UseCase__Group_12_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1148:1: ( ( FLOW ) )
            // InternalUseCaseDslParser.g:1149:1: ( FLOW )
            {
            // InternalUseCaseDslParser.g:1149:1: ( FLOW )
            // InternalUseCaseDslParser.g:1150:2: FLOW
            {
             before(grammarAccess.getUseCaseAccess().getFLOWKeyword_12_0_1()); 
            match(input,FLOW,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getFLOWKeyword_12_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_12_0__1__Impl"


    // $ANTLR start "rule__Extension__Group__0"
    // InternalUseCaseDslParser.g:1160:1: rule__Extension__Group__0 : rule__Extension__Group__0__Impl rule__Extension__Group__1 ;
    public final void rule__Extension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1164:1: ( rule__Extension__Group__0__Impl rule__Extension__Group__1 )
            // InternalUseCaseDslParser.g:1165:2: rule__Extension__Group__0__Impl rule__Extension__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:1172:1: rule__Extension__Group__0__Impl : ( ( ( rule__Extension__Group_0__0 ) ) ( ( rule__Extension__Group_0__0 )* ) ) ;
    public final void rule__Extension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1176:1: ( ( ( ( rule__Extension__Group_0__0 ) ) ( ( rule__Extension__Group_0__0 )* ) ) )
            // InternalUseCaseDslParser.g:1177:1: ( ( ( rule__Extension__Group_0__0 ) ) ( ( rule__Extension__Group_0__0 )* ) )
            {
            // InternalUseCaseDslParser.g:1177:1: ( ( ( rule__Extension__Group_0__0 ) ) ( ( rule__Extension__Group_0__0 )* ) )
            // InternalUseCaseDslParser.g:1178:2: ( ( rule__Extension__Group_0__0 ) ) ( ( rule__Extension__Group_0__0 )* )
            {
            // InternalUseCaseDslParser.g:1178:2: ( ( rule__Extension__Group_0__0 ) )
            // InternalUseCaseDslParser.g:1179:3: ( rule__Extension__Group_0__0 )
            {
             before(grammarAccess.getExtensionAccess().getGroup_0()); 
            // InternalUseCaseDslParser.g:1180:3: ( rule__Extension__Group_0__0 )
            // InternalUseCaseDslParser.g:1180:4: rule__Extension__Group_0__0
            {
            pushFollow(FOLLOW_13);
            rule__Extension__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getGroup_0()); 

            }

            // InternalUseCaseDslParser.g:1183:2: ( ( rule__Extension__Group_0__0 )* )
            // InternalUseCaseDslParser.g:1184:3: ( rule__Extension__Group_0__0 )*
            {
             before(grammarAccess.getExtensionAccess().getGroup_0()); 
            // InternalUseCaseDslParser.g:1185:3: ( rule__Extension__Group_0__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1185:4: rule__Extension__Group_0__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Extension__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getExtensionAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Extension__Group__0__Impl"


    // $ANTLR start "rule__Extension__Group__1"
    // InternalUseCaseDslParser.g:1194:1: rule__Extension__Group__1 : rule__Extension__Group__1__Impl rule__Extension__Group__2 ;
    public final void rule__Extension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1198:1: ( rule__Extension__Group__1__Impl rule__Extension__Group__2 )
            // InternalUseCaseDslParser.g:1199:2: rule__Extension__Group__1__Impl rule__Extension__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalUseCaseDslParser.g:1206:1: rule__Extension__Group__1__Impl : ( ( rule__Extension__NameAssignment_1 ) ) ;
    public final void rule__Extension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1210:1: ( ( ( rule__Extension__NameAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:1211:1: ( ( rule__Extension__NameAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:1211:1: ( ( rule__Extension__NameAssignment_1 ) )
            // InternalUseCaseDslParser.g:1212:2: ( rule__Extension__NameAssignment_1 )
            {
             before(grammarAccess.getExtensionAccess().getNameAssignment_1()); 
            // InternalUseCaseDslParser.g:1213:2: ( rule__Extension__NameAssignment_1 )
            // InternalUseCaseDslParser.g:1213:3: rule__Extension__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Extension__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1221:1: rule__Extension__Group__2 : rule__Extension__Group__2__Impl rule__Extension__Group__3 ;
    public final void rule__Extension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1225:1: ( rule__Extension__Group__2__Impl rule__Extension__Group__3 )
            // InternalUseCaseDslParser.g:1226:2: rule__Extension__Group__2__Impl rule__Extension__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCaseDslParser.g:1233:1: rule__Extension__Group__2__Impl : ( FullStop ) ;
    public final void rule__Extension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1237:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1238:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1238:1: ( FullStop )
            // InternalUseCaseDslParser.g:1239:2: FullStop
            {
             before(grammarAccess.getExtensionAccess().getFullStopKeyword_2()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getFullStopKeyword_2()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1248:1: rule__Extension__Group__3 : rule__Extension__Group__3__Impl rule__Extension__Group__4 ;
    public final void rule__Extension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1252:1: ( rule__Extension__Group__3__Impl rule__Extension__Group__4 )
            // InternalUseCaseDslParser.g:1253:2: rule__Extension__Group__3__Impl rule__Extension__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalUseCaseDslParser.g:1260:1: rule__Extension__Group__3__Impl : ( IF ) ;
    public final void rule__Extension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1264:1: ( ( IF ) )
            // InternalUseCaseDslParser.g:1265:1: ( IF )
            {
            // InternalUseCaseDslParser.g:1265:1: ( IF )
            // InternalUseCaseDslParser.g:1266:2: IF
            {
             before(grammarAccess.getExtensionAccess().getIFKeyword_3()); 
            match(input,IF,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getIFKeyword_3()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1275:1: rule__Extension__Group__4 : rule__Extension__Group__4__Impl rule__Extension__Group__5 ;
    public final void rule__Extension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1279:1: ( rule__Extension__Group__4__Impl rule__Extension__Group__5 )
            // InternalUseCaseDslParser.g:1280:2: rule__Extension__Group__4__Impl rule__Extension__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCaseDslParser.g:1287:1: rule__Extension__Group__4__Impl : ( ( rule__Extension__ConditionAssignment_4 ) ) ;
    public final void rule__Extension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1291:1: ( ( ( rule__Extension__ConditionAssignment_4 ) ) )
            // InternalUseCaseDslParser.g:1292:1: ( ( rule__Extension__ConditionAssignment_4 ) )
            {
            // InternalUseCaseDslParser.g:1292:1: ( ( rule__Extension__ConditionAssignment_4 ) )
            // InternalUseCaseDslParser.g:1293:2: ( rule__Extension__ConditionAssignment_4 )
            {
             before(grammarAccess.getExtensionAccess().getConditionAssignment_4()); 
            // InternalUseCaseDslParser.g:1294:2: ( rule__Extension__ConditionAssignment_4 )
            // InternalUseCaseDslParser.g:1294:3: rule__Extension__ConditionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Extension__ConditionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getConditionAssignment_4()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1302:1: rule__Extension__Group__5 : rule__Extension__Group__5__Impl rule__Extension__Group__6 ;
    public final void rule__Extension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1306:1: ( rule__Extension__Group__5__Impl rule__Extension__Group__6 )
            // InternalUseCaseDslParser.g:1307:2: rule__Extension__Group__5__Impl rule__Extension__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:1314:1: rule__Extension__Group__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__Extension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1318:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:1319:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:1319:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:1320:2: RULE_BEGIN
            {
             before(grammarAccess.getExtensionAccess().getBEGINTerminalRuleCall_5()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getBEGINTerminalRuleCall_5()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1329:1: rule__Extension__Group__6 : rule__Extension__Group__6__Impl rule__Extension__Group__7 ;
    public final void rule__Extension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1333:1: ( rule__Extension__Group__6__Impl rule__Extension__Group__7 )
            // InternalUseCaseDslParser.g:1334:2: rule__Extension__Group__6__Impl rule__Extension__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:1341:1: rule__Extension__Group__6__Impl : ( ( rule__Extension__StepsAssignment_6 )* ) ;
    public final void rule__Extension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1345:1: ( ( ( rule__Extension__StepsAssignment_6 )* ) )
            // InternalUseCaseDslParser.g:1346:1: ( ( rule__Extension__StepsAssignment_6 )* )
            {
            // InternalUseCaseDslParser.g:1346:1: ( ( rule__Extension__StepsAssignment_6 )* )
            // InternalUseCaseDslParser.g:1347:2: ( rule__Extension__StepsAssignment_6 )*
            {
             before(grammarAccess.getExtensionAccess().getStepsAssignment_6()); 
            // InternalUseCaseDslParser.g:1348:2: ( rule__Extension__StepsAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1348:3: rule__Extension__StepsAssignment_6
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Extension__StepsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getExtensionAccess().getStepsAssignment_6()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1356:1: rule__Extension__Group__7 : rule__Extension__Group__7__Impl rule__Extension__Group__8 ;
    public final void rule__Extension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1360:1: ( rule__Extension__Group__7__Impl rule__Extension__Group__8 )
            // InternalUseCaseDslParser.g:1361:2: rule__Extension__Group__7__Impl rule__Extension__Group__8
            {
            pushFollow(FOLLOW_12);
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
    // InternalUseCaseDslParser.g:1368:1: rule__Extension__Group__7__Impl : ( ( rule__Extension__Alternatives_7 ) ) ;
    public final void rule__Extension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1372:1: ( ( ( rule__Extension__Alternatives_7 ) ) )
            // InternalUseCaseDslParser.g:1373:1: ( ( rule__Extension__Alternatives_7 ) )
            {
            // InternalUseCaseDslParser.g:1373:1: ( ( rule__Extension__Alternatives_7 ) )
            // InternalUseCaseDslParser.g:1374:2: ( rule__Extension__Alternatives_7 )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives_7()); 
            // InternalUseCaseDslParser.g:1375:2: ( rule__Extension__Alternatives_7 )
            // InternalUseCaseDslParser.g:1375:3: rule__Extension__Alternatives_7
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Alternatives_7();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getAlternatives_7()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1383:1: rule__Extension__Group__8 : rule__Extension__Group__8__Impl ;
    public final void rule__Extension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1387:1: ( rule__Extension__Group__8__Impl )
            // InternalUseCaseDslParser.g:1388:2: rule__Extension__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Group__8__Impl();

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
    // InternalUseCaseDslParser.g:1394:1: rule__Extension__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Extension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1398:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1399:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1399:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1400:2: RULE_END
            {
             before(grammarAccess.getExtensionAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getENDTerminalRuleCall_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Extension__Group_0__0"
    // InternalUseCaseDslParser.g:1410:1: rule__Extension__Group_0__0 : rule__Extension__Group_0__0__Impl rule__Extension__Group_0__1 ;
    public final void rule__Extension__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1414:1: ( rule__Extension__Group_0__0__Impl rule__Extension__Group_0__1 )
            // InternalUseCaseDslParser.g:1415:2: rule__Extension__Group_0__0__Impl rule__Extension__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Extension__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group_0__1();

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
    // $ANTLR end "rule__Extension__Group_0__0"


    // $ANTLR start "rule__Extension__Group_0__0__Impl"
    // InternalUseCaseDslParser.g:1422:1: rule__Extension__Group_0__0__Impl : ( ( rule__Extension__StartFromAssignment_0_0 ) ) ;
    public final void rule__Extension__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1426:1: ( ( ( rule__Extension__StartFromAssignment_0_0 ) ) )
            // InternalUseCaseDslParser.g:1427:1: ( ( rule__Extension__StartFromAssignment_0_0 ) )
            {
            // InternalUseCaseDslParser.g:1427:1: ( ( rule__Extension__StartFromAssignment_0_0 ) )
            // InternalUseCaseDslParser.g:1428:2: ( rule__Extension__StartFromAssignment_0_0 )
            {
             before(grammarAccess.getExtensionAccess().getStartFromAssignment_0_0()); 
            // InternalUseCaseDslParser.g:1429:2: ( rule__Extension__StartFromAssignment_0_0 )
            // InternalUseCaseDslParser.g:1429:3: rule__Extension__StartFromAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Extension__StartFromAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getStartFromAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_0__0__Impl"


    // $ANTLR start "rule__Extension__Group_0__1"
    // InternalUseCaseDslParser.g:1437:1: rule__Extension__Group_0__1 : rule__Extension__Group_0__1__Impl ;
    public final void rule__Extension__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1441:1: ( rule__Extension__Group_0__1__Impl )
            // InternalUseCaseDslParser.g:1442:2: rule__Extension__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Group_0__1__Impl();

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
    // $ANTLR end "rule__Extension__Group_0__1"


    // $ANTLR start "rule__Extension__Group_0__1__Impl"
    // InternalUseCaseDslParser.g:1448:1: rule__Extension__Group_0__1__Impl : ( FullStop ) ;
    public final void rule__Extension__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1452:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1453:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1453:1: ( FullStop )
            // InternalUseCaseDslParser.g:1454:2: FullStop
            {
             before(grammarAccess.getExtensionAccess().getFullStopKeyword_0_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_0__1__Impl"


    // $ANTLR start "rule__Extension__Group_7_0__0"
    // InternalUseCaseDslParser.g:1464:1: rule__Extension__Group_7_0__0 : rule__Extension__Group_7_0__0__Impl rule__Extension__Group_7_0__1 ;
    public final void rule__Extension__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1468:1: ( rule__Extension__Group_7_0__0__Impl rule__Extension__Group_7_0__1 )
            // InternalUseCaseDslParser.g:1469:2: rule__Extension__Group_7_0__0__Impl rule__Extension__Group_7_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Extension__Group_7_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group_7_0__1();

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
    // $ANTLR end "rule__Extension__Group_7_0__0"


    // $ANTLR start "rule__Extension__Group_7_0__0__Impl"
    // InternalUseCaseDslParser.g:1476:1: rule__Extension__Group_7_0__0__Impl : ( RULE_INT ) ;
    public final void rule__Extension__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1480:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:1481:1: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:1481:1: ( RULE_INT )
            // InternalUseCaseDslParser.g:1482:2: RULE_INT
            {
             before(grammarAccess.getExtensionAccess().getINTTerminalRuleCall_7_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getINTTerminalRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7_0__0__Impl"


    // $ANTLR start "rule__Extension__Group_7_0__1"
    // InternalUseCaseDslParser.g:1491:1: rule__Extension__Group_7_0__1 : rule__Extension__Group_7_0__1__Impl rule__Extension__Group_7_0__2 ;
    public final void rule__Extension__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1495:1: ( rule__Extension__Group_7_0__1__Impl rule__Extension__Group_7_0__2 )
            // InternalUseCaseDslParser.g:1496:2: rule__Extension__Group_7_0__1__Impl rule__Extension__Group_7_0__2
            {
            pushFollow(FOLLOW_19);
            rule__Extension__Group_7_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group_7_0__2();

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
    // $ANTLR end "rule__Extension__Group_7_0__1"


    // $ANTLR start "rule__Extension__Group_7_0__1__Impl"
    // InternalUseCaseDslParser.g:1503:1: rule__Extension__Group_7_0__1__Impl : ( FullStop ) ;
    public final void rule__Extension__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1507:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1508:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1508:1: ( FullStop )
            // InternalUseCaseDslParser.g:1509:2: FullStop
            {
             before(grammarAccess.getExtensionAccess().getFullStopKeyword_7_0_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getFullStopKeyword_7_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7_0__1__Impl"


    // $ANTLR start "rule__Extension__Group_7_0__2"
    // InternalUseCaseDslParser.g:1518:1: rule__Extension__Group_7_0__2 : rule__Extension__Group_7_0__2__Impl rule__Extension__Group_7_0__3 ;
    public final void rule__Extension__Group_7_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1522:1: ( rule__Extension__Group_7_0__2__Impl rule__Extension__Group_7_0__3 )
            // InternalUseCaseDslParser.g:1523:2: rule__Extension__Group_7_0__2__Impl rule__Extension__Group_7_0__3
            {
            pushFollow(FOLLOW_20);
            rule__Extension__Group_7_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group_7_0__3();

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
    // $ANTLR end "rule__Extension__Group_7_0__2"


    // $ANTLR start "rule__Extension__Group_7_0__2__Impl"
    // InternalUseCaseDslParser.g:1530:1: rule__Extension__Group_7_0__2__Impl : ( RETURN ) ;
    public final void rule__Extension__Group_7_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1534:1: ( ( RETURN ) )
            // InternalUseCaseDslParser.g:1535:1: ( RETURN )
            {
            // InternalUseCaseDslParser.g:1535:1: ( RETURN )
            // InternalUseCaseDslParser.g:1536:2: RETURN
            {
             before(grammarAccess.getExtensionAccess().getRETURNKeyword_7_0_2()); 
            match(input,RETURN,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getRETURNKeyword_7_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7_0__2__Impl"


    // $ANTLR start "rule__Extension__Group_7_0__3"
    // InternalUseCaseDslParser.g:1545:1: rule__Extension__Group_7_0__3 : rule__Extension__Group_7_0__3__Impl rule__Extension__Group_7_0__4 ;
    public final void rule__Extension__Group_7_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1549:1: ( rule__Extension__Group_7_0__3__Impl rule__Extension__Group_7_0__4 )
            // InternalUseCaseDslParser.g:1550:2: rule__Extension__Group_7_0__3__Impl rule__Extension__Group_7_0__4
            {
            pushFollow(FOLLOW_6);
            rule__Extension__Group_7_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group_7_0__4();

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
    // $ANTLR end "rule__Extension__Group_7_0__3"


    // $ANTLR start "rule__Extension__Group_7_0__3__Impl"
    // InternalUseCaseDslParser.g:1557:1: rule__Extension__Group_7_0__3__Impl : ( TO ) ;
    public final void rule__Extension__Group_7_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1561:1: ( ( TO ) )
            // InternalUseCaseDslParser.g:1562:1: ( TO )
            {
            // InternalUseCaseDslParser.g:1562:1: ( TO )
            // InternalUseCaseDslParser.g:1563:2: TO
            {
             before(grammarAccess.getExtensionAccess().getTOKeyword_7_0_3()); 
            match(input,TO,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getTOKeyword_7_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7_0__3__Impl"


    // $ANTLR start "rule__Extension__Group_7_0__4"
    // InternalUseCaseDslParser.g:1572:1: rule__Extension__Group_7_0__4 : rule__Extension__Group_7_0__4__Impl ;
    public final void rule__Extension__Group_7_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1576:1: ( rule__Extension__Group_7_0__4__Impl )
            // InternalUseCaseDslParser.g:1577:2: rule__Extension__Group_7_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Group_7_0__4__Impl();

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
    // $ANTLR end "rule__Extension__Group_7_0__4"


    // $ANTLR start "rule__Extension__Group_7_0__4__Impl"
    // InternalUseCaseDslParser.g:1583:1: rule__Extension__Group_7_0__4__Impl : ( ( ( rule__Extension__Group_7_0_4__0 ) ) ( ( rule__Extension__Group_7_0_4__0 )* ) ) ;
    public final void rule__Extension__Group_7_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1587:1: ( ( ( ( rule__Extension__Group_7_0_4__0 ) ) ( ( rule__Extension__Group_7_0_4__0 )* ) ) )
            // InternalUseCaseDslParser.g:1588:1: ( ( ( rule__Extension__Group_7_0_4__0 ) ) ( ( rule__Extension__Group_7_0_4__0 )* ) )
            {
            // InternalUseCaseDslParser.g:1588:1: ( ( ( rule__Extension__Group_7_0_4__0 ) ) ( ( rule__Extension__Group_7_0_4__0 )* ) )
            // InternalUseCaseDslParser.g:1589:2: ( ( rule__Extension__Group_7_0_4__0 ) ) ( ( rule__Extension__Group_7_0_4__0 )* )
            {
            // InternalUseCaseDslParser.g:1589:2: ( ( rule__Extension__Group_7_0_4__0 ) )
            // InternalUseCaseDslParser.g:1590:3: ( rule__Extension__Group_7_0_4__0 )
            {
             before(grammarAccess.getExtensionAccess().getGroup_7_0_4()); 
            // InternalUseCaseDslParser.g:1591:3: ( rule__Extension__Group_7_0_4__0 )
            // InternalUseCaseDslParser.g:1591:4: rule__Extension__Group_7_0_4__0
            {
            pushFollow(FOLLOW_13);
            rule__Extension__Group_7_0_4__0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getGroup_7_0_4()); 

            }

            // InternalUseCaseDslParser.g:1594:2: ( ( rule__Extension__Group_7_0_4__0 )* )
            // InternalUseCaseDslParser.g:1595:3: ( rule__Extension__Group_7_0_4__0 )*
            {
             before(grammarAccess.getExtensionAccess().getGroup_7_0_4()); 
            // InternalUseCaseDslParser.g:1596:3: ( rule__Extension__Group_7_0_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_INT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1596:4: rule__Extension__Group_7_0_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Extension__Group_7_0_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getExtensionAccess().getGroup_7_0_4()); 

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
    // $ANTLR end "rule__Extension__Group_7_0__4__Impl"


    // $ANTLR start "rule__Extension__Group_7_0_4__0"
    // InternalUseCaseDslParser.g:1606:1: rule__Extension__Group_7_0_4__0 : rule__Extension__Group_7_0_4__0__Impl rule__Extension__Group_7_0_4__1 ;
    public final void rule__Extension__Group_7_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1610:1: ( rule__Extension__Group_7_0_4__0__Impl rule__Extension__Group_7_0_4__1 )
            // InternalUseCaseDslParser.g:1611:2: rule__Extension__Group_7_0_4__0__Impl rule__Extension__Group_7_0_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Extension__Group_7_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Extension__Group_7_0_4__1();

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
    // $ANTLR end "rule__Extension__Group_7_0_4__0"


    // $ANTLR start "rule__Extension__Group_7_0_4__0__Impl"
    // InternalUseCaseDslParser.g:1618:1: rule__Extension__Group_7_0_4__0__Impl : ( ( rule__Extension__ResumeAtAssignment_7_0_4_0 ) ) ;
    public final void rule__Extension__Group_7_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1622:1: ( ( ( rule__Extension__ResumeAtAssignment_7_0_4_0 ) ) )
            // InternalUseCaseDslParser.g:1623:1: ( ( rule__Extension__ResumeAtAssignment_7_0_4_0 ) )
            {
            // InternalUseCaseDslParser.g:1623:1: ( ( rule__Extension__ResumeAtAssignment_7_0_4_0 ) )
            // InternalUseCaseDslParser.g:1624:2: ( rule__Extension__ResumeAtAssignment_7_0_4_0 )
            {
             before(grammarAccess.getExtensionAccess().getResumeAtAssignment_7_0_4_0()); 
            // InternalUseCaseDslParser.g:1625:2: ( rule__Extension__ResumeAtAssignment_7_0_4_0 )
            // InternalUseCaseDslParser.g:1625:3: rule__Extension__ResumeAtAssignment_7_0_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Extension__ResumeAtAssignment_7_0_4_0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getResumeAtAssignment_7_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7_0_4__0__Impl"


    // $ANTLR start "rule__Extension__Group_7_0_4__1"
    // InternalUseCaseDslParser.g:1633:1: rule__Extension__Group_7_0_4__1 : rule__Extension__Group_7_0_4__1__Impl ;
    public final void rule__Extension__Group_7_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1637:1: ( rule__Extension__Group_7_0_4__1__Impl )
            // InternalUseCaseDslParser.g:1638:2: rule__Extension__Group_7_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Group_7_0_4__1__Impl();

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
    // $ANTLR end "rule__Extension__Group_7_0_4__1"


    // $ANTLR start "rule__Extension__Group_7_0_4__1__Impl"
    // InternalUseCaseDslParser.g:1644:1: rule__Extension__Group_7_0_4__1__Impl : ( ( FullStop )? ) ;
    public final void rule__Extension__Group_7_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1648:1: ( ( ( FullStop )? ) )
            // InternalUseCaseDslParser.g:1649:1: ( ( FullStop )? )
            {
            // InternalUseCaseDslParser.g:1649:1: ( ( FullStop )? )
            // InternalUseCaseDslParser.g:1650:2: ( FullStop )?
            {
             before(grammarAccess.getExtensionAccess().getFullStopKeyword_7_0_4_1()); 
            // InternalUseCaseDslParser.g:1651:2: ( FullStop )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==FullStop) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUseCaseDslParser.g:1651:3: FullStop
                    {
                    match(input,FullStop,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExtensionAccess().getFullStopKeyword_7_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__Group_7_0_4__1__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_0__0"
    // InternalUseCaseDslParser.g:1660:1: rule__UseCaseStep__Group_0__0 : rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1 ;
    public final void rule__UseCaseStep__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1664:1: ( rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1 )
            // InternalUseCaseDslParser.g:1665:2: rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:1672:1: rule__UseCaseStep__Group_0__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1676:1: ( ( () ) )
            // InternalUseCaseDslParser.g:1677:1: ( () )
            {
            // InternalUseCaseDslParser.g:1677:1: ( () )
            // InternalUseCaseDslParser.g:1678:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getUserStepAction_0_0()); 
            // InternalUseCaseDslParser.g:1679:2: ()
            // InternalUseCaseDslParser.g:1679:3: 
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
    // InternalUseCaseDslParser.g:1687:1: rule__UseCaseStep__Group_0__1 : rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2 ;
    public final void rule__UseCaseStep__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1691:1: ( rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2 )
            // InternalUseCaseDslParser.g:1692:2: rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalUseCaseDslParser.g:1699:1: rule__UseCaseStep__Group_0__1__Impl : ( ( rule__UseCaseStep__NameAssignment_0_1 ) ) ;
    public final void rule__UseCaseStep__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1703:1: ( ( ( rule__UseCaseStep__NameAssignment_0_1 ) ) )
            // InternalUseCaseDslParser.g:1704:1: ( ( rule__UseCaseStep__NameAssignment_0_1 ) )
            {
            // InternalUseCaseDslParser.g:1704:1: ( ( rule__UseCaseStep__NameAssignment_0_1 ) )
            // InternalUseCaseDslParser.g:1705:2: ( rule__UseCaseStep__NameAssignment_0_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_0_1()); 
            // InternalUseCaseDslParser.g:1706:2: ( rule__UseCaseStep__NameAssignment_0_1 )
            // InternalUseCaseDslParser.g:1706:3: rule__UseCaseStep__NameAssignment_0_1
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
    // InternalUseCaseDslParser.g:1714:1: rule__UseCaseStep__Group_0__2 : rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3 ;
    public final void rule__UseCaseStep__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1718:1: ( rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3 )
            // InternalUseCaseDslParser.g:1719:2: rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalUseCaseDslParser.g:1726:1: rule__UseCaseStep__Group_0__2__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1730:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1731:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1731:1: ( FullStop )
            // InternalUseCaseDslParser.g:1732:2: FullStop
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
    // InternalUseCaseDslParser.g:1741:1: rule__UseCaseStep__Group_0__3 : rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4 ;
    public final void rule__UseCaseStep__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1745:1: ( rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4 )
            // InternalUseCaseDslParser.g:1746:2: rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCaseDslParser.g:1753:1: rule__UseCaseStep__Group_0__3__Impl : ( USER ) ;
    public final void rule__UseCaseStep__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1757:1: ( ( USER ) )
            // InternalUseCaseDslParser.g:1758:1: ( USER )
            {
            // InternalUseCaseDslParser.g:1758:1: ( USER )
            // InternalUseCaseDslParser.g:1759:2: USER
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
    // InternalUseCaseDslParser.g:1768:1: rule__UseCaseStep__Group_0__4 : rule__UseCaseStep__Group_0__4__Impl ;
    public final void rule__UseCaseStep__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1772:1: ( rule__UseCaseStep__Group_0__4__Impl )
            // InternalUseCaseDslParser.g:1773:2: rule__UseCaseStep__Group_0__4__Impl
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
    // InternalUseCaseDslParser.g:1779:1: rule__UseCaseStep__Group_0__4__Impl : ( ( rule__UseCaseStep__SentenceAssignment_0_4 ) ) ;
    public final void rule__UseCaseStep__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1783:1: ( ( ( rule__UseCaseStep__SentenceAssignment_0_4 ) ) )
            // InternalUseCaseDslParser.g:1784:1: ( ( rule__UseCaseStep__SentenceAssignment_0_4 ) )
            {
            // InternalUseCaseDslParser.g:1784:1: ( ( rule__UseCaseStep__SentenceAssignment_0_4 ) )
            // InternalUseCaseDslParser.g:1785:2: ( rule__UseCaseStep__SentenceAssignment_0_4 )
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_0_4()); 
            // InternalUseCaseDslParser.g:1786:2: ( rule__UseCaseStep__SentenceAssignment_0_4 )
            // InternalUseCaseDslParser.g:1786:3: rule__UseCaseStep__SentenceAssignment_0_4
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
    // InternalUseCaseDslParser.g:1795:1: rule__UseCaseStep__Group_1__0 : rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1 ;
    public final void rule__UseCaseStep__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1799:1: ( rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1 )
            // InternalUseCaseDslParser.g:1800:2: rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:1807:1: rule__UseCaseStep__Group_1__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1811:1: ( ( () ) )
            // InternalUseCaseDslParser.g:1812:1: ( () )
            {
            // InternalUseCaseDslParser.g:1812:1: ( () )
            // InternalUseCaseDslParser.g:1813:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getSystemStepAction_1_0()); 
            // InternalUseCaseDslParser.g:1814:2: ()
            // InternalUseCaseDslParser.g:1814:3: 
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
    // InternalUseCaseDslParser.g:1822:1: rule__UseCaseStep__Group_1__1 : rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2 ;
    public final void rule__UseCaseStep__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1826:1: ( rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2 )
            // InternalUseCaseDslParser.g:1827:2: rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalUseCaseDslParser.g:1834:1: rule__UseCaseStep__Group_1__1__Impl : ( ( rule__UseCaseStep__NameAssignment_1_1 ) ) ;
    public final void rule__UseCaseStep__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1838:1: ( ( ( rule__UseCaseStep__NameAssignment_1_1 ) ) )
            // InternalUseCaseDslParser.g:1839:1: ( ( rule__UseCaseStep__NameAssignment_1_1 ) )
            {
            // InternalUseCaseDslParser.g:1839:1: ( ( rule__UseCaseStep__NameAssignment_1_1 ) )
            // InternalUseCaseDslParser.g:1840:2: ( rule__UseCaseStep__NameAssignment_1_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_1_1()); 
            // InternalUseCaseDslParser.g:1841:2: ( rule__UseCaseStep__NameAssignment_1_1 )
            // InternalUseCaseDslParser.g:1841:3: rule__UseCaseStep__NameAssignment_1_1
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
    // InternalUseCaseDslParser.g:1849:1: rule__UseCaseStep__Group_1__2 : rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3 ;
    public final void rule__UseCaseStep__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1853:1: ( rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3 )
            // InternalUseCaseDslParser.g:1854:2: rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalUseCaseDslParser.g:1861:1: rule__UseCaseStep__Group_1__2__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1865:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1866:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1866:1: ( FullStop )
            // InternalUseCaseDslParser.g:1867:2: FullStop
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
    // InternalUseCaseDslParser.g:1876:1: rule__UseCaseStep__Group_1__3 : rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4 ;
    public final void rule__UseCaseStep__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1880:1: ( rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4 )
            // InternalUseCaseDslParser.g:1881:2: rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCaseDslParser.g:1888:1: rule__UseCaseStep__Group_1__3__Impl : ( SYSTEM ) ;
    public final void rule__UseCaseStep__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1892:1: ( ( SYSTEM ) )
            // InternalUseCaseDslParser.g:1893:1: ( SYSTEM )
            {
            // InternalUseCaseDslParser.g:1893:1: ( SYSTEM )
            // InternalUseCaseDslParser.g:1894:2: SYSTEM
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
    // InternalUseCaseDslParser.g:1903:1: rule__UseCaseStep__Group_1__4 : rule__UseCaseStep__Group_1__4__Impl ;
    public final void rule__UseCaseStep__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1907:1: ( rule__UseCaseStep__Group_1__4__Impl )
            // InternalUseCaseDslParser.g:1908:2: rule__UseCaseStep__Group_1__4__Impl
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
    // InternalUseCaseDslParser.g:1914:1: rule__UseCaseStep__Group_1__4__Impl : ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) ) ;
    public final void rule__UseCaseStep__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1918:1: ( ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) ) )
            // InternalUseCaseDslParser.g:1919:1: ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) )
            {
            // InternalUseCaseDslParser.g:1919:1: ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) )
            // InternalUseCaseDslParser.g:1920:2: ( rule__UseCaseStep__SentenceAssignment_1_4 )
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_1_4()); 
            // InternalUseCaseDslParser.g:1921:2: ( rule__UseCaseStep__SentenceAssignment_1_4 )
            // InternalUseCaseDslParser.g:1921:3: rule__UseCaseStep__SentenceAssignment_1_4
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
    // InternalUseCaseDslParser.g:1930:1: rule__UseCaseStep__Group_2__0 : rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1 ;
    public final void rule__UseCaseStep__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1934:1: ( rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1 )
            // InternalUseCaseDslParser.g:1935:2: rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:1942:1: rule__UseCaseStep__Group_2__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1946:1: ( ( () ) )
            // InternalUseCaseDslParser.g:1947:1: ( () )
            {
            // InternalUseCaseDslParser.g:1947:1: ( () )
            // InternalUseCaseDslParser.g:1948:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatingStepAction_2_0()); 
            // InternalUseCaseDslParser.g:1949:2: ()
            // InternalUseCaseDslParser.g:1949:3: 
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
    // InternalUseCaseDslParser.g:1957:1: rule__UseCaseStep__Group_2__1 : rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2 ;
    public final void rule__UseCaseStep__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1961:1: ( rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2 )
            // InternalUseCaseDslParser.g:1962:2: rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalUseCaseDslParser.g:1969:1: rule__UseCaseStep__Group_2__1__Impl : ( ( rule__UseCaseStep__NameAssignment_2_1 ) ) ;
    public final void rule__UseCaseStep__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1973:1: ( ( ( rule__UseCaseStep__NameAssignment_2_1 ) ) )
            // InternalUseCaseDslParser.g:1974:1: ( ( rule__UseCaseStep__NameAssignment_2_1 ) )
            {
            // InternalUseCaseDslParser.g:1974:1: ( ( rule__UseCaseStep__NameAssignment_2_1 ) )
            // InternalUseCaseDslParser.g:1975:2: ( rule__UseCaseStep__NameAssignment_2_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_2_1()); 
            // InternalUseCaseDslParser.g:1976:2: ( rule__UseCaseStep__NameAssignment_2_1 )
            // InternalUseCaseDslParser.g:1976:3: rule__UseCaseStep__NameAssignment_2_1
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
    // InternalUseCaseDslParser.g:1984:1: rule__UseCaseStep__Group_2__2 : rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3 ;
    public final void rule__UseCaseStep__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1988:1: ( rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3 )
            // InternalUseCaseDslParser.g:1989:2: rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalUseCaseDslParser.g:1996:1: rule__UseCaseStep__Group_2__2__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2000:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2001:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2001:1: ( FullStop )
            // InternalUseCaseDslParser.g:2002:2: FullStop
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
    // InternalUseCaseDslParser.g:2011:1: rule__UseCaseStep__Group_2__3 : rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4 ;
    public final void rule__UseCaseStep__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2015:1: ( rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4 )
            // InternalUseCaseDslParser.g:2016:2: rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalUseCaseDslParser.g:2023:1: rule__UseCaseStep__Group_2__3__Impl : ( WHILE ) ;
    public final void rule__UseCaseStep__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2027:1: ( ( WHILE ) )
            // InternalUseCaseDslParser.g:2028:1: ( WHILE )
            {
            // InternalUseCaseDslParser.g:2028:1: ( WHILE )
            // InternalUseCaseDslParser.g:2029:2: WHILE
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
    // InternalUseCaseDslParser.g:2038:1: rule__UseCaseStep__Group_2__4 : rule__UseCaseStep__Group_2__4__Impl rule__UseCaseStep__Group_2__5 ;
    public final void rule__UseCaseStep__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2042:1: ( rule__UseCaseStep__Group_2__4__Impl rule__UseCaseStep__Group_2__5 )
            // InternalUseCaseDslParser.g:2043:2: rule__UseCaseStep__Group_2__4__Impl rule__UseCaseStep__Group_2__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCaseDslParser.g:2050:1: rule__UseCaseStep__Group_2__4__Impl : ( ( rule__UseCaseStep__RepeatingConditionAssignment_2_4 ) ) ;
    public final void rule__UseCaseStep__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2054:1: ( ( ( rule__UseCaseStep__RepeatingConditionAssignment_2_4 ) ) )
            // InternalUseCaseDslParser.g:2055:1: ( ( rule__UseCaseStep__RepeatingConditionAssignment_2_4 ) )
            {
            // InternalUseCaseDslParser.g:2055:1: ( ( rule__UseCaseStep__RepeatingConditionAssignment_2_4 ) )
            // InternalUseCaseDslParser.g:2056:2: ( rule__UseCaseStep__RepeatingConditionAssignment_2_4 )
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatingConditionAssignment_2_4()); 
            // InternalUseCaseDslParser.g:2057:2: ( rule__UseCaseStep__RepeatingConditionAssignment_2_4 )
            // InternalUseCaseDslParser.g:2057:3: rule__UseCaseStep__RepeatingConditionAssignment_2_4
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
    // InternalUseCaseDslParser.g:2065:1: rule__UseCaseStep__Group_2__5 : rule__UseCaseStep__Group_2__5__Impl rule__UseCaseStep__Group_2__6 ;
    public final void rule__UseCaseStep__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2069:1: ( rule__UseCaseStep__Group_2__5__Impl rule__UseCaseStep__Group_2__6 )
            // InternalUseCaseDslParser.g:2070:2: rule__UseCaseStep__Group_2__5__Impl rule__UseCaseStep__Group_2__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:2077:1: rule__UseCaseStep__Group_2__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCaseStep__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2081:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:2082:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:2082:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:2083:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:2092:1: rule__UseCaseStep__Group_2__6 : rule__UseCaseStep__Group_2__6__Impl rule__UseCaseStep__Group_2__7 ;
    public final void rule__UseCaseStep__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2096:1: ( rule__UseCaseStep__Group_2__6__Impl rule__UseCaseStep__Group_2__7 )
            // InternalUseCaseDslParser.g:2097:2: rule__UseCaseStep__Group_2__6__Impl rule__UseCaseStep__Group_2__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalUseCaseDslParser.g:2104:1: rule__UseCaseStep__Group_2__6__Impl : ( ( ( rule__UseCaseStep__Group_2_6__0 ) ) ( ( rule__UseCaseStep__Group_2_6__0 )* ) ) ;
    public final void rule__UseCaseStep__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2108:1: ( ( ( ( rule__UseCaseStep__Group_2_6__0 ) ) ( ( rule__UseCaseStep__Group_2_6__0 )* ) ) )
            // InternalUseCaseDslParser.g:2109:1: ( ( ( rule__UseCaseStep__Group_2_6__0 ) ) ( ( rule__UseCaseStep__Group_2_6__0 )* ) )
            {
            // InternalUseCaseDslParser.g:2109:1: ( ( ( rule__UseCaseStep__Group_2_6__0 ) ) ( ( rule__UseCaseStep__Group_2_6__0 )* ) )
            // InternalUseCaseDslParser.g:2110:2: ( ( rule__UseCaseStep__Group_2_6__0 ) ) ( ( rule__UseCaseStep__Group_2_6__0 )* )
            {
            // InternalUseCaseDslParser.g:2110:2: ( ( rule__UseCaseStep__Group_2_6__0 ) )
            // InternalUseCaseDslParser.g:2111:3: ( rule__UseCaseStep__Group_2_6__0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_2_6()); 
            // InternalUseCaseDslParser.g:2112:3: ( rule__UseCaseStep__Group_2_6__0 )
            // InternalUseCaseDslParser.g:2112:4: rule__UseCaseStep__Group_2_6__0
            {
            pushFollow(FOLLOW_13);
            rule__UseCaseStep__Group_2_6__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getGroup_2_6()); 

            }

            // InternalUseCaseDslParser.g:2115:2: ( ( rule__UseCaseStep__Group_2_6__0 )* )
            // InternalUseCaseDslParser.g:2116:3: ( rule__UseCaseStep__Group_2_6__0 )*
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_2_6()); 
            // InternalUseCaseDslParser.g:2117:3: ( rule__UseCaseStep__Group_2_6__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_INT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:2117:4: rule__UseCaseStep__Group_2_6__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UseCaseStep__Group_2_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalUseCaseDslParser.g:2126:1: rule__UseCaseStep__Group_2__7 : rule__UseCaseStep__Group_2__7__Impl ;
    public final void rule__UseCaseStep__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2130:1: ( rule__UseCaseStep__Group_2__7__Impl )
            // InternalUseCaseDslParser.g:2131:2: rule__UseCaseStep__Group_2__7__Impl
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
    // InternalUseCaseDslParser.g:2137:1: rule__UseCaseStep__Group_2__7__Impl : ( RULE_END ) ;
    public final void rule__UseCaseStep__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2141:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:2142:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:2142:1: ( RULE_END )
            // InternalUseCaseDslParser.g:2143:2: RULE_END
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
    // InternalUseCaseDslParser.g:2153:1: rule__UseCaseStep__Group_2_6__0 : rule__UseCaseStep__Group_2_6__0__Impl rule__UseCaseStep__Group_2_6__1 ;
    public final void rule__UseCaseStep__Group_2_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2157:1: ( rule__UseCaseStep__Group_2_6__0__Impl rule__UseCaseStep__Group_2_6__1 )
            // InternalUseCaseDslParser.g:2158:2: rule__UseCaseStep__Group_2_6__0__Impl rule__UseCaseStep__Group_2_6__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:2165:1: rule__UseCaseStep__Group_2_6__0__Impl : ( ( ( rule__UseCaseStep__Group_2_6_0__0 ) ) ( ( rule__UseCaseStep__Group_2_6_0__0 )* ) ) ;
    public final void rule__UseCaseStep__Group_2_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2169:1: ( ( ( ( rule__UseCaseStep__Group_2_6_0__0 ) ) ( ( rule__UseCaseStep__Group_2_6_0__0 )* ) ) )
            // InternalUseCaseDslParser.g:2170:1: ( ( ( rule__UseCaseStep__Group_2_6_0__0 ) ) ( ( rule__UseCaseStep__Group_2_6_0__0 )* ) )
            {
            // InternalUseCaseDslParser.g:2170:1: ( ( ( rule__UseCaseStep__Group_2_6_0__0 ) ) ( ( rule__UseCaseStep__Group_2_6_0__0 )* ) )
            // InternalUseCaseDslParser.g:2171:2: ( ( rule__UseCaseStep__Group_2_6_0__0 ) ) ( ( rule__UseCaseStep__Group_2_6_0__0 )* )
            {
            // InternalUseCaseDslParser.g:2171:2: ( ( rule__UseCaseStep__Group_2_6_0__0 ) )
            // InternalUseCaseDslParser.g:2172:3: ( rule__UseCaseStep__Group_2_6_0__0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_2_6_0()); 
            // InternalUseCaseDslParser.g:2173:3: ( rule__UseCaseStep__Group_2_6_0__0 )
            // InternalUseCaseDslParser.g:2173:4: rule__UseCaseStep__Group_2_6_0__0
            {
            pushFollow(FOLLOW_13);
            rule__UseCaseStep__Group_2_6_0__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getGroup_2_6_0()); 

            }

            // InternalUseCaseDslParser.g:2176:2: ( ( rule__UseCaseStep__Group_2_6_0__0 )* )
            // InternalUseCaseDslParser.g:2177:3: ( rule__UseCaseStep__Group_2_6_0__0 )*
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_2_6_0()); 
            // InternalUseCaseDslParser.g:2178:3: ( rule__UseCaseStep__Group_2_6_0__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_INT) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==FullStop) ) {
                        int LA21_2 = input.LA(3);

                        if ( (LA21_2==RULE_INT) ) {
                            alt21=1;
                        }


                    }


                }


                switch (alt21) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:2178:4: rule__UseCaseStep__Group_2_6_0__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UseCaseStep__Group_2_6_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getUseCaseStepAccess().getGroup_2_6_0()); 

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
    // $ANTLR end "rule__UseCaseStep__Group_2_6__0__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_2_6__1"
    // InternalUseCaseDslParser.g:2187:1: rule__UseCaseStep__Group_2_6__1 : rule__UseCaseStep__Group_2_6__1__Impl ;
    public final void rule__UseCaseStep__Group_2_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2191:1: ( rule__UseCaseStep__Group_2_6__1__Impl )
            // InternalUseCaseDslParser.g:2192:2: rule__UseCaseStep__Group_2_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2_6__1__Impl();

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
    // InternalUseCaseDslParser.g:2198:1: rule__UseCaseStep__Group_2_6__1__Impl : ( ( rule__UseCaseStep__RepeatflowAssignment_2_6_1 ) ) ;
    public final void rule__UseCaseStep__Group_2_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2202:1: ( ( ( rule__UseCaseStep__RepeatflowAssignment_2_6_1 ) ) )
            // InternalUseCaseDslParser.g:2203:1: ( ( rule__UseCaseStep__RepeatflowAssignment_2_6_1 ) )
            {
            // InternalUseCaseDslParser.g:2203:1: ( ( rule__UseCaseStep__RepeatflowAssignment_2_6_1 ) )
            // InternalUseCaseDslParser.g:2204:2: ( rule__UseCaseStep__RepeatflowAssignment_2_6_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatflowAssignment_2_6_1()); 
            // InternalUseCaseDslParser.g:2205:2: ( rule__UseCaseStep__RepeatflowAssignment_2_6_1 )
            // InternalUseCaseDslParser.g:2205:3: rule__UseCaseStep__RepeatflowAssignment_2_6_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__RepeatflowAssignment_2_6_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getRepeatflowAssignment_2_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__UseCaseStep__Group_2_6_0__0"
    // InternalUseCaseDslParser.g:2214:1: rule__UseCaseStep__Group_2_6_0__0 : rule__UseCaseStep__Group_2_6_0__0__Impl rule__UseCaseStep__Group_2_6_0__1 ;
    public final void rule__UseCaseStep__Group_2_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2218:1: ( rule__UseCaseStep__Group_2_6_0__0__Impl rule__UseCaseStep__Group_2_6_0__1 )
            // InternalUseCaseDslParser.g:2219:2: rule__UseCaseStep__Group_2_6_0__0__Impl rule__UseCaseStep__Group_2_6_0__1
            {
            pushFollow(FOLLOW_16);
            rule__UseCaseStep__Group_2_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2_6_0__1();

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
    // $ANTLR end "rule__UseCaseStep__Group_2_6_0__0"


    // $ANTLR start "rule__UseCaseStep__Group_2_6_0__0__Impl"
    // InternalUseCaseDslParser.g:2226:1: rule__UseCaseStep__Group_2_6_0__0__Impl : ( ( rule__UseCaseStep__ParentAssignment_2_6_0_0 ) ) ;
    public final void rule__UseCaseStep__Group_2_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2230:1: ( ( ( rule__UseCaseStep__ParentAssignment_2_6_0_0 ) ) )
            // InternalUseCaseDslParser.g:2231:1: ( ( rule__UseCaseStep__ParentAssignment_2_6_0_0 ) )
            {
            // InternalUseCaseDslParser.g:2231:1: ( ( rule__UseCaseStep__ParentAssignment_2_6_0_0 ) )
            // InternalUseCaseDslParser.g:2232:2: ( rule__UseCaseStep__ParentAssignment_2_6_0_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentAssignment_2_6_0_0()); 
            // InternalUseCaseDslParser.g:2233:2: ( rule__UseCaseStep__ParentAssignment_2_6_0_0 )
            // InternalUseCaseDslParser.g:2233:3: rule__UseCaseStep__ParentAssignment_2_6_0_0
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__ParentAssignment_2_6_0_0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getParentAssignment_2_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2_6_0__0__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_2_6_0__1"
    // InternalUseCaseDslParser.g:2241:1: rule__UseCaseStep__Group_2_6_0__1 : rule__UseCaseStep__Group_2_6_0__1__Impl ;
    public final void rule__UseCaseStep__Group_2_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2245:1: ( rule__UseCaseStep__Group_2_6_0__1__Impl )
            // InternalUseCaseDslParser.g:2246:2: rule__UseCaseStep__Group_2_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2_6_0__1__Impl();

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
    // $ANTLR end "rule__UseCaseStep__Group_2_6_0__1"


    // $ANTLR start "rule__UseCaseStep__Group_2_6_0__1__Impl"
    // InternalUseCaseDslParser.g:2252:1: rule__UseCaseStep__Group_2_6_0__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_2_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2256:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2257:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2257:1: ( FullStop )
            // InternalUseCaseDslParser.g:2258:2: FullStop
            {
             before(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_6_0_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2_6_0__1__Impl"


    // $ANTLR start "rule__ExtensionStep__Group_0__0"
    // InternalUseCaseDslParser.g:2268:1: rule__ExtensionStep__Group_0__0 : rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1 ;
    public final void rule__ExtensionStep__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2272:1: ( rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1 )
            // InternalUseCaseDslParser.g:2273:2: rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalUseCaseDslParser.g:2280:1: rule__ExtensionStep__Group_0__0__Impl : ( ( rule__ExtensionStep__NameAssignment_0_0 ) ) ;
    public final void rule__ExtensionStep__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2284:1: ( ( ( rule__ExtensionStep__NameAssignment_0_0 ) ) )
            // InternalUseCaseDslParser.g:2285:1: ( ( rule__ExtensionStep__NameAssignment_0_0 ) )
            {
            // InternalUseCaseDslParser.g:2285:1: ( ( rule__ExtensionStep__NameAssignment_0_0 ) )
            // InternalUseCaseDslParser.g:2286:2: ( rule__ExtensionStep__NameAssignment_0_0 )
            {
             before(grammarAccess.getExtensionStepAccess().getNameAssignment_0_0()); 
            // InternalUseCaseDslParser.g:2287:2: ( rule__ExtensionStep__NameAssignment_0_0 )
            // InternalUseCaseDslParser.g:2287:3: rule__ExtensionStep__NameAssignment_0_0
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
    // InternalUseCaseDslParser.g:2295:1: rule__ExtensionStep__Group_0__1 : rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2 ;
    public final void rule__ExtensionStep__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2299:1: ( rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2 )
            // InternalUseCaseDslParser.g:2300:2: rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalUseCaseDslParser.g:2307:1: rule__ExtensionStep__Group_0__1__Impl : ( FullStop ) ;
    public final void rule__ExtensionStep__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2311:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2312:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2312:1: ( FullStop )
            // InternalUseCaseDslParser.g:2313:2: FullStop
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
    // InternalUseCaseDslParser.g:2322:1: rule__ExtensionStep__Group_0__2 : rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3 ;
    public final void rule__ExtensionStep__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2326:1: ( rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3 )
            // InternalUseCaseDslParser.g:2327:2: rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalUseCaseDslParser.g:2334:1: rule__ExtensionStep__Group_0__2__Impl : ( ( rule__ExtensionStep__Alternatives_0_2 )? ) ;
    public final void rule__ExtensionStep__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2338:1: ( ( ( rule__ExtensionStep__Alternatives_0_2 )? ) )
            // InternalUseCaseDslParser.g:2339:1: ( ( rule__ExtensionStep__Alternatives_0_2 )? )
            {
            // InternalUseCaseDslParser.g:2339:1: ( ( rule__ExtensionStep__Alternatives_0_2 )? )
            // InternalUseCaseDslParser.g:2340:2: ( rule__ExtensionStep__Alternatives_0_2 )?
            {
             before(grammarAccess.getExtensionStepAccess().getAlternatives_0_2()); 
            // InternalUseCaseDslParser.g:2341:2: ( rule__ExtensionStep__Alternatives_0_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=SYSTEM && LA22_0<=WHILE)||LA22_0==USER) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUseCaseDslParser.g:2341:3: rule__ExtensionStep__Alternatives_0_2
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
    // InternalUseCaseDslParser.g:2349:1: rule__ExtensionStep__Group_0__3 : rule__ExtensionStep__Group_0__3__Impl ;
    public final void rule__ExtensionStep__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2353:1: ( rule__ExtensionStep__Group_0__3__Impl )
            // InternalUseCaseDslParser.g:2354:2: rule__ExtensionStep__Group_0__3__Impl
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
    // InternalUseCaseDslParser.g:2360:1: rule__ExtensionStep__Group_0__3__Impl : ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) ) ;
    public final void rule__ExtensionStep__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2364:1: ( ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) ) )
            // InternalUseCaseDslParser.g:2365:1: ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) )
            {
            // InternalUseCaseDslParser.g:2365:1: ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) )
            // InternalUseCaseDslParser.g:2366:2: ( rule__ExtensionStep__SentenceAssignment_0_3 )
            {
             before(grammarAccess.getExtensionStepAccess().getSentenceAssignment_0_3()); 
            // InternalUseCaseDslParser.g:2367:2: ( rule__ExtensionStep__SentenceAssignment_0_3 )
            // InternalUseCaseDslParser.g:2367:3: rule__ExtensionStep__SentenceAssignment_0_3
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
    // InternalUseCaseDslParser.g:2376:1: rule__DeadEndStep__Group__0 : rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1 ;
    public final void rule__DeadEndStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2380:1: ( rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1 )
            // InternalUseCaseDslParser.g:2381:2: rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalUseCaseDslParser.g:2388:1: rule__DeadEndStep__Group__0__Impl : ( ( rule__DeadEndStep__NameAssignment_0 ) ) ;
    public final void rule__DeadEndStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2392:1: ( ( ( rule__DeadEndStep__NameAssignment_0 ) ) )
            // InternalUseCaseDslParser.g:2393:1: ( ( rule__DeadEndStep__NameAssignment_0 ) )
            {
            // InternalUseCaseDslParser.g:2393:1: ( ( rule__DeadEndStep__NameAssignment_0 ) )
            // InternalUseCaseDslParser.g:2394:2: ( rule__DeadEndStep__NameAssignment_0 )
            {
             before(grammarAccess.getDeadEndStepAccess().getNameAssignment_0()); 
            // InternalUseCaseDslParser.g:2395:2: ( rule__DeadEndStep__NameAssignment_0 )
            // InternalUseCaseDslParser.g:2395:3: rule__DeadEndStep__NameAssignment_0
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
    // InternalUseCaseDslParser.g:2403:1: rule__DeadEndStep__Group__1 : rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2 ;
    public final void rule__DeadEndStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2407:1: ( rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2 )
            // InternalUseCaseDslParser.g:2408:2: rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalUseCaseDslParser.g:2415:1: rule__DeadEndStep__Group__1__Impl : ( FullStop ) ;
    public final void rule__DeadEndStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2419:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2420:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2420:1: ( FullStop )
            // InternalUseCaseDslParser.g:2421:2: FullStop
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
    // InternalUseCaseDslParser.g:2430:1: rule__DeadEndStep__Group__2 : rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3 ;
    public final void rule__DeadEndStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2434:1: ( rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3 )
            // InternalUseCaseDslParser.g:2435:2: rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalUseCaseDslParser.g:2442:1: rule__DeadEndStep__Group__2__Impl : ( ( rule__DeadEndStep__Alternatives_2 )? ) ;
    public final void rule__DeadEndStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2446:1: ( ( ( rule__DeadEndStep__Alternatives_2 )? ) )
            // InternalUseCaseDslParser.g:2447:1: ( ( rule__DeadEndStep__Alternatives_2 )? )
            {
            // InternalUseCaseDslParser.g:2447:1: ( ( rule__DeadEndStep__Alternatives_2 )? )
            // InternalUseCaseDslParser.g:2448:2: ( rule__DeadEndStep__Alternatives_2 )?
            {
             before(grammarAccess.getDeadEndStepAccess().getAlternatives_2()); 
            // InternalUseCaseDslParser.g:2449:2: ( rule__DeadEndStep__Alternatives_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=SYSTEM && LA23_0<=WHILE)||LA23_0==USER) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUseCaseDslParser.g:2449:3: rule__DeadEndStep__Alternatives_2
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
    // InternalUseCaseDslParser.g:2457:1: rule__DeadEndStep__Group__3 : rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4 ;
    public final void rule__DeadEndStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2461:1: ( rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4 )
            // InternalUseCaseDslParser.g:2462:2: rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalUseCaseDslParser.g:2469:1: rule__DeadEndStep__Group__3__Impl : ( ( rule__DeadEndStep__SentenceAssignment_3 )? ) ;
    public final void rule__DeadEndStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2473:1: ( ( ( rule__DeadEndStep__SentenceAssignment_3 )? ) )
            // InternalUseCaseDslParser.g:2474:1: ( ( rule__DeadEndStep__SentenceAssignment_3 )? )
            {
            // InternalUseCaseDslParser.g:2474:1: ( ( rule__DeadEndStep__SentenceAssignment_3 )? )
            // InternalUseCaseDslParser.g:2475:2: ( rule__DeadEndStep__SentenceAssignment_3 )?
            {
             before(grammarAccess.getDeadEndStepAccess().getSentenceAssignment_3()); 
            // InternalUseCaseDslParser.g:2476:2: ( rule__DeadEndStep__SentenceAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=QuotationMark && LA24_0<=RULE_CHAR)||LA24_0==RULE_ID||LA24_0==RULE_ANY_OTHER) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCaseDslParser.g:2476:3: rule__DeadEndStep__SentenceAssignment_3
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
    // InternalUseCaseDslParser.g:2484:1: rule__DeadEndStep__Group__4 : rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5 ;
    public final void rule__DeadEndStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2488:1: ( rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5 )
            // InternalUseCaseDslParser.g:2489:2: rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalUseCaseDslParser.g:2496:1: rule__DeadEndStep__Group__4__Impl : ( UC ) ;
    public final void rule__DeadEndStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2500:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:2501:1: ( UC )
            {
            // InternalUseCaseDslParser.g:2501:1: ( UC )
            // InternalUseCaseDslParser.g:2502:2: UC
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
    // InternalUseCaseDslParser.g:2511:1: rule__DeadEndStep__Group__5 : rule__DeadEndStep__Group__5__Impl ;
    public final void rule__DeadEndStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2515:1: ( rule__DeadEndStep__Group__5__Impl )
            // InternalUseCaseDslParser.g:2516:2: rule__DeadEndStep__Group__5__Impl
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
    // InternalUseCaseDslParser.g:2522:1: rule__DeadEndStep__Group__5__Impl : ( END ) ;
    public final void rule__DeadEndStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2526:1: ( ( END ) )
            // InternalUseCaseDslParser.g:2527:1: ( END )
            {
            // InternalUseCaseDslParser.g:2527:1: ( END )
            // InternalUseCaseDslParser.g:2528:2: END
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
    // InternalUseCaseDslParser.g:2538:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2542:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalUseCaseDslParser.g:2543:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:2550:1: rule__Precondition__Group__0__Impl : ( ( rule__Precondition__NameAssignment_0 ) ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2554:1: ( ( ( rule__Precondition__NameAssignment_0 ) ) )
            // InternalUseCaseDslParser.g:2555:1: ( ( rule__Precondition__NameAssignment_0 ) )
            {
            // InternalUseCaseDslParser.g:2555:1: ( ( rule__Precondition__NameAssignment_0 ) )
            // InternalUseCaseDslParser.g:2556:2: ( rule__Precondition__NameAssignment_0 )
            {
             before(grammarAccess.getPreconditionAccess().getNameAssignment_0()); 
            // InternalUseCaseDslParser.g:2557:2: ( rule__Precondition__NameAssignment_0 )
            // InternalUseCaseDslParser.g:2557:3: rule__Precondition__NameAssignment_0
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
    // InternalUseCaseDslParser.g:2565:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl rule__Precondition__Group__2 ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2569:1: ( rule__Precondition__Group__1__Impl rule__Precondition__Group__2 )
            // InternalUseCaseDslParser.g:2570:2: rule__Precondition__Group__1__Impl rule__Precondition__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalUseCaseDslParser.g:2577:1: rule__Precondition__Group__1__Impl : ( Colon ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2581:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:2582:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:2582:1: ( Colon )
            // InternalUseCaseDslParser.g:2583:2: Colon
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
    // InternalUseCaseDslParser.g:2592:1: rule__Precondition__Group__2 : rule__Precondition__Group__2__Impl ;
    public final void rule__Precondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2596:1: ( rule__Precondition__Group__2__Impl )
            // InternalUseCaseDslParser.g:2597:2: rule__Precondition__Group__2__Impl
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
    // InternalUseCaseDslParser.g:2603:1: rule__Precondition__Group__2__Impl : ( ( rule__Precondition__ConditionAssignment_2 ) ) ;
    public final void rule__Precondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2607:1: ( ( ( rule__Precondition__ConditionAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:2608:1: ( ( rule__Precondition__ConditionAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:2608:1: ( ( rule__Precondition__ConditionAssignment_2 ) )
            // InternalUseCaseDslParser.g:2609:2: ( rule__Precondition__ConditionAssignment_2 )
            {
             before(grammarAccess.getPreconditionAccess().getConditionAssignment_2()); 
            // InternalUseCaseDslParser.g:2610:2: ( rule__Precondition__ConditionAssignment_2 )
            // InternalUseCaseDslParser.g:2610:3: rule__Precondition__ConditionAssignment_2
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
    // InternalUseCaseDslParser.g:2619:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2623:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalUseCaseDslParser.g:2624:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:2631:1: rule__Postcondition__Group__0__Impl : ( ( rule__Postcondition__NameAssignment_0 ) ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2635:1: ( ( ( rule__Postcondition__NameAssignment_0 ) ) )
            // InternalUseCaseDslParser.g:2636:1: ( ( rule__Postcondition__NameAssignment_0 ) )
            {
            // InternalUseCaseDslParser.g:2636:1: ( ( rule__Postcondition__NameAssignment_0 ) )
            // InternalUseCaseDslParser.g:2637:2: ( rule__Postcondition__NameAssignment_0 )
            {
             before(grammarAccess.getPostconditionAccess().getNameAssignment_0()); 
            // InternalUseCaseDslParser.g:2638:2: ( rule__Postcondition__NameAssignment_0 )
            // InternalUseCaseDslParser.g:2638:3: rule__Postcondition__NameAssignment_0
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
    // InternalUseCaseDslParser.g:2646:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2650:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalUseCaseDslParser.g:2651:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalUseCaseDslParser.g:2658:1: rule__Postcondition__Group__1__Impl : ( Colon ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2662:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:2663:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:2663:1: ( Colon )
            // InternalUseCaseDslParser.g:2664:2: Colon
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
    // InternalUseCaseDslParser.g:2673:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2677:1: ( rule__Postcondition__Group__2__Impl )
            // InternalUseCaseDslParser.g:2678:2: rule__Postcondition__Group__2__Impl
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
    // InternalUseCaseDslParser.g:2684:1: rule__Postcondition__Group__2__Impl : ( ( rule__Postcondition__ConditionAssignment_2 ) ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2688:1: ( ( ( rule__Postcondition__ConditionAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:2689:1: ( ( rule__Postcondition__ConditionAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:2689:1: ( ( rule__Postcondition__ConditionAssignment_2 ) )
            // InternalUseCaseDslParser.g:2690:2: ( rule__Postcondition__ConditionAssignment_2 )
            {
             before(grammarAccess.getPostconditionAccess().getConditionAssignment_2()); 
            // InternalUseCaseDslParser.g:2691:2: ( rule__Postcondition__ConditionAssignment_2 )
            // InternalUseCaseDslParser.g:2691:3: rule__Postcondition__ConditionAssignment_2
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


    // $ANTLR start "rule__UseCaseDocument__UsecaseAssignment"
    // InternalUseCaseDslParser.g:2700:1: rule__UseCaseDocument__UsecaseAssignment : ( ruleUseCase ) ;
    public final void rule__UseCaseDocument__UsecaseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2704:1: ( ( ruleUseCase ) )
            // InternalUseCaseDslParser.g:2705:2: ( ruleUseCase )
            {
            // InternalUseCaseDslParser.g:2705:2: ( ruleUseCase )
            // InternalUseCaseDslParser.g:2706:3: ruleUseCase
            {
             before(grammarAccess.getUseCaseDocumentAccess().getUsecaseUseCaseParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCase();

            state._fsp--;

             after(grammarAccess.getUseCaseDocumentAccess().getUsecaseUseCaseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDocument__UsecaseAssignment"


    // $ANTLR start "rule__UseCase__NumberAssignment_1"
    // InternalUseCaseDslParser.g:2715:1: rule__UseCase__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__UseCase__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2719:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:2720:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:2720:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:2721:3: RULE_INT
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
    // InternalUseCaseDslParser.g:2730:1: rule__UseCase__NameAssignment_3 : ( ruleLongName ) ;
    public final void rule__UseCase__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2734:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:2735:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:2735:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:2736:3: ruleLongName
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
    // InternalUseCaseDslParser.g:2745:1: rule__UseCase__PreconditionAssignment_4 : ( rulePrecondition ) ;
    public final void rule__UseCase__PreconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2749:1: ( ( rulePrecondition ) )
            // InternalUseCaseDslParser.g:2750:2: ( rulePrecondition )
            {
            // InternalUseCaseDslParser.g:2750:2: ( rulePrecondition )
            // InternalUseCaseDslParser.g:2751:3: rulePrecondition
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
    // InternalUseCaseDslParser.g:2760:1: rule__UseCase__PostconditionAssignment_5 : ( rulePostcondition ) ;
    public final void rule__UseCase__PostconditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2764:1: ( ( rulePostcondition ) )
            // InternalUseCaseDslParser.g:2765:2: ( rulePostcondition )
            {
            // InternalUseCaseDslParser.g:2765:2: ( rulePostcondition )
            // InternalUseCaseDslParser.g:2766:3: rulePostcondition
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


    // $ANTLR start "rule__UseCase__StepsAssignment_10"
    // InternalUseCaseDslParser.g:2775:1: rule__UseCase__StepsAssignment_10 : ( ruleUseCaseStep ) ;
    public final void rule__UseCase__StepsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2779:1: ( ( ruleUseCaseStep ) )
            // InternalUseCaseDslParser.g:2780:2: ( ruleUseCaseStep )
            {
            // InternalUseCaseDslParser.g:2780:2: ( ruleUseCaseStep )
            // InternalUseCaseDslParser.g:2781:3: ruleUseCaseStep
            {
             before(grammarAccess.getUseCaseAccess().getStepsUseCaseStepParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCaseStep();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getStepsUseCaseStepParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__StepsAssignment_10"


    // $ANTLR start "rule__UseCase__AlternativeflowsAssignment_12_3"
    // InternalUseCaseDslParser.g:2790:1: rule__UseCase__AlternativeflowsAssignment_12_3 : ( ruleExtension ) ;
    public final void rule__UseCase__AlternativeflowsAssignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2794:1: ( ( ruleExtension ) )
            // InternalUseCaseDslParser.g:2795:2: ( ruleExtension )
            {
            // InternalUseCaseDslParser.g:2795:2: ( ruleExtension )
            // InternalUseCaseDslParser.g:2796:3: ruleExtension
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsExtensionParserRuleCall_12_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExtension();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getAlternativeflowsExtensionParserRuleCall_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__AlternativeflowsAssignment_12_3"


    // $ANTLR start "rule__Extension__StartFromAssignment_0_0"
    // InternalUseCaseDslParser.g:2805:1: rule__Extension__StartFromAssignment_0_0 : ( ( ruleStepName ) ) ;
    public final void rule__Extension__StartFromAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2809:1: ( ( ( ruleStepName ) ) )
            // InternalUseCaseDslParser.g:2810:2: ( ( ruleStepName ) )
            {
            // InternalUseCaseDslParser.g:2810:2: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:2811:3: ( ruleStepName )
            {
             before(grammarAccess.getExtensionAccess().getStartFromStepCrossReference_0_0_0()); 
            // InternalUseCaseDslParser.g:2812:3: ( ruleStepName )
            // InternalUseCaseDslParser.g:2813:4: ruleStepName
            {
             before(grammarAccess.getExtensionAccess().getStartFromStepStepNameParserRuleCall_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getStartFromStepStepNameParserRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getExtensionAccess().getStartFromStepCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__StartFromAssignment_0_0"


    // $ANTLR start "rule__Extension__NameAssignment_1"
    // InternalUseCaseDslParser.g:2824:1: rule__Extension__NameAssignment_1 : ( RULE_CHAR ) ;
    public final void rule__Extension__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2828:1: ( ( RULE_CHAR ) )
            // InternalUseCaseDslParser.g:2829:2: ( RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:2829:2: ( RULE_CHAR )
            // InternalUseCaseDslParser.g:2830:3: RULE_CHAR
            {
             before(grammarAccess.getExtensionAccess().getNameCHARTerminalRuleCall_1_0()); 
            match(input,RULE_CHAR,FOLLOW_2); 
             after(grammarAccess.getExtensionAccess().getNameCHARTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__NameAssignment_1"


    // $ANTLR start "rule__Extension__ConditionAssignment_4"
    // InternalUseCaseDslParser.g:2839:1: rule__Extension__ConditionAssignment_4 : ( ruleCondition ) ;
    public final void rule__Extension__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2843:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:2844:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:2844:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:2845:3: ruleCondition
            {
             before(grammarAccess.getExtensionAccess().getConditionConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getConditionConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__ConditionAssignment_4"


    // $ANTLR start "rule__Extension__StepsAssignment_6"
    // InternalUseCaseDslParser.g:2854:1: rule__Extension__StepsAssignment_6 : ( ruleExtensionStep ) ;
    public final void rule__Extension__StepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2858:1: ( ( ruleExtensionStep ) )
            // InternalUseCaseDslParser.g:2859:2: ( ruleExtensionStep )
            {
            // InternalUseCaseDslParser.g:2859:2: ( ruleExtensionStep )
            // InternalUseCaseDslParser.g:2860:3: ruleExtensionStep
            {
             before(grammarAccess.getExtensionAccess().getStepsExtensionStepParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExtensionStep();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getStepsExtensionStepParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__StepsAssignment_6"


    // $ANTLR start "rule__Extension__ResumeAtAssignment_7_0_4_0"
    // InternalUseCaseDslParser.g:2869:1: rule__Extension__ResumeAtAssignment_7_0_4_0 : ( ruleStepName ) ;
    public final void rule__Extension__ResumeAtAssignment_7_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2873:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:2874:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:2874:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:2875:3: ruleStepName
            {
             before(grammarAccess.getExtensionAccess().getResumeAtStepNameParserRuleCall_7_0_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getResumeAtStepNameParserRuleCall_7_0_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__ResumeAtAssignment_7_0_4_0"


    // $ANTLR start "rule__Extension__EndAssignment_7_1"
    // InternalUseCaseDslParser.g:2884:1: rule__Extension__EndAssignment_7_1 : ( ruleDeadEndStep ) ;
    public final void rule__Extension__EndAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2888:1: ( ( ruleDeadEndStep ) )
            // InternalUseCaseDslParser.g:2889:2: ( ruleDeadEndStep )
            {
            // InternalUseCaseDslParser.g:2889:2: ( ruleDeadEndStep )
            // InternalUseCaseDslParser.g:2890:3: ruleDeadEndStep
            {
             before(grammarAccess.getExtensionAccess().getEndDeadEndStepParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeadEndStep();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getEndDeadEndStepParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__EndAssignment_7_1"


    // $ANTLR start "rule__UseCaseStep__NameAssignment_0_1"
    // InternalUseCaseDslParser.g:2899:1: rule__UseCaseStep__NameAssignment_0_1 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2903:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:2904:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:2904:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:2905:3: ruleStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_0_1_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2914:1: rule__UseCaseStep__SentenceAssignment_0_4 : ( ruleLongName ) ;
    public final void rule__UseCaseStep__SentenceAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2918:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:2919:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:2919:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:2920:3: ruleLongName
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
    // InternalUseCaseDslParser.g:2929:1: rule__UseCaseStep__NameAssignment_1_1 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2933:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:2934:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:2934:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:2935:3: ruleStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2944:1: rule__UseCaseStep__SentenceAssignment_1_4 : ( ruleLongName ) ;
    public final void rule__UseCaseStep__SentenceAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2948:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:2949:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:2949:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:2950:3: ruleLongName
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
    // InternalUseCaseDslParser.g:2959:1: rule__UseCaseStep__NameAssignment_2_1 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2963:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:2964:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:2964:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:2965:3: ruleStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2974:1: rule__UseCaseStep__RepeatingConditionAssignment_2_4 : ( ruleCondition ) ;
    public final void rule__UseCaseStep__RepeatingConditionAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2978:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:2979:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:2979:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:2980:3: ruleCondition
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


    // $ANTLR start "rule__UseCaseStep__ParentAssignment_2_6_0_0"
    // InternalUseCaseDslParser.g:2989:1: rule__UseCaseStep__ParentAssignment_2_6_0_0 : ( ( ruleStepName ) ) ;
    public final void rule__UseCaseStep__ParentAssignment_2_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2993:1: ( ( ( ruleStepName ) ) )
            // InternalUseCaseDslParser.g:2994:2: ( ( ruleStepName ) )
            {
            // InternalUseCaseDslParser.g:2994:2: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:2995:3: ( ruleStepName )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentStepCrossReference_2_6_0_0_0()); 
            // InternalUseCaseDslParser.g:2996:3: ( ruleStepName )
            // InternalUseCaseDslParser.g:2997:4: ruleStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getParentStepStepNameParserRuleCall_2_6_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getParentStepStepNameParserRuleCall_2_6_0_0_0_1()); 

            }

             after(grammarAccess.getUseCaseStepAccess().getParentStepCrossReference_2_6_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__ParentAssignment_2_6_0_0"


    // $ANTLR start "rule__UseCaseStep__RepeatflowAssignment_2_6_1"
    // InternalUseCaseDslParser.g:3008:1: rule__UseCaseStep__RepeatflowAssignment_2_6_1 : ( ruleUseCaseStep ) ;
    public final void rule__UseCaseStep__RepeatflowAssignment_2_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3012:1: ( ( ruleUseCaseStep ) )
            // InternalUseCaseDslParser.g:3013:2: ( ruleUseCaseStep )
            {
            // InternalUseCaseDslParser.g:3013:2: ( ruleUseCaseStep )
            // InternalUseCaseDslParser.g:3014:3: ruleUseCaseStep
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatflowUseCaseStepParserRuleCall_2_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCaseStep();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getRepeatflowUseCaseStepParserRuleCall_2_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__RepeatflowAssignment_2_6_1"


    // $ANTLR start "rule__ExtensionStep__NameAssignment_0_0"
    // InternalUseCaseDslParser.g:3023:1: rule__ExtensionStep__NameAssignment_0_0 : ( ruleStepName ) ;
    public final void rule__ExtensionStep__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3027:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3028:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3028:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3029:3: ruleStepName
            {
             before(grammarAccess.getExtensionStepAccess().getNameStepNameParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getExtensionStepAccess().getNameStepNameParserRuleCall_0_0_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:3038:1: rule__ExtensionStep__SentenceAssignment_0_3 : ( ruleLongName ) ;
    public final void rule__ExtensionStep__SentenceAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3042:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3043:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3043:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3044:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3053:1: rule__DeadEndStep__NameAssignment_0 : ( ruleStepName ) ;
    public final void rule__DeadEndStep__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3057:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3058:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3058:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3059:3: ruleStepName
            {
             before(grammarAccess.getDeadEndStepAccess().getNameStepNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getDeadEndStepAccess().getNameStepNameParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:3068:1: rule__DeadEndStep__SentenceAssignment_3 : ( ruleLongName ) ;
    public final void rule__DeadEndStep__SentenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3072:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3073:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3073:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3074:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3083:1: rule__Precondition__NameAssignment_0 : ( ( PRECONDITION ) ) ;
    public final void rule__Precondition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3087:1: ( ( ( PRECONDITION ) ) )
            // InternalUseCaseDslParser.g:3088:2: ( ( PRECONDITION ) )
            {
            // InternalUseCaseDslParser.g:3088:2: ( ( PRECONDITION ) )
            // InternalUseCaseDslParser.g:3089:3: ( PRECONDITION )
            {
             before(grammarAccess.getPreconditionAccess().getNamePRECONDITIONKeyword_0_0()); 
            // InternalUseCaseDslParser.g:3090:3: ( PRECONDITION )
            // InternalUseCaseDslParser.g:3091:4: PRECONDITION
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
    // InternalUseCaseDslParser.g:3102:1: rule__Precondition__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Precondition__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3106:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3107:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3107:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3108:3: ruleCondition
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
    // InternalUseCaseDslParser.g:3117:1: rule__Postcondition__NameAssignment_0 : ( ( POSTCONDITION ) ) ;
    public final void rule__Postcondition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3121:1: ( ( ( POSTCONDITION ) ) )
            // InternalUseCaseDslParser.g:3122:2: ( ( POSTCONDITION ) )
            {
            // InternalUseCaseDslParser.g:3122:2: ( ( POSTCONDITION ) )
            // InternalUseCaseDslParser.g:3123:3: ( POSTCONDITION )
            {
             before(grammarAccess.getPostconditionAccess().getNamePOSTCONDITIONKeyword_0_0()); 
            // InternalUseCaseDslParser.g:3124:3: ( POSTCONDITION )
            // InternalUseCaseDslParser.g:3125:4: POSTCONDITION
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
    // InternalUseCaseDslParser.g:3136:1: rule__Postcondition__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Postcondition__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3140:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3141:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3141:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3142:3: ruleCondition
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


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\6\uffff\7\25\1\uffff\7\25\1\uffff";
    static final String dfa_3s = "\1\33\1\25\1\10\12\22\1\uffff\7\22\1\uffff";
    static final String dfa_4s = "\1\33\1\25\13\40\1\uffff\7\40\1\uffff";
    static final String dfa_5s = "\15\uffff\1\2\7\uffff\1\1";
    static final String dfa_6s = "\26\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\4\1\5\2\uffff\1\3\5\uffff\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
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

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "417:1: rule__ExtensionStep__Alternatives : ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ruleDeadEndStep ) );";
        }
    }
    static final String dfa_8s = "\30\uffff";
    static final String dfa_9s = "\1\33\1\25\1\7\1\uffff\12\22\1\16\7\22\1\uffff\1\31";
    static final String dfa_10s = "\1\33\1\25\1\40\1\uffff\12\40\1\16\7\40\1\uffff\1\33";
    static final String dfa_11s = "\3\uffff\1\2\22\uffff\1\1\1\uffff";
    static final String dfa_12s = "\30\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2",
            "\1\3\1\5\1\6\2\uffff\1\4\5\uffff\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\27",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "",
            "\1\3\1\uffff\1\26"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1348:2: ( rule__Extension__StepsAssignment_6 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000104F80002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000104F92002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000104F80000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000104F92000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000104F81300L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000104FC1300L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000004000L});

}