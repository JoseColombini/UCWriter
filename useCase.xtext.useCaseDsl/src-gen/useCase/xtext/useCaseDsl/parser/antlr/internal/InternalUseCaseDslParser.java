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
    // InternalUseCaseDslParser.g:69:1: ruleUseCase returns [EObject current=null] : (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_mainflow_4_0= MainFlow ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleUseCaseStep ) )+ this_END_8= RULE_END ( ( (lv_declareofflow_9_0= AlternativeFlow ) ) otherlv_10= Colon this_BEGIN_11= RULE_BEGIN ( (lv_alternativeflows_12_0= ruleExtension ) )+ this_END_13= RULE_END )? ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;
        Token otherlv_2=null;
        Token lv_mainflow_4_0=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        Token lv_declareofflow_9_0=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_steps_7_0 = null;

        EObject lv_alternativeflows_12_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalUseCaseDslParser.g:76:2: ( (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_mainflow_4_0= MainFlow ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleUseCaseStep ) )+ this_END_8= RULE_END ( ( (lv_declareofflow_9_0= AlternativeFlow ) ) otherlv_10= Colon this_BEGIN_11= RULE_BEGIN ( (lv_alternativeflows_12_0= ruleExtension ) )+ this_END_13= RULE_END )? ) )
            // InternalUseCaseDslParser.g:77:2: (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_mainflow_4_0= MainFlow ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleUseCaseStep ) )+ this_END_8= RULE_END ( ( (lv_declareofflow_9_0= AlternativeFlow ) ) otherlv_10= Colon this_BEGIN_11= RULE_BEGIN ( (lv_alternativeflows_12_0= ruleExtension ) )+ this_END_13= RULE_END )? )
            {
            // InternalUseCaseDslParser.g:77:2: (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_mainflow_4_0= MainFlow ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleUseCaseStep ) )+ this_END_8= RULE_END ( ( (lv_declareofflow_9_0= AlternativeFlow ) ) otherlv_10= Colon this_BEGIN_11= RULE_BEGIN ( (lv_alternativeflows_12_0= ruleExtension ) )+ this_END_13= RULE_END )? )
            // InternalUseCaseDslParser.g:78:3: otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_mainflow_4_0= MainFlow ) ) otherlv_5= Colon this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleUseCaseStep ) )+ this_END_8= RULE_END ( ( (lv_declareofflow_9_0= AlternativeFlow ) ) otherlv_10= Colon this_BEGIN_11= RULE_BEGIN ( (lv_alternativeflows_12_0= ruleExtension ) )+ this_END_13= RULE_END )?
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

            // InternalUseCaseDslParser.g:123:3: ( (lv_mainflow_4_0= MainFlow ) )
            // InternalUseCaseDslParser.g:124:4: (lv_mainflow_4_0= MainFlow )
            {
            // InternalUseCaseDslParser.g:124:4: (lv_mainflow_4_0= MainFlow )
            // InternalUseCaseDslParser.g:125:5: lv_mainflow_4_0= MainFlow
            {
            lv_mainflow_4_0=(Token)match(input,MainFlow,FOLLOW_4); 

            					newLeafNode(lv_mainflow_4_0, grammarAccess.getUseCaseAccess().getMainflowMainFlowKeyword_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseRule());
            					}
            					setWithLastConsumed(current, "mainflow", lv_mainflow_4_0, "MainFlow");
            				

            }


            }

            otherlv_5=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getColonKeyword_5());
            		
            this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_3); 

            			newLeafNode(this_BEGIN_6, grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_6());
            		
            // InternalUseCaseDslParser.g:145:3: ( (lv_steps_7_0= ruleUseCaseStep ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:146:4: (lv_steps_7_0= ruleUseCaseStep )
            	    {
            	    // InternalUseCaseDslParser.g:146:4: (lv_steps_7_0= ruleUseCaseStep )
            	    // InternalUseCaseDslParser.g:147:5: lv_steps_7_0= ruleUseCaseStep
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseAccess().getStepsUseCaseStepParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_steps_7_0=ruleUseCaseStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_7_0,
            	    						"useCase.xtext.useCaseDsl.UseCaseDsl.UseCaseStep");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            this_END_8=(Token)match(input,RULE_END,FOLLOW_9); 

            			newLeafNode(this_END_8, grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_8());
            		
            // InternalUseCaseDslParser.g:168:3: ( ( (lv_declareofflow_9_0= AlternativeFlow ) ) otherlv_10= Colon this_BEGIN_11= RULE_BEGIN ( (lv_alternativeflows_12_0= ruleExtension ) )+ this_END_13= RULE_END )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==AlternativeFlow) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUseCaseDslParser.g:169:4: ( (lv_declareofflow_9_0= AlternativeFlow ) ) otherlv_10= Colon this_BEGIN_11= RULE_BEGIN ( (lv_alternativeflows_12_0= ruleExtension ) )+ this_END_13= RULE_END
                    {
                    // InternalUseCaseDslParser.g:169:4: ( (lv_declareofflow_9_0= AlternativeFlow ) )
                    // InternalUseCaseDslParser.g:170:5: (lv_declareofflow_9_0= AlternativeFlow )
                    {
                    // InternalUseCaseDslParser.g:170:5: (lv_declareofflow_9_0= AlternativeFlow )
                    // InternalUseCaseDslParser.g:171:6: lv_declareofflow_9_0= AlternativeFlow
                    {
                    lv_declareofflow_9_0=(Token)match(input,AlternativeFlow,FOLLOW_4); 

                    						newLeafNode(lv_declareofflow_9_0, grammarAccess.getUseCaseAccess().getDeclareofflowAlternativeFlowKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUseCaseRule());
                    						}
                    						setWithLastConsumed(current, "declareofflow", lv_declareofflow_9_0, "AlternativeFlow");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,Colon,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getUseCaseAccess().getColonKeyword_9_1());
                    			
                    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_3); 

                    				newLeafNode(this_BEGIN_11, grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_9_2());
                    			
                    // InternalUseCaseDslParser.g:191:4: ( (lv_alternativeflows_12_0= ruleExtension ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_INT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalUseCaseDslParser.g:192:5: (lv_alternativeflows_12_0= ruleExtension )
                    	    {
                    	    // InternalUseCaseDslParser.g:192:5: (lv_alternativeflows_12_0= ruleExtension )
                    	    // InternalUseCaseDslParser.g:193:6: lv_alternativeflows_12_0= ruleExtension
                    	    {

                    	    						newCompositeNode(grammarAccess.getUseCaseAccess().getAlternativeflowsExtensionParserRuleCall_9_3_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_alternativeflows_12_0=ruleExtension();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"alternativeflows",
                    	    							lv_alternativeflows_12_0,
                    	    							"useCase.xtext.useCaseDsl.UseCaseDsl.Extension");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    this_END_13=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_13, grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_9_4());
                    			

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
    // InternalUseCaseDslParser.g:222:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // InternalUseCaseDslParser.g:222:50: (iv_ruleExtension= ruleExtension EOF )
            // InternalUseCaseDslParser.g:223:2: iv_ruleExtension= ruleExtension EOF
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
    // InternalUseCaseDslParser.g:229:1: ruleExtension returns [EObject current=null] : ( ( (lv_startFrom_0_0= RULE_INT ) ) otherlv_1= FullStop ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )+ ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= Return otherlv_11= To ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) ) this_END_14= RULE_END ) ;
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
            // InternalUseCaseDslParser.g:235:2: ( ( ( (lv_startFrom_0_0= RULE_INT ) ) otherlv_1= FullStop ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )+ ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= Return otherlv_11= To ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) ) this_END_14= RULE_END ) )
            // InternalUseCaseDslParser.g:236:2: ( ( (lv_startFrom_0_0= RULE_INT ) ) otherlv_1= FullStop ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )+ ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= Return otherlv_11= To ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) ) this_END_14= RULE_END )
            {
            // InternalUseCaseDslParser.g:236:2: ( ( (lv_startFrom_0_0= RULE_INT ) ) otherlv_1= FullStop ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )+ ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= Return otherlv_11= To ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) ) this_END_14= RULE_END )
            // InternalUseCaseDslParser.g:237:3: ( (lv_startFrom_0_0= RULE_INT ) ) otherlv_1= FullStop ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )+ ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= Return otherlv_11= To ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) ) this_END_14= RULE_END
            {
            // InternalUseCaseDslParser.g:237:3: ( (lv_startFrom_0_0= RULE_INT ) )
            // InternalUseCaseDslParser.g:238:4: (lv_startFrom_0_0= RULE_INT )
            {
            // InternalUseCaseDslParser.g:238:4: (lv_startFrom_0_0= RULE_INT )
            // InternalUseCaseDslParser.g:239:5: lv_startFrom_0_0= RULE_INT
            {
            lv_startFrom_0_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

            otherlv_1=(Token)match(input,FullStop,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getExtensionAccess().getFullStopKeyword_1());
            		
            // InternalUseCaseDslParser.g:259:3: ( (lv_name_2_0= RULE_CHAR ) )
            // InternalUseCaseDslParser.g:260:4: (lv_name_2_0= RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:260:4: (lv_name_2_0= RULE_CHAR )
            // InternalUseCaseDslParser.g:261:5: lv_name_2_0= RULE_CHAR
            {
            lv_name_2_0=(Token)match(input,RULE_CHAR,FOLLOW_10); 

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

            otherlv_3=(Token)match(input,FullStop,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getExtensionAccess().getFullStopKeyword_3());
            		
            otherlv_4=(Token)match(input,IF,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getIFKeyword_4());
            		
            // InternalUseCaseDslParser.g:285:3: ( (lv_condition_5_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:286:4: (lv_condition_5_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:286:4: (lv_condition_5_0= ruleCondition )
            // InternalUseCaseDslParser.g:287:5: lv_condition_5_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getExtensionAccess().getConditionConditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
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
            		
            // InternalUseCaseDslParser.g:308:3: ( (lv_steps_7_0= ruleExtensionStep ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:309:4: (lv_steps_7_0= ruleExtensionStep )
            	    {
            	    // InternalUseCaseDslParser.g:309:4: (lv_steps_7_0= ruleExtensionStep )
            	    // InternalUseCaseDslParser.g:310:5: lv_steps_7_0= ruleExtensionStep
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalUseCaseDslParser.g:327:3: ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= Return otherlv_11= To ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==FullStop) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==Return) ) {
                        alt5=1;
                    }
                    else if ( ((LA5_2>=KW_System && LA5_2<=User)||(LA5_2>=QuotationMark && LA5_2<=RULE_CHAR)||LA5_2==RULE_ID||LA5_2==RULE_ANY_OTHER) ) {
                        alt5=2;
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
                    // InternalUseCaseDslParser.g:328:4: (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= Return otherlv_11= To ( (lv_resumeAt_12_0= RULE_INT ) ) )
                    {
                    // InternalUseCaseDslParser.g:328:4: (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= Return otherlv_11= To ( (lv_resumeAt_12_0= RULE_INT ) ) )
                    // InternalUseCaseDslParser.g:329:5: this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= Return otherlv_11= To ( (lv_resumeAt_12_0= RULE_INT ) )
                    {
                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_10); 

                    					newLeafNode(this_INT_8, grammarAccess.getExtensionAccess().getINTTerminalRuleCall_8_0_0());
                    				
                    otherlv_9=(Token)match(input,FullStop,FOLLOW_14); 

                    					newLeafNode(otherlv_9, grammarAccess.getExtensionAccess().getFullStopKeyword_8_0_1());
                    				
                    otherlv_10=(Token)match(input,Return,FOLLOW_15); 

                    					newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getReturnKeyword_8_0_2());
                    				
                    otherlv_11=(Token)match(input,To,FOLLOW_3); 

                    					newLeafNode(otherlv_11, grammarAccess.getExtensionAccess().getToKeyword_8_0_3());
                    				
                    // InternalUseCaseDslParser.g:345:5: ( (lv_resumeAt_12_0= RULE_INT ) )
                    // InternalUseCaseDslParser.g:346:6: (lv_resumeAt_12_0= RULE_INT )
                    {
                    // InternalUseCaseDslParser.g:346:6: (lv_resumeAt_12_0= RULE_INT )
                    // InternalUseCaseDslParser.g:347:7: lv_resumeAt_12_0= RULE_INT
                    {
                    lv_resumeAt_12_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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
                    // InternalUseCaseDslParser.g:365:4: ( (lv_end_13_0= ruleDeadEndStep ) )
                    {
                    // InternalUseCaseDslParser.g:365:4: ( (lv_end_13_0= ruleDeadEndStep ) )
                    // InternalUseCaseDslParser.g:366:5: (lv_end_13_0= ruleDeadEndStep )
                    {
                    // InternalUseCaseDslParser.g:366:5: (lv_end_13_0= ruleDeadEndStep )
                    // InternalUseCaseDslParser.g:367:6: lv_end_13_0= ruleDeadEndStep
                    {

                    						newCompositeNode(grammarAccess.getExtensionAccess().getEndDeadEndStepParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_16);
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
    // InternalUseCaseDslParser.g:393:1: entryRuleUseCaseStep returns [EObject current=null] : iv_ruleUseCaseStep= ruleUseCaseStep EOF ;
    public final EObject entryRuleUseCaseStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseStep = null;


        try {
            // InternalUseCaseDslParser.g:393:52: (iv_ruleUseCaseStep= ruleUseCaseStep EOF )
            // InternalUseCaseDslParser.g:394:2: iv_ruleUseCaseStep= ruleUseCaseStep EOF
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
    // InternalUseCaseDslParser.g:400:1: ruleUseCaseStep returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= User ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= KW_System ( (lv_sentence_9_0= ruleLongName ) ) ) ) ;
    public final EObject ruleUseCaseStep() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_sentence_4_0 = null;

        AntlrDatatypeRuleToken lv_sentence_9_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:406:2: ( ( ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= User ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= KW_System ( (lv_sentence_9_0= ruleLongName ) ) ) ) )
            // InternalUseCaseDslParser.g:407:2: ( ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= User ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= KW_System ( (lv_sentence_9_0= ruleLongName ) ) ) )
            {
            // InternalUseCaseDslParser.g:407:2: ( ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= User ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= KW_System ( (lv_sentence_9_0= ruleLongName ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==FullStop) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==KW_System) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==User) ) {
                        alt6=1;
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
                    // InternalUseCaseDslParser.g:408:3: ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= User ( (lv_sentence_4_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:408:3: ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= User ( (lv_sentence_4_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:409:4: () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= User ( (lv_sentence_4_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:409:4: ()
                    // InternalUseCaseDslParser.g:410:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getUserStepAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:416:4: ( (lv_name_1_0= RULE_INT ) )
                    // InternalUseCaseDslParser.g:417:5: (lv_name_1_0= RULE_INT )
                    {
                    // InternalUseCaseDslParser.g:417:5: (lv_name_1_0= RULE_INT )
                    // InternalUseCaseDslParser.g:418:6: lv_name_1_0= RULE_INT
                    {
                    lv_name_1_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

                    otherlv_2=(Token)match(input,FullStop,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,User,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getUseCaseStepAccess().getUserKeyword_0_3());
                    			
                    // InternalUseCaseDslParser.g:442:4: ( (lv_sentence_4_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:443:5: (lv_sentence_4_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:443:5: (lv_sentence_4_0= ruleLongName )
                    // InternalUseCaseDslParser.g:444:6: lv_sentence_4_0= ruleLongName
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
                    // InternalUseCaseDslParser.g:463:3: ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= KW_System ( (lv_sentence_9_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:463:3: ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= KW_System ( (lv_sentence_9_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:464:4: () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= KW_System ( (lv_sentence_9_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:464:4: ()
                    // InternalUseCaseDslParser.g:465:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getSystemStepAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:471:4: ( (lv_name_6_0= RULE_INT ) )
                    // InternalUseCaseDslParser.g:472:5: (lv_name_6_0= RULE_INT )
                    {
                    // InternalUseCaseDslParser.g:472:5: (lv_name_6_0= RULE_INT )
                    // InternalUseCaseDslParser.g:473:6: lv_name_6_0= RULE_INT
                    {
                    lv_name_6_0=(Token)match(input,RULE_INT,FOLLOW_10); 

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

                    otherlv_7=(Token)match(input,FullStop,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_1_2());
                    			
                    otherlv_8=(Token)match(input,KW_System,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getUseCaseStepAccess().getSystemKeyword_1_3());
                    			
                    // InternalUseCaseDslParser.g:497:4: ( (lv_sentence_9_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:498:5: (lv_sentence_9_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:498:5: (lv_sentence_9_0= ruleLongName )
                    // InternalUseCaseDslParser.g:499:6: lv_sentence_9_0= ruleLongName
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
    // InternalUseCaseDslParser.g:521:1: entryRuleExtensionStep returns [EObject current=null] : iv_ruleExtensionStep= ruleExtensionStep EOF ;
    public final EObject entryRuleExtensionStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionStep = null;


        try {
            // InternalUseCaseDslParser.g:521:54: (iv_ruleExtensionStep= ruleExtensionStep EOF )
            // InternalUseCaseDslParser.g:522:2: iv_ruleExtensionStep= ruleExtensionStep EOF
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
    // InternalUseCaseDslParser.g:528:1: ruleExtensionStep returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= User | otherlv_3= KW_System )? ( (lv_sentence_4_0= ruleLongName ) ) ) ;
    public final EObject ruleExtensionStep() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_sentence_4_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:534:2: ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= User | otherlv_3= KW_System )? ( (lv_sentence_4_0= ruleLongName ) ) ) )
            // InternalUseCaseDslParser.g:535:2: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= User | otherlv_3= KW_System )? ( (lv_sentence_4_0= ruleLongName ) ) )
            {
            // InternalUseCaseDslParser.g:535:2: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= User | otherlv_3= KW_System )? ( (lv_sentence_4_0= ruleLongName ) ) )
            // InternalUseCaseDslParser.g:536:3: ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= User | otherlv_3= KW_System )? ( (lv_sentence_4_0= ruleLongName ) )
            {
            // InternalUseCaseDslParser.g:536:3: ( (lv_name_0_0= RULE_INT ) )
            // InternalUseCaseDslParser.g:537:4: (lv_name_0_0= RULE_INT )
            {
            // InternalUseCaseDslParser.g:537:4: (lv_name_0_0= RULE_INT )
            // InternalUseCaseDslParser.g:538:5: lv_name_0_0= RULE_INT
            {
            lv_name_0_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getExtensionStepAccess().getNameINTTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,FullStop,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getExtensionStepAccess().getFullStopKeyword_1());
            		
            // InternalUseCaseDslParser.g:558:3: (otherlv_2= User | otherlv_3= KW_System )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==User) ) {
                alt7=1;
            }
            else if ( (LA7_0==KW_System) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCaseDslParser.g:559:4: otherlv_2= User
                    {
                    otherlv_2=(Token)match(input,User,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getExtensionStepAccess().getUserKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:564:4: otherlv_3= KW_System
                    {
                    otherlv_3=(Token)match(input,KW_System,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getExtensionStepAccess().getSystemKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalUseCaseDslParser.g:569:3: ( (lv_sentence_4_0= ruleLongName ) )
            // InternalUseCaseDslParser.g:570:4: (lv_sentence_4_0= ruleLongName )
            {
            // InternalUseCaseDslParser.g:570:4: (lv_sentence_4_0= ruleLongName )
            // InternalUseCaseDslParser.g:571:5: lv_sentence_4_0= ruleLongName
            {

            					newCompositeNode(grammarAccess.getExtensionStepAccess().getSentenceLongNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_sentence_4_0=ruleLongName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtensionStepRule());
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
    // InternalUseCaseDslParser.g:592:1: entryRuleDeadEndStep returns [EObject current=null] : iv_ruleDeadEndStep= ruleDeadEndStep EOF ;
    public final EObject entryRuleDeadEndStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeadEndStep = null;


        try {
            // InternalUseCaseDslParser.g:592:52: (iv_ruleDeadEndStep= ruleDeadEndStep EOF )
            // InternalUseCaseDslParser.g:593:2: iv_ruleDeadEndStep= ruleDeadEndStep EOF
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
    // InternalUseCaseDslParser.g:599:1: ruleDeadEndStep returns [EObject current=null] : (this_ExtensionStep_0= ruleExtensionStep otherlv_1= UC otherlv_2= END ) ;
    public final EObject ruleDeadEndStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject this_ExtensionStep_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:605:2: ( (this_ExtensionStep_0= ruleExtensionStep otherlv_1= UC otherlv_2= END ) )
            // InternalUseCaseDslParser.g:606:2: (this_ExtensionStep_0= ruleExtensionStep otherlv_1= UC otherlv_2= END )
            {
            // InternalUseCaseDslParser.g:606:2: (this_ExtensionStep_0= ruleExtensionStep otherlv_1= UC otherlv_2= END )
            // InternalUseCaseDslParser.g:607:3: this_ExtensionStep_0= ruleExtensionStep otherlv_1= UC otherlv_2= END
            {

            			newCompositeNode(grammarAccess.getDeadEndStepAccess().getExtensionStepParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_ExtensionStep_0=ruleExtensionStep();

            state._fsp--;


            			current = this_ExtensionStep_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,UC,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getDeadEndStepAccess().getUCKeyword_1());
            		
            otherlv_2=(Token)match(input,END,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDeadEndStepAccess().getENDKeyword_2());
            		

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


    // $ANTLR start "entryRuleLongName"
    // InternalUseCaseDslParser.g:627:1: entryRuleLongName returns [String current=null] : iv_ruleLongName= ruleLongName EOF ;
    public final String entryRuleLongName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLongName = null;


        try {
            // InternalUseCaseDslParser.g:627:48: (iv_ruleLongName= ruleLongName EOF )
            // InternalUseCaseDslParser.g:628:2: iv_ruleLongName= ruleLongName EOF
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
    // InternalUseCaseDslParser.g:634:1: ruleLongName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ ;
    public final AntlrDatatypeRuleToken ruleLongName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_CHAR_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:640:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ )
            // InternalUseCaseDslParser.g:641:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
            {
            // InternalUseCaseDslParser.g:641:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
            int cnt8=0;
            loop8:
            do {
                int alt8=8;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt8=1;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt8=2;
                    }
                    break;
                case RULE_CHAR:
                    {
                    alt8=3;
                    }
                    break;
                case Colon:
                    {
                    alt8=4;
                    }
                    break;
                case FullStop:
                    {
                    alt8=5;
                    }
                    break;
                case QuotationMark:
                    {
                    alt8=6;
                    }
                    break;
                case Apostrophe:
                    {
                    alt8=7;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:642:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUseCaseDslParser.g:650:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_22); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUseCaseDslParser.g:658:3: this_CHAR_2= RULE_CHAR
            	    {
            	    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_22); 

            	    			current.merge(this_CHAR_2);
            	    		

            	    			newLeafNode(this_CHAR_2, grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUseCaseDslParser.g:666:3: kw= Colon
            	    {
            	    kw=(Token)match(input,Colon,FOLLOW_22); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getColonKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUseCaseDslParser.g:672:3: kw= FullStop
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_22); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUseCaseDslParser.g:678:3: kw= QuotationMark
            	    {
            	    kw=(Token)match(input,QuotationMark,FOLLOW_22); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalUseCaseDslParser.g:684:3: kw= Apostrophe
            	    {
            	    kw=(Token)match(input,Apostrophe,FOLLOW_22); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getApostropheKeyword_6());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // InternalUseCaseDslParser.g:693:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalUseCaseDslParser.g:693:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalUseCaseDslParser.g:694:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalUseCaseDslParser.g:700:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+ ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_CHAR_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:706:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+ )
            // InternalUseCaseDslParser.g:707:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+
            {
            // InternalUseCaseDslParser.g:707:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+
            int cnt9=0;
            loop9:
            do {
                int alt9=10;
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
                case AND:
                    {
                    alt9=8;
                    }
                    break;
                case OR:
                    {
                    alt9=9;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:708:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getConditionAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUseCaseDslParser.g:716:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_23); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUseCaseDslParser.g:724:3: this_CHAR_2= RULE_CHAR
            	    {
            	    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_23); 

            	    			current.merge(this_CHAR_2);
            	    		

            	    			newLeafNode(this_CHAR_2, grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUseCaseDslParser.g:732:3: kw= Colon
            	    {
            	    kw=(Token)match(input,Colon,FOLLOW_23); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getColonKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUseCaseDslParser.g:738:3: kw= FullStop
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_23); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUseCaseDslParser.g:744:3: kw= QuotationMark
            	    {
            	    kw=(Token)match(input,QuotationMark,FOLLOW_23); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getQuotationMarkKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalUseCaseDslParser.g:750:3: kw= Apostrophe
            	    {
            	    kw=(Token)match(input,Apostrophe,FOLLOW_23); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getApostropheKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalUseCaseDslParser.g:756:3: kw= AND
            	    {
            	    kw=(Token)match(input,AND,FOLLOW_23); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getANDKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalUseCaseDslParser.g:762:3: kw= OR
            	    {
            	    kw=(Token)match(input,OR,FOLLOW_23); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getORKeyword_8());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\27\1\21\1\6\2\17\7\15\2\uffff";
    static final String dfa_3s = "\1\27\1\21\12\34\2\uffff";
    static final String dfa_4s = "\14\uffff\1\2\1\1";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\14\1\4\1\3\6\uffff\1\12\1\13\1\11\1\10\1\7\2\uffff\1\5\5\uffff\1\6",
            "\1\12\1\13\1\11\1\10\1\7\2\uffff\1\5\5\uffff\1\6",
            "\1\12\1\13\1\11\1\10\1\7\2\uffff\1\5\5\uffff\1\6",
            "\1\14\1\uffff\1\12\1\13\1\11\1\10\1\7\2\uffff\1\5\1\15\4\uffff\1\6",
            "\1\14\1\uffff\1\12\1\13\1\11\1\10\1\7\2\uffff\1\5\1\15\4\uffff\1\6",
            "\1\14\1\uffff\1\12\1\13\1\11\1\10\1\7\2\uffff\1\5\1\15\4\uffff\1\6",
            "\1\14\1\uffff\1\12\1\13\1\11\1\10\1\7\2\uffff\1\5\1\15\4\uffff\1\6",
            "\1\14\1\uffff\1\12\1\13\1\11\1\10\1\7\2\uffff\1\5\1\15\4\uffff\1\6",
            "\1\14\1\uffff\1\12\1\13\1\11\1\10\1\7\2\uffff\1\5\1\15\4\uffff\1\6",
            "\1\14\1\uffff\1\12\1\13\1\11\1\10\1\7\2\uffff\1\5\1\15\4\uffff\1\6",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 308:3: ( (lv_steps_7_0= ruleExtensionStep ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000104F8000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000104F9200L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000104F8180L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000104F8002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000104F9202L});

}