package useCase.xtext.useCaseDsl.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseDslLexer extends Lexer {
    public static final int SYSTEM=9;
    public static final int RULE_END=24;
    public static final int RULE_BEGIN=23;
    public static final int PRECONDITION=6;
    public static final int MAINFLOW=7;
    public static final int RULE_STRING=28;
    public static final int UC=17;
    public static final int QuotationMark=18;
    public static final int RULE_SL_COMMENT=30;
    public static final int RETURN=8;
    public static final int RULE_CHAR=22;
    public static final int Colon=21;
    public static final int ALTERNATIVEFLOW=4;
    public static final int EOF=-1;
    public static final int IF=14;
    public static final int Apostrophe=19;
    public static final int POSTCONDITION=5;
    public static final int FullStop=20;
    public static final int OR=15;
    public static final int RULE_ID=26;
    public static final int RULE_WS=31;
    public static final int RULE_ANY_OTHER=32;
    public static final int USER=11;
    public static final int RULE_INT=27;
    public static final int AND=12;
    public static final int RULE_ML_COMMENT=29;
    public static final int WHILE=10;
    public static final int END=13;
    public static final int TO=16;
    public static final int RULE_NL=25;

    // delegates
    // delegators

    public InternalUseCaseDslLexer() {;} 
    public InternalUseCaseDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalUseCaseDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalUseCaseDslLexer.g"; }

    // $ANTLR start "ALTERNATIVEFLOW"
    public final void mALTERNATIVEFLOW() throws RecognitionException {
        try {
            int _type = ALTERNATIVEFLOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:14:17: ( 'ALTERNATIVEFLOW' )
            // InternalUseCaseDslLexer.g:14:19: 'ALTERNATIVEFLOW'
            {
            match("ALTERNATIVEFLOW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALTERNATIVEFLOW"

    // $ANTLR start "POSTCONDITION"
    public final void mPOSTCONDITION() throws RecognitionException {
        try {
            int _type = POSTCONDITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:16:15: ( 'POSTCONDITION' )
            // InternalUseCaseDslLexer.g:16:17: 'POSTCONDITION'
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
            // InternalUseCaseDslLexer.g:18:14: ( 'PRECONDITION' )
            // InternalUseCaseDslLexer.g:18:16: 'PRECONDITION'
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

    // $ANTLR start "MAINFLOW"
    public final void mMAINFLOW() throws RecognitionException {
        try {
            int _type = MAINFLOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:20:10: ( 'MAINFLOW' )
            // InternalUseCaseDslLexer.g:20:12: 'MAINFLOW'
            {
            match("MAINFLOW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAINFLOW"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:22:8: ( 'RETURN' )
            // InternalUseCaseDslLexer.g:22:10: 'RETURN'
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
            // InternalUseCaseDslLexer.g:24:8: ( 'SYSTEM' )
            // InternalUseCaseDslLexer.g:24:10: 'SYSTEM'
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
            // InternalUseCaseDslLexer.g:26:7: ( 'WHILE' )
            // InternalUseCaseDslLexer.g:26:9: 'WHILE'
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

    // $ANTLR start "USER"
    public final void mUSER() throws RecognitionException {
        try {
            int _type = USER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:28:6: ( 'USER' )
            // InternalUseCaseDslLexer.g:28:8: 'USER'
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
            // InternalUseCaseDslLexer.g:30:5: ( 'AND' )
            // InternalUseCaseDslLexer.g:30:7: 'AND'
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
            // InternalUseCaseDslLexer.g:32:5: ( 'END' )
            // InternalUseCaseDslLexer.g:32:7: 'END'
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
            // InternalUseCaseDslLexer.g:34:4: ( 'IF' )
            // InternalUseCaseDslLexer.g:34:6: 'IF'
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
            // InternalUseCaseDslLexer.g:36:4: ( 'OR' )
            // InternalUseCaseDslLexer.g:36:6: 'OR'
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
            // InternalUseCaseDslLexer.g:38:4: ( 'TO' )
            // InternalUseCaseDslLexer.g:38:6: 'TO'
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
            // InternalUseCaseDslLexer.g:40:4: ( 'UC' )
            // InternalUseCaseDslLexer.g:40:6: 'UC'
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
            // InternalUseCaseDslLexer.g:42:15: ( '\"' )
            // InternalUseCaseDslLexer.g:42:17: '\"'
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
            // InternalUseCaseDslLexer.g:44:12: ( '\\'' )
            // InternalUseCaseDslLexer.g:44:14: '\\''
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
            // InternalUseCaseDslLexer.g:46:10: ( '.' )
            // InternalUseCaseDslLexer.g:46:12: '.'
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
            // InternalUseCaseDslLexer.g:48:7: ( ':' )
            // InternalUseCaseDslLexer.g:48:9: ':'
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
            // InternalUseCaseDslLexer.g:50:11: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalUseCaseDslLexer.g:50:13: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // InternalUseCaseDslLexer.g:52:21: ()
            // InternalUseCaseDslLexer.g:52:23: 
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
            // InternalUseCaseDslLexer.g:54:19: ()
            // InternalUseCaseDslLexer.g:54:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_NL"
    public final void mRULE_NL() throws RecognitionException {
        try {
            int _type = RULE_NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:56:9: ( ( ' ' )* ( '\\r' )? '\\n' )
            // InternalUseCaseDslLexer.g:56:11: ( ' ' )* ( '\\r' )? '\\n'
            {
            // InternalUseCaseDslLexer.g:56:11: ( ' ' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUseCaseDslLexer.g:56:11: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalUseCaseDslLexer.g:56:16: ( '\\r' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\r') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalUseCaseDslLexer.g:56:16: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:58:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalUseCaseDslLexer.g:58:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalUseCaseDslLexer.g:58:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUseCaseDslLexer.g:58:11: '^'
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

            // InternalUseCaseDslLexer.g:58:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUseCaseDslLexer.g:
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
            	    break loop4;
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
            // InternalUseCaseDslLexer.g:60:10: ( ( '0' .. '9' )+ )
            // InternalUseCaseDslLexer.g:60:12: ( '0' .. '9' )+
            {
            // InternalUseCaseDslLexer.g:60:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUseCaseDslLexer.g:60:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // InternalUseCaseDslLexer.g:62:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalUseCaseDslLexer.g:62:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalUseCaseDslLexer.g:62:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCaseDslLexer.g:62:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalUseCaseDslLexer.g:62:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalUseCaseDslLexer.g:62:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUseCaseDslLexer.g:62:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalUseCaseDslLexer.g:62:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalUseCaseDslLexer.g:62:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalUseCaseDslLexer.g:62:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUseCaseDslLexer.g:62:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalUseCaseDslLexer.g:64:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalUseCaseDslLexer.g:64:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalUseCaseDslLexer.g:64:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUseCaseDslLexer.g:64:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalUseCaseDslLexer.g:66:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalUseCaseDslLexer.g:66:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalUseCaseDslLexer.g:66:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUseCaseDslLexer.g:66:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalUseCaseDslLexer.g:66:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUseCaseDslLexer.g:66:41: ( '\\r' )? '\\n'
                    {
                    // InternalUseCaseDslLexer.g:66:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalUseCaseDslLexer.g:66:41: '\\r'
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
            // InternalUseCaseDslLexer.g:68:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalUseCaseDslLexer.g:68:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalUseCaseDslLexer.g:68:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUseCaseDslLexer.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalUseCaseDslLexer.g:70:16: ( . )
            // InternalUseCaseDslLexer.g:70:18: .
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
        // InternalUseCaseDslLexer.g:1:8: ( ALTERNATIVEFLOW | POSTCONDITION | PRECONDITION | MAINFLOW | RETURN | SYSTEM | WHILE | USER | AND | END | IF | OR | TO | UC | QuotationMark | Apostrophe | FullStop | Colon | RULE_CHAR | RULE_NL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=27;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalUseCaseDslLexer.g:1:10: ALTERNATIVEFLOW
                {
                mALTERNATIVEFLOW(); 

                }
                break;
            case 2 :
                // InternalUseCaseDslLexer.g:1:26: POSTCONDITION
                {
                mPOSTCONDITION(); 

                }
                break;
            case 3 :
                // InternalUseCaseDslLexer.g:1:40: PRECONDITION
                {
                mPRECONDITION(); 

                }
                break;
            case 4 :
                // InternalUseCaseDslLexer.g:1:53: MAINFLOW
                {
                mMAINFLOW(); 

                }
                break;
            case 5 :
                // InternalUseCaseDslLexer.g:1:62: RETURN
                {
                mRETURN(); 

                }
                break;
            case 6 :
                // InternalUseCaseDslLexer.g:1:69: SYSTEM
                {
                mSYSTEM(); 

                }
                break;
            case 7 :
                // InternalUseCaseDslLexer.g:1:76: WHILE
                {
                mWHILE(); 

                }
                break;
            case 8 :
                // InternalUseCaseDslLexer.g:1:82: USER
                {
                mUSER(); 

                }
                break;
            case 9 :
                // InternalUseCaseDslLexer.g:1:87: AND
                {
                mAND(); 

                }
                break;
            case 10 :
                // InternalUseCaseDslLexer.g:1:91: END
                {
                mEND(); 

                }
                break;
            case 11 :
                // InternalUseCaseDslLexer.g:1:95: IF
                {
                mIF(); 

                }
                break;
            case 12 :
                // InternalUseCaseDslLexer.g:1:98: OR
                {
                mOR(); 

                }
                break;
            case 13 :
                // InternalUseCaseDslLexer.g:1:101: TO
                {
                mTO(); 

                }
                break;
            case 14 :
                // InternalUseCaseDslLexer.g:1:104: UC
                {
                mUC(); 

                }
                break;
            case 15 :
                // InternalUseCaseDslLexer.g:1:107: QuotationMark
                {
                mQuotationMark(); 

                }
                break;
            case 16 :
                // InternalUseCaseDslLexer.g:1:121: Apostrophe
                {
                mApostrophe(); 

                }
                break;
            case 17 :
                // InternalUseCaseDslLexer.g:1:132: FullStop
                {
                mFullStop(); 

                }
                break;
            case 18 :
                // InternalUseCaseDslLexer.g:1:141: Colon
                {
                mColon(); 

                }
                break;
            case 19 :
                // InternalUseCaseDslLexer.g:1:147: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 20 :
                // InternalUseCaseDslLexer.g:1:157: RULE_NL
                {
                mRULE_NL(); 

                }
                break;
            case 21 :
                // InternalUseCaseDslLexer.g:1:165: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 22 :
                // InternalUseCaseDslLexer.g:1:173: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // InternalUseCaseDslLexer.g:1:182: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 24 :
                // InternalUseCaseDslLexer.g:1:194: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // InternalUseCaseDslLexer.g:1:210: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 26 :
                // InternalUseCaseDslLexer.g:1:226: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 27 :
                // InternalUseCaseDslLexer.g:1:234: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\13\34\1\53\1\54\2\uffff\1\34\2\57\1\63\1\31\2\uffff\1\31\2\uffff\2\35\2\uffff\7\35\1\100\1\35\1\102\1\103\1\104\6\uffff\1\57\1\63\1\57\4\uffff\1\35\1\106\7\35\1\uffff\1\116\3\uffff\1\35\1\uffff\6\35\1\126\1\uffff\6\35\1\135\1\uffff\4\35\1\142\1\143\1\uffff\4\35\2\uffff\3\35\1\153\3\35\1\uffff\10\35\1\167\1\35\1\171\1\uffff\1\35\1\uffff\1\173\1\uffff";
    static final String DFA14_eofS =
        "\174\uffff";
    static final String DFA14_minS =
        "\1\0\13\60\2\0\2\uffff\1\60\2\12\1\11\1\101\2\uffff\1\52\2\uffff\1\124\1\104\2\uffff\1\123\1\105\1\111\1\124\1\123\1\111\1\105\1\60\1\104\3\60\6\uffff\1\12\1\11\1\12\4\uffff\1\105\1\60\1\124\1\103\1\116\1\125\1\124\1\114\1\122\1\uffff\1\60\3\uffff\1\122\1\uffff\1\103\1\117\1\106\1\122\2\105\1\60\1\uffff\1\116\1\117\1\116\1\114\1\116\1\115\1\60\1\uffff\1\101\1\116\1\104\1\117\2\60\1\uffff\1\124\1\104\1\111\1\127\2\uffff\2\111\1\124\1\60\1\126\1\124\1\111\1\uffff\1\105\1\111\1\117\1\106\1\117\1\116\1\114\1\116\1\60\1\117\1\60\1\uffff\1\127\1\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\13\172\2\uffff\2\uffff\1\172\1\40\1\12\1\40\1\172\2\uffff\1\57\2\uffff\1\124\1\104\2\uffff\1\123\1\105\1\111\1\124\1\123\1\111\1\105\1\172\1\104\3\172\6\uffff\1\12\2\40\4\uffff\1\105\1\172\1\124\1\103\1\116\1\125\1\124\1\114\1\122\1\uffff\1\172\3\uffff\1\122\1\uffff\1\103\1\117\1\106\1\122\2\105\1\172\1\uffff\1\116\1\117\1\116\1\114\1\116\1\115\1\172\1\uffff\1\101\1\116\1\104\1\117\2\172\1\uffff\1\124\1\104\1\111\1\127\2\uffff\2\111\1\124\1\172\1\126\1\124\1\111\1\uffff\1\105\1\111\1\117\1\106\1\117\1\116\1\114\1\116\1\172\1\117\1\172\1\uffff\1\127\1\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\16\uffff\1\21\1\22\5\uffff\1\25\1\26\1\uffff\1\32\1\33\2\uffff\1\23\1\25\14\uffff\1\27\1\17\1\20\1\21\1\22\1\32\3\uffff\1\24\1\26\1\30\1\31\11\uffff\1\16\1\uffff\1\13\1\14\1\15\1\uffff\1\11\7\uffff\1\12\7\uffff\1\10\6\uffff\1\7\4\uffff\1\5\1\6\7\uffff\1\4\13\uffff\1\3\1\uffff\1\2\1\uffff\1\1";
    static final String DFA14_specialS =
        "\1\1\13\uffff\1\0\1\2\156\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\31\1\30\1\23\2\31\1\22\22\31\1\21\1\31\1\14\4\31\1\15\6\31\1\16\1\27\12\26\1\17\6\31\1\1\3\20\1\10\3\20\1\11\3\20\1\3\1\20\1\12\1\2\1\20\1\4\1\5\1\13\1\7\1\20\1\6\3\20\3\31\1\24\1\25\1\31\32\20\uff85\31",
            "\12\35\7\uffff\13\35\1\32\1\35\1\33\14\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\16\35\1\36\2\35\1\37\10\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\1\40\31\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\4\35\1\41\25\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\30\35\1\42\1\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\7\35\1\43\22\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\2\35\1\45\17\35\1\44\7\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\15\35\1\46\14\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\5\35\1\47\24\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\21\35\1\50\10\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\16\35\1\51\13\35\4\uffff\1\35\1\uffff\32\35",
            "\0\52",
            "\0\52",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\61\2\uffff\1\60\22\uffff\1\62",
            "\1\61",
            "\2\57\2\uffff\1\57\22\uffff\1\57",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\1\65\4\uffff\1\66",
            "",
            "",
            "\1\67",
            "\1\70",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\101",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\61",
            "\2\57\2\uffff\1\57\22\uffff\1\57",
            "\1\61\2\uffff\1\60\22\uffff\1\62",
            "",
            "",
            "",
            "",
            "\1\105",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\170",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\172",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ALTERNATIVEFLOW | POSTCONDITION | PRECONDITION | MAINFLOW | RETURN | SYSTEM | WHILE | USER | AND | END | IF | OR | TO | UC | QuotationMark | Apostrophe | FullStop | Colon | RULE_CHAR | RULE_NL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_12 = input.LA(1);

                        s = -1;
                        if ( ((LA14_12>='\u0000' && LA14_12<='\uFFFF')) ) {s = 42;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='A') ) {s = 1;}

                        else if ( (LA14_0=='P') ) {s = 2;}

                        else if ( (LA14_0=='M') ) {s = 3;}

                        else if ( (LA14_0=='R') ) {s = 4;}

                        else if ( (LA14_0=='S') ) {s = 5;}

                        else if ( (LA14_0=='W') ) {s = 6;}

                        else if ( (LA14_0=='U') ) {s = 7;}

                        else if ( (LA14_0=='E') ) {s = 8;}

                        else if ( (LA14_0=='I') ) {s = 9;}

                        else if ( (LA14_0=='O') ) {s = 10;}

                        else if ( (LA14_0=='T') ) {s = 11;}

                        else if ( (LA14_0=='\"') ) {s = 12;}

                        else if ( (LA14_0=='\'') ) {s = 13;}

                        else if ( (LA14_0=='.') ) {s = 14;}

                        else if ( (LA14_0==':') ) {s = 15;}

                        else if ( ((LA14_0>='B' && LA14_0<='D')||(LA14_0>='F' && LA14_0<='H')||(LA14_0>='J' && LA14_0<='L')||LA14_0=='N'||LA14_0=='Q'||LA14_0=='V'||(LA14_0>='X' && LA14_0<='Z')||(LA14_0>='a' && LA14_0<='z')) ) {s = 16;}

                        else if ( (LA14_0==' ') ) {s = 17;}

                        else if ( (LA14_0=='\r') ) {s = 18;}

                        else if ( (LA14_0=='\n') ) {s = 19;}

                        else if ( (LA14_0=='^') ) {s = 20;}

                        else if ( (LA14_0=='_') ) {s = 21;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 22;}

                        else if ( (LA14_0=='/') ) {s = 23;}

                        else if ( (LA14_0=='\t') ) {s = 24;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='-')||(LA14_0>=';' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_13 = input.LA(1);

                        s = -1;
                        if ( ((LA14_13>='\u0000' && LA14_13<='\uFFFF')) ) {s = 42;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}