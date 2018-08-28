/*
 * generated by Xtext 2.13.0
 */
package com.hribol.bromium.dsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import com.hribol.bromium.dsl.ide.contentassist.antlr.internal.InternalBromiumParser;
import com.hribol.bromium.dsl.services.BromiumGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class BromiumParser extends AbstractContentAssistParser {

	@Inject
	private BromiumGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalBromiumParser createParser() {
		InternalBromiumParser result = new InternalBromiumParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActionContextAccess().getAlternatives(), "rule__ActionContext__Alternatives");
					put(grammarAccess.getRowSelectorAccess().getAlternatives(), "rule__RowSelector__Alternatives");
					put(grammarAccess.getLocatorAccess().getAlternatives(), "rule__Locator__Alternatives");
					put(grammarAccess.getWebDriverActionConditionAccess().getAlternatives(), "rule__WebDriverActionCondition__Alternatives");
					put(grammarAccess.getWebDriverActionAccess().getAlternatives(), "rule__WebDriverAction__Alternatives");
					put(grammarAccess.getParameterValueAccess().getAlternatives(), "rule__ParameterValue__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_4(), "rule__Model__Group_4__0");
					put(grammarAccess.getApplicationActionAccess().getGroup(), "rule__ApplicationAction__Group__0");
					put(grammarAccess.getWithinContextAccess().getGroup(), "rule__WithinContext__Group__0");
					put(grammarAccess.getTableActionContextAccess().getGroup(), "rule__TableActionContext__Group__0");
					put(grammarAccess.getRowLocatorAccess().getGroup(), "rule__RowLocator__Group__0");
					put(grammarAccess.getRowIndexAccess().getGroup(), "rule__RowIndex__Group__0");
					put(grammarAccess.getClassByTextAccess().getGroup(), "rule__ClassByText__Group__0");
					put(grammarAccess.getCssSelectorByTextAccess().getGroup(), "rule__CssSelectorByText__Group__0");
					put(grammarAccess.getCssSelectorAccess().getGroup(), "rule__CssSelector__Group__0");
					put(grammarAccess.getSyntaxDefinitionAccess().getGroup(), "rule__SyntaxDefinition__Group__0");
					put(grammarAccess.getPreconditionAccess().getGroup(), "rule__Precondition__Group__0");
					put(grammarAccess.getPostconditionAccess().getGroup(), "rule__Postcondition__Group__0");
					put(grammarAccess.getExpectHttpRequestAccess().getGroup(), "rule__ExpectHttpRequest__Group__0");
					put(grammarAccess.getExpectHttpRequestAccess().getGroup_1(), "rule__ExpectHttpRequest__Group_1__0");
					put(grammarAccess.getElementByCssToBePresentAccess().getGroup(), "rule__ElementByCssToBePresent__Group__0");
					put(grammarAccess.getClickCssSelectorAccess().getGroup(), "rule__ClickCssSelector__Group__0");
					put(grammarAccess.getPageLoadAccess().getGroup(), "rule__PageLoad__Group__0");
					put(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getGroup(), "rule__TypeTextInElementFoundByCssSelector__Group__0");
					put(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getGroup(), "rule__TextOfElementWithCssSelectorToBe__Group__0");
					put(grammarAccess.getClickClassByTextAccess().getGroup(), "rule__ClickClassByText__Group__0");
					put(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getGroup(), "rule__SetVariableToTextOfElementWithCssSelector__Group__0");
					put(grammarAccess.getClickDataIdAccess().getGroup(), "rule__ClickDataId__Group__0");
					put(grammarAccess.getConfirmAlertAccess().getGroup(), "rule__ConfirmAlert__Group__0");
					put(grammarAccess.getClickIdAccess().getGroup(), "rule__ClickId__Group__0");
					put(grammarAccess.getClickNameAccess().getGroup(), "rule__ClickName__Group__0");
					put(grammarAccess.getSelectValueAccess().getGroup(), "rule__SelectValue__Group__0");
					put(grammarAccess.getThreeDottedVersionAccess().getGroup(), "rule__ThreeDottedVersion__Group__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getVersionAssignment_3(), "rule__Model__VersionAssignment_3");
					put(grammarAccess.getModelAccess().getBaseVersionAssignment_4_1(), "rule__Model__BaseVersionAssignment_4_1");
					put(grammarAccess.getModelAccess().getActionsAssignment_7(), "rule__Model__ActionsAssignment_7");
					put(grammarAccess.getApplicationActionAccess().getNameAssignment_1(), "rule__ApplicationAction__NameAssignment_1");
					put(grammarAccess.getApplicationActionAccess().getSyntaxDefinitionsAssignment_3(), "rule__ApplicationAction__SyntaxDefinitionsAssignment_3");
					put(grammarAccess.getApplicationActionAccess().getPreconditionAssignment_4(), "rule__ApplicationAction__PreconditionAssignment_4");
					put(grammarAccess.getApplicationActionAccess().getActionContextAssignment_5(), "rule__ApplicationAction__ActionContextAssignment_5");
					put(grammarAccess.getApplicationActionAccess().getWebDriverActionAssignment_6(), "rule__ApplicationAction__WebDriverActionAssignment_6");
					put(grammarAccess.getApplicationActionAccess().getExpectHttpRequestAssignment_7(), "rule__ApplicationAction__ExpectHttpRequestAssignment_7");
					put(grammarAccess.getApplicationActionAccess().getPostconditionAssignment_8(), "rule__ApplicationAction__PostconditionAssignment_8");
					put(grammarAccess.getWithinContextAccess().getElementLocatorAssignment_3(), "rule__WithinContext__ElementLocatorAssignment_3");
					put(grammarAccess.getTableActionContextAccess().getTableLocatorAssignment_2(), "rule__TableActionContext__TableLocatorAssignment_2");
					put(grammarAccess.getTableActionContextAccess().getRowsLocatorAssignment_5(), "rule__TableActionContext__RowsLocatorAssignment_5");
					put(grammarAccess.getTableActionContextAccess().getRowSelectorAssignment_6(), "rule__TableActionContext__RowSelectorAssignment_6");
					put(grammarAccess.getRowLocatorAccess().getRowLocatorAssignment_2(), "rule__RowLocator__RowLocatorAssignment_2");
					put(grammarAccess.getRowIndexAccess().getIndexAssignment_2(), "rule__RowIndex__IndexAssignment_2");
					put(grammarAccess.getClassByTextAccess().getKlassAssignment_1(), "rule__ClassByText__KlassAssignment_1");
					put(grammarAccess.getClassByTextAccess().getTextAssignment_4(), "rule__ClassByText__TextAssignment_4");
					put(grammarAccess.getCssSelectorByTextAccess().getSelectorAssignment_2(), "rule__CssSelectorByText__SelectorAssignment_2");
					put(grammarAccess.getCssSelectorByTextAccess().getTextAssignment_5(), "rule__CssSelectorByText__TextAssignment_5");
					put(grammarAccess.getCssSelectorAccess().getSelectorAssignment_2(), "rule__CssSelector__SelectorAssignment_2");
					put(grammarAccess.getSyntaxDefinitionAccess().getContentAssignment_1(), "rule__SyntaxDefinition__ContentAssignment_1");
					put(grammarAccess.getSyntaxDefinitionAccess().getParameterAssignment_2(), "rule__SyntaxDefinition__ParameterAssignment_2");
					put(grammarAccess.getPreconditionAccess().getActionAssignment_1(), "rule__Precondition__ActionAssignment_1");
					put(grammarAccess.getPostconditionAccess().getActionAssignment_3(), "rule__Postcondition__ActionAssignment_3");
					put(grammarAccess.getExpectHttpRequestAccess().getNotAssignment_1_1(), "rule__ExpectHttpRequest__NotAssignment_1_1");
					put(grammarAccess.getElementByCssToBePresentAccess().getParameterNamesAssignment_3(), "rule__ElementByCssToBePresent__ParameterNamesAssignment_3");
					put(grammarAccess.getElementByCssToBePresentAccess().getParameterValuesAssignment_4(), "rule__ElementByCssToBePresent__ParameterValuesAssignment_4");
					put(grammarAccess.getClickCssSelectorAccess().getParameterNamesAssignment_5(), "rule__ClickCssSelector__ParameterNamesAssignment_5");
					put(grammarAccess.getClickCssSelectorAccess().getParameterValuesAssignment_6(), "rule__ClickCssSelector__ParameterValuesAssignment_6");
					put(grammarAccess.getPageLoadAccess().getParameterNamesAssignment_1(), "rule__PageLoad__ParameterNamesAssignment_1");
					put(grammarAccess.getPageLoadAccess().getParameterValuesAssignment_2(), "rule__PageLoad__ParameterValuesAssignment_2");
					put(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesAssignment_1(), "rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_1");
					put(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesAssignment_2(), "rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_2");
					put(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterNamesAssignment_7(), "rule__TypeTextInElementFoundByCssSelector__ParameterNamesAssignment_7");
					put(grammarAccess.getTypeTextInElementFoundByCssSelectorAccess().getParameterValuesAssignment_8(), "rule__TypeTextInElementFoundByCssSelector__ParameterValuesAssignment_8");
					put(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesAssignment_3(), "rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_3");
					put(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesAssignment_4(), "rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_4");
					put(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterNamesAssignment_6(), "rule__TextOfElementWithCssSelectorToBe__ParameterNamesAssignment_6");
					put(grammarAccess.getTextOfElementWithCssSelectorToBeAccess().getParameterValuesAssignment_7(), "rule__TextOfElementWithCssSelectorToBe__ParameterValuesAssignment_7");
					put(grammarAccess.getClickClassByTextAccess().getParameterNamesAssignment_4(), "rule__ClickClassByText__ParameterNamesAssignment_4");
					put(grammarAccess.getClickClassByTextAccess().getParameterValuesAssignment_5(), "rule__ClickClassByText__ParameterValuesAssignment_5");
					put(grammarAccess.getClickClassByTextAccess().getParameterNamesAssignment_7(), "rule__ClickClassByText__ParameterNamesAssignment_7");
					put(grammarAccess.getClickClassByTextAccess().getParameterValuesAssignment_8(), "rule__ClickClassByText__ParameterValuesAssignment_8");
					put(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesAssignment_1(), "rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_1");
					put(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesAssignment_2(), "rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_2");
					put(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterNamesAssignment_10(), "rule__SetVariableToTextOfElementWithCssSelector__ParameterNamesAssignment_10");
					put(grammarAccess.getSetVariableToTextOfElementWithCssSelectorAccess().getParameterValuesAssignment_11(), "rule__SetVariableToTextOfElementWithCssSelector__ParameterValuesAssignment_11");
					put(grammarAccess.getClickDataIdAccess().getParameterNamesAssignment_4(), "rule__ClickDataId__ParameterNamesAssignment_4");
					put(grammarAccess.getClickDataIdAccess().getParameterValuesAssignment_5(), "rule__ClickDataId__ParameterValuesAssignment_5");
					put(grammarAccess.getConfirmAlertAccess().getParameterNamesAssignment_1(), "rule__ConfirmAlert__ParameterNamesAssignment_1");
					put(grammarAccess.getConfirmAlertAccess().getParameterValuesAssignment_2(), "rule__ConfirmAlert__ParameterValuesAssignment_2");
					put(grammarAccess.getClickIdAccess().getParameterNamesAssignment_4(), "rule__ClickId__ParameterNamesAssignment_4");
					put(grammarAccess.getClickIdAccess().getParameterValuesAssignment_5(), "rule__ClickId__ParameterValuesAssignment_5");
					put(grammarAccess.getClickNameAccess().getParameterNamesAssignment_4(), "rule__ClickName__ParameterNamesAssignment_4");
					put(grammarAccess.getClickNameAccess().getParameterValuesAssignment_5(), "rule__ClickName__ParameterValuesAssignment_5");
					put(grammarAccess.getSelectValueAccess().getParameterNamesAssignment_1(), "rule__SelectValue__ParameterNamesAssignment_1");
					put(grammarAccess.getSelectValueAccess().getParameterValuesAssignment_2(), "rule__SelectValue__ParameterValuesAssignment_2");
					put(grammarAccess.getSelectValueAccess().getParameterNamesAssignment_7(), "rule__SelectValue__ParameterNamesAssignment_7");
					put(grammarAccess.getSelectValueAccess().getParameterValuesAssignment_8(), "rule__SelectValue__ParameterValuesAssignment_8");
					put(grammarAccess.getParameterValueAccess().getContentAssignment_0(), "rule__ParameterValue__ContentAssignment_0");
					put(grammarAccess.getParameterValueAccess().getExposedParameterAssignment_1(), "rule__ParameterValue__ExposedParameterAssignment_1");
					put(grammarAccess.getParameterValueAccess().getIndexAssignment_2(), "rule__ParameterValue__IndexAssignment_2");
					put(grammarAccess.getExposedParameterAccess().getNameAssignment(), "rule__ExposedParameter__NameAssignment");
					put(grammarAccess.getThreeDottedVersionAccess().getBigAssignment_0(), "rule__ThreeDottedVersion__BigAssignment_0");
					put(grammarAccess.getThreeDottedVersionAccess().getMediumAssignment_2(), "rule__ThreeDottedVersion__MediumAssignment_2");
					put(grammarAccess.getThreeDottedVersionAccess().getSmallAssignment_4(), "rule__ThreeDottedVersion__SmallAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BromiumGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BromiumGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
