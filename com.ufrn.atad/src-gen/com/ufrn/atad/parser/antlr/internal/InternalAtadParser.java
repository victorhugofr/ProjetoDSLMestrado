package com.ufrn.atad.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'clicar'", "'em'", "'navegar'", "'escrever'", "'no'", "'Espere'", "'estar presente'", "'estar visivel'", "'estar clicavel'", "'Verifique'", "'que'", "'o'", "'texto'", "'esta'", "'presente'", "'nao'", "'E'", "'Quando'", "'xpath'", "'id'", "'cssSelector'", "'className'", "'linkText'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalAtad.g:65:1: entryRuleDeclaraComando returns [EObject current=null] : iv_ruleDeclaraComando= ruleDeclaraComando EOF ;
    public final EObject entryRuleDeclaraComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaraComando = null;


        try {
            // InternalAtad.g:65:55: (iv_ruleDeclaraComando= ruleDeclaraComando EOF )
            // InternalAtad.g:66:2: iv_ruleDeclaraComando= ruleDeclaraComando EOF
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
    // InternalAtad.g:72:1: ruleDeclaraComando returns [EObject current=null] : ( (lv_comandos_0_0= ruleComando ) )* ;
    public final EObject ruleDeclaraComando() throws RecognitionException {
        EObject current = null;

        EObject lv_comandos_0_0 = null;



        	enterRule();

        try {
            // InternalAtad.g:78:2: ( ( (lv_comandos_0_0= ruleComando ) )* )
            // InternalAtad.g:79:2: ( (lv_comandos_0_0= ruleComando ) )*
            {
            // InternalAtad.g:79:2: ( (lv_comandos_0_0= ruleComando ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=14)||LA1_0==16||LA1_0==20||(LA1_0>=27 && LA1_0<=28)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAtad.g:80:3: (lv_comandos_0_0= ruleComando )
            	    {
            	    // InternalAtad.g:80:3: (lv_comandos_0_0= ruleComando )
            	    // InternalAtad.g:81:4: lv_comandos_0_0= ruleComando
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
    // InternalAtad.g:101:1: entryRuleComando returns [EObject current=null] : iv_ruleComando= ruleComando EOF ;
    public final EObject entryRuleComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComando = null;


        try {
            // InternalAtad.g:101:48: (iv_ruleComando= ruleComando EOF )
            // InternalAtad.g:102:2: iv_ruleComando= ruleComando EOF
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
    // InternalAtad.g:108:1: ruleComando returns [EObject current=null] : (this_ComandosAcao_0= ruleComandosAcao | this_ComandosValidadores_1= ruleComandosValidadores | this_AdicaoComando_2= ruleAdicaoComando | this_Quando_3= ruleQuando | this_Espera_4= ruleEspera ) ;
    public final EObject ruleComando() throws RecognitionException {
        EObject current = null;

        EObject this_ComandosAcao_0 = null;

        EObject this_ComandosValidadores_1 = null;

        EObject this_AdicaoComando_2 = null;

        EObject this_Quando_3 = null;

        EObject this_Espera_4 = null;



        	enterRule();

        try {
            // InternalAtad.g:114:2: ( (this_ComandosAcao_0= ruleComandosAcao | this_ComandosValidadores_1= ruleComandosValidadores | this_AdicaoComando_2= ruleAdicaoComando | this_Quando_3= ruleQuando | this_Espera_4= ruleEspera ) )
            // InternalAtad.g:115:2: (this_ComandosAcao_0= ruleComandosAcao | this_ComandosValidadores_1= ruleComandosValidadores | this_AdicaoComando_2= ruleAdicaoComando | this_Quando_3= ruleQuando | this_Espera_4= ruleEspera )
            {
            // InternalAtad.g:115:2: (this_ComandosAcao_0= ruleComandosAcao | this_ComandosValidadores_1= ruleComandosValidadores | this_AdicaoComando_2= ruleAdicaoComando | this_Quando_3= ruleQuando | this_Espera_4= ruleEspera )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
            case 13:
            case 14:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 28:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAtad.g:116:3: this_ComandosAcao_0= ruleComandosAcao
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
                    // InternalAtad.g:125:3: this_ComandosValidadores_1= ruleComandosValidadores
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
                    // InternalAtad.g:134:3: this_AdicaoComando_2= ruleAdicaoComando
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
                    // InternalAtad.g:143:3: this_Quando_3= ruleQuando
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getQuandoParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Quando_3=ruleQuando();

                    state._fsp--;


                    			current = this_Quando_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAtad.g:152:3: this_Espera_4= ruleEspera
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getEsperaParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Espera_4=ruleEspera();

                    state._fsp--;


                    			current = this_Espera_4;
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
    // InternalAtad.g:164:1: entryRuleClicar returns [EObject current=null] : iv_ruleClicar= ruleClicar EOF ;
    public final EObject entryRuleClicar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClicar = null;


        try {
            // InternalAtad.g:164:47: (iv_ruleClicar= ruleClicar EOF )
            // InternalAtad.g:165:2: iv_ruleClicar= ruleClicar EOF
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
    // InternalAtad.g:171:1: ruleClicar returns [EObject current=null] : (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_tipoLocalizador_2_0= ruleTipoLocalizadores ) ) ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleClicar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Enumerator lv_tipoLocalizador_2_0 = null;



        	enterRule();

        try {
            // InternalAtad.g:177:2: ( (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_tipoLocalizador_2_0= ruleTipoLocalizadores ) ) ( (lv_name_3_0= RULE_STRING ) ) ) )
            // InternalAtad.g:178:2: (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_tipoLocalizador_2_0= ruleTipoLocalizadores ) ) ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // InternalAtad.g:178:2: (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_tipoLocalizador_2_0= ruleTipoLocalizadores ) ) ( (lv_name_3_0= RULE_STRING ) ) )
            // InternalAtad.g:179:3: otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_tipoLocalizador_2_0= ruleTipoLocalizadores ) ) ( (lv_name_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClicarAccess().getClicarKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getClicarAccess().getEmKeyword_1());
            		
            // InternalAtad.g:187:3: ( (lv_tipoLocalizador_2_0= ruleTipoLocalizadores ) )
            // InternalAtad.g:188:4: (lv_tipoLocalizador_2_0= ruleTipoLocalizadores )
            {
            // InternalAtad.g:188:4: (lv_tipoLocalizador_2_0= ruleTipoLocalizadores )
            // InternalAtad.g:189:5: lv_tipoLocalizador_2_0= ruleTipoLocalizadores
            {

            					newCompositeNode(grammarAccess.getClicarAccess().getTipoLocalizadorTipoLocalizadoresEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_tipoLocalizador_2_0=ruleTipoLocalizadores();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClicarRule());
            					}
            					set(
            						current,
            						"tipoLocalizador",
            						lv_tipoLocalizador_2_0,
            						"com.ufrn.atad.Atad.TipoLocalizadores");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAtad.g:206:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalAtad.g:207:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalAtad.g:207:4: (lv_name_3_0= RULE_STRING )
            // InternalAtad.g:208:5: lv_name_3_0= RULE_STRING
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
    // InternalAtad.g:228:1: entryRuleNavegar returns [EObject current=null] : iv_ruleNavegar= ruleNavegar EOF ;
    public final EObject entryRuleNavegar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavegar = null;


        try {
            // InternalAtad.g:228:48: (iv_ruleNavegar= ruleNavegar EOF )
            // InternalAtad.g:229:2: iv_ruleNavegar= ruleNavegar EOF
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
    // InternalAtad.g:235:1: ruleNavegar returns [EObject current=null] : (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNavegar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAtad.g:241:2: ( (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalAtad.g:242:2: (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalAtad.g:242:2: (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalAtad.g:243:3: otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getNavegarAccess().getNavegarKeyword_0());
            		
            // InternalAtad.g:247:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAtad.g:248:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAtad.g:248:4: (lv_name_1_0= RULE_STRING )
            // InternalAtad.g:249:5: lv_name_1_0= RULE_STRING
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
    // InternalAtad.g:269:1: entryRuleEscrever returns [EObject current=null] : iv_ruleEscrever= ruleEscrever EOF ;
    public final EObject entryRuleEscrever() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscrever = null;


        try {
            // InternalAtad.g:269:49: (iv_ruleEscrever= ruleEscrever EOF )
            // InternalAtad.g:270:2: iv_ruleEscrever= ruleEscrever EOF
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
    // InternalAtad.g:276:1: ruleEscrever returns [EObject current=null] : (otherlv_0= 'escrever' otherlv_1= 'no' ( (lv_tipoLocalizador_2_0= ruleTipoLocalizadores ) ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_conteudo_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleEscrever() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token lv_conteudo_4_0=null;
        Enumerator lv_tipoLocalizador_2_0 = null;



        	enterRule();

        try {
            // InternalAtad.g:282:2: ( (otherlv_0= 'escrever' otherlv_1= 'no' ( (lv_tipoLocalizador_2_0= ruleTipoLocalizadores ) ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_conteudo_4_0= RULE_STRING ) ) ) )
            // InternalAtad.g:283:2: (otherlv_0= 'escrever' otherlv_1= 'no' ( (lv_tipoLocalizador_2_0= ruleTipoLocalizadores ) ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_conteudo_4_0= RULE_STRING ) ) )
            {
            // InternalAtad.g:283:2: (otherlv_0= 'escrever' otherlv_1= 'no' ( (lv_tipoLocalizador_2_0= ruleTipoLocalizadores ) ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_conteudo_4_0= RULE_STRING ) ) )
            // InternalAtad.g:284:3: otherlv_0= 'escrever' otherlv_1= 'no' ( (lv_tipoLocalizador_2_0= ruleTipoLocalizadores ) ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_conteudo_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEscreverAccess().getEscreverKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEscreverAccess().getNoKeyword_1());
            		
            // InternalAtad.g:292:3: ( (lv_tipoLocalizador_2_0= ruleTipoLocalizadores ) )
            // InternalAtad.g:293:4: (lv_tipoLocalizador_2_0= ruleTipoLocalizadores )
            {
            // InternalAtad.g:293:4: (lv_tipoLocalizador_2_0= ruleTipoLocalizadores )
            // InternalAtad.g:294:5: lv_tipoLocalizador_2_0= ruleTipoLocalizadores
            {

            					newCompositeNode(grammarAccess.getEscreverAccess().getTipoLocalizadorTipoLocalizadoresEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_tipoLocalizador_2_0=ruleTipoLocalizadores();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEscreverRule());
            					}
            					set(
            						current,
            						"tipoLocalizador",
            						lv_tipoLocalizador_2_0,
            						"com.ufrn.atad.Atad.TipoLocalizadores");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAtad.g:311:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalAtad.g:312:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalAtad.g:312:4: (lv_name_3_0= RULE_STRING )
            // InternalAtad.g:313:5: lv_name_3_0= RULE_STRING
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

            // InternalAtad.g:329:3: ( (lv_conteudo_4_0= RULE_STRING ) )
            // InternalAtad.g:330:4: (lv_conteudo_4_0= RULE_STRING )
            {
            // InternalAtad.g:330:4: (lv_conteudo_4_0= RULE_STRING )
            // InternalAtad.g:331:5: lv_conteudo_4_0= RULE_STRING
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
    // InternalAtad.g:351:1: entryRuleComandosAcao returns [EObject current=null] : iv_ruleComandosAcao= ruleComandosAcao EOF ;
    public final EObject entryRuleComandosAcao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandosAcao = null;


        try {
            // InternalAtad.g:351:53: (iv_ruleComandosAcao= ruleComandosAcao EOF )
            // InternalAtad.g:352:2: iv_ruleComandosAcao= ruleComandosAcao EOF
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
    // InternalAtad.g:358:1: ruleComandosAcao returns [EObject current=null] : (this_Clicar_0= ruleClicar | this_Navegar_1= ruleNavegar | this_Escrever_2= ruleEscrever ) ;
    public final EObject ruleComandosAcao() throws RecognitionException {
        EObject current = null;

        EObject this_Clicar_0 = null;

        EObject this_Navegar_1 = null;

        EObject this_Escrever_2 = null;



        	enterRule();

        try {
            // InternalAtad.g:364:2: ( (this_Clicar_0= ruleClicar | this_Navegar_1= ruleNavegar | this_Escrever_2= ruleEscrever ) )
            // InternalAtad.g:365:2: (this_Clicar_0= ruleClicar | this_Navegar_1= ruleNavegar | this_Escrever_2= ruleEscrever )
            {
            // InternalAtad.g:365:2: (this_Clicar_0= ruleClicar | this_Navegar_1= ruleNavegar | this_Escrever_2= ruleEscrever )
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
                    // InternalAtad.g:366:3: this_Clicar_0= ruleClicar
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
                    // InternalAtad.g:375:3: this_Navegar_1= ruleNavegar
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
                    // InternalAtad.g:384:3: this_Escrever_2= ruleEscrever
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


    // $ANTLR start "entryRuleEspera"
    // InternalAtad.g:396:1: entryRuleEspera returns [EObject current=null] : iv_ruleEspera= ruleEspera EOF ;
    public final EObject entryRuleEspera() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEspera = null;


        try {
            // InternalAtad.g:396:47: (iv_ruleEspera= ruleEspera EOF )
            // InternalAtad.g:397:2: iv_ruleEspera= ruleEspera EOF
            {
             newCompositeNode(grammarAccess.getEsperaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEspera=ruleEspera();

            state._fsp--;

             current =iv_ruleEspera; 
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
    // $ANTLR end "entryRuleEspera"


    // $ANTLR start "ruleEspera"
    // InternalAtad.g:403:1: ruleEspera returns [EObject current=null] : (this_EsperaPresente_0= ruleEsperaPresente | this_EsperaVisivel_1= ruleEsperaVisivel | this_EsperaClicavel_2= ruleEsperaClicavel ) ;
    public final EObject ruleEspera() throws RecognitionException {
        EObject current = null;

        EObject this_EsperaPresente_0 = null;

        EObject this_EsperaVisivel_1 = null;

        EObject this_EsperaClicavel_2 = null;



        	enterRule();

        try {
            // InternalAtad.g:409:2: ( (this_EsperaPresente_0= ruleEsperaPresente | this_EsperaVisivel_1= ruleEsperaVisivel | this_EsperaClicavel_2= ruleEsperaClicavel ) )
            // InternalAtad.g:410:2: (this_EsperaPresente_0= ruleEsperaPresente | this_EsperaVisivel_1= ruleEsperaVisivel | this_EsperaClicavel_2= ruleEsperaClicavel )
            {
            // InternalAtad.g:410:2: (this_EsperaPresente_0= ruleEsperaPresente | this_EsperaVisivel_1= ruleEsperaVisivel | this_EsperaClicavel_2= ruleEsperaClicavel )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalAtad.g:411:3: this_EsperaPresente_0= ruleEsperaPresente
                    {

                    			newCompositeNode(grammarAccess.getEsperaAccess().getEsperaPresenteParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EsperaPresente_0=ruleEsperaPresente();

                    state._fsp--;


                    			current = this_EsperaPresente_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAtad.g:420:3: this_EsperaVisivel_1= ruleEsperaVisivel
                    {

                    			newCompositeNode(grammarAccess.getEsperaAccess().getEsperaVisivelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EsperaVisivel_1=ruleEsperaVisivel();

                    state._fsp--;


                    			current = this_EsperaVisivel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAtad.g:429:3: this_EsperaClicavel_2= ruleEsperaClicavel
                    {

                    			newCompositeNode(grammarAccess.getEsperaAccess().getEsperaClicavelParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EsperaClicavel_2=ruleEsperaClicavel();

                    state._fsp--;


                    			current = this_EsperaClicavel_2;
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
    // $ANTLR end "ruleEspera"


    // $ANTLR start "entryRuleEsperaPresente"
    // InternalAtad.g:441:1: entryRuleEsperaPresente returns [EObject current=null] : iv_ruleEsperaPresente= ruleEsperaPresente EOF ;
    public final EObject entryRuleEsperaPresente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsperaPresente = null;


        try {
            // InternalAtad.g:441:55: (iv_ruleEsperaPresente= ruleEsperaPresente EOF )
            // InternalAtad.g:442:2: iv_ruleEsperaPresente= ruleEsperaPresente EOF
            {
             newCompositeNode(grammarAccess.getEsperaPresenteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEsperaPresente=ruleEsperaPresente();

            state._fsp--;

             current =iv_ruleEsperaPresente; 
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
    // $ANTLR end "entryRuleEsperaPresente"


    // $ANTLR start "ruleEsperaPresente"
    // InternalAtad.g:448:1: ruleEsperaPresente returns [EObject current=null] : (otherlv_0= 'Espere' ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'estar presente' ) ;
    public final EObject ruleEsperaPresente() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_tipoLocalizador_1_0 = null;



        	enterRule();

        try {
            // InternalAtad.g:454:2: ( (otherlv_0= 'Espere' ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'estar presente' ) )
            // InternalAtad.g:455:2: (otherlv_0= 'Espere' ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'estar presente' )
            {
            // InternalAtad.g:455:2: (otherlv_0= 'Espere' ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'estar presente' )
            // InternalAtad.g:456:3: otherlv_0= 'Espere' ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'estar presente'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEsperaPresenteAccess().getEspereKeyword_0());
            		
            // InternalAtad.g:460:3: ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) )
            // InternalAtad.g:461:4: (lv_tipoLocalizador_1_0= ruleTipoLocalizadores )
            {
            // InternalAtad.g:461:4: (lv_tipoLocalizador_1_0= ruleTipoLocalizadores )
            // InternalAtad.g:462:5: lv_tipoLocalizador_1_0= ruleTipoLocalizadores
            {

            					newCompositeNode(grammarAccess.getEsperaPresenteAccess().getTipoLocalizadorTipoLocalizadoresEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_tipoLocalizador_1_0=ruleTipoLocalizadores();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEsperaPresenteRule());
            					}
            					set(
            						current,
            						"tipoLocalizador",
            						lv_tipoLocalizador_1_0,
            						"com.ufrn.atad.Atad.TipoLocalizadores");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAtad.g:479:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAtad.g:480:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalAtad.g:480:4: (lv_name_2_0= RULE_STRING )
            // InternalAtad.g:481:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEsperaPresenteAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEsperaPresenteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEsperaPresenteAccess().getEstarPresenteKeyword_3());
            		

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
    // $ANTLR end "ruleEsperaPresente"


    // $ANTLR start "entryRuleEsperaVisivel"
    // InternalAtad.g:505:1: entryRuleEsperaVisivel returns [EObject current=null] : iv_ruleEsperaVisivel= ruleEsperaVisivel EOF ;
    public final EObject entryRuleEsperaVisivel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsperaVisivel = null;


        try {
            // InternalAtad.g:505:54: (iv_ruleEsperaVisivel= ruleEsperaVisivel EOF )
            // InternalAtad.g:506:2: iv_ruleEsperaVisivel= ruleEsperaVisivel EOF
            {
             newCompositeNode(grammarAccess.getEsperaVisivelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEsperaVisivel=ruleEsperaVisivel();

            state._fsp--;

             current =iv_ruleEsperaVisivel; 
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
    // $ANTLR end "entryRuleEsperaVisivel"


    // $ANTLR start "ruleEsperaVisivel"
    // InternalAtad.g:512:1: ruleEsperaVisivel returns [EObject current=null] : (otherlv_0= 'Espere' ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'estar visivel' ) ;
    public final EObject ruleEsperaVisivel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_tipoLocalizador_1_0 = null;



        	enterRule();

        try {
            // InternalAtad.g:518:2: ( (otherlv_0= 'Espere' ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'estar visivel' ) )
            // InternalAtad.g:519:2: (otherlv_0= 'Espere' ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'estar visivel' )
            {
            // InternalAtad.g:519:2: (otherlv_0= 'Espere' ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'estar visivel' )
            // InternalAtad.g:520:3: otherlv_0= 'Espere' ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'estar visivel'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEsperaVisivelAccess().getEspereKeyword_0());
            		
            // InternalAtad.g:524:3: ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) )
            // InternalAtad.g:525:4: (lv_tipoLocalizador_1_0= ruleTipoLocalizadores )
            {
            // InternalAtad.g:525:4: (lv_tipoLocalizador_1_0= ruleTipoLocalizadores )
            // InternalAtad.g:526:5: lv_tipoLocalizador_1_0= ruleTipoLocalizadores
            {

            					newCompositeNode(grammarAccess.getEsperaVisivelAccess().getTipoLocalizadorTipoLocalizadoresEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_tipoLocalizador_1_0=ruleTipoLocalizadores();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEsperaVisivelRule());
            					}
            					set(
            						current,
            						"tipoLocalizador",
            						lv_tipoLocalizador_1_0,
            						"com.ufrn.atad.Atad.TipoLocalizadores");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAtad.g:543:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAtad.g:544:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalAtad.g:544:4: (lv_name_2_0= RULE_STRING )
            // InternalAtad.g:545:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEsperaVisivelAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEsperaVisivelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEsperaVisivelAccess().getEstarVisivelKeyword_3());
            		

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
    // $ANTLR end "ruleEsperaVisivel"


    // $ANTLR start "entryRuleEsperaClicavel"
    // InternalAtad.g:569:1: entryRuleEsperaClicavel returns [EObject current=null] : iv_ruleEsperaClicavel= ruleEsperaClicavel EOF ;
    public final EObject entryRuleEsperaClicavel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEsperaClicavel = null;


        try {
            // InternalAtad.g:569:55: (iv_ruleEsperaClicavel= ruleEsperaClicavel EOF )
            // InternalAtad.g:570:2: iv_ruleEsperaClicavel= ruleEsperaClicavel EOF
            {
             newCompositeNode(grammarAccess.getEsperaClicavelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEsperaClicavel=ruleEsperaClicavel();

            state._fsp--;

             current =iv_ruleEsperaClicavel; 
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
    // $ANTLR end "entryRuleEsperaClicavel"


    // $ANTLR start "ruleEsperaClicavel"
    // InternalAtad.g:576:1: ruleEsperaClicavel returns [EObject current=null] : (otherlv_0= 'Espere' ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'estar clicavel' ) ;
    public final EObject ruleEsperaClicavel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_tipoLocalizador_1_0 = null;



        	enterRule();

        try {
            // InternalAtad.g:582:2: ( (otherlv_0= 'Espere' ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'estar clicavel' ) )
            // InternalAtad.g:583:2: (otherlv_0= 'Espere' ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'estar clicavel' )
            {
            // InternalAtad.g:583:2: (otherlv_0= 'Espere' ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'estar clicavel' )
            // InternalAtad.g:584:3: otherlv_0= 'Espere' ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) ) ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'estar clicavel'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEsperaClicavelAccess().getEspereKeyword_0());
            		
            // InternalAtad.g:588:3: ( (lv_tipoLocalizador_1_0= ruleTipoLocalizadores ) )
            // InternalAtad.g:589:4: (lv_tipoLocalizador_1_0= ruleTipoLocalizadores )
            {
            // InternalAtad.g:589:4: (lv_tipoLocalizador_1_0= ruleTipoLocalizadores )
            // InternalAtad.g:590:5: lv_tipoLocalizador_1_0= ruleTipoLocalizadores
            {

            					newCompositeNode(grammarAccess.getEsperaClicavelAccess().getTipoLocalizadorTipoLocalizadoresEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_tipoLocalizador_1_0=ruleTipoLocalizadores();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEsperaClicavelRule());
            					}
            					set(
            						current,
            						"tipoLocalizador",
            						lv_tipoLocalizador_1_0,
            						"com.ufrn.atad.Atad.TipoLocalizadores");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAtad.g:607:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAtad.g:608:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalAtad.g:608:4: (lv_name_2_0= RULE_STRING )
            // InternalAtad.g:609:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEsperaClicavelAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEsperaClicavelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEsperaClicavelAccess().getEstarClicavelKeyword_3());
            		

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
    // $ANTLR end "ruleEsperaClicavel"


    // $ANTLR start "entryRuleVerifiquePresente"
    // InternalAtad.g:633:1: entryRuleVerifiquePresente returns [EObject current=null] : iv_ruleVerifiquePresente= ruleVerifiquePresente EOF ;
    public final EObject entryRuleVerifiquePresente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifiquePresente = null;


        try {
            // InternalAtad.g:633:58: (iv_ruleVerifiquePresente= ruleVerifiquePresente EOF )
            // InternalAtad.g:634:2: iv_ruleVerifiquePresente= ruleVerifiquePresente EOF
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
    // InternalAtad.g:640:1: ruleVerifiquePresente returns [EObject current=null] : (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'esta' otherlv_6= 'presente' ) ;
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
            // InternalAtad.g:646:2: ( (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'esta' otherlv_6= 'presente' ) )
            // InternalAtad.g:647:2: (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'esta' otherlv_6= 'presente' )
            {
            // InternalAtad.g:647:2: (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'esta' otherlv_6= 'presente' )
            // InternalAtad.g:648:3: otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'esta' otherlv_6= 'presente'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifiquePresenteAccess().getVerifiqueKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifiquePresenteAccess().getQueKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getVerifiquePresenteAccess().getOKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getVerifiquePresenteAccess().getTextoKeyword_3());
            		
            // InternalAtad.g:664:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalAtad.g:665:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalAtad.g:665:4: (lv_name_4_0= RULE_STRING )
            // InternalAtad.g:666:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

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

            otherlv_5=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getVerifiquePresenteAccess().getEstaKeyword_5());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_2); 

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
    // InternalAtad.g:694:1: entryRuleVerifiqueNaoPresente returns [EObject current=null] : iv_ruleVerifiqueNaoPresente= ruleVerifiqueNaoPresente EOF ;
    public final EObject entryRuleVerifiqueNaoPresente() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifiqueNaoPresente = null;


        try {
            // InternalAtad.g:694:61: (iv_ruleVerifiqueNaoPresente= ruleVerifiqueNaoPresente EOF )
            // InternalAtad.g:695:2: iv_ruleVerifiqueNaoPresente= ruleVerifiqueNaoPresente EOF
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
    // InternalAtad.g:701:1: ruleVerifiqueNaoPresente returns [EObject current=null] : (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'nao' otherlv_6= 'esta' otherlv_7= 'presente' ) ;
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
            // InternalAtad.g:707:2: ( (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'nao' otherlv_6= 'esta' otherlv_7= 'presente' ) )
            // InternalAtad.g:708:2: (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'nao' otherlv_6= 'esta' otherlv_7= 'presente' )
            {
            // InternalAtad.g:708:2: (otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'nao' otherlv_6= 'esta' otherlv_7= 'presente' )
            // InternalAtad.g:709:3: otherlv_0= 'Verifique' otherlv_1= 'que' otherlv_2= 'o' otherlv_3= 'texto' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= 'nao' otherlv_6= 'esta' otherlv_7= 'presente'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifiqueNaoPresenteAccess().getVerifiqueKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifiqueNaoPresenteAccess().getQueKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getVerifiqueNaoPresenteAccess().getOKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getVerifiqueNaoPresenteAccess().getTextoKeyword_3());
            		
            // InternalAtad.g:725:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalAtad.g:726:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalAtad.g:726:4: (lv_name_4_0= RULE_STRING )
            // InternalAtad.g:727:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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

            otherlv_5=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getVerifiqueNaoPresenteAccess().getNaoKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getVerifiqueNaoPresenteAccess().getEstaKeyword_6());
            		
            otherlv_7=(Token)match(input,25,FOLLOW_2); 

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
    // InternalAtad.g:759:1: entryRuleComandosValidadores returns [EObject current=null] : iv_ruleComandosValidadores= ruleComandosValidadores EOF ;
    public final EObject entryRuleComandosValidadores() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandosValidadores = null;


        try {
            // InternalAtad.g:759:60: (iv_ruleComandosValidadores= ruleComandosValidadores EOF )
            // InternalAtad.g:760:2: iv_ruleComandosValidadores= ruleComandosValidadores EOF
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
    // InternalAtad.g:766:1: ruleComandosValidadores returns [EObject current=null] : (this_VerifiquePresente_0= ruleVerifiquePresente | this_VerifiqueNaoPresente_1= ruleVerifiqueNaoPresente ) ;
    public final EObject ruleComandosValidadores() throws RecognitionException {
        EObject current = null;

        EObject this_VerifiquePresente_0 = null;

        EObject this_VerifiqueNaoPresente_1 = null;



        	enterRule();

        try {
            // InternalAtad.g:772:2: ( (this_VerifiquePresente_0= ruleVerifiquePresente | this_VerifiqueNaoPresente_1= ruleVerifiqueNaoPresente ) )
            // InternalAtad.g:773:2: (this_VerifiquePresente_0= ruleVerifiquePresente | this_VerifiqueNaoPresente_1= ruleVerifiqueNaoPresente )
            {
            // InternalAtad.g:773:2: (this_VerifiquePresente_0= ruleVerifiquePresente | this_VerifiqueNaoPresente_1= ruleVerifiqueNaoPresente )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==21) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==22) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==23) ) {
                            int LA5_4 = input.LA(5);

                            if ( (LA5_4==RULE_STRING) ) {
                                int LA5_5 = input.LA(6);

                                if ( (LA5_5==24) ) {
                                    alt5=1;
                                }
                                else if ( (LA5_5==26) ) {
                                    alt5=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAtad.g:774:3: this_VerifiquePresente_0= ruleVerifiquePresente
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
                    // InternalAtad.g:783:3: this_VerifiqueNaoPresente_1= ruleVerifiqueNaoPresente
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
    // InternalAtad.g:795:1: entryRuleAdicaoComando returns [EObject current=null] : iv_ruleAdicaoComando= ruleAdicaoComando EOF ;
    public final EObject entryRuleAdicaoComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdicaoComando = null;


        try {
            // InternalAtad.g:795:54: (iv_ruleAdicaoComando= ruleAdicaoComando EOF )
            // InternalAtad.g:796:2: iv_ruleAdicaoComando= ruleAdicaoComando EOF
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
    // InternalAtad.g:802:1: ruleAdicaoComando returns [EObject current=null] : (otherlv_0= 'E' ( (lv_comando_1_0= ruleComandosAcao ) ) ) ;
    public final EObject ruleAdicaoComando() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_comando_1_0 = null;



        	enterRule();

        try {
            // InternalAtad.g:808:2: ( (otherlv_0= 'E' ( (lv_comando_1_0= ruleComandosAcao ) ) ) )
            // InternalAtad.g:809:2: (otherlv_0= 'E' ( (lv_comando_1_0= ruleComandosAcao ) ) )
            {
            // InternalAtad.g:809:2: (otherlv_0= 'E' ( (lv_comando_1_0= ruleComandosAcao ) ) )
            // InternalAtad.g:810:3: otherlv_0= 'E' ( (lv_comando_1_0= ruleComandosAcao ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getAdicaoComandoAccess().getEKeyword_0());
            		
            // InternalAtad.g:814:3: ( (lv_comando_1_0= ruleComandosAcao ) )
            // InternalAtad.g:815:4: (lv_comando_1_0= ruleComandosAcao )
            {
            // InternalAtad.g:815:4: (lv_comando_1_0= ruleComandosAcao )
            // InternalAtad.g:816:5: lv_comando_1_0= ruleComandosAcao
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
    // InternalAtad.g:837:1: entryRuleQuando returns [EObject current=null] : iv_ruleQuando= ruleQuando EOF ;
    public final EObject entryRuleQuando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuando = null;


        try {
            // InternalAtad.g:837:47: (iv_ruleQuando= ruleQuando EOF )
            // InternalAtad.g:838:2: iv_ruleQuando= ruleQuando EOF
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
    // InternalAtad.g:844:1: ruleQuando returns [EObject current=null] : (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao ) ;
    public final EObject ruleQuando() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ComandosAcao_1 = null;



        	enterRule();

        try {
            // InternalAtad.g:850:2: ( (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao ) )
            // InternalAtad.g:851:2: (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao )
            {
            // InternalAtad.g:851:2: (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao )
            // InternalAtad.g:852:3: otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao
            {
            otherlv_0=(Token)match(input,28,FOLLOW_17); 

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


    // $ANTLR start "ruleTipoLocalizadores"
    // InternalAtad.g:868:1: ruleTipoLocalizadores returns [Enumerator current=null] : ( (enumLiteral_0= 'xpath' ) | (enumLiteral_1= 'id' ) | (enumLiteral_2= 'cssSelector' ) | (enumLiteral_3= 'className' ) | (enumLiteral_4= 'linkText' ) ) ;
    public final Enumerator ruleTipoLocalizadores() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAtad.g:874:2: ( ( (enumLiteral_0= 'xpath' ) | (enumLiteral_1= 'id' ) | (enumLiteral_2= 'cssSelector' ) | (enumLiteral_3= 'className' ) | (enumLiteral_4= 'linkText' ) ) )
            // InternalAtad.g:875:2: ( (enumLiteral_0= 'xpath' ) | (enumLiteral_1= 'id' ) | (enumLiteral_2= 'cssSelector' ) | (enumLiteral_3= 'className' ) | (enumLiteral_4= 'linkText' ) )
            {
            // InternalAtad.g:875:2: ( (enumLiteral_0= 'xpath' ) | (enumLiteral_1= 'id' ) | (enumLiteral_2= 'cssSelector' ) | (enumLiteral_3= 'className' ) | (enumLiteral_4= 'linkText' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt6=1;
                }
                break;
            case 30:
                {
                alt6=2;
                }
                break;
            case 31:
                {
                alt6=3;
                }
                break;
            case 32:
                {
                alt6=4;
                }
                break;
            case 33:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAtad.g:876:3: (enumLiteral_0= 'xpath' )
                    {
                    // InternalAtad.g:876:3: (enumLiteral_0= 'xpath' )
                    // InternalAtad.g:877:4: enumLiteral_0= 'xpath'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTipoLocalizadoresAccess().getXPATHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoLocalizadoresAccess().getXPATHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAtad.g:884:3: (enumLiteral_1= 'id' )
                    {
                    // InternalAtad.g:884:3: (enumLiteral_1= 'id' )
                    // InternalAtad.g:885:4: enumLiteral_1= 'id'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTipoLocalizadoresAccess().getIDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoLocalizadoresAccess().getIDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAtad.g:892:3: (enumLiteral_2= 'cssSelector' )
                    {
                    // InternalAtad.g:892:3: (enumLiteral_2= 'cssSelector' )
                    // InternalAtad.g:893:4: enumLiteral_2= 'cssSelector'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTipoLocalizadoresAccess().getCSSSELECTOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoLocalizadoresAccess().getCSSSELECTOREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAtad.g:900:3: (enumLiteral_3= 'className' )
                    {
                    // InternalAtad.g:900:3: (enumLiteral_3= 'className' )
                    // InternalAtad.g:901:4: enumLiteral_3= 'className'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTipoLocalizadoresAccess().getCLASSNAMEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTipoLocalizadoresAccess().getCLASSNAMEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAtad.g:908:3: (enumLiteral_4= 'linkText' )
                    {
                    // InternalAtad.g:908:3: (enumLiteral_4= 'linkText' )
                    // InternalAtad.g:909:4: enumLiteral_4= 'linkText'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTipoLocalizadoresAccess().getLINKTEXTEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTipoLocalizadoresAccess().getLINKTEXTEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "ruleTipoLocalizadores"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\20\1\35\5\4\1\21\3\uffff";
    static final String dfa_3s = "\1\20\1\41\5\4\1\23\3\uffff";
    static final String dfa_4s = "\10\uffff\1\3\1\2\1\1";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\1\3\1\4\1\5\1\6",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\12\1\11\1\10",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "410:2: (this_EsperaPresente_0= ruleEsperaPresente | this_EsperaVisivel_1= ruleEsperaVisivel | this_EsperaClicavel_2= ruleEsperaClicavel )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000018116802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000003E0000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000006800L});

}