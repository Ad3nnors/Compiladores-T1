lexer grammar LALexer;

PALAVRA_CHAVE 
    :	'declare' | 'algoritmo' | 'inteiro' | 'real' | 'literal' | 'tipo' | 'var' |
'logico' | 'leia' | 'escreva' | 'constante' | 'registro' | 'fim_registro' | 
'procedimento' | 'fim_procedimento' | 'funcao' | 'fim_funcao' | 'para' | 'ate' |
'faca' | 'fim_para' | 'se' | 'entao' | 'fim_se' | 'fim_algoritmo' | 'ou' | 'e' |
':' | '(' | ')' | ',' | '.' | '[' | ']' | '/' | '+' | '-' | '*' | '%' | '<-' |
'>' | '>=' | '<' | '<=' | '<>' | '=' |
'retorne' | 'caso' | 'seja' | 'senao' | 'fim_caso' |
'enquanto' | 'fim_enquanto' |
'&' | 'nao' |
'verdadeiro' | 'falso' |
'^' | '..'
    ; 
NUM_INT	: NUM+
    ;
fragment
NUM :   '0'..'9'
    ;
NUM_REAL: (NUM)+ ('.' (NUM)+)
    ;
IDENT   : LITERAL (LITERAL|NUM)* ('_')* (LITERAL|NUM)*
    ;
fragment
LITERAL : ('a'..'z'|'A'..'Z')
    ;
CADEIA 	: ('\'' ( ESC_SEQ | ~('\''|'\\'|'\n') )*? '\'') | ('"' ( ESC_SEQ | ~('\''|'\\'|'\n') )*? '"')
    ;
fragment
ESC_SEQ	: '\\\'' | '\\"';
COMENTARIO
    :   '{' ~('\n'|'\r'|'}')* '\r'? '}' {skip();}
    ;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
COMENTARIO_ERRADO   :   '{' ~('}')*? '\n'
    ;
CADEIA_ERRADA   :   ('\'' ( ESC_SEQ | ~('\''|'\\'|'"'|'\n') )*? '\n') | ('"' ( ESC_SEQ | ~('\''|'\\'|'"'|'\n') )*? '\n')
    ;
ERROR   :   .;