package config;

import org.antlr.v4.runtime.tree.ParseTree;

import config.XmlConditionParser.ContentConditionsContext;

public class XmlConditionProcessorListener extends XmlConditionBaseListener {

    @Override
    public void enterElementOnlyWithConditions(
            final XmlConditionParser.ElementOnlyWithConditionsContext ctx) {
    }

    @Override
    public void exitElementOnlyWithConditions(
            final XmlConditionParser.ElementOnlyWithConditionsContext ctx) {
        System.out.println(ctx.XML_NAMESPACE().getText()
                + ctx.XML_ELEMENT_NAME().getText());
        System.out.println("conditions: ");
        final ContentConditionsContext contentConditionsCtx = ctx
                .contentConditions();
        final int childCount = contentConditionsCtx.getChildCount();
        for (int i = 0; i < childCount; i++) {
            final ParseTree child = contentConditionsCtx.getChild(i);
            System.out.println(child.getText());
        }
    }

    @Override
    public void enterElementOnlyMatch(
            final XmlConditionParser.ElementOnlyMatchContext ctx) {
    }

    @Override
    public void exitElementOnlyMatch(
            final XmlConditionParser.ElementOnlyMatchContext ctx) {
    }

    @Override
    public void enterContentConditions(
            final XmlConditionParser.ContentConditionsContext ctx) {
    }

    @Override
    public void exitContentConditions(
            final XmlConditionParser.ContentConditionsContext ctx) {
    }

}
