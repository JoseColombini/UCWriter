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
                    			
                    this_BEGIN_15=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

                    				newLeafNode(this_BEGIN_15, grammarAccess.getUseCaseAccess().getBEGINTerminalRuleCall_12_2());
                    			
                    // InternalUseCaseDslParser.g:249:4: ( (lv_alternativeflows_16_0= ruleExtension ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_CHAR||LA5_0==RULE_INT) ) {
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
                    	    					
                    	    pushFollow(FOLLOW_15);
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
    // InternalUseCaseDslParser.g:284:1: ruleExtension returns [EObject current=null] : ( ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) otherlv_2= FullStop ( (lv_name_3_0= RULE_CHAR ) ) otherlv_4= FullStop otherlv_5= IF ( (lv_condition_6_0= ruleCondition ) ) this_BEGIN_7= RULE_BEGIN ( (lv_steps_8_0= ruleExtensionStep ) )* ( ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) ) | ( (lv_end_15_0= ruleDeadEndStep ) ) ) this_END_16= RULE_END ) ;
    public final EObject ruleExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_BEGIN_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_condition_6_0 = null;

        EObject lv_steps_8_0 = null;

        EObject lv_end_15_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:290:2: ( ( ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) otherlv_2= FullStop ( (lv_name_3_0= RULE_CHAR ) ) otherlv_4= FullStop otherlv_5= IF ( (lv_condition_6_0= ruleCondition ) ) this_BEGIN_7= RULE_BEGIN ( (lv_steps_8_0= ruleExtensionStep ) )* ( ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) ) | ( (lv_end_15_0= ruleDeadEndStep ) ) ) this_END_16= RULE_END ) )
            // InternalUseCaseDslParser.g:291:2: ( ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) otherlv_2= FullStop ( (lv_name_3_0= RULE_CHAR ) ) otherlv_4= FullStop otherlv_5= IF ( (lv_condition_6_0= ruleCondition ) ) this_BEGIN_7= RULE_BEGIN ( (lv_steps_8_0= ruleExtensionStep ) )* ( ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) ) | ( (lv_end_15_0= ruleDeadEndStep ) ) ) this_END_16= RULE_END )
            {
            // InternalUseCaseDslParser.g:291:2: ( ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) otherlv_2= FullStop ( (lv_name_3_0= RULE_CHAR ) ) otherlv_4= FullStop otherlv_5= IF ( (lv_condition_6_0= ruleCondition ) ) this_BEGIN_7= RULE_BEGIN ( (lv_steps_8_0= ruleExtensionStep ) )* ( ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) ) | ( (lv_end_15_0= ruleDeadEndStep ) ) ) this_END_16= RULE_END )
            // InternalUseCaseDslParser.g:292:3: ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) otherlv_2= FullStop ( (lv_name_3_0= RULE_CHAR ) ) otherlv_4= FullStop otherlv_5= IF ( (lv_condition_6_0= ruleCondition ) ) this_BEGIN_7= RULE_BEGIN ( (lv_steps_8_0= ruleExtensionStep ) )* ( ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) ) | ( (lv_end_15_0= ruleDeadEndStep ) ) ) this_END_16= RULE_END
            {
            // InternalUseCaseDslParser.g:292:3: ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_CHAR) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUseCaseDslParser.g:293:4: ( ( ruleQualifiedStepName ) )
                    {
                    // InternalUseCaseDslParser.g:293:4: ( ( ruleQualifiedStepName ) )
                    // InternalUseCaseDslParser.g:294:5: ( ruleQualifiedStepName )
                    {
                    // InternalUseCaseDslParser.g:294:5: ( ruleQualifiedStepName )
                    // InternalUseCaseDslParser.g:295:6: ruleQualifiedStepName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtensionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExtensionAccess().getStartFromUseCaseStepCrossReference_0_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedStepName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:310:4: ( ( ruleQualifiedExtensionStepName ) )
                    {
                    // InternalUseCaseDslParser.g:310:4: ( ( ruleQualifiedExtensionStepName ) )
                    // InternalUseCaseDslParser.g:311:5: ( ruleQualifiedExtensionStepName )
                    {
                    // InternalUseCaseDslParser.g:311:5: ( ruleQualifiedExtensionStepName )
                    // InternalUseCaseDslParser.g:312:6: ruleQualifiedExtensionStepName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtensionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExtensionAccess().getStartFromExtensionStepCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedExtensionStepName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,FullStop,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getFullStopKeyword_1());
            		
            // InternalUseCaseDslParser.g:331:3: ( (lv_name_3_0= RULE_CHAR ) )
            // InternalUseCaseDslParser.g:332:4: (lv_name_3_0= RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:332:4: (lv_name_3_0= RULE_CHAR )
            // InternalUseCaseDslParser.g:333:5: lv_name_3_0= RULE_CHAR
            {
            lv_name_3_0=(Token)match(input,RULE_CHAR,FOLLOW_16); 

            					newLeafNode(lv_name_3_0, grammarAccess.getExtensionAccess().getNameCHARTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"useCase.xtext.useCaseDsl.UseCaseDsl.CHAR");
            				

            }


            }

            otherlv_4=(Token)match(input,FullStop,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getFullStopKeyword_3());
            		
            otherlv_5=(Token)match(input,IF,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getExtensionAccess().getIFKeyword_4());
            		
            // InternalUseCaseDslParser.g:357:3: ( (lv_condition_6_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:358:4: (lv_condition_6_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:358:4: (lv_condition_6_0= ruleCondition )
            // InternalUseCaseDslParser.g:359:5: lv_condition_6_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getExtensionAccess().getConditionConditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_condition_6_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtensionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_6_0,
            						"useCase.xtext.useCaseDsl.UseCaseDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_4); 

            			newLeafNode(this_BEGIN_7, grammarAccess.getExtensionAccess().getBEGINTerminalRuleCall_6());
            		
            // InternalUseCaseDslParser.g:380:3: ( (lv_steps_8_0= ruleExtensionStep ) )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:381:4: (lv_steps_8_0= ruleExtensionStep )
            	    {
            	    // InternalUseCaseDslParser.g:381:4: (lv_steps_8_0= ruleExtensionStep )
            	    // InternalUseCaseDslParser.g:382:5: lv_steps_8_0= ruleExtensionStep
            	    {

            	    					newCompositeNode(grammarAccess.getExtensionAccess().getStepsExtensionStepParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_steps_8_0=ruleExtensionStep();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtensionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"steps",
            	    						lv_steps_8_0,
            	    						"useCase.xtext.useCaseDsl.UseCaseDsl.ExtensionStep");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalUseCaseDslParser.g:399:3: ( ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) ) | ( (lv_end_15_0= ruleDeadEndStep ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==FullStop) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==RETURN) ) {
                        alt10=1;
                    }
                    else if ( ((LA10_2>=SYSTEM && LA10_2<=WHILE)||LA10_2==USER||(LA10_2>=UC && LA10_2<=RULE_CHAR)||LA10_2==RULE_ID||LA10_2==RULE_ANY_OTHER) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUseCaseDslParser.g:400:4: ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) )
                    {
                    // InternalUseCaseDslParser.g:400:4: ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) )
                    // InternalUseCaseDslParser.g:401:5: ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) )
                    {

                    					newCompositeNode(grammarAccess.getExtensionAccess().getStepNameParserRuleCall_8_0_0());
                    				
                    pushFollow(FOLLOW_16);
                    ruleStepName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_10=(Token)match(input,FullStop,FOLLOW_20); 

                    					newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getFullStopKeyword_8_0_1());
                    				
                    otherlv_11=(Token)match(input,RETURN,FOLLOW_21); 

                    					newLeafNode(otherlv_11, grammarAccess.getExtensionAccess().getRETURNKeyword_8_0_2());
                    				
                    otherlv_12=(Token)match(input,TO,FOLLOW_14); 

                    					newLeafNode(otherlv_12, grammarAccess.getExtensionAccess().getTOKeyword_8_0_3());
                    				
                    // InternalUseCaseDslParser.g:420:5: ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_INT) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==RULE_CHAR) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalUseCaseDslParser.g:421:6: ( ( ruleQualifiedStepName ) )
                            {
                            // InternalUseCaseDslParser.g:421:6: ( ( ruleQualifiedStepName ) )
                            // InternalUseCaseDslParser.g:422:7: ( ruleQualifiedStepName )
                            {
                            // InternalUseCaseDslParser.g:422:7: ( ruleQualifiedStepName )
                            // InternalUseCaseDslParser.g:423:8: ruleQualifiedStepName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getExtensionRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getExtensionAccess().getResumeAtUseCaseStepCrossReference_8_0_4_0_0());
                            							
                            pushFollow(FOLLOW_22);
                            ruleQualifiedStepName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalUseCaseDslParser.g:438:6: ( ( ruleQualifiedExtensionStepName ) )
                            {
                            // InternalUseCaseDslParser.g:438:6: ( ( ruleQualifiedExtensionStepName ) )
                            // InternalUseCaseDslParser.g:439:7: ( ruleQualifiedExtensionStepName )
                            {
                            // InternalUseCaseDslParser.g:439:7: ( ruleQualifiedExtensionStepName )
                            // InternalUseCaseDslParser.g:440:8: ruleQualifiedExtensionStepName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getExtensionRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getExtensionAccess().getResumeAtExtensionStepCrossReference_8_0_4_1_0());
                            							
                            pushFollow(FOLLOW_22);
                            ruleQualifiedExtensionStepName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:457:4: ( (lv_end_15_0= ruleDeadEndStep ) )
                    {
                    // InternalUseCaseDslParser.g:457:4: ( (lv_end_15_0= ruleDeadEndStep ) )
                    // InternalUseCaseDslParser.g:458:5: (lv_end_15_0= ruleDeadEndStep )
                    {
                    // InternalUseCaseDslParser.g:458:5: (lv_end_15_0= ruleDeadEndStep )
                    // InternalUseCaseDslParser.g:459:6: lv_end_15_0= ruleDeadEndStep
                    {

                    						newCompositeNode(grammarAccess.getExtensionAccess().getEndDeadEndStepParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_end_15_0=ruleDeadEndStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtensionRule());
                    						}
                    						set(
                    							current,
                    							"end",
                    							lv_end_15_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.DeadEndStep");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_16=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_16, grammarAccess.getExtensionAccess().getENDTerminalRuleCall_9());
            		

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
    // InternalUseCaseDslParser.g:485:1: entryRuleUseCaseStep returns [EObject current=null] : iv_ruleUseCaseStep= ruleUseCaseStep EOF ;
    public final EObject entryRuleUseCaseStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseStep = null;


        try {
            // InternalUseCaseDslParser.g:485:52: (iv_ruleUseCaseStep= ruleUseCaseStep EOF )
            // InternalUseCaseDslParser.g:486:2: iv_ruleUseCaseStep= ruleUseCaseStep EOF
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
    // InternalUseCaseDslParser.g:492:1: ruleUseCaseStep returns [EObject current=null] : ( ( ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_repeatflow_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END ) ) ;
    public final EObject ruleUseCaseStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token this_BEGIN_27=null;
        Token this_END_29=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_name_9_0 = null;

        AntlrDatatypeRuleToken lv_sentence_12_0 = null;

        AntlrDatatypeRuleToken lv_name_16_0 = null;

        AntlrDatatypeRuleToken lv_sentence_19_0 = null;

        AntlrDatatypeRuleToken lv_name_23_0 = null;

        AntlrDatatypeRuleToken lv_repeatingCondition_26_0 = null;

        EObject lv_repeatflow_28_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:498:2: ( ( ( ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_repeatflow_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END ) ) )
            // InternalUseCaseDslParser.g:499:2: ( ( ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_repeatflow_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END ) )
            {
            // InternalUseCaseDslParser.g:499:2: ( ( ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_repeatflow_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END ) )
            int alt16=4;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalUseCaseDslParser.g:500:3: ( ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:500:3: ( ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:501:4: ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:501:4: ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_INT) ) {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1==FullStop) ) {
                            int LA11_2 = input.LA(3);

                            if ( (LA11_2==RULE_INT) ) {
                                alt11=1;
                            }
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalUseCaseDslParser.g:502:5: ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop
                            {
                            // InternalUseCaseDslParser.g:502:5: ( ( ruleQualifiedStepName ) )
                            // InternalUseCaseDslParser.g:503:6: ( ruleQualifiedStepName )
                            {
                            // InternalUseCaseDslParser.g:503:6: ( ruleQualifiedStepName )
                            // InternalUseCaseDslParser.g:504:7: ruleQualifiedStepName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUseCaseStepRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getUseCaseStepAccess().getParentStepCrossReference_0_0_0_0());
                            						
                            pushFollow(FOLLOW_16);
                            ruleQualifiedStepName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_1=(Token)match(input,FullStop,FOLLOW_4); 

                            					newLeafNode(otherlv_1, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCaseDslParser.g:523:4: ( (lv_name_2_0= ruleStepName ) )
                    // InternalUseCaseDslParser.g:524:5: (lv_name_2_0= ruleStepName )
                    {
                    // InternalUseCaseDslParser.g:524:5: (lv_name_2_0= ruleStepName )
                    // InternalUseCaseDslParser.g:525:6: lv_name_2_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_name_2_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,FullStop,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_0_2());
                    			
                    otherlv_4=(Token)match(input,INCLUDE,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getUseCaseStepAccess().getINCLUDEKeyword_0_3());
                    			
                    // InternalUseCaseDslParser.g:550:4: ( ( ruleLongName ) )
                    // InternalUseCaseDslParser.g:551:5: ( ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:551:5: ( ruleLongName )
                    // InternalUseCaseDslParser.g:552:6: ruleLongName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUseCaseStepRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getReferenceUseCaseCrossReference_0_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleLongName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:568:3: ( () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:568:3: ( () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:569:4: () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:569:4: ()
                    // InternalUseCaseDslParser.g:570:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getUserStepAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:576:4: ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )?
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
                            // InternalUseCaseDslParser.g:577:5: ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop
                            {
                            // InternalUseCaseDslParser.g:577:5: ( ( ruleQualifiedStepName ) )
                            // InternalUseCaseDslParser.g:578:6: ( ruleQualifiedStepName )
                            {
                            // InternalUseCaseDslParser.g:578:6: ( ruleQualifiedStepName )
                            // InternalUseCaseDslParser.g:579:7: ruleQualifiedStepName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUseCaseStepRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getUseCaseStepAccess().getParentStepCrossReference_1_1_0_0());
                            						
                            pushFollow(FOLLOW_16);
                            ruleQualifiedStepName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_8=(Token)match(input,FullStop,FOLLOW_4); 

                            					newLeafNode(otherlv_8, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCaseDslParser.g:598:4: ( (lv_name_9_0= ruleStepName ) )
                    // InternalUseCaseDslParser.g:599:5: (lv_name_9_0= ruleStepName )
                    {
                    // InternalUseCaseDslParser.g:599:5: (lv_name_9_0= ruleStepName )
                    // InternalUseCaseDslParser.g:600:6: lv_name_9_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_name_9_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,FullStop,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_1_3());
                    			
                    otherlv_11=(Token)match(input,USER,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getUseCaseStepAccess().getUSERKeyword_1_4());
                    			
                    // InternalUseCaseDslParser.g:625:4: ( (lv_sentence_12_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:626:5: (lv_sentence_12_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:626:5: (lv_sentence_12_0= ruleLongName )
                    // InternalUseCaseDslParser.g:627:6: lv_sentence_12_0= ruleLongName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sentence_12_0=ruleLongName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"sentence",
                    							lv_sentence_12_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:646:3: ( () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:646:3: ( () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:647:4: () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:647:4: ()
                    // InternalUseCaseDslParser.g:648:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getSystemStepAction_2_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:654:4: ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_INT) ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1==FullStop) ) {
                            int LA13_2 = input.LA(3);

                            if ( (LA13_2==RULE_INT) ) {
                                alt13=1;
                            }
                        }
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalUseCaseDslParser.g:655:5: ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop
                            {
                            // InternalUseCaseDslParser.g:655:5: ( ( ruleQualifiedStepName ) )
                            // InternalUseCaseDslParser.g:656:6: ( ruleQualifiedStepName )
                            {
                            // InternalUseCaseDslParser.g:656:6: ( ruleQualifiedStepName )
                            // InternalUseCaseDslParser.g:657:7: ruleQualifiedStepName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUseCaseStepRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getUseCaseStepAccess().getParentStepCrossReference_2_1_0_0());
                            						
                            pushFollow(FOLLOW_16);
                            ruleQualifiedStepName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_15=(Token)match(input,FullStop,FOLLOW_4); 

                            					newLeafNode(otherlv_15, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_1_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCaseDslParser.g:676:4: ( (lv_name_16_0= ruleStepName ) )
                    // InternalUseCaseDslParser.g:677:5: (lv_name_16_0= ruleStepName )
                    {
                    // InternalUseCaseDslParser.g:677:5: (lv_name_16_0= ruleStepName )
                    // InternalUseCaseDslParser.g:678:6: lv_name_16_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_name_16_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_16_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,FullStop,FOLLOW_25); 

                    				newLeafNode(otherlv_17, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_3());
                    			
                    otherlv_18=(Token)match(input,SYSTEM,FOLLOW_6); 

                    				newLeafNode(otherlv_18, grammarAccess.getUseCaseStepAccess().getSYSTEMKeyword_2_4());
                    			
                    // InternalUseCaseDslParser.g:703:4: ( (lv_sentence_19_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:704:5: (lv_sentence_19_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:704:5: (lv_sentence_19_0= ruleLongName )
                    // InternalUseCaseDslParser.g:705:6: lv_sentence_19_0= ruleLongName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getSentenceLongNameParserRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sentence_19_0=ruleLongName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"sentence",
                    							lv_sentence_19_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.LongName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalUseCaseDslParser.g:724:3: ( () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_repeatflow_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END )
                    {
                    // InternalUseCaseDslParser.g:724:3: ( () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_repeatflow_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END )
                    // InternalUseCaseDslParser.g:725:4: () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_repeatflow_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END
                    {
                    // InternalUseCaseDslParser.g:725:4: ()
                    // InternalUseCaseDslParser.g:726:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getRepeatingStepAction_3_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:732:4: ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_INT) ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==FullStop) ) {
                            int LA14_2 = input.LA(3);

                            if ( (LA14_2==RULE_INT) ) {
                                alt14=1;
                            }
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalUseCaseDslParser.g:733:5: ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop
                            {
                            // InternalUseCaseDslParser.g:733:5: ( ( ruleQualifiedStepName ) )
                            // InternalUseCaseDslParser.g:734:6: ( ruleQualifiedStepName )
                            {
                            // InternalUseCaseDslParser.g:734:6: ( ruleQualifiedStepName )
                            // InternalUseCaseDslParser.g:735:7: ruleQualifiedStepName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUseCaseStepRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getUseCaseStepAccess().getParentStepCrossReference_3_1_0_0());
                            						
                            pushFollow(FOLLOW_16);
                            ruleQualifiedStepName();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_22=(Token)match(input,FullStop,FOLLOW_4); 

                            					newLeafNode(otherlv_22, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_3_1_1());
                            				

                            }
                            break;

                    }

                    // InternalUseCaseDslParser.g:754:4: ( (lv_name_23_0= ruleStepName ) )
                    // InternalUseCaseDslParser.g:755:5: (lv_name_23_0= ruleStepName )
                    {
                    // InternalUseCaseDslParser.g:755:5: (lv_name_23_0= ruleStepName )
                    // InternalUseCaseDslParser.g:756:6: lv_name_23_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_name_23_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_23_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,FullStop,FOLLOW_26); 

                    				newLeafNode(otherlv_24, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_3_3());
                    			
                    otherlv_25=(Token)match(input,WHILE,FOLLOW_19); 

                    				newLeafNode(otherlv_25, grammarAccess.getUseCaseStepAccess().getWHILEKeyword_3_4());
                    			
                    // InternalUseCaseDslParser.g:781:4: ( (lv_repeatingCondition_26_0= ruleCondition ) )
                    // InternalUseCaseDslParser.g:782:5: (lv_repeatingCondition_26_0= ruleCondition )
                    {
                    // InternalUseCaseDslParser.g:782:5: (lv_repeatingCondition_26_0= ruleCondition )
                    // InternalUseCaseDslParser.g:783:6: lv_repeatingCondition_26_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getRepeatingConditionConditionParserRuleCall_3_5_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_repeatingCondition_26_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"repeatingCondition",
                    							lv_repeatingCondition_26_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_BEGIN_27=(Token)match(input,RULE_BEGIN,FOLLOW_4); 

                    				newLeafNode(this_BEGIN_27, grammarAccess.getUseCaseStepAccess().getBEGINTerminalRuleCall_3_6());
                    			
                    // InternalUseCaseDslParser.g:804:4: ( (lv_repeatflow_28_0= ruleUseCaseStep ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_INT) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalUseCaseDslParser.g:805:5: (lv_repeatflow_28_0= ruleUseCaseStep )
                    	    {
                    	    // InternalUseCaseDslParser.g:805:5: (lv_repeatflow_28_0= ruleUseCaseStep )
                    	    // InternalUseCaseDslParser.g:806:6: lv_repeatflow_28_0= ruleUseCaseStep
                    	    {

                    	    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getRepeatflowUseCaseStepParserRuleCall_3_7_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_repeatflow_28_0=ruleUseCaseStep();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"repeatflow",
                    	    							lv_repeatflow_28_0,
                    	    							"useCase.xtext.useCaseDsl.UseCaseDsl.UseCaseStep");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    this_END_29=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_29, grammarAccess.getUseCaseStepAccess().getENDTerminalRuleCall_3_8());
                    			

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
    // InternalUseCaseDslParser.g:832:1: entryRuleExtensionStep returns [EObject current=null] : iv_ruleExtensionStep= ruleExtensionStep EOF ;
    public final EObject entryRuleExtensionStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionStep = null;


        try {
            // InternalUseCaseDslParser.g:832:54: (iv_ruleExtensionStep= ruleExtensionStep EOF )
            // InternalUseCaseDslParser.g:833:2: iv_ruleExtensionStep= ruleExtensionStep EOF
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
    // InternalUseCaseDslParser.g:839:1: ruleExtensionStep returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep ) ;
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
            // InternalUseCaseDslParser.g:845:2: ( ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep ) )
            // InternalUseCaseDslParser.g:846:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep )
            {
            // InternalUseCaseDslParser.g:846:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalUseCaseDslParser.g:847:3: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:847:3: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:848:4: ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:848:4: ( (lv_name_0_0= ruleStepName ) )
                    // InternalUseCaseDslParser.g:849:5: (lv_name_0_0= ruleStepName )
                    {
                    // InternalUseCaseDslParser.g:849:5: (lv_name_0_0= ruleStepName )
                    // InternalUseCaseDslParser.g:850:6: lv_name_0_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getExtensionStepAccess().getNameStepNameParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_16);
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

                    otherlv_1=(Token)match(input,FullStop,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getExtensionStepAccess().getFullStopKeyword_0_1());
                    			
                    // InternalUseCaseDslParser.g:871:4: (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )?
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
                            // InternalUseCaseDslParser.g:872:5: otherlv_2= USER
                            {
                            otherlv_2=(Token)match(input,USER,FOLLOW_6); 

                            					newLeafNode(otherlv_2, grammarAccess.getExtensionStepAccess().getUSERKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCaseDslParser.g:877:5: otherlv_3= SYSTEM
                            {
                            otherlv_3=(Token)match(input,SYSTEM,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_0_2_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalUseCaseDslParser.g:882:5: otherlv_4= WHILE
                            {
                            otherlv_4=(Token)match(input,WHILE,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getExtensionStepAccess().getWHILEKeyword_0_2_2());
                            				

                            }
                            break;

                    }

                    // InternalUseCaseDslParser.g:887:4: ( (lv_sentence_5_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:888:5: (lv_sentence_5_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:888:5: (lv_sentence_5_0= ruleLongName )
                    // InternalUseCaseDslParser.g:889:6: lv_sentence_5_0= ruleLongName
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
                    // InternalUseCaseDslParser.g:908:3: this_DeadEndStep_6= ruleDeadEndStep
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
    // InternalUseCaseDslParser.g:920:1: entryRuleDeadEndStep returns [EObject current=null] : iv_ruleDeadEndStep= ruleDeadEndStep EOF ;
    public final EObject entryRuleDeadEndStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeadEndStep = null;


        try {
            // InternalUseCaseDslParser.g:920:52: (iv_ruleDeadEndStep= ruleDeadEndStep EOF )
            // InternalUseCaseDslParser.g:921:2: iv_ruleDeadEndStep= ruleDeadEndStep EOF
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
    // InternalUseCaseDslParser.g:927:1: ruleDeadEndStep returns [EObject current=null] : ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END ) ;
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
            // InternalUseCaseDslParser.g:933:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END ) )
            // InternalUseCaseDslParser.g:934:2: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END )
            {
            // InternalUseCaseDslParser.g:934:2: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END )
            // InternalUseCaseDslParser.g:935:3: ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END
            {
            // InternalUseCaseDslParser.g:935:3: ( (lv_name_0_0= ruleStepName ) )
            // InternalUseCaseDslParser.g:936:4: (lv_name_0_0= ruleStepName )
            {
            // InternalUseCaseDslParser.g:936:4: (lv_name_0_0= ruleStepName )
            // InternalUseCaseDslParser.g:937:5: lv_name_0_0= ruleStepName
            {

            					newCompositeNode(grammarAccess.getDeadEndStepAccess().getNameStepNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_1=(Token)match(input,FullStop,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getDeadEndStepAccess().getFullStopKeyword_1());
            		
            // InternalUseCaseDslParser.g:958:3: (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )?
            int alt19=4;
            switch ( input.LA(1) ) {
                case USER:
                    {
                    alt19=1;
                    }
                    break;
                case SYSTEM:
                    {
                    alt19=2;
                    }
                    break;
                case WHILE:
                    {
                    alt19=3;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // InternalUseCaseDslParser.g:959:4: otherlv_2= USER
                    {
                    otherlv_2=(Token)match(input,USER,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:964:4: otherlv_3= SYSTEM
                    {
                    otherlv_3=(Token)match(input,SYSTEM,FOLLOW_29); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:969:4: otherlv_4= WHILE
                    {
                    otherlv_4=(Token)match(input,WHILE,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeadEndStepAccess().getWHILEKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalUseCaseDslParser.g:974:3: ( (lv_sentence_5_0= ruleLongName ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=QuotationMark && LA20_0<=RULE_CHAR)||LA20_0==RULE_ID||LA20_0==RULE_ANY_OTHER) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUseCaseDslParser.g:975:4: (lv_sentence_5_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:975:4: (lv_sentence_5_0= ruleLongName )
                    // InternalUseCaseDslParser.g:976:5: lv_sentence_5_0= ruleLongName
                    {

                    					newCompositeNode(grammarAccess.getDeadEndStepAccess().getSentenceLongNameParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_30);
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

            otherlv_6=(Token)match(input,UC,FOLLOW_31); 

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
    // InternalUseCaseDslParser.g:1005:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalUseCaseDslParser.g:1005:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalUseCaseDslParser.g:1006:2: iv_rulePrecondition= rulePrecondition EOF
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
    // InternalUseCaseDslParser.g:1012:1: rulePrecondition returns [EObject current=null] : (otherlv_0= PRECONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:1018:2: ( (otherlv_0= PRECONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalUseCaseDslParser.g:1019:2: (otherlv_0= PRECONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalUseCaseDslParser.g:1019:2: (otherlv_0= PRECONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalUseCaseDslParser.g:1020:3: otherlv_0= PRECONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,PRECONDITION,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getPRECONDITIONKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getPreconditionAccess().getColonKeyword_1());
            		
            // InternalUseCaseDslParser.g:1028:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:1029:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:1029:4: (lv_condition_2_0= ruleCondition )
            // InternalUseCaseDslParser.g:1030:5: lv_condition_2_0= ruleCondition
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
    // InternalUseCaseDslParser.g:1051:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalUseCaseDslParser.g:1051:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalUseCaseDslParser.g:1052:2: iv_rulePostcondition= rulePostcondition EOF
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
    // InternalUseCaseDslParser.g:1058:1: rulePostcondition returns [EObject current=null] : (otherlv_0= POSTCONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:1064:2: ( (otherlv_0= POSTCONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalUseCaseDslParser.g:1065:2: (otherlv_0= POSTCONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalUseCaseDslParser.g:1065:2: (otherlv_0= POSTCONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalUseCaseDslParser.g:1066:3: otherlv_0= POSTCONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,POSTCONDITION,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getPOSTCONDITIONKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getPostconditionAccess().getColonKeyword_1());
            		
            // InternalUseCaseDslParser.g:1074:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:1075:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:1075:4: (lv_condition_2_0= ruleCondition )
            // InternalUseCaseDslParser.g:1076:5: lv_condition_2_0= ruleCondition
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
    // InternalUseCaseDslParser.g:1097:1: entryRuleLongName returns [String current=null] : iv_ruleLongName= ruleLongName EOF ;
    public final String entryRuleLongName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLongName = null;


        try {
            // InternalUseCaseDslParser.g:1097:48: (iv_ruleLongName= ruleLongName EOF )
            // InternalUseCaseDslParser.g:1098:2: iv_ruleLongName= ruleLongName EOF
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
    // InternalUseCaseDslParser.g:1104:1: ruleLongName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ ;
    public final AntlrDatatypeRuleToken ruleLongName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_CHAR_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:1110:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ )
            // InternalUseCaseDslParser.g:1111:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
            {
            // InternalUseCaseDslParser.g:1111:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
            int cnt21=0;
            loop21:
            do {
                int alt21=8;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt21=1;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt21=2;
                    }
                    break;
                case RULE_CHAR:
                    {
                    alt21=3;
                    }
                    break;
                case Colon:
                    {
                    alt21=4;
                    }
                    break;
                case FullStop:
                    {
                    alt21=5;
                    }
                    break;
                case QuotationMark:
                    {
                    alt21=6;
                    }
                    break;
                case Apostrophe:
                    {
                    alt21=7;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1112:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUseCaseDslParser.g:1120:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_32); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUseCaseDslParser.g:1128:3: this_CHAR_2= RULE_CHAR
            	    {
            	    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_32); 

            	    			current.merge(this_CHAR_2);
            	    		

            	    			newLeafNode(this_CHAR_2, grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUseCaseDslParser.g:1136:3: kw= Colon
            	    {
            	    kw=(Token)match(input,Colon,FOLLOW_32); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getColonKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUseCaseDslParser.g:1142:3: kw= FullStop
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_32); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUseCaseDslParser.g:1148:3: kw= QuotationMark
            	    {
            	    kw=(Token)match(input,QuotationMark,FOLLOW_32); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalUseCaseDslParser.g:1154:3: kw= Apostrophe
            	    {
            	    kw=(Token)match(input,Apostrophe,FOLLOW_32); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getApostropheKeyword_6());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
    // InternalUseCaseDslParser.g:1163:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalUseCaseDslParser.g:1163:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalUseCaseDslParser.g:1164:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalUseCaseDslParser.g:1170:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+ ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_CHAR_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:1176:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+ )
            // InternalUseCaseDslParser.g:1177:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+
            {
            // InternalUseCaseDslParser.g:1177:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+
            int cnt22=0;
            loop22:
            do {
                int alt22=10;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt22=1;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt22=2;
                    }
                    break;
                case RULE_CHAR:
                    {
                    alt22=3;
                    }
                    break;
                case Colon:
                    {
                    alt22=4;
                    }
                    break;
                case FullStop:
                    {
                    alt22=5;
                    }
                    break;
                case QuotationMark:
                    {
                    alt22=6;
                    }
                    break;
                case Apostrophe:
                    {
                    alt22=7;
                    }
                    break;
                case AND:
                    {
                    alt22=8;
                    }
                    break;
                case OR:
                    {
                    alt22=9;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1178:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getConditionAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUseCaseDslParser.g:1186:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_33); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUseCaseDslParser.g:1194:3: this_CHAR_2= RULE_CHAR
            	    {
            	    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_33); 

            	    			current.merge(this_CHAR_2);
            	    		

            	    			newLeafNode(this_CHAR_2, grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUseCaseDslParser.g:1202:3: kw= Colon
            	    {
            	    kw=(Token)match(input,Colon,FOLLOW_33); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getColonKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUseCaseDslParser.g:1208:3: kw= FullStop
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_33); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUseCaseDslParser.g:1214:3: kw= QuotationMark
            	    {
            	    kw=(Token)match(input,QuotationMark,FOLLOW_33); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getQuotationMarkKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalUseCaseDslParser.g:1220:3: kw= Apostrophe
            	    {
            	    kw=(Token)match(input,Apostrophe,FOLLOW_33); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getApostropheKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalUseCaseDslParser.g:1226:3: kw= AND
            	    {
            	    kw=(Token)match(input,AND,FOLLOW_33); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getANDKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalUseCaseDslParser.g:1232:3: kw= OR
            	    {
            	    kw=(Token)match(input,OR,FOLLOW_33); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getORKeyword_8());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // InternalUseCaseDslParser.g:1241:1: entryRuleStepName returns [String current=null] : iv_ruleStepName= ruleStepName EOF ;
    public final String entryRuleStepName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStepName = null;


        try {
            // InternalUseCaseDslParser.g:1241:48: (iv_ruleStepName= ruleStepName EOF )
            // InternalUseCaseDslParser.g:1242:2: iv_ruleStepName= ruleStepName EOF
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
    // InternalUseCaseDslParser.g:1248:1: ruleStepName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleStepName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:1254:2: (this_INT_0= RULE_INT )
            // InternalUseCaseDslParser.g:1255:2: this_INT_0= RULE_INT
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


    // $ANTLR start "entryRuleQualifiedStepName"
    // InternalUseCaseDslParser.g:1265:1: entryRuleQualifiedStepName returns [String current=null] : iv_ruleQualifiedStepName= ruleQualifiedStepName EOF ;
    public final String entryRuleQualifiedStepName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedStepName = null;


        try {
            // InternalUseCaseDslParser.g:1265:57: (iv_ruleQualifiedStepName= ruleQualifiedStepName EOF )
            // InternalUseCaseDslParser.g:1266:2: iv_ruleQualifiedStepName= ruleQualifiedStepName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedStepNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedStepName=ruleQualifiedStepName();

            state._fsp--;

             current =iv_ruleQualifiedStepName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedStepName"


    // $ANTLR start "ruleQualifiedStepName"
    // InternalUseCaseDslParser.g:1272:1: ruleQualifiedStepName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_StepName_0= ruleStepName (kw= FullStop this_StepName_2= ruleStepName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedStepName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StepName_0 = null;

        AntlrDatatypeRuleToken this_StepName_2 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:1278:2: ( (this_StepName_0= ruleStepName (kw= FullStop this_StepName_2= ruleStepName )* ) )
            // InternalUseCaseDslParser.g:1279:2: (this_StepName_0= ruleStepName (kw= FullStop this_StepName_2= ruleStepName )* )
            {
            // InternalUseCaseDslParser.g:1279:2: (this_StepName_0= ruleStepName (kw= FullStop this_StepName_2= ruleStepName )* )
            // InternalUseCaseDslParser.g:1280:3: this_StepName_0= ruleStepName (kw= FullStop this_StepName_2= ruleStepName )*
            {

            			newCompositeNode(grammarAccess.getQualifiedStepNameAccess().getStepNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_StepName_0=ruleStepName();

            state._fsp--;


            			current.merge(this_StepName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalUseCaseDslParser.g:1290:3: (kw= FullStop this_StepName_2= ruleStepName )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==FullStop) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==RULE_INT) ) {
                        int LA23_3 = input.LA(3);

                        if ( (LA23_3==FullStop) ) {
                            int LA23_4 = input.LA(4);

                            if ( (LA23_4==RULE_CHAR||LA23_4==RULE_INT) ) {
                                alt23=1;
                            }


                        }
                        else if ( (LA23_3==EOF||LA23_3==RULE_END) ) {
                            alt23=1;
                        }


                    }


                }


                switch (alt23) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1291:4: kw= FullStop this_StepName_2= ruleStepName
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedStepNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedStepNameAccess().getStepNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_34);
            	    this_StepName_2=ruleStepName();

            	    state._fsp--;


            	    				current.merge(this_StepName_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop23;
                }
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
    // $ANTLR end "ruleQualifiedStepName"


    // $ANTLR start "entryRuleQualifiedExtensionStepName"
    // InternalUseCaseDslParser.g:1311:1: entryRuleQualifiedExtensionStepName returns [String current=null] : iv_ruleQualifiedExtensionStepName= ruleQualifiedExtensionStepName EOF ;
    public final String entryRuleQualifiedExtensionStepName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedExtensionStepName = null;


        try {
            // InternalUseCaseDslParser.g:1311:66: (iv_ruleQualifiedExtensionStepName= ruleQualifiedExtensionStepName EOF )
            // InternalUseCaseDslParser.g:1312:2: iv_ruleQualifiedExtensionStepName= ruleQualifiedExtensionStepName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedExtensionStepNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedExtensionStepName=ruleQualifiedExtensionStepName();

            state._fsp--;

             current =iv_ruleQualifiedExtensionStepName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedExtensionStepName"


    // $ANTLR start "ruleQualifiedExtensionStepName"
    // InternalUseCaseDslParser.g:1318:1: ruleQualifiedExtensionStepName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CHAR_0= RULE_CHAR kw= FullStop this_QualifiedStepName_2= ruleQualifiedStepName ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedExtensionStepName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CHAR_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedStepName_2 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:1324:2: ( (this_CHAR_0= RULE_CHAR kw= FullStop this_QualifiedStepName_2= ruleQualifiedStepName ) )
            // InternalUseCaseDslParser.g:1325:2: (this_CHAR_0= RULE_CHAR kw= FullStop this_QualifiedStepName_2= ruleQualifiedStepName )
            {
            // InternalUseCaseDslParser.g:1325:2: (this_CHAR_0= RULE_CHAR kw= FullStop this_QualifiedStepName_2= ruleQualifiedStepName )
            // InternalUseCaseDslParser.g:1326:3: this_CHAR_0= RULE_CHAR kw= FullStop this_QualifiedStepName_2= ruleQualifiedStepName
            {
            this_CHAR_0=(Token)match(input,RULE_CHAR,FOLLOW_16); 

            			current.merge(this_CHAR_0);
            		

            			newLeafNode(this_CHAR_0, grammarAccess.getQualifiedExtensionStepNameAccess().getCHARTerminalRuleCall_0());
            		
            kw=(Token)match(input,FullStop,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getQualifiedExtensionStepNameAccess().getFullStopKeyword_1());
            		

            			newCompositeNode(grammarAccess.getQualifiedExtensionStepNameAccess().getQualifiedStepNameParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_QualifiedStepName_2=ruleQualifiedStepName();

            state._fsp--;


            			current.merge(this_QualifiedStepName_2);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleQualifiedExtensionStepName"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\34\1\26\1\10\12\23\1\uffff\1\17\1\uffff\1\32";
    static final String dfa_3s = "\1\34\1\26\13\41\1\uffff\1\17\1\uffff\1\34";
    static final String dfa_4s = "\15\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\15\1\4\1\5\2\uffff\1\3\5\uffff\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\5\uffff\1\7",
            "\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\17\4\uffff\1\7",
            "\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\17\4\uffff\1\7",
            "\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\17\4\uffff\1\7",
            "\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\17\4\uffff\1\7",
            "\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\17\4\uffff\1\7",
            "\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\17\4\uffff\1\7",
            "\1\16\1\13\1\14\1\12\1\11\1\10\2\uffff\1\6\1\17\4\uffff\1\7",
            "",
            "\1\20",
            "",
            "\1\15\1\uffff\1\17"
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
            return "()* loopback of 380:3: ( (lv_steps_8_0= ruleExtensionStep ) )*";
        }
    }
    static final String dfa_7s = "\10\uffff";
    static final String dfa_8s = "\1\34\1\26\1\7\1\uffff\1\26\3\uffff";
    static final String dfa_9s = "\1\34\1\26\1\34\1\uffff\1\26\3\uffff";
    static final String dfa_10s = "\3\uffff\1\1\1\uffff\1\2\1\3\1\4";
    static final String dfa_11s = "\10\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\1\3\1\uffff\1\6\1\7\2\uffff\1\5\16\uffff\1\4",
            "",
            "\1\2",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "499:2: ( ( ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_repeatflow_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END ) )";
        }
    }
    static final String dfa_13s = "\17\uffff";
    static final String dfa_14s = "\6\uffff\7\16\2\uffff";
    static final String dfa_15s = "\1\34\1\26\1\11\12\23\2\uffff";
    static final String dfa_16s = "\1\34\1\26\13\41\2\uffff";
    static final String dfa_17s = "\15\uffff\1\2\1\1";
    static final String dfa_18s = "\17\uffff}>";
    static final String[] dfa_19s = {
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

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
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
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "846:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep )";
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000015000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000209F24000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000209F02600L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000209F82600L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000209F80000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000209F00002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000209F24002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000400002L});

}