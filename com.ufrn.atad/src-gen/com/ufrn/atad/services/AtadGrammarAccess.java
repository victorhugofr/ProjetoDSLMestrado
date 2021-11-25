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
		private final Assignment cComandosAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cComandosComandoParserRuleCall_0 = (RuleCall)cComandosAssignment.eContents().get(0);
		
		//DeclaraComando:
		//    comandos+=Comando*;
		@Override public ParserRule getRule() { return rule; }
		
		//comandos+=Comando*
		public Assignment getComandosAssignment() { return cComandosAssignment; }
		
		//Comando
		public RuleCall getComandosComandoParserRuleCall_0() { return cComandosComandoParserRuleCall_0; }
	}
	public class ComandoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.ufrn.atad.Atad.Comando");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cComandosAcaoParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cComandosValidadoresParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAdicaoComandoParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cQuandoParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Comando:
		//    ComandosAcao|ComandosValidadores|AdicaoComando|Quando
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ComandosAcao|ComandosValidadores|AdicaoComando|Quando
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ComandosAcao
		public RuleCall getComandosAcaoParserRuleCall_0() { return cComandosAcaoParserRuleCall_0; }
		
		//ComandosValidadores
		public RuleCall getComandosValidadoresParserRuleCall_1() { return cComandosValidadoresParserRuleCall_1; }
		
		//AdicaoComando
		public RuleCall getAdicaoComandoParserRuleCall_2() { return cAdicaoComandoParserRuleCall_2; }
		
		//Quando
		public RuleCall getQuandoParserRuleCall_3() { return cQuandoParserRuleCall_3; }
	}
	public class ClicarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.ufrn.atad.Atad.Clicar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClicarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEmKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTipoLocalizadorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTipoLocalizadorIDTerminalRuleCall_2_0 = (RuleCall)cTipoLocalizadorAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameSTRINGTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		
		//Clicar:
		//    'clicar' 'em' tipoLocalizador=ID name=STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'clicar' 'em' tipoLocalizador=ID name=STRING
		public Group getGroup() { return cGroup; }
		
		//'clicar'
		public Keyword getClicarKeyword_0() { return cClicarKeyword_0; }
		
		//'em'
		public Keyword getEmKeyword_1() { return cEmKeyword_1; }
		
		//tipoLocalizador=ID
		public Assignment getTipoLocalizadorAssignment_2() { return cTipoLocalizadorAssignment_2; }
		
		//ID
		public RuleCall getTipoLocalizadorIDTerminalRuleCall_2_0() { return cTipoLocalizadorIDTerminalRuleCall_2_0; }
		
		//name=STRING
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_3_0() { return cNameSTRINGTerminalRuleCall_3_0; }
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
		private final Keyword cNoKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTipoLocalizadorAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTipoLocalizadorIDTerminalRuleCall_2_0 = (RuleCall)cTipoLocalizadorAssignment_2.eContents().get(0);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameSTRINGTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Assignment cConteudoAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cConteudoSTRINGTerminalRuleCall_4_0 = (RuleCall)cConteudoAssignment_4.eContents().get(0);
		
		//Escrever:
		//    'escrever' 'no' tipoLocalizador=ID name=STRING conteudo=STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'escrever' 'no' tipoLocalizador=ID name=STRING conteudo=STRING
		public Group getGroup() { return cGroup; }
		
		//'escrever'
		public Keyword getEscreverKeyword_0() { return cEscreverKeyword_0; }
		
		//'no'
		public Keyword getNoKeyword_1() { return cNoKeyword_1; }
		
		//tipoLocalizador=ID
		public Assignment getTipoLocalizadorAssignment_2() { return cTipoLocalizadorAssignment_2; }
		
		//ID
		public RuleCall getTipoLocalizadorIDTerminalRuleCall_2_0() { return cTipoLocalizadorIDTerminalRuleCall_2_0; }
		
		//name=STRING
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_3_0() { return cNameSTRINGTerminalRuleCall_3_0; }
		
		//conteudo=STRING
		public Assignment getConteudoAssignment_4() { return cConteudoAssignment_4; }
		
		//STRING
		public RuleCall getConteudoSTRINGTerminalRuleCall_4_0() { return cConteudoSTRINGTerminalRuleCall_4_0; }
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
	public class VerifiquePresenteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.ufrn.atad.Atad.VerifiquePresente");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVerifiqueKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cQueKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cOKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTextoKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cEstaKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cPresenteKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//VerifiquePresente:
		//    'Verifique' 'que' 'o' 'texto' name=STRING 'esta' 'presente'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Verifique' 'que' 'o' 'texto' name=STRING 'esta' 'presente'
		public Group getGroup() { return cGroup; }
		
		//'Verifique'
		public Keyword getVerifiqueKeyword_0() { return cVerifiqueKeyword_0; }
		
		//'que'
		public Keyword getQueKeyword_1() { return cQueKeyword_1; }
		
		//'o'
		public Keyword getOKeyword_2() { return cOKeyword_2; }
		
		//'texto'
		public Keyword getTextoKeyword_3() { return cTextoKeyword_3; }
		
		//name=STRING
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_4_0() { return cNameSTRINGTerminalRuleCall_4_0; }
		
		//'esta'
		public Keyword getEstaKeyword_5() { return cEstaKeyword_5; }
		
		//'presente'
		public Keyword getPresenteKeyword_6() { return cPresenteKeyword_6; }
	}
	public class VerifiqueNaoPresenteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.ufrn.atad.Atad.VerifiqueNaoPresente");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVerifiqueKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cQueKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cOKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTextoKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameSTRINGTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cNaoKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cEstaKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cPresenteKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//VerifiqueNaoPresente:
		//    'Verifique' 'que' 'o' 'texto' name=STRING 'nao' 'esta' 'presente'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'Verifique' 'que' 'o' 'texto' name=STRING 'nao' 'esta' 'presente'
		public Group getGroup() { return cGroup; }
		
		//'Verifique'
		public Keyword getVerifiqueKeyword_0() { return cVerifiqueKeyword_0; }
		
		//'que'
		public Keyword getQueKeyword_1() { return cQueKeyword_1; }
		
		//'o'
		public Keyword getOKeyword_2() { return cOKeyword_2; }
		
		//'texto'
		public Keyword getTextoKeyword_3() { return cTextoKeyword_3; }
		
		//name=STRING
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_4_0() { return cNameSTRINGTerminalRuleCall_4_0; }
		
		//'nao'
		public Keyword getNaoKeyword_5() { return cNaoKeyword_5; }
		
		//'esta'
		public Keyword getEstaKeyword_6() { return cEstaKeyword_6; }
		
		//'presente'
		public Keyword getPresenteKeyword_7() { return cPresenteKeyword_7; }
	}
	public class ComandosValidadoresElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.ufrn.atad.Atad.ComandosValidadores");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVerifiquePresenteParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cVerifiqueNaoPresenteParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ComandosValidadores:
		//    VerifiquePresente | VerifiqueNaoPresente
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//VerifiquePresente | VerifiqueNaoPresente
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//VerifiquePresente
		public RuleCall getVerifiquePresenteParserRuleCall_0() { return cVerifiquePresenteParserRuleCall_0; }
		
		//VerifiqueNaoPresente
		public RuleCall getVerifiqueNaoPresenteParserRuleCall_1() { return cVerifiqueNaoPresenteParserRuleCall_1; }
	}
	public class AdicaoComandoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.ufrn.atad.Atad.AdicaoComando");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cComandoAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cComandoComandosAcaoParserRuleCall_1_0 = (RuleCall)cComandoAssignment_1.eContents().get(0);
		
		//AdicaoComando:
		//    'E' comando=ComandosAcao
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'E' comando=ComandosAcao
		public Group getGroup() { return cGroup; }
		
		//'E'
		public Keyword getEKeyword_0() { return cEKeyword_0; }
		
		//comando=ComandosAcao
		public Assignment getComandoAssignment_1() { return cComandoAssignment_1; }
		
		//ComandosAcao
		public RuleCall getComandoComandosAcaoParserRuleCall_1_0() { return cComandoComandosAcaoParserRuleCall_1_0; }
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
	private final ComandoElements pComando;
	private final ClicarElements pClicar;
	private final NavegarElements pNavegar;
	private final EscreverElements pEscrever;
	private final ComandosAcaoElements pComandosAcao;
	private final VerifiquePresenteElements pVerifiquePresente;
	private final VerifiqueNaoPresenteElements pVerifiqueNaoPresente;
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
		this.pComando = new ComandoElements();
		this.pClicar = new ClicarElements();
		this.pNavegar = new NavegarElements();
		this.pEscrever = new EscreverElements();
		this.pComandosAcao = new ComandosAcaoElements();
		this.pVerifiquePresente = new VerifiquePresenteElements();
		this.pVerifiqueNaoPresente = new VerifiqueNaoPresenteElements();
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
	//    comandos+=Comando*;
	public DeclaraComandoElements getDeclaraComandoAccess() {
		return pDeclaraComando;
	}
	
	public ParserRule getDeclaraComandoRule() {
		return getDeclaraComandoAccess().getRule();
	}
	
	//Comando:
	//    ComandosAcao|ComandosValidadores|AdicaoComando|Quando
	//;
	public ComandoElements getComandoAccess() {
		return pComando;
	}
	
	public ParserRule getComandoRule() {
		return getComandoAccess().getRule();
	}
	
	//Clicar:
	//    'clicar' 'em' tipoLocalizador=ID name=STRING
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
	//    'escrever' 'no' tipoLocalizador=ID name=STRING conteudo=STRING
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
	
	//VerifiquePresente:
	//    'Verifique' 'que' 'o' 'texto' name=STRING 'esta' 'presente'
	//;
	public VerifiquePresenteElements getVerifiquePresenteAccess() {
		return pVerifiquePresente;
	}
	
	public ParserRule getVerifiquePresenteRule() {
		return getVerifiquePresenteAccess().getRule();
	}
	
	//VerifiqueNaoPresente:
	//    'Verifique' 'que' 'o' 'texto' name=STRING 'nao' 'esta' 'presente'
	//;
	public VerifiqueNaoPresenteElements getVerifiqueNaoPresenteAccess() {
		return pVerifiqueNaoPresente;
	}
	
	public ParserRule getVerifiqueNaoPresenteRule() {
		return getVerifiqueNaoPresenteAccess().getRule();
	}
	
	//ComandosValidadores:
	//    VerifiquePresente | VerifiqueNaoPresente
	//;
	public ComandosValidadoresElements getComandosValidadoresAccess() {
		return pComandosValidadores;
	}
	
	public ParserRule getComandosValidadoresRule() {
		return getComandosValidadoresAccess().getRule();
	}
	
	//AdicaoComando:
	//    'E' comando=ComandosAcao
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
