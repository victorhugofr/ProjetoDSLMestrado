/*
 * generated by Xtext 2.25.0
 */
package com.ufrn.atad.serializer;

import com.google.inject.Inject;
import com.ufrn.atad.atad.AdicaoComando;
import com.ufrn.atad.atad.AtadPackage;
import com.ufrn.atad.atad.Clicar;
import com.ufrn.atad.atad.ComandosAcao;
import com.ufrn.atad.atad.ComandosValidadores;
import com.ufrn.atad.atad.DeclaraComando;
import com.ufrn.atad.atad.Escrever;
import com.ufrn.atad.atad.Navegar;
import com.ufrn.atad.atad.Verifique;
import com.ufrn.atad.services.AtadGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AtadSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AtadGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AtadPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AtadPackage.ADICAO_COMANDO:
				sequence_AdicaoComando(context, (AdicaoComando) semanticObject); 
				return; 
			case AtadPackage.CLICAR:
				sequence_Clicar(context, (Clicar) semanticObject); 
				return; 
			case AtadPackage.COMANDOS_ACAO:
				sequence_ComandosAcao(context, (ComandosAcao) semanticObject); 
				return; 
			case AtadPackage.COMANDOS_VALIDADORES:
				sequence_ComandosValidadores(context, (ComandosValidadores) semanticObject); 
				return; 
			case AtadPackage.DECLARA_COMANDO:
				sequence_DeclaraComando(context, (DeclaraComando) semanticObject); 
				return; 
			case AtadPackage.ESCREVER:
				sequence_Escrever(context, (Escrever) semanticObject); 
				return; 
			case AtadPackage.NAVEGAR:
				sequence_Navegar(context, (Navegar) semanticObject); 
				return; 
			case AtadPackage.VERIFIQUE:
				sequence_Verifique(context, (Verifique) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Comando returns AdicaoComando
	 *     AdicaoComando returns AdicaoComando
	 *
	 * Constraint:
	 *     comando=ComandosAcao
	 */
	protected void sequence_AdicaoComando(ISerializationContext context, AdicaoComando semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AtadPackage.Literals.ADICAO_COMANDO__COMANDO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtadPackage.Literals.ADICAO_COMANDO__COMANDO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdicaoComandoAccess().getComandoComandosAcaoParserRuleCall_1_0(), semanticObject.getComando());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Clicar returns Clicar
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Clicar(ISerializationContext context, Clicar semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AtadPackage.Literals.CLICAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtadPackage.Literals.CLICAR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClicarAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Comando returns ComandosAcao
	 *     ComandosAcao returns ComandosAcao
	 *     Quando returns ComandosAcao
	 *
	 * Constraint:
	 *     (comando=Clicar | comando=Navegar | comando=Escrever)
	 */
	protected void sequence_ComandosAcao(ISerializationContext context, ComandosAcao semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comando returns ComandosValidadores
	 *     ComandosValidadores returns ComandosValidadores
	 *
	 * Constraint:
	 *     verifique=Verifique
	 */
	protected void sequence_ComandosValidadores(ISerializationContext context, ComandosValidadores semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AtadPackage.Literals.COMANDOS_VALIDADORES__VERIFIQUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtadPackage.Literals.COMANDOS_VALIDADORES__VERIFIQUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComandosValidadoresAccess().getVerifiqueVerifiqueParserRuleCall_0(), semanticObject.getVerifique());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DeclaraComando returns DeclaraComando
	 *
	 * Constraint:
	 *     comandos+=Comando+
	 */
	protected void sequence_DeclaraComando(ISerializationContext context, DeclaraComando semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Escrever returns Escrever
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Escrever(ISerializationContext context, Escrever semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AtadPackage.Literals.ESCREVER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtadPackage.Literals.ESCREVER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEscreverAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Navegar returns Navegar
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Navegar(ISerializationContext context, Navegar semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AtadPackage.Literals.NAVEGAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtadPackage.Literals.NAVEGAR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNavegarAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Verifique returns Verifique
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Verifique(ISerializationContext context, Verifique semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AtadPackage.Literals.VERIFIQUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AtadPackage.Literals.VERIFIQUE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVerifiqueAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
