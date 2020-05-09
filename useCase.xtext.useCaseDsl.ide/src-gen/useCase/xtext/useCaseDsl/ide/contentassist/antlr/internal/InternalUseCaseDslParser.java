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


    // $ANTLR start "entryRuleQualifiedStepName"
    // InternalUseCaseDslParser.g:371:1: entryRuleQualifiedStepName : ruleQualifiedStepName EOF ;
    public final void entryRuleQualifiedStepName() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:372:1: ( ruleQualifiedStepName EOF )
            // InternalUseCaseDslParser.g:373:1: ruleQualifiedStepName EOF
            {
             before(grammarAccess.getQualifiedStepNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedStepName();

            state._fsp--;

             after(grammarAccess.getQualifiedStepNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedStepName"


    // $ANTLR start "ruleQualifiedStepName"
    // InternalUseCaseDslParser.g:380:1: ruleQualifiedStepName : ( ( rule__QualifiedStepName__Group__0 ) ) ;
    public final void ruleQualifiedStepName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:384:2: ( ( ( rule__QualifiedStepName__Group__0 ) ) )
            // InternalUseCaseDslParser.g:385:2: ( ( rule__QualifiedStepName__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:385:2: ( ( rule__QualifiedStepName__Group__0 ) )
            // InternalUseCaseDslParser.g:386:3: ( rule__QualifiedStepName__Group__0 )
            {
             before(grammarAccess.getQualifiedStepNameAccess().getGroup()); 
            // InternalUseCaseDslParser.g:387:3: ( rule__QualifiedStepName__Group__0 )
            // InternalUseCaseDslParser.g:387:4: rule__QualifiedStepName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedStepName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedStepNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedStepName"


    // $ANTLR start "entryRuleQualifiedExtensionStepName"
    // InternalUseCaseDslParser.g:396:1: entryRuleQualifiedExtensionStepName : ruleQualifiedExtensionStepName EOF ;
    public final void entryRuleQualifiedExtensionStepName() throws RecognitionException {
        try {
            // InternalUseCaseDslParser.g:397:1: ( ruleQualifiedExtensionStepName EOF )
            // InternalUseCaseDslParser.g:398:1: ruleQualifiedExtensionStepName EOF
            {
             before(grammarAccess.getQualifiedExtensionStepNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedExtensionStepName();

            state._fsp--;

             after(grammarAccess.getQualifiedExtensionStepNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedExtensionStepName"


    // $ANTLR start "ruleQualifiedExtensionStepName"
    // InternalUseCaseDslParser.g:405:1: ruleQualifiedExtensionStepName : ( ( rule__QualifiedExtensionStepName__Group__0 ) ) ;
    public final void ruleQualifiedExtensionStepName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:409:2: ( ( ( rule__QualifiedExtensionStepName__Group__0 ) ) )
            // InternalUseCaseDslParser.g:410:2: ( ( rule__QualifiedExtensionStepName__Group__0 ) )
            {
            // InternalUseCaseDslParser.g:410:2: ( ( rule__QualifiedExtensionStepName__Group__0 ) )
            // InternalUseCaseDslParser.g:411:3: ( rule__QualifiedExtensionStepName__Group__0 )
            {
             before(grammarAccess.getQualifiedExtensionStepNameAccess().getGroup()); 
            // InternalUseCaseDslParser.g:412:3: ( rule__QualifiedExtensionStepName__Group__0 )
            // InternalUseCaseDslParser.g:412:4: rule__QualifiedExtensionStepName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedExtensionStepName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedExtensionStepNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedExtensionStepName"


    // $ANTLR start "rule__Extension__Alternatives_0"
    // InternalUseCaseDslParser.g:420:1: rule__Extension__Alternatives_0 : ( ( ( rule__Extension__StartFromAssignment_0_0 ) ) | ( ( rule__Extension__StartFromAssignment_0_1 ) ) );
    public final void rule__Extension__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:424:1: ( ( ( rule__Extension__StartFromAssignment_0_0 ) ) | ( ( rule__Extension__StartFromAssignment_0_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_CHAR) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUseCaseDslParser.g:425:2: ( ( rule__Extension__StartFromAssignment_0_0 ) )
                    {
                    // InternalUseCaseDslParser.g:425:2: ( ( rule__Extension__StartFromAssignment_0_0 ) )
                    // InternalUseCaseDslParser.g:426:3: ( rule__Extension__StartFromAssignment_0_0 )
                    {
                     before(grammarAccess.getExtensionAccess().getStartFromAssignment_0_0()); 
                    // InternalUseCaseDslParser.g:427:3: ( rule__Extension__StartFromAssignment_0_0 )
                    // InternalUseCaseDslParser.g:427:4: rule__Extension__StartFromAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extension__StartFromAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtensionAccess().getStartFromAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:431:2: ( ( rule__Extension__StartFromAssignment_0_1 ) )
                    {
                    // InternalUseCaseDslParser.g:431:2: ( ( rule__Extension__StartFromAssignment_0_1 ) )
                    // InternalUseCaseDslParser.g:432:3: ( rule__Extension__StartFromAssignment_0_1 )
                    {
                     before(grammarAccess.getExtensionAccess().getStartFromAssignment_0_1()); 
                    // InternalUseCaseDslParser.g:433:3: ( rule__Extension__StartFromAssignment_0_1 )
                    // InternalUseCaseDslParser.g:433:4: rule__Extension__StartFromAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extension__StartFromAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtensionAccess().getStartFromAssignment_0_1()); 

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
    // $ANTLR end "rule__Extension__Alternatives_0"


    // $ANTLR start "rule__Extension__Alternatives_8"
    // InternalUseCaseDslParser.g:441:1: rule__Extension__Alternatives_8 : ( ( ( rule__Extension__Group_8_0__0 ) ) | ( ( rule__Extension__EndAssignment_8_1 ) ) );
    public final void rule__Extension__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:445:1: ( ( ( rule__Extension__Group_8_0__0 ) ) | ( ( rule__Extension__EndAssignment_8_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==FullStop) ) {
                    int LA5_2 = input.LA(3);

                    if ( ((LA5_2>=SYSTEM && LA5_2<=WHILE)||LA5_2==USER||(LA5_2>=UC && LA5_2<=RULE_CHAR)||LA5_2==RULE_ID||LA5_2==RULE_ANY_OTHER) ) {
                        alt5=2;
                    }
                    else if ( (LA5_2==RETURN) ) {
                        alt5=1;
                    }
                    else {
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
                    // InternalUseCaseDslParser.g:446:2: ( ( rule__Extension__Group_8_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:446:2: ( ( rule__Extension__Group_8_0__0 ) )
                    // InternalUseCaseDslParser.g:447:3: ( rule__Extension__Group_8_0__0 )
                    {
                     before(grammarAccess.getExtensionAccess().getGroup_8_0()); 
                    // InternalUseCaseDslParser.g:448:3: ( rule__Extension__Group_8_0__0 )
                    // InternalUseCaseDslParser.g:448:4: rule__Extension__Group_8_0__0
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
                    // InternalUseCaseDslParser.g:452:2: ( ( rule__Extension__EndAssignment_8_1 ) )
                    {
                    // InternalUseCaseDslParser.g:452:2: ( ( rule__Extension__EndAssignment_8_1 ) )
                    // InternalUseCaseDslParser.g:453:3: ( rule__Extension__EndAssignment_8_1 )
                    {
                     before(grammarAccess.getExtensionAccess().getEndAssignment_8_1()); 
                    // InternalUseCaseDslParser.g:454:3: ( rule__Extension__EndAssignment_8_1 )
                    // InternalUseCaseDslParser.g:454:4: rule__Extension__EndAssignment_8_1
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


    // $ANTLR start "rule__Extension__Alternatives_8_0_4"
    // InternalUseCaseDslParser.g:462:1: rule__Extension__Alternatives_8_0_4 : ( ( ( rule__Extension__ResumeAtAssignment_8_0_4_0 ) ) | ( ( rule__Extension__ResumeAtAssignment_8_0_4_1 ) ) );
    public final void rule__Extension__Alternatives_8_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:466:1: ( ( ( rule__Extension__ResumeAtAssignment_8_0_4_0 ) ) | ( ( rule__Extension__ResumeAtAssignment_8_0_4_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_CHAR) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCaseDslParser.g:467:2: ( ( rule__Extension__ResumeAtAssignment_8_0_4_0 ) )
                    {
                    // InternalUseCaseDslParser.g:467:2: ( ( rule__Extension__ResumeAtAssignment_8_0_4_0 ) )
                    // InternalUseCaseDslParser.g:468:3: ( rule__Extension__ResumeAtAssignment_8_0_4_0 )
                    {
                     before(grammarAccess.getExtensionAccess().getResumeAtAssignment_8_0_4_0()); 
                    // InternalUseCaseDslParser.g:469:3: ( rule__Extension__ResumeAtAssignment_8_0_4_0 )
                    // InternalUseCaseDslParser.g:469:4: rule__Extension__ResumeAtAssignment_8_0_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extension__ResumeAtAssignment_8_0_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtensionAccess().getResumeAtAssignment_8_0_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:473:2: ( ( rule__Extension__ResumeAtAssignment_8_0_4_1 ) )
                    {
                    // InternalUseCaseDslParser.g:473:2: ( ( rule__Extension__ResumeAtAssignment_8_0_4_1 ) )
                    // InternalUseCaseDslParser.g:474:3: ( rule__Extension__ResumeAtAssignment_8_0_4_1 )
                    {
                     before(grammarAccess.getExtensionAccess().getResumeAtAssignment_8_0_4_1()); 
                    // InternalUseCaseDslParser.g:475:3: ( rule__Extension__ResumeAtAssignment_8_0_4_1 )
                    // InternalUseCaseDslParser.g:475:4: rule__Extension__ResumeAtAssignment_8_0_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Extension__ResumeAtAssignment_8_0_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtensionAccess().getResumeAtAssignment_8_0_4_1()); 

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
    // $ANTLR end "rule__Extension__Alternatives_8_0_4"


    // $ANTLR start "rule__UseCaseStep__Alternatives"
    // InternalUseCaseDslParser.g:483:1: rule__UseCaseStep__Alternatives : ( ( ( rule__UseCaseStep__Group_0__0 ) ) | ( ( rule__UseCaseStep__Group_1__0 ) ) | ( ( rule__UseCaseStep__Group_2__0 ) ) | ( ( rule__UseCaseStep__Group_3__0 ) ) );
    public final void rule__UseCaseStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:487:1: ( ( ( rule__UseCaseStep__Group_0__0 ) ) | ( ( rule__UseCaseStep__Group_1__0 ) ) | ( ( rule__UseCaseStep__Group_2__0 ) ) | ( ( rule__UseCaseStep__Group_3__0 ) ) )
            int alt7=4;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalUseCaseDslParser.g:488:2: ( ( rule__UseCaseStep__Group_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:488:2: ( ( rule__UseCaseStep__Group_0__0 ) )
                    // InternalUseCaseDslParser.g:489:3: ( rule__UseCaseStep__Group_0__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_0()); 
                    // InternalUseCaseDslParser.g:490:3: ( rule__UseCaseStep__Group_0__0 )
                    // InternalUseCaseDslParser.g:490:4: rule__UseCaseStep__Group_0__0
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
                    // InternalUseCaseDslParser.g:494:2: ( ( rule__UseCaseStep__Group_1__0 ) )
                    {
                    // InternalUseCaseDslParser.g:494:2: ( ( rule__UseCaseStep__Group_1__0 ) )
                    // InternalUseCaseDslParser.g:495:3: ( rule__UseCaseStep__Group_1__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_1()); 
                    // InternalUseCaseDslParser.g:496:3: ( rule__UseCaseStep__Group_1__0 )
                    // InternalUseCaseDslParser.g:496:4: rule__UseCaseStep__Group_1__0
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
                    // InternalUseCaseDslParser.g:500:2: ( ( rule__UseCaseStep__Group_2__0 ) )
                    {
                    // InternalUseCaseDslParser.g:500:2: ( ( rule__UseCaseStep__Group_2__0 ) )
                    // InternalUseCaseDslParser.g:501:3: ( rule__UseCaseStep__Group_2__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_2()); 
                    // InternalUseCaseDslParser.g:502:3: ( rule__UseCaseStep__Group_2__0 )
                    // InternalUseCaseDslParser.g:502:4: rule__UseCaseStep__Group_2__0
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
                    // InternalUseCaseDslParser.g:506:2: ( ( rule__UseCaseStep__Group_3__0 ) )
                    {
                    // InternalUseCaseDslParser.g:506:2: ( ( rule__UseCaseStep__Group_3__0 ) )
                    // InternalUseCaseDslParser.g:507:3: ( rule__UseCaseStep__Group_3__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_3()); 
                    // InternalUseCaseDslParser.g:508:3: ( rule__UseCaseStep__Group_3__0 )
                    // InternalUseCaseDslParser.g:508:4: rule__UseCaseStep__Group_3__0
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
    // InternalUseCaseDslParser.g:516:1: rule__ExtensionStep__Alternatives : ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ( rule__ExtensionStep__Group_1__0 ) ) | ( ruleDeadEndStep ) );
    public final void rule__ExtensionStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:520:1: ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ( rule__ExtensionStep__Group_1__0 ) ) | ( ruleDeadEndStep ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalUseCaseDslParser.g:521:2: ( ( rule__ExtensionStep__Group_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:521:2: ( ( rule__ExtensionStep__Group_0__0 ) )
                    // InternalUseCaseDslParser.g:522:3: ( rule__ExtensionStep__Group_0__0 )
                    {
                     before(grammarAccess.getExtensionStepAccess().getGroup_0()); 
                    // InternalUseCaseDslParser.g:523:3: ( rule__ExtensionStep__Group_0__0 )
                    // InternalUseCaseDslParser.g:523:4: rule__ExtensionStep__Group_0__0
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
                    // InternalUseCaseDslParser.g:527:2: ( ( rule__ExtensionStep__Group_1__0 ) )
                    {
                    // InternalUseCaseDslParser.g:527:2: ( ( rule__ExtensionStep__Group_1__0 ) )
                    // InternalUseCaseDslParser.g:528:3: ( rule__ExtensionStep__Group_1__0 )
                    {
                     before(grammarAccess.getExtensionStepAccess().getGroup_1()); 
                    // InternalUseCaseDslParser.g:529:3: ( rule__ExtensionStep__Group_1__0 )
                    // InternalUseCaseDslParser.g:529:4: rule__ExtensionStep__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtensionStep__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtensionStepAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:533:2: ( ruleDeadEndStep )
                    {
                    // InternalUseCaseDslParser.g:533:2: ( ruleDeadEndStep )
                    // InternalUseCaseDslParser.g:534:3: ruleDeadEndStep
                    {
                     before(grammarAccess.getExtensionStepAccess().getDeadEndStepParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDeadEndStep();

                    state._fsp--;

                     after(grammarAccess.getExtensionStepAccess().getDeadEndStepParserRuleCall_2()); 

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


    // $ANTLR start "rule__ExtensionStep__Alternatives_1_2"
    // InternalUseCaseDslParser.g:543:1: rule__ExtensionStep__Alternatives_1_2 : ( ( USER ) | ( SYSTEM ) | ( WHILE ) );
    public final void rule__ExtensionStep__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:547:1: ( ( USER ) | ( SYSTEM ) | ( WHILE ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case USER:
                {
                alt9=1;
                }
                break;
            case SYSTEM:
                {
                alt9=2;
                }
                break;
            case WHILE:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalUseCaseDslParser.g:548:2: ( USER )
                    {
                    // InternalUseCaseDslParser.g:548:2: ( USER )
                    // InternalUseCaseDslParser.g:549:3: USER
                    {
                     before(grammarAccess.getExtensionStepAccess().getUSERKeyword_1_2_0()); 
                    match(input,USER,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getUSERKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:554:2: ( SYSTEM )
                    {
                    // InternalUseCaseDslParser.g:554:2: ( SYSTEM )
                    // InternalUseCaseDslParser.g:555:3: SYSTEM
                    {
                     before(grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_1_2_1()); 
                    match(input,SYSTEM,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_1_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:560:2: ( WHILE )
                    {
                    // InternalUseCaseDslParser.g:560:2: ( WHILE )
                    // InternalUseCaseDslParser.g:561:3: WHILE
                    {
                     before(grammarAccess.getExtensionStepAccess().getWHILEKeyword_1_2_2()); 
                    match(input,WHILE,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getWHILEKeyword_1_2_2()); 

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
    // $ANTLR end "rule__ExtensionStep__Alternatives_1_2"


    // $ANTLR start "rule__DeadEndStep__Alternatives_2"
    // InternalUseCaseDslParser.g:570:1: rule__DeadEndStep__Alternatives_2 : ( ( USER ) | ( SYSTEM ) | ( WHILE ) );
    public final void rule__DeadEndStep__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:574:1: ( ( USER ) | ( SYSTEM ) | ( WHILE ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case USER:
                {
                alt10=1;
                }
                break;
            case SYSTEM:
                {
                alt10=2;
                }
                break;
            case WHILE:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalUseCaseDslParser.g:575:2: ( USER )
                    {
                    // InternalUseCaseDslParser.g:575:2: ( USER )
                    // InternalUseCaseDslParser.g:576:3: USER
                    {
                     before(grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0()); 
                    match(input,USER,FOLLOW_2); 
                     after(grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:581:2: ( SYSTEM )
                    {
                    // InternalUseCaseDslParser.g:581:2: ( SYSTEM )
                    // InternalUseCaseDslParser.g:582:3: SYSTEM
                    {
                     before(grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1()); 
                    match(input,SYSTEM,FOLLOW_2); 
                     after(grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:587:2: ( WHILE )
                    {
                    // InternalUseCaseDslParser.g:587:2: ( WHILE )
                    // InternalUseCaseDslParser.g:588:3: WHILE
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
    // InternalUseCaseDslParser.g:597:1: rule__LongName__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) );
    public final void rule__LongName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:601:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt11=2;
                }
                break;
            case RULE_CHAR:
                {
                alt11=3;
                }
                break;
            case Colon:
                {
                alt11=4;
                }
                break;
            case FullStop:
                {
                alt11=5;
                }
                break;
            case QuotationMark:
                {
                alt11=6;
                }
                break;
            case Apostrophe:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalUseCaseDslParser.g:602:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:602:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:603:3: RULE_ID
                    {
                     before(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:608:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:608:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:609:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:614:2: ( RULE_CHAR )
                    {
                    // InternalUseCaseDslParser.g:614:2: ( RULE_CHAR )
                    // InternalUseCaseDslParser.g:615:3: RULE_CHAR
                    {
                     before(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2()); 
                    match(input,RULE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:620:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:620:2: ( Colon )
                    // InternalUseCaseDslParser.g:621:3: Colon
                    {
                     before(grammarAccess.getLongNameAccess().getColonKeyword_3()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:626:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:626:2: ( FullStop )
                    // InternalUseCaseDslParser.g:627:3: FullStop
                    {
                     before(grammarAccess.getLongNameAccess().getFullStopKeyword_4()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUseCaseDslParser.g:632:2: ( QuotationMark )
                    {
                    // InternalUseCaseDslParser.g:632:2: ( QuotationMark )
                    // InternalUseCaseDslParser.g:633:3: QuotationMark
                    {
                     before(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5()); 
                    match(input,QuotationMark,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUseCaseDslParser.g:638:2: ( Apostrophe )
                    {
                    // InternalUseCaseDslParser.g:638:2: ( Apostrophe )
                    // InternalUseCaseDslParser.g:639:3: Apostrophe
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
    // InternalUseCaseDslParser.g:648:1: rule__Condition__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) | ( AND ) | ( OR ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:652:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) | ( AND ) | ( OR ) )
            int alt12=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt12=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt12=2;
                }
                break;
            case RULE_CHAR:
                {
                alt12=3;
                }
                break;
            case Colon:
                {
                alt12=4;
                }
                break;
            case FullStop:
                {
                alt12=5;
                }
                break;
            case QuotationMark:
                {
                alt12=6;
                }
                break;
            case Apostrophe:
                {
                alt12=7;
                }
                break;
            case AND:
                {
                alt12=8;
                }
                break;
            case OR:
                {
                alt12=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalUseCaseDslParser.g:653:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:653:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:654:3: RULE_ID
                    {
                     before(grammarAccess.getConditionAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:659:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:659:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:660:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:665:2: ( RULE_CHAR )
                    {
                    // InternalUseCaseDslParser.g:665:2: ( RULE_CHAR )
                    // InternalUseCaseDslParser.g:666:3: RULE_CHAR
                    {
                     before(grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2()); 
                    match(input,RULE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:671:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:671:2: ( Colon )
                    // InternalUseCaseDslParser.g:672:3: Colon
                    {
                     before(grammarAccess.getConditionAccess().getColonKeyword_3()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:677:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:677:2: ( FullStop )
                    // InternalUseCaseDslParser.g:678:3: FullStop
                    {
                     before(grammarAccess.getConditionAccess().getFullStopKeyword_4()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUseCaseDslParser.g:683:2: ( QuotationMark )
                    {
                    // InternalUseCaseDslParser.g:683:2: ( QuotationMark )
                    // InternalUseCaseDslParser.g:684:3: QuotationMark
                    {
                     before(grammarAccess.getConditionAccess().getQuotationMarkKeyword_5()); 
                    match(input,QuotationMark,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getQuotationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUseCaseDslParser.g:689:2: ( Apostrophe )
                    {
                    // InternalUseCaseDslParser.g:689:2: ( Apostrophe )
                    // InternalUseCaseDslParser.g:690:3: Apostrophe
                    {
                     before(grammarAccess.getConditionAccess().getApostropheKeyword_6()); 
                    match(input,Apostrophe,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getApostropheKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUseCaseDslParser.g:695:2: ( AND )
                    {
                    // InternalUseCaseDslParser.g:695:2: ( AND )
                    // InternalUseCaseDslParser.g:696:3: AND
                    {
                     before(grammarAccess.getConditionAccess().getANDKeyword_7()); 
                    match(input,AND,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getANDKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUseCaseDslParser.g:701:2: ( OR )
                    {
                    // InternalUseCaseDslParser.g:701:2: ( OR )
                    // InternalUseCaseDslParser.g:702:3: OR
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
    // InternalUseCaseDslParser.g:711:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:715:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCaseDslParser.g:716:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
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
    // InternalUseCaseDslParser.g:723:1: rule__UseCase__Group__0__Impl : ( UC ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:727:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:728:1: ( UC )
            {
            // InternalUseCaseDslParser.g:728:1: ( UC )
            // InternalUseCaseDslParser.g:729:2: UC
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
    // InternalUseCaseDslParser.g:738:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:742:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCaseDslParser.g:743:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
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
    // InternalUseCaseDslParser.g:750:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NumberAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:754:1: ( ( ( rule__UseCase__NumberAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:755:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:755:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            // InternalUseCaseDslParser.g:756:2: ( rule__UseCase__NumberAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNumberAssignment_1()); 
            // InternalUseCaseDslParser.g:757:2: ( rule__UseCase__NumberAssignment_1 )
            // InternalUseCaseDslParser.g:757:3: rule__UseCase__NumberAssignment_1
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
    // InternalUseCaseDslParser.g:765:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:769:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCaseDslParser.g:770:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
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
    // InternalUseCaseDslParser.g:777:1: rule__UseCase__Group__2__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:781:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:782:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:782:1: ( Colon )
            // InternalUseCaseDslParser.g:783:2: Colon
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
    // InternalUseCaseDslParser.g:792:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:796:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCaseDslParser.g:797:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
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
    // InternalUseCaseDslParser.g:804:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__NameAssignment_3 ) ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:808:1: ( ( ( rule__UseCase__NameAssignment_3 ) ) )
            // InternalUseCaseDslParser.g:809:1: ( ( rule__UseCase__NameAssignment_3 ) )
            {
            // InternalUseCaseDslParser.g:809:1: ( ( rule__UseCase__NameAssignment_3 ) )
            // InternalUseCaseDslParser.g:810:2: ( rule__UseCase__NameAssignment_3 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_3()); 
            // InternalUseCaseDslParser.g:811:2: ( rule__UseCase__NameAssignment_3 )
            // InternalUseCaseDslParser.g:811:3: rule__UseCase__NameAssignment_3
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
    // InternalUseCaseDslParser.g:819:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:823:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCaseDslParser.g:824:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
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
    // InternalUseCaseDslParser.g:831:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__PreconditionAssignment_4 )? ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:835:1: ( ( ( rule__UseCase__PreconditionAssignment_4 )? ) )
            // InternalUseCaseDslParser.g:836:1: ( ( rule__UseCase__PreconditionAssignment_4 )? )
            {
            // InternalUseCaseDslParser.g:836:1: ( ( rule__UseCase__PreconditionAssignment_4 )? )
            // InternalUseCaseDslParser.g:837:2: ( rule__UseCase__PreconditionAssignment_4 )?
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionAssignment_4()); 
            // InternalUseCaseDslParser.g:838:2: ( rule__UseCase__PreconditionAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==PRECONDITION) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUseCaseDslParser.g:838:3: rule__UseCase__PreconditionAssignment_4
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
    // InternalUseCaseDslParser.g:846:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:850:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCaseDslParser.g:851:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
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
    // InternalUseCaseDslParser.g:858:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__PostconditionAssignment_5 )? ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:862:1: ( ( ( rule__UseCase__PostconditionAssignment_5 )? ) )
            // InternalUseCaseDslParser.g:863:1: ( ( rule__UseCase__PostconditionAssignment_5 )? )
            {
            // InternalUseCaseDslParser.g:863:1: ( ( rule__UseCase__PostconditionAssignment_5 )? )
            // InternalUseCaseDslParser.g:864:2: ( rule__UseCase__PostconditionAssignment_5 )?
            {
             before(grammarAccess.getUseCaseAccess().getPostconditionAssignment_5()); 
            // InternalUseCaseDslParser.g:865:2: ( rule__UseCase__PostconditionAssignment_5 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==POSTCONDITION) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCaseDslParser.g:865:3: rule__UseCase__PostconditionAssignment_5
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
    // InternalUseCaseDslParser.g:873:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:877:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCaseDslParser.g:878:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
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
    // InternalUseCaseDslParser.g:885:1: rule__UseCase__Group__6__Impl : ( MAIN ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:889:1: ( ( MAIN ) )
            // InternalUseCaseDslParser.g:890:1: ( MAIN )
            {
            // InternalUseCaseDslParser.g:890:1: ( MAIN )
            // InternalUseCaseDslParser.g:891:2: MAIN
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
    // InternalUseCaseDslParser.g:900:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:904:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCaseDslParser.g:905:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
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
    // InternalUseCaseDslParser.g:912:1: rule__UseCase__Group__7__Impl : ( FLOW ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:916:1: ( ( FLOW ) )
            // InternalUseCaseDslParser.g:917:1: ( FLOW )
            {
            // InternalUseCaseDslParser.g:917:1: ( FLOW )
            // InternalUseCaseDslParser.g:918:2: FLOW
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
    // InternalUseCaseDslParser.g:927:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:931:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // InternalUseCaseDslParser.g:932:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
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
    // InternalUseCaseDslParser.g:939:1: rule__UseCase__Group__8__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:943:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:944:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:944:1: ( Colon )
            // InternalUseCaseDslParser.g:945:2: Colon
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
    // InternalUseCaseDslParser.g:954:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl rule__UseCase__Group__10 ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:958:1: ( rule__UseCase__Group__9__Impl rule__UseCase__Group__10 )
            // InternalUseCaseDslParser.g:959:2: rule__UseCase__Group__9__Impl rule__UseCase__Group__10
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
    // InternalUseCaseDslParser.g:966:1: rule__UseCase__Group__9__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:970:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:971:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:971:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:972:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:981:1: rule__UseCase__Group__10 : rule__UseCase__Group__10__Impl rule__UseCase__Group__11 ;
    public final void rule__UseCase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:985:1: ( rule__UseCase__Group__10__Impl rule__UseCase__Group__11 )
            // InternalUseCaseDslParser.g:986:2: rule__UseCase__Group__10__Impl rule__UseCase__Group__11
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
    // InternalUseCaseDslParser.g:993:1: rule__UseCase__Group__10__Impl : ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) ) ;
    public final void rule__UseCase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:997:1: ( ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) ) )
            // InternalUseCaseDslParser.g:998:1: ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) )
            {
            // InternalUseCaseDslParser.g:998:1: ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) )
            // InternalUseCaseDslParser.g:999:2: ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* )
            {
            // InternalUseCaseDslParser.g:999:2: ( ( rule__UseCase__StepsAssignment_10 ) )
            // InternalUseCaseDslParser.g:1000:3: ( rule__UseCase__StepsAssignment_10 )
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 
            // InternalUseCaseDslParser.g:1001:3: ( rule__UseCase__StepsAssignment_10 )
            // InternalUseCaseDslParser.g:1001:4: rule__UseCase__StepsAssignment_10
            {
            pushFollow(FOLLOW_13);
            rule__UseCase__StepsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 

            }

            // InternalUseCaseDslParser.g:1004:2: ( ( rule__UseCase__StepsAssignment_10 )* )
            // InternalUseCaseDslParser.g:1005:3: ( rule__UseCase__StepsAssignment_10 )*
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 
            // InternalUseCaseDslParser.g:1006:3: ( rule__UseCase__StepsAssignment_10 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_INT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1006:4: rule__UseCase__StepsAssignment_10
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UseCase__StepsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalUseCaseDslParser.g:1015:1: rule__UseCase__Group__11 : rule__UseCase__Group__11__Impl rule__UseCase__Group__12 ;
    public final void rule__UseCase__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1019:1: ( rule__UseCase__Group__11__Impl rule__UseCase__Group__12 )
            // InternalUseCaseDslParser.g:1020:2: rule__UseCase__Group__11__Impl rule__UseCase__Group__12
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
    // InternalUseCaseDslParser.g:1027:1: rule__UseCase__Group__11__Impl : ( RULE_END ) ;
    public final void rule__UseCase__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1031:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1032:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1032:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1033:2: RULE_END
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
    // InternalUseCaseDslParser.g:1042:1: rule__UseCase__Group__12 : rule__UseCase__Group__12__Impl ;
    public final void rule__UseCase__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1046:1: ( rule__UseCase__Group__12__Impl )
            // InternalUseCaseDslParser.g:1047:2: rule__UseCase__Group__12__Impl
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
    // InternalUseCaseDslParser.g:1053:1: rule__UseCase__Group__12__Impl : ( ( rule__UseCase__Group_12__0 )? ) ;
    public final void rule__UseCase__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1057:1: ( ( ( rule__UseCase__Group_12__0 )? ) )
            // InternalUseCaseDslParser.g:1058:1: ( ( rule__UseCase__Group_12__0 )? )
            {
            // InternalUseCaseDslParser.g:1058:1: ( ( rule__UseCase__Group_12__0 )? )
            // InternalUseCaseDslParser.g:1059:2: ( rule__UseCase__Group_12__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_12()); 
            // InternalUseCaseDslParser.g:1060:2: ( rule__UseCase__Group_12__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ALTERNATIVE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUseCaseDslParser.g:1060:3: rule__UseCase__Group_12__0
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
    // InternalUseCaseDslParser.g:1069:1: rule__UseCase__Group_12__0 : rule__UseCase__Group_12__0__Impl rule__UseCase__Group_12__1 ;
    public final void rule__UseCase__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1073:1: ( rule__UseCase__Group_12__0__Impl rule__UseCase__Group_12__1 )
            // InternalUseCaseDslParser.g:1074:2: rule__UseCase__Group_12__0__Impl rule__UseCase__Group_12__1
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
    // InternalUseCaseDslParser.g:1081:1: rule__UseCase__Group_12__0__Impl : ( ( rule__UseCase__Group_12_0__0 ) ) ;
    public final void rule__UseCase__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1085:1: ( ( ( rule__UseCase__Group_12_0__0 ) ) )
            // InternalUseCaseDslParser.g:1086:1: ( ( rule__UseCase__Group_12_0__0 ) )
            {
            // InternalUseCaseDslParser.g:1086:1: ( ( rule__UseCase__Group_12_0__0 ) )
            // InternalUseCaseDslParser.g:1087:2: ( rule__UseCase__Group_12_0__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup_12_0()); 
            // InternalUseCaseDslParser.g:1088:2: ( rule__UseCase__Group_12_0__0 )
            // InternalUseCaseDslParser.g:1088:3: rule__UseCase__Group_12_0__0
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
    // InternalUseCaseDslParser.g:1096:1: rule__UseCase__Group_12__1 : rule__UseCase__Group_12__1__Impl rule__UseCase__Group_12__2 ;
    public final void rule__UseCase__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1100:1: ( rule__UseCase__Group_12__1__Impl rule__UseCase__Group_12__2 )
            // InternalUseCaseDslParser.g:1101:2: rule__UseCase__Group_12__1__Impl rule__UseCase__Group_12__2
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
    // InternalUseCaseDslParser.g:1108:1: rule__UseCase__Group_12__1__Impl : ( Colon ) ;
    public final void rule__UseCase__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1112:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:1113:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:1113:1: ( Colon )
            // InternalUseCaseDslParser.g:1114:2: Colon
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
    // InternalUseCaseDslParser.g:1123:1: rule__UseCase__Group_12__2 : rule__UseCase__Group_12__2__Impl rule__UseCase__Group_12__3 ;
    public final void rule__UseCase__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1127:1: ( rule__UseCase__Group_12__2__Impl rule__UseCase__Group_12__3 )
            // InternalUseCaseDslParser.g:1128:2: rule__UseCase__Group_12__2__Impl rule__UseCase__Group_12__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:1135:1: rule__UseCase__Group_12__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCase__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1139:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:1140:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:1140:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:1141:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:1150:1: rule__UseCase__Group_12__3 : rule__UseCase__Group_12__3__Impl rule__UseCase__Group_12__4 ;
    public final void rule__UseCase__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1154:1: ( rule__UseCase__Group_12__3__Impl rule__UseCase__Group_12__4 )
            // InternalUseCaseDslParser.g:1155:2: rule__UseCase__Group_12__3__Impl rule__UseCase__Group_12__4
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
    // InternalUseCaseDslParser.g:1162:1: rule__UseCase__Group_12__3__Impl : ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) ) ;
    public final void rule__UseCase__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1166:1: ( ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) ) )
            // InternalUseCaseDslParser.g:1167:1: ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) )
            {
            // InternalUseCaseDslParser.g:1167:1: ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) )
            // InternalUseCaseDslParser.g:1168:2: ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* )
            {
            // InternalUseCaseDslParser.g:1168:2: ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) )
            // InternalUseCaseDslParser.g:1169:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 
            // InternalUseCaseDslParser.g:1170:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )
            // InternalUseCaseDslParser.g:1170:4: rule__UseCase__AlternativeflowsAssignment_12_3
            {
            pushFollow(FOLLOW_16);
            rule__UseCase__AlternativeflowsAssignment_12_3();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 

            }

            // InternalUseCaseDslParser.g:1173:2: ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* )
            // InternalUseCaseDslParser.g:1174:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )*
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 
            // InternalUseCaseDslParser.g:1175:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_CHAR||LA17_0==RULE_INT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1175:4: rule__UseCase__AlternativeflowsAssignment_12_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__UseCase__AlternativeflowsAssignment_12_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalUseCaseDslParser.g:1184:1: rule__UseCase__Group_12__4 : rule__UseCase__Group_12__4__Impl ;
    public final void rule__UseCase__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1188:1: ( rule__UseCase__Group_12__4__Impl )
            // InternalUseCaseDslParser.g:1189:2: rule__UseCase__Group_12__4__Impl
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
    // InternalUseCaseDslParser.g:1195:1: rule__UseCase__Group_12__4__Impl : ( RULE_END ) ;
    public final void rule__UseCase__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1199:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1200:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1200:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1201:2: RULE_END
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
    // InternalUseCaseDslParser.g:1211:1: rule__UseCase__Group_12_0__0 : rule__UseCase__Group_12_0__0__Impl rule__UseCase__Group_12_0__1 ;
    public final void rule__UseCase__Group_12_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1215:1: ( rule__UseCase__Group_12_0__0__Impl rule__UseCase__Group_12_0__1 )
            // InternalUseCaseDslParser.g:1216:2: rule__UseCase__Group_12_0__0__Impl rule__UseCase__Group_12_0__1
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
    // InternalUseCaseDslParser.g:1223:1: rule__UseCase__Group_12_0__0__Impl : ( ALTERNATIVE ) ;
    public final void rule__UseCase__Group_12_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1227:1: ( ( ALTERNATIVE ) )
            // InternalUseCaseDslParser.g:1228:1: ( ALTERNATIVE )
            {
            // InternalUseCaseDslParser.g:1228:1: ( ALTERNATIVE )
            // InternalUseCaseDslParser.g:1229:2: ALTERNATIVE
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
    // InternalUseCaseDslParser.g:1238:1: rule__UseCase__Group_12_0__1 : rule__UseCase__Group_12_0__1__Impl ;
    public final void rule__UseCase__Group_12_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1242:1: ( rule__UseCase__Group_12_0__1__Impl )
            // InternalUseCaseDslParser.g:1243:2: rule__UseCase__Group_12_0__1__Impl
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
    // InternalUseCaseDslParser.g:1249:1: rule__UseCase__Group_12_0__1__Impl : ( FLOW ) ;
    public final void rule__UseCase__Group_12_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1253:1: ( ( FLOW ) )
            // InternalUseCaseDslParser.g:1254:1: ( FLOW )
            {
            // InternalUseCaseDslParser.g:1254:1: ( FLOW )
            // InternalUseCaseDslParser.g:1255:2: FLOW
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
    // InternalUseCaseDslParser.g:1265:1: rule__Extension__Group__0 : rule__Extension__Group__0__Impl rule__Extension__Group__1 ;
    public final void rule__Extension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1269:1: ( rule__Extension__Group__0__Impl rule__Extension__Group__1 )
            // InternalUseCaseDslParser.g:1270:2: rule__Extension__Group__0__Impl rule__Extension__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCaseDslParser.g:1277:1: rule__Extension__Group__0__Impl : ( ( rule__Extension__Alternatives_0 ) ) ;
    public final void rule__Extension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1281:1: ( ( ( rule__Extension__Alternatives_0 ) ) )
            // InternalUseCaseDslParser.g:1282:1: ( ( rule__Extension__Alternatives_0 ) )
            {
            // InternalUseCaseDslParser.g:1282:1: ( ( rule__Extension__Alternatives_0 ) )
            // InternalUseCaseDslParser.g:1283:2: ( rule__Extension__Alternatives_0 )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives_0()); 
            // InternalUseCaseDslParser.g:1284:2: ( rule__Extension__Alternatives_0 )
            // InternalUseCaseDslParser.g:1284:3: rule__Extension__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1292:1: rule__Extension__Group__1 : rule__Extension__Group__1__Impl rule__Extension__Group__2 ;
    public final void rule__Extension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1296:1: ( rule__Extension__Group__1__Impl rule__Extension__Group__2 )
            // InternalUseCaseDslParser.g:1297:2: rule__Extension__Group__1__Impl rule__Extension__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalUseCaseDslParser.g:1304:1: rule__Extension__Group__1__Impl : ( FullStop ) ;
    public final void rule__Extension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1308:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1309:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1309:1: ( FullStop )
            // InternalUseCaseDslParser.g:1310:2: FullStop
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
    // InternalUseCaseDslParser.g:1319:1: rule__Extension__Group__2 : rule__Extension__Group__2__Impl rule__Extension__Group__3 ;
    public final void rule__Extension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1323:1: ( rule__Extension__Group__2__Impl rule__Extension__Group__3 )
            // InternalUseCaseDslParser.g:1324:2: rule__Extension__Group__2__Impl rule__Extension__Group__3
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
    // InternalUseCaseDslParser.g:1331:1: rule__Extension__Group__2__Impl : ( ( rule__Extension__NameAssignment_2 ) ) ;
    public final void rule__Extension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1335:1: ( ( ( rule__Extension__NameAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:1336:1: ( ( rule__Extension__NameAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:1336:1: ( ( rule__Extension__NameAssignment_2 ) )
            // InternalUseCaseDslParser.g:1337:2: ( rule__Extension__NameAssignment_2 )
            {
             before(grammarAccess.getExtensionAccess().getNameAssignment_2()); 
            // InternalUseCaseDslParser.g:1338:2: ( rule__Extension__NameAssignment_2 )
            // InternalUseCaseDslParser.g:1338:3: rule__Extension__NameAssignment_2
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
    // InternalUseCaseDslParser.g:1346:1: rule__Extension__Group__3 : rule__Extension__Group__3__Impl rule__Extension__Group__4 ;
    public final void rule__Extension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1350:1: ( rule__Extension__Group__3__Impl rule__Extension__Group__4 )
            // InternalUseCaseDslParser.g:1351:2: rule__Extension__Group__3__Impl rule__Extension__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalUseCaseDslParser.g:1358:1: rule__Extension__Group__3__Impl : ( FullStop ) ;
    public final void rule__Extension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1362:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1363:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1363:1: ( FullStop )
            // InternalUseCaseDslParser.g:1364:2: FullStop
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
    // InternalUseCaseDslParser.g:1373:1: rule__Extension__Group__4 : rule__Extension__Group__4__Impl rule__Extension__Group__5 ;
    public final void rule__Extension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1377:1: ( rule__Extension__Group__4__Impl rule__Extension__Group__5 )
            // InternalUseCaseDslParser.g:1378:2: rule__Extension__Group__4__Impl rule__Extension__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalUseCaseDslParser.g:1385:1: rule__Extension__Group__4__Impl : ( IF ) ;
    public final void rule__Extension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1389:1: ( ( IF ) )
            // InternalUseCaseDslParser.g:1390:1: ( IF )
            {
            // InternalUseCaseDslParser.g:1390:1: ( IF )
            // InternalUseCaseDslParser.g:1391:2: IF
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
    // InternalUseCaseDslParser.g:1400:1: rule__Extension__Group__5 : rule__Extension__Group__5__Impl rule__Extension__Group__6 ;
    public final void rule__Extension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1404:1: ( rule__Extension__Group__5__Impl rule__Extension__Group__6 )
            // InternalUseCaseDslParser.g:1405:2: rule__Extension__Group__5__Impl rule__Extension__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCaseDslParser.g:1412:1: rule__Extension__Group__5__Impl : ( ( rule__Extension__ConditionAssignment_5 ) ) ;
    public final void rule__Extension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1416:1: ( ( ( rule__Extension__ConditionAssignment_5 ) ) )
            // InternalUseCaseDslParser.g:1417:1: ( ( rule__Extension__ConditionAssignment_5 ) )
            {
            // InternalUseCaseDslParser.g:1417:1: ( ( rule__Extension__ConditionAssignment_5 ) )
            // InternalUseCaseDslParser.g:1418:2: ( rule__Extension__ConditionAssignment_5 )
            {
             before(grammarAccess.getExtensionAccess().getConditionAssignment_5()); 
            // InternalUseCaseDslParser.g:1419:2: ( rule__Extension__ConditionAssignment_5 )
            // InternalUseCaseDslParser.g:1419:3: rule__Extension__ConditionAssignment_5
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
    // InternalUseCaseDslParser.g:1427:1: rule__Extension__Group__6 : rule__Extension__Group__6__Impl rule__Extension__Group__7 ;
    public final void rule__Extension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1431:1: ( rule__Extension__Group__6__Impl rule__Extension__Group__7 )
            // InternalUseCaseDslParser.g:1432:2: rule__Extension__Group__6__Impl rule__Extension__Group__7
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
    // InternalUseCaseDslParser.g:1439:1: rule__Extension__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__Extension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1443:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:1444:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:1444:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:1445:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:1454:1: rule__Extension__Group__7 : rule__Extension__Group__7__Impl rule__Extension__Group__8 ;
    public final void rule__Extension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1458:1: ( rule__Extension__Group__7__Impl rule__Extension__Group__8 )
            // InternalUseCaseDslParser.g:1459:2: rule__Extension__Group__7__Impl rule__Extension__Group__8
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:1466:1: rule__Extension__Group__7__Impl : ( ( rule__Extension__StepsAssignment_7 )* ) ;
    public final void rule__Extension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1470:1: ( ( ( rule__Extension__StepsAssignment_7 )* ) )
            // InternalUseCaseDslParser.g:1471:1: ( ( rule__Extension__StepsAssignment_7 )* )
            {
            // InternalUseCaseDslParser.g:1471:1: ( ( rule__Extension__StepsAssignment_7 )* )
            // InternalUseCaseDslParser.g:1472:2: ( rule__Extension__StepsAssignment_7 )*
            {
             before(grammarAccess.getExtensionAccess().getStepsAssignment_7()); 
            // InternalUseCaseDslParser.g:1473:2: ( rule__Extension__StepsAssignment_7 )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1473:3: rule__Extension__StepsAssignment_7
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Extension__StepsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getExtensionAccess().getStepsAssignment_7()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1481:1: rule__Extension__Group__8 : rule__Extension__Group__8__Impl rule__Extension__Group__9 ;
    public final void rule__Extension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1485:1: ( rule__Extension__Group__8__Impl rule__Extension__Group__9 )
            // InternalUseCaseDslParser.g:1486:2: rule__Extension__Group__8__Impl rule__Extension__Group__9
            {
            pushFollow(FOLLOW_12);
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
    // InternalUseCaseDslParser.g:1493:1: rule__Extension__Group__8__Impl : ( ( rule__Extension__Alternatives_8 ) ) ;
    public final void rule__Extension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1497:1: ( ( ( rule__Extension__Alternatives_8 ) ) )
            // InternalUseCaseDslParser.g:1498:1: ( ( rule__Extension__Alternatives_8 ) )
            {
            // InternalUseCaseDslParser.g:1498:1: ( ( rule__Extension__Alternatives_8 ) )
            // InternalUseCaseDslParser.g:1499:2: ( rule__Extension__Alternatives_8 )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives_8()); 
            // InternalUseCaseDslParser.g:1500:2: ( rule__Extension__Alternatives_8 )
            // InternalUseCaseDslParser.g:1500:3: rule__Extension__Alternatives_8
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
    // InternalUseCaseDslParser.g:1508:1: rule__Extension__Group__9 : rule__Extension__Group__9__Impl ;
    public final void rule__Extension__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1512:1: ( rule__Extension__Group__9__Impl )
            // InternalUseCaseDslParser.g:1513:2: rule__Extension__Group__9__Impl
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
    // InternalUseCaseDslParser.g:1519:1: rule__Extension__Group__9__Impl : ( RULE_END ) ;
    public final void rule__Extension__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1523:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1524:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1524:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1525:2: RULE_END
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
    // InternalUseCaseDslParser.g:1535:1: rule__Extension__Group_8_0__0 : rule__Extension__Group_8_0__0__Impl rule__Extension__Group_8_0__1 ;
    public final void rule__Extension__Group_8_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1539:1: ( rule__Extension__Group_8_0__0__Impl rule__Extension__Group_8_0__1 )
            // InternalUseCaseDslParser.g:1540:2: rule__Extension__Group_8_0__0__Impl rule__Extension__Group_8_0__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCaseDslParser.g:1547:1: rule__Extension__Group_8_0__0__Impl : ( ruleStepName ) ;
    public final void rule__Extension__Group_8_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1551:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:1552:1: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:1552:1: ( ruleStepName )
            // InternalUseCaseDslParser.g:1553:2: ruleStepName
            {
             before(grammarAccess.getExtensionAccess().getStepNameParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getStepNameParserRuleCall_8_0_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1562:1: rule__Extension__Group_8_0__1 : rule__Extension__Group_8_0__1__Impl rule__Extension__Group_8_0__2 ;
    public final void rule__Extension__Group_8_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1566:1: ( rule__Extension__Group_8_0__1__Impl rule__Extension__Group_8_0__2 )
            // InternalUseCaseDslParser.g:1567:2: rule__Extension__Group_8_0__1__Impl rule__Extension__Group_8_0__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalUseCaseDslParser.g:1574:1: rule__Extension__Group_8_0__1__Impl : ( FullStop ) ;
    public final void rule__Extension__Group_8_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1578:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1579:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1579:1: ( FullStop )
            // InternalUseCaseDslParser.g:1580:2: FullStop
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
    // InternalUseCaseDslParser.g:1589:1: rule__Extension__Group_8_0__2 : rule__Extension__Group_8_0__2__Impl rule__Extension__Group_8_0__3 ;
    public final void rule__Extension__Group_8_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1593:1: ( rule__Extension__Group_8_0__2__Impl rule__Extension__Group_8_0__3 )
            // InternalUseCaseDslParser.g:1594:2: rule__Extension__Group_8_0__2__Impl rule__Extension__Group_8_0__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalUseCaseDslParser.g:1601:1: rule__Extension__Group_8_0__2__Impl : ( RETURN ) ;
    public final void rule__Extension__Group_8_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1605:1: ( ( RETURN ) )
            // InternalUseCaseDslParser.g:1606:1: ( RETURN )
            {
            // InternalUseCaseDslParser.g:1606:1: ( RETURN )
            // InternalUseCaseDslParser.g:1607:2: RETURN
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
    // InternalUseCaseDslParser.g:1616:1: rule__Extension__Group_8_0__3 : rule__Extension__Group_8_0__3__Impl rule__Extension__Group_8_0__4 ;
    public final void rule__Extension__Group_8_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1620:1: ( rule__Extension__Group_8_0__3__Impl rule__Extension__Group_8_0__4 )
            // InternalUseCaseDslParser.g:1621:2: rule__Extension__Group_8_0__3__Impl rule__Extension__Group_8_0__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:1628:1: rule__Extension__Group_8_0__3__Impl : ( TO ) ;
    public final void rule__Extension__Group_8_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1632:1: ( ( TO ) )
            // InternalUseCaseDslParser.g:1633:1: ( TO )
            {
            // InternalUseCaseDslParser.g:1633:1: ( TO )
            // InternalUseCaseDslParser.g:1634:2: TO
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
    // InternalUseCaseDslParser.g:1643:1: rule__Extension__Group_8_0__4 : rule__Extension__Group_8_0__4__Impl ;
    public final void rule__Extension__Group_8_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1647:1: ( rule__Extension__Group_8_0__4__Impl )
            // InternalUseCaseDslParser.g:1648:2: rule__Extension__Group_8_0__4__Impl
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
    // InternalUseCaseDslParser.g:1654:1: rule__Extension__Group_8_0__4__Impl : ( ( rule__Extension__Alternatives_8_0_4 ) ) ;
    public final void rule__Extension__Group_8_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1658:1: ( ( ( rule__Extension__Alternatives_8_0_4 ) ) )
            // InternalUseCaseDslParser.g:1659:1: ( ( rule__Extension__Alternatives_8_0_4 ) )
            {
            // InternalUseCaseDslParser.g:1659:1: ( ( rule__Extension__Alternatives_8_0_4 ) )
            // InternalUseCaseDslParser.g:1660:2: ( rule__Extension__Alternatives_8_0_4 )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives_8_0_4()); 
            // InternalUseCaseDslParser.g:1661:2: ( rule__Extension__Alternatives_8_0_4 )
            // InternalUseCaseDslParser.g:1661:3: rule__Extension__Alternatives_8_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Extension__Alternatives_8_0_4();

            state._fsp--;


            }

             after(grammarAccess.getExtensionAccess().getAlternatives_8_0_4()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1670:1: rule__UseCaseStep__Group_0__0 : rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1 ;
    public final void rule__UseCaseStep__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1674:1: ( rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1 )
            // InternalUseCaseDslParser.g:1675:2: rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1
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
    // InternalUseCaseDslParser.g:1682:1: rule__UseCaseStep__Group_0__0__Impl : ( ( rule__UseCaseStep__Group_0_0__0 )? ) ;
    public final void rule__UseCaseStep__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1686:1: ( ( ( rule__UseCaseStep__Group_0_0__0 )? ) )
            // InternalUseCaseDslParser.g:1687:1: ( ( rule__UseCaseStep__Group_0_0__0 )? )
            {
            // InternalUseCaseDslParser.g:1687:1: ( ( rule__UseCaseStep__Group_0_0__0 )? )
            // InternalUseCaseDslParser.g:1688:2: ( rule__UseCaseStep__Group_0_0__0 )?
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_0_0()); 
            // InternalUseCaseDslParser.g:1689:2: ( rule__UseCaseStep__Group_0_0__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==FullStop) ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2==RULE_INT) ) {
                        alt19=1;
                    }
                }
            }
            switch (alt19) {
                case 1 :
                    // InternalUseCaseDslParser.g:1689:3: rule__UseCaseStep__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCaseStep__Group_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseStepAccess().getGroup_0_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1697:1: rule__UseCaseStep__Group_0__1 : rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2 ;
    public final void rule__UseCaseStep__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1701:1: ( rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2 )
            // InternalUseCaseDslParser.g:1702:2: rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCaseDslParser.g:1709:1: rule__UseCaseStep__Group_0__1__Impl : ( ( rule__UseCaseStep__NameAssignment_0_1 ) ) ;
    public final void rule__UseCaseStep__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1713:1: ( ( ( rule__UseCaseStep__NameAssignment_0_1 ) ) )
            // InternalUseCaseDslParser.g:1714:1: ( ( rule__UseCaseStep__NameAssignment_0_1 ) )
            {
            // InternalUseCaseDslParser.g:1714:1: ( ( rule__UseCaseStep__NameAssignment_0_1 ) )
            // InternalUseCaseDslParser.g:1715:2: ( rule__UseCaseStep__NameAssignment_0_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_0_1()); 
            // InternalUseCaseDslParser.g:1716:2: ( rule__UseCaseStep__NameAssignment_0_1 )
            // InternalUseCaseDslParser.g:1716:3: rule__UseCaseStep__NameAssignment_0_1
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
    // InternalUseCaseDslParser.g:1724:1: rule__UseCaseStep__Group_0__2 : rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3 ;
    public final void rule__UseCaseStep__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1728:1: ( rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3 )
            // InternalUseCaseDslParser.g:1729:2: rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalUseCaseDslParser.g:1736:1: rule__UseCaseStep__Group_0__2__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1740:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1741:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1741:1: ( FullStop )
            // InternalUseCaseDslParser.g:1742:2: FullStop
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
    // InternalUseCaseDslParser.g:1751:1: rule__UseCaseStep__Group_0__3 : rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4 ;
    public final void rule__UseCaseStep__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1755:1: ( rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4 )
            // InternalUseCaseDslParser.g:1756:2: rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4
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
    // InternalUseCaseDslParser.g:1763:1: rule__UseCaseStep__Group_0__3__Impl : ( INCLUDE ) ;
    public final void rule__UseCaseStep__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1767:1: ( ( INCLUDE ) )
            // InternalUseCaseDslParser.g:1768:1: ( INCLUDE )
            {
            // InternalUseCaseDslParser.g:1768:1: ( INCLUDE )
            // InternalUseCaseDslParser.g:1769:2: INCLUDE
            {
             before(grammarAccess.getUseCaseStepAccess().getINCLUDEKeyword_0_3()); 
            match(input,INCLUDE,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getINCLUDEKeyword_0_3()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1778:1: rule__UseCaseStep__Group_0__4 : rule__UseCaseStep__Group_0__4__Impl ;
    public final void rule__UseCaseStep__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1782:1: ( rule__UseCaseStep__Group_0__4__Impl )
            // InternalUseCaseDslParser.g:1783:2: rule__UseCaseStep__Group_0__4__Impl
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
    // InternalUseCaseDslParser.g:1789:1: rule__UseCaseStep__Group_0__4__Impl : ( ( rule__UseCaseStep__ReferenceAssignment_0_4 ) ) ;
    public final void rule__UseCaseStep__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1793:1: ( ( ( rule__UseCaseStep__ReferenceAssignment_0_4 ) ) )
            // InternalUseCaseDslParser.g:1794:1: ( ( rule__UseCaseStep__ReferenceAssignment_0_4 ) )
            {
            // InternalUseCaseDslParser.g:1794:1: ( ( rule__UseCaseStep__ReferenceAssignment_0_4 ) )
            // InternalUseCaseDslParser.g:1795:2: ( rule__UseCaseStep__ReferenceAssignment_0_4 )
            {
             before(grammarAccess.getUseCaseStepAccess().getReferenceAssignment_0_4()); 
            // InternalUseCaseDslParser.g:1796:2: ( rule__UseCaseStep__ReferenceAssignment_0_4 )
            // InternalUseCaseDslParser.g:1796:3: rule__UseCaseStep__ReferenceAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__ReferenceAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getReferenceAssignment_0_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__UseCaseStep__Group_0_0__0"
    // InternalUseCaseDslParser.g:1805:1: rule__UseCaseStep__Group_0_0__0 : rule__UseCaseStep__Group_0_0__0__Impl rule__UseCaseStep__Group_0_0__1 ;
    public final void rule__UseCaseStep__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1809:1: ( rule__UseCaseStep__Group_0_0__0__Impl rule__UseCaseStep__Group_0_0__1 )
            // InternalUseCaseDslParser.g:1810:2: rule__UseCaseStep__Group_0_0__0__Impl rule__UseCaseStep__Group_0_0__1
            {
            pushFollow(FOLLOW_17);
            rule__UseCaseStep__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_0_0__0"


    // $ANTLR start "rule__UseCaseStep__Group_0_0__0__Impl"
    // InternalUseCaseDslParser.g:1817:1: rule__UseCaseStep__Group_0_0__0__Impl : ( ( rule__UseCaseStep__ParentAssignment_0_0_0 ) ) ;
    public final void rule__UseCaseStep__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1821:1: ( ( ( rule__UseCaseStep__ParentAssignment_0_0_0 ) ) )
            // InternalUseCaseDslParser.g:1822:1: ( ( rule__UseCaseStep__ParentAssignment_0_0_0 ) )
            {
            // InternalUseCaseDslParser.g:1822:1: ( ( rule__UseCaseStep__ParentAssignment_0_0_0 ) )
            // InternalUseCaseDslParser.g:1823:2: ( rule__UseCaseStep__ParentAssignment_0_0_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentAssignment_0_0_0()); 
            // InternalUseCaseDslParser.g:1824:2: ( rule__UseCaseStep__ParentAssignment_0_0_0 )
            // InternalUseCaseDslParser.g:1824:3: rule__UseCaseStep__ParentAssignment_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__ParentAssignment_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getParentAssignment_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_0_0__0__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_0_0__1"
    // InternalUseCaseDslParser.g:1832:1: rule__UseCaseStep__Group_0_0__1 : rule__UseCaseStep__Group_0_0__1__Impl ;
    public final void rule__UseCaseStep__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1836:1: ( rule__UseCaseStep__Group_0_0__1__Impl )
            // InternalUseCaseDslParser.g:1837:2: rule__UseCaseStep__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_0_0__1"


    // $ANTLR start "rule__UseCaseStep__Group_0_0__1__Impl"
    // InternalUseCaseDslParser.g:1843:1: rule__UseCaseStep__Group_0_0__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1847:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1848:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1848:1: ( FullStop )
            // InternalUseCaseDslParser.g:1849:2: FullStop
            {
             before(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_0_0_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_0_0__1__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_1__0"
    // InternalUseCaseDslParser.g:1859:1: rule__UseCaseStep__Group_1__0 : rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1 ;
    public final void rule__UseCaseStep__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1863:1: ( rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1 )
            // InternalUseCaseDslParser.g:1864:2: rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1
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
    // InternalUseCaseDslParser.g:1871:1: rule__UseCaseStep__Group_1__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1875:1: ( ( () ) )
            // InternalUseCaseDslParser.g:1876:1: ( () )
            {
            // InternalUseCaseDslParser.g:1876:1: ( () )
            // InternalUseCaseDslParser.g:1877:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getUserStepAction_1_0()); 
            // InternalUseCaseDslParser.g:1878:2: ()
            // InternalUseCaseDslParser.g:1878:3: 
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
    // InternalUseCaseDslParser.g:1886:1: rule__UseCaseStep__Group_1__1 : rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2 ;
    public final void rule__UseCaseStep__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1890:1: ( rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2 )
            // InternalUseCaseDslParser.g:1891:2: rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:1898:1: rule__UseCaseStep__Group_1__1__Impl : ( ( rule__UseCaseStep__Group_1_1__0 )? ) ;
    public final void rule__UseCaseStep__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1902:1: ( ( ( rule__UseCaseStep__Group_1_1__0 )? ) )
            // InternalUseCaseDslParser.g:1903:1: ( ( rule__UseCaseStep__Group_1_1__0 )? )
            {
            // InternalUseCaseDslParser.g:1903:1: ( ( rule__UseCaseStep__Group_1_1__0 )? )
            // InternalUseCaseDslParser.g:1904:2: ( rule__UseCaseStep__Group_1_1__0 )?
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_1_1()); 
            // InternalUseCaseDslParser.g:1905:2: ( rule__UseCaseStep__Group_1_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==FullStop) ) {
                    int LA20_2 = input.LA(3);

                    if ( (LA20_2==RULE_INT) ) {
                        alt20=1;
                    }
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalUseCaseDslParser.g:1905:3: rule__UseCaseStep__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCaseStep__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseStepAccess().getGroup_1_1()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1913:1: rule__UseCaseStep__Group_1__2 : rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3 ;
    public final void rule__UseCaseStep__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1917:1: ( rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3 )
            // InternalUseCaseDslParser.g:1918:2: rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCaseDslParser.g:1925:1: rule__UseCaseStep__Group_1__2__Impl : ( ( rule__UseCaseStep__NameAssignment_1_2 ) ) ;
    public final void rule__UseCaseStep__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1929:1: ( ( ( rule__UseCaseStep__NameAssignment_1_2 ) ) )
            // InternalUseCaseDslParser.g:1930:1: ( ( rule__UseCaseStep__NameAssignment_1_2 ) )
            {
            // InternalUseCaseDslParser.g:1930:1: ( ( rule__UseCaseStep__NameAssignment_1_2 ) )
            // InternalUseCaseDslParser.g:1931:2: ( rule__UseCaseStep__NameAssignment_1_2 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_1_2()); 
            // InternalUseCaseDslParser.g:1932:2: ( rule__UseCaseStep__NameAssignment_1_2 )
            // InternalUseCaseDslParser.g:1932:3: rule__UseCaseStep__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getNameAssignment_1_2()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1940:1: rule__UseCaseStep__Group_1__3 : rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4 ;
    public final void rule__UseCaseStep__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1944:1: ( rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4 )
            // InternalUseCaseDslParser.g:1945:2: rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalUseCaseDslParser.g:1952:1: rule__UseCaseStep__Group_1__3__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1956:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1957:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1957:1: ( FullStop )
            // InternalUseCaseDslParser.g:1958:2: FullStop
            {
             before(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_1_3()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_1_3()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:1967:1: rule__UseCaseStep__Group_1__4 : rule__UseCaseStep__Group_1__4__Impl rule__UseCaseStep__Group_1__5 ;
    public final void rule__UseCaseStep__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1971:1: ( rule__UseCaseStep__Group_1__4__Impl rule__UseCaseStep__Group_1__5 )
            // InternalUseCaseDslParser.g:1972:2: rule__UseCaseStep__Group_1__4__Impl rule__UseCaseStep__Group_1__5
            {
            pushFollow(FOLLOW_8);
            rule__UseCaseStep__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_1__5();

            state._fsp--;


            }

        }
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
    // InternalUseCaseDslParser.g:1979:1: rule__UseCaseStep__Group_1__4__Impl : ( USER ) ;
    public final void rule__UseCaseStep__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1983:1: ( ( USER ) )
            // InternalUseCaseDslParser.g:1984:1: ( USER )
            {
            // InternalUseCaseDslParser.g:1984:1: ( USER )
            // InternalUseCaseDslParser.g:1985:2: USER
            {
             before(grammarAccess.getUseCaseStepAccess().getUSERKeyword_1_4()); 
            match(input,USER,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getUSERKeyword_1_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__UseCaseStep__Group_1__5"
    // InternalUseCaseDslParser.g:1994:1: rule__UseCaseStep__Group_1__5 : rule__UseCaseStep__Group_1__5__Impl ;
    public final void rule__UseCaseStep__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1998:1: ( rule__UseCaseStep__Group_1__5__Impl )
            // InternalUseCaseDslParser.g:1999:2: rule__UseCaseStep__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1__5"


    // $ANTLR start "rule__UseCaseStep__Group_1__5__Impl"
    // InternalUseCaseDslParser.g:2005:1: rule__UseCaseStep__Group_1__5__Impl : ( ( rule__UseCaseStep__SentenceAssignment_1_5 ) ) ;
    public final void rule__UseCaseStep__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2009:1: ( ( ( rule__UseCaseStep__SentenceAssignment_1_5 ) ) )
            // InternalUseCaseDslParser.g:2010:1: ( ( rule__UseCaseStep__SentenceAssignment_1_5 ) )
            {
            // InternalUseCaseDslParser.g:2010:1: ( ( rule__UseCaseStep__SentenceAssignment_1_5 ) )
            // InternalUseCaseDslParser.g:2011:2: ( rule__UseCaseStep__SentenceAssignment_1_5 )
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_1_5()); 
            // InternalUseCaseDslParser.g:2012:2: ( rule__UseCaseStep__SentenceAssignment_1_5 )
            // InternalUseCaseDslParser.g:2012:3: rule__UseCaseStep__SentenceAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__SentenceAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1__5__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_1_1__0"
    // InternalUseCaseDslParser.g:2021:1: rule__UseCaseStep__Group_1_1__0 : rule__UseCaseStep__Group_1_1__0__Impl rule__UseCaseStep__Group_1_1__1 ;
    public final void rule__UseCaseStep__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2025:1: ( rule__UseCaseStep__Group_1_1__0__Impl rule__UseCaseStep__Group_1_1__1 )
            // InternalUseCaseDslParser.g:2026:2: rule__UseCaseStep__Group_1_1__0__Impl rule__UseCaseStep__Group_1_1__1
            {
            pushFollow(FOLLOW_17);
            rule__UseCaseStep__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1_1__0"


    // $ANTLR start "rule__UseCaseStep__Group_1_1__0__Impl"
    // InternalUseCaseDslParser.g:2033:1: rule__UseCaseStep__Group_1_1__0__Impl : ( ( rule__UseCaseStep__ParentAssignment_1_1_0 ) ) ;
    public final void rule__UseCaseStep__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2037:1: ( ( ( rule__UseCaseStep__ParentAssignment_1_1_0 ) ) )
            // InternalUseCaseDslParser.g:2038:1: ( ( rule__UseCaseStep__ParentAssignment_1_1_0 ) )
            {
            // InternalUseCaseDslParser.g:2038:1: ( ( rule__UseCaseStep__ParentAssignment_1_1_0 ) )
            // InternalUseCaseDslParser.g:2039:2: ( rule__UseCaseStep__ParentAssignment_1_1_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentAssignment_1_1_0()); 
            // InternalUseCaseDslParser.g:2040:2: ( rule__UseCaseStep__ParentAssignment_1_1_0 )
            // InternalUseCaseDslParser.g:2040:3: rule__UseCaseStep__ParentAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__ParentAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getParentAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1_1__0__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_1_1__1"
    // InternalUseCaseDslParser.g:2048:1: rule__UseCaseStep__Group_1_1__1 : rule__UseCaseStep__Group_1_1__1__Impl ;
    public final void rule__UseCaseStep__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2052:1: ( rule__UseCaseStep__Group_1_1__1__Impl )
            // InternalUseCaseDslParser.g:2053:2: rule__UseCaseStep__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1_1__1"


    // $ANTLR start "rule__UseCaseStep__Group_1_1__1__Impl"
    // InternalUseCaseDslParser.g:2059:1: rule__UseCaseStep__Group_1_1__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2063:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2064:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2064:1: ( FullStop )
            // InternalUseCaseDslParser.g:2065:2: FullStop
            {
             before(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_1_1_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_1_1__1__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_2__0"
    // InternalUseCaseDslParser.g:2075:1: rule__UseCaseStep__Group_2__0 : rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1 ;
    public final void rule__UseCaseStep__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2079:1: ( rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1 )
            // InternalUseCaseDslParser.g:2080:2: rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1
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
    // InternalUseCaseDslParser.g:2087:1: rule__UseCaseStep__Group_2__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2091:1: ( ( () ) )
            // InternalUseCaseDslParser.g:2092:1: ( () )
            {
            // InternalUseCaseDslParser.g:2092:1: ( () )
            // InternalUseCaseDslParser.g:2093:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getSystemStepAction_2_0()); 
            // InternalUseCaseDslParser.g:2094:2: ()
            // InternalUseCaseDslParser.g:2094:3: 
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
    // InternalUseCaseDslParser.g:2102:1: rule__UseCaseStep__Group_2__1 : rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2 ;
    public final void rule__UseCaseStep__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2106:1: ( rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2 )
            // InternalUseCaseDslParser.g:2107:2: rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:2114:1: rule__UseCaseStep__Group_2__1__Impl : ( ( rule__UseCaseStep__Group_2_1__0 )? ) ;
    public final void rule__UseCaseStep__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2118:1: ( ( ( rule__UseCaseStep__Group_2_1__0 )? ) )
            // InternalUseCaseDslParser.g:2119:1: ( ( rule__UseCaseStep__Group_2_1__0 )? )
            {
            // InternalUseCaseDslParser.g:2119:1: ( ( rule__UseCaseStep__Group_2_1__0 )? )
            // InternalUseCaseDslParser.g:2120:2: ( rule__UseCaseStep__Group_2_1__0 )?
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_2_1()); 
            // InternalUseCaseDslParser.g:2121:2: ( rule__UseCaseStep__Group_2_1__0 )?
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
                    // InternalUseCaseDslParser.g:2121:3: rule__UseCaseStep__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCaseStep__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseStepAccess().getGroup_2_1()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2129:1: rule__UseCaseStep__Group_2__2 : rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3 ;
    public final void rule__UseCaseStep__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2133:1: ( rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3 )
            // InternalUseCaseDslParser.g:2134:2: rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCaseDslParser.g:2141:1: rule__UseCaseStep__Group_2__2__Impl : ( ( rule__UseCaseStep__NameAssignment_2_2 ) ) ;
    public final void rule__UseCaseStep__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2145:1: ( ( ( rule__UseCaseStep__NameAssignment_2_2 ) ) )
            // InternalUseCaseDslParser.g:2146:1: ( ( rule__UseCaseStep__NameAssignment_2_2 ) )
            {
            // InternalUseCaseDslParser.g:2146:1: ( ( rule__UseCaseStep__NameAssignment_2_2 ) )
            // InternalUseCaseDslParser.g:2147:2: ( rule__UseCaseStep__NameAssignment_2_2 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_2_2()); 
            // InternalUseCaseDslParser.g:2148:2: ( rule__UseCaseStep__NameAssignment_2_2 )
            // InternalUseCaseDslParser.g:2148:3: rule__UseCaseStep__NameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__NameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getNameAssignment_2_2()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2156:1: rule__UseCaseStep__Group_2__3 : rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4 ;
    public final void rule__UseCaseStep__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2160:1: ( rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4 )
            // InternalUseCaseDslParser.g:2161:2: rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalUseCaseDslParser.g:2168:1: rule__UseCaseStep__Group_2__3__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2172:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2173:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2173:1: ( FullStop )
            // InternalUseCaseDslParser.g:2174:2: FullStop
            {
             before(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_3()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_3()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2183:1: rule__UseCaseStep__Group_2__4 : rule__UseCaseStep__Group_2__4__Impl rule__UseCaseStep__Group_2__5 ;
    public final void rule__UseCaseStep__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2187:1: ( rule__UseCaseStep__Group_2__4__Impl rule__UseCaseStep__Group_2__5 )
            // InternalUseCaseDslParser.g:2188:2: rule__UseCaseStep__Group_2__4__Impl rule__UseCaseStep__Group_2__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCaseDslParser.g:2195:1: rule__UseCaseStep__Group_2__4__Impl : ( SYSTEM ) ;
    public final void rule__UseCaseStep__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2199:1: ( ( SYSTEM ) )
            // InternalUseCaseDslParser.g:2200:1: ( SYSTEM )
            {
            // InternalUseCaseDslParser.g:2200:1: ( SYSTEM )
            // InternalUseCaseDslParser.g:2201:2: SYSTEM
            {
             before(grammarAccess.getUseCaseStepAccess().getSYSTEMKeyword_2_4()); 
            match(input,SYSTEM,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getSYSTEMKeyword_2_4()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2210:1: rule__UseCaseStep__Group_2__5 : rule__UseCaseStep__Group_2__5__Impl ;
    public final void rule__UseCaseStep__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2214:1: ( rule__UseCaseStep__Group_2__5__Impl )
            // InternalUseCaseDslParser.g:2215:2: rule__UseCaseStep__Group_2__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalUseCaseDslParser.g:2221:1: rule__UseCaseStep__Group_2__5__Impl : ( ( rule__UseCaseStep__SentenceAssignment_2_5 ) ) ;
    public final void rule__UseCaseStep__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2225:1: ( ( ( rule__UseCaseStep__SentenceAssignment_2_5 ) ) )
            // InternalUseCaseDslParser.g:2226:1: ( ( rule__UseCaseStep__SentenceAssignment_2_5 ) )
            {
            // InternalUseCaseDslParser.g:2226:1: ( ( rule__UseCaseStep__SentenceAssignment_2_5 ) )
            // InternalUseCaseDslParser.g:2227:2: ( rule__UseCaseStep__SentenceAssignment_2_5 )
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_2_5()); 
            // InternalUseCaseDslParser.g:2228:2: ( rule__UseCaseStep__SentenceAssignment_2_5 )
            // InternalUseCaseDslParser.g:2228:3: rule__UseCaseStep__SentenceAssignment_2_5
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__SentenceAssignment_2_5();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_2_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__UseCaseStep__Group_2_1__0"
    // InternalUseCaseDslParser.g:2237:1: rule__UseCaseStep__Group_2_1__0 : rule__UseCaseStep__Group_2_1__0__Impl rule__UseCaseStep__Group_2_1__1 ;
    public final void rule__UseCaseStep__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2241:1: ( rule__UseCaseStep__Group_2_1__0__Impl rule__UseCaseStep__Group_2_1__1 )
            // InternalUseCaseDslParser.g:2242:2: rule__UseCaseStep__Group_2_1__0__Impl rule__UseCaseStep__Group_2_1__1
            {
            pushFollow(FOLLOW_17);
            rule__UseCaseStep__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2_1__0"


    // $ANTLR start "rule__UseCaseStep__Group_2_1__0__Impl"
    // InternalUseCaseDslParser.g:2249:1: rule__UseCaseStep__Group_2_1__0__Impl : ( ( rule__UseCaseStep__ParentAssignment_2_1_0 ) ) ;
    public final void rule__UseCaseStep__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2253:1: ( ( ( rule__UseCaseStep__ParentAssignment_2_1_0 ) ) )
            // InternalUseCaseDslParser.g:2254:1: ( ( rule__UseCaseStep__ParentAssignment_2_1_0 ) )
            {
            // InternalUseCaseDslParser.g:2254:1: ( ( rule__UseCaseStep__ParentAssignment_2_1_0 ) )
            // InternalUseCaseDslParser.g:2255:2: ( rule__UseCaseStep__ParentAssignment_2_1_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentAssignment_2_1_0()); 
            // InternalUseCaseDslParser.g:2256:2: ( rule__UseCaseStep__ParentAssignment_2_1_0 )
            // InternalUseCaseDslParser.g:2256:3: rule__UseCaseStep__ParentAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__ParentAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getParentAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2_1__0__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_2_1__1"
    // InternalUseCaseDslParser.g:2264:1: rule__UseCaseStep__Group_2_1__1 : rule__UseCaseStep__Group_2_1__1__Impl ;
    public final void rule__UseCaseStep__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2268:1: ( rule__UseCaseStep__Group_2_1__1__Impl )
            // InternalUseCaseDslParser.g:2269:2: rule__UseCaseStep__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2_1__1"


    // $ANTLR start "rule__UseCaseStep__Group_2_1__1__Impl"
    // InternalUseCaseDslParser.g:2275:1: rule__UseCaseStep__Group_2_1__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2279:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2280:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2280:1: ( FullStop )
            // InternalUseCaseDslParser.g:2281:2: FullStop
            {
             before(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_1_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_2_1__1__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_3__0"
    // InternalUseCaseDslParser.g:2291:1: rule__UseCaseStep__Group_3__0 : rule__UseCaseStep__Group_3__0__Impl rule__UseCaseStep__Group_3__1 ;
    public final void rule__UseCaseStep__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2295:1: ( rule__UseCaseStep__Group_3__0__Impl rule__UseCaseStep__Group_3__1 )
            // InternalUseCaseDslParser.g:2296:2: rule__UseCaseStep__Group_3__0__Impl rule__UseCaseStep__Group_3__1
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
    // InternalUseCaseDslParser.g:2303:1: rule__UseCaseStep__Group_3__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2307:1: ( ( () ) )
            // InternalUseCaseDslParser.g:2308:1: ( () )
            {
            // InternalUseCaseDslParser.g:2308:1: ( () )
            // InternalUseCaseDslParser.g:2309:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatingStepAction_3_0()); 
            // InternalUseCaseDslParser.g:2310:2: ()
            // InternalUseCaseDslParser.g:2310:3: 
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
    // InternalUseCaseDslParser.g:2318:1: rule__UseCaseStep__Group_3__1 : rule__UseCaseStep__Group_3__1__Impl rule__UseCaseStep__Group_3__2 ;
    public final void rule__UseCaseStep__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2322:1: ( rule__UseCaseStep__Group_3__1__Impl rule__UseCaseStep__Group_3__2 )
            // InternalUseCaseDslParser.g:2323:2: rule__UseCaseStep__Group_3__1__Impl rule__UseCaseStep__Group_3__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:2330:1: rule__UseCaseStep__Group_3__1__Impl : ( ( rule__UseCaseStep__Group_3_1__0 )? ) ;
    public final void rule__UseCaseStep__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2334:1: ( ( ( rule__UseCaseStep__Group_3_1__0 )? ) )
            // InternalUseCaseDslParser.g:2335:1: ( ( rule__UseCaseStep__Group_3_1__0 )? )
            {
            // InternalUseCaseDslParser.g:2335:1: ( ( rule__UseCaseStep__Group_3_1__0 )? )
            // InternalUseCaseDslParser.g:2336:2: ( rule__UseCaseStep__Group_3_1__0 )?
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_3_1()); 
            // InternalUseCaseDslParser.g:2337:2: ( rule__UseCaseStep__Group_3_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==FullStop) ) {
                    int LA22_2 = input.LA(3);

                    if ( (LA22_2==RULE_INT) ) {
                        alt22=1;
                    }
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalUseCaseDslParser.g:2337:3: rule__UseCaseStep__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCaseStep__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseStepAccess().getGroup_3_1()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2345:1: rule__UseCaseStep__Group_3__2 : rule__UseCaseStep__Group_3__2__Impl rule__UseCaseStep__Group_3__3 ;
    public final void rule__UseCaseStep__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2349:1: ( rule__UseCaseStep__Group_3__2__Impl rule__UseCaseStep__Group_3__3 )
            // InternalUseCaseDslParser.g:2350:2: rule__UseCaseStep__Group_3__2__Impl rule__UseCaseStep__Group_3__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCaseDslParser.g:2357:1: rule__UseCaseStep__Group_3__2__Impl : ( ( rule__UseCaseStep__NameAssignment_3_2 ) ) ;
    public final void rule__UseCaseStep__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2361:1: ( ( ( rule__UseCaseStep__NameAssignment_3_2 ) ) )
            // InternalUseCaseDslParser.g:2362:1: ( ( rule__UseCaseStep__NameAssignment_3_2 ) )
            {
            // InternalUseCaseDslParser.g:2362:1: ( ( rule__UseCaseStep__NameAssignment_3_2 ) )
            // InternalUseCaseDslParser.g:2363:2: ( rule__UseCaseStep__NameAssignment_3_2 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_3_2()); 
            // InternalUseCaseDslParser.g:2364:2: ( rule__UseCaseStep__NameAssignment_3_2 )
            // InternalUseCaseDslParser.g:2364:3: rule__UseCaseStep__NameAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__NameAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getNameAssignment_3_2()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2372:1: rule__UseCaseStep__Group_3__3 : rule__UseCaseStep__Group_3__3__Impl rule__UseCaseStep__Group_3__4 ;
    public final void rule__UseCaseStep__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2376:1: ( rule__UseCaseStep__Group_3__3__Impl rule__UseCaseStep__Group_3__4 )
            // InternalUseCaseDslParser.g:2377:2: rule__UseCaseStep__Group_3__3__Impl rule__UseCaseStep__Group_3__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalUseCaseDslParser.g:2384:1: rule__UseCaseStep__Group_3__3__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2388:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2389:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2389:1: ( FullStop )
            // InternalUseCaseDslParser.g:2390:2: FullStop
            {
             before(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_3_3()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_3_3()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2399:1: rule__UseCaseStep__Group_3__4 : rule__UseCaseStep__Group_3__4__Impl rule__UseCaseStep__Group_3__5 ;
    public final void rule__UseCaseStep__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2403:1: ( rule__UseCaseStep__Group_3__4__Impl rule__UseCaseStep__Group_3__5 )
            // InternalUseCaseDslParser.g:2404:2: rule__UseCaseStep__Group_3__4__Impl rule__UseCaseStep__Group_3__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalUseCaseDslParser.g:2411:1: rule__UseCaseStep__Group_3__4__Impl : ( WHILE ) ;
    public final void rule__UseCaseStep__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2415:1: ( ( WHILE ) )
            // InternalUseCaseDslParser.g:2416:1: ( WHILE )
            {
            // InternalUseCaseDslParser.g:2416:1: ( WHILE )
            // InternalUseCaseDslParser.g:2417:2: WHILE
            {
             before(grammarAccess.getUseCaseStepAccess().getWHILEKeyword_3_4()); 
            match(input,WHILE,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getWHILEKeyword_3_4()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2426:1: rule__UseCaseStep__Group_3__5 : rule__UseCaseStep__Group_3__5__Impl rule__UseCaseStep__Group_3__6 ;
    public final void rule__UseCaseStep__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2430:1: ( rule__UseCaseStep__Group_3__5__Impl rule__UseCaseStep__Group_3__6 )
            // InternalUseCaseDslParser.g:2431:2: rule__UseCaseStep__Group_3__5__Impl rule__UseCaseStep__Group_3__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCaseDslParser.g:2438:1: rule__UseCaseStep__Group_3__5__Impl : ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 ) ) ;
    public final void rule__UseCaseStep__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2442:1: ( ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 ) ) )
            // InternalUseCaseDslParser.g:2443:1: ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 ) )
            {
            // InternalUseCaseDslParser.g:2443:1: ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 ) )
            // InternalUseCaseDslParser.g:2444:2: ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 )
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatingConditionAssignment_3_5()); 
            // InternalUseCaseDslParser.g:2445:2: ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 )
            // InternalUseCaseDslParser.g:2445:3: rule__UseCaseStep__RepeatingConditionAssignment_3_5
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__RepeatingConditionAssignment_3_5();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getRepeatingConditionAssignment_3_5()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2453:1: rule__UseCaseStep__Group_3__6 : rule__UseCaseStep__Group_3__6__Impl rule__UseCaseStep__Group_3__7 ;
    public final void rule__UseCaseStep__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2457:1: ( rule__UseCaseStep__Group_3__6__Impl rule__UseCaseStep__Group_3__7 )
            // InternalUseCaseDslParser.g:2458:2: rule__UseCaseStep__Group_3__6__Impl rule__UseCaseStep__Group_3__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalUseCaseDslParser.g:2465:1: rule__UseCaseStep__Group_3__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCaseStep__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2469:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:2470:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:2470:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:2471:2: RULE_BEGIN
            {
             before(grammarAccess.getUseCaseStepAccess().getBEGINTerminalRuleCall_3_6()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getBEGINTerminalRuleCall_3_6()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2480:1: rule__UseCaseStep__Group_3__7 : rule__UseCaseStep__Group_3__7__Impl rule__UseCaseStep__Group_3__8 ;
    public final void rule__UseCaseStep__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2484:1: ( rule__UseCaseStep__Group_3__7__Impl rule__UseCaseStep__Group_3__8 )
            // InternalUseCaseDslParser.g:2485:2: rule__UseCaseStep__Group_3__7__Impl rule__UseCaseStep__Group_3__8
            {
            pushFollow(FOLLOW_12);
            rule__UseCaseStep__Group_3__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3__8();

            state._fsp--;


            }

        }
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
    // InternalUseCaseDslParser.g:2492:1: rule__UseCaseStep__Group_3__7__Impl : ( ( ( rule__UseCaseStep__StepsAssignment_3_7 ) ) ( ( rule__UseCaseStep__StepsAssignment_3_7 )* ) ) ;
    public final void rule__UseCaseStep__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2496:1: ( ( ( ( rule__UseCaseStep__StepsAssignment_3_7 ) ) ( ( rule__UseCaseStep__StepsAssignment_3_7 )* ) ) )
            // InternalUseCaseDslParser.g:2497:1: ( ( ( rule__UseCaseStep__StepsAssignment_3_7 ) ) ( ( rule__UseCaseStep__StepsAssignment_3_7 )* ) )
            {
            // InternalUseCaseDslParser.g:2497:1: ( ( ( rule__UseCaseStep__StepsAssignment_3_7 ) ) ( ( rule__UseCaseStep__StepsAssignment_3_7 )* ) )
            // InternalUseCaseDslParser.g:2498:2: ( ( rule__UseCaseStep__StepsAssignment_3_7 ) ) ( ( rule__UseCaseStep__StepsAssignment_3_7 )* )
            {
            // InternalUseCaseDslParser.g:2498:2: ( ( rule__UseCaseStep__StepsAssignment_3_7 ) )
            // InternalUseCaseDslParser.g:2499:3: ( rule__UseCaseStep__StepsAssignment_3_7 )
            {
             before(grammarAccess.getUseCaseStepAccess().getStepsAssignment_3_7()); 
            // InternalUseCaseDslParser.g:2500:3: ( rule__UseCaseStep__StepsAssignment_3_7 )
            // InternalUseCaseDslParser.g:2500:4: rule__UseCaseStep__StepsAssignment_3_7
            {
            pushFollow(FOLLOW_13);
            rule__UseCaseStep__StepsAssignment_3_7();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getStepsAssignment_3_7()); 

            }

            // InternalUseCaseDslParser.g:2503:2: ( ( rule__UseCaseStep__StepsAssignment_3_7 )* )
            // InternalUseCaseDslParser.g:2504:3: ( rule__UseCaseStep__StepsAssignment_3_7 )*
            {
             before(grammarAccess.getUseCaseStepAccess().getStepsAssignment_3_7()); 
            // InternalUseCaseDslParser.g:2505:3: ( rule__UseCaseStep__StepsAssignment_3_7 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_INT) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:2505:4: rule__UseCaseStep__StepsAssignment_3_7
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UseCaseStep__StepsAssignment_3_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getUseCaseStepAccess().getStepsAssignment_3_7()); 

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
    // $ANTLR end "rule__UseCaseStep__Group_3__7__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_3__8"
    // InternalUseCaseDslParser.g:2514:1: rule__UseCaseStep__Group_3__8 : rule__UseCaseStep__Group_3__8__Impl ;
    public final void rule__UseCaseStep__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2518:1: ( rule__UseCaseStep__Group_3__8__Impl )
            // InternalUseCaseDslParser.g:2519:2: rule__UseCaseStep__Group_3__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__8"


    // $ANTLR start "rule__UseCaseStep__Group_3__8__Impl"
    // InternalUseCaseDslParser.g:2525:1: rule__UseCaseStep__Group_3__8__Impl : ( RULE_END ) ;
    public final void rule__UseCaseStep__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2529:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:2530:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:2530:1: ( RULE_END )
            // InternalUseCaseDslParser.g:2531:2: RULE_END
            {
             before(grammarAccess.getUseCaseStepAccess().getENDTerminalRuleCall_3_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getENDTerminalRuleCall_3_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3__8__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_3_1__0"
    // InternalUseCaseDslParser.g:2541:1: rule__UseCaseStep__Group_3_1__0 : rule__UseCaseStep__Group_3_1__0__Impl rule__UseCaseStep__Group_3_1__1 ;
    public final void rule__UseCaseStep__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2545:1: ( rule__UseCaseStep__Group_3_1__0__Impl rule__UseCaseStep__Group_3_1__1 )
            // InternalUseCaseDslParser.g:2546:2: rule__UseCaseStep__Group_3_1__0__Impl rule__UseCaseStep__Group_3_1__1
            {
            pushFollow(FOLLOW_17);
            rule__UseCaseStep__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3_1__0"


    // $ANTLR start "rule__UseCaseStep__Group_3_1__0__Impl"
    // InternalUseCaseDslParser.g:2553:1: rule__UseCaseStep__Group_3_1__0__Impl : ( ( rule__UseCaseStep__ParentAssignment_3_1_0 ) ) ;
    public final void rule__UseCaseStep__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2557:1: ( ( ( rule__UseCaseStep__ParentAssignment_3_1_0 ) ) )
            // InternalUseCaseDslParser.g:2558:1: ( ( rule__UseCaseStep__ParentAssignment_3_1_0 ) )
            {
            // InternalUseCaseDslParser.g:2558:1: ( ( rule__UseCaseStep__ParentAssignment_3_1_0 ) )
            // InternalUseCaseDslParser.g:2559:2: ( rule__UseCaseStep__ParentAssignment_3_1_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentAssignment_3_1_0()); 
            // InternalUseCaseDslParser.g:2560:2: ( rule__UseCaseStep__ParentAssignment_3_1_0 )
            // InternalUseCaseDslParser.g:2560:3: rule__UseCaseStep__ParentAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__ParentAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getParentAssignment_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3_1__0__Impl"


    // $ANTLR start "rule__UseCaseStep__Group_3_1__1"
    // InternalUseCaseDslParser.g:2568:1: rule__UseCaseStep__Group_3_1__1 : rule__UseCaseStep__Group_3_1__1__Impl ;
    public final void rule__UseCaseStep__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2572:1: ( rule__UseCaseStep__Group_3_1__1__Impl )
            // InternalUseCaseDslParser.g:2573:2: rule__UseCaseStep__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseStep__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3_1__1"


    // $ANTLR start "rule__UseCaseStep__Group_3_1__1__Impl"
    // InternalUseCaseDslParser.g:2579:1: rule__UseCaseStep__Group_3_1__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2583:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2584:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2584:1: ( FullStop )
            // InternalUseCaseDslParser.g:2585:2: FullStop
            {
             before(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_3_1_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getUseCaseStepAccess().getFullStopKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__Group_3_1__1__Impl"


    // $ANTLR start "rule__ExtensionStep__Group_0__0"
    // InternalUseCaseDslParser.g:2595:1: rule__ExtensionStep__Group_0__0 : rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1 ;
    public final void rule__ExtensionStep__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2599:1: ( rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1 )
            // InternalUseCaseDslParser.g:2600:2: rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCaseDslParser.g:2607:1: rule__ExtensionStep__Group_0__0__Impl : ( ( rule__ExtensionStep__NameAssignment_0_0 ) ) ;
    public final void rule__ExtensionStep__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2611:1: ( ( ( rule__ExtensionStep__NameAssignment_0_0 ) ) )
            // InternalUseCaseDslParser.g:2612:1: ( ( rule__ExtensionStep__NameAssignment_0_0 ) )
            {
            // InternalUseCaseDslParser.g:2612:1: ( ( rule__ExtensionStep__NameAssignment_0_0 ) )
            // InternalUseCaseDslParser.g:2613:2: ( rule__ExtensionStep__NameAssignment_0_0 )
            {
             before(grammarAccess.getExtensionStepAccess().getNameAssignment_0_0()); 
            // InternalUseCaseDslParser.g:2614:2: ( rule__ExtensionStep__NameAssignment_0_0 )
            // InternalUseCaseDslParser.g:2614:3: rule__ExtensionStep__NameAssignment_0_0
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
    // InternalUseCaseDslParser.g:2622:1: rule__ExtensionStep__Group_0__1 : rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2 ;
    public final void rule__ExtensionStep__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2626:1: ( rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2 )
            // InternalUseCaseDslParser.g:2627:2: rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalUseCaseDslParser.g:2634:1: rule__ExtensionStep__Group_0__1__Impl : ( FullStop ) ;
    public final void rule__ExtensionStep__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2638:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2639:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2639:1: ( FullStop )
            // InternalUseCaseDslParser.g:2640:2: FullStop
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
    // InternalUseCaseDslParser.g:2649:1: rule__ExtensionStep__Group_0__2 : rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3 ;
    public final void rule__ExtensionStep__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2653:1: ( rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3 )
            // InternalUseCaseDslParser.g:2654:2: rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCaseDslParser.g:2661:1: rule__ExtensionStep__Group_0__2__Impl : ( INCLUDE ) ;
    public final void rule__ExtensionStep__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2665:1: ( ( INCLUDE ) )
            // InternalUseCaseDslParser.g:2666:1: ( INCLUDE )
            {
            // InternalUseCaseDslParser.g:2666:1: ( INCLUDE )
            // InternalUseCaseDslParser.g:2667:2: INCLUDE
            {
             before(grammarAccess.getExtensionStepAccess().getINCLUDEKeyword_0_2()); 
            match(input,INCLUDE,FOLLOW_2); 
             after(grammarAccess.getExtensionStepAccess().getINCLUDEKeyword_0_2()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:2676:1: rule__ExtensionStep__Group_0__3 : rule__ExtensionStep__Group_0__3__Impl ;
    public final void rule__ExtensionStep__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2680:1: ( rule__ExtensionStep__Group_0__3__Impl )
            // InternalUseCaseDslParser.g:2681:2: rule__ExtensionStep__Group_0__3__Impl
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
    // InternalUseCaseDslParser.g:2687:1: rule__ExtensionStep__Group_0__3__Impl : ( ( rule__ExtensionStep__ReferenceAssignment_0_3 ) ) ;
    public final void rule__ExtensionStep__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2691:1: ( ( ( rule__ExtensionStep__ReferenceAssignment_0_3 ) ) )
            // InternalUseCaseDslParser.g:2692:1: ( ( rule__ExtensionStep__ReferenceAssignment_0_3 ) )
            {
            // InternalUseCaseDslParser.g:2692:1: ( ( rule__ExtensionStep__ReferenceAssignment_0_3 ) )
            // InternalUseCaseDslParser.g:2693:2: ( rule__ExtensionStep__ReferenceAssignment_0_3 )
            {
             before(grammarAccess.getExtensionStepAccess().getReferenceAssignment_0_3()); 
            // InternalUseCaseDslParser.g:2694:2: ( rule__ExtensionStep__ReferenceAssignment_0_3 )
            // InternalUseCaseDslParser.g:2694:3: rule__ExtensionStep__ReferenceAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__ReferenceAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getExtensionStepAccess().getReferenceAssignment_0_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ExtensionStep__Group_1__0"
    // InternalUseCaseDslParser.g:2703:1: rule__ExtensionStep__Group_1__0 : rule__ExtensionStep__Group_1__0__Impl rule__ExtensionStep__Group_1__1 ;
    public final void rule__ExtensionStep__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2707:1: ( rule__ExtensionStep__Group_1__0__Impl rule__ExtensionStep__Group_1__1 )
            // InternalUseCaseDslParser.g:2708:2: rule__ExtensionStep__Group_1__0__Impl rule__ExtensionStep__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__ExtensionStep__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_1__0"


    // $ANTLR start "rule__ExtensionStep__Group_1__0__Impl"
    // InternalUseCaseDslParser.g:2715:1: rule__ExtensionStep__Group_1__0__Impl : ( ( rule__ExtensionStep__NameAssignment_1_0 ) ) ;
    public final void rule__ExtensionStep__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2719:1: ( ( ( rule__ExtensionStep__NameAssignment_1_0 ) ) )
            // InternalUseCaseDslParser.g:2720:1: ( ( rule__ExtensionStep__NameAssignment_1_0 ) )
            {
            // InternalUseCaseDslParser.g:2720:1: ( ( rule__ExtensionStep__NameAssignment_1_0 ) )
            // InternalUseCaseDslParser.g:2721:2: ( rule__ExtensionStep__NameAssignment_1_0 )
            {
             before(grammarAccess.getExtensionStepAccess().getNameAssignment_1_0()); 
            // InternalUseCaseDslParser.g:2722:2: ( rule__ExtensionStep__NameAssignment_1_0 )
            // InternalUseCaseDslParser.g:2722:3: rule__ExtensionStep__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionStepAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_1__0__Impl"


    // $ANTLR start "rule__ExtensionStep__Group_1__1"
    // InternalUseCaseDslParser.g:2730:1: rule__ExtensionStep__Group_1__1 : rule__ExtensionStep__Group_1__1__Impl rule__ExtensionStep__Group_1__2 ;
    public final void rule__ExtensionStep__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2734:1: ( rule__ExtensionStep__Group_1__1__Impl rule__ExtensionStep__Group_1__2 )
            // InternalUseCaseDslParser.g:2735:2: rule__ExtensionStep__Group_1__1__Impl rule__ExtensionStep__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__ExtensionStep__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_1__1"


    // $ANTLR start "rule__ExtensionStep__Group_1__1__Impl"
    // InternalUseCaseDslParser.g:2742:1: rule__ExtensionStep__Group_1__1__Impl : ( FullStop ) ;
    public final void rule__ExtensionStep__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2746:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2747:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2747:1: ( FullStop )
            // InternalUseCaseDslParser.g:2748:2: FullStop
            {
             before(grammarAccess.getExtensionStepAccess().getFullStopKeyword_1_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getExtensionStepAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_1__1__Impl"


    // $ANTLR start "rule__ExtensionStep__Group_1__2"
    // InternalUseCaseDslParser.g:2757:1: rule__ExtensionStep__Group_1__2 : rule__ExtensionStep__Group_1__2__Impl rule__ExtensionStep__Group_1__3 ;
    public final void rule__ExtensionStep__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2761:1: ( rule__ExtensionStep__Group_1__2__Impl rule__ExtensionStep__Group_1__3 )
            // InternalUseCaseDslParser.g:2762:2: rule__ExtensionStep__Group_1__2__Impl rule__ExtensionStep__Group_1__3
            {
            pushFollow(FOLLOW_27);
            rule__ExtensionStep__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_1__2"


    // $ANTLR start "rule__ExtensionStep__Group_1__2__Impl"
    // InternalUseCaseDslParser.g:2769:1: rule__ExtensionStep__Group_1__2__Impl : ( ( rule__ExtensionStep__Alternatives_1_2 )? ) ;
    public final void rule__ExtensionStep__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2773:1: ( ( ( rule__ExtensionStep__Alternatives_1_2 )? ) )
            // InternalUseCaseDslParser.g:2774:1: ( ( rule__ExtensionStep__Alternatives_1_2 )? )
            {
            // InternalUseCaseDslParser.g:2774:1: ( ( rule__ExtensionStep__Alternatives_1_2 )? )
            // InternalUseCaseDslParser.g:2775:2: ( rule__ExtensionStep__Alternatives_1_2 )?
            {
             before(grammarAccess.getExtensionStepAccess().getAlternatives_1_2()); 
            // InternalUseCaseDslParser.g:2776:2: ( rule__ExtensionStep__Alternatives_1_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=SYSTEM && LA24_0<=WHILE)||LA24_0==USER) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCaseDslParser.g:2776:3: rule__ExtensionStep__Alternatives_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExtensionStep__Alternatives_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtensionStepAccess().getAlternatives_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_1__2__Impl"


    // $ANTLR start "rule__ExtensionStep__Group_1__3"
    // InternalUseCaseDslParser.g:2784:1: rule__ExtensionStep__Group_1__3 : rule__ExtensionStep__Group_1__3__Impl ;
    public final void rule__ExtensionStep__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2788:1: ( rule__ExtensionStep__Group_1__3__Impl )
            // InternalUseCaseDslParser.g:2789:2: rule__ExtensionStep__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_1__3"


    // $ANTLR start "rule__ExtensionStep__Group_1__3__Impl"
    // InternalUseCaseDslParser.g:2795:1: rule__ExtensionStep__Group_1__3__Impl : ( ( rule__ExtensionStep__SentenceAssignment_1_3 ) ) ;
    public final void rule__ExtensionStep__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2799:1: ( ( ( rule__ExtensionStep__SentenceAssignment_1_3 ) ) )
            // InternalUseCaseDslParser.g:2800:1: ( ( rule__ExtensionStep__SentenceAssignment_1_3 ) )
            {
            // InternalUseCaseDslParser.g:2800:1: ( ( rule__ExtensionStep__SentenceAssignment_1_3 ) )
            // InternalUseCaseDslParser.g:2801:2: ( rule__ExtensionStep__SentenceAssignment_1_3 )
            {
             before(grammarAccess.getExtensionStepAccess().getSentenceAssignment_1_3()); 
            // InternalUseCaseDslParser.g:2802:2: ( rule__ExtensionStep__SentenceAssignment_1_3 )
            // InternalUseCaseDslParser.g:2802:3: rule__ExtensionStep__SentenceAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__ExtensionStep__SentenceAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getExtensionStepAccess().getSentenceAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__Group_1__3__Impl"


    // $ANTLR start "rule__DeadEndStep__Group__0"
    // InternalUseCaseDslParser.g:2811:1: rule__DeadEndStep__Group__0 : rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1 ;
    public final void rule__DeadEndStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2815:1: ( rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1 )
            // InternalUseCaseDslParser.g:2816:2: rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCaseDslParser.g:2823:1: rule__DeadEndStep__Group__0__Impl : ( ( rule__DeadEndStep__NameAssignment_0 ) ) ;
    public final void rule__DeadEndStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2827:1: ( ( ( rule__DeadEndStep__NameAssignment_0 ) ) )
            // InternalUseCaseDslParser.g:2828:1: ( ( rule__DeadEndStep__NameAssignment_0 ) )
            {
            // InternalUseCaseDslParser.g:2828:1: ( ( rule__DeadEndStep__NameAssignment_0 ) )
            // InternalUseCaseDslParser.g:2829:2: ( rule__DeadEndStep__NameAssignment_0 )
            {
             before(grammarAccess.getDeadEndStepAccess().getNameAssignment_0()); 
            // InternalUseCaseDslParser.g:2830:2: ( rule__DeadEndStep__NameAssignment_0 )
            // InternalUseCaseDslParser.g:2830:3: rule__DeadEndStep__NameAssignment_0
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
    // InternalUseCaseDslParser.g:2838:1: rule__DeadEndStep__Group__1 : rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2 ;
    public final void rule__DeadEndStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2842:1: ( rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2 )
            // InternalUseCaseDslParser.g:2843:2: rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalUseCaseDslParser.g:2850:1: rule__DeadEndStep__Group__1__Impl : ( FullStop ) ;
    public final void rule__DeadEndStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2854:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2855:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2855:1: ( FullStop )
            // InternalUseCaseDslParser.g:2856:2: FullStop
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
    // InternalUseCaseDslParser.g:2865:1: rule__DeadEndStep__Group__2 : rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3 ;
    public final void rule__DeadEndStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2869:1: ( rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3 )
            // InternalUseCaseDslParser.g:2870:2: rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalUseCaseDslParser.g:2877:1: rule__DeadEndStep__Group__2__Impl : ( ( rule__DeadEndStep__Alternatives_2 )? ) ;
    public final void rule__DeadEndStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2881:1: ( ( ( rule__DeadEndStep__Alternatives_2 )? ) )
            // InternalUseCaseDslParser.g:2882:1: ( ( rule__DeadEndStep__Alternatives_2 )? )
            {
            // InternalUseCaseDslParser.g:2882:1: ( ( rule__DeadEndStep__Alternatives_2 )? )
            // InternalUseCaseDslParser.g:2883:2: ( rule__DeadEndStep__Alternatives_2 )?
            {
             before(grammarAccess.getDeadEndStepAccess().getAlternatives_2()); 
            // InternalUseCaseDslParser.g:2884:2: ( rule__DeadEndStep__Alternatives_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=SYSTEM && LA25_0<=WHILE)||LA25_0==USER) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUseCaseDslParser.g:2884:3: rule__DeadEndStep__Alternatives_2
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
    // InternalUseCaseDslParser.g:2892:1: rule__DeadEndStep__Group__3 : rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4 ;
    public final void rule__DeadEndStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2896:1: ( rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4 )
            // InternalUseCaseDslParser.g:2897:2: rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalUseCaseDslParser.g:2904:1: rule__DeadEndStep__Group__3__Impl : ( ( rule__DeadEndStep__SentenceAssignment_3 )? ) ;
    public final void rule__DeadEndStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2908:1: ( ( ( rule__DeadEndStep__SentenceAssignment_3 )? ) )
            // InternalUseCaseDslParser.g:2909:1: ( ( rule__DeadEndStep__SentenceAssignment_3 )? )
            {
            // InternalUseCaseDslParser.g:2909:1: ( ( rule__DeadEndStep__SentenceAssignment_3 )? )
            // InternalUseCaseDslParser.g:2910:2: ( rule__DeadEndStep__SentenceAssignment_3 )?
            {
             before(grammarAccess.getDeadEndStepAccess().getSentenceAssignment_3()); 
            // InternalUseCaseDslParser.g:2911:2: ( rule__DeadEndStep__SentenceAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=QuotationMark && LA26_0<=RULE_CHAR)||LA26_0==RULE_ID||LA26_0==RULE_ANY_OTHER) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUseCaseDslParser.g:2911:3: rule__DeadEndStep__SentenceAssignment_3
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
    // InternalUseCaseDslParser.g:2919:1: rule__DeadEndStep__Group__4 : rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5 ;
    public final void rule__DeadEndStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2923:1: ( rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5 )
            // InternalUseCaseDslParser.g:2924:2: rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalUseCaseDslParser.g:2931:1: rule__DeadEndStep__Group__4__Impl : ( UC ) ;
    public final void rule__DeadEndStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2935:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:2936:1: ( UC )
            {
            // InternalUseCaseDslParser.g:2936:1: ( UC )
            // InternalUseCaseDslParser.g:2937:2: UC
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
    // InternalUseCaseDslParser.g:2946:1: rule__DeadEndStep__Group__5 : rule__DeadEndStep__Group__5__Impl ;
    public final void rule__DeadEndStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2950:1: ( rule__DeadEndStep__Group__5__Impl )
            // InternalUseCaseDslParser.g:2951:2: rule__DeadEndStep__Group__5__Impl
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
    // InternalUseCaseDslParser.g:2957:1: rule__DeadEndStep__Group__5__Impl : ( END ) ;
    public final void rule__DeadEndStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2961:1: ( ( END ) )
            // InternalUseCaseDslParser.g:2962:1: ( END )
            {
            // InternalUseCaseDslParser.g:2962:1: ( END )
            // InternalUseCaseDslParser.g:2963:2: END
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
    // InternalUseCaseDslParser.g:2973:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2977:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalUseCaseDslParser.g:2978:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
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
    // InternalUseCaseDslParser.g:2985:1: rule__Precondition__Group__0__Impl : ( PRECONDITION ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2989:1: ( ( PRECONDITION ) )
            // InternalUseCaseDslParser.g:2990:1: ( PRECONDITION )
            {
            // InternalUseCaseDslParser.g:2990:1: ( PRECONDITION )
            // InternalUseCaseDslParser.g:2991:2: PRECONDITION
            {
             before(grammarAccess.getPreconditionAccess().getPRECONDITIONKeyword_0()); 
            match(input,PRECONDITION,FOLLOW_2); 
             after(grammarAccess.getPreconditionAccess().getPRECONDITIONKeyword_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:3000:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl rule__Precondition__Group__2 ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3004:1: ( rule__Precondition__Group__1__Impl rule__Precondition__Group__2 )
            // InternalUseCaseDslParser.g:3005:2: rule__Precondition__Group__1__Impl rule__Precondition__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalUseCaseDslParser.g:3012:1: rule__Precondition__Group__1__Impl : ( Colon ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3016:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:3017:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:3017:1: ( Colon )
            // InternalUseCaseDslParser.g:3018:2: Colon
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
    // InternalUseCaseDslParser.g:3027:1: rule__Precondition__Group__2 : rule__Precondition__Group__2__Impl ;
    public final void rule__Precondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3031:1: ( rule__Precondition__Group__2__Impl )
            // InternalUseCaseDslParser.g:3032:2: rule__Precondition__Group__2__Impl
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
    // InternalUseCaseDslParser.g:3038:1: rule__Precondition__Group__2__Impl : ( ( rule__Precondition__ConditionAssignment_2 ) ) ;
    public final void rule__Precondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3042:1: ( ( ( rule__Precondition__ConditionAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:3043:1: ( ( rule__Precondition__ConditionAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:3043:1: ( ( rule__Precondition__ConditionAssignment_2 ) )
            // InternalUseCaseDslParser.g:3044:2: ( rule__Precondition__ConditionAssignment_2 )
            {
             before(grammarAccess.getPreconditionAccess().getConditionAssignment_2()); 
            // InternalUseCaseDslParser.g:3045:2: ( rule__Precondition__ConditionAssignment_2 )
            // InternalUseCaseDslParser.g:3045:3: rule__Precondition__ConditionAssignment_2
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
    // InternalUseCaseDslParser.g:3054:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3058:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalUseCaseDslParser.g:3059:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
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
    // InternalUseCaseDslParser.g:3066:1: rule__Postcondition__Group__0__Impl : ( POSTCONDITION ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3070:1: ( ( POSTCONDITION ) )
            // InternalUseCaseDslParser.g:3071:1: ( POSTCONDITION )
            {
            // InternalUseCaseDslParser.g:3071:1: ( POSTCONDITION )
            // InternalUseCaseDslParser.g:3072:2: POSTCONDITION
            {
             before(grammarAccess.getPostconditionAccess().getPOSTCONDITIONKeyword_0()); 
            match(input,POSTCONDITION,FOLLOW_2); 
             after(grammarAccess.getPostconditionAccess().getPOSTCONDITIONKeyword_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:3081:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3085:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalUseCaseDslParser.g:3086:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalUseCaseDslParser.g:3093:1: rule__Postcondition__Group__1__Impl : ( Colon ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3097:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:3098:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:3098:1: ( Colon )
            // InternalUseCaseDslParser.g:3099:2: Colon
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
    // InternalUseCaseDslParser.g:3108:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3112:1: ( rule__Postcondition__Group__2__Impl )
            // InternalUseCaseDslParser.g:3113:2: rule__Postcondition__Group__2__Impl
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
    // InternalUseCaseDslParser.g:3119:1: rule__Postcondition__Group__2__Impl : ( ( rule__Postcondition__ConditionAssignment_2 ) ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3123:1: ( ( ( rule__Postcondition__ConditionAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:3124:1: ( ( rule__Postcondition__ConditionAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:3124:1: ( ( rule__Postcondition__ConditionAssignment_2 ) )
            // InternalUseCaseDslParser.g:3125:2: ( rule__Postcondition__ConditionAssignment_2 )
            {
             before(grammarAccess.getPostconditionAccess().getConditionAssignment_2()); 
            // InternalUseCaseDslParser.g:3126:2: ( rule__Postcondition__ConditionAssignment_2 )
            // InternalUseCaseDslParser.g:3126:3: rule__Postcondition__ConditionAssignment_2
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


    // $ANTLR start "rule__QualifiedStepName__Group__0"
    // InternalUseCaseDslParser.g:3135:1: rule__QualifiedStepName__Group__0 : rule__QualifiedStepName__Group__0__Impl rule__QualifiedStepName__Group__1 ;
    public final void rule__QualifiedStepName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3139:1: ( rule__QualifiedStepName__Group__0__Impl rule__QualifiedStepName__Group__1 )
            // InternalUseCaseDslParser.g:3140:2: rule__QualifiedStepName__Group__0__Impl rule__QualifiedStepName__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__QualifiedStepName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedStepName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedStepName__Group__0"


    // $ANTLR start "rule__QualifiedStepName__Group__0__Impl"
    // InternalUseCaseDslParser.g:3147:1: rule__QualifiedStepName__Group__0__Impl : ( ruleStepName ) ;
    public final void rule__QualifiedStepName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3151:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3152:1: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3152:1: ( ruleStepName )
            // InternalUseCaseDslParser.g:3153:2: ruleStepName
            {
             before(grammarAccess.getQualifiedStepNameAccess().getStepNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getQualifiedStepNameAccess().getStepNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedStepName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedStepName__Group__1"
    // InternalUseCaseDslParser.g:3162:1: rule__QualifiedStepName__Group__1 : rule__QualifiedStepName__Group__1__Impl ;
    public final void rule__QualifiedStepName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3166:1: ( rule__QualifiedStepName__Group__1__Impl )
            // InternalUseCaseDslParser.g:3167:2: rule__QualifiedStepName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedStepName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedStepName__Group__1"


    // $ANTLR start "rule__QualifiedStepName__Group__1__Impl"
    // InternalUseCaseDslParser.g:3173:1: rule__QualifiedStepName__Group__1__Impl : ( ( rule__QualifiedStepName__Group_1__0 )* ) ;
    public final void rule__QualifiedStepName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3177:1: ( ( ( rule__QualifiedStepName__Group_1__0 )* ) )
            // InternalUseCaseDslParser.g:3178:1: ( ( rule__QualifiedStepName__Group_1__0 )* )
            {
            // InternalUseCaseDslParser.g:3178:1: ( ( rule__QualifiedStepName__Group_1__0 )* )
            // InternalUseCaseDslParser.g:3179:2: ( rule__QualifiedStepName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedStepNameAccess().getGroup_1()); 
            // InternalUseCaseDslParser.g:3180:2: ( rule__QualifiedStepName__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==FullStop) ) {
                    int LA27_2 = input.LA(2);

                    if ( (LA27_2==RULE_INT) ) {
                        int LA27_3 = input.LA(3);

                        if ( (LA27_3==FullStop) ) {
                            int LA27_4 = input.LA(4);

                            if ( (LA27_4==RULE_CHAR||LA27_4==RULE_INT) ) {
                                alt27=1;
                            }


                        }
                        else if ( (LA27_3==EOF||LA27_3==RULE_END) ) {
                            alt27=1;
                        }


                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:3180:3: rule__QualifiedStepName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__QualifiedStepName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getQualifiedStepNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedStepName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedStepName__Group_1__0"
    // InternalUseCaseDslParser.g:3189:1: rule__QualifiedStepName__Group_1__0 : rule__QualifiedStepName__Group_1__0__Impl rule__QualifiedStepName__Group_1__1 ;
    public final void rule__QualifiedStepName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3193:1: ( rule__QualifiedStepName__Group_1__0__Impl rule__QualifiedStepName__Group_1__1 )
            // InternalUseCaseDslParser.g:3194:2: rule__QualifiedStepName__Group_1__0__Impl rule__QualifiedStepName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedStepName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedStepName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedStepName__Group_1__0"


    // $ANTLR start "rule__QualifiedStepName__Group_1__0__Impl"
    // InternalUseCaseDslParser.g:3201:1: rule__QualifiedStepName__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__QualifiedStepName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3205:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:3206:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:3206:1: ( FullStop )
            // InternalUseCaseDslParser.g:3207:2: FullStop
            {
             before(grammarAccess.getQualifiedStepNameAccess().getFullStopKeyword_1_0()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getQualifiedStepNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedStepName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedStepName__Group_1__1"
    // InternalUseCaseDslParser.g:3216:1: rule__QualifiedStepName__Group_1__1 : rule__QualifiedStepName__Group_1__1__Impl ;
    public final void rule__QualifiedStepName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3220:1: ( rule__QualifiedStepName__Group_1__1__Impl )
            // InternalUseCaseDslParser.g:3221:2: rule__QualifiedStepName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedStepName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedStepName__Group_1__1"


    // $ANTLR start "rule__QualifiedStepName__Group_1__1__Impl"
    // InternalUseCaseDslParser.g:3227:1: rule__QualifiedStepName__Group_1__1__Impl : ( ruleStepName ) ;
    public final void rule__QualifiedStepName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3231:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3232:1: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3232:1: ( ruleStepName )
            // InternalUseCaseDslParser.g:3233:2: ruleStepName
            {
             before(grammarAccess.getQualifiedStepNameAccess().getStepNameParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getQualifiedStepNameAccess().getStepNameParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedStepName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedExtensionStepName__Group__0"
    // InternalUseCaseDslParser.g:3243:1: rule__QualifiedExtensionStepName__Group__0 : rule__QualifiedExtensionStepName__Group__0__Impl rule__QualifiedExtensionStepName__Group__1 ;
    public final void rule__QualifiedExtensionStepName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3247:1: ( rule__QualifiedExtensionStepName__Group__0__Impl rule__QualifiedExtensionStepName__Group__1 )
            // InternalUseCaseDslParser.g:3248:2: rule__QualifiedExtensionStepName__Group__0__Impl rule__QualifiedExtensionStepName__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__QualifiedExtensionStepName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedExtensionStepName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedExtensionStepName__Group__0"


    // $ANTLR start "rule__QualifiedExtensionStepName__Group__0__Impl"
    // InternalUseCaseDslParser.g:3255:1: rule__QualifiedExtensionStepName__Group__0__Impl : ( RULE_CHAR ) ;
    public final void rule__QualifiedExtensionStepName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3259:1: ( ( RULE_CHAR ) )
            // InternalUseCaseDslParser.g:3260:1: ( RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:3260:1: ( RULE_CHAR )
            // InternalUseCaseDslParser.g:3261:2: RULE_CHAR
            {
             before(grammarAccess.getQualifiedExtensionStepNameAccess().getCHARTerminalRuleCall_0()); 
            match(input,RULE_CHAR,FOLLOW_2); 
             after(grammarAccess.getQualifiedExtensionStepNameAccess().getCHARTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedExtensionStepName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedExtensionStepName__Group__1"
    // InternalUseCaseDslParser.g:3270:1: rule__QualifiedExtensionStepName__Group__1 : rule__QualifiedExtensionStepName__Group__1__Impl rule__QualifiedExtensionStepName__Group__2 ;
    public final void rule__QualifiedExtensionStepName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3274:1: ( rule__QualifiedExtensionStepName__Group__1__Impl rule__QualifiedExtensionStepName__Group__2 )
            // InternalUseCaseDslParser.g:3275:2: rule__QualifiedExtensionStepName__Group__1__Impl rule__QualifiedExtensionStepName__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedExtensionStepName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedExtensionStepName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedExtensionStepName__Group__1"


    // $ANTLR start "rule__QualifiedExtensionStepName__Group__1__Impl"
    // InternalUseCaseDslParser.g:3282:1: rule__QualifiedExtensionStepName__Group__1__Impl : ( FullStop ) ;
    public final void rule__QualifiedExtensionStepName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3286:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:3287:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:3287:1: ( FullStop )
            // InternalUseCaseDslParser.g:3288:2: FullStop
            {
             before(grammarAccess.getQualifiedExtensionStepNameAccess().getFullStopKeyword_1()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getQualifiedExtensionStepNameAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedExtensionStepName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedExtensionStepName__Group__2"
    // InternalUseCaseDslParser.g:3297:1: rule__QualifiedExtensionStepName__Group__2 : rule__QualifiedExtensionStepName__Group__2__Impl ;
    public final void rule__QualifiedExtensionStepName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3301:1: ( rule__QualifiedExtensionStepName__Group__2__Impl )
            // InternalUseCaseDslParser.g:3302:2: rule__QualifiedExtensionStepName__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedExtensionStepName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedExtensionStepName__Group__2"


    // $ANTLR start "rule__QualifiedExtensionStepName__Group__2__Impl"
    // InternalUseCaseDslParser.g:3308:1: rule__QualifiedExtensionStepName__Group__2__Impl : ( ruleQualifiedStepName ) ;
    public final void rule__QualifiedExtensionStepName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3312:1: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3313:1: ( ruleQualifiedStepName )
            {
            // InternalUseCaseDslParser.g:3313:1: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3314:2: ruleQualifiedStepName
            {
             before(grammarAccess.getQualifiedExtensionStepNameAccess().getQualifiedStepNameParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedStepName();

            state._fsp--;

             after(grammarAccess.getQualifiedExtensionStepNameAccess().getQualifiedStepNameParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedExtensionStepName__Group__2__Impl"


    // $ANTLR start "rule__UseCaseDocument__UsecaseAssignment"
    // InternalUseCaseDslParser.g:3324:1: rule__UseCaseDocument__UsecaseAssignment : ( ruleUseCase ) ;
    public final void rule__UseCaseDocument__UsecaseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3328:1: ( ( ruleUseCase ) )
            // InternalUseCaseDslParser.g:3329:2: ( ruleUseCase )
            {
            // InternalUseCaseDslParser.g:3329:2: ( ruleUseCase )
            // InternalUseCaseDslParser.g:3330:3: ruleUseCase
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
    // InternalUseCaseDslParser.g:3339:1: rule__UseCase__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__UseCase__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3343:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:3344:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:3344:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:3345:3: RULE_INT
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
    // InternalUseCaseDslParser.g:3354:1: rule__UseCase__NameAssignment_3 : ( ruleLongName ) ;
    public final void rule__UseCase__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3358:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3359:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3359:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3360:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3369:1: rule__UseCase__PreconditionAssignment_4 : ( rulePrecondition ) ;
    public final void rule__UseCase__PreconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3373:1: ( ( rulePrecondition ) )
            // InternalUseCaseDslParser.g:3374:2: ( rulePrecondition )
            {
            // InternalUseCaseDslParser.g:3374:2: ( rulePrecondition )
            // InternalUseCaseDslParser.g:3375:3: rulePrecondition
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
    // InternalUseCaseDslParser.g:3384:1: rule__UseCase__PostconditionAssignment_5 : ( rulePostcondition ) ;
    public final void rule__UseCase__PostconditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3388:1: ( ( rulePostcondition ) )
            // InternalUseCaseDslParser.g:3389:2: ( rulePostcondition )
            {
            // InternalUseCaseDslParser.g:3389:2: ( rulePostcondition )
            // InternalUseCaseDslParser.g:3390:3: rulePostcondition
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
    // InternalUseCaseDslParser.g:3399:1: rule__UseCase__StepsAssignment_10 : ( ruleUseCaseStep ) ;
    public final void rule__UseCase__StepsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3403:1: ( ( ruleUseCaseStep ) )
            // InternalUseCaseDslParser.g:3404:2: ( ruleUseCaseStep )
            {
            // InternalUseCaseDslParser.g:3404:2: ( ruleUseCaseStep )
            // InternalUseCaseDslParser.g:3405:3: ruleUseCaseStep
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
    // InternalUseCaseDslParser.g:3414:1: rule__UseCase__AlternativeflowsAssignment_12_3 : ( ruleExtension ) ;
    public final void rule__UseCase__AlternativeflowsAssignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3418:1: ( ( ruleExtension ) )
            // InternalUseCaseDslParser.g:3419:2: ( ruleExtension )
            {
            // InternalUseCaseDslParser.g:3419:2: ( ruleExtension )
            // InternalUseCaseDslParser.g:3420:3: ruleExtension
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
    // InternalUseCaseDslParser.g:3429:1: rule__Extension__StartFromAssignment_0_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__Extension__StartFromAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3433:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3434:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3434:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3435:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getExtensionAccess().getStartFromUseCaseStepCrossReference_0_0_0()); 
            // InternalUseCaseDslParser.g:3436:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3437:4: ruleQualifiedStepName
            {
             before(grammarAccess.getExtensionAccess().getStartFromUseCaseStepQualifiedStepNameParserRuleCall_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedStepName();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getStartFromUseCaseStepQualifiedStepNameParserRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getExtensionAccess().getStartFromUseCaseStepCrossReference_0_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Extension__StartFromAssignment_0_1"
    // InternalUseCaseDslParser.g:3448:1: rule__Extension__StartFromAssignment_0_1 : ( ( ruleQualifiedExtensionStepName ) ) ;
    public final void rule__Extension__StartFromAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3452:1: ( ( ( ruleQualifiedExtensionStepName ) ) )
            // InternalUseCaseDslParser.g:3453:2: ( ( ruleQualifiedExtensionStepName ) )
            {
            // InternalUseCaseDslParser.g:3453:2: ( ( ruleQualifiedExtensionStepName ) )
            // InternalUseCaseDslParser.g:3454:3: ( ruleQualifiedExtensionStepName )
            {
             before(grammarAccess.getExtensionAccess().getStartFromExtensionStepCrossReference_0_1_0()); 
            // InternalUseCaseDslParser.g:3455:3: ( ruleQualifiedExtensionStepName )
            // InternalUseCaseDslParser.g:3456:4: ruleQualifiedExtensionStepName
            {
             before(grammarAccess.getExtensionAccess().getStartFromExtensionStepQualifiedExtensionStepNameParserRuleCall_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedExtensionStepName();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getStartFromExtensionStepQualifiedExtensionStepNameParserRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getExtensionAccess().getStartFromExtensionStepCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__StartFromAssignment_0_1"


    // $ANTLR start "rule__Extension__NameAssignment_2"
    // InternalUseCaseDslParser.g:3467:1: rule__Extension__NameAssignment_2 : ( RULE_CHAR ) ;
    public final void rule__Extension__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3471:1: ( ( RULE_CHAR ) )
            // InternalUseCaseDslParser.g:3472:2: ( RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:3472:2: ( RULE_CHAR )
            // InternalUseCaseDslParser.g:3473:3: RULE_CHAR
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
    // InternalUseCaseDslParser.g:3482:1: rule__Extension__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__Extension__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3486:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3487:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3487:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3488:3: ruleCondition
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
    // InternalUseCaseDslParser.g:3497:1: rule__Extension__StepsAssignment_7 : ( ruleExtensionStep ) ;
    public final void rule__Extension__StepsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3501:1: ( ( ruleExtensionStep ) )
            // InternalUseCaseDslParser.g:3502:2: ( ruleExtensionStep )
            {
            // InternalUseCaseDslParser.g:3502:2: ( ruleExtensionStep )
            // InternalUseCaseDslParser.g:3503:3: ruleExtensionStep
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


    // $ANTLR start "rule__Extension__ResumeAtAssignment_8_0_4_0"
    // InternalUseCaseDslParser.g:3512:1: rule__Extension__ResumeAtAssignment_8_0_4_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__Extension__ResumeAtAssignment_8_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3516:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3517:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3517:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3518:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getExtensionAccess().getResumeAtUseCaseStepCrossReference_8_0_4_0_0()); 
            // InternalUseCaseDslParser.g:3519:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3520:4: ruleQualifiedStepName
            {
             before(grammarAccess.getExtensionAccess().getResumeAtUseCaseStepQualifiedStepNameParserRuleCall_8_0_4_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedStepName();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getResumeAtUseCaseStepQualifiedStepNameParserRuleCall_8_0_4_0_0_1()); 

            }

             after(grammarAccess.getExtensionAccess().getResumeAtUseCaseStepCrossReference_8_0_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__ResumeAtAssignment_8_0_4_0"


    // $ANTLR start "rule__Extension__ResumeAtAssignment_8_0_4_1"
    // InternalUseCaseDslParser.g:3531:1: rule__Extension__ResumeAtAssignment_8_0_4_1 : ( ( ruleQualifiedExtensionStepName ) ) ;
    public final void rule__Extension__ResumeAtAssignment_8_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3535:1: ( ( ( ruleQualifiedExtensionStepName ) ) )
            // InternalUseCaseDslParser.g:3536:2: ( ( ruleQualifiedExtensionStepName ) )
            {
            // InternalUseCaseDslParser.g:3536:2: ( ( ruleQualifiedExtensionStepName ) )
            // InternalUseCaseDslParser.g:3537:3: ( ruleQualifiedExtensionStepName )
            {
             before(grammarAccess.getExtensionAccess().getResumeAtExtensionStepCrossReference_8_0_4_1_0()); 
            // InternalUseCaseDslParser.g:3538:3: ( ruleQualifiedExtensionStepName )
            // InternalUseCaseDslParser.g:3539:4: ruleQualifiedExtensionStepName
            {
             before(grammarAccess.getExtensionAccess().getResumeAtExtensionStepQualifiedExtensionStepNameParserRuleCall_8_0_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedExtensionStepName();

            state._fsp--;

             after(grammarAccess.getExtensionAccess().getResumeAtExtensionStepQualifiedExtensionStepNameParserRuleCall_8_0_4_1_0_1()); 

            }

             after(grammarAccess.getExtensionAccess().getResumeAtExtensionStepCrossReference_8_0_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extension__ResumeAtAssignment_8_0_4_1"


    // $ANTLR start "rule__Extension__EndAssignment_8_1"
    // InternalUseCaseDslParser.g:3550:1: rule__Extension__EndAssignment_8_1 : ( ruleDeadEndStep ) ;
    public final void rule__Extension__EndAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3554:1: ( ( ruleDeadEndStep ) )
            // InternalUseCaseDslParser.g:3555:2: ( ruleDeadEndStep )
            {
            // InternalUseCaseDslParser.g:3555:2: ( ruleDeadEndStep )
            // InternalUseCaseDslParser.g:3556:3: ruleDeadEndStep
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


    // $ANTLR start "rule__UseCaseStep__ParentAssignment_0_0_0"
    // InternalUseCaseDslParser.g:3565:1: rule__UseCaseStep__ParentAssignment_0_0_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__UseCaseStep__ParentAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3569:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3570:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3570:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3571:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_0_0_0_0()); 
            // InternalUseCaseDslParser.g:3572:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3573:4: ruleQualifiedStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepQualifiedStepNameParserRuleCall_0_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepQualifiedStepNameParserRuleCall_0_0_0_0_1()); 

            }

             after(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__ParentAssignment_0_0_0"


    // $ANTLR start "rule__UseCaseStep__NameAssignment_0_1"
    // InternalUseCaseDslParser.g:3584:1: rule__UseCaseStep__NameAssignment_0_1 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3588:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3589:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3589:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3590:3: ruleStepName
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


    // $ANTLR start "rule__UseCaseStep__ReferenceAssignment_0_4"
    // InternalUseCaseDslParser.g:3599:1: rule__UseCaseStep__ReferenceAssignment_0_4 : ( ( ruleLongName ) ) ;
    public final void rule__UseCaseStep__ReferenceAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3603:1: ( ( ( ruleLongName ) ) )
            // InternalUseCaseDslParser.g:3604:2: ( ( ruleLongName ) )
            {
            // InternalUseCaseDslParser.g:3604:2: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3605:3: ( ruleLongName )
            {
             before(grammarAccess.getUseCaseStepAccess().getReferenceUseCaseCrossReference_0_4_0()); 
            // InternalUseCaseDslParser.g:3606:3: ( ruleLongName )
            // InternalUseCaseDslParser.g:3607:4: ruleLongName
            {
             before(grammarAccess.getUseCaseStepAccess().getReferenceUseCaseLongNameParserRuleCall_0_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleLongName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getReferenceUseCaseLongNameParserRuleCall_0_4_0_1()); 

            }

             after(grammarAccess.getUseCaseStepAccess().getReferenceUseCaseCrossReference_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__ReferenceAssignment_0_4"


    // $ANTLR start "rule__UseCaseStep__ParentAssignment_1_1_0"
    // InternalUseCaseDslParser.g:3618:1: rule__UseCaseStep__ParentAssignment_1_1_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__UseCaseStep__ParentAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3622:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3623:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3623:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3624:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_1_1_0_0()); 
            // InternalUseCaseDslParser.g:3625:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3626:4: ruleQualifiedStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepQualifiedStepNameParserRuleCall_1_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepQualifiedStepNameParserRuleCall_1_1_0_0_1()); 

            }

             after(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__ParentAssignment_1_1_0"


    // $ANTLR start "rule__UseCaseStep__NameAssignment_1_2"
    // InternalUseCaseDslParser.g:3637:1: rule__UseCaseStep__NameAssignment_1_2 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3641:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3642:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3642:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3643:3: ruleStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__NameAssignment_1_2"


    // $ANTLR start "rule__UseCaseStep__SentenceAssignment_1_5"
    // InternalUseCaseDslParser.g:3652:1: rule__UseCaseStep__SentenceAssignment_1_5 : ( ruleLongName ) ;
    public final void rule__UseCaseStep__SentenceAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3656:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3657:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3657:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3658:3: ruleLongName
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLongName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__SentenceAssignment_1_5"


    // $ANTLR start "rule__UseCaseStep__ParentAssignment_2_1_0"
    // InternalUseCaseDslParser.g:3667:1: rule__UseCaseStep__ParentAssignment_2_1_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__UseCaseStep__ParentAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3671:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3672:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3672:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3673:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_2_1_0_0()); 
            // InternalUseCaseDslParser.g:3674:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3675:4: ruleQualifiedStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepQualifiedStepNameParserRuleCall_2_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepQualifiedStepNameParserRuleCall_2_1_0_0_1()); 

            }

             after(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__ParentAssignment_2_1_0"


    // $ANTLR start "rule__UseCaseStep__NameAssignment_2_2"
    // InternalUseCaseDslParser.g:3686:1: rule__UseCaseStep__NameAssignment_2_2 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3690:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3691:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3691:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3692:3: ruleStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__NameAssignment_2_2"


    // $ANTLR start "rule__UseCaseStep__SentenceAssignment_2_5"
    // InternalUseCaseDslParser.g:3701:1: rule__UseCaseStep__SentenceAssignment_2_5 : ( ruleLongName ) ;
    public final void rule__UseCaseStep__SentenceAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3705:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3706:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3706:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3707:3: ruleLongName
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_2_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLongName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__SentenceAssignment_2_5"


    // $ANTLR start "rule__UseCaseStep__ParentAssignment_3_1_0"
    // InternalUseCaseDslParser.g:3716:1: rule__UseCaseStep__ParentAssignment_3_1_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__UseCaseStep__ParentAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3720:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3721:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3721:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3722:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_3_1_0_0()); 
            // InternalUseCaseDslParser.g:3723:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3724:4: ruleQualifiedStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepQualifiedStepNameParserRuleCall_3_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepQualifiedStepNameParserRuleCall_3_1_0_0_1()); 

            }

             after(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__ParentAssignment_3_1_0"


    // $ANTLR start "rule__UseCaseStep__NameAssignment_3_2"
    // InternalUseCaseDslParser.g:3735:1: rule__UseCaseStep__NameAssignment_3_2 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3739:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3740:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3740:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3741:3: ruleStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__NameAssignment_3_2"


    // $ANTLR start "rule__UseCaseStep__RepeatingConditionAssignment_3_5"
    // InternalUseCaseDslParser.g:3750:1: rule__UseCaseStep__RepeatingConditionAssignment_3_5 : ( ruleCondition ) ;
    public final void rule__UseCaseStep__RepeatingConditionAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3754:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3755:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3755:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3756:3: ruleCondition
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatingConditionConditionParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getRepeatingConditionConditionParserRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__RepeatingConditionAssignment_3_5"


    // $ANTLR start "rule__UseCaseStep__StepsAssignment_3_7"
    // InternalUseCaseDslParser.g:3765:1: rule__UseCaseStep__StepsAssignment_3_7 : ( ruleUseCaseStep ) ;
    public final void rule__UseCaseStep__StepsAssignment_3_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3769:1: ( ( ruleUseCaseStep ) )
            // InternalUseCaseDslParser.g:3770:2: ( ruleUseCaseStep )
            {
            // InternalUseCaseDslParser.g:3770:2: ( ruleUseCaseStep )
            // InternalUseCaseDslParser.g:3771:3: ruleUseCaseStep
            {
             before(grammarAccess.getUseCaseStepAccess().getStepsUseCaseStepParserRuleCall_3_7_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCaseStep();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getStepsUseCaseStepParserRuleCall_3_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__StepsAssignment_3_7"


    // $ANTLR start "rule__ExtensionStep__NameAssignment_0_0"
    // InternalUseCaseDslParser.g:3780:1: rule__ExtensionStep__NameAssignment_0_0 : ( ruleStepName ) ;
    public final void rule__ExtensionStep__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3784:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3785:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3785:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3786:3: ruleStepName
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


    // $ANTLR start "rule__ExtensionStep__ReferenceAssignment_0_3"
    // InternalUseCaseDslParser.g:3795:1: rule__ExtensionStep__ReferenceAssignment_0_3 : ( ( ruleLongName ) ) ;
    public final void rule__ExtensionStep__ReferenceAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3799:1: ( ( ( ruleLongName ) ) )
            // InternalUseCaseDslParser.g:3800:2: ( ( ruleLongName ) )
            {
            // InternalUseCaseDslParser.g:3800:2: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3801:3: ( ruleLongName )
            {
             before(grammarAccess.getExtensionStepAccess().getReferenceUseCaseCrossReference_0_3_0()); 
            // InternalUseCaseDslParser.g:3802:3: ( ruleLongName )
            // InternalUseCaseDslParser.g:3803:4: ruleLongName
            {
             before(grammarAccess.getExtensionStepAccess().getReferenceUseCaseLongNameParserRuleCall_0_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleLongName();

            state._fsp--;

             after(grammarAccess.getExtensionStepAccess().getReferenceUseCaseLongNameParserRuleCall_0_3_0_1()); 

            }

             after(grammarAccess.getExtensionStepAccess().getReferenceUseCaseCrossReference_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__ReferenceAssignment_0_3"


    // $ANTLR start "rule__ExtensionStep__NameAssignment_1_0"
    // InternalUseCaseDslParser.g:3814:1: rule__ExtensionStep__NameAssignment_1_0 : ( ruleStepName ) ;
    public final void rule__ExtensionStep__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3818:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3819:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3819:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3820:3: ruleStepName
            {
             before(grammarAccess.getExtensionStepAccess().getNameStepNameParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepName();

            state._fsp--;

             after(grammarAccess.getExtensionStepAccess().getNameStepNameParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__NameAssignment_1_0"


    // $ANTLR start "rule__ExtensionStep__SentenceAssignment_1_3"
    // InternalUseCaseDslParser.g:3829:1: rule__ExtensionStep__SentenceAssignment_1_3 : ( ruleLongName ) ;
    public final void rule__ExtensionStep__SentenceAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3833:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3834:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3834:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3835:3: ruleLongName
            {
             before(grammarAccess.getExtensionStepAccess().getSentenceLongNameParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLongName();

            state._fsp--;

             after(grammarAccess.getExtensionStepAccess().getSentenceLongNameParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionStep__SentenceAssignment_1_3"


    // $ANTLR start "rule__DeadEndStep__NameAssignment_0"
    // InternalUseCaseDslParser.g:3844:1: rule__DeadEndStep__NameAssignment_0 : ( ruleStepName ) ;
    public final void rule__DeadEndStep__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3848:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3849:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3849:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3850:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3859:1: rule__DeadEndStep__SentenceAssignment_3 : ( ruleLongName ) ;
    public final void rule__DeadEndStep__SentenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3863:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3864:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3864:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3865:3: ruleLongName
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


    // $ANTLR start "rule__Precondition__ConditionAssignment_2"
    // InternalUseCaseDslParser.g:3874:1: rule__Precondition__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Precondition__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3878:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3879:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3879:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3880:3: ruleCondition
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


    // $ANTLR start "rule__Postcondition__ConditionAssignment_2"
    // InternalUseCaseDslParser.g:3889:1: rule__Postcondition__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Postcondition__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3893:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3894:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3894:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3895:3: ruleCondition
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


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\34\1\26\1\7\1\26\4\uffff";
    static final String dfa_3s = "\1\34\1\26\1\34\1\26\4\uffff";
    static final String dfa_4s = "\4\uffff\1\4\1\2\1\3\1\1";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\7\1\uffff\1\6\1\4\2\uffff\1\5\16\uffff\1\3",
            "\1\2",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "483:1: rule__UseCaseStep__Alternatives : ( ( ( rule__UseCaseStep__Group_0__0 ) ) | ( ( rule__UseCaseStep__Group_1__0 ) ) | ( ( rule__UseCaseStep__Group_2__0 ) ) | ( ( rule__UseCaseStep__Group_3__0 ) ) );";
        }
    }
    static final String dfa_7s = "\27\uffff";
    static final String dfa_8s = "\6\uffff\7\26\2\uffff\7\26\1\uffff";
    static final String dfa_9s = "\1\34\1\26\1\7\12\23\2\uffff\7\23\1\uffff";
    static final String dfa_10s = "\1\34\1\26\13\41\2\uffff\7\41\1\uffff";
    static final String dfa_11s = "\15\uffff\1\1\1\3\7\uffff\1\2";
    static final String dfa_12s = "\27\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2",
            "\1\15\1\uffff\1\4\1\5\2\uffff\1\3\5\uffff\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
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
            "",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            "\1\16\1\24\1\25\1\23\1\22\1\21\2\uffff\1\17\1\26\4\uffff\1\20",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "516:1: rule__ExtensionStep__Alternatives : ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ( rule__ExtensionStep__Group_1__0 ) ) | ( ruleDeadEndStep ) );";
        }
    }
    static final String dfa_14s = "\30\uffff";
    static final String dfa_15s = "\1\34\1\26\1\7\1\uffff\12\23\1\17\1\uffff\7\23\1\32";
    static final String dfa_16s = "\1\34\1\26\1\41\1\uffff\12\41\1\17\1\uffff\7\41\1\34";
    static final String dfa_17s = "\3\uffff\1\2\13\uffff\1\1\10\uffff";
    static final String dfa_18s = "\30\uffff}>";
    static final String[] dfa_19s = {
            "\1\1",
            "\1\2",
            "\1\17\1\3\1\5\1\6\2\uffff\1\4\5\uffff\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "\1\16\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\17\4\uffff\1\21",
            "\1\16\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\17\4\uffff\1\21",
            "\1\16\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\17\4\uffff\1\21",
            "\1\16\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\17\4\uffff\1\21",
            "\1\16\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\17\4\uffff\1\21",
            "\1\16\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\17\4\uffff\1\21",
            "\1\16\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\17\4\uffff\1\21",
            "\1\27",
            "",
            "\1\16\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\17\4\uffff\1\21",
            "\1\16\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\17\4\uffff\1\21",
            "\1\16\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\17\4\uffff\1\21",
            "\1\16\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\17\4\uffff\1\21",
            "\1\16\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\17\4\uffff\1\21",
            "\1\16\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\17\4\uffff\1\21",
            "\1\16\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\17\4\uffff\1\21",
            "\1\3\1\uffff\1\17"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "()* loopback of 1473:2: ( rule__Extension__StepsAssignment_7 )*";
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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000011000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000209F24000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000209F02600L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000209F82600L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000400002L});

}