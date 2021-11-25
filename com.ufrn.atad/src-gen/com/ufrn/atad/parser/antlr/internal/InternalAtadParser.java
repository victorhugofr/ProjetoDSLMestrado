package com.ufrn.atad.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ufrn.atad.services.AtadGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAtadParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'clicar'", "'em'", "'navegar'", "'escrever'", "'no'", "'Verifique'", "'que'", "'o'", "'texto'", "'esta'", "'presente'", "'nao'", "'E'", "'Quando'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAtadParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAtadParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAtadParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAtad.g"; }



     	private AtadGrammarAccess grammarAccess;

        public InternalAtadParser(TokenStream input, AtadGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DeclaraComando";
       	}

       	@Override
       	protected AtadGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDeclaraComando"
    // InternalAtad.g:64:1: entryRuleDeclaraComando returns [EObject current=null] : iv_ruleDeclaraComando= ruleDeclaraComando EOF ;
    public final EObject entryRuleDeclaraComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaraComando = null;


        try {
            // InternalAtad.g:64:55: (iv_ruleDeclaraComando= ruleDeclaraComando EOF )
            // InternalAtad.g:65:2: iv_ruleDeclaraComando= ruleDeclaraComando EOF
            {
             newCompositeNode(grammarAccess.getDeclaraComandoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaraComando=ruleDeclaraComando();

            state._fsp--;

             current =iv_ruleDeclaraComando; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaraComando"


    // $ANTLR start "ruleDeclaraComando"
    // InternalAtad.g:71:1: ruleDeclaraComando returns [EObject current=null] : ( (lv_comandos_0_0= ruleComando ) )* ;
    public final EObject ruleDeclaraComando() throws RecognitionException {
        EObject current = null;

        EObject lv_comandos_0_0 = null;



        	enterRule();

        try {
            // InternalAtad.g:77:2: ( ( (lv_comandos_0_0= ruleComando ) )* )
            // InternalAtad.g:78:2: ( (lv_comandos_0_0= ruleComando ) )*
            {
            // InternalAtad.g:78:2: ( (lv_comandos_0_0= ruleComando ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=14)||LA1_0==16||(LA1_0>=23 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAtad.g:79:3: (lv_comandos_0_0= ruleComando )
            	    {
            	    // InternalAtad.g:79:3: (lv_comandos_0_0= ruleComando )
            	    // InternalAtad.g:80:4: lv_comandos_0_0= ruleComando
            	    {

            	    				newCompositeNode(grammarAccess.getDeclaraComandoAccess().getComandosComandoParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_comandos_0_0=ruleComando();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDeclaraComandoRule());
            	    				}
            	    				add(
            	    					current,
            	    					"comandos",
            	    					lv_comandos_0_0,
            	    					"com.ufrn.atad.Atad.Comando");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaraComando"


    // $ANTLR start "entryRuleComando"
    // InternalAtad.g:100:1: entryRuleComando returns [EObject current=null] : iv_ruleComando= ruleComando EOF ;
    public final EObject entryRuleComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComando = null;


        try {
            // InternalAtad.g:100:48: (iv_ruleComando= ruleComando EOF )
            // InternalAtad.g:101:2: iv_ruleComando= ruleComando EOF
            {
             newCompositeNode(grammarAccess.getComandoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComando=ruleComando();

            state._fsp--;

             current =iv_ruleComando; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComando"


    // $ANTLR start "ruleComando"
    // InternalAtad.g:107:1: ruleComando returns [EObject current=null] : (this_ComandosAcao_0= ruleComandosAcao | this_ComandosValidadores_1= ruleComandosValidadores | this_AdicaoComando_2= ruleAdicaoComando | this_Quando_3= ruleQuando ) ;
    public final EObject ruleComando() throws RecognitionException {
        EObject current = null;

        EObject this_ComandosAcao_0 = null;

        EObject this_ComandosValidadores_1 = null;

        EObject this_AdicaoComando_2 = null;

        EObject this_Quando_3 = null;



        	enterRule();

        try {
            // InternalAtad.g:113:2: ( (this_ComandosAcao_0= ruleComandosAcao | this_ComandosValidadores_1= ruleComandosValidadores | this_AdicaoComando_2= ruleAdicaoComando | this_Quando_3= ruleQuando ) )
            // InternalAtad.g:114:2: (this_ComandosAcao_0= ruleComandosAcao | this_ComandosValidadores_1= ruleComandosValidadores | this_AdicaoComando_2= ruleAdicaoComando | this_Quando_3= ruleQuando )
            {
            // InternalAtad.g:114:2: (this_ComandosAcao_0= ruleComandosAcao | this_ComandosValidadores_1= ruleComandosValidadores | this_AdicaoComando_2= ruleAdicaoComando | this_Quando_3= ruleQuando )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
            case 13:
            case 14:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 24:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAtad.g:115:3: this_ComandosAcao_0= ruleComandosAcao
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandosAcaoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandosAcao_0=ruleComandosAcao();

                    state._fsp--;


                    			current = this_ComandosAcao_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAtad.g:124:3: this_ComandosValidadores_1= ruleComandosValidadores
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getComandosValidadoresParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComandosValidadores_1=ruleComandosValidadores();

                    state._fsp--;


                    			current = this_ComandosValidadores_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAtad.g:133:3: this_AdicaoComando_2= ruleAdicaoComando
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getAdicaoComandoParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AdicaoComando_2=ruleAdicaoComando();

                    state._fsp--;


                    			current = this_AdicaoComando_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAtad.g:142:3: this_Quando_3= ruleQuando
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getQuandoParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Quando_3=ruleQuando();

                    state._fsp--;


                    			current = this_Quando_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComando"


    // $ANTLR start "entryRuleClicar"
    // InternalAtad.g:154:1: entryRuleClicar returns [EObject current=null] : iv_ruleClicar= ruleClicar EOF ;
    public final EObject entryRuleClicar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClicar = null;


        try {
            // InternalAtad.g:154:47: (iv_ruleClicar= ruleClicar EOF )
            // InternalAtad.g:155:2: iv_ruleClicar= ruleClicar EOF
            {
             newCompositeNode(grammarAccess.getClicarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClicar=ruleClicar();

            state._fsp--;

             current =iv_ruleClicar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClicar"


    // $ANTLR start "ruleClicar"
    // InternalAtad.g:161:1: ruleClicar returns [EObject current=null] : (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_tipoLocalizador_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleClicar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tipoLocalizador_2_0=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalAtad.g:167:2: ( (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_tipoLocalizador_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) ) )
            // InternalAtad.g:168:2: (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_tipoLocalizador_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // InternalAtad.g:168:2: (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_tipoLocalizador_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) )
            // InternalAtad.g:169:3: otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_tipoLocalizador_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClicarAccess().getClicarKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getClicarAccess().getEmKeyword_1());
            		
            // InternalAtad.g:177:3: ( (lv_tipoLocalizador_2_0= RULE_ID ) )
            // InternalAtad.g:178:4: (lv_tipoLocalizador_2_0= RULE_ID )
            {
            // InternalAtad.g:178:4: (lv_tipoLocalizador_2_0= RULE_ID )
            // InternalAtad.g:179:5: lv_tipoLocalizador_2_0= RULE_ID
            {
            lv_tipoLocalizador_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_tipoLocalizador_2_0, grammarAccess.getClicarAccess().getTipoLocalizadorIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClicarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tipoLocalizador",
            						lv_tipoLocalizador_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAtad.g:195:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalAtad.g:196:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalAtad.g:196:4: (lv_name_3_0= RULE_STRING )
            // InternalAtad.g:197:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getClicarAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClicarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClicar"


    // $ANTLR start "entryRuleNavegar"
    // InternalAtad.g:217:1: entryRuleNavegar returns [EObject current=null] : iv_ruleNavegar= ruleNavegar EOF ;
    public final EObject entryRuleNavegar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavegar = null;


        try {
            // InternalAtad.g:217:48: (iv_ruleNavegar= ruleNavegar EOF )
            // InternalAtad.g:218:2: iv_ruleNavegar= ruleNavegar EOF
            {
             newCompositeNode(grammarAccess.getNavegarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavegar=ruleNavegar();

            state._fsp--;

             current =iv_ruleNavegar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavegar"


    // $ANTLR start "ruleNavegar"
    // InternalAtad.g:224:1: ruleNavegar returns [EObject current=null] : (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNavegar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAtad.g:230:2: ( (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalAtad.g:231:2: (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalAtad.g:231:2: (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalAtad.g:232:3: otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getNavegarAccess().getNavegarKeyword_0());
            		
            // InternalAtad.g:236:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAtad.g:237:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAtad.g:237:4: (lv_name_1_0= RULE_STRING )
            // InternalAtad.g:238:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNavegarAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavegarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavegar"


    // $ANTLR start "entryRuleEscrever"
    // InternalAtad.g:258:1: entryRuleEscrever returns [EObject current=null] : iv_ruleEscrever= ruleEscrever EOF ;
    public final EObject entryRuleEscrever() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscrever = null;


        try {
            // InternalAtad.g:258:49: (iv_ruleEscrever= ruleEscrever EOF )
            // InternalAtad.g:259:2: iv_ruleEscrever= ruleEscrever EOF
            {
             newCompositeNode(grammarAccess.getEscreverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEscrever=ruleEscrever();

            state._fsp--;

             current =iv_ruleEscrever; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEscrever"


    // $ANTLR start "ruleEscrever"
    // InternalAtad.g:265:1: ruleEscrever returns [EObject current=null] : (otherlv_0= 'escrever' otherlv_1= 'no' ( (lv_tipoLocalizador_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_conteudo_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleEscrever() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tipoLocalizador_2_0=null;
        Token lv_name_3_0=null;
        Token lv_conteudo_4_0=null;


        	enterRule();

        try {
            // InternalAtad.g:271:2: ( (otherlv_0= 'escrever' otherlv_1= 'no' ( (lv_tipoLocalizador_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_conteudo_4_0= RULE_STRING ) ) ) )
            // InternalAtad.g:272:2: (otherlv_0= 'escrever' otherlv_1= 'no' ( (lv_tipoLocalizador_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_conteudo_4_0= RULE_STRING ) ) )
            {
            // InternalAtad.g:272:2: (otherlv_0= 'escrever' otherlv_1= 'no' ( (lv_tipoLocalizador_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_conteudo_4_0= RULE_STRING ) ) )
            // InternalAtad.g:273:3: otherlv_0= 'escrever' otherlv_1= 'no' ( (lv_tipoLocalizador_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_conteudo_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEscreverAccess().getEscreverKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEscreverAccess().getNoKeyword_1());
            		
            // InternalAtad.g:281:3: ( (lv_tipoLocalizador_2_0= RULE_ID ) )
            // InternalAtad.g:282:4: (lv_tipoLocalizador_2_0= RULE_ID )
            {
            // InternalAtad.g:282:4: (lv_tipoLocalizador_2_0= RULE_ID )
            // InternalAtad.g:283:5: lv_tipoLocalizador_2_0= RULE_ID
            {
            lv_tipoLocalizador_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_tipoLocalizador_2_0, grammarAccess.getEscreverAccess().getTipoLocalizadorIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEscreverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tipoLocalizador",
            						lv_tipoLocalizador_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAtad.g:299:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalAtad.g:300:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalAtad.g:300:4: (lv_name_3_0= RULE_STRING )
            // InternalAtad.g:301:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_3_0, grammarAccess.getEscreverAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEscreverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAtad.g:317:3: ( (lv_conteudo_4_0= RULE_STRING ) )
            // InternalAtad.g:318:4: (lv_conteudo_4_0= RULE_STRING )
            {
            // InternalAtad.g:318:4: (lv_conteudo_4_0= RULE_STRING )
            // InternalAtad.g:319:5: lv_conteudo_4_0= RULE_STRING
            {
            lv_conteudo_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_conteudo_4_0, grammarAccess.getEscreverAccess().getConteudoSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEscreverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"conteudo",
            						lv_conteudo_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEscrever"


    // $ANTLR start "entryRuleComandosAcao"
    // InternalAtad.g:339:1: entryRuleComandosAcao returns [EObject current=null] : iv_ruleComandosAcao= ruleComandosAcao EOF ;
    public final EObject entryRuleComandosAcao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandosAcao = null;


        try {
            // InternalAtad.g:339:53: (iv_ruleComandosAcao= ruleComandosAcao EOF )
            // InternalAtad.g:340:2: iv_ruleComandosAcao= ruleComandosAcao EOF
            {
             newCompositeNode(grammarAccess.getComandosAcaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandosAcao=ruleComandosAcao();

            state._fsp--;

             current =iv_ruleComandosAcao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComandosAcao"


    // $ANTLR start "ruleComandosAcao"
    // InternalAtad.g:346:1: ruleComandosAcao returns [EObject current=null] : (this_Clicar_0= ruleClicar | this_Navegar_1= ruleNavegar | this_Escrever_2= ruleEscrever ) ;
    public final EObject ruleComandosAcao() throws RecognitionException {
        EObject current = null;

        EObject this_Clicar_0 = null;

        EObject this_Navegar_1 = null;

        EObject this_Escrever_2 = null;



        	enterRule();

        try {
            // InternalAtad.g:352:2: ( (this_Clicar_0= ruleClicar | this_Navegar_1= ruleNavegar | this_Escrever_2= ruleEscrever ) )
            // InternalAtad.g:353:2: (this_Clicar_0= ruleClicar | this_Navegar_1= ruleNavegar | this_Escrever_2= ruleEscrever )
            {
            // InternalAtad.g:353:2: (this_Clicar_0= ruleClicar | this_Navegar_1= ruleNavegar | this_Escrever_2= ruleEscrever )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAtad.g:354:3: this_Clicar_0= ruleClicar
                    {

                    			newCompositeNode(grammarAccess.getComandosAcaoAccess().getClicarParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clicar_0=ruleClicar();

                    state._fsp--;


                    			current = this_Clicar_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAtad.g:363:3: this_Navegar_1= ruleNavegar
                    {

                    			newCompositeNode(grammarAccess.getComandosAcaoAccess().getNavegarParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Navegar_1=ruleNavegar();

                    state._fsp--;


                    			current = this_Navegar_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAtad.g:372:3: this_Escrever_2= ruleEscrever
                    {

                    			newCompositeNode(grammarAccess.getComandosAcaoAccess().getEscreverParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Escrever_2=ruleEscrever();

                    state._fsp--;


                    			current = this_Escrever_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComandosAcao"


    // $ANTLR start "entryRuleVerifiquePresente"
    // InternalAtad.g:384:1: entryRuleVerifiquePresente returns [EObject current=null] : iv_ruleVerifiquePresente= ruleVerifiquePresente EOF ;
    public final EObject entryRuleVerifiquePresente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifiquePresente = null;


        try {
            // InternalAtad.g:384:58: (iv_ruleVerifiquePresente= ruleVerifiquePresente EOF )
            // InternalAtad.g:385:2: iv_ruleVerifiquePresente= ruleVerifiquePresente EOF
            {
             newCompositeNode(grammarAccess.getVerifiquePresenteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerifiquePresente=ruleVerifiquePresente();

            state._fsp--;

             current =iv_ruleVerifiquePresente; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerifiquePresente"


    // $ANTLR start "ruleVerifiquePresente"
    // InternalAtad.g:391:1: ruleVerifiquePresente returns [EObject current=null] : (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'esta' otherlv_6= 'presente' ) ;
    public final EObject ruleVerifiquePresente() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalAtad.g:397:2: ( (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'esta' otherlv_6= 'presente' ) )
            // InternalAtad.g:398:2: (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'esta' otherlv_6= 'presente' )
            {
            // InternalAtad.g:398:2: (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'esta' otherlv_6= 'presente' )
            // InternalAtad.g:399:3: otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'esta' otherlv_6= 'presente'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifiquePresenteAccess().getVerifiqueKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifiquePresenteAccess().getQueKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getVerifiquePresenteAccess().getOKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getVerifiquePresenteAccess().getTextoKeyword_3());
            		
            // InternalAtad.g:415:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalAtad.g:416:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalAtad.g:416:4: (lv_name_4_0= RULE_STRING )
            // InternalAtad.g:417:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_name_4_0, grammarAccess.getVerifiquePresenteAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVerifiquePresenteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getVerifiquePresenteAccess().getEstaKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getVerifiquePresenteAccess().getPresenteKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerifiquePresente"


    // $ANTLR start "entryRuleVerifiqueNaoPresente"
    // InternalAtad.g:445:1: entryRuleVerifiqueNaoPresente returns [EObject current=null] : iv_ruleVerifiqueNaoPresente= ruleVerifiqueNaoPresente EOF ;
    public final EObject entryRuleVerifiqueNaoPresente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifiqueNaoPresente = null;


        try {
            // InternalAtad.g:445:61: (iv_ruleVerifiqueNaoPresente= ruleVerifiqueNaoPresente EOF )
            // InternalAtad.g:446:2: iv_ruleVerifiqueNaoPresente= ruleVerifiqueNaoPresente EOF
            {
             newCompositeNode(grammarAccess.getVerifiqueNaoPresenteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerifiqueNaoPresente=ruleVerifiqueNaoPresente();

            state._fsp--;

             current =iv_ruleVerifiqueNaoPresente; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerifiqueNaoPresente"


    // $ANTLR start "ruleVerifiqueNaoPresente"
    // InternalAtad.g:452:1: ruleVerifiqueNaoPresente returns [EObject current=null] : (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'nao' otherlv_6= 'esta' otherlv_7= 'presente' ) ;
    public final EObject ruleVerifiqueNaoPresente() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalAtad.g:458:2: ( (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'nao' otherlv_6= 'esta' otherlv_7= 'presente' ) )
            // InternalAtad.g:459:2: (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'nao' otherlv_6= 'esta' otherlv_7= 'presente' )
            {
            // InternalAtad.g:459:2: (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'nao' otherlv_6= 'esta' otherlv_7= 'presente' )
            // InternalAtad.g:460:3: otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'nao' otherlv_6= 'esta' otherlv_7= 'presente'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifiqueNaoPresenteAccess().getVerifiqueKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifiqueNaoPresenteAccess().getQueKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getVerifiqueNaoPresenteAccess().getOKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getVerifiqueNaoPresenteAccess().getTextoKeyword_3());
            		
            // InternalAtad.g:476:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalAtad.g:477:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalAtad.g:477:4: (lv_name_4_0= RULE_STRING )
            // InternalAtad.g:478:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_name_4_0, grammarAccess.getVerifiqueNaoPresenteAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVerifiqueNaoPresenteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getVerifiqueNaoPresenteAccess().getNaoKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getVerifiqueNaoPresenteAccess().getEstaKeyword_6());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVerifiqueNaoPresenteAccess().getPresenteKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerifiqueNaoPresente"


    // $ANTLR start "entryRuleComandosValidadores"
    // InternalAtad.g:510:1: entryRuleComandosValidadores returns [EObject current=null] : iv_ruleComandosValidadores= ruleComandosValidadores EOF ;
    public final EObject entryRuleComandosValidadores() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandosValidadores = null;


        try {
            // InternalAtad.g:510:60: (iv_ruleComandosValidadores= ruleComandosValidadores EOF )
            // InternalAtad.g:511:2: iv_ruleComandosValidadores= ruleComandosValidadores EOF
            {
             newCompositeNode(grammarAccess.getComandosValidadoresRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComandosValidadores=ruleComandosValidadores();

            state._fsp--;

             current =iv_ruleComandosValidadores; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComandosValidadores"


    // $ANTLR start "ruleComandosValidadores"
    // InternalAtad.g:517:1: ruleComandosValidadores returns [EObject current=null] : (this_VerifiquePresente_0= ruleVerifiquePresente | this_VerifiqueNaoPresente_1= ruleVerifiqueNaoPresente ) ;
    public final EObject ruleComandosValidadores() throws RecognitionException {
        EObject current = null;

        EObject this_VerifiquePresente_0 = null;

        EObject this_VerifiqueNaoPresente_1 = null;



        	enterRule();

        try {
            // InternalAtad.g:523:2: ( (this_VerifiquePresente_0= ruleVerifiquePresente | this_VerifiqueNaoPresente_1= ruleVerifiqueNaoPresente ) )
            // InternalAtad.g:524:2: (this_VerifiquePresente_0= ruleVerifiquePresente | this_VerifiqueNaoPresente_1= ruleVerifiqueNaoPresente )
            {
            // InternalAtad.g:524:2: (this_VerifiquePresente_0= ruleVerifiquePresente | this_VerifiqueNaoPresente_1= ruleVerifiqueNaoPresente )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==17) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==18) ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3==19) ) {
                            int LA4_4 = input.LA(5);

                            if ( (LA4_4==RULE_STRING) ) {
                                int LA4_5 = input.LA(6);

                                if ( (LA4_5==20) ) {
                                    alt4=1;
                                }
                                else if ( (LA4_5==22) ) {
                                    alt4=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAtad.g:525:3: this_VerifiquePresente_0= ruleVerifiquePresente
                    {

                    			newCompositeNode(grammarAccess.getComandosValidadoresAccess().getVerifiquePresenteParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VerifiquePresente_0=ruleVerifiquePresente();

                    state._fsp--;


                    			current = this_VerifiquePresente_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAtad.g:534:3: this_VerifiqueNaoPresente_1= ruleVerifiqueNaoPresente
                    {

                    			newCompositeNode(grammarAccess.getComandosValidadoresAccess().getVerifiqueNaoPresenteParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VerifiqueNaoPresente_1=ruleVerifiqueNaoPresente();

                    state._fsp--;


                    			current = this_VerifiqueNaoPresente_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComandosValidadores"


    // $ANTLR start "entryRuleAdicaoComando"
    // InternalAtad.g:546:1: entryRuleAdicaoComando returns [EObject current=null] : iv_ruleAdicaoComando= ruleAdicaoComando EOF ;
    public final EObject entryRuleAdicaoComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdicaoComando = null;


        try {
            // InternalAtad.g:546:54: (iv_ruleAdicaoComando= ruleAdicaoComando EOF )
            // InternalAtad.g:547:2: iv_ruleAdicaoComando= ruleAdicaoComando EOF
            {
             newCompositeNode(grammarAccess.getAdicaoComandoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdicaoComando=ruleAdicaoComando();

            state._fsp--;

             current =iv_ruleAdicaoComando; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdicaoComando"


    // $ANTLR start "ruleAdicaoComando"
    // InternalAtad.g:553:1: ruleAdicaoComando returns [EObject current=null] : (otherlv_0= 'E' ( (lv_comando_1_0= ruleComandosAcao ) ) ) ;
    public final EObject ruleAdicaoComando() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_comando_1_0 = null;



        	enterRule();

        try {
            // InternalAtad.g:559:2: ( (otherlv_0= 'E' ( (lv_comando_1_0= ruleComandosAcao ) ) ) )
            // InternalAtad.g:560:2: (otherlv_0= 'E' ( (lv_comando_1_0= ruleComandosAcao ) ) )
            {
            // InternalAtad.g:560:2: (otherlv_0= 'E' ( (lv_comando_1_0= ruleComandosAcao ) ) )
            // InternalAtad.g:561:3: otherlv_0= 'E' ( (lv_comando_1_0= ruleComandosAcao ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAdicaoComandoAccess().getEKeyword_0());
            		
            // InternalAtad.g:565:3: ( (lv_comando_1_0= ruleComandosAcao ) )
            // InternalAtad.g:566:4: (lv_comando_1_0= ruleComandosAcao )
            {
            // InternalAtad.g:566:4: (lv_comando_1_0= ruleComandosAcao )
            // InternalAtad.g:567:5: lv_comando_1_0= ruleComandosAcao
            {

            					newCompositeNode(grammarAccess.getAdicaoComandoAccess().getComandoComandosAcaoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_comando_1_0=ruleComandosAcao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdicaoComandoRule());
            					}
            					set(
            						current,
            						"comando",
            						lv_comando_1_0,
            						"com.ufrn.atad.Atad.ComandosAcao");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdicaoComando"


    // $ANTLR start "entryRuleQuando"
    // InternalAtad.g:588:1: entryRuleQuando returns [EObject current=null] : iv_ruleQuando= ruleQuando EOF ;
    public final EObject entryRuleQuando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuando = null;


        try {
            // InternalAtad.g:588:47: (iv_ruleQuando= ruleQuando EOF )
            // InternalAtad.g:589:2: iv_ruleQuando= ruleQuando EOF
            {
             newCompositeNode(grammarAccess.getQuandoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuando=ruleQuando();

            state._fsp--;

             current =iv_ruleQuando; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuando"


    // $ANTLR start "ruleQuando"
    // InternalAtad.g:595:1: ruleQuando returns [EObject current=null] : (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao ) ;
    public final EObject ruleQuando() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ComandosAcao_1 = null;



        	enterRule();

        try {
            // InternalAtad.g:601:2: ( (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao ) )
            // InternalAtad.g:602:2: (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao )
            {
            // InternalAtad.g:602:2: (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao )
            // InternalAtad.g:603:3: otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao
            {
            otherlv_0=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getQuandoAccess().getQuandoKeyword_0());
            		

            			newCompositeNode(grammarAccess.getQuandoAccess().getComandosAcaoParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_ComandosAcao_1=ruleComandosAcao();

            state._fsp--;


            			current = this_ComandosAcao_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuando"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001816802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000006800L});

}