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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "POSTCONDITION", "PRECONDITION", "ALTERNATIVE", "RETURN", "SYSTEM", "WHILE", "FLOW", "MAIN", "USER", "AND", "END", "IF", "OR", "TO", "UC", "QuotationMark", "Apostrophe", "FullStop", "Colon", "RULE_CHAR", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int SYSTEM=8;
    public static final int RULE_END=25;
    public static final int RULE_BEGIN=24;
    public static final int PRECONDITION=5;
    public static final int RULE_STRING=28;
    public static final int FLOW=10;
    public static final int UC=18;
    public static final int QuotationMark=19;
    public static final int RULE_SL_COMMENT=30;
    public static final int RETURN=7;
    public static final int ALTERNATIVE=6;
    public static final int RULE_CHAR=23;
    public static final int MAIN=11;
    public static final int Colon=22;
    public static final int EOF=-1;
    public static final int IF=15;
    public static final int Apostrophe=20;
    public static final int POSTCONDITION=4;
    public static final int FullStop=21;
    public static final int OR=16;
    public static final int RULE_ID=26;
    public static final int RULE_WS=31;
    public static final int RULE_ANY_OTHER=32;
    public static final int USER=12;
    public static final int RULE_INT=27;
    public static final int AND=13;
    public static final int RULE_ML_COMMENT=29;
    public static final int WHILE=9;
    public static final int END=14;
    public static final int TO=17;

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
    // InternalUseCaseDslParser.g:284:1: ruleExtension returns [EObject current=null] : ( ( ( ( ruleStepName ) ) otherlv_1= FullStop )+ ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )* ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ ) | ( (lv_end_14_0= ruleDeadEndStep ) ) ) this_END_15= RULE_END ) ;
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
        AntlrDatatypeRuleToken lv_condition_5_0 = null;

        EObject lv_steps_7_0 = null;

        AntlrDatatypeRuleToken lv_resumeAt_12_0 = null;

        EObject lv_end_14_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:290:2: ( ( ( ( ( ruleStepName ) ) otherlv_1= FullStop )+ ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )* ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ ) | ( (lv_end_14_0= ruleDeadEndStep ) ) ) this_END_15= RULE_END ) )
            // InternalUseCaseDslParser.g:291:2: ( ( ( ( ruleStepName ) ) otherlv_1= FullStop )+ ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )* ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ ) | ( (lv_end_14_0= ruleDeadEndStep ) ) ) this_END_15= RULE_END )
            {
            // InternalUseCaseDslParser.g:291:2: ( ( ( ( ruleStepName ) ) otherlv_1= FullStop )+ ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )* ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ ) | ( (lv_end_14_0= ruleDeadEndStep ) ) ) this_END_15= RULE_END )
            // InternalUseCaseDslParser.g:292:3: ( ( ( ruleStepName ) ) otherlv_1= FullStop )+ ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )* ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ ) | ( (lv_end_14_0= ruleDeadEndStep ) ) ) this_END_15= RULE_END
            {
            // InternalUseCaseDslParser.g:292:3: ( ( ( ruleStepName ) ) otherlv_1= FullStop )+
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
            	    // InternalUseCaseDslParser.g:293:4: ( ( ruleStepName ) ) otherlv_1= FullStop
            	    {
            	    // InternalUseCaseDslParser.g:293:4: ( ( ruleStepName ) )
            	    // InternalUseCaseDslParser.g:294:5: ( ruleStepName )
            	    {
            	    // InternalUseCaseDslParser.g:294:5: ( ruleStepName )
            	    // InternalUseCaseDslParser.g:295:6: ruleStepName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExtensionRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getExtensionAccess().getStartFromStepCrossReference_0_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    ruleStepName();

            	    state._fsp--;


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

            // InternalUseCaseDslParser.g:314:3: ( (lv_name_2_0= RULE_CHAR ) )
            // InternalUseCaseDslParser.g:315:4: (lv_name_2_0= RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:315:4: (lv_name_2_0= RULE_CHAR )
            // InternalUseCaseDslParser.g:316:5: lv_name_2_0= RULE_CHAR
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
            		
            // InternalUseCaseDslParser.g:340:3: ( (lv_condition_5_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:341:4: (lv_condition_5_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:341:4: (lv_condition_5_0= ruleCondition )
            // InternalUseCaseDslParser.g:342:5: lv_condition_5_0= ruleCondition
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
            		
            // InternalUseCaseDslParser.g:363:3: ( (lv_steps_7_0= ruleExtensionStep ) )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:364:4: (lv_steps_7_0= ruleExtensionStep )
            	    {
            	    // InternalUseCaseDslParser.g:364:4: (lv_steps_7_0= ruleExtensionStep )
            	    // InternalUseCaseDslParser.g:365:5: lv_steps_7_0= ruleExtensionStep
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

            // InternalUseCaseDslParser.g:382:3: ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ ) | ( (lv_end_14_0= ruleDeadEndStep ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==FullStop) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==RETURN) ) {
                        alt11=1;
                    }
                    else if ( ((LA11_2>=SYSTEM && LA11_2<=WHILE)||LA11_2==USER||(LA11_2>=UC && LA11_2<=RULE_CHAR)||LA11_2==RULE_ID||LA11_2==RULE_ANY_OTHER) ) {
                        alt11=2;
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
                    // InternalUseCaseDslParser.g:383:4: (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ )
                    {
                    // InternalUseCaseDslParser.g:383:4: (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+ )
                    // InternalUseCaseDslParser.g:384:5: this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+
                    {
                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_14); 

                    					newLeafNode(this_INT_8, grammarAccess.getExtensionAccess().getINTTerminalRuleCall_7_0_0());
                    				
                    otherlv_9=(Token)match(input,FullStop,FOLLOW_18); 

                    					newLeafNode(otherlv_9, grammarAccess.getExtensionAccess().getFullStopKeyword_7_0_1());
                    				
                    otherlv_10=(Token)match(input,RETURN,FOLLOW_19); 

                    					newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getRETURNKeyword_7_0_2());
                    				
                    otherlv_11=(Token)match(input,TO,FOLLOW_4); 

                    					newLeafNode(otherlv_11, grammarAccess.getExtensionAccess().getTOKeyword_7_0_3());
                    				
                    // InternalUseCaseDslParser.g:400:5: ( ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )? )+
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
                    	    // InternalUseCaseDslParser.g:401:6: ( (lv_resumeAt_12_0= ruleStepName ) ) (otherlv_13= FullStop )?
                    	    {
                    	    // InternalUseCaseDslParser.g:401:6: ( (lv_resumeAt_12_0= ruleStepName ) )
                    	    // InternalUseCaseDslParser.g:402:7: (lv_resumeAt_12_0= ruleStepName )
                    	    {
                    	    // InternalUseCaseDslParser.g:402:7: (lv_resumeAt_12_0= ruleStepName )
                    	    // InternalUseCaseDslParser.g:403:8: lv_resumeAt_12_0= ruleStepName
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

                    	    // InternalUseCaseDslParser.g:420:6: (otherlv_13= FullStop )?
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==FullStop) ) {
                    	        alt9=1;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // InternalUseCaseDslParser.g:421:7: otherlv_13= FullStop
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
                    // InternalUseCaseDslParser.g:429:4: ( (lv_end_14_0= ruleDeadEndStep ) )
                    {
                    // InternalUseCaseDslParser.g:429:4: ( (lv_end_14_0= ruleDeadEndStep ) )
                    // InternalUseCaseDslParser.g:430:5: (lv_end_14_0= ruleDeadEndStep )
                    {
                    // InternalUseCaseDslParser.g:430:5: (lv_end_14_0= ruleDeadEndStep )
                    // InternalUseCaseDslParser.g:431:6: lv_end_14_0= ruleDeadEndStep
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
    // InternalUseCaseDslParser.g:457:1: entryRuleUseCaseStep returns [EObject current=null] : iv_ruleUseCaseStep= ruleUseCaseStep EOF ;
    public final EObject entryRuleUseCaseStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseStep = null;


        try {
            // InternalUseCaseDslParser.g:457:52: (iv_ruleUseCaseStep= ruleUseCaseStep EOF )
            // InternalUseCaseDslParser.g:458:2: iv_ruleUseCaseStep= ruleUseCaseStep EOF
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
    // InternalUseCaseDslParser.g:464:1: ruleUseCaseStep returns [EObject current=null] : ( ( () ( (lv_name_1_0= ruleStepName ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= ruleStepName ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) ) | ( () ( (lv_name_11_0= ruleStepName ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) this_BEGIN_15= RULE_BEGIN ( ( ( ( ruleStepName ) ) otherlv_17= FullStop )+ ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+ this_END_19= RULE_END ) ) ;
    public final EObject ruleUseCaseStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token this_BEGIN_15=null;
        Token otherlv_17=null;
        Token this_END_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_sentence_4_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_sentence_9_0 = null;

        AntlrDatatypeRuleToken lv_name_11_0 = null;

        AntlrDatatypeRuleToken lv_repeatingCondition_14_0 = null;

        EObject lv_repeatflow_18_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:470:2: ( ( ( () ( (lv_name_1_0= ruleStepName ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= ruleStepName ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) ) | ( () ( (lv_name_11_0= ruleStepName ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) this_BEGIN_15= RULE_BEGIN ( ( ( ( ruleStepName ) ) otherlv_17= FullStop )+ ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+ this_END_19= RULE_END ) ) )
            // InternalUseCaseDslParser.g:471:2: ( ( () ( (lv_name_1_0= ruleStepName ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= ruleStepName ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) ) | ( () ( (lv_name_11_0= ruleStepName ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) this_BEGIN_15= RULE_BEGIN ( ( ( ( ruleStepName ) ) otherlv_17= FullStop )+ ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+ this_END_19= RULE_END ) )
            {
            // InternalUseCaseDslParser.g:471:2: ( ( () ( (lv_name_1_0= ruleStepName ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= ruleStepName ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) ) | ( () ( (lv_name_11_0= ruleStepName ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) this_BEGIN_15= RULE_BEGIN ( ( ( ( ruleStepName ) ) otherlv_17= FullStop )+ ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+ this_END_19= RULE_END ) )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==FullStop) ) {
                    switch ( input.LA(3) ) {
                    case WHILE:
                        {
                        alt14=3;
                        }
                        break;
                    case SYSTEM:
                        {
                        alt14=2;
                        }
                        break;
                    case USER:
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
                    // InternalUseCaseDslParser.g:472:3: ( () ( (lv_name_1_0= ruleStepName ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:472:3: ( () ( (lv_name_1_0= ruleStepName ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:473:4: () ( (lv_name_1_0= ruleStepName ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:473:4: ()
                    // InternalUseCaseDslParser.g:474:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getUserStepAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:480:4: ( (lv_name_1_0= ruleStepName ) )
                    // InternalUseCaseDslParser.g:481:5: (lv_name_1_0= ruleStepName )
                    {
                    // InternalUseCaseDslParser.g:481:5: (lv_name_1_0= ruleStepName )
                    // InternalUseCaseDslParser.g:482:6: lv_name_1_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_name_1_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,FullStop,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,USER,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getUseCaseStepAccess().getUSERKeyword_0_3());
                    			
                    // InternalUseCaseDslParser.g:507:4: ( (lv_sentence_4_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:508:5: (lv_sentence_4_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:508:5: (lv_sentence_4_0= ruleLongName )
                    // InternalUseCaseDslParser.g:509:6: lv_sentence_4_0= ruleLongName
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
                    // InternalUseCaseDslParser.g:528:3: ( () ( (lv_name_6_0= ruleStepName ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:528:3: ( () ( (lv_name_6_0= ruleStepName ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:529:4: () ( (lv_name_6_0= ruleStepName ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:529:4: ()
                    // InternalUseCaseDslParser.g:530:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getSystemStepAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:536:4: ( (lv_name_6_0= ruleStepName ) )
                    // InternalUseCaseDslParser.g:537:5: (lv_name_6_0= ruleStepName )
                    {
                    // InternalUseCaseDslParser.g:537:5: (lv_name_6_0= ruleStepName )
                    // InternalUseCaseDslParser.g:538:6: lv_name_6_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_name_6_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,FullStop,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_1_2());
                    			
                    otherlv_8=(Token)match(input,SYSTEM,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getUseCaseStepAccess().getSYSTEMKeyword_1_3());
                    			
                    // InternalUseCaseDslParser.g:563:4: ( (lv_sentence_9_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:564:5: (lv_sentence_9_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:564:5: (lv_sentence_9_0= ruleLongName )
                    // InternalUseCaseDslParser.g:565:6: lv_sentence_9_0= ruleLongName
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
                    // InternalUseCaseDslParser.g:584:3: ( () ( (lv_name_11_0= ruleStepName ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) this_BEGIN_15= RULE_BEGIN ( ( ( ( ruleStepName ) ) otherlv_17= FullStop )+ ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+ this_END_19= RULE_END )
                    {
                    // InternalUseCaseDslParser.g:584:3: ( () ( (lv_name_11_0= ruleStepName ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) this_BEGIN_15= RULE_BEGIN ( ( ( ( ruleStepName ) ) otherlv_17= FullStop )+ ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+ this_END_19= RULE_END )
                    // InternalUseCaseDslParser.g:585:4: () ( (lv_name_11_0= ruleStepName ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) this_BEGIN_15= RULE_BEGIN ( ( ( ( ruleStepName ) ) otherlv_17= FullStop )+ ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+ this_END_19= RULE_END
                    {
                    // InternalUseCaseDslParser.g:585:4: ()
                    // InternalUseCaseDslParser.g:586:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getRepeatingStepAction_2_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:592:4: ( (lv_name_11_0= ruleStepName ) )
                    // InternalUseCaseDslParser.g:593:5: (lv_name_11_0= ruleStepName )
                    {
                    // InternalUseCaseDslParser.g:593:5: (lv_name_11_0= ruleStepName )
                    // InternalUseCaseDslParser.g:594:6: lv_name_11_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_name_11_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_11_0,
                    							"useCase.xtext.useCaseDsl.UseCaseDsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,FullStop,FOLLOW_24); 

                    				newLeafNode(otherlv_12, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_2());
                    			
                    otherlv_13=(Token)match(input,WHILE,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getUseCaseStepAccess().getWHILEKeyword_2_3());
                    			
                    // InternalUseCaseDslParser.g:619:4: ( (lv_repeatingCondition_14_0= ruleCondition ) )
                    // InternalUseCaseDslParser.g:620:5: (lv_repeatingCondition_14_0= ruleCondition )
                    {
                    // InternalUseCaseDslParser.g:620:5: (lv_repeatingCondition_14_0= ruleCondition )
                    // InternalUseCaseDslParser.g:621:6: lv_repeatingCondition_14_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getRepeatingConditionConditionParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    this_BEGIN_15=(Token)match(input,RULE_BEGIN,FOLLOW_4); 

                    				newLeafNode(this_BEGIN_15, grammarAccess.getUseCaseStepAccess().getBEGINTerminalRuleCall_2_5());
                    			
                    // InternalUseCaseDslParser.g:642:4: ( ( ( ( ruleStepName ) ) otherlv_17= FullStop )+ ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+
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
                    	    // InternalUseCaseDslParser.g:643:5: ( ( ( ruleStepName ) ) otherlv_17= FullStop )+ ( (lv_repeatflow_18_0= ruleUseCaseStep ) )
                    	    {
                    	    // InternalUseCaseDslParser.g:643:5: ( ( ( ruleStepName ) ) otherlv_17= FullStop )+
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
                    	    	    // InternalUseCaseDslParser.g:644:6: ( ( ruleStepName ) ) otherlv_17= FullStop
                    	    	    {
                    	    	    // InternalUseCaseDslParser.g:644:6: ( ( ruleStepName ) )
                    	    	    // InternalUseCaseDslParser.g:645:7: ( ruleStepName )
                    	    	    {
                    	    	    // InternalUseCaseDslParser.g:645:7: ( ruleStepName )
                    	    	    // InternalUseCaseDslParser.g:646:8: ruleStepName
                    	    	    {

                    	    	    								if (current==null) {
                    	    	    									current = createModelElement(grammarAccess.getUseCaseStepRule());
                    	    	    								}
                    	    	    							

                    	    	    								newCompositeNode(grammarAccess.getUseCaseStepAccess().getParentStepCrossReference_2_6_0_0_0());
                    	    	    							
                    	    	    pushFollow(FOLLOW_14);
                    	    	    ruleStepName();

                    	    	    state._fsp--;


                    	    	    								afterParserOrEnumRuleCall();
                    	    	    							

                    	    	    }


                    	    	    }

                    	    	    otherlv_17=(Token)match(input,FullStop,FOLLOW_4); 

                    	    	    						newLeafNode(otherlv_17, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_6_0_1());
                    	    	    					

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

                    	    // InternalUseCaseDslParser.g:665:5: ( (lv_repeatflow_18_0= ruleUseCaseStep ) )
                    	    // InternalUseCaseDslParser.g:666:6: (lv_repeatflow_18_0= ruleUseCaseStep )
                    	    {
                    	    // InternalUseCaseDslParser.g:666:6: (lv_repeatflow_18_0= ruleUseCaseStep )
                    	    // InternalUseCaseDslParser.g:667:7: lv_repeatflow_18_0= ruleUseCaseStep
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseCaseStepAccess().getRepeatflowUseCaseStepParserRuleCall_2_6_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_repeatflow_18_0=ruleUseCaseStep();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"repeatflow",
                    	    								lv_repeatflow_18_0,
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

                    this_END_19=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_19, grammarAccess.getUseCaseStepAccess().getENDTerminalRuleCall_2_7());
                    			

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
    // InternalUseCaseDslParser.g:694:1: entryRuleExtensionStep returns [EObject current=null] : iv_ruleExtensionStep= ruleExtensionStep EOF ;
    public final EObject entryRuleExtensionStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionStep = null;


        try {
            // InternalUseCaseDslParser.g:694:54: (iv_ruleExtensionStep= ruleExtensionStep EOF )
            // InternalUseCaseDslParser.g:695:2: iv_ruleExtensionStep= ruleExtensionStep EOF
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
    // InternalUseCaseDslParser.g:701:1: ruleExtensionStep returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep ) ;
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
            // InternalUseCaseDslParser.g:707:2: ( ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep ) )
            // InternalUseCaseDslParser.g:708:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep )
            {
            // InternalUseCaseDslParser.g:708:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalUseCaseDslParser.g:709:3: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:709:3: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:710:4: ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:710:4: ( (lv_name_0_0= ruleStepName ) )
                    // InternalUseCaseDslParser.g:711:5: (lv_name_0_0= ruleStepName )
                    {
                    // InternalUseCaseDslParser.g:711:5: (lv_name_0_0= ruleStepName )
                    // InternalUseCaseDslParser.g:712:6: lv_name_0_0= ruleStepName
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

                    otherlv_1=(Token)match(input,FullStop,FOLLOW_25); 

                    				newLeafNode(otherlv_1, grammarAccess.getExtensionStepAccess().getFullStopKeyword_0_1());
                    			
                    // InternalUseCaseDslParser.g:733:4: (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )?
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
                            // InternalUseCaseDslParser.g:734:5: otherlv_2= USER
                            {
                            otherlv_2=(Token)match(input,USER,FOLLOW_6); 

                            					newLeafNode(otherlv_2, grammarAccess.getExtensionStepAccess().getUSERKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCaseDslParser.g:739:5: otherlv_3= SYSTEM
                            {
                            otherlv_3=(Token)match(input,SYSTEM,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_0_2_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalUseCaseDslParser.g:744:5: otherlv_4= WHILE
                            {
                            otherlv_4=(Token)match(input,WHILE,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getExtensionStepAccess().getWHILEKeyword_0_2_2());
                            				

                            }
                            break;

                    }

                    // InternalUseCaseDslParser.g:749:4: ( (lv_sentence_5_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:750:5: (lv_sentence_5_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:750:5: (lv_sentence_5_0= ruleLongName )
                    // InternalUseCaseDslParser.g:751:6: lv_sentence_5_0= ruleLongName
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
                    // InternalUseCaseDslParser.g:770:3: this_DeadEndStep_6= ruleDeadEndStep
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
    // InternalUseCaseDslParser.g:782:1: entryRuleDeadEndStep returns [EObject current=null] : iv_ruleDeadEndStep= ruleDeadEndStep EOF ;
    public final EObject entryRuleDeadEndStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeadEndStep = null;


        try {
            // InternalUseCaseDslParser.g:782:52: (iv_ruleDeadEndStep= ruleDeadEndStep EOF )
            // InternalUseCaseDslParser.g:783:2: iv_ruleDeadEndStep= ruleDeadEndStep EOF
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
    // InternalUseCaseDslParser.g:789:1: ruleDeadEndStep returns [EObject current=null] : ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END ) ;
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
            // InternalUseCaseDslParser.g:795:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END ) )
            // InternalUseCaseDslParser.g:796:2: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END )
            {
            // InternalUseCaseDslParser.g:796:2: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END )
            // InternalUseCaseDslParser.g:797:3: ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END
            {
            // InternalUseCaseDslParser.g:797:3: ( (lv_name_0_0= ruleStepName ) )
            // InternalUseCaseDslParser.g:798:4: (lv_name_0_0= ruleStepName )
            {
            // InternalUseCaseDslParser.g:798:4: (lv_name_0_0= ruleStepName )
            // InternalUseCaseDslParser.g:799:5: lv_name_0_0= ruleStepName
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

            otherlv_1=(Token)match(input,FullStop,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDeadEndStepAccess().getFullStopKeyword_1());
            		
            // InternalUseCaseDslParser.g:820:3: (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )?
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
                    // InternalUseCaseDslParser.g:821:4: otherlv_2= USER
                    {
                    otherlv_2=(Token)match(input,USER,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:826:4: otherlv_3= SYSTEM
                    {
                    otherlv_3=(Token)match(input,SYSTEM,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:831:4: otherlv_4= WHILE
                    {
                    otherlv_4=(Token)match(input,WHILE,FOLLOW_27); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeadEndStepAccess().getWHILEKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalUseCaseDslParser.g:836:3: ( (lv_sentence_5_0= ruleLongName ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=QuotationMark && LA18_0<=RULE_CHAR)||LA18_0==RULE_ID||LA18_0==RULE_ANY_OTHER) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUseCaseDslParser.g:837:4: (lv_sentence_5_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:837:4: (lv_sentence_5_0= ruleLongName )
                    // InternalUseCaseDslParser.g:838:5: lv_sentence_5_0= ruleLongName
                    {

                    					newCompositeNode(grammarAccess.getDeadEndStepAccess().getSentenceLongNameParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_28);
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

            otherlv_6=(Token)match(input,UC,FOLLOW_29); 

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
    // InternalUseCaseDslParser.g:867:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalUseCaseDslParser.g:867:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalUseCaseDslParser.g:868:2: iv_rulePrecondition= rulePrecondition EOF
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
    // InternalUseCaseDslParser.g:874:1: rulePrecondition returns [EObject current=null] : ( ( (lv_name_0_0= PRECONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:880:2: ( ( ( (lv_name_0_0= PRECONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalUseCaseDslParser.g:881:2: ( ( (lv_name_0_0= PRECONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalUseCaseDslParser.g:881:2: ( ( (lv_name_0_0= PRECONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalUseCaseDslParser.g:882:3: ( (lv_name_0_0= PRECONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) )
            {
            // InternalUseCaseDslParser.g:882:3: ( (lv_name_0_0= PRECONDITION ) )
            // InternalUseCaseDslParser.g:883:4: (lv_name_0_0= PRECONDITION )
            {
            // InternalUseCaseDslParser.g:883:4: (lv_name_0_0= PRECONDITION )
            // InternalUseCaseDslParser.g:884:5: lv_name_0_0= PRECONDITION
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
            		
            // InternalUseCaseDslParser.g:900:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:901:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:901:4: (lv_condition_2_0= ruleCondition )
            // InternalUseCaseDslParser.g:902:5: lv_condition_2_0= ruleCondition
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
    // InternalUseCaseDslParser.g:923:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalUseCaseDslParser.g:923:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalUseCaseDslParser.g:924:2: iv_rulePostcondition= rulePostcondition EOF
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
    // InternalUseCaseDslParser.g:930:1: rulePostcondition returns [EObject current=null] : ( ( (lv_name_0_0= POSTCONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:936:2: ( ( ( (lv_name_0_0= POSTCONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalUseCaseDslParser.g:937:2: ( ( (lv_name_0_0= POSTCONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalUseCaseDslParser.g:937:2: ( ( (lv_name_0_0= POSTCONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalUseCaseDslParser.g:938:3: ( (lv_name_0_0= POSTCONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) )
            {
            // InternalUseCaseDslParser.g:938:3: ( (lv_name_0_0= POSTCONDITION ) )
            // InternalUseCaseDslParser.g:939:4: (lv_name_0_0= POSTCONDITION )
            {
            // InternalUseCaseDslParser.g:939:4: (lv_name_0_0= POSTCONDITION )
            // InternalUseCaseDslParser.g:940:5: lv_name_0_0= POSTCONDITION
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
            		
            // InternalUseCaseDslParser.g:956:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:957:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:957:4: (lv_condition_2_0= ruleCondition )
            // InternalUseCaseDslParser.g:958:5: lv_condition_2_0= ruleCondition
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
    // InternalUseCaseDslParser.g:979:1: entryRuleLongName returns [String current=null] : iv_ruleLongName= ruleLongName EOF ;
    public final String entryRuleLongName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLongName = null;


        try {
            // InternalUseCaseDslParser.g:979:48: (iv_ruleLongName= ruleLongName EOF )
            // InternalUseCaseDslParser.g:980:2: iv_ruleLongName= ruleLongName EOF
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
    // InternalUseCaseDslParser.g:986:1: ruleLongName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ ;
    public final AntlrDatatypeRuleToken ruleLongName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_CHAR_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:992:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ )
            // InternalUseCaseDslParser.g:993:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
            {
            // InternalUseCaseDslParser.g:993:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
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
            	    // InternalUseCaseDslParser.g:994:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUseCaseDslParser.g:1002:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_30); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUseCaseDslParser.g:1010:3: this_CHAR_2= RULE_CHAR
            	    {
            	    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_30); 

            	    			current.merge(this_CHAR_2);
            	    		

            	    			newLeafNode(this_CHAR_2, grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUseCaseDslParser.g:1018:3: kw= Colon
            	    {
            	    kw=(Token)match(input,Colon,FOLLOW_30); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getColonKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUseCaseDslParser.g:1024:3: kw= FullStop
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_30); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUseCaseDslParser.g:1030:3: kw= QuotationMark
            	    {
            	    kw=(Token)match(input,QuotationMark,FOLLOW_30); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalUseCaseDslParser.g:1036:3: kw= Apostrophe
            	    {
            	    kw=(Token)match(input,Apostrophe,FOLLOW_30); 

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
    // InternalUseCaseDslParser.g:1045:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalUseCaseDslParser.g:1045:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalUseCaseDslParser.g:1046:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalUseCaseDslParser.g:1052:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+ ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_CHAR_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:1058:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+ )
            // InternalUseCaseDslParser.g:1059:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+
            {
            // InternalUseCaseDslParser.g:1059:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+
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
            	    // InternalUseCaseDslParser.g:1060:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getConditionAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUseCaseDslParser.g:1068:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_31); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUseCaseDslParser.g:1076:3: this_CHAR_2= RULE_CHAR
            	    {
            	    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_31); 

            	    			current.merge(this_CHAR_2);
            	    		

            	    			newLeafNode(this_CHAR_2, grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUseCaseDslParser.g:1084:3: kw= Colon
            	    {
            	    kw=(Token)match(input,Colon,FOLLOW_31); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getColonKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUseCaseDslParser.g:1090:3: kw= FullStop
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_31); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUseCaseDslParser.g:1096:3: kw= QuotationMark
            	    {
            	    kw=(Token)match(input,QuotationMark,FOLLOW_31); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getQuotationMarkKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalUseCaseDslParser.g:1102:3: kw= Apostrophe
            	    {
            	    kw=(Token)match(input,Apostrophe,FOLLOW_31); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getApostropheKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalUseCaseDslParser.g:1108:3: kw= AND
            	    {
            	    kw=(Token)match(input,AND,FOLLOW_31); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getANDKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalUseCaseDslParser.g:1114:3: kw= OR
            	    {
            	    kw=(Token)match(input,OR,FOLLOW_31); 

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
    // InternalUseCaseDslParser.g:1123:1: entryRuleStepName returns [String current=null] : iv_ruleStepName= ruleStepName EOF ;
    public final String entryRuleStepName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStepName = null;


        try {
            // InternalUseCaseDslParser.g:1123:48: (iv_ruleStepName= ruleStepName EOF )
            // InternalUseCaseDslParser.g:1124:2: iv_ruleStepName= ruleStepName EOF
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
    // InternalUseCaseDslParser.g:1130:1: ruleStepName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleStepName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:1136:2: (this_INT_0= RULE_INT )
            // InternalUseCaseDslParser.g:1137:2: this_INT_0= RULE_INT
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
    static final String dfa_2s = "\1\33\1\25\1\7\1\uffff\12\22\1\16\1\uffff\1\31";
    static final String dfa_3s = "\1\33\1\25\1\40\1\uffff\12\40\1\16\1\uffff\1\33";
    static final String dfa_4s = "\3\uffff\1\2\13\uffff\1\1\1\uffff";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3\1\5\1\6\2\uffff\1\4\5\uffff\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\1\17\4\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\1\17\4\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\1\17\4\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\1\17\4\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\1\17\4\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\1\17\4\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\1\17\4\uffff\1\10",
            "\1\20",
            "",
            "\1\3\1\uffff\1\17"
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
            return "()* loopback of 363:3: ( (lv_steps_7_0= ruleExtensionStep ) )*";
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\6\uffff\7\16\2\uffff";
    static final String dfa_9s = "\1\33\1\25\1\10\12\22\2\uffff";
    static final String dfa_10s = "\1\33\1\25\13\40\2\uffff";
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
            return "708:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000104F80000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000830L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000104F92000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000A200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000104F81300L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000104FC1300L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000104FC0000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000104F80002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000104F92002L});

}