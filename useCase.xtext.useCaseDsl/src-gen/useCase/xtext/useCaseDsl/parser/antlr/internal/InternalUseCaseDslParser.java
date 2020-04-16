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
    // InternalUseCaseDslParser.g:284:1: ruleExtension returns [EObject current=null] : ( ( (lv_startFrom_0_0= RULE_INT ) ) otherlv_1= FullStop ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )* ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) ) this_END_14= RULE_END ) ;
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
            // InternalUseCaseDslParser.g:290:2: ( ( ( (lv_startFrom_0_0= RULE_INT ) ) otherlv_1= FullStop ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )* ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) ) this_END_14= RULE_END ) )
            // InternalUseCaseDslParser.g:291:2: ( ( (lv_startFrom_0_0= RULE_INT ) ) otherlv_1= FullStop ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )* ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) ) this_END_14= RULE_END )
            {
            // InternalUseCaseDslParser.g:291:2: ( ( (lv_startFrom_0_0= RULE_INT ) ) otherlv_1= FullStop ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )* ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) ) this_END_14= RULE_END )
            // InternalUseCaseDslParser.g:292:3: ( (lv_startFrom_0_0= RULE_INT ) ) otherlv_1= FullStop ( (lv_name_2_0= RULE_CHAR ) ) otherlv_3= FullStop otherlv_4= IF ( (lv_condition_5_0= ruleCondition ) ) this_BEGIN_6= RULE_BEGIN ( (lv_steps_7_0= ruleExtensionStep ) )* ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) ) this_END_14= RULE_END
            {
            // InternalUseCaseDslParser.g:292:3: ( (lv_startFrom_0_0= RULE_INT ) )
            // InternalUseCaseDslParser.g:293:4: (lv_startFrom_0_0= RULE_INT )
            {
            // InternalUseCaseDslParser.g:293:4: (lv_startFrom_0_0= RULE_INT )
            // InternalUseCaseDslParser.g:294:5: lv_startFrom_0_0= RULE_INT
            {
            lv_startFrom_0_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            otherlv_1=(Token)match(input,FullStop,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getExtensionAccess().getFullStopKeyword_1());
            		
            // InternalUseCaseDslParser.g:314:3: ( (lv_name_2_0= RULE_CHAR ) )
            // InternalUseCaseDslParser.g:315:4: (lv_name_2_0= RULE_CHAR )
            {
            // InternalUseCaseDslParser.g:315:4: (lv_name_2_0= RULE_CHAR )
            // InternalUseCaseDslParser.g:316:5: lv_name_2_0= RULE_CHAR
            {
            lv_name_2_0=(Token)match(input,RULE_CHAR,FOLLOW_14); 

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

            otherlv_3=(Token)match(input,FullStop,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getExtensionAccess().getFullStopKeyword_3());
            		
            otherlv_4=(Token)match(input,IF,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getIFKeyword_4());
            		
            // InternalUseCaseDslParser.g:340:3: ( (lv_condition_5_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:341:4: (lv_condition_5_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:341:4: (lv_condition_5_0= ruleCondition )
            // InternalUseCaseDslParser.g:342:5: lv_condition_5_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getExtensionAccess().getConditionConditionParserRuleCall_5_0());
            				
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

            			newLeafNode(this_BEGIN_6, grammarAccess.getExtensionAccess().getBEGINTerminalRuleCall_6());
            		
            // InternalUseCaseDslParser.g:363:3: ( (lv_steps_7_0= ruleExtensionStep ) )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:364:4: (lv_steps_7_0= ruleExtensionStep )
            	    {
            	    // InternalUseCaseDslParser.g:364:4: (lv_steps_7_0= ruleExtensionStep )
            	    // InternalUseCaseDslParser.g:365:5: lv_steps_7_0= ruleExtensionStep
            	    {

            	    					newCompositeNode(grammarAccess.getExtensionAccess().getStepsExtensionStepParserRuleCall_7_0());
            	    				
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
            	    break loop7;
                }
            } while (true);

            // InternalUseCaseDslParser.g:382:3: ( (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) ) | ( (lv_end_13_0= ruleDeadEndStep ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==FullStop) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==RETURN) ) {
                        alt8=1;
                    }
                    else if ( ((LA8_2>=SYSTEM && LA8_2<=WHILE)||LA8_2==USER||(LA8_2>=UC && LA8_2<=RULE_CHAR)||LA8_2==RULE_ID||LA8_2==RULE_ANY_OTHER) ) {
                        alt8=2;
                    }
                    else {
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
                    // InternalUseCaseDslParser.g:383:4: (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) )
                    {
                    // InternalUseCaseDslParser.g:383:4: (this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) ) )
                    // InternalUseCaseDslParser.g:384:5: this_INT_8= RULE_INT otherlv_9= FullStop otherlv_10= RETURN otherlv_11= TO ( (lv_resumeAt_12_0= RULE_INT ) )
                    {
                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_14); 

                    					newLeafNode(this_INT_8, grammarAccess.getExtensionAccess().getINTTerminalRuleCall_8_0_0());
                    				
                    otherlv_9=(Token)match(input,FullStop,FOLLOW_18); 

                    					newLeafNode(otherlv_9, grammarAccess.getExtensionAccess().getFullStopKeyword_8_0_1());
                    				
                    otherlv_10=(Token)match(input,RETURN,FOLLOW_19); 

                    					newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getRETURNKeyword_8_0_2());
                    				
                    otherlv_11=(Token)match(input,TO,FOLLOW_4); 

                    					newLeafNode(otherlv_11, grammarAccess.getExtensionAccess().getTOKeyword_8_0_3());
                    				
                    // InternalUseCaseDslParser.g:400:5: ( (lv_resumeAt_12_0= RULE_INT ) )
                    // InternalUseCaseDslParser.g:401:6: (lv_resumeAt_12_0= RULE_INT )
                    {
                    // InternalUseCaseDslParser.g:401:6: (lv_resumeAt_12_0= RULE_INT )
                    // InternalUseCaseDslParser.g:402:7: lv_resumeAt_12_0= RULE_INT
                    {
                    lv_resumeAt_12_0=(Token)match(input,RULE_INT,FOLLOW_20); 

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
                    // InternalUseCaseDslParser.g:420:4: ( (lv_end_13_0= ruleDeadEndStep ) )
                    {
                    // InternalUseCaseDslParser.g:420:4: ( (lv_end_13_0= ruleDeadEndStep ) )
                    // InternalUseCaseDslParser.g:421:5: (lv_end_13_0= ruleDeadEndStep )
                    {
                    // InternalUseCaseDslParser.g:421:5: (lv_end_13_0= ruleDeadEndStep )
                    // InternalUseCaseDslParser.g:422:6: lv_end_13_0= ruleDeadEndStep
                    {

                    						newCompositeNode(grammarAccess.getExtensionAccess().getEndDeadEndStepParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_20);
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
    // InternalUseCaseDslParser.g:448:1: entryRuleUseCaseStep returns [EObject current=null] : iv_ruleUseCaseStep= ruleUseCaseStep EOF ;
    public final EObject entryRuleUseCaseStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseStep = null;


        try {
            // InternalUseCaseDslParser.g:448:52: (iv_ruleUseCaseStep= ruleUseCaseStep EOF )
            // InternalUseCaseDslParser.g:449:2: iv_ruleUseCaseStep= ruleUseCaseStep EOF
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
    // InternalUseCaseDslParser.g:455:1: ruleUseCaseStep returns [EObject current=null] : ( ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) ) | ( () ( (lv_name_11_0= RULE_INT ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) this_BEGIN_15= RULE_BEGIN ( ( (lv_parent_16_0= RULE_INT ) ) otherlv_17= FullStop ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+ this_END_19= RULE_END ) ) ;
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
        Token this_BEGIN_15=null;
        Token lv_parent_16_0=null;
        Token otherlv_17=null;
        Token this_END_19=null;
        AntlrDatatypeRuleToken lv_sentence_4_0 = null;

        AntlrDatatypeRuleToken lv_sentence_9_0 = null;

        AntlrDatatypeRuleToken lv_repeatingCondition_14_0 = null;

        EObject lv_repeatflow_18_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:461:2: ( ( ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) ) | ( () ( (lv_name_11_0= RULE_INT ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) this_BEGIN_15= RULE_BEGIN ( ( (lv_parent_16_0= RULE_INT ) ) otherlv_17= FullStop ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+ this_END_19= RULE_END ) ) )
            // InternalUseCaseDslParser.g:462:2: ( ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) ) | ( () ( (lv_name_11_0= RULE_INT ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) this_BEGIN_15= RULE_BEGIN ( ( (lv_parent_16_0= RULE_INT ) ) otherlv_17= FullStop ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+ this_END_19= RULE_END ) )
            {
            // InternalUseCaseDslParser.g:462:2: ( ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) ) | ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) ) | ( () ( (lv_name_11_0= RULE_INT ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) this_BEGIN_15= RULE_BEGIN ( ( (lv_parent_16_0= RULE_INT ) ) otherlv_17= FullStop ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+ this_END_19= RULE_END ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==FullStop) ) {
                    switch ( input.LA(3) ) {
                    case SYSTEM:
                        {
                        alt10=2;
                        }
                        break;
                    case USER:
                        {
                        alt10=1;
                        }
                        break;
                    case WHILE:
                        {
                        alt10=3;
                        }
                        break;
                    default:
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
                    // InternalUseCaseDslParser.g:463:3: ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:463:3: ( () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:464:4: () ( (lv_name_1_0= RULE_INT ) ) otherlv_2= FullStop otherlv_3= USER ( (lv_sentence_4_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:464:4: ()
                    // InternalUseCaseDslParser.g:465:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getUserStepAction_0_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:471:4: ( (lv_name_1_0= RULE_INT ) )
                    // InternalUseCaseDslParser.g:472:5: (lv_name_1_0= RULE_INT )
                    {
                    // InternalUseCaseDslParser.g:472:5: (lv_name_1_0= RULE_INT )
                    // InternalUseCaseDslParser.g:473:6: lv_name_1_0= RULE_INT
                    {
                    lv_name_1_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

                    otherlv_2=(Token)match(input,FullStop,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,USER,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getUseCaseStepAccess().getUSERKeyword_0_3());
                    			
                    // InternalUseCaseDslParser.g:497:4: ( (lv_sentence_4_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:498:5: (lv_sentence_4_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:498:5: (lv_sentence_4_0= ruleLongName )
                    // InternalUseCaseDslParser.g:499:6: lv_sentence_4_0= ruleLongName
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
                    // InternalUseCaseDslParser.g:518:3: ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:518:3: ( () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:519:4: () ( (lv_name_6_0= RULE_INT ) ) otherlv_7= FullStop otherlv_8= SYSTEM ( (lv_sentence_9_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:519:4: ()
                    // InternalUseCaseDslParser.g:520:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getSystemStepAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:526:4: ( (lv_name_6_0= RULE_INT ) )
                    // InternalUseCaseDslParser.g:527:5: (lv_name_6_0= RULE_INT )
                    {
                    // InternalUseCaseDslParser.g:527:5: (lv_name_6_0= RULE_INT )
                    // InternalUseCaseDslParser.g:528:6: lv_name_6_0= RULE_INT
                    {
                    lv_name_6_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

                    otherlv_7=(Token)match(input,FullStop,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_1_2());
                    			
                    otherlv_8=(Token)match(input,SYSTEM,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getUseCaseStepAccess().getSYSTEMKeyword_1_3());
                    			
                    // InternalUseCaseDslParser.g:552:4: ( (lv_sentence_9_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:553:5: (lv_sentence_9_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:553:5: (lv_sentence_9_0= ruleLongName )
                    // InternalUseCaseDslParser.g:554:6: lv_sentence_9_0= ruleLongName
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
                    // InternalUseCaseDslParser.g:573:3: ( () ( (lv_name_11_0= RULE_INT ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) this_BEGIN_15= RULE_BEGIN ( ( (lv_parent_16_0= RULE_INT ) ) otherlv_17= FullStop ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+ this_END_19= RULE_END )
                    {
                    // InternalUseCaseDslParser.g:573:3: ( () ( (lv_name_11_0= RULE_INT ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) this_BEGIN_15= RULE_BEGIN ( ( (lv_parent_16_0= RULE_INT ) ) otherlv_17= FullStop ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+ this_END_19= RULE_END )
                    // InternalUseCaseDslParser.g:574:4: () ( (lv_name_11_0= RULE_INT ) ) otherlv_12= FullStop otherlv_13= WHILE ( (lv_repeatingCondition_14_0= ruleCondition ) ) this_BEGIN_15= RULE_BEGIN ( ( (lv_parent_16_0= RULE_INT ) ) otherlv_17= FullStop ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+ this_END_19= RULE_END
                    {
                    // InternalUseCaseDslParser.g:574:4: ()
                    // InternalUseCaseDslParser.g:575:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getRepeatingStepAction_2_0(),
                    						current);
                    				

                    }

                    // InternalUseCaseDslParser.g:581:4: ( (lv_name_11_0= RULE_INT ) )
                    // InternalUseCaseDslParser.g:582:5: (lv_name_11_0= RULE_INT )
                    {
                    // InternalUseCaseDslParser.g:582:5: (lv_name_11_0= RULE_INT )
                    // InternalUseCaseDslParser.g:583:6: lv_name_11_0= RULE_INT
                    {
                    lv_name_11_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

                    otherlv_12=(Token)match(input,FullStop,FOLLOW_23); 

                    				newLeafNode(otherlv_12, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_2());
                    			
                    otherlv_13=(Token)match(input,WHILE,FOLLOW_17); 

                    				newLeafNode(otherlv_13, grammarAccess.getUseCaseStepAccess().getWHILEKeyword_2_3());
                    			
                    // InternalUseCaseDslParser.g:607:4: ( (lv_repeatingCondition_14_0= ruleCondition ) )
                    // InternalUseCaseDslParser.g:608:5: (lv_repeatingCondition_14_0= ruleCondition )
                    {
                    // InternalUseCaseDslParser.g:608:5: (lv_repeatingCondition_14_0= ruleCondition )
                    // InternalUseCaseDslParser.g:609:6: lv_repeatingCondition_14_0= ruleCondition
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
                    			
                    // InternalUseCaseDslParser.g:630:4: ( ( (lv_parent_16_0= RULE_INT ) ) otherlv_17= FullStop ( (lv_repeatflow_18_0= ruleUseCaseStep ) ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_INT) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalUseCaseDslParser.g:631:5: ( (lv_parent_16_0= RULE_INT ) ) otherlv_17= FullStop ( (lv_repeatflow_18_0= ruleUseCaseStep ) )
                    	    {
                    	    // InternalUseCaseDslParser.g:631:5: ( (lv_parent_16_0= RULE_INT ) )
                    	    // InternalUseCaseDslParser.g:632:6: (lv_parent_16_0= RULE_INT )
                    	    {
                    	    // InternalUseCaseDslParser.g:632:6: (lv_parent_16_0= RULE_INT )
                    	    // InternalUseCaseDslParser.g:633:7: lv_parent_16_0= RULE_INT
                    	    {
                    	    lv_parent_16_0=(Token)match(input,RULE_INT,FOLLOW_14); 

                    	    							newLeafNode(lv_parent_16_0, grammarAccess.getUseCaseStepAccess().getParentINTTerminalRuleCall_2_6_0_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getUseCaseStepRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"parent",
                    	    								lv_parent_16_0,
                    	    								"org.eclipse.xtext.common.Terminals.INT");
                    	    						

                    	    }


                    	    }

                    	    otherlv_17=(Token)match(input,FullStop,FOLLOW_4); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_6_1());
                    	    				
                    	    // InternalUseCaseDslParser.g:653:5: ( (lv_repeatflow_18_0= ruleUseCaseStep ) )
                    	    // InternalUseCaseDslParser.g:654:6: (lv_repeatflow_18_0= ruleUseCaseStep )
                    	    {
                    	    // InternalUseCaseDslParser.g:654:6: (lv_repeatflow_18_0= ruleUseCaseStep )
                    	    // InternalUseCaseDslParser.g:655:7: lv_repeatflow_18_0= ruleUseCaseStep
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseCaseStepAccess().getRepeatflowUseCaseStepParserRuleCall_2_6_2_0());
                    	    						
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
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
    // InternalUseCaseDslParser.g:682:1: entryRuleExtensionStep returns [EObject current=null] : iv_ruleExtensionStep= ruleExtensionStep EOF ;
    public final EObject entryRuleExtensionStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionStep = null;


        try {
            // InternalUseCaseDslParser.g:682:54: (iv_ruleExtensionStep= ruleExtensionStep EOF )
            // InternalUseCaseDslParser.g:683:2: iv_ruleExtensionStep= ruleExtensionStep EOF
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
    // InternalUseCaseDslParser.g:689:1: ruleExtensionStep returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep ) ;
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
            // InternalUseCaseDslParser.g:695:2: ( ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep ) )
            // InternalUseCaseDslParser.g:696:2: ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep )
            {
            // InternalUseCaseDslParser.g:696:2: ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalUseCaseDslParser.g:697:3: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) )
                    {
                    // InternalUseCaseDslParser.g:697:3: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) )
                    // InternalUseCaseDslParser.g:698:4: ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )
                    {
                    // InternalUseCaseDslParser.g:698:4: ( (lv_name_0_0= RULE_INT ) )
                    // InternalUseCaseDslParser.g:699:5: (lv_name_0_0= RULE_INT )
                    {
                    // InternalUseCaseDslParser.g:699:5: (lv_name_0_0= RULE_INT )
                    // InternalUseCaseDslParser.g:700:6: lv_name_0_0= RULE_INT
                    {
                    lv_name_0_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

                    otherlv_1=(Token)match(input,FullStop,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getExtensionStepAccess().getFullStopKeyword_0_1());
                    			
                    // InternalUseCaseDslParser.g:720:4: (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )?
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
                            // InternalUseCaseDslParser.g:721:5: otherlv_2= USER
                            {
                            otherlv_2=(Token)match(input,USER,FOLLOW_6); 

                            					newLeafNode(otherlv_2, grammarAccess.getExtensionStepAccess().getUSERKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUseCaseDslParser.g:726:5: otherlv_3= SYSTEM
                            {
                            otherlv_3=(Token)match(input,SYSTEM,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_0_2_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalUseCaseDslParser.g:731:5: otherlv_4= WHILE
                            {
                            otherlv_4=(Token)match(input,WHILE,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getExtensionStepAccess().getWHILEKeyword_0_2_2());
                            				

                            }
                            break;

                    }

                    // InternalUseCaseDslParser.g:736:4: ( (lv_sentence_5_0= ruleLongName ) )
                    // InternalUseCaseDslParser.g:737:5: (lv_sentence_5_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:737:5: (lv_sentence_5_0= ruleLongName )
                    // InternalUseCaseDslParser.g:738:6: lv_sentence_5_0= ruleLongName
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
                    // InternalUseCaseDslParser.g:757:3: this_DeadEndStep_6= ruleDeadEndStep
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
    // InternalUseCaseDslParser.g:769:1: entryRuleDeadEndStep returns [EObject current=null] : iv_ruleDeadEndStep= ruleDeadEndStep EOF ;
    public final EObject entryRuleDeadEndStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeadEndStep = null;


        try {
            // InternalUseCaseDslParser.g:769:52: (iv_ruleDeadEndStep= ruleDeadEndStep EOF )
            // InternalUseCaseDslParser.g:770:2: iv_ruleDeadEndStep= ruleDeadEndStep EOF
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
    // InternalUseCaseDslParser.g:776:1: ruleDeadEndStep returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END ) ;
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
            // InternalUseCaseDslParser.g:782:2: ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END ) )
            // InternalUseCaseDslParser.g:783:2: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END )
            {
            // InternalUseCaseDslParser.g:783:2: ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END )
            // InternalUseCaseDslParser.g:784:3: ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END
            {
            // InternalUseCaseDslParser.g:784:3: ( (lv_name_0_0= RULE_INT ) )
            // InternalUseCaseDslParser.g:785:4: (lv_name_0_0= RULE_INT )
            {
            // InternalUseCaseDslParser.g:785:4: (lv_name_0_0= RULE_INT )
            // InternalUseCaseDslParser.g:786:5: lv_name_0_0= RULE_INT
            {
            lv_name_0_0=(Token)match(input,RULE_INT,FOLLOW_14); 

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

            otherlv_1=(Token)match(input,FullStop,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getDeadEndStepAccess().getFullStopKeyword_1());
            		
            // InternalUseCaseDslParser.g:806:3: (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )?
            int alt13=4;
            switch ( input.LA(1) ) {
                case USER:
                    {
                    alt13=1;
                    }
                    break;
                case SYSTEM:
                    {
                    alt13=2;
                    }
                    break;
                case WHILE:
                    {
                    alt13=3;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // InternalUseCaseDslParser.g:807:4: otherlv_2= USER
                    {
                    otherlv_2=(Token)match(input,USER,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUseCaseDslParser.g:812:4: otherlv_3= SYSTEM
                    {
                    otherlv_3=(Token)match(input,SYSTEM,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUseCaseDslParser.g:817:4: otherlv_4= WHILE
                    {
                    otherlv_4=(Token)match(input,WHILE,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeadEndStepAccess().getWHILEKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalUseCaseDslParser.g:822:3: ( (lv_sentence_5_0= ruleLongName ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=QuotationMark && LA14_0<=RULE_CHAR)||LA14_0==RULE_ID||LA14_0==RULE_ANY_OTHER) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUseCaseDslParser.g:823:4: (lv_sentence_5_0= ruleLongName )
                    {
                    // InternalUseCaseDslParser.g:823:4: (lv_sentence_5_0= ruleLongName )
                    // InternalUseCaseDslParser.g:824:5: lv_sentence_5_0= ruleLongName
                    {

                    					newCompositeNode(grammarAccess.getDeadEndStepAccess().getSentenceLongNameParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_27);
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

            otherlv_6=(Token)match(input,UC,FOLLOW_28); 

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
    // InternalUseCaseDslParser.g:853:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalUseCaseDslParser.g:853:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalUseCaseDslParser.g:854:2: iv_rulePrecondition= rulePrecondition EOF
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
    // InternalUseCaseDslParser.g:860:1: rulePrecondition returns [EObject current=null] : ( ( (lv_name_0_0= PRECONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:866:2: ( ( ( (lv_name_0_0= PRECONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalUseCaseDslParser.g:867:2: ( ( (lv_name_0_0= PRECONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalUseCaseDslParser.g:867:2: ( ( (lv_name_0_0= PRECONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalUseCaseDslParser.g:868:3: ( (lv_name_0_0= PRECONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) )
            {
            // InternalUseCaseDslParser.g:868:3: ( (lv_name_0_0= PRECONDITION ) )
            // InternalUseCaseDslParser.g:869:4: (lv_name_0_0= PRECONDITION )
            {
            // InternalUseCaseDslParser.g:869:4: (lv_name_0_0= PRECONDITION )
            // InternalUseCaseDslParser.g:870:5: lv_name_0_0= PRECONDITION
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
            		
            // InternalUseCaseDslParser.g:886:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:887:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:887:4: (lv_condition_2_0= ruleCondition )
            // InternalUseCaseDslParser.g:888:5: lv_condition_2_0= ruleCondition
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
    // InternalUseCaseDslParser.g:909:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalUseCaseDslParser.g:909:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalUseCaseDslParser.g:910:2: iv_rulePostcondition= rulePostcondition EOF
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
    // InternalUseCaseDslParser.g:916:1: rulePostcondition returns [EObject current=null] : ( ( (lv_name_0_0= POSTCONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalUseCaseDslParser.g:922:2: ( ( ( (lv_name_0_0= POSTCONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalUseCaseDslParser.g:923:2: ( ( (lv_name_0_0= POSTCONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalUseCaseDslParser.g:923:2: ( ( (lv_name_0_0= POSTCONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalUseCaseDslParser.g:924:3: ( (lv_name_0_0= POSTCONDITION ) ) otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) )
            {
            // InternalUseCaseDslParser.g:924:3: ( (lv_name_0_0= POSTCONDITION ) )
            // InternalUseCaseDslParser.g:925:4: (lv_name_0_0= POSTCONDITION )
            {
            // InternalUseCaseDslParser.g:925:4: (lv_name_0_0= POSTCONDITION )
            // InternalUseCaseDslParser.g:926:5: lv_name_0_0= POSTCONDITION
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
            		
            // InternalUseCaseDslParser.g:942:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalUseCaseDslParser.g:943:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalUseCaseDslParser.g:943:4: (lv_condition_2_0= ruleCondition )
            // InternalUseCaseDslParser.g:944:5: lv_condition_2_0= ruleCondition
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
    // InternalUseCaseDslParser.g:965:1: entryRuleLongName returns [String current=null] : iv_ruleLongName= ruleLongName EOF ;
    public final String entryRuleLongName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLongName = null;


        try {
            // InternalUseCaseDslParser.g:965:48: (iv_ruleLongName= ruleLongName EOF )
            // InternalUseCaseDslParser.g:966:2: iv_ruleLongName= ruleLongName EOF
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
    // InternalUseCaseDslParser.g:972:1: ruleLongName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ ;
    public final AntlrDatatypeRuleToken ruleLongName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_CHAR_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:978:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ )
            // InternalUseCaseDslParser.g:979:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
            {
            // InternalUseCaseDslParser.g:979:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
            int cnt15=0;
            loop15:
            do {
                int alt15=8;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt15=1;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt15=2;
                    }
                    break;
                case RULE_CHAR:
                    {
                    alt15=3;
                    }
                    break;
                case Colon:
                    {
                    alt15=4;
                    }
                    break;
                case FullStop:
                    {
                    alt15=5;
                    }
                    break;
                case QuotationMark:
                    {
                    alt15=6;
                    }
                    break;
                case Apostrophe:
                    {
                    alt15=7;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:980:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUseCaseDslParser.g:988:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_29); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUseCaseDslParser.g:996:3: this_CHAR_2= RULE_CHAR
            	    {
            	    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_29); 

            	    			current.merge(this_CHAR_2);
            	    		

            	    			newLeafNode(this_CHAR_2, grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUseCaseDslParser.g:1004:3: kw= Colon
            	    {
            	    kw=(Token)match(input,Colon,FOLLOW_29); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getColonKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUseCaseDslParser.g:1010:3: kw= FullStop
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_29); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUseCaseDslParser.g:1016:3: kw= QuotationMark
            	    {
            	    kw=(Token)match(input,QuotationMark,FOLLOW_29); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalUseCaseDslParser.g:1022:3: kw= Apostrophe
            	    {
            	    kw=(Token)match(input,Apostrophe,FOLLOW_29); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getApostropheKeyword_6());
            	    		

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
    // InternalUseCaseDslParser.g:1031:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalUseCaseDslParser.g:1031:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalUseCaseDslParser.g:1032:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalUseCaseDslParser.g:1038:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+ ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_CHAR_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUseCaseDslParser.g:1044:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+ )
            // InternalUseCaseDslParser.g:1045:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+
            {
            // InternalUseCaseDslParser.g:1045:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+
            int cnt16=0;
            loop16:
            do {
                int alt16=10;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt16=1;
                    }
                    break;
                case RULE_ANY_OTHER:
                    {
                    alt16=2;
                    }
                    break;
                case RULE_CHAR:
                    {
                    alt16=3;
                    }
                    break;
                case Colon:
                    {
                    alt16=4;
                    }
                    break;
                case FullStop:
                    {
                    alt16=5;
                    }
                    break;
                case QuotationMark:
                    {
                    alt16=6;
                    }
                    break;
                case Apostrophe:
                    {
                    alt16=7;
                    }
                    break;
                case AND:
                    {
                    alt16=8;
                    }
                    break;
                case OR:
                    {
                    alt16=9;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalUseCaseDslParser.g:1046:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getConditionAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUseCaseDslParser.g:1054:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_30); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUseCaseDslParser.g:1062:3: this_CHAR_2= RULE_CHAR
            	    {
            	    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_30); 

            	    			current.merge(this_CHAR_2);
            	    		

            	    			newLeafNode(this_CHAR_2, grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUseCaseDslParser.g:1070:3: kw= Colon
            	    {
            	    kw=(Token)match(input,Colon,FOLLOW_30); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getColonKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUseCaseDslParser.g:1076:3: kw= FullStop
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_30); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUseCaseDslParser.g:1082:3: kw= QuotationMark
            	    {
            	    kw=(Token)match(input,QuotationMark,FOLLOW_30); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getQuotationMarkKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalUseCaseDslParser.g:1088:3: kw= Apostrophe
            	    {
            	    kw=(Token)match(input,Apostrophe,FOLLOW_30); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getApostropheKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalUseCaseDslParser.g:1094:3: kw= AND
            	    {
            	    kw=(Token)match(input,AND,FOLLOW_30); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getANDKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalUseCaseDslParser.g:1100:3: kw= OR
            	    {
            	    kw=(Token)match(input,OR,FOLLOW_30); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getORKeyword_8());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA12 dfa12 = new DFA12(this);
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "696:2: ( ( ( (lv_name_0_0= RULE_INT ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) ) ) | this_DeadEndStep_6= ruleDeadEndStep )";
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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000104F92000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000104F81300L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000104FC1300L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000104FC0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000104F80002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000104F92002L});

}