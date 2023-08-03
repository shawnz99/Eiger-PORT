// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g 2023-07-23 17:43:34

    package org.apache.cassandra.cql;
    import org.apache.cassandra.thrift.InvalidRequestException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CqlLexer extends Lexer {
    public static final int K_SET=30;
    public static final int K_KEY=38;
    public static final int K_INDEX=40;
    public static final int QMARK=47;
    public static final int K_FIRST=16;
    public static final int K_CREATE=32;
    public static final int K_APPLY=28;
    public static final int K_USING=11;
    public static final int MULTILINE_COMMENT=80;
    public static final int K_DROP=42;
    public static final int K_USE=4;
    public static final int A=60;
    public static final int B=71;
    public static final int C=52;
    public static final int D=62;
    public static final int K_ALTER=43;
    public static final int E=50;
    public static final int K_LIMIT=15;
    public static final int K_INSERT=21;
    public static final int F=54;
    public static final int G=68;
    public static final int H=59;
    public static final int K_FROM=10;
    public static final int I=65;
    public static final int K_PRIMARY=37;
    public static final int J=73;
    public static final int K=63;
    public static final int L=51;
    public static final int M=57;
    public static final int N=61;
    public static final int COMMENT=79;
    public static final int O=56;
    public static final int P=67;
    public static final int Q=69;
    public static final int R=55;
    public static final int S=49;
    public static final int T=53;
    public static final int U=66;
    public static final int V=70;
    public static final int W=58;
    public static final int X=72;
    public static final int Y=64;
    public static final int Z=74;
    public static final int K_WITH=34;
    public static final int COMPIDENT=35;
    public static final int K_ON=41;
    public static final int K_VALUES=23;
    public static final int K_BATCH=27;
    public static final int K_DELETE=31;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int LETTER=76;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int K_SELECT=8;
    public static final int K_INTO=22;
    public static final int K_AND=19;
    public static final int K_COLUMNFAMILY=36;
    public static final int K_TTL=25;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int UUID=46;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int K_COUNT=9;
    public static final int T__98=98;
    public static final int INTEGER=6;
    public static final int K_TIMESTAMP=24;
    public static final int K_WHERE=14;
    public static final int RANGEOP=18;
    public static final int K_LEVEL=13;
    public static final int K_IN=20;
    public static final int K_CONSISTENCY=12;
    public static final int K_ADD=45;
    public static final int FLOAT=39;
    public static final int K_UPDATE=29;
    public static final int K_BEGIN=26;
    public static final int K_TRUNCATE=48;
    public static final int WS=78;
    public static final int EOF=-1;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int DIGIT=75;
    public static final int K_TYPE=44;
    public static final int IDENT=5;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int STRING_LITERAL=7;
    public static final int HEX=77;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int K_REVERSED=17;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int K_KEYSPACE=33;
    public static final int T__87=87;
    public static final int T__105=105;

        List<Token> tokens = new ArrayList<Token>();
        
        public void emit(Token token) {
            state.token = token;
            tokens.add(token);
        }
        
        public Token nextToken() {
            super.nextToken();
            if (tokens.size() == 0)
                return Token.EOF_TOKEN;
            return tokens.remove(0);
        }
        
        private List<String> recognitionErrors = new ArrayList<String>();
        
        public void displayRecognitionError(String[] tokenNames, RecognitionException e)
        {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            recognitionErrors.add(hdr + " " + msg);
        }
        
        public List<String> getRecognitionErrors()
        {
            return recognitionErrors;
        }
        
        public void throwLastRecognitionError() throws InvalidRequestException
        {
            if (recognitionErrors.size() > 0)
                throw new InvalidRequestException(recognitionErrors.get((recognitionErrors.size()-1)));
        }


    // delegates
    // delegators

    public CqlLexer() {;} 
    public CqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g"; }

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:47:7: ( '(' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:47:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:48:7: ( ')' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:48:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:49:7: ( '.' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:49:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:50:7: ( ',' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:50:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:51:7: ( '\\*' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:51:9: '\\*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:52:7: ( ';' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:52:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:53:7: ( '=' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:53:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:54:7: ( 'blob' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:54:9: 'blob'
            {
            match("blob"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:55:7: ( 'ascii' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:55:9: 'ascii'
            {
            match("ascii"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:56:7: ( 'text' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:56:9: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:57:7: ( 'varchar' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:57:9: 'varchar'
            {
            match("varchar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:58:7: ( 'int' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:58:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:59:7: ( 'varint' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:59:9: 'varint'
            {
            match("varint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:60:7: ( 'bigint' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:60:9: 'bigint'
            {
            match("bigint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:61:7: ( 'uuid' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:61:9: 'uuid'
            {
            match("uuid"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:62:7: ( 'counter' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:62:9: 'counter'
            {
            match("counter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:63:7: ( 'boolean' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:63:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:64:7: ( 'timestamp' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:64:9: 'timestamp'
            {
            match("timestamp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:65:7: ( 'float' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:65:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:66:8: ( 'double' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:66:10: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:67:8: ( 'decimal' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:67:10: 'decimal'
            {
            match("decimal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:68:8: ( '+' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:68:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:69:8: ( '-' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:69:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:70:8: ( '<' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:70:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:71:8: ( '<=' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:71:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:72:8: ( '>=' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:72:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:73:8: ( '>' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:73:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "K_SELECT"
    public final void mK_SELECT() throws RecognitionException {
        try {
            int _type = K_SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:504:9: ( S E L E C T )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:504:16: S E L E C T
            {
            mS(); 
            mE(); 
            mL(); 
            mE(); 
            mC(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_SELECT"

    // $ANTLR start "K_FROM"
    public final void mK_FROM() throws RecognitionException {
        try {
            int _type = K_FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:505:7: ( F R O M )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:505:16: F R O M
            {
            mF(); 
            mR(); 
            mO(); 
            mM(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_FROM"

    // $ANTLR start "K_WHERE"
    public final void mK_WHERE() throws RecognitionException {
        try {
            int _type = K_WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:506:8: ( W H E R E )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:506:16: W H E R E
            {
            mW(); 
            mH(); 
            mE(); 
            mR(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_WHERE"

    // $ANTLR start "K_AND"
    public final void mK_AND() throws RecognitionException {
        try {
            int _type = K_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:507:6: ( A N D )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:507:16: A N D
            {
            mA(); 
            mN(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_AND"

    // $ANTLR start "K_KEY"
    public final void mK_KEY() throws RecognitionException {
        try {
            int _type = K_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:508:6: ( K E Y )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:508:16: K E Y
            {
            mK(); 
            mE(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_KEY"

    // $ANTLR start "K_INSERT"
    public final void mK_INSERT() throws RecognitionException {
        try {
            int _type = K_INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:509:9: ( I N S E R T )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:509:16: I N S E R T
            {
            mI(); 
            mN(); 
            mS(); 
            mE(); 
            mR(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_INSERT"

    // $ANTLR start "K_UPDATE"
    public final void mK_UPDATE() throws RecognitionException {
        try {
            int _type = K_UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:510:9: ( U P D A T E )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:510:16: U P D A T E
            {
            mU(); 
            mP(); 
            mD(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_UPDATE"

    // $ANTLR start "K_WITH"
    public final void mK_WITH() throws RecognitionException {
        try {
            int _type = K_WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:511:7: ( W I T H )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:511:16: W I T H
            {
            mW(); 
            mI(); 
            mT(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_WITH"

    // $ANTLR start "K_LIMIT"
    public final void mK_LIMIT() throws RecognitionException {
        try {
            int _type = K_LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:512:8: ( L I M I T )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:512:16: L I M I T
            {
            mL(); 
            mI(); 
            mM(); 
            mI(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_LIMIT"

    // $ANTLR start "K_USING"
    public final void mK_USING() throws RecognitionException {
        try {
            int _type = K_USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:513:8: ( U S I N G )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:513:16: U S I N G
            {
            mU(); 
            mS(); 
            mI(); 
            mN(); 
            mG(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_USING"

    // $ANTLR start "K_CONSISTENCY"
    public final void mK_CONSISTENCY() throws RecognitionException {
        try {
            int _type = K_CONSISTENCY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:514:14: ( C O N S I S T E N C Y )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:514:16: C O N S I S T E N C Y
            {
            mC(); 
            mO(); 
            mN(); 
            mS(); 
            mI(); 
            mS(); 
            mT(); 
            mE(); 
            mN(); 
            mC(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CONSISTENCY"

    // $ANTLR start "K_LEVEL"
    public final void mK_LEVEL() throws RecognitionException {
        try {
            int _type = K_LEVEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:515:8: ( ( O N E | Q U O R U M | A L L | A N Y | L O C A L '_' Q U O R U M | E A C H '_' Q U O R U M ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:515:16: ( O N E | Q U O R U M | A L L | A N Y | L O C A L '_' Q U O R U M | E A C H '_' Q U O R U M )
            {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:515:16: ( O N E | Q U O R U M | A L L | A N Y | L O C A L '_' Q U O R U M | E A C H '_' Q U O R U M )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 'O':
            case 'o':
                {
                alt1=1;
                }
                break;
            case 'Q':
            case 'q':
                {
                alt1=2;
                }
                break;
            case 'A':
            case 'a':
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='L'||LA1_3=='l') ) {
                    alt1=3;
                }
                else if ( (LA1_3=='N'||LA1_3=='n') ) {
                    alt1=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            case 'L':
            case 'l':
                {
                alt1=5;
                }
                break;
            case 'E':
            case 'e':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:515:18: O N E
                    {
                    mO(); 
                    mN(); 
                    mE(); 

                    }
                    break;
                case 2 :
                    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:516:18: Q U O R U M
                    {
                    mQ(); 
                    mU(); 
                    mO(); 
                    mR(); 
                    mU(); 
                    mM(); 

                    }
                    break;
                case 3 :
                    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:517:18: A L L
                    {
                    mA(); 
                    mL(); 
                    mL(); 

                    }
                    break;
                case 4 :
                    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:518:18: A N Y
                    {
                    mA(); 
                    mN(); 
                    mY(); 

                    }
                    break;
                case 5 :
                    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:519:18: L O C A L '_' Q U O R U M
                    {
                    mL(); 
                    mO(); 
                    mC(); 
                    mA(); 
                    mL(); 
                    match('_'); 
                    mQ(); 
                    mU(); 
                    mO(); 
                    mR(); 
                    mU(); 
                    mM(); 

                    }
                    break;
                case 6 :
                    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:520:18: E A C H '_' Q U O R U M
                    {
                    mE(); 
                    mA(); 
                    mC(); 
                    mH(); 
                    match('_'); 
                    mQ(); 
                    mU(); 
                    mO(); 
                    mR(); 
                    mU(); 
                    mM(); 

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
    // $ANTLR end "K_LEVEL"

    // $ANTLR start "K_USE"
    public final void mK_USE() throws RecognitionException {
        try {
            int _type = K_USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:523:6: ( U S E )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:523:16: U S E
            {
            mU(); 
            mS(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_USE"

    // $ANTLR start "K_FIRST"
    public final void mK_FIRST() throws RecognitionException {
        try {
            int _type = K_FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:524:8: ( F I R S T )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:524:16: F I R S T
            {
            mF(); 
            mI(); 
            mR(); 
            mS(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_FIRST"

    // $ANTLR start "K_REVERSED"
    public final void mK_REVERSED() throws RecognitionException {
        try {
            int _type = K_REVERSED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:525:11: ( R E V E R S E D )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:525:16: R E V E R S E D
            {
            mR(); 
            mE(); 
            mV(); 
            mE(); 
            mR(); 
            mS(); 
            mE(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_REVERSED"

    // $ANTLR start "K_COUNT"
    public final void mK_COUNT() throws RecognitionException {
        try {
            int _type = K_COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:526:8: ( C O U N T )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:526:16: C O U N T
            {
            mC(); 
            mO(); 
            mU(); 
            mN(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_COUNT"

    // $ANTLR start "K_SET"
    public final void mK_SET() throws RecognitionException {
        try {
            int _type = K_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:527:6: ( S E T )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:527:16: S E T
            {
            mS(); 
            mE(); 
            mT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_SET"

    // $ANTLR start "K_BEGIN"
    public final void mK_BEGIN() throws RecognitionException {
        try {
            int _type = K_BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:528:8: ( B E G I N )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:528:16: B E G I N
            {
            mB(); 
            mE(); 
            mG(); 
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BEGIN"

    // $ANTLR start "K_APPLY"
    public final void mK_APPLY() throws RecognitionException {
        try {
            int _type = K_APPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:529:8: ( A P P L Y )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:529:16: A P P L Y
            {
            mA(); 
            mP(); 
            mP(); 
            mL(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_APPLY"

    // $ANTLR start "K_BATCH"
    public final void mK_BATCH() throws RecognitionException {
        try {
            int _type = K_BATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:530:8: ( B A T C H )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:530:16: B A T C H
            {
            mB(); 
            mA(); 
            mT(); 
            mC(); 
            mH(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_BATCH"

    // $ANTLR start "K_TRUNCATE"
    public final void mK_TRUNCATE() throws RecognitionException {
        try {
            int _type = K_TRUNCATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:531:11: ( T R U N C A T E )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:531:16: T R U N C A T E
            {
            mT(); 
            mR(); 
            mU(); 
            mN(); 
            mC(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TRUNCATE"

    // $ANTLR start "K_DELETE"
    public final void mK_DELETE() throws RecognitionException {
        try {
            int _type = K_DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:532:9: ( D E L E T E )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:532:16: D E L E T E
            {
            mD(); 
            mE(); 
            mL(); 
            mE(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DELETE"

    // $ANTLR start "K_IN"
    public final void mK_IN() throws RecognitionException {
        try {
            int _type = K_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:533:5: ( I N )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:533:16: I N
            {
            mI(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_IN"

    // $ANTLR start "K_CREATE"
    public final void mK_CREATE() throws RecognitionException {
        try {
            int _type = K_CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:534:9: ( C R E A T E )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:534:16: C R E A T E
            {
            mC(); 
            mR(); 
            mE(); 
            mA(); 
            mT(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_CREATE"

    // $ANTLR start "K_KEYSPACE"
    public final void mK_KEYSPACE() throws RecognitionException {
        try {
            int _type = K_KEYSPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:535:11: ( ( K E Y S P A C E | S C H E M A ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:535:16: ( K E Y S P A C E | S C H E M A )
            {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:535:16: ( K E Y S P A C E | S C H E M A )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='K'||LA2_0=='k') ) {
                alt2=1;
            }
            else if ( (LA2_0=='S'||LA2_0=='s') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:535:18: K E Y S P A C E
                    {
                    mK(); 
                    mE(); 
                    mY(); 
                    mS(); 
                    mP(); 
                    mA(); 
                    mC(); 
                    mE(); 

                    }
                    break;
                case 2 :
                    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:536:20: S C H E M A
                    {
                    mS(); 
                    mC(); 
                    mH(); 
                    mE(); 
                    mM(); 
                    mA(); 

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
    // $ANTLR end "K_KEYSPACE"

    // $ANTLR start "K_COLUMNFAMILY"
    public final void mK_COLUMNFAMILY() throws RecognitionException {
        try {
            int _type = K_COLUMNFAMILY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:537:15: ( ( C O L U M N F A M I L Y | T A B L E ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:537:16: ( C O L U M N F A M I L Y | T A B L E )
            {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:537:16: ( C O L U M N F A M I L Y | T A B L E )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='C'||LA3_0=='c') ) {
                alt3=1;
            }
            else if ( (LA3_0=='T'||LA3_0=='t') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:537:18: C O L U M N F A M I L Y
                    {
                    mC(); 
                    mO(); 
                    mL(); 
                    mU(); 
                    mM(); 
                    mN(); 
                    mF(); 
                    mA(); 
                    mM(); 
                    mI(); 
                    mL(); 
                    mY(); 

                    }
                    break;
                case 2 :
                    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:538:20: T A B L E
                    {
                    mT(); 
                    mA(); 
                    mB(); 
                    mL(); 
                    mE(); 

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
    // $ANTLR end "K_COLUMNFAMILY"

    // $ANTLR start "K_INDEX"
    public final void mK_INDEX() throws RecognitionException {
        try {
            int _type = K_INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:539:8: ( I N D E X )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:539:16: I N D E X
            {
            mI(); 
            mN(); 
            mD(); 
            mE(); 
            mX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_INDEX"

    // $ANTLR start "K_ON"
    public final void mK_ON() throws RecognitionException {
        try {
            int _type = K_ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:540:5: ( O N )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:540:16: O N
            {
            mO(); 
            mN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ON"

    // $ANTLR start "K_DROP"
    public final void mK_DROP() throws RecognitionException {
        try {
            int _type = K_DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:541:7: ( D R O P )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:541:16: D R O P
            {
            mD(); 
            mR(); 
            mO(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_DROP"

    // $ANTLR start "K_PRIMARY"
    public final void mK_PRIMARY() throws RecognitionException {
        try {
            int _type = K_PRIMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:542:10: ( P R I M A R Y )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:542:16: P R I M A R Y
            {
            mP(); 
            mR(); 
            mI(); 
            mM(); 
            mA(); 
            mR(); 
            mY(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_PRIMARY"

    // $ANTLR start "K_INTO"
    public final void mK_INTO() throws RecognitionException {
        try {
            int _type = K_INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:543:7: ( I N T O )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:543:16: I N T O
            {
            mI(); 
            mN(); 
            mT(); 
            mO(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_INTO"

    // $ANTLR start "K_VALUES"
    public final void mK_VALUES() throws RecognitionException {
        try {
            int _type = K_VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:544:9: ( V A L U E S )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:544:16: V A L U E S
            {
            mV(); 
            mA(); 
            mL(); 
            mU(); 
            mE(); 
            mS(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_VALUES"

    // $ANTLR start "K_TIMESTAMP"
    public final void mK_TIMESTAMP() throws RecognitionException {
        try {
            int _type = K_TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:545:12: ( T I M E S T A M P )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:545:16: T I M E S T A M P
            {
            mT(); 
            mI(); 
            mM(); 
            mE(); 
            mS(); 
            mT(); 
            mA(); 
            mM(); 
            mP(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TIMESTAMP"

    // $ANTLR start "K_TTL"
    public final void mK_TTL() throws RecognitionException {
        try {
            int _type = K_TTL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:546:6: ( T T L )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:546:16: T T L
            {
            mT(); 
            mT(); 
            mL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TTL"

    // $ANTLR start "K_ALTER"
    public final void mK_ALTER() throws RecognitionException {
        try {
            int _type = K_ALTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:547:8: ( A L T E R )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:547:16: A L T E R
            {
            mA(); 
            mL(); 
            mT(); 
            mE(); 
            mR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ALTER"

    // $ANTLR start "K_ADD"
    public final void mK_ADD() throws RecognitionException {
        try {
            int _type = K_ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:548:6: ( A D D )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:548:16: A D D
            {
            mA(); 
            mD(); 
            mD(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_ADD"

    // $ANTLR start "K_TYPE"
    public final void mK_TYPE() throws RecognitionException {
        try {
            int _type = K_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:549:7: ( T Y P E )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:549:16: T Y P E
            {
            mT(); 
            mY(); 
            mP(); 
            mE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "K_TYPE"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:552:11: ( ( 'a' | 'A' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:552:13: ( 'a' | 'A' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:553:11: ( ( 'b' | 'B' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:553:13: ( 'b' | 'B' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:554:11: ( ( 'c' | 'C' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:554:13: ( 'c' | 'C' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:555:11: ( ( 'd' | 'D' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:555:13: ( 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:556:11: ( ( 'e' | 'E' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:556:13: ( 'e' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:557:11: ( ( 'f' | 'F' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:557:13: ( 'f' | 'F' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:558:11: ( ( 'g' | 'G' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:558:13: ( 'g' | 'G' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:559:11: ( ( 'h' | 'H' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:559:13: ( 'h' | 'H' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:560:11: ( ( 'i' | 'I' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:560:13: ( 'i' | 'I' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:561:11: ( ( 'j' | 'J' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:561:13: ( 'j' | 'J' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:562:11: ( ( 'k' | 'K' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:562:13: ( 'k' | 'K' )
            {
            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:563:11: ( ( 'l' | 'L' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:563:13: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:564:11: ( ( 'm' | 'M' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:564:13: ( 'm' | 'M' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:565:11: ( ( 'n' | 'N' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:565:13: ( 'n' | 'N' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:566:11: ( ( 'o' | 'O' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:566:13: ( 'o' | 'O' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:567:11: ( ( 'p' | 'P' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:567:13: ( 'p' | 'P' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:568:11: ( ( 'q' | 'Q' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:568:13: ( 'q' | 'Q' )
            {
            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:569:11: ( ( 'r' | 'R' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:569:13: ( 'r' | 'R' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:570:11: ( ( 's' | 'S' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:570:13: ( 's' | 'S' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:571:11: ( ( 't' | 'T' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:571:13: ( 't' | 'T' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:572:11: ( ( 'u' | 'U' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:572:13: ( 'u' | 'U' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:573:11: ( ( 'v' | 'V' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:573:13: ( 'v' | 'V' )
            {
            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:574:11: ( ( 'w' | 'W' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:574:13: ( 'w' | 'W' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:575:11: ( ( 'x' | 'X' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:575:13: ( 'x' | 'X' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:576:11: ( ( 'y' | 'Y' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:576:13: ( 'y' | 'Y' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:577:11: ( ( 'z' | 'Z' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:577:13: ( 'z' | 'Z' )
            {
            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int c;

            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:580:5: ( '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\'' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:580:7: '\\'' (c=~ ( '\\'' ) | '\\'' '\\'' )* '\\''
            {
            match('\''); 
             StringBuilder b = new StringBuilder(); 
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:582:7: (c=~ ( '\\'' ) | '\\'' '\\'' )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\'') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='\'') ) {
                        alt4=2;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:582:9: c=~ ( '\\'' )
            	    {
            	    c= input.LA(1);
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

            	     b.appendCodePoint(c);

            	    }
            	    break;
            	case 2 :
            	    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:583:9: '\\'' '\\''
            	    {
            	    match('\''); 
            	    match('\''); 
            	     b.appendCodePoint('\'');

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\''); 
             setText(b.toString()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:590:5: ( '0' .. '9' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:590:7: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:594:5: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:594:7: ( 'A' .. 'Z' | 'a' .. 'z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:598:5: ( ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:598:7: ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "RANGEOP"
    public final void mRANGEOP() throws RecognitionException {
        try {
            int _type = RANGEOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:602:5: ( '..' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:602:7: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RANGEOP"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:606:5: ( ( '-' )? ( DIGIT )+ )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:606:7: ( '-' )? ( DIGIT )+
            {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:606:7: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:606:7: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:606:12: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:606:12: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "QMARK"
    public final void mQMARK() throws RecognitionException {
        try {
            int _type = QMARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:610:5: ( '?' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:610:7: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QMARK"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken d=null;
            CommonToken r=null;

            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:618:5: (d= INTEGER r= RANGEOP | INTEGER '.' INTEGER )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:618:7: d= INTEGER r= RANGEOP
                    {
                    int dStart1898 = getCharIndex();
                    mINTEGER(); 
                    d = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, dStart1898, getCharIndex()-1);
                    int rStart1902 = getCharIndex();
                    mRANGEOP(); 
                    r = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, rStart1902, getCharIndex()-1);

                              d.setType(INTEGER);
                              emit(d);
                              r.setType(RANGEOP);
                              emit(r);
                          

                    }
                    break;
                case 2 :
                    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:625:9: INTEGER '.' INTEGER
                    {
                    mINTEGER(); 
                    match('.'); 
                    mINTEGER(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:629:5: ( LETTER ( LETTER | DIGIT | '_' )* )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:629:7: LETTER ( LETTER | DIGIT | '_' )*
            {
            mLETTER(); 
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:629:14: ( LETTER | DIGIT | '_' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:
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
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "COMPIDENT"
    public final void mCOMPIDENT() throws RecognitionException {
        try {
            int _type = COMPIDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:633:5: ( IDENT ( ':' ( IDENT | INTEGER ) )* )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:633:7: IDENT ( ':' ( IDENT | INTEGER ) )*
            {
            mIDENT(); 
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:633:13: ( ':' ( IDENT | INTEGER ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==':') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:633:15: ':' ( IDENT | INTEGER )
            	    {
            	    match(':'); 
            	    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:633:19: ( IDENT | INTEGER )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( ((LA9_0>='A' && LA9_0<='Z')||(LA9_0>='a' && LA9_0<='z')) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0=='-'||(LA9_0>='0' && LA9_0<='9')) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:633:20: IDENT
            	            {
            	            mIDENT(); 

            	            }
            	            break;
            	        case 2 :
            	            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:633:28: INTEGER
            	            {
            	            mINTEGER(); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPIDENT"

    // $ANTLR start "UUID"
    public final void mUUID() throws RecognitionException {
        try {
            int _type = UUID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:637:5: ( HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:637:7: HEX HEX HEX HEX HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX '-' HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX HEX
            {
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            match('-'); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 
            mHEX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UUID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:645:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:645:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:645:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
            	    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:
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

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:649:5: ( ( '--' | '//' ) ( . )* ( '\\n' | '\\r' ) )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:649:7: ( '--' | '//' ) ( . )* ( '\\n' | '\\r' )
            {
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:649:7: ( '--' | '//' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='-') ) {
                alt12=1;
            }
            else if ( (LA12_0=='/') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:649:8: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 2 :
                    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:649:15: '//'
                    {
                    match("//"); 


                    }
                    break;

            }

            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:649:21: ( . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                    alt13=2;
                }
                else if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:649:21: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "MULTILINE_COMMENT"
    public final void mMULTILINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTILINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:653:5: ( '/*' ( . )* '*/' )
            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:653:7: '/*' ( . )* '*/'
            {
            match("/*"); 

            // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:653:12: ( . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:653:12: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTILINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:8: ( T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | K_SELECT | K_FROM | K_WHERE | K_AND | K_KEY | K_INSERT | K_UPDATE | K_WITH | K_LIMIT | K_USING | K_CONSISTENCY | K_LEVEL | K_USE | K_FIRST | K_REVERSED | K_COUNT | K_SET | K_BEGIN | K_APPLY | K_BATCH | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_COLUMNFAMILY | K_INDEX | K_ON | K_DROP | K_PRIMARY | K_INTO | K_VALUES | K_TIMESTAMP | K_TTL | K_ALTER | K_ADD | K_TYPE | STRING_LITERAL | RANGEOP | INTEGER | QMARK | FLOAT | IDENT | COMPIDENT | UUID | WS | COMMENT | MULTILINE_COMMENT )
        int alt15=75;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:10: T__81
                {
                mT__81(); 

                }
                break;
            case 2 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:16: T__82
                {
                mT__82(); 

                }
                break;
            case 3 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:22: T__83
                {
                mT__83(); 

                }
                break;
            case 4 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:28: T__84
                {
                mT__84(); 

                }
                break;
            case 5 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:34: T__85
                {
                mT__85(); 

                }
                break;
            case 6 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:40: T__86
                {
                mT__86(); 

                }
                break;
            case 7 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:46: T__87
                {
                mT__87(); 

                }
                break;
            case 8 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:52: T__88
                {
                mT__88(); 

                }
                break;
            case 9 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:58: T__89
                {
                mT__89(); 

                }
                break;
            case 10 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:64: T__90
                {
                mT__90(); 

                }
                break;
            case 11 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:70: T__91
                {
                mT__91(); 

                }
                break;
            case 12 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:76: T__92
                {
                mT__92(); 

                }
                break;
            case 13 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:82: T__93
                {
                mT__93(); 

                }
                break;
            case 14 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:88: T__94
                {
                mT__94(); 

                }
                break;
            case 15 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:94: T__95
                {
                mT__95(); 

                }
                break;
            case 16 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:100: T__96
                {
                mT__96(); 

                }
                break;
            case 17 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:106: T__97
                {
                mT__97(); 

                }
                break;
            case 18 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:112: T__98
                {
                mT__98(); 

                }
                break;
            case 19 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:118: T__99
                {
                mT__99(); 

                }
                break;
            case 20 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:124: T__100
                {
                mT__100(); 

                }
                break;
            case 21 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:131: T__101
                {
                mT__101(); 

                }
                break;
            case 22 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:138: T__102
                {
                mT__102(); 

                }
                break;
            case 23 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:145: T__103
                {
                mT__103(); 

                }
                break;
            case 24 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:152: T__104
                {
                mT__104(); 

                }
                break;
            case 25 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:159: T__105
                {
                mT__105(); 

                }
                break;
            case 26 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:166: T__106
                {
                mT__106(); 

                }
                break;
            case 27 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:173: T__107
                {
                mT__107(); 

                }
                break;
            case 28 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:180: K_SELECT
                {
                mK_SELECT(); 

                }
                break;
            case 29 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:189: K_FROM
                {
                mK_FROM(); 

                }
                break;
            case 30 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:196: K_WHERE
                {
                mK_WHERE(); 

                }
                break;
            case 31 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:204: K_AND
                {
                mK_AND(); 

                }
                break;
            case 32 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:210: K_KEY
                {
                mK_KEY(); 

                }
                break;
            case 33 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:216: K_INSERT
                {
                mK_INSERT(); 

                }
                break;
            case 34 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:225: K_UPDATE
                {
                mK_UPDATE(); 

                }
                break;
            case 35 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:234: K_WITH
                {
                mK_WITH(); 

                }
                break;
            case 36 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:241: K_LIMIT
                {
                mK_LIMIT(); 

                }
                break;
            case 37 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:249: K_USING
                {
                mK_USING(); 

                }
                break;
            case 38 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:257: K_CONSISTENCY
                {
                mK_CONSISTENCY(); 

                }
                break;
            case 39 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:271: K_LEVEL
                {
                mK_LEVEL(); 

                }
                break;
            case 40 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:279: K_USE
                {
                mK_USE(); 

                }
                break;
            case 41 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:285: K_FIRST
                {
                mK_FIRST(); 

                }
                break;
            case 42 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:293: K_REVERSED
                {
                mK_REVERSED(); 

                }
                break;
            case 43 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:304: K_COUNT
                {
                mK_COUNT(); 

                }
                break;
            case 44 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:312: K_SET
                {
                mK_SET(); 

                }
                break;
            case 45 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:318: K_BEGIN
                {
                mK_BEGIN(); 

                }
                break;
            case 46 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:326: K_APPLY
                {
                mK_APPLY(); 

                }
                break;
            case 47 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:334: K_BATCH
                {
                mK_BATCH(); 

                }
                break;
            case 48 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:342: K_TRUNCATE
                {
                mK_TRUNCATE(); 

                }
                break;
            case 49 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:353: K_DELETE
                {
                mK_DELETE(); 

                }
                break;
            case 50 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:362: K_IN
                {
                mK_IN(); 

                }
                break;
            case 51 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:367: K_CREATE
                {
                mK_CREATE(); 

                }
                break;
            case 52 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:376: K_KEYSPACE
                {
                mK_KEYSPACE(); 

                }
                break;
            case 53 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:387: K_COLUMNFAMILY
                {
                mK_COLUMNFAMILY(); 

                }
                break;
            case 54 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:402: K_INDEX
                {
                mK_INDEX(); 

                }
                break;
            case 55 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:410: K_ON
                {
                mK_ON(); 

                }
                break;
            case 56 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:415: K_DROP
                {
                mK_DROP(); 

                }
                break;
            case 57 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:422: K_PRIMARY
                {
                mK_PRIMARY(); 

                }
                break;
            case 58 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:432: K_INTO
                {
                mK_INTO(); 

                }
                break;
            case 59 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:439: K_VALUES
                {
                mK_VALUES(); 

                }
                break;
            case 60 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:448: K_TIMESTAMP
                {
                mK_TIMESTAMP(); 

                }
                break;
            case 61 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:460: K_TTL
                {
                mK_TTL(); 

                }
                break;
            case 62 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:466: K_ALTER
                {
                mK_ALTER(); 

                }
                break;
            case 63 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:474: K_ADD
                {
                mK_ADD(); 

                }
                break;
            case 64 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:480: K_TYPE
                {
                mK_TYPE(); 

                }
                break;
            case 65 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:487: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 66 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:502: RANGEOP
                {
                mRANGEOP(); 

                }
                break;
            case 67 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:510: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 68 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:518: QMARK
                {
                mQMARK(); 

                }
                break;
            case 69 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:524: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 70 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:530: IDENT
                {
                mIDENT(); 

                }
                break;
            case 71 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:536: COMPIDENT
                {
                mCOMPIDENT(); 

                }
                break;
            case 72 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:546: UUID
                {
                mUUID(); 

                }
                break;
            case 73 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:551: WS
                {
                mWS(); 

                }
                break;
            case 74 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:554: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 75 :
                // /home/shawnz99/src/school/research/framework/Eiger-PORT/Eiger-PORT/src/java/org/apache/cassandra/cql/Cql.g:1:562: MULTILINE_COMMENT
                {
                mMULTILINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA7_eotS =
        "\6\uffff";
    static final String DFA7_eofS =
        "\6\uffff";
    static final String DFA7_minS =
        "\1\55\1\60\1\56\1\55\2\uffff";
    static final String DFA7_maxS =
        "\4\71\2\uffff";
    static final String DFA7_acceptS =
        "\4\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\6\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\2\uffff\12\2",
            "\12\2",
            "\1\3\1\uffff\12\2",
            "\1\5\1\4\1\uffff\12\5",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "617:1: FLOAT : (d= INTEGER r= RANGEOP | INTEGER '.' INTEGER );";
        }
    }
    static final String DFA15_eotS =
        "\3\uffff\1\56\4\uffff\11\62\1\uffff\1\127\1\131\1\133\22\62\1\uffff"+
        "\1\150\1\uffff\1\62\4\uffff\3\62\1\uffff\2\62\1\uffff\20\62\2\u0084"+
        "\15\62\1\uffff\1\150\5\uffff\7\62\1\u00a0\4\62\1\uffff\1\150\3\uffff"+
        "\7\62\1\u00ae\1\62\1\u00b0\1\u00b1\1\u00ae\5\62\1\u00b7\4\62\1\u00bd"+
        "\1\uffff\4\62\1\u00c2\17\62\1\u00d2\3\62\1\u00d6\2\62\1\uffff\1"+
        "\u00ae\4\62\1\150\1\u00df\6\62\1\uffff\1\62\2\uffff\1\62\1\u00e8"+
        "\3\62\1\uffff\1\62\1\u00ed\3\62\1\uffff\1\u00f1\2\62\1\u00f4\1\uffff"+
        "\10\62\1\u00fd\4\62\1\u0102\1\62\1\uffff\2\62\1\u0106\1\uffff\7"+
        "\62\1\150\1\uffff\3\62\1\u0112\1\u0113\1\u0114\1\u0115\1\u0116\1"+
        "\uffff\2\62\1\u0119\1\62\1\uffff\3\62\1\uffff\1\u011e\1\62\1\uffff"+
        "\1\u0120\1\62\2\u0123\3\62\1\u0127\1\uffff\1\u0128\3\62\1\uffff"+
        "\2\62\1\u012e\1\uffff\1\62\1\u0130\5\62\1\150\1\u0137\2\62\5\uffff"+
        "\2\62\1\uffff\2\62\1\u013e\1\u013f\1\uffff\1\u0140\1\uffff\1\u0141"+
        "\1\62\1\uffff\2\62\1\u0145\2\uffff\1\u0146\1\62\1\u0148\1\u0149"+
        "\1\u014a\1\uffff\1\62\1\uffff\1\62\1\u00ae\3\62\1\150\1\uffff\1"+
        "\u0151\4\62\1\u0156\4\uffff\1\u0157\2\62\2\uffff\1\u015a\3\uffff"+
        "\4\62\1\u015f\1\150\1\uffff\3\62\1\u0163\2\uffff\2\62\1\uffff\1"+
        "\u014a\2\62\1\u0168\1\uffff\1\150\1\u0169\1\u016a\1\uffff\4\62\3"+
        "\uffff\5\62\1\u0174\1\62\1\u00ae\1\u0119\1\uffff\1\u00ae";
    static final String DFA15_eofS =
        "\u0176\uffff";
    static final String DFA15_minS =
        "\1\11\2\uffff\1\56\4\uffff\11\60\1\uffff\1\55\2\75\22\60\1\uffff"+
        "\1\56\1\uffff\1\60\1\uffff\1\52\2\uffff\3\60\1\uffff\2\60\1\uffff"+
        "\37\60\1\uffff\1\56\5\uffff\14\60\1\uffff\1\56\3\uffff\27\60\1\uffff"+
        "\33\60\1\uffff\5\60\1\56\7\60\1\uffff\1\60\2\uffff\5\60\1\uffff"+
        "\5\60\1\uffff\4\60\1\uffff\17\60\1\uffff\3\60\1\uffff\7\60\1\56"+
        "\1\uffff\10\60\1\uffff\4\60\1\uffff\3\60\1\uffff\2\60\1\uffff\10"+
        "\60\1\uffff\4\60\1\uffff\3\60\1\uffff\7\60\1\56\3\60\5\uffff\2\60"+
        "\1\uffff\4\60\1\uffff\1\60\1\uffff\2\60\1\uffff\3\60\2\uffff\5\60"+
        "\1\uffff\1\60\1\uffff\5\60\1\56\1\uffff\6\60\4\uffff\3\60\2\uffff"+
        "\1\60\3\uffff\5\60\1\56\1\uffff\1\55\3\60\2\uffff\2\60\1\uffff\4"+
        "\60\1\uffff\1\55\2\60\1\uffff\4\60\3\uffff\11\60\1\uffff\1\60";
    static final String DFA15_maxS =
        "\1\172\2\uffff\1\56\4\uffff\11\172\1\uffff\1\71\2\75\22\172\1\uffff"+
        "\1\146\1\uffff\1\172\1\uffff\1\57\2\uffff\3\172\1\uffff\2\172\1"+
        "\uffff\37\172\1\uffff\1\71\5\uffff\14\172\1\uffff\1\146\3\uffff"+
        "\27\172\1\uffff\33\172\1\uffff\5\172\1\146\7\172\1\uffff\1\172\2"+
        "\uffff\5\172\1\uffff\5\172\1\uffff\4\172\1\uffff\17\172\1\uffff"+
        "\3\172\1\uffff\7\172\1\146\1\uffff\10\172\1\uffff\4\172\1\uffff"+
        "\3\172\1\uffff\2\172\1\uffff\10\172\1\uffff\4\172\1\uffff\3\172"+
        "\1\uffff\7\172\1\146\3\172\5\uffff\2\172\1\uffff\4\172\1\uffff\1"+
        "\172\1\uffff\2\172\1\uffff\3\172\2\uffff\5\172\1\uffff\1\172\1\uffff"+
        "\5\172\1\146\1\uffff\6\172\4\uffff\3\172\2\uffff\1\172\3\uffff\5"+
        "\172\1\146\1\uffff\4\172\2\uffff\2\172\1\uffff\4\172\1\uffff\1\71"+
        "\2\172\1\uffff\4\172\3\uffff\11\172\1\uffff\1\172";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\11\uffff\1\26\25\uffff"+
        "\1\101\1\uffff\1\104\1\uffff\1\111\1\uffff\1\102\1\3\3\uffff\1\106"+
        "\2\uffff\1\107\37\uffff\1\112\1\uffff\1\27\1\31\1\30\1\32\1\33\14"+
        "\uffff\1\103\1\uffff\1\105\1\110\1\113\27\uffff\1\62\33\uffff\1"+
        "\67\15\uffff\1\47\1\uffff\1\77\1\37\5\uffff\1\75\5\uffff\1\14\4"+
        "\uffff\1\50\17\uffff\1\54\3\uffff\1\40\10\uffff\1\10\10\uffff\1"+
        "\12\4\uffff\1\100\3\uffff\1\72\2\uffff\1\17\10\uffff\1\35\4\uffff"+
        "\1\70\3\uffff\1\43\13\uffff\1\57\1\55\1\11\1\76\1\56\2\uffff\1\65"+
        "\4\uffff\1\66\1\uffff\1\45\2\uffff\1\53\3\uffff\1\23\1\51\5\uffff"+
        "\1\36\1\uffff\1\44\6\uffff\1\16\6\uffff\1\15\1\73\1\41\1\42\3\uffff"+
        "\1\63\1\24\1\uffff\1\61\1\34\1\64\6\uffff\1\21\4\uffff\1\13\1\20"+
        "\2\uffff\1\25\4\uffff\1\71\3\uffff\1\60\4\uffff\1\52\1\22\1\74\11"+
        "\uffff\1\46\1\uffff";
    static final String DFA15_specialS =
        "\u0176\uffff}>";
    static final String[] DFA15_transitionS = {
            "\2\53\2\uffff\1\53\22\uffff\1\53\6\uffff\1\47\1\1\1\2\1\5\1"+
            "\21\1\4\1\22\1\3\1\54\12\50\1\uffff\1\6\1\23\1\7\1\24\1\51\1"+
            "\uffff\1\30\1\42\1\35\1\44\1\40\1\26\2\52\1\32\1\52\1\31\1\34"+
            "\2\52\1\36\1\45\1\37\1\41\1\25\1\43\1\33\1\46\1\27\3\52\6\uffff"+
            "\1\11\1\10\1\16\1\20\1\40\1\17\2\52\1\14\1\52\1\31\1\34\2\52"+
            "\1\36\1\45\1\37\1\41\1\25\1\12\1\15\1\13\1\27\3\52",
            "",
            "",
            "\1\55",
            "",
            "",
            "",
            "",
            "\12\67\1\65\6\uffff\1\63\3\67\1\66\1\67\24\64\4\uffff\1\64"+
            "\1\uffff\1\63\3\67\1\66\1\67\2\64\1\60\2\64\1\57\2\64\1\61\13"+
            "\64",
            "\12\67\1\65\6\uffff\3\67\1\72\2\67\5\64\1\71\1\64\1\73\1\64"+
            "\1\74\12\64\4\uffff\1\64\1\uffff\3\67\1\72\2\67\5\64\1\71\1"+
            "\64\1\73\1\64\1\74\2\64\1\70\7\64",
            "\12\64\1\65\6\uffff\1\77\7\64\1\100\10\64\1\102\1\64\1\101"+
            "\4\64\1\103\1\64\4\uffff\1\64\1\uffff\1\77\3\64\1\75\3\64\1"+
            "\76\10\64\1\102\1\64\1\101\4\64\1\103\1\64",
            "\12\64\1\65\6\uffff\1\105\31\64\4\uffff\1\64\1\uffff\1\104"+
            "\31\64",
            "\12\64\1\65\6\uffff\15\64\1\107\14\64\4\uffff\1\64\1\uffff"+
            "\15\64\1\106\14\64",
            "\12\64\1\65\6\uffff\17\64\1\112\2\64\1\111\7\64\4\uffff\1\64"+
            "\1\uffff\17\64\1\112\2\64\1\111\1\64\1\110\5\64",
            "\12\67\1\65\6\uffff\6\67\10\64\1\115\2\64\1\114\10\64\4\uffff"+
            "\1\64\1\uffff\6\67\10\64\1\113\2\64\1\114\10\64",
            "\12\67\1\65\6\uffff\6\67\2\64\1\120\10\64\1\117\10\64\4\uffff"+
            "\1\64\1\uffff\6\67\2\64\1\120\2\64\1\116\5\64\1\117\10\64",
            "\12\67\1\65\6\uffff\4\67\1\123\1\67\13\64\1\124\10\64\4\uffff"+
            "\1\64\1\uffff\4\67\1\122\1\67\10\64\1\121\2\64\1\124\10\64",
            "",
            "\1\125\2\uffff\12\126",
            "\1\130",
            "\1\132",
            "\12\64\1\65\6\uffff\2\64\1\135\1\64\1\134\25\64\4\uffff\1\64"+
            "\1\uffff\2\64\1\135\1\64\1\134\25\64",
            "\12\67\1\65\6\uffff\6\67\2\64\1\120\10\64\1\117\10\64\4\uffff"+
            "\1\64\1\uffff\6\67\2\64\1\120\10\64\1\117\10\64",
            "\12\64\1\65\6\uffff\7\64\1\136\1\137\21\64\4\uffff\1\64\1\uffff"+
            "\7\64\1\136\1\137\21\64",
            "\12\67\1\65\6\uffff\3\67\1\72\2\67\5\64\1\71\1\64\1\73\1\64"+
            "\1\74\12\64\4\uffff\1\64\1\uffff\3\67\1\72\2\67\5\64\1\71\1"+
            "\64\1\73\1\64\1\74\12\64",
            "\12\64\1\65\6\uffff\4\64\1\140\25\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\140\25\64",
            "\12\64\1\65\6\uffff\15\64\1\107\14\64\4\uffff\1\64\1\uffff"+
            "\15\64\1\107\14\64",
            "\12\64\1\65\6\uffff\17\64\1\112\2\64\1\111\7\64\4\uffff\1\64"+
            "\1\uffff\17\64\1\112\2\64\1\111\7\64",
            "\12\64\1\65\6\uffff\10\64\1\141\5\64\1\142\13\64\4\uffff\1"+
            "\64\1\uffff\10\64\1\141\5\64\1\142\13\64",
            "\12\67\1\65\6\uffff\6\67\10\64\1\115\2\64\1\114\10\64\4\uffff"+
            "\1\64\1\uffff\6\67\10\64\1\115\2\64\1\114\10\64",
            "\12\64\1\65\6\uffff\15\64\1\143\14\64\4\uffff\1\64\1\uffff"+
            "\15\64\1\143\14\64",
            "\12\64\1\65\6\uffff\24\64\1\144\5\64\4\uffff\1\64\1\uffff\24"+
            "\64\1\144\5\64",
            "\12\67\1\65\6\uffff\1\145\5\67\24\64\4\uffff\1\64\1\uffff\1"+
            "\145\5\67\24\64",
            "\12\64\1\65\6\uffff\4\64\1\146\25\64\4\uffff\1\64\1\uffff\4"+
            "\64\1\146\25\64",
            "\12\67\1\65\6\uffff\1\63\3\67\1\66\1\67\24\64\4\uffff\1\64"+
            "\1\uffff\1\63\3\67\1\66\1\67\24\64",
            "\12\64\1\65\6\uffff\1\77\7\64\1\100\10\64\1\102\1\64\1\101"+
            "\4\64\1\103\1\64\4\uffff\1\64\1\uffff\1\77\7\64\1\100\10\64"+
            "\1\102\1\64\1\101\4\64\1\103\1\64",
            "\12\67\1\65\6\uffff\4\67\1\123\1\67\13\64\1\124\10\64\4\uffff"+
            "\1\64\1\uffff\4\67\1\123\1\67\13\64\1\124\10\64",
            "\12\64\1\65\6\uffff\21\64\1\147\10\64\4\uffff\1\64\1\uffff"+
            "\21\64\1\147\10\64",
            "\12\64\1\65\6\uffff\1\105\31\64\4\uffff\1\64\1\uffff\1\105"+
            "\31\64",
            "",
            "\1\152\1\uffff\12\151\7\uffff\6\153\32\uffff\6\153",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\154\4\uffff\1\125",
            "",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\155"+
            "\13\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\156\23"+
            "\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\157"+
            "\13\64",
            "",
            "\12\160\1\65\6\uffff\6\160\15\64\1\161\6\64\4\uffff\1\64\1"+
            "\uffff\6\160\15\64\1\161\6\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\160\1\65\6\uffff\6\160\1\162\23\64\4\uffff\1\64\1\uffff"+
            "\6\160\1\162\23\64",
            "\12\160\1\65\6\uffff\6\160\24\64\4\uffff\1\64\1\uffff\6\160"+
            "\24\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\163\27"+
            "\64",
            "\12\64\1\65\6\uffff\13\64\1\164\7\64\1\165\6\64\4\uffff\1\64"+
            "\1\uffff\13\64\1\164\7\64\1\165\6\64",
            "\12\160\1\65\6\uffff\3\160\1\166\2\160\24\64\4\uffff\1\64\1"+
            "\uffff\3\160\1\166\2\160\24\64",
            "\12\64\1\65\6\uffff\3\64\1\167\24\64\1\170\1\64\4\uffff\1\64"+
            "\1\uffff\3\64\1\167\24\64\1\170\1\64",
            "\12\64\1\65\6\uffff\17\64\1\171\12\64\4\uffff\1\64\1\uffff"+
            "\17\64\1\171\12\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\27\64\1\172"+
            "\2\64",
            "\12\64\1\65\6\uffff\14\64\1\174\15\64\4\uffff\1\64\1\uffff"+
            "\14\64\1\173\15\64",
            "\12\64\1\65\6\uffff\1\64\1\175\30\64\4\uffff\1\64\1\uffff\1"+
            "\64\1\175\30\64",
            "\12\64\1\65\6\uffff\14\64\1\174\15\64\4\uffff\1\64\1\uffff"+
            "\14\64\1\174\15\64",
            "\12\64\1\65\6\uffff\13\64\1\176\16\64\4\uffff\1\64\1\uffff"+
            "\13\64\1\176\16\64",
            "\12\64\1\65\6\uffff\24\64\1\177\5\64\4\uffff\1\64\1\uffff\24"+
            "\64\1\177\5\64",
            "\12\64\1\65\6\uffff\17\64\1\u0080\12\64\4\uffff\1\64\1\uffff"+
            "\17\64\1\u0080\12\64",
            "\12\64\1\65\6\uffff\13\64\1\u0082\16\64\4\uffff\1\64\1\uffff"+
            "\13\64\1\u0082\5\64\1\u0081\10\64",
            "\12\64\1\65\6\uffff\13\64\1\u0082\16\64\4\uffff\1\64\1\uffff"+
            "\13\64\1\u0082\16\64",
            "\12\64\1\65\6\uffff\3\64\1\u0085\16\64\1\u0086\1\u0087\6\64"+
            "\4\uffff\1\64\1\uffff\3\64\1\u0085\16\64\1\u0086\1\u0083\6\64",
            "\12\64\1\65\6\uffff\3\64\1\u0085\16\64\1\u0086\1\u0087\6\64"+
            "\4\uffff\1\64\1\uffff\3\64\1\u0085\16\64\1\u0086\1\u0087\6\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u0088"+
            "\21\64",
            "\12\64\1\65\6\uffff\4\64\1\u0089\3\64\1\u008a\21\64\4\uffff"+
            "\1\64\1\uffff\4\64\1\u0089\3\64\1\u008a\21\64",
            "\12\64\1\65\6\uffff\3\64\1\u008b\26\64\4\uffff\1\64\1\uffff"+
            "\3\64\1\u008b\26\64",
            "\12\64\1\65\6\uffff\13\64\1\u008e\1\64\1\u008f\6\64\1\u008d"+
            "\5\64\4\uffff\1\64\1\uffff\13\64\1\u008e\1\64\1\u008f\6\64\1"+
            "\u008c\5\64",
            "\12\64\1\65\6\uffff\4\64\1\u0090\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u0090\25\64",
            "\12\64\1\65\6\uffff\13\64\1\u008e\1\64\1\u008f\6\64\1\u008d"+
            "\5\64\4\uffff\1\64\1\uffff\13\64\1\u008e\1\64\1\u008f\6\64\1"+
            "\u008d\5\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u0091"+
            "\13\64",
            "\12\64\1\65\6\uffff\16\64\1\u0092\13\64\4\uffff\1\64\1\uffff"+
            "\16\64\1\u0092\13\64",
            "\12\64\1\65\6\uffff\21\64\1\u0093\10\64\4\uffff\1\64\1\uffff"+
            "\21\64\1\u0093\10\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u0094"+
            "\5\64",
            "\12\160\1\65\6\uffff\6\160\5\64\1\u0096\16\64\4\uffff\1\64"+
            "\1\uffff\2\160\1\u0095\3\160\5\64\1\u0096\16\64",
            "\12\160\1\65\6\uffff\6\160\5\64\1\u0096\16\64\4\uffff\1\64"+
            "\1\uffff\6\160\5\64\1\u0096\16\64",
            "\12\64\1\65\6\uffff\16\64\1\u0097\13\64\4\uffff\1\64\1\uffff"+
            "\16\64\1\u0097\13\64",
            "",
            "\1\152\1\uffff\12\126",
            "",
            "",
            "",
            "",
            "",
            "\12\64\1\65\6\uffff\13\64\1\u0098\7\64\1\u0099\6\64\4\uffff"+
            "\1\64\1\uffff\13\64\1\u0098\7\64\1\u0099\6\64",
            "\12\64\1\65\6\uffff\7\64\1\u009a\22\64\4\uffff\1\64\1\uffff"+
            "\7\64\1\u009a\22\64",
            "\12\64\1\65\6\uffff\4\64\1\u009b\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u009b\25\64",
            "\12\64\1\65\6\uffff\23\64\1\u009c\6\64\4\uffff\1\64\1\uffff"+
            "\23\64\1\u009c\6\64",
            "\12\64\1\65\6\uffff\30\64\1\u009d\1\64\4\uffff\1\64\1\uffff"+
            "\30\64\1\u009d\1\64",
            "\12\64\1\65\6\uffff\14\64\1\u009e\15\64\4\uffff\1\64\1\uffff"+
            "\14\64\1\u009e\15\64",
            "\12\64\1\65\6\uffff\2\64\1\u009f\27\64\4\uffff\1\64\1\uffff"+
            "\2\64\1\u009f\27\64",
            "\12\64\1\65\6\uffff\4\64\1\u00a1\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u00a1\25\64",
            "\12\64\1\65\6\uffff\16\64\1\u00a2\13\64\4\uffff\1\64\1\uffff"+
            "\16\64\1\u00a2\13\64",
            "\12\160\1\65\6\uffff\2\160\1\u00a3\3\160\24\64\4\uffff\1\64"+
            "\1\uffff\2\160\1\u00a3\3\160\24\64",
            "\12\64\1\65\6\uffff\25\64\1\u00a4\4\64\4\uffff\1\64\1\uffff"+
            "\25\64\1\u00a4\4\64",
            "\12\64\1\65\6\uffff\10\64\1\u00a5\21\64\4\uffff\1\64\1\uffff"+
            "\10\64\1\u00a5\21\64",
            "",
            "\1\152\1\uffff\12\u00a6\7\uffff\6\153\32\uffff\6\153",
            "",
            "",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\1\64\1\u00a7"+
            "\30\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00a8"+
            "\21\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u00a9"+
            "\16\64",
            "\12\u00aa\1\65\6\uffff\6\u00aa\24\64\4\uffff\1\64\1\uffff\6"+
            "\u00aa\24\64",
            "\12\64\1\65\6\uffff\2\64\1\u00ab\27\64\4\uffff\1\64\1\uffff"+
            "\2\64\1\u00ab\27\64",
            "\12\64\1\65\6\uffff\10\64\1\u00ac\21\64\4\uffff\1\64\1\uffff"+
            "\10\64\1\u00ac\21\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00ad"+
            "\21\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\4\64\1\u00af\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u00af\25\64",
            "\12\u00aa\1\65\6\uffff\6\u00aa\24\64\4\uffff\1\64\1\uffff\6"+
            "\u00aa\24\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\13\64\1\u00b2\16\64\4\uffff\1\64\1\uffff"+
            "\13\64\1\u00b2\16\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00b3"+
            "\6\64",
            "\12\64\1\65\6\uffff\4\64\1\u00b5\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u00b4\25\64",
            "\12\64\1\65\6\uffff\4\64\1\u00b5\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u00b5\25\64",
            "\12\64\1\65\6\uffff\13\64\1\u00b6\16\64\4\uffff\1\64\1\uffff"+
            "\13\64\1\u00b6\16\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\15\64\1\u00b8\14\64\4\uffff\1\64\1\uffff"+
            "\15\64\1\u00b8\14\64",
            "\12\64\1\65\6\uffff\4\64\1\u00b9\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u00b9\25\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00ba"+
            "\5\64\1\u00bb\21\64",
            "\12\64\1\65\6\uffff\24\64\1\u00bc\5\64\4\uffff\1\64\1\uffff"+
            "\24\64\1\u00bc\5\64",
            "\12\64\1\65\6\uffff\16\64\1\u00be\13\64\4\uffff\1\64\1\uffff"+
            "\16\64\1\u00be\13\64",
            "",
            "\12\64\1\65\6\uffff\4\64\1\u00bf\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u00bf\25\64",
            "\12\64\1\65\6\uffff\4\64\1\u00c0\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u00c0\25\64",
            "\12\64\1\65\6\uffff\16\64\1\u00be\13\64\4\uffff\1\64\1\uffff"+
            "\16\64\1\u00be\13\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u00c1"+
            "\26\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\15\64\1\u00c3\14\64\4\uffff\1\64\1\uffff"+
            "\15\64\1\u00c3\14\64",
            "\12\64\1\65\6\uffff\1\u00c4\31\64\4\uffff\1\64\1\uffff\1\u00c4"+
            "\31\64",
            "\12\64\1\65\6\uffff\15\64\1\u00c6\14\64\4\uffff\1\64\1\uffff"+
            "\15\64\1\u00c5\14\64",
            "\12\64\1\65\6\uffff\15\64\1\u00c6\14\64\4\uffff\1\64\1\uffff"+
            "\15\64\1\u00c6\14\64",
            "\12\64\1\65\6\uffff\24\64\1\u00c7\5\64\4\uffff\1\64\1\uffff"+
            "\24\64\1\u00c7\5\64",
            "\12\64\1\65\6\uffff\22\64\1\u00c8\7\64\4\uffff\1\64\1\uffff"+
            "\22\64\1\u00c8\7\64",
            "\12\64\1\65\6\uffff\1\u00c9\31\64\4\uffff\1\64\1\uffff\1\u00c9"+
            "\31\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\1\u00ca\31\64",
            "\12\64\1\65\6\uffff\14\64\1\u00cb\15\64\4\uffff\1\64\1\uffff"+
            "\14\64\1\u00cb\15\64",
            "\12\64\1\65\6\uffff\22\64\1\u00cc\7\64\4\uffff\1\64\1\uffff"+
            "\22\64\1\u00cc\7\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\1\64\1\u00cd"+
            "\30\64",
            "\12\u00aa\1\65\6\uffff\6\u00aa\24\64\4\uffff\1\64\1\uffff\6"+
            "\u00aa\2\64\1\u00ce\21\64",
            "\12\64\1\65\6\uffff\4\64\1\u00cf\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u00cf\25\64",
            "\12\64\1\65\6\uffff\17\64\1\u00d0\12\64\4\uffff\1\64\1\uffff"+
            "\17\64\1\u00d0\12\64",
            "\12\64\1\65\6\uffff\4\64\1\u00d1\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u00d1\25\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\4\64\1\u00d3\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u00d3\25\64",
            "\12\64\1\65\6\uffff\21\64\1\u00d4\10\64\4\uffff\1\64\1\uffff"+
            "\21\64\1\u00d4\10\64",
            "\12\64\1\65\6\uffff\7\64\1\u00d5\22\64\4\uffff\1\64\1\uffff"+
            "\7\64\1\u00d5\22\64",
            "\12\64\1\65\6\uffff\22\64\1\u00d7\7\64\4\uffff\1\64\1\uffff"+
            "\22\64\1\u00d7\7\64",
            "\12\64\1\65\6\uffff\10\64\1\u00d8\21\64\4\uffff\1\64\1\uffff"+
            "\10\64\1\u00d8\21\64",
            "\12\64\1\65\6\uffff\1\u00d9\31\64\4\uffff\1\64\1\uffff\1\u00d9"+
            "\31\64",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\21\64\1\u00da\10\64\4\uffff\1\64\1\uffff"+
            "\21\64\1\u00da\10\64",
            "\12\u00aa\1\65\6\uffff\6\u00aa\1\64\1\u00db\22\64\4\uffff\1"+
            "\64\1\uffff\6\u00aa\1\64\1\u00db\22\64",
            "\12\64\1\65\6\uffff\4\64\1\u00dc\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u00dc\25\64",
            "\12\64\1\65\6\uffff\14\64\1\u00dd\15\64\4\uffff\1\64\1\uffff"+
            "\14\64\1\u00dd\15\64",
            "\1\152\1\uffff\12\u00de\7\uffff\6\153\32\uffff\6\153",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00e0"+
            "\14\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00e1"+
            "\25\64",
            "\12\u00e2\1\65\6\uffff\6\u00e2\24\64\4\uffff\1\64\1\uffff\6"+
            "\u00e2\24\64",
            "\12\64\1\65\6\uffff\7\64\1\u00e3\22\64\4\uffff\1\64\1\uffff"+
            "\7\64\1\u00e3\22\64",
            "\12\64\1\65\6\uffff\15\64\1\u00e4\14\64\4\uffff\1\64\1\uffff"+
            "\15\64\1\u00e4\14\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00e5"+
            "\21\64",
            "",
            "\12\64\1\65\6\uffff\21\64\1\u00e6\10\64\4\uffff\1\64\1\uffff"+
            "\21\64\1\u00e6\10\64",
            "",
            "",
            "\12\64\1\65\6\uffff\30\64\1\u00e7\1\64\4\uffff\1\64\1\uffff"+
            "\30\64\1\u00e7\1\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\22\64\1\u00ea\7\64\4\uffff\1\64\1\uffff"+
            "\22\64\1\u00e9\7\64",
            "\12\64\1\65\6\uffff\22\64\1\u00ea\7\64\4\uffff\1\64\1\uffff"+
            "\22\64\1\u00ea\7\64",
            "\12\64\1\65\6\uffff\4\64\1\u00eb\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u00eb\25\64",
            "",
            "\12\64\1\65\6\uffff\2\64\1\u00ec\27\64\4\uffff\1\64\1\uffff"+
            "\2\64\1\u00ec\27\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\7\64\1\u00ee"+
            "\22\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00ef"+
            "\14\64",
            "\12\64\1\65\6\uffff\4\64\1\u00f0\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u00f0\25\64",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\27\64\1\u00f2\2\64\4\uffff\1\64\1\uffff"+
            "\27\64\1\u00f2\2\64",
            "\12\64\1\65\6\uffff\21\64\1\u00f3\10\64\4\uffff\1\64\1\uffff"+
            "\21\64\1\u00f3\10\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\1\65\6\uffff\6\64\1\u00f5\23\64\4\uffff\1\64\1\uffff"+
            "\6\64\1\u00f5\23\64",
            "\12\64\1\65\6\uffff\23\64\1\u00f6\6\64\4\uffff\1\64\1\uffff"+
            "\23\64\1\u00f6\6\64",
            "\12\64\1\65\6\uffff\23\64\1\u00f8\6\64\4\uffff\1\64\1\uffff"+
            "\23\64\1\u00f7\6\64",
            "\12\64\1\65\6\uffff\23\64\1\u00f8\6\64\4\uffff\1\64\1\uffff"+
            "\23\64\1\u00f8\6\64",
            "\12\64\1\65\6\uffff\14\64\1\u00f9\15\64\4\uffff\1\64\1\uffff"+
            "\14\64\1\u00f9\15\64",
            "\12\64\1\65\6\uffff\10\64\1\u00fa\21\64\4\uffff\1\64\1\uffff"+
            "\10\64\1\u00fa\21\64",
            "\12\64\1\65\6\uffff\23\64\1\u00fb\6\64\4\uffff\1\64\1\uffff"+
            "\23\64\1\u00fb\6\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00fc"+
            "\6\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\23\64\1\u00fe\6\64\4\uffff\1\64\1\uffff"+
            "\23\64\1\u00fe\6\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u00ff"+
            "\16\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\u0100"+
            "\15\64",
            "\12\64\1\65\6\uffff\23\64\1\u0101\6\64\4\uffff\1\64\1\uffff"+
            "\23\64\1\u0101\6\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\2\64\1\u0103\27\64\4\uffff\1\64\1\uffff"+
            "\2\64\1\u0103\27\64",
            "",
            "\12\64\1\65\6\uffff\14\64\1\u0104\15\64\4\uffff\1\64\1\uffff"+
            "\14\64\1\u0104\15\64",
            "\12\64\1\65\6\uffff\4\64\1\u0105\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u0105\25\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\1\65\6\uffff\17\64\1\u0107\12\64\4\uffff\1\64\1\uffff"+
            "\17\64\1\u0107\12\64",
            "\12\64\1\65\6\uffff\23\64\1\u0108\6\64\4\uffff\1\64\1\uffff"+
            "\23\64\1\u0108\6\64",
            "\12\64\1\65\6\uffff\13\64\1\u0109\16\64\4\uffff\1\64\1\uffff"+
            "\13\64\1\u0109\16\64",
            "\12\64\1\65\6\uffff\24\64\1\u010a\5\64\4\uffff\1\64\1\uffff"+
            "\24\64\1\u010a\5\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\u010b\1\uffff\32\64",
            "\12\64\1\65\6\uffff\21\64\1\u010c\10\64\4\uffff\1\64\1\uffff"+
            "\21\64\1\u010c\10\64",
            "\12\64\1\65\6\uffff\1\u010d\31\64\4\uffff\1\64\1\uffff\1\u010d"+
            "\31\64",
            "\1\152\1\uffff\12\u010e\7\uffff\6\153\32\uffff\6\153",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u010f"+
            "\6\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\1\u0110\31\64",
            "\12\u0111\1\65\6\uffff\6\u0111\24\64\4\uffff\1\64\1\uffff\6"+
            "\u0111\24\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\1\65\6\uffff\23\64\1\u0118\6\64\4\uffff\1\64\1\uffff"+
            "\23\64\1\u0117\6\64",
            "\12\64\1\65\6\uffff\23\64\1\u0118\6\64\4\uffff\1\64\1\uffff"+
            "\23\64\1\u0118\6\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\1\u011a\31\64\4\uffff\1\64\1\uffff\1\u011a"+
            "\31\64",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\1\u011b\31\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u011c"+
            "\6\64",
            "\12\64\1\65\6\uffff\22\64\1\u011d\7\64\4\uffff\1\64\1\uffff"+
            "\22\64\1\u011d\7\64",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\23\64\1\u011f\6\64\4\uffff\1\64\1\uffff"+
            "\23\64\1\u011f\6\64",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\4\64\1\u0121\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u0121\25\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0122"+
            "\25\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\15\64\1\u0124\14\64\4\uffff\1\64\1\uffff"+
            "\15\64\1\u0124\14\64",
            "\12\64\1\65\6\uffff\22\64\1\u0125\7\64\4\uffff\1\64\1\uffff"+
            "\22\64\1\u0125\7\64",
            "\12\64\1\65\6\uffff\4\64\1\u0126\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u0126\25\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0129"+
            "\25\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\1\u012a\31\64",
            "\12\64\1\65\6\uffff\4\64\1\u012b\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u012b\25\64",
            "",
            "\12\64\1\65\6\uffff\23\64\1\u012c\6\64\4\uffff\1\64\1\uffff"+
            "\23\64\1\u012c\6\64",
            "\12\64\1\65\6\uffff\1\u012d\31\64\4\uffff\1\64\1\uffff\1\u012d"+
            "\31\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\1\65\6\uffff\1\u012f\31\64\4\uffff\1\64\1\uffff\1\u012f"+
            "\31\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\u0131\1\uffff\32\64",
            "\12\64\1\65\6\uffff\14\64\1\u0132\15\64\4\uffff\1\64\1\uffff"+
            "\14\64\1\u0132\15\64",
            "\12\64\1\65\6\uffff\20\64\1\u0133\11\64\4\uffff\1\64\1\uffff"+
            "\20\64\1\u0133\11\64",
            "\12\64\1\65\6\uffff\22\64\1\u0134\7\64\4\uffff\1\64\1\uffff"+
            "\22\64\1\u0134\7\64",
            "\12\64\1\65\6\uffff\21\64\1\u0135\10\64\4\uffff\1\64\1\uffff"+
            "\21\64\1\u0135\10\64",
            "\1\152\1\uffff\12\u0136\7\uffff\6\153\32\uffff\6\153",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0138"+
            "\14\64",
            "\12\u0139\1\65\6\uffff\6\u0139\24\64\4\uffff\1\64\1\uffff\6"+
            "\u0139\24\64",
            "",
            "",
            "",
            "",
            "",
            "\12\64\1\65\6\uffff\1\u013b\31\64\4\uffff\1\64\1\uffff\1\u013a"+
            "\31\64",
            "\12\64\1\65\6\uffff\1\u013b\31\64\4\uffff\1\64\1\uffff\1\u013b"+
            "\31\64",
            "",
            "\12\64\1\65\6\uffff\23\64\1\u013c\6\64\4\uffff\1\64\1\uffff"+
            "\23\64\1\u013c\6\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u013d"+
            "\10\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u0142"+
            "\10\64",
            "",
            "\12\64\1\65\6\uffff\5\64\1\u0143\24\64\4\uffff\1\64\1\uffff"+
            "\5\64\1\u0143\24\64",
            "\12\64\1\65\6\uffff\23\64\1\u0144\6\64\4\uffff\1\64\1\uffff"+
            "\23\64\1\u0144\6\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0147"+
            "\16\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\1\65\6\uffff\2\64\1\u014b\27\64\4\uffff\1\64\1\uffff"+
            "\2\64\1\u014b\27\64",
            "",
            "\12\64\1\65\6\uffff\20\64\1\u014c\11\64\4\uffff\1\64\1\uffff"+
            "\20\64\1\u014c\11\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\24\64\1\u014d\5\64\4\uffff\1\64\1\uffff"+
            "\24\64\1\u014d\5\64",
            "\12\64\1\65\6\uffff\4\64\1\u014e\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u014e\25\64",
            "\12\64\1\65\6\uffff\30\64\1\u014f\1\64\4\uffff\1\64\1\uffff"+
            "\30\64\1\u014f\1\64",
            "\1\152\1\uffff\12\u0150\7\uffff\6\153\32\uffff\6\153",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\u0152\1\65\6\uffff\6\u0152\24\64\4\uffff\1\64\1\uffff\6"+
            "\u0152\24\64",
            "\12\64\1\65\6\uffff\14\64\1\u0154\15\64\4\uffff\1\64\1\uffff"+
            "\14\64\1\u0153\15\64",
            "\12\64\1\65\6\uffff\14\64\1\u0154\15\64\4\uffff\1\64\1\uffff"+
            "\14\64\1\u0154\15\64",
            "\12\64\1\65\6\uffff\4\64\1\u0155\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u0155\25\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\1\u0158\31\64\4\uffff\1\64\1\uffff\1\u0158"+
            "\31\64",
            "\12\64\1\65\6\uffff\4\64\1\u0159\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u0159\25\64",
            "",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\1\65\6\uffff\4\64\1\u015b\25\64\4\uffff\1\64\1\uffff"+
            "\4\64\1\u015b\25\64",
            "\12\64\1\65\6\uffff\24\64\1\u015c\5\64\4\uffff\1\64\1\uffff"+
            "\24\64\1\u015c\5\64",
            "\12\64\1\65\6\uffff\16\64\1\u015d\13\64\4\uffff\1\64\1\uffff"+
            "\16\64\1\u015d\13\64",
            "\12\64\1\65\6\uffff\3\64\1\u015e\26\64\4\uffff\1\64\1\uffff"+
            "\3\64\1\u015e\26\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\152\1\uffff\12\u0160\7\uffff\6\153\32\uffff\6\153",
            "",
            "\1\153\2\uffff\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff"+
            "\32\64",
            "\12\64\1\65\6\uffff\17\64\1\u0162\12\64\4\uffff\1\64\1\uffff"+
            "\17\64\1\u0161\12\64",
            "\12\64\1\65\6\uffff\17\64\1\u0162\12\64\4\uffff\1\64\1\uffff"+
            "\17\64\1\u0162\12\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\1\65\6\uffff\14\64\1\u0164\15\64\4\uffff\1\64\1\uffff"+
            "\14\64\1\u0164\15\64",
            "\12\64\1\65\6\uffff\15\64\1\u0165\14\64\4\uffff\1\64\1\uffff"+
            "\15\64\1\u0165\14\64",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\16\64\1\u0166\13\64\4\uffff\1\64\1\uffff"+
            "\16\64\1\u0166\13\64",
            "\12\64\1\65\6\uffff\21\64\1\u0167\10\64\4\uffff\1\64\1\uffff"+
            "\21\64\1\u0167\10\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\153\1\152\1\uffff\12\126",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\1\65\6\uffff\10\64\1\u016b\21\64\4\uffff\1\64\1\uffff"+
            "\10\64\1\u016b\21\64",
            "\12\64\1\65\6\uffff\2\64\1\u016c\27\64\4\uffff\1\64\1\uffff"+
            "\2\64\1\u016c\27\64",
            "\12\64\1\65\6\uffff\21\64\1\u016d\10\64\4\uffff\1\64\1\uffff"+
            "\21\64\1\u016d\10\64",
            "\12\64\1\65\6\uffff\24\64\1\u016e\5\64\4\uffff\1\64\1\uffff"+
            "\24\64\1\u016e\5\64",
            "",
            "",
            "",
            "\12\64\1\65\6\uffff\13\64\1\u016f\16\64\4\uffff\1\64\1\uffff"+
            "\13\64\1\u016f\16\64",
            "\12\64\1\65\6\uffff\30\64\1\u0170\1\64\4\uffff\1\64\1\uffff"+
            "\30\64\1\u0170\1\64",
            "\12\64\1\65\6\uffff\24\64\1\u0171\5\64\4\uffff\1\64\1\uffff"+
            "\24\64\1\u0171\5\64",
            "\12\64\1\65\6\uffff\14\64\1\u0172\15\64\4\uffff\1\64\1\uffff"+
            "\14\64\1\u0172\15\64",
            "\12\64\1\65\6\uffff\30\64\1\u0173\1\64\4\uffff\1\64\1\uffff"+
            "\30\64\1\u0173\1\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\14\64\1\u0175\15\64\4\uffff\1\64\1\uffff"+
            "\14\64\1\u0175\15\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\1\65\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | K_SELECT | K_FROM | K_WHERE | K_AND | K_KEY | K_INSERT | K_UPDATE | K_WITH | K_LIMIT | K_USING | K_CONSISTENCY | K_LEVEL | K_USE | K_FIRST | K_REVERSED | K_COUNT | K_SET | K_BEGIN | K_APPLY | K_BATCH | K_TRUNCATE | K_DELETE | K_IN | K_CREATE | K_KEYSPACE | K_COLUMNFAMILY | K_INDEX | K_ON | K_DROP | K_PRIMARY | K_INTO | K_VALUES | K_TIMESTAMP | K_TTL | K_ALTER | K_ADD | K_TYPE | STRING_LITERAL | RANGEOP | INTEGER | QMARK | FLOAT | IDENT | COMPIDENT | UUID | WS | COMMENT | MULTILINE_COMMENT );";
        }
    }
 

}