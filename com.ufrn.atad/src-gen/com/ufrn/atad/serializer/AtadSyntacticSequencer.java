/*
 * generated by Xtext 2.25.0
 */
package com.ufrn.atad.serializer;

import com.google.inject.Inject;
import com.ufrn.atad.services.AtadGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class AtadSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AtadGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Quando_QuandoKeyword_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AtadGrammarAccess) access;
		match_Quando_QuandoKeyword_0_q = new TokenAlias(false, true, grammarAccess.getQuandoAccess().getQuandoKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Quando_QuandoKeyword_0_q.equals(syntax))
				emit_Quando_QuandoKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'Quando'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) comando=Clicar
	 *     (rule start) (ambiguity) comando=Escrever
	 *     (rule start) (ambiguity) comando=Navegar
	 */
	protected void emit_Quando_QuandoKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
