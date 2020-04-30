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

        public InternalUseCaseDslParser(TokenStream input, UseCaseDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UseCaseDocument";
       	}

       	@Override
       	protected UseCaseDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUseCaseDocument"
    // InternalUseCaseDslParser.g:57:1: entryRuleUseCaseDocument returns [EObject current=null] : iv_ruleUseCaseDocument= ruleUseCaseDocument EOF ;
    public final EObject entryRuleUseCaseDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseDocument = null;


        try {
            // InternalUseCaseDslParser.g:57:56: (iv_ruleUseCaseDocument= ruleUseCaseDocument EOF )
            // InternalUseCaseDslParser.g:58:2: iv_ruleUseCaseDocument= ruleUseCaseDocument EOF
            {
             newCompositeNode(grammarAccess.getUseCaseDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCaseDocument=ruleUseCaseDocument();

            state._fsp--;

             current =iv_ruleUseCaseDocument; 
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
    // $ANTLR end "entryRuleUseCaseDocument"


    // $ANTLR start "ruleUseCaseDocument"
    // InternalUseCaseDslParser.g:64:1: ruleUseCaseDocument returns [EObject current=null] : ( (lv_usecase_0_0= ruleUseCase ) )+ ;
    public final EObject ruleUseCaseDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_usecase_0_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:70:2: ( ( (lv_usecase_0_0= ruleUseCase ) )+ )
            // InternalUseCaseDslParser.g:71:2: ( (lv_usecase_0_0= ruleUseCase ) )+
            {
            // InternalUseCaseDslParser.g:71:2: ( (lv_usecase_0_0= ruleUseCase ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==UC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:72:3: (lv_usecase_0_0= ruleUseCase )
            	    {
            	    // InternalUseCaseDslParser.g:72:3: (lv_usecase_0_0= ruleUseCase )
            	    // InternalUseCaseDslParser.g:73:4: lv_usecase_0_0= ruleUseCase
            	    {

            	    				newCompositeNode(grammarAccess.getUseCaseDocumentAccess().getUsecaseUseCaseParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_usecase_0_0=ruleUseCase();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getUseCaseDocumentRule());
            	    				}
            	    				add(
            	    					current,
            	    					"usecase",
            	    					lv_usecase_0_0,
            	    					"useCase.xtext.useCaseDsl.UseCaseDsl.UseCase");
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
    // $ANTLR end "ruleUseCaseDocument"


    // $ANTLR start "entryRuleUseCase"
    // InternalUseCaseDslParser.g:93:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // InternalUseCaseDslParser.g:93:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUseCaseDslParser.g:94:2: iv_ruleUseCase= ruleUseCase EOF
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
    // InternalUseCaseDslParser.g:100:1: ruleUseCase returns [EObject current=null] : (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_postcondition_5_0= rulePostcondition ) )? otherlv_6= MAIN otherlv_7= FLOW otherlv_8= Colon this_BEGIN_9= RULE_BEGIN ( (lv_steps_10_0= ruleUseCaseStep ) )+ this_END_11= RULE_END ( (otherlv_12= ALTERNATIVE otherlv_13= FLOW ) otherlv_14= Colon this_BEGIN_15= RULE_BEGIN ( (lv_alternativeflows_16_0= ruleExtension ) )+ this_END_17= RULE_END )? ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token this_BEGIN_9=null;
        Token this_END_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_BEGIN_15=null;
        Token this_END_17=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_precondition_4_0 = null;

        EObject lv_postcondition_5_0 = null;

        EObject lv_steps_10_0 = null;

        EObject lv_alternativeflows_16_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:106:2: ( (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_postcondition_5_0= rulePostcondition ) )? otherlv_6= MAIN otherlv_7= FLOW otherlv_8= Colon this_BEGIN_9= RULE_BEGIN ( (lv_steps_10_0= ruleUseCaseStep ) )+ this_END_11= RULE_END ( (otherlv_12= ALTERNATIVE otherlv_13= FLOW ) otherlv_14= Colon this_BEGIN_15= RULE_BEGIN ( (lv_alternativeflows_16_0= ruleExtension ) )+ this_END_17= RULE_END )? ) )
            // InternalUseCaseDslParser.g:107:2: (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_postcondition_5_0= rulePostcondition ) )? otherlv_6= MAIN otherlv_7= FLOW otherlv_8= Colon this_BEGIN_9= RULE_BEGIN ( (lv_steps_10_0= ruleUseCaseStep ) )+ this_END_11= RULE_END ( (otherlv_12= ALTERNATIVE otherlv_13= FLOW ) otherlv_14= Colon this_BEGIN_15= RULE_BEGIN ( (lv_alternativeflows_16_0= ruleExtension ) )+ this_END_17= RULE_END )? )
            {
            // InternalUseCaseDslParser.g:107:2: (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_postcondition_5_0= rulePostcondition ) )? otherlv_6= MAIN otherlv_7= FLOW otherlv_8= Colon this_BEGIN_9= RULE_BEGIN ( (lv_steps_10_0= ruleUseCaseStep ) )+ this_END_11= RULE_END ( (otherlv_12= ALTERNATIVE otherlv_13= FLOW ) otherlv_14= Colon this_BEGIN_15= RULE_BEGIN ( (lv_alternativeflows_16_0= ruleExtension ) )+ this_END_17= RULE_END )? )
            // InternalUseCaseDslParser.g:108:3: otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_postcondition_5_0= rulePostcondition ) )? otherlv_6= MAIN otherlv_7= FLOW otherlv_8= Colon this_BEGIN_9= RULE_BEGIN ( (lv_steps_10_0= ruleUseCaseStep ) )+ this_END_11= RULE_END ( (otherlv_12= ALTERNATIVE otherlv_13= FLOW ) otherlv_14= Colon this_BEGIN_15= RULE_BEGIN ( (lv_alternativeflows_16_0= ruleExtension ) )+ this_END_17= RULE_END )?
            {
            otherlv_0=(Token)match(input,UC,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUCKeyword_0());
            		
            // InternalUseCaseDslParser.g:112:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalUseCaseDslParser.g:113:4: (lv_number_1_0= RULE_INT )
            {
            // InternalUseCaseDslParser.g:113:4: (lv_number_1_0= RULE_INT )
            // InternalUseCaseDslParser.g:114:5: lv_number_1_0= RULE_INT
            {
            lv_number_1_0=(Token)match(input,RULE_INT,FOLLOW_5); 

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

            otherlv_2=(Token)match(input,Colon,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getColonKeyword_2());
            		
            // InternalUseCaseDslParser.g:134:3: ( (lv_name_3_0= ruleLongName ) )
            // InternalUseCaseDslParser.g:135:4: (lv_name_3_0= ruleLongName )
            {
            // InternalUseCaseDslParser.g:135:4: (lv_name_3_0= ruleLongName )
            // InternalUseCaseDslParser.g:136:5: lv_name_3_0= ruleLongName
            {

            					newCompositeNode(grammarAccess.getUseCaseAccess().getNameLongNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalUseCaseDslParser.g:153:3: ( (lv_precondition_4_0= rulePrecondition ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==PRECONDITION) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalUseCaseDslParser.g:154:4: (lv_precondition_4_0= rulePrecondition )
                    {
                    // InternalUseCaseDslParser.g:154:4: (lv_precondition_4_0= rulePrecondition )
                    // InternalUseCaseDslParser.g:155:5: lv_precondition_4_0= rulePrecondition
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getPreconditionPreconditionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_8);
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

            // InternalUseCaseDslParser.g:172:3: ( (lv_postcondition_5_0= rulePostcondition ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==POSTCONDITION) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUseCaseDslParser.g:173:4: (lv_postcondition_5_0= rulePostcondition )
                    {
                    // InternalUseCaseDslParser.g:173:4: (lv_postcondition_5_0= rulePostcondition )
                    // InternalUseCaseDslParser.g:174:5: lv_postcondition_5_0= rulePostcondition
                    {

                    					newCompositeNode(grammarAccess.getUseCaseAccess().getPostconditionPostconditionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_9);
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

            otherlv_6=(Token)match(input,MAIN,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getUseCaseAccess().getMAINKeyword_6());
            		
            otherlv_7=(Token)match(input,FLOW,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getUseCaseAccess().getFLOWKeyword_7());
            		
            otherlv_8=(Token)match(input,Colon,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getUseCaseAccess().getColonKeyword_8());
            		
            this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_4); 

            			newLeafNode(this_BEGIN_9, grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_9());
            		
            // InternalUseCaseDslParser.g:207:3: ( (lv_steps_10_0= ruleUseCaseStep ) )+
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
            	    // InternalUseCaseDslParser.g:208:4: (lv_steps_10_0= ruleUseCaseStep )
            	    {
            	    // InternalUseCaseDslParser.g:208:4: (lv_steps_10_0= ruleUseCaseStep )
            	    // InternalUseCaseDslParser.g:209:5: lv_steps_10_0= ruleUseCaseStep
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseAccess().getStepsUseCaseStepParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_steps_10_0=ruleUseCaseStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_10_0,
            	    						"useCase.xtext.useCaseDsl.UseCaseDsl.UseCaseStep");
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

            this_END_11=(Token)match(input,RULE_END,FOLLOW_13); 

            			newLeafNode(this_END_11, grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_11());
            		
            // InternalUseCaseDslParser.g:230:3: ( (otherlv_12= ALTERNATIVE otherlv_13= FLOW ) otherlv_14= Colon this_BEGIN_15= RULE_BEGIN ( (lv_alternativeflows_16_0= ruleExtension ) )+ this_END_17= RULE_END )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ALTERNATIVE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCaseDslParser.g:231:4: (otherlv_12= ALTERNATIVE otherlv_13= FLOW ) otherlv_14= Colon this_BEGIN_15= RULE_BEGIN ( (lv_alternativeflows_16_0= ruleExtension ) )+ this_END_17= RULE_END
                    {
                    // InternalUseCaseDslParser.g:231:4: (otherlv_12= ALTERNATIVE otherlv_13= FLOW )
                    // InternalUseCaseDslParser.g:232:5: otherlv_12= ALTERNATIVE otherlv_13= FLOW
                    {
                    otherlv_12=(Token)match(input,ALTERNATIVE,FOLLOW_10); 

                    					newLeafNode(otherlv_12, grammarAccess.getUseCaseAccess().getALTERNATIVEKeyword_12_0_0());
                    				
                    otherlv_13=(Token)match(input,FLOW,FOLLOW_5); 

                    					newLeafNode(otherlv_13, grammarAccess.getUseCaseAccess().getFLOWKeyword_12_0_1());
                    				

                    }

                    otherlv_14=(Token)match(input,Colon,FOLLOW_11); 

                    				newLeafNode(otherlv_14, grammarAccess.getUseCaseAccess().getColonKeyword_12_1());
                    			
                    this_BEGIN_15=(Token)match(input,RULE_BEGIN,FOLLOW_4); 

                    				newLeafNode(this_BEGIN_15, grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_12_2());
                    			
                    // InternalUseCaseDslParser.g:249:4: ( (lv_alternativeflows_16_0= ruleExtension ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_INT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalUseCaseDslParser.g:250:5: (lv_alternativeflows_16_0= ruleExtension )
                    	    {
                    	    // InternalUseCaseDslParser.g:250:5: (lv_alternativeflows_16_0= ruleExtension )
                    	    // InternalUseCaseDslParser.g:251:6: lv_alternativeflows_16_0= ruleExtension
                    	    {

                    	    						newCompositeNode(grammarAccess.getUseCaseAccess().getAlternativeflowsExtensionParserRuleCall_12_3_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_alternativeflows_16_0=ruleExtension();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"alternativeflows",
                    	    							lv_alternativeflows_16_0,
                    	    							"useCase.xtext.useCaseDsl.UseCaseDsl.Extension");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    this_END_17=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_17, grammarAccess.getUseCaseAccess().getENDTerminalRuleCall_12_4());
                    			

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
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleExtension"
    // InternalUseCaseDslParser.g:277:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // InternalUseCaseDslParser.g:277:50: (iv_ruleExtension= ruleExtension EOF )
            // InternalUseCaseDslParser.g:278:2: iv_ruleExtension= ruleExtension EOF
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
    // InternalUseCaseDslParser.g:284:1: ruleExtension returns [EObject current=null] : ( ( ( (lv_startFrom_0_0= ruleStepName ) ) otherlv_1= FullStop )+ ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )* ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ ) | ( (lv_end_14_0= ruleDeadEndStep ) ) ) this_END_15= RULE_END ) ;
    public final EObject ruleExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_BEGIN_6=null;
        Token this_INT_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token this_END_15=null;
        AntlrDatatypeRuleToken lv_startFrom_0_0 = null;

        AntlrDatatypeRuleToken lv_condition_5_0 = null;

        EObject lv_steps_7_0 = null;

        AntlrDatatypeRuleToken lv_resumeAt_12_0 = null;

        EObject lv_end_14_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:290:2: ( ( ( ( (lv_startFrom_0_0= ruleStepName ) ) otherlv_1= FullStop )+ ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )* ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ ) | ( (lv_end_14_0= ruleDeadEndStep ) ) ) this_END_15= RULE_END ) )
            // InternalUseCaseDslParser.g:291:2: ( ( ( (lv_startFrom_0_0= ruleStepName ) ) otherlv_1= FullStop )+ ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )* ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ ) | ( (lv_end_14_0= ruleDeadEndStep ) ) ) this_END_15= RULE_END )
            {
            // InternalUseCaseDslParser.g:291:2: ( ( ( (lv_startFrom_0_0= ruleStepName ) ) otherlv_1= FullStop )+ ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )* ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ ) | ( (lv_end_14_0= ruleDeadEndStep ) ) ) this_END_15= RULE_END )
            // InternalUseCaseDslParser.g:292:3: ( ( (lv_startFrom_0_0= ruleStepName ) ) otherlv_1= FullStop )+ ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )* ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ ) | ( (lv_end_14_0= ruleDeadEndStep ) ) ) this_END_15= RULE_END
            {
            // InternalUseCaseDslParser.g:292:3: ( ( (lv_startFrom_0_0= ruleStepName ) ) otherlv_1= FullStop )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:293:4: ( (lv_startFrom_0_0= ruleStepName ) ) otherlv_1= FullStop
            	    {
            	    // InternalUseCaseDslParser.g:293:4: ( (lv_startFrom_0_0= ruleStepName ) )
            	    // InternalUseCaseDslParser.g:294:5: (lv_startFrom_0_0= ruleStepName )
            	    {
            	    // InternalUseCaseDslParser.g:294:5: (lv_startFrom_0_0= ruleStepName )
            	    // InternalUseCaseDslParser.g:295:6: lv_startFrom_0_0= ruleStepName
            	    {

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getStartFromStepNameParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_startFrom_0_0=ruleStepName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExtensionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"startFrom",
            	    							lv_startFrom_0_0,
            	    							"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_1=(Token)match(input,FullStop,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExtensionAccess().getFullStopKeyword_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // InternalUseCaseDslParser.g:317:3: ( (lv_name_2_0= RULE_CHAR ) )
            // InternalUseCaseDslParser.g:318:4: (lv_name_2_0= RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:318:4: (lv_name_2_0= RULE_CHAR )
            // InternalUseCaseDslParser.g:319:5: lv_name_2_0= RULE_CHAR
            {
            lv_name_2_0=(Token)match(input,RULE_CHAR,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getExtensionAccess().getNameCHARTerminalRuleCall_1_0());
            				

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

            otherlv_3=(Token)match(input,FullStop,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getExtensionAccess().getFullStopKeyword_2());
            		
            otherlv_4=(Token)match(input,IF,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getIFKeyword_3());
            		
            // InternalUseCaseDslParser.g:343:3: ( (lv_condition_5_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:344:4: (lv_condition_5_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:344:4: (lv_condition_5_0= ruleCondition )
            // InternalUseCaseDslParser.g:345:5: lv_condition_5_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getExtensionAccess().getConditionConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
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

            this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_4); 

            			newLeafNode(this_BEGIN_6, grammarAccess.getExtensionAccess().getBEGINTerminalRuleCall_5());
            		
            // InternalUseCaseDslParser.g:366:3: ( (lv_steps_7_0= ruleExtensionStep ) )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:367:4: (lv_steps_7_0= ruleExtensionStep )
            	    {
            	    // InternalUseCaseDslParser.g:367:4: (lv_steps_7_0= ruleExtensionStep )
            	    // InternalUseCaseDslParser.g:368:5: lv_steps_7_0= ruleExtensionStep
            	    {

            	    					newCompositeNode(grammarAccess.getExtensionAccess().getStepsExtensionStepParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_4);
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
            	    break loop8;
                }
            } while (true);

            // InternalUseCaseDslParser.g:385:3: ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ ) | ( (lv_end_14_0= ruleDeadEndStep ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==FullStop) ) {
                    int LA11_2 = input.LA(3);

                    if ( ((LA11_2>=SYSTEM && LA11_2<=WHILE)||LA11_2==USER||(LA11_2>=UC && LA11_2<=RULE_CHAR)||LA11_2==RULE_ID||LA11_2==RULE_ANY_OTHER) ) {
                        alt11=2;
                    }
                    else if ( (LA11_2==RETURN) ) {
                        alt11=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCaseDslParser.g:386:4: (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ )
                    {
                    // InternalUseCaseDslParser.g:386:4: (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ )
                    // InternalUseCaseDslParser.g:387:5: this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+
                    {
                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_14); 

                    					newLeafNode(this_INT_8, grammarAccess.getExtensionAccess().getINTTerminalRuleCall_7_0_0());
                    				
                    otherlv_9=(Token)match(input,FullStop,FOLLOW_18); 

                    					newLeafNode(otherlv_9, grammarAccess.getExtensionAccess().getFullStopKeyword_7_0_1());
                    				
                    otherlv_10=(Token)match(input,RETURN,FOLLOW_19); 

                    					newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getRETURNKeyword_7_0_2());
                    				
                    otherlv_11=(Token)match(input,TO,FOLLOW_4); 

                    					newLeafNode(otherlv_11, grammarAccess.getExtensionAccess().getTOKeyword_7_0_3());
                    				
                    // InternalUseCaseDslParser.g:403:5: ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_INT) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalUseCaseDslParser.g:404:6: ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )?
                    	    {
                    	    // InternalUseCaseDslParser.g:404:6: ( (lv_resumeAt_12_0= ruleStepName ) )
                    	    // InternalUseCaseDslParser.g:405:7: (lv_resumeAt_12_0= ruleStepName )
                    	    {
                    	    // InternalUseCaseDslParser.g:405:7: (lv_resumeAt_12_0= ruleStepName )
                    	    // InternalUseCaseDslParser.g:406:8: lv_resumeAt_12_0= ruleStepName
                    	    {

                    	    								newCompositeNode(grammarAccess.getExtensionAccess().getResumeAtStepNameParserRuleCall_7_0_4_0_0());
                    	    							
                    	    pushFollow(FOLLOW_20);
                    	    lv_resumeAt_12_0=ruleStepName();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getExtensionRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"resumeAt",
                    	    									lv_resumeAt_12_0,
                    	    									"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    // InternalUseCaseDslParser.g:423:6: (otherlv_13= FullStop )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==FullStop) ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // InternalUseCaseDslParser.g:424:7: otherlv_13= FullStop
                    	            {
                    	            otherlv_13=(Token)match(input,FullStop,FOLLOW_12); 

                    	            							newLeafNode(otherlv_13, grammarAccess.getExtensionAccess().getFullStopKeyword_7_0_4_1());
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:432:4: ( (lv_end_14_0= ruleDeadEndStep ) )
                    {
                    // InternalUseCaseDslParser.g:432:4: ( (lv_end_14_0= ruleDeadEndStep ) )
                    // InternalUseCaseDslParser.g:433:5: (lv_end_14_0= ruleDeadEndStep )
                    {
                    // InternalUseCaseDslParser.g:433:5: (lv_end_14_0= ruleDeadEndStep )
                    // InternalUseCaseDslParser.g:434:6: lv_end_14_0= ruleDeadEndStep
                    {

                    						newCompositeNode(grammarAccess.getExtensionAccess().getEndDeadEndStepParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_end_14_0=ruleDeadEndStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtensionRule());
                    						}
                    						set(
                    							current,
                    							"end",
                    							lv_end_14_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.DeadEndStep");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_15=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_15, grammarAccess.getExtensionAccess().getENDTerminalRuleCall_8());
            		

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
    // InternalUseCaseDslParser.g:460:1: entryRuleUseCaseStep returns [EObject current=null] : iv_ruleUseCaseStep= ruleUseCaseStep EOF ;
    public final EObject entryRuleUseCaseStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseStep = null;


        try {
            // InternalUseCaseDslParser.g:460:52: (iv_ruleUseCaseStep= ruleUseCaseStep EOF )
            // InternalUseCaseDslParser.g:461:2: iv_ruleUseCaseStep= ruleUseCaseStep EOF
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
    // InternalUseCaseDslParser.g:467:1: ruleUseCaseStep returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop otherlv_2= INCLUDE ( (lv_include_3_0= ruleLongName ) ) ) | ( () ( (lv_name_5_0= ruleStepName ) ) otherlv_6= FullStop otherlv_7= USER ( (lv_sentence_8_0= ruleLongName ) ) ) | ( () ( (lv_name_10_0= ruleStepName ) ) otherlv_11= FullStop otherlv_12= SYSTEM ( (lv_sentence_13_0= ruleLongName ) ) ) | ( () ( (lv_name_15_0= ruleStepName ) ) otherlv_16= FullStop otherlv_17= WHILE ( (lv_repeatingCondition_18_0= ruleCondition ) ) this_BEGIN_19= RULE_BEGIN ( ( ( (lv_parent_20_0= ruleStepName ) ) otherlv_21= FullStop )+ ( (lv_repeatflow_22_0= ruleUseCaseStep ) ) )+ this_END_23= RULE_END ) ) ;
    public final EObject ruleUseCaseStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token this_BEGIN_19=null;
        Token otherlv_21=null;
        Token this_END_23=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_include_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_sentence_8_0 = null;

        AntlrDatatypeRuleToken lv_name_10_0 = null;

        AntlrDatatypeRuleToken lv_sentence_13_0 = null;

        AntlrDatatypeRuleToken lv_name_15_0 = null;

        AntlrDatatypeRuleToken lv_repeatingCondition_18_0 = null;

        AntlrDatatypeRuleToken lv_parent_20_0 = null;

        EObject lv_repeatflow_22_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:473:2: ( ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop otherlv_2= INCLUDE ( (lv_include_3_0= ruleLongName ) ) ) | ( () ( (lv_name_5_0= ruleStepName ) ) otherlv_6= FullStop otherlv_7= USER ( (lv_sentence_8_0= ruleLongName ) ) ) | ( () ( (lv_name_10_0= ruleStepName ) ) otherlv_11= FullStop otherlv_12= SYSTEM ( (lv_sentence_13_0= ruleLongName ) ) ) | ( () ( (lv_name_15_0= ruleStepName ) ) otherlv_16= FullStop otherlv_17= WHILE ( (lv_repeatingCondition_18_0= ruleCondition ) ) this_BEGIN_19= RULE_BEGIN ( ( ( (lv_parent_20_0= ruleStepName ) ) otherlv_21= FullStop )+ ( (lv_repeatflow_22_0= ruleUseCaseStep ) ) )+ this_END_23= RULE_END ) ) )
            // InternalUseCaseDslParser.g:474:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop otherlv_2= INCLUDE ( (lv_include_3_0= ruleLongName ) ) ) | ( () ( (lv_name_5_0= ruleStepName ) ) otherlv_6= FullStop otherlv_7= USER ( (lv_sentence_8_0= ruleLongName ) ) ) | ( () ( (lv_name_10_0= ruleStepName ) ) otherlv_11= FullStop otherlv_12= SYSTEM ( (lv_sentence_13_0= ruleLongName ) ) ) | ( () ( (lv_name_15_0= ruleStepName ) ) otherlv_16= FullStop otherlv_17= WHILE ( (lv_repeatingCondition_18_0= ruleCondition ) ) this_BEGIN_19= RULE_BEGIN ( ( ( (lv_parent_20_0= ruleStepName ) ) otherlv_21= FullStop )+ ( (lv_repeatflow_22_0= ruleUseCaseStep ) ) )+ this_END_23= RULE_END ) )
            {
            // InternalUseCaseDslParser.g:474:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop otherlv_2= INCLUDE ( (lv_include_3_0= ruleLongName ) ) ) | ( () ( (lv_name_5_0= ruleStepName ) ) otherlv_6= FullStop otherlv_7= USER ( (lv_sentence_8_0= ruleLongName ) ) ) | ( () ( (lv_name_10_0= ruleStepName ) ) otherlv_11= FullStop otherlv_12= SYSTEM ( (lv_sentence_13_0= ruleLongName ) ) ) | ( () ( (lv_name_15_0= ruleStepName ) ) otherlv_16= FullStop otherlv_17= WHILE ( (lv_repeatingCondition_18_0= ruleCondition ) ) this_BEGIN_19= RULE_BEGIN ( ( ( (lv_parent_20_0= ruleStepName ) ) otherlv_21= FullStop )+ ( (lv_repeatflow_22_0= ruleUseCaseStep ) ) )+ this_END_23= RULE_END ) )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==FullStop) ) {
                    switch ( input.LA(3) ) {
                    case WHILE:
                        {
                        alt14=4;
                        }
                        break;
                    case SYSTEM:
                        {
                        alt14=3;
                        }
                        break;
                    case USER:
                        {
                        alt14=2;
                        }
                        break;
                    case INCLUDE:
                        {
                        alt14=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCaseDslParser.g:475:3: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop otherlv_2= INCLUDE ( (lv_include_3_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:475:3: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop otherlv_2= INCLUDE ( (lv_include_3_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:476:4: ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop otherlv_2= INCLUDE ( (lv_include_3_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:476:4: ( (lv_name_0_0= ruleStepName ) )
                    // InternalUseCaseDslParser.g:477:5: (lv_name_0_0= ruleStepName )
                    {
                    // InternalUseCaseDslParser.g:477:5: (lv_name_0_0= ruleStepName )
                    // InternalUseCaseDslParser.g:478:6: lv_name_0_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_name_0_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,FullStop,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,INCLUDE,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getUseCaseStepAccess().getINCLUDEKeyword_0_2());
                    			
                    // InternalUseCaseDslParser.g:503:4: ( (lv_include_3_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:504:5: (lv_include_3_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:504:5: (lv_include_3_0= ruleLongName )
                    // InternalUseCaseDslParser.g:505:6: lv_include_3_0= ruleLongName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getIncludeLongNameParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_include_3_0=ruleLongName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"include",
                    							lv_include_3_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:524:3: ( () ( (lv_name_5_0= ruleStepName ) ) otherlv_6= FullStop otherlv_7= USER ( (lv_sentence_8_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:524:3: ( () ( (lv_name_5_0= ruleStepName ) ) otherlv_6= FullStop otherlv_7= USER ( (lv_sentence_8_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:525:4: () ( (lv_name_5_0= ruleStepName ) ) otherlv_6= FullStop otherlv_7= USER ( (lv_sentence_8_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:525:4: ()
                    // InternalUseCaseDslParser.g:526:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getUserStepAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:532:4: ( (lv_name_5_0= ruleStepName ) )
                    // InternalUseCaseDslParser.g:533:5: (lv_name_5_0= ruleStepName )
                    {
                    // InternalUseCaseDslParser.g:533:5: (lv_name_5_0= ruleStepName )
                    // InternalUseCaseDslParser.g:534:6: lv_name_5_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_name_5_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,FullStop,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_1_2());
                    			
                    otherlv_7=(Token)match(input,USER,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getUseCaseStepAccess().getUSERKeyword_1_3());
                    			
                    // InternalUseCaseDslParser.g:559:4: ( (lv_sentence_8_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:560:5: (lv_sentence_8_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:560:5: (lv_sentence_8_0= ruleLongName )
                    // InternalUseCaseDslParser.g:561:6: lv_sentence_8_0= ruleLongName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sentence_8_0=ruleLongName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"sentence",
                    							lv_sentence_8_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:580:3: ( () ( (lv_name_10_0= ruleStepName ) ) otherlv_11= FullStop otherlv_12= SYSTEM ( (lv_sentence_13_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:580:3: ( () ( (lv_name_10_0= ruleStepName ) ) otherlv_11= FullStop otherlv_12= SYSTEM ( (lv_sentence_13_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:581:4: () ( (lv_name_10_0= ruleStepName ) ) otherlv_11= FullStop otherlv_12= SYSTEM ( (lv_sentence_13_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:581:4: ()
                    // InternalUseCaseDslParser.g:582:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getSystemStepAction_2_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:588:4: ( (lv_name_10_0= ruleStepName ) )
                    // InternalUseCaseDslParser.g:589:5: (lv_name_10_0= ruleStepName )
                    {
                    // InternalUseCaseDslParser.g:589:5: (lv_name_10_0= ruleStepName )
                    // InternalUseCaseDslParser.g:590:6: lv_name_10_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_name_10_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_10_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,FullStop,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_2());
                    			
                    otherlv_12=(Token)match(input,SYSTEM,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getUseCaseStepAccess().getSYSTEMKeyword_2_3());
                    			
                    // InternalUseCaseDslParser.g:615:4: ( (lv_sentence_13_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:616:5: (lv_sentence_13_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:616:5: (lv_sentence_13_0= ruleLongName )
                    // InternalUseCaseDslParser.g:617:6: lv_sentence_13_0= ruleLongName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sentence_13_0=ruleLongName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"sentence",
                    							lv_sentence_13_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:636:3: ( () ( (lv_name_15_0= ruleStepName ) ) otherlv_16= FullStop otherlv_17= WHILE ( (lv_repeatingCondition_18_0= ruleCondition ) ) this_BEGIN_19= RULE_BEGIN ( ( ( (lv_parent_20_0= ruleStepName ) ) otherlv_21= FullStop )+ ( (lv_repeatflow_22_0= ruleUseCaseStep ) ) )+ this_END_23= RULE_END )
                    {
                    // InternalUseCaseDslParser.g:636:3: ( () ( (lv_name_15_0= ruleStepName ) ) otherlv_16= FullStop otherlv_17= WHILE ( (lv_repeatingCondition_18_0= ruleCondition ) ) this_BEGIN_19= RULE_BEGIN ( ( ( (lv_parent_20_0= ruleStepName ) ) otherlv_21= FullStop )+ ( (lv_repeatflow_22_0= ruleUseCaseStep ) ) )+ this_END_23= RULE_END )
                    // InternalUseCaseDslParser.g:637:4: () ( (lv_name_15_0= ruleStepName ) ) otherlv_16= FullStop otherlv_17= WHILE ( (lv_repeatingCondition_18_0= ruleCondition ) ) this_BEGIN_19= RULE_BEGIN ( ( ( (lv_parent_20_0= ruleStepName ) ) otherlv_21= FullStop )+ ( (lv_repeatflow_22_0= ruleUseCaseStep ) ) )+ this_END_23= RULE_END
                    {
                    // InternalUseCaseDslParser.g:637:4: ()
                    // InternalUseCaseDslParser.g:638:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getRepeatingStepAction_3_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:644:4: ( (lv_name_15_0= ruleStepName ) )
                    // InternalUseCaseDslParser.g:645:5: (lv_name_15_0= ruleStepName )
                    {
                    // InternalUseCaseDslParser.g:645:5: (lv_name_15_0= ruleStepName )
                    // InternalUseCaseDslParser.g:646:6: lv_name_15_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_name_15_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_15_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,FullStop,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_3_2());
                    			
                    otherlv_17=(Token)match(input,WHILE,FOLLOW_17); 

                    				newLeafNode(otherlv_17, grammarAccess.getUseCaseStepAccess().getWHILEKeyword_3_3());
                    			
                    // InternalUseCaseDslParser.g:671:4: ( (lv_repeatingCondition_18_0= ruleCondition ) )
                    // InternalUseCaseDslParser.g:672:5: (lv_repeatingCondition_18_0= ruleCondition )
                    {
                    // InternalUseCaseDslParser.g:672:5: (lv_repeatingCondition_18_0= ruleCondition )
                    // InternalUseCaseDslParser.g:673:6: lv_repeatingCondition_18_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getRepeatingConditionConditionParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_repeatingCondition_18_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"repeatingCondition",
                    							lv_repeatingCondition_18_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_BEGIN_19=(Token)match(input,RULE_BEGIN,FOLLOW_4); 

                    				newLeafNode(this_BEGIN_19, grammarAccess.getUseCaseStepAccess().getBEGINTerminalRuleCall_3_5());
                    			
                    // InternalUseCaseDslParser.g:694:4: ( ( ( (lv_parent_20_0= ruleStepName ) ) otherlv_21= FullStop )+ ( (lv_repeatflow_22_0= ruleUseCaseStep ) ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_INT) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalUseCaseDslParser.g:695:5: ( ( (lv_parent_20_0= ruleStepName ) ) otherlv_21= FullStop )+ ( (lv_repeatflow_22_0= ruleUseCaseStep ) )
                    	    {
                    	    // InternalUseCaseDslParser.g:695:5: ( ( (lv_parent_20_0= ruleStepName ) ) otherlv_21= FullStop )+
                    	    int cnt12=0;
                    	    loop12:
                    	    do {
                    	        int alt12=2;
                    	        int LA12_0 = input.LA(1);

                    	        if ( (LA12_0==RULE_INT) ) {
                    	            int LA12_1 = input.LA(2);

                    	            if ( (LA12_1==FullStop) ) {
                    	                int LA12_2 = input.LA(3);

                    	                if ( (LA12_2==RULE_INT) ) {
                    	                    alt12=1;
                    	                }


                    	            }


                    	        }


                    	        switch (alt12) {
                    	    	case 1 :
                    	    	    // InternalUseCaseDslParser.g:696:6: ( (lv_parent_20_0= ruleStepName ) ) otherlv_21= FullStop
                    	    	    {
                    	    	    // InternalUseCaseDslParser.g:696:6: ( (lv_parent_20_0= ruleStepName ) )
                    	    	    // InternalUseCaseDslParser.g:697:7: (lv_parent_20_0= ruleStepName )
                    	    	    {
                    	    	    // InternalUseCaseDslParser.g:697:7: (lv_parent_20_0= ruleStepName )
                    	    	    // InternalUseCaseDslParser.g:698:8: lv_parent_20_0= ruleStepName
                    	    	    {

                    	    	    								newCompositeNode(grammarAccess.getUseCaseStepAccess().getParentStepNameParserRuleCall_3_6_0_0_0());
                    	    	    							
                    	    	    pushFollow(FOLLOW_14);
                    	    	    lv_parent_20_0=ruleStepName();

                    	    	    state._fsp--;


                    	    	    								if (current==null) {
                    	    	    									current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    	    	    								}
                    	    	    								add(
                    	    	    									current,
                    	    	    									"parent",
                    	    	    									lv_parent_20_0,
                    	    	    									"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
                    	    	    								afterParserOrEnumRuleCall();
                    	    	    							

                    	    	    }


                    	    	    }

                    	    	    otherlv_21=(Token)match(input,FullStop,FOLLOW_4); 

                    	    	    						newLeafNode(otherlv_21, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_3_6_0_1());
                    	    	    					

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt12 >= 1 ) break loop12;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(12, input);
                    	                throw eee;
                    	        }
                    	        cnt12++;
                    	    } while (true);

                    	    // InternalUseCaseDslParser.g:720:5: ( (lv_repeatflow_22_0= ruleUseCaseStep ) )
                    	    // InternalUseCaseDslParser.g:721:6: (lv_repeatflow_22_0= ruleUseCaseStep )
                    	    {
                    	    // InternalUseCaseDslParser.g:721:6: (lv_repeatflow_22_0= ruleUseCaseStep )
                    	    // InternalUseCaseDslParser.g:722:7: lv_repeatflow_22_0= ruleUseCaseStep
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseCaseStepAccess().getRepeatflowUseCaseStepParserRuleCall_3_6_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_repeatflow_22_0=ruleUseCaseStep();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"repeatflow",
                    	    								lv_repeatflow_22_0,
                    	    								"useCase.xtext.useCaseDsl.UseCaseDsl.UseCaseStep");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


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

                    this_END_23=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_23, grammarAccess.getUseCaseStepAccess().getENDTerminalRuleCall_3_7());
                    			

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
    // InternalUseCaseDslParser.g:749:1: entryRuleExtensionStep returns [EObject current=null] : iv_ruleExtensionStep= ruleExtensionStep EOF ;
    public final EObject entryRuleExtensionStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionStep = null;


        try {
            // InternalUseCaseDslParser.g:749:54: (iv_ruleExtensionStep= ruleExtensionStep EOF )
            // InternalUseCaseDslParser.g:750:2: iv_ruleExtensionStep= ruleExtensionStep EOF
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
    // InternalUseCaseDslParser.g:756:1: ruleExtensionStep returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep ) ;
    public final EObject ruleExtensionStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_sentence_5_0 = null;

        EObject this_DeadEndStep_6 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:762:2: ( ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep ) )
            // InternalUseCaseDslParser.g:763:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep )
            {
            // InternalUseCaseDslParser.g:763:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalUseCaseDslParser.g:764:3: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:764:3: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:765:4: ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:765:4: ( (lv_name_0_0= ruleStepName ) )
                    // InternalUseCaseDslParser.g:766:5: (lv_name_0_0= ruleStepName )
                    {
                    // InternalUseCaseDslParser.g:766:5: (lv_name_0_0= ruleStepName )
                    // InternalUseCaseDslParser.g:767:6: lv_name_0_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getExtensionStepAccess().getNameStepNameParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_name_0_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtensionStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,FullStop,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getExtensionStepAccess().getFullStopKeyword_0_1());
                    			
                    // InternalUseCaseDslParser.g:788:4: (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )?
                    int alt15=4;
                    switch ( input.LA(1) ) {
                        case USER:
                            {
                            alt15=1;
                            }
                            break;
                        case SYSTEM:
                            {
                            alt15=2;
                            }
                            break;
                        case WHILE:
                            {
                            alt15=3;
                            }
                            break;
                    }

                    switch (alt15) {
                        case 1 :
                            // InternalUseCaseDslParser.g:789:5: otherlv_2= USER
                            {
                            otherlv_2=(Token)match(input,USER,FOLLOW_6); 

                            					newLeafNode(otherlv_2, grammarAccess.getExtensionStepAccess().getUSERKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCaseDslParser.g:794:5: otherlv_3= SYSTEM
                            {
                            otherlv_3=(Token)match(input,SYSTEM,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_0_2_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalUseCaseDslParser.g:799:5: otherlv_4= WHILE
                            {
                            otherlv_4=(Token)match(input,WHILE,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getExtensionStepAccess().getWHILEKeyword_0_2_2());
                            				

                            }
                            break;

                    }

                    // InternalUseCaseDslParser.g:804:4: ( (lv_sentence_5_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:805:5: (lv_sentence_5_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:805:5: (lv_sentence_5_0= ruleLongName )
                    // InternalUseCaseDslParser.g:806:6: lv_sentence_5_0= ruleLongName
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
                    // InternalUseCaseDslParser.g:825:3: this_DeadEndStep_6= ruleDeadEndStep
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
    // InternalUseCaseDslParser.g:837:1: entryRuleDeadEndStep returns [EObject current=null] : iv_ruleDeadEndStep= ruleDeadEndStep EOF ;
    public final EObject entryRuleDeadEndStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeadEndStep = null;


        try {
            // InternalUseCaseDslParser.g:837:52: (iv_ruleDeadEndStep= ruleDeadEndStep EOF )
            // InternalUseCaseDslParser.g:838:2: iv_ruleDeadEndStep= ruleDeadEndStep EOF
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
    // InternalUseCaseDslParser.g:844:1: ruleDeadEndStep returns [EObject current=null] : ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END ) ;
    public final EObject ruleDeadEndStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_sentence_5_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:850:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END ) )
            // InternalUseCaseDslParser.g:851:2: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END )
            {
            // InternalUseCaseDslParser.g:851:2: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END )
            // InternalUseCaseDslParser.g:852:3: ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END
            {
            // InternalUseCaseDslParser.g:852:3: ( (lv_name_0_0= ruleStepName ) )
            // InternalUseCaseDslParser.g:853:4: (lv_name_0_0= ruleStepName )
            {
            // InternalUseCaseDslParser.g:853:4: (lv_name_0_0= ruleStepName )
            // InternalUseCaseDslParser.g:854:5: lv_name_0_0= ruleStepName
            {

            					newCompositeNode(grammarAccess.getDeadEndStepAccess().getNameStepNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_0_0=ruleStepName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeadEndStepRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,FullStop,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getDeadEndStepAccess().getFullStopKeyword_1());
            		
            // InternalUseCaseDslParser.g:875:3: (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )?
            int alt17=4;
            switch ( input.LA(1) ) {
                case USER:
                    {
                    alt17=1;
                    }
                    break;
                case SYSTEM:
                    {
                    alt17=2;
                    }
                    break;
                case WHILE:
                    {
                    alt17=3;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // InternalUseCaseDslParser.g:876:4: otherlv_2= USER
                    {
                    otherlv_2=(Token)match(input,USER,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:881:4: otherlv_3= SYSTEM
                    {
                    otherlv_3=(Token)match(input,SYSTEM,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:886:4: otherlv_4= WHILE
                    {
                    otherlv_4=(Token)match(input,WHILE,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeadEndStepAccess().getWHILEKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalUseCaseDslParser.g:891:3: ( (lv_sentence_5_0= ruleLongName ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=QuotationMark && LA18_0<=RULE_CHAR)||LA18_0==RULE_ID||LA18_0==RULE_ANY_OTHER) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUseCaseDslParser.g:892:4: (lv_sentence_5_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:892:4: (lv_sentence_5_0= ruleLongName )
                    // InternalUseCaseDslParser.g:893:5: lv_sentence_5_0= ruleLongName
                    {

                    					newCompositeNode(grammarAccess.getDeadEndStepAccess().getSentenceLongNameParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_29);
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

            otherlv_6=(Token)match(input,UC,FOLLOW_30); 

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
    // InternalUseCaseDslParser.g:922:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalUseCaseDslParser.g:922:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalUseCaseDslParser.g:923:2: iv_rulePrecondition= rulePrecondition EOF
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
    // InternalUseCaseDslParser.g:929:1: rulePrecondition returns [EObject current=null] : ( ( (lv_name_0_0= PRECONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:935:2: ( ( ( (lv_name_0_0= PRECONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalUseCaseDslParser.g:936:2: ( ( (lv_name_0_0= PRECONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalUseCaseDslParser.g:936:2: ( ( (lv_name_0_0= PRECONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalUseCaseDslParser.g:937:3: ( (lv_name_0_0= PRECONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) )
            {
            // InternalUseCaseDslParser.g:937:3: ( (lv_name_0_0= PRECONDITION ) )
            // InternalUseCaseDslParser.g:938:4: (lv_name_0_0= PRECONDITION )
            {
            // InternalUseCaseDslParser.g:938:4: (lv_name_0_0= PRECONDITION )
            // InternalUseCaseDslParser.g:939:5: lv_name_0_0= PRECONDITION
            {
            lv_name_0_0=(Token)match(input,PRECONDITION,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPreconditionAccess().getNamePRECONDITIONKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreconditionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "PRECONDITION");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPreconditionAccess().getColonKeyword_1());
            		
            // InternalUseCaseDslParser.g:955:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:956:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:956:4: (lv_condition_2_0= ruleCondition )
            // InternalUseCaseDslParser.g:957:5: lv_condition_2_0= ruleCondition
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
    // InternalUseCaseDslParser.g:978:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalUseCaseDslParser.g:978:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalUseCaseDslParser.g:979:2: iv_rulePostcondition= rulePostcondition EOF
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
    // InternalUseCaseDslParser.g:985:1: rulePostcondition returns [EObject current=null] : ( ( (lv_name_0_0= POSTCONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:991:2: ( ( ( (lv_name_0_0= POSTCONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalUseCaseDslParser.g:992:2: ( ( (lv_name_0_0= POSTCONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalUseCaseDslParser.g:992:2: ( ( (lv_name_0_0= POSTCONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalUseCaseDslParser.g:993:3: ( (lv_name_0_0= POSTCONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) )
            {
            // InternalUseCaseDslParser.g:993:3: ( (lv_name_0_0= POSTCONDITION ) )
            // InternalUseCaseDslParser.g:994:4: (lv_name_0_0= POSTCONDITION )
            {
            // InternalUseCaseDslParser.g:994:4: (lv_name_0_0= POSTCONDITION )
            // InternalUseCaseDslParser.g:995:5: lv_name_0_0= POSTCONDITION
            {
            lv_name_0_0=(Token)match(input,POSTCONDITION,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPostconditionAccess().getNamePOSTCONDITIONKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPostconditionRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "POSTCONDITION");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPostconditionAccess().getColonKeyword_1());
            		
            // InternalUseCaseDslParser.g:1011:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:1012:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:1012:4: (lv_condition_2_0= ruleCondition )
            // InternalUseCaseDslParser.g:1013:5: lv_condition_2_0= ruleCondition
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
    // InternalUseCaseDslParser.g:1034:1: entryRuleLongName returns [String current=null] : iv_ruleLongName= ruleLongName EOF ;
    public final String entryRuleLongName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLongName = null;


        try {
            // InternalUseCaseDslParser.g:1034:48: (iv_ruleLongName= ruleLongName EOF )
            // InternalUseCaseDslParser.g:1035:2: iv_ruleLongName= ruleLongName EOF
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
    // InternalUseCaseDslParser.g:1041:1: ruleLongName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ ;
    public final AntlrDatatypeRuleToken ruleLongName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_CHAR_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:1047:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ )
            // InternalUseCaseDslParser.g:1048:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
            {
            // InternalUseCaseDslParser.g:1048:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
            int cnt19=0;
            loop19:
            do {
                int alt19=8;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt19=1;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt19=2;
                    }
                    break;
                case RULE_CHAR:
                    {
                    alt19=3;
                    }
                    break;
                case Colon:
                    {
                    alt19=4;
                    }
                    break;
                case FullStop:
                    {
                    alt19=5;
                    }
                    break;
                case QuotationMark:
                    {
                    alt19=6;
                    }
                    break;
                case Apostrophe:
                    {
                    alt19=7;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1049:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUseCaseDslParser.g:1057:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_31); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUseCaseDslParser.g:1065:3: this_CHAR_2= RULE_CHAR
            	    {
            	    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_31); 

            	    			current.merge(this_CHAR_2);
            	    		

            	    			newLeafNode(this_CHAR_2, grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUseCaseDslParser.g:1073:3: kw= Colon
            	    {
            	    kw=(Token)match(input,Colon,FOLLOW_31); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getColonKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUseCaseDslParser.g:1079:3: kw= FullStop
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_31); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUseCaseDslParser.g:1085:3: kw= QuotationMark
            	    {
            	    kw=(Token)match(input,QuotationMark,FOLLOW_31); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalUseCaseDslParser.g:1091:3: kw= Apostrophe
            	    {
            	    kw=(Token)match(input,Apostrophe,FOLLOW_31); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getApostropheKeyword_6());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // InternalUseCaseDslParser.g:1100:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalUseCaseDslParser.g:1100:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalUseCaseDslParser.g:1101:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalUseCaseDslParser.g:1107:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+ ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_CHAR_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:1113:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+ )
            // InternalUseCaseDslParser.g:1114:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+
            {
            // InternalUseCaseDslParser.g:1114:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+
            int cnt20=0;
            loop20:
            do {
                int alt20=10;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt20=1;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt20=2;
                    }
                    break;
                case RULE_CHAR:
                    {
                    alt20=3;
                    }
                    break;
                case Colon:
                    {
                    alt20=4;
                    }
                    break;
                case FullStop:
                    {
                    alt20=5;
                    }
                    break;
                case QuotationMark:
                    {
                    alt20=6;
                    }
                    break;
                case Apostrophe:
                    {
                    alt20=7;
                    }
                    break;
                case AND:
                    {
                    alt20=8;
                    }
                    break;
                case OR:
                    {
                    alt20=9;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1115:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getConditionAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUseCaseDslParser.g:1123:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_32); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUseCaseDslParser.g:1131:3: this_CHAR_2= RULE_CHAR
            	    {
            	    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_32); 

            	    			current.merge(this_CHAR_2);
            	    		

            	    			newLeafNode(this_CHAR_2, grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUseCaseDslParser.g:1139:3: kw= Colon
            	    {
            	    kw=(Token)match(input,Colon,FOLLOW_32); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getColonKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUseCaseDslParser.g:1145:3: kw= FullStop
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_32); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUseCaseDslParser.g:1151:3: kw= QuotationMark
            	    {
            	    kw=(Token)match(input,QuotationMark,FOLLOW_32); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getQuotationMarkKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalUseCaseDslParser.g:1157:3: kw= Apostrophe
            	    {
            	    kw=(Token)match(input,Apostrophe,FOLLOW_32); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getApostropheKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalUseCaseDslParser.g:1163:3: kw= AND
            	    {
            	    kw=(Token)match(input,AND,FOLLOW_32); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getANDKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalUseCaseDslParser.g:1169:3: kw= OR
            	    {
            	    kw=(Token)match(input,OR,FOLLOW_32); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getORKeyword_8());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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


    // $ANTLR start "entryRuleStepName"
    // InternalUseCaseDslParser.g:1178:1: entryRuleStepName returns [String current=null] : iv_ruleStepName= ruleStepName EOF ;
    public final String entryRuleStepName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStepName = null;


        try {
            // InternalUseCaseDslParser.g:1178:48: (iv_ruleStepName= ruleStepName EOF )
            // InternalUseCaseDslParser.g:1179:2: iv_ruleStepName= ruleStepName EOF
            {
             newCompositeNode(grammarAccess.getStepNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStepName=ruleStepName();

            state._fsp--;

             current =iv_ruleStepName.getText(); 
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
    // $ANTLR end "entryRuleStepName"


    // $ANTLR start "ruleStepName"
    // InternalUseCaseDslParser.g:1185:1: ruleStepName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleStepName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:1191:2: (this_INT_0= RULE_INT )
            // InternalUseCaseDslParser.g:1192:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getStepNameAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleStepName"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\34\1\26\1\10\12\23\1\17\2\uffff\1\32";
    static final String dfa_3s = "\1\34\1\26\13\41\1\17\2\uffff\1\34";
    static final String dfa_4s = "\16\uffff\1\2\1\1\1\uffff";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\16\1\4\1\5\2\uffff\1\3\5\uffff\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
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

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 366:3: ( (lv_steps_7_0= ruleExtensionStep ) )*";
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\6\uffff\7\16\2\uffff";
    static final String dfa_9s = "\1\34\1\26\1\11\12\23\2\uffff";
    static final String dfa_10s = "\1\34\1\26\13\41\2\uffff";
    static final String dfa_11s = "\15\uffff\1\2\1\1";
    static final String dfa_12s = "\17\uffff}>";
    static final String[] dfa_13s = {
            "\1\1",
            "\1\2",
            "\1\4\1\5\2\uffff\1\3\5\uffff\1\15\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
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

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "763:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000209F00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000209F24000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000014400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000209F02600L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000209F82600L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000209F80000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000209F00002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000209F24002L});

}