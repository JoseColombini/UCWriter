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
    // InternalUseCaseDslParser.g:405:1: ruleQualifiedExtensionStepName : ( ( ( rule__QualifiedExtensionStepName__Group__0 ) ) ( ( rule__QualifiedExtensionStepName__Group__0 )* ) ) ;
    public final void ruleQualifiedExtensionStepName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:409:2: ( ( ( ( rule__QualifiedExtensionStepName__Group__0 ) ) ( ( rule__QualifiedExtensionStepName__Group__0 )* ) ) )
            // InternalUseCaseDslParser.g:410:2: ( ( ( rule__QualifiedExtensionStepName__Group__0 ) ) ( ( rule__QualifiedExtensionStepName__Group__0 )* ) )
            {
            // InternalUseCaseDslParser.g:410:2: ( ( ( rule__QualifiedExtensionStepName__Group__0 ) ) ( ( rule__QualifiedExtensionStepName__Group__0 )* ) )
            // InternalUseCaseDslParser.g:411:3: ( ( rule__QualifiedExtensionStepName__Group__0 ) ) ( ( rule__QualifiedExtensionStepName__Group__0 )* )
            {
            // InternalUseCaseDslParser.g:411:3: ( ( rule__QualifiedExtensionStepName__Group__0 ) )
            // InternalUseCaseDslParser.g:412:4: ( rule__QualifiedExtensionStepName__Group__0 )
            {
             before(grammarAccess.getQualifiedExtensionStepNameAccess().getGroup()); 
            // InternalUseCaseDslParser.g:413:4: ( rule__QualifiedExtensionStepName__Group__0 )
            // InternalUseCaseDslParser.g:413:5: rule__QualifiedExtensionStepName__Group__0
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedExtensionStepName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedExtensionStepNameAccess().getGroup()); 

            }

            // InternalUseCaseDslParser.g:416:3: ( ( rule__QualifiedExtensionStepName__Group__0 )* )
            // InternalUseCaseDslParser.g:417:4: ( rule__QualifiedExtensionStepName__Group__0 )*
            {
             before(grammarAccess.getQualifiedExtensionStepNameAccess().getGroup()); 
            // InternalUseCaseDslParser.g:418:4: ( rule__QualifiedExtensionStepName__Group__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:418:5: rule__QualifiedExtensionStepName__Group__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QualifiedExtensionStepName__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getQualifiedExtensionStepNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedExtensionStepName"


    // $ANTLR start "rule__Extension__Alternatives_0"
    // InternalUseCaseDslParser.g:427:1: rule__Extension__Alternatives_0 : ( ( ( rule__Extension__StartFromAssignment_0_0 ) ) | ( ( rule__Extension__StartFromAssignment_0_1 ) ) );
    public final void rule__Extension__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:431:1: ( ( ( rule__Extension__StartFromAssignment_0_0 ) ) | ( ( rule__Extension__StartFromAssignment_0_1 ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalUseCaseDslParser.g:432:2: ( ( rule__Extension__StartFromAssignment_0_0 ) )
                    {
                    // InternalUseCaseDslParser.g:432:2: ( ( rule__Extension__StartFromAssignment_0_0 ) )
                    // InternalUseCaseDslParser.g:433:3: ( rule__Extension__StartFromAssignment_0_0 )
                    {
                     before(grammarAccess.getExtensionAccess().getStartFromAssignment_0_0()); 
                    // InternalUseCaseDslParser.g:434:3: ( rule__Extension__StartFromAssignment_0_0 )
                    // InternalUseCaseDslParser.g:434:4: rule__Extension__StartFromAssignment_0_0
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
                    // InternalUseCaseDslParser.g:438:2: ( ( rule__Extension__StartFromAssignment_0_1 ) )
                    {
                    // InternalUseCaseDslParser.g:438:2: ( ( rule__Extension__StartFromAssignment_0_1 ) )
                    // InternalUseCaseDslParser.g:439:3: ( rule__Extension__StartFromAssignment_0_1 )
                    {
                     before(grammarAccess.getExtensionAccess().getStartFromAssignment_0_1()); 
                    // InternalUseCaseDslParser.g:440:3: ( rule__Extension__StartFromAssignment_0_1 )
                    // InternalUseCaseDslParser.g:440:4: rule__Extension__StartFromAssignment_0_1
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
    // InternalUseCaseDslParser.g:448:1: rule__Extension__Alternatives_8 : ( ( ( rule__Extension__Group_8_0__0 ) ) | ( ( rule__Extension__EndAssignment_8_1 ) ) );
    public final void rule__Extension__Alternatives_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:452:1: ( ( ( rule__Extension__Group_8_0__0 ) ) | ( ( rule__Extension__EndAssignment_8_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==FullStop) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==RETURN) ) {
                        alt6=1;
                    }
                    else if ( ((LA6_2>=SYSTEM && LA6_2<=WHILE)||LA6_2==USER||(LA6_2>=UC && LA6_2<=RULE_CHAR)||LA6_2==RULE_ID||LA6_2==RULE_ANY_OTHER) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCaseDslParser.g:453:2: ( ( rule__Extension__Group_8_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:453:2: ( ( rule__Extension__Group_8_0__0 ) )
                    // InternalUseCaseDslParser.g:454:3: ( rule__Extension__Group_8_0__0 )
                    {
                     before(grammarAccess.getExtensionAccess().getGroup_8_0()); 
                    // InternalUseCaseDslParser.g:455:3: ( rule__Extension__Group_8_0__0 )
                    // InternalUseCaseDslParser.g:455:4: rule__Extension__Group_8_0__0
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
                    // InternalUseCaseDslParser.g:459:2: ( ( rule__Extension__EndAssignment_8_1 ) )
                    {
                    // InternalUseCaseDslParser.g:459:2: ( ( rule__Extension__EndAssignment_8_1 ) )
                    // InternalUseCaseDslParser.g:460:3: ( rule__Extension__EndAssignment_8_1 )
                    {
                     before(grammarAccess.getExtensionAccess().getEndAssignment_8_1()); 
                    // InternalUseCaseDslParser.g:461:3: ( rule__Extension__EndAssignment_8_1 )
                    // InternalUseCaseDslParser.g:461:4: rule__Extension__EndAssignment_8_1
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
    // InternalUseCaseDslParser.g:469:1: rule__Extension__Alternatives_8_0_4 : ( ( ( rule__Extension__ResumeAtAssignment_8_0_4_0 ) ) | ( ( rule__Extension__ResumeAtAssignment_8_0_4_1 ) ) );
    public final void rule__Extension__Alternatives_8_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:473:1: ( ( ( rule__Extension__ResumeAtAssignment_8_0_4_0 ) ) | ( ( rule__Extension__ResumeAtAssignment_8_0_4_1 ) ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalUseCaseDslParser.g:474:2: ( ( rule__Extension__ResumeAtAssignment_8_0_4_0 ) )
                    {
                    // InternalUseCaseDslParser.g:474:2: ( ( rule__Extension__ResumeAtAssignment_8_0_4_0 ) )
                    // InternalUseCaseDslParser.g:475:3: ( rule__Extension__ResumeAtAssignment_8_0_4_0 )
                    {
                     before(grammarAccess.getExtensionAccess().getResumeAtAssignment_8_0_4_0()); 
                    // InternalUseCaseDslParser.g:476:3: ( rule__Extension__ResumeAtAssignment_8_0_4_0 )
                    // InternalUseCaseDslParser.g:476:4: rule__Extension__ResumeAtAssignment_8_0_4_0
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
                    // InternalUseCaseDslParser.g:480:2: ( ( rule__Extension__ResumeAtAssignment_8_0_4_1 ) )
                    {
                    // InternalUseCaseDslParser.g:480:2: ( ( rule__Extension__ResumeAtAssignment_8_0_4_1 ) )
                    // InternalUseCaseDslParser.g:481:3: ( rule__Extension__ResumeAtAssignment_8_0_4_1 )
                    {
                     before(grammarAccess.getExtensionAccess().getResumeAtAssignment_8_0_4_1()); 
                    // InternalUseCaseDslParser.g:482:3: ( rule__Extension__ResumeAtAssignment_8_0_4_1 )
                    // InternalUseCaseDslParser.g:482:4: rule__Extension__ResumeAtAssignment_8_0_4_1
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
    // InternalUseCaseDslParser.g:490:1: rule__UseCaseStep__Alternatives : ( ( ( rule__UseCaseStep__Group_0__0 ) ) | ( ( rule__UseCaseStep__Group_1__0 ) ) | ( ( rule__UseCaseStep__Group_2__0 ) ) | ( ( rule__UseCaseStep__Group_3__0 ) ) );
    public final void rule__UseCaseStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:494:1: ( ( ( rule__UseCaseStep__Group_0__0 ) ) | ( ( rule__UseCaseStep__Group_1__0 ) ) | ( ( rule__UseCaseStep__Group_2__0 ) ) | ( ( rule__UseCaseStep__Group_3__0 ) ) )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalUseCaseDslParser.g:495:2: ( ( rule__UseCaseStep__Group_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:495:2: ( ( rule__UseCaseStep__Group_0__0 ) )
                    // InternalUseCaseDslParser.g:496:3: ( rule__UseCaseStep__Group_0__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_0()); 
                    // InternalUseCaseDslParser.g:497:3: ( rule__UseCaseStep__Group_0__0 )
                    // InternalUseCaseDslParser.g:497:4: rule__UseCaseStep__Group_0__0
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
                    // InternalUseCaseDslParser.g:501:2: ( ( rule__UseCaseStep__Group_1__0 ) )
                    {
                    // InternalUseCaseDslParser.g:501:2: ( ( rule__UseCaseStep__Group_1__0 ) )
                    // InternalUseCaseDslParser.g:502:3: ( rule__UseCaseStep__Group_1__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_1()); 
                    // InternalUseCaseDslParser.g:503:3: ( rule__UseCaseStep__Group_1__0 )
                    // InternalUseCaseDslParser.g:503:4: rule__UseCaseStep__Group_1__0
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
                    // InternalUseCaseDslParser.g:507:2: ( ( rule__UseCaseStep__Group_2__0 ) )
                    {
                    // InternalUseCaseDslParser.g:507:2: ( ( rule__UseCaseStep__Group_2__0 ) )
                    // InternalUseCaseDslParser.g:508:3: ( rule__UseCaseStep__Group_2__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_2()); 
                    // InternalUseCaseDslParser.g:509:3: ( rule__UseCaseStep__Group_2__0 )
                    // InternalUseCaseDslParser.g:509:4: rule__UseCaseStep__Group_2__0
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
                    // InternalUseCaseDslParser.g:513:2: ( ( rule__UseCaseStep__Group_3__0 ) )
                    {
                    // InternalUseCaseDslParser.g:513:2: ( ( rule__UseCaseStep__Group_3__0 ) )
                    // InternalUseCaseDslParser.g:514:3: ( rule__UseCaseStep__Group_3__0 )
                    {
                     before(grammarAccess.getUseCaseStepAccess().getGroup_3()); 
                    // InternalUseCaseDslParser.g:515:3: ( rule__UseCaseStep__Group_3__0 )
                    // InternalUseCaseDslParser.g:515:4: rule__UseCaseStep__Group_3__0
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
    // InternalUseCaseDslParser.g:523:1: rule__ExtensionStep__Alternatives : ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ( rule__ExtensionStep__Group_1__0 ) ) | ( ruleDeadEndStep ) );
    public final void rule__ExtensionStep__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:527:1: ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ( rule__ExtensionStep__Group_1__0 ) ) | ( ruleDeadEndStep ) )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalUseCaseDslParser.g:528:2: ( ( rule__ExtensionStep__Group_0__0 ) )
                    {
                    // InternalUseCaseDslParser.g:528:2: ( ( rule__ExtensionStep__Group_0__0 ) )
                    // InternalUseCaseDslParser.g:529:3: ( rule__ExtensionStep__Group_0__0 )
                    {
                     before(grammarAccess.getExtensionStepAccess().getGroup_0()); 
                    // InternalUseCaseDslParser.g:530:3: ( rule__ExtensionStep__Group_0__0 )
                    // InternalUseCaseDslParser.g:530:4: rule__ExtensionStep__Group_0__0
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
                    // InternalUseCaseDslParser.g:534:2: ( ( rule__ExtensionStep__Group_1__0 ) )
                    {
                    // InternalUseCaseDslParser.g:534:2: ( ( rule__ExtensionStep__Group_1__0 ) )
                    // InternalUseCaseDslParser.g:535:3: ( rule__ExtensionStep__Group_1__0 )
                    {
                     before(grammarAccess.getExtensionStepAccess().getGroup_1()); 
                    // InternalUseCaseDslParser.g:536:3: ( rule__ExtensionStep__Group_1__0 )
                    // InternalUseCaseDslParser.g:536:4: rule__ExtensionStep__Group_1__0
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
                    // InternalUseCaseDslParser.g:540:2: ( ruleDeadEndStep )
                    {
                    // InternalUseCaseDslParser.g:540:2: ( ruleDeadEndStep )
                    // InternalUseCaseDslParser.g:541:3: ruleDeadEndStep
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
    // InternalUseCaseDslParser.g:550:1: rule__ExtensionStep__Alternatives_1_2 : ( ( USER ) | ( SYSTEM ) | ( WHILE ) );
    public final void rule__ExtensionStep__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:554:1: ( ( USER ) | ( SYSTEM ) | ( WHILE ) )
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
                    // InternalUseCaseDslParser.g:555:2: ( USER )
                    {
                    // InternalUseCaseDslParser.g:555:2: ( USER )
                    // InternalUseCaseDslParser.g:556:3: USER
                    {
                     before(grammarAccess.getExtensionStepAccess().getUSERKeyword_1_2_0()); 
                    match(input,USER,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getUSERKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:561:2: ( SYSTEM )
                    {
                    // InternalUseCaseDslParser.g:561:2: ( SYSTEM )
                    // InternalUseCaseDslParser.g:562:3: SYSTEM
                    {
                     before(grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_1_2_1()); 
                    match(input,SYSTEM,FOLLOW_2); 
                     after(grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_1_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:567:2: ( WHILE )
                    {
                    // InternalUseCaseDslParser.g:567:2: ( WHILE )
                    // InternalUseCaseDslParser.g:568:3: WHILE
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
    // InternalUseCaseDslParser.g:577:1: rule__DeadEndStep__Alternatives_2 : ( ( USER ) | ( SYSTEM ) | ( WHILE ) );
    public final void rule__DeadEndStep__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:581:1: ( ( USER ) | ( SYSTEM ) | ( WHILE ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case USER:
                {
                alt11=1;
                }
                break;
            case SYSTEM:
                {
                alt11=2;
                }
                break;
            case WHILE:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalUseCaseDslParser.g:582:2: ( USER )
                    {
                    // InternalUseCaseDslParser.g:582:2: ( USER )
                    // InternalUseCaseDslParser.g:583:3: USER
                    {
                     before(grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0()); 
                    match(input,USER,FOLLOW_2); 
                     after(grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:588:2: ( SYSTEM )
                    {
                    // InternalUseCaseDslParser.g:588:2: ( SYSTEM )
                    // InternalUseCaseDslParser.g:589:3: SYSTEM
                    {
                     before(grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1()); 
                    match(input,SYSTEM,FOLLOW_2); 
                     after(grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:594:2: ( WHILE )
                    {
                    // InternalUseCaseDslParser.g:594:2: ( WHILE )
                    // InternalUseCaseDslParser.g:595:3: WHILE
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
    // InternalUseCaseDslParser.g:604:1: rule__LongName__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) );
    public final void rule__LongName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:608:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) )
            int alt12=7;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalUseCaseDslParser.g:609:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:609:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:610:3: RULE_ID
                    {
                     before(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:615:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:615:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:616:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:621:2: ( RULE_CHAR )
                    {
                    // InternalUseCaseDslParser.g:621:2: ( RULE_CHAR )
                    // InternalUseCaseDslParser.g:622:3: RULE_CHAR
                    {
                     before(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2()); 
                    match(input,RULE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:627:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:627:2: ( Colon )
                    // InternalUseCaseDslParser.g:628:3: Colon
                    {
                     before(grammarAccess.getLongNameAccess().getColonKeyword_3()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:633:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:633:2: ( FullStop )
                    // InternalUseCaseDslParser.g:634:3: FullStop
                    {
                     before(grammarAccess.getLongNameAccess().getFullStopKeyword_4()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUseCaseDslParser.g:639:2: ( QuotationMark )
                    {
                    // InternalUseCaseDslParser.g:639:2: ( QuotationMark )
                    // InternalUseCaseDslParser.g:640:3: QuotationMark
                    {
                     before(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5()); 
                    match(input,QuotationMark,FOLLOW_2); 
                     after(grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUseCaseDslParser.g:645:2: ( Apostrophe )
                    {
                    // InternalUseCaseDslParser.g:645:2: ( Apostrophe )
                    // InternalUseCaseDslParser.g:646:3: Apostrophe
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
    // InternalUseCaseDslParser.g:655:1: rule__Condition__Alternatives : ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) | ( AND ) | ( OR ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:659:1: ( ( RULE_ID ) | ( RULE_ANY_OTHER ) | ( RULE_CHAR ) | ( Colon ) | ( FullStop ) | ( QuotationMark ) | ( Apostrophe ) | ( AND ) | ( OR ) )
            int alt13=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt13=2;
                }
                break;
            case RULE_CHAR:
                {
                alt13=3;
                }
                break;
            case Colon:
                {
                alt13=4;
                }
                break;
            case FullStop:
                {
                alt13=5;
                }
                break;
            case QuotationMark:
                {
                alt13=6;
                }
                break;
            case Apostrophe:
                {
                alt13=7;
                }
                break;
            case AND:
                {
                alt13=8;
                }
                break;
            case OR:
                {
                alt13=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalUseCaseDslParser.g:660:2: ( RULE_ID )
                    {
                    // InternalUseCaseDslParser.g:660:2: ( RULE_ID )
                    // InternalUseCaseDslParser.g:661:3: RULE_ID
                    {
                     before(grammarAccess.getConditionAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:666:2: ( RULE_ANY_OTHER )
                    {
                    // InternalUseCaseDslParser.g:666:2: ( RULE_ANY_OTHER )
                    // InternalUseCaseDslParser.g:667:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:672:2: ( RULE_CHAR )
                    {
                    // InternalUseCaseDslParser.g:672:2: ( RULE_CHAR )
                    // InternalUseCaseDslParser.g:673:3: RULE_CHAR
                    {
                     before(grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2()); 
                    match(input,RULE_CHAR,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:678:2: ( Colon )
                    {
                    // InternalUseCaseDslParser.g:678:2: ( Colon )
                    // InternalUseCaseDslParser.g:679:3: Colon
                    {
                     before(grammarAccess.getConditionAccess().getColonKeyword_3()); 
                    match(input,Colon,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getColonKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:684:2: ( FullStop )
                    {
                    // InternalUseCaseDslParser.g:684:2: ( FullStop )
                    // InternalUseCaseDslParser.g:685:3: FullStop
                    {
                     before(grammarAccess.getConditionAccess().getFullStopKeyword_4()); 
                    match(input,FullStop,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getFullStopKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUseCaseDslParser.g:690:2: ( QuotationMark )
                    {
                    // InternalUseCaseDslParser.g:690:2: ( QuotationMark )
                    // InternalUseCaseDslParser.g:691:3: QuotationMark
                    {
                     before(grammarAccess.getConditionAccess().getQuotationMarkKeyword_5()); 
                    match(input,QuotationMark,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getQuotationMarkKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUseCaseDslParser.g:696:2: ( Apostrophe )
                    {
                    // InternalUseCaseDslParser.g:696:2: ( Apostrophe )
                    // InternalUseCaseDslParser.g:697:3: Apostrophe
                    {
                     before(grammarAccess.getConditionAccess().getApostropheKeyword_6()); 
                    match(input,Apostrophe,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getApostropheKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUseCaseDslParser.g:702:2: ( AND )
                    {
                    // InternalUseCaseDslParser.g:702:2: ( AND )
                    // InternalUseCaseDslParser.g:703:3: AND
                    {
                     before(grammarAccess.getConditionAccess().getANDKeyword_7()); 
                    match(input,AND,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getANDKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUseCaseDslParser.g:708:2: ( OR )
                    {
                    // InternalUseCaseDslParser.g:708:2: ( OR )
                    // InternalUseCaseDslParser.g:709:3: OR
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
    // InternalUseCaseDslParser.g:718:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:722:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUseCaseDslParser.g:723:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:730:1: rule__UseCase__Group__0__Impl : ( UC ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:734:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:735:1: ( UC )
            {
            // InternalUseCaseDslParser.g:735:1: ( UC )
            // InternalUseCaseDslParser.g:736:2: UC
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
    // InternalUseCaseDslParser.g:745:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:749:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUseCaseDslParser.g:750:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCaseDslParser.g:757:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NumberAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:761:1: ( ( ( rule__UseCase__NumberAssignment_1 ) ) )
            // InternalUseCaseDslParser.g:762:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            {
            // InternalUseCaseDslParser.g:762:1: ( ( rule__UseCase__NumberAssignment_1 ) )
            // InternalUseCaseDslParser.g:763:2: ( rule__UseCase__NumberAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNumberAssignment_1()); 
            // InternalUseCaseDslParser.g:764:2: ( rule__UseCase__NumberAssignment_1 )
            // InternalUseCaseDslParser.g:764:3: rule__UseCase__NumberAssignment_1
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
    // InternalUseCaseDslParser.g:772:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:776:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUseCaseDslParser.g:777:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCaseDslParser.g:784:1: rule__UseCase__Group__2__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:788:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:789:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:789:1: ( Colon )
            // InternalUseCaseDslParser.g:790:2: Colon
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
    // InternalUseCaseDslParser.g:799:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:803:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUseCaseDslParser.g:804:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalUseCaseDslParser.g:811:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__NameAssignment_3 ) ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:815:1: ( ( ( rule__UseCase__NameAssignment_3 ) ) )
            // InternalUseCaseDslParser.g:816:1: ( ( rule__UseCase__NameAssignment_3 ) )
            {
            // InternalUseCaseDslParser.g:816:1: ( ( rule__UseCase__NameAssignment_3 ) )
            // InternalUseCaseDslParser.g:817:2: ( rule__UseCase__NameAssignment_3 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_3()); 
            // InternalUseCaseDslParser.g:818:2: ( rule__UseCase__NameAssignment_3 )
            // InternalUseCaseDslParser.g:818:3: rule__UseCase__NameAssignment_3
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
    // InternalUseCaseDslParser.g:826:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:830:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUseCaseDslParser.g:831:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalUseCaseDslParser.g:838:1: rule__UseCase__Group__4__Impl : ( ( rule__UseCase__PreconditionAssignment_4 )? ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:842:1: ( ( ( rule__UseCase__PreconditionAssignment_4 )? ) )
            // InternalUseCaseDslParser.g:843:1: ( ( rule__UseCase__PreconditionAssignment_4 )? )
            {
            // InternalUseCaseDslParser.g:843:1: ( ( rule__UseCase__PreconditionAssignment_4 )? )
            // InternalUseCaseDslParser.g:844:2: ( rule__UseCase__PreconditionAssignment_4 )?
            {
             before(grammarAccess.getUseCaseAccess().getPreconditionAssignment_4()); 
            // InternalUseCaseDslParser.g:845:2: ( rule__UseCase__PreconditionAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==PRECONDITION) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCaseDslParser.g:845:3: rule__UseCase__PreconditionAssignment_4
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
    // InternalUseCaseDslParser.g:853:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:857:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUseCaseDslParser.g:858:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
            {
            pushFollow(FOLLOW_10);
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
    // InternalUseCaseDslParser.g:865:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__PostconditionAssignment_5 )? ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:869:1: ( ( ( rule__UseCase__PostconditionAssignment_5 )? ) )
            // InternalUseCaseDslParser.g:870:1: ( ( rule__UseCase__PostconditionAssignment_5 )? )
            {
            // InternalUseCaseDslParser.g:870:1: ( ( rule__UseCase__PostconditionAssignment_5 )? )
            // InternalUseCaseDslParser.g:871:2: ( rule__UseCase__PostconditionAssignment_5 )?
            {
             before(grammarAccess.getUseCaseAccess().getPostconditionAssignment_5()); 
            // InternalUseCaseDslParser.g:872:2: ( rule__UseCase__PostconditionAssignment_5 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==POSTCONDITION) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUseCaseDslParser.g:872:3: rule__UseCase__PostconditionAssignment_5
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
    // InternalUseCaseDslParser.g:880:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl rule__UseCase__Group__7 ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:884:1: ( rule__UseCase__Group__6__Impl rule__UseCase__Group__7 )
            // InternalUseCaseDslParser.g:885:2: rule__UseCase__Group__6__Impl rule__UseCase__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCaseDslParser.g:892:1: rule__UseCase__Group__6__Impl : ( MAIN ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:896:1: ( ( MAIN ) )
            // InternalUseCaseDslParser.g:897:1: ( MAIN )
            {
            // InternalUseCaseDslParser.g:897:1: ( MAIN )
            // InternalUseCaseDslParser.g:898:2: MAIN
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
    // InternalUseCaseDslParser.g:907:1: rule__UseCase__Group__7 : rule__UseCase__Group__7__Impl rule__UseCase__Group__8 ;
    public final void rule__UseCase__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:911:1: ( rule__UseCase__Group__7__Impl rule__UseCase__Group__8 )
            // InternalUseCaseDslParser.g:912:2: rule__UseCase__Group__7__Impl rule__UseCase__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCaseDslParser.g:919:1: rule__UseCase__Group__7__Impl : ( FLOW ) ;
    public final void rule__UseCase__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:923:1: ( ( FLOW ) )
            // InternalUseCaseDslParser.g:924:1: ( FLOW )
            {
            // InternalUseCaseDslParser.g:924:1: ( FLOW )
            // InternalUseCaseDslParser.g:925:2: FLOW
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
    // InternalUseCaseDslParser.g:934:1: rule__UseCase__Group__8 : rule__UseCase__Group__8__Impl rule__UseCase__Group__9 ;
    public final void rule__UseCase__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:938:1: ( rule__UseCase__Group__8__Impl rule__UseCase__Group__9 )
            // InternalUseCaseDslParser.g:939:2: rule__UseCase__Group__8__Impl rule__UseCase__Group__9
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
    // InternalUseCaseDslParser.g:946:1: rule__UseCase__Group__8__Impl : ( Colon ) ;
    public final void rule__UseCase__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:950:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:951:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:951:1: ( Colon )
            // InternalUseCaseDslParser.g:952:2: Colon
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
    // InternalUseCaseDslParser.g:961:1: rule__UseCase__Group__9 : rule__UseCase__Group__9__Impl rule__UseCase__Group__10 ;
    public final void rule__UseCase__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:965:1: ( rule__UseCase__Group__9__Impl rule__UseCase__Group__10 )
            // InternalUseCaseDslParser.g:966:2: rule__UseCase__Group__9__Impl rule__UseCase__Group__10
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:973:1: rule__UseCase__Group__9__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCase__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:977:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:978:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:978:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:979:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:988:1: rule__UseCase__Group__10 : rule__UseCase__Group__10__Impl rule__UseCase__Group__11 ;
    public final void rule__UseCase__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:992:1: ( rule__UseCase__Group__10__Impl rule__UseCase__Group__11 )
            // InternalUseCaseDslParser.g:993:2: rule__UseCase__Group__10__Impl rule__UseCase__Group__11
            {
            pushFollow(FOLLOW_13);
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
    // InternalUseCaseDslParser.g:1000:1: rule__UseCase__Group__10__Impl : ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) ) ;
    public final void rule__UseCase__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1004:1: ( ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) ) )
            // InternalUseCaseDslParser.g:1005:1: ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) )
            {
            // InternalUseCaseDslParser.g:1005:1: ( ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* ) )
            // InternalUseCaseDslParser.g:1006:2: ( ( rule__UseCase__StepsAssignment_10 ) ) ( ( rule__UseCase__StepsAssignment_10 )* )
            {
            // InternalUseCaseDslParser.g:1006:2: ( ( rule__UseCase__StepsAssignment_10 ) )
            // InternalUseCaseDslParser.g:1007:3: ( rule__UseCase__StepsAssignment_10 )
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 
            // InternalUseCaseDslParser.g:1008:3: ( rule__UseCase__StepsAssignment_10 )
            // InternalUseCaseDslParser.g:1008:4: rule__UseCase__StepsAssignment_10
            {
            pushFollow(FOLLOW_6);
            rule__UseCase__StepsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 

            }

            // InternalUseCaseDslParser.g:1011:2: ( ( rule__UseCase__StepsAssignment_10 )* )
            // InternalUseCaseDslParser.g:1012:3: ( rule__UseCase__StepsAssignment_10 )*
            {
             before(grammarAccess.getUseCaseAccess().getStepsAssignment_10()); 
            // InternalUseCaseDslParser.g:1013:3: ( rule__UseCase__StepsAssignment_10 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1013:4: rule__UseCase__StepsAssignment_10
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__UseCase__StepsAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalUseCaseDslParser.g:1022:1: rule__UseCase__Group__11 : rule__UseCase__Group__11__Impl rule__UseCase__Group__12 ;
    public final void rule__UseCase__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1026:1: ( rule__UseCase__Group__11__Impl rule__UseCase__Group__12 )
            // InternalUseCaseDslParser.g:1027:2: rule__UseCase__Group__11__Impl rule__UseCase__Group__12
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
    // InternalUseCaseDslParser.g:1034:1: rule__UseCase__Group__11__Impl : ( RULE_END ) ;
    public final void rule__UseCase__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1038:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1039:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1039:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1040:2: RULE_END
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
    // InternalUseCaseDslParser.g:1049:1: rule__UseCase__Group__12 : rule__UseCase__Group__12__Impl ;
    public final void rule__UseCase__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1053:1: ( rule__UseCase__Group__12__Impl )
            // InternalUseCaseDslParser.g:1054:2: rule__UseCase__Group__12__Impl
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
    // InternalUseCaseDslParser.g:1060:1: rule__UseCase__Group__12__Impl : ( ( rule__UseCase__Group_12__0 )? ) ;
    public final void rule__UseCase__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1064:1: ( ( ( rule__UseCase__Group_12__0 )? ) )
            // InternalUseCaseDslParser.g:1065:1: ( ( rule__UseCase__Group_12__0 )? )
            {
            // InternalUseCaseDslParser.g:1065:1: ( ( rule__UseCase__Group_12__0 )? )
            // InternalUseCaseDslParser.g:1066:2: ( rule__UseCase__Group_12__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_12()); 
            // InternalUseCaseDslParser.g:1067:2: ( rule__UseCase__Group_12__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ALTERNATIVE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUseCaseDslParser.g:1067:3: rule__UseCase__Group_12__0
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
    // InternalUseCaseDslParser.g:1076:1: rule__UseCase__Group_12__0 : rule__UseCase__Group_12__0__Impl rule__UseCase__Group_12__1 ;
    public final void rule__UseCase__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1080:1: ( rule__UseCase__Group_12__0__Impl rule__UseCase__Group_12__1 )
            // InternalUseCaseDslParser.g:1081:2: rule__UseCase__Group_12__0__Impl rule__UseCase__Group_12__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCaseDslParser.g:1088:1: rule__UseCase__Group_12__0__Impl : ( ( rule__UseCase__Group_12_0__0 ) ) ;
    public final void rule__UseCase__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1092:1: ( ( ( rule__UseCase__Group_12_0__0 ) ) )
            // InternalUseCaseDslParser.g:1093:1: ( ( rule__UseCase__Group_12_0__0 ) )
            {
            // InternalUseCaseDslParser.g:1093:1: ( ( rule__UseCase__Group_12_0__0 ) )
            // InternalUseCaseDslParser.g:1094:2: ( rule__UseCase__Group_12_0__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup_12_0()); 
            // InternalUseCaseDslParser.g:1095:2: ( rule__UseCase__Group_12_0__0 )
            // InternalUseCaseDslParser.g:1095:3: rule__UseCase__Group_12_0__0
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
    // InternalUseCaseDslParser.g:1103:1: rule__UseCase__Group_12__1 : rule__UseCase__Group_12__1__Impl rule__UseCase__Group_12__2 ;
    public final void rule__UseCase__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1107:1: ( rule__UseCase__Group_12__1__Impl rule__UseCase__Group_12__2 )
            // InternalUseCaseDslParser.g:1108:2: rule__UseCase__Group_12__1__Impl rule__UseCase__Group_12__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalUseCaseDslParser.g:1115:1: rule__UseCase__Group_12__1__Impl : ( Colon ) ;
    public final void rule__UseCase__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1119:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:1120:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:1120:1: ( Colon )
            // InternalUseCaseDslParser.g:1121:2: Colon
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
    // InternalUseCaseDslParser.g:1130:1: rule__UseCase__Group_12__2 : rule__UseCase__Group_12__2__Impl rule__UseCase__Group_12__3 ;
    public final void rule__UseCase__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1134:1: ( rule__UseCase__Group_12__2__Impl rule__UseCase__Group_12__3 )
            // InternalUseCaseDslParser.g:1135:2: rule__UseCase__Group_12__2__Impl rule__UseCase__Group_12__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:1142:1: rule__UseCase__Group_12__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCase__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1146:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:1147:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:1147:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:1148:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:1157:1: rule__UseCase__Group_12__3 : rule__UseCase__Group_12__3__Impl rule__UseCase__Group_12__4 ;
    public final void rule__UseCase__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1161:1: ( rule__UseCase__Group_12__3__Impl rule__UseCase__Group_12__4 )
            // InternalUseCaseDslParser.g:1162:2: rule__UseCase__Group_12__3__Impl rule__UseCase__Group_12__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalUseCaseDslParser.g:1169:1: rule__UseCase__Group_12__3__Impl : ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) ) ;
    public final void rule__UseCase__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1173:1: ( ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) ) )
            // InternalUseCaseDslParser.g:1174:1: ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) )
            {
            // InternalUseCaseDslParser.g:1174:1: ( ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* ) )
            // InternalUseCaseDslParser.g:1175:2: ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) ) ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* )
            {
            // InternalUseCaseDslParser.g:1175:2: ( ( rule__UseCase__AlternativeflowsAssignment_12_3 ) )
            // InternalUseCaseDslParser.g:1176:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 
            // InternalUseCaseDslParser.g:1177:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )
            // InternalUseCaseDslParser.g:1177:4: rule__UseCase__AlternativeflowsAssignment_12_3
            {
            pushFollow(FOLLOW_6);
            rule__UseCase__AlternativeflowsAssignment_12_3();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 

            }

            // InternalUseCaseDslParser.g:1180:2: ( ( rule__UseCase__AlternativeflowsAssignment_12_3 )* )
            // InternalUseCaseDslParser.g:1181:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )*
            {
             before(grammarAccess.getUseCaseAccess().getAlternativeflowsAssignment_12_3()); 
            // InternalUseCaseDslParser.g:1182:3: ( rule__UseCase__AlternativeflowsAssignment_12_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_INT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1182:4: rule__UseCase__AlternativeflowsAssignment_12_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__UseCase__AlternativeflowsAssignment_12_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalUseCaseDslParser.g:1191:1: rule__UseCase__Group_12__4 : rule__UseCase__Group_12__4__Impl ;
    public final void rule__UseCase__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1195:1: ( rule__UseCase__Group_12__4__Impl )
            // InternalUseCaseDslParser.g:1196:2: rule__UseCase__Group_12__4__Impl
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
    // InternalUseCaseDslParser.g:1202:1: rule__UseCase__Group_12__4__Impl : ( RULE_END ) ;
    public final void rule__UseCase__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1206:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1207:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1207:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1208:2: RULE_END
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
    // InternalUseCaseDslParser.g:1218:1: rule__UseCase__Group_12_0__0 : rule__UseCase__Group_12_0__0__Impl rule__UseCase__Group_12_0__1 ;
    public final void rule__UseCase__Group_12_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1222:1: ( rule__UseCase__Group_12_0__0__Impl rule__UseCase__Group_12_0__1 )
            // InternalUseCaseDslParser.g:1223:2: rule__UseCase__Group_12_0__0__Impl rule__UseCase__Group_12_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUseCaseDslParser.g:1230:1: rule__UseCase__Group_12_0__0__Impl : ( ALTERNATIVE ) ;
    public final void rule__UseCase__Group_12_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1234:1: ( ( ALTERNATIVE ) )
            // InternalUseCaseDslParser.g:1235:1: ( ALTERNATIVE )
            {
            // InternalUseCaseDslParser.g:1235:1: ( ALTERNATIVE )
            // InternalUseCaseDslParser.g:1236:2: ALTERNATIVE
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
    // InternalUseCaseDslParser.g:1245:1: rule__UseCase__Group_12_0__1 : rule__UseCase__Group_12_0__1__Impl ;
    public final void rule__UseCase__Group_12_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1249:1: ( rule__UseCase__Group_12_0__1__Impl )
            // InternalUseCaseDslParser.g:1250:2: rule__UseCase__Group_12_0__1__Impl
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
    // InternalUseCaseDslParser.g:1256:1: rule__UseCase__Group_12_0__1__Impl : ( FLOW ) ;
    public final void rule__UseCase__Group_12_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1260:1: ( ( FLOW ) )
            // InternalUseCaseDslParser.g:1261:1: ( FLOW )
            {
            // InternalUseCaseDslParser.g:1261:1: ( FLOW )
            // InternalUseCaseDslParser.g:1262:2: FLOW
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
    // InternalUseCaseDslParser.g:1272:1: rule__Extension__Group__0 : rule__Extension__Group__0__Impl rule__Extension__Group__1 ;
    public final void rule__Extension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1276:1: ( rule__Extension__Group__0__Impl rule__Extension__Group__1 )
            // InternalUseCaseDslParser.g:1277:2: rule__Extension__Group__0__Impl rule__Extension__Group__1
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
    // InternalUseCaseDslParser.g:1284:1: rule__Extension__Group__0__Impl : ( ( rule__Extension__Alternatives_0 ) ) ;
    public final void rule__Extension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1288:1: ( ( ( rule__Extension__Alternatives_0 ) ) )
            // InternalUseCaseDslParser.g:1289:1: ( ( rule__Extension__Alternatives_0 ) )
            {
            // InternalUseCaseDslParser.g:1289:1: ( ( rule__Extension__Alternatives_0 ) )
            // InternalUseCaseDslParser.g:1290:2: ( rule__Extension__Alternatives_0 )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives_0()); 
            // InternalUseCaseDslParser.g:1291:2: ( rule__Extension__Alternatives_0 )
            // InternalUseCaseDslParser.g:1291:3: rule__Extension__Alternatives_0
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
    // InternalUseCaseDslParser.g:1299:1: rule__Extension__Group__1 : rule__Extension__Group__1__Impl rule__Extension__Group__2 ;
    public final void rule__Extension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1303:1: ( rule__Extension__Group__1__Impl rule__Extension__Group__2 )
            // InternalUseCaseDslParser.g:1304:2: rule__Extension__Group__1__Impl rule__Extension__Group__2
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
    // InternalUseCaseDslParser.g:1311:1: rule__Extension__Group__1__Impl : ( FullStop ) ;
    public final void rule__Extension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1315:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1316:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1316:1: ( FullStop )
            // InternalUseCaseDslParser.g:1317:2: FullStop
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
    // InternalUseCaseDslParser.g:1326:1: rule__Extension__Group__2 : rule__Extension__Group__2__Impl rule__Extension__Group__3 ;
    public final void rule__Extension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1330:1: ( rule__Extension__Group__2__Impl rule__Extension__Group__3 )
            // InternalUseCaseDslParser.g:1331:2: rule__Extension__Group__2__Impl rule__Extension__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:1338:1: rule__Extension__Group__2__Impl : ( ( rule__Extension__NameAssignment_2 ) ) ;
    public final void rule__Extension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1342:1: ( ( ( rule__Extension__NameAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:1343:1: ( ( rule__Extension__NameAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:1343:1: ( ( rule__Extension__NameAssignment_2 ) )
            // InternalUseCaseDslParser.g:1344:2: ( rule__Extension__NameAssignment_2 )
            {
             before(grammarAccess.getExtensionAccess().getNameAssignment_2()); 
            // InternalUseCaseDslParser.g:1345:2: ( rule__Extension__NameAssignment_2 )
            // InternalUseCaseDslParser.g:1345:3: rule__Extension__NameAssignment_2
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
    // InternalUseCaseDslParser.g:1353:1: rule__Extension__Group__3 : rule__Extension__Group__3__Impl rule__Extension__Group__4 ;
    public final void rule__Extension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1357:1: ( rule__Extension__Group__3__Impl rule__Extension__Group__4 )
            // InternalUseCaseDslParser.g:1358:2: rule__Extension__Group__3__Impl rule__Extension__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalUseCaseDslParser.g:1365:1: rule__Extension__Group__3__Impl : ( FullStop ) ;
    public final void rule__Extension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1369:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1370:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1370:1: ( FullStop )
            // InternalUseCaseDslParser.g:1371:2: FullStop
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
    // InternalUseCaseDslParser.g:1380:1: rule__Extension__Group__4 : rule__Extension__Group__4__Impl rule__Extension__Group__5 ;
    public final void rule__Extension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1384:1: ( rule__Extension__Group__4__Impl rule__Extension__Group__5 )
            // InternalUseCaseDslParser.g:1385:2: rule__Extension__Group__4__Impl rule__Extension__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalUseCaseDslParser.g:1392:1: rule__Extension__Group__4__Impl : ( IF ) ;
    public final void rule__Extension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1396:1: ( ( IF ) )
            // InternalUseCaseDslParser.g:1397:1: ( IF )
            {
            // InternalUseCaseDslParser.g:1397:1: ( IF )
            // InternalUseCaseDslParser.g:1398:2: IF
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
    // InternalUseCaseDslParser.g:1407:1: rule__Extension__Group__5 : rule__Extension__Group__5__Impl rule__Extension__Group__6 ;
    public final void rule__Extension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1411:1: ( rule__Extension__Group__5__Impl rule__Extension__Group__6 )
            // InternalUseCaseDslParser.g:1412:2: rule__Extension__Group__5__Impl rule__Extension__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalUseCaseDslParser.g:1419:1: rule__Extension__Group__5__Impl : ( ( rule__Extension__ConditionAssignment_5 ) ) ;
    public final void rule__Extension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1423:1: ( ( ( rule__Extension__ConditionAssignment_5 ) ) )
            // InternalUseCaseDslParser.g:1424:1: ( ( rule__Extension__ConditionAssignment_5 ) )
            {
            // InternalUseCaseDslParser.g:1424:1: ( ( rule__Extension__ConditionAssignment_5 ) )
            // InternalUseCaseDslParser.g:1425:2: ( rule__Extension__ConditionAssignment_5 )
            {
             before(grammarAccess.getExtensionAccess().getConditionAssignment_5()); 
            // InternalUseCaseDslParser.g:1426:2: ( rule__Extension__ConditionAssignment_5 )
            // InternalUseCaseDslParser.g:1426:3: rule__Extension__ConditionAssignment_5
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
    // InternalUseCaseDslParser.g:1434:1: rule__Extension__Group__6 : rule__Extension__Group__6__Impl rule__Extension__Group__7 ;
    public final void rule__Extension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1438:1: ( rule__Extension__Group__6__Impl rule__Extension__Group__7 )
            // InternalUseCaseDslParser.g:1439:2: rule__Extension__Group__6__Impl rule__Extension__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:1446:1: rule__Extension__Group__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__Extension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1450:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:1451:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:1451:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:1452:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:1461:1: rule__Extension__Group__7 : rule__Extension__Group__7__Impl rule__Extension__Group__8 ;
    public final void rule__Extension__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1465:1: ( rule__Extension__Group__7__Impl rule__Extension__Group__8 )
            // InternalUseCaseDslParser.g:1466:2: rule__Extension__Group__7__Impl rule__Extension__Group__8
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:1473:1: rule__Extension__Group__7__Impl : ( ( rule__Extension__StepsAssignment_7 )* ) ;
    public final void rule__Extension__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1477:1: ( ( ( rule__Extension__StepsAssignment_7 )* ) )
            // InternalUseCaseDslParser.g:1478:1: ( ( rule__Extension__StepsAssignment_7 )* )
            {
            // InternalUseCaseDslParser.g:1478:1: ( ( rule__Extension__StepsAssignment_7 )* )
            // InternalUseCaseDslParser.g:1479:2: ( rule__Extension__StepsAssignment_7 )*
            {
             before(grammarAccess.getExtensionAccess().getStepsAssignment_7()); 
            // InternalUseCaseDslParser.g:1480:2: ( rule__Extension__StepsAssignment_7 )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1480:3: rule__Extension__StepsAssignment_7
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Extension__StepsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalUseCaseDslParser.g:1488:1: rule__Extension__Group__8 : rule__Extension__Group__8__Impl rule__Extension__Group__9 ;
    public final void rule__Extension__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1492:1: ( rule__Extension__Group__8__Impl rule__Extension__Group__9 )
            // InternalUseCaseDslParser.g:1493:2: rule__Extension__Group__8__Impl rule__Extension__Group__9
            {
            pushFollow(FOLLOW_13);
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
    // InternalUseCaseDslParser.g:1500:1: rule__Extension__Group__8__Impl : ( ( rule__Extension__Alternatives_8 ) ) ;
    public final void rule__Extension__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1504:1: ( ( ( rule__Extension__Alternatives_8 ) ) )
            // InternalUseCaseDslParser.g:1505:1: ( ( rule__Extension__Alternatives_8 ) )
            {
            // InternalUseCaseDslParser.g:1505:1: ( ( rule__Extension__Alternatives_8 ) )
            // InternalUseCaseDslParser.g:1506:2: ( rule__Extension__Alternatives_8 )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives_8()); 
            // InternalUseCaseDslParser.g:1507:2: ( rule__Extension__Alternatives_8 )
            // InternalUseCaseDslParser.g:1507:3: rule__Extension__Alternatives_8
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
    // InternalUseCaseDslParser.g:1515:1: rule__Extension__Group__9 : rule__Extension__Group__9__Impl ;
    public final void rule__Extension__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1519:1: ( rule__Extension__Group__9__Impl )
            // InternalUseCaseDslParser.g:1520:2: rule__Extension__Group__9__Impl
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
    // InternalUseCaseDslParser.g:1526:1: rule__Extension__Group__9__Impl : ( RULE_END ) ;
    public final void rule__Extension__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1530:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:1531:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:1531:1: ( RULE_END )
            // InternalUseCaseDslParser.g:1532:2: RULE_END
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
    // InternalUseCaseDslParser.g:1542:1: rule__Extension__Group_8_0__0 : rule__Extension__Group_8_0__0__Impl rule__Extension__Group_8_0__1 ;
    public final void rule__Extension__Group_8_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1546:1: ( rule__Extension__Group_8_0__0__Impl rule__Extension__Group_8_0__1 )
            // InternalUseCaseDslParser.g:1547:2: rule__Extension__Group_8_0__0__Impl rule__Extension__Group_8_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:1554:1: rule__Extension__Group_8_0__0__Impl : ( ruleStepName ) ;
    public final void rule__Extension__Group_8_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1558:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:1559:1: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:1559:1: ( ruleStepName )
            // InternalUseCaseDslParser.g:1560:2: ruleStepName
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
    // InternalUseCaseDslParser.g:1569:1: rule__Extension__Group_8_0__1 : rule__Extension__Group_8_0__1__Impl rule__Extension__Group_8_0__2 ;
    public final void rule__Extension__Group_8_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1573:1: ( rule__Extension__Group_8_0__1__Impl rule__Extension__Group_8_0__2 )
            // InternalUseCaseDslParser.g:1574:2: rule__Extension__Group_8_0__1__Impl rule__Extension__Group_8_0__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalUseCaseDslParser.g:1581:1: rule__Extension__Group_8_0__1__Impl : ( FullStop ) ;
    public final void rule__Extension__Group_8_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1585:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1586:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1586:1: ( FullStop )
            // InternalUseCaseDslParser.g:1587:2: FullStop
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
    // InternalUseCaseDslParser.g:1596:1: rule__Extension__Group_8_0__2 : rule__Extension__Group_8_0__2__Impl rule__Extension__Group_8_0__3 ;
    public final void rule__Extension__Group_8_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1600:1: ( rule__Extension__Group_8_0__2__Impl rule__Extension__Group_8_0__3 )
            // InternalUseCaseDslParser.g:1601:2: rule__Extension__Group_8_0__2__Impl rule__Extension__Group_8_0__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalUseCaseDslParser.g:1608:1: rule__Extension__Group_8_0__2__Impl : ( RETURN ) ;
    public final void rule__Extension__Group_8_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1612:1: ( ( RETURN ) )
            // InternalUseCaseDslParser.g:1613:1: ( RETURN )
            {
            // InternalUseCaseDslParser.g:1613:1: ( RETURN )
            // InternalUseCaseDslParser.g:1614:2: RETURN
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
    // InternalUseCaseDslParser.g:1623:1: rule__Extension__Group_8_0__3 : rule__Extension__Group_8_0__3__Impl rule__Extension__Group_8_0__4 ;
    public final void rule__Extension__Group_8_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1627:1: ( rule__Extension__Group_8_0__3__Impl rule__Extension__Group_8_0__4 )
            // InternalUseCaseDslParser.g:1628:2: rule__Extension__Group_8_0__3__Impl rule__Extension__Group_8_0__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:1635:1: rule__Extension__Group_8_0__3__Impl : ( TO ) ;
    public final void rule__Extension__Group_8_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1639:1: ( ( TO ) )
            // InternalUseCaseDslParser.g:1640:1: ( TO )
            {
            // InternalUseCaseDslParser.g:1640:1: ( TO )
            // InternalUseCaseDslParser.g:1641:2: TO
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
    // InternalUseCaseDslParser.g:1650:1: rule__Extension__Group_8_0__4 : rule__Extension__Group_8_0__4__Impl ;
    public final void rule__Extension__Group_8_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1654:1: ( rule__Extension__Group_8_0__4__Impl )
            // InternalUseCaseDslParser.g:1655:2: rule__Extension__Group_8_0__4__Impl
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
    // InternalUseCaseDslParser.g:1661:1: rule__Extension__Group_8_0__4__Impl : ( ( rule__Extension__Alternatives_8_0_4 ) ) ;
    public final void rule__Extension__Group_8_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1665:1: ( ( ( rule__Extension__Alternatives_8_0_4 ) ) )
            // InternalUseCaseDslParser.g:1666:1: ( ( rule__Extension__Alternatives_8_0_4 ) )
            {
            // InternalUseCaseDslParser.g:1666:1: ( ( rule__Extension__Alternatives_8_0_4 ) )
            // InternalUseCaseDslParser.g:1667:2: ( rule__Extension__Alternatives_8_0_4 )
            {
             before(grammarAccess.getExtensionAccess().getAlternatives_8_0_4()); 
            // InternalUseCaseDslParser.g:1668:2: ( rule__Extension__Alternatives_8_0_4 )
            // InternalUseCaseDslParser.g:1668:3: rule__Extension__Alternatives_8_0_4
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
    // InternalUseCaseDslParser.g:1677:1: rule__UseCaseStep__Group_0__0 : rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1 ;
    public final void rule__UseCaseStep__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1681:1: ( rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1 )
            // InternalUseCaseDslParser.g:1682:2: rule__UseCaseStep__Group_0__0__Impl rule__UseCaseStep__Group_0__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:1689:1: rule__UseCaseStep__Group_0__0__Impl : ( ( rule__UseCaseStep__Group_0_0__0 )? ) ;
    public final void rule__UseCaseStep__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1693:1: ( ( ( rule__UseCaseStep__Group_0_0__0 )? ) )
            // InternalUseCaseDslParser.g:1694:1: ( ( rule__UseCaseStep__Group_0_0__0 )? )
            {
            // InternalUseCaseDslParser.g:1694:1: ( ( rule__UseCaseStep__Group_0_0__0 )? )
            // InternalUseCaseDslParser.g:1695:2: ( rule__UseCaseStep__Group_0_0__0 )?
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_0_0()); 
            // InternalUseCaseDslParser.g:1696:2: ( rule__UseCaseStep__Group_0_0__0 )?
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
                    // InternalUseCaseDslParser.g:1696:3: rule__UseCaseStep__Group_0_0__0
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
    // InternalUseCaseDslParser.g:1704:1: rule__UseCaseStep__Group_0__1 : rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2 ;
    public final void rule__UseCaseStep__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1708:1: ( rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2 )
            // InternalUseCaseDslParser.g:1709:2: rule__UseCaseStep__Group_0__1__Impl rule__UseCaseStep__Group_0__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:1716:1: rule__UseCaseStep__Group_0__1__Impl : ( ( rule__UseCaseStep__NameAssignment_0_1 ) ) ;
    public final void rule__UseCaseStep__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1720:1: ( ( ( rule__UseCaseStep__NameAssignment_0_1 ) ) )
            // InternalUseCaseDslParser.g:1721:1: ( ( rule__UseCaseStep__NameAssignment_0_1 ) )
            {
            // InternalUseCaseDslParser.g:1721:1: ( ( rule__UseCaseStep__NameAssignment_0_1 ) )
            // InternalUseCaseDslParser.g:1722:2: ( rule__UseCaseStep__NameAssignment_0_1 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_0_1()); 
            // InternalUseCaseDslParser.g:1723:2: ( rule__UseCaseStep__NameAssignment_0_1 )
            // InternalUseCaseDslParser.g:1723:3: rule__UseCaseStep__NameAssignment_0_1
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
    // InternalUseCaseDslParser.g:1731:1: rule__UseCaseStep__Group_0__2 : rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3 ;
    public final void rule__UseCaseStep__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1735:1: ( rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3 )
            // InternalUseCaseDslParser.g:1736:2: rule__UseCaseStep__Group_0__2__Impl rule__UseCaseStep__Group_0__3
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
    // InternalUseCaseDslParser.g:1743:1: rule__UseCaseStep__Group_0__2__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1747:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1748:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1748:1: ( FullStop )
            // InternalUseCaseDslParser.g:1749:2: FullStop
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
    // InternalUseCaseDslParser.g:1758:1: rule__UseCaseStep__Group_0__3 : rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4 ;
    public final void rule__UseCaseStep__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1762:1: ( rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4 )
            // InternalUseCaseDslParser.g:1763:2: rule__UseCaseStep__Group_0__3__Impl rule__UseCaseStep__Group_0__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCaseDslParser.g:1770:1: rule__UseCaseStep__Group_0__3__Impl : ( INCLUDE ) ;
    public final void rule__UseCaseStep__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1774:1: ( ( INCLUDE ) )
            // InternalUseCaseDslParser.g:1775:1: ( INCLUDE )
            {
            // InternalUseCaseDslParser.g:1775:1: ( INCLUDE )
            // InternalUseCaseDslParser.g:1776:2: INCLUDE
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
    // InternalUseCaseDslParser.g:1785:1: rule__UseCaseStep__Group_0__4 : rule__UseCaseStep__Group_0__4__Impl ;
    public final void rule__UseCaseStep__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1789:1: ( rule__UseCaseStep__Group_0__4__Impl )
            // InternalUseCaseDslParser.g:1790:2: rule__UseCaseStep__Group_0__4__Impl
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
    // InternalUseCaseDslParser.g:1796:1: rule__UseCaseStep__Group_0__4__Impl : ( ( rule__UseCaseStep__ReferenceAssignment_0_4 ) ) ;
    public final void rule__UseCaseStep__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1800:1: ( ( ( rule__UseCaseStep__ReferenceAssignment_0_4 ) ) )
            // InternalUseCaseDslParser.g:1801:1: ( ( rule__UseCaseStep__ReferenceAssignment_0_4 ) )
            {
            // InternalUseCaseDslParser.g:1801:1: ( ( rule__UseCaseStep__ReferenceAssignment_0_4 ) )
            // InternalUseCaseDslParser.g:1802:2: ( rule__UseCaseStep__ReferenceAssignment_0_4 )
            {
             before(grammarAccess.getUseCaseStepAccess().getReferenceAssignment_0_4()); 
            // InternalUseCaseDslParser.g:1803:2: ( rule__UseCaseStep__ReferenceAssignment_0_4 )
            // InternalUseCaseDslParser.g:1803:3: rule__UseCaseStep__ReferenceAssignment_0_4
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
    // InternalUseCaseDslParser.g:1812:1: rule__UseCaseStep__Group_0_0__0 : rule__UseCaseStep__Group_0_0__0__Impl rule__UseCaseStep__Group_0_0__1 ;
    public final void rule__UseCaseStep__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1816:1: ( rule__UseCaseStep__Group_0_0__0__Impl rule__UseCaseStep__Group_0_0__1 )
            // InternalUseCaseDslParser.g:1817:2: rule__UseCaseStep__Group_0_0__0__Impl rule__UseCaseStep__Group_0_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:1824:1: rule__UseCaseStep__Group_0_0__0__Impl : ( ( rule__UseCaseStep__ParentAssignment_0_0_0 ) ) ;
    public final void rule__UseCaseStep__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1828:1: ( ( ( rule__UseCaseStep__ParentAssignment_0_0_0 ) ) )
            // InternalUseCaseDslParser.g:1829:1: ( ( rule__UseCaseStep__ParentAssignment_0_0_0 ) )
            {
            // InternalUseCaseDslParser.g:1829:1: ( ( rule__UseCaseStep__ParentAssignment_0_0_0 ) )
            // InternalUseCaseDslParser.g:1830:2: ( rule__UseCaseStep__ParentAssignment_0_0_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentAssignment_0_0_0()); 
            // InternalUseCaseDslParser.g:1831:2: ( rule__UseCaseStep__ParentAssignment_0_0_0 )
            // InternalUseCaseDslParser.g:1831:3: rule__UseCaseStep__ParentAssignment_0_0_0
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
    // InternalUseCaseDslParser.g:1839:1: rule__UseCaseStep__Group_0_0__1 : rule__UseCaseStep__Group_0_0__1__Impl ;
    public final void rule__UseCaseStep__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1843:1: ( rule__UseCaseStep__Group_0_0__1__Impl )
            // InternalUseCaseDslParser.g:1844:2: rule__UseCaseStep__Group_0_0__1__Impl
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
    // InternalUseCaseDslParser.g:1850:1: rule__UseCaseStep__Group_0_0__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1854:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1855:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1855:1: ( FullStop )
            // InternalUseCaseDslParser.g:1856:2: FullStop
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
    // InternalUseCaseDslParser.g:1866:1: rule__UseCaseStep__Group_1__0 : rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1 ;
    public final void rule__UseCaseStep__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1870:1: ( rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1 )
            // InternalUseCaseDslParser.g:1871:2: rule__UseCaseStep__Group_1__0__Impl rule__UseCaseStep__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:1878:1: rule__UseCaseStep__Group_1__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1882:1: ( ( () ) )
            // InternalUseCaseDslParser.g:1883:1: ( () )
            {
            // InternalUseCaseDslParser.g:1883:1: ( () )
            // InternalUseCaseDslParser.g:1884:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getUserStepAction_1_0()); 
            // InternalUseCaseDslParser.g:1885:2: ()
            // InternalUseCaseDslParser.g:1885:3: 
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
    // InternalUseCaseDslParser.g:1893:1: rule__UseCaseStep__Group_1__1 : rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2 ;
    public final void rule__UseCaseStep__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1897:1: ( rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2 )
            // InternalUseCaseDslParser.g:1898:2: rule__UseCaseStep__Group_1__1__Impl rule__UseCaseStep__Group_1__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:1905:1: rule__UseCaseStep__Group_1__1__Impl : ( ( rule__UseCaseStep__Group_1_1__0 )? ) ;
    public final void rule__UseCaseStep__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1909:1: ( ( ( rule__UseCaseStep__Group_1_1__0 )? ) )
            // InternalUseCaseDslParser.g:1910:1: ( ( rule__UseCaseStep__Group_1_1__0 )? )
            {
            // InternalUseCaseDslParser.g:1910:1: ( ( rule__UseCaseStep__Group_1_1__0 )? )
            // InternalUseCaseDslParser.g:1911:2: ( rule__UseCaseStep__Group_1_1__0 )?
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_1_1()); 
            // InternalUseCaseDslParser.g:1912:2: ( rule__UseCaseStep__Group_1_1__0 )?
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
                    // InternalUseCaseDslParser.g:1912:3: rule__UseCaseStep__Group_1_1__0
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
    // InternalUseCaseDslParser.g:1920:1: rule__UseCaseStep__Group_1__2 : rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3 ;
    public final void rule__UseCaseStep__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1924:1: ( rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3 )
            // InternalUseCaseDslParser.g:1925:2: rule__UseCaseStep__Group_1__2__Impl rule__UseCaseStep__Group_1__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:1932:1: rule__UseCaseStep__Group_1__2__Impl : ( ( rule__UseCaseStep__NameAssignment_1_2 ) ) ;
    public final void rule__UseCaseStep__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1936:1: ( ( ( rule__UseCaseStep__NameAssignment_1_2 ) ) )
            // InternalUseCaseDslParser.g:1937:1: ( ( rule__UseCaseStep__NameAssignment_1_2 ) )
            {
            // InternalUseCaseDslParser.g:1937:1: ( ( rule__UseCaseStep__NameAssignment_1_2 ) )
            // InternalUseCaseDslParser.g:1938:2: ( rule__UseCaseStep__NameAssignment_1_2 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_1_2()); 
            // InternalUseCaseDslParser.g:1939:2: ( rule__UseCaseStep__NameAssignment_1_2 )
            // InternalUseCaseDslParser.g:1939:3: rule__UseCaseStep__NameAssignment_1_2
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
    // InternalUseCaseDslParser.g:1947:1: rule__UseCaseStep__Group_1__3 : rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4 ;
    public final void rule__UseCaseStep__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1951:1: ( rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4 )
            // InternalUseCaseDslParser.g:1952:2: rule__UseCaseStep__Group_1__3__Impl rule__UseCaseStep__Group_1__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalUseCaseDslParser.g:1959:1: rule__UseCaseStep__Group_1__3__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1963:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:1964:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:1964:1: ( FullStop )
            // InternalUseCaseDslParser.g:1965:2: FullStop
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
    // InternalUseCaseDslParser.g:1974:1: rule__UseCaseStep__Group_1__4 : rule__UseCaseStep__Group_1__4__Impl rule__UseCaseStep__Group_1__5 ;
    public final void rule__UseCaseStep__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1978:1: ( rule__UseCaseStep__Group_1__4__Impl rule__UseCaseStep__Group_1__5 )
            // InternalUseCaseDslParser.g:1979:2: rule__UseCaseStep__Group_1__4__Impl rule__UseCaseStep__Group_1__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCaseDslParser.g:1986:1: rule__UseCaseStep__Group_1__4__Impl : ( USER ) ;
    public final void rule__UseCaseStep__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:1990:1: ( ( USER ) )
            // InternalUseCaseDslParser.g:1991:1: ( USER )
            {
            // InternalUseCaseDslParser.g:1991:1: ( USER )
            // InternalUseCaseDslParser.g:1992:2: USER
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
    // InternalUseCaseDslParser.g:2001:1: rule__UseCaseStep__Group_1__5 : rule__UseCaseStep__Group_1__5__Impl ;
    public final void rule__UseCaseStep__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2005:1: ( rule__UseCaseStep__Group_1__5__Impl )
            // InternalUseCaseDslParser.g:2006:2: rule__UseCaseStep__Group_1__5__Impl
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
    // InternalUseCaseDslParser.g:2012:1: rule__UseCaseStep__Group_1__5__Impl : ( ( rule__UseCaseStep__SentenceAssignment_1_5 ) ) ;
    public final void rule__UseCaseStep__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2016:1: ( ( ( rule__UseCaseStep__SentenceAssignment_1_5 ) ) )
            // InternalUseCaseDslParser.g:2017:1: ( ( rule__UseCaseStep__SentenceAssignment_1_5 ) )
            {
            // InternalUseCaseDslParser.g:2017:1: ( ( rule__UseCaseStep__SentenceAssignment_1_5 ) )
            // InternalUseCaseDslParser.g:2018:2: ( rule__UseCaseStep__SentenceAssignment_1_5 )
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_1_5()); 
            // InternalUseCaseDslParser.g:2019:2: ( rule__UseCaseStep__SentenceAssignment_1_5 )
            // InternalUseCaseDslParser.g:2019:3: rule__UseCaseStep__SentenceAssignment_1_5
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
    // InternalUseCaseDslParser.g:2028:1: rule__UseCaseStep__Group_1_1__0 : rule__UseCaseStep__Group_1_1__0__Impl rule__UseCaseStep__Group_1_1__1 ;
    public final void rule__UseCaseStep__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2032:1: ( rule__UseCaseStep__Group_1_1__0__Impl rule__UseCaseStep__Group_1_1__1 )
            // InternalUseCaseDslParser.g:2033:2: rule__UseCaseStep__Group_1_1__0__Impl rule__UseCaseStep__Group_1_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:2040:1: rule__UseCaseStep__Group_1_1__0__Impl : ( ( rule__UseCaseStep__ParentAssignment_1_1_0 ) ) ;
    public final void rule__UseCaseStep__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2044:1: ( ( ( rule__UseCaseStep__ParentAssignment_1_1_0 ) ) )
            // InternalUseCaseDslParser.g:2045:1: ( ( rule__UseCaseStep__ParentAssignment_1_1_0 ) )
            {
            // InternalUseCaseDslParser.g:2045:1: ( ( rule__UseCaseStep__ParentAssignment_1_1_0 ) )
            // InternalUseCaseDslParser.g:2046:2: ( rule__UseCaseStep__ParentAssignment_1_1_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentAssignment_1_1_0()); 
            // InternalUseCaseDslParser.g:2047:2: ( rule__UseCaseStep__ParentAssignment_1_1_0 )
            // InternalUseCaseDslParser.g:2047:3: rule__UseCaseStep__ParentAssignment_1_1_0
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
    // InternalUseCaseDslParser.g:2055:1: rule__UseCaseStep__Group_1_1__1 : rule__UseCaseStep__Group_1_1__1__Impl ;
    public final void rule__UseCaseStep__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2059:1: ( rule__UseCaseStep__Group_1_1__1__Impl )
            // InternalUseCaseDslParser.g:2060:2: rule__UseCaseStep__Group_1_1__1__Impl
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
    // InternalUseCaseDslParser.g:2066:1: rule__UseCaseStep__Group_1_1__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2070:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2071:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2071:1: ( FullStop )
            // InternalUseCaseDslParser.g:2072:2: FullStop
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
    // InternalUseCaseDslParser.g:2082:1: rule__UseCaseStep__Group_2__0 : rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1 ;
    public final void rule__UseCaseStep__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2086:1: ( rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1 )
            // InternalUseCaseDslParser.g:2087:2: rule__UseCaseStep__Group_2__0__Impl rule__UseCaseStep__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:2094:1: rule__UseCaseStep__Group_2__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2098:1: ( ( () ) )
            // InternalUseCaseDslParser.g:2099:1: ( () )
            {
            // InternalUseCaseDslParser.g:2099:1: ( () )
            // InternalUseCaseDslParser.g:2100:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getSystemStepAction_2_0()); 
            // InternalUseCaseDslParser.g:2101:2: ()
            // InternalUseCaseDslParser.g:2101:3: 
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
    // InternalUseCaseDslParser.g:2109:1: rule__UseCaseStep__Group_2__1 : rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2 ;
    public final void rule__UseCaseStep__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2113:1: ( rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2 )
            // InternalUseCaseDslParser.g:2114:2: rule__UseCaseStep__Group_2__1__Impl rule__UseCaseStep__Group_2__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:2121:1: rule__UseCaseStep__Group_2__1__Impl : ( ( rule__UseCaseStep__Group_2_1__0 )? ) ;
    public final void rule__UseCaseStep__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2125:1: ( ( ( rule__UseCaseStep__Group_2_1__0 )? ) )
            // InternalUseCaseDslParser.g:2126:1: ( ( rule__UseCaseStep__Group_2_1__0 )? )
            {
            // InternalUseCaseDslParser.g:2126:1: ( ( rule__UseCaseStep__Group_2_1__0 )? )
            // InternalUseCaseDslParser.g:2127:2: ( rule__UseCaseStep__Group_2_1__0 )?
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_2_1()); 
            // InternalUseCaseDslParser.g:2128:2: ( rule__UseCaseStep__Group_2_1__0 )?
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
                    // InternalUseCaseDslParser.g:2128:3: rule__UseCaseStep__Group_2_1__0
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
    // InternalUseCaseDslParser.g:2136:1: rule__UseCaseStep__Group_2__2 : rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3 ;
    public final void rule__UseCaseStep__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2140:1: ( rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3 )
            // InternalUseCaseDslParser.g:2141:2: rule__UseCaseStep__Group_2__2__Impl rule__UseCaseStep__Group_2__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:2148:1: rule__UseCaseStep__Group_2__2__Impl : ( ( rule__UseCaseStep__NameAssignment_2_2 ) ) ;
    public final void rule__UseCaseStep__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2152:1: ( ( ( rule__UseCaseStep__NameAssignment_2_2 ) ) )
            // InternalUseCaseDslParser.g:2153:1: ( ( rule__UseCaseStep__NameAssignment_2_2 ) )
            {
            // InternalUseCaseDslParser.g:2153:1: ( ( rule__UseCaseStep__NameAssignment_2_2 ) )
            // InternalUseCaseDslParser.g:2154:2: ( rule__UseCaseStep__NameAssignment_2_2 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_2_2()); 
            // InternalUseCaseDslParser.g:2155:2: ( rule__UseCaseStep__NameAssignment_2_2 )
            // InternalUseCaseDslParser.g:2155:3: rule__UseCaseStep__NameAssignment_2_2
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
    // InternalUseCaseDslParser.g:2163:1: rule__UseCaseStep__Group_2__3 : rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4 ;
    public final void rule__UseCaseStep__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2167:1: ( rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4 )
            // InternalUseCaseDslParser.g:2168:2: rule__UseCaseStep__Group_2__3__Impl rule__UseCaseStep__Group_2__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalUseCaseDslParser.g:2175:1: rule__UseCaseStep__Group_2__3__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2179:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2180:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2180:1: ( FullStop )
            // InternalUseCaseDslParser.g:2181:2: FullStop
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
    // InternalUseCaseDslParser.g:2190:1: rule__UseCaseStep__Group_2__4 : rule__UseCaseStep__Group_2__4__Impl rule__UseCaseStep__Group_2__5 ;
    public final void rule__UseCaseStep__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2194:1: ( rule__UseCaseStep__Group_2__4__Impl rule__UseCaseStep__Group_2__5 )
            // InternalUseCaseDslParser.g:2195:2: rule__UseCaseStep__Group_2__4__Impl rule__UseCaseStep__Group_2__5
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
    // InternalUseCaseDslParser.g:2202:1: rule__UseCaseStep__Group_2__4__Impl : ( SYSTEM ) ;
    public final void rule__UseCaseStep__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2206:1: ( ( SYSTEM ) )
            // InternalUseCaseDslParser.g:2207:1: ( SYSTEM )
            {
            // InternalUseCaseDslParser.g:2207:1: ( SYSTEM )
            // InternalUseCaseDslParser.g:2208:2: SYSTEM
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
    // InternalUseCaseDslParser.g:2217:1: rule__UseCaseStep__Group_2__5 : rule__UseCaseStep__Group_2__5__Impl ;
    public final void rule__UseCaseStep__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2221:1: ( rule__UseCaseStep__Group_2__5__Impl )
            // InternalUseCaseDslParser.g:2222:2: rule__UseCaseStep__Group_2__5__Impl
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
    // InternalUseCaseDslParser.g:2228:1: rule__UseCaseStep__Group_2__5__Impl : ( ( rule__UseCaseStep__SentenceAssignment_2_5 ) ) ;
    public final void rule__UseCaseStep__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2232:1: ( ( ( rule__UseCaseStep__SentenceAssignment_2_5 ) ) )
            // InternalUseCaseDslParser.g:2233:1: ( ( rule__UseCaseStep__SentenceAssignment_2_5 ) )
            {
            // InternalUseCaseDslParser.g:2233:1: ( ( rule__UseCaseStep__SentenceAssignment_2_5 ) )
            // InternalUseCaseDslParser.g:2234:2: ( rule__UseCaseStep__SentenceAssignment_2_5 )
            {
             before(grammarAccess.getUseCaseStepAccess().getSentenceAssignment_2_5()); 
            // InternalUseCaseDslParser.g:2235:2: ( rule__UseCaseStep__SentenceAssignment_2_5 )
            // InternalUseCaseDslParser.g:2235:3: rule__UseCaseStep__SentenceAssignment_2_5
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
    // InternalUseCaseDslParser.g:2244:1: rule__UseCaseStep__Group_2_1__0 : rule__UseCaseStep__Group_2_1__0__Impl rule__UseCaseStep__Group_2_1__1 ;
    public final void rule__UseCaseStep__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2248:1: ( rule__UseCaseStep__Group_2_1__0__Impl rule__UseCaseStep__Group_2_1__1 )
            // InternalUseCaseDslParser.g:2249:2: rule__UseCaseStep__Group_2_1__0__Impl rule__UseCaseStep__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:2256:1: rule__UseCaseStep__Group_2_1__0__Impl : ( ( rule__UseCaseStep__ParentAssignment_2_1_0 ) ) ;
    public final void rule__UseCaseStep__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2260:1: ( ( ( rule__UseCaseStep__ParentAssignment_2_1_0 ) ) )
            // InternalUseCaseDslParser.g:2261:1: ( ( rule__UseCaseStep__ParentAssignment_2_1_0 ) )
            {
            // InternalUseCaseDslParser.g:2261:1: ( ( rule__UseCaseStep__ParentAssignment_2_1_0 ) )
            // InternalUseCaseDslParser.g:2262:2: ( rule__UseCaseStep__ParentAssignment_2_1_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentAssignment_2_1_0()); 
            // InternalUseCaseDslParser.g:2263:2: ( rule__UseCaseStep__ParentAssignment_2_1_0 )
            // InternalUseCaseDslParser.g:2263:3: rule__UseCaseStep__ParentAssignment_2_1_0
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
    // InternalUseCaseDslParser.g:2271:1: rule__UseCaseStep__Group_2_1__1 : rule__UseCaseStep__Group_2_1__1__Impl ;
    public final void rule__UseCaseStep__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2275:1: ( rule__UseCaseStep__Group_2_1__1__Impl )
            // InternalUseCaseDslParser.g:2276:2: rule__UseCaseStep__Group_2_1__1__Impl
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
    // InternalUseCaseDslParser.g:2282:1: rule__UseCaseStep__Group_2_1__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2286:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2287:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2287:1: ( FullStop )
            // InternalUseCaseDslParser.g:2288:2: FullStop
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
    // InternalUseCaseDslParser.g:2298:1: rule__UseCaseStep__Group_3__0 : rule__UseCaseStep__Group_3__0__Impl rule__UseCaseStep__Group_3__1 ;
    public final void rule__UseCaseStep__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2302:1: ( rule__UseCaseStep__Group_3__0__Impl rule__UseCaseStep__Group_3__1 )
            // InternalUseCaseDslParser.g:2303:2: rule__UseCaseStep__Group_3__0__Impl rule__UseCaseStep__Group_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:2310:1: rule__UseCaseStep__Group_3__0__Impl : ( () ) ;
    public final void rule__UseCaseStep__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2314:1: ( ( () ) )
            // InternalUseCaseDslParser.g:2315:1: ( () )
            {
            // InternalUseCaseDslParser.g:2315:1: ( () )
            // InternalUseCaseDslParser.g:2316:2: ()
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatingStepAction_3_0()); 
            // InternalUseCaseDslParser.g:2317:2: ()
            // InternalUseCaseDslParser.g:2317:3: 
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
    // InternalUseCaseDslParser.g:2325:1: rule__UseCaseStep__Group_3__1 : rule__UseCaseStep__Group_3__1__Impl rule__UseCaseStep__Group_3__2 ;
    public final void rule__UseCaseStep__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2329:1: ( rule__UseCaseStep__Group_3__1__Impl rule__UseCaseStep__Group_3__2 )
            // InternalUseCaseDslParser.g:2330:2: rule__UseCaseStep__Group_3__1__Impl rule__UseCaseStep__Group_3__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:2337:1: rule__UseCaseStep__Group_3__1__Impl : ( ( rule__UseCaseStep__Group_3_1__0 )? ) ;
    public final void rule__UseCaseStep__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2341:1: ( ( ( rule__UseCaseStep__Group_3_1__0 )? ) )
            // InternalUseCaseDslParser.g:2342:1: ( ( rule__UseCaseStep__Group_3_1__0 )? )
            {
            // InternalUseCaseDslParser.g:2342:1: ( ( rule__UseCaseStep__Group_3_1__0 )? )
            // InternalUseCaseDslParser.g:2343:2: ( rule__UseCaseStep__Group_3_1__0 )?
            {
             before(grammarAccess.getUseCaseStepAccess().getGroup_3_1()); 
            // InternalUseCaseDslParser.g:2344:2: ( rule__UseCaseStep__Group_3_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==FullStop) ) {
                    int LA23_2 = input.LA(3);

                    if ( (LA23_2==RULE_INT) ) {
                        alt23=1;
                    }
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalUseCaseDslParser.g:2344:3: rule__UseCaseStep__Group_3_1__0
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
    // InternalUseCaseDslParser.g:2352:1: rule__UseCaseStep__Group_3__2 : rule__UseCaseStep__Group_3__2__Impl rule__UseCaseStep__Group_3__3 ;
    public final void rule__UseCaseStep__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2356:1: ( rule__UseCaseStep__Group_3__2__Impl rule__UseCaseStep__Group_3__3 )
            // InternalUseCaseDslParser.g:2357:2: rule__UseCaseStep__Group_3__2__Impl rule__UseCaseStep__Group_3__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:2364:1: rule__UseCaseStep__Group_3__2__Impl : ( ( rule__UseCaseStep__NameAssignment_3_2 ) ) ;
    public final void rule__UseCaseStep__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2368:1: ( ( ( rule__UseCaseStep__NameAssignment_3_2 ) ) )
            // InternalUseCaseDslParser.g:2369:1: ( ( rule__UseCaseStep__NameAssignment_3_2 ) )
            {
            // InternalUseCaseDslParser.g:2369:1: ( ( rule__UseCaseStep__NameAssignment_3_2 ) )
            // InternalUseCaseDslParser.g:2370:2: ( rule__UseCaseStep__NameAssignment_3_2 )
            {
             before(grammarAccess.getUseCaseStepAccess().getNameAssignment_3_2()); 
            // InternalUseCaseDslParser.g:2371:2: ( rule__UseCaseStep__NameAssignment_3_2 )
            // InternalUseCaseDslParser.g:2371:3: rule__UseCaseStep__NameAssignment_3_2
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
    // InternalUseCaseDslParser.g:2379:1: rule__UseCaseStep__Group_3__3 : rule__UseCaseStep__Group_3__3__Impl rule__UseCaseStep__Group_3__4 ;
    public final void rule__UseCaseStep__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2383:1: ( rule__UseCaseStep__Group_3__3__Impl rule__UseCaseStep__Group_3__4 )
            // InternalUseCaseDslParser.g:2384:2: rule__UseCaseStep__Group_3__3__Impl rule__UseCaseStep__Group_3__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalUseCaseDslParser.g:2391:1: rule__UseCaseStep__Group_3__3__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2395:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2396:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2396:1: ( FullStop )
            // InternalUseCaseDslParser.g:2397:2: FullStop
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
    // InternalUseCaseDslParser.g:2406:1: rule__UseCaseStep__Group_3__4 : rule__UseCaseStep__Group_3__4__Impl rule__UseCaseStep__Group_3__5 ;
    public final void rule__UseCaseStep__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2410:1: ( rule__UseCaseStep__Group_3__4__Impl rule__UseCaseStep__Group_3__5 )
            // InternalUseCaseDslParser.g:2411:2: rule__UseCaseStep__Group_3__4__Impl rule__UseCaseStep__Group_3__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalUseCaseDslParser.g:2418:1: rule__UseCaseStep__Group_3__4__Impl : ( WHILE ) ;
    public final void rule__UseCaseStep__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2422:1: ( ( WHILE ) )
            // InternalUseCaseDslParser.g:2423:1: ( WHILE )
            {
            // InternalUseCaseDslParser.g:2423:1: ( WHILE )
            // InternalUseCaseDslParser.g:2424:2: WHILE
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
    // InternalUseCaseDslParser.g:2433:1: rule__UseCaseStep__Group_3__5 : rule__UseCaseStep__Group_3__5__Impl rule__UseCaseStep__Group_3__6 ;
    public final void rule__UseCaseStep__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2437:1: ( rule__UseCaseStep__Group_3__5__Impl rule__UseCaseStep__Group_3__6 )
            // InternalUseCaseDslParser.g:2438:2: rule__UseCaseStep__Group_3__5__Impl rule__UseCaseStep__Group_3__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalUseCaseDslParser.g:2445:1: rule__UseCaseStep__Group_3__5__Impl : ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 ) ) ;
    public final void rule__UseCaseStep__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2449:1: ( ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 ) ) )
            // InternalUseCaseDslParser.g:2450:1: ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 ) )
            {
            // InternalUseCaseDslParser.g:2450:1: ( ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 ) )
            // InternalUseCaseDslParser.g:2451:2: ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 )
            {
             before(grammarAccess.getUseCaseStepAccess().getRepeatingConditionAssignment_3_5()); 
            // InternalUseCaseDslParser.g:2452:2: ( rule__UseCaseStep__RepeatingConditionAssignment_3_5 )
            // InternalUseCaseDslParser.g:2452:3: rule__UseCaseStep__RepeatingConditionAssignment_3_5
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
    // InternalUseCaseDslParser.g:2460:1: rule__UseCaseStep__Group_3__6 : rule__UseCaseStep__Group_3__6__Impl rule__UseCaseStep__Group_3__7 ;
    public final void rule__UseCaseStep__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2464:1: ( rule__UseCaseStep__Group_3__6__Impl rule__UseCaseStep__Group_3__7 )
            // InternalUseCaseDslParser.g:2465:2: rule__UseCaseStep__Group_3__6__Impl rule__UseCaseStep__Group_3__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:2472:1: rule__UseCaseStep__Group_3__6__Impl : ( RULE_BEGIN ) ;
    public final void rule__UseCaseStep__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2476:1: ( ( RULE_BEGIN ) )
            // InternalUseCaseDslParser.g:2477:1: ( RULE_BEGIN )
            {
            // InternalUseCaseDslParser.g:2477:1: ( RULE_BEGIN )
            // InternalUseCaseDslParser.g:2478:2: RULE_BEGIN
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
    // InternalUseCaseDslParser.g:2487:1: rule__UseCaseStep__Group_3__7 : rule__UseCaseStep__Group_3__7__Impl rule__UseCaseStep__Group_3__8 ;
    public final void rule__UseCaseStep__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2491:1: ( rule__UseCaseStep__Group_3__7__Impl rule__UseCaseStep__Group_3__8 )
            // InternalUseCaseDslParser.g:2492:2: rule__UseCaseStep__Group_3__7__Impl rule__UseCaseStep__Group_3__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalUseCaseDslParser.g:2499:1: rule__UseCaseStep__Group_3__7__Impl : ( ( ( rule__UseCaseStep__StepsAssignment_3_7 ) ) ( ( rule__UseCaseStep__StepsAssignment_3_7 )* ) ) ;
    public final void rule__UseCaseStep__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2503:1: ( ( ( ( rule__UseCaseStep__StepsAssignment_3_7 ) ) ( ( rule__UseCaseStep__StepsAssignment_3_7 )* ) ) )
            // InternalUseCaseDslParser.g:2504:1: ( ( ( rule__UseCaseStep__StepsAssignment_3_7 ) ) ( ( rule__UseCaseStep__StepsAssignment_3_7 )* ) )
            {
            // InternalUseCaseDslParser.g:2504:1: ( ( ( rule__UseCaseStep__StepsAssignment_3_7 ) ) ( ( rule__UseCaseStep__StepsAssignment_3_7 )* ) )
            // InternalUseCaseDslParser.g:2505:2: ( ( rule__UseCaseStep__StepsAssignment_3_7 ) ) ( ( rule__UseCaseStep__StepsAssignment_3_7 )* )
            {
            // InternalUseCaseDslParser.g:2505:2: ( ( rule__UseCaseStep__StepsAssignment_3_7 ) )
            // InternalUseCaseDslParser.g:2506:3: ( rule__UseCaseStep__StepsAssignment_3_7 )
            {
             before(grammarAccess.getUseCaseStepAccess().getStepsAssignment_3_7()); 
            // InternalUseCaseDslParser.g:2507:3: ( rule__UseCaseStep__StepsAssignment_3_7 )
            // InternalUseCaseDslParser.g:2507:4: rule__UseCaseStep__StepsAssignment_3_7
            {
            pushFollow(FOLLOW_6);
            rule__UseCaseStep__StepsAssignment_3_7();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseStepAccess().getStepsAssignment_3_7()); 

            }

            // InternalUseCaseDslParser.g:2510:2: ( ( rule__UseCaseStep__StepsAssignment_3_7 )* )
            // InternalUseCaseDslParser.g:2511:3: ( rule__UseCaseStep__StepsAssignment_3_7 )*
            {
             before(grammarAccess.getUseCaseStepAccess().getStepsAssignment_3_7()); 
            // InternalUseCaseDslParser.g:2512:3: ( rule__UseCaseStep__StepsAssignment_3_7 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_INT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:2512:4: rule__UseCaseStep__StepsAssignment_3_7
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__UseCaseStep__StepsAssignment_3_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalUseCaseDslParser.g:2521:1: rule__UseCaseStep__Group_3__8 : rule__UseCaseStep__Group_3__8__Impl ;
    public final void rule__UseCaseStep__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2525:1: ( rule__UseCaseStep__Group_3__8__Impl )
            // InternalUseCaseDslParser.g:2526:2: rule__UseCaseStep__Group_3__8__Impl
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
    // InternalUseCaseDslParser.g:2532:1: rule__UseCaseStep__Group_3__8__Impl : ( RULE_END ) ;
    public final void rule__UseCaseStep__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2536:1: ( ( RULE_END ) )
            // InternalUseCaseDslParser.g:2537:1: ( RULE_END )
            {
            // InternalUseCaseDslParser.g:2537:1: ( RULE_END )
            // InternalUseCaseDslParser.g:2538:2: RULE_END
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
    // InternalUseCaseDslParser.g:2548:1: rule__UseCaseStep__Group_3_1__0 : rule__UseCaseStep__Group_3_1__0__Impl rule__UseCaseStep__Group_3_1__1 ;
    public final void rule__UseCaseStep__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2552:1: ( rule__UseCaseStep__Group_3_1__0__Impl rule__UseCaseStep__Group_3_1__1 )
            // InternalUseCaseDslParser.g:2553:2: rule__UseCaseStep__Group_3_1__0__Impl rule__UseCaseStep__Group_3_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:2560:1: rule__UseCaseStep__Group_3_1__0__Impl : ( ( rule__UseCaseStep__ParentAssignment_3_1_0 ) ) ;
    public final void rule__UseCaseStep__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2564:1: ( ( ( rule__UseCaseStep__ParentAssignment_3_1_0 ) ) )
            // InternalUseCaseDslParser.g:2565:1: ( ( rule__UseCaseStep__ParentAssignment_3_1_0 ) )
            {
            // InternalUseCaseDslParser.g:2565:1: ( ( rule__UseCaseStep__ParentAssignment_3_1_0 ) )
            // InternalUseCaseDslParser.g:2566:2: ( rule__UseCaseStep__ParentAssignment_3_1_0 )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentAssignment_3_1_0()); 
            // InternalUseCaseDslParser.g:2567:2: ( rule__UseCaseStep__ParentAssignment_3_1_0 )
            // InternalUseCaseDslParser.g:2567:3: rule__UseCaseStep__ParentAssignment_3_1_0
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
    // InternalUseCaseDslParser.g:2575:1: rule__UseCaseStep__Group_3_1__1 : rule__UseCaseStep__Group_3_1__1__Impl ;
    public final void rule__UseCaseStep__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2579:1: ( rule__UseCaseStep__Group_3_1__1__Impl )
            // InternalUseCaseDslParser.g:2580:2: rule__UseCaseStep__Group_3_1__1__Impl
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
    // InternalUseCaseDslParser.g:2586:1: rule__UseCaseStep__Group_3_1__1__Impl : ( FullStop ) ;
    public final void rule__UseCaseStep__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2590:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2591:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2591:1: ( FullStop )
            // InternalUseCaseDslParser.g:2592:2: FullStop
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
    // InternalUseCaseDslParser.g:2602:1: rule__ExtensionStep__Group_0__0 : rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1 ;
    public final void rule__ExtensionStep__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2606:1: ( rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1 )
            // InternalUseCaseDslParser.g:2607:2: rule__ExtensionStep__Group_0__0__Impl rule__ExtensionStep__Group_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:2614:1: rule__ExtensionStep__Group_0__0__Impl : ( ( rule__ExtensionStep__NameAssignment_0_0 ) ) ;
    public final void rule__ExtensionStep__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2618:1: ( ( ( rule__ExtensionStep__NameAssignment_0_0 ) ) )
            // InternalUseCaseDslParser.g:2619:1: ( ( rule__ExtensionStep__NameAssignment_0_0 ) )
            {
            // InternalUseCaseDslParser.g:2619:1: ( ( rule__ExtensionStep__NameAssignment_0_0 ) )
            // InternalUseCaseDslParser.g:2620:2: ( rule__ExtensionStep__NameAssignment_0_0 )
            {
             before(grammarAccess.getExtensionStepAccess().getNameAssignment_0_0()); 
            // InternalUseCaseDslParser.g:2621:2: ( rule__ExtensionStep__NameAssignment_0_0 )
            // InternalUseCaseDslParser.g:2621:3: rule__ExtensionStep__NameAssignment_0_0
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
    // InternalUseCaseDslParser.g:2629:1: rule__ExtensionStep__Group_0__1 : rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2 ;
    public final void rule__ExtensionStep__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2633:1: ( rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2 )
            // InternalUseCaseDslParser.g:2634:2: rule__ExtensionStep__Group_0__1__Impl rule__ExtensionStep__Group_0__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalUseCaseDslParser.g:2641:1: rule__ExtensionStep__Group_0__1__Impl : ( FullStop ) ;
    public final void rule__ExtensionStep__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2645:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2646:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2646:1: ( FullStop )
            // InternalUseCaseDslParser.g:2647:2: FullStop
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
    // InternalUseCaseDslParser.g:2656:1: rule__ExtensionStep__Group_0__2 : rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3 ;
    public final void rule__ExtensionStep__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2660:1: ( rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3 )
            // InternalUseCaseDslParser.g:2661:2: rule__ExtensionStep__Group_0__2__Impl rule__ExtensionStep__Group_0__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalUseCaseDslParser.g:2668:1: rule__ExtensionStep__Group_0__2__Impl : ( INCLUDE ) ;
    public final void rule__ExtensionStep__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2672:1: ( ( INCLUDE ) )
            // InternalUseCaseDslParser.g:2673:1: ( INCLUDE )
            {
            // InternalUseCaseDslParser.g:2673:1: ( INCLUDE )
            // InternalUseCaseDslParser.g:2674:2: INCLUDE
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
    // InternalUseCaseDslParser.g:2683:1: rule__ExtensionStep__Group_0__3 : rule__ExtensionStep__Group_0__3__Impl ;
    public final void rule__ExtensionStep__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2687:1: ( rule__ExtensionStep__Group_0__3__Impl )
            // InternalUseCaseDslParser.g:2688:2: rule__ExtensionStep__Group_0__3__Impl
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
    // InternalUseCaseDslParser.g:2694:1: rule__ExtensionStep__Group_0__3__Impl : ( ( rule__ExtensionStep__ReferenceAssignment_0_3 ) ) ;
    public final void rule__ExtensionStep__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2698:1: ( ( ( rule__ExtensionStep__ReferenceAssignment_0_3 ) ) )
            // InternalUseCaseDslParser.g:2699:1: ( ( rule__ExtensionStep__ReferenceAssignment_0_3 ) )
            {
            // InternalUseCaseDslParser.g:2699:1: ( ( rule__ExtensionStep__ReferenceAssignment_0_3 ) )
            // InternalUseCaseDslParser.g:2700:2: ( rule__ExtensionStep__ReferenceAssignment_0_3 )
            {
             before(grammarAccess.getExtensionStepAccess().getReferenceAssignment_0_3()); 
            // InternalUseCaseDslParser.g:2701:2: ( rule__ExtensionStep__ReferenceAssignment_0_3 )
            // InternalUseCaseDslParser.g:2701:3: rule__ExtensionStep__ReferenceAssignment_0_3
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
    // InternalUseCaseDslParser.g:2710:1: rule__ExtensionStep__Group_1__0 : rule__ExtensionStep__Group_1__0__Impl rule__ExtensionStep__Group_1__1 ;
    public final void rule__ExtensionStep__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2714:1: ( rule__ExtensionStep__Group_1__0__Impl rule__ExtensionStep__Group_1__1 )
            // InternalUseCaseDslParser.g:2715:2: rule__ExtensionStep__Group_1__0__Impl rule__ExtensionStep__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:2722:1: rule__ExtensionStep__Group_1__0__Impl : ( ( rule__ExtensionStep__NameAssignment_1_0 ) ) ;
    public final void rule__ExtensionStep__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2726:1: ( ( ( rule__ExtensionStep__NameAssignment_1_0 ) ) )
            // InternalUseCaseDslParser.g:2727:1: ( ( rule__ExtensionStep__NameAssignment_1_0 ) )
            {
            // InternalUseCaseDslParser.g:2727:1: ( ( rule__ExtensionStep__NameAssignment_1_0 ) )
            // InternalUseCaseDslParser.g:2728:2: ( rule__ExtensionStep__NameAssignment_1_0 )
            {
             before(grammarAccess.getExtensionStepAccess().getNameAssignment_1_0()); 
            // InternalUseCaseDslParser.g:2729:2: ( rule__ExtensionStep__NameAssignment_1_0 )
            // InternalUseCaseDslParser.g:2729:3: rule__ExtensionStep__NameAssignment_1_0
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
    // InternalUseCaseDslParser.g:2737:1: rule__ExtensionStep__Group_1__1 : rule__ExtensionStep__Group_1__1__Impl rule__ExtensionStep__Group_1__2 ;
    public final void rule__ExtensionStep__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2741:1: ( rule__ExtensionStep__Group_1__1__Impl rule__ExtensionStep__Group_1__2 )
            // InternalUseCaseDslParser.g:2742:2: rule__ExtensionStep__Group_1__1__Impl rule__ExtensionStep__Group_1__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalUseCaseDslParser.g:2749:1: rule__ExtensionStep__Group_1__1__Impl : ( FullStop ) ;
    public final void rule__ExtensionStep__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2753:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2754:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2754:1: ( FullStop )
            // InternalUseCaseDslParser.g:2755:2: FullStop
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
    // InternalUseCaseDslParser.g:2764:1: rule__ExtensionStep__Group_1__2 : rule__ExtensionStep__Group_1__2__Impl rule__ExtensionStep__Group_1__3 ;
    public final void rule__ExtensionStep__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2768:1: ( rule__ExtensionStep__Group_1__2__Impl rule__ExtensionStep__Group_1__3 )
            // InternalUseCaseDslParser.g:2769:2: rule__ExtensionStep__Group_1__2__Impl rule__ExtensionStep__Group_1__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalUseCaseDslParser.g:2776:1: rule__ExtensionStep__Group_1__2__Impl : ( ( rule__ExtensionStep__Alternatives_1_2 )? ) ;
    public final void rule__ExtensionStep__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2780:1: ( ( ( rule__ExtensionStep__Alternatives_1_2 )? ) )
            // InternalUseCaseDslParser.g:2781:1: ( ( rule__ExtensionStep__Alternatives_1_2 )? )
            {
            // InternalUseCaseDslParser.g:2781:1: ( ( rule__ExtensionStep__Alternatives_1_2 )? )
            // InternalUseCaseDslParser.g:2782:2: ( rule__ExtensionStep__Alternatives_1_2 )?
            {
             before(grammarAccess.getExtensionStepAccess().getAlternatives_1_2()); 
            // InternalUseCaseDslParser.g:2783:2: ( rule__ExtensionStep__Alternatives_1_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=SYSTEM && LA25_0<=WHILE)||LA25_0==USER) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUseCaseDslParser.g:2783:3: rule__ExtensionStep__Alternatives_1_2
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
    // InternalUseCaseDslParser.g:2791:1: rule__ExtensionStep__Group_1__3 : rule__ExtensionStep__Group_1__3__Impl ;
    public final void rule__ExtensionStep__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2795:1: ( rule__ExtensionStep__Group_1__3__Impl )
            // InternalUseCaseDslParser.g:2796:2: rule__ExtensionStep__Group_1__3__Impl
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
    // InternalUseCaseDslParser.g:2802:1: rule__ExtensionStep__Group_1__3__Impl : ( ( rule__ExtensionStep__SentenceAssignment_1_3 ) ) ;
    public final void rule__ExtensionStep__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2806:1: ( ( ( rule__ExtensionStep__SentenceAssignment_1_3 ) ) )
            // InternalUseCaseDslParser.g:2807:1: ( ( rule__ExtensionStep__SentenceAssignment_1_3 ) )
            {
            // InternalUseCaseDslParser.g:2807:1: ( ( rule__ExtensionStep__SentenceAssignment_1_3 ) )
            // InternalUseCaseDslParser.g:2808:2: ( rule__ExtensionStep__SentenceAssignment_1_3 )
            {
             before(grammarAccess.getExtensionStepAccess().getSentenceAssignment_1_3()); 
            // InternalUseCaseDslParser.g:2809:2: ( rule__ExtensionStep__SentenceAssignment_1_3 )
            // InternalUseCaseDslParser.g:2809:3: rule__ExtensionStep__SentenceAssignment_1_3
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
    // InternalUseCaseDslParser.g:2818:1: rule__DeadEndStep__Group__0 : rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1 ;
    public final void rule__DeadEndStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2822:1: ( rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1 )
            // InternalUseCaseDslParser.g:2823:2: rule__DeadEndStep__Group__0__Impl rule__DeadEndStep__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:2830:1: rule__DeadEndStep__Group__0__Impl : ( ( rule__DeadEndStep__NameAssignment_0 ) ) ;
    public final void rule__DeadEndStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2834:1: ( ( ( rule__DeadEndStep__NameAssignment_0 ) ) )
            // InternalUseCaseDslParser.g:2835:1: ( ( rule__DeadEndStep__NameAssignment_0 ) )
            {
            // InternalUseCaseDslParser.g:2835:1: ( ( rule__DeadEndStep__NameAssignment_0 ) )
            // InternalUseCaseDslParser.g:2836:2: ( rule__DeadEndStep__NameAssignment_0 )
            {
             before(grammarAccess.getDeadEndStepAccess().getNameAssignment_0()); 
            // InternalUseCaseDslParser.g:2837:2: ( rule__DeadEndStep__NameAssignment_0 )
            // InternalUseCaseDslParser.g:2837:3: rule__DeadEndStep__NameAssignment_0
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
    // InternalUseCaseDslParser.g:2845:1: rule__DeadEndStep__Group__1 : rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2 ;
    public final void rule__DeadEndStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2849:1: ( rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2 )
            // InternalUseCaseDslParser.g:2850:2: rule__DeadEndStep__Group__1__Impl rule__DeadEndStep__Group__2
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
    // InternalUseCaseDslParser.g:2857:1: rule__DeadEndStep__Group__1__Impl : ( FullStop ) ;
    public final void rule__DeadEndStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2861:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:2862:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:2862:1: ( FullStop )
            // InternalUseCaseDslParser.g:2863:2: FullStop
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
    // InternalUseCaseDslParser.g:2872:1: rule__DeadEndStep__Group__2 : rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3 ;
    public final void rule__DeadEndStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2876:1: ( rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3 )
            // InternalUseCaseDslParser.g:2877:2: rule__DeadEndStep__Group__2__Impl rule__DeadEndStep__Group__3
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
    // InternalUseCaseDslParser.g:2884:1: rule__DeadEndStep__Group__2__Impl : ( ( rule__DeadEndStep__Alternatives_2 )? ) ;
    public final void rule__DeadEndStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2888:1: ( ( ( rule__DeadEndStep__Alternatives_2 )? ) )
            // InternalUseCaseDslParser.g:2889:1: ( ( rule__DeadEndStep__Alternatives_2 )? )
            {
            // InternalUseCaseDslParser.g:2889:1: ( ( rule__DeadEndStep__Alternatives_2 )? )
            // InternalUseCaseDslParser.g:2890:2: ( rule__DeadEndStep__Alternatives_2 )?
            {
             before(grammarAccess.getDeadEndStepAccess().getAlternatives_2()); 
            // InternalUseCaseDslParser.g:2891:2: ( rule__DeadEndStep__Alternatives_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=SYSTEM && LA26_0<=WHILE)||LA26_0==USER) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUseCaseDslParser.g:2891:3: rule__DeadEndStep__Alternatives_2
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
    // InternalUseCaseDslParser.g:2899:1: rule__DeadEndStep__Group__3 : rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4 ;
    public final void rule__DeadEndStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2903:1: ( rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4 )
            // InternalUseCaseDslParser.g:2904:2: rule__DeadEndStep__Group__3__Impl rule__DeadEndStep__Group__4
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
    // InternalUseCaseDslParser.g:2911:1: rule__DeadEndStep__Group__3__Impl : ( ( rule__DeadEndStep__SentenceAssignment_3 )? ) ;
    public final void rule__DeadEndStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2915:1: ( ( ( rule__DeadEndStep__SentenceAssignment_3 )? ) )
            // InternalUseCaseDslParser.g:2916:1: ( ( rule__DeadEndStep__SentenceAssignment_3 )? )
            {
            // InternalUseCaseDslParser.g:2916:1: ( ( rule__DeadEndStep__SentenceAssignment_3 )? )
            // InternalUseCaseDslParser.g:2917:2: ( rule__DeadEndStep__SentenceAssignment_3 )?
            {
             before(grammarAccess.getDeadEndStepAccess().getSentenceAssignment_3()); 
            // InternalUseCaseDslParser.g:2918:2: ( rule__DeadEndStep__SentenceAssignment_3 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=QuotationMark && LA27_0<=RULE_CHAR)||LA27_0==RULE_ID||LA27_0==RULE_ANY_OTHER) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUseCaseDslParser.g:2918:3: rule__DeadEndStep__SentenceAssignment_3
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
    // InternalUseCaseDslParser.g:2926:1: rule__DeadEndStep__Group__4 : rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5 ;
    public final void rule__DeadEndStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2930:1: ( rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5 )
            // InternalUseCaseDslParser.g:2931:2: rule__DeadEndStep__Group__4__Impl rule__DeadEndStep__Group__5
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
    // InternalUseCaseDslParser.g:2938:1: rule__DeadEndStep__Group__4__Impl : ( UC ) ;
    public final void rule__DeadEndStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2942:1: ( ( UC ) )
            // InternalUseCaseDslParser.g:2943:1: ( UC )
            {
            // InternalUseCaseDslParser.g:2943:1: ( UC )
            // InternalUseCaseDslParser.g:2944:2: UC
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
    // InternalUseCaseDslParser.g:2953:1: rule__DeadEndStep__Group__5 : rule__DeadEndStep__Group__5__Impl ;
    public final void rule__DeadEndStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2957:1: ( rule__DeadEndStep__Group__5__Impl )
            // InternalUseCaseDslParser.g:2958:2: rule__DeadEndStep__Group__5__Impl
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
    // InternalUseCaseDslParser.g:2964:1: rule__DeadEndStep__Group__5__Impl : ( END ) ;
    public final void rule__DeadEndStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2968:1: ( ( END ) )
            // InternalUseCaseDslParser.g:2969:1: ( END )
            {
            // InternalUseCaseDslParser.g:2969:1: ( END )
            // InternalUseCaseDslParser.g:2970:2: END
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
    // InternalUseCaseDslParser.g:2980:1: rule__Precondition__Group__0 : rule__Precondition__Group__0__Impl rule__Precondition__Group__1 ;
    public final void rule__Precondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2984:1: ( rule__Precondition__Group__0__Impl rule__Precondition__Group__1 )
            // InternalUseCaseDslParser.g:2985:2: rule__Precondition__Group__0__Impl rule__Precondition__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCaseDslParser.g:2992:1: rule__Precondition__Group__0__Impl : ( PRECONDITION ) ;
    public final void rule__Precondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:2996:1: ( ( PRECONDITION ) )
            // InternalUseCaseDslParser.g:2997:1: ( PRECONDITION )
            {
            // InternalUseCaseDslParser.g:2997:1: ( PRECONDITION )
            // InternalUseCaseDslParser.g:2998:2: PRECONDITION
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
    // InternalUseCaseDslParser.g:3007:1: rule__Precondition__Group__1 : rule__Precondition__Group__1__Impl rule__Precondition__Group__2 ;
    public final void rule__Precondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3011:1: ( rule__Precondition__Group__1__Impl rule__Precondition__Group__2 )
            // InternalUseCaseDslParser.g:3012:2: rule__Precondition__Group__1__Impl rule__Precondition__Group__2
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
    // InternalUseCaseDslParser.g:3019:1: rule__Precondition__Group__1__Impl : ( Colon ) ;
    public final void rule__Precondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3023:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:3024:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:3024:1: ( Colon )
            // InternalUseCaseDslParser.g:3025:2: Colon
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
    // InternalUseCaseDslParser.g:3034:1: rule__Precondition__Group__2 : rule__Precondition__Group__2__Impl ;
    public final void rule__Precondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3038:1: ( rule__Precondition__Group__2__Impl )
            // InternalUseCaseDslParser.g:3039:2: rule__Precondition__Group__2__Impl
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
    // InternalUseCaseDslParser.g:3045:1: rule__Precondition__Group__2__Impl : ( ( rule__Precondition__ConditionAssignment_2 ) ) ;
    public final void rule__Precondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3049:1: ( ( ( rule__Precondition__ConditionAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:3050:1: ( ( rule__Precondition__ConditionAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:3050:1: ( ( rule__Precondition__ConditionAssignment_2 ) )
            // InternalUseCaseDslParser.g:3051:2: ( rule__Precondition__ConditionAssignment_2 )
            {
             before(grammarAccess.getPreconditionAccess().getConditionAssignment_2()); 
            // InternalUseCaseDslParser.g:3052:2: ( rule__Precondition__ConditionAssignment_2 )
            // InternalUseCaseDslParser.g:3052:3: rule__Precondition__ConditionAssignment_2
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
    // InternalUseCaseDslParser.g:3061:1: rule__Postcondition__Group__0 : rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 ;
    public final void rule__Postcondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3065:1: ( rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1 )
            // InternalUseCaseDslParser.g:3066:2: rule__Postcondition__Group__0__Impl rule__Postcondition__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalUseCaseDslParser.g:3073:1: rule__Postcondition__Group__0__Impl : ( POSTCONDITION ) ;
    public final void rule__Postcondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3077:1: ( ( POSTCONDITION ) )
            // InternalUseCaseDslParser.g:3078:1: ( POSTCONDITION )
            {
            // InternalUseCaseDslParser.g:3078:1: ( POSTCONDITION )
            // InternalUseCaseDslParser.g:3079:2: POSTCONDITION
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
    // InternalUseCaseDslParser.g:3088:1: rule__Postcondition__Group__1 : rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 ;
    public final void rule__Postcondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3092:1: ( rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2 )
            // InternalUseCaseDslParser.g:3093:2: rule__Postcondition__Group__1__Impl rule__Postcondition__Group__2
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
    // InternalUseCaseDslParser.g:3100:1: rule__Postcondition__Group__1__Impl : ( Colon ) ;
    public final void rule__Postcondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3104:1: ( ( Colon ) )
            // InternalUseCaseDslParser.g:3105:1: ( Colon )
            {
            // InternalUseCaseDslParser.g:3105:1: ( Colon )
            // InternalUseCaseDslParser.g:3106:2: Colon
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
    // InternalUseCaseDslParser.g:3115:1: rule__Postcondition__Group__2 : rule__Postcondition__Group__2__Impl ;
    public final void rule__Postcondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3119:1: ( rule__Postcondition__Group__2__Impl )
            // InternalUseCaseDslParser.g:3120:2: rule__Postcondition__Group__2__Impl
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
    // InternalUseCaseDslParser.g:3126:1: rule__Postcondition__Group__2__Impl : ( ( rule__Postcondition__ConditionAssignment_2 ) ) ;
    public final void rule__Postcondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3130:1: ( ( ( rule__Postcondition__ConditionAssignment_2 ) ) )
            // InternalUseCaseDslParser.g:3131:1: ( ( rule__Postcondition__ConditionAssignment_2 ) )
            {
            // InternalUseCaseDslParser.g:3131:1: ( ( rule__Postcondition__ConditionAssignment_2 ) )
            // InternalUseCaseDslParser.g:3132:2: ( rule__Postcondition__ConditionAssignment_2 )
            {
             before(grammarAccess.getPostconditionAccess().getConditionAssignment_2()); 
            // InternalUseCaseDslParser.g:3133:2: ( rule__Postcondition__ConditionAssignment_2 )
            // InternalUseCaseDslParser.g:3133:3: rule__Postcondition__ConditionAssignment_2
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
    // InternalUseCaseDslParser.g:3142:1: rule__QualifiedStepName__Group__0 : rule__QualifiedStepName__Group__0__Impl rule__QualifiedStepName__Group__1 ;
    public final void rule__QualifiedStepName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3146:1: ( rule__QualifiedStepName__Group__0__Impl rule__QualifiedStepName__Group__1 )
            // InternalUseCaseDslParser.g:3147:2: rule__QualifiedStepName__Group__0__Impl rule__QualifiedStepName__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:3154:1: rule__QualifiedStepName__Group__0__Impl : ( ruleStepName ) ;
    public final void rule__QualifiedStepName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3158:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3159:1: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3159:1: ( ruleStepName )
            // InternalUseCaseDslParser.g:3160:2: ruleStepName
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
    // InternalUseCaseDslParser.g:3169:1: rule__QualifiedStepName__Group__1 : rule__QualifiedStepName__Group__1__Impl ;
    public final void rule__QualifiedStepName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3173:1: ( rule__QualifiedStepName__Group__1__Impl )
            // InternalUseCaseDslParser.g:3174:2: rule__QualifiedStepName__Group__1__Impl
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
    // InternalUseCaseDslParser.g:3180:1: rule__QualifiedStepName__Group__1__Impl : ( ( rule__QualifiedStepName__Group_1__0 )* ) ;
    public final void rule__QualifiedStepName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3184:1: ( ( ( rule__QualifiedStepName__Group_1__0 )* ) )
            // InternalUseCaseDslParser.g:3185:1: ( ( rule__QualifiedStepName__Group_1__0 )* )
            {
            // InternalUseCaseDslParser.g:3185:1: ( ( rule__QualifiedStepName__Group_1__0 )* )
            // InternalUseCaseDslParser.g:3186:2: ( rule__QualifiedStepName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedStepNameAccess().getGroup_1()); 
            // InternalUseCaseDslParser.g:3187:2: ( rule__QualifiedStepName__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==FullStop) ) {
                    int LA28_2 = input.LA(2);

                    if ( (LA28_2==RULE_INT) ) {
                        int LA28_3 = input.LA(3);

                        if ( (LA28_3==FullStop) ) {
                            int LA28_4 = input.LA(4);

                            if ( (LA28_4==RULE_CHAR||LA28_4==RULE_INT) ) {
                                alt28=1;
                            }


                        }
                        else if ( (LA28_3==EOF||LA28_3==RULE_END||LA28_3==RULE_INT) ) {
                            alt28=1;
                        }


                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:3187:3: rule__QualifiedStepName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__QualifiedStepName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalUseCaseDslParser.g:3196:1: rule__QualifiedStepName__Group_1__0 : rule__QualifiedStepName__Group_1__0__Impl rule__QualifiedStepName__Group_1__1 ;
    public final void rule__QualifiedStepName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3200:1: ( rule__QualifiedStepName__Group_1__0__Impl rule__QualifiedStepName__Group_1__1 )
            // InternalUseCaseDslParser.g:3201:2: rule__QualifiedStepName__Group_1__0__Impl rule__QualifiedStepName__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalUseCaseDslParser.g:3208:1: rule__QualifiedStepName__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__QualifiedStepName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3212:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:3213:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:3213:1: ( FullStop )
            // InternalUseCaseDslParser.g:3214:2: FullStop
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
    // InternalUseCaseDslParser.g:3223:1: rule__QualifiedStepName__Group_1__1 : rule__QualifiedStepName__Group_1__1__Impl ;
    public final void rule__QualifiedStepName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3227:1: ( rule__QualifiedStepName__Group_1__1__Impl )
            // InternalUseCaseDslParser.g:3228:2: rule__QualifiedStepName__Group_1__1__Impl
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
    // InternalUseCaseDslParser.g:3234:1: rule__QualifiedStepName__Group_1__1__Impl : ( ruleStepName ) ;
    public final void rule__QualifiedStepName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3238:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3239:1: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3239:1: ( ruleStepName )
            // InternalUseCaseDslParser.g:3240:2: ruleStepName
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
    // InternalUseCaseDslParser.g:3250:1: rule__QualifiedExtensionStepName__Group__0 : rule__QualifiedExtensionStepName__Group__0__Impl rule__QualifiedExtensionStepName__Group__1 ;
    public final void rule__QualifiedExtensionStepName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3254:1: ( rule__QualifiedExtensionStepName__Group__0__Impl rule__QualifiedExtensionStepName__Group__1 )
            // InternalUseCaseDslParser.g:3255:2: rule__QualifiedExtensionStepName__Group__0__Impl rule__QualifiedExtensionStepName__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:3262:1: rule__QualifiedExtensionStepName__Group__0__Impl : ( ruleQualifiedStepName ) ;
    public final void rule__QualifiedExtensionStepName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3266:1: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3267:1: ( ruleQualifiedStepName )
            {
            // InternalUseCaseDslParser.g:3267:1: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3268:2: ruleQualifiedStepName
            {
             before(grammarAccess.getQualifiedExtensionStepNameAccess().getQualifiedStepNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedStepName();

            state._fsp--;

             after(grammarAccess.getQualifiedExtensionStepNameAccess().getQualifiedStepNameParserRuleCall_0()); 

            }


            }

        }
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
    // InternalUseCaseDslParser.g:3277:1: rule__QualifiedExtensionStepName__Group__1 : rule__QualifiedExtensionStepName__Group__1__Impl rule__QualifiedExtensionStepName__Group__2 ;
    public final void rule__QualifiedExtensionStepName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3281:1: ( rule__QualifiedExtensionStepName__Group__1__Impl rule__QualifiedExtensionStepName__Group__2 )
            // InternalUseCaseDslParser.g:3282:2: rule__QualifiedExtensionStepName__Group__1__Impl rule__QualifiedExtensionStepName__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalUseCaseDslParser.g:3289:1: rule__QualifiedExtensionStepName__Group__1__Impl : ( FullStop ) ;
    public final void rule__QualifiedExtensionStepName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3293:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:3294:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:3294:1: ( FullStop )
            // InternalUseCaseDslParser.g:3295:2: FullStop
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
    // InternalUseCaseDslParser.g:3304:1: rule__QualifiedExtensionStepName__Group__2 : rule__QualifiedExtensionStepName__Group__2__Impl rule__QualifiedExtensionStepName__Group__3 ;
    public final void rule__QualifiedExtensionStepName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3308:1: ( rule__QualifiedExtensionStepName__Group__2__Impl rule__QualifiedExtensionStepName__Group__3 )
            // InternalUseCaseDslParser.g:3309:2: rule__QualifiedExtensionStepName__Group__2__Impl rule__QualifiedExtensionStepName__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__QualifiedExtensionStepName__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedExtensionStepName__Group__3();

            state._fsp--;


            }

        }
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
    // InternalUseCaseDslParser.g:3316:1: rule__QualifiedExtensionStepName__Group__2__Impl : ( RULE_CHAR ) ;
    public final void rule__QualifiedExtensionStepName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3320:1: ( ( RULE_CHAR ) )
            // InternalUseCaseDslParser.g:3321:1: ( RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:3321:1: ( RULE_CHAR )
            // InternalUseCaseDslParser.g:3322:2: RULE_CHAR
            {
             before(grammarAccess.getQualifiedExtensionStepNameAccess().getCHARTerminalRuleCall_2()); 
            match(input,RULE_CHAR,FOLLOW_2); 
             after(grammarAccess.getQualifiedExtensionStepNameAccess().getCHARTerminalRuleCall_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__QualifiedExtensionStepName__Group__3"
    // InternalUseCaseDslParser.g:3331:1: rule__QualifiedExtensionStepName__Group__3 : rule__QualifiedExtensionStepName__Group__3__Impl rule__QualifiedExtensionStepName__Group__4 ;
    public final void rule__QualifiedExtensionStepName__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3335:1: ( rule__QualifiedExtensionStepName__Group__3__Impl rule__QualifiedExtensionStepName__Group__4 )
            // InternalUseCaseDslParser.g:3336:2: rule__QualifiedExtensionStepName__Group__3__Impl rule__QualifiedExtensionStepName__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedExtensionStepName__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedExtensionStepName__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedExtensionStepName__Group__3"


    // $ANTLR start "rule__QualifiedExtensionStepName__Group__3__Impl"
    // InternalUseCaseDslParser.g:3343:1: rule__QualifiedExtensionStepName__Group__3__Impl : ( FullStop ) ;
    public final void rule__QualifiedExtensionStepName__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3347:1: ( ( FullStop ) )
            // InternalUseCaseDslParser.g:3348:1: ( FullStop )
            {
            // InternalUseCaseDslParser.g:3348:1: ( FullStop )
            // InternalUseCaseDslParser.g:3349:2: FullStop
            {
             before(grammarAccess.getQualifiedExtensionStepNameAccess().getFullStopKeyword_3()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getQualifiedExtensionStepNameAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedExtensionStepName__Group__3__Impl"


    // $ANTLR start "rule__QualifiedExtensionStepName__Group__4"
    // InternalUseCaseDslParser.g:3358:1: rule__QualifiedExtensionStepName__Group__4 : rule__QualifiedExtensionStepName__Group__4__Impl ;
    public final void rule__QualifiedExtensionStepName__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3362:1: ( rule__QualifiedExtensionStepName__Group__4__Impl )
            // InternalUseCaseDslParser.g:3363:2: rule__QualifiedExtensionStepName__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedExtensionStepName__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedExtensionStepName__Group__4"


    // $ANTLR start "rule__QualifiedExtensionStepName__Group__4__Impl"
    // InternalUseCaseDslParser.g:3369:1: rule__QualifiedExtensionStepName__Group__4__Impl : ( ruleQualifiedStepName ) ;
    public final void rule__QualifiedExtensionStepName__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3373:1: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3374:1: ( ruleQualifiedStepName )
            {
            // InternalUseCaseDslParser.g:3374:1: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3375:2: ruleQualifiedStepName
            {
             before(grammarAccess.getQualifiedExtensionStepNameAccess().getQualifiedStepNameParserRuleCall_4()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedStepName();

            state._fsp--;

             after(grammarAccess.getQualifiedExtensionStepNameAccess().getQualifiedStepNameParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedExtensionStepName__Group__4__Impl"


    // $ANTLR start "rule__UseCaseDocument__UsecaseAssignment"
    // InternalUseCaseDslParser.g:3385:1: rule__UseCaseDocument__UsecaseAssignment : ( ruleUseCase ) ;
    public final void rule__UseCaseDocument__UsecaseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3389:1: ( ( ruleUseCase ) )
            // InternalUseCaseDslParser.g:3390:2: ( ruleUseCase )
            {
            // InternalUseCaseDslParser.g:3390:2: ( ruleUseCase )
            // InternalUseCaseDslParser.g:3391:3: ruleUseCase
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
    // InternalUseCaseDslParser.g:3400:1: rule__UseCase__NumberAssignment_1 : ( RULE_INT ) ;
    public final void rule__UseCase__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3404:1: ( ( RULE_INT ) )
            // InternalUseCaseDslParser.g:3405:2: ( RULE_INT )
            {
            // InternalUseCaseDslParser.g:3405:2: ( RULE_INT )
            // InternalUseCaseDslParser.g:3406:3: RULE_INT
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
    // InternalUseCaseDslParser.g:3415:1: rule__UseCase__NameAssignment_3 : ( ruleLongName ) ;
    public final void rule__UseCase__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3419:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3420:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3420:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3421:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3430:1: rule__UseCase__PreconditionAssignment_4 : ( rulePrecondition ) ;
    public final void rule__UseCase__PreconditionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3434:1: ( ( rulePrecondition ) )
            // InternalUseCaseDslParser.g:3435:2: ( rulePrecondition )
            {
            // InternalUseCaseDslParser.g:3435:2: ( rulePrecondition )
            // InternalUseCaseDslParser.g:3436:3: rulePrecondition
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
    // InternalUseCaseDslParser.g:3445:1: rule__UseCase__PostconditionAssignment_5 : ( rulePostcondition ) ;
    public final void rule__UseCase__PostconditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3449:1: ( ( rulePostcondition ) )
            // InternalUseCaseDslParser.g:3450:2: ( rulePostcondition )
            {
            // InternalUseCaseDslParser.g:3450:2: ( rulePostcondition )
            // InternalUseCaseDslParser.g:3451:3: rulePostcondition
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
    // InternalUseCaseDslParser.g:3460:1: rule__UseCase__StepsAssignment_10 : ( ruleUseCaseStep ) ;
    public final void rule__UseCase__StepsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3464:1: ( ( ruleUseCaseStep ) )
            // InternalUseCaseDslParser.g:3465:2: ( ruleUseCaseStep )
            {
            // InternalUseCaseDslParser.g:3465:2: ( ruleUseCaseStep )
            // InternalUseCaseDslParser.g:3466:3: ruleUseCaseStep
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
    // InternalUseCaseDslParser.g:3475:1: rule__UseCase__AlternativeflowsAssignment_12_3 : ( ruleExtension ) ;
    public final void rule__UseCase__AlternativeflowsAssignment_12_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3479:1: ( ( ruleExtension ) )
            // InternalUseCaseDslParser.g:3480:2: ( ruleExtension )
            {
            // InternalUseCaseDslParser.g:3480:2: ( ruleExtension )
            // InternalUseCaseDslParser.g:3481:3: ruleExtension
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
    // InternalUseCaseDslParser.g:3490:1: rule__Extension__StartFromAssignment_0_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__Extension__StartFromAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3494:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3495:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3495:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3496:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getExtensionAccess().getStartFromUseCaseStepCrossReference_0_0_0()); 
            // InternalUseCaseDslParser.g:3497:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3498:4: ruleQualifiedStepName
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
    // InternalUseCaseDslParser.g:3509:1: rule__Extension__StartFromAssignment_0_1 : ( ( ruleQualifiedExtensionStepName ) ) ;
    public final void rule__Extension__StartFromAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3513:1: ( ( ( ruleQualifiedExtensionStepName ) ) )
            // InternalUseCaseDslParser.g:3514:2: ( ( ruleQualifiedExtensionStepName ) )
            {
            // InternalUseCaseDslParser.g:3514:2: ( ( ruleQualifiedExtensionStepName ) )
            // InternalUseCaseDslParser.g:3515:3: ( ruleQualifiedExtensionStepName )
            {
             before(grammarAccess.getExtensionAccess().getStartFromExtensionStepCrossReference_0_1_0()); 
            // InternalUseCaseDslParser.g:3516:3: ( ruleQualifiedExtensionStepName )
            // InternalUseCaseDslParser.g:3517:4: ruleQualifiedExtensionStepName
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
    // InternalUseCaseDslParser.g:3528:1: rule__Extension__NameAssignment_2 : ( RULE_CHAR ) ;
    public final void rule__Extension__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3532:1: ( ( RULE_CHAR ) )
            // InternalUseCaseDslParser.g:3533:2: ( RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:3533:2: ( RULE_CHAR )
            // InternalUseCaseDslParser.g:3534:3: RULE_CHAR
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
    // InternalUseCaseDslParser.g:3543:1: rule__Extension__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__Extension__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3547:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3548:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3548:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3549:3: ruleCondition
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
    // InternalUseCaseDslParser.g:3558:1: rule__Extension__StepsAssignment_7 : ( ruleExtensionStep ) ;
    public final void rule__Extension__StepsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3562:1: ( ( ruleExtensionStep ) )
            // InternalUseCaseDslParser.g:3563:2: ( ruleExtensionStep )
            {
            // InternalUseCaseDslParser.g:3563:2: ( ruleExtensionStep )
            // InternalUseCaseDslParser.g:3564:3: ruleExtensionStep
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
    // InternalUseCaseDslParser.g:3573:1: rule__Extension__ResumeAtAssignment_8_0_4_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__Extension__ResumeAtAssignment_8_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3577:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3578:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3578:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3579:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getExtensionAccess().getResumeAtUseCaseStepCrossReference_8_0_4_0_0()); 
            // InternalUseCaseDslParser.g:3580:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3581:4: ruleQualifiedStepName
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
    // InternalUseCaseDslParser.g:3592:1: rule__Extension__ResumeAtAssignment_8_0_4_1 : ( ( ruleQualifiedExtensionStepName ) ) ;
    public final void rule__Extension__ResumeAtAssignment_8_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3596:1: ( ( ( ruleQualifiedExtensionStepName ) ) )
            // InternalUseCaseDslParser.g:3597:2: ( ( ruleQualifiedExtensionStepName ) )
            {
            // InternalUseCaseDslParser.g:3597:2: ( ( ruleQualifiedExtensionStepName ) )
            // InternalUseCaseDslParser.g:3598:3: ( ruleQualifiedExtensionStepName )
            {
             before(grammarAccess.getExtensionAccess().getResumeAtExtensionStepCrossReference_8_0_4_1_0()); 
            // InternalUseCaseDslParser.g:3599:3: ( ruleQualifiedExtensionStepName )
            // InternalUseCaseDslParser.g:3600:4: ruleQualifiedExtensionStepName
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
    // InternalUseCaseDslParser.g:3611:1: rule__Extension__EndAssignment_8_1 : ( ruleDeadEndStep ) ;
    public final void rule__Extension__EndAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3615:1: ( ( ruleDeadEndStep ) )
            // InternalUseCaseDslParser.g:3616:2: ( ruleDeadEndStep )
            {
            // InternalUseCaseDslParser.g:3616:2: ( ruleDeadEndStep )
            // InternalUseCaseDslParser.g:3617:3: ruleDeadEndStep
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
    // InternalUseCaseDslParser.g:3626:1: rule__UseCaseStep__ParentAssignment_0_0_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__UseCaseStep__ParentAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3630:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3631:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3631:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3632:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_0_0_0_0()); 
            // InternalUseCaseDslParser.g:3633:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3634:4: ruleQualifiedStepName
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
    // InternalUseCaseDslParser.g:3645:1: rule__UseCaseStep__NameAssignment_0_1 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3649:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3650:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3650:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3651:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3660:1: rule__UseCaseStep__ReferenceAssignment_0_4 : ( ( ruleLongName ) ) ;
    public final void rule__UseCaseStep__ReferenceAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3664:1: ( ( ( ruleLongName ) ) )
            // InternalUseCaseDslParser.g:3665:2: ( ( ruleLongName ) )
            {
            // InternalUseCaseDslParser.g:3665:2: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3666:3: ( ruleLongName )
            {
             before(grammarAccess.getUseCaseStepAccess().getReferenceUseCaseCrossReference_0_4_0()); 
            // InternalUseCaseDslParser.g:3667:3: ( ruleLongName )
            // InternalUseCaseDslParser.g:3668:4: ruleLongName
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
    // InternalUseCaseDslParser.g:3679:1: rule__UseCaseStep__ParentAssignment_1_1_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__UseCaseStep__ParentAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3683:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3684:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3684:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3685:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_1_1_0_0()); 
            // InternalUseCaseDslParser.g:3686:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3687:4: ruleQualifiedStepName
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
    // InternalUseCaseDslParser.g:3698:1: rule__UseCaseStep__NameAssignment_1_2 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3702:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3703:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3703:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3704:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3713:1: rule__UseCaseStep__SentenceAssignment_1_5 : ( ruleLongName ) ;
    public final void rule__UseCaseStep__SentenceAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3717:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3718:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3718:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3719:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3728:1: rule__UseCaseStep__ParentAssignment_2_1_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__UseCaseStep__ParentAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3732:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3733:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3733:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3734:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_2_1_0_0()); 
            // InternalUseCaseDslParser.g:3735:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3736:4: ruleQualifiedStepName
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
    // InternalUseCaseDslParser.g:3747:1: rule__UseCaseStep__NameAssignment_2_2 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3751:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3752:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3752:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3753:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3762:1: rule__UseCaseStep__SentenceAssignment_2_5 : ( ruleLongName ) ;
    public final void rule__UseCaseStep__SentenceAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3766:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3767:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3767:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3768:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3777:1: rule__UseCaseStep__ParentAssignment_3_1_0 : ( ( ruleQualifiedStepName ) ) ;
    public final void rule__UseCaseStep__ParentAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3781:1: ( ( ( ruleQualifiedStepName ) ) )
            // InternalUseCaseDslParser.g:3782:2: ( ( ruleQualifiedStepName ) )
            {
            // InternalUseCaseDslParser.g:3782:2: ( ( ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:3783:3: ( ruleQualifiedStepName )
            {
             before(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_3_1_0_0()); 
            // InternalUseCaseDslParser.g:3784:3: ( ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:3785:4: ruleQualifiedStepName
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
    // InternalUseCaseDslParser.g:3796:1: rule__UseCaseStep__NameAssignment_3_2 : ( ruleStepName ) ;
    public final void rule__UseCaseStep__NameAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3800:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3801:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3801:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3802:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3811:1: rule__UseCaseStep__RepeatingConditionAssignment_3_5 : ( ruleCondition ) ;
    public final void rule__UseCaseStep__RepeatingConditionAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3815:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3816:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3816:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3817:3: ruleCondition
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
    // InternalUseCaseDslParser.g:3826:1: rule__UseCaseStep__StepsAssignment_3_7 : ( ruleUseCaseStep ) ;
    public final void rule__UseCaseStep__StepsAssignment_3_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3830:1: ( ( ruleUseCaseStep ) )
            // InternalUseCaseDslParser.g:3831:2: ( ruleUseCaseStep )
            {
            // InternalUseCaseDslParser.g:3831:2: ( ruleUseCaseStep )
            // InternalUseCaseDslParser.g:3832:3: ruleUseCaseStep
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
    // InternalUseCaseDslParser.g:3841:1: rule__ExtensionStep__NameAssignment_0_0 : ( ruleStepName ) ;
    public final void rule__ExtensionStep__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3845:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3846:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3846:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3847:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3856:1: rule__ExtensionStep__ReferenceAssignment_0_3 : ( ( ruleLongName ) ) ;
    public final void rule__ExtensionStep__ReferenceAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3860:1: ( ( ( ruleLongName ) ) )
            // InternalUseCaseDslParser.g:3861:2: ( ( ruleLongName ) )
            {
            // InternalUseCaseDslParser.g:3861:2: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3862:3: ( ruleLongName )
            {
             before(grammarAccess.getExtensionStepAccess().getReferenceUseCaseCrossReference_0_3_0()); 
            // InternalUseCaseDslParser.g:3863:3: ( ruleLongName )
            // InternalUseCaseDslParser.g:3864:4: ruleLongName
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
    // InternalUseCaseDslParser.g:3875:1: rule__ExtensionStep__NameAssignment_1_0 : ( ruleStepName ) ;
    public final void rule__ExtensionStep__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3879:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3880:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3880:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3881:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3890:1: rule__ExtensionStep__SentenceAssignment_1_3 : ( ruleLongName ) ;
    public final void rule__ExtensionStep__SentenceAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3894:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3895:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3895:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3896:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3905:1: rule__DeadEndStep__NameAssignment_0 : ( ruleStepName ) ;
    public final void rule__DeadEndStep__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3909:1: ( ( ruleStepName ) )
            // InternalUseCaseDslParser.g:3910:2: ( ruleStepName )
            {
            // InternalUseCaseDslParser.g:3910:2: ( ruleStepName )
            // InternalUseCaseDslParser.g:3911:3: ruleStepName
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
    // InternalUseCaseDslParser.g:3920:1: rule__DeadEndStep__SentenceAssignment_3 : ( ruleLongName ) ;
    public final void rule__DeadEndStep__SentenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3924:1: ( ( ruleLongName ) )
            // InternalUseCaseDslParser.g:3925:2: ( ruleLongName )
            {
            // InternalUseCaseDslParser.g:3925:2: ( ruleLongName )
            // InternalUseCaseDslParser.g:3926:3: ruleLongName
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
    // InternalUseCaseDslParser.g:3935:1: rule__Precondition__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Precondition__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3939:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3940:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3940:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3941:3: ruleCondition
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
    // InternalUseCaseDslParser.g:3950:1: rule__Postcondition__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Postcondition__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUseCaseDslParser.g:3954:1: ( ( ruleCondition ) )
            // InternalUseCaseDslParser.g:3955:2: ( ruleCondition )
            {
            // InternalUseCaseDslParser.g:3955:2: ( ruleCondition )
            // InternalUseCaseDslParser.g:3956:3: ruleCondition
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
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\34\1\26\1\30\2\26\1\20\2\uffff";
    static final String dfa_3s = "\1\34\1\26\1\34\2\26\1\34\2\uffff";
    static final String dfa_4s = "\6\uffff\1\2\1\1";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\3\uffff\1\3",
            "\1\2",
            "\1\5",
            "\1\7\13\uffff\1\6",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "427:1: rule__Extension__Alternatives_0 : ( ( ( rule__Extension__StartFromAssignment_0_0 ) ) | ( ( rule__Extension__StartFromAssignment_0_1 ) ) );";
        }
    }
    static final String dfa_7s = "\6\uffff";
    static final String dfa_8s = "\1\34\1\26\1\30\1\uffff\1\26\1\uffff";
    static final String dfa_9s = "\1\34\1\32\1\34\1\uffff\1\32\1\uffff";
    static final String dfa_10s = "\3\uffff\1\1\1\uffff\1\2";
    static final String dfa_11s = "\6\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2\3\uffff\1\3",
            "\1\5\3\uffff\1\4",
            "",
            "\1\2\3\uffff\1\3",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "469:1: rule__Extension__Alternatives_8_0_4 : ( ( ( rule__Extension__ResumeAtAssignment_8_0_4_0 ) ) | ( ( rule__Extension__ResumeAtAssignment_8_0_4_1 ) ) );";
        }
    }
    static final String dfa_13s = "\1\34\1\26\1\7\1\26\4\uffff";
    static final String dfa_14s = "\1\34\1\26\1\34\1\26\4\uffff";
    static final String dfa_15s = "\4\uffff\1\1\1\3\1\4\1\2";
    static final String[] dfa_16s = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\5\1\6\2\uffff\1\7\16\uffff\1\3",
            "\1\2",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_5;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "490:1: rule__UseCaseStep__Alternatives : ( ( ( rule__UseCaseStep__Group_0__0 ) ) | ( ( rule__UseCaseStep__Group_1__0 ) ) | ( ( rule__UseCaseStep__Group_2__0 ) ) | ( ( rule__UseCaseStep__Group_3__0 ) ) );";
        }
    }
    static final String dfa_17s = "\27\uffff";
    static final String dfa_18s = "\7\uffff\7\26\1\uffff\7\26\1\uffff";
    static final String dfa_19s = "\1\34\1\26\1\7\1\uffff\12\23\1\uffff\7\23\1\uffff";
    static final String dfa_20s = "\1\34\1\26\1\41\1\uffff\12\41\1\uffff\7\41\1\uffff";
    static final String dfa_21s = "\3\uffff\1\1\12\uffff\1\3\7\uffff\1\2";
    static final String dfa_22s = "\27\uffff}>";
    static final String[] dfa_23s = {
            "\1\1",
            "\1\2",
            "\1\3\1\uffff\1\5\1\6\2\uffff\1\4\5\uffff\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
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

    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_17;
            this.eof = dfa_18;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "523:1: rule__ExtensionStep__Alternatives : ( ( ( rule__ExtensionStep__Group_0__0 ) ) | ( ( rule__ExtensionStep__Group_1__0 ) ) | ( ruleDeadEndStep ) );";
        }
    }
    static final String dfa_24s = "\30\uffff";
    static final String dfa_25s = "\1\34\1\26\1\7\2\uffff\12\23\1\17\7\23\1\32";
    static final String dfa_26s = "\1\34\1\26\1\41\2\uffff\12\41\1\17\7\41\1\34";
    static final String dfa_27s = "\3\uffff\1\1\1\2\23\uffff";
    static final String dfa_28s = "\30\uffff}>";
    static final String[] dfa_29s = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\6\1\7\2\uffff\1\5\5\uffff\1\17\1\15\1\16\1\14\1\13\1\12\2\uffff\1\10\5\uffff\1\11",
            "",
            "",
            "\1\17\1\15\1\16\1\14\1\13\1\12\2\uffff\1\10\5\uffff\1\11",
            "\1\17\1\15\1\16\1\14\1\13\1\12\2\uffff\1\10\5\uffff\1\11",
            "\1\17\1\15\1\16\1\14\1\13\1\12\2\uffff\1\10\5\uffff\1\11",
            "\1\17\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\3\4\uffff\1\21",
            "\1\17\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\3\4\uffff\1\21",
            "\1\17\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\3\4\uffff\1\21",
            "\1\17\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\3\4\uffff\1\21",
            "\1\17\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\3\4\uffff\1\21",
            "\1\17\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\3\4\uffff\1\21",
            "\1\17\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\3\4\uffff\1\21",
            "\1\27",
            "\1\17\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\3\4\uffff\1\21",
            "\1\17\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\3\4\uffff\1\21",
            "\1\17\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\3\4\uffff\1\21",
            "\1\17\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\3\4\uffff\1\21",
            "\1\17\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\3\4\uffff\1\21",
            "\1\17\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\3\4\uffff\1\21",
            "\1\17\1\25\1\26\1\24\1\23\1\22\2\uffff\1\20\1\3\4\uffff\1\21",
            "\1\4\1\uffff\1\3"
    };

    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_24;
            this.eof = dfa_24;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_27;
            this.special = dfa_28;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "()* loopback of 1480:2: ( rule__Extension__StepsAssignment_7 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000209F00002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000209F24002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000209F00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
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
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400002L});

}