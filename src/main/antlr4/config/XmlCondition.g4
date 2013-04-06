grammar XmlCondition;

xmlCondition : xmlNamespace xmlElementName;

xmlElementName : XML_ELEMENT_NAME;

xmlNamespace : XML_NAMESPACE;

urn : URN;

XML_NAMESPACE : LBRACE URN RBRACE;

XML_ELEMENT_NAME : [a-zA-Z][a-zA-Z0-9\_\-]*;

URN : [a-zA-Z0-9\_\-\:\.\/]+;

LBRACE : '{';

RBRACE : '}';

WS : [ \t\n\r\f]+ -> skip;