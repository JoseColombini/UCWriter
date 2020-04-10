package useCase.xtext.useCaseDsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import useCase.xtext.useCaseDsl.services.UseCaseDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseDslParser extends AbstractInternalAntlrParser {
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

        public InternalUseCaseDslParser(TokenStream input, UseCaseDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UseCase";
       	}

       	@Override
       	protected UseCaseDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUseCase"
    // InternalUseCaseDslParser.g:57:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalUseCaseDslParser.g:59:2: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUseCaseDslParser.g:60:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // InternalUseCaseDslParser.g:69:1: ruleUseCase returns [EObject current=null] : (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_postcondition_5_0= rulePostcondition ) )? ( (lv_mainflow_6_0= MAINFLOW ) ) otherlv_7= Colon this_BEGIN_8= RULE_BEGIN ( (lv_steps_9_0= ruleUseCaseStep ) )+ this_END_10= RULE_END ( ( (lv_declareofflow_11_0= ALTERNATIVEFLOW ) ) otherlv_12= Colon this_BEGIN_13= RULE_BEGIN ( (lv_alternativeflows_14_0= ruleExtension ) )+ this_END_15= RULE_END )? ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;
        Token otherlv_2=null;
        Token lv_mainflow_6_0=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token this_END_10=null;
        Token lv_declareofflow_11_0=null;
        Token otherlv_12=null;
        Token this_BEGIN_13=null;
        Token this_END_15=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_precondition_4_0 = null;

        EObject lv_postcondition_5_0 = null;

        EObject lv_steps_9_0 = null;

        EObject lv_alternativeflows_14_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalUseCaseDslParser.g:76:2: ( (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_postcondition_5_0= rulePostcondition ) )? ( (lv_mainflow_6_0= MAINFLOW ) ) otherlv_7= Colon this_BEGIN_8= RULE_BEGIN ( (lv_steps_9_0= ruleUseCaseStep ) )+ this_END_10= RULE_END ( ( (lv_declareofflow_11_0= ALTERNATIVEFLOW ) ) otherlv_12= Colon this_BEGIN_13= RULE_BEGIN ( (lv_alternativeflows_14_0= ruleExtension ) )+ this_END_15= RULE_END )? ) )
            // InternalUseCaseDslParser.g:77:2: (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_postcondition_5_0= rulePostcondition ) )? ( (lv_mainflow_6_0= MAINFLOW ) ) otherlv_7= Colon this_BEGIN_8= RULE_BEGIN ( (lv_steps_9_0= ruleUseCaseStep ) )+ this_END_10= RULE_END ( ( (lv_declareofflow_11_0= ALTERNATIVEFLOW ) ) otherlv_12= Colon this_BEGIN_13= RULE_BEGIN ( (lv_alternativeflows_14_0= ruleExtension ) )+ this_END_15= RULE_END )? )
            {
            // InternalUseCaseDslParser.g:77:2: (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_postcondition_5_0= rulePostcondition ) )? ( (lv_mainflow_6_0= MAINFLOW ) ) otherlv_7= Colon this_BEGIN_8= RULE_BEGIN ( (lv_steps_9_0= ruleUseCaseStep ) )+ this_END_10= RULE_END ( ( (lv_declareofflow_11_0= ALTERNATIVEFLOW ) ) otherlv_12= Colon this_BEGIN_13= RULE_BEGIN ( (lv_alternativeflows_14_0= ruleExtension ) )+ this_END_15= RULE_END )? )
            // InternalUseCaseDslParser.g:78:3: otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_postcondition_5_0= rulePostcondition ) )? ( (lv_mainflow_6_0= MAINFLOW ) ) otherlv_7= Colon this_BEGIN_8= RULE_BEGIN ( (lv_steps_9_0= ruleUseCaseStep ) )+ this_END_10= RULE_END ( ( (lv_declareofflow_11_0= ALTERNATIVEFLOW ) ) otherlv_12= Colon this_BEGIN_13= RULE_BEGIN ( (lv_alternativeflows_14_0= ruleExtension ) )+ this_END_15= RULE_END )?
            {
            otherlv_0=(Token)match(input,UC,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUCKeyword_0());
            		
            // InternalUseCaseDslParser.g:82:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalUseCaseDslParser.g:83:4: (lv_number_1_0= RULE_INT )
            {
            // InternalUseCaseDslParser.g:83:4: (lv_number_1_0= RULE_INT )
            // InternalUseCaseDslParser.g:84:5: lv_number_1_0= RULE_INT
            {
            lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_number_1_0, grammarAccess.getUseCaseAccess().getNumberINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getColonKeyword_2());
            		
            // InternalUseCaseDslParser.g:104:3: ( (lv_name_3_0= ruleLongName ) )
            // InternalUseCaseDslParser.g:105:4: (lv_name_3_0= ruleLongName )
            {
            // InternalUseCaseDslParser.g:105:4: (lv_name_3_0= ruleLongName )
            // InternalUseCaseDslParser.g:106:5: lv_name_3_0= ruleLongName
            {

            					newCompositeNode(grammarAccess.getUseCaseAccess().getNameLongNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleLongName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUseCaseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUseCaseDslParser.g:123:3: ( (lv_precondition_4_0= rulePrecondition ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PRECONDITION) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalUseCaseDslParser.g:124:4: (lv_precondition_4_0= rulePrecondition )
                    {
                    // InternalUseCaseDslParser.g:124:4: (lv_precondition_4_0= rulePrecondition )
                    // InternalUseCaseDslParser.g:125:5: lv_precondition_4_0= rulePrecondition
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getPreconditionPreconditionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_precondition_4_0=rulePrecondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					set(
                    						current,
                    						"precondition",
                    						lv_precondition_4_0,
                    						"useCase.xtext.useCaseDsl.UseCaseDsl.Precondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCaseDslParser.g:142:3: ( (lv_postcondition_5_0= rulePostcondition ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==POSTCONDITION) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalUseCaseDslParser.g:143:4: (lv_postcondition_5_0= rulePostcondition )
                    {
                    // InternalUseCaseDslParser.g:143:4: (lv_postcondition_5_0= rulePostcondition )
                    // InternalUseCaseDslParser.g:144:5: lv_postcondition_5_0= rulePostcondition
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getPostconditionPostconditionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_postcondition_5_0=rulePostcondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    					}
                    					set(
                    						current,
                    						"postcondition",
                    						lv_postcondition_5_0,
                    						"useCase.xtext.useCaseDsl.UseCaseDsl.Postcondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUseCaseDslParser.g:161:3: ( (lv_mainflow_6_0= MAINFLOW ) )
            // InternalUseCaseDslParser.g:162:4: (lv_mainflow_6_0= MAINFLOW )
            {
            // InternalUseCaseDslParser.g:162:4: (lv_mainflow_6_0= MAINFLOW )
            // InternalUseCaseDslParser.g:163:5: lv_mainflow_6_0= MAINFLOW
            {
            lv_mainflow_6_0=(Token)match(input,MAINFLOW,FOLLOW_4); 

            					newLeafNode(lv_mainflow_6_0, grammarAccess.getUseCaseAccess().getMainflowMAINFLOWKeyword_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseRule());
            					}
            					setWithLastConsumed(current, "mainflow", lv_mainflow_6_0, "MAINFLOW");
            				

            }


            }

            otherlv_7=(Token)match(input,Colon,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getUseCaseAccess().getColonKeyword_7());
            		
            this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_3); 

            			newLeafNode(this_BEGIN_8, grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_8());
            		
            // InternalUseCaseDslParser.g:183:3: ( (lv_steps_9_0= ruleUseCaseStep ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_INT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:184:4: (lv_steps_9_0= ruleUseCaseStep )
            	    {
            	    // InternalUseCaseDslParser.g:184:4: (lv_steps_9_0= ruleUseCaseStep )
            	    // InternalUseCaseDslParser.g:185:5: lv_steps_9_0= ruleUseCaseStep
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseAccess().getStepsUseCaseStepParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_steps_9_0=ruleUseCaseStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_9_0,
            	    						"useCase.xtext.useCaseDsl.UseCaseDsl.UseCaseStep");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            this_END_10=(Token)match(input,RULE_END,FOLLOW_11); 

            			newLeafNode(this_END_10, grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_10());
            		
            // InternalUseCaseDslParser.g:206:3: ( ( (lv_declareofflow_11_0= ALTERNATIVEFLOW ) ) otherlv_12= Colon this_BEGIN_13= RULE_BEGIN ( (lv_alternativeflows_14_0= ruleExtension ) )+ this_END_15= RULE_END )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ALTERNATIVEFLOW) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUseCaseDslParser.g:207:4: ( (lv_declareofflow_11_0= ALTERNATIVEFLOW ) ) otherlv_12= Colon this_BEGIN_13= RULE_BEGIN ( (lv_alternativeflows_14_0= ruleExtension ) )+ this_END_15= RULE_END
                    {
                    // InternalUseCaseDslParser.g:207:4: ( (lv_declareofflow_11_0= ALTERNATIVEFLOW ) )
                    // InternalUseCaseDslParser.g:208:5: (lv_declareofflow_11_0= ALTERNATIVEFLOW )
                    {
                    // InternalUseCaseDslParser.g:208:5: (lv_declareofflow_11_0= ALTERNATIVEFLOW )
                    // InternalUseCaseDslParser.g:209:6: lv_declareofflow_11_0= ALTERNATIVEFLOW
                    {
                    lv_declareofflow_11_0=(Token)match(input,ALTERNATIVEFLOW,FOLLOW_4); 

                    						newLeafNode(lv_declareofflow_11_0, grammarAccess.getUseCaseAccess().getDeclareofflowALTERNATIVEFLOWKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUseCaseRule());
                    						}
                    						setWithLastConsumed(current, "declareofflow", lv_declareofflow_11_0, "ALTERNATIVEFLOW");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,Colon,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getUseCaseAccess().getColonKeyword_11_1());
                    			
                    this_BEGIN_13=(Token)match(input,RULE_BEGIN,FOLLOW_3); 

                    				newLeafNode(this_BEGIN_13, grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_11_2());
                    			
                    // InternalUseCaseDslParser.g:229:4: ( (lv_alternativeflows_14_0= ruleExtension ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_INT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalUseCaseDslParser.g:230:5: (lv_alternativeflows_14_0= ruleExtension )
                    	    {
                    	    // InternalUseCaseDslParser.g:230:5: (lv_alternativeflows_14_0= ruleExtension )
                    	    // InternalUseCaseDslParser.g:231:6: lv_alternativeflows_14_0= ruleExtension
                    	    {

                    	    						newCompositeNode(grammarAccess.getUseCaseAccess().getAlternativeflowsExtensionParserRuleCall_11_3_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_alternativeflows_14_0=ruleExtension();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"alternativeflows",
                    	    							lv_alternativeflows_14_0,
                    	    							"useCase.xtext.useCaseDsl.UseCaseDsl.Extension");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    this_END_15=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_15, grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_11_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleExtension"
    // InternalUseCaseDslParser.g:260:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // InternalUseCaseDslParser.g:260:50: (iv_ruleExtension= ruleExtension EOF )
            // InternalUseCaseDslParser.g:261:2: iv_ruleExtension= ruleExtension EOF
            {
             newCompositeNode(grammarAccess.getExtensionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtension=ruleExtension();

            state._fsp--;

             current =iv_ruleExtension; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // InternalUseCaseDslParser.g:267:1: ruleExtension returns [EObject current=null] : ( ( (lv_startFrom_0_0= RULE_INT ) ) otherlv_1= FullStop ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )+ ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) ) this_END_14= RULE_END ) ;
    public final EObject ruleExtension() throws RecognitionException {
        EObject current = null;

        Token lv_startFrom_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_BEGIN_6=null;
        Token this_INT_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_resumeAt_12_0=null;
        Token this_END_14=null;
        AntlrDatatypeRuleToken lv_condition_5_0 = null;

        EObject lv_steps_7_0 = null;

        EObject lv_end_13_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:273:2: ( ( ( (lv_startFrom_0_0= RULE_INT ) ) otherlv_1= FullStop ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )+ ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) ) this_END_14= RULE_END ) )
            // InternalUseCaseDslParser.g:274:2: ( ( (lv_startFrom_0_0= RULE_INT ) ) otherlv_1= FullStop ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )+ ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) ) this_END_14= RULE_END )
            {
            // InternalUseCaseDslParser.g:274:2: ( ( (lv_startFrom_0_0= RULE_INT ) ) otherlv_1= FullStop ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )+ ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) ) this_END_14= RULE_END )
            // InternalUseCaseDslParser.g:275:3: ( (lv_startFrom_0_0= RULE_INT ) ) otherlv_1= FullStop ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )+ ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) ) this_END_14= RULE_END
            {
            // InternalUseCaseDslParser.g:275:3: ( (lv_startFrom_0_0= RULE_INT ) )
            // InternalUseCaseDslParser.g:276:4: (lv_startFrom_0_0= RULE_INT )
            {
            // InternalUseCaseDslParser.g:276:4: (lv_startFrom_0_0= RULE_INT )
            // InternalUseCaseDslParser.g:277:5: lv_startFrom_0_0= RULE_INT
            {
            lv_startFrom_0_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_startFrom_0_0, grammarAccess.getExtensionAccess().getStartFromINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startFrom",
            						lv_startFrom_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,FullStop,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getExtensionAccess().getFullStopKeyword_1());
            		
            // InternalUseCaseDslParser.g:297:3: ( (lv_name_2_0= RULE_CHAR ) )
            // InternalUseCaseDslParser.g:298:4: (lv_name_2_0= RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:298:4: (lv_name_2_0= RULE_CHAR )
            // InternalUseCaseDslParser.g:299:5: lv_name_2_0= RULE_CHAR
            {
            lv_name_2_0=(Token)match(input,RULE_CHAR,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getExtensionAccess().getNameCHARTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"useCase.xtext.useCaseDsl.UseCaseDsl.CHAR");
            				

            }


            }

            otherlv_3=(Token)match(input,FullStop,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getExtensionAccess().getFullStopKeyword_3());
            		
            otherlv_4=(Token)match(input,IF,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getIFKeyword_4());
            		
            // InternalUseCaseDslParser.g:323:3: ( (lv_condition_5_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:324:4: (lv_condition_5_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:324:4: (lv_condition_5_0= ruleCondition )
            // InternalUseCaseDslParser.g:325:5: lv_condition_5_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getExtensionAccess().getConditionConditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_condition_5_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtensionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_5_0,
            						"useCase.xtext.useCaseDsl.UseCaseDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_3); 

            			newLeafNode(this_BEGIN_6, grammarAccess.getExtensionAccess().getBEGINTerminalRuleCall_6());
            		
            // InternalUseCaseDslParser.g:346:3: ( (lv_steps_7_0= ruleExtensionStep ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:347:4: (lv_steps_7_0= ruleExtensionStep )
            	    {
            	    // InternalUseCaseDslParser.g:347:4: (lv_steps_7_0= ruleExtensionStep )
            	    // InternalUseCaseDslParser.g:348:5: lv_steps_7_0= ruleExtensionStep
            	    {

            	    					newCompositeNode(grammarAccess.getExtensionAccess().getStepsExtensionStepParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_steps_7_0=ruleExtensionStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtensionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_7_0,
            	    						"useCase.xtext.useCaseDsl.UseCaseDsl.ExtensionStep");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // InternalUseCaseDslParser.g:365:3: ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==FullStop) ) {
                    int LA7_2 = input.LA(3);

                    if ( ((LA7_2>=SYSTEM && LA7_2<=USER)||(LA7_2>=UC && LA7_2<=RULE_CHAR)||LA7_2==RULE_ID||LA7_2==RULE_ANY_OTHER) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==RETURN) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCaseDslParser.g:366:4: (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) )
                    {
                    // InternalUseCaseDslParser.g:366:4: (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) )
                    // InternalUseCaseDslParser.g:367:5: this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) )
                    {
                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_12); 

                    					newLeafNode(this_INT_8, grammarAccess.getExtensionAccess().getINTTerminalRuleCall_8_0_0());
                    				
                    otherlv_9=(Token)match(input,FullStop,FOLLOW_16); 

                    					newLeafNode(otherlv_9, grammarAccess.getExtensionAccess().getFullStopKeyword_8_0_1());
                    				
                    otherlv_10=(Token)match(input,RETURN,FOLLOW_17); 

                    					newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getRETURNKeyword_8_0_2());
                    				
                    otherlv_11=(Token)match(input,TO,FOLLOW_3); 

                    					newLeafNode(otherlv_11, grammarAccess.getExtensionAccess().getTOKeyword_8_0_3());
                    				
                    // InternalUseCaseDslParser.g:383:5: ( (lv_resumeAt_12_0= RULE_INT ) )
                    // InternalUseCaseDslParser.g:384:6: (lv_resumeAt_12_0= RULE_INT )
                    {
                    // InternalUseCaseDslParser.g:384:6: (lv_resumeAt_12_0= RULE_INT )
                    // InternalUseCaseDslParser.g:385:7: lv_resumeAt_12_0= RULE_INT
                    {
                    lv_resumeAt_12_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    							newLeafNode(lv_resumeAt_12_0, grammarAccess.getExtensionAccess().getResumeAtINTTerminalRuleCall_8_0_4_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtensionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"resumeAt",
                    								lv_resumeAt_12_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:403:4: ( (lv_end_13_0= ruleDeadEndStep ) )
                    {
                    // InternalUseCaseDslParser.g:403:4: ( (lv_end_13_0= ruleDeadEndStep ) )
                    // InternalUseCaseDslParser.g:404:5: (lv_end_13_0= ruleDeadEndStep )
                    {
                    // InternalUseCaseDslParser.g:404:5: (lv_end_13_0= ruleDeadEndStep )
                    // InternalUseCaseDslParser.g:405:6: lv_end_13_0= ruleDeadEndStep
                    {

                    						newCompositeNode(grammarAccess.getExtensionAccess().getEndDeadEndStepParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_end_13_0=ruleDeadEndStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtensionRule());
                    						}
                    						set(
                    							current,
                    							"end",
                    							lv_end_13_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.DeadEndStep");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_14=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_14, grammarAccess.getExtensionAccess().getENDTerminalRuleCall_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleUseCaseStep"
    // InternalUseCaseDslParser.g:431:1: entryRuleUseCaseStep returns [EObject current=null] : iv_ruleUseCaseStep= ruleUseCaseStep EOF ;
    public final EObject entryRuleUseCaseStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseStep = null;


        try {
            // InternalUseCaseDslParser.g:431:52: (iv_ruleUseCaseStep= ruleUseCaseStep EOF )
            // InternalUseCaseDslParser.g:432:2: iv_ruleUseCaseStep= ruleUseCaseStep EOF
            {
             newCompositeNode(grammarAccess.getUseCaseStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCaseStep=ruleUseCaseStep();

            state._fsp--;

             current =iv_ruleUseCaseStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseCaseStep"


    // $ANTLR start "ruleUseCaseStep"
    // InternalUseCaseDslParser.g:438:1: ruleUseCaseStep returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) ) | ( () ( (lv_name_11_0= RULE_INT ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) ) ) ;
    public final EObject ruleUseCaseStep() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_sentence_4_0 = null;

        AntlrDatatypeRuleToken lv_sentence_9_0 = null;

        AntlrDatatypeRuleToken lv_repeatingCondition_14_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:444:2: ( ( ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) ) | ( () ( (lv_name_11_0= RULE_INT ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) ) ) )
            // InternalUseCaseDslParser.g:445:2: ( ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) ) | ( () ( (lv_name_11_0= RULE_INT ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) ) )
            {
            // InternalUseCaseDslParser.g:445:2: ( ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) ) | ( () ( (lv_name_11_0= RULE_INT ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) ) )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==FullStop) ) {
                    switch ( input.LA(3) ) {
                    case WHILE:
                        {
                        alt8=3;
                        }
                        break;
                    case SYSTEM:
                        {
                        alt8=2;
                        }
                        break;
                    case USER:
                        {
                        alt8=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCaseDslParser.g:446:3: ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:446:3: ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:447:4: () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:447:4: ()
                    // InternalUseCaseDslParser.g:448:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getUserStepAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:454:4: ( (lv_name_1_0= RULE_INT ) )
                    // InternalUseCaseDslParser.g:455:5: (lv_name_1_0= RULE_INT )
                    {
                    // InternalUseCaseDslParser.g:455:5: (lv_name_1_0= RULE_INT )
                    // InternalUseCaseDslParser.g:456:6: lv_name_1_0= RULE_INT
                    {
                    lv_name_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getUseCaseStepAccess().getNameINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUseCaseStepRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,FullStop,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,USER,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getUseCaseStepAccess().getUSERKeyword_0_3());
                    			
                    // InternalUseCaseDslParser.g:480:4: ( (lv_sentence_4_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:481:5: (lv_sentence_4_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:481:5: (lv_sentence_4_0= ruleLongName )
                    // InternalUseCaseDslParser.g:482:6: lv_sentence_4_0= ruleLongName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sentence_4_0=ruleLongName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"sentence",
                    							lv_sentence_4_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:501:3: ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:501:3: ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:502:4: () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:502:4: ()
                    // InternalUseCaseDslParser.g:503:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getSystemStepAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:509:4: ( (lv_name_6_0= RULE_INT ) )
                    // InternalUseCaseDslParser.g:510:5: (lv_name_6_0= RULE_INT )
                    {
                    // InternalUseCaseDslParser.g:510:5: (lv_name_6_0= RULE_INT )
                    // InternalUseCaseDslParser.g:511:6: lv_name_6_0= RULE_INT
                    {
                    lv_name_6_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    						newLeafNode(lv_name_6_0, grammarAccess.getUseCaseStepAccess().getNameINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUseCaseStepRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,FullStop,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_1_2());
                    			
                    otherlv_8=(Token)match(input,SYSTEM,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getUseCaseStepAccess().getSYSTEMKeyword_1_3());
                    			
                    // InternalUseCaseDslParser.g:535:4: ( (lv_sentence_9_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:536:5: (lv_sentence_9_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:536:5: (lv_sentence_9_0= ruleLongName )
                    // InternalUseCaseDslParser.g:537:6: lv_sentence_9_0= ruleLongName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sentence_9_0=ruleLongName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"sentence",
                    							lv_sentence_9_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:556:3: ( () ( (lv_name_11_0= RULE_INT ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) )
                    {
                    // InternalUseCaseDslParser.g:556:3: ( () ( (lv_name_11_0= RULE_INT ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) )
                    // InternalUseCaseDslParser.g:557:4: () ( (lv_name_11_0= RULE_INT ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) )
                    {
                    // InternalUseCaseDslParser.g:557:4: ()
                    // InternalUseCaseDslParser.g:558:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getRepeatingStepAction_2_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:564:4: ( (lv_name_11_0= RULE_INT ) )
                    // InternalUseCaseDslParser.g:565:5: (lv_name_11_0= RULE_INT )
                    {
                    // InternalUseCaseDslParser.g:565:5: (lv_name_11_0= RULE_INT )
                    // InternalUseCaseDslParser.g:566:6: lv_name_11_0= RULE_INT
                    {
                    lv_name_11_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    						newLeafNode(lv_name_11_0, grammarAccess.getUseCaseStepAccess().getNameINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUseCaseStepRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,FullStop,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_2());
                    			
                    otherlv_13=(Token)match(input,WHILE,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getUseCaseStepAccess().getWHILEKeyword_2_3());
                    			
                    // InternalUseCaseDslParser.g:590:4: ( (lv_repeatingCondition_14_0= ruleCondition ) )
                    // InternalUseCaseDslParser.g:591:5: (lv_repeatingCondition_14_0= ruleCondition )
                    {
                    // InternalUseCaseDslParser.g:591:5: (lv_repeatingCondition_14_0= ruleCondition )
                    // InternalUseCaseDslParser.g:592:6: lv_repeatingCondition_14_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getRepeatingConditionConditionParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_repeatingCondition_14_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"repeatingCondition",
                    							lv_repeatingCondition_14_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseCaseStep"


    // $ANTLR start "entryRuleExtensionStep"
    // InternalUseCaseDslParser.g:614:1: entryRuleExtensionStep returns [EObject current=null] : iv_ruleExtensionStep= ruleExtensionStep EOF ;
    public final EObject entryRuleExtensionStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionStep = null;


        try {
            // InternalUseCaseDslParser.g:614:54: (iv_ruleExtensionStep= ruleExtensionStep EOF )
            // InternalUseCaseDslParser.g:615:2: iv_ruleExtensionStep= ruleExtensionStep EOF
            {
             newCompositeNode(grammarAccess.getExtensionStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtensionStep=ruleExtensionStep();

            state._fsp--;

             current =iv_ruleExtensionStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtensionStep"


    // $ANTLR start "ruleExtensionStep"
    // InternalUseCaseDslParser.g:621:1: ruleExtensionStep returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep ) ;
    public final EObject ruleExtensionStep() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_sentence_5_0 = null;

        EObject this_DeadEndStep_6 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:627:2: ( ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep ) )
            // InternalUseCaseDslParser.g:628:2: ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep )
            {
            // InternalUseCaseDslParser.g:628:2: ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalUseCaseDslParser.g:629:3: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:629:3: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:630:4: ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:630:4: ( (lv_name_0_0= RULE_INT ) )
                    // InternalUseCaseDslParser.g:631:5: (lv_name_0_0= RULE_INT )
                    {
                    // InternalUseCaseDslParser.g:631:5: (lv_name_0_0= RULE_INT )
                    // InternalUseCaseDslParser.g:632:6: lv_name_0_0= RULE_INT
                    {
                    lv_name_0_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getExtensionStepAccess().getNameINTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtensionStepRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,FullStop,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getExtensionStepAccess().getFullStopKeyword_0_1());
                    			
                    // InternalUseCaseDslParser.g:652:4: (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )?
                    int alt9=4;
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
                    }

                    switch (alt9) {
                        case 1 :
                            // InternalUseCaseDslParser.g:653:5: otherlv_2= USER
                            {
                            otherlv_2=(Token)match(input,USER,FOLLOW_5); 

                            					newLeafNode(otherlv_2, grammarAccess.getExtensionStepAccess().getUSERKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCaseDslParser.g:658:5: otherlv_3= SYSTEM
                            {
                            otherlv_3=(Token)match(input,SYSTEM,FOLLOW_5); 

                            					newLeafNode(otherlv_3, grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_0_2_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalUseCaseDslParser.g:663:5: otherlv_4= WHILE
                            {
                            otherlv_4=(Token)match(input,WHILE,FOLLOW_5); 

                            					newLeafNode(otherlv_4, grammarAccess.getExtensionStepAccess().getWHILEKeyword_0_2_2());
                            				

                            }
                            break;

                    }

                    // InternalUseCaseDslParser.g:668:4: ( (lv_sentence_5_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:669:5: (lv_sentence_5_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:669:5: (lv_sentence_5_0= ruleLongName )
                    // InternalUseCaseDslParser.g:670:6: lv_sentence_5_0= ruleLongName
                    {

                    						newCompositeNode(grammarAccess.getExtensionStepAccess().getSentenceLongNameParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sentence_5_0=ruleLongName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtensionStepRule());
                    						}
                    						set(
                    							current,
                    							"sentence",
                    							lv_sentence_5_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:689:3: this_DeadEndStep_6= ruleDeadEndStep
                    {

                    			newCompositeNode(grammarAccess.getExtensionStepAccess().getDeadEndStepParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeadEndStep_6=ruleDeadEndStep();

                    state._fsp--;


                    			current = this_DeadEndStep_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtensionStep"


    // $ANTLR start "entryRuleDeadEndStep"
    // InternalUseCaseDslParser.g:701:1: entryRuleDeadEndStep returns [EObject current=null] : iv_ruleDeadEndStep= ruleDeadEndStep EOF ;
    public final EObject entryRuleDeadEndStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeadEndStep = null;


        try {
            // InternalUseCaseDslParser.g:701:52: (iv_ruleDeadEndStep= ruleDeadEndStep EOF )
            // InternalUseCaseDslParser.g:702:2: iv_ruleDeadEndStep= ruleDeadEndStep EOF
            {
             newCompositeNode(grammarAccess.getDeadEndStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeadEndStep=ruleDeadEndStep();

            state._fsp--;

             current =iv_ruleDeadEndStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeadEndStep"


    // $ANTLR start "ruleDeadEndStep"
    // InternalUseCaseDslParser.g:708:1: ruleDeadEndStep returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END ) ;
    public final EObject ruleDeadEndStep() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_sentence_5_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:714:2: ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END ) )
            // InternalUseCaseDslParser.g:715:2: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END )
            {
            // InternalUseCaseDslParser.g:715:2: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END )
            // InternalUseCaseDslParser.g:716:3: ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END
            {
            // InternalUseCaseDslParser.g:716:3: ( (lv_name_0_0= RULE_INT ) )
            // InternalUseCaseDslParser.g:717:4: (lv_name_0_0= RULE_INT )
            {
            // InternalUseCaseDslParser.g:717:4: (lv_name_0_0= RULE_INT )
            // InternalUseCaseDslParser.g:718:5: lv_name_0_0= RULE_INT
            {
            lv_name_0_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getDeadEndStepAccess().getNameINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeadEndStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,FullStop,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getDeadEndStepAccess().getFullStopKeyword_1());
            		
            // InternalUseCaseDslParser.g:738:3: (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )?
            int alt11=4;
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
            }

            switch (alt11) {
                case 1 :
                    // InternalUseCaseDslParser.g:739:4: otherlv_2= USER
                    {
                    otherlv_2=(Token)match(input,USER,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:744:4: otherlv_3= SYSTEM
                    {
                    otherlv_3=(Token)match(input,SYSTEM,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:749:4: otherlv_4= WHILE
                    {
                    otherlv_4=(Token)match(input,WHILE,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeadEndStepAccess().getWHILEKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalUseCaseDslParser.g:754:3: ( (lv_sentence_5_0= ruleLongName ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=QuotationMark && LA12_0<=RULE_CHAR)||LA12_0==RULE_ID||LA12_0==RULE_ANY_OTHER) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUseCaseDslParser.g:755:4: (lv_sentence_5_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:755:4: (lv_sentence_5_0= ruleLongName )
                    // InternalUseCaseDslParser.g:756:5: lv_sentence_5_0= ruleLongName
                    {

                    					newCompositeNode(grammarAccess.getDeadEndStepAccess().getSentenceLongNameParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_sentence_5_0=ruleLongName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeadEndStepRule());
                    					}
                    					set(
                    						current,
                    						"sentence",
                    						lv_sentence_5_0,
                    						"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,UC,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getDeadEndStepAccess().getUCKeyword_4());
            		
            otherlv_7=(Token)match(input,END,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDeadEndStepAccess().getENDKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeadEndStep"


    // $ANTLR start "entryRulePrecondition"
    // InternalUseCaseDslParser.g:785:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalUseCaseDslParser.g:785:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalUseCaseDslParser.g:786:2: iv_rulePrecondition= rulePrecondition EOF
            {
             newCompositeNode(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrecondition=rulePrecondition();

            state._fsp--;

             current =iv_rulePrecondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalUseCaseDslParser.g:792:1: rulePrecondition returns [EObject current=null] : (otherlv_0= PRECONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:798:2: ( (otherlv_0= PRECONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalUseCaseDslParser.g:799:2: (otherlv_0= PRECONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalUseCaseDslParser.g:799:2: (otherlv_0= PRECONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalUseCaseDslParser.g:800:3: otherlv_0= PRECONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,PRECONDITION,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getPRECONDITIONKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getPreconditionAccess().getColonKeyword_1());
            		
            // InternalUseCaseDslParser.g:808:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:809:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:809:4: (lv_condition_2_0= ruleCondition )
            // InternalUseCaseDslParser.g:810:5: lv_condition_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getPreconditionAccess().getConditionConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreconditionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"useCase.xtext.useCaseDsl.UseCaseDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRulePostcondition"
    // InternalUseCaseDslParser.g:831:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalUseCaseDslParser.g:831:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalUseCaseDslParser.g:832:2: iv_rulePostcondition= rulePostcondition EOF
            {
             newCompositeNode(grammarAccess.getPostconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePostcondition=rulePostcondition();

            state._fsp--;

             current =iv_rulePostcondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostcondition"


    // $ANTLR start "rulePostcondition"
    // InternalUseCaseDslParser.g:838:1: rulePostcondition returns [EObject current=null] : (otherlv_0= POSTCONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:844:2: ( (otherlv_0= POSTCONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalUseCaseDslParser.g:845:2: (otherlv_0= POSTCONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalUseCaseDslParser.g:845:2: (otherlv_0= POSTCONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalUseCaseDslParser.g:846:3: otherlv_0= POSTCONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,POSTCONDITION,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getPOSTCONDITIONKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getPostconditionAccess().getColonKeyword_1());
            		
            // InternalUseCaseDslParser.g:854:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:855:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:855:4: (lv_condition_2_0= ruleCondition )
            // InternalUseCaseDslParser.g:856:5: lv_condition_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getPostconditionAccess().getConditionConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPostconditionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"useCase.xtext.useCaseDsl.UseCaseDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostcondition"


    // $ANTLR start "entryRuleLongName"
    // InternalUseCaseDslParser.g:877:1: entryRuleLongName returns [String current=null] : iv_ruleLongName= ruleLongName EOF ;
    public final String entryRuleLongName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLongName = null;


        try {
            // InternalUseCaseDslParser.g:877:48: (iv_ruleLongName= ruleLongName EOF )
            // InternalUseCaseDslParser.g:878:2: iv_ruleLongName= ruleLongName EOF
            {
             newCompositeNode(grammarAccess.getLongNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLongName=ruleLongName();

            state._fsp--;

             current =iv_ruleLongName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLongName"


    // $ANTLR start "ruleLongName"
    // InternalUseCaseDslParser.g:884:1: ruleLongName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ ;
    public final AntlrDatatypeRuleToken ruleLongName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_CHAR_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:890:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ )
            // InternalUseCaseDslParser.g:891:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
            {
            // InternalUseCaseDslParser.g:891:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
            int cnt13=0;
            loop13:
            do {
                int alt13=8;
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

                }

                switch (alt13) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:892:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUseCaseDslParser.g:900:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_27); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUseCaseDslParser.g:908:3: this_CHAR_2= RULE_CHAR
            	    {
            	    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_27); 

            	    			current.merge(this_CHAR_2);
            	    		

            	    			newLeafNode(this_CHAR_2, grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUseCaseDslParser.g:916:3: kw= Colon
            	    {
            	    kw=(Token)match(input,Colon,FOLLOW_27); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getColonKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUseCaseDslParser.g:922:3: kw= FullStop
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_27); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUseCaseDslParser.g:928:3: kw= QuotationMark
            	    {
            	    kw=(Token)match(input,QuotationMark,FOLLOW_27); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalUseCaseDslParser.g:934:3: kw= Apostrophe
            	    {
            	    kw=(Token)match(input,Apostrophe,FOLLOW_27); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getApostropheKeyword_6());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLongName"


    // $ANTLR start "entryRuleCondition"
    // InternalUseCaseDslParser.g:943:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalUseCaseDslParser.g:943:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalUseCaseDslParser.g:944:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalUseCaseDslParser.g:950:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+ ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_CHAR_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:956:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+ )
            // InternalUseCaseDslParser.g:957:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+
            {
            // InternalUseCaseDslParser.g:957:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+
            int cnt14=0;
            loop14:
            do {
                int alt14=10;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt14=1;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt14=2;
                    }
                    break;
                case RULE_CHAR:
                    {
                    alt14=3;
                    }
                    break;
                case Colon:
                    {
                    alt14=4;
                    }
                    break;
                case FullStop:
                    {
                    alt14=5;
                    }
                    break;
                case QuotationMark:
                    {
                    alt14=6;
                    }
                    break;
                case Apostrophe:
                    {
                    alt14=7;
                    }
                    break;
                case AND:
                    {
                    alt14=8;
                    }
                    break;
                case OR:
                    {
                    alt14=9;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:958:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getConditionAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUseCaseDslParser.g:966:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_28); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUseCaseDslParser.g:974:3: this_CHAR_2= RULE_CHAR
            	    {
            	    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_28); 

            	    			current.merge(this_CHAR_2);
            	    		

            	    			newLeafNode(this_CHAR_2, grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUseCaseDslParser.g:982:3: kw= Colon
            	    {
            	    kw=(Token)match(input,Colon,FOLLOW_28); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getColonKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUseCaseDslParser.g:988:3: kw= FullStop
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_28); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUseCaseDslParser.g:994:3: kw= QuotationMark
            	    {
            	    kw=(Token)match(input,QuotationMark,FOLLOW_28); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getQuotationMarkKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalUseCaseDslParser.g:1000:3: kw= Apostrophe
            	    {
            	    kw=(Token)match(input,Apostrophe,FOLLOW_28); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getApostropheKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalUseCaseDslParser.g:1006:3: kw= AND
            	    {
            	    kw=(Token)match(input,AND,FOLLOW_28); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getANDKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalUseCaseDslParser.g:1012:3: kw= OR
            	    {
            	    kw=(Token)match(input,OR,FOLLOW_28); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getORKeyword_8());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\32\1\24\1\10\12\21\1\15\2\uffff\1\30";
    static final String dfa_3s = "\1\32\1\24\13\37\1\15\2\uffff\1\32";
    static final String dfa_4s = "\16\uffff\1\2\1\1\1\uffff";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\16\1\4\1\5\1\3\5\uffff\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\17\4\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\17\4\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\17\4\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\17\4\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\17\4\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\17\4\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\17\4\uffff\1\7",
            "\1\20",
            "",
            "",
            "\1\16\1\uffff\1\17"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 346:3: ( (lv_steps_7_0= ruleExtensionStep ) )+";
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\6\uffff\7\16\2\uffff";
    static final String dfa_9s = "\1\32\1\24\1\11\12\21\2\uffff";
    static final String dfa_10s = "\1\32\1\24\13\37\2\uffff";
    static final String dfa_11s = "\15\uffff\1\2\1\1";
    static final String dfa_12s = "\17\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2",
            "\1\4\1\5\1\3\5\uffff\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\16\4\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\16\4\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\16\4\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\16\4\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\16\4\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\16\4\uffff\1\7",
            "\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\16\4\uffff\1\7",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "628:2: ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000827C0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000827C9000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000827C0E00L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000827E0E00L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000827E0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000827C0002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000827C9002L});

}