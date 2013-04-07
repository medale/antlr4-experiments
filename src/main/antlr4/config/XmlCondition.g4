grammar XmlCondition;

xmlCondition : XML_NAMESPACE XML_ELEMENT_NAME contentConditions #elementOnlyWithConditions
        | XML_NAMESPACE XML_ELEMENT_NAME #elementOnlyMatch
;

contentConditions : (CONDITION)+;

XML_NAMESPACE : LBRACE [a-zA-Z0-9\_\-\:\.\/]+ RBRACE;

CONDITION : LBRACKET .*? RBRACKET;

EXPR : ATTRIBUTE BINARY_OP STRING;

STRING : '\'' .*? '\'';

XML_ELEMENT_NAME : [a-zA-Z][a-zA-Z0-9\_\-]*;

LBRACE : '{';

RBRACE : '}';

LBRACKET : '[';

RBRACKET : ']';

BINARY_OP : '=';

ATTRIBUTE : '@attr';

DOT_OPERATOR : '.';

WS : [ \t\n\r\f]+ -> skip;