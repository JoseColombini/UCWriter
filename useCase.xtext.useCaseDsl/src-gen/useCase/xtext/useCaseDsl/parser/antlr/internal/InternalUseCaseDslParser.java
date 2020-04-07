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
    // InternalUseCaseDslParser.g:69:1: ruleUseCase returns [EObject current=null] : (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_mainflow_4_0= ruleMainFlow ) ) ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_mainflow_4_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalUseCaseDslParser.g:76:2: ( (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_mainflow_4_0= ruleMainFlow ) ) ) )
            // InternalUseCaseDslParser.g:77:2: (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_mainflow_4_0= ruleMainFlow ) ) )
            {
            // InternalUseCaseDslParser.g:77:2: (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_mainflow_4_0= ruleMainFlow ) ) )
            // InternalUseCaseDslParser.g:78:3: otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_mainflow_4_0= ruleMainFlow ) )
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

            // InternalUseCaseDslParser.g:123:3: ( (lv_mainflow_4_0= ruleMainFlow ) )
            // InternalUseCaseDslParser.g:124:4: (lv_mainflow_4_0= ruleMainFlow )
            {
            // InternalUseCaseDslParser.g:124:4: (lv_mainflow_4_0= ruleMainFlow )
            // InternalUseCaseDslParser.g:125:5: lv_mainflow_4_0= ruleMainFlow
            {

            					newCompositeNode(grammarAccess.getUseCaseAccess().getMainflowMainFlowParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_mainflow_4_0=ruleMainFlow();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUseCaseRule());
            					}
            					set(
            						current,
            						"mainflow",
            						lv_mainflow_4_0,
            						"useCase.xtext.useCaseDsl.UseCaseDsl.MainFlow");
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleMainFlow"
    // InternalUseCaseDslParser.g:149:1: entryRuleMainFlow returns [EObject current=null] : iv_ruleMainFlow= ruleMainFlow EOF ;
    public final EObject entryRuleMainFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainFlow = null;


        try {
            // InternalUseCaseDslParser.g:149:49: (iv_ruleMainFlow= ruleMainFlow EOF )
            // InternalUseCaseDslParser.g:150:2: iv_ruleMainFlow= ruleMainFlow EOF
            {
             newCompositeNode(grammarAccess.getMainFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainFlow=ruleMainFlow();

            state._fsp--;

             current =iv_ruleMainFlow; 
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
    // $ANTLR end "entryRuleMainFlow"


    // $ANTLR start "ruleMainFlow"
    // InternalUseCaseDslParser.g:156:1: ruleMainFlow returns [EObject current=null] : ( () ( (lv_name_1_0= MainFlow ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END ) ;
    public final EObject ruleMainFlow() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_steps_4_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:162:2: ( ( () ( (lv_name_1_0= MainFlow ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END ) )
            // InternalUseCaseDslParser.g:163:2: ( () ( (lv_name_1_0= MainFlow ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END )
            {
            // InternalUseCaseDslParser.g:163:2: ( () ( (lv_name_1_0= MainFlow ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END )
            // InternalUseCaseDslParser.g:164:3: () ( (lv_name_1_0= MainFlow ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END
            {
            // InternalUseCaseDslParser.g:164:3: ()
            // InternalUseCaseDslParser.g:165:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMainFlowAccess().getMainFlowAction_0(),
            					current);
            			

            }

            // InternalUseCaseDslParser.g:171:3: ( (lv_name_1_0= MainFlow ) )
            // InternalUseCaseDslParser.g:172:4: (lv_name_1_0= MainFlow )
            {
            // InternalUseCaseDslParser.g:172:4: (lv_name_1_0= MainFlow )
            // InternalUseCaseDslParser.g:173:5: lv_name_1_0= MainFlow
            {
            lv_name_1_0=(Token)match(input,MainFlow,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMainFlowAccess().getNameMainFlowKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainFlowRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "MainFlow");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMainFlowAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_3); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getMainFlowAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalUseCaseDslParser.g:193:3: ( (lv_steps_4_0= ruleStep ) )+
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
            	    // InternalUseCaseDslParser.g:194:4: (lv_steps_4_0= ruleStep )
            	    {
            	    // InternalUseCaseDslParser.g:194:4: (lv_steps_4_0= ruleStep )
            	    // InternalUseCaseDslParser.g:195:5: lv_steps_4_0= ruleStep
            	    {

            	    					newCompositeNode(grammarAccess.getMainFlowAccess().getStepsStepParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_steps_4_0=ruleStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMainFlowRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_4_0,
            	    						"useCase.xtext.useCaseDsl.UseCaseDsl.Step");
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

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getMainFlowAccess().getENDTerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleMainFlow"


    // $ANTLR start "entryRuleStep"
    // InternalUseCaseDslParser.g:220:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalUseCaseDslParser.g:220:45: (iv_ruleStep= ruleStep EOF )
            // InternalUseCaseDslParser.g:221:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
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
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalUseCaseDslParser.g:227:1: ruleStep returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_INT ) ) ( ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) ) ) ( (lv_sentence_3_0= ruleLongName ) ) ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_2_1 = null;

        EObject lv_type_2_2 = null;

        AntlrDatatypeRuleToken lv_sentence_3_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:233:2: ( ( () ( (lv_name_1_0= RULE_INT ) ) ( ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) ) ) ( (lv_sentence_3_0= ruleLongName ) ) ) )
            // InternalUseCaseDslParser.g:234:2: ( () ( (lv_name_1_0= RULE_INT ) ) ( ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) ) ) ( (lv_sentence_3_0= ruleLongName ) ) )
            {
            // InternalUseCaseDslParser.g:234:2: ( () ( (lv_name_1_0= RULE_INT ) ) ( ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) ) ) ( (lv_sentence_3_0= ruleLongName ) ) )
            // InternalUseCaseDslParser.g:235:3: () ( (lv_name_1_0= RULE_INT ) ) ( ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) ) ) ( (lv_sentence_3_0= ruleLongName ) )
            {
            // InternalUseCaseDslParser.g:235:3: ()
            // InternalUseCaseDslParser.g:236:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepAccess().getStepAction_0(),
            					current);
            			

            }

            // InternalUseCaseDslParser.g:242:3: ( (lv_name_1_0= RULE_INT ) )
            // InternalUseCaseDslParser.g:243:4: (lv_name_1_0= RULE_INT )
            {
            // InternalUseCaseDslParser.g:243:4: (lv_name_1_0= RULE_INT )
            // InternalUseCaseDslParser.g:244:5: lv_name_1_0= RULE_INT
            {
            lv_name_1_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStepAccess().getNameINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalUseCaseDslParser.g:260:3: ( ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) ) )
            // InternalUseCaseDslParser.g:261:4: ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) )
            {
            // InternalUseCaseDslParser.g:261:4: ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) )
            // InternalUseCaseDslParser.g:262:5: (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep )
            {
            // InternalUseCaseDslParser.g:262:5: (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep )
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
                    // InternalUseCaseDslParser.g:263:6: lv_type_2_1= ruleUserStep
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getTypeUserStepParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_type_2_1=ruleUserStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_1,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.UserStep");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:279:6: lv_type_2_2= ruleSystemStep
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getTypeSystemStepParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_5);
                    lv_type_2_2=ruleSystemStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_2,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.SystemStep");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalUseCaseDslParser.g:297:3: ( (lv_sentence_3_0= ruleLongName ) )
            // InternalUseCaseDslParser.g:298:4: (lv_sentence_3_0= ruleLongName )
            {
            // InternalUseCaseDslParser.g:298:4: (lv_sentence_3_0= ruleLongName )
            // InternalUseCaseDslParser.g:299:5: lv_sentence_3_0= ruleLongName
            {

            					newCompositeNode(grammarAccess.getStepAccess().getSentenceLongNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_sentence_3_0=ruleLongName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepRule());
            					}
            					set(
            						current,
            						"sentence",
            						lv_sentence_3_0,
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
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleUserStep"
    // InternalUseCaseDslParser.g:320:1: entryRuleUserStep returns [EObject current=null] : iv_ruleUserStep= ruleUserStep EOF ;
    public final EObject entryRuleUserStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserStep = null;


        try {
            // InternalUseCaseDslParser.g:320:49: (iv_ruleUserStep= ruleUserStep EOF )
            // InternalUseCaseDslParser.g:321:2: iv_ruleUserStep= ruleUserStep EOF
            {
             newCompositeNode(grammarAccess.getUserStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserStep=ruleUserStep();

            state._fsp--;

             current =iv_ruleUserStep; 
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
    // $ANTLR end "entryRuleUserStep"


    // $ANTLR start "ruleUserStep"
    // InternalUseCaseDslParser.g:327:1: ruleUserStep returns [EObject current=null] : ( () otherlv_1= FullStop otherlv_2= User ) ;
    public final EObject ruleUserStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:333:2: ( ( () otherlv_1= FullStop otherlv_2= User ) )
            // InternalUseCaseDslParser.g:334:2: ( () otherlv_1= FullStop otherlv_2= User )
            {
            // InternalUseCaseDslParser.g:334:2: ( () otherlv_1= FullStop otherlv_2= User )
            // InternalUseCaseDslParser.g:335:3: () otherlv_1= FullStop otherlv_2= User
            {
            // InternalUseCaseDslParser.g:335:3: ()
            // InternalUseCaseDslParser.g:336:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUserStepAccess().getUserStepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,FullStop,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getUserStepAccess().getFullStopKeyword_1());
            		
            otherlv_2=(Token)match(input,User,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getUserStepAccess().getUserKeyword_2());
            		

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
    // $ANTLR end "ruleUserStep"


    // $ANTLR start "entryRuleSystemStep"
    // InternalUseCaseDslParser.g:354:1: entryRuleSystemStep returns [EObject current=null] : iv_ruleSystemStep= ruleSystemStep EOF ;
    public final EObject entryRuleSystemStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemStep = null;


        try {
            // InternalUseCaseDslParser.g:354:51: (iv_ruleSystemStep= ruleSystemStep EOF )
            // InternalUseCaseDslParser.g:355:2: iv_ruleSystemStep= ruleSystemStep EOF
            {
             newCompositeNode(grammarAccess.getSystemStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemStep=ruleSystemStep();

            state._fsp--;

             current =iv_ruleSystemStep; 
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
    // $ANTLR end "entryRuleSystemStep"


    // $ANTLR start "ruleSystemStep"
    // InternalUseCaseDslParser.g:361:1: ruleSystemStep returns [EObject current=null] : ( () otherlv_1= FullStop otherlv_2= KW_System ) ;
    public final EObject ruleSystemStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:367:2: ( ( () otherlv_1= FullStop otherlv_2= KW_System ) )
            // InternalUseCaseDslParser.g:368:2: ( () otherlv_1= FullStop otherlv_2= KW_System )
            {
            // InternalUseCaseDslParser.g:368:2: ( () otherlv_1= FullStop otherlv_2= KW_System )
            // InternalUseCaseDslParser.g:369:3: () otherlv_1= FullStop otherlv_2= KW_System
            {
            // InternalUseCaseDslParser.g:369:3: ()
            // InternalUseCaseDslParser.g:370:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemStepAccess().getSystemStepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,FullStop,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemStepAccess().getFullStopKeyword_1());
            		
            otherlv_2=(Token)match(input,KW_System,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemStepAccess().getSystemKeyword_2());
            		

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
    // $ANTLR end "ruleSystemStep"


    // $ANTLR start "entryRuleLongName"
    // InternalUseCaseDslParser.g:388:1: entryRuleLongName returns [String current=null] : iv_ruleLongName= ruleLongName EOF ;
    public final String entryRuleLongName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLongName = null;


        try {
            // InternalUseCaseDslParser.g:388:48: (iv_ruleLongName= ruleLongName EOF )
            // InternalUseCaseDslParser.g:389:2: iv_ruleLongName= ruleLongName EOF
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
    // InternalUseCaseDslParser.g:395:1: ruleLongName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ ;
    public final AntlrDatatypeRuleToken ruleLongName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:401:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ )
            // InternalUseCaseDslParser.g:402:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
            {
            // InternalUseCaseDslParser.g:402:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
            int cnt3=0;
            loop3:
            do {
                int alt3=7;
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

                }

                switch (alt3) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:403:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUseCaseDslParser.g:411:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_12); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUseCaseDslParser.g:419:3: kw= Colon
            	    {
            	    kw=(Token)match(input,Colon,FOLLOW_12); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getColonKeyword_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUseCaseDslParser.g:425:3: kw= FullStop
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_12); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getFullStopKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUseCaseDslParser.g:431:3: kw= QuotationMark
            	    {
            	    kw=(Token)match(input,QuotationMark,FOLLOW_12); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getQuotationMarkKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUseCaseDslParser.g:437:3: kw= Apostrophe
            	    {
            	    kw=(Token)match(input,Apostrophe,FOLLOW_12); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getApostropheKeyword_5());
            	    		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000208F00L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000208F02L});

}