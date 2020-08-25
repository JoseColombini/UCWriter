package ucwriter.xtext.guimeta.ucdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ucwriter.xtext.guimeta.ucdsl.services.UCdslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUCdslParser extends AbstractInternalAntlrParser {
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


        public InternalUCdslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUCdslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUCdslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUCdslParser.g"; }



     	private UCdslGrammarAccess grammarAccess;

        public InternalUCdslParser(TokenStream input, UCdslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UseCaseDocument";
       	}

       	@Override
       	protected UCdslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUseCaseDocument"
    // InternalUCdslParser.g:57:1: entryRuleUseCaseDocument returns [EObject current=null] : iv_ruleUseCaseDocument= ruleUseCaseDocument EOF ;
    public final EObject entryRuleUseCaseDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseDocument = null;


        try {
            // InternalUCdslParser.g:57:56: (iv_ruleUseCaseDocument= ruleUseCaseDocument EOF )
            // InternalUCdslParser.g:58:2: iv_ruleUseCaseDocument= ruleUseCaseDocument EOF
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
    // InternalUCdslParser.g:64:1: ruleUseCaseDocument returns [EObject current=null] : ( (lv_usecase_0_0= ruleUseCase ) )+ ;
    public final EObject ruleUseCaseDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_usecase_0_0 = null;



        	enterRule();

        try {
            // InternalUCdslParser.g:70:2: ( ( (lv_usecase_0_0= ruleUseCase ) )+ )
            // InternalUCdslParser.g:71:2: ( (lv_usecase_0_0= ruleUseCase ) )+
            {
            // InternalUCdslParser.g:71:2: ( (lv_usecase_0_0= ruleUseCase ) )+
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
            	    // InternalUCdslParser.g:72:3: (lv_usecase_0_0= ruleUseCase )
            	    {
            	    // InternalUCdslParser.g:72:3: (lv_usecase_0_0= ruleUseCase )
            	    // InternalUCdslParser.g:73:4: lv_usecase_0_0= ruleUseCase
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
            	    					"ucwriter.xtext.guimeta.ucdsl.UCdsl.UseCase");
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
    // InternalUCdslParser.g:93:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // InternalUCdslParser.g:93:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUCdslParser.g:94:2: iv_ruleUseCase= ruleUseCase EOF
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
    // InternalUCdslParser.g:100:1: ruleUseCase returns [EObject current=null] : (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_postcondition_5_0= rulePostcondition ) )? otherlv_6= MAIN otherlv_7= FLOW otherlv_8= Colon this_BEGIN_9= RULE_BEGIN ( (lv_steps_10_0= ruleUseCaseStep ) )+ this_END_11= RULE_END ( (otherlv_12= ALTERNATIVE otherlv_13= FLOW ) otherlv_14= Colon this_BEGIN_15= RULE_BEGIN ( (lv_alternativeflows_16_0= ruleExtension ) )+ this_END_17= RULE_END )? ) ;
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
            // InternalUCdslParser.g:106:2: ( (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_postcondition_5_0= rulePostcondition ) )? otherlv_6= MAIN otherlv_7= FLOW otherlv_8= Colon this_BEGIN_9= RULE_BEGIN ( (lv_steps_10_0= ruleUseCaseStep ) )+ this_END_11= RULE_END ( (otherlv_12= ALTERNATIVE otherlv_13= FLOW ) otherlv_14= Colon this_BEGIN_15= RULE_BEGIN ( (lv_alternativeflows_16_0= ruleExtension ) )+ this_END_17= RULE_END )? ) )
            // InternalUCdslParser.g:107:2: (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_postcondition_5_0= rulePostcondition ) )? otherlv_6= MAIN otherlv_7= FLOW otherlv_8= Colon this_BEGIN_9= RULE_BEGIN ( (lv_steps_10_0= ruleUseCaseStep ) )+ this_END_11= RULE_END ( (otherlv_12= ALTERNATIVE otherlv_13= FLOW ) otherlv_14= Colon this_BEGIN_15= RULE_BEGIN ( (lv_alternativeflows_16_0= ruleExtension ) )+ this_END_17= RULE_END )? )
            {
            // InternalUCdslParser.g:107:2: (otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_postcondition_5_0= rulePostcondition ) )? otherlv_6= MAIN otherlv_7= FLOW otherlv_8= Colon this_BEGIN_9= RULE_BEGIN ( (lv_steps_10_0= ruleUseCaseStep ) )+ this_END_11= RULE_END ( (otherlv_12= ALTERNATIVE otherlv_13= FLOW ) otherlv_14= Colon this_BEGIN_15= RULE_BEGIN ( (lv_alternativeflows_16_0= ruleExtension ) )+ this_END_17= RULE_END )? )
            // InternalUCdslParser.g:108:3: otherlv_0= UC ( (lv_number_1_0= RULE_INT ) ) otherlv_2= Colon ( (lv_name_3_0= ruleLongName ) ) ( (lv_precondition_4_0= rulePrecondition ) )? ( (lv_postcondition_5_0= rulePostcondition ) )? otherlv_6= MAIN otherlv_7= FLOW otherlv_8= Colon this_BEGIN_9= RULE_BEGIN ( (lv_steps_10_0= ruleUseCaseStep ) )+ this_END_11= RULE_END ( (otherlv_12= ALTERNATIVE otherlv_13= FLOW ) otherlv_14= Colon this_BEGIN_15= RULE_BEGIN ( (lv_alternativeflows_16_0= ruleExtension ) )+ this_END_17= RULE_END )?
            {
            otherlv_0=(Token)match(input,UC,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUCKeyword_0());
            		
            // InternalUCdslParser.g:112:3: ( (lv_number_1_0= RULE_INT ) )
            // InternalUCdslParser.g:113:4: (lv_number_1_0= RULE_INT )
            {
            // InternalUCdslParser.g:113:4: (lv_number_1_0= RULE_INT )
            // InternalUCdslParser.g:114:5: lv_number_1_0= RULE_INT
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
            		
            // InternalUCdslParser.g:134:3: ( (lv_name_3_0= ruleLongName ) )
            // InternalUCdslParser.g:135:4: (lv_name_3_0= ruleLongName )
            {
            // InternalUCdslParser.g:135:4: (lv_name_3_0= ruleLongName )
            // InternalUCdslParser.g:136:5: lv_name_3_0= ruleLongName
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
            						"ucwriter.xtext.guimeta.ucdsl.UCdsl.LongName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUCdslParser.g:153:3: ( (lv_precondition_4_0= rulePrecondition ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==PRECONDITION) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalUCdslParser.g:154:4: (lv_precondition_4_0= rulePrecondition )
                    {
                    // InternalUCdslParser.g:154:4: (lv_precondition_4_0= rulePrecondition )
                    // InternalUCdslParser.g:155:5: lv_precondition_4_0= rulePrecondition
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
                    						"ucwriter.xtext.guimeta.ucdsl.UCdsl.Precondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUCdslParser.g:172:3: ( (lv_postcondition_5_0= rulePostcondition ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==POSTCONDITION) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUCdslParser.g:173:4: (lv_postcondition_5_0= rulePostcondition )
                    {
                    // InternalUCdslParser.g:173:4: (lv_postcondition_5_0= rulePostcondition )
                    // InternalUCdslParser.g:174:5: lv_postcondition_5_0= rulePostcondition
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
                    						"ucwriter.xtext.guimeta.ucdsl.UCdsl.Postcondition");
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
            		
            // InternalUCdslParser.g:207:3: ( (lv_steps_10_0= ruleUseCaseStep ) )+
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
            	    // InternalUCdslParser.g:208:4: (lv_steps_10_0= ruleUseCaseStep )
            	    {
            	    // InternalUCdslParser.g:208:4: (lv_steps_10_0= ruleUseCaseStep )
            	    // InternalUCdslParser.g:209:5: lv_steps_10_0= ruleUseCaseStep
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
            	    						"ucwriter.xtext.guimeta.ucdsl.UCdsl.UseCaseStep");
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
            		
            // InternalUCdslParser.g:230:3: ( (otherlv_12= ALTERNATIVE otherlv_13= FLOW ) otherlv_14= Colon this_BEGIN_15= RULE_BEGIN ( (lv_alternativeflows_16_0= ruleExtension ) )+ this_END_17= RULE_END )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ALTERNATIVE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUCdslParser.g:231:4: (otherlv_12= ALTERNATIVE otherlv_13= FLOW ) otherlv_14= Colon this_BEGIN_15= RULE_BEGIN ( (lv_alternativeflows_16_0= ruleExtension ) )+ this_END_17= RULE_END
                    {
                    // InternalUCdslParser.g:231:4: (otherlv_12= ALTERNATIVE otherlv_13= FLOW )
                    // InternalUCdslParser.g:232:5: otherlv_12= ALTERNATIVE otherlv_13= FLOW
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
                    			
                    // InternalUCdslParser.g:249:4: ( (lv_alternativeflows_16_0= ruleExtension ) )+
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
                    	    // InternalUCdslParser.g:250:5: (lv_alternativeflows_16_0= ruleExtension )
                    	    {
                    	    // InternalUCdslParser.g:250:5: (lv_alternativeflows_16_0= ruleExtension )
                    	    // InternalUCdslParser.g:251:6: lv_alternativeflows_16_0= ruleExtension
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
                    	    							"ucwriter.xtext.guimeta.ucdsl.UCdsl.Extension");
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
    // InternalUCdslParser.g:277:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // InternalUCdslParser.g:277:50: (iv_ruleExtension= ruleExtension EOF )
            // InternalUCdslParser.g:278:2: iv_ruleExtension= ruleExtension EOF
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
    // InternalUCdslParser.g:284:1: ruleExtension returns [EObject current=null] : ( ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) otherlv_2= FullStop ( (lv_name_3_0= RULE_CHAR ) ) otherlv_4= FullStop otherlv_5= IF ( (lv_condition_6_0= ruleCondition ) ) this_BEGIN_7= RULE_BEGIN ( (lv_steps_8_0= ruleExtensionStep ) )* ( ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) ) | ( (lv_end_15_0= ruleDeadEndStep ) ) ) this_END_16= RULE_END ) ;
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
            // InternalUCdslParser.g:290:2: ( ( ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) otherlv_2= FullStop ( (lv_name_3_0= RULE_CHAR ) ) otherlv_4= FullStop otherlv_5= IF ( (lv_condition_6_0= ruleCondition ) ) this_BEGIN_7= RULE_BEGIN ( (lv_steps_8_0= ruleExtensionStep ) )* ( ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) ) | ( (lv_end_15_0= ruleDeadEndStep ) ) ) this_END_16= RULE_END ) )
            // InternalUCdslParser.g:291:2: ( ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) otherlv_2= FullStop ( (lv_name_3_0= RULE_CHAR ) ) otherlv_4= FullStop otherlv_5= IF ( (lv_condition_6_0= ruleCondition ) ) this_BEGIN_7= RULE_BEGIN ( (lv_steps_8_0= ruleExtensionStep ) )* ( ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) ) | ( (lv_end_15_0= ruleDeadEndStep ) ) ) this_END_16= RULE_END )
            {
            // InternalUCdslParser.g:291:2: ( ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) otherlv_2= FullStop ( (lv_name_3_0= RULE_CHAR ) ) otherlv_4= FullStop otherlv_5= IF ( (lv_condition_6_0= ruleCondition ) ) this_BEGIN_7= RULE_BEGIN ( (lv_steps_8_0= ruleExtensionStep ) )* ( ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) ) | ( (lv_end_15_0= ruleDeadEndStep ) ) ) this_END_16= RULE_END )
            // InternalUCdslParser.g:292:3: ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) otherlv_2= FullStop ( (lv_name_3_0= RULE_CHAR ) ) otherlv_4= FullStop otherlv_5= IF ( (lv_condition_6_0= ruleCondition ) ) this_BEGIN_7= RULE_BEGIN ( (lv_steps_8_0= ruleExtensionStep ) )* ( ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) ) | ( (lv_end_15_0= ruleDeadEndStep ) ) ) this_END_16= RULE_END
            {
            // InternalUCdslParser.g:292:3: ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalUCdslParser.g:293:4: ( ( ruleQualifiedStepName ) )
                    {
                    // InternalUCdslParser.g:293:4: ( ( ruleQualifiedStepName ) )
                    // InternalUCdslParser.g:294:5: ( ruleQualifiedStepName )
                    {
                    // InternalUCdslParser.g:294:5: ( ruleQualifiedStepName )
                    // InternalUCdslParser.g:295:6: ruleQualifiedStepName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtensionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExtensionAccess().getStartFromUseCaseStepCrossReference_0_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleQualifiedStepName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUCdslParser.g:310:4: ( ( ruleQualifiedExtensionStepName ) )
                    {
                    // InternalUCdslParser.g:310:4: ( ( ruleQualifiedExtensionStepName ) )
                    // InternalUCdslParser.g:311:5: ( ruleQualifiedExtensionStepName )
                    {
                    // InternalUCdslParser.g:311:5: ( ruleQualifiedExtensionStepName )
                    // InternalUCdslParser.g:312:6: ruleQualifiedExtensionStepName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtensionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExtensionAccess().getStartFromExtensionStepCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleQualifiedExtensionStepName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,FullStop,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getFullStopKeyword_1());
            		
            // InternalUCdslParser.g:331:3: ( (lv_name_3_0= RULE_CHAR ) )
            // InternalUCdslParser.g:332:4: (lv_name_3_0= RULE_CHAR )
            {
            // InternalUCdslParser.g:332:4: (lv_name_3_0= RULE_CHAR )
            // InternalUCdslParser.g:333:5: lv_name_3_0= RULE_CHAR
            {
            lv_name_3_0=(Token)match(input,RULE_CHAR,FOLLOW_14); 

            					newLeafNode(lv_name_3_0, grammarAccess.getExtensionAccess().getNameCHARTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtensionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"ucwriter.xtext.guimeta.ucdsl.UCdsl.CHAR");
            				

            }


            }

            otherlv_4=(Token)match(input,FullStop,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getExtensionAccess().getFullStopKeyword_3());
            		
            otherlv_5=(Token)match(input,IF,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getExtensionAccess().getIFKeyword_4());
            		
            // InternalUCdslParser.g:357:3: ( (lv_condition_6_0= ruleCondition ) )
            // InternalUCdslParser.g:358:4: (lv_condition_6_0= ruleCondition )
            {
            // InternalUCdslParser.g:358:4: (lv_condition_6_0= ruleCondition )
            // InternalUCdslParser.g:359:5: lv_condition_6_0= ruleCondition
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
            						"ucwriter.xtext.guimeta.ucdsl.UCdsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_4); 

            			newLeafNode(this_BEGIN_7, grammarAccess.getExtensionAccess().getBEGINTerminalRuleCall_6());
            		
            // InternalUCdslParser.g:380:3: ( (lv_steps_8_0= ruleExtensionStep ) )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalUCdslParser.g:381:4: (lv_steps_8_0= ruleExtensionStep )
            	    {
            	    // InternalUCdslParser.g:381:4: (lv_steps_8_0= ruleExtensionStep )
            	    // InternalUCdslParser.g:382:5: lv_steps_8_0= ruleExtensionStep
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
            	    						"ucwriter.xtext.guimeta.ucdsl.UCdsl.ExtensionStep");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalUCdslParser.g:399:3: ( ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) ) | ( (lv_end_15_0= ruleDeadEndStep ) ) )
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
                    // InternalUCdslParser.g:400:4: ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) )
                    {
                    // InternalUCdslParser.g:400:4: ( ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) ) )
                    // InternalUCdslParser.g:401:5: ruleStepName otherlv_10= FullStop otherlv_11= RETURN otherlv_12= TO ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) )
                    {

                    					newCompositeNode(grammarAccess.getExtensionAccess().getStepNameParserRuleCall_8_0_0());
                    				
                    pushFollow(FOLLOW_14);
                    ruleStepName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_10=(Token)match(input,FullStop,FOLLOW_18); 

                    					newLeafNode(otherlv_10, grammarAccess.getExtensionAccess().getFullStopKeyword_8_0_1());
                    				
                    otherlv_11=(Token)match(input,RETURN,FOLLOW_19); 

                    					newLeafNode(otherlv_11, grammarAccess.getExtensionAccess().getRETURNKeyword_8_0_2());
                    				
                    otherlv_12=(Token)match(input,TO,FOLLOW_4); 

                    					newLeafNode(otherlv_12, grammarAccess.getExtensionAccess().getTOKeyword_8_0_3());
                    				
                    // InternalUCdslParser.g:420:5: ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) )
                    int alt9=2;
                    alt9 = dfa9.predict(input);
                    switch (alt9) {
                        case 1 :
                            // InternalUCdslParser.g:421:6: ( ( ruleQualifiedStepName ) )
                            {
                            // InternalUCdslParser.g:421:6: ( ( ruleQualifiedStepName ) )
                            // InternalUCdslParser.g:422:7: ( ruleQualifiedStepName )
                            {
                            // InternalUCdslParser.g:422:7: ( ruleQualifiedStepName )
                            // InternalUCdslParser.g:423:8: ruleQualifiedStepName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getExtensionRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getExtensionAccess().getResumeAtUseCaseStepCrossReference_8_0_4_0_0());
                            							
                            pushFollow(FOLLOW_20);
                            ruleQualifiedStepName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalUCdslParser.g:438:6: ( ( ruleQualifiedExtensionStepName ) )
                            {
                            // InternalUCdslParser.g:438:6: ( ( ruleQualifiedExtensionStepName ) )
                            // InternalUCdslParser.g:439:7: ( ruleQualifiedExtensionStepName )
                            {
                            // InternalUCdslParser.g:439:7: ( ruleQualifiedExtensionStepName )
                            // InternalUCdslParser.g:440:8: ruleQualifiedExtensionStepName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getExtensionRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getExtensionAccess().getResumeAtExtensionStepCrossReference_8_0_4_1_0());
                            							
                            pushFollow(FOLLOW_20);
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
                    // InternalUCdslParser.g:457:4: ( (lv_end_15_0= ruleDeadEndStep ) )
                    {
                    // InternalUCdslParser.g:457:4: ( (lv_end_15_0= ruleDeadEndStep ) )
                    // InternalUCdslParser.g:458:5: (lv_end_15_0= ruleDeadEndStep )
                    {
                    // InternalUCdslParser.g:458:5: (lv_end_15_0= ruleDeadEndStep )
                    // InternalUCdslParser.g:459:6: lv_end_15_0= ruleDeadEndStep
                    {

                    						newCompositeNode(grammarAccess.getExtensionAccess().getEndDeadEndStepParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_end_15_0=ruleDeadEndStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtensionRule());
                    						}
                    						set(
                    							current,
                    							"end",
                    							lv_end_15_0,
                    							"ucwriter.xtext.guimeta.ucdsl.UCdsl.DeadEndStep");
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
    // InternalUCdslParser.g:485:1: entryRuleUseCaseStep returns [EObject current=null] : iv_ruleUseCaseStep= ruleUseCaseStep EOF ;
    public final EObject entryRuleUseCaseStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseStep = null;


        try {
            // InternalUCdslParser.g:485:52: (iv_ruleUseCaseStep= ruleUseCaseStep EOF )
            // InternalUCdslParser.g:486:2: iv_ruleUseCaseStep= ruleUseCaseStep EOF
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
    // InternalUCdslParser.g:492:1: ruleUseCaseStep returns [EObject current=null] : ( ( ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_steps_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END ) ) ;
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

        EObject lv_steps_28_0 = null;



        	enterRule();

        try {
            // InternalUCdslParser.g:498:2: ( ( ( ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_steps_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END ) ) )
            // InternalUCdslParser.g:499:2: ( ( ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_steps_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END ) )
            {
            // InternalUCdslParser.g:499:2: ( ( ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_steps_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END ) )
            int alt16=4;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalUCdslParser.g:500:3: ( ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) ) )
                    {
                    // InternalUCdslParser.g:500:3: ( ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) ) )
                    // InternalUCdslParser.g:501:4: ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) )
                    {
                    // InternalUCdslParser.g:501:4: ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )?
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
                            // InternalUCdslParser.g:502:5: ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop
                            {
                            // InternalUCdslParser.g:502:5: ( ( ruleQualifiedStepName ) )
                            // InternalUCdslParser.g:503:6: ( ruleQualifiedStepName )
                            {
                            // InternalUCdslParser.g:503:6: ( ruleQualifiedStepName )
                            // InternalUCdslParser.g:504:7: ruleQualifiedStepName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUseCaseStepRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_0_0_0_0());
                            						
                            pushFollow(FOLLOW_14);
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

                    // InternalUCdslParser.g:523:4: ( (lv_name_2_0= ruleStepName ) )
                    // InternalUCdslParser.g:524:5: (lv_name_2_0= ruleStepName )
                    {
                    // InternalUCdslParser.g:524:5: (lv_name_2_0= ruleStepName )
                    // InternalUCdslParser.g:525:6: lv_name_2_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_name_2_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"ucwriter.xtext.guimeta.ucdsl.UCdsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,FullStop,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_0_2());
                    			
                    otherlv_4=(Token)match(input,INCLUDE,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getUseCaseStepAccess().getINCLUDEKeyword_0_3());
                    			
                    // InternalUCdslParser.g:550:4: ( ( ruleLongName ) )
                    // InternalUCdslParser.g:551:5: ( ruleLongName )
                    {
                    // InternalUCdslParser.g:551:5: ( ruleLongName )
                    // InternalUCdslParser.g:552:6: ruleLongName
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
                    // InternalUCdslParser.g:568:3: ( () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) ) )
                    {
                    // InternalUCdslParser.g:568:3: ( () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) ) )
                    // InternalUCdslParser.g:569:4: () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) )
                    {
                    // InternalUCdslParser.g:569:4: ()
                    // InternalUCdslParser.g:570:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getUserStepAction_1_0(),
                    						current);
                    				

                    }

                    // InternalUCdslParser.g:576:4: ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )?
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
                            // InternalUCdslParser.g:577:5: ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop
                            {
                            // InternalUCdslParser.g:577:5: ( ( ruleQualifiedStepName ) )
                            // InternalUCdslParser.g:578:6: ( ruleQualifiedStepName )
                            {
                            // InternalUCdslParser.g:578:6: ( ruleQualifiedStepName )
                            // InternalUCdslParser.g:579:7: ruleQualifiedStepName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUseCaseStepRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_1_1_0_0());
                            						
                            pushFollow(FOLLOW_14);
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

                    // InternalUCdslParser.g:598:4: ( (lv_name_9_0= ruleStepName ) )
                    // InternalUCdslParser.g:599:5: (lv_name_9_0= ruleStepName )
                    {
                    // InternalUCdslParser.g:599:5: (lv_name_9_0= ruleStepName )
                    // InternalUCdslParser.g:600:6: lv_name_9_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_name_9_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"ucwriter.xtext.guimeta.ucdsl.UCdsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,FullStop,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_1_3());
                    			
                    otherlv_11=(Token)match(input,USER,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getUseCaseStepAccess().getUSERKeyword_1_4());
                    			
                    // InternalUCdslParser.g:625:4: ( (lv_sentence_12_0= ruleLongName ) )
                    // InternalUCdslParser.g:626:5: (lv_sentence_12_0= ruleLongName )
                    {
                    // InternalUCdslParser.g:626:5: (lv_sentence_12_0= ruleLongName )
                    // InternalUCdslParser.g:627:6: lv_sentence_12_0= ruleLongName
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
                    							"ucwriter.xtext.guimeta.ucdsl.UCdsl.LongName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUCdslParser.g:646:3: ( () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) ) )
                    {
                    // InternalUCdslParser.g:646:3: ( () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) ) )
                    // InternalUCdslParser.g:647:4: () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) )
                    {
                    // InternalUCdslParser.g:647:4: ()
                    // InternalUCdslParser.g:648:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getSystemStepAction_2_0(),
                    						current);
                    				

                    }

                    // InternalUCdslParser.g:654:4: ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )?
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
                            // InternalUCdslParser.g:655:5: ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop
                            {
                            // InternalUCdslParser.g:655:5: ( ( ruleQualifiedStepName ) )
                            // InternalUCdslParser.g:656:6: ( ruleQualifiedStepName )
                            {
                            // InternalUCdslParser.g:656:6: ( ruleQualifiedStepName )
                            // InternalUCdslParser.g:657:7: ruleQualifiedStepName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUseCaseStepRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_2_1_0_0());
                            						
                            pushFollow(FOLLOW_14);
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

                    // InternalUCdslParser.g:676:4: ( (lv_name_16_0= ruleStepName ) )
                    // InternalUCdslParser.g:677:5: (lv_name_16_0= ruleStepName )
                    {
                    // InternalUCdslParser.g:677:5: (lv_name_16_0= ruleStepName )
                    // InternalUCdslParser.g:678:6: lv_name_16_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_name_16_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_16_0,
                    							"ucwriter.xtext.guimeta.ucdsl.UCdsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,FullStop,FOLLOW_23); 

                    				newLeafNode(otherlv_17, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_2_3());
                    			
                    otherlv_18=(Token)match(input,SYSTEM,FOLLOW_6); 

                    				newLeafNode(otherlv_18, grammarAccess.getUseCaseStepAccess().getSYSTEMKeyword_2_4());
                    			
                    // InternalUCdslParser.g:703:4: ( (lv_sentence_19_0= ruleLongName ) )
                    // InternalUCdslParser.g:704:5: (lv_sentence_19_0= ruleLongName )
                    {
                    // InternalUCdslParser.g:704:5: (lv_sentence_19_0= ruleLongName )
                    // InternalUCdslParser.g:705:6: lv_sentence_19_0= ruleLongName
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
                    							"ucwriter.xtext.guimeta.ucdsl.UCdsl.LongName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalUCdslParser.g:724:3: ( () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_steps_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END )
                    {
                    // InternalUCdslParser.g:724:3: ( () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_steps_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END )
                    // InternalUCdslParser.g:725:4: () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_steps_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END
                    {
                    // InternalUCdslParser.g:725:4: ()
                    // InternalUCdslParser.g:726:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUseCaseStepAccess().getRepeatingStepAction_3_0(),
                    						current);
                    				

                    }

                    // InternalUCdslParser.g:732:4: ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )?
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
                            // InternalUCdslParser.g:733:5: ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop
                            {
                            // InternalUCdslParser.g:733:5: ( ( ruleQualifiedStepName ) )
                            // InternalUCdslParser.g:734:6: ( ruleQualifiedStepName )
                            {
                            // InternalUCdslParser.g:734:6: ( ruleQualifiedStepName )
                            // InternalUCdslParser.g:735:7: ruleQualifiedStepName
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUseCaseStepRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getUseCaseStepAccess().getParentRepeatingStepCrossReference_3_1_0_0());
                            						
                            pushFollow(FOLLOW_14);
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

                    // InternalUCdslParser.g:754:4: ( (lv_name_23_0= ruleStepName ) )
                    // InternalUCdslParser.g:755:5: (lv_name_23_0= ruleStepName )
                    {
                    // InternalUCdslParser.g:755:5: (lv_name_23_0= ruleStepName )
                    // InternalUCdslParser.g:756:6: lv_name_23_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getNameStepNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_name_23_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_23_0,
                    							"ucwriter.xtext.guimeta.ucdsl.UCdsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,FullStop,FOLLOW_24); 

                    				newLeafNode(otherlv_24, grammarAccess.getUseCaseStepAccess().getFullStopKeyword_3_3());
                    			
                    otherlv_25=(Token)match(input,WHILE,FOLLOW_17); 

                    				newLeafNode(otherlv_25, grammarAccess.getUseCaseStepAccess().getWHILEKeyword_3_4());
                    			
                    // InternalUCdslParser.g:781:4: ( (lv_repeatingCondition_26_0= ruleCondition ) )
                    // InternalUCdslParser.g:782:5: (lv_repeatingCondition_26_0= ruleCondition )
                    {
                    // InternalUCdslParser.g:782:5: (lv_repeatingCondition_26_0= ruleCondition )
                    // InternalUCdslParser.g:783:6: lv_repeatingCondition_26_0= ruleCondition
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
                    							"ucwriter.xtext.guimeta.ucdsl.UCdsl.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_BEGIN_27=(Token)match(input,RULE_BEGIN,FOLLOW_4); 

                    				newLeafNode(this_BEGIN_27, grammarAccess.getUseCaseStepAccess().getBEGINTerminalRuleCall_3_6());
                    			
                    // InternalUCdslParser.g:804:4: ( (lv_steps_28_0= ruleUseCaseStep ) )+
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
                    	    // InternalUCdslParser.g:805:5: (lv_steps_28_0= ruleUseCaseStep )
                    	    {
                    	    // InternalUCdslParser.g:805:5: (lv_steps_28_0= ruleUseCaseStep )
                    	    // InternalUCdslParser.g:806:6: lv_steps_28_0= ruleUseCaseStep
                    	    {

                    	    						newCompositeNode(grammarAccess.getUseCaseStepAccess().getStepsUseCaseStepParserRuleCall_3_7_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_steps_28_0=ruleUseCaseStep();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUseCaseStepRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"steps",
                    	    							lv_steps_28_0,
                    	    							"ucwriter.xtext.guimeta.ucdsl.UCdsl.UseCaseStep");
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
    // InternalUCdslParser.g:832:1: entryRuleExtensionStep returns [EObject current=null] : iv_ruleExtensionStep= ruleExtensionStep EOF ;
    public final EObject entryRuleExtensionStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionStep = null;


        try {
            // InternalUCdslParser.g:832:54: (iv_ruleExtensionStep= ruleExtensionStep EOF )
            // InternalUCdslParser.g:833:2: iv_ruleExtensionStep= ruleExtensionStep EOF
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
    // InternalUCdslParser.g:839:1: ruleExtensionStep returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop otherlv_2= INCLUDE ( ( ruleLongName ) ) ) | ( ( (lv_name_4_0= ruleStepName ) ) otherlv_5= FullStop (otherlv_6= USER | otherlv_7= SYSTEM | otherlv_8= WHILE )? ( (lv_sentence_9_0= ruleLongName ) ) ) | this_DeadEndStep_10= ruleDeadEndStep ) ;
    public final EObject ruleExtensionStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_sentence_9_0 = null;

        EObject this_DeadEndStep_10 = null;



        	enterRule();

        try {
            // InternalUCdslParser.g:845:2: ( ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop otherlv_2= INCLUDE ( ( ruleLongName ) ) ) | ( ( (lv_name_4_0= ruleStepName ) ) otherlv_5= FullStop (otherlv_6= USER | otherlv_7= SYSTEM | otherlv_8= WHILE )? ( (lv_sentence_9_0= ruleLongName ) ) ) | this_DeadEndStep_10= ruleDeadEndStep ) )
            // InternalUCdslParser.g:846:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop otherlv_2= INCLUDE ( ( ruleLongName ) ) ) | ( ( (lv_name_4_0= ruleStepName ) ) otherlv_5= FullStop (otherlv_6= USER | otherlv_7= SYSTEM | otherlv_8= WHILE )? ( (lv_sentence_9_0= ruleLongName ) ) ) | this_DeadEndStep_10= ruleDeadEndStep )
            {
            // InternalUCdslParser.g:846:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop otherlv_2= INCLUDE ( ( ruleLongName ) ) ) | ( ( (lv_name_4_0= ruleStepName ) ) otherlv_5= FullStop (otherlv_6= USER | otherlv_7= SYSTEM | otherlv_8= WHILE )? ( (lv_sentence_9_0= ruleLongName ) ) ) | this_DeadEndStep_10= ruleDeadEndStep )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalUCdslParser.g:847:3: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop otherlv_2= INCLUDE ( ( ruleLongName ) ) )
                    {
                    // InternalUCdslParser.g:847:3: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop otherlv_2= INCLUDE ( ( ruleLongName ) ) )
                    // InternalUCdslParser.g:848:4: ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop otherlv_2= INCLUDE ( ( ruleLongName ) )
                    {
                    // InternalUCdslParser.g:848:4: ( (lv_name_0_0= ruleStepName ) )
                    // InternalUCdslParser.g:849:5: (lv_name_0_0= ruleStepName )
                    {
                    // InternalUCdslParser.g:849:5: (lv_name_0_0= ruleStepName )
                    // InternalUCdslParser.g:850:6: lv_name_0_0= ruleStepName
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
                    							"ucwriter.xtext.guimeta.ucdsl.UCdsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,FullStop,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getExtensionStepAccess().getFullStopKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,INCLUDE,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getExtensionStepAccess().getINCLUDEKeyword_0_2());
                    			
                    // InternalUCdslParser.g:875:4: ( ( ruleLongName ) )
                    // InternalUCdslParser.g:876:5: ( ruleLongName )
                    {
                    // InternalUCdslParser.g:876:5: ( ruleLongName )
                    // InternalUCdslParser.g:877:6: ruleLongName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtensionStepRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getExtensionStepAccess().getReferenceUseCaseCrossReference_0_3_0());
                    					
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
                    // InternalUCdslParser.g:893:3: ( ( (lv_name_4_0= ruleStepName ) ) otherlv_5= FullStop (otherlv_6= USER | otherlv_7= SYSTEM | otherlv_8= WHILE )? ( (lv_sentence_9_0= ruleLongName ) ) )
                    {
                    // InternalUCdslParser.g:893:3: ( ( (lv_name_4_0= ruleStepName ) ) otherlv_5= FullStop (otherlv_6= USER | otherlv_7= SYSTEM | otherlv_8= WHILE )? ( (lv_sentence_9_0= ruleLongName ) ) )
                    // InternalUCdslParser.g:894:4: ( (lv_name_4_0= ruleStepName ) ) otherlv_5= FullStop (otherlv_6= USER | otherlv_7= SYSTEM | otherlv_8= WHILE )? ( (lv_sentence_9_0= ruleLongName ) )
                    {
                    // InternalUCdslParser.g:894:4: ( (lv_name_4_0= ruleStepName ) )
                    // InternalUCdslParser.g:895:5: (lv_name_4_0= ruleStepName )
                    {
                    // InternalUCdslParser.g:895:5: (lv_name_4_0= ruleStepName )
                    // InternalUCdslParser.g:896:6: lv_name_4_0= ruleStepName
                    {

                    						newCompositeNode(grammarAccess.getExtensionStepAccess().getNameStepNameParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_name_4_0=ruleStepName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtensionStepRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"ucwriter.xtext.guimeta.ucdsl.UCdsl.StepName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,FullStop,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getExtensionStepAccess().getFullStopKeyword_1_1());
                    			
                    // InternalUCdslParser.g:917:4: (otherlv_6= USER | otherlv_7= SYSTEM | otherlv_8= WHILE )?
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
                            // InternalUCdslParser.g:918:5: otherlv_6= USER
                            {
                            otherlv_6=(Token)match(input,USER,FOLLOW_6); 

                            					newLeafNode(otherlv_6, grammarAccess.getExtensionStepAccess().getUSERKeyword_1_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalUCdslParser.g:923:5: otherlv_7= SYSTEM
                            {
                            otherlv_7=(Token)match(input,SYSTEM,FOLLOW_6); 

                            					newLeafNode(otherlv_7, grammarAccess.getExtensionStepAccess().getSYSTEMKeyword_1_2_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalUCdslParser.g:928:5: otherlv_8= WHILE
                            {
                            otherlv_8=(Token)match(input,WHILE,FOLLOW_6); 

                            					newLeafNode(otherlv_8, grammarAccess.getExtensionStepAccess().getWHILEKeyword_1_2_2());
                            				

                            }
                            break;

                    }

                    // InternalUCdslParser.g:933:4: ( (lv_sentence_9_0= ruleLongName ) )
                    // InternalUCdslParser.g:934:5: (lv_sentence_9_0= ruleLongName )
                    {
                    // InternalUCdslParser.g:934:5: (lv_sentence_9_0= ruleLongName )
                    // InternalUCdslParser.g:935:6: lv_sentence_9_0= ruleLongName
                    {

                    						newCompositeNode(grammarAccess.getExtensionStepAccess().getSentenceLongNameParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_sentence_9_0=ruleLongName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExtensionStepRule());
                    						}
                    						set(
                    							current,
                    							"sentence",
                    							lv_sentence_9_0,
                    							"ucwriter.xtext.guimeta.ucdsl.UCdsl.LongName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUCdslParser.g:954:3: this_DeadEndStep_10= ruleDeadEndStep
                    {

                    			newCompositeNode(grammarAccess.getExtensionStepAccess().getDeadEndStepParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeadEndStep_10=ruleDeadEndStep();

                    state._fsp--;


                    			current = this_DeadEndStep_10;
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
    // InternalUCdslParser.g:966:1: entryRuleDeadEndStep returns [EObject current=null] : iv_ruleDeadEndStep= ruleDeadEndStep EOF ;
    public final EObject entryRuleDeadEndStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeadEndStep = null;


        try {
            // InternalUCdslParser.g:966:52: (iv_ruleDeadEndStep= ruleDeadEndStep EOF )
            // InternalUCdslParser.g:967:2: iv_ruleDeadEndStep= ruleDeadEndStep EOF
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
    // InternalUCdslParser.g:973:1: ruleDeadEndStep returns [EObject current=null] : ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END ) ;
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
            // InternalUCdslParser.g:979:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END ) )
            // InternalUCdslParser.g:980:2: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END )
            {
            // InternalUCdslParser.g:980:2: ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END )
            // InternalUCdslParser.g:981:3: ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )? ( (lv_sentence_5_0= ruleLongName ) )? otherlv_6= UC otherlv_7= END
            {
            // InternalUCdslParser.g:981:3: ( (lv_name_0_0= ruleStepName ) )
            // InternalUCdslParser.g:982:4: (lv_name_0_0= ruleStepName )
            {
            // InternalUCdslParser.g:982:4: (lv_name_0_0= ruleStepName )
            // InternalUCdslParser.g:983:5: lv_name_0_0= ruleStepName
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
            						"ucwriter.xtext.guimeta.ucdsl.UCdsl.StepName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,FullStop,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getDeadEndStepAccess().getFullStopKeyword_1());
            		
            // InternalUCdslParser.g:1004:3: (otherlv_2= USER | otherlv_3= SYSTEM | otherlv_4= WHILE )?
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
                    // InternalUCdslParser.g:1005:4: otherlv_2= USER
                    {
                    otherlv_2=(Token)match(input,USER,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeadEndStepAccess().getUSERKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUCdslParser.g:1010:4: otherlv_3= SYSTEM
                    {
                    otherlv_3=(Token)match(input,SYSTEM,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeadEndStepAccess().getSYSTEMKeyword_2_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUCdslParser.g:1015:4: otherlv_4= WHILE
                    {
                    otherlv_4=(Token)match(input,WHILE,FOLLOW_27); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeadEndStepAccess().getWHILEKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalUCdslParser.g:1020:3: ( (lv_sentence_5_0= ruleLongName ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=QuotationMark && LA20_0<=RULE_CHAR)||LA20_0==RULE_ID||LA20_0==RULE_ANY_OTHER) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUCdslParser.g:1021:4: (lv_sentence_5_0= ruleLongName )
                    {
                    // InternalUCdslParser.g:1021:4: (lv_sentence_5_0= ruleLongName )
                    // InternalUCdslParser.g:1022:5: lv_sentence_5_0= ruleLongName
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
                    						"ucwriter.xtext.guimeta.ucdsl.UCdsl.LongName");
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
    // InternalUCdslParser.g:1051:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalUCdslParser.g:1051:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalUCdslParser.g:1052:2: iv_rulePrecondition= rulePrecondition EOF
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
    // InternalUCdslParser.g:1058:1: rulePrecondition returns [EObject current=null] : (otherlv_0= PRECONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalUCdslParser.g:1064:2: ( (otherlv_0= PRECONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalUCdslParser.g:1065:2: (otherlv_0= PRECONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalUCdslParser.g:1065:2: (otherlv_0= PRECONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalUCdslParser.g:1066:3: otherlv_0= PRECONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,PRECONDITION,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getPRECONDITIONKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPreconditionAccess().getColonKeyword_1());
            		
            // InternalUCdslParser.g:1074:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalUCdslParser.g:1075:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalUCdslParser.g:1075:4: (lv_condition_2_0= ruleCondition )
            // InternalUCdslParser.g:1076:5: lv_condition_2_0= ruleCondition
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
            						"ucwriter.xtext.guimeta.ucdsl.UCdsl.Condition");
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
    // InternalUCdslParser.g:1097:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalUCdslParser.g:1097:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalUCdslParser.g:1098:2: iv_rulePostcondition= rulePostcondition EOF
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
    // InternalUCdslParser.g:1104:1: rulePostcondition returns [EObject current=null] : (otherlv_0= POSTCONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalUCdslParser.g:1110:2: ( (otherlv_0= POSTCONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) ) )
            // InternalUCdslParser.g:1111:2: (otherlv_0= POSTCONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            {
            // InternalUCdslParser.g:1111:2: (otherlv_0= POSTCONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) ) )
            // InternalUCdslParser.g:1112:3: otherlv_0= POSTCONDITION otherlv_1= Colon ( (lv_condition_2_0= ruleCondition ) )
            {
            otherlv_0=(Token)match(input,POSTCONDITION,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getPOSTCONDITIONKeyword_0());
            		
            otherlv_1=(Token)match(input,Colon,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPostconditionAccess().getColonKeyword_1());
            		
            // InternalUCdslParser.g:1120:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalUCdslParser.g:1121:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalUCdslParser.g:1121:4: (lv_condition_2_0= ruleCondition )
            // InternalUCdslParser.g:1122:5: lv_condition_2_0= ruleCondition
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
            						"ucwriter.xtext.guimeta.ucdsl.UCdsl.Condition");
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
    // InternalUCdslParser.g:1143:1: entryRuleLongName returns [String current=null] : iv_ruleLongName= ruleLongName EOF ;
    public final String entryRuleLongName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLongName = null;


        try {
            // InternalUCdslParser.g:1143:48: (iv_ruleLongName= ruleLongName EOF )
            // InternalUCdslParser.g:1144:2: iv_ruleLongName= ruleLongName EOF
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
    // InternalUCdslParser.g:1150:1: ruleLongName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ ;
    public final AntlrDatatypeRuleToken ruleLongName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_CHAR_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUCdslParser.g:1156:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+ )
            // InternalUCdslParser.g:1157:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
            {
            // InternalUCdslParser.g:1157:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe )+
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
            	    // InternalUCdslParser.g:1158:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getLongNameAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUCdslParser.g:1166:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_30); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getLongNameAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUCdslParser.g:1174:3: this_CHAR_2= RULE_CHAR
            	    {
            	    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_30); 

            	    			current.merge(this_CHAR_2);
            	    		

            	    			newLeafNode(this_CHAR_2, grammarAccess.getLongNameAccess().getCHARTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUCdslParser.g:1182:3: kw= Colon
            	    {
            	    kw=(Token)match(input,Colon,FOLLOW_30); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getColonKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUCdslParser.g:1188:3: kw= FullStop
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_30); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUCdslParser.g:1194:3: kw= QuotationMark
            	    {
            	    kw=(Token)match(input,QuotationMark,FOLLOW_30); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getLongNameAccess().getQuotationMarkKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalUCdslParser.g:1200:3: kw= Apostrophe
            	    {
            	    kw=(Token)match(input,Apostrophe,FOLLOW_30); 

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
    // InternalUCdslParser.g:1209:1: entryRuleCondition returns [String current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final String entryRuleCondition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondition = null;


        try {
            // InternalUCdslParser.g:1209:49: (iv_ruleCondition= ruleCondition EOF )
            // InternalUCdslParser.g:1210:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalUCdslParser.g:1216:1: ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+ ;
    public final AntlrDatatypeRuleToken ruleCondition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ANY_OTHER_1=null;
        Token this_CHAR_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalUCdslParser.g:1222:2: ( (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+ )
            // InternalUCdslParser.g:1223:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+
            {
            // InternalUCdslParser.g:1223:2: (this_ID_0= RULE_ID | this_ANY_OTHER_1= RULE_ANY_OTHER | this_CHAR_2= RULE_CHAR | kw= Colon | kw= FullStop | kw= QuotationMark | kw= Apostrophe | kw= AND | kw= OR )+
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
            	    // InternalUCdslParser.g:1224:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getConditionAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalUCdslParser.g:1232:3: this_ANY_OTHER_1= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_1=(Token)match(input,RULE_ANY_OTHER,FOLLOW_31); 

            	    			current.merge(this_ANY_OTHER_1);
            	    		

            	    			newLeafNode(this_ANY_OTHER_1, grammarAccess.getConditionAccess().getANY_OTHERTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalUCdslParser.g:1240:3: this_CHAR_2= RULE_CHAR
            	    {
            	    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_31); 

            	    			current.merge(this_CHAR_2);
            	    		

            	    			newLeafNode(this_CHAR_2, grammarAccess.getConditionAccess().getCHARTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalUCdslParser.g:1248:3: kw= Colon
            	    {
            	    kw=(Token)match(input,Colon,FOLLOW_31); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getColonKeyword_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalUCdslParser.g:1254:3: kw= FullStop
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_31); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getFullStopKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalUCdslParser.g:1260:3: kw= QuotationMark
            	    {
            	    kw=(Token)match(input,QuotationMark,FOLLOW_31); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getQuotationMarkKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalUCdslParser.g:1266:3: kw= Apostrophe
            	    {
            	    kw=(Token)match(input,Apostrophe,FOLLOW_31); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getApostropheKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalUCdslParser.g:1272:3: kw= AND
            	    {
            	    kw=(Token)match(input,AND,FOLLOW_31); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getConditionAccess().getANDKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalUCdslParser.g:1278:3: kw= OR
            	    {
            	    kw=(Token)match(input,OR,FOLLOW_31); 

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
    // InternalUCdslParser.g:1287:1: entryRuleStepName returns [String current=null] : iv_ruleStepName= ruleStepName EOF ;
    public final String entryRuleStepName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStepName = null;


        try {
            // InternalUCdslParser.g:1287:48: (iv_ruleStepName= ruleStepName EOF )
            // InternalUCdslParser.g:1288:2: iv_ruleStepName= ruleStepName EOF
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
    // InternalUCdslParser.g:1294:1: ruleStepName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleStepName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalUCdslParser.g:1300:2: (this_INT_0= RULE_INT )
            // InternalUCdslParser.g:1301:2: this_INT_0= RULE_INT
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
    // InternalUCdslParser.g:1311:1: entryRuleQualifiedStepName returns [String current=null] : iv_ruleQualifiedStepName= ruleQualifiedStepName EOF ;
    public final String entryRuleQualifiedStepName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedStepName = null;


        try {
            // InternalUCdslParser.g:1311:57: (iv_ruleQualifiedStepName= ruleQualifiedStepName EOF )
            // InternalUCdslParser.g:1312:2: iv_ruleQualifiedStepName= ruleQualifiedStepName EOF
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
    // InternalUCdslParser.g:1318:1: ruleQualifiedStepName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_StepName_0= ruleStepName (kw= FullStop this_StepName_2= ruleStepName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedStepName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_StepName_0 = null;

        AntlrDatatypeRuleToken this_StepName_2 = null;



        	enterRule();

        try {
            // InternalUCdslParser.g:1324:2: ( (this_StepName_0= ruleStepName (kw= FullStop this_StepName_2= ruleStepName )* ) )
            // InternalUCdslParser.g:1325:2: (this_StepName_0= ruleStepName (kw= FullStop this_StepName_2= ruleStepName )* )
            {
            // InternalUCdslParser.g:1325:2: (this_StepName_0= ruleStepName (kw= FullStop this_StepName_2= ruleStepName )* )
            // InternalUCdslParser.g:1326:3: this_StepName_0= ruleStepName (kw= FullStop this_StepName_2= ruleStepName )*
            {

            			newCompositeNode(grammarAccess.getQualifiedStepNameAccess().getStepNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_StepName_0=ruleStepName();

            state._fsp--;


            			current.merge(this_StepName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalUCdslParser.g:1336:3: (kw= FullStop this_StepName_2= ruleStepName )*
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
                        else if ( (LA23_3==EOF||LA23_3==RULE_END||LA23_3==RULE_INT) ) {
                            alt23=1;
                        }


                    }


                }


                switch (alt23) {
            	case 1 :
            	    // InternalUCdslParser.g:1337:4: kw= FullStop this_StepName_2= ruleStepName
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedStepNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedStepNameAccess().getStepNameParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_32);
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
    // InternalUCdslParser.g:1357:1: entryRuleQualifiedExtensionStepName returns [String current=null] : iv_ruleQualifiedExtensionStepName= ruleQualifiedExtensionStepName EOF ;
    public final String entryRuleQualifiedExtensionStepName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedExtensionStepName = null;


        try {
            // InternalUCdslParser.g:1357:66: (iv_ruleQualifiedExtensionStepName= ruleQualifiedExtensionStepName EOF )
            // InternalUCdslParser.g:1358:2: iv_ruleQualifiedExtensionStepName= ruleQualifiedExtensionStepName EOF
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
    // InternalUCdslParser.g:1364:1: ruleQualifiedExtensionStepName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedStepName_0= ruleQualifiedStepName kw= FullStop this_CHAR_2= RULE_CHAR kw= FullStop this_QualifiedStepName_4= ruleQualifiedStepName )+ ;
    public final AntlrDatatypeRuleToken ruleQualifiedExtensionStepName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_CHAR_2=null;
        AntlrDatatypeRuleToken this_QualifiedStepName_0 = null;

        AntlrDatatypeRuleToken this_QualifiedStepName_4 = null;



        	enterRule();

        try {
            // InternalUCdslParser.g:1370:2: ( (this_QualifiedStepName_0= ruleQualifiedStepName kw= FullStop this_CHAR_2= RULE_CHAR kw= FullStop this_QualifiedStepName_4= ruleQualifiedStepName )+ )
            // InternalUCdslParser.g:1371:2: (this_QualifiedStepName_0= ruleQualifiedStepName kw= FullStop this_CHAR_2= RULE_CHAR kw= FullStop this_QualifiedStepName_4= ruleQualifiedStepName )+
            {
            // InternalUCdslParser.g:1371:2: (this_QualifiedStepName_0= ruleQualifiedStepName kw= FullStop this_CHAR_2= RULE_CHAR kw= FullStop this_QualifiedStepName_4= ruleQualifiedStepName )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_INT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalUCdslParser.g:1372:3: this_QualifiedStepName_0= ruleQualifiedStepName kw= FullStop this_CHAR_2= RULE_CHAR kw= FullStop this_QualifiedStepName_4= ruleQualifiedStepName
            	    {

            	    			newCompositeNode(grammarAccess.getQualifiedExtensionStepNameAccess().getQualifiedStepNameParserRuleCall_0());
            	    		
            	    pushFollow(FOLLOW_14);
            	    this_QualifiedStepName_0=ruleQualifiedStepName();

            	    state._fsp--;


            	    			current.merge(this_QualifiedStepName_0);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		
            	    kw=(Token)match(input,FullStop,FOLLOW_15); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getQualifiedExtensionStepNameAccess().getFullStopKeyword_1());
            	    		
            	    this_CHAR_2=(Token)match(input,RULE_CHAR,FOLLOW_14); 

            	    			current.merge(this_CHAR_2);
            	    		

            	    			newLeafNode(this_CHAR_2, grammarAccess.getQualifiedExtensionStepNameAccess().getCHARTerminalRuleCall_2());
            	    		
            	    kw=(Token)match(input,FullStop,FOLLOW_4); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getQualifiedExtensionStepNameAccess().getFullStopKeyword_3());
            	    		

            	    			newCompositeNode(grammarAccess.getQualifiedExtensionStepNameAccess().getQualifiedStepNameParserRuleCall_4());
            	    		
            	    pushFollow(FOLLOW_33);
            	    this_QualifiedStepName_4=ruleQualifiedStepName();

            	    state._fsp--;


            	    			current.merge(this_QualifiedStepName_4);
            	    		

            	    			afterParserOrEnumRuleCall();
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // $ANTLR end "ruleQualifiedExtensionStepName"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\1\34\1\26\1\30\2\26\1\20\2\uffff";
    static final String dfa_3s = "\1\34\1\26\1\34\2\26\1\34\2\uffff";
    static final String dfa_4s = "\6\uffff\1\2\1\1";
    static final String dfa_5s = "\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3\3\uffff\1\4",
            "\1\5",
            "\1\2",
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
            return "292:3: ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) )";
        }
    }
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\1\34\1\26\1\7\1\uffff\12\23\1\17\1\uffff\1\32";
    static final String dfa_9s = "\1\34\1\26\1\41\1\uffff\12\41\1\17\1\uffff\1\34";
    static final String dfa_10s = "\3\uffff\1\1\13\uffff\1\2\1\uffff";
    static final String dfa_11s = "\21\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\1\3\1\17\1\5\1\6\2\uffff\1\4\5\uffff\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\1\3\4\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\1\3\4\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\1\3\4\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\1\3\4\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\1\3\4\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\1\3\4\uffff\1\10",
            "\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\1\3\4\uffff\1\10",
            "\1\20",
            "",
            "\1\17\1\uffff\1\3"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 380:3: ( (lv_steps_8_0= ruleExtensionStep ) )*";
        }
    }
    static final String dfa_13s = "\6\uffff";
    static final String dfa_14s = "\1\34\1\26\1\30\1\uffff\1\26\1\uffff";
    static final String dfa_15s = "\1\34\1\32\1\34\1\uffff\1\32\1\uffff";
    static final String dfa_16s = "\3\uffff\1\1\1\uffff\1\2";
    static final String dfa_17s = "\6\uffff}>";
    static final String[] dfa_18s = {
            "\1\1",
            "\1\2\3\uffff\1\3",
            "\1\5\3\uffff\1\4",
            "",
            "\1\2\3\uffff\1\3",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "420:5: ( ( ( ruleQualifiedStepName ) ) | ( ( ruleQualifiedExtensionStepName ) ) )";
        }
    }
    static final String dfa_19s = "\1\34\1\26\1\7\1\uffff\1\26\3\uffff";
    static final String dfa_20s = "\1\34\1\26\1\34\1\uffff\1\26\3\uffff";
    static final String dfa_21s = "\3\uffff\1\1\1\uffff\1\2\1\3\1\4";
    static final String[] dfa_22s = {
            "\1\1",
            "\1\2",
            "\1\3\1\uffff\1\6\1\7\2\uffff\1\5\16\uffff\1\4",
            "",
            "\1\2",
            "",
            "",
            ""
    };
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_5;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "499:2: ( ( ( ( ( ruleQualifiedStepName ) ) otherlv_1= FullStop )? ( (lv_name_2_0= ruleStepName ) ) otherlv_3= FullStop otherlv_4= INCLUDE ( ( ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_8= FullStop )? ( (lv_name_9_0= ruleStepName ) ) otherlv_10= FullStop otherlv_11= USER ( (lv_sentence_12_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_15= FullStop )? ( (lv_name_16_0= ruleStepName ) ) otherlv_17= FullStop otherlv_18= SYSTEM ( (lv_sentence_19_0= ruleLongName ) ) ) | ( () ( ( ( ruleQualifiedStepName ) ) otherlv_22= FullStop )? ( (lv_name_23_0= ruleStepName ) ) otherlv_24= FullStop otherlv_25= WHILE ( (lv_repeatingCondition_26_0= ruleCondition ) ) this_BEGIN_27= RULE_BEGIN ( (lv_steps_28_0= ruleUseCaseStep ) )+ this_END_29= RULE_END ) )";
        }
    }
    static final String dfa_23s = "\20\uffff";
    static final String dfa_24s = "\7\uffff\7\17\2\uffff";
    static final String dfa_25s = "\1\34\1\26\1\7\1\uffff\12\23\2\uffff";
    static final String dfa_26s = "\1\34\1\26\1\41\1\uffff\12\41\2\uffff";
    static final String dfa_27s = "\3\uffff\1\1\12\uffff\1\3\1\2";
    static final String dfa_28s = "\20\uffff}>";
    static final String[] dfa_29s = {
            "\1\1",
            "\1\2",
            "\1\3\1\uffff\1\5\1\6\2\uffff\1\4\5\uffff\1\16\1\14\1\15\1\13\1\12\1\11\2\uffff\1\7\5\uffff\1\10",
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
            "",
            ""
    };

    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[][] dfa_29 = unpackEncodedStringArray(dfa_29s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_23;
            this.eof = dfa_24;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_27;
            this.special = dfa_28;
            this.transition = dfa_29;
        }
        public String getDescription() {
            return "846:2: ( ( ( (lv_name_0_0= ruleStepName ) ) otherlv_1= FullStop otherlv_2= INCLUDE ( ( ruleLongName ) ) ) | ( ( (lv_name_4_0= ruleStepName ) ) otherlv_5= FullStop (otherlv_6= USER | otherlv_7= SYSTEM | otherlv_8= WHILE )? ( (lv_sentence_9_0= ruleLongName ) ) ) | this_DeadEndStep_10= ruleDeadEndStep )";
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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000209F24000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000209F02600L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000209F82600L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000209F80000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000209F00002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000209F24002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010000002L});

}