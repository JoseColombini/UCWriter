package ucwriter.xtext.guimeta.ucdsl.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUCdslLexer extends Lexer {
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

    public InternalUCdslLexer() {;} 
    public InternalUCdslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalUCdslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalUCdslLexer.g"; }

    // $ANTLR start "POSTCONDITION"
    public final void mPOSTCONDITION() throws RecognitionException {
        try {
            int _type = POSTCONDITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:14:15: ( 'POSTCONDITION' )
            // InternalUCdslLexer.g:14:17: 'POSTCONDITION'
            {
            match("POSTCONDITION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POSTCONDITION"

    // $ANTLR start "PRECONDITION"
    public final void mPRECONDITION() throws RecognitionException {
        try {
            int _type = PRECONDITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:16:14: ( 'PRECONDITION' )
            // InternalUCdslLexer.g:16:16: 'PRECONDITION'
            {
            match("PRECONDITION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRECONDITION"

    // $ANTLR start "ALTERNATIVE"
    public final void mALTERNATIVE() throws RecognitionException {
        try {
            int _type = ALTERNATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:18:13: ( 'ALTERNATIVE' )
            // InternalUCdslLexer.g:18:15: 'ALTERNATIVE'
            {
            match("ALTERNATIVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALTERNATIVE"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:20:9: ( 'INCLUDE' )
            // InternalUCdslLexer.g:20:11: 'INCLUDE'
            {
            match("INCLUDE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:22:8: ( 'RETURN' )
            // InternalUCdslLexer.g:22:10: 'RETURN'
            {
            match("RETURN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "SYSTEM"
    public final void mSYSTEM() throws RecognitionException {
        try {
            int _type = SYSTEM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:24:8: ( 'SYSTEM' )
            // InternalUCdslLexer.g:24:10: 'SYSTEM'
            {
            match("SYSTEM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SYSTEM"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:26:7: ( 'WHILE' )
            // InternalUCdslLexer.g:26:9: 'WHILE'
            {
            match("WHILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "FLOW"
    public final void mFLOW() throws RecognitionException {
        try {
            int _type = FLOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:28:6: ( 'FLOW' )
            // InternalUCdslLexer.g:28:8: 'FLOW'
            {
            match("FLOW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOW"

    // $ANTLR start "MAIN"
    public final void mMAIN() throws RecognitionException {
        try {
            int _type = MAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:30:6: ( 'MAIN' )
            // InternalUCdslLexer.g:30:8: 'MAIN'
            {
            match("MAIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAIN"

    // $ANTLR start "USER"
    public final void mUSER() throws RecognitionException {
        try {
            int _type = USER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:32:6: ( 'USER' )
            // InternalUCdslLexer.g:32:8: 'USER'
            {
            match("USER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USER"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:34:5: ( 'AND' )
            // InternalUCdslLexer.g:34:7: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:36:5: ( 'END' )
            // InternalUCdslLexer.g:36:7: 'END'
            {
            match("END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:38:4: ( 'IF' )
            // InternalUCdslLexer.g:38:6: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:40:4: ( 'OR' )
            // InternalUCdslLexer.g:40:6: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:42:4: ( 'TO' )
            // InternalUCdslLexer.g:42:6: 'TO'
            {
            match("TO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "UC"
    public final void mUC() throws RecognitionException {
        try {
            int _type = UC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:44:4: ( 'UC' )
            // InternalUCdslLexer.g:44:6: 'UC'
            {
            match("UC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UC"

    // $ANTLR start "QuotationMark"
    public final void mQuotationMark() throws RecognitionException {
        try {
            int _type = QuotationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:46:15: ( '\"' )
            // InternalUCdslLexer.g:46:17: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuotationMark"

    // $ANTLR start "Apostrophe"
    public final void mApostrophe() throws RecognitionException {
        try {
            int _type = Apostrophe;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:48:12: ( '\\'' )
            // InternalUCdslLexer.g:48:14: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Apostrophe"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:50:10: ( '.' )
            // InternalUCdslLexer.g:50:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:52:7: ( ':' )
            // InternalUCdslLexer.g:52:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            int _type = RULE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:54:11: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalUCdslLexer.g:54:13: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalUCdslLexer.g:56:21: ()
            // InternalUCdslLexer.g:56:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalUCdslLexer.g:58:19: ()
            // InternalUCdslLexer.g:58:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:60:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalUCdslLexer.g:60:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalUCdslLexer.g:60:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalUCdslLexer.g:60:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalUCdslLexer.g:60:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUCdslLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:62:10: ( ( '0' .. '9' )+ )
            // InternalUCdslLexer.g:62:12: ( '0' .. '9' )+
            {
            // InternalUCdslLexer.g:62:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUCdslLexer.g:62:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:64:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalUCdslLexer.g:64:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalUCdslLexer.g:64:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUCdslLexer.g:64:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalUCdslLexer.g:64:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalUCdslLexer.g:64:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUCdslLexer.g:64:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalUCdslLexer.g:64:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalUCdslLexer.g:64:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalUCdslLexer.g:64:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUCdslLexer.g:64:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:66:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalUCdslLexer.g:66:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalUCdslLexer.g:66:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUCdslLexer.g:66:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:68:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalUCdslLexer.g:68:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalUCdslLexer.g:68:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUCdslLexer.g:68:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalUCdslLexer.g:68:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUCdslLexer.g:68:41: ( '\\r' )? '\\n'
                    {
                    // InternalUCdslLexer.g:68:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalUCdslLexer.g:68:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:70:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalUCdslLexer.g:70:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalUCdslLexer.g:70:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUCdslLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUCdslLexer.g:72:16: ( . )
            // InternalUCdslLexer.g:72:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalUCdslLexer.g:1:8: ( POSTCONDITION | PRECONDITION | ALTERNATIVE | INCLUDE | RETURN | SYSTEM | WHILE | FLOW | MAIN | USER | AND | END | IF | OR | TO | UC | QuotationMark | Apostrophe | FullStop | Colon | RULE_CHAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=28;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalUCdslLexer.g:1:10: POSTCONDITION
                {
                mPOSTCONDITION(); 

                }
                break;
            case 2 :
                // InternalUCdslLexer.g:1:24: PRECONDITION
                {
                mPRECONDITION(); 

                }
                break;
            case 3 :
                // InternalUCdslLexer.g:1:37: ALTERNATIVE
                {
                mALTERNATIVE(); 

                }
                break;
            case 4 :
                // InternalUCdslLexer.g:1:49: INCLUDE
                {
                mINCLUDE(); 

                }
                break;
            case 5 :
                // InternalUCdslLexer.g:1:57: RETURN
                {
                mRETURN(); 

                }
                break;
            case 6 :
                // InternalUCdslLexer.g:1:64: SYSTEM
                {
                mSYSTEM(); 

                }
                break;
            case 7 :
                // InternalUCdslLexer.g:1:71: WHILE
                {
                mWHILE(); 

                }
                break;
            case 8 :
                // InternalUCdslLexer.g:1:77: FLOW
                {
                mFLOW(); 

                }
                break;
            case 9 :
                // InternalUCdslLexer.g:1:82: MAIN
                {
                mMAIN(); 

                }
                break;
            case 10 :
                // InternalUCdslLexer.g:1:87: USER
                {
                mUSER(); 

                }
                break;
            case 11 :
                // InternalUCdslLexer.g:1:92: AND
                {
                mAND(); 

                }
                break;
            case 12 :
                // InternalUCdslLexer.g:1:96: END
                {
                mEND(); 

                }
                break;
            case 13 :
                // InternalUCdslLexer.g:1:100: IF
                {
                mIF(); 

                }
                break;
            case 14 :
                // InternalUCdslLexer.g:1:103: OR
                {
                mOR(); 

                }
                break;
            case 15 :
                // InternalUCdslLexer.g:1:106: TO
                {
                mTO(); 

                }
                break;
            case 16 :
                // InternalUCdslLexer.g:1:109: UC
                {
                mUC(); 

                }
                break;
            case 17 :
                // InternalUCdslLexer.g:1:112: QuotationMark
                {
                mQuotationMark(); 

                }
                break;
            case 18 :
                // InternalUCdslLexer.g:1:126: Apostrophe
                {
                mApostrophe(); 

                }
                break;
            case 19 :
                // InternalUCdslLexer.g:1:137: FullStop
                {
                mFullStop(); 

                }
                break;
            case 20 :
                // InternalUCdslLexer.g:1:146: Colon
                {
                mColon(); 

                }
                break;
            case 21 :
                // InternalUCdslLexer.g:1:152: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 22 :
                // InternalUCdslLexer.g:1:162: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // InternalUCdslLexer.g:1:170: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // InternalUCdslLexer.g:1:179: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // InternalUCdslLexer.g:1:191: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // InternalUCdslLexer.g:1:207: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // InternalUCdslLexer.g:1:223: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // InternalUCdslLexer.g:1:231: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\14\32\1\53\1\54\2\uffff\1\32\1\27\2\uffff\1\27\2\uffff\2\33\2\uffff\3\33\1\70\6\33\1\77\1\33\1\101\1\102\11\uffff\3\33\1\106\1\33\1\uffff\6\33\1\uffff\1\116\2\uffff\3\33\1\uffff\4\33\1\126\1\127\1\130\1\uffff\6\33\1\137\3\uffff\4\33\1\144\1\145\1\uffff\3\33\1\151\2\uffff\3\33\1\uffff\10\33\1\165\1\33\1\167\1\uffff\1\170\2\uffff";
    static final String DFA12_eofS =
        "\171\uffff";
    static final String DFA12_minS =
        "\1\0\14\60\2\0\2\uffff\1\60\1\101\2\uffff\1\52\2\uffff\1\123\1\105\2\uffff\1\124\1\104\1\103\1\60\1\124\1\123\1\111\1\117\1\111\1\105\1\60\1\104\2\60\11\uffff\1\124\1\103\1\105\1\60\1\114\1\uffff\1\125\1\124\1\114\1\127\1\116\1\122\1\uffff\1\60\2\uffff\1\103\1\117\1\122\1\uffff\1\125\1\122\2\105\3\60\1\uffff\1\117\2\116\1\104\1\116\1\115\1\60\3\uffff\1\116\1\104\1\101\1\105\2\60\1\uffff\1\104\1\111\1\124\1\60\2\uffff\1\111\1\124\1\111\1\uffff\1\124\1\111\1\126\1\111\1\117\1\105\1\117\1\116\1\60\1\116\1\60\1\uffff\1\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\14\172\2\uffff\2\uffff\2\172\2\uffff\1\57\2\uffff\1\123\1\105\2\uffff\1\124\1\104\1\103\1\172\1\124\1\123\1\111\1\117\1\111\1\105\1\172\1\104\2\172\11\uffff\1\124\1\103\1\105\1\172\1\114\1\uffff\1\125\1\124\1\114\1\127\1\116\1\122\1\uffff\1\172\2\uffff\1\103\1\117\1\122\1\uffff\1\125\1\122\2\105\3\172\1\uffff\1\117\2\116\1\104\1\116\1\115\1\172\3\uffff\1\116\1\104\1\101\1\105\2\172\1\uffff\1\104\1\111\1\124\1\172\2\uffff\1\111\1\124\1\111\1\uffff\1\124\1\111\1\126\1\111\1\117\1\105\1\117\1\116\1\172\1\116\1\172\1\uffff\1\172\2\uffff";
    static final String DFA12_acceptS =
        "\17\uffff\1\23\1\24\2\uffff\1\26\1\27\1\uffff\1\33\1\34\2\uffff\1\25\1\26\16\uffff\1\30\1\21\1\22\1\23\1\24\1\27\1\31\1\32\1\33\5\uffff\1\15\6\uffff\1\20\1\uffff\1\16\1\17\3\uffff\1\13\7\uffff\1\14\7\uffff\1\10\1\11\1\12\6\uffff\1\7\4\uffff\1\5\1\6\3\uffff\1\4\13\uffff\1\3\1\uffff\1\2\1\1";
    static final String DFA12_specialS =
        "\1\1\14\uffff\1\0\1\2\152\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\15\4\27\1\16\6\27\1\17\1\25\12\24\1\20\6\27\1\2\3\21\1\12\1\7\2\21\1\3\3\21\1\10\1\21\1\13\1\1\1\21\1\4\1\5\1\14\1\11\1\21\1\6\3\21\3\27\1\22\1\23\1\27\32\21\uff85\27",
            "\12\33\7\uffff\16\33\1\30\2\33\1\31\10\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\13\33\1\34\1\33\1\35\14\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\5\33\1\37\7\33\1\36\14\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\4\33\1\40\25\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\30\33\1\41\1\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\7\33\1\42\22\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\13\33\1\43\16\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\1\44\31\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\2\33\1\46\17\33\1\45\7\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\15\33\1\47\14\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\21\33\1\50\10\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\16\33\1\51\13\33\4\uffff\1\33\1\uffff\32\33",
            "\0\52",
            "\0\52",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\60\4\uffff\1\61",
            "",
            "",
            "\1\63",
            "\1\64",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\100",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\107",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\166",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( POSTCONDITION | PRECONDITION | ALTERNATIVE | INCLUDE | RETURN | SYSTEM | WHILE | FLOW | MAIN | USER | AND | END | IF | OR | TO | UC | QuotationMark | Apostrophe | FullStop | Colon | RULE_CHAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_13 = input.LA(1);

                        s = -1;
                        if ( ((LA12_13>='\u0000' && LA12_13<='\uFFFF')) ) {s = 42;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='P') ) {s = 1;}

                        else if ( (LA12_0=='A') ) {s = 2;}

                        else if ( (LA12_0=='I') ) {s = 3;}

                        else if ( (LA12_0=='R') ) {s = 4;}

                        else if ( (LA12_0=='S') ) {s = 5;}

                        else if ( (LA12_0=='W') ) {s = 6;}

                        else if ( (LA12_0=='F') ) {s = 7;}

                        else if ( (LA12_0=='M') ) {s = 8;}

                        else if ( (LA12_0=='U') ) {s = 9;}

                        else if ( (LA12_0=='E') ) {s = 10;}

                        else if ( (LA12_0=='O') ) {s = 11;}

                        else if ( (LA12_0=='T') ) {s = 12;}

                        else if ( (LA12_0=='\"') ) {s = 13;}

                        else if ( (LA12_0=='\'') ) {s = 14;}

                        else if ( (LA12_0=='.') ) {s = 15;}

                        else if ( (LA12_0==':') ) {s = 16;}

                        else if ( ((LA12_0>='B' && LA12_0<='D')||(LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='L')||LA12_0=='N'||LA12_0=='Q'||LA12_0=='V'||(LA12_0>='X' && LA12_0<='Z')||(LA12_0>='a' && LA12_0<='z')) ) {s = 17;}

                        else if ( (LA12_0=='^') ) {s = 18;}

                        else if ( (LA12_0=='_') ) {s = 19;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 20;}

                        else if ( (LA12_0=='/') ) {s = 21;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 22;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='-')||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_14 = input.LA(1);

                        s = -1;
                        if ( ((LA12_14>='\u0000' && LA12_14<='\uFFFF')) ) {s = 42;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}