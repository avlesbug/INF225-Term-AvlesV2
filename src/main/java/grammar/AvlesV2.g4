grammar AvlesV2;

prog: 'start:' statement+ 'slutt.' EOF;

statement: doexpr | funcdec;

doexpr: ifexpr | decl | boolexpr | forloop | whileloop | expr | print;

funcdec: 'funksjon ' funcname=ID'('fstparam=ID','sndparam=ID')''gjor:' funcret=expr '.';

whileloop: 'saa lenge' boolexpr 'gjor:' statement+'.';

forloop: 'fra' first=expr 'til' second=expr 'gjor:' statement+ '.';

ifexpr: 'hvis' boolexpr 'gjor:' first=statement+',' 'ellers:' second=statement+ '.';


boolexpr: left=expr op=('er lik'|'er ulik') right=expr # EqNo
        | left=expr op=('er storre enn'|'er mindre enn') right=expr # BigSmall
        | left=expr op=('er storre eller lik'|'er mindre eller lik') right=expr # BEqSEq
        | left=boolexpr op=('er lik'|'er ulik') right=boolexpr # BoolEqNo
        | left=boolexpr op=('og'|'eller') right=boolexpr # BoolAndOr
        | left=boolexpr op=('og'|'eller') right=boolexpr # AndOr
        | 'ikke' boolexpr # Not
        | BOOLEAN # Bool
        ;


expr: left=expr op=('*'|'/') right=expr # MulDiv
    | left=expr op=('+'|'-') right=expr # AddSub
    | left=expr ('%') right=expr # Mod
    | index=expr 'fra' list=ID # ListGet
    | 'storrelsen til' list=ID # ListSize
    | '('expr')' #Parens
    | ID'('fstparam=expr','sndparam=expr')' # funccall
    | NUMBER #number
    | ID #id
    ;


decl: ID 'er' (expr) # VarDec
    | ID 'er listen:' array # ListDec
    ;

print: 'skriv ut' NUMBER #PrintNum
| 'skriv ut' ID #PrintId
| 'skriv ut' boolexpr #PrintBool
| 'skriv ut listen' array #Printarray
| 'skriv ut tekst' '"'ID+'"' #PrintString
;

array: '[' NUMBER+ ']';

BOOLEAN : 'sant' | 'usant' ;

MUL: '*' ;
DIV: '/' ;
ADD: '+' ;
SUB: '-' ;
EQ: 'er lik';
NEQ: 'er ulik';
BIG: 'er storre enn';
SMALL: 'er mindre enn';
EQBIG: 'er storre eller lik';
EQSMALL: 'er mindre eller lik';
AND: 'og';
OR: 'eller';

ID : [a-z][a-zA-Z0-9]*;
NUMBER : ('-')?DIGIT+('.'DIGIT+)?;
DIGIT : [0-9];
COMMENT : '//' ~[\r\n_] -> skip;
SPACE : [ \t\n\r]+ -> skip;


