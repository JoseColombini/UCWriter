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


        try {
            // InternalUseCaseDslParser.g:57:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUseCaseDslParser.g:58:2: iv_ruleUseCase= ruleUseCase EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // InternalUseCaseDslParser.g:64:1: ruleUseCase returns [EObject current=null] : (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) )+ ( (lv_mainflow_4_0= ruleMainFlow ) ) ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_mainflow_4_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:70:2: ( (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) )+ ( (lv_mainflow_4_0= ruleMainFlow ) ) ) )
            // InternalUseCaseDslParser.g:71:2: (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) )+ ( (lv_mainflow_4_0= ruleMainFlow ) ) )
            {
            // InternalUseCaseDslParser.g:71:2: (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) )+ ( (lv_mainflow_4_0= ruleMainFlow ) ) )
            // InternalUseCaseDslParser.g:72:3: otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) )+ ( (lv_mainflow_4_0= ruleMainFlow ) )
            {
            otherlv_0=(Token)match(input,UC,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUCKeyword_0());
            		
            // InternalUseCaseDslParser.g:76:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalUseCaseDslParser.g:77:4: (lv_number_1_0= RULE_INT )
            {
            // InternalUseCaseDslParser.g:77:4: (lv_number_1_0= RULE_INT )
            // InternalUseCaseDslParser.g:78:5: lv_number_1_0= RULE_INT
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
            		
            // InternalUseCaseDslParser.g:98:3: ( (lv_name_3_0= ruleLongName ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=FullStop && LA1_0<=RULE_CHAR)||LA1_0==RULE_ID||LA1_0==RULE_ANY_OTHER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:99:4: (lv_name_3_0= ruleLongName )
            	    {
            	    // InternalUseCaseDslParser.g:99:4: (lv_name_3_0= ruleLongName )
            	    // InternalUseCaseDslParser.g:100:5: lv_name_3_0= ruleLongName
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseAccess().getNameLongNameParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_name_3_0=ruleLongName();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"name",
            	    						lv_name_3_0,
            	    						"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
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

            // InternalUseCaseDslParser.g:117:3: ( (lv_mainflow_4_0= ruleMainFlow ) )
            // InternalUseCaseDslParser.g:118:4: (lv_mainflow_4_0= ruleMainFlow )
            {
            // InternalUseCaseDslParser.g:118:4: (lv_mainflow_4_0= ruleMainFlow )
            // InternalUseCaseDslParser.g:119:5: lv_mainflow_4_0= ruleMainFlow
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
        }
        return current;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleMainFlow"
    // InternalUseCaseDslParser.g:140:1: entryRuleMainFlow returns [EObject current=null] : iv_ruleMainFlow= ruleMainFlow EOF ;
    public final EObject entryRuleMainFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainFlow = null;


        try {
            // InternalUseCaseDslParser.g:140:49: (iv_ruleMainFlow= ruleMainFlow EOF )
            // InternalUseCaseDslParser.g:141:2: iv_ruleMainFlow= ruleMainFlow EOF
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
    // InternalUseCaseDslParser.g:147:1: ruleMainFlow returns [EObject current=null] : ( () otherlv_1= MainFlow otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END ) ;
    public final EObject ruleMainFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_steps_4_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:153:2: ( ( () otherlv_1= MainFlow otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END ) )
            // InternalUseCaseDslParser.g:154:2: ( () otherlv_1= MainFlow otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END )
            {
            // InternalUseCaseDslParser.g:154:2: ( () otherlv_1= MainFlow otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END )
            // InternalUseCaseDslParser.g:155:3: () otherlv_1= MainFlow otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END
            {
            // InternalUseCaseDslParser.g:155:3: ()
            // InternalUseCaseDslParser.g:156:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMainFlowAccess().getMainFlowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,MainFlow,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMainFlowAccess().getMainFlowKeyword_1());
            		
            otherlv_2=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMainFlowAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_3); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getMainFlowAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalUseCaseDslParser.g:174:3: ( (lv_steps_4_0= ruleStep ) )+
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
            	    // InternalUseCaseDslParser.g:175:4: (lv_steps_4_0= ruleStep )
            	    {
            	    // InternalUseCaseDslParser.g:175:4: (lv_steps_4_0= ruleStep )
            	    // InternalUseCaseDslParser.g:176:5: lv_steps_4_0= ruleStep
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // InternalUseCaseDslParser.g:201:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalUseCaseDslParser.g:201:45: (iv_ruleStep= ruleStep EOF )
            // InternalUseCaseDslParser.g:202:2: iv_ruleStep= ruleStep EOF
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
    // InternalUseCaseDslParser.g:208:1: ruleStep returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_INT ) ) ( ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) ) ) ( (lv_sentence_3_0= ruleLongName ) )+ ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_2_1 = null;

        EObject lv_type_2_2 = null;

        AntlrDatatypeRuleToken lv_sentence_3_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:214:2: ( ( () ( (lv_name_1_0= RULE_INT ) ) ( ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) ) ) ( (lv_sentence_3_0= ruleLongName ) )+ ) )
            // InternalUseCaseDslParser.g:215:2: ( () ( (lv_name_1_0= RULE_INT ) ) ( ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) ) ) ( (lv_sentence_3_0= ruleLongName ) )+ )
            {
            // InternalUseCaseDslParser.g:215:2: ( () ( (lv_name_1_0= RULE_INT ) ) ( ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) ) ) ( (lv_sentence_3_0= ruleLongName ) )+ )
            // InternalUseCaseDslParser.g:216:3: () ( (lv_name_1_0= RULE_INT ) ) ( ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) ) ) ( (lv_sentence_3_0= ruleLongName ) )+
            {
            // InternalUseCaseDslParser.g:216:3: ()
            // InternalUseCaseDslParser.g:217:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepAccess().getStepAction_0(),
            					current);
            			

            }

            // InternalUseCaseDslParser.g:223:3: ( (lv_name_1_0= RULE_INT ) )
            // InternalUseCaseDslParser.g:224:4: (lv_name_1_0= RULE_INT )
            {
            // InternalUseCaseDslParser.g:224:4: (lv_name_1_0= RULE_INT )
            // InternalUseCaseDslParser.g:225:5: lv_name_1_0= RULE_INT
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

            // InternalUseCaseDslParser.g:241:3: ( ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) ) )
            // InternalUseCaseDslParser.g:242:4: ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) )
            {
            // InternalUseCaseDslParser.g:242:4: ( (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep ) )
            // InternalUseCaseDslParser.g:243:5: (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep )
            {
            // InternalUseCaseDslParser.g:243:5: (lv_type_2_1= ruleUserStep | lv_type_2_2= ruleSystemStep )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==FullStop) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==KW_System) ) {
                    alt3=2;
                }
                else if ( (LA3_1==User) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUseCaseDslParser.g:244:6: lv_type_2_1= ruleUserStep
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
                    // InternalUseCaseDslParser.g:260:6: lv_type_2_2= ruleSystemStep
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

            // InternalUseCaseDslParser.g:278:3: ( (lv_sentence_3_0= ruleLongName ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=FullStop && LA4_0<=RULE_CHAR)||LA4_0==RULE_ID||LA4_0==RULE_ANY_OTHER) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:279:4: (lv_sentence_3_0= ruleLongName )
            	    {
            	    // InternalUseCaseDslParser.g:279:4: (lv_sentence_3_0= ruleLongName )
            	    // InternalUseCaseDslParser.g:280:5: lv_sentence_3_0= ruleLongName
            	    {

            	    					newCompositeNode(grammarAccess.getStepAccess().getSentenceLongNameParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_sentence_3_0=ruleLongName();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sentence",
            	    						lv_sentence_3_0,
            	    						"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
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
    // InternalUseCaseDslParser.g:301:1: entryRuleUserStep returns [EObject current=null] : iv_ruleUserStep= ruleUserStep EOF ;
    public final EObject entryRuleUserStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserStep = null;


        try {
            // InternalUseCaseDslParser.g:301:49: (iv_ruleUserStep= ruleUserStep EOF )
            // InternalUseCaseDslParser.g:302:2: iv_ruleUserStep= ruleUserStep EOF
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
    // InternalUseCaseDslParser.g:308:1: ruleUserStep returns [EObject current=null] : ( () otherlv_1= FullStop otherlv_2= User ) ;
    public final EObject ruleUserStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:314:2: ( ( () otherlv_1= FullStop otherlv_2= User ) )
            // InternalUseCaseDslParser.g:315:2: ( () otherlv_1= FullStop otherlv_2= User )
            {
            // InternalUseCaseDslParser.g:315:2: ( () otherlv_1= FullStop otherlv_2= User )
            // InternalUseCaseDslParser.g:316:3: () otherlv_1= FullStop otherlv_2= User
            {
            // InternalUseCaseDslParser.g:316:3: ()
            // InternalUseCaseDslParser.g:317:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUserStepAccess().getUserStepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,FullStop,FOLLOW_11); 

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
    // InternalUseCaseDslParser.g:335:1: entryRuleSystemStep returns [EObject current=null] : iv_ruleSystemStep= ruleSystemStep EOF ;
    public final EObject entryRuleSystemStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemStep = null;


        try {
            // InternalUseCaseDslParser.g:335:51: (iv_ruleSystemStep= ruleSystemStep EOF )
            // InternalUseCaseDslParser.g:336:2: iv_ruleSystemStep= ruleSystemStep EOF
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
    // InternalUseCaseDslParser.g:342:1: ruleSystemStep returns [EObject current=null] : ( () otherlv_1= FullStop otherlv_2= KW_System ) ;
    public final EObject ruleSystemStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:348:2: ( ( () otherlv_1= FullStop otherlv_2= KW_System ) )
            // InternalUseCaseDslParser.g:349:2: ( () otherlv_1= FullStop otherlv_2= KW_System )
            {
            // InternalUseCaseDslParser.g:349:2: ( () otherlv_1= FullStop otherlv_2= KW_System )
            // InternalUseCaseDslParser.g:350:3: () otherlv_1= FullStop otherlv_2= KW_System
            {
            // InternalUseCaseDslParser.g:350:3: ()
            // InternalUseCaseDslParser.g:351:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemStepAccess().getSystemStepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,FullStop,FOLLOW_12); 

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
    // InternalUseCaseDslParser.g:369:1: entryRuleLongName returns [String current=null] : iv_ruleLongName= ruleLongName EOF ;
    public final String entryRuleLongName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLongName = null;


        try {
            // InternalUseCaseDslParser.g:369:48: (iv_ruleLongName= ruleLongName EOF )
            // InternalUseCaseDslParser.g:370:2: iv_ruleLongName= ruleLongName EOF
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
    // InternalUseCaseDslParser.g:376:1: ruleLongName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop ) (this_WS_5= RULE_WS )? ) ;
    public final AntlrDatatypeRuleToken ruleLongName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_CHAR_2=null;
        Token kw=null;
        Token this_WS_5=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:382:2: ( ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop ) (this_WS_5= RULE_WS )? ) )
            // InternalUseCaseDslParser.g:383:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop ) (this_WS_5= RULE_WS )? )
            {
            // InternalUseCaseDslParser.g:383:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop ) (this_WS_5= RULE_WS )? )
            // InternalUseCaseDslParser.g:384:3: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop ) (this_WS_5= RULE_WS )?
            {
            // InternalUseCaseDslParser.g:384:3: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt5=2;
                }
                break;
            case RULE_CHAR:
                {
                alt5=3;
                }
                break;
            case Colon:
                {
                alt5=4;
                }
                break;
            case FullStop:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUseCaseDslParser.g:385:4: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:393:4: this_ANY_OTHER_1= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_13); 

                    				current.merge(this_ANY_OTHER_1);
                    			

                    				newLeafNode(this_ANY_OTHER_1, grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:401:4: this_CHAR_2= RULE_CHAR
                    {
                    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_13); 

                    				current.merge(this_CHAR_2);
                    			

                    				newLeafNode(this_CHAR_2, grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:409:4: kw= Colon
                    {
                    kw=(Token)match(input,Colon,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getLongNameAccess().getColonKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalUseCaseDslParser.g:415:4: kw= FullStop
                    {
                    kw=(Token)match(input,FullStop,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getLongNameAccess().getFullStopKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalUseCaseDslParser.g:421:3: (this_WS_5= RULE_WS )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_WS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCaseDslParser.g:422:4: this_WS_5= RULE_WS
                    {
                    this_WS_5=(Token)match(input,RULE_WS,FOLLOW_2); 

                    				current.merge(this_WS_5);
                    			

                    				newLeafNode(this_WS_5, grammarAccess.getLongNameAccess().getWSTerminalRuleCall_1());
                    			

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
        }
        return current;
    }
    // $ANTLR end "ruleLongName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000082700L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000082710L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000082702L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});

}