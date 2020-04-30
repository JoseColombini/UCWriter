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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "POSTCONDITION", "PRECONDITION", "ALTERNATIVE", "INCLUDE", "RETURN", "SYSTEM", "WHILE", "FLOW", "MAIN", "USER", "AND", "END", "IF", "OR", "TO", "UC", "QuotationMark", "Apostrophe", "FullStop", "Colon", "RULE_CHAR", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int SYSTEM=9;
    public static final int RULE_END=26;
    public static final int RULE_BEGIN=25;
    public static final int PRECONDITION=5;
    public static final int RULE_STRING=29;
    public static final int FLOW=11;
    public static final int UC=19;
    public static final int QuotationMark=20;
    public static final int RULE_SL_COMMENT=31;
    public static final int RETURN=8;
    public static final int ALTERNATIVE=6;
    public static final int RULE_CHAR=24;
    public static final int MAIN=12;
    public static final int Colon=23;
    public static final int INCLUDE=7;
    public static final int EOF=-1;
    public static final int IF=16;
    public static final int Apostrophe=21;
    public static final int POSTCONDITION=4;
    public static final int FullStop=22;
    public static final int OR=17;
    public static final int RULE_ID=27;
    public static final int RULE_WS=32;
    public static final int RULE_ANY_OTHER=33;
    public static final int USER=13;
    public static final int RULE_INT=28;
    public static final int AND=14;
    public static final int RULE_ML_COMMENT=30;
    public static final int WHILE=10;
    public static final int END=15;
    public static final int TO=18;

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
    		tokenNameToValue.put("INCLUDE", "'INCLUDE'");
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
    // InternalUseCaseDslParser.g:75:1: entryRuleUseCaseDocument : ruleUseCaseDocument EOF ;
    public final void entryRuleUseCaseDocument() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:76:1: ( ruleUseCaseDocument EOF )
            // InternalUseCaseDslParser.g:77:1: ruleUseCaseDocument EOF
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
    // InternalUseCaseDslParser.g:84:1: ruleUseCaseDocument : ( ( ( rule__UseCaseDocument__UsecaseAssignment ) ) ( ( rule__UseCaseDocument__UsecaseAssignment )* ) ) ;
    public final void ruleUseCaseDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:88:2: ( ( ( ( rule__UseCaseDocument__UsecaseAssignment ) ) ( ( rule__UseCaseDocument__UsecaseAssignment )* ) ) )
            // InternalUseCaseDslParser.g:89:2: ( ( ( rule__UseCaseDocument__UsecaseAssignment ) ) ( ( rule__UseCaseDocument__UsecaseAssignment )* ) )
            {
            // InternalUseCaseDslParser.g:89:2: ( ( ( rule__UseCaseDocument__UsecaseAssignment ) ) ( ( rule__UseCaseDocument__UsecaseAssignment )* ) )
            // InternalUseCaseDslParser.g:90:3: ( ( rule__UseCaseDocument__UsecaseAssignment ) ) ( ( rule__UseCaseDocument__UsecaseAssignment )* )
            {
            // InternalUseCaseDslParser.g:90:3: ( ( rule__UseCaseDocument__UsecaseAssignment ) )
            // InternalUseCaseDslParser.g:91:4: ( rule__UseCaseDocument__UsecaseAssignment )
            {
             before(grammarAccess.getUseCaseDocumentAccess().getUsecaseAssignment()); 
            // InternalUseCaseDslParser.g:92:4: ( rule__UseCaseDocument__UsecaseAssignment )
            // InternalUseCaseDslParser.g:92:5: rule__UseCaseDocument__UsecaseAssignment
            {
            pushFollow(FOLLOW_3);
            rule__UseCaseDocument__UsecaseAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseDocumentAccess().getUsecaseAssignment()); 

            }

            // InternalUseCaseDslParser.g:95:3: ( ( rule__UseCaseDocument__UsecaseAssignment )* )
            // InternalUseCaseDslParser.g:96:4: ( rule__UseCaseDocument__UsecaseAssignment )*
            {
             before(grammarAccess.getUseCaseDocumentAccess().getUsecaseAssignment()); 
            // InternalUseCaseDslParser.g:97:4: ( rule__UseCaseDocument__UsecaseAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==UC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:97:5: rule__UseCaseDocument__UsecaseAssignment
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
    // InternalUseCaseDslParser.g:107:1: entryRuleUseCase : ruleUseCase EOF ;
    public final void entryRuleUseCase() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:108:1: ( ruleUseCase EOF )
            // InternalUseCaseDslParser.g:109:1: ruleUseCase EOF
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
    // InternalUseCaseDslParser.g:116:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
    public final void ruleUseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:120:2: ( ( ( rule__UseCase__Group__0 ) ) )
            // InternalUseCaseDslParser.g:121:2: ( ( rule__UseCase__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:121:2: ( ( rule__UseCase__Group__0 ) )
            // InternalUseCaseDslParser.g:122:3: ( rule__UseCase__Group__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup()); 
            // InternalUseCaseDslParser.g:123:3: ( rule__UseCase__Group__0 )
            // InternalUseCaseDslParser.g:123:4: rule__UseCase__Group__0
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
    // InternalUseCaseDslParser.g:132:1: entryRuleExtension : ruleExtension EOF ;
    public final void entryRuleExtension() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:133:1: ( ruleExtension EOF )
            // InternalUseCaseDslParser.g:134:1: ruleExtension EOF
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
    // InternalUseCaseDslParser.g:141:1: ruleExtension : ( ( rule__Extension__Group__0 ) ) ;
    public final void ruleExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:145:2: ( ( ( rule__Extension__Group__0 ) ) )
            // InternalUseCaseDslParser.g:146:2: ( ( rule__Extension__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:146:2: ( ( rule__Extension__Group__0 ) )
            // InternalUseCaseDslParser.g:147:3: ( rule__Extension__Group__0 )
            {
             before(grammarAccess.getExtensionAccess().getGroup()); 
            // InternalUseCaseDslParser.g:148:3: ( rule__Extension__Group__0 )
            // InternalUseCaseDslParser.g:148:4: rule__Extension__Group__0
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
    // InternalUseCaseDslParser.g:157:1: entryRuleUseCaseStep : ruleUseCaseStep EOF ;
    public final void entryRuleUseCaseStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:158:1: ( ruleUseCaseStep EOF )
            // InternalUseCaseDslParser.g:159:1: ruleUseCaseStep EOF
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
    // InternalUseCaseDslParser.g:166:1: ruleUseCaseStep : ( ( rule__UseCaseStep__Alternatives ) ) ;
    public final void ruleUseCaseStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:170:2: ( ( ( rule__UseCaseStep__Alternatives ) ) )
            // InternalUseCaseDslParser.g:171:2: ( ( rule__UseCaseStep__Alternatives ) )
            {
            // InternalUseCaseDslParser.g:171:2: ( ( rule__UseCaseStep__Alternatives ) )
            // InternalUseCaseDslParser.g:172:3: ( rule__UseCaseStep__Alternatives )
            {
             before(grammarAccess.getUseCaseStepAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:173:3: ( rule__UseCaseStep__Alternatives )
            // InternalUseCaseDslParser.g:173:4: rule__UseCaseStep__Alternatives
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
    // InternalUseCaseDslParser.g:182:1: entryRuleExtensionStep : ruleExtensionStep EOF ;
    public final void entryRuleExtensionStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:183:1: ( ruleExtensionStep EOF )
            // InternalUseCaseDslParser.g:184:1: ruleExtensionStep EOF
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
    // InternalUseCaseDslParser.g:191:1: ruleExtensionStep : ( ( rule__ExtensionStep__Alternatives ) ) ;
    public final void ruleExtensionStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:195:2: ( ( ( rule__ExtensionStep__Alternatives ) ) )
            // InternalUseCaseDslParser.g:196:2: ( ( rule__ExtensionStep__Alternatives ) )
            {
            // InternalUseCaseDslParser.g:196:2: ( ( rule__ExtensionStep__Alternatives ) )
            // InternalUseCaseDslParser.g:197:3: ( rule__ExtensionStep__Alternatives )
            {
             before(grammarAccess.getExtensionStepAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:198:3: ( rule__ExtensionStep__Alternatives )
            // InternalUseCaseDslParser.g:198:4: rule__ExtensionStep__Alternatives
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
    // InternalUseCaseDslParser.g:207:1: entryRuleDeadEndStep : ruleDeadEndStep EOF ;
    public final void entryRuleDeadEndStep() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:208:1: ( ruleDeadEndStep EOF )
            // InternalUseCaseDslParser.g:209:1: ruleDeadEndStep EOF
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
    // InternalUseCaseDslParser.g:216:1: ruleDeadEndStep : ( ( rule__DeadEndStep__Group__0 ) ) ;
    public final void ruleDeadEndStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:220:2: ( ( ( rule__DeadEndStep__Group__0 ) ) )
            // InternalUseCaseDslParser.g:221:2: ( ( rule__DeadEndStep__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:221:2: ( ( rule__DeadEndStep__Group__0 ) )
            // InternalUseCaseDslParser.g:222:3: ( rule__DeadEndStep__Group__0 )
            {
             before(grammarAccess.getDeadEndStepAccess().getGroup()); 
            // InternalUseCaseDslParser.g:223:3: ( rule__DeadEndStep__Group__0 )
            // InternalUseCaseDslParser.g:223:4: rule__DeadEndStep__Group__0
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
    // InternalUseCaseDslParser.g:232:1: entryRulePrecondition : rulePrecondition EOF ;
    public final void entryRulePrecondition() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:233:1: ( rulePrecondition EOF )
            // InternalUseCaseDslParser.g:234:1: rulePrecondition EOF
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
    // InternalUseCaseDslParser.g:241:1: rulePrecondition : ( ( rule__Precondition__Group__0 ) ) ;
    public final void rulePrecondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:245:2: ( ( ( rule__Precondition__Group__0 ) ) )
            // InternalUseCaseDslParser.g:246:2: ( ( rule__Precondition__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:246:2: ( ( rule__Precondition__Group__0 ) )
            // InternalUseCaseDslParser.g:247:3: ( rule__Precondition__Group__0 )
            {
             before(grammarAccess.getPreconditionAccess().getGroup()); 
            // InternalUseCaseDslParser.g:248:3: ( rule__Precondition__Group__0 )
            // InternalUseCaseDslParser.g:248:4: rule__Precondition__Group__0
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
    // InternalUseCaseDslParser.g:257:1: entryRulePostcondition : rulePostcondition EOF ;
    public final void entryRulePostcondition() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:258:1: ( rulePostcondition EOF )
            // InternalUseCaseDslParser.g:259:1: rulePostcondition EOF
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
    // InternalUseCaseDslParser.g:266:1: rulePostcondition : ( ( rule__Postcondition__Group__0 ) ) ;
    public final void rulePostcondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:270:2: ( ( ( rule__Postcondition__Group__0 ) ) )
            // InternalUseCaseDslParser.g:271:2: ( ( rule__Postcondition__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:271:2: ( ( rule__Postcondition__Group__0 ) )
            // InternalUseCaseDslParser.g:272:3: ( rule__Postcondition__Group__0 )
            {
             before(grammarAccess.getPostconditionAccess().getGroup()); 
            // InternalUseCaseDslParser.g:273:3: ( rule__Postcondition__Group__0 )
            // InternalUseCaseDslParser.g:273:4: rule__Postcondition__Group__0
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
    // InternalUseCaseDslParser.g:282:1: entryRuleLongName : ruleLongName EOF ;
    public final void entryRuleLongName() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:283:1: ( ruleLongName EOF )
            // InternalUseCaseDslParser.g:284:1: ruleLongName EOF
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
    // InternalUseCaseDslParser.g:291:1: ruleLongName : ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) ) ;
    public final void ruleLongName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:295:2: ( ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) ) )
            // InternalUseCaseDslParser.g:296:2: ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) )
            {
            // InternalUseCaseDslParser.g:296:2: ( ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* ) )
            // InternalUseCaseDslParser.g:297:3: ( ( rule__LongName__Alternatives ) ) ( ( rule__LongName__Alternatives )* )
            {
            // InternalUseCaseDslParser.g:297:3: ( ( rule__LongName__Alternatives ) )
            // InternalUseCaseDslParser.g:298:4: ( rule__LongName__Alternatives )
            {
             before(grammarAccess.getLongNameAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:299:4: ( rule__LongName__Alternatives )
            // InternalUseCaseDslParser.g:299:5: rule__LongName__Alternatives
            {
            pushFollow(FOLLOW_4);
            rule__LongName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLongNameAccess().getAlternatives()); 

            }

            // InternalUseCaseDslParser.g:302:3: ( ( rule__LongName__Alternatives )* )
            // InternalUseCaseDslParser.g:303:4: ( rule__LongName__Alternatives )*
            {
             before(grammarAccess.getLongNameAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:304:4: ( rule__LongName__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=QuotationMark && LA2_0<=RULE_CHAR)||LA2_0==RULE_ID||LA2_0==RULE_ANY_OTHER) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:304:5: rule__LongName__Alternatives
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
    // InternalUseCaseDslParser.g:314:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:315:1: ( ruleCondition EOF )
            // InternalUseCaseDslParser.g:316:1: ruleCondition EOF
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
    // InternalUseCaseDslParser.g:323:1: ruleCondition : ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:327:2: ( ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) ) )
            // InternalUseCaseDslParser.g:328:2: ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) )
            {
            // InternalUseCaseDslParser.g:328:2: ( ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* ) )
            // InternalUseCaseDslParser.g:329:3: ( ( rule__Condition__Alternatives ) ) ( ( rule__Condition__Alternatives )* )
            {
            // InternalUseCaseDslParser.g:329:3: ( ( rule__Condition__Alternatives ) )
            // InternalUseCaseDslParser.g:330:4: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:331:4: ( rule__Condition__Alternatives )
            // InternalUseCaseDslParser.g:331:5: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_5);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }

            // InternalUseCaseDslParser.g:334:3: ( ( rule__Condition__Alternatives )* )
            // InternalUseCaseDslParser.g:335:4: ( rule__Condition__Alternatives )*
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalUseCaseDslParser.g:336:4: ( rule__Condition__Alternatives )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AND||LA3_0==OR||(LA3_0>=QuotationMark && LA3_0<=RULE_CHAR)||LA3_0==RULE_ID||LA3_0==RULE_ANY_OTHER) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:336:5: rule__Condition__Alternatives
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
    // InternalUseCaseDslParser.g:346:1: entryRuleStepName : ruleStepName EOF ;
    public final void entryRuleStepName() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:347:1: ( ruleStepName EOF )
            // InternalUseCaseDslParser.g:348:1: ruleStepName EOF
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
    // InternalUseCaseDslParser.g:355:1: ruleStepName : ( RULE_INT ) ;
    public final void ruleStepName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:359:2: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:360:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:360:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:361:3: RULE_INT
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
    // InternalUseCaseDslParser.g:370:1: rule__Extension__Alternatives_7 : ( ( ( rule__Extension__Group_7_0__0 ) ) | ( ( rule__Extension__EndAssignment_7_1 ) ) );
    public final void rule__Extension__Alternatives_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:374:1: ( ( ( rule__Extension__Group_7_0__0 ) ) | ( ( rule__Extension__EndAssignment_7_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==FullStop) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==RETURN) ) {
                        alt4=1;
                    }
                    else if ( ((LA4_2>=SYSTEM && LA4_2<=WHILE)||LA4_2==USER||(LA4_2>=UC && LA4_2<=RULE_CHAR)||LA4_2==RULE_ID||LA4_2==RULE_ANY_OTHER) ) {
                        alt4=2;
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
                    // InternalUseCaseDslParser.g:375:2: ( ( rule__Extension__Group_7_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:375:2: ( ( rule__Extension__Group_7_0__0 ) )
                    // InternalUseCaseDslParser.g:376:3: ( rule__Extension__Group_7_0__0 )
                    {
                     before(grammarAccess.getExtensionAccess().getGroup_7_0()); 
                    // InternalUseCaseDslParser.g:377:3: ( rule__Extension__Group_7_0__0 )
                    // InternalUseCaseDslParser.g:377:4: rule__Extension__Group_7_0__0
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
                    // InternalUseCaseDslParser.g:381:2: ( ( rule__Extension__EndAssignment_7_1 ) )
                    {
                    // InternalUseCaseDslParser.g:381:2: ( ( rule__Extension__EndAssignment_7_1 ) )
                    // InternalUseCaseDslParser.g:382:3: ( rule__Extension__EndAssignment_7_1 )
                    {
                     before(grammarAccess.getExtensionAccess().getEndAssignment_7_1()); 
                    // InternalUseCaseDslParser.g:383:3: ( rule__Extension__EndAssignment_7_1 )
                    // InternalUseCaseDslParser.g:383:4: rule__Extension__EndAssignment_7_1
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
    // InternalUseCaseDslParser.g:391:1: rule__UseCaseStep__Alternatives : ( ( ( rule__UseCaseStep__Group_0__0 ) ) | ( ( rule__UseCaseStep__Group_1__0 ) ) | ( ( rule__UseCaseStep__Group_2__0 ) ) | ( ( rule__UseCaseStep__Group_3__0 ) ) );
    public final void rule__UseCaseStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:395:1: ( ( ( rule__UseCaseStep__Group_0__0 ) ) | ( ( rule__UseCaseStep__Group_1__0 ) ) | ( ( rule__UseCaseStep__Group_2__0 ) ) | ( ( rule__UseCaseStep__Group_3__0 ) ) )
            int alt5=4;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==FullStop) ) {
                    switch ( input.LA(3) ) {
                    case WHILE:
                        {
                        alt5=4;
                        }
                        break;
                    case INCLUDE:
                        {
                        alt5=1;
                        }
                        break;
                    case USER:
                        {
                        alt5=2;
                        }
                        break;
                    case SYSTEM:
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
                    // InternalUseCaseDslParser.g:396:2: ( ( rule__UseCaseStep__Group_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:396:2: ( ( rule__UseCaseStep__Group_0__0 ) )
                    // InternalUseCaseDslParser.g:397:3: ( rule__UseCaseStep__Group_0__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_0()); 
                    // InternalUseCaseDslParser.g:398:3: ( rule__UseCaseStep__Group_0__0 )
                    // InternalUseCaseDslParser.g:398:4: rule__UseCaseStep__Group_0__0
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
                    // InternalUseCaseDslParser.g:402:2: ( ( rule__UseCaseStep__Group_1__0 ) )
                    {
                    // InternalUseCaseDslParser.g:402:2: ( ( rule__UseCaseStep__Group_1__0 ) )
                    // InternalUseCaseDslParser.g:403:3: ( rule__UseCaseStep__Group_1__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_1()); 
                    // InternalUseCaseDslParser.g:404:3: ( rule__UseCaseStep__Group_1__0 )
                    // InternalUseCaseDslParser.g:404:4: rule__UseCaseStep__Group_1__0
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
                    // InternalUseCaseDslParser.g:408:2: ( ( rule__UseCaseStep__Group_2__0 ) )
                    {
                    // InternalUseCaseDslParser.g:408:2: ( ( rule__UseCaseStep__Group_2__0 ) )
                    // InternalUseCaseDslParser.g:409:3: ( rule__UseCaseStep__Group_2__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_2()); 
                    // InternalUseCaseDslParser.g:410:3: ( rule__UseCaseStep__Group_2__0 )
                    // InternalUseCaseDslParser.g:410:4: rule__UseCaseStep__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCaseStep__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUseCaseStepAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:414:2: ( ( rule__UseCaseStep__Group_3__0 ) )
                    {
                    // InternalUseCaseDslParser.g:414:2: ( ( rule__UseCaseStep__Group_3__0 ) )
                    // InternalUseCaseDslParser.g:415:3: ( rule__UseCaseStep__Group_3__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_3()); 
                    // InternalUseCaseDslParser.g:416:3: ( rule__UseCaseStep__Group_3__0 )
                    // InternalUseCaseDslParser.g:416:4: rule__UseCaseStep__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCaseStep__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUseCaseStepAccess().getGroup_3()); 

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
    // InternalUseCaseDslParser.g:424:1: rule__ExtensionStep__Alternatives : ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ruleDeadEndStep ) );
    public final void rule__ExtensionStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:428:1: ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ruleDeadEndStep ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalUseCaseDslParser.g:429:2: ( ( rule__ExtensionStep__Group_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:429:2: ( ( rule__ExtensionStep__Group_0__0 ) )
                    // InternalUseCaseDslParser.g:430:3: ( rule__ExtensionStep__Group_0__0 )
                    {
                     before(grammarAccess.getExtensionStepAccess().getGroup_0()); 
                    // InternalUseCaseDslParser.g:431:3: ( rule__ExtensionStep__Group_0__0 )
                    // InternalUseCaseDslParser.g:431:4: rule__ExtensionStep__Group_0__0
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
                    // InternalUseCaseDslParser.g:435:2: ( ruleDeadEndStep )
                    {
                    // InternalUseCaseDslParser.g:435:2: ( ruleDeadEndStep )
                    // InternalUseCaseDslParser.g:436:3: ruleDeadEndStep
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
    // InternalUseCaseDslParser.g:445:1: rule__ExtensionStep__Alternatives_0_2 : ( ( USER ) | ( SYSTEM ) | ( WHILE ) );
    public final void rule__ExtensionStep__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:449:1: ( ( USER ) | ( SYSTEM ) | ( WHILE ) )
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
                    // InternalUseCaseDslParser.g:450:2: ( USER )
                    {
                    // InternalUseCaseDslParser.g:450:2: ( USER )
                    // InternalUseCaseDslParser.g:451:3: USER
                    {
                     before(grammarAccess.getExtensionStepAccess().getUSERKeyword_0_2_0()); 
                    match(input,USER,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getUSERKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:456:2: ( SYSTEM )
                    {
                    // InternalUseCaseDslParser.g:456:2: ( SYSTEM )
                    // InternalUseCaseDslParser.g:457:3: SYSTEM
                    {
                     before(grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_0_2_1()); 
                    match(input,SYSTEM,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_0_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:462:2: ( WHILE )
                    {
                    // InternalUseCaseDslParser.g:462:2: ( WHILE )
                    // InternalUseCaseDslParser.g:463:3: WHILE
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
    // InternalUseCaseDslParser.g:472:1: rule__DeadEndStep__Alternatives_2 : ( ( USER ) | ( SYSTEM ) | ( WHILE ) );
    public final void rule__DeadEndStep__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:476:1: ( ( USER ) | ( SYSTEM ) | ( WHILE ) )
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
                    // InternalUseCaseDslParser.g:477:2: ( USER )
                    {
                    // InternalUseCaseDslParser.g:477:2: ( USER )
                    // InternalUseCaseDslParser.g:478:3: USER
                    {
                     before(grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0()); 
                    match(input,USER,FOLLOW_2); 
                     after(grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:483:2: ( SYSTEM )
                    {
                    // InternalUseCaseDslParser.g:483:2: ( SYSTEM )
                    // InternalUseCaseDslParser.g:484:3: SYSTEM
                    {
                     before(grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1()); 
                    match(input,SYSTEM,FOLLOW_2); 
                     after(grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:489:2: ( WHILE )
                    {
                    // InternalUseCaseDslParser.g:489:2: ( WHILE )
                    // InternalUseCaseDslParser.g:490:3: WHILE
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
    // InternalUseCaseDslParser.g:499:1: rule__LongName__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) );
    public final void rule__LongName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:503:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) )
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
                    // InternalUseCaseDslParser.g:504:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:504:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:505:3: RULE_ID
                    {
                     before(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:510:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:510:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:511:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:516:2: ( RULE_CHAR )
                    {
                    // InternalUseCaseDslParser.g:516:2: ( RULE_CHAR )
                    // InternalUseCaseDslParser.g:517:3: RULE_CHAR
                    {
                     before(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2()); 
                    match(input,RULE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:522:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:522:2: ( Colon )
                    // InternalUseCaseDslParser.g:523:3: Colon
                    {
                     before(grammarAccess.getLongNameAccess().getColonKeyword_3()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:528:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:528:2: ( FullStop )
                    // InternalUseCaseDslParser.g:529:3: FullStop
                    {
                     before(grammarAccess.getLongNameAccess().getFullStopKeyword_4()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUseCaseDslParser.g:534:2: ( QuotationMark )
                    {
                    // InternalUseCaseDslParser.g:534:2: ( QuotationMark )
                    // InternalUseCaseDslParser.g:535:3: QuotationMark
                    {
                     before(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5()); 
                    match(input,QuotationMark,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUseCaseDslParser.g:540:2: ( Apostrophe )
                    {
                    // InternalUseCaseDslParser.g:540:2: ( Apostrophe )
                    // InternalUseCaseDslParser.g:541:3: Apostrophe
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
    // InternalUseCaseDslParser.g:550:1: rule__Condition__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) | ( AND ) | ( OR ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:554:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) | ( AND ) | ( OR ) )
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
                    // InternalUseCaseDslParser.g:555:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:555:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:556:3: RULE_ID
                    {
                     before(grammarAccess.getConditionAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:561:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:561:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:562:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:567:2: ( RULE_CHAR )
                    {
                    // InternalUseCaseDslParser.g:567:2: ( RULE_CHAR )
                    // InternalUseCaseDslParser.g:568:3: RULE_CHAR
                    {
                     before(grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2()); 
                    match(input,RULE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:573:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:573:2: ( Colon )
                    // InternalUseCaseDslParser.g:574:3: Colon
                    {
                     before(grammarAccess.getConditionAccess().getColonKeyword_3()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:579:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:579:2: ( FullStop )
                    // InternalUseCaseDslParser.g:580:3: FullStop
                    {
                     before(grammarAccess.getConditionAccess().getFullStopKeyword_4()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUseCaseDslParser.g:585:2: ( QuotationMark )
                    {
                    // InternalUseCaseDslParser.g:585:2: ( QuotationMark )
                    // InternalUseCaseDslParser.g:586:3: QuotationMark
                    {
                     before(grammarAccess.getConditionAccess().getQuotationMarkKeyword_5()); 
                    match(input,QuotationMark,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getQuotationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUseCaseDslParser.g:591:2: ( Apostrophe )
                    {
                    // InternalUseCaseDslParser.g:591:2: ( Apostrophe )
                    // InternalUseCaseDslParser.g:592:3: Apostrophe
                    {
                     before(grammarAccess.getConditionAccess().getApostropheKeyword_6()); 
                    match(input,Apostrophe,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getApostropheKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUseCaseDslParser.g:597:2: ( AND )
                    {
                    // InternalUseCaseDslParser.g:597:2: ( AND )
                    // InternalUseCaseDslParser.g:598:3: AND
                    {
                     before(grammarAccess.getConditionAccess().getANDKeyword_7()); 
                    match(input,AND,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getANDKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUseCaseDslParser.g:603:2: ( OR )
                    {
                    // InternalUseCaseDslParser.g:603:2: ( OR )
                    // InternalUseCaseDslParser.g:604:3: OR
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
    // InternalUseCaseDslParser.g:613:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:617:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCaseDslParser.g:618:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
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
    // InternalUseCaseDslParser.g:625:1: rule__UseCase__Group__0__Impl : ( UC ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:629:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:630:1: ( UC )
            {
            // InternalUseCaseDslParser.g:630:1: ( UC )
            // InternalUseCaseDslParser.g:631:2: UC
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
    // InternalUseCaseDslParser.g:640:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:644:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCaseDslParser.g:645:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
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
    // InternalUseCaseDslParser.g:652:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NumberAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:656:1: ( ( ( rule__UseCase__NumberAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:657:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:657:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            // InternalUseCaseDslParser.g:658:2: ( rule__UseCase__NumberAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNumberAssignment_1()); 
            // InternalUseCaseDslParser.g:659:2: ( rule__UseCase__NumberAssignment_1 )
            // InternalUseCaseDslParser.g:659:3: rule__UseCase__NumberAssignment_1
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
    // InternalUseCaseDslParser.g:667:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:671:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCaseDslParser.g:672:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
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
    // InternalUseCaseDslParser.g:679:1: rule__UseCase__Group__2__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:683:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:684:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:684:1: ( Colon )
            // InternalUseCaseDslParser.g:685:2: Colon
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
    // InternalUseCaseDslParser.g:694:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:698:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCaseDslParser.g:699:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
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
    // InternalUseCaseDslParser.g:706:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__NameAssignment_3 ) ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:710:1: ( ( ( rule__UseCase__NameAssignment_3 ) ) )
            // InternalUseCaseDslParser.g:711:1: ( ( rule__UseCase__NameAssignment_3 ) )
            {
            // InternalUseCaseDslParser.g:711:1: ( ( rule__UseCase__NameAssignment_3 ) )
            // InternalUseCaseDslParser.g:712:2: ( rule__UseCase__NameAssignment_3 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_3()); 
            // InternalUseCaseDslParser.g:713:2: ( rule__UseCase__NameAssignment_3 )
            // InternalUseCaseDslParser.g:713:3: rule__UseCase__NameAssignment_3
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
    // InternalUseCaseDslParser.g:721:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:725:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCaseDslParser.g:726:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
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
    // InternalUseCaseDslParser.g:733:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__PreconditionAssignment_4 )? ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:737:1: ( ( ( rule__UseCase__PreconditionAssignment_4 )? ) )
            // InternalUseCaseDslParser.g:738:1: ( ( rule__UseCase__PreconditionAssignment_4 )? )
            {
            // InternalUseCaseDslParser.g:738:1: ( ( rule__UseCase__PreconditionAssignment_4 )? )
            // InternalUseCaseDslParser.g:739:2: ( rule__UseCase__PreconditionAssignment_4 )?
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionAssignment_4()); 
            // InternalUseCaseDslParser.g:740:2: ( rule__UseCase__PreconditionAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==PRECONDITION) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCaseDslParser.g:740:3: rule__UseCase__PreconditionAssignment_4
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
    // InternalUseCaseDslParser.g:748:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:752:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCaseDslParser.g:753:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
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
    // InternalUseCaseDslParser.g:760:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__PostconditionAssignment_5 )? ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:764:1: ( ( ( rule__UseCase__PostconditionAssignment_5 )? ) )
            // InternalUseCaseDslParser.g:765:1: ( ( rule__UseCase__PostconditionAssignment_5 )? )
            {
            // InternalUseCaseDslParser.g:765:1: ( ( rule__UseCase__PostconditionAssignment_5 )? )
            // InternalUseCaseDslParser.g:766:2: ( rule__UseCase__PostconditionAssignment_5 )?
            {
             before(grammarAccess.getUseCaseAccess().getPostconditionAssignment_5()); 
            // InternalUseCaseDslParser.g:767:2: ( rule__UseCase__PostconditionAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==POSTCONDITION) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUseCaseDslParser.g:767:3: rule__UseCase__PostconditionAssignment_5
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
    // InternalUseCaseDslParser.g:775:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:779:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCaseDslParser.g:780:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
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
    // InternalUseCaseDslParser.g:787:1: rule__UseCase__Group__6__Impl : ( MAIN ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:791:1: ( ( MAIN ) )
            // InternalUseCaseDslParser.g:792:1: ( MAIN )
            {
            // InternalUseCaseDslParser.g:792:1: ( MAIN )
            // InternalUseCaseDslParser.g:793:2: MAIN
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
    // InternalUseCaseDslParser.g:802:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:806:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCaseDslParser.g:807:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
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
    // InternalUseCaseDslParser.g:814:1: rule__UseCase__Group__7__Impl : ( FLOW ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:818:1: ( ( FLOW ) )
            // InternalUseCaseDslParser.g:819:1: ( FLOW )
            {
            // InternalUseCaseDslParser.g:819:1: ( FLOW )
            // InternalUseCaseDslParser.g:820:2: FLOW
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
    // InternalUseCaseDslParser.g:829:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:833:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // InternalUseCaseDslParser.g:834:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
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
    // InternalUseCaseDslParser.g:841:1: rule__UseCase__Group__8__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:845:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:846:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:846:1: ( Colon )
            // InternalUseCaseDslParser.g:847:2: Colon
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
    // InternalUseCaseDslParser.g:856:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl rule__UseCase__Group__10 ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:860:1: ( rule__UseCase__Group__9__Impl rule__UseCase__Group__10 )
            // InternalUseCaseDslParser.g:861:2: rule__UseCase__Group__9__Impl rule__UseCase__Group__10
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
    // InternalUseCaseDslParser.g:868:1: rule__UseCase__Group__9__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:872:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:873:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:873:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:874:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:883:1: rule__UseCase__Group__10 : rule__UseCase__Group__10__Impl rule__UseCase__Group__11 ;
    public final void rule__UseCase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:887:1: ( rule__UseCase__Group__10__Impl rule__UseCase__Group__11 )
            // InternalUseCaseDslParser.g:888:2: rule__UseCase__Group__10__Impl rule__UseCase__Group__11
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
    // InternalUseCaseDslParser.g:895:1: rule__UseCase__Group__10__Impl : ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) ) ;
    public final void rule__UseCase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:899:1: ( ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) ) )
            // InternalUseCaseDslParser.g:900:1: ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) )
            {
            // InternalUseCaseDslParser.g:900:1: ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) )
            // InternalUseCaseDslParser.g:901:2: ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* )
            {
            // InternalUseCaseDslParser.g:901:2: ( ( rule__UseCase__StepsAssignment_10 ) )
            // InternalUseCaseDslParser.g:902:3: ( rule__UseCase__StepsAssignment_10 )
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 
            // InternalUseCaseDslParser.g:903:3: ( rule__UseCase__StepsAssignment_10 )
            // InternalUseCaseDslParser.g:903:4: rule__UseCase__StepsAssignment_10
            {
            pushFollow(FOLLOW_13);
            rule__UseCase__StepsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 

            }

            // InternalUseCaseDslParser.g:906:2: ( ( rule__UseCase__StepsAssignment_10 )* )
            // InternalUseCaseDslParser.g:907:3: ( rule__UseCase__StepsAssignment_10 )*
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 
            // InternalUseCaseDslParser.g:908:3: ( rule__UseCase__StepsAssignment_10 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_INT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:908:4: rule__UseCase__StepsAssignment_10
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
    // InternalUseCaseDslParser.g:917:1: rule__UseCase__Group__11 : rule__UseCase__Group__11__Impl rule__UseCase__Group__12 ;
    public final void rule__UseCase__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:921:1: ( rule__UseCase__Group__11__Impl rule__UseCase__Group__12 )
            // InternalUseCaseDslParser.g:922:2: rule__UseCase__Group__11__Impl rule__UseCase__Group__12
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
    // InternalUseCaseDslParser.g:929:1: rule__UseCase__Group__11__Impl : ( RULE_END ) ;
    public final void rule__UseCase__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:933:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:934:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:934:1: ( RULE_END )
            // InternalUseCaseDslParser.g:935:2: RULE_END
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
    // InternalUseCaseDslParser.g:944:1: rule__UseCase__Group__12 : rule__UseCase__Group__12__Impl ;
    public final void rule__UseCase__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:948:1: ( rule__UseCase__Group__12__Impl )
            // InternalUseCaseDslParser.g:949:2: rule__UseCase__Group__12__Impl
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
    // InternalUseCaseDslParser.g:955:1: rule__UseCase__Group__12__Impl : ( ( rule__UseCase__Group_12__0 )? ) ;
    public final void rule__UseCase__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:959:1: ( ( ( rule__UseCase__Group_12__0 )? ) )
            // InternalUseCaseDslParser.g:960:1: ( ( rule__UseCase__Group_12__0 )? )
            {
            // InternalUseCaseDslParser.g:960:1: ( ( rule__UseCase__Group_12__0 )? )
            // InternalUseCaseDslParser.g:961:2: ( rule__UseCase__Group_12__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_12()); 
            // InternalUseCaseDslParser.g:962:2: ( rule__UseCase__Group_12__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ALTERNATIVE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCaseDslParser.g:962:3: rule__UseCase__Group_12__0
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
    // InternalUseCaseDslParser.g:971:1: rule__UseCase__Group_12__0 : rule__UseCase__Group_12__0__Impl rule__UseCase__Group_12__1 ;
    public final void rule__UseCase__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:975:1: ( rule__UseCase__Group_12__0__Impl rule__UseCase__Group_12__1 )
            // InternalUseCaseDslParser.g:976:2: rule__UseCase__Group_12__0__Impl rule__UseCase__Group_12__1
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
    // InternalUseCaseDslParser.g:983:1: rule__UseCase__Group_12__0__Impl : ( ( rule__UseCase__Group_12_0__0 ) ) ;
    public final void rule__UseCase__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:987:1: ( ( ( rule__UseCase__Group_12_0__0 ) ) )
            // InternalUseCaseDslParser.g:988:1: ( ( rule__UseCase__Group_12_0__0 ) )
            {
            // InternalUseCaseDslParser.g:988:1: ( ( rule__UseCase__Group_12_0__0 ) )
            // InternalUseCaseDslParser.g:989:2: ( rule__UseCase__Group_12_0__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup_12_0()); 
            // InternalUseCaseDslParser.g:990:2: ( rule__UseCase__Group_12_0__0 )
            // InternalUseCaseDslParser.g:990:3: rule__UseCase__Group_12_0__0
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
    // InternalUseCaseDslParser.g:998:1: rule__UseCase__Group_12__1 : rule__UseCase__Group_12__1__Impl rule__UseCase__Group_12__2 ;
    public final void rule__UseCase__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1002:1: ( rule__UseCase__Group_12__1__Impl rule__UseCase__Group_12__2 )
            // InternalUseCaseDslParser.g:1003:2: rule__UseCase__Group_12__1__Impl rule__UseCase__Group_12__2
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
    // InternalUseCaseDslParser.g:1010:1: rule__UseCase__Group_12__1__Impl : ( Colon ) ;
    public final void rule__UseCase__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1014:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:1015:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:1015:1: ( Colon )
            // InternalUseCaseDslParser.g:1016:2: Colon
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
    // InternalUseCaseDslParser.g:1025:1: rule__UseCase__Group_12__2 : rule__UseCase__Group_12__2__Impl rule__UseCase__Group_12__3 ;
    public final void rule__UseCase__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1029:1: ( rule__UseCase__Group_12__2__Impl rule__UseCase__Group_12__3 )
            // InternalUseCaseDslParser.g:1030:2: rule__UseCase__Group_12__2__Impl rule__UseCase__Group_12__3
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
    // InternalUseCaseDslParser.g:1037:1: rule__UseCase__Group_12__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCase__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1041:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:1042:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:1042:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:1043:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:1052:1: rule__UseCase__Group_12__3 : rule__UseCase__Group_12__3__Impl rule__UseCase__Group_12__4 ;
    public final void rule__UseCase__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1056:1: ( rule__UseCase__Group_12__3__Impl rule__UseCase__Group_12__4 )
            // InternalUseCaseDslParser.g:1057:2: rule__UseCase__Group_12__3__Impl rule__UseCase__Group_12__4
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
    // InternalUseCaseDslParser.g:1064:1: rule__UseCase__Group_12__3__Impl : ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) ) ;
    public final void rule__UseCase__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1068:1: ( ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) ) )
            // InternalUseCaseDslParser.g:1069:1: ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) )
            {
            // InternalUseCaseDslParser.g:1069:1: ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) )
            // InternalUseCaseDslParser.g:1070:2: ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* )
            {
            // InternalUseCaseDslParser.g:1070:2: ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) )
            // InternalUseCaseDslParser.g:1071:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 
            // InternalUseCaseDslParser.g:1072:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )
            // InternalUseCaseDslParser.g:1072:4: rule__UseCase__AlternativeflowsAssignment_12_3
            {
            pushFollow(FOLLOW_13);
            rule__UseCase__AlternativeflowsAssignment_12_3();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 

            }

            // InternalUseCaseDslParser.g:1075:2: ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* )
            // InternalUseCaseDslParser.g:1076:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )*
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 
            // InternalUseCaseDslParser.g:1077:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_INT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1077:4: rule__UseCase__AlternativeflowsAssignment_12_3
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
    // InternalUseCaseDslParser.g:1086:1: rule__UseCase__Group_12__4 : rule__UseCase__Group_12__4__Impl ;
    public final void rule__UseCase__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1090:1: ( rule__UseCase__Group_12__4__Impl )
            // InternalUseCaseDslParser.g:1091:2: rule__UseCase__Group_12__4__Impl
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
    // InternalUseCaseDslParser.g:1097:1: rule__UseCase__Group_12__4__Impl : ( RULE_END ) ;
    public final void rule__UseCase__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1101:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1102:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1102:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1103:2: RULE_END
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
    // InternalUseCaseDslParser.g:1113:1: rule__UseCase__Group_12_0__0 : rule__UseCase__Group_12_0__0__Impl rule__UseCase__Group_12_0__1 ;
    public final void rule__UseCase__Group_12_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1117:1: ( rule__UseCase__Group_12_0__0__Impl rule__UseCase__Group_12_0__1 )
            // InternalUseCaseDslParser.g:1118:2: rule__UseCase__Group_12_0__0__Impl rule__UseCase__Group_12_0__1
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
    // InternalUseCaseDslParser.g:1125:1: rule__UseCase__Group_12_0__0__Impl : ( ALTERNATIVE ) ;
    public final void rule__UseCase__Group_12_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1129:1: ( ( ALTERNATIVE ) )
            // InternalUseCaseDslParser.g:1130:1: ( ALTERNATIVE )
            {
            // InternalUseCaseDslParser.g:1130:1: ( ALTERNATIVE )
            // InternalUseCaseDslParser.g:1131:2: ALTERNATIVE
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
    // InternalUseCaseDslParser.g:1140:1: rule__UseCase__Group_12_0__1 : rule__UseCase__Group_12_0__1__Impl ;
    public final void rule__UseCase__Group_12_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1144:1: ( rule__UseCase__Group_12_0__1__Impl )
            // InternalUseCaseDslParser.g:1145:2: rule__UseCase__Group_12_0__1__Impl
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
    // InternalUseCaseDslParser.g:1151:1: rule__UseCase__Group_12_0__1__Impl : ( FLOW ) ;
    public final void rule__UseCase__Group_12_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1155:1: ( ( FLOW ) )
            // InternalUseCaseDslParser.g:1156:1: ( FLOW )
            {
            // InternalUseCaseDslParser.g:1156:1: ( FLOW )
            // InternalUseCaseDslParser.g:1157:2: FLOW
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
    // InternalUseCaseDslParser.g:1167:1: rule__Extension__Group__0 : rule__Extension__Group__0__Impl rule__Extension__Group__1 ;
    public final void rule__Extension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1171:1: ( rule__Extension__Group__0__Impl rule__Extension__Group__1 )
            // InternalUseCaseDslParser.g:1172:2: rule__Extension__Group__0__Impl rule__Extension__Group__1
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
    // InternalUseCaseDslParser.g:1179:1: rule__Extension__Group__0__Impl : ( ( ( rule__Extension__Group_0__0 ) ) ( ( rule__Extension__Group_0__0 )* ) ) ;
    public final void rule__Extension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1183:1: ( ( ( ( rule__Extension__Group_0__0 ) ) ( ( rule__Extension__Group_0__0 )* ) ) )
            // InternalUseCaseDslParser.g:1184:1: ( ( ( rule__Extension__Group_0__0 ) ) ( ( rule__Extension__Group_0__0 )* ) )
            {
            // InternalUseCaseDslParser.g:1184:1: ( ( ( rule__Extension__Group_0__0 ) ) ( ( rule__Extension__Group_0__0 )* ) )
            // InternalUseCaseDslParser.g:1185:2: ( ( rule__Extension__Group_0__0 ) ) ( ( rule__Extension__Group_0__0 )* )
            {
            // InternalUseCaseDslParser.g:1185:2: ( ( rule__Extension__Group_0__0 ) )
            // InternalUseCaseDslParser.g:1186:3: ( rule__Extension__Group_0__0 )
            {
             before(grammarAccess.getExtensionAccess().getGroup_0()); 
            // InternalUseCaseDslParser.g:1187:3: ( rule__Extension__Group_0__0 )
            // InternalUseCaseDslParser.g:1187:4: rule__Extension__Group_0__0
            {
            pushFollow(FOLLOW_13);
            rule__Extension__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getGroup_0()); 

            }

            // InternalUseCaseDslParser.g:1190:2: ( ( rule__Extension__Group_0__0 )* )
            // InternalUseCaseDslParser.g:1191:3: ( rule__Extension__Group_0__0 )*
            {
             before(grammarAccess.getExtensionAccess().getGroup_0()); 
            // InternalUseCaseDslParser.g:1192:3: ( rule__Extension__Group_0__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1192:4: rule__Extension__Group_0__0
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
    // InternalUseCaseDslParser.g:1201:1: rule__Extension__Group__1 : rule__Extension__Group__1__Impl rule__Extension__Group__2 ;
    public final void rule__Extension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1205:1: ( rule__Extension__Group__1__Impl rule__Extension__Group__2 )
            // InternalUseCaseDslParser.g:1206:2: rule__Extension__Group__1__Impl rule__Extension__Group__2
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
    // InternalUseCaseDslParser.g:1213:1: rule__Extension__Group__1__Impl : ( ( rule__Extension__NameAssignment_1 ) ) ;
    public final void rule__Extension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1217:1: ( ( ( rule__Extension__NameAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:1218:1: ( ( rule__Extension__NameAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:1218:1: ( ( rule__Extension__NameAssignment_1 ) )
            // InternalUseCaseDslParser.g:1219:2: ( rule__Extension__NameAssignment_1 )
            {
             before(grammarAccess.getExtensionAccess().getNameAssignment_1()); 
            // InternalUseCaseDslParser.g:1220:2: ( rule__Extension__NameAssignment_1 )
            // InternalUseCaseDslParser.g:1220:3: rule__Extension__NameAssignment_1
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
    // InternalUseCaseDslParser.g:1228:1: rule__Extension__Group__2 : rule__Extension__Group__2__Impl rule__Extension__Group__3 ;
    public final void rule__Extension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1232:1: ( rule__Extension__Group__2__Impl rule__Extension__Group__3 )
            // InternalUseCaseDslParser.g:1233:2: rule__Extension__Group__2__Impl rule__Extension__Group__3
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
    // InternalUseCaseDslParser.g:1240:1: rule__Extension__Group__2__Impl : ( FullStop ) ;
    public final void rule__Extension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1244:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1245:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1245:1: ( FullStop )
            // InternalUseCaseDslParser.g:1246:2: FullStop
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
    // InternalUseCaseDslParser.g:1255:1: rule__Extension__Group__3 : rule__Extension__Group__3__Impl rule__Extension__Group__4 ;
    public final void rule__Extension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1259:1: ( rule__Extension__Group__3__Impl rule__Extension__Group__4 )
            // InternalUseCaseDslParser.g:1260:2: rule__Extension__Group__3__Impl rule__Extension__Group__4
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
    // InternalUseCaseDslParser.g:1267:1: rule__Extension__Group__3__Impl : ( IF ) ;
    public final void rule__Extension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1271:1: ( ( IF ) )
            // InternalUseCaseDslParser.g:1272:1: ( IF )
            {
            // InternalUseCaseDslParser.g:1272:1: ( IF )
            // InternalUseCaseDslParser.g:1273:2: IF
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
    // InternalUseCaseDslParser.g:1282:1: rule__Extension__Group__4 : rule__Extension__Group__4__Impl rule__Extension__Group__5 ;
    public final void rule__Extension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1286:1: ( rule__Extension__Group__4__Impl rule__Extension__Group__5 )
            // InternalUseCaseDslParser.g:1287:2: rule__Extension__Group__4__Impl rule__Extension__Group__5
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
    // InternalUseCaseDslParser.g:1294:1: rule__Extension__Group__4__Impl : ( ( rule__Extension__ConditionAssignment_4 ) ) ;
    public final void rule__Extension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1298:1: ( ( ( rule__Extension__ConditionAssignment_4 ) ) )
            // InternalUseCaseDslParser.g:1299:1: ( ( rule__Extension__ConditionAssignment_4 ) )
            {
            // InternalUseCaseDslParser.g:1299:1: ( ( rule__Extension__ConditionAssignment_4 ) )
            // InternalUseCaseDslParser.g:1300:2: ( rule__Extension__ConditionAssignment_4 )
            {
             before(grammarAccess.getExtensionAccess().getConditionAssignment_4()); 
            // InternalUseCaseDslParser.g:1301:2: ( rule__Extension__ConditionAssignment_4 )
            // InternalUseCaseDslParser.g:1301:3: rule__Extension__ConditionAssignment_4
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
    // InternalUseCaseDslParser.g:1309:1: rule__Extension__Group__5 : rule__Extension__Group__5__Impl rule__Extension__Group__6 ;
    public final void rule__Extension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1313:1: ( rule__Extension__Group__5__Impl rule__Extension__Group__6 )
            // InternalUseCaseDslParser.g:1314:2: rule__Extension__Group__5__Impl rule__Extension__Group__6
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
    // InternalUseCaseDslParser.g:1321:1: rule__Extension__Group__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__Extension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1325:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:1326:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:1326:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:1327:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:1336:1: rule__Extension__Group__6 : rule__Extension__Group__6__Impl rule__Extension__Group__7 ;
    public final void rule__Extension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1340:1: ( rule__Extension__Group__6__Impl rule__Extension__Group__7 )
            // InternalUseCaseDslParser.g:1341:2: rule__Extension__Group__6__Impl rule__Extension__Group__7
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
    // InternalUseCaseDslParser.g:1348:1: rule__Extension__Group__6__Impl : ( ( rule__Extension__StepsAssignment_6 )* ) ;
    public final void rule__Extension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1352:1: ( ( ( rule__Extension__StepsAssignment_6 )* ) )
            // InternalUseCaseDslParser.g:1353:1: ( ( rule__Extension__StepsAssignment_6 )* )
            {
            // InternalUseCaseDslParser.g:1353:1: ( ( rule__Extension__StepsAssignment_6 )* )
            // InternalUseCaseDslParser.g:1354:2: ( rule__Extension__StepsAssignment_6 )*
            {
             before(grammarAccess.getExtensionAccess().getStepsAssignment_6()); 
            // InternalUseCaseDslParser.g:1355:2: ( rule__Extension__StepsAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1355:3: rule__Extension__StepsAssignment_6
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
    // InternalUseCaseDslParser.g:1363:1: rule__Extension__Group__7 : rule__Extension__Group__7__Impl rule__Extension__Group__8 ;
    public final void rule__Extension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1367:1: ( rule__Extension__Group__7__Impl rule__Extension__Group__8 )
            // InternalUseCaseDslParser.g:1368:2: rule__Extension__Group__7__Impl rule__Extension__Group__8
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
    // InternalUseCaseDslParser.g:1375:1: rule__Extension__Group__7__Impl : ( ( rule__Extension__Alternatives_7 ) ) ;
    public final void rule__Extension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1379:1: ( ( ( rule__Extension__Alternatives_7 ) ) )
            // InternalUseCaseDslParser.g:1380:1: ( ( rule__Extension__Alternatives_7 ) )
            {
            // InternalUseCaseDslParser.g:1380:1: ( ( rule__Extension__Alternatives_7 ) )
            // InternalUseCaseDslParser.g:1381:2: ( rule__Extension__Alternatives_7 )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives_7()); 
            // InternalUseCaseDslParser.g:1382:2: ( rule__Extension__Alternatives_7 )
            // InternalUseCaseDslParser.g:1382:3: rule__Extension__Alternatives_7
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
    // InternalUseCaseDslParser.g:1390:1: rule__Extension__Group__8 : rule__Extension__Group__8__Impl ;
    public final void rule__Extension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1394:1: ( rule__Extension__Group__8__Impl )
            // InternalUseCaseDslParser.g:1395:2: rule__Extension__Group__8__Impl
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
    // InternalUseCaseDslParser.g:1401:1: rule__Extension__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Extension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1405:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1406:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1406:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1407:2: RULE_END
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
    // InternalUseCaseDslParser.g:1417:1: rule__Extension__Group_0__0 : rule__Extension__Group_0__0__Impl rule__Extension__Group_0__1 ;
    public final void rule__Extension__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1421:1: ( rule__Extension__Group_0__0__Impl rule__Extension__Group_0__1 )
            // InternalUseCaseDslParser.g:1422:2: rule__Extension__Group_0__0__Impl rule__Extension__Group_0__1
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
    // InternalUseCaseDslParser.g:1429:1: rule__Extension__Group_0__0__Impl : ( ( rule__Extension__StartFromAssignment_0_0 ) ) ;
    public final void rule__Extension__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1433:1: ( ( ( rule__Extension__StartFromAssignment_0_0 ) ) )
            // InternalUseCaseDslParser.g:1434:1: ( ( rule__Extension__StartFromAssignment_0_0 ) )
            {
            // InternalUseCaseDslParser.g:1434:1: ( ( rule__Extension__StartFromAssignment_0_0 ) )
            // InternalUseCaseDslParser.g:1435:2: ( rule__Extension__StartFromAssignment_0_0 )
            {
             before(grammarAccess.getExtensionAccess().getStartFromAssignment_0_0()); 
            // InternalUseCaseDslParser.g:1436:2: ( rule__Extension__StartFromAssignment_0_0 )
            // InternalUseCaseDslParser.g:1436:3: rule__Extension__StartFromAssignment_0_0
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
    // InternalUseCaseDslParser.g:1444:1: rule__Extension__Group_0__1 : rule__Extension__Group_0__1__Impl ;
    public final void rule__Extension__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1448:1: ( rule__Extension__Group_0__1__Impl )
            // InternalUseCaseDslParser.g:1449:2: rule__Extension__Group_0__1__Impl
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
    // InternalUseCaseDslParser.g:1455:1: rule__Extension__Group_0__1__Impl : ( FullStop ) ;
    public final void rule__Extension__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1459:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1460:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1460:1: ( FullStop )
            // InternalUseCaseDslParser.g:1461:2: FullStop
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
    // InternalUseCaseDslParser.g:1471:1: rule__Extension__Group_7_0__0 : rule__Extension__Group_7_0__0__Impl rule__Extension__Group_7_0__1 ;
    public final void rule__Extension__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1475:1: ( rule__Extension__Group_7_0__0__Impl rule__Extension__Group_7_0__1 )
            // InternalUseCaseDslParser.g:1476:2: rule__Extension__Group_7_0__0__Impl rule__Extension__Group_7_0__1
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
    // InternalUseCaseDslParser.g:1483:1: rule__Extension__Group_7_0__0__Impl : ( RULE_INT ) ;
    public final void rule__Extension__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1487:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:1488:1: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:1488:1: ( RULE_INT )
            // InternalUseCaseDslParser.g:1489:2: RULE_INT
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
    // InternalUseCaseDslParser.g:1498:1: rule__Extension__Group_7_0__1 : rule__Extension__Group_7_0__1__Impl rule__Extension__Group_7_0__2 ;
    public final void rule__Extension__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1502:1: ( rule__Extension__Group_7_0__1__Impl rule__Extension__Group_7_0__2 )
            // InternalUseCaseDslParser.g:1503:2: rule__Extension__Group_7_0__1__Impl rule__Extension__Group_7_0__2
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
    // InternalUseCaseDslParser.g:1510:1: rule__Extension__Group_7_0__1__Impl : ( FullStop ) ;
    public final void rule__Extension__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1514:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1515:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1515:1: ( FullStop )
            // InternalUseCaseDslParser.g:1516:2: FullStop
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
    // InternalUseCaseDslParser.g:1525:1: rule__Extension__Group_7_0__2 : rule__Extension__Group_7_0__2__Impl rule__Extension__Group_7_0__3 ;
    public final void rule__Extension__Group_7_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1529:1: ( rule__Extension__Group_7_0__2__Impl rule__Extension__Group_7_0__3 )
            // InternalUseCaseDslParser.g:1530:2: rule__Extension__Group_7_0__2__Impl rule__Extension__Group_7_0__3
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
    // InternalUseCaseDslParser.g:1537:1: rule__Extension__Group_7_0__2__Impl : ( RETURN ) ;
    public final void rule__Extension__Group_7_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1541:1: ( ( RETURN ) )
            // InternalUseCaseDslParser.g:1542:1: ( RETURN )
            {
            // InternalUseCaseDslParser.g:1542:1: ( RETURN )
            // InternalUseCaseDslParser.g:1543:2: RETURN
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
    // InternalUseCaseDslParser.g:1552:1: rule__Extension__Group_7_0__3 : rule__Extension__Group_7_0__3__Impl rule__Extension__Group_7_0__4 ;
    public final void rule__Extension__Group_7_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1556:1: ( rule__Extension__Group_7_0__3__Impl rule__Extension__Group_7_0__4 )
            // InternalUseCaseDslParser.g:1557:2: rule__Extension__Group_7_0__3__Impl rule__Extension__Group_7_0__4
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
    // InternalUseCaseDslParser.g:1564:1: rule__Extension__Group_7_0__3__Impl : ( TO ) ;
    public final void rule__Extension__Group_7_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1568:1: ( ( TO ) )
            // InternalUseCaseDslParser.g:1569:1: ( TO )
            {
            // InternalUseCaseDslParser.g:1569:1: ( TO )
            // InternalUseCaseDslParser.g:1570:2: TO
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
    // InternalUseCaseDslParser.g:1579:1: rule__Extension__Group_7_0__4 : rule__Extension__Group_7_0__4__Impl ;
    public final void rule__Extension__Group_7_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1583:1: ( rule__Extension__Group_7_0__4__Impl )
            // InternalUseCaseDslParser.g:1584:2: rule__Extension__Group_7_0__4__Impl
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
    // InternalUseCaseDslParser.g:1590:1: rule__Extension__Group_7_0__4__Impl : ( ( ( rule__Extension__Group_7_0_4__0 ) ) ( ( rule__Extension__Group_7_0_4__0 )* ) ) ;
    public final void rule__Extension__Group_7_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1594:1: ( ( ( ( rule__Extension__Group_7_0_4__0 ) ) ( ( rule__Extension__Group_7_0_4__0 )* ) ) )
            // InternalUseCaseDslParser.g:1595:1: ( ( ( rule__Extension__Group_7_0_4__0 ) ) ( ( rule__Extension__Group_7_0_4__0 )* ) )
            {
            // InternalUseCaseDslParser.g:1595:1: ( ( ( rule__Extension__Group_7_0_4__0 ) ) ( ( rule__Extension__Group_7_0_4__0 )* ) )
            // InternalUseCaseDslParser.g:1596:2: ( ( rule__Extension__Group_7_0_4__0 ) ) ( ( rule__Extension__Group_7_0_4__0 )* )
            {
            // InternalUseCaseDslParser.g:1596:2: ( ( rule__Extension__Group_7_0_4__0 ) )
            // InternalUseCaseDslParser.g:1597:3: ( rule__Extension__Group_7_0_4__0 )
            {
             before(grammarAccess.getExtensionAccess().getGroup_7_0_4()); 
            // InternalUseCaseDslParser.g:1598:3: ( rule__Extension__Group_7_0_4__0 )
            // InternalUseCaseDslParser.g:1598:4: rule__Extension__Group_7_0_4__0
            {
            pushFollow(FOLLOW_13);
            rule__Extension__Group_7_0_4__0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getGroup_7_0_4()); 

            }

            // InternalUseCaseDslParser.g:1601:2: ( ( rule__Extension__Group_7_0_4__0 )* )
            // InternalUseCaseDslParser.g:1602:3: ( rule__Extension__Group_7_0_4__0 )*
            {
             before(grammarAccess.getExtensionAccess().getGroup_7_0_4()); 
            // InternalUseCaseDslParser.g:1603:3: ( rule__Extension__Group_7_0_4__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_INT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1603:4: rule__Extension__Group_7_0_4__0
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
    // InternalUseCaseDslParser.g:1613:1: rule__Extension__Group_7_0_4__0 : rule__Extension__Group_7_0_4__0__Impl rule__Extension__Group_7_0_4__1 ;
    public final void rule__Extension__Group_7_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1617:1: ( rule__Extension__Group_7_0_4__0__Impl rule__Extension__Group_7_0_4__1 )
            // InternalUseCaseDslParser.g:1618:2: rule__Extension__Group_7_0_4__0__Impl rule__Extension__Group_7_0_4__1
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
    // InternalUseCaseDslParser.g:1625:1: rule__Extension__Group_7_0_4__0__Impl : ( ( rule__Extension__ResumeAtAssignment_7_0_4_0 ) ) ;
    public final void rule__Extension__Group_7_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1629:1: ( ( ( rule__Extension__ResumeAtAssignment_7_0_4_0 ) ) )
            // InternalUseCaseDslParser.g:1630:1: ( ( rule__Extension__ResumeAtAssignment_7_0_4_0 ) )
            {
            // InternalUseCaseDslParser.g:1630:1: ( ( rule__Extension__ResumeAtAssignment_7_0_4_0 ) )
            // InternalUseCaseDslParser.g:1631:2: ( rule__Extension__ResumeAtAssignment_7_0_4_0 )
            {
             before(grammarAccess.getExtensionAccess().getResumeAtAssignment_7_0_4_0()); 
            // InternalUseCaseDslParser.g:1632:2: ( rule__Extension__ResumeAtAssignment_7_0_4_0 )
            // InternalUseCaseDslParser.g:1632:3: rule__Extension__ResumeAtAssignment_7_0_4_0
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
    // InternalUseCaseDslParser.g:1640:1: rule__Extension__Group_7_0_4__1 : rule__Extension__Group_7_0_4__1__Impl ;
    public final void rule__Extension__Group_7_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1644:1: ( rule__Extension__Group_7_0_4__1__Impl )
            // InternalUseCaseDslParser.g:1645:2: rule__Extension__Group_7_0_4__1__Impl
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
    // InternalUseCaseDslParser.g:1651:1: rule__Extension__Group_7_0_4__1__Impl : ( ( FullStop )? ) ;
    public final void rule__Extension__Group_7_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1655:1: ( ( ( FullStop )? ) )
            // InternalUseCaseDslParser.g:1656:1: ( ( FullStop )? )
            {
            // InternalUseCaseDslParser.g:1656:1: ( ( FullStop )? )
            // InternalUseCaseDslParser.g:1657:2: ( FullStop )?
            {
             before(grammarAccess.getExtensionAccess().getFullStopKeyword_7_0_4_1()); 
            // InternalUseCaseDslParser.g:1658:2: ( FullStop )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==FullStop) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUseCaseDslParser.g:1658:3: FullStop
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
    // InternalUseCaseDslParser.g:1667:1: rule__UseCaseStep__Group_0__0 : rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1 ;
    public final void rule__UseCaseStep__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1671:1: ( rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1 )
            // InternalUseCaseDslParser.g:1672:2: rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalUseCaseDslParser.g:1679:1: rule__UseCaseStep__Group_0__0__Impl : ( ( rule__UseCaseStep__NameAssignment_0_0 ) ) ;
    public final void rule__UseCaseStep__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1683:1: ( ( ( rule__UseCaseStep__NameAssignment_0_0 ) ) )
            // InternalUseCaseDslParser.g:1684:1: ( ( rule__UseCaseStep__NameAssignment_0_0 ) )
            {
            // InternalUseCaseDslParser.g:1684:1: ( ( rule__UseCaseStep__NameAssignment_0_0 ) )
            // InternalUseCaseDslParser.g:1685:2: ( rule__UseCaseStep__NameAssignment_0_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_0_0()); 
            // InternalUseCaseDslParser.g:1686:2: ( rule__UseCaseStep__NameAssignment_0_0 )
            // InternalUseCaseDslParser.g:1686:3: rule__UseCaseStep__NameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_0__0__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_0__1"
    // InternalUseCaseDslParser.g:1694:1: rule__UseCaseStep__Group_0__1 : rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2 ;
    public final void rule__UseCaseStep__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1698:1: ( rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2 )
            // InternalUseCaseDslParser.g:1699:2: rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalUseCaseDslParser.g:1706:1: rule__UseCaseStep__Group_0__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1710:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1711:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1711:1: ( FullStop )
            // InternalUseCaseDslParser.g:1712:2: FullStop
            {
             before(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_0_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1721:1: rule__UseCaseStep__Group_0__2 : rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3 ;
    public final void rule__UseCaseStep__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1725:1: ( rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3 )
            // InternalUseCaseDslParser.g:1726:2: rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCaseDslParser.g:1733:1: rule__UseCaseStep__Group_0__2__Impl : ( INCLUDE ) ;
    public final void rule__UseCaseStep__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1737:1: ( ( INCLUDE ) )
            // InternalUseCaseDslParser.g:1738:1: ( INCLUDE )
            {
            // InternalUseCaseDslParser.g:1738:1: ( INCLUDE )
            // InternalUseCaseDslParser.g:1739:2: INCLUDE
            {
             before(grammarAccess.getUseCaseStepAccess().getINCLUDEKeyword_0_2()); 
            match(input,INCLUDE,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getINCLUDEKeyword_0_2()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1748:1: rule__UseCaseStep__Group_0__3 : rule__UseCaseStep__Group_0__3__Impl ;
    public final void rule__UseCaseStep__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1752:1: ( rule__UseCaseStep__Group_0__3__Impl )
            // InternalUseCaseDslParser.g:1753:2: rule__UseCaseStep__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_0__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalUseCaseDslParser.g:1759:1: rule__UseCaseStep__Group_0__3__Impl : ( ( rule__UseCaseStep__IncludeAssignment_0_3 ) ) ;
    public final void rule__UseCaseStep__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1763:1: ( ( ( rule__UseCaseStep__IncludeAssignment_0_3 ) ) )
            // InternalUseCaseDslParser.g:1764:1: ( ( rule__UseCaseStep__IncludeAssignment_0_3 ) )
            {
            // InternalUseCaseDslParser.g:1764:1: ( ( rule__UseCaseStep__IncludeAssignment_0_3 ) )
            // InternalUseCaseDslParser.g:1765:2: ( rule__UseCaseStep__IncludeAssignment_0_3 )
            {
             before(grammarAccess.getUseCaseStepAccess().getIncludeAssignment_0_3()); 
            // InternalUseCaseDslParser.g:1766:2: ( rule__UseCaseStep__IncludeAssignment_0_3 )
            // InternalUseCaseDslParser.g:1766:3: rule__UseCaseStep__IncludeAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__IncludeAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getIncludeAssignment_0_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__UseCaseStep__Group_1__0"
    // InternalUseCaseDslParser.g:1775:1: rule__UseCaseStep__Group_1__0 : rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1 ;
    public final void rule__UseCaseStep__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1779:1: ( rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1 )
            // InternalUseCaseDslParser.g:1780:2: rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1
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
    // InternalUseCaseDslParser.g:1787:1: rule__UseCaseStep__Group_1__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1791:1: ( ( () ) )
            // InternalUseCaseDslParser.g:1792:1: ( () )
            {
            // InternalUseCaseDslParser.g:1792:1: ( () )
            // InternalUseCaseDslParser.g:1793:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getUserStepAction_1_0()); 
            // InternalUseCaseDslParser.g:1794:2: ()
            // InternalUseCaseDslParser.g:1794:3: 
            {
            }

             after(grammarAccess.getUseCaseStepAccess().getUserStepAction_1_0()); 

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
    // InternalUseCaseDslParser.g:1802:1: rule__UseCaseStep__Group_1__1 : rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2 ;
    public final void rule__UseCaseStep__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1806:1: ( rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2 )
            // InternalUseCaseDslParser.g:1807:2: rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2
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
    // InternalUseCaseDslParser.g:1814:1: rule__UseCaseStep__Group_1__1__Impl : ( ( rule__UseCaseStep__NameAssignment_1_1 ) ) ;
    public final void rule__UseCaseStep__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1818:1: ( ( ( rule__UseCaseStep__NameAssignment_1_1 ) ) )
            // InternalUseCaseDslParser.g:1819:1: ( ( rule__UseCaseStep__NameAssignment_1_1 ) )
            {
            // InternalUseCaseDslParser.g:1819:1: ( ( rule__UseCaseStep__NameAssignment_1_1 ) )
            // InternalUseCaseDslParser.g:1820:2: ( rule__UseCaseStep__NameAssignment_1_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_1_1()); 
            // InternalUseCaseDslParser.g:1821:2: ( rule__UseCaseStep__NameAssignment_1_1 )
            // InternalUseCaseDslParser.g:1821:3: rule__UseCaseStep__NameAssignment_1_1
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
    // InternalUseCaseDslParser.g:1829:1: rule__UseCaseStep__Group_1__2 : rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3 ;
    public final void rule__UseCaseStep__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1833:1: ( rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3 )
            // InternalUseCaseDslParser.g:1834:2: rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3
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
    // InternalUseCaseDslParser.g:1841:1: rule__UseCaseStep__Group_1__2__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1845:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1846:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1846:1: ( FullStop )
            // InternalUseCaseDslParser.g:1847:2: FullStop
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
    // InternalUseCaseDslParser.g:1856:1: rule__UseCaseStep__Group_1__3 : rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4 ;
    public final void rule__UseCaseStep__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1860:1: ( rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4 )
            // InternalUseCaseDslParser.g:1861:2: rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4
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
    // InternalUseCaseDslParser.g:1868:1: rule__UseCaseStep__Group_1__3__Impl : ( USER ) ;
    public final void rule__UseCaseStep__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1872:1: ( ( USER ) )
            // InternalUseCaseDslParser.g:1873:1: ( USER )
            {
            // InternalUseCaseDslParser.g:1873:1: ( USER )
            // InternalUseCaseDslParser.g:1874:2: USER
            {
             before(grammarAccess.getUseCaseStepAccess().getUSERKeyword_1_3()); 
            match(input,USER,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getUSERKeyword_1_3()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1883:1: rule__UseCaseStep__Group_1__4 : rule__UseCaseStep__Group_1__4__Impl ;
    public final void rule__UseCaseStep__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1887:1: ( rule__UseCaseStep__Group_1__4__Impl )
            // InternalUseCaseDslParser.g:1888:2: rule__UseCaseStep__Group_1__4__Impl
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
    // InternalUseCaseDslParser.g:1894:1: rule__UseCaseStep__Group_1__4__Impl : ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) ) ;
    public final void rule__UseCaseStep__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1898:1: ( ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) ) )
            // InternalUseCaseDslParser.g:1899:1: ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) )
            {
            // InternalUseCaseDslParser.g:1899:1: ( ( rule__UseCaseStep__SentenceAssignment_1_4 ) )
            // InternalUseCaseDslParser.g:1900:2: ( rule__UseCaseStep__SentenceAssignment_1_4 )
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_1_4()); 
            // InternalUseCaseDslParser.g:1901:2: ( rule__UseCaseStep__SentenceAssignment_1_4 )
            // InternalUseCaseDslParser.g:1901:3: rule__UseCaseStep__SentenceAssignment_1_4
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
    // InternalUseCaseDslParser.g:1910:1: rule__UseCaseStep__Group_2__0 : rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1 ;
    public final void rule__UseCaseStep__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1914:1: ( rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1 )
            // InternalUseCaseDslParser.g:1915:2: rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1
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
    // InternalUseCaseDslParser.g:1922:1: rule__UseCaseStep__Group_2__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1926:1: ( ( () ) )
            // InternalUseCaseDslParser.g:1927:1: ( () )
            {
            // InternalUseCaseDslParser.g:1927:1: ( () )
            // InternalUseCaseDslParser.g:1928:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getSystemStepAction_2_0()); 
            // InternalUseCaseDslParser.g:1929:2: ()
            // InternalUseCaseDslParser.g:1929:3: 
            {
            }

             after(grammarAccess.getUseCaseStepAccess().getSystemStepAction_2_0()); 

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
    // InternalUseCaseDslParser.g:1937:1: rule__UseCaseStep__Group_2__1 : rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2 ;
    public final void rule__UseCaseStep__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1941:1: ( rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2 )
            // InternalUseCaseDslParser.g:1942:2: rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2
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
    // InternalUseCaseDslParser.g:1949:1: rule__UseCaseStep__Group_2__1__Impl : ( ( rule__UseCaseStep__NameAssignment_2_1 ) ) ;
    public final void rule__UseCaseStep__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1953:1: ( ( ( rule__UseCaseStep__NameAssignment_2_1 ) ) )
            // InternalUseCaseDslParser.g:1954:1: ( ( rule__UseCaseStep__NameAssignment_2_1 ) )
            {
            // InternalUseCaseDslParser.g:1954:1: ( ( rule__UseCaseStep__NameAssignment_2_1 ) )
            // InternalUseCaseDslParser.g:1955:2: ( rule__UseCaseStep__NameAssignment_2_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_2_1()); 
            // InternalUseCaseDslParser.g:1956:2: ( rule__UseCaseStep__NameAssignment_2_1 )
            // InternalUseCaseDslParser.g:1956:3: rule__UseCaseStep__NameAssignment_2_1
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
    // InternalUseCaseDslParser.g:1964:1: rule__UseCaseStep__Group_2__2 : rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3 ;
    public final void rule__UseCaseStep__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1968:1: ( rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3 )
            // InternalUseCaseDslParser.g:1969:2: rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3
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
    // InternalUseCaseDslParser.g:1976:1: rule__UseCaseStep__Group_2__2__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1980:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1981:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1981:1: ( FullStop )
            // InternalUseCaseDslParser.g:1982:2: FullStop
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
    // InternalUseCaseDslParser.g:1991:1: rule__UseCaseStep__Group_2__3 : rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4 ;
    public final void rule__UseCaseStep__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1995:1: ( rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4 )
            // InternalUseCaseDslParser.g:1996:2: rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCaseDslParser.g:2003:1: rule__UseCaseStep__Group_2__3__Impl : ( SYSTEM ) ;
    public final void rule__UseCaseStep__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2007:1: ( ( SYSTEM ) )
            // InternalUseCaseDslParser.g:2008:1: ( SYSTEM )
            {
            // InternalUseCaseDslParser.g:2008:1: ( SYSTEM )
            // InternalUseCaseDslParser.g:2009:2: SYSTEM
            {
             before(grammarAccess.getUseCaseStepAccess().getSYSTEMKeyword_2_3()); 
            match(input,SYSTEM,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getSYSTEMKeyword_2_3()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2018:1: rule__UseCaseStep__Group_2__4 : rule__UseCaseStep__Group_2__4__Impl ;
    public final void rule__UseCaseStep__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2022:1: ( rule__UseCaseStep__Group_2__4__Impl )
            // InternalUseCaseDslParser.g:2023:2: rule__UseCaseStep__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalUseCaseDslParser.g:2029:1: rule__UseCaseStep__Group_2__4__Impl : ( ( rule__UseCaseStep__SentenceAssignment_2_4 ) ) ;
    public final void rule__UseCaseStep__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2033:1: ( ( ( rule__UseCaseStep__SentenceAssignment_2_4 ) ) )
            // InternalUseCaseDslParser.g:2034:1: ( ( rule__UseCaseStep__SentenceAssignment_2_4 ) )
            {
            // InternalUseCaseDslParser.g:2034:1: ( ( rule__UseCaseStep__SentenceAssignment_2_4 ) )
            // InternalUseCaseDslParser.g:2035:2: ( rule__UseCaseStep__SentenceAssignment_2_4 )
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_2_4()); 
            // InternalUseCaseDslParser.g:2036:2: ( rule__UseCaseStep__SentenceAssignment_2_4 )
            // InternalUseCaseDslParser.g:2036:3: rule__UseCaseStep__SentenceAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__SentenceAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_2_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__UseCaseStep__Group_3__0"
    // InternalUseCaseDslParser.g:2045:1: rule__UseCaseStep__Group_3__0 : rule__UseCaseStep__Group_3__0__Impl rule__UseCaseStep__Group_3__1 ;
    public final void rule__UseCaseStep__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2049:1: ( rule__UseCaseStep__Group_3__0__Impl rule__UseCaseStep__Group_3__1 )
            // InternalUseCaseDslParser.g:2050:2: rule__UseCaseStep__Group_3__0__Impl rule__UseCaseStep__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__UseCaseStep__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__0"


    // $ANTLR start "rule__UseCaseStep__Group_3__0__Impl"
    // InternalUseCaseDslParser.g:2057:1: rule__UseCaseStep__Group_3__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2061:1: ( ( () ) )
            // InternalUseCaseDslParser.g:2062:1: ( () )
            {
            // InternalUseCaseDslParser.g:2062:1: ( () )
            // InternalUseCaseDslParser.g:2063:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatingStepAction_3_0()); 
            // InternalUseCaseDslParser.g:2064:2: ()
            // InternalUseCaseDslParser.g:2064:3: 
            {
            }

             after(grammarAccess.getUseCaseStepAccess().getRepeatingStepAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__0__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_3__1"
    // InternalUseCaseDslParser.g:2072:1: rule__UseCaseStep__Group_3__1 : rule__UseCaseStep__Group_3__1__Impl rule__UseCaseStep__Group_3__2 ;
    public final void rule__UseCaseStep__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2076:1: ( rule__UseCaseStep__Group_3__1__Impl rule__UseCaseStep__Group_3__2 )
            // InternalUseCaseDslParser.g:2077:2: rule__UseCaseStep__Group_3__1__Impl rule__UseCaseStep__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__UseCaseStep__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__1"


    // $ANTLR start "rule__UseCaseStep__Group_3__1__Impl"
    // InternalUseCaseDslParser.g:2084:1: rule__UseCaseStep__Group_3__1__Impl : ( ( rule__UseCaseStep__NameAssignment_3_1 ) ) ;
    public final void rule__UseCaseStep__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2088:1: ( ( ( rule__UseCaseStep__NameAssignment_3_1 ) ) )
            // InternalUseCaseDslParser.g:2089:1: ( ( rule__UseCaseStep__NameAssignment_3_1 ) )
            {
            // InternalUseCaseDslParser.g:2089:1: ( ( rule__UseCaseStep__NameAssignment_3_1 ) )
            // InternalUseCaseDslParser.g:2090:2: ( rule__UseCaseStep__NameAssignment_3_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_3_1()); 
            // InternalUseCaseDslParser.g:2091:2: ( rule__UseCaseStep__NameAssignment_3_1 )
            // InternalUseCaseDslParser.g:2091:3: rule__UseCaseStep__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__1__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_3__2"
    // InternalUseCaseDslParser.g:2099:1: rule__UseCaseStep__Group_3__2 : rule__UseCaseStep__Group_3__2__Impl rule__UseCaseStep__Group_3__3 ;
    public final void rule__UseCaseStep__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2103:1: ( rule__UseCaseStep__Group_3__2__Impl rule__UseCaseStep__Group_3__3 )
            // InternalUseCaseDslParser.g:2104:2: rule__UseCaseStep__Group_3__2__Impl rule__UseCaseStep__Group_3__3
            {
            pushFollow(FOLLOW_24);
            rule__UseCaseStep__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__2"


    // $ANTLR start "rule__UseCaseStep__Group_3__2__Impl"
    // InternalUseCaseDslParser.g:2111:1: rule__UseCaseStep__Group_3__2__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2115:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2116:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2116:1: ( FullStop )
            // InternalUseCaseDslParser.g:2117:2: FullStop
            {
             before(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_3_2()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__2__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_3__3"
    // InternalUseCaseDslParser.g:2126:1: rule__UseCaseStep__Group_3__3 : rule__UseCaseStep__Group_3__3__Impl rule__UseCaseStep__Group_3__4 ;
    public final void rule__UseCaseStep__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2130:1: ( rule__UseCaseStep__Group_3__3__Impl rule__UseCaseStep__Group_3__4 )
            // InternalUseCaseDslParser.g:2131:2: rule__UseCaseStep__Group_3__3__Impl rule__UseCaseStep__Group_3__4
            {
            pushFollow(FOLLOW_18);
            rule__UseCaseStep__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__3"


    // $ANTLR start "rule__UseCaseStep__Group_3__3__Impl"
    // InternalUseCaseDslParser.g:2138:1: rule__UseCaseStep__Group_3__3__Impl : ( WHILE ) ;
    public final void rule__UseCaseStep__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2142:1: ( ( WHILE ) )
            // InternalUseCaseDslParser.g:2143:1: ( WHILE )
            {
            // InternalUseCaseDslParser.g:2143:1: ( WHILE )
            // InternalUseCaseDslParser.g:2144:2: WHILE
            {
             before(grammarAccess.getUseCaseStepAccess().getWHILEKeyword_3_3()); 
            match(input,WHILE,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getWHILEKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__3__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_3__4"
    // InternalUseCaseDslParser.g:2153:1: rule__UseCaseStep__Group_3__4 : rule__UseCaseStep__Group_3__4__Impl rule__UseCaseStep__Group_3__5 ;
    public final void rule__UseCaseStep__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2157:1: ( rule__UseCaseStep__Group_3__4__Impl rule__UseCaseStep__Group_3__5 )
            // InternalUseCaseDslParser.g:2158:2: rule__UseCaseStep__Group_3__4__Impl rule__UseCaseStep__Group_3__5
            {
            pushFollow(FOLLOW_11);
            rule__UseCaseStep__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__4"


    // $ANTLR start "rule__UseCaseStep__Group_3__4__Impl"
    // InternalUseCaseDslParser.g:2165:1: rule__UseCaseStep__Group_3__4__Impl : ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_4 ) ) ;
    public final void rule__UseCaseStep__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2169:1: ( ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_4 ) ) )
            // InternalUseCaseDslParser.g:2170:1: ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_4 ) )
            {
            // InternalUseCaseDslParser.g:2170:1: ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_4 ) )
            // InternalUseCaseDslParser.g:2171:2: ( rule__UseCaseStep__RepeatingConditionAssignment_3_4 )
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatingConditionAssignment_3_4()); 
            // InternalUseCaseDslParser.g:2172:2: ( rule__UseCaseStep__RepeatingConditionAssignment_3_4 )
            // InternalUseCaseDslParser.g:2172:3: rule__UseCaseStep__RepeatingConditionAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__RepeatingConditionAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getRepeatingConditionAssignment_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__4__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_3__5"
    // InternalUseCaseDslParser.g:2180:1: rule__UseCaseStep__Group_3__5 : rule__UseCaseStep__Group_3__5__Impl rule__UseCaseStep__Group_3__6 ;
    public final void rule__UseCaseStep__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2184:1: ( rule__UseCaseStep__Group_3__5__Impl rule__UseCaseStep__Group_3__6 )
            // InternalUseCaseDslParser.g:2185:2: rule__UseCaseStep__Group_3__5__Impl rule__UseCaseStep__Group_3__6
            {
            pushFollow(FOLLOW_6);
            rule__UseCaseStep__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__5"


    // $ANTLR start "rule__UseCaseStep__Group_3__5__Impl"
    // InternalUseCaseDslParser.g:2192:1: rule__UseCaseStep__Group_3__5__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCaseStep__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2196:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:2197:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:2197:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:2198:2: RULE_BEGIN
            {
             before(grammarAccess.getUseCaseStepAccess().getBEGINTerminalRuleCall_3_5()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getBEGINTerminalRuleCall_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__5__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_3__6"
    // InternalUseCaseDslParser.g:2207:1: rule__UseCaseStep__Group_3__6 : rule__UseCaseStep__Group_3__6__Impl rule__UseCaseStep__Group_3__7 ;
    public final void rule__UseCaseStep__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2211:1: ( rule__UseCaseStep__Group_3__6__Impl rule__UseCaseStep__Group_3__7 )
            // InternalUseCaseDslParser.g:2212:2: rule__UseCaseStep__Group_3__6__Impl rule__UseCaseStep__Group_3__7
            {
            pushFollow(FOLLOW_12);
            rule__UseCaseStep__Group_3__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__6"


    // $ANTLR start "rule__UseCaseStep__Group_3__6__Impl"
    // InternalUseCaseDslParser.g:2219:1: rule__UseCaseStep__Group_3__6__Impl : ( ( ( rule__UseCaseStep__Group_3_6__0 ) ) ( ( rule__UseCaseStep__Group_3_6__0 )* ) ) ;
    public final void rule__UseCaseStep__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2223:1: ( ( ( ( rule__UseCaseStep__Group_3_6__0 ) ) ( ( rule__UseCaseStep__Group_3_6__0 )* ) ) )
            // InternalUseCaseDslParser.g:2224:1: ( ( ( rule__UseCaseStep__Group_3_6__0 ) ) ( ( rule__UseCaseStep__Group_3_6__0 )* ) )
            {
            // InternalUseCaseDslParser.g:2224:1: ( ( ( rule__UseCaseStep__Group_3_6__0 ) ) ( ( rule__UseCaseStep__Group_3_6__0 )* ) )
            // InternalUseCaseDslParser.g:2225:2: ( ( rule__UseCaseStep__Group_3_6__0 ) ) ( ( rule__UseCaseStep__Group_3_6__0 )* )
            {
            // InternalUseCaseDslParser.g:2225:2: ( ( rule__UseCaseStep__Group_3_6__0 ) )
            // InternalUseCaseDslParser.g:2226:3: ( rule__UseCaseStep__Group_3_6__0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_3_6()); 
            // InternalUseCaseDslParser.g:2227:3: ( rule__UseCaseStep__Group_3_6__0 )
            // InternalUseCaseDslParser.g:2227:4: rule__UseCaseStep__Group_3_6__0
            {
            pushFollow(FOLLOW_13);
            rule__UseCaseStep__Group_3_6__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getGroup_3_6()); 

            }

            // InternalUseCaseDslParser.g:2230:2: ( ( rule__UseCaseStep__Group_3_6__0 )* )
            // InternalUseCaseDslParser.g:2231:3: ( rule__UseCaseStep__Group_3_6__0 )*
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_3_6()); 
            // InternalUseCaseDslParser.g:2232:3: ( rule__UseCaseStep__Group_3_6__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_INT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:2232:4: rule__UseCaseStep__Group_3_6__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UseCaseStep__Group_3_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getUseCaseStepAccess().getGroup_3_6()); 

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
    // $ANTLR end "rule__UseCaseStep__Group_3__6__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_3__7"
    // InternalUseCaseDslParser.g:2241:1: rule__UseCaseStep__Group_3__7 : rule__UseCaseStep__Group_3__7__Impl ;
    public final void rule__UseCaseStep__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2245:1: ( rule__UseCaseStep__Group_3__7__Impl )
            // InternalUseCaseDslParser.g:2246:2: rule__UseCaseStep__Group_3__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__7"


    // $ANTLR start "rule__UseCaseStep__Group_3__7__Impl"
    // InternalUseCaseDslParser.g:2252:1: rule__UseCaseStep__Group_3__7__Impl : ( RULE_END ) ;
    public final void rule__UseCaseStep__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2256:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:2257:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:2257:1: ( RULE_END )
            // InternalUseCaseDslParser.g:2258:2: RULE_END
            {
             before(grammarAccess.getUseCaseStepAccess().getENDTerminalRuleCall_3_7()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getENDTerminalRuleCall_3_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__7__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_3_6__0"
    // InternalUseCaseDslParser.g:2268:1: rule__UseCaseStep__Group_3_6__0 : rule__UseCaseStep__Group_3_6__0__Impl rule__UseCaseStep__Group_3_6__1 ;
    public final void rule__UseCaseStep__Group_3_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2272:1: ( rule__UseCaseStep__Group_3_6__0__Impl rule__UseCaseStep__Group_3_6__1 )
            // InternalUseCaseDslParser.g:2273:2: rule__UseCaseStep__Group_3_6__0__Impl rule__UseCaseStep__Group_3_6__1
            {
            pushFollow(FOLLOW_6);
            rule__UseCaseStep__Group_3_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3_6__0"


    // $ANTLR start "rule__UseCaseStep__Group_3_6__0__Impl"
    // InternalUseCaseDslParser.g:2280:1: rule__UseCaseStep__Group_3_6__0__Impl : ( ( ( rule__UseCaseStep__Group_3_6_0__0 ) ) ( ( rule__UseCaseStep__Group_3_6_0__0 )* ) ) ;
    public final void rule__UseCaseStep__Group_3_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2284:1: ( ( ( ( rule__UseCaseStep__Group_3_6_0__0 ) ) ( ( rule__UseCaseStep__Group_3_6_0__0 )* ) ) )
            // InternalUseCaseDslParser.g:2285:1: ( ( ( rule__UseCaseStep__Group_3_6_0__0 ) ) ( ( rule__UseCaseStep__Group_3_6_0__0 )* ) )
            {
            // InternalUseCaseDslParser.g:2285:1: ( ( ( rule__UseCaseStep__Group_3_6_0__0 ) ) ( ( rule__UseCaseStep__Group_3_6_0__0 )* ) )
            // InternalUseCaseDslParser.g:2286:2: ( ( rule__UseCaseStep__Group_3_6_0__0 ) ) ( ( rule__UseCaseStep__Group_3_6_0__0 )* )
            {
            // InternalUseCaseDslParser.g:2286:2: ( ( rule__UseCaseStep__Group_3_6_0__0 ) )
            // InternalUseCaseDslParser.g:2287:3: ( rule__UseCaseStep__Group_3_6_0__0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_3_6_0()); 
            // InternalUseCaseDslParser.g:2288:3: ( rule__UseCaseStep__Group_3_6_0__0 )
            // InternalUseCaseDslParser.g:2288:4: rule__UseCaseStep__Group_3_6_0__0
            {
            pushFollow(FOLLOW_13);
            rule__UseCaseStep__Group_3_6_0__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getGroup_3_6_0()); 

            }

            // InternalUseCaseDslParser.g:2291:2: ( ( rule__UseCaseStep__Group_3_6_0__0 )* )
            // InternalUseCaseDslParser.g:2292:3: ( rule__UseCaseStep__Group_3_6_0__0 )*
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_3_6_0()); 
            // InternalUseCaseDslParser.g:2293:3: ( rule__UseCaseStep__Group_3_6_0__0 )*
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
            	    // InternalUseCaseDslParser.g:2293:4: rule__UseCaseStep__Group_3_6_0__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UseCaseStep__Group_3_6_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getUseCaseStepAccess().getGroup_3_6_0()); 

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
    // $ANTLR end "rule__UseCaseStep__Group_3_6__0__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_3_6__1"
    // InternalUseCaseDslParser.g:2302:1: rule__UseCaseStep__Group_3_6__1 : rule__UseCaseStep__Group_3_6__1__Impl ;
    public final void rule__UseCaseStep__Group_3_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2306:1: ( rule__UseCaseStep__Group_3_6__1__Impl )
            // InternalUseCaseDslParser.g:2307:2: rule__UseCaseStep__Group_3_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3_6__1"


    // $ANTLR start "rule__UseCaseStep__Group_3_6__1__Impl"
    // InternalUseCaseDslParser.g:2313:1: rule__UseCaseStep__Group_3_6__1__Impl : ( ( rule__UseCaseStep__RepeatflowAssignment_3_6_1 ) ) ;
    public final void rule__UseCaseStep__Group_3_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2317:1: ( ( ( rule__UseCaseStep__RepeatflowAssignment_3_6_1 ) ) )
            // InternalUseCaseDslParser.g:2318:1: ( ( rule__UseCaseStep__RepeatflowAssignment_3_6_1 ) )
            {
            // InternalUseCaseDslParser.g:2318:1: ( ( rule__UseCaseStep__RepeatflowAssignment_3_6_1 ) )
            // InternalUseCaseDslParser.g:2319:2: ( rule__UseCaseStep__RepeatflowAssignment_3_6_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatflowAssignment_3_6_1()); 
            // InternalUseCaseDslParser.g:2320:2: ( rule__UseCaseStep__RepeatflowAssignment_3_6_1 )
            // InternalUseCaseDslParser.g:2320:3: rule__UseCaseStep__RepeatflowAssignment_3_6_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__RepeatflowAssignment_3_6_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getRepeatflowAssignment_3_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3_6__1__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_3_6_0__0"
    // InternalUseCaseDslParser.g:2329:1: rule__UseCaseStep__Group_3_6_0__0 : rule__UseCaseStep__Group_3_6_0__0__Impl rule__UseCaseStep__Group_3_6_0__1 ;
    public final void rule__UseCaseStep__Group_3_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2333:1: ( rule__UseCaseStep__Group_3_6_0__0__Impl rule__UseCaseStep__Group_3_6_0__1 )
            // InternalUseCaseDslParser.g:2334:2: rule__UseCaseStep__Group_3_6_0__0__Impl rule__UseCaseStep__Group_3_6_0__1
            {
            pushFollow(FOLLOW_16);
            rule__UseCaseStep__Group_3_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3_6_0__0"


    // $ANTLR start "rule__UseCaseStep__Group_3_6_0__0__Impl"
    // InternalUseCaseDslParser.g:2341:1: rule__UseCaseStep__Group_3_6_0__0__Impl : ( ( rule__UseCaseStep__ParentAssignment_3_6_0_0 ) ) ;
    public final void rule__UseCaseStep__Group_3_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2345:1: ( ( ( rule__UseCaseStep__ParentAssignment_3_6_0_0 ) ) )
            // InternalUseCaseDslParser.g:2346:1: ( ( rule__UseCaseStep__ParentAssignment_3_6_0_0 ) )
            {
            // InternalUseCaseDslParser.g:2346:1: ( ( rule__UseCaseStep__ParentAssignment_3_6_0_0 ) )
            // InternalUseCaseDslParser.g:2347:2: ( rule__UseCaseStep__ParentAssignment_3_6_0_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentAssignment_3_6_0_0()); 
            // InternalUseCaseDslParser.g:2348:2: ( rule__UseCaseStep__ParentAssignment_3_6_0_0 )
            // InternalUseCaseDslParser.g:2348:3: rule__UseCaseStep__ParentAssignment_3_6_0_0
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__ParentAssignment_3_6_0_0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getParentAssignment_3_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3_6_0__0__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_3_6_0__1"
    // InternalUseCaseDslParser.g:2356:1: rule__UseCaseStep__Group_3_6_0__1 : rule__UseCaseStep__Group_3_6_0__1__Impl ;
    public final void rule__UseCaseStep__Group_3_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2360:1: ( rule__UseCaseStep__Group_3_6_0__1__Impl )
            // InternalUseCaseDslParser.g:2361:2: rule__UseCaseStep__Group_3_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3_6_0__1"


    // $ANTLR start "rule__UseCaseStep__Group_3_6_0__1__Impl"
    // InternalUseCaseDslParser.g:2367:1: rule__UseCaseStep__Group_3_6_0__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_3_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2371:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2372:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2372:1: ( FullStop )
            // InternalUseCaseDslParser.g:2373:2: FullStop
            {
             before(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_3_6_0_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_3_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3_6_0__1__Impl"


    // $ANTLR start "rule__ExtensionStep__Group_0__0"
    // InternalUseCaseDslParser.g:2383:1: rule__ExtensionStep__Group_0__0 : rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1 ;
    public final void rule__ExtensionStep__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2387:1: ( rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1 )
            // InternalUseCaseDslParser.g:2388:2: rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1
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
    // InternalUseCaseDslParser.g:2395:1: rule__ExtensionStep__Group_0__0__Impl : ( ( rule__ExtensionStep__NameAssignment_0_0 ) ) ;
    public final void rule__ExtensionStep__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2399:1: ( ( ( rule__ExtensionStep__NameAssignment_0_0 ) ) )
            // InternalUseCaseDslParser.g:2400:1: ( ( rule__ExtensionStep__NameAssignment_0_0 ) )
            {
            // InternalUseCaseDslParser.g:2400:1: ( ( rule__ExtensionStep__NameAssignment_0_0 ) )
            // InternalUseCaseDslParser.g:2401:2: ( rule__ExtensionStep__NameAssignment_0_0 )
            {
             before(grammarAccess.getExtensionStepAccess().getNameAssignment_0_0()); 
            // InternalUseCaseDslParser.g:2402:2: ( rule__ExtensionStep__NameAssignment_0_0 )
            // InternalUseCaseDslParser.g:2402:3: rule__ExtensionStep__NameAssignment_0_0
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
    // InternalUseCaseDslParser.g:2410:1: rule__ExtensionStep__Group_0__1 : rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2 ;
    public final void rule__ExtensionStep__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2414:1: ( rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2 )
            // InternalUseCaseDslParser.g:2415:2: rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalUseCaseDslParser.g:2422:1: rule__ExtensionStep__Group_0__1__Impl : ( FullStop ) ;
    public final void rule__ExtensionStep__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2426:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2427:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2427:1: ( FullStop )
            // InternalUseCaseDslParser.g:2428:2: FullStop
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
    // InternalUseCaseDslParser.g:2437:1: rule__ExtensionStep__Group_0__2 : rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3 ;
    public final void rule__ExtensionStep__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2441:1: ( rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3 )
            // InternalUseCaseDslParser.g:2442:2: rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalUseCaseDslParser.g:2449:1: rule__ExtensionStep__Group_0__2__Impl : ( ( rule__ExtensionStep__Alternatives_0_2 )? ) ;
    public final void rule__ExtensionStep__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2453:1: ( ( ( rule__ExtensionStep__Alternatives_0_2 )? ) )
            // InternalUseCaseDslParser.g:2454:1: ( ( rule__ExtensionStep__Alternatives_0_2 )? )
            {
            // InternalUseCaseDslParser.g:2454:1: ( ( rule__ExtensionStep__Alternatives_0_2 )? )
            // InternalUseCaseDslParser.g:2455:2: ( rule__ExtensionStep__Alternatives_0_2 )?
            {
             before(grammarAccess.getExtensionStepAccess().getAlternatives_0_2()); 
            // InternalUseCaseDslParser.g:2456:2: ( rule__ExtensionStep__Alternatives_0_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=SYSTEM && LA22_0<=WHILE)||LA22_0==USER) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUseCaseDslParser.g:2456:3: rule__ExtensionStep__Alternatives_0_2
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
    // InternalUseCaseDslParser.g:2464:1: rule__ExtensionStep__Group_0__3 : rule__ExtensionStep__Group_0__3__Impl ;
    public final void rule__ExtensionStep__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2468:1: ( rule__ExtensionStep__Group_0__3__Impl )
            // InternalUseCaseDslParser.g:2469:2: rule__ExtensionStep__Group_0__3__Impl
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
    // InternalUseCaseDslParser.g:2475:1: rule__ExtensionStep__Group_0__3__Impl : ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) ) ;
    public final void rule__ExtensionStep__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2479:1: ( ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) ) )
            // InternalUseCaseDslParser.g:2480:1: ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) )
            {
            // InternalUseCaseDslParser.g:2480:1: ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) )
            // InternalUseCaseDslParser.g:2481:2: ( rule__ExtensionStep__SentenceAssignment_0_3 )
            {
             before(grammarAccess.getExtensionStepAccess().getSentenceAssignment_0_3()); 
            // InternalUseCaseDslParser.g:2482:2: ( rule__ExtensionStep__SentenceAssignment_0_3 )
            // InternalUseCaseDslParser.g:2482:3: rule__ExtensionStep__SentenceAssignment_0_3
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
    // InternalUseCaseDslParser.g:2491:1: rule__DeadEndStep__Group__0 : rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1 ;
    public final void rule__DeadEndStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2495:1: ( rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1 )
            // InternalUseCaseDslParser.g:2496:2: rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1
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
    // InternalUseCaseDslParser.g:2503:1: rule__DeadEndStep__Group__0__Impl : ( ( rule__DeadEndStep__NameAssignment_0 ) ) ;
    public final void rule__DeadEndStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2507:1: ( ( ( rule__DeadEndStep__NameAssignment_0 ) ) )
            // InternalUseCaseDslParser.g:2508:1: ( ( rule__DeadEndStep__NameAssignment_0 ) )
            {
            // InternalUseCaseDslParser.g:2508:1: ( ( rule__DeadEndStep__NameAssignment_0 ) )
            // InternalUseCaseDslParser.g:2509:2: ( rule__DeadEndStep__NameAssignment_0 )
            {
             before(grammarAccess.getDeadEndStepAccess().getNameAssignment_0()); 
            // InternalUseCaseDslParser.g:2510:2: ( rule__DeadEndStep__NameAssignment_0 )
            // InternalUseCaseDslParser.g:2510:3: rule__DeadEndStep__NameAssignment_0
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
    // InternalUseCaseDslParser.g:2518:1: rule__DeadEndStep__Group__1 : rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2 ;
    public final void rule__DeadEndStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2522:1: ( rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2 )
            // InternalUseCaseDslParser.g:2523:2: rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalUseCaseDslParser.g:2530:1: rule__DeadEndStep__Group__1__Impl : ( FullStop ) ;
    public final void rule__DeadEndStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2534:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2535:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2535:1: ( FullStop )
            // InternalUseCaseDslParser.g:2536:2: FullStop
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
    // InternalUseCaseDslParser.g:2545:1: rule__DeadEndStep__Group__2 : rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3 ;
    public final void rule__DeadEndStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2549:1: ( rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3 )
            // InternalUseCaseDslParser.g:2550:2: rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalUseCaseDslParser.g:2557:1: rule__DeadEndStep__Group__2__Impl : ( ( rule__DeadEndStep__Alternatives_2 )? ) ;
    public final void rule__DeadEndStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2561:1: ( ( ( rule__DeadEndStep__Alternatives_2 )? ) )
            // InternalUseCaseDslParser.g:2562:1: ( ( rule__DeadEndStep__Alternatives_2 )? )
            {
            // InternalUseCaseDslParser.g:2562:1: ( ( rule__DeadEndStep__Alternatives_2 )? )
            // InternalUseCaseDslParser.g:2563:2: ( rule__DeadEndStep__Alternatives_2 )?
            {
             before(grammarAccess.getDeadEndStepAccess().getAlternatives_2()); 
            // InternalUseCaseDslParser.g:2564:2: ( rule__DeadEndStep__Alternatives_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=SYSTEM && LA23_0<=WHILE)||LA23_0==USER) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUseCaseDslParser.g:2564:3: rule__DeadEndStep__Alternatives_2
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
    // InternalUseCaseDslParser.g:2572:1: rule__DeadEndStep__Group__3 : rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4 ;
    public final void rule__DeadEndStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2576:1: ( rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4 )
            // InternalUseCaseDslParser.g:2577:2: rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalUseCaseDslParser.g:2584:1: rule__DeadEndStep__Group__3__Impl : ( ( rule__DeadEndStep__SentenceAssignment_3 )? ) ;
    public final void rule__DeadEndStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2588:1: ( ( ( rule__DeadEndStep__SentenceAssignment_3 )? ) )
            // InternalUseCaseDslParser.g:2589:1: ( ( rule__DeadEndStep__SentenceAssignment_3 )? )
            {
            // InternalUseCaseDslParser.g:2589:1: ( ( rule__DeadEndStep__SentenceAssignment_3 )? )
            // InternalUseCaseDslParser.g:2590:2: ( rule__DeadEndStep__SentenceAssignment_3 )?
            {
             before(grammarAccess.getDeadEndStepAccess().getSentenceAssignment_3()); 
            // InternalUseCaseDslParser.g:2591:2: ( rule__DeadEndStep__SentenceAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=QuotationMark && LA24_0<=RULE_CHAR)||LA24_0==RULE_ID||LA24_0==RULE_ANY_OTHER) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCaseDslParser.g:2591:3: rule__DeadEndStep__SentenceAssignment_3
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
    // InternalUseCaseDslParser.g:2599:1: rule__DeadEndStep__Group__4 : rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5 ;
    public final void rule__DeadEndStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2603:1: ( rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5 )
            // InternalUseCaseDslParser.g:2604:2: rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalUseCaseDslParser.g:2611:1: rule__DeadEndStep__Group__4__Impl : ( UC ) ;
    public final void rule__DeadEndStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2615:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:2616:1: ( UC )
            {
            // InternalUseCaseDslParser.g:2616:1: ( UC )
            // InternalUseCaseDslParser.g:2617:2: UC
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
    // InternalUseCaseDslParser.g:2626:1: rule__DeadEndStep__Group__5 : rule__DeadEndStep__Group__5__Impl ;
    public final void rule__DeadEndStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2630:1: ( rule__DeadEndStep__Group__5__Impl )
            // InternalUseCaseDslParser.g:2631:2: rule__DeadEndStep__Group__5__Impl
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
    // InternalUseCaseDslParser.g:2637:1: rule__DeadEndStep__Group__5__Impl : ( END ) ;
    public final void rule__DeadEndStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2641:1: ( ( END ) )
            // InternalUseCaseDslParser.g:2642:1: ( END )
            {
            // InternalUseCaseDslParser.g:2642:1: ( END )
            // InternalUseCaseDslParser.g:2643:2: END
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
    // InternalUseCaseDslParser.g:2653:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2657:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalUseCaseDslParser.g:2658:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
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
    // InternalUseCaseDslParser.g:2665:1: rule__Precondition__Group__0__Impl : ( ( rule__Precondition__NameAssignment_0 ) ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2669:1: ( ( ( rule__Precondition__NameAssignment_0 ) ) )
            // InternalUseCaseDslParser.g:2670:1: ( ( rule__Precondition__NameAssignment_0 ) )
            {
            // InternalUseCaseDslParser.g:2670:1: ( ( rule__Precondition__NameAssignment_0 ) )
            // InternalUseCaseDslParser.g:2671:2: ( rule__Precondition__NameAssignment_0 )
            {
             before(grammarAccess.getPreconditionAccess().getNameAssignment_0()); 
            // InternalUseCaseDslParser.g:2672:2: ( rule__Precondition__NameAssignment_0 )
            // InternalUseCaseDslParser.g:2672:3: rule__Precondition__NameAssignment_0
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
    // InternalUseCaseDslParser.g:2680:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl rule__Precondition__Group__2 ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2684:1: ( rule__Precondition__Group__1__Impl rule__Precondition__Group__2 )
            // InternalUseCaseDslParser.g:2685:2: rule__Precondition__Group__1__Impl rule__Precondition__Group__2
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
    // InternalUseCaseDslParser.g:2692:1: rule__Precondition__Group__1__Impl : ( Colon ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2696:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:2697:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:2697:1: ( Colon )
            // InternalUseCaseDslParser.g:2698:2: Colon
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
    // InternalUseCaseDslParser.g:2707:1: rule__Precondition__Group__2 : rule__Precondition__Group__2__Impl ;
    public final void rule__Precondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2711:1: ( rule__Precondition__Group__2__Impl )
            // InternalUseCaseDslParser.g:2712:2: rule__Precondition__Group__2__Impl
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
    // InternalUseCaseDslParser.g:2718:1: rule__Precondition__Group__2__Impl : ( ( rule__Precondition__ConditionAssignment_2 ) ) ;
    public final void rule__Precondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2722:1: ( ( ( rule__Precondition__ConditionAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:2723:1: ( ( rule__Precondition__ConditionAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:2723:1: ( ( rule__Precondition__ConditionAssignment_2 ) )
            // InternalUseCaseDslParser.g:2724:2: ( rule__Precondition__ConditionAssignment_2 )
            {
             before(grammarAccess.getPreconditionAccess().getConditionAssignment_2()); 
            // InternalUseCaseDslParser.g:2725:2: ( rule__Precondition__ConditionAssignment_2 )
            // InternalUseCaseDslParser.g:2725:3: rule__Precondition__ConditionAssignment_2
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
    // InternalUseCaseDslParser.g:2734:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2738:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalUseCaseDslParser.g:2739:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
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
    // InternalUseCaseDslParser.g:2746:1: rule__Postcondition__Group__0__Impl : ( ( rule__Postcondition__NameAssignment_0 ) ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2750:1: ( ( ( rule__Postcondition__NameAssignment_0 ) ) )
            // InternalUseCaseDslParser.g:2751:1: ( ( rule__Postcondition__NameAssignment_0 ) )
            {
            // InternalUseCaseDslParser.g:2751:1: ( ( rule__Postcondition__NameAssignment_0 ) )
            // InternalUseCaseDslParser.g:2752:2: ( rule__Postcondition__NameAssignment_0 )
            {
             before(grammarAccess.getPostconditionAccess().getNameAssignment_0()); 
            // InternalUseCaseDslParser.g:2753:2: ( rule__Postcondition__NameAssignment_0 )
            // InternalUseCaseDslParser.g:2753:3: rule__Postcondition__NameAssignment_0
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
    // InternalUseCaseDslParser.g:2761:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2765:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalUseCaseDslParser.g:2766:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
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
    // InternalUseCaseDslParser.g:2773:1: rule__Postcondition__Group__1__Impl : ( Colon ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2777:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:2778:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:2778:1: ( Colon )
            // InternalUseCaseDslParser.g:2779:2: Colon
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
    // InternalUseCaseDslParser.g:2788:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2792:1: ( rule__Postcondition__Group__2__Impl )
            // InternalUseCaseDslParser.g:2793:2: rule__Postcondition__Group__2__Impl
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
    // InternalUseCaseDslParser.g:2799:1: rule__Postcondition__Group__2__Impl : ( ( rule__Postcondition__ConditionAssignment_2 ) ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2803:1: ( ( ( rule__Postcondition__ConditionAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:2804:1: ( ( rule__Postcondition__ConditionAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:2804:1: ( ( rule__Postcondition__ConditionAssignment_2 ) )
            // InternalUseCaseDslParser.g:2805:2: ( rule__Postcondition__ConditionAssignment_2 )
            {
             before(grammarAccess.getPostconditionAccess().getConditionAssignment_2()); 
            // InternalUseCaseDslParser.g:2806:2: ( rule__Postcondition__ConditionAssignment_2 )
            // InternalUseCaseDslParser.g:2806:3: rule__Postcondition__ConditionAssignment_2
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
    // InternalUseCaseDslParser.g:2815:1: rule__UseCaseDocument__UsecaseAssignment : ( ruleUseCase ) ;
    public final void rule__UseCaseDocument__UsecaseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2819:1: ( ( ruleUseCase ) )
            // InternalUseCaseDslParser.g:2820:2: ( ruleUseCase )
            {
            // InternalUseCaseDslParser.g:2820:2: ( ruleUseCase )
            // InternalUseCaseDslParser.g:2821:3: ruleUseCase
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
    // InternalUseCaseDslParser.g:2830:1: rule__UseCase__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__UseCase__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2834:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:2835:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:2835:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:2836:3: RULE_INT
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
    // InternalUseCaseDslParser.g:2845:1: rule__UseCase__NameAssignment_3 : ( ruleLongName ) ;
    public final void rule__UseCase__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2849:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:2850:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:2850:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:2851:3: ruleLongName
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
    // InternalUseCaseDslParser.g:2860:1: rule__UseCase__PreconditionAssignment_4 : ( rulePrecondition ) ;
    public final void rule__UseCase__PreconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2864:1: ( ( rulePrecondition ) )
            // InternalUseCaseDslParser.g:2865:2: ( rulePrecondition )
            {
            // InternalUseCaseDslParser.g:2865:2: ( rulePrecondition )
            // InternalUseCaseDslParser.g:2866:3: rulePrecondition
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
    // InternalUseCaseDslParser.g:2875:1: rule__UseCase__PostconditionAssignment_5 : ( rulePostcondition ) ;
    public final void rule__UseCase__PostconditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2879:1: ( ( rulePostcondition ) )
            // InternalUseCaseDslParser.g:2880:2: ( rulePostcondition )
            {
            // InternalUseCaseDslParser.g:2880:2: ( rulePostcondition )
            // InternalUseCaseDslParser.g:2881:3: rulePostcondition
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
    // InternalUseCaseDslParser.g:2890:1: rule__UseCase__StepsAssignment_10 : ( ruleUseCaseStep ) ;
    public final void rule__UseCase__StepsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2894:1: ( ( ruleUseCaseStep ) )
            // InternalUseCaseDslParser.g:2895:2: ( ruleUseCaseStep )
            {
            // InternalUseCaseDslParser.g:2895:2: ( ruleUseCaseStep )
            // InternalUseCaseDslParser.g:2896:3: ruleUseCaseStep
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
    // InternalUseCaseDslParser.g:2905:1: rule__UseCase__AlternativeflowsAssignment_12_3 : ( ruleExtension ) ;
    public final void rule__UseCase__AlternativeflowsAssignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2909:1: ( ( ruleExtension ) )
            // InternalUseCaseDslParser.g:2910:2: ( ruleExtension )
            {
            // InternalUseCaseDslParser.g:2910:2: ( ruleExtension )
            // InternalUseCaseDslParser.g:2911:3: ruleExtension
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
    // InternalUseCaseDslParser.g:2920:1: rule__Extension__StartFromAssignment_0_0 : ( ruleStepName ) ;
    public final void rule__Extension__StartFromAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2924:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:2925:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:2925:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:2926:3: ruleStepName
            {
             before(grammarAccess.getExtensionAccess().getStartFromStepNameParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getStartFromStepNameParserRuleCall_0_0_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2935:1: rule__Extension__NameAssignment_1 : ( RULE_CHAR ) ;
    public final void rule__Extension__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2939:1: ( ( RULE_CHAR ) )
            // InternalUseCaseDslParser.g:2940:2: ( RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:2940:2: ( RULE_CHAR )
            // InternalUseCaseDslParser.g:2941:3: RULE_CHAR
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
    // InternalUseCaseDslParser.g:2950:1: rule__Extension__ConditionAssignment_4 : ( ruleCondition ) ;
    public final void rule__Extension__ConditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2954:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:2955:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:2955:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:2956:3: ruleCondition
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
    // InternalUseCaseDslParser.g:2965:1: rule__Extension__StepsAssignment_6 : ( ruleExtensionStep ) ;
    public final void rule__Extension__StepsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2969:1: ( ( ruleExtensionStep ) )
            // InternalUseCaseDslParser.g:2970:2: ( ruleExtensionStep )
            {
            // InternalUseCaseDslParser.g:2970:2: ( ruleExtensionStep )
            // InternalUseCaseDslParser.g:2971:3: ruleExtensionStep
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
    // InternalUseCaseDslParser.g:2980:1: rule__Extension__ResumeAtAssignment_7_0_4_0 : ( ruleStepName ) ;
    public final void rule__Extension__ResumeAtAssignment_7_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2984:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:2985:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:2985:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:2986:3: ruleStepName
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
    // InternalUseCaseDslParser.g:2995:1: rule__Extension__EndAssignment_7_1 : ( ruleDeadEndStep ) ;
    public final void rule__Extension__EndAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2999:1: ( ( ruleDeadEndStep ) )
            // InternalUseCaseDslParser.g:3000:2: ( ruleDeadEndStep )
            {
            // InternalUseCaseDslParser.g:3000:2: ( ruleDeadEndStep )
            // InternalUseCaseDslParser.g:3001:3: ruleDeadEndStep
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


    // $ANTLR start "rule__UseCaseStep__NameAssignment_0_0"
    // InternalUseCaseDslParser.g:3010:1: rule__UseCaseStep__NameAssignment_0_0 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3014:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3015:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3015:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3016:3: ruleStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__NameAssignment_0_0"


    // $ANTLR start "rule__UseCaseStep__IncludeAssignment_0_3"
    // InternalUseCaseDslParser.g:3025:1: rule__UseCaseStep__IncludeAssignment_0_3 : ( ruleLongName ) ;
    public final void rule__UseCaseStep__IncludeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3029:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3030:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3030:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3031:3: ruleLongName
            {
             before(grammarAccess.getUseCaseStepAccess().getIncludeLongNameParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLongName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getIncludeLongNameParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__IncludeAssignment_0_3"


    // $ANTLR start "rule__UseCaseStep__NameAssignment_1_1"
    // InternalUseCaseDslParser.g:3040:1: rule__UseCaseStep__NameAssignment_1_1 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3044:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3045:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3045:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3046:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3055:1: rule__UseCaseStep__SentenceAssignment_1_4 : ( ruleLongName ) ;
    public final void rule__UseCaseStep__SentenceAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3059:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3060:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3060:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3061:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3070:1: rule__UseCaseStep__NameAssignment_2_1 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3074:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3075:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3075:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3076:3: ruleStepName
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


    // $ANTLR start "rule__UseCaseStep__SentenceAssignment_2_4"
    // InternalUseCaseDslParser.g:3085:1: rule__UseCaseStep__SentenceAssignment_2_4 : ( ruleLongName ) ;
    public final void rule__UseCaseStep__SentenceAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3089:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3090:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3090:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3091:3: ruleLongName
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLongName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__SentenceAssignment_2_4"


    // $ANTLR start "rule__UseCaseStep__NameAssignment_3_1"
    // InternalUseCaseDslParser.g:3100:1: rule__UseCaseStep__NameAssignment_3_1 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3104:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3105:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3105:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3106:3: ruleStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__NameAssignment_3_1"


    // $ANTLR start "rule__UseCaseStep__RepeatingConditionAssignment_3_4"
    // InternalUseCaseDslParser.g:3115:1: rule__UseCaseStep__RepeatingConditionAssignment_3_4 : ( ruleCondition ) ;
    public final void rule__UseCaseStep__RepeatingConditionAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3119:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3120:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3120:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3121:3: ruleCondition
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatingConditionConditionParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getRepeatingConditionConditionParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__RepeatingConditionAssignment_3_4"


    // $ANTLR start "rule__UseCaseStep__ParentAssignment_3_6_0_0"
    // InternalUseCaseDslParser.g:3130:1: rule__UseCaseStep__ParentAssignment_3_6_0_0 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__ParentAssignment_3_6_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3134:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3135:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3135:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3136:3: ruleStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getParentStepNameParserRuleCall_3_6_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getParentStepNameParserRuleCall_3_6_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__ParentAssignment_3_6_0_0"


    // $ANTLR start "rule__UseCaseStep__RepeatflowAssignment_3_6_1"
    // InternalUseCaseDslParser.g:3145:1: rule__UseCaseStep__RepeatflowAssignment_3_6_1 : ( ruleUseCaseStep ) ;
    public final void rule__UseCaseStep__RepeatflowAssignment_3_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3149:1: ( ( ruleUseCaseStep ) )
            // InternalUseCaseDslParser.g:3150:2: ( ruleUseCaseStep )
            {
            // InternalUseCaseDslParser.g:3150:2: ( ruleUseCaseStep )
            // InternalUseCaseDslParser.g:3151:3: ruleUseCaseStep
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatflowUseCaseStepParserRuleCall_3_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCaseStep();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getRepeatflowUseCaseStepParserRuleCall_3_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__RepeatflowAssignment_3_6_1"


    // $ANTLR start "rule__ExtensionStep__NameAssignment_0_0"
    // InternalUseCaseDslParser.g:3160:1: rule__ExtensionStep__NameAssignment_0_0 : ( ruleStepName ) ;
    public final void rule__ExtensionStep__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3164:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3165:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3165:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3166:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3175:1: rule__ExtensionStep__SentenceAssignment_0_3 : ( ruleLongName ) ;
    public final void rule__ExtensionStep__SentenceAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3179:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3180:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3180:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3181:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3190:1: rule__DeadEndStep__NameAssignment_0 : ( ruleStepName ) ;
    public final void rule__DeadEndStep__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3194:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3195:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3195:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3196:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3205:1: rule__DeadEndStep__SentenceAssignment_3 : ( ruleLongName ) ;
    public final void rule__DeadEndStep__SentenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3209:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3210:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3210:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3211:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3220:1: rule__Precondition__NameAssignment_0 : ( ( PRECONDITION ) ) ;
    public final void rule__Precondition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3224:1: ( ( ( PRECONDITION ) ) )
            // InternalUseCaseDslParser.g:3225:2: ( ( PRECONDITION ) )
            {
            // InternalUseCaseDslParser.g:3225:2: ( ( PRECONDITION ) )
            // InternalUseCaseDslParser.g:3226:3: ( PRECONDITION )
            {
             before(grammarAccess.getPreconditionAccess().getNamePRECONDITIONKeyword_0_0()); 
            // InternalUseCaseDslParser.g:3227:3: ( PRECONDITION )
            // InternalUseCaseDslParser.g:3228:4: PRECONDITION
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
    // InternalUseCaseDslParser.g:3239:1: rule__Precondition__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Precondition__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3243:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3244:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3244:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3245:3: ruleCondition
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
    // InternalUseCaseDslParser.g:3254:1: rule__Postcondition__NameAssignment_0 : ( ( POSTCONDITION ) ) ;
    public final void rule__Postcondition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3258:1: ( ( ( POSTCONDITION ) ) )
            // InternalUseCaseDslParser.g:3259:2: ( ( POSTCONDITION ) )
            {
            // InternalUseCaseDslParser.g:3259:2: ( ( POSTCONDITION ) )
            // InternalUseCaseDslParser.g:3260:3: ( POSTCONDITION )
            {
             before(grammarAccess.getPostconditionAccess().getNamePOSTCONDITIONKeyword_0_0()); 
            // InternalUseCaseDslParser.g:3261:3: ( POSTCONDITION )
            // InternalUseCaseDslParser.g:3262:4: POSTCONDITION
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
    // InternalUseCaseDslParser.g:3273:1: rule__Postcondition__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Postcondition__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3277:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3278:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3278:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3279:3: ruleCondition
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
    static final String dfa_3s = "\1\34\1\26\1\11\12\23\1\uffff\7\23\1\uffff";
    static final String dfa_4s = "\1\34\1\26\13\41\1\uffff\7\41\1\uffff";
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
            return "424:1: rule__ExtensionStep__Alternatives : ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ruleDeadEndStep ) );";
        }
    }
    static final String dfa_8s = "\30\uffff";
    static final String dfa_9s = "\1\34\1\26\1\10\12\23\1\uffff\1\17\7\23\1\uffff\1\32";
    static final String dfa_10s = "\1\34\1\26\13\41\1\uffff\1\17\7\41\1\uffff\1\34";
    static final String dfa_11s = "\15\uffff\1\2\10\uffff\1\1\1\uffff";
    static final String dfa_12s = "\30\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2",
            "\1\15\1\4\1\5\2\uffff\1\3\5\uffff\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "",
            "\1\27",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "",
            "\1\15\1\uffff\1\26"
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
            return "()* loopback of 1355:2: ( rule__Extension__StepsAssignment_6 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000209F00002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000209F24002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000209F00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000209F24000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000209F02600L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000209F82600L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000008000L});

}