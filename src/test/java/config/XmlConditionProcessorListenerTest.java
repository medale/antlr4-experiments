package config;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

public class XmlConditionProcessorListenerTest {

    @Test
    public void test() {
        final String elementWithCondition = "{http://medale.org:8080/grammar/v1}Root_42[@attr = 'hitchhiker'][. = 'galaxy']";
        final ANTLRInputStream input = new ANTLRInputStream(
                elementWithCondition);
        final XmlConditionLexer lexer = new XmlConditionLexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final XmlConditionParser parser = new XmlConditionParser(tokens);
        final ParseTree parseTree = parser.xmlCondition();
        final XmlConditionProcessorListener listener = new XmlConditionProcessorListener();
        final ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, parseTree);
    }
}
