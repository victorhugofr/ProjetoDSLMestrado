/*
 * generated by Xtext 2.25.0
 */
package com.ufrn.atad.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class AtadGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class DeclaraComandoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.ufrn.atad.Atad.DeclaraComando");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cComandosAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cComandosQuandoParserRuleCall_0_0 = (RuleCall)cComandosAssignment_0.eContents().get(0);
		private final Assignment cAcoesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAcoesAdicaoComandoParserRuleCall_1_0 = (RuleCall)cAcoesAssignment_1.eContents().get(0);
		private final Assignment cVerificacaoAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVerificacaoComandosValidadoresParserRuleCall_2_0 = (RuleCall)cVerificacaoAssignment_2.eContents().get(0);
		
		//DeclaraComando:
		//    comandos+=Quando*
		//    acoes+=AdicaoComando*
		//    verificacao+=ComandosValidadores*;
		@Override public ParserRule getRule() { return rule; }
		
		//comandos+=Quando*
		//acoes+=AdicaoComando*
		//verificacao+=ComandosValidadores*
		public Group getGroup() { return cGroup; }
		
		//comandos+=Quando*
		public Assignment getComandosAssignment_0() { return cComandosAssignment_0; }
		
		//Quando
		public RuleCall getComandosQuandoParserRuleCall_0_0() { return cComandosQuandoParserRuleCall_0_0; }
		
		//acoes+=AdicaoComando*
		public Assignment getAcoesAssignment_1() { return cAcoesAssignment_1; }
		
		//AdicaoComando
		public RuleCall getAcoesAdicaoComandoParserRuleCall_1_0() { return cAcoesAdicaoComandoParserRuleCall_1_0; }
		
		//verificacao+=ComandosValidadores*
		public Assignment getVerificacaoAssignment_2() { return cVerificacaoAssignment_2; }
		
		//ComandosValidadores
		public RuleCall getVerificacaoComandosValidadoresParserRuleCall_2_0() { return cVerificacaoComandosValidadoresParserRuleCall_2_0; }
	}
	public class ClicarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.ufrn.atad.Atad.Clicar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClicarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEmKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Clicar:
		//    'clicar' 'em' name=STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'clicar' 'em' name=STRING
		public Group getGroup() { return cGroup; }
		
		//'clicar'
		public Keyword getClicarKeyword_0() { return cClicarKeyword_0; }
		
		//'em'
		public Keyword getEmKeyword_1() { return cEmKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
	}
	public class NavegarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.ufrn.atad.Atad.Navegar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNavegarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Navegar:
		//    'navegar' name=STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'navegar' name=STRING
		public Group getGroup() { return cGroup; }
		
		//'navegar'
		public Keyword getNavegarKeyword_0() { return cNavegarKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}
	public class EscreverElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.ufrn.atad.Atad.Escrever");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEscreverKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Escrever:
		//    'escrever' name=STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'escrever' name=STRING
		public Group getGroup() { return cGroup; }
		
		//'escrever'
		public Keyword getEscreverKeyword_0() { return cEscreverKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}
	public class ComandosAcaoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.ufrn.atad.Atad.ComandosAcao");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cClicarParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNavegarParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEscreverParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//ComandosAcao:
		//    Clicar|Navegar|Escrever
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Clicar|Navegar|Escrever
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Clicar
		public RuleCall getClicarParserRuleCall_0() { return cClicarParserRuleCall_0; }
		
		//Navegar
		public RuleCall getNavegarParserRuleCall_1() { return cNavegarParserRuleCall_1; }
		
		//Escrever
		public RuleCall getEscreverParserRuleCall_2() { return cEscreverParserRuleCall_2; }
	}
	public class VerifiqueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.ufrn.atad.Atad.Verifique");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVerifiqueKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cQueKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Verifique:
		//    'Verifique' 'que' name=STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Verifique' 'que' name=STRING
		public Group getGroup() { return cGroup; }
		
		//'Verifique'
		public Keyword getVerifiqueKeyword_0() { return cVerifiqueKeyword_0; }
		
		//'que'
		public Keyword getQueKeyword_1() { return cQueKeyword_1; }
		
		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }
	}
	public class ComandosValidadoresElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.ufrn.atad.Atad.ComandosValidadores");
		private final RuleCall cVerifiqueParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ComandosValidadores:
		//    Verifique
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Verifique
		public RuleCall getVerifiqueParserRuleCall() { return cVerifiqueParserRuleCall; }
	}
	public class AdicaoComandoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.ufrn.atad.Atad.AdicaoComando");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cComandosAcaoParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//AdicaoComando:
		//    'E' ComandosAcao
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'E' ComandosAcao
		public Group getGroup() { return cGroup; }
		
		//'E'
		public Keyword getEKeyword_0() { return cEKeyword_0; }
		
		//ComandosAcao
		public RuleCall getComandosAcaoParserRuleCall_1() { return cComandosAcaoParserRuleCall_1; }
	}
	public class QuandoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.ufrn.atad.Atad.Quando");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuandoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cComandosAcaoParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Quando:
		//    'Quando' ComandosAcao
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Quando' ComandosAcao
		public Group getGroup() { return cGroup; }
		
		//'Quando'
		public Keyword getQuandoKeyword_0() { return cQuandoKeyword_0; }
		
		//ComandosAcao
		public RuleCall getComandosAcaoParserRuleCall_1() { return cComandosAcaoParserRuleCall_1; }
	}
	
	
	private final DeclaraComandoElements pDeclaraComando;
	private final ClicarElements pClicar;
	private final NavegarElements pNavegar;
	private final EscreverElements pEscrever;
	private final ComandosAcaoElements pComandosAcao;
	private final VerifiqueElements pVerifique;
	private final ComandosValidadoresElements pComandosValidadores;
	private final AdicaoComandoElements pAdicaoComando;
	private final QuandoElements pQuando;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AtadGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDeclaraComando = new DeclaraComandoElements();
		this.pClicar = new ClicarElements();
		this.pNavegar = new NavegarElements();
		this.pEscrever = new EscreverElements();
		this.pComandosAcao = new ComandosAcaoElements();
		this.pVerifique = new VerifiqueElements();
		this.pComandosValidadores = new ComandosValidadoresElements();
		this.pAdicaoComando = new AdicaoComandoElements();
		this.pQuando = new QuandoElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.ufrn.atad.Atad".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//DeclaraComando:
	//    comandos+=Quando*
	//    acoes+=AdicaoComando*
	//    verificacao+=ComandosValidadores*;
	public DeclaraComandoElements getDeclaraComandoAccess() {
		return pDeclaraComando;
	}
	
	public ParserRule getDeclaraComandoRule() {
		return getDeclaraComandoAccess().getRule();
	}
	
	//Clicar:
	//    'clicar' 'em' name=STRING
	//;
	public ClicarElements getClicarAccess() {
		return pClicar;
	}
	
	public ParserRule getClicarRule() {
		return getClicarAccess().getRule();
	}
	
	//Navegar:
	//    'navegar' name=STRING
	//;
	public NavegarElements getNavegarAccess() {
		return pNavegar;
	}
	
	public ParserRule getNavegarRule() {
		return getNavegarAccess().getRule();
	}
	
	//Escrever:
	//    'escrever' name=STRING
	//;
	public EscreverElements getEscreverAccess() {
		return pEscrever;
	}
	
	public ParserRule getEscreverRule() {
		return getEscreverAccess().getRule();
	}
	
	//ComandosAcao:
	//    Clicar|Navegar|Escrever
	//;
	public ComandosAcaoElements getComandosAcaoAccess() {
		return pComandosAcao;
	}
	
	public ParserRule getComandosAcaoRule() {
		return getComandosAcaoAccess().getRule();
	}
	
	//Verifique:
	//    'Verifique' 'que' name=STRING
	//;
	public VerifiqueElements getVerifiqueAccess() {
		return pVerifique;
	}
	
	public ParserRule getVerifiqueRule() {
		return getVerifiqueAccess().getRule();
	}
	
	//ComandosValidadores:
	//    Verifique
	//;
	public ComandosValidadoresElements getComandosValidadoresAccess() {
		return pComandosValidadores;
	}
	
	public ParserRule getComandosValidadoresRule() {
		return getComandosValidadoresAccess().getRule();
	}
	
	//AdicaoComando:
	//    'E' ComandosAcao
	//;
	public AdicaoComandoElements getAdicaoComandoAccess() {
		return pAdicaoComando;
	}
	
	public ParserRule getAdicaoComandoRule() {
		return getAdicaoComandoAccess().getRule();
	}
	
	//Quando:
	//    'Quando' ComandosAcao
	//;
	public QuandoElements getQuandoAccess() {
		return pQuando;
	}
	
	public ParserRule getQuandoRule() {
		return getQuandoAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
