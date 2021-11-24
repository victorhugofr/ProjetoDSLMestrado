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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'clicar'", "'em'", "'navegar'", "'escrever'", "'Verifique'", "'que'", "'E'", "'Quando'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalAtad.g:71:1: ruleDeclaraComando returns [EObject current=null] : ( ( (lv_comandos_0_0= ruleQuando ) )* ( (lv_acoes_1_0= ruleAdicaoComando ) )* ( (lv_verificacao_2_0= ruleComandosValidadores ) )* ) ;
    public final EObject ruleDeclaraComando() throws RecognitionException {
        EObject current = null;

        EObject lv_comandos_0_0 = null;

        EObject lv_acoes_1_0 = null;

        EObject lv_verificacao_2_0 = null;



        	enterRule();

        try {
            // InternalAtad.g:77:2: ( ( ( (lv_comandos_0_0= ruleQuando ) )* ( (lv_acoes_1_0= ruleAdicaoComando ) )* ( (lv_verificacao_2_0= ruleComandosValidadores ) )* ) )
            // InternalAtad.g:78:2: ( ( (lv_comandos_0_0= ruleQuando ) )* ( (lv_acoes_1_0= ruleAdicaoComando ) )* ( (lv_verificacao_2_0= ruleComandosValidadores ) )* )
            {
            // InternalAtad.g:78:2: ( ( (lv_comandos_0_0= ruleQuando ) )* ( (lv_acoes_1_0= ruleAdicaoComando ) )* ( (lv_verificacao_2_0= ruleComandosValidadores ) )* )
            // InternalAtad.g:79:3: ( (lv_comandos_0_0= ruleQuando ) )* ( (lv_acoes_1_0= ruleAdicaoComando ) )* ( (lv_verificacao_2_0= ruleComandosValidadores ) )*
            {
            // InternalAtad.g:79:3: ( (lv_comandos_0_0= ruleQuando ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAtad.g:80:4: (lv_comandos_0_0= ruleQuando )
            	    {
            	    // InternalAtad.g:80:4: (lv_comandos_0_0= ruleQuando )
            	    // InternalAtad.g:81:5: lv_comandos_0_0= ruleQuando
            	    {

            	    					newCompositeNode(grammarAccess.getDeclaraComandoAccess().getComandosQuandoParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_comandos_0_0=ruleQuando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeclaraComandoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comandos",
            	    						lv_comandos_0_0,
            	    						"com.ufrn.atad.Atad.Quando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalAtad.g:98:3: ( (lv_acoes_1_0= ruleAdicaoComando ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAtad.g:99:4: (lv_acoes_1_0= ruleAdicaoComando )
            	    {
            	    // InternalAtad.g:99:4: (lv_acoes_1_0= ruleAdicaoComando )
            	    // InternalAtad.g:100:5: lv_acoes_1_0= ruleAdicaoComando
            	    {

            	    					newCompositeNode(grammarAccess.getDeclaraComandoAccess().getAcoesAdicaoComandoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_acoes_1_0=ruleAdicaoComando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeclaraComandoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"acoes",
            	    						lv_acoes_1_0,
            	    						"com.ufrn.atad.Atad.AdicaoComando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalAtad.g:117:3: ( (lv_verificacao_2_0= ruleComandosValidadores ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAtad.g:118:4: (lv_verificacao_2_0= ruleComandosValidadores )
            	    {
            	    // InternalAtad.g:118:4: (lv_verificacao_2_0= ruleComandosValidadores )
            	    // InternalAtad.g:119:5: lv_verificacao_2_0= ruleComandosValidadores
            	    {

            	    					newCompositeNode(grammarAccess.getDeclaraComandoAccess().getVerificacaoComandosValidadoresParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_verificacao_2_0=ruleComandosValidadores();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeclaraComandoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"verificacao",
            	    						lv_verificacao_2_0,
            	    						"com.ufrn.atad.Atad.ComandosValidadores");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleDeclaraComando"


    // $ANTLR start "entryRuleClicar"
    // InternalAtad.g:140:1: entryRuleClicar returns [EObject current=null] : iv_ruleClicar= ruleClicar EOF ;
    public final EObject entryRuleClicar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClicar = null;


        try {
            // InternalAtad.g:140:47: (iv_ruleClicar= ruleClicar EOF )
            // InternalAtad.g:141:2: iv_ruleClicar= ruleClicar EOF
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
    // InternalAtad.g:147:1: ruleClicar returns [EObject current=null] : (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleClicar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalAtad.g:153:2: ( (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalAtad.g:154:2: (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalAtad.g:154:2: (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAtad.g:155:3: otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getClicarAccess().getClicarKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getClicarAccess().getEmKeyword_1());
            		
            // InternalAtad.g:163:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAtad.g:164:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalAtad.g:164:4: (lv_name_2_0= RULE_STRING )
            // InternalAtad.g:165:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClicarAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClicarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // InternalAtad.g:185:1: entryRuleNavegar returns [EObject current=null] : iv_ruleNavegar= ruleNavegar EOF ;
    public final EObject entryRuleNavegar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavegar = null;


        try {
            // InternalAtad.g:185:48: (iv_ruleNavegar= ruleNavegar EOF )
            // InternalAtad.g:186:2: iv_ruleNavegar= ruleNavegar EOF
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
    // InternalAtad.g:192:1: ruleNavegar returns [EObject current=null] : (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNavegar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAtad.g:198:2: ( (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalAtad.g:199:2: (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalAtad.g:199:2: (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalAtad.g:200:3: otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getNavegarAccess().getNavegarKeyword_0());
            		
            // InternalAtad.g:204:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAtad.g:205:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAtad.g:205:4: (lv_name_1_0= RULE_STRING )
            // InternalAtad.g:206:5: lv_name_1_0= RULE_STRING
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
    // InternalAtad.g:226:1: entryRuleEscrever returns [EObject current=null] : iv_ruleEscrever= ruleEscrever EOF ;
    public final EObject entryRuleEscrever() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscrever = null;


        try {
            // InternalAtad.g:226:49: (iv_ruleEscrever= ruleEscrever EOF )
            // InternalAtad.g:227:2: iv_ruleEscrever= ruleEscrever EOF
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
    // InternalAtad.g:233:1: ruleEscrever returns [EObject current=null] : (otherlv_0= 'escrever' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEscrever() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAtad.g:239:2: ( (otherlv_0= 'escrever' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalAtad.g:240:2: (otherlv_0= 'escrever' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalAtad.g:240:2: (otherlv_0= 'escrever' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalAtad.g:241:3: otherlv_0= 'escrever' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEscreverAccess().getEscreverKeyword_0());
            		
            // InternalAtad.g:245:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAtad.g:246:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAtad.g:246:4: (lv_name_1_0= RULE_STRING )
            // InternalAtad.g:247:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEscreverAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEscreverRule());
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
    // $ANTLR end "ruleEscrever"


    // $ANTLR start "entryRuleComandosAcao"
    // InternalAtad.g:267:1: entryRuleComandosAcao returns [EObject current=null] : iv_ruleComandosAcao= ruleComandosAcao EOF ;
    public final EObject entryRuleComandosAcao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandosAcao = null;


        try {
            // InternalAtad.g:267:53: (iv_ruleComandosAcao= ruleComandosAcao EOF )
            // InternalAtad.g:268:2: iv_ruleComandosAcao= ruleComandosAcao EOF
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
    // InternalAtad.g:274:1: ruleComandosAcao returns [EObject current=null] : (this_Clicar_0= ruleClicar | this_Navegar_1= ruleNavegar | this_Escrever_2= ruleEscrever ) ;
    public final EObject ruleComandosAcao() throws RecognitionException {
        EObject current = null;

        EObject this_Clicar_0 = null;

        EObject this_Navegar_1 = null;

        EObject this_Escrever_2 = null;



        	enterRule();

        try {
            // InternalAtad.g:280:2: ( (this_Clicar_0= ruleClicar | this_Navegar_1= ruleNavegar | this_Escrever_2= ruleEscrever ) )
            // InternalAtad.g:281:2: (this_Clicar_0= ruleClicar | this_Navegar_1= ruleNavegar | this_Escrever_2= ruleEscrever )
            {
            // InternalAtad.g:281:2: (this_Clicar_0= ruleClicar | this_Navegar_1= ruleNavegar | this_Escrever_2= ruleEscrever )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAtad.g:282:3: this_Clicar_0= ruleClicar
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
                    // InternalAtad.g:291:3: this_Navegar_1= ruleNavegar
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
                    // InternalAtad.g:300:3: this_Escrever_2= ruleEscrever
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


    // $ANTLR start "entryRuleVerifique"
    // InternalAtad.g:312:1: entryRuleVerifique returns [EObject current=null] : iv_ruleVerifique= ruleVerifique EOF ;
    public final EObject entryRuleVerifique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifique = null;


        try {
            // InternalAtad.g:312:50: (iv_ruleVerifique= ruleVerifique EOF )
            // InternalAtad.g:313:2: iv_ruleVerifique= ruleVerifique EOF
            {
             newCompositeNode(grammarAccess.getVerifiqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerifique=ruleVerifique();

            state._fsp--;

             current =iv_ruleVerifique; 
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
    // $ANTLR end "entryRuleVerifique"


    // $ANTLR start "ruleVerifique"
    // InternalAtad.g:319:1: ruleVerifique returns [EObject current=null] : (otherlv_0= 'Verifique' otherlv_1= 'que' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleVerifique() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalAtad.g:325:2: ( (otherlv_0= 'Verifique' otherlv_1= 'que' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalAtad.g:326:2: (otherlv_0= 'Verifique' otherlv_1= 'que' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalAtad.g:326:2: (otherlv_0= 'Verifique' otherlv_1= 'que' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAtad.g:327:3: otherlv_0= 'Verifique' otherlv_1= 'que' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifiqueAccess().getVerifiqueKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifiqueAccess().getQueKeyword_1());
            		
            // InternalAtad.g:335:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAtad.g:336:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalAtad.g:336:4: (lv_name_2_0= RULE_STRING )
            // InternalAtad.g:337:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVerifiqueAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVerifiqueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "ruleVerifique"


    // $ANTLR start "entryRuleComandosValidadores"
    // InternalAtad.g:357:1: entryRuleComandosValidadores returns [EObject current=null] : iv_ruleComandosValidadores= ruleComandosValidadores EOF ;
    public final EObject entryRuleComandosValidadores() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandosValidadores = null;


        try {
            // InternalAtad.g:357:60: (iv_ruleComandosValidadores= ruleComandosValidadores EOF )
            // InternalAtad.g:358:2: iv_ruleComandosValidadores= ruleComandosValidadores EOF
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
    // InternalAtad.g:364:1: ruleComandosValidadores returns [EObject current=null] : this_Verifique_0= ruleVerifique ;
    public final EObject ruleComandosValidadores() throws RecognitionException {
        EObject current = null;

        EObject this_Verifique_0 = null;



        	enterRule();

        try {
            // InternalAtad.g:370:2: (this_Verifique_0= ruleVerifique )
            // InternalAtad.g:371:2: this_Verifique_0= ruleVerifique
            {

            		newCompositeNode(grammarAccess.getComandosValidadoresAccess().getVerifiqueParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Verifique_0=ruleVerifique();

            state._fsp--;


            		current = this_Verifique_0;
            		afterParserOrEnumRuleCall();
            	

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
    // InternalAtad.g:382:1: entryRuleAdicaoComando returns [EObject current=null] : iv_ruleAdicaoComando= ruleAdicaoComando EOF ;
    public final EObject entryRuleAdicaoComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdicaoComando = null;


        try {
            // InternalAtad.g:382:54: (iv_ruleAdicaoComando= ruleAdicaoComando EOF )
            // InternalAtad.g:383:2: iv_ruleAdicaoComando= ruleAdicaoComando EOF
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
    // InternalAtad.g:389:1: ruleAdicaoComando returns [EObject current=null] : (otherlv_0= 'E' this_ComandosAcao_1= ruleComandosAcao ) ;
    public final EObject ruleAdicaoComando() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ComandosAcao_1 = null;



        	enterRule();

        try {
            // InternalAtad.g:395:2: ( (otherlv_0= 'E' this_ComandosAcao_1= ruleComandosAcao ) )
            // InternalAtad.g:396:2: (otherlv_0= 'E' this_ComandosAcao_1= ruleComandosAcao )
            {
            // InternalAtad.g:396:2: (otherlv_0= 'E' this_ComandosAcao_1= ruleComandosAcao )
            // InternalAtad.g:397:3: otherlv_0= 'E' this_ComandosAcao_1= ruleComandosAcao
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAdicaoComandoAccess().getEKeyword_0());
            		

            			newCompositeNode(grammarAccess.getAdicaoComandoAccess().getComandosAcaoParserRuleCall_1());
            		
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
    // $ANTLR end "ruleAdicaoComando"


    // $ANTLR start "entryRuleQuando"
    // InternalAtad.g:413:1: entryRuleQuando returns [EObject current=null] : iv_ruleQuando= ruleQuando EOF ;
    public final EObject entryRuleQuando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuando = null;


        try {
            // InternalAtad.g:413:47: (iv_ruleQuando= ruleQuando EOF )
            // InternalAtad.g:414:2: iv_ruleQuando= ruleQuando EOF
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
    // InternalAtad.g:420:1: ruleQuando returns [EObject current=null] : (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao ) ;
    public final EObject ruleQuando() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ComandosAcao_1 = null;



        	enterRule();

        try {
            // InternalAtad.g:426:2: ( (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao ) )
            // InternalAtad.g:427:2: (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao )
            {
            // InternalAtad.g:427:2: (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao )
            // InternalAtad.g:428:3: otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000068002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006800L});

}