package org.osate.ocarina.real.xtext.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalREALLexer extends Lexer {
    public static final int RULE_ID=76;
    public static final int RULE_AFFECTATION_OPERATOR=69;
    public static final int RULE_PUNC_CLOSE_PARENTHESIS=74;
    public static final int RULE_PUNC_OPEN_PARENTHESIS=73;
    public static final int RULE_GREATER_EQUAL=65;
    public static final int RULE_NOT_EQUAL=63;
    public static final int KEYWORD_19=37;
    public static final int KEYWORD_54=4;
    public static final int KEYWORD_17=35;
    public static final int RULE_PUNC_CLOSE_BRACE=71;
    public static final int KEYWORD_53=7;
    public static final int KEYWORD_18=36;
    public static final int KEYWORD_15=52;
    public static final int KEYWORD_52=6;
    public static final int KEYWORD_51=5;
    public static final int KEYWORD_16=34;
    public static final int KEYWORD_13=50;
    public static final int KEYWORD_50=8;
    public static final int KEYWORD_14=51;
    public static final int KEYWORD_11=48;
    public static final int RULE_PUNC_COMMA=75;
    public static final int KEYWORD_12=49;
    public static final int EOF=-1;
    public static final int KEYWORD_10=47;
    public static final int KEYWORD_6=43;
    public static final int KEYWORD_7=44;
    public static final int KEYWORD_8=45;
    public static final int KEYWORD_9=46;
    public static final int RULE_LESS_EQUAL=64;
    public static final int KEYWORD_28=31;
    public static final int KEYWORD_29=32;
    public static final int KEYWORD_24=42;
    public static final int KEYWORD_25=28;
    public static final int RULE_POWER=59;
    public static final int KEYWORD_26=29;
    public static final int KEYWORD_27=30;
    public static final int KEYWORD_20=38;
    public static final int KEYWORD_21=39;
    public static final int KEYWORD_22=40;
    public static final int KEYWORD_23=41;
    public static final int RULE_GREATER=66;
    public static final int RULE_PLUS=58;
    public static final int KEYWORD_1=57;
    public static final int KEYWORD_30=33;
    public static final int RULE_PUNC_SEMI_COLON=72;
    public static final int KEYWORD_5=56;
    public static final int KEYWORD_34=21;
    public static final int RULE_EQUAL=68;
    public static final int KEYWORD_4=55;
    public static final int KEYWORD_33=27;
    public static final int KEYWORD_3=54;
    public static final int KEYWORD_32=26;
    public static final int KEYWORD_2=53;
    public static final int KEYWORD_31=25;
    public static final int KEYWORD_38=18;
    public static final int RULE_SL_COMMENT=78;
    public static final int KEYWORD_37=24;
    public static final int KEYWORD_36=23;
    public static final int KEYWORD_35=22;
    public static final int KEYWORD_39=19;
    public static final int RULE_MINUS=62;
    public static final int RULE_STRING=77;
    public static final int RULE_NUMERIC=80;
    public static final int RULE_PUNC_OPEN_BRACE=70;
    public static final int RULE_STAR=60;
    public static final int KEYWORD_41=16;
    public static final int RULE_LESS=67;
    public static final int KEYWORD_40=20;
    public static final int KEYWORD_43=15;
    public static final int RULE_SLASH=61;
    public static final int KEYWORD_42=17;
    public static final int KEYWORD_45=13;
    public static final int KEYWORD_44=14;
    public static final int RULE_WS=79;
    public static final int KEYWORD_47=11;
    public static final int KEYWORD_46=10;
    public static final int KEYWORD_49=9;
    public static final int KEYWORD_48=12;

    // delegates
    // delegators

    public InternalREALLexer() {;} 
    public InternalREALLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalREALLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g"; }

    // $ANTLR start "KEYWORD_54"
    public final void mKEYWORD_54() throws RecognitionException {
        try {
            int _type = KEYWORD_54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:19:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'E' | 'e' ) '_' ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'Y' | 'y' ) '_' ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:19:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'E' | 'e' ) '_' ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'Y' | 'y' ) '_' ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "KEYWORD_54"

    // $ANTLR start "KEYWORD_51"
    public final void mKEYWORD_51() throws RecognitionException {
        try {
            int _type = KEYWORD_51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:21:12: ( ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'T' | 't' ) '_' ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'Y' | 'y' ) '_' ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:21:14: ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'T' | 't' ) '_' ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'Y' | 'y' ) '_' ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "KEYWORD_51"

    // $ANTLR start "KEYWORD_52"
    public final void mKEYWORD_52() throws RecognitionException {
        try {
            int _type = KEYWORD_52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:23:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) '_' ( 'T' | 't' ) ( 'H' | 'h' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'G' | 'g' ) ( 'H' | 'h' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:23:14: ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) '_' ( 'T' | 't' ) ( 'H' | 'h' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'G' | 'g' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
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
    // $ANTLR end "KEYWORD_52"

    // $ANTLR start "KEYWORD_53"
    public final void mKEYWORD_53() throws RecognitionException {
        try {
            int _type = KEYWORD_53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:25:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'O' | 'o' ) ( 'F' | 'f' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:25:14: ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) '_' ( 'O' | 'o' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
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
    // $ANTLR end "KEYWORD_53"

    // $ANTLR start "KEYWORD_50"
    public final void mKEYWORD_50() throws RecognitionException {
        try {
            int _type = KEYWORD_50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:27:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'D' | 'd' ) '_' ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:27:14: ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'D' | 'd' ) '_' ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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
    // $ANTLR end "KEYWORD_50"

    // $ANTLR start "KEYWORD_49"
    public final void mKEYWORD_49() throws RecognitionException {
        try {
            int _type = KEYWORD_49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:29:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) '_' ( 'T' | 't' ) ( 'O' | 'o' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:29:14: ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) '_' ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
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
    // $ANTLR end "KEYWORD_49"

    // $ANTLR start "KEYWORD_46"
    public final void mKEYWORD_46() throws RecognitionException {
        try {
            int _type = KEYWORD_46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:31:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) '_' ( 'T' | 't' ) ( 'O' | 'o' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:31:14: ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) '_' ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
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
    // $ANTLR end "KEYWORD_46"

    // $ANTLR start "KEYWORD_47"
    public final void mKEYWORD_47() throws RecognitionException {
        try {
            int _type = KEYWORD_47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:33:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'D' | 'd' ) '_' ( 'T' | 't' ) ( 'O' | 'o' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:33:14: ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'D' | 'd' ) '_' ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
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
    // $ANTLR end "KEYWORD_47"

    // $ANTLR start "KEYWORD_48"
    public final void mKEYWORD_48() throws RecognitionException {
        try {
            int _type = KEYWORD_48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:35:12: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'Y' | 'y' ) '_' ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:35:14: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'Y' | 'y' ) '_' ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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
    // $ANTLR end "KEYWORD_48"

    // $ANTLR start "KEYWORD_45"
    public final void mKEYWORD_45() throws RecognitionException {
        try {
            int _type = KEYWORD_45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:37:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'D' | 'd' ) '_' ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:37:14: ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'D' | 'd' ) '_' ( 'B' | 'b' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
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
    // $ANTLR end "KEYWORD_45"

    // $ANTLR start "KEYWORD_44"
    public final void mKEYWORD_44() throws RecognitionException {
        try {
            int _type = KEYWORD_44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:39:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'D' | 'd' ) '_' ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:39:14: ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'D' | 'd' ) '_' ( 'B' | 'b' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
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
    // $ANTLR end "KEYWORD_44"

    // $ANTLR start "KEYWORD_43"
    public final void mKEYWORD_43() throws RecognitionException {
        try {
            int _type = KEYWORD_43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:41:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) '_' ( 'T' | 't' ) ( 'O' | 'o' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:41:14: ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) '_' ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
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
    // $ANTLR end "KEYWORD_43"

    // $ANTLR start "KEYWORD_41"
    public final void mKEYWORD_41() throws RecognitionException {
        try {
            int _type = KEYWORD_41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:43:12: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) '_' ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:43:14: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) '_' ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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
    // $ANTLR end "KEYWORD_41"

    // $ANTLR start "KEYWORD_42"
    public final void mKEYWORD_42() throws RecognitionException {
        try {
            int _type = KEYWORD_42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:45:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:45:14: ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
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
    // $ANTLR end "KEYWORD_42"

    // $ANTLR start "KEYWORD_38"
    public final void mKEYWORD_38() throws RecognitionException {
        try {
            int _type = KEYWORD_38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:47:12: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:47:14: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
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
    // $ANTLR end "KEYWORD_38"

    // $ANTLR start "KEYWORD_39"
    public final void mKEYWORD_39() throws RecognitionException {
        try {
            int _type = KEYWORD_39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:49:12: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'Y' | 'y' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:49:14: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
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
    // $ANTLR end "KEYWORD_39"

    // $ANTLR start "KEYWORD_40"
    public final void mKEYWORD_40() throws RecognitionException {
        try {
            int _type = KEYWORD_40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:51:12: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:51:14: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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
    // $ANTLR end "KEYWORD_40"

    // $ANTLR start "KEYWORD_34"
    public final void mKEYWORD_34() throws RecognitionException {
        try {
            int _type = KEYWORD_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:53:12: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:53:14: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
    // $ANTLR end "KEYWORD_34"

    // $ANTLR start "KEYWORD_35"
    public final void mKEYWORD_35() throws RecognitionException {
        try {
            int _type = KEYWORD_35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:55:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:55:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "KEYWORD_35"

    // $ANTLR start "KEYWORD_36"
    public final void mKEYWORD_36() throws RecognitionException {
        try {
            int _type = KEYWORD_36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:57:12: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:57:14: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
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
    // $ANTLR end "KEYWORD_36"

    // $ANTLR start "KEYWORD_37"
    public final void mKEYWORD_37() throws RecognitionException {
        try {
            int _type = KEYWORD_37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:59:12: ( ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'M' | 'm' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:59:14: ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
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
    // $ANTLR end "KEYWORD_37"

    // $ANTLR start "KEYWORD_31"
    public final void mKEYWORD_31() throws RecognitionException {
        try {
            int _type = KEYWORD_31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:61:12: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:61:14: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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
    // $ANTLR end "KEYWORD_31"

    // $ANTLR start "KEYWORD_32"
    public final void mKEYWORD_32() throws RecognitionException {
        try {
            int _type = KEYWORD_32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:63:12: ( ( 'S' | 's' ) ( 'Y' | 'y' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'M' | 'm' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:63:14: ( 'S' | 's' ) ( 'Y' | 'y' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
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
    // $ANTLR end "KEYWORD_32"

    // $ANTLR start "KEYWORD_33"
    public final void mKEYWORD_33() throws RecognitionException {
        try {
            int _type = KEYWORD_33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:65:12: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:65:14: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
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
    // $ANTLR end "KEYWORD_33"

    // $ANTLR start "KEYWORD_25"
    public final void mKEYWORD_25() throws RecognitionException {
        try {
            int _type = KEYWORD_25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:67:12: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:67:14: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
    // $ANTLR end "KEYWORD_25"

    // $ANTLR start "KEYWORD_26"
    public final void mKEYWORD_26() throws RecognitionException {
        try {
            int _type = KEYWORD_26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:69:12: ( ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'T' | 't' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:69:14: ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
    // $ANTLR end "KEYWORD_26"

    // $ANTLR start "KEYWORD_27"
    public final void mKEYWORD_27() throws RecognitionException {
        try {
            int _type = KEYWORD_27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:71:12: ( ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:71:14: ( 'I' | 'i' ) ( 'S' | 's' ) '_' ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
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
    // $ANTLR end "KEYWORD_27"

    // $ANTLR start "KEYWORD_28"
    public final void mKEYWORD_28() throws RecognitionException {
        try {
            int _type = KEYWORD_28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:73:12: ( ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:73:14: ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "KEYWORD_28"

    // $ANTLR start "KEYWORD_29"
    public final void mKEYWORD_29() throws RecognitionException {
        try {
            int _type = KEYWORD_29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:75:12: ( ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'K' | 'k' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:75:14: ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
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
    // $ANTLR end "KEYWORD_29"

    // $ANTLR start "KEYWORD_30"
    public final void mKEYWORD_30() throws RecognitionException {
        try {
            int _type = KEYWORD_30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:77:12: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:77:14: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "KEYWORD_30"

    // $ANTLR start "KEYWORD_16"
    public final void mKEYWORD_16() throws RecognitionException {
        try {
            int _type = KEYWORD_16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:79:12: ( ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:79:14: ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
    // $ANTLR end "KEYWORD_16"

    // $ANTLR start "KEYWORD_17"
    public final void mKEYWORD_17() throws RecognitionException {
        try {
            int _type = KEYWORD_17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:81:12: ( ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:81:14: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
    // $ANTLR end "KEYWORD_17"

    // $ANTLR start "KEYWORD_18"
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:83:12: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:83:14: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
    // $ANTLR end "KEYWORD_18"

    // $ANTLR start "KEYWORD_19"
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:85:12: ( ( 'M' | 'm' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:85:14: ( 'M' | 'm' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
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
    // $ANTLR end "KEYWORD_19"

    // $ANTLR start "KEYWORD_20"
    public final void mKEYWORD_20() throws RecognitionException {
        try {
            int _type = KEYWORD_20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:87:12: ( ( 'M' | 'm' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:87:14: ( 'M' | 'm' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
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
    // $ANTLR end "KEYWORD_20"

    // $ANTLR start "KEYWORD_21"
    public final void mKEYWORD_21() throws RecognitionException {
        try {
            int _type = KEYWORD_21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:89:12: ( ( 'S' | 's' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:89:14: ( 'S' | 's' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "KEYWORD_21"

    // $ANTLR start "KEYWORD_22"
    public final void mKEYWORD_22() throws RecognitionException {
        try {
            int _type = KEYWORD_22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:91:12: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:91:14: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "KEYWORD_22"

    // $ANTLR start "KEYWORD_23"
    public final void mKEYWORD_23() throws RecognitionException {
        try {
            int _type = KEYWORD_23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:93:12: ( ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:93:14: ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
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
    // $ANTLR end "KEYWORD_23"

    // $ANTLR start "KEYWORD_24"
    public final void mKEYWORD_24() throws RecognitionException {
        try {
            int _type = KEYWORD_24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:95:12: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:95:14: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
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
    // $ANTLR end "KEYWORD_24"

    // $ANTLR start "KEYWORD_6"
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:97:11: ( ( 'G' | 'g' ) ( 'C' | 'c' ) ( 'D' | 'd' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:97:13: ( 'G' | 'g' ) ( 'C' | 'c' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
    // $ANTLR end "KEYWORD_6"

    // $ANTLR start "KEYWORD_7"
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:99:11: ( ( 'L' | 'l' ) ( 'C' | 'c' ) ( 'M' | 'm' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:99:13: ( 'L' | 'l' ) ( 'C' | 'c' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
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
    // $ANTLR end "KEYWORD_7"

    // $ANTLR start "KEYWORD_8"
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:101:11: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:101:13: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
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
    // $ANTLR end "KEYWORD_8"

    // $ANTLR start "KEYWORD_9"
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:103:11: ( ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:103:13: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
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
    // $ANTLR end "KEYWORD_9"

    // $ANTLR start "KEYWORD_10"
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:105:12: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:105:14: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
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
    // $ANTLR end "KEYWORD_10"

    // $ANTLR start "KEYWORD_11"
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:107:12: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:107:14: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
    // $ANTLR end "KEYWORD_11"

    // $ANTLR start "KEYWORD_12"
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:109:12: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:109:14: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
    // $ANTLR end "KEYWORD_12"

    // $ANTLR start "KEYWORD_13"
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:111:12: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:111:14: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
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
    // $ANTLR end "KEYWORD_13"

    // $ANTLR start "KEYWORD_14"
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:113:12: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:113:14: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
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
    // $ANTLR end "KEYWORD_14"

    // $ANTLR start "KEYWORD_15"
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:115:12: ( ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:115:14: ( 'V' | 'v' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
    // $ANTLR end "KEYWORD_15"

    // $ANTLR start "KEYWORD_2"
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:117:11: ( ( 'D' | 'd' ) ( 'O' | 'o' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:117:13: ( 'D' | 'd' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
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
    // $ANTLR end "KEYWORD_2"

    // $ANTLR start "KEYWORD_3"
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:119:11: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:119:13: ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
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
    // $ANTLR end "KEYWORD_3"

    // $ANTLR start "KEYWORD_4"
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:121:11: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:121:13: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
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
    // $ANTLR end "KEYWORD_4"

    // $ANTLR start "KEYWORD_5"
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:123:11: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:123:13: ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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
    // $ANTLR end "KEYWORD_5"

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:125:11: ( '|' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:125:13: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_1"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:129:11: ( '+' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:129:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_POWER"
    public final void mRULE_POWER() throws RecognitionException {
        try {
            int _type = RULE_POWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:131:12: ( '**' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:131:14: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POWER"

    // $ANTLR start "RULE_STAR"
    public final void mRULE_STAR() throws RecognitionException {
        try {
            int _type = RULE_STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:133:11: ( '*' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:133:13: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STAR"

    // $ANTLR start "RULE_SLASH"
    public final void mRULE_SLASH() throws RecognitionException {
        try {
            int _type = RULE_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:135:12: ( '/' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:135:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SLASH"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:137:12: ( '-' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:137:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_NOT_EQUAL"
    public final void mRULE_NOT_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:139:16: ( '<>' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:139:18: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT_EQUAL"

    // $ANTLR start "RULE_LESS_EQUAL"
    public final void mRULE_LESS_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_LESS_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:141:17: ( '<=' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:141:19: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LESS_EQUAL"

    // $ANTLR start "RULE_GREATER_EQUAL"
    public final void mRULE_GREATER_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_GREATER_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:143:20: ( '>=' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:143:22: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GREATER_EQUAL"

    // $ANTLR start "RULE_GREATER"
    public final void mRULE_GREATER() throws RecognitionException {
        try {
            int _type = RULE_GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:145:14: ( '>' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:145:16: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GREATER"

    // $ANTLR start "RULE_LESS"
    public final void mRULE_LESS() throws RecognitionException {
        try {
            int _type = RULE_LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:147:11: ( '<' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:147:13: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LESS"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:149:12: ( '=' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:149:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_AFFECTATION_OPERATOR"
    public final void mRULE_AFFECTATION_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_AFFECTATION_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:151:27: ( ':=' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:151:29: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AFFECTATION_OPERATOR"

    // $ANTLR start "RULE_PUNC_OPEN_BRACE"
    public final void mRULE_PUNC_OPEN_BRACE() throws RecognitionException {
        try {
            int _type = RULE_PUNC_OPEN_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:153:22: ( '{' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:153:24: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PUNC_OPEN_BRACE"

    // $ANTLR start "RULE_PUNC_CLOSE_BRACE"
    public final void mRULE_PUNC_CLOSE_BRACE() throws RecognitionException {
        try {
            int _type = RULE_PUNC_CLOSE_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:155:23: ( '}' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:155:25: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PUNC_CLOSE_BRACE"

    // $ANTLR start "RULE_PUNC_SEMI_COLON"
    public final void mRULE_PUNC_SEMI_COLON() throws RecognitionException {
        try {
            int _type = RULE_PUNC_SEMI_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:157:22: ( ';' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:157:24: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PUNC_SEMI_COLON"

    // $ANTLR start "RULE_PUNC_OPEN_PARENTHESIS"
    public final void mRULE_PUNC_OPEN_PARENTHESIS() throws RecognitionException {
        try {
            int _type = RULE_PUNC_OPEN_PARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:159:28: ( '(' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:159:30: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PUNC_OPEN_PARENTHESIS"

    // $ANTLR start "RULE_PUNC_CLOSE_PARENTHESIS"
    public final void mRULE_PUNC_CLOSE_PARENTHESIS() throws RecognitionException {
        try {
            int _type = RULE_PUNC_CLOSE_PARENTHESIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:161:29: ( ')' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:161:31: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PUNC_CLOSE_PARENTHESIS"

    // $ANTLR start "RULE_PUNC_COMMA"
    public final void mRULE_PUNC_COMMA() throws RecognitionException {
        try {
            int _type = RULE_PUNC_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:163:17: ( ',' )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:163:19: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PUNC_COMMA"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:165:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:165:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:165:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:
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
            	    break loop1;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:167:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:167:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:167:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\'') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:167:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:167:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\\') ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:167:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:167:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop2;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:167:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:167:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:167:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:167:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop3;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:169:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:169:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:169:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:169:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop5;
                }
            } while (true);

            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:169:40: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:169:41: ( '\\r' )? '\\n'
                    {
                    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:169:41: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:169:41: '\\r'
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
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:171:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:171:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:171:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_NUMERIC"
    public final void mRULE_NUMERIC() throws RecognitionException {
        try {
            int _type = RULE_NUMERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:173:14: ( ( '0' .. '9' | '.' | '+' | '-' | 'a' .. 'z' | 'A' .. 'Z' )+ )
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:173:16: ( '0' .. '9' | '.' | '+' | '-' | 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:173:16: ( '0' .. '9' | '.' | '+' | '-' | 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='+'||(LA9_0>='-' && LA9_0<='.')||(LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:
            	    {
            	    if ( input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMERIC"

    public void mTokens() throws RecognitionException {
        // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:8: ( KEYWORD_54 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_50 | KEYWORD_49 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_45 | KEYWORD_44 | KEYWORD_43 | KEYWORD_41 | KEYWORD_42 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_1 | RULE_PLUS | RULE_POWER | RULE_STAR | RULE_SLASH | RULE_MINUS | RULE_NOT_EQUAL | RULE_LESS_EQUAL | RULE_GREATER_EQUAL | RULE_GREATER | RULE_LESS | RULE_EQUAL | RULE_AFFECTATION_OPERATOR | RULE_PUNC_OPEN_BRACE | RULE_PUNC_CLOSE_BRACE | RULE_PUNC_SEMI_COLON | RULE_PUNC_OPEN_PARENTHESIS | RULE_PUNC_CLOSE_PARENTHESIS | RULE_PUNC_COMMA | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_NUMERIC )
        int alt10=77;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:10: KEYWORD_54
                {
                mKEYWORD_54(); 

                }
                break;
            case 2 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:21: KEYWORD_51
                {
                mKEYWORD_51(); 

                }
                break;
            case 3 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:32: KEYWORD_52
                {
                mKEYWORD_52(); 

                }
                break;
            case 4 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:43: KEYWORD_53
                {
                mKEYWORD_53(); 

                }
                break;
            case 5 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:54: KEYWORD_50
                {
                mKEYWORD_50(); 

                }
                break;
            case 6 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:65: KEYWORD_49
                {
                mKEYWORD_49(); 

                }
                break;
            case 7 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:76: KEYWORD_46
                {
                mKEYWORD_46(); 

                }
                break;
            case 8 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:87: KEYWORD_47
                {
                mKEYWORD_47(); 

                }
                break;
            case 9 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:98: KEYWORD_48
                {
                mKEYWORD_48(); 

                }
                break;
            case 10 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:109: KEYWORD_45
                {
                mKEYWORD_45(); 

                }
                break;
            case 11 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:120: KEYWORD_44
                {
                mKEYWORD_44(); 

                }
                break;
            case 12 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:131: KEYWORD_43
                {
                mKEYWORD_43(); 

                }
                break;
            case 13 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:142: KEYWORD_41
                {
                mKEYWORD_41(); 

                }
                break;
            case 14 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:153: KEYWORD_42
                {
                mKEYWORD_42(); 

                }
                break;
            case 15 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:164: KEYWORD_38
                {
                mKEYWORD_38(); 

                }
                break;
            case 16 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:175: KEYWORD_39
                {
                mKEYWORD_39(); 

                }
                break;
            case 17 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:186: KEYWORD_40
                {
                mKEYWORD_40(); 

                }
                break;
            case 18 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:197: KEYWORD_34
                {
                mKEYWORD_34(); 

                }
                break;
            case 19 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:208: KEYWORD_35
                {
                mKEYWORD_35(); 

                }
                break;
            case 20 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:219: KEYWORD_36
                {
                mKEYWORD_36(); 

                }
                break;
            case 21 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:230: KEYWORD_37
                {
                mKEYWORD_37(); 

                }
                break;
            case 22 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:241: KEYWORD_31
                {
                mKEYWORD_31(); 

                }
                break;
            case 23 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:252: KEYWORD_32
                {
                mKEYWORD_32(); 

                }
                break;
            case 24 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:263: KEYWORD_33
                {
                mKEYWORD_33(); 

                }
                break;
            case 25 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:274: KEYWORD_25
                {
                mKEYWORD_25(); 

                }
                break;
            case 26 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:285: KEYWORD_26
                {
                mKEYWORD_26(); 

                }
                break;
            case 27 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:296: KEYWORD_27
                {
                mKEYWORD_27(); 

                }
                break;
            case 28 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:307: KEYWORD_28
                {
                mKEYWORD_28(); 

                }
                break;
            case 29 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:318: KEYWORD_29
                {
                mKEYWORD_29(); 

                }
                break;
            case 30 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:329: KEYWORD_30
                {
                mKEYWORD_30(); 

                }
                break;
            case 31 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:340: KEYWORD_16
                {
                mKEYWORD_16(); 

                }
                break;
            case 32 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:351: KEYWORD_17
                {
                mKEYWORD_17(); 

                }
                break;
            case 33 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:362: KEYWORD_18
                {
                mKEYWORD_18(); 

                }
                break;
            case 34 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:373: KEYWORD_19
                {
                mKEYWORD_19(); 

                }
                break;
            case 35 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:384: KEYWORD_20
                {
                mKEYWORD_20(); 

                }
                break;
            case 36 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:395: KEYWORD_21
                {
                mKEYWORD_21(); 

                }
                break;
            case 37 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:406: KEYWORD_22
                {
                mKEYWORD_22(); 

                }
                break;
            case 38 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:417: KEYWORD_23
                {
                mKEYWORD_23(); 

                }
                break;
            case 39 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:428: KEYWORD_24
                {
                mKEYWORD_24(); 

                }
                break;
            case 40 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:439: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 41 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:449: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 42 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:459: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 43 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:469: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 44 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:479: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 45 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:490: KEYWORD_11
                {
                mKEYWORD_11(); 

                }
                break;
            case 46 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:501: KEYWORD_12
                {
                mKEYWORD_12(); 

                }
                break;
            case 47 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:512: KEYWORD_13
                {
                mKEYWORD_13(); 

                }
                break;
            case 48 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:523: KEYWORD_14
                {
                mKEYWORD_14(); 

                }
                break;
            case 49 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:534: KEYWORD_15
                {
                mKEYWORD_15(); 

                }
                break;
            case 50 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:545: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 51 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:555: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 52 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:565: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 53 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:575: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 54 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:585: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 55 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:595: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 56 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:605: RULE_POWER
                {
                mRULE_POWER(); 

                }
                break;
            case 57 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:616: RULE_STAR
                {
                mRULE_STAR(); 

                }
                break;
            case 58 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:626: RULE_SLASH
                {
                mRULE_SLASH(); 

                }
                break;
            case 59 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:637: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 60 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:648: RULE_NOT_EQUAL
                {
                mRULE_NOT_EQUAL(); 

                }
                break;
            case 61 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:663: RULE_LESS_EQUAL
                {
                mRULE_LESS_EQUAL(); 

                }
                break;
            case 62 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:679: RULE_GREATER_EQUAL
                {
                mRULE_GREATER_EQUAL(); 

                }
                break;
            case 63 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:698: RULE_GREATER
                {
                mRULE_GREATER(); 

                }
                break;
            case 64 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:711: RULE_LESS
                {
                mRULE_LESS(); 

                }
                break;
            case 65 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:721: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 66 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:732: RULE_AFFECTATION_OPERATOR
                {
                mRULE_AFFECTATION_OPERATOR(); 

                }
                break;
            case 67 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:758: RULE_PUNC_OPEN_BRACE
                {
                mRULE_PUNC_OPEN_BRACE(); 

                }
                break;
            case 68 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:779: RULE_PUNC_CLOSE_BRACE
                {
                mRULE_PUNC_CLOSE_BRACE(); 

                }
                break;
            case 69 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:801: RULE_PUNC_SEMI_COLON
                {
                mRULE_PUNC_SEMI_COLON(); 

                }
                break;
            case 70 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:822: RULE_PUNC_OPEN_PARENTHESIS
                {
                mRULE_PUNC_OPEN_PARENTHESIS(); 

                }
                break;
            case 71 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:849: RULE_PUNC_CLOSE_PARENTHESIS
                {
                mRULE_PUNC_CLOSE_PARENTHESIS(); 

                }
                break;
            case 72 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:877: RULE_PUNC_COMMA
                {
                mRULE_PUNC_COMMA(); 

                }
                break;
            case 73 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:893: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 74 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:901: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 75 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:913: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 76 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:929: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 77 :
                // ../org.osate.ocarina.real.xtext.ui/src-gen/org/osate/ocarina/real/xtext/ui/contentassist/antlr/lexer/InternalREALLexer.g:1:937: RULE_NUMERIC
                {
                mRULE_NUMERIC(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\22\45\1\uffff\1\116\1\120\1\uffff\1\122\1\125\1\127\10"+
        "\uffff\1\45\4\uffff\7\45\1\136\1\137\34\45\1\175\1\176\3\uffff\1"+
        "\u0080\6\uffff\4\45\1\u0085\1\45\2\uffff\2\45\1\u008f\12\45\1\u009b"+
        "\2\45\1\u009e\4\45\1\u00a3\2\45\1\u00a6\1\u00a7\1\u00a8\1\u00a9"+
        "\1\u00aa\2\uffff\1\u0080\1\uffff\4\45\1\uffff\11\45\1\uffff\7\45"+
        "\1\u00c2\1\u00c3\1\45\1\u00c5\1\uffff\1\45\1\u00c7\1\uffff\1\45"+
        "\1\u00c9\1\u00ca\1\u00cb\1\uffff\1\u00cc\1\u00cd\5\uffff\3\45\1"+
        "\u00d1\10\45\1\u00da\6\45\1\u00e1\1\u00e2\1\u00e3\1\45\2\uffff\1"+
        "\45\1\uffff\1\45\1\uffff\1\u00e7\5\uffff\3\45\1\uffff\10\45\1\uffff"+
        "\4\45\1\u00f7\1\45\3\uffff\1\45\1\u00fa\1\u00fb\1\uffff\1\45\1\u00fd"+
        "\12\45\1\u0109\2\45\1\uffff\1\u010c\1\u010d\2\uffff\1\45\1\uffff"+
        "\1\u010f\11\45\1\u011a\1\uffff\1\45\1\u011c\2\uffff\1\45\1\uffff"+
        "\12\45\1\uffff\1\45\1\uffff\7\45\1\u0132\4\45\1\u0137\10\45\1\uffff"+
        "\2\45\1\u0142\1\45\1\uffff\7\45\1\u014b\2\45\1\uffff\10\45\1\uffff"+
        "\13\45\1\u0161\7\45\1\u0169\1\u016a\1\uffff\1\u016b\5\45\1\u0171"+
        "\3\uffff\3\45\1\u0175\1\45\1\uffff\1\45\1\u0178\1\u0179\1\uffff"+
        "\1\u017a\1\45\3\uffff\2\45\1\u017e\1\uffff";
    static final String DFA10_eofS =
        "\u017f\uffff";
    static final String DFA10_minS =
        "\1\11\22\53\1\uffff\1\53\1\52\1\uffff\1\53\2\75\10\uffff\1\53\4"+
        "\uffff\47\53\3\uffff\1\53\6\uffff\5\53\1\101\2\uffff\35\53\2\uffff"+
        "\1\53\1\uffff\3\53\1\120\1\uffff\1\101\1\125\1\101\1\103\1\117\1"+
        "\116\2\53\1\105\1\uffff\13\53\1\uffff\2\53\1\uffff\4\53\1\uffff"+
        "\2\53\5\uffff\4\53\1\122\1\123\1\117\1\102\1\116\1\114\1\103\1\125"+
        "\1\60\2\53\1\121\7\53\2\uffff\1\53\1\uffff\1\53\1\uffff\1\53\5\uffff"+
        "\3\53\1\uffff\1\117\1\123\1\126\1\103\1\116\1\114\1\105\1\116\1"+
        "\uffff\2\53\1\125\3\53\3\uffff\3\53\1\uffff\3\53\1\120\2\111\1\117"+
        "\2\105\1\123\1\104\2\53\1\101\1\53\1\uffff\2\53\2\uffff\1\120\1"+
        "\uffff\1\53\1\105\1\116\1\104\1\115\1\103\1\104\1\116\1\123\1\137"+
        "\1\53\1\uffff\1\114\1\53\2\uffff\1\122\1\uffff\1\122\1\107\1\105"+
        "\1\120\1\124\1\137\1\107\1\105\1\124\1\105\1\uffff\1\123\1\uffff"+
        "\1\117\1\124\1\137\1\104\1\117\1\105\1\102\1\60\1\116\1\104\1\117"+
        "\1\130\1\60\1\120\1\131\1\124\1\137\2\116\1\104\1\131\1\uffff\1"+
        "\107\1\137\1\60\1\111\1\uffff\1\105\1\137\1\110\1\103\1\105\1\107"+
        "\1\137\1\60\1\137\1\102\1\uffff\1\123\1\122\1\126\1\122\1\114\1"+
        "\116\1\137\1\124\1\uffff\1\124\1\131\2\124\1\101\1\117\1\101\2\124"+
        "\2\117\1\60\1\123\1\131\1\114\1\125\1\123\1\137\1\117\2\60\1\uffff"+
        "\1\60\1\137\1\125\1\107\1\123\1\117\1\60\3\uffff\1\126\1\105\1\110"+
        "\1\60\1\106\1\uffff\1\101\2\60\1\uffff\1\60\1\114\3\uffff\1\125"+
        "\1\105\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\175\22\172\1\uffff\1\172\1\52\1\uffff\1\172\1\76\1\75\10\uffff"+
        "\1\172\4\uffff\47\172\3\uffff\1\172\6\uffff\5\172\1\163\2\uffff"+
        "\35\172\2\uffff\1\172\1\uffff\3\172\1\160\1\uffff\1\162\1\165\1"+
        "\157\1\143\1\157\1\156\2\172\1\145\1\uffff\13\172\1\uffff\2\172"+
        "\1\uffff\4\172\1\uffff\2\172\5\uffff\4\172\1\162\1\163\1\157\1\142"+
        "\1\156\1\154\1\143\1\165\3\172\1\161\7\172\2\uffff\1\172\1\uffff"+
        "\1\172\1\uffff\1\172\5\uffff\3\172\1\uffff\1\157\1\163\1\166\1\143"+
        "\1\156\1\154\1\145\1\156\1\uffff\2\172\1\165\3\172\3\uffff\3\172"+
        "\1\uffff\3\172\1\160\2\151\1\157\1\145\1\151\1\163\1\144\2\172\1"+
        "\141\1\172\1\uffff\2\172\2\uffff\1\160\1\uffff\1\172\1\145\1\156"+
        "\1\144\1\155\1\143\1\144\1\156\1\163\1\137\1\172\1\uffff\1\154\1"+
        "\172\2\uffff\1\162\1\uffff\1\162\1\147\1\145\1\160\1\164\1\137\1"+
        "\147\1\151\1\164\1\145\1\uffff\1\163\1\uffff\1\157\1\164\1\137\1"+
        "\144\1\157\1\151\1\142\1\172\1\156\1\144\1\157\1\170\1\172\1\160"+
        "\1\171\1\164\1\137\2\156\1\144\1\171\1\uffff\1\147\1\137\1\172\1"+
        "\151\1\uffff\1\145\1\137\1\150\1\143\1\145\1\147\1\137\1\172\1\137"+
        "\1\142\1\uffff\1\163\1\162\1\166\1\162\1\154\1\156\1\137\1\164\1"+
        "\uffff\1\164\1\171\2\164\1\141\1\157\1\141\2\164\2\157\1\172\1\163"+
        "\1\171\1\154\1\165\1\163\1\137\1\157\2\172\1\uffff\1\172\1\137\1"+
        "\165\1\147\1\163\1\157\1\172\3\uffff\1\166\1\145\1\150\1\172\1\146"+
        "\1\uffff\1\141\2\172\1\uffff\1\172\1\154\3\uffff\1\165\1\145\1\172"+
        "\1\uffff";
    static final String DFA10_acceptS =
        "\23\uffff\1\66\2\uffff\1\72\3\uffff\1\101\1\102\1\103\1\104\1\105"+
        "\1\106\1\107\1\110\1\uffff\1\112\1\114\1\111\1\115\47\uffff\1\67"+
        "\1\70\1\71\1\uffff\1\73\1\74\1\75\1\100\1\76\1\77\6\uffff\1\63\1"+
        "\64\35\uffff\1\62\1\65\1\uffff\1\113\4\uffff\1\50\11\uffff\1\55"+
        "\13\uffff\1\56\2\uffff\1\54\4\uffff\1\51\2\uffff\1\52\1\53\1\57"+
        "\1\60\1\61\27\uffff\1\46\1\47\1\uffff\1\45\1\uffff\1\44\1\uffff"+
        "\1\37\1\40\1\41\1\42\1\43\3\uffff\1\35\10\uffff\1\33\6\uffff\1\31"+
        "\1\32\1\36\3\uffff\1\34\17\uffff\1\30\2\uffff\1\26\1\27\1\uffff"+
        "\1\23\13\uffff\1\22\2\uffff\1\24\1\25\1\uffff\1\17\12\uffff\1\20"+
        "\1\uffff\1\21\25\uffff\1\16\4\uffff\1\15\12\uffff\1\14\10\uffff"+
        "\1\13\25\uffff\1\12\7\uffff\1\10\1\7\1\11\5\uffff\1\6\3\uffff\1"+
        "\5\2\uffff\1\2\1\3\1\4\3\uffff\1\1";
    static final String DFA10_specialS =
        "\u017f\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\uffff\1\43\4\uffff\1\43\1"+
            "\37\1\40\1\25\1\24\1\41\1\27\1\46\1\26\12\46\1\33\1\36\1\30"+
            "\1\32\1\31\2\uffff\1\5\1\42\1\1\1\21\1\11\1\7\1\2\1\14\1\3\2"+
            "\42\1\15\1\16\1\17\1\22\1\4\1\13\1\6\1\12\1\10\1\42\1\20\4\42"+
            "\4\uffff\1\45\1\uffff\1\5\1\42\1\1\1\21\1\11\1\7\1\2\1\14\1"+
            "\3\2\42\1\15\1\16\1\17\1\22\1\4\1\13\1\6\1\12\1\10\1\42\1\20"+
            "\4\42\1\34\1\23\1\35",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\1\50\6\52\1\51\6\52"+
            "\1\47\13\52\6\uffff\1\50\6\52\1\51\6\52\1\47\13\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\2\52\1\54\1\52\1\53"+
            "\25\52\6\uffff\2\52\1\54\1\52\1\53\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\5\52\1\56\7\52\1\57"+
            "\4\52\1\55\7\52\6\uffff\5\52\1\56\7\52\1\57\4\52\1\55\7\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\21\52\1\60\10\52\6"+
            "\uffff\21\52\1\60\10\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\13\52\1\61\1\52\1"+
            "\62\14\52\6\uffff\13\52\1\61\1\52\1\62\14\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\63\25\52\6"+
            "\uffff\4\52\1\63\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\1\67\7\52\1\65\2\52"+
            "\1\66\2\52\1\64\13\52\6\uffff\1\67\7\52\1\65\2\52\1\66\2\52"+
            "\1\64\13\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\7\52\1\70\11\52\1"+
            "\71\10\52\6\uffff\7\52\1\70\11\52\1\71\10\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\13\52\1\73\1\52\1"+
            "\74\11\52\1\72\2\52\6\uffff\13\52\1\73\1\52\1\74\11\52\1\72"+
            "\2\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\10\52\1\76\13\52\1"+
            "\77\3\52\1\75\1\52\6\uffff\10\52\1\76\13\52\1\77\3\52\1\75\1"+
            "\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\24\52\1\100\5\52\6"+
            "\uffff\24\52\1\100\5\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\101\25\52\6"+
            "\uffff\4\52\1\101\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\1\102\1\52\1\104\5"+
            "\52\1\103\21\52\6\uffff\1\102\1\52\1\104\5\52\1\103\21\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\1\107\7\52\1\110\3"+
            "\52\1\105\1\52\1\111\3\52\1\106\7\52\6\uffff\1\107\7\52\1\110"+
            "\3\52\1\105\1\52\1\111\3\52\1\106\7\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\16\52\1\112\13\52"+
            "\6\uffff\16\52\1\112\13\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\1\113\31\52\6\uffff"+
            "\1\113\31\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\16\52\1\114\13\52"+
            "\6\uffff\16\52\1\114\13\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\21\52\1\115\10\52"+
            "\6\uffff\21\52\1\115\10\52",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\46\7\uffff\32\46\6\uffff\32\46",
            "\1\117",
            "",
            "\1\46\1\uffff\1\121\1\46\1\uffff\12\46\7\uffff\32\46\6\uffff"+
            "\32\46",
            "\1\124\1\123",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\6\uffff\32\52",
            "",
            "",
            "",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\14\52\1\130\15\52"+
            "\6\uffff\14\52\1\130\15\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\21\52\1\131\10\52"+
            "\6\uffff\21\52\1\131\10\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\132\25\52\6"+
            "\uffff\4\52\1\132\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\6\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\23\52\1\133\6\52\6"+
            "\uffff\23\52\1\133\6\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\3\52\1\134\26\52\6"+
            "\uffff\3\52\1\134\26\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\135"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\16\52\1\140\13\52"+
            "\6\uffff\16\52\1\140\13\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\13\52\1\141\16\52"+
            "\6\uffff\13\52\1\141\16\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\3\52\1\142\26\52\6"+
            "\uffff\3\52\1\142\26\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\20\52\1\143\2\52\1"+
            "\144\6\52\6\uffff\20\52\1\143\2\52\1\144\6\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\21\52\1\145\10\52"+
            "\6\uffff\21\52\1\145\10\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\21\52\1\146\10\52"+
            "\6\uffff\21\52\1\146\10\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\16\52\1\147\13\52"+
            "\6\uffff\16\52\1\147\13\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\13\52\1\150\16\52"+
            "\6\uffff\13\52\1\150\16\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\151\25\52\6"+
            "\uffff\4\52\1\151\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\24\52\1\152\5\52\6"+
            "\uffff\24\52\1\152\5\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\10\52\1\153\21\52"+
            "\6\uffff\10\52\1\153\21\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\22\52\1\154\7\52\6"+
            "\uffff\22\52\1\154\7\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\3\52\1\155\26\52\6"+
            "\uffff\3\52\1\155\26\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\22\52\1\156\7\52\6"+
            "\uffff\22\52\1\156\7\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\31\52\1\157\6\uffff"+
            "\31\52\1\157",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\14\52\1\160\15\52"+
            "\6\uffff\14\52\1\160\15\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\161\25\52\6"+
            "\uffff\4\52\1\161\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\1\162\31\52\6\uffff"+
            "\1\162\31\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\22\52\1\163\7\52\6"+
            "\uffff\22\52\1\163\7\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\22\52\1\164\7\52\6"+
            "\uffff\22\52\1\164\7\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\14\52\1\165\15\52"+
            "\6\uffff\14\52\1\165\15\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\1\166\31\52\6\uffff"+
            "\1\166\31\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\24\52\1\167\5\52\6"+
            "\uffff\24\52\1\167\5\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\27\52\1\170\2\52\6"+
            "\uffff\27\52\1\170\2\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\15\52\1\171\14\52"+
            "\6\uffff\15\52\1\171\14\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\3\52\1\172\26\52\6"+
            "\uffff\3\52\1\172\26\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\23\52\1\173\6\52\6"+
            "\uffff\23\52\1\173\6\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\21\52\1\174\10\52"+
            "\6\uffff\21\52\1\174\10\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "",
            "",
            "",
            "\1\177\1\uffff\2\177\1\uffff\12\177\7\uffff\32\177\6\uffff"+
            "\32\177",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\17\52\1\u0081\12\52"+
            "\6\uffff\17\52\1\u0081\12\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\3\52\1\u0082\26\52"+
            "\6\uffff\3\52\1\u0082\26\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\2\52\1\u0083\27\52"+
            "\6\uffff\2\52\1\u0083\27\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\u0084"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\u0089\1\u008a\1\u0088\5\uffff\1\u008b\6\uffff\1\u0086\2"+
            "\uffff\1\u0087\15\uffff\1\u0089\1\u008a\1\u0088\5\uffff\1\u008b"+
            "\6\uffff\1\u0086\2\uffff\1\u0087",
            "",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\3\52\1\u008d\13\52"+
            "\1\u008c\12\52\6\uffff\3\52\1\u008d\13\52\1\u008c\12\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\u008e"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\24\52\1\u0090\5\52"+
            "\6\uffff\24\52\1\u0090\5\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\24\52\1\u0091\5\52"+
            "\6\uffff\24\52\1\u0091\5\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\u0092\25\52"+
            "\6\uffff\4\52\1\u0092\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\22\52\1\u0093\7\52"+
            "\6\uffff\22\52\1\u0093\7\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\1\u0094\31\52\6\uffff"+
            "\1\u0094\31\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\22\52\1\u0095\7\52"+
            "\6\uffff\22\52\1\u0095\7\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\15\52\1\u0097\1\u0096"+
            "\13\52\6\uffff\15\52\1\u0097\1\u0096\13\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\u0098\25\52"+
            "\6\uffff\4\52\1\u0098\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\22\52\1\u0099\7\52"+
            "\6\uffff\22\52\1\u0099\7\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\u009a\25\52"+
            "\6\uffff\4\52\1\u009a\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\23\52\1\u009c\6\52"+
            "\6\uffff\23\52\1\u009c\6\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\u009d\25\52"+
            "\6\uffff\4\52\1\u009d\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\24\52\1\u009f\5\52"+
            "\6\uffff\24\52\1\u009f\5\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\3\52\1\u00a0\26\52"+
            "\6\uffff\3\52\1\u00a0\26\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\23\52\1\u00a1\6\52"+
            "\6\uffff\23\52\1\u00a1\6\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\23\52\1\u00a2\6\52"+
            "\6\uffff\23\52\1\u00a2\6\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\27\52\1\u00a4\2\52"+
            "\6\uffff\27\52\1\u00a4\2\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\14\52\1\u00a5\15\52"+
            "\6\uffff\14\52\1\u00a5\15\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "",
            "",
            "\1\177\1\uffff\2\177\1\uffff\12\177\7\uffff\32\177\6\uffff"+
            "\32\177",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\1\u00ab\23\52\1\u00ac"+
            "\5\52\6\uffff\1\u00ab\23\52\1\u00ac\5\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\10\52\1\u00ad\21\52"+
            "\6\uffff\10\52\1\u00ad\21\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\12\52\1\u00ae\17\52"+
            "\6\uffff\12\52\1\u00ae\17\52",
            "\1\u00af\37\uffff\1\u00af",
            "",
            "\1\u00b0\20\uffff\1\u00b1\16\uffff\1\u00b0\20\uffff\1\u00b1",
            "\1\u00b2\37\uffff\1\u00b2",
            "\1\u00b4\15\uffff\1\u00b3\21\uffff\1\u00b4\15\uffff\1\u00b3",
            "\1\u00b5\37\uffff\1\u00b5",
            "\1\u00b6\37\uffff\1\u00b6",
            "\1\u00b7\37\uffff\1\u00b7",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\u00b8\25\52"+
            "\6\uffff\4\52\1\u00b8\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\24\52\1\u00b9\5\52"+
            "\6\uffff\24\52\1\u00b9\5\52",
            "\1\u00ba\37\uffff\1\u00ba",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\10\52\1\u00bb\21\52"+
            "\6\uffff\10\52\1\u00bb\21\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\21\52\1\u00bc\10\52"+
            "\6\uffff\21\52\1\u00bc\10\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\1\u00bd\31\52\6\uffff"+
            "\1\u00bd\31\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\23\52\1\u00be\6\52"+
            "\6\uffff\23\52\1\u00be\6\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\23\52\1\u00bf\6\52"+
            "\6\uffff\23\52\1\u00bf\6\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\u00c0\25\52"+
            "\6\uffff\4\52\1\u00c0\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\21\52\1\u00c1\10\52"+
            "\6\uffff\21\52\1\u00c1\10\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\23\52\1\u00c4\6\52"+
            "\6\uffff\23\52\1\u00c4\6\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\u00c6\25\52"+
            "\6\uffff\4\52\1\u00c6\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\u00c8\25\52"+
            "\6\uffff\4\52\1\u00c8\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\21\52\1\u00ce\10\52"+
            "\6\uffff\21\52\1\u00ce\10\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\23\52\1\u00cf\6\52"+
            "\6\uffff\23\52\1\u00cf\6\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\15\52\1\u00d0\14\52"+
            "\6\uffff\15\52\1\u00d0\14\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\u00d2\37\uffff\1\u00d2",
            "\1\u00d3\37\uffff\1\u00d3",
            "\1\u00d4\37\uffff\1\u00d4",
            "\1\u00d5\37\uffff\1\u00d5",
            "\1\u00d6\37\uffff\1\u00d6",
            "\1\u00d7\37\uffff\1\u00d7",
            "\1\u00d8\37\uffff\1\u00d8",
            "\1\u00d9\37\uffff\1\u00d9",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\21\52\1\u00db\10\52"+
            "\6\uffff\21\52\1\u00db\10\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\2\52\1\u00dc\27\52"+
            "\6\uffff\2\52\1\u00dc\27\52",
            "\1\u00dd\37\uffff\1\u00dd",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\21\52\1\u00de\10\52"+
            "\6\uffff\21\52\1\u00de\10\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\15\52\1\u00df\14\52"+
            "\6\uffff\15\52\1\u00df\14\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\2\52\1\u00e0\27\52"+
            "\6\uffff\2\52\1\u00e0\27\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\u00e4\25\52"+
            "\6\uffff\4\52\1\u00e4\25\52",
            "",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\22\52\1\u00e5\7\52"+
            "\6\uffff\22\52\1\u00e5\7\52",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\14\52\1\u00e6\15\52"+
            "\6\uffff\14\52\1\u00e6\15\52",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\u00e8\25\52"+
            "\6\uffff\4\52\1\u00e8\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\u00e9\25\52"+
            "\6\uffff\4\52\1\u00e9\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\1\u00ea\31\52\6\uffff"+
            "\1\u00ea\31\52",
            "",
            "\1\u00eb\37\uffff\1\u00eb",
            "\1\u00ec\37\uffff\1\u00ec",
            "\1\u00ed\37\uffff\1\u00ed",
            "\1\u00ee\37\uffff\1\u00ee",
            "\1\u00ef\37\uffff\1\u00ef",
            "\1\u00f0\37\uffff\1\u00f0",
            "\1\u00f1\37\uffff\1\u00f1",
            "\1\u00f2\37\uffff\1\u00f2",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\23\52\1\u00f3\6\52"+
            "\6\uffff\23\52\1\u00f3\6\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\23\52\1\u00f4\6\52"+
            "\6\uffff\23\52\1\u00f4\6\52",
            "\1\u00f5\37\uffff\1\u00f5",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\4\52\1\u00f6\25\52"+
            "\6\uffff\4\52\1\u00f6\25\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\7\52\1\u00f8\22\52"+
            "\6\uffff\7\52\1\u00f8\22\52",
            "",
            "",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\14\52\1\u00f9\15\52"+
            "\6\uffff\14\52\1\u00f9\15\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\u00fc"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\13\52\1\u00fe\16\52"+
            "\6\uffff\13\52\1\u00fe\16\52",
            "\1\u00ff\37\uffff\1\u00ff",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0101\37\uffff\1\u0101",
            "\1\u0102\37\uffff\1\u0102",
            "\1\u0103\37\uffff\1\u0103",
            "\1\u0104\3\uffff\1\u0105\33\uffff\1\u0104\3\uffff\1\u0105",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0107\37\uffff\1\u0107",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\30\52\1\u0108\1\52"+
            "\6\uffff\30\52\1\u0108\1\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\u010a\37\uffff\1\u010a",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\22\52\1\u010b\7\52"+
            "\6\uffff\22\52\1\u010b\7\52",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "",
            "",
            "\1\u010e\37\uffff\1\u010e",
            "",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "\1\u0110\37\uffff\1\u0110",
            "\1\u0111\37\uffff\1\u0111",
            "\1\u0112\37\uffff\1\u0112",
            "\1\u0113\37\uffff\1\u0113",
            "\1\u0114\37\uffff\1\u0114",
            "\1\u0115\37\uffff\1\u0115",
            "\1\u0116\37\uffff\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "\1\u0118",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\u0119"+
            "\1\uffff\32\52",
            "",
            "\1\u011b\37\uffff\1\u011b",
            "\1\46\1\uffff\2\46\1\uffff\12\52\7\uffff\32\52\4\uffff\1\45"+
            "\1\uffff\32\52",
            "",
            "",
            "\1\u011d\37\uffff\1\u011d",
            "",
            "\1\u011e\37\uffff\1\u011e",
            "\1\u011f\37\uffff\1\u011f",
            "\1\u0120\37\uffff\1\u0120",
            "\1\u0121\37\uffff\1\u0121",
            "\1\u0122\37\uffff\1\u0122",
            "\1\u0123",
            "\1\u0124\37\uffff\1\u0124",
            "\1\u0126\3\uffff\1\u0125\33\uffff\1\u0126\3\uffff\1\u0125",
            "\1\u0127\37\uffff\1\u0127",
            "\1\u0128\37\uffff\1\u0128",
            "",
            "\1\u0129\37\uffff\1\u0129",
            "",
            "\1\u012a\37\uffff\1\u012a",
            "\1\u012b\37\uffff\1\u012b",
            "\1\u012c",
            "\1\u012d\37\uffff\1\u012d",
            "\1\u012e\37\uffff\1\u012e",
            "\1\u0130\3\uffff\1\u012f\33\uffff\1\u0130\3\uffff\1\u012f",
            "\1\u0131\37\uffff\1\u0131",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0133\37\uffff\1\u0133",
            "\1\u0134\37\uffff\1\u0134",
            "\1\u0135\37\uffff\1\u0135",
            "\1\u0136\37\uffff\1\u0136",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0138\37\uffff\1\u0138",
            "\1\u0139\37\uffff\1\u0139",
            "\1\u013a\37\uffff\1\u013a",
            "\1\u013b",
            "\1\u013c\37\uffff\1\u013c",
            "\1\u013d\37\uffff\1\u013d",
            "\1\u013e\37\uffff\1\u013e",
            "\1\u013f\37\uffff\1\u013f",
            "",
            "\1\u0140\37\uffff\1\u0140",
            "\1\u0141",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0143\37\uffff\1\u0143",
            "",
            "\1\u0144\37\uffff\1\u0144",
            "\1\u0145",
            "\1\u0146\37\uffff\1\u0146",
            "\1\u0147\37\uffff\1\u0147",
            "\1\u0148\37\uffff\1\u0148",
            "\1\u0149\37\uffff\1\u0149",
            "\1\u014a",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u014c",
            "\1\u014d\37\uffff\1\u014d",
            "",
            "\1\u014e\37\uffff\1\u014e",
            "\1\u014f\37\uffff\1\u014f",
            "\1\u0150\37\uffff\1\u0150",
            "\1\u0151\37\uffff\1\u0151",
            "\1\u0152\37\uffff\1\u0152",
            "\1\u0153\37\uffff\1\u0153",
            "\1\u0154",
            "\1\u0155\37\uffff\1\u0155",
            "",
            "\1\u0156\37\uffff\1\u0156",
            "\1\u0157\37\uffff\1\u0157",
            "\1\u0158\37\uffff\1\u0158",
            "\1\u0159\37\uffff\1\u0159",
            "\1\u015a\37\uffff\1\u015a",
            "\1\u015b\37\uffff\1\u015b",
            "\1\u015c\37\uffff\1\u015c",
            "\1\u015d\37\uffff\1\u015d",
            "\1\u015e\37\uffff\1\u015e",
            "\1\u015f\37\uffff\1\u015f",
            "\1\u0160\37\uffff\1\u0160",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0162\37\uffff\1\u0162",
            "\1\u0163\37\uffff\1\u0163",
            "\1\u0164\37\uffff\1\u0164",
            "\1\u0165\37\uffff\1\u0165",
            "\1\u0166\37\uffff\1\u0166",
            "\1\u0167",
            "\1\u0168\37\uffff\1\u0168",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u016c",
            "\1\u016d\37\uffff\1\u016d",
            "\1\u016e\37\uffff\1\u016e",
            "\1\u016f\37\uffff\1\u016f",
            "\1\u0170\37\uffff\1\u0170",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "\1\u0172\37\uffff\1\u0172",
            "\1\u0173\37\uffff\1\u0173",
            "\1\u0174\37\uffff\1\u0174",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0176\37\uffff\1\u0176",
            "",
            "\1\u0177\37\uffff\1\u0177",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u017b\37\uffff\1\u017b",
            "",
            "",
            "",
            "\1\u017c\37\uffff\1\u017c",
            "\1\u017d\37\uffff\1\u017d",
            "\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_54 | KEYWORD_51 | KEYWORD_52 | KEYWORD_53 | KEYWORD_50 | KEYWORD_49 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_45 | KEYWORD_44 | KEYWORD_43 | KEYWORD_41 | KEYWORD_42 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_34 | KEYWORD_35 | KEYWORD_36 | KEYWORD_37 | KEYWORD_31 | KEYWORD_32 | KEYWORD_33 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_1 | RULE_PLUS | RULE_POWER | RULE_STAR | RULE_SLASH | RULE_MINUS | RULE_NOT_EQUAL | RULE_LESS_EQUAL | RULE_GREATER_EQUAL | RULE_GREATER | RULE_LESS | RULE_EQUAL | RULE_AFFECTATION_OPERATOR | RULE_PUNC_OPEN_BRACE | RULE_PUNC_CLOSE_BRACE | RULE_PUNC_SEMI_COLON | RULE_PUNC_OPEN_PARENTHESIS | RULE_PUNC_CLOSE_PARENTHESIS | RULE_PUNC_COMMA | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_NUMERIC );";
        }
    }
 

}