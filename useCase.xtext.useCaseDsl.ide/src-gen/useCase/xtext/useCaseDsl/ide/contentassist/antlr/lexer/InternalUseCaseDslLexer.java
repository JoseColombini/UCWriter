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
    public static final int RULE_STRING=27;
    public static final int UC=17;
    public static final int QuotationMark=18;
    public static final int RULE_SL_COMMENT=29;
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
    public static final int RULE_ID=25;
    public static final int RULE_WS=30;
    public static final int RULE_ANY_OTHER=31;
    public static final int USER=11;
    public static final int RULE_INT=26;
    public static final int AND=12;
    public static final int RULE_ML_COMMENT=28;
    public static final int WHILE=10;
    public static final int END=13;
    public static final int TO=16;

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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:56:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalUseCaseDslLexer.g:56:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalUseCaseDslLexer.g:56:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalUseCaseDslLexer.g:56:11: '^'
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

            // InternalUseCaseDslLexer.g:56:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            // InternalUseCaseDslLexer.g:58:10: ( ( '0' .. '9' )+ )
            // InternalUseCaseDslLexer.g:58:12: ( '0' .. '9' )+
            {
            // InternalUseCaseDslLexer.g:58:12: ( '0' .. '9' )+
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
            	    // InternalUseCaseDslLexer.g:58:13: '0' .. '9'
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
            // InternalUseCaseDslLexer.g:60:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalUseCaseDslLexer.g:60:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalUseCaseDslLexer.g:60:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalUseCaseDslLexer.g:60:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalUseCaseDslLexer.g:60:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalUseCaseDslLexer.g:60:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUseCaseDslLexer.g:60:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalUseCaseDslLexer.g:60:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalUseCaseDslLexer.g:60:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalUseCaseDslLexer.g:60:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUseCaseDslLexer.g:60:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalUseCaseDslLexer.g:62:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalUseCaseDslLexer.g:62:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalUseCaseDslLexer.g:62:24: ( options {greedy=false; } : . )*
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
            	    // InternalUseCaseDslLexer.g:62:52: .
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
            // InternalUseCaseDslLexer.g:64:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalUseCaseDslLexer.g:64:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalUseCaseDslLexer.g:64:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUseCaseDslLexer.g:64:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalUseCaseDslLexer.g:64:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUseCaseDslLexer.g:64:41: ( '\\r' )? '\\n'
                    {
                    // InternalUseCaseDslLexer.g:64:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalUseCaseDslLexer.g:64:41: '\\r'
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
            // InternalUseCaseDslLexer.g:66:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalUseCaseDslLexer.g:66:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalUseCaseDslLexer.g:66:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalUseCaseDslLexer.g:68:16: ( . )
            // InternalUseCaseDslLexer.g:68:18: .
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
        // InternalUseCaseDslLexer.g:1:8: ( ALTERNATIVEFLOW | POSTCONDITION | PRECONDITION | MAINFLOW | RETURN | SYSTEM | WHILE | USER | AND | END | IF | OR | TO | UC | QuotationMark | Apostrophe | FullStop | Colon | RULE_CHAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=26;
        alt12 = dfa12.predict(input);
        switch (alt12) {
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
                // InternalUseCaseDslLexer.g:1:157: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // InternalUseCaseDslLexer.g:1:165: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // InternalUseCaseDslLexer.g:1:174: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // InternalUseCaseDslLexer.g:1:186: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // InternalUseCaseDslLexer.g:1:202: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // InternalUseCaseDslLexer.g:1:218: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // InternalUseCaseDslLexer.g:1:226: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\13\31\1\47\1\51\2\uffff\1\31\1\26\2\uffff\1\26\2\uffff\2\32\2\uffff\7\32\1\71\1\32\1\73\1\74\1\75\11\uffff\1\32\1\77\7\32\1\uffff\1\107\3\uffff\1\32\1\uffff\6\32\1\117\1\uffff\6\32\1\126\1\uffff\4\32\1\133\1\134\1\uffff\4\32\2\uffff\3\32\1\144\3\32\1\uffff\10\32\1\160\1\32\1\162\1\uffff\1\32\1\uffff\1\164\1\uffff";
    static final String DFA12_eofS =
        "\165\uffff";
    static final String DFA12_minS =
        "\1\0\13\60\2\0\2\uffff\1\60\1\101\2\uffff\1\52\2\uffff\1\124\1\104\2\uffff\1\123\1\105\1\111\1\124\1\123\1\111\1\105\1\60\1\104\3\60\11\uffff\1\105\1\60\1\124\1\103\1\116\1\125\1\124\1\114\1\122\1\uffff\1\60\3\uffff\1\122\1\uffff\1\103\1\117\1\106\1\122\2\105\1\60\1\uffff\1\116\1\117\1\116\1\114\1\116\1\115\1\60\1\uffff\1\101\1\116\1\104\1\117\2\60\1\uffff\1\124\1\104\1\111\1\127\2\uffff\2\111\1\124\1\60\1\126\1\124\1\111\1\uffff\1\105\1\111\1\117\1\106\1\117\1\116\1\114\1\116\1\60\1\117\1\60\1\uffff\1\127\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\13\172\2\uffff\2\uffff\2\172\2\uffff\1\57\2\uffff\1\124\1\104\2\uffff\1\123\1\105\1\111\1\124\1\123\1\111\1\105\1\172\1\104\3\172\11\uffff\1\105\1\172\1\124\1\103\1\116\1\125\1\124\1\114\1\122\1\uffff\1\172\3\uffff\1\122\1\uffff\1\103\1\117\1\106\1\122\2\105\1\172\1\uffff\1\116\1\117\1\116\1\114\1\116\1\115\1\172\1\uffff\1\101\1\116\1\104\1\117\2\172\1\uffff\1\124\1\104\1\111\1\127\2\uffff\2\111\1\124\1\172\1\126\1\124\1\111\1\uffff\1\105\1\111\1\117\1\106\1\117\1\116\1\114\1\116\1\172\1\117\1\172\1\uffff\1\127\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\16\uffff\1\21\1\22\2\uffff\1\24\1\25\1\uffff\1\31\1\32\2\uffff\1\23\1\24\14\uffff\1\17\1\26\1\20\1\21\1\22\1\25\1\27\1\30\1\31\11\uffff\1\16\1\uffff\1\13\1\14\1\15\1\uffff\1\11\7\uffff\1\12\7\uffff\1\10\6\uffff\1\7\4\uffff\1\5\1\6\7\uffff\1\4\13\uffff\1\3\1\uffff\1\2\1\uffff\1\1";
    static final String DFA12_specialS =
        "\1\2\13\uffff\1\1\1\0\147\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\14\4\26\1\15\6\26\1\16\1\24\12\23\1\17\6\26\1\1\3\20\1\10\3\20\1\11\3\20\1\3\1\20\1\12\1\2\1\20\1\4\1\5\1\13\1\7\1\20\1\6\3\20\3\26\1\21\1\22\1\26\32\20\uff85\26",
            "\12\32\7\uffff\13\32\1\27\1\32\1\30\14\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\16\32\1\33\2\32\1\34\10\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\1\35\31\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\4\32\1\36\25\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\30\32\1\37\1\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\7\32\1\40\22\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\2\32\1\42\17\32\1\41\7\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\15\32\1\43\14\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\5\32\1\44\24\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\21\32\1\45\10\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\16\32\1\46\13\32\4\uffff\1\32\1\uffff\32\32",
            "\0\50",
            "\0\50",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\55\4\uffff\1\56",
            "",
            "",
            "\1\60",
            "\1\61",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\72",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\76",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\161",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\163",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
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
            return "1:1: Tokens : ( ALTERNATIVEFLOW | POSTCONDITION | PRECONDITION | MAINFLOW | RETURN | SYSTEM | WHILE | USER | AND | END | IF | OR | TO | UC | QuotationMark | Apostrophe | FullStop | Colon | RULE_CHAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_13 = input.LA(1);

                        s = -1;
                        if ( ((LA12_13>='\u0000' && LA12_13<='\uFFFF')) ) {s = 40;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_12 = input.LA(1);

                        s = -1;
                        if ( ((LA12_12>='\u0000' && LA12_12<='\uFFFF')) ) {s = 40;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='A') ) {s = 1;}

                        else if ( (LA12_0=='P') ) {s = 2;}

                        else if ( (LA12_0=='M') ) {s = 3;}

                        else if ( (LA12_0=='R') ) {s = 4;}

                        else if ( (LA12_0=='S') ) {s = 5;}

                        else if ( (LA12_0=='W') ) {s = 6;}

                        else if ( (LA12_0=='U') ) {s = 7;}

                        else if ( (LA12_0=='E') ) {s = 8;}

                        else if ( (LA12_0=='I') ) {s = 9;}

                        else if ( (LA12_0=='O') ) {s = 10;}

                        else if ( (LA12_0=='T') ) {s = 11;}

                        else if ( (LA12_0=='\"') ) {s = 12;}

                        else if ( (LA12_0=='\'') ) {s = 13;}

                        else if ( (LA12_0=='.') ) {s = 14;}

                        else if ( (LA12_0==':') ) {s = 15;}

                        else if ( ((LA12_0>='B' && LA12_0<='D')||(LA12_0>='F' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='L')||LA12_0=='N'||LA12_0=='Q'||LA12_0=='V'||(LA12_0>='X' && LA12_0<='Z')||(LA12_0>='a' && LA12_0<='z')) ) {s = 16;}

                        else if ( (LA12_0=='^') ) {s = 17;}

                        else if ( (LA12_0=='_') ) {s = 18;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 19;}

                        else if ( (LA12_0=='/') ) {s = 20;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 21;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='-')||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 22;}

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