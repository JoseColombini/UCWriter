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
    // InternalUseCaseDslParser.g:64:1: ruleUseCase returns [EObject current=null] : (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) ( (lv_mainflow_4_0= ruleMainFlow ) ) ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject lv_mainflow_4_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:70:2: ( (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) ( (lv_mainflow_4_0= ruleMainFlow ) ) ) )
            // InternalUseCaseDslParser.g:71:2: (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) ( (lv_mainflow_4_0= ruleMainFlow ) ) )
            {
            // InternalUseCaseDslParser.g:71:2: (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) ( (lv_mainflow_4_0= ruleMainFlow ) ) )
            // InternalUseCaseDslParser.g:72:3: otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= RULE_ID ) ) ( (lv_mainflow_4_0= ruleMainFlow ) )
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
            		
            // InternalUseCaseDslParser.g:98:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalUseCaseDslParser.g:99:4: (lv_name_3_0= RULE_ID )
            {
            // InternalUseCaseDslParser.g:99:4: (lv_name_3_0= RULE_ID )
            // InternalUseCaseDslParser.g:100:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_3_0, grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUseCaseDslParser.g:116:3: ( (lv_mainflow_4_0= ruleMainFlow ) )
            // InternalUseCaseDslParser.g:117:4: (lv_mainflow_4_0= ruleMainFlow )
            {
            // InternalUseCaseDslParser.g:117:4: (lv_mainflow_4_0= ruleMainFlow )
            // InternalUseCaseDslParser.g:118:5: lv_mainflow_4_0= ruleMainFlow
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
    // InternalUseCaseDslParser.g:139:1: entryRuleMainFlow returns [EObject current=null] : iv_ruleMainFlow= ruleMainFlow EOF ;
    public final EObject entryRuleMainFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainFlow = null;


        try {
            // InternalUseCaseDslParser.g:139:49: (iv_ruleMainFlow= ruleMainFlow EOF )
            // InternalUseCaseDslParser.g:140:2: iv_ruleMainFlow= ruleMainFlow EOF
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
    // InternalUseCaseDslParser.g:146:1: ruleMainFlow returns [EObject current=null] : ( () otherlv_1= MainFlow otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END ) ;
    public final EObject ruleMainFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_steps_4_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:152:2: ( ( () otherlv_1= MainFlow otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END ) )
            // InternalUseCaseDslParser.g:153:2: ( () otherlv_1= MainFlow otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END )
            {
            // InternalUseCaseDslParser.g:153:2: ( () otherlv_1= MainFlow otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END )
            // InternalUseCaseDslParser.g:154:3: () otherlv_1= MainFlow otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_steps_4_0= ruleStep ) )+ this_END_5= RULE_END
            {
            // InternalUseCaseDslParser.g:154:3: ()
            // InternalUseCaseDslParser.g:155:4: 
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
            		
            // InternalUseCaseDslParser.g:173:3: ( (lv_steps_4_0= ruleStep ) )+
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
            	    // InternalUseCaseDslParser.g:174:4: (lv_steps_4_0= ruleStep )
            	    {
            	    // InternalUseCaseDslParser.g:174:4: (lv_steps_4_0= ruleStep )
            	    // InternalUseCaseDslParser.g:175:5: lv_steps_4_0= ruleStep
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
    // InternalUseCaseDslParser.g:200:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalUseCaseDslParser.g:200:45: (iv_ruleStep= ruleStep EOF )
            // InternalUseCaseDslParser.g:201:2: iv_ruleStep= ruleStep EOF
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
    // InternalUseCaseDslParser.g:207:1: ruleStep returns [EObject current=null] : ( () ( ( (lv_type_1_1= ruleUserStep | lv_type_1_2= ruleSystemStep ) ) ) ( (lv_sentence_2_0= ruleSentence ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject lv_type_1_1 = null;

        EObject lv_type_1_2 = null;

        AntlrDatatypeRuleToken lv_sentence_2_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:213:2: ( ( () ( ( (lv_type_1_1= ruleUserStep | lv_type_1_2= ruleSystemStep ) ) ) ( (lv_sentence_2_0= ruleSentence ) ) otherlv_3= Semicolon ) )
            // InternalUseCaseDslParser.g:214:2: ( () ( ( (lv_type_1_1= ruleUserStep | lv_type_1_2= ruleSystemStep ) ) ) ( (lv_sentence_2_0= ruleSentence ) ) otherlv_3= Semicolon )
            {
            // InternalUseCaseDslParser.g:214:2: ( () ( ( (lv_type_1_1= ruleUserStep | lv_type_1_2= ruleSystemStep ) ) ) ( (lv_sentence_2_0= ruleSentence ) ) otherlv_3= Semicolon )
            // InternalUseCaseDslParser.g:215:3: () ( ( (lv_type_1_1= ruleUserStep | lv_type_1_2= ruleSystemStep ) ) ) ( (lv_sentence_2_0= ruleSentence ) ) otherlv_3= Semicolon
            {
            // InternalUseCaseDslParser.g:215:3: ()
            // InternalUseCaseDslParser.g:216:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepAccess().getStepAction_0(),
            					current);
            			

            }

            // InternalUseCaseDslParser.g:222:3: ( ( (lv_type_1_1= ruleUserStep | lv_type_1_2= ruleSystemStep ) ) )
            // InternalUseCaseDslParser.g:223:4: ( (lv_type_1_1= ruleUserStep | lv_type_1_2= ruleSystemStep ) )
            {
            // InternalUseCaseDslParser.g:223:4: ( (lv_type_1_1= ruleUserStep | lv_type_1_2= ruleSystemStep ) )
            // InternalUseCaseDslParser.g:224:5: (lv_type_1_1= ruleUserStep | lv_type_1_2= ruleSystemStep )
            {
            // InternalUseCaseDslParser.g:224:5: (lv_type_1_1= ruleUserStep | lv_type_1_2= ruleSystemStep )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==FullStop) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==User) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==KW_System) ) {
                        alt2=2;
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
                    // InternalUseCaseDslParser.g:225:6: lv_type_1_1= ruleUserStep
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getTypeUserStepParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_type_1_1=ruleUserStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_1,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.UserStep");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:241:6: lv_type_1_2= ruleSystemStep
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getTypeSystemStepParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_9);
                    lv_type_1_2=ruleSystemStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_2,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.SystemStep");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalUseCaseDslParser.g:259:3: ( (lv_sentence_2_0= ruleSentence ) )
            // InternalUseCaseDslParser.g:260:4: (lv_sentence_2_0= ruleSentence )
            {
            // InternalUseCaseDslParser.g:260:4: (lv_sentence_2_0= ruleSentence )
            // InternalUseCaseDslParser.g:261:5: lv_sentence_2_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getStepAccess().getSentenceSentenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_sentence_2_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStepRule());
            					}
            					set(
            						current,
            						"sentence",
            						lv_sentence_2_0,
            						"useCase.xtext.useCaseDsl.UseCaseDsl.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStepAccess().getSemicolonKeyword_3());
            		

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
    // InternalUseCaseDslParser.g:286:1: entryRuleUserStep returns [EObject current=null] : iv_ruleUserStep= ruleUserStep EOF ;
    public final EObject entryRuleUserStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserStep = null;


        try {
            // InternalUseCaseDslParser.g:286:49: (iv_ruleUserStep= ruleUserStep EOF )
            // InternalUseCaseDslParser.g:287:2: iv_ruleUserStep= ruleUserStep EOF
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
    // InternalUseCaseDslParser.g:293:1: ruleUserStep returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= User ) ;
    public final EObject ruleUserStep() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:299:2: ( ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= User ) )
            // InternalUseCaseDslParser.g:300:2: ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= User )
            {
            // InternalUseCaseDslParser.g:300:2: ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= User )
            // InternalUseCaseDslParser.g:301:3: () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= User
            {
            // InternalUseCaseDslParser.g:301:3: ()
            // InternalUseCaseDslParser.g:302:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUserStepAccess().getUserStepAction_0(),
            					current);
            			

            }

            // InternalUseCaseDslParser.g:308:3: ( (lv_name_1_0= RULE_INT ) )
            // InternalUseCaseDslParser.g:309:4: (lv_name_1_0= RULE_INT )
            {
            // InternalUseCaseDslParser.g:309:4: (lv_name_1_0= RULE_INT )
            // InternalUseCaseDslParser.g:310:5: lv_name_1_0= RULE_INT
            {
            lv_name_1_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUserStepAccess().getNameINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,FullStop,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getUserStepAccess().getFullStopKeyword_2());
            		
            otherlv_3=(Token)match(input,User,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getUserStepAccess().getUserKeyword_3());
            		

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
    // InternalUseCaseDslParser.g:338:1: entryRuleSystemStep returns [EObject current=null] : iv_ruleSystemStep= ruleSystemStep EOF ;
    public final EObject entryRuleSystemStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemStep = null;


        try {
            // InternalUseCaseDslParser.g:338:51: (iv_ruleSystemStep= ruleSystemStep EOF )
            // InternalUseCaseDslParser.g:339:2: iv_ruleSystemStep= ruleSystemStep EOF
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
    // InternalUseCaseDslParser.g:345:1: ruleSystemStep returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= KW_System ) ;
    public final EObject ruleSystemStep() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:351:2: ( ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= KW_System ) )
            // InternalUseCaseDslParser.g:352:2: ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= KW_System )
            {
            // InternalUseCaseDslParser.g:352:2: ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= KW_System )
            // InternalUseCaseDslParser.g:353:3: () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= KW_System
            {
            // InternalUseCaseDslParser.g:353:3: ()
            // InternalUseCaseDslParser.g:354:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemStepAccess().getSystemStepAction_0(),
            					current);
            			

            }

            // InternalUseCaseDslParser.g:360:3: ( (lv_name_1_0= RULE_INT ) )
            // InternalUseCaseDslParser.g:361:4: (lv_name_1_0= RULE_INT )
            {
            // InternalUseCaseDslParser.g:361:4: (lv_name_1_0= RULE_INT )
            // InternalUseCaseDslParser.g:362:5: lv_name_1_0= RULE_INT
            {
            lv_name_1_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemStepAccess().getNameINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemStepRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,FullStop,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemStepAccess().getFullStopKeyword_2());
            		
            otherlv_3=(Token)match(input,KW_System,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemStepAccess().getSystemKeyword_3());
            		

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


    // $ANTLR start "entryRuleSentence"
    // InternalUseCaseDslParser.g:390:1: entryRuleSentence returns [String current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final String entryRuleSentence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSentence = null;


        try {
            // InternalUseCaseDslParser.g:390:48: (iv_ruleSentence= ruleSentence EOF )
            // InternalUseCaseDslParser.g:391:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence.getText(); 
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
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalUseCaseDslParser.g:397:1: ruleSentence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING )* ;
    public final AntlrDatatypeRuleToken ruleSentence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:403:2: ( (this_STRING_0= RULE_STRING )* )
            // InternalUseCaseDslParser.g:404:2: (this_STRING_0= RULE_STRING )*
            {
            // InternalUseCaseDslParser.g:404:2: (this_STRING_0= RULE_STRING )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:405:3: this_STRING_0= RULE_STRING
            	    {
            	    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            	    			current.merge(this_STRING_0);
            	    		

            	    			newLeafNode(this_STRING_0, grammarAccess.getSentenceAccess().getSTRINGTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    break loop3;
                }
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
    // $ANTLR end "ruleSentence"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010400L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010002L});

}