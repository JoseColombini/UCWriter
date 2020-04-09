package useCase.xtext.useCaseDsl.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseDslLexer extends Lexer {
    public static final int RULE_END=21;
    public static final int User=8;
    public static final int RULE_BEGIN=20;
    public static final int KW_System=7;
    public static final int AlternativeFlow=4;
    public static final int RULE_STRING=24;
    public static final int UC=13;
    public static final int QuotationMark=15;
    public static final int RULE_SL_COMMENT=26;
    public static final int RULE_CHAR=19;
    public static final int To=14;
    public static final int Colon=18;
    public static final int EOF=-1;
    public static final int IF=11;
    public static final int Apostrophe=16;
    public static final int FullStop=17;
    public static final int Return=6;
    public static final int OR=12;
    public static final int RULE_ID=22;
    public static final int RULE_WS=27;
    public static final int RULE_ANY_OTHER=28;
    public static final int MainFlow=5;
    public static final int RULE_INT=23;
    public static final int AND=9;
    public static final int RULE_ML_COMMENT=25;
    public static final int END=10;

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

    // $ANTLR start "AlternativeFlow"
    public final void mAlternativeFlow() throws RecognitionException {
        try {
            int _type = AlternativeFlow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:14:17: ( 'AlternativeFlow' )
            // InternalUseCaseDslLexer.g:14:19: 'AlternativeFlow'
            {
            match("AlternativeFlow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AlternativeFlow"

    // $ANTLR start "MainFlow"
    public final void mMainFlow() throws RecognitionException {
        try {
            int _type = MainFlow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:16:10: ( 'MainFlow' )
            // InternalUseCaseDslLexer.g:16:12: 'MainFlow'
            {
            match("MainFlow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MainFlow"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:18:8: ( 'Return' )
            // InternalUseCaseDslLexer.g:18:10: 'Return'
            {
            match("Return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "KW_System"
    public final void mKW_System() throws RecognitionException {
        try {
            int _type = KW_System;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:20:11: ( 'System' )
            // InternalUseCaseDslLexer.g:20:13: 'System'
            {
            match("System"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KW_System"

    // $ANTLR start "User"
    public final void mUser() throws RecognitionException {
        try {
            int _type = User;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:22:6: ( 'User' )
            // InternalUseCaseDslLexer.g:22:8: 'User'
            {
            match("User"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "User"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:24:5: ( 'AND' )
            // InternalUseCaseDslLexer.g:24:7: 'AND'
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
            // InternalUseCaseDslLexer.g:26:5: ( 'END' )
            // InternalUseCaseDslLexer.g:26:7: 'END'
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
            // InternalUseCaseDslLexer.g:28:4: ( 'IF' )
            // InternalUseCaseDslLexer.g:28:6: 'IF'
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
            // InternalUseCaseDslLexer.g:30:4: ( 'OR' )
            // InternalUseCaseDslLexer.g:30:6: 'OR'
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

    // $ANTLR start "UC"
    public final void mUC() throws RecognitionException {
        try {
            int _type = UC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:32:4: ( 'UC' )
            // InternalUseCaseDslLexer.g:32:6: 'UC'
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

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:34:4: ( 'to' )
            // InternalUseCaseDslLexer.g:34:6: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "QuotationMark"
    public final void mQuotationMark() throws RecognitionException {
        try {
            int _type = QuotationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUseCaseDslLexer.g:36:15: ( '\"' )
            // InternalUseCaseDslLexer.g:36:17: '\"'
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
            // InternalUseCaseDslLexer.g:38:12: ( '\\'' )
            // InternalUseCaseDslLexer.g:38:14: '\\''
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
            // InternalUseCaseDslLexer.g:40:10: ( '.' )
            // InternalUseCaseDslLexer.g:40:12: '.'
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
            // InternalUseCaseDslLexer.g:42:7: ( ':' )
            // InternalUseCaseDslLexer.g:42:9: ':'
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
            // InternalUseCaseDslLexer.g:44:11: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalUseCaseDslLexer.g:44:13: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // InternalUseCaseDslLexer.g:46:21: ()
            // InternalUseCaseDslLexer.g:46:23: 
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
            // InternalUseCaseDslLexer.g:48:19: ()
            // InternalUseCaseDslLexer.g:48:21: 
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
            // InternalUseCaseDslLexer.g:50:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalUseCaseDslLexer.g:50:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalUseCaseDslLexer.g:50:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalUseCaseDslLexer.g:50:11: '^'
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

            // InternalUseCaseDslLexer.g:50:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalUseCaseDslLexer.g:52:10: ( ( '0' .. '9' )+ )
            // InternalUseCaseDslLexer.g:52:12: ( '0' .. '9' )+
            {
            // InternalUseCaseDslLexer.g:52:12: ( '0' .. '9' )+
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
            	    // InternalUseCaseDslLexer.g:52:13: '0' .. '9'
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
            // InternalUseCaseDslLexer.g:54:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalUseCaseDslLexer.g:54:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalUseCaseDslLexer.g:54:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalUseCaseDslLexer.g:54:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalUseCaseDslLexer.g:54:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalUseCaseDslLexer.g:54:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUseCaseDslLexer.g:54:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalUseCaseDslLexer.g:54:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalUseCaseDslLexer.g:54:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalUseCaseDslLexer.g:54:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUseCaseDslLexer.g:54:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalUseCaseDslLexer.g:56:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalUseCaseDslLexer.g:56:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalUseCaseDslLexer.g:56:24: ( options {greedy=false; } : . )*
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
            	    // InternalUseCaseDslLexer.g:56:52: .
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
            // InternalUseCaseDslLexer.g:58:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalUseCaseDslLexer.g:58:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalUseCaseDslLexer.g:58:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUseCaseDslLexer.g:58:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalUseCaseDslLexer.g:58:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUseCaseDslLexer.g:58:41: ( '\\r' )? '\\n'
                    {
                    // InternalUseCaseDslLexer.g:58:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalUseCaseDslLexer.g:58:41: '\\r'
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
            // InternalUseCaseDslLexer.g:60:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalUseCaseDslLexer.g:60:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalUseCaseDslLexer.g:60:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalUseCaseDslLexer.g:62:16: ( . )
            // InternalUseCaseDslLexer.g:62:18: .
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
        // InternalUseCaseDslLexer.g:1:8: ( AlternativeFlow | MainFlow | Return | KW_System | User | AND | END | IF | OR | UC | To | QuotationMark | Apostrophe | FullStop | Colon | RULE_CHAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=23;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalUseCaseDslLexer.g:1:10: AlternativeFlow
                {
                mAlternativeFlow(); 

                }
                break;
            case 2 :
                // InternalUseCaseDslLexer.g:1:26: MainFlow
                {
                mMainFlow(); 

                }
                break;
            case 3 :
                // InternalUseCaseDslLexer.g:1:35: Return
                {
                mReturn(); 

                }
                break;
            case 4 :
                // InternalUseCaseDslLexer.g:1:42: KW_System
                {
                mKW_System(); 

                }
                break;
            case 5 :
                // InternalUseCaseDslLexer.g:1:52: User
                {
                mUser(); 

                }
                break;
            case 6 :
                // InternalUseCaseDslLexer.g:1:57: AND
                {
                mAND(); 

                }
                break;
            case 7 :
                // InternalUseCaseDslLexer.g:1:61: END
                {
                mEND(); 

                }
                break;
            case 8 :
                // InternalUseCaseDslLexer.g:1:65: IF
                {
                mIF(); 

                }
                break;
            case 9 :
                // InternalUseCaseDslLexer.g:1:68: OR
                {
                mOR(); 

                }
                break;
            case 10 :
                // InternalUseCaseDslLexer.g:1:71: UC
                {
                mUC(); 

                }
                break;
            case 11 :
                // InternalUseCaseDslLexer.g:1:74: To
                {
                mTo(); 

                }
                break;
            case 12 :
                // InternalUseCaseDslLexer.g:1:77: QuotationMark
                {
                mQuotationMark(); 

                }
                break;
            case 13 :
                // InternalUseCaseDslLexer.g:1:91: Apostrophe
                {
                mApostrophe(); 

                }
                break;
            case 14 :
                // InternalUseCaseDslLexer.g:1:102: FullStop
                {
                mFullStop(); 

                }
                break;
            case 15 :
                // InternalUseCaseDslLexer.g:1:111: Colon
                {
                mColon(); 

                }
                break;
            case 16 :
                // InternalUseCaseDslLexer.g:1:117: RULE_CHAR
                {
                mRULE_CHAR(); 

                }
                break;
            case 17 :
                // InternalUseCaseDslLexer.g:1:127: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // InternalUseCaseDslLexer.g:1:135: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // InternalUseCaseDslLexer.g:1:144: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // InternalUseCaseDslLexer.g:1:156: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // InternalUseCaseDslLexer.g:1:172: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // InternalUseCaseDslLexer.g:1:188: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // InternalUseCaseDslLexer.g:1:196: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\11\27\1\43\1\44\2\uffff\1\27\1\24\2\uffff\1\24\2\uffff\2\30\2\uffff\4\30\1\61\1\30\1\63\1\64\1\65\11\uffff\1\30\1\67\4\30\1\uffff\1\74\3\uffff\1\30\1\uffff\3\30\1\101\1\uffff\4\30\1\uffff\2\30\1\110\1\111\2\30\2\uffff\1\30\1\115\1\30\1\uffff\5\30\1\124\1\uffff";
    static final String DFA12_eofS =
        "\125\uffff";
    static final String DFA12_minS =
        "\1\0\11\60\2\0\2\uffff\1\60\1\101\2\uffff\1\52\2\uffff\1\164\1\104\2\uffff\1\151\1\164\1\163\1\145\1\60\1\104\3\60\11\uffff\1\145\1\60\1\156\1\165\1\164\1\162\1\uffff\1\60\3\uffff\1\162\1\uffff\1\106\1\162\1\145\1\60\1\uffff\1\156\1\154\1\156\1\155\1\uffff\1\141\1\157\2\60\1\164\1\167\2\uffff\1\151\1\60\1\166\1\uffff\1\145\1\106\1\154\1\157\1\167\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\11\172\2\uffff\2\uffff\2\172\2\uffff\1\57\2\uffff\1\164\1\104\2\uffff\1\151\1\164\1\163\1\145\1\172\1\104\3\172\11\uffff\1\145\1\172\1\156\1\165\1\164\1\162\1\uffff\1\172\3\uffff\1\162\1\uffff\1\106\1\162\1\145\1\172\1\uffff\1\156\1\154\1\156\1\155\1\uffff\1\141\1\157\2\172\1\164\1\167\2\uffff\1\151\1\172\1\166\1\uffff\1\145\1\106\1\154\1\157\1\167\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\14\uffff\1\16\1\17\2\uffff\1\21\1\22\1\uffff\1\26\1\27\2\uffff\1\20\1\21\11\uffff\1\23\1\14\1\15\1\16\1\17\1\22\1\24\1\25\1\26\6\uffff\1\12\1\uffff\1\10\1\11\1\13\1\uffff\1\6\4\uffff\1\7\4\uffff\1\5\6\uffff\1\3\1\4\3\uffff\1\2\6\uffff\1\1";
    static final String DFA12_specialS =
        "\1\2\11\uffff\1\0\1\1\111\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\12\4\24\1\13\6\24\1\14\1\22\12\21\1\15\6\24\1\1\3\16\1\6\3\16\1\7\3\16\1\2\1\16\1\10\2\16\1\3\1\4\1\16\1\5\5\16\3\24\1\17\1\20\1\24\23\16\1\11\6\16\uff85\24",
            "\12\30\7\uffff\15\30\1\26\14\30\4\uffff\1\30\1\uffff\13\30\1\25\16\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\1\31\31\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\4\30\1\32\25\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\30\30\1\33\1\30",
            "\12\30\7\uffff\2\30\1\35\27\30\4\uffff\1\30\1\uffff\22\30\1\34\7\30",
            "\12\30\7\uffff\15\30\1\36\14\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\5\30\1\37\24\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\21\30\1\40\10\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\16\30\1\41\13\30",
            "\0\42",
            "\0\42",
            "",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\1\50\4\uffff\1\51",
            "",
            "",
            "\1\53",
            "\1\54",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\62",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\66",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\112",
            "\1\113",
            "",
            "",
            "\1\114",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
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
            return "1:1: Tokens : ( AlternativeFlow | MainFlow | Return | KW_System | User | AND | END | IF | OR | UC | To | QuotationMark | Apostrophe | FullStop | Colon | RULE_CHAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_10 = input.LA(1);

                        s = -1;
                        if ( ((LA12_10>='\u0000' && LA12_10<='\uFFFF')) ) {s = 34;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_11 = input.LA(1);

                        s = -1;
                        if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFF')) ) {s = 34;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='A') ) {s = 1;}

                        else if ( (LA12_0=='M') ) {s = 2;}

                        else if ( (LA12_0=='R') ) {s = 3;}

                        else if ( (LA12_0=='S') ) {s = 4;}

                        else if ( (LA12_0=='U') ) {s = 5;}

                        else if ( (LA12_0=='E') ) {s = 6;}

                        else if ( (LA12_0=='I') ) {s = 7;}

                        else if ( (LA12_0=='O') ) {s = 8;}

                        else if ( (LA12_0=='t') ) {s = 9;}

                        else if ( (LA12_0=='\"') ) {s = 10;}

                        else if ( (LA12_0=='\'') ) {s = 11;}

                        else if ( (LA12_0=='.') ) {s = 12;}

                        else if ( (LA12_0==':') ) {s = 13;}

                        else if ( ((LA12_0>='B' && LA12_0<='D')||(LA12_0>='F' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='L')||LA12_0=='N'||(LA12_0>='P' && LA12_0<='Q')||LA12_0=='T'||(LA12_0>='V' && LA12_0<='Z')||(LA12_0>='a' && LA12_0<='s')||(LA12_0>='u' && LA12_0<='z')) ) {s = 14;}

                        else if ( (LA12_0=='^') ) {s = 15;}

                        else if ( (LA12_0=='_') ) {s = 16;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 17;}

                        else if ( (LA12_0=='/') ) {s = 18;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 19;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='-')||(LA12_0>=';' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 20;}

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