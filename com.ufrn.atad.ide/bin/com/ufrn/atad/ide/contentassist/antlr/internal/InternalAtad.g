/*
 * generated by Xtext 2.25.0
 */
grammar InternalAtad;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package com.ufrn.atad.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.ufrn.atad.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.ufrn.atad.services.AtadGrammarAccess;

}
@parser::members {
	private AtadGrammarAccess grammarAccess;

	public void setGrammarAccess(AtadGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleDeclaraComando
entryRuleDeclaraComando
:
{ before(grammarAccess.getDeclaraComandoRule()); }
	 ruleDeclaraComando
{ after(grammarAccess.getDeclaraComandoRule()); } 
	 EOF 
;

// Rule DeclaraComando
ruleDeclaraComando 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeclaraComandoAccess().getGroup()); }
		(rule__DeclaraComando__Group__0)
		{ after(grammarAccess.getDeclaraComandoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClicar
entryRuleClicar
:
{ before(grammarAccess.getClicarRule()); }
	 ruleClicar
{ after(grammarAccess.getClicarRule()); } 
	 EOF 
;

// Rule Clicar
ruleClicar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClicarAccess().getGroup()); }
		(rule__Clicar__Group__0)
		{ after(grammarAccess.getClicarAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNavegar
entryRuleNavegar
:
{ before(grammarAccess.getNavegarRule()); }
	 ruleNavegar
{ after(grammarAccess.getNavegarRule()); } 
	 EOF 
;

// Rule Navegar
ruleNavegar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNavegarAccess().getNavegarKeyword()); }
		'navegar'
		{ after(grammarAccess.getNavegarAccess().getNavegarKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEscrever
entryRuleEscrever
:
{ before(grammarAccess.getEscreverRule()); }
	 ruleEscrever
{ after(grammarAccess.getEscreverRule()); } 
	 EOF 
;

// Rule Escrever
ruleEscrever 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEscreverAccess().getEscreverKeyword()); }
		'escrever'
		{ after(grammarAccess.getEscreverAccess().getEscreverKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComandosAcao
entryRuleComandosAcao
:
{ before(grammarAccess.getComandosAcaoRule()); }
	 ruleComandosAcao
{ after(grammarAccess.getComandosAcaoRule()); } 
	 EOF 
;

// Rule ComandosAcao
ruleComandosAcao 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComandosAcaoAccess().getAlternatives()); }
		(rule__ComandosAcao__Alternatives)
		{ after(grammarAccess.getComandosAcaoAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVerifique
entryRuleVerifique
:
{ before(grammarAccess.getVerifiqueRule()); }
	 ruleVerifique
{ after(grammarAccess.getVerifiqueRule()); } 
	 EOF 
;

// Rule Verifique
ruleVerifique 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVerifiqueAccess().getGroup()); }
		(rule__Verifique__Group__0)
		{ after(grammarAccess.getVerifiqueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComandosValidadores
entryRuleComandosValidadores
:
{ before(grammarAccess.getComandosValidadoresRule()); }
	 ruleComandosValidadores
{ after(grammarAccess.getComandosValidadoresRule()); } 
	 EOF 
;

// Rule ComandosValidadores
ruleComandosValidadores 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComandosValidadoresAccess().getVerifiqueParserRuleCall()); }
		ruleVerifique
		{ after(grammarAccess.getComandosValidadoresAccess().getVerifiqueParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAdicaoComando
entryRuleAdicaoComando
:
{ before(grammarAccess.getAdicaoComandoRule()); }
	 ruleAdicaoComando
{ after(grammarAccess.getAdicaoComandoRule()); } 
	 EOF 
;

// Rule AdicaoComando
ruleAdicaoComando 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAdicaoComandoAccess().getGroup()); }
		(rule__AdicaoComando__Group__0)
		{ after(grammarAccess.getAdicaoComandoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQuando
entryRuleQuando
:
{ before(grammarAccess.getQuandoRule()); }
	 ruleQuando
{ after(grammarAccess.getQuandoRule()); } 
	 EOF 
;

// Rule Quando
ruleQuando 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQuandoAccess().getGroup()); }
		(rule__Quando__Group__0)
		{ after(grammarAccess.getQuandoAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ComandosAcao__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComandosAcaoAccess().getClicarParserRuleCall_0()); }
		ruleClicar
		{ after(grammarAccess.getComandosAcaoAccess().getClicarParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getComandosAcaoAccess().getNavegarParserRuleCall_1()); }
		ruleNavegar
		{ after(grammarAccess.getComandosAcaoAccess().getNavegarParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getComandosAcaoAccess().getEscreverParserRuleCall_2()); }
		ruleEscrever
		{ after(grammarAccess.getComandosAcaoAccess().getEscreverParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaraComando__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclaraComando__Group__0__Impl
	rule__DeclaraComando__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaraComando__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclaraComandoAccess().getComandosAssignment_0()); }
	(rule__DeclaraComando__ComandosAssignment_0)*
	{ after(grammarAccess.getDeclaraComandoAccess().getComandosAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaraComando__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclaraComando__Group__1__Impl
	rule__DeclaraComando__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaraComando__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclaraComandoAccess().getAcoesAssignment_1()); }
	(rule__DeclaraComando__AcoesAssignment_1)*
	{ after(grammarAccess.getDeclaraComandoAccess().getAcoesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaraComando__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DeclaraComando__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaraComando__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclaraComandoAccess().getVerificacaoAssignment_2()); }
	(rule__DeclaraComando__VerificacaoAssignment_2)*
	{ after(grammarAccess.getDeclaraComandoAccess().getVerificacaoAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Clicar__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Clicar__Group__0__Impl
	rule__Clicar__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Clicar__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClicarAccess().getClicarKeyword_0()); }
	'clicar'
	{ after(grammarAccess.getClicarAccess().getClicarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Clicar__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Clicar__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Clicar__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClicarAccess().getEmKeyword_1()); }
	'em'
	{ after(grammarAccess.getClicarAccess().getEmKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Verifique__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Verifique__Group__0__Impl
	rule__Verifique__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Verifique__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVerifiqueAccess().getVerifiqueKeyword_0()); }
	'verifique'
	{ after(grammarAccess.getVerifiqueAccess().getVerifiqueKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Verifique__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Verifique__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Verifique__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVerifiqueAccess().getQueKeyword_1()); }
	'que'
	{ after(grammarAccess.getVerifiqueAccess().getQueKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AdicaoComando__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AdicaoComando__Group__0__Impl
	rule__AdicaoComando__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AdicaoComando__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdicaoComandoAccess().getEKeyword_0()); }
	'E'
	{ after(grammarAccess.getAdicaoComandoAccess().getEKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AdicaoComando__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AdicaoComando__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AdicaoComando__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdicaoComandoAccess().getComandosAcaoParserRuleCall_1()); }
	ruleComandosAcao
	{ after(grammarAccess.getAdicaoComandoAccess().getComandosAcaoParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Quando__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Quando__Group__0__Impl
	rule__Quando__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Quando__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuandoAccess().getQuandoKeyword_0()); }
	'Quando'
	{ after(grammarAccess.getQuandoAccess().getQuandoKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Quando__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Quando__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Quando__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuandoAccess().getComandosAcaoParserRuleCall_1()); }
	ruleComandosAcao
	{ after(grammarAccess.getQuandoAccess().getComandosAcaoParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DeclaraComando__ComandosAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclaraComandoAccess().getComandosQuandoParserRuleCall_0_0()); }
		ruleQuando
		{ after(grammarAccess.getDeclaraComandoAccess().getComandosQuandoParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaraComando__AcoesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclaraComandoAccess().getAcoesAdicaoComandoParserRuleCall_1_0()); }
		ruleAdicaoComando
		{ after(grammarAccess.getDeclaraComandoAccess().getAcoesAdicaoComandoParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DeclaraComando__VerificacaoAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclaraComandoAccess().getVerificacaoComandosValidadoresParserRuleCall_2_0()); }
		ruleComandosValidadores
		{ after(grammarAccess.getDeclaraComandoAccess().getVerificacaoComandosValidadoresParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;