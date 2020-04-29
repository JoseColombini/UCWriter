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
    // InternalUseCaseDslParser.g:516:1: rule__ExtensionStep__Alternatives : ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ruleDeadEndStep ) );
    public final void rule__ExtensionStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:520:1: ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ruleDeadEndStep ) )
            int alt8=2;
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
                    // InternalUseCaseDslParser.g:527:2: ( ruleDeadEndStep )
                    {
                    // InternalUseCaseDslParser.g:527:2: ( ruleDeadEndStep )
                    // InternalUseCaseDslParser.g:528:3: ruleDeadEndStep
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
    // InternalUseCaseDslParser.g:537:1: rule__ExtensionStep__Alternatives_0_2 : ( ( USER ) | ( SYSTEM ) | ( WHILE ) );
    public final void rule__ExtensionStep__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:541:1: ( ( USER ) | ( SYSTEM ) | ( WHILE ) )
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
                    // InternalUseCaseDslParser.g:542:2: ( USER )
                    {
                    // InternalUseCaseDslParser.g:542:2: ( USER )
                    // InternalUseCaseDslParser.g:543:3: USER
                    {
                     before(grammarAccess.getExtensionStepAccess().getUSERKeyword_0_2_0()); 
                    match(input,USER,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getUSERKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:548:2: ( SYSTEM )
                    {
                    // InternalUseCaseDslParser.g:548:2: ( SYSTEM )
                    // InternalUseCaseDslParser.g:549:3: SYSTEM
                    {
                     before(grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_0_2_1()); 
                    match(input,SYSTEM,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_0_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:554:2: ( WHILE )
                    {
                    // InternalUseCaseDslParser.g:554:2: ( WHILE )
                    // InternalUseCaseDslParser.g:555:3: WHILE
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
    // InternalUseCaseDslParser.g:564:1: rule__DeadEndStep__Alternatives_2 : ( ( USER ) | ( SYSTEM ) | ( WHILE ) );
    public final void rule__DeadEndStep__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:568:1: ( ( USER ) | ( SYSTEM ) | ( WHILE ) )
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
                    // InternalUseCaseDslParser.g:569:2: ( USER )
                    {
                    // InternalUseCaseDslParser.g:569:2: ( USER )
                    // InternalUseCaseDslParser.g:570:3: USER
                    {
                     before(grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0()); 
                    match(input,USER,FOLLOW_2); 
                     after(grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:575:2: ( SYSTEM )
                    {
                    // InternalUseCaseDslParser.g:575:2: ( SYSTEM )
                    // InternalUseCaseDslParser.g:576:3: SYSTEM
                    {
                     before(grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1()); 
                    match(input,SYSTEM,FOLLOW_2); 
                     after(grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:581:2: ( WHILE )
                    {
                    // InternalUseCaseDslParser.g:581:2: ( WHILE )
                    // InternalUseCaseDslParser.g:582:3: WHILE
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
    // InternalUseCaseDslParser.g:591:1: rule__LongName__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) );
    public final void rule__LongName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:595:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) )
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
                    // InternalUseCaseDslParser.g:596:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:596:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:597:3: RULE_ID
                    {
                     before(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:602:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:602:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:603:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:608:2: ( RULE_CHAR )
                    {
                    // InternalUseCaseDslParser.g:608:2: ( RULE_CHAR )
                    // InternalUseCaseDslParser.g:609:3: RULE_CHAR
                    {
                     before(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2()); 
                    match(input,RULE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:614:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:614:2: ( Colon )
                    // InternalUseCaseDslParser.g:615:3: Colon
                    {
                     before(grammarAccess.getLongNameAccess().getColonKeyword_3()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:620:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:620:2: ( FullStop )
                    // InternalUseCaseDslParser.g:621:3: FullStop
                    {
                     before(grammarAccess.getLongNameAccess().getFullStopKeyword_4()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUseCaseDslParser.g:626:2: ( QuotationMark )
                    {
                    // InternalUseCaseDslParser.g:626:2: ( QuotationMark )
                    // InternalUseCaseDslParser.g:627:3: QuotationMark
                    {
                     before(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5()); 
                    match(input,QuotationMark,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUseCaseDslParser.g:632:2: ( Apostrophe )
                    {
                    // InternalUseCaseDslParser.g:632:2: ( Apostrophe )
                    // InternalUseCaseDslParser.g:633:3: Apostrophe
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
    // InternalUseCaseDslParser.g:642:1: rule__Condition__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) | ( AND ) | ( OR ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:646:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) | ( AND ) | ( OR ) )
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
                    // InternalUseCaseDslParser.g:647:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:647:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:648:3: RULE_ID
                    {
                     before(grammarAccess.getConditionAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:653:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:653:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:654:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:659:2: ( RULE_CHAR )
                    {
                    // InternalUseCaseDslParser.g:659:2: ( RULE_CHAR )
                    // InternalUseCaseDslParser.g:660:3: RULE_CHAR
                    {
                     before(grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2()); 
                    match(input,RULE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:665:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:665:2: ( Colon )
                    // InternalUseCaseDslParser.g:666:3: Colon
                    {
                     before(grammarAccess.getConditionAccess().getColonKeyword_3()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:671:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:671:2: ( FullStop )
                    // InternalUseCaseDslParser.g:672:3: FullStop
                    {
                     before(grammarAccess.getConditionAccess().getFullStopKeyword_4()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUseCaseDslParser.g:677:2: ( QuotationMark )
                    {
                    // InternalUseCaseDslParser.g:677:2: ( QuotationMark )
                    // InternalUseCaseDslParser.g:678:3: QuotationMark
                    {
                     before(grammarAccess.getConditionAccess().getQuotationMarkKeyword_5()); 
                    match(input,QuotationMark,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getQuotationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUseCaseDslParser.g:683:2: ( Apostrophe )
                    {
                    // InternalUseCaseDslParser.g:683:2: ( Apostrophe )
                    // InternalUseCaseDslParser.g:684:3: Apostrophe
                    {
                     before(grammarAccess.getConditionAccess().getApostropheKeyword_6()); 
                    match(input,Apostrophe,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getApostropheKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUseCaseDslParser.g:689:2: ( AND )
                    {
                    // InternalUseCaseDslParser.g:689:2: ( AND )
                    // InternalUseCaseDslParser.g:690:3: AND
                    {
                     before(grammarAccess.getConditionAccess().getANDKeyword_7()); 
                    match(input,AND,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getANDKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUseCaseDslParser.g:695:2: ( OR )
                    {
                    // InternalUseCaseDslParser.g:695:2: ( OR )
                    // InternalUseCaseDslParser.g:696:3: OR
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
    // InternalUseCaseDslParser.g:705:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:709:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCaseDslParser.g:710:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
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
    // InternalUseCaseDslParser.g:717:1: rule__UseCase__Group__0__Impl : ( UC ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:721:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:722:1: ( UC )
            {
            // InternalUseCaseDslParser.g:722:1: ( UC )
            // InternalUseCaseDslParser.g:723:2: UC
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
    // InternalUseCaseDslParser.g:732:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:736:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCaseDslParser.g:737:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
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
    // InternalUseCaseDslParser.g:744:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NumberAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:748:1: ( ( ( rule__UseCase__NumberAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:749:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:749:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            // InternalUseCaseDslParser.g:750:2: ( rule__UseCase__NumberAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNumberAssignment_1()); 
            // InternalUseCaseDslParser.g:751:2: ( rule__UseCase__NumberAssignment_1 )
            // InternalUseCaseDslParser.g:751:3: rule__UseCase__NumberAssignment_1
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
    // InternalUseCaseDslParser.g:759:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:763:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCaseDslParser.g:764:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
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
    // InternalUseCaseDslParser.g:771:1: rule__UseCase__Group__2__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:775:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:776:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:776:1: ( Colon )
            // InternalUseCaseDslParser.g:777:2: Colon
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
    // InternalUseCaseDslParser.g:786:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:790:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCaseDslParser.g:791:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
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
    // InternalUseCaseDslParser.g:798:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__NameAssignment_3 ) ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:802:1: ( ( ( rule__UseCase__NameAssignment_3 ) ) )
            // InternalUseCaseDslParser.g:803:1: ( ( rule__UseCase__NameAssignment_3 ) )
            {
            // InternalUseCaseDslParser.g:803:1: ( ( rule__UseCase__NameAssignment_3 ) )
            // InternalUseCaseDslParser.g:804:2: ( rule__UseCase__NameAssignment_3 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_3()); 
            // InternalUseCaseDslParser.g:805:2: ( rule__UseCase__NameAssignment_3 )
            // InternalUseCaseDslParser.g:805:3: rule__UseCase__NameAssignment_3
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
    // InternalUseCaseDslParser.g:813:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:817:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCaseDslParser.g:818:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
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
    // InternalUseCaseDslParser.g:825:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__PreconditionAssignment_4 )? ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:829:1: ( ( ( rule__UseCase__PreconditionAssignment_4 )? ) )
            // InternalUseCaseDslParser.g:830:1: ( ( rule__UseCase__PreconditionAssignment_4 )? )
            {
            // InternalUseCaseDslParser.g:830:1: ( ( rule__UseCase__PreconditionAssignment_4 )? )
            // InternalUseCaseDslParser.g:831:2: ( rule__UseCase__PreconditionAssignment_4 )?
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionAssignment_4()); 
            // InternalUseCaseDslParser.g:832:2: ( rule__UseCase__PreconditionAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==PRECONDITION) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUseCaseDslParser.g:832:3: rule__UseCase__PreconditionAssignment_4
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
    // InternalUseCaseDslParser.g:840:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:844:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCaseDslParser.g:845:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
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
    // InternalUseCaseDslParser.g:852:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__PostconditionAssignment_5 )? ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:856:1: ( ( ( rule__UseCase__PostconditionAssignment_5 )? ) )
            // InternalUseCaseDslParser.g:857:1: ( ( rule__UseCase__PostconditionAssignment_5 )? )
            {
            // InternalUseCaseDslParser.g:857:1: ( ( rule__UseCase__PostconditionAssignment_5 )? )
            // InternalUseCaseDslParser.g:858:2: ( rule__UseCase__PostconditionAssignment_5 )?
            {
             before(grammarAccess.getUseCaseAccess().getPostconditionAssignment_5()); 
            // InternalUseCaseDslParser.g:859:2: ( rule__UseCase__PostconditionAssignment_5 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==POSTCONDITION) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCaseDslParser.g:859:3: rule__UseCase__PostconditionAssignment_5
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
    // InternalUseCaseDslParser.g:867:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:871:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCaseDslParser.g:872:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
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
    // InternalUseCaseDslParser.g:879:1: rule__UseCase__Group__6__Impl : ( MAIN ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:883:1: ( ( MAIN ) )
            // InternalUseCaseDslParser.g:884:1: ( MAIN )
            {
            // InternalUseCaseDslParser.g:884:1: ( MAIN )
            // InternalUseCaseDslParser.g:885:2: MAIN
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
    // InternalUseCaseDslParser.g:894:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:898:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCaseDslParser.g:899:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
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
    // InternalUseCaseDslParser.g:906:1: rule__UseCase__Group__7__Impl : ( FLOW ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:910:1: ( ( FLOW ) )
            // InternalUseCaseDslParser.g:911:1: ( FLOW )
            {
            // InternalUseCaseDslParser.g:911:1: ( FLOW )
            // InternalUseCaseDslParser.g:912:2: FLOW
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
    // InternalUseCaseDslParser.g:921:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:925:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // InternalUseCaseDslParser.g:926:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
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
    // InternalUseCaseDslParser.g:933:1: rule__UseCase__Group__8__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:937:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:938:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:938:1: ( Colon )
            // InternalUseCaseDslParser.g:939:2: Colon
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
    // InternalUseCaseDslParser.g:948:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl rule__UseCase__Group__10 ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:952:1: ( rule__UseCase__Group__9__Impl rule__UseCase__Group__10 )
            // InternalUseCaseDslParser.g:953:2: rule__UseCase__Group__9__Impl rule__UseCase__Group__10
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
    // InternalUseCaseDslParser.g:960:1: rule__UseCase__Group__9__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:964:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:965:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:965:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:966:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:975:1: rule__UseCase__Group__10 : rule__UseCase__Group__10__Impl rule__UseCase__Group__11 ;
    public final void rule__UseCase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:979:1: ( rule__UseCase__Group__10__Impl rule__UseCase__Group__11 )
            // InternalUseCaseDslParser.g:980:2: rule__UseCase__Group__10__Impl rule__UseCase__Group__11
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
    // InternalUseCaseDslParser.g:987:1: rule__UseCase__Group__10__Impl : ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) ) ;
    public final void rule__UseCase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:991:1: ( ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) ) )
            // InternalUseCaseDslParser.g:992:1: ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) )
            {
            // InternalUseCaseDslParser.g:992:1: ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) )
            // InternalUseCaseDslParser.g:993:2: ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* )
            {
            // InternalUseCaseDslParser.g:993:2: ( ( rule__UseCase__StepsAssignment_10 ) )
            // InternalUseCaseDslParser.g:994:3: ( rule__UseCase__StepsAssignment_10 )
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 
            // InternalUseCaseDslParser.g:995:3: ( rule__UseCase__StepsAssignment_10 )
            // InternalUseCaseDslParser.g:995:4: rule__UseCase__StepsAssignment_10
            {
            pushFollow(FOLLOW_13);
            rule__UseCase__StepsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 

            }

            // InternalUseCaseDslParser.g:998:2: ( ( rule__UseCase__StepsAssignment_10 )* )
            // InternalUseCaseDslParser.g:999:3: ( rule__UseCase__StepsAssignment_10 )*
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 
            // InternalUseCaseDslParser.g:1000:3: ( rule__UseCase__StepsAssignment_10 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_INT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1000:4: rule__UseCase__StepsAssignment_10
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
    // InternalUseCaseDslParser.g:1009:1: rule__UseCase__Group__11 : rule__UseCase__Group__11__Impl rule__UseCase__Group__12 ;
    public final void rule__UseCase__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1013:1: ( rule__UseCase__Group__11__Impl rule__UseCase__Group__12 )
            // InternalUseCaseDslParser.g:1014:2: rule__UseCase__Group__11__Impl rule__UseCase__Group__12
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
    // InternalUseCaseDslParser.g:1021:1: rule__UseCase__Group__11__Impl : ( RULE_END ) ;
    public final void rule__UseCase__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1025:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1026:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1026:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1027:2: RULE_END
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
    // InternalUseCaseDslParser.g:1036:1: rule__UseCase__Group__12 : rule__UseCase__Group__12__Impl ;
    public final void rule__UseCase__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1040:1: ( rule__UseCase__Group__12__Impl )
            // InternalUseCaseDslParser.g:1041:2: rule__UseCase__Group__12__Impl
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
    // InternalUseCaseDslParser.g:1047:1: rule__UseCase__Group__12__Impl : ( ( rule__UseCase__Group_12__0 )? ) ;
    public final void rule__UseCase__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1051:1: ( ( ( rule__UseCase__Group_12__0 )? ) )
            // InternalUseCaseDslParser.g:1052:1: ( ( rule__UseCase__Group_12__0 )? )
            {
            // InternalUseCaseDslParser.g:1052:1: ( ( rule__UseCase__Group_12__0 )? )
            // InternalUseCaseDslParser.g:1053:2: ( rule__UseCase__Group_12__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_12()); 
            // InternalUseCaseDslParser.g:1054:2: ( rule__UseCase__Group_12__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ALTERNATIVE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUseCaseDslParser.g:1054:3: rule__UseCase__Group_12__0
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
    // InternalUseCaseDslParser.g:1063:1: rule__UseCase__Group_12__0 : rule__UseCase__Group_12__0__Impl rule__UseCase__Group_12__1 ;
    public final void rule__UseCase__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1067:1: ( rule__UseCase__Group_12__0__Impl rule__UseCase__Group_12__1 )
            // InternalUseCaseDslParser.g:1068:2: rule__UseCase__Group_12__0__Impl rule__UseCase__Group_12__1
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
    // InternalUseCaseDslParser.g:1075:1: rule__UseCase__Group_12__0__Impl : ( ( rule__UseCase__Group_12_0__0 ) ) ;
    public final void rule__UseCase__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1079:1: ( ( ( rule__UseCase__Group_12_0__0 ) ) )
            // InternalUseCaseDslParser.g:1080:1: ( ( rule__UseCase__Group_12_0__0 ) )
            {
            // InternalUseCaseDslParser.g:1080:1: ( ( rule__UseCase__Group_12_0__0 ) )
            // InternalUseCaseDslParser.g:1081:2: ( rule__UseCase__Group_12_0__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup_12_0()); 
            // InternalUseCaseDslParser.g:1082:2: ( rule__UseCase__Group_12_0__0 )
            // InternalUseCaseDslParser.g:1082:3: rule__UseCase__Group_12_0__0
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
    // InternalUseCaseDslParser.g:1090:1: rule__UseCase__Group_12__1 : rule__UseCase__Group_12__1__Impl rule__UseCase__Group_12__2 ;
    public final void rule__UseCase__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1094:1: ( rule__UseCase__Group_12__1__Impl rule__UseCase__Group_12__2 )
            // InternalUseCaseDslParser.g:1095:2: rule__UseCase__Group_12__1__Impl rule__UseCase__Group_12__2
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
    // InternalUseCaseDslParser.g:1102:1: rule__UseCase__Group_12__1__Impl : ( Colon ) ;
    public final void rule__UseCase__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1106:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:1107:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:1107:1: ( Colon )
            // InternalUseCaseDslParser.g:1108:2: Colon
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
    // InternalUseCaseDslParser.g:1117:1: rule__UseCase__Group_12__2 : rule__UseCase__Group_12__2__Impl rule__UseCase__Group_12__3 ;
    public final void rule__UseCase__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1121:1: ( rule__UseCase__Group_12__2__Impl rule__UseCase__Group_12__3 )
            // InternalUseCaseDslParser.g:1122:2: rule__UseCase__Group_12__2__Impl rule__UseCase__Group_12__3
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
    // InternalUseCaseDslParser.g:1129:1: rule__UseCase__Group_12__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCase__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1133:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:1134:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:1134:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:1135:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:1144:1: rule__UseCase__Group_12__3 : rule__UseCase__Group_12__3__Impl rule__UseCase__Group_12__4 ;
    public final void rule__UseCase__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1148:1: ( rule__UseCase__Group_12__3__Impl rule__UseCase__Group_12__4 )
            // InternalUseCaseDslParser.g:1149:2: rule__UseCase__Group_12__3__Impl rule__UseCase__Group_12__4
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
    // InternalUseCaseDslParser.g:1156:1: rule__UseCase__Group_12__3__Impl : ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) ) ;
    public final void rule__UseCase__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1160:1: ( ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) ) )
            // InternalUseCaseDslParser.g:1161:1: ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) )
            {
            // InternalUseCaseDslParser.g:1161:1: ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) )
            // InternalUseCaseDslParser.g:1162:2: ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* )
            {
            // InternalUseCaseDslParser.g:1162:2: ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) )
            // InternalUseCaseDslParser.g:1163:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 
            // InternalUseCaseDslParser.g:1164:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )
            // InternalUseCaseDslParser.g:1164:4: rule__UseCase__AlternativeflowsAssignment_12_3
            {
            pushFollow(FOLLOW_16);
            rule__UseCase__AlternativeflowsAssignment_12_3();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 

            }

            // InternalUseCaseDslParser.g:1167:2: ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* )
            // InternalUseCaseDslParser.g:1168:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )*
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 
            // InternalUseCaseDslParser.g:1169:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_CHAR||LA17_0==RULE_INT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1169:4: rule__UseCase__AlternativeflowsAssignment_12_3
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
    // InternalUseCaseDslParser.g:1178:1: rule__UseCase__Group_12__4 : rule__UseCase__Group_12__4__Impl ;
    public final void rule__UseCase__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1182:1: ( rule__UseCase__Group_12__4__Impl )
            // InternalUseCaseDslParser.g:1183:2: rule__UseCase__Group_12__4__Impl
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
    // InternalUseCaseDslParser.g:1189:1: rule__UseCase__Group_12__4__Impl : ( RULE_END ) ;
    public final void rule__UseCase__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1193:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1194:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1194:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1195:2: RULE_END
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
    // InternalUseCaseDslParser.g:1205:1: rule__UseCase__Group_12_0__0 : rule__UseCase__Group_12_0__0__Impl rule__UseCase__Group_12_0__1 ;
    public final void rule__UseCase__Group_12_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1209:1: ( rule__UseCase__Group_12_0__0__Impl rule__UseCase__Group_12_0__1 )
            // InternalUseCaseDslParser.g:1210:2: rule__UseCase__Group_12_0__0__Impl rule__UseCase__Group_12_0__1
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
    // InternalUseCaseDslParser.g:1217:1: rule__UseCase__Group_12_0__0__Impl : ( ALTERNATIVE ) ;
    public final void rule__UseCase__Group_12_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1221:1: ( ( ALTERNATIVE ) )
            // InternalUseCaseDslParser.g:1222:1: ( ALTERNATIVE )
            {
            // InternalUseCaseDslParser.g:1222:1: ( ALTERNATIVE )
            // InternalUseCaseDslParser.g:1223:2: ALTERNATIVE
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
    // InternalUseCaseDslParser.g:1232:1: rule__UseCase__Group_12_0__1 : rule__UseCase__Group_12_0__1__Impl ;
    public final void rule__UseCase__Group_12_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1236:1: ( rule__UseCase__Group_12_0__1__Impl )
            // InternalUseCaseDslParser.g:1237:2: rule__UseCase__Group_12_0__1__Impl
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
    // InternalUseCaseDslParser.g:1243:1: rule__UseCase__Group_12_0__1__Impl : ( FLOW ) ;
    public final void rule__UseCase__Group_12_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1247:1: ( ( FLOW ) )
            // InternalUseCaseDslParser.g:1248:1: ( FLOW )
            {
            // InternalUseCaseDslParser.g:1248:1: ( FLOW )
            // InternalUseCaseDslParser.g:1249:2: FLOW
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
    // InternalUseCaseDslParser.g:1259:1: rule__Extension__Group__0 : rule__Extension__Group__0__Impl rule__Extension__Group__1 ;
    public final void rule__Extension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1263:1: ( rule__Extension__Group__0__Impl rule__Extension__Group__1 )
            // InternalUseCaseDslParser.g:1264:2: rule__Extension__Group__0__Impl rule__Extension__Group__1
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
    // InternalUseCaseDslParser.g:1271:1: rule__Extension__Group__0__Impl : ( ( rule__Extension__Alternatives_0 ) ) ;
    public final void rule__Extension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1275:1: ( ( ( rule__Extension__Alternatives_0 ) ) )
            // InternalUseCaseDslParser.g:1276:1: ( ( rule__Extension__Alternatives_0 ) )
            {
            // InternalUseCaseDslParser.g:1276:1: ( ( rule__Extension__Alternatives_0 ) )
            // InternalUseCaseDslParser.g:1277:2: ( rule__Extension__Alternatives_0 )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives_0()); 
            // InternalUseCaseDslParser.g:1278:2: ( rule__Extension__Alternatives_0 )
            // InternalUseCaseDslParser.g:1278:3: rule__Extension__Alternatives_0
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
    // InternalUseCaseDslParser.g:1286:1: rule__Extension__Group__1 : rule__Extension__Group__1__Impl rule__Extension__Group__2 ;
    public final void rule__Extension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1290:1: ( rule__Extension__Group__1__Impl rule__Extension__Group__2 )
            // InternalUseCaseDslParser.g:1291:2: rule__Extension__Group__1__Impl rule__Extension__Group__2
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
    // InternalUseCaseDslParser.g:1298:1: rule__Extension__Group__1__Impl : ( FullStop ) ;
    public final void rule__Extension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1302:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1303:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1303:1: ( FullStop )
            // InternalUseCaseDslParser.g:1304:2: FullStop
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
    // InternalUseCaseDslParser.g:1313:1: rule__Extension__Group__2 : rule__Extension__Group__2__Impl rule__Extension__Group__3 ;
    public final void rule__Extension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1317:1: ( rule__Extension__Group__2__Impl rule__Extension__Group__3 )
            // InternalUseCaseDslParser.g:1318:2: rule__Extension__Group__2__Impl rule__Extension__Group__3
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
    // InternalUseCaseDslParser.g:1325:1: rule__Extension__Group__2__Impl : ( ( rule__Extension__NameAssignment_2 ) ) ;
    public final void rule__Extension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1329:1: ( ( ( rule__Extension__NameAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:1330:1: ( ( rule__Extension__NameAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:1330:1: ( ( rule__Extension__NameAssignment_2 ) )
            // InternalUseCaseDslParser.g:1331:2: ( rule__Extension__NameAssignment_2 )
            {
             before(grammarAccess.getExtensionAccess().getNameAssignment_2()); 
            // InternalUseCaseDslParser.g:1332:2: ( rule__Extension__NameAssignment_2 )
            // InternalUseCaseDslParser.g:1332:3: rule__Extension__NameAssignment_2
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
    // InternalUseCaseDslParser.g:1340:1: rule__Extension__Group__3 : rule__Extension__Group__3__Impl rule__Extension__Group__4 ;
    public final void rule__Extension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1344:1: ( rule__Extension__Group__3__Impl rule__Extension__Group__4 )
            // InternalUseCaseDslParser.g:1345:2: rule__Extension__Group__3__Impl rule__Extension__Group__4
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
    // InternalUseCaseDslParser.g:1352:1: rule__Extension__Group__3__Impl : ( FullStop ) ;
    public final void rule__Extension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1356:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1357:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1357:1: ( FullStop )
            // InternalUseCaseDslParser.g:1358:2: FullStop
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
    // InternalUseCaseDslParser.g:1367:1: rule__Extension__Group__4 : rule__Extension__Group__4__Impl rule__Extension__Group__5 ;
    public final void rule__Extension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1371:1: ( rule__Extension__Group__4__Impl rule__Extension__Group__5 )
            // InternalUseCaseDslParser.g:1372:2: rule__Extension__Group__4__Impl rule__Extension__Group__5
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
    // InternalUseCaseDslParser.g:1379:1: rule__Extension__Group__4__Impl : ( IF ) ;
    public final void rule__Extension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1383:1: ( ( IF ) )
            // InternalUseCaseDslParser.g:1384:1: ( IF )
            {
            // InternalUseCaseDslParser.g:1384:1: ( IF )
            // InternalUseCaseDslParser.g:1385:2: IF
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
    // InternalUseCaseDslParser.g:1394:1: rule__Extension__Group__5 : rule__Extension__Group__5__Impl rule__Extension__Group__6 ;
    public final void rule__Extension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1398:1: ( rule__Extension__Group__5__Impl rule__Extension__Group__6 )
            // InternalUseCaseDslParser.g:1399:2: rule__Extension__Group__5__Impl rule__Extension__Group__6
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
    // InternalUseCaseDslParser.g:1406:1: rule__Extension__Group__5__Impl : ( ( rule__Extension__ConditionAssignment_5 ) ) ;
    public final void rule__Extension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1410:1: ( ( ( rule__Extension__ConditionAssignment_5 ) ) )
            // InternalUseCaseDslParser.g:1411:1: ( ( rule__Extension__ConditionAssignment_5 ) )
            {
            // InternalUseCaseDslParser.g:1411:1: ( ( rule__Extension__ConditionAssignment_5 ) )
            // InternalUseCaseDslParser.g:1412:2: ( rule__Extension__ConditionAssignment_5 )
            {
             before(grammarAccess.getExtensionAccess().getConditionAssignment_5()); 
            // InternalUseCaseDslParser.g:1413:2: ( rule__Extension__ConditionAssignment_5 )
            // InternalUseCaseDslParser.g:1413:3: rule__Extension__ConditionAssignment_5
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
    // InternalUseCaseDslParser.g:1421:1: rule__Extension__Group__6 : rule__Extension__Group__6__Impl rule__Extension__Group__7 ;
    public final void rule__Extension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1425:1: ( rule__Extension__Group__6__Impl rule__Extension__Group__7 )
            // InternalUseCaseDslParser.g:1426:2: rule__Extension__Group__6__Impl rule__Extension__Group__7
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
    // InternalUseCaseDslParser.g:1433:1: rule__Extension__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__Extension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1437:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:1438:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:1438:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:1439:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:1448:1: rule__Extension__Group__7 : rule__Extension__Group__7__Impl rule__Extension__Group__8 ;
    public final void rule__Extension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1452:1: ( rule__Extension__Group__7__Impl rule__Extension__Group__8 )
            // InternalUseCaseDslParser.g:1453:2: rule__Extension__Group__7__Impl rule__Extension__Group__8
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
    // InternalUseCaseDslParser.g:1460:1: rule__Extension__Group__7__Impl : ( ( rule__Extension__StepsAssignment_7 )* ) ;
    public final void rule__Extension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1464:1: ( ( ( rule__Extension__StepsAssignment_7 )* ) )
            // InternalUseCaseDslParser.g:1465:1: ( ( rule__Extension__StepsAssignment_7 )* )
            {
            // InternalUseCaseDslParser.g:1465:1: ( ( rule__Extension__StepsAssignment_7 )* )
            // InternalUseCaseDslParser.g:1466:2: ( rule__Extension__StepsAssignment_7 )*
            {
             before(grammarAccess.getExtensionAccess().getStepsAssignment_7()); 
            // InternalUseCaseDslParser.g:1467:2: ( rule__Extension__StepsAssignment_7 )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1467:3: rule__Extension__StepsAssignment_7
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
    // InternalUseCaseDslParser.g:1475:1: rule__Extension__Group__8 : rule__Extension__Group__8__Impl rule__Extension__Group__9 ;
    public final void rule__Extension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1479:1: ( rule__Extension__Group__8__Impl rule__Extension__Group__9 )
            // InternalUseCaseDslParser.g:1480:2: rule__Extension__Group__8__Impl rule__Extension__Group__9
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
    // InternalUseCaseDslParser.g:1487:1: rule__Extension__Group__8__Impl : ( ( rule__Extension__Alternatives_8 ) ) ;
    public final void rule__Extension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1491:1: ( ( ( rule__Extension__Alternatives_8 ) ) )
            // InternalUseCaseDslParser.g:1492:1: ( ( rule__Extension__Alternatives_8 ) )
            {
            // InternalUseCaseDslParser.g:1492:1: ( ( rule__Extension__Alternatives_8 ) )
            // InternalUseCaseDslParser.g:1493:2: ( rule__Extension__Alternatives_8 )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives_8()); 
            // InternalUseCaseDslParser.g:1494:2: ( rule__Extension__Alternatives_8 )
            // InternalUseCaseDslParser.g:1494:3: rule__Extension__Alternatives_8
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
    // InternalUseCaseDslParser.g:1502:1: rule__Extension__Group__9 : rule__Extension__Group__9__Impl ;
    public final void rule__Extension__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1506:1: ( rule__Extension__Group__9__Impl )
            // InternalUseCaseDslParser.g:1507:2: rule__Extension__Group__9__Impl
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
    // InternalUseCaseDslParser.g:1513:1: rule__Extension__Group__9__Impl : ( RULE_END ) ;
    public final void rule__Extension__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1517:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1518:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1518:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1519:2: RULE_END
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
    // InternalUseCaseDslParser.g:1529:1: rule__Extension__Group_8_0__0 : rule__Extension__Group_8_0__0__Impl rule__Extension__Group_8_0__1 ;
    public final void rule__Extension__Group_8_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1533:1: ( rule__Extension__Group_8_0__0__Impl rule__Extension__Group_8_0__1 )
            // InternalUseCaseDslParser.g:1534:2: rule__Extension__Group_8_0__0__Impl rule__Extension__Group_8_0__1
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
    // InternalUseCaseDslParser.g:1541:1: rule__Extension__Group_8_0__0__Impl : ( ruleStepName ) ;
    public final void rule__Extension__Group_8_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1545:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:1546:1: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:1546:1: ( ruleStepName )
            // InternalUseCaseDslParser.g:1547:2: ruleStepName
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
    // InternalUseCaseDslParser.g:1556:1: rule__Extension__Group_8_0__1 : rule__Extension__Group_8_0__1__Impl rule__Extension__Group_8_0__2 ;
    public final void rule__Extension__Group_8_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1560:1: ( rule__Extension__Group_8_0__1__Impl rule__Extension__Group_8_0__2 )
            // InternalUseCaseDslParser.g:1561:2: rule__Extension__Group_8_0__1__Impl rule__Extension__Group_8_0__2
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
    // InternalUseCaseDslParser.g:1568:1: rule__Extension__Group_8_0__1__Impl : ( FullStop ) ;
    public final void rule__Extension__Group_8_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1572:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1573:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1573:1: ( FullStop )
            // InternalUseCaseDslParser.g:1574:2: FullStop
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
    // InternalUseCaseDslParser.g:1583:1: rule__Extension__Group_8_0__2 : rule__Extension__Group_8_0__2__Impl rule__Extension__Group_8_0__3 ;
    public final void rule__Extension__Group_8_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1587:1: ( rule__Extension__Group_8_0__2__Impl rule__Extension__Group_8_0__3 )
            // InternalUseCaseDslParser.g:1588:2: rule__Extension__Group_8_0__2__Impl rule__Extension__Group_8_0__3
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
    // InternalUseCaseDslParser.g:1595:1: rule__Extension__Group_8_0__2__Impl : ( RETURN ) ;
    public final void rule__Extension__Group_8_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1599:1: ( ( RETURN ) )
            // InternalUseCaseDslParser.g:1600:1: ( RETURN )
            {
            // InternalUseCaseDslParser.g:1600:1: ( RETURN )
            // InternalUseCaseDslParser.g:1601:2: RETURN
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
    // InternalUseCaseDslParser.g:1610:1: rule__Extension__Group_8_0__3 : rule__Extension__Group_8_0__3__Impl rule__Extension__Group_8_0__4 ;
    public final void rule__Extension__Group_8_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1614:1: ( rule__Extension__Group_8_0__3__Impl rule__Extension__Group_8_0__4 )
            // InternalUseCaseDslParser.g:1615:2: rule__Extension__Group_8_0__3__Impl rule__Extension__Group_8_0__4
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
    // InternalUseCaseDslParser.g:1622:1: rule__Extension__Group_8_0__3__Impl : ( TO ) ;
    public final void rule__Extension__Group_8_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1626:1: ( ( TO ) )
            // InternalUseCaseDslParser.g:1627:1: ( TO )
            {
            // InternalUseCaseDslParser.g:1627:1: ( TO )
            // InternalUseCaseDslParser.g:1628:2: TO
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
    // InternalUseCaseDslParser.g:1637:1: rule__Extension__Group_8_0__4 : rule__Extension__Group_8_0__4__Impl ;
    public final void rule__Extension__Group_8_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1641:1: ( rule__Extension__Group_8_0__4__Impl )
            // InternalUseCaseDslParser.g:1642:2: rule__Extension__Group_8_0__4__Impl
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
    // InternalUseCaseDslParser.g:1648:1: rule__Extension__Group_8_0__4__Impl : ( ( rule__Extension__Alternatives_8_0_4 ) ) ;
    public final void rule__Extension__Group_8_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1652:1: ( ( ( rule__Extension__Alternatives_8_0_4 ) ) )
            // InternalUseCaseDslParser.g:1653:1: ( ( rule__Extension__Alternatives_8_0_4 ) )
            {
            // InternalUseCaseDslParser.g:1653:1: ( ( rule__Extension__Alternatives_8_0_4 ) )
            // InternalUseCaseDslParser.g:1654:2: ( rule__Extension__Alternatives_8_0_4 )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives_8_0_4()); 
            // InternalUseCaseDslParser.g:1655:2: ( rule__Extension__Alternatives_8_0_4 )
            // InternalUseCaseDslParser.g:1655:3: rule__Extension__Alternatives_8_0_4
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
    // InternalUseCaseDslParser.g:1664:1: rule__UseCaseStep__Group_0__0 : rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1 ;
    public final void rule__UseCaseStep__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1668:1: ( rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1 )
            // InternalUseCaseDslParser.g:1669:2: rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1
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
    // InternalUseCaseDslParser.g:1676:1: rule__UseCaseStep__Group_0__0__Impl : ( ( rule__UseCaseStep__Group_0_0__0 )? ) ;
    public final void rule__UseCaseStep__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1680:1: ( ( ( rule__UseCaseStep__Group_0_0__0 )? ) )
            // InternalUseCaseDslParser.g:1681:1: ( ( rule__UseCaseStep__Group_0_0__0 )? )
            {
            // InternalUseCaseDslParser.g:1681:1: ( ( rule__UseCaseStep__Group_0_0__0 )? )
            // InternalUseCaseDslParser.g:1682:2: ( rule__UseCaseStep__Group_0_0__0 )?
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_0_0()); 
            // InternalUseCaseDslParser.g:1683:2: ( rule__UseCaseStep__Group_0_0__0 )?
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
                    // InternalUseCaseDslParser.g:1683:3: rule__UseCaseStep__Group_0_0__0
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
    // InternalUseCaseDslParser.g:1691:1: rule__UseCaseStep__Group_0__1 : rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2 ;
    public final void rule__UseCaseStep__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1695:1: ( rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2 )
            // InternalUseCaseDslParser.g:1696:2: rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2
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
    // InternalUseCaseDslParser.g:1703:1: rule__UseCaseStep__Group_0__1__Impl : ( ( rule__UseCaseStep__NameAssignment_0_1 ) ) ;
    public final void rule__UseCaseStep__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1707:1: ( ( ( rule__UseCaseStep__NameAssignment_0_1 ) ) )
            // InternalUseCaseDslParser.g:1708:1: ( ( rule__UseCaseStep__NameAssignment_0_1 ) )
            {
            // InternalUseCaseDslParser.g:1708:1: ( ( rule__UseCaseStep__NameAssignment_0_1 ) )
            // InternalUseCaseDslParser.g:1709:2: ( rule__UseCaseStep__NameAssignment_0_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_0_1()); 
            // InternalUseCaseDslParser.g:1710:2: ( rule__UseCaseStep__NameAssignment_0_1 )
            // InternalUseCaseDslParser.g:1710:3: rule__UseCaseStep__NameAssignment_0_1
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
    // InternalUseCaseDslParser.g:1718:1: rule__UseCaseStep__Group_0__2 : rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3 ;
    public final void rule__UseCaseStep__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1722:1: ( rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3 )
            // InternalUseCaseDslParser.g:1723:2: rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3
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
    // InternalUseCaseDslParser.g:1730:1: rule__UseCaseStep__Group_0__2__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1734:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1735:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1735:1: ( FullStop )
            // InternalUseCaseDslParser.g:1736:2: FullStop
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
    // InternalUseCaseDslParser.g:1745:1: rule__UseCaseStep__Group_0__3 : rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4 ;
    public final void rule__UseCaseStep__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1749:1: ( rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4 )
            // InternalUseCaseDslParser.g:1750:2: rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4
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
    // InternalUseCaseDslParser.g:1757:1: rule__UseCaseStep__Group_0__3__Impl : ( INCLUDE ) ;
    public final void rule__UseCaseStep__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1761:1: ( ( INCLUDE ) )
            // InternalUseCaseDslParser.g:1762:1: ( INCLUDE )
            {
            // InternalUseCaseDslParser.g:1762:1: ( INCLUDE )
            // InternalUseCaseDslParser.g:1763:2: INCLUDE
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
    // InternalUseCaseDslParser.g:1772:1: rule__UseCaseStep__Group_0__4 : rule__UseCaseStep__Group_0__4__Impl ;
    public final void rule__UseCaseStep__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1776:1: ( rule__UseCaseStep__Group_0__4__Impl )
            // InternalUseCaseDslParser.g:1777:2: rule__UseCaseStep__Group_0__4__Impl
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
    // InternalUseCaseDslParser.g:1783:1: rule__UseCaseStep__Group_0__4__Impl : ( ( rule__UseCaseStep__ReferenceAssignment_0_4 ) ) ;
    public final void rule__UseCaseStep__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1787:1: ( ( ( rule__UseCaseStep__ReferenceAssignment_0_4 ) ) )
            // InternalUseCaseDslParser.g:1788:1: ( ( rule__UseCaseStep__ReferenceAssignment_0_4 ) )
            {
            // InternalUseCaseDslParser.g:1788:1: ( ( rule__UseCaseStep__ReferenceAssignment_0_4 ) )
            // InternalUseCaseDslParser.g:1789:2: ( rule__UseCaseStep__ReferenceAssignment_0_4 )
            {
             before(grammarAccess.getUseCaseStepAccess().getReferenceAssignment_0_4()); 
            // InternalUseCaseDslParser.g:1790:2: ( rule__UseCaseStep__ReferenceAssignment_0_4 )
            // InternalUseCaseDslParser.g:1790:3: rule__UseCaseStep__ReferenceAssignment_0_4
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
    // InternalUseCaseDslParser.g:1799:1: rule__UseCaseStep__Group_0_0__0 : rule__UseCaseStep__Group_0_0__0__Impl rule__UseCaseStep__Group_0_0__1 ;
    public final void rule__UseCaseStep__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1803:1: ( rule__UseCaseStep__Group_0_0__0__Impl rule__UseCaseStep__Group_0_0__1 )
            // InternalUseCaseDslParser.g:1804:2: rule__UseCaseStep__Group_0_0__0__Impl rule__UseCaseStep__Group_0_0__1
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
    // InternalUseCaseDslParser.g:1811:1: rule__UseCaseStep__Group_0_0__0__Impl : ( ( rule__UseCaseStep__ParentAssignment_0_0_0 ) ) ;
    public final void rule__UseCaseStep__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1815:1: ( ( ( rule__UseCaseStep__ParentAssignment_0_0_0 ) ) )
            // InternalUseCaseDslParser.g:1816:1: ( ( rule__UseCaseStep__ParentAssignment_0_0_0 ) )
            {
            // InternalUseCaseDslParser.g:1816:1: ( ( rule__UseCaseStep__ParentAssignment_0_0_0 ) )
            // InternalUseCaseDslParser.g:1817:2: ( rule__UseCaseStep__ParentAssignment_0_0_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentAssignment_0_0_0()); 
            // InternalUseCaseDslParser.g:1818:2: ( rule__UseCaseStep__ParentAssignment_0_0_0 )
            // InternalUseCaseDslParser.g:1818:3: rule__UseCaseStep__ParentAssignment_0_0_0
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
    // InternalUseCaseDslParser.g:1826:1: rule__UseCaseStep__Group_0_0__1 : rule__UseCaseStep__Group_0_0__1__Impl ;
    public final void rule__UseCaseStep__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1830:1: ( rule__UseCaseStep__Group_0_0__1__Impl )
            // InternalUseCaseDslParser.g:1831:2: rule__UseCaseStep__Group_0_0__1__Impl
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
    // InternalUseCaseDslParser.g:1837:1: rule__UseCaseStep__Group_0_0__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1841:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1842:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1842:1: ( FullStop )
            // InternalUseCaseDslParser.g:1843:2: FullStop
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
    // InternalUseCaseDslParser.g:1853:1: rule__UseCaseStep__Group_1__0 : rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1 ;
    public final void rule__UseCaseStep__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1857:1: ( rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1 )
            // InternalUseCaseDslParser.g:1858:2: rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1
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
    // InternalUseCaseDslParser.g:1865:1: rule__UseCaseStep__Group_1__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1869:1: ( ( () ) )
            // InternalUseCaseDslParser.g:1870:1: ( () )
            {
            // InternalUseCaseDslParser.g:1870:1: ( () )
            // InternalUseCaseDslParser.g:1871:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getUserStepAction_1_0()); 
            // InternalUseCaseDslParser.g:1872:2: ()
            // InternalUseCaseDslParser.g:1872:3: 
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
    // InternalUseCaseDslParser.g:1880:1: rule__UseCaseStep__Group_1__1 : rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2 ;
    public final void rule__UseCaseStep__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1884:1: ( rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2 )
            // InternalUseCaseDslParser.g:1885:2: rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2
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
    // InternalUseCaseDslParser.g:1892:1: rule__UseCaseStep__Group_1__1__Impl : ( ( rule__UseCaseStep__Group_1_1__0 )? ) ;
    public final void rule__UseCaseStep__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1896:1: ( ( ( rule__UseCaseStep__Group_1_1__0 )? ) )
            // InternalUseCaseDslParser.g:1897:1: ( ( rule__UseCaseStep__Group_1_1__0 )? )
            {
            // InternalUseCaseDslParser.g:1897:1: ( ( rule__UseCaseStep__Group_1_1__0 )? )
            // InternalUseCaseDslParser.g:1898:2: ( rule__UseCaseStep__Group_1_1__0 )?
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_1_1()); 
            // InternalUseCaseDslParser.g:1899:2: ( rule__UseCaseStep__Group_1_1__0 )?
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
                    // InternalUseCaseDslParser.g:1899:3: rule__UseCaseStep__Group_1_1__0
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
    // InternalUseCaseDslParser.g:1907:1: rule__UseCaseStep__Group_1__2 : rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3 ;
    public final void rule__UseCaseStep__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1911:1: ( rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3 )
            // InternalUseCaseDslParser.g:1912:2: rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3
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
    // InternalUseCaseDslParser.g:1919:1: rule__UseCaseStep__Group_1__2__Impl : ( ( rule__UseCaseStep__NameAssignment_1_2 ) ) ;
    public final void rule__UseCaseStep__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1923:1: ( ( ( rule__UseCaseStep__NameAssignment_1_2 ) ) )
            // InternalUseCaseDslParser.g:1924:1: ( ( rule__UseCaseStep__NameAssignment_1_2 ) )
            {
            // InternalUseCaseDslParser.g:1924:1: ( ( rule__UseCaseStep__NameAssignment_1_2 ) )
            // InternalUseCaseDslParser.g:1925:2: ( rule__UseCaseStep__NameAssignment_1_2 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_1_2()); 
            // InternalUseCaseDslParser.g:1926:2: ( rule__UseCaseStep__NameAssignment_1_2 )
            // InternalUseCaseDslParser.g:1926:3: rule__UseCaseStep__NameAssignment_1_2
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
    // InternalUseCaseDslParser.g:1934:1: rule__UseCaseStep__Group_1__3 : rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4 ;
    public final void rule__UseCaseStep__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1938:1: ( rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4 )
            // InternalUseCaseDslParser.g:1939:2: rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4
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
    // InternalUseCaseDslParser.g:1946:1: rule__UseCaseStep__Group_1__3__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1950:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1951:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1951:1: ( FullStop )
            // InternalUseCaseDslParser.g:1952:2: FullStop
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
    // InternalUseCaseDslParser.g:1961:1: rule__UseCaseStep__Group_1__4 : rule__UseCaseStep__Group_1__4__Impl rule__UseCaseStep__Group_1__5 ;
    public final void rule__UseCaseStep__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1965:1: ( rule__UseCaseStep__Group_1__4__Impl rule__UseCaseStep__Group_1__5 )
            // InternalUseCaseDslParser.g:1966:2: rule__UseCaseStep__Group_1__4__Impl rule__UseCaseStep__Group_1__5
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
    // InternalUseCaseDslParser.g:1973:1: rule__UseCaseStep__Group_1__4__Impl : ( USER ) ;
    public final void rule__UseCaseStep__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1977:1: ( ( USER ) )
            // InternalUseCaseDslParser.g:1978:1: ( USER )
            {
            // InternalUseCaseDslParser.g:1978:1: ( USER )
            // InternalUseCaseDslParser.g:1979:2: USER
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
    // InternalUseCaseDslParser.g:1988:1: rule__UseCaseStep__Group_1__5 : rule__UseCaseStep__Group_1__5__Impl ;
    public final void rule__UseCaseStep__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1992:1: ( rule__UseCaseStep__Group_1__5__Impl )
            // InternalUseCaseDslParser.g:1993:2: rule__UseCaseStep__Group_1__5__Impl
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
    // InternalUseCaseDslParser.g:1999:1: rule__UseCaseStep__Group_1__5__Impl : ( ( rule__UseCaseStep__SentenceAssignment_1_5 ) ) ;
    public final void rule__UseCaseStep__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2003:1: ( ( ( rule__UseCaseStep__SentenceAssignment_1_5 ) ) )
            // InternalUseCaseDslParser.g:2004:1: ( ( rule__UseCaseStep__SentenceAssignment_1_5 ) )
            {
            // InternalUseCaseDslParser.g:2004:1: ( ( rule__UseCaseStep__SentenceAssignment_1_5 ) )
            // InternalUseCaseDslParser.g:2005:2: ( rule__UseCaseStep__SentenceAssignment_1_5 )
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_1_5()); 
            // InternalUseCaseDslParser.g:2006:2: ( rule__UseCaseStep__SentenceAssignment_1_5 )
            // InternalUseCaseDslParser.g:2006:3: rule__UseCaseStep__SentenceAssignment_1_5
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
    // InternalUseCaseDslParser.g:2015:1: rule__UseCaseStep__Group_1_1__0 : rule__UseCaseStep__Group_1_1__0__Impl rule__UseCaseStep__Group_1_1__1 ;
    public final void rule__UseCaseStep__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2019:1: ( rule__UseCaseStep__Group_1_1__0__Impl rule__UseCaseStep__Group_1_1__1 )
            // InternalUseCaseDslParser.g:2020:2: rule__UseCaseStep__Group_1_1__0__Impl rule__UseCaseStep__Group_1_1__1
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
    // InternalUseCaseDslParser.g:2027:1: rule__UseCaseStep__Group_1_1__0__Impl : ( ( rule__UseCaseStep__ParentAssignment_1_1_0 ) ) ;
    public final void rule__UseCaseStep__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2031:1: ( ( ( rule__UseCaseStep__ParentAssignment_1_1_0 ) ) )
            // InternalUseCaseDslParser.g:2032:1: ( ( rule__UseCaseStep__ParentAssignment_1_1_0 ) )
            {
            // InternalUseCaseDslParser.g:2032:1: ( ( rule__UseCaseStep__ParentAssignment_1_1_0 ) )
            // InternalUseCaseDslParser.g:2033:2: ( rule__UseCaseStep__ParentAssignment_1_1_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentAssignment_1_1_0()); 
            // InternalUseCaseDslParser.g:2034:2: ( rule__UseCaseStep__ParentAssignment_1_1_0 )
            // InternalUseCaseDslParser.g:2034:3: rule__UseCaseStep__ParentAssignment_1_1_0
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
    // InternalUseCaseDslParser.g:2042:1: rule__UseCaseStep__Group_1_1__1 : rule__UseCaseStep__Group_1_1__1__Impl ;
    public final void rule__UseCaseStep__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2046:1: ( rule__UseCaseStep__Group_1_1__1__Impl )
            // InternalUseCaseDslParser.g:2047:2: rule__UseCaseStep__Group_1_1__1__Impl
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
    // InternalUseCaseDslParser.g:2053:1: rule__UseCaseStep__Group_1_1__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2057:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2058:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2058:1: ( FullStop )
            // InternalUseCaseDslParser.g:2059:2: FullStop
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
    // InternalUseCaseDslParser.g:2069:1: rule__UseCaseStep__Group_2__0 : rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1 ;
    public final void rule__UseCaseStep__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2073:1: ( rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1 )
            // InternalUseCaseDslParser.g:2074:2: rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1
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
    // InternalUseCaseDslParser.g:2081:1: rule__UseCaseStep__Group_2__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2085:1: ( ( () ) )
            // InternalUseCaseDslParser.g:2086:1: ( () )
            {
            // InternalUseCaseDslParser.g:2086:1: ( () )
            // InternalUseCaseDslParser.g:2087:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getSystemStepAction_2_0()); 
            // InternalUseCaseDslParser.g:2088:2: ()
            // InternalUseCaseDslParser.g:2088:3: 
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
    // InternalUseCaseDslParser.g:2096:1: rule__UseCaseStep__Group_2__1 : rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2 ;
    public final void rule__UseCaseStep__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2100:1: ( rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2 )
            // InternalUseCaseDslParser.g:2101:2: rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2
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
    // InternalUseCaseDslParser.g:2108:1: rule__UseCaseStep__Group_2__1__Impl : ( ( rule__UseCaseStep__Group_2_1__0 )? ) ;
    public final void rule__UseCaseStep__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2112:1: ( ( ( rule__UseCaseStep__Group_2_1__0 )? ) )
            // InternalUseCaseDslParser.g:2113:1: ( ( rule__UseCaseStep__Group_2_1__0 )? )
            {
            // InternalUseCaseDslParser.g:2113:1: ( ( rule__UseCaseStep__Group_2_1__0 )? )
            // InternalUseCaseDslParser.g:2114:2: ( rule__UseCaseStep__Group_2_1__0 )?
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_2_1()); 
            // InternalUseCaseDslParser.g:2115:2: ( rule__UseCaseStep__Group_2_1__0 )?
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
                    // InternalUseCaseDslParser.g:2115:3: rule__UseCaseStep__Group_2_1__0
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
    // InternalUseCaseDslParser.g:2123:1: rule__UseCaseStep__Group_2__2 : rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3 ;
    public final void rule__UseCaseStep__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2127:1: ( rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3 )
            // InternalUseCaseDslParser.g:2128:2: rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3
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
    // InternalUseCaseDslParser.g:2135:1: rule__UseCaseStep__Group_2__2__Impl : ( ( rule__UseCaseStep__NameAssignment_2_2 ) ) ;
    public final void rule__UseCaseStep__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2139:1: ( ( ( rule__UseCaseStep__NameAssignment_2_2 ) ) )
            // InternalUseCaseDslParser.g:2140:1: ( ( rule__UseCaseStep__NameAssignment_2_2 ) )
            {
            // InternalUseCaseDslParser.g:2140:1: ( ( rule__UseCaseStep__NameAssignment_2_2 ) )
            // InternalUseCaseDslParser.g:2141:2: ( rule__UseCaseStep__NameAssignment_2_2 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_2_2()); 
            // InternalUseCaseDslParser.g:2142:2: ( rule__UseCaseStep__NameAssignment_2_2 )
            // InternalUseCaseDslParser.g:2142:3: rule__UseCaseStep__NameAssignment_2_2
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
    // InternalUseCaseDslParser.g:2150:1: rule__UseCaseStep__Group_2__3 : rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4 ;
    public final void rule__UseCaseStep__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2154:1: ( rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4 )
            // InternalUseCaseDslParser.g:2155:2: rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4
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
    // InternalUseCaseDslParser.g:2162:1: rule__UseCaseStep__Group_2__3__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2166:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2167:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2167:1: ( FullStop )
            // InternalUseCaseDslParser.g:2168:2: FullStop
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
    // InternalUseCaseDslParser.g:2177:1: rule__UseCaseStep__Group_2__4 : rule__UseCaseStep__Group_2__4__Impl rule__UseCaseStep__Group_2__5 ;
    public final void rule__UseCaseStep__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2181:1: ( rule__UseCaseStep__Group_2__4__Impl rule__UseCaseStep__Group_2__5 )
            // InternalUseCaseDslParser.g:2182:2: rule__UseCaseStep__Group_2__4__Impl rule__UseCaseStep__Group_2__5
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
    // InternalUseCaseDslParser.g:2189:1: rule__UseCaseStep__Group_2__4__Impl : ( SYSTEM ) ;
    public final void rule__UseCaseStep__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2193:1: ( ( SYSTEM ) )
            // InternalUseCaseDslParser.g:2194:1: ( SYSTEM )
            {
            // InternalUseCaseDslParser.g:2194:1: ( SYSTEM )
            // InternalUseCaseDslParser.g:2195:2: SYSTEM
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
    // InternalUseCaseDslParser.g:2204:1: rule__UseCaseStep__Group_2__5 : rule__UseCaseStep__Group_2__5__Impl ;
    public final void rule__UseCaseStep__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2208:1: ( rule__UseCaseStep__Group_2__5__Impl )
            // InternalUseCaseDslParser.g:2209:2: rule__UseCaseStep__Group_2__5__Impl
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
    // InternalUseCaseDslParser.g:2215:1: rule__UseCaseStep__Group_2__5__Impl : ( ( rule__UseCaseStep__SentenceAssignment_2_5 ) ) ;
    public final void rule__UseCaseStep__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2219:1: ( ( ( rule__UseCaseStep__SentenceAssignment_2_5 ) ) )
            // InternalUseCaseDslParser.g:2220:1: ( ( rule__UseCaseStep__SentenceAssignment_2_5 ) )
            {
            // InternalUseCaseDslParser.g:2220:1: ( ( rule__UseCaseStep__SentenceAssignment_2_5 ) )
            // InternalUseCaseDslParser.g:2221:2: ( rule__UseCaseStep__SentenceAssignment_2_5 )
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_2_5()); 
            // InternalUseCaseDslParser.g:2222:2: ( rule__UseCaseStep__SentenceAssignment_2_5 )
            // InternalUseCaseDslParser.g:2222:3: rule__UseCaseStep__SentenceAssignment_2_5
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
    // InternalUseCaseDslParser.g:2231:1: rule__UseCaseStep__Group_2_1__0 : rule__UseCaseStep__Group_2_1__0__Impl rule__UseCaseStep__Group_2_1__1 ;
    public final void rule__UseCaseStep__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2235:1: ( rule__UseCaseStep__Group_2_1__0__Impl rule__UseCaseStep__Group_2_1__1 )
            // InternalUseCaseDslParser.g:2236:2: rule__UseCaseStep__Group_2_1__0__Impl rule__UseCaseStep__Group_2_1__1
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
    // InternalUseCaseDslParser.g:2243:1: rule__UseCaseStep__Group_2_1__0__Impl : ( ( rule__UseCaseStep__ParentAssignment_2_1_0 ) ) ;
    public final void rule__UseCaseStep__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2247:1: ( ( ( rule__UseCaseStep__ParentAssignment_2_1_0 ) ) )
            // InternalUseCaseDslParser.g:2248:1: ( ( rule__UseCaseStep__ParentAssignment_2_1_0 ) )
            {
            // InternalUseCaseDslParser.g:2248:1: ( ( rule__UseCaseStep__ParentAssignment_2_1_0 ) )
            // InternalUseCaseDslParser.g:2249:2: ( rule__UseCaseStep__ParentAssignment_2_1_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentAssignment_2_1_0()); 
            // InternalUseCaseDslParser.g:2250:2: ( rule__UseCaseStep__ParentAssignment_2_1_0 )
            // InternalUseCaseDslParser.g:2250:3: rule__UseCaseStep__ParentAssignment_2_1_0
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
    // InternalUseCaseDslParser.g:2258:1: rule__UseCaseStep__Group_2_1__1 : rule__UseCaseStep__Group_2_1__1__Impl ;
    public final void rule__UseCaseStep__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2262:1: ( rule__UseCaseStep__Group_2_1__1__Impl )
            // InternalUseCaseDslParser.g:2263:2: rule__UseCaseStep__Group_2_1__1__Impl
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
    // InternalUseCaseDslParser.g:2269:1: rule__UseCaseStep__Group_2_1__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2273:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2274:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2274:1: ( FullStop )
            // InternalUseCaseDslParser.g:2275:2: FullStop
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
    // InternalUseCaseDslParser.g:2285:1: rule__UseCaseStep__Group_3__0 : rule__UseCaseStep__Group_3__0__Impl rule__UseCaseStep__Group_3__1 ;
    public final void rule__UseCaseStep__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2289:1: ( rule__UseCaseStep__Group_3__0__Impl rule__UseCaseStep__Group_3__1 )
            // InternalUseCaseDslParser.g:2290:2: rule__UseCaseStep__Group_3__0__Impl rule__UseCaseStep__Group_3__1
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
    // InternalUseCaseDslParser.g:2297:1: rule__UseCaseStep__Group_3__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2301:1: ( ( () ) )
            // InternalUseCaseDslParser.g:2302:1: ( () )
            {
            // InternalUseCaseDslParser.g:2302:1: ( () )
            // InternalUseCaseDslParser.g:2303:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatingStepAction_3_0()); 
            // InternalUseCaseDslParser.g:2304:2: ()
            // InternalUseCaseDslParser.g:2304:3: 
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
    // InternalUseCaseDslParser.g:2312:1: rule__UseCaseStep__Group_3__1 : rule__UseCaseStep__Group_3__1__Impl rule__UseCaseStep__Group_3__2 ;
    public final void rule__UseCaseStep__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2316:1: ( rule__UseCaseStep__Group_3__1__Impl rule__UseCaseStep__Group_3__2 )
            // InternalUseCaseDslParser.g:2317:2: rule__UseCaseStep__Group_3__1__Impl rule__UseCaseStep__Group_3__2
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
    // InternalUseCaseDslParser.g:2324:1: rule__UseCaseStep__Group_3__1__Impl : ( ( rule__UseCaseStep__Group_3_1__0 )? ) ;
    public final void rule__UseCaseStep__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2328:1: ( ( ( rule__UseCaseStep__Group_3_1__0 )? ) )
            // InternalUseCaseDslParser.g:2329:1: ( ( rule__UseCaseStep__Group_3_1__0 )? )
            {
            // InternalUseCaseDslParser.g:2329:1: ( ( rule__UseCaseStep__Group_3_1__0 )? )
            // InternalUseCaseDslParser.g:2330:2: ( rule__UseCaseStep__Group_3_1__0 )?
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_3_1()); 
            // InternalUseCaseDslParser.g:2331:2: ( rule__UseCaseStep__Group_3_1__0 )?
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
                    // InternalUseCaseDslParser.g:2331:3: rule__UseCaseStep__Group_3_1__0
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
    // InternalUseCaseDslParser.g:2339:1: rule__UseCaseStep__Group_3__2 : rule__UseCaseStep__Group_3__2__Impl rule__UseCaseStep__Group_3__3 ;
    public final void rule__UseCaseStep__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2343:1: ( rule__UseCaseStep__Group_3__2__Impl rule__UseCaseStep__Group_3__3 )
            // InternalUseCaseDslParser.g:2344:2: rule__UseCaseStep__Group_3__2__Impl rule__UseCaseStep__Group_3__3
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
    // InternalUseCaseDslParser.g:2351:1: rule__UseCaseStep__Group_3__2__Impl : ( ( rule__UseCaseStep__NameAssignment_3_2 ) ) ;
    public final void rule__UseCaseStep__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2355:1: ( ( ( rule__UseCaseStep__NameAssignment_3_2 ) ) )
            // InternalUseCaseDslParser.g:2356:1: ( ( rule__UseCaseStep__NameAssignment_3_2 ) )
            {
            // InternalUseCaseDslParser.g:2356:1: ( ( rule__UseCaseStep__NameAssignment_3_2 ) )
            // InternalUseCaseDslParser.g:2357:2: ( rule__UseCaseStep__NameAssignment_3_2 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_3_2()); 
            // InternalUseCaseDslParser.g:2358:2: ( rule__UseCaseStep__NameAssignment_3_2 )
            // InternalUseCaseDslParser.g:2358:3: rule__UseCaseStep__NameAssignment_3_2
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
    // InternalUseCaseDslParser.g:2366:1: rule__UseCaseStep__Group_3__3 : rule__UseCaseStep__Group_3__3__Impl rule__UseCaseStep__Group_3__4 ;
    public final void rule__UseCaseStep__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2370:1: ( rule__UseCaseStep__Group_3__3__Impl rule__UseCaseStep__Group_3__4 )
            // InternalUseCaseDslParser.g:2371:2: rule__UseCaseStep__Group_3__3__Impl rule__UseCaseStep__Group_3__4
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
    // InternalUseCaseDslParser.g:2378:1: rule__UseCaseStep__Group_3__3__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2382:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2383:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2383:1: ( FullStop )
            // InternalUseCaseDslParser.g:2384:2: FullStop
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
    // InternalUseCaseDslParser.g:2393:1: rule__UseCaseStep__Group_3__4 : rule__UseCaseStep__Group_3__4__Impl rule__UseCaseStep__Group_3__5 ;
    public final void rule__UseCaseStep__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2397:1: ( rule__UseCaseStep__Group_3__4__Impl rule__UseCaseStep__Group_3__5 )
            // InternalUseCaseDslParser.g:2398:2: rule__UseCaseStep__Group_3__4__Impl rule__UseCaseStep__Group_3__5
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
    // InternalUseCaseDslParser.g:2405:1: rule__UseCaseStep__Group_3__4__Impl : ( WHILE ) ;
    public final void rule__UseCaseStep__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2409:1: ( ( WHILE ) )
            // InternalUseCaseDslParser.g:2410:1: ( WHILE )
            {
            // InternalUseCaseDslParser.g:2410:1: ( WHILE )
            // InternalUseCaseDslParser.g:2411:2: WHILE
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
    // InternalUseCaseDslParser.g:2420:1: rule__UseCaseStep__Group_3__5 : rule__UseCaseStep__Group_3__5__Impl rule__UseCaseStep__Group_3__6 ;
    public final void rule__UseCaseStep__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2424:1: ( rule__UseCaseStep__Group_3__5__Impl rule__UseCaseStep__Group_3__6 )
            // InternalUseCaseDslParser.g:2425:2: rule__UseCaseStep__Group_3__5__Impl rule__UseCaseStep__Group_3__6
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
    // InternalUseCaseDslParser.g:2432:1: rule__UseCaseStep__Group_3__5__Impl : ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 ) ) ;
    public final void rule__UseCaseStep__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2436:1: ( ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 ) ) )
            // InternalUseCaseDslParser.g:2437:1: ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 ) )
            {
            // InternalUseCaseDslParser.g:2437:1: ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 ) )
            // InternalUseCaseDslParser.g:2438:2: ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 )
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatingConditionAssignment_3_5()); 
            // InternalUseCaseDslParser.g:2439:2: ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 )
            // InternalUseCaseDslParser.g:2439:3: rule__UseCaseStep__RepeatingConditionAssignment_3_5
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
    // InternalUseCaseDslParser.g:2447:1: rule__UseCaseStep__Group_3__6 : rule__UseCaseStep__Group_3__6__Impl rule__UseCaseStep__Group_3__7 ;
    public final void rule__UseCaseStep__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2451:1: ( rule__UseCaseStep__Group_3__6__Impl rule__UseCaseStep__Group_3__7 )
            // InternalUseCaseDslParser.g:2452:2: rule__UseCaseStep__Group_3__6__Impl rule__UseCaseStep__Group_3__7
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
    // InternalUseCaseDslParser.g:2459:1: rule__UseCaseStep__Group_3__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCaseStep__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2463:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:2464:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:2464:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:2465:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:2474:1: rule__UseCaseStep__Group_3__7 : rule__UseCaseStep__Group_3__7__Impl rule__UseCaseStep__Group_3__8 ;
    public final void rule__UseCaseStep__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2478:1: ( rule__UseCaseStep__Group_3__7__Impl rule__UseCaseStep__Group_3__8 )
            // InternalUseCaseDslParser.g:2479:2: rule__UseCaseStep__Group_3__7__Impl rule__UseCaseStep__Group_3__8
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
    // InternalUseCaseDslParser.g:2486:1: rule__UseCaseStep__Group_3__7__Impl : ( ( ( rule__UseCaseStep__RepeatflowAssignment_3_7 ) ) ( ( rule__UseCaseStep__RepeatflowAssignment_3_7 )* ) ) ;
    public final void rule__UseCaseStep__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2490:1: ( ( ( ( rule__UseCaseStep__RepeatflowAssignment_3_7 ) ) ( ( rule__UseCaseStep__RepeatflowAssignment_3_7 )* ) ) )
            // InternalUseCaseDslParser.g:2491:1: ( ( ( rule__UseCaseStep__RepeatflowAssignment_3_7 ) ) ( ( rule__UseCaseStep__RepeatflowAssignment_3_7 )* ) )
            {
            // InternalUseCaseDslParser.g:2491:1: ( ( ( rule__UseCaseStep__RepeatflowAssignment_3_7 ) ) ( ( rule__UseCaseStep__RepeatflowAssignment_3_7 )* ) )
            // InternalUseCaseDslParser.g:2492:2: ( ( rule__UseCaseStep__RepeatflowAssignment_3_7 ) ) ( ( rule__UseCaseStep__RepeatflowAssignment_3_7 )* )
            {
            // InternalUseCaseDslParser.g:2492:2: ( ( rule__UseCaseStep__RepeatflowAssignment_3_7 ) )
            // InternalUseCaseDslParser.g:2493:3: ( rule__UseCaseStep__RepeatflowAssignment_3_7 )
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatflowAssignment_3_7()); 
            // InternalUseCaseDslParser.g:2494:3: ( rule__UseCaseStep__RepeatflowAssignment_3_7 )
            // InternalUseCaseDslParser.g:2494:4: rule__UseCaseStep__RepeatflowAssignment_3_7
            {
            pushFollow(FOLLOW_13);
            rule__UseCaseStep__RepeatflowAssignment_3_7();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getRepeatflowAssignment_3_7()); 

            }

            // InternalUseCaseDslParser.g:2497:2: ( ( rule__UseCaseStep__RepeatflowAssignment_3_7 )* )
            // InternalUseCaseDslParser.g:2498:3: ( rule__UseCaseStep__RepeatflowAssignment_3_7 )*
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatflowAssignment_3_7()); 
            // InternalUseCaseDslParser.g:2499:3: ( rule__UseCaseStep__RepeatflowAssignment_3_7 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_INT) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:2499:4: rule__UseCaseStep__RepeatflowAssignment_3_7
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__UseCaseStep__RepeatflowAssignment_3_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getUseCaseStepAccess().getRepeatflowAssignment_3_7()); 

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
    // InternalUseCaseDslParser.g:2508:1: rule__UseCaseStep__Group_3__8 : rule__UseCaseStep__Group_3__8__Impl ;
    public final void rule__UseCaseStep__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2512:1: ( rule__UseCaseStep__Group_3__8__Impl )
            // InternalUseCaseDslParser.g:2513:2: rule__UseCaseStep__Group_3__8__Impl
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
    // InternalUseCaseDslParser.g:2519:1: rule__UseCaseStep__Group_3__8__Impl : ( RULE_END ) ;
    public final void rule__UseCaseStep__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2523:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:2524:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:2524:1: ( RULE_END )
            // InternalUseCaseDslParser.g:2525:2: RULE_END
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
    // InternalUseCaseDslParser.g:2535:1: rule__UseCaseStep__Group_3_1__0 : rule__UseCaseStep__Group_3_1__0__Impl rule__UseCaseStep__Group_3_1__1 ;
    public final void rule__UseCaseStep__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2539:1: ( rule__UseCaseStep__Group_3_1__0__Impl rule__UseCaseStep__Group_3_1__1 )
            // InternalUseCaseDslParser.g:2540:2: rule__UseCaseStep__Group_3_1__0__Impl rule__UseCaseStep__Group_3_1__1
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
    // InternalUseCaseDslParser.g:2547:1: rule__UseCaseStep__Group_3_1__0__Impl : ( ( rule__UseCaseStep__ParentAssignment_3_1_0 ) ) ;
    public final void rule__UseCaseStep__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2551:1: ( ( ( rule__UseCaseStep__ParentAssignment_3_1_0 ) ) )
            // InternalUseCaseDslParser.g:2552:1: ( ( rule__UseCaseStep__ParentAssignment_3_1_0 ) )
            {
            // InternalUseCaseDslParser.g:2552:1: ( ( rule__UseCaseStep__ParentAssignment_3_1_0 ) )
            // InternalUseCaseDslParser.g:2553:2: ( rule__UseCaseStep__ParentAssignment_3_1_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentAssignment_3_1_0()); 
            // InternalUseCaseDslParser.g:2554:2: ( rule__UseCaseStep__ParentAssignment_3_1_0 )
            // InternalUseCaseDslParser.g:2554:3: rule__UseCaseStep__ParentAssignment_3_1_0
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
    // InternalUseCaseDslParser.g:2562:1: rule__UseCaseStep__Group_3_1__1 : rule__UseCaseStep__Group_3_1__1__Impl ;
    public final void rule__UseCaseStep__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2566:1: ( rule__UseCaseStep__Group_3_1__1__Impl )
            // InternalUseCaseDslParser.g:2567:2: rule__UseCaseStep__Group_3_1__1__Impl
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
    // InternalUseCaseDslParser.g:2573:1: rule__UseCaseStep__Group_3_1__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2577:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2578:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2578:1: ( FullStop )
            // InternalUseCaseDslParser.g:2579:2: FullStop
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
    // InternalUseCaseDslParser.g:2589:1: rule__ExtensionStep__Group_0__0 : rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1 ;
    public final void rule__ExtensionStep__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2593:1: ( rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1 )
            // InternalUseCaseDslParser.g:2594:2: rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1
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
    // InternalUseCaseDslParser.g:2601:1: rule__ExtensionStep__Group_0__0__Impl : ( ( rule__ExtensionStep__NameAssignment_0_0 ) ) ;
    public final void rule__ExtensionStep__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2605:1: ( ( ( rule__ExtensionStep__NameAssignment_0_0 ) ) )
            // InternalUseCaseDslParser.g:2606:1: ( ( rule__ExtensionStep__NameAssignment_0_0 ) )
            {
            // InternalUseCaseDslParser.g:2606:1: ( ( rule__ExtensionStep__NameAssignment_0_0 ) )
            // InternalUseCaseDslParser.g:2607:2: ( rule__ExtensionStep__NameAssignment_0_0 )
            {
             before(grammarAccess.getExtensionStepAccess().getNameAssignment_0_0()); 
            // InternalUseCaseDslParser.g:2608:2: ( rule__ExtensionStep__NameAssignment_0_0 )
            // InternalUseCaseDslParser.g:2608:3: rule__ExtensionStep__NameAssignment_0_0
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
    // InternalUseCaseDslParser.g:2616:1: rule__ExtensionStep__Group_0__1 : rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2 ;
    public final void rule__ExtensionStep__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2620:1: ( rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2 )
            // InternalUseCaseDslParser.g:2621:2: rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalUseCaseDslParser.g:2628:1: rule__ExtensionStep__Group_0__1__Impl : ( FullStop ) ;
    public final void rule__ExtensionStep__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2632:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2633:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2633:1: ( FullStop )
            // InternalUseCaseDslParser.g:2634:2: FullStop
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
    // InternalUseCaseDslParser.g:2643:1: rule__ExtensionStep__Group_0__2 : rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3 ;
    public final void rule__ExtensionStep__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2647:1: ( rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3 )
            // InternalUseCaseDslParser.g:2648:2: rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalUseCaseDslParser.g:2655:1: rule__ExtensionStep__Group_0__2__Impl : ( ( rule__ExtensionStep__Alternatives_0_2 )? ) ;
    public final void rule__ExtensionStep__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2659:1: ( ( ( rule__ExtensionStep__Alternatives_0_2 )? ) )
            // InternalUseCaseDslParser.g:2660:1: ( ( rule__ExtensionStep__Alternatives_0_2 )? )
            {
            // InternalUseCaseDslParser.g:2660:1: ( ( rule__ExtensionStep__Alternatives_0_2 )? )
            // InternalUseCaseDslParser.g:2661:2: ( rule__ExtensionStep__Alternatives_0_2 )?
            {
             before(grammarAccess.getExtensionStepAccess().getAlternatives_0_2()); 
            // InternalUseCaseDslParser.g:2662:2: ( rule__ExtensionStep__Alternatives_0_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=SYSTEM && LA24_0<=WHILE)||LA24_0==USER) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUseCaseDslParser.g:2662:3: rule__ExtensionStep__Alternatives_0_2
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
    // InternalUseCaseDslParser.g:2670:1: rule__ExtensionStep__Group_0__3 : rule__ExtensionStep__Group_0__3__Impl ;
    public final void rule__ExtensionStep__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2674:1: ( rule__ExtensionStep__Group_0__3__Impl )
            // InternalUseCaseDslParser.g:2675:2: rule__ExtensionStep__Group_0__3__Impl
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
    // InternalUseCaseDslParser.g:2681:1: rule__ExtensionStep__Group_0__3__Impl : ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) ) ;
    public final void rule__ExtensionStep__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2685:1: ( ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) ) )
            // InternalUseCaseDslParser.g:2686:1: ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) )
            {
            // InternalUseCaseDslParser.g:2686:1: ( ( rule__ExtensionStep__SentenceAssignment_0_3 ) )
            // InternalUseCaseDslParser.g:2687:2: ( rule__ExtensionStep__SentenceAssignment_0_3 )
            {
             before(grammarAccess.getExtensionStepAccess().getSentenceAssignment_0_3()); 
            // InternalUseCaseDslParser.g:2688:2: ( rule__ExtensionStep__SentenceAssignment_0_3 )
            // InternalUseCaseDslParser.g:2688:3: rule__ExtensionStep__SentenceAssignment_0_3
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
    // InternalUseCaseDslParser.g:2697:1: rule__DeadEndStep__Group__0 : rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1 ;
    public final void rule__DeadEndStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2701:1: ( rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1 )
            // InternalUseCaseDslParser.g:2702:2: rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1
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
    // InternalUseCaseDslParser.g:2709:1: rule__DeadEndStep__Group__0__Impl : ( ( rule__DeadEndStep__NameAssignment_0 ) ) ;
    public final void rule__DeadEndStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2713:1: ( ( ( rule__DeadEndStep__NameAssignment_0 ) ) )
            // InternalUseCaseDslParser.g:2714:1: ( ( rule__DeadEndStep__NameAssignment_0 ) )
            {
            // InternalUseCaseDslParser.g:2714:1: ( ( rule__DeadEndStep__NameAssignment_0 ) )
            // InternalUseCaseDslParser.g:2715:2: ( rule__DeadEndStep__NameAssignment_0 )
            {
             before(grammarAccess.getDeadEndStepAccess().getNameAssignment_0()); 
            // InternalUseCaseDslParser.g:2716:2: ( rule__DeadEndStep__NameAssignment_0 )
            // InternalUseCaseDslParser.g:2716:3: rule__DeadEndStep__NameAssignment_0
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
    // InternalUseCaseDslParser.g:2724:1: rule__DeadEndStep__Group__1 : rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2 ;
    public final void rule__DeadEndStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2728:1: ( rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2 )
            // InternalUseCaseDslParser.g:2729:2: rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2
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
    // InternalUseCaseDslParser.g:2736:1: rule__DeadEndStep__Group__1__Impl : ( FullStop ) ;
    public final void rule__DeadEndStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2740:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2741:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2741:1: ( FullStop )
            // InternalUseCaseDslParser.g:2742:2: FullStop
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
    // InternalUseCaseDslParser.g:2751:1: rule__DeadEndStep__Group__2 : rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3 ;
    public final void rule__DeadEndStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2755:1: ( rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3 )
            // InternalUseCaseDslParser.g:2756:2: rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3
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
    // InternalUseCaseDslParser.g:2763:1: rule__DeadEndStep__Group__2__Impl : ( ( rule__DeadEndStep__Alternatives_2 )? ) ;
    public final void rule__DeadEndStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2767:1: ( ( ( rule__DeadEndStep__Alternatives_2 )? ) )
            // InternalUseCaseDslParser.g:2768:1: ( ( rule__DeadEndStep__Alternatives_2 )? )
            {
            // InternalUseCaseDslParser.g:2768:1: ( ( rule__DeadEndStep__Alternatives_2 )? )
            // InternalUseCaseDslParser.g:2769:2: ( rule__DeadEndStep__Alternatives_2 )?
            {
             before(grammarAccess.getDeadEndStepAccess().getAlternatives_2()); 
            // InternalUseCaseDslParser.g:2770:2: ( rule__DeadEndStep__Alternatives_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=SYSTEM && LA25_0<=WHILE)||LA25_0==USER) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUseCaseDslParser.g:2770:3: rule__DeadEndStep__Alternatives_2
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
    // InternalUseCaseDslParser.g:2778:1: rule__DeadEndStep__Group__3 : rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4 ;
    public final void rule__DeadEndStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2782:1: ( rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4 )
            // InternalUseCaseDslParser.g:2783:2: rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4
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
    // InternalUseCaseDslParser.g:2790:1: rule__DeadEndStep__Group__3__Impl : ( ( rule__DeadEndStep__SentenceAssignment_3 )? ) ;
    public final void rule__DeadEndStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2794:1: ( ( ( rule__DeadEndStep__SentenceAssignment_3 )? ) )
            // InternalUseCaseDslParser.g:2795:1: ( ( rule__DeadEndStep__SentenceAssignment_3 )? )
            {
            // InternalUseCaseDslParser.g:2795:1: ( ( rule__DeadEndStep__SentenceAssignment_3 )? )
            // InternalUseCaseDslParser.g:2796:2: ( rule__DeadEndStep__SentenceAssignment_3 )?
            {
             before(grammarAccess.getDeadEndStepAccess().getSentenceAssignment_3()); 
            // InternalUseCaseDslParser.g:2797:2: ( rule__DeadEndStep__SentenceAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=QuotationMark && LA26_0<=RULE_CHAR)||LA26_0==RULE_ID||LA26_0==RULE_ANY_OTHER) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUseCaseDslParser.g:2797:3: rule__DeadEndStep__SentenceAssignment_3
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
    // InternalUseCaseDslParser.g:2805:1: rule__DeadEndStep__Group__4 : rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5 ;
    public final void rule__DeadEndStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2809:1: ( rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5 )
            // InternalUseCaseDslParser.g:2810:2: rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5
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
    // InternalUseCaseDslParser.g:2817:1: rule__DeadEndStep__Group__4__Impl : ( UC ) ;
    public final void rule__DeadEndStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2821:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:2822:1: ( UC )
            {
            // InternalUseCaseDslParser.g:2822:1: ( UC )
            // InternalUseCaseDslParser.g:2823:2: UC
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
    // InternalUseCaseDslParser.g:2832:1: rule__DeadEndStep__Group__5 : rule__DeadEndStep__Group__5__Impl ;
    public final void rule__DeadEndStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2836:1: ( rule__DeadEndStep__Group__5__Impl )
            // InternalUseCaseDslParser.g:2837:2: rule__DeadEndStep__Group__5__Impl
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
    // InternalUseCaseDslParser.g:2843:1: rule__DeadEndStep__Group__5__Impl : ( END ) ;
    public final void rule__DeadEndStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2847:1: ( ( END ) )
            // InternalUseCaseDslParser.g:2848:1: ( END )
            {
            // InternalUseCaseDslParser.g:2848:1: ( END )
            // InternalUseCaseDslParser.g:2849:2: END
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
    // InternalUseCaseDslParser.g:2859:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2863:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalUseCaseDslParser.g:2864:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
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
    // InternalUseCaseDslParser.g:2871:1: rule__Precondition__Group__0__Impl : ( PRECONDITION ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2875:1: ( ( PRECONDITION ) )
            // InternalUseCaseDslParser.g:2876:1: ( PRECONDITION )
            {
            // InternalUseCaseDslParser.g:2876:1: ( PRECONDITION )
            // InternalUseCaseDslParser.g:2877:2: PRECONDITION
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
    // InternalUseCaseDslParser.g:2886:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl rule__Precondition__Group__2 ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2890:1: ( rule__Precondition__Group__1__Impl rule__Precondition__Group__2 )
            // InternalUseCaseDslParser.g:2891:2: rule__Precondition__Group__1__Impl rule__Precondition__Group__2
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
    // InternalUseCaseDslParser.g:2898:1: rule__Precondition__Group__1__Impl : ( Colon ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2902:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:2903:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:2903:1: ( Colon )
            // InternalUseCaseDslParser.g:2904:2: Colon
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
    // InternalUseCaseDslParser.g:2913:1: rule__Precondition__Group__2 : rule__Precondition__Group__2__Impl ;
    public final void rule__Precondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2917:1: ( rule__Precondition__Group__2__Impl )
            // InternalUseCaseDslParser.g:2918:2: rule__Precondition__Group__2__Impl
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
    // InternalUseCaseDslParser.g:2924:1: rule__Precondition__Group__2__Impl : ( ( rule__Precondition__ConditionAssignment_2 ) ) ;
    public final void rule__Precondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2928:1: ( ( ( rule__Precondition__ConditionAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:2929:1: ( ( rule__Precondition__ConditionAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:2929:1: ( ( rule__Precondition__ConditionAssignment_2 ) )
            // InternalUseCaseDslParser.g:2930:2: ( rule__Precondition__ConditionAssignment_2 )
            {
             before(grammarAccess.getPreconditionAccess().getConditionAssignment_2()); 
            // InternalUseCaseDslParser.g:2931:2: ( rule__Precondition__ConditionAssignment_2 )
            // InternalUseCaseDslParser.g:2931:3: rule__Precondition__ConditionAssignment_2
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
    // InternalUseCaseDslParser.g:2940:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2944:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalUseCaseDslParser.g:2945:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
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
    // InternalUseCaseDslParser.g:2952:1: rule__Postcondition__Group__0__Impl : ( POSTCONDITION ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2956:1: ( ( POSTCONDITION ) )
            // InternalUseCaseDslParser.g:2957:1: ( POSTCONDITION )
            {
            // InternalUseCaseDslParser.g:2957:1: ( POSTCONDITION )
            // InternalUseCaseDslParser.g:2958:2: POSTCONDITION
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
    // InternalUseCaseDslParser.g:2967:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2971:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalUseCaseDslParser.g:2972:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
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
    // InternalUseCaseDslParser.g:2979:1: rule__Postcondition__Group__1__Impl : ( Colon ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2983:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:2984:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:2984:1: ( Colon )
            // InternalUseCaseDslParser.g:2985:2: Colon
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
    // InternalUseCaseDslParser.g:2994:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2998:1: ( rule__Postcondition__Group__2__Impl )
            // InternalUseCaseDslParser.g:2999:2: rule__Postcondition__Group__2__Impl
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
    // InternalUseCaseDslParser.g:3005:1: rule__Postcondition__Group__2__Impl : ( ( rule__Postcondition__ConditionAssignment_2 ) ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3009:1: ( ( ( rule__Postcondition__ConditionAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:3010:1: ( ( rule__Postcondition__ConditionAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:3010:1: ( ( rule__Postcondition__ConditionAssignment_2 ) )
            // InternalUseCaseDslParser.g:3011:2: ( rule__Postcondition__ConditionAssignment_2 )
            {
             before(grammarAccess.getPostconditionAccess().getConditionAssignment_2()); 
            // InternalUseCaseDslParser.g:3012:2: ( rule__Postcondition__ConditionAssignment_2 )
            // InternalUseCaseDslParser.g:3012:3: rule__Postcondition__ConditionAssignment_2
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
    // InternalUseCaseDslParser.g:3021:1: rule__QualifiedStepName__Group__0 : rule__QualifiedStepName__Group__0__Impl rule__QualifiedStepName__Group__1 ;
    public final void rule__QualifiedStepName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3025:1: ( rule__QualifiedStepName__Group__0__Impl rule__QualifiedStepName__Group__1 )
            // InternalUseCaseDslParser.g:3026:2: rule__QualifiedStepName__Group__0__Impl rule__QualifiedStepName__Group__1
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
    // InternalUseCaseDslParser.g:3033:1: rule__QualifiedStepName__Group__0__Impl : ( ruleStepName ) ;
    public final void rule__QualifiedStepName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3037:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3038:1: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3038:1: ( ruleStepName )
            // InternalUseCaseDslParser.g:3039:2: ruleStepName
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
    // InternalUseCaseDslParser.g:3048:1: rule__QualifiedStepName__Group__1 : rule__QualifiedStepName__Group__1__Impl ;
    public final void rule__QualifiedStepName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3052:1: ( rule__QualifiedStepName__Group__1__Impl )
            // InternalUseCaseDslParser.g:3053:2: rule__QualifiedStepName__Group__1__Impl
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
    // InternalUseCaseDslParser.g:3059:1: rule__QualifiedStepName__Group__1__Impl : ( ( rule__QualifiedStepName__Group_1__0 )* ) ;
    public final void rule__QualifiedStepName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3063:1: ( ( ( rule__QualifiedStepName__Group_1__0 )* ) )
            // InternalUseCaseDslParser.g:3064:1: ( ( rule__QualifiedStepName__Group_1__0 )* )
            {
            // InternalUseCaseDslParser.g:3064:1: ( ( rule__QualifiedStepName__Group_1__0 )* )
            // InternalUseCaseDslParser.g:3065:2: ( rule__QualifiedStepName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedStepNameAccess().getGroup_1()); 
            // InternalUseCaseDslParser.g:3066:2: ( rule__QualifiedStepName__Group_1__0 )*
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
            	    // InternalUseCaseDslParser.g:3066:3: rule__QualifiedStepName__Group_1__0
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
    // InternalUseCaseDslParser.g:3075:1: rule__QualifiedStepName__Group_1__0 : rule__QualifiedStepName__Group_1__0__Impl rule__QualifiedStepName__Group_1__1 ;
    public final void rule__QualifiedStepName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3079:1: ( rule__QualifiedStepName__Group_1__0__Impl rule__QualifiedStepName__Group_1__1 )
            // InternalUseCaseDslParser.g:3080:2: rule__QualifiedStepName__Group_1__0__Impl rule__QualifiedStepName__Group_1__1
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
    // InternalUseCaseDslParser.g:3087:1: rule__QualifiedStepName__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__QualifiedStepName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3091:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:3092:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:3092:1: ( FullStop )
            // InternalUseCaseDslParser.g:3093:2: FullStop
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
    // InternalUseCaseDslParser.g:3102:1: rule__QualifiedStepName__Group_1__1 : rule__QualifiedStepName__Group_1__1__Impl ;
    public final void rule__QualifiedStepName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3106:1: ( rule__QualifiedStepName__Group_1__1__Impl )
            // InternalUseCaseDslParser.g:3107:2: rule__QualifiedStepName__Group_1__1__Impl
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
    // InternalUseCaseDslParser.g:3113:1: rule__QualifiedStepName__Group_1__1__Impl : ( ruleStepName ) ;
    public final void rule__QualifiedStepName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3117:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3118:1: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3118:1: ( ruleStepName )
            // InternalUseCaseDslParser.g:3119:2: ruleStepName
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
    // InternalUseCaseDslParser.g:3129:1: rule__QualifiedExtensionStepName__Group__0 : rule__QualifiedExtensionStepName__Group__0__Impl rule__QualifiedExtensionStepName__Group__1 ;
    public final void rule__QualifiedExtensionStepName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3133:1: ( rule__QualifiedExtensionStepName__Group__0__Impl rule__QualifiedExtensionStepName__Group__1 )
            // InternalUseCaseDslParser.g:3134:2: rule__QualifiedExtensionStepName__Group__0__Impl rule__QualifiedExtensionStepName__Group__1
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
    // InternalUseCaseDslParser.g:3141:1: rule__QualifiedExtensionStepName__Group__0__Impl : ( RULE_CHAR ) ;
    public final void rule__QualifiedExtensionStepName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3145:1: ( ( RULE_CHAR ) )
            // InternalUseCaseDslParser.g:3146:1: ( RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:3146:1: ( RULE_CHAR )
            // InternalUseCaseDslParser.g:3147:2: RULE_CHAR
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
    // InternalUseCaseDslParser.g:3156:1: rule__QualifiedExtensionStepName__Group__1 : rule__QualifiedExtensionStepName__Group__1__Impl rule__QualifiedExtensionStepName__Group__2 ;
    public final void rule__QualifiedExtensionStepName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3160:1: ( rule__QualifiedExtensionStepName__Group__1__Impl rule__QualifiedExtensionStepName__Group__2 )
            // InternalUseCaseDslParser.g:3161:2: rule__QualifiedExtensionStepName__Group__1__Impl rule__QualifiedExtensionStepName__Group__2
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
    // InternalUseCaseDslParser.g:3168:1: rule__QualifiedExtensionStepName__Group__1__Impl : ( FullStop ) ;
    public final void rule__QualifiedExtensionStepName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3172:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:3173:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:3173:1: ( FullStop )
            // InternalUseCaseDslParser.g:3174:2: FullStop
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
    // InternalUseCaseDslParser.g:3183:1: rule__QualifiedExtensionStepName__Group__2 : rule__QualifiedExtensionStepName__Group__2__Impl ;
    public final void rule__QualifiedExtensionStepName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3187:1: ( rule__QualifiedExtensionStepName__Group__2__Impl )
            // InternalUseCaseDslParser.g:3188:2: rule__QualifiedExtensionStepName__Group__2__Impl
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
    // InternalUseCaseDslParser.g:3194:1: rule__QualifiedExtensionStepName__Group__2__Impl : ( ruleQualifiedStepName ) ;
    public final void rule__QualifiedExtensionStepName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3198:1: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3199:1: ( ruleQualifiedStepName )
            {
            // InternalUseCaseDslParser.g:3199:1: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3200:2: ruleQualifiedStepName
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
    // InternalUseCaseDslParser.g:3210:1: rule__UseCaseDocument__UsecaseAssignment : ( ruleUseCase ) ;
    public final void rule__UseCaseDocument__UsecaseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3214:1: ( ( ruleUseCase ) )
            // InternalUseCaseDslParser.g:3215:2: ( ruleUseCase )
            {
            // InternalUseCaseDslParser.g:3215:2: ( ruleUseCase )
            // InternalUseCaseDslParser.g:3216:3: ruleUseCase
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
    // InternalUseCaseDslParser.g:3225:1: rule__UseCase__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__UseCase__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3229:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:3230:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:3230:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:3231:3: RULE_INT
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
    // InternalUseCaseDslParser.g:3240:1: rule__UseCase__NameAssignment_3 : ( ruleLongName ) ;
    public final void rule__UseCase__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3244:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3245:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3245:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3246:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3255:1: rule__UseCase__PreconditionAssignment_4 : ( rulePrecondition ) ;
    public final void rule__UseCase__PreconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3259:1: ( ( rulePrecondition ) )
            // InternalUseCaseDslParser.g:3260:2: ( rulePrecondition )
            {
            // InternalUseCaseDslParser.g:3260:2: ( rulePrecondition )
            // InternalUseCaseDslParser.g:3261:3: rulePrecondition
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
    // InternalUseCaseDslParser.g:3270:1: rule__UseCase__PostconditionAssignment_5 : ( rulePostcondition ) ;
    public final void rule__UseCase__PostconditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3274:1: ( ( rulePostcondition ) )
            // InternalUseCaseDslParser.g:3275:2: ( rulePostcondition )
            {
            // InternalUseCaseDslParser.g:3275:2: ( rulePostcondition )
            // InternalUseCaseDslParser.g:3276:3: rulePostcondition
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
    // InternalUseCaseDslParser.g:3285:1: rule__UseCase__StepsAssignment_10 : ( ruleUseCaseStep ) ;
    public final void rule__UseCase__StepsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3289:1: ( ( ruleUseCaseStep ) )
            // InternalUseCaseDslParser.g:3290:2: ( ruleUseCaseStep )
            {
            // InternalUseCaseDslParser.g:3290:2: ( ruleUseCaseStep )
            // InternalUseCaseDslParser.g:3291:3: ruleUseCaseStep
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
    // InternalUseCaseDslParser.g:3300:1: rule__UseCase__AlternativeflowsAssignment_12_3 : ( ruleExtension ) ;
    public final void rule__UseCase__AlternativeflowsAssignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3304:1: ( ( ruleExtension ) )
            // InternalUseCaseDslParser.g:3305:2: ( ruleExtension )
            {
            // InternalUseCaseDslParser.g:3305:2: ( ruleExtension )
            // InternalUseCaseDslParser.g:3306:3: ruleExtension
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
    // InternalUseCaseDslParser.g:3315:1: rule__Extension__StartFromAssignment_0_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__Extension__StartFromAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3319:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3320:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3320:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3321:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getExtensionAccess().getStartFromUseCaseStepCrossReference_0_0_0()); 
            // InternalUseCaseDslParser.g:3322:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3323:4: ruleQualifiedStepName
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
    // InternalUseCaseDslParser.g:3334:1: rule__Extension__StartFromAssignment_0_1 : ( ( ruleQualifiedExtensionStepName ) ) ;
    public final void rule__Extension__StartFromAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3338:1: ( ( ( ruleQualifiedExtensionStepName ) ) )
            // InternalUseCaseDslParser.g:3339:2: ( ( ruleQualifiedExtensionStepName ) )
            {
            // InternalUseCaseDslParser.g:3339:2: ( ( ruleQualifiedExtensionStepName ) )
            // InternalUseCaseDslParser.g:3340:3: ( ruleQualifiedExtensionStepName )
            {
             before(grammarAccess.getExtensionAccess().getStartFromExtensionStepCrossReference_0_1_0()); 
            // InternalUseCaseDslParser.g:3341:3: ( ruleQualifiedExtensionStepName )
            // InternalUseCaseDslParser.g:3342:4: ruleQualifiedExtensionStepName
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
    // InternalUseCaseDslParser.g:3353:1: rule__Extension__NameAssignment_2 : ( RULE_CHAR ) ;
    public final void rule__Extension__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3357:1: ( ( RULE_CHAR ) )
            // InternalUseCaseDslParser.g:3358:2: ( RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:3358:2: ( RULE_CHAR )
            // InternalUseCaseDslParser.g:3359:3: RULE_CHAR
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
    // InternalUseCaseDslParser.g:3368:1: rule__Extension__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__Extension__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3372:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3373:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3373:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3374:3: ruleCondition
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
    // InternalUseCaseDslParser.g:3383:1: rule__Extension__StepsAssignment_7 : ( ruleExtensionStep ) ;
    public final void rule__Extension__StepsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3387:1: ( ( ruleExtensionStep ) )
            // InternalUseCaseDslParser.g:3388:2: ( ruleExtensionStep )
            {
            // InternalUseCaseDslParser.g:3388:2: ( ruleExtensionStep )
            // InternalUseCaseDslParser.g:3389:3: ruleExtensionStep
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
    // InternalUseCaseDslParser.g:3398:1: rule__Extension__ResumeAtAssignment_8_0_4_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__Extension__ResumeAtAssignment_8_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3402:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3403:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3403:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3404:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getExtensionAccess().getResumeAtUseCaseStepCrossReference_8_0_4_0_0()); 
            // InternalUseCaseDslParser.g:3405:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3406:4: ruleQualifiedStepName
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
    // InternalUseCaseDslParser.g:3417:1: rule__Extension__ResumeAtAssignment_8_0_4_1 : ( ( ruleQualifiedExtensionStepName ) ) ;
    public final void rule__Extension__ResumeAtAssignment_8_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3421:1: ( ( ( ruleQualifiedExtensionStepName ) ) )
            // InternalUseCaseDslParser.g:3422:2: ( ( ruleQualifiedExtensionStepName ) )
            {
            // InternalUseCaseDslParser.g:3422:2: ( ( ruleQualifiedExtensionStepName ) )
            // InternalUseCaseDslParser.g:3423:3: ( ruleQualifiedExtensionStepName )
            {
             before(grammarAccess.getExtensionAccess().getResumeAtExtensionStepCrossReference_8_0_4_1_0()); 
            // InternalUseCaseDslParser.g:3424:3: ( ruleQualifiedExtensionStepName )
            // InternalUseCaseDslParser.g:3425:4: ruleQualifiedExtensionStepName
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
    // InternalUseCaseDslParser.g:3436:1: rule__Extension__EndAssignment_8_1 : ( ruleDeadEndStep ) ;
    public final void rule__Extension__EndAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3440:1: ( ( ruleDeadEndStep ) )
            // InternalUseCaseDslParser.g:3441:2: ( ruleDeadEndStep )
            {
            // InternalUseCaseDslParser.g:3441:2: ( ruleDeadEndStep )
            // InternalUseCaseDslParser.g:3442:3: ruleDeadEndStep
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
    // InternalUseCaseDslParser.g:3451:1: rule__UseCaseStep__ParentAssignment_0_0_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__UseCaseStep__ParentAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3455:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3456:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3456:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3457:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentStepCrossReference_0_0_0_0()); 
            // InternalUseCaseDslParser.g:3458:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3459:4: ruleQualifiedStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getParentStepQualifiedStepNameParserRuleCall_0_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getParentStepQualifiedStepNameParserRuleCall_0_0_0_0_1()); 

            }

             after(grammarAccess.getUseCaseStepAccess().getParentStepCrossReference_0_0_0_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:3470:1: rule__UseCaseStep__NameAssignment_0_1 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3474:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3475:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3475:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3476:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3485:1: rule__UseCaseStep__ReferenceAssignment_0_4 : ( ( ruleLongName ) ) ;
    public final void rule__UseCaseStep__ReferenceAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3489:1: ( ( ( ruleLongName ) ) )
            // InternalUseCaseDslParser.g:3490:2: ( ( ruleLongName ) )
            {
            // InternalUseCaseDslParser.g:3490:2: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3491:3: ( ruleLongName )
            {
             before(grammarAccess.getUseCaseStepAccess().getReferenceUseCaseCrossReference_0_4_0()); 
            // InternalUseCaseDslParser.g:3492:3: ( ruleLongName )
            // InternalUseCaseDslParser.g:3493:4: ruleLongName
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
    // InternalUseCaseDslParser.g:3504:1: rule__UseCaseStep__ParentAssignment_1_1_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__UseCaseStep__ParentAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3508:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3509:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3509:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3510:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentStepCrossReference_1_1_0_0()); 
            // InternalUseCaseDslParser.g:3511:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3512:4: ruleQualifiedStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getParentStepQualifiedStepNameParserRuleCall_1_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getParentStepQualifiedStepNameParserRuleCall_1_1_0_0_1()); 

            }

             after(grammarAccess.getUseCaseStepAccess().getParentStepCrossReference_1_1_0_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:3523:1: rule__UseCaseStep__NameAssignment_1_2 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3527:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3528:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3528:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3529:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3538:1: rule__UseCaseStep__SentenceAssignment_1_5 : ( ruleLongName ) ;
    public final void rule__UseCaseStep__SentenceAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3542:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3543:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3543:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3544:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3553:1: rule__UseCaseStep__ParentAssignment_2_1_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__UseCaseStep__ParentAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3557:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3558:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3558:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3559:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentStepCrossReference_2_1_0_0()); 
            // InternalUseCaseDslParser.g:3560:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3561:4: ruleQualifiedStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getParentStepQualifiedStepNameParserRuleCall_2_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getParentStepQualifiedStepNameParserRuleCall_2_1_0_0_1()); 

            }

             after(grammarAccess.getUseCaseStepAccess().getParentStepCrossReference_2_1_0_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:3572:1: rule__UseCaseStep__NameAssignment_2_2 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3576:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3577:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3577:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3578:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3587:1: rule__UseCaseStep__SentenceAssignment_2_5 : ( ruleLongName ) ;
    public final void rule__UseCaseStep__SentenceAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3591:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3592:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3592:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3593:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3602:1: rule__UseCaseStep__ParentAssignment_3_1_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__UseCaseStep__ParentAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3606:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3607:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3607:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3608:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentStepCrossReference_3_1_0_0()); 
            // InternalUseCaseDslParser.g:3609:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3610:4: ruleQualifiedStepName
            {
             before(grammarAccess.getUseCaseStepAccess().getParentStepQualifiedStepNameParserRuleCall_3_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedStepName();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getParentStepQualifiedStepNameParserRuleCall_3_1_0_0_1()); 

            }

             after(grammarAccess.getUseCaseStepAccess().getParentStepCrossReference_3_1_0_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:3621:1: rule__UseCaseStep__NameAssignment_3_2 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3625:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3626:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3626:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3627:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3636:1: rule__UseCaseStep__RepeatingConditionAssignment_3_5 : ( ruleCondition ) ;
    public final void rule__UseCaseStep__RepeatingConditionAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3640:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3641:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3641:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3642:3: ruleCondition
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


    // $ANTLR start "rule__UseCaseStep__RepeatflowAssignment_3_7"
    // InternalUseCaseDslParser.g:3651:1: rule__UseCaseStep__RepeatflowAssignment_3_7 : ( ruleUseCaseStep ) ;
    public final void rule__UseCaseStep__RepeatflowAssignment_3_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3655:1: ( ( ruleUseCaseStep ) )
            // InternalUseCaseDslParser.g:3656:2: ( ruleUseCaseStep )
            {
            // InternalUseCaseDslParser.g:3656:2: ( ruleUseCaseStep )
            // InternalUseCaseDslParser.g:3657:3: ruleUseCaseStep
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatflowUseCaseStepParserRuleCall_3_7_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCaseStep();

            state._fsp--;

             after(grammarAccess.getUseCaseStepAccess().getRepeatflowUseCaseStepParserRuleCall_3_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseStep__RepeatflowAssignment_3_7"


    // $ANTLR start "rule__ExtensionStep__NameAssignment_0_0"
    // InternalUseCaseDslParser.g:3666:1: rule__ExtensionStep__NameAssignment_0_0 : ( ruleStepName ) ;
    public final void rule__ExtensionStep__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3670:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3671:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3671:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3672:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3681:1: rule__ExtensionStep__SentenceAssignment_0_3 : ( ruleLongName ) ;
    public final void rule__ExtensionStep__SentenceAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3685:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3686:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3686:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3687:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3696:1: rule__DeadEndStep__NameAssignment_0 : ( ruleStepName ) ;
    public final void rule__DeadEndStep__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3700:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3701:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3701:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3702:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3711:1: rule__DeadEndStep__SentenceAssignment_3 : ( ruleLongName ) ;
    public final void rule__DeadEndStep__SentenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3715:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3716:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3716:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3717:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3726:1: rule__Precondition__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Precondition__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3730:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3731:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3731:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3732:3: ruleCondition
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
    // InternalUseCaseDslParser.g:3741:1: rule__Postcondition__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Postcondition__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3745:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3746:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3746:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3747:3: ruleCondition
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
    static final String dfa_4s = "\4\uffff\1\1\1\3\1\4\1\2";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\5\1\6\2\uffff\1\7\16\uffff\1\3",
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
    static final String dfa_7s = "\26\uffff";
    static final String dfa_8s = "\6\uffff\7\25\1\uffff\7\25\1\uffff";
    static final String dfa_9s = "\1\34\1\26\1\11\12\23\1\uffff\7\23\1\uffff";
    static final String dfa_10s = "\1\34\1\26\13\41\1\uffff\7\41\1\uffff";
    static final String dfa_11s = "\15\uffff\1\2\7\uffff\1\1";
    static final String dfa_12s = "\26\uffff}>";
    static final String[] dfa_13s = {
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
            return "516:1: rule__ExtensionStep__Alternatives : ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ruleDeadEndStep ) );";
        }
    }
    static final String dfa_14s = "\30\uffff";
    static final String dfa_15s = "\1\34\1\26\1\10\12\23\1\17\1\uffff\7\23\1\uffff\1\32";
    static final String dfa_16s = "\1\34\1\26\13\41\1\17\1\uffff\7\41\1\uffff\1\34";
    static final String dfa_17s = "\16\uffff\1\2\7\uffff\1\1\1\uffff";
    static final String dfa_18s = "\30\uffff}>";
    static final String[] dfa_19s = {
            "\1\1",
            "\1\2",
            "\1\16\1\4\1\5\2\uffff\1\3\5\uffff\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
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
            return "()* loopback of 1467:2: ( rule__Extension__StepsAssignment_7 )*";
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