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

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=15)||(LA1_0>=17 && LA1_0<=18)) ) {
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
            case 15:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
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
    // InternalAtad.g:161:1: ruleClicar returns [EObject current=null] : (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleClicar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalAtad.g:167:2: ( (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalAtad.g:168:2: (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalAtad.g:168:2: (otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAtad.g:169:3: otherlv_0= 'clicar' otherlv_1= 'em' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClicarAccess().getClicarKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getClicarAccess().getEmKeyword_1());
            		
            // InternalAtad.g:177:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAtad.g:178:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalAtad.g:178:4: (lv_name_2_0= RULE_STRING )
            // InternalAtad.g:179:5: lv_name_2_0= RULE_STRING
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
    // InternalAtad.g:199:1: entryRuleNavegar returns [EObject current=null] : iv_ruleNavegar= ruleNavegar EOF ;
    public final EObject entryRuleNavegar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavegar = null;


        try {
            // InternalAtad.g:199:48: (iv_ruleNavegar= ruleNavegar EOF )
            // InternalAtad.g:200:2: iv_ruleNavegar= ruleNavegar EOF
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
    // InternalAtad.g:206:1: ruleNavegar returns [EObject current=null] : (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNavegar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAtad.g:212:2: ( (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalAtad.g:213:2: (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalAtad.g:213:2: (otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalAtad.g:214:3: otherlv_0= 'navegar' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNavegarAccess().getNavegarKeyword_0());
            		
            // InternalAtad.g:218:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAtad.g:219:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAtad.g:219:4: (lv_name_1_0= RULE_STRING )
            // InternalAtad.g:220:5: lv_name_1_0= RULE_STRING
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
    // InternalAtad.g:240:1: entryRuleEscrever returns [EObject current=null] : iv_ruleEscrever= ruleEscrever EOF ;
    public final EObject entryRuleEscrever() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscrever = null;


        try {
            // InternalAtad.g:240:49: (iv_ruleEscrever= ruleEscrever EOF )
            // InternalAtad.g:241:2: iv_ruleEscrever= ruleEscrever EOF
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
    // InternalAtad.g:247:1: ruleEscrever returns [EObject current=null] : (otherlv_0= 'escrever' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEscrever() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAtad.g:253:2: ( (otherlv_0= 'escrever' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalAtad.g:254:2: (otherlv_0= 'escrever' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalAtad.g:254:2: (otherlv_0= 'escrever' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalAtad.g:255:3: otherlv_0= 'escrever' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEscreverAccess().getEscreverKeyword_0());
            		
            // InternalAtad.g:259:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAtad.g:260:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAtad.g:260:4: (lv_name_1_0= RULE_STRING )
            // InternalAtad.g:261:5: lv_name_1_0= RULE_STRING
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
    // InternalAtad.g:281:1: entryRuleComandosAcao returns [EObject current=null] : iv_ruleComandosAcao= ruleComandosAcao EOF ;
    public final EObject entryRuleComandosAcao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandosAcao = null;


        try {
            // InternalAtad.g:281:53: (iv_ruleComandosAcao= ruleComandosAcao EOF )
            // InternalAtad.g:282:2: iv_ruleComandosAcao= ruleComandosAcao EOF
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
    // InternalAtad.g:288:1: ruleComandosAcao returns [EObject current=null] : ( ( (lv_comando_0_1= ruleClicar | lv_comando_0_2= ruleNavegar | lv_comando_0_3= ruleEscrever ) ) ) ;
    public final EObject ruleComandosAcao() throws RecognitionException {
        EObject current = null;

        EObject lv_comando_0_1 = null;

        EObject lv_comando_0_2 = null;

        EObject lv_comando_0_3 = null;



        	enterRule();

        try {
            // InternalAtad.g:294:2: ( ( ( (lv_comando_0_1= ruleClicar | lv_comando_0_2= ruleNavegar | lv_comando_0_3= ruleEscrever ) ) ) )
            // InternalAtad.g:295:2: ( ( (lv_comando_0_1= ruleClicar | lv_comando_0_2= ruleNavegar | lv_comando_0_3= ruleEscrever ) ) )
            {
            // InternalAtad.g:295:2: ( ( (lv_comando_0_1= ruleClicar | lv_comando_0_2= ruleNavegar | lv_comando_0_3= ruleEscrever ) ) )
            // InternalAtad.g:296:3: ( (lv_comando_0_1= ruleClicar | lv_comando_0_2= ruleNavegar | lv_comando_0_3= ruleEscrever ) )
            {
            // InternalAtad.g:296:3: ( (lv_comando_0_1= ruleClicar | lv_comando_0_2= ruleNavegar | lv_comando_0_3= ruleEscrever ) )
            // InternalAtad.g:297:4: (lv_comando_0_1= ruleClicar | lv_comando_0_2= ruleNavegar | lv_comando_0_3= ruleEscrever )
            {
            // InternalAtad.g:297:4: (lv_comando_0_1= ruleClicar | lv_comando_0_2= ruleNavegar | lv_comando_0_3= ruleEscrever )
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
                    // InternalAtad.g:298:5: lv_comando_0_1= ruleClicar
                    {

                    					newCompositeNode(grammarAccess.getComandosAcaoAccess().getComandoClicarParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comando_0_1=ruleClicar();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComandosAcaoRule());
                    					}
                    					set(
                    						current,
                    						"comando",
                    						lv_comando_0_1,
                    						"com.ufrn.atad.Atad.Clicar");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalAtad.g:314:5: lv_comando_0_2= ruleNavegar
                    {

                    					newCompositeNode(grammarAccess.getComandosAcaoAccess().getComandoNavegarParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comando_0_2=ruleNavegar();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComandosAcaoRule());
                    					}
                    					set(
                    						current,
                    						"comando",
                    						lv_comando_0_2,
                    						"com.ufrn.atad.Atad.Navegar");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalAtad.g:330:5: lv_comando_0_3= ruleEscrever
                    {

                    					newCompositeNode(grammarAccess.getComandosAcaoAccess().getComandoEscreverParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comando_0_3=ruleEscrever();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComandosAcaoRule());
                    					}
                    					set(
                    						current,
                    						"comando",
                    						lv_comando_0_3,
                    						"com.ufrn.atad.Atad.Escrever");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

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
    // $ANTLR end "ruleComandosAcao"


    // $ANTLR start "entryRuleVerifique"
    // InternalAtad.g:351:1: entryRuleVerifique returns [EObject current=null] : iv_ruleVerifique= ruleVerifique EOF ;
    public final EObject entryRuleVerifique() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifique = null;


        try {
            // InternalAtad.g:351:50: (iv_ruleVerifique= ruleVerifique EOF )
            // InternalAtad.g:352:2: iv_ruleVerifique= ruleVerifique EOF
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
    // InternalAtad.g:358:1: ruleVerifique returns [EObject current=null] : (otherlv_0= 'Verifique' otherlv_1= 'que' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleVerifique() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalAtad.g:364:2: ( (otherlv_0= 'Verifique' otherlv_1= 'que' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalAtad.g:365:2: (otherlv_0= 'Verifique' otherlv_1= 'que' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalAtad.g:365:2: (otherlv_0= 'Verifique' otherlv_1= 'que' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAtad.g:366:3: otherlv_0= 'Verifique' otherlv_1= 'que' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifiqueAccess().getVerifiqueKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifiqueAccess().getQueKeyword_1());
            		
            // InternalAtad.g:374:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAtad.g:375:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalAtad.g:375:4: (lv_name_2_0= RULE_STRING )
            // InternalAtad.g:376:5: lv_name_2_0= RULE_STRING
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
    // InternalAtad.g:396:1: entryRuleComandosValidadores returns [EObject current=null] : iv_ruleComandosValidadores= ruleComandosValidadores EOF ;
    public final EObject entryRuleComandosValidadores() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComandosValidadores = null;


        try {
            // InternalAtad.g:396:60: (iv_ruleComandosValidadores= ruleComandosValidadores EOF )
            // InternalAtad.g:397:2: iv_ruleComandosValidadores= ruleComandosValidadores EOF
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
    // InternalAtad.g:403:1: ruleComandosValidadores returns [EObject current=null] : ( (lv_verifique_0_0= ruleVerifique ) ) ;
    public final EObject ruleComandosValidadores() throws RecognitionException {
        EObject current = null;

        EObject lv_verifique_0_0 = null;



        	enterRule();

        try {
            // InternalAtad.g:409:2: ( ( (lv_verifique_0_0= ruleVerifique ) ) )
            // InternalAtad.g:410:2: ( (lv_verifique_0_0= ruleVerifique ) )
            {
            // InternalAtad.g:410:2: ( (lv_verifique_0_0= ruleVerifique ) )
            // InternalAtad.g:411:3: (lv_verifique_0_0= ruleVerifique )
            {
            // InternalAtad.g:411:3: (lv_verifique_0_0= ruleVerifique )
            // InternalAtad.g:412:4: lv_verifique_0_0= ruleVerifique
            {

            				newCompositeNode(grammarAccess.getComandosValidadoresAccess().getVerifiqueVerifiqueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_verifique_0_0=ruleVerifique();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getComandosValidadoresRule());
            				}
            				set(
            					current,
            					"verifique",
            					lv_verifique_0_0,
            					"com.ufrn.atad.Atad.Verifique");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleComandosValidadores"


    // $ANTLR start "entryRuleAdicaoComando"
    // InternalAtad.g:432:1: entryRuleAdicaoComando returns [EObject current=null] : iv_ruleAdicaoComando= ruleAdicaoComando EOF ;
    public final EObject entryRuleAdicaoComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdicaoComando = null;


        try {
            // InternalAtad.g:432:54: (iv_ruleAdicaoComando= ruleAdicaoComando EOF )
            // InternalAtad.g:433:2: iv_ruleAdicaoComando= ruleAdicaoComando EOF
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
    // InternalAtad.g:439:1: ruleAdicaoComando returns [EObject current=null] : (otherlv_0= 'E' ( (lv_comando_1_0= ruleComandosAcao ) ) ) ;
    public final EObject ruleAdicaoComando() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_comando_1_0 = null;



        	enterRule();

        try {
            // InternalAtad.g:445:2: ( (otherlv_0= 'E' ( (lv_comando_1_0= ruleComandosAcao ) ) ) )
            // InternalAtad.g:446:2: (otherlv_0= 'E' ( (lv_comando_1_0= ruleComandosAcao ) ) )
            {
            // InternalAtad.g:446:2: (otherlv_0= 'E' ( (lv_comando_1_0= ruleComandosAcao ) ) )
            // InternalAtad.g:447:3: otherlv_0= 'E' ( (lv_comando_1_0= ruleComandosAcao ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getAdicaoComandoAccess().getEKeyword_0());
            		
            // InternalAtad.g:451:3: ( (lv_comando_1_0= ruleComandosAcao ) )
            // InternalAtad.g:452:4: (lv_comando_1_0= ruleComandosAcao )
            {
            // InternalAtad.g:452:4: (lv_comando_1_0= ruleComandosAcao )
            // InternalAtad.g:453:5: lv_comando_1_0= ruleComandosAcao
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
    // InternalAtad.g:474:1: entryRuleQuando returns [EObject current=null] : iv_ruleQuando= ruleQuando EOF ;
    public final EObject entryRuleQuando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuando = null;


        try {
            // InternalAtad.g:474:47: (iv_ruleQuando= ruleQuando EOF )
            // InternalAtad.g:475:2: iv_ruleQuando= ruleQuando EOF
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
    // InternalAtad.g:481:1: ruleQuando returns [EObject current=null] : (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao ) ;
    public final EObject ruleQuando() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_ComandosAcao_1 = null;



        	enterRule();

        try {
            // InternalAtad.g:487:2: ( (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao ) )
            // InternalAtad.g:488:2: (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao )
            {
            // InternalAtad.g:488:2: (otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao )
            // InternalAtad.g:489:3: otherlv_0= 'Quando' this_ComandosAcao_1= ruleComandosAcao
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000006E802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006800L});

}