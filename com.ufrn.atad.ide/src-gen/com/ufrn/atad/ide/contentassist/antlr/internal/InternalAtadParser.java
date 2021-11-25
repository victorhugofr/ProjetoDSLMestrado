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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAtadParser extends AbstractInternalContentAssistParser {
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



    // $ANTLR start "entryRuleDeclaraComando"
    // InternalAtad.g:53:1: entryRuleDeclaraComando : ruleDeclaraComando EOF ;
    public final void entryRuleDeclaraComando() throws RecognitionException {
        try {
            // InternalAtad.g:54:1: ( ruleDeclaraComando EOF )
            // InternalAtad.g:55:1: ruleDeclaraComando EOF
            {
             before(grammarAccess.getDeclaraComandoRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaraComando();

            state._fsp--;

             after(grammarAccess.getDeclaraComandoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaraComando"


    // $ANTLR start "ruleDeclaraComando"
    // InternalAtad.g:62:1: ruleDeclaraComando : ( ( rule__DeclaraComando__ComandosAssignment )* ) ;
    public final void ruleDeclaraComando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:66:2: ( ( ( rule__DeclaraComando__ComandosAssignment )* ) )
            // InternalAtad.g:67:2: ( ( rule__DeclaraComando__ComandosAssignment )* )
            {
            // InternalAtad.g:67:2: ( ( rule__DeclaraComando__ComandosAssignment )* )
            // InternalAtad.g:68:3: ( rule__DeclaraComando__ComandosAssignment )*
            {
             before(grammarAccess.getDeclaraComandoAccess().getComandosAssignment()); 
            // InternalAtad.g:69:3: ( rule__DeclaraComando__ComandosAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=14)||LA1_0==16||(LA1_0>=23 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAtad.g:69:4: rule__DeclaraComando__ComandosAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DeclaraComando__ComandosAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDeclaraComandoAccess().getComandosAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaraComando"


    // $ANTLR start "entryRuleComando"
    // InternalAtad.g:78:1: entryRuleComando : ruleComando EOF ;
    public final void entryRuleComando() throws RecognitionException {
        try {
            // InternalAtad.g:79:1: ( ruleComando EOF )
            // InternalAtad.g:80:1: ruleComando EOF
            {
             before(grammarAccess.getComandoRule()); 
            pushFollow(FOLLOW_1);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getComandoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComando"


    // $ANTLR start "ruleComando"
    // InternalAtad.g:87:1: ruleComando : ( ( rule__Comando__Alternatives ) ) ;
    public final void ruleComando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:91:2: ( ( ( rule__Comando__Alternatives ) ) )
            // InternalAtad.g:92:2: ( ( rule__Comando__Alternatives ) )
            {
            // InternalAtad.g:92:2: ( ( rule__Comando__Alternatives ) )
            // InternalAtad.g:93:3: ( rule__Comando__Alternatives )
            {
             before(grammarAccess.getComandoAccess().getAlternatives()); 
            // InternalAtad.g:94:3: ( rule__Comando__Alternatives )
            // InternalAtad.g:94:4: rule__Comando__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comando__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComandoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComando"


    // $ANTLR start "entryRuleClicar"
    // InternalAtad.g:103:1: entryRuleClicar : ruleClicar EOF ;
    public final void entryRuleClicar() throws RecognitionException {
        try {
            // InternalAtad.g:104:1: ( ruleClicar EOF )
            // InternalAtad.g:105:1: ruleClicar EOF
            {
             before(grammarAccess.getClicarRule()); 
            pushFollow(FOLLOW_1);
            ruleClicar();

            state._fsp--;

             after(grammarAccess.getClicarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClicar"


    // $ANTLR start "ruleClicar"
    // InternalAtad.g:112:1: ruleClicar : ( ( rule__Clicar__Group__0 ) ) ;
    public final void ruleClicar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:116:2: ( ( ( rule__Clicar__Group__0 ) ) )
            // InternalAtad.g:117:2: ( ( rule__Clicar__Group__0 ) )
            {
            // InternalAtad.g:117:2: ( ( rule__Clicar__Group__0 ) )
            // InternalAtad.g:118:3: ( rule__Clicar__Group__0 )
            {
             before(grammarAccess.getClicarAccess().getGroup()); 
            // InternalAtad.g:119:3: ( rule__Clicar__Group__0 )
            // InternalAtad.g:119:4: rule__Clicar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clicar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClicarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClicar"


    // $ANTLR start "entryRuleNavegar"
    // InternalAtad.g:128:1: entryRuleNavegar : ruleNavegar EOF ;
    public final void entryRuleNavegar() throws RecognitionException {
        try {
            // InternalAtad.g:129:1: ( ruleNavegar EOF )
            // InternalAtad.g:130:1: ruleNavegar EOF
            {
             before(grammarAccess.getNavegarRule()); 
            pushFollow(FOLLOW_1);
            ruleNavegar();

            state._fsp--;

             after(grammarAccess.getNavegarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavegar"


    // $ANTLR start "ruleNavegar"
    // InternalAtad.g:137:1: ruleNavegar : ( ( rule__Navegar__Group__0 ) ) ;
    public final void ruleNavegar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:141:2: ( ( ( rule__Navegar__Group__0 ) ) )
            // InternalAtad.g:142:2: ( ( rule__Navegar__Group__0 ) )
            {
            // InternalAtad.g:142:2: ( ( rule__Navegar__Group__0 ) )
            // InternalAtad.g:143:3: ( rule__Navegar__Group__0 )
            {
             before(grammarAccess.getNavegarAccess().getGroup()); 
            // InternalAtad.g:144:3: ( rule__Navegar__Group__0 )
            // InternalAtad.g:144:4: rule__Navegar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Navegar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavegarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavegar"


    // $ANTLR start "entryRuleEscrever"
    // InternalAtad.g:153:1: entryRuleEscrever : ruleEscrever EOF ;
    public final void entryRuleEscrever() throws RecognitionException {
        try {
            // InternalAtad.g:154:1: ( ruleEscrever EOF )
            // InternalAtad.g:155:1: ruleEscrever EOF
            {
             before(grammarAccess.getEscreverRule()); 
            pushFollow(FOLLOW_1);
            ruleEscrever();

            state._fsp--;

             after(grammarAccess.getEscreverRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEscrever"


    // $ANTLR start "ruleEscrever"
    // InternalAtad.g:162:1: ruleEscrever : ( ( rule__Escrever__Group__0 ) ) ;
    public final void ruleEscrever() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:166:2: ( ( ( rule__Escrever__Group__0 ) ) )
            // InternalAtad.g:167:2: ( ( rule__Escrever__Group__0 ) )
            {
            // InternalAtad.g:167:2: ( ( rule__Escrever__Group__0 ) )
            // InternalAtad.g:168:3: ( rule__Escrever__Group__0 )
            {
             before(grammarAccess.getEscreverAccess().getGroup()); 
            // InternalAtad.g:169:3: ( rule__Escrever__Group__0 )
            // InternalAtad.g:169:4: rule__Escrever__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Escrever__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEscreverAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEscrever"


    // $ANTLR start "entryRuleComandosAcao"
    // InternalAtad.g:178:1: entryRuleComandosAcao : ruleComandosAcao EOF ;
    public final void entryRuleComandosAcao() throws RecognitionException {
        try {
            // InternalAtad.g:179:1: ( ruleComandosAcao EOF )
            // InternalAtad.g:180:1: ruleComandosAcao EOF
            {
             before(grammarAccess.getComandosAcaoRule()); 
            pushFollow(FOLLOW_1);
            ruleComandosAcao();

            state._fsp--;

             after(grammarAccess.getComandosAcaoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComandosAcao"


    // $ANTLR start "ruleComandosAcao"
    // InternalAtad.g:187:1: ruleComandosAcao : ( ( rule__ComandosAcao__Alternatives ) ) ;
    public final void ruleComandosAcao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:191:2: ( ( ( rule__ComandosAcao__Alternatives ) ) )
            // InternalAtad.g:192:2: ( ( rule__ComandosAcao__Alternatives ) )
            {
            // InternalAtad.g:192:2: ( ( rule__ComandosAcao__Alternatives ) )
            // InternalAtad.g:193:3: ( rule__ComandosAcao__Alternatives )
            {
             before(grammarAccess.getComandosAcaoAccess().getAlternatives()); 
            // InternalAtad.g:194:3: ( rule__ComandosAcao__Alternatives )
            // InternalAtad.g:194:4: rule__ComandosAcao__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComandosAcao__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComandosAcaoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandosAcao"


    // $ANTLR start "entryRuleVerifiquePresente"
    // InternalAtad.g:203:1: entryRuleVerifiquePresente : ruleVerifiquePresente EOF ;
    public final void entryRuleVerifiquePresente() throws RecognitionException {
        try {
            // InternalAtad.g:204:1: ( ruleVerifiquePresente EOF )
            // InternalAtad.g:205:1: ruleVerifiquePresente EOF
            {
             before(grammarAccess.getVerifiquePresenteRule()); 
            pushFollow(FOLLOW_1);
            ruleVerifiquePresente();

            state._fsp--;

             after(grammarAccess.getVerifiquePresenteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerifiquePresente"


    // $ANTLR start "ruleVerifiquePresente"
    // InternalAtad.g:212:1: ruleVerifiquePresente : ( ( rule__VerifiquePresente__Group__0 ) ) ;
    public final void ruleVerifiquePresente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:216:2: ( ( ( rule__VerifiquePresente__Group__0 ) ) )
            // InternalAtad.g:217:2: ( ( rule__VerifiquePresente__Group__0 ) )
            {
            // InternalAtad.g:217:2: ( ( rule__VerifiquePresente__Group__0 ) )
            // InternalAtad.g:218:3: ( rule__VerifiquePresente__Group__0 )
            {
             before(grammarAccess.getVerifiquePresenteAccess().getGroup()); 
            // InternalAtad.g:219:3: ( rule__VerifiquePresente__Group__0 )
            // InternalAtad.g:219:4: rule__VerifiquePresente__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VerifiquePresente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerifiquePresenteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerifiquePresente"


    // $ANTLR start "entryRuleVerifiqueNaoPresente"
    // InternalAtad.g:228:1: entryRuleVerifiqueNaoPresente : ruleVerifiqueNaoPresente EOF ;
    public final void entryRuleVerifiqueNaoPresente() throws RecognitionException {
        try {
            // InternalAtad.g:229:1: ( ruleVerifiqueNaoPresente EOF )
            // InternalAtad.g:230:1: ruleVerifiqueNaoPresente EOF
            {
             before(grammarAccess.getVerifiqueNaoPresenteRule()); 
            pushFollow(FOLLOW_1);
            ruleVerifiqueNaoPresente();

            state._fsp--;

             after(grammarAccess.getVerifiqueNaoPresenteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerifiqueNaoPresente"


    // $ANTLR start "ruleVerifiqueNaoPresente"
    // InternalAtad.g:237:1: ruleVerifiqueNaoPresente : ( ( rule__VerifiqueNaoPresente__Group__0 ) ) ;
    public final void ruleVerifiqueNaoPresente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:241:2: ( ( ( rule__VerifiqueNaoPresente__Group__0 ) ) )
            // InternalAtad.g:242:2: ( ( rule__VerifiqueNaoPresente__Group__0 ) )
            {
            // InternalAtad.g:242:2: ( ( rule__VerifiqueNaoPresente__Group__0 ) )
            // InternalAtad.g:243:3: ( rule__VerifiqueNaoPresente__Group__0 )
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getGroup()); 
            // InternalAtad.g:244:3: ( rule__VerifiqueNaoPresente__Group__0 )
            // InternalAtad.g:244:4: rule__VerifiqueNaoPresente__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VerifiqueNaoPresente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerifiqueNaoPresenteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerifiqueNaoPresente"


    // $ANTLR start "entryRuleComandosValidadores"
    // InternalAtad.g:253:1: entryRuleComandosValidadores : ruleComandosValidadores EOF ;
    public final void entryRuleComandosValidadores() throws RecognitionException {
        try {
            // InternalAtad.g:254:1: ( ruleComandosValidadores EOF )
            // InternalAtad.g:255:1: ruleComandosValidadores EOF
            {
             before(grammarAccess.getComandosValidadoresRule()); 
            pushFollow(FOLLOW_1);
            ruleComandosValidadores();

            state._fsp--;

             after(grammarAccess.getComandosValidadoresRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComandosValidadores"


    // $ANTLR start "ruleComandosValidadores"
    // InternalAtad.g:262:1: ruleComandosValidadores : ( ( rule__ComandosValidadores__Alternatives ) ) ;
    public final void ruleComandosValidadores() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:266:2: ( ( ( rule__ComandosValidadores__Alternatives ) ) )
            // InternalAtad.g:267:2: ( ( rule__ComandosValidadores__Alternatives ) )
            {
            // InternalAtad.g:267:2: ( ( rule__ComandosValidadores__Alternatives ) )
            // InternalAtad.g:268:3: ( rule__ComandosValidadores__Alternatives )
            {
             before(grammarAccess.getComandosValidadoresAccess().getAlternatives()); 
            // InternalAtad.g:269:3: ( rule__ComandosValidadores__Alternatives )
            // InternalAtad.g:269:4: rule__ComandosValidadores__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComandosValidadores__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComandosValidadoresAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComandosValidadores"


    // $ANTLR start "entryRuleAdicaoComando"
    // InternalAtad.g:278:1: entryRuleAdicaoComando : ruleAdicaoComando EOF ;
    public final void entryRuleAdicaoComando() throws RecognitionException {
        try {
            // InternalAtad.g:279:1: ( ruleAdicaoComando EOF )
            // InternalAtad.g:280:1: ruleAdicaoComando EOF
            {
             before(grammarAccess.getAdicaoComandoRule()); 
            pushFollow(FOLLOW_1);
            ruleAdicaoComando();

            state._fsp--;

             after(grammarAccess.getAdicaoComandoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdicaoComando"


    // $ANTLR start "ruleAdicaoComando"
    // InternalAtad.g:287:1: ruleAdicaoComando : ( ( rule__AdicaoComando__Group__0 ) ) ;
    public final void ruleAdicaoComando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:291:2: ( ( ( rule__AdicaoComando__Group__0 ) ) )
            // InternalAtad.g:292:2: ( ( rule__AdicaoComando__Group__0 ) )
            {
            // InternalAtad.g:292:2: ( ( rule__AdicaoComando__Group__0 ) )
            // InternalAtad.g:293:3: ( rule__AdicaoComando__Group__0 )
            {
             before(grammarAccess.getAdicaoComandoAccess().getGroup()); 
            // InternalAtad.g:294:3: ( rule__AdicaoComando__Group__0 )
            // InternalAtad.g:294:4: rule__AdicaoComando__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdicaoComando__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdicaoComandoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdicaoComando"


    // $ANTLR start "entryRuleQuando"
    // InternalAtad.g:303:1: entryRuleQuando : ruleQuando EOF ;
    public final void entryRuleQuando() throws RecognitionException {
        try {
            // InternalAtad.g:304:1: ( ruleQuando EOF )
            // InternalAtad.g:305:1: ruleQuando EOF
            {
             before(grammarAccess.getQuandoRule()); 
            pushFollow(FOLLOW_1);
            ruleQuando();

            state._fsp--;

             after(grammarAccess.getQuandoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuando"


    // $ANTLR start "ruleQuando"
    // InternalAtad.g:312:1: ruleQuando : ( ( rule__Quando__Group__0 ) ) ;
    public final void ruleQuando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:316:2: ( ( ( rule__Quando__Group__0 ) ) )
            // InternalAtad.g:317:2: ( ( rule__Quando__Group__0 ) )
            {
            // InternalAtad.g:317:2: ( ( rule__Quando__Group__0 ) )
            // InternalAtad.g:318:3: ( rule__Quando__Group__0 )
            {
             before(grammarAccess.getQuandoAccess().getGroup()); 
            // InternalAtad.g:319:3: ( rule__Quando__Group__0 )
            // InternalAtad.g:319:4: rule__Quando__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Quando__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuandoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuando"


    // $ANTLR start "rule__Comando__Alternatives"
    // InternalAtad.g:327:1: rule__Comando__Alternatives : ( ( ruleComandosAcao ) | ( ruleComandosValidadores ) | ( ruleAdicaoComando ) | ( ruleQuando ) );
    public final void rule__Comando__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:331:1: ( ( ruleComandosAcao ) | ( ruleComandosValidadores ) | ( ruleAdicaoComando ) | ( ruleQuando ) )
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
                    // InternalAtad.g:332:2: ( ruleComandosAcao )
                    {
                    // InternalAtad.g:332:2: ( ruleComandosAcao )
                    // InternalAtad.g:333:3: ruleComandosAcao
                    {
                     before(grammarAccess.getComandoAccess().getComandosAcaoParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComandosAcao();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandosAcaoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAtad.g:338:2: ( ruleComandosValidadores )
                    {
                    // InternalAtad.g:338:2: ( ruleComandosValidadores )
                    // InternalAtad.g:339:3: ruleComandosValidadores
                    {
                     before(grammarAccess.getComandoAccess().getComandosValidadoresParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComandosValidadores();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getComandosValidadoresParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAtad.g:344:2: ( ruleAdicaoComando )
                    {
                    // InternalAtad.g:344:2: ( ruleAdicaoComando )
                    // InternalAtad.g:345:3: ruleAdicaoComando
                    {
                     before(grammarAccess.getComandoAccess().getAdicaoComandoParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAdicaoComando();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getAdicaoComandoParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAtad.g:350:2: ( ruleQuando )
                    {
                    // InternalAtad.g:350:2: ( ruleQuando )
                    // InternalAtad.g:351:3: ruleQuando
                    {
                     before(grammarAccess.getComandoAccess().getQuandoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleQuando();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getQuandoParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comando__Alternatives"


    // $ANTLR start "rule__ComandosAcao__Alternatives"
    // InternalAtad.g:360:1: rule__ComandosAcao__Alternatives : ( ( ruleClicar ) | ( ruleNavegar ) | ( ruleEscrever ) );
    public final void rule__ComandosAcao__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:364:1: ( ( ruleClicar ) | ( ruleNavegar ) | ( ruleEscrever ) )
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
                    // InternalAtad.g:365:2: ( ruleClicar )
                    {
                    // InternalAtad.g:365:2: ( ruleClicar )
                    // InternalAtad.g:366:3: ruleClicar
                    {
                     before(grammarAccess.getComandosAcaoAccess().getClicarParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClicar();

                    state._fsp--;

                     after(grammarAccess.getComandosAcaoAccess().getClicarParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAtad.g:371:2: ( ruleNavegar )
                    {
                    // InternalAtad.g:371:2: ( ruleNavegar )
                    // InternalAtad.g:372:3: ruleNavegar
                    {
                     before(grammarAccess.getComandosAcaoAccess().getNavegarParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNavegar();

                    state._fsp--;

                     after(grammarAccess.getComandosAcaoAccess().getNavegarParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAtad.g:377:2: ( ruleEscrever )
                    {
                    // InternalAtad.g:377:2: ( ruleEscrever )
                    // InternalAtad.g:378:3: ruleEscrever
                    {
                     before(grammarAccess.getComandosAcaoAccess().getEscreverParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEscrever();

                    state._fsp--;

                     after(grammarAccess.getComandosAcaoAccess().getEscreverParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandosAcao__Alternatives"


    // $ANTLR start "rule__ComandosValidadores__Alternatives"
    // InternalAtad.g:387:1: rule__ComandosValidadores__Alternatives : ( ( ruleVerifiquePresente ) | ( ruleVerifiqueNaoPresente ) );
    public final void rule__ComandosValidadores__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:391:1: ( ( ruleVerifiquePresente ) | ( ruleVerifiqueNaoPresente ) )
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

                                if ( (LA4_5==22) ) {
                                    alt4=2;
                                }
                                else if ( (LA4_5==20) ) {
                                    alt4=1;
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
                    // InternalAtad.g:392:2: ( ruleVerifiquePresente )
                    {
                    // InternalAtad.g:392:2: ( ruleVerifiquePresente )
                    // InternalAtad.g:393:3: ruleVerifiquePresente
                    {
                     before(grammarAccess.getComandosValidadoresAccess().getVerifiquePresenteParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVerifiquePresente();

                    state._fsp--;

                     after(grammarAccess.getComandosValidadoresAccess().getVerifiquePresenteParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAtad.g:398:2: ( ruleVerifiqueNaoPresente )
                    {
                    // InternalAtad.g:398:2: ( ruleVerifiqueNaoPresente )
                    // InternalAtad.g:399:3: ruleVerifiqueNaoPresente
                    {
                     before(grammarAccess.getComandosValidadoresAccess().getVerifiqueNaoPresenteParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVerifiqueNaoPresente();

                    state._fsp--;

                     after(grammarAccess.getComandosValidadoresAccess().getVerifiqueNaoPresenteParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComandosValidadores__Alternatives"


    // $ANTLR start "rule__Clicar__Group__0"
    // InternalAtad.g:408:1: rule__Clicar__Group__0 : rule__Clicar__Group__0__Impl rule__Clicar__Group__1 ;
    public final void rule__Clicar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:412:1: ( rule__Clicar__Group__0__Impl rule__Clicar__Group__1 )
            // InternalAtad.g:413:2: rule__Clicar__Group__0__Impl rule__Clicar__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Clicar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clicar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clicar__Group__0"


    // $ANTLR start "rule__Clicar__Group__0__Impl"
    // InternalAtad.g:420:1: rule__Clicar__Group__0__Impl : ( 'clicar' ) ;
    public final void rule__Clicar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:424:1: ( ( 'clicar' ) )
            // InternalAtad.g:425:1: ( 'clicar' )
            {
            // InternalAtad.g:425:1: ( 'clicar' )
            // InternalAtad.g:426:2: 'clicar'
            {
             before(grammarAccess.getClicarAccess().getClicarKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getClicarAccess().getClicarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clicar__Group__0__Impl"


    // $ANTLR start "rule__Clicar__Group__1"
    // InternalAtad.g:435:1: rule__Clicar__Group__1 : rule__Clicar__Group__1__Impl rule__Clicar__Group__2 ;
    public final void rule__Clicar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:439:1: ( rule__Clicar__Group__1__Impl rule__Clicar__Group__2 )
            // InternalAtad.g:440:2: rule__Clicar__Group__1__Impl rule__Clicar__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Clicar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clicar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clicar__Group__1"


    // $ANTLR start "rule__Clicar__Group__1__Impl"
    // InternalAtad.g:447:1: rule__Clicar__Group__1__Impl : ( 'em' ) ;
    public final void rule__Clicar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:451:1: ( ( 'em' ) )
            // InternalAtad.g:452:1: ( 'em' )
            {
            // InternalAtad.g:452:1: ( 'em' )
            // InternalAtad.g:453:2: 'em'
            {
             before(grammarAccess.getClicarAccess().getEmKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClicarAccess().getEmKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clicar__Group__1__Impl"


    // $ANTLR start "rule__Clicar__Group__2"
    // InternalAtad.g:462:1: rule__Clicar__Group__2 : rule__Clicar__Group__2__Impl rule__Clicar__Group__3 ;
    public final void rule__Clicar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:466:1: ( rule__Clicar__Group__2__Impl rule__Clicar__Group__3 )
            // InternalAtad.g:467:2: rule__Clicar__Group__2__Impl rule__Clicar__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Clicar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clicar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clicar__Group__2"


    // $ANTLR start "rule__Clicar__Group__2__Impl"
    // InternalAtad.g:474:1: rule__Clicar__Group__2__Impl : ( ( rule__Clicar__TipoLocalizadorAssignment_2 ) ) ;
    public final void rule__Clicar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:478:1: ( ( ( rule__Clicar__TipoLocalizadorAssignment_2 ) ) )
            // InternalAtad.g:479:1: ( ( rule__Clicar__TipoLocalizadorAssignment_2 ) )
            {
            // InternalAtad.g:479:1: ( ( rule__Clicar__TipoLocalizadorAssignment_2 ) )
            // InternalAtad.g:480:2: ( rule__Clicar__TipoLocalizadorAssignment_2 )
            {
             before(grammarAccess.getClicarAccess().getTipoLocalizadorAssignment_2()); 
            // InternalAtad.g:481:2: ( rule__Clicar__TipoLocalizadorAssignment_2 )
            // InternalAtad.g:481:3: rule__Clicar__TipoLocalizadorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Clicar__TipoLocalizadorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClicarAccess().getTipoLocalizadorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clicar__Group__2__Impl"


    // $ANTLR start "rule__Clicar__Group__3"
    // InternalAtad.g:489:1: rule__Clicar__Group__3 : rule__Clicar__Group__3__Impl ;
    public final void rule__Clicar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:493:1: ( rule__Clicar__Group__3__Impl )
            // InternalAtad.g:494:2: rule__Clicar__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clicar__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clicar__Group__3"


    // $ANTLR start "rule__Clicar__Group__3__Impl"
    // InternalAtad.g:500:1: rule__Clicar__Group__3__Impl : ( ( rule__Clicar__NameAssignment_3 ) ) ;
    public final void rule__Clicar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:504:1: ( ( ( rule__Clicar__NameAssignment_3 ) ) )
            // InternalAtad.g:505:1: ( ( rule__Clicar__NameAssignment_3 ) )
            {
            // InternalAtad.g:505:1: ( ( rule__Clicar__NameAssignment_3 ) )
            // InternalAtad.g:506:2: ( rule__Clicar__NameAssignment_3 )
            {
             before(grammarAccess.getClicarAccess().getNameAssignment_3()); 
            // InternalAtad.g:507:2: ( rule__Clicar__NameAssignment_3 )
            // InternalAtad.g:507:3: rule__Clicar__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Clicar__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClicarAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clicar__Group__3__Impl"


    // $ANTLR start "rule__Navegar__Group__0"
    // InternalAtad.g:516:1: rule__Navegar__Group__0 : rule__Navegar__Group__0__Impl rule__Navegar__Group__1 ;
    public final void rule__Navegar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:520:1: ( rule__Navegar__Group__0__Impl rule__Navegar__Group__1 )
            // InternalAtad.g:521:2: rule__Navegar__Group__0__Impl rule__Navegar__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Navegar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Navegar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group__0"


    // $ANTLR start "rule__Navegar__Group__0__Impl"
    // InternalAtad.g:528:1: rule__Navegar__Group__0__Impl : ( 'navegar' ) ;
    public final void rule__Navegar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:532:1: ( ( 'navegar' ) )
            // InternalAtad.g:533:1: ( 'navegar' )
            {
            // InternalAtad.g:533:1: ( 'navegar' )
            // InternalAtad.g:534:2: 'navegar'
            {
             before(grammarAccess.getNavegarAccess().getNavegarKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNavegarAccess().getNavegarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group__0__Impl"


    // $ANTLR start "rule__Navegar__Group__1"
    // InternalAtad.g:543:1: rule__Navegar__Group__1 : rule__Navegar__Group__1__Impl ;
    public final void rule__Navegar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:547:1: ( rule__Navegar__Group__1__Impl )
            // InternalAtad.g:548:2: rule__Navegar__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Navegar__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group__1"


    // $ANTLR start "rule__Navegar__Group__1__Impl"
    // InternalAtad.g:554:1: rule__Navegar__Group__1__Impl : ( ( rule__Navegar__NameAssignment_1 ) ) ;
    public final void rule__Navegar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:558:1: ( ( ( rule__Navegar__NameAssignment_1 ) ) )
            // InternalAtad.g:559:1: ( ( rule__Navegar__NameAssignment_1 ) )
            {
            // InternalAtad.g:559:1: ( ( rule__Navegar__NameAssignment_1 ) )
            // InternalAtad.g:560:2: ( rule__Navegar__NameAssignment_1 )
            {
             before(grammarAccess.getNavegarAccess().getNameAssignment_1()); 
            // InternalAtad.g:561:2: ( rule__Navegar__NameAssignment_1 )
            // InternalAtad.g:561:3: rule__Navegar__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Navegar__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNavegarAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__Group__1__Impl"


    // $ANTLR start "rule__Escrever__Group__0"
    // InternalAtad.g:570:1: rule__Escrever__Group__0 : rule__Escrever__Group__0__Impl rule__Escrever__Group__1 ;
    public final void rule__Escrever__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:574:1: ( rule__Escrever__Group__0__Impl rule__Escrever__Group__1 )
            // InternalAtad.g:575:2: rule__Escrever__Group__0__Impl rule__Escrever__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Escrever__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escrever__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escrever__Group__0"


    // $ANTLR start "rule__Escrever__Group__0__Impl"
    // InternalAtad.g:582:1: rule__Escrever__Group__0__Impl : ( 'escrever' ) ;
    public final void rule__Escrever__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:586:1: ( ( 'escrever' ) )
            // InternalAtad.g:587:1: ( 'escrever' )
            {
            // InternalAtad.g:587:1: ( 'escrever' )
            // InternalAtad.g:588:2: 'escrever'
            {
             before(grammarAccess.getEscreverAccess().getEscreverKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEscreverAccess().getEscreverKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escrever__Group__0__Impl"


    // $ANTLR start "rule__Escrever__Group__1"
    // InternalAtad.g:597:1: rule__Escrever__Group__1 : rule__Escrever__Group__1__Impl rule__Escrever__Group__2 ;
    public final void rule__Escrever__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:601:1: ( rule__Escrever__Group__1__Impl rule__Escrever__Group__2 )
            // InternalAtad.g:602:2: rule__Escrever__Group__1__Impl rule__Escrever__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Escrever__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escrever__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escrever__Group__1"


    // $ANTLR start "rule__Escrever__Group__1__Impl"
    // InternalAtad.g:609:1: rule__Escrever__Group__1__Impl : ( 'no' ) ;
    public final void rule__Escrever__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:613:1: ( ( 'no' ) )
            // InternalAtad.g:614:1: ( 'no' )
            {
            // InternalAtad.g:614:1: ( 'no' )
            // InternalAtad.g:615:2: 'no'
            {
             before(grammarAccess.getEscreverAccess().getNoKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEscreverAccess().getNoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escrever__Group__1__Impl"


    // $ANTLR start "rule__Escrever__Group__2"
    // InternalAtad.g:624:1: rule__Escrever__Group__2 : rule__Escrever__Group__2__Impl rule__Escrever__Group__3 ;
    public final void rule__Escrever__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:628:1: ( rule__Escrever__Group__2__Impl rule__Escrever__Group__3 )
            // InternalAtad.g:629:2: rule__Escrever__Group__2__Impl rule__Escrever__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Escrever__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escrever__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escrever__Group__2"


    // $ANTLR start "rule__Escrever__Group__2__Impl"
    // InternalAtad.g:636:1: rule__Escrever__Group__2__Impl : ( ( rule__Escrever__TipoLocalizadorAssignment_2 ) ) ;
    public final void rule__Escrever__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:640:1: ( ( ( rule__Escrever__TipoLocalizadorAssignment_2 ) ) )
            // InternalAtad.g:641:1: ( ( rule__Escrever__TipoLocalizadorAssignment_2 ) )
            {
            // InternalAtad.g:641:1: ( ( rule__Escrever__TipoLocalizadorAssignment_2 ) )
            // InternalAtad.g:642:2: ( rule__Escrever__TipoLocalizadorAssignment_2 )
            {
             before(grammarAccess.getEscreverAccess().getTipoLocalizadorAssignment_2()); 
            // InternalAtad.g:643:2: ( rule__Escrever__TipoLocalizadorAssignment_2 )
            // InternalAtad.g:643:3: rule__Escrever__TipoLocalizadorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Escrever__TipoLocalizadorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEscreverAccess().getTipoLocalizadorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escrever__Group__2__Impl"


    // $ANTLR start "rule__Escrever__Group__3"
    // InternalAtad.g:651:1: rule__Escrever__Group__3 : rule__Escrever__Group__3__Impl rule__Escrever__Group__4 ;
    public final void rule__Escrever__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:655:1: ( rule__Escrever__Group__3__Impl rule__Escrever__Group__4 )
            // InternalAtad.g:656:2: rule__Escrever__Group__3__Impl rule__Escrever__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Escrever__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escrever__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escrever__Group__3"


    // $ANTLR start "rule__Escrever__Group__3__Impl"
    // InternalAtad.g:663:1: rule__Escrever__Group__3__Impl : ( ( rule__Escrever__NameAssignment_3 ) ) ;
    public final void rule__Escrever__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:667:1: ( ( ( rule__Escrever__NameAssignment_3 ) ) )
            // InternalAtad.g:668:1: ( ( rule__Escrever__NameAssignment_3 ) )
            {
            // InternalAtad.g:668:1: ( ( rule__Escrever__NameAssignment_3 ) )
            // InternalAtad.g:669:2: ( rule__Escrever__NameAssignment_3 )
            {
             before(grammarAccess.getEscreverAccess().getNameAssignment_3()); 
            // InternalAtad.g:670:2: ( rule__Escrever__NameAssignment_3 )
            // InternalAtad.g:670:3: rule__Escrever__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Escrever__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEscreverAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escrever__Group__3__Impl"


    // $ANTLR start "rule__Escrever__Group__4"
    // InternalAtad.g:678:1: rule__Escrever__Group__4 : rule__Escrever__Group__4__Impl ;
    public final void rule__Escrever__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:682:1: ( rule__Escrever__Group__4__Impl )
            // InternalAtad.g:683:2: rule__Escrever__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Escrever__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escrever__Group__4"


    // $ANTLR start "rule__Escrever__Group__4__Impl"
    // InternalAtad.g:689:1: rule__Escrever__Group__4__Impl : ( ( rule__Escrever__ConteudoAssignment_4 ) ) ;
    public final void rule__Escrever__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:693:1: ( ( ( rule__Escrever__ConteudoAssignment_4 ) ) )
            // InternalAtad.g:694:1: ( ( rule__Escrever__ConteudoAssignment_4 ) )
            {
            // InternalAtad.g:694:1: ( ( rule__Escrever__ConteudoAssignment_4 ) )
            // InternalAtad.g:695:2: ( rule__Escrever__ConteudoAssignment_4 )
            {
             before(grammarAccess.getEscreverAccess().getConteudoAssignment_4()); 
            // InternalAtad.g:696:2: ( rule__Escrever__ConteudoAssignment_4 )
            // InternalAtad.g:696:3: rule__Escrever__ConteudoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Escrever__ConteudoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEscreverAccess().getConteudoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escrever__Group__4__Impl"


    // $ANTLR start "rule__VerifiquePresente__Group__0"
    // InternalAtad.g:705:1: rule__VerifiquePresente__Group__0 : rule__VerifiquePresente__Group__0__Impl rule__VerifiquePresente__Group__1 ;
    public final void rule__VerifiquePresente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:709:1: ( rule__VerifiquePresente__Group__0__Impl rule__VerifiquePresente__Group__1 )
            // InternalAtad.g:710:2: rule__VerifiquePresente__Group__0__Impl rule__VerifiquePresente__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__VerifiquePresente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifiquePresente__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiquePresente__Group__0"


    // $ANTLR start "rule__VerifiquePresente__Group__0__Impl"
    // InternalAtad.g:717:1: rule__VerifiquePresente__Group__0__Impl : ( 'Verifique' ) ;
    public final void rule__VerifiquePresente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:721:1: ( ( 'Verifique' ) )
            // InternalAtad.g:722:1: ( 'Verifique' )
            {
            // InternalAtad.g:722:1: ( 'Verifique' )
            // InternalAtad.g:723:2: 'Verifique'
            {
             before(grammarAccess.getVerifiquePresenteAccess().getVerifiqueKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVerifiquePresenteAccess().getVerifiqueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiquePresente__Group__0__Impl"


    // $ANTLR start "rule__VerifiquePresente__Group__1"
    // InternalAtad.g:732:1: rule__VerifiquePresente__Group__1 : rule__VerifiquePresente__Group__1__Impl rule__VerifiquePresente__Group__2 ;
    public final void rule__VerifiquePresente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:736:1: ( rule__VerifiquePresente__Group__1__Impl rule__VerifiquePresente__Group__2 )
            // InternalAtad.g:737:2: rule__VerifiquePresente__Group__1__Impl rule__VerifiquePresente__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__VerifiquePresente__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifiquePresente__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiquePresente__Group__1"


    // $ANTLR start "rule__VerifiquePresente__Group__1__Impl"
    // InternalAtad.g:744:1: rule__VerifiquePresente__Group__1__Impl : ( 'que' ) ;
    public final void rule__VerifiquePresente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:748:1: ( ( 'que' ) )
            // InternalAtad.g:749:1: ( 'que' )
            {
            // InternalAtad.g:749:1: ( 'que' )
            // InternalAtad.g:750:2: 'que'
            {
             before(grammarAccess.getVerifiquePresenteAccess().getQueKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVerifiquePresenteAccess().getQueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiquePresente__Group__1__Impl"


    // $ANTLR start "rule__VerifiquePresente__Group__2"
    // InternalAtad.g:759:1: rule__VerifiquePresente__Group__2 : rule__VerifiquePresente__Group__2__Impl rule__VerifiquePresente__Group__3 ;
    public final void rule__VerifiquePresente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:763:1: ( rule__VerifiquePresente__Group__2__Impl rule__VerifiquePresente__Group__3 )
            // InternalAtad.g:764:2: rule__VerifiquePresente__Group__2__Impl rule__VerifiquePresente__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__VerifiquePresente__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifiquePresente__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiquePresente__Group__2"


    // $ANTLR start "rule__VerifiquePresente__Group__2__Impl"
    // InternalAtad.g:771:1: rule__VerifiquePresente__Group__2__Impl : ( 'o' ) ;
    public final void rule__VerifiquePresente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:775:1: ( ( 'o' ) )
            // InternalAtad.g:776:1: ( 'o' )
            {
            // InternalAtad.g:776:1: ( 'o' )
            // InternalAtad.g:777:2: 'o'
            {
             before(grammarAccess.getVerifiquePresenteAccess().getOKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVerifiquePresenteAccess().getOKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiquePresente__Group__2__Impl"


    // $ANTLR start "rule__VerifiquePresente__Group__3"
    // InternalAtad.g:786:1: rule__VerifiquePresente__Group__3 : rule__VerifiquePresente__Group__3__Impl rule__VerifiquePresente__Group__4 ;
    public final void rule__VerifiquePresente__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:790:1: ( rule__VerifiquePresente__Group__3__Impl rule__VerifiquePresente__Group__4 )
            // InternalAtad.g:791:2: rule__VerifiquePresente__Group__3__Impl rule__VerifiquePresente__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__VerifiquePresente__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifiquePresente__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiquePresente__Group__3"


    // $ANTLR start "rule__VerifiquePresente__Group__3__Impl"
    // InternalAtad.g:798:1: rule__VerifiquePresente__Group__3__Impl : ( 'texto' ) ;
    public final void rule__VerifiquePresente__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:802:1: ( ( 'texto' ) )
            // InternalAtad.g:803:1: ( 'texto' )
            {
            // InternalAtad.g:803:1: ( 'texto' )
            // InternalAtad.g:804:2: 'texto'
            {
             before(grammarAccess.getVerifiquePresenteAccess().getTextoKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVerifiquePresenteAccess().getTextoKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiquePresente__Group__3__Impl"


    // $ANTLR start "rule__VerifiquePresente__Group__4"
    // InternalAtad.g:813:1: rule__VerifiquePresente__Group__4 : rule__VerifiquePresente__Group__4__Impl rule__VerifiquePresente__Group__5 ;
    public final void rule__VerifiquePresente__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:817:1: ( rule__VerifiquePresente__Group__4__Impl rule__VerifiquePresente__Group__5 )
            // InternalAtad.g:818:2: rule__VerifiquePresente__Group__4__Impl rule__VerifiquePresente__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__VerifiquePresente__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifiquePresente__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiquePresente__Group__4"


    // $ANTLR start "rule__VerifiquePresente__Group__4__Impl"
    // InternalAtad.g:825:1: rule__VerifiquePresente__Group__4__Impl : ( ( rule__VerifiquePresente__NameAssignment_4 ) ) ;
    public final void rule__VerifiquePresente__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:829:1: ( ( ( rule__VerifiquePresente__NameAssignment_4 ) ) )
            // InternalAtad.g:830:1: ( ( rule__VerifiquePresente__NameAssignment_4 ) )
            {
            // InternalAtad.g:830:1: ( ( rule__VerifiquePresente__NameAssignment_4 ) )
            // InternalAtad.g:831:2: ( rule__VerifiquePresente__NameAssignment_4 )
            {
             before(grammarAccess.getVerifiquePresenteAccess().getNameAssignment_4()); 
            // InternalAtad.g:832:2: ( rule__VerifiquePresente__NameAssignment_4 )
            // InternalAtad.g:832:3: rule__VerifiquePresente__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VerifiquePresente__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVerifiquePresenteAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiquePresente__Group__4__Impl"


    // $ANTLR start "rule__VerifiquePresente__Group__5"
    // InternalAtad.g:840:1: rule__VerifiquePresente__Group__5 : rule__VerifiquePresente__Group__5__Impl rule__VerifiquePresente__Group__6 ;
    public final void rule__VerifiquePresente__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:844:1: ( rule__VerifiquePresente__Group__5__Impl rule__VerifiquePresente__Group__6 )
            // InternalAtad.g:845:2: rule__VerifiquePresente__Group__5__Impl rule__VerifiquePresente__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__VerifiquePresente__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifiquePresente__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiquePresente__Group__5"


    // $ANTLR start "rule__VerifiquePresente__Group__5__Impl"
    // InternalAtad.g:852:1: rule__VerifiquePresente__Group__5__Impl : ( 'esta' ) ;
    public final void rule__VerifiquePresente__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:856:1: ( ( 'esta' ) )
            // InternalAtad.g:857:1: ( 'esta' )
            {
            // InternalAtad.g:857:1: ( 'esta' )
            // InternalAtad.g:858:2: 'esta'
            {
             before(grammarAccess.getVerifiquePresenteAccess().getEstaKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVerifiquePresenteAccess().getEstaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiquePresente__Group__5__Impl"


    // $ANTLR start "rule__VerifiquePresente__Group__6"
    // InternalAtad.g:867:1: rule__VerifiquePresente__Group__6 : rule__VerifiquePresente__Group__6__Impl ;
    public final void rule__VerifiquePresente__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:871:1: ( rule__VerifiquePresente__Group__6__Impl )
            // InternalAtad.g:872:2: rule__VerifiquePresente__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VerifiquePresente__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiquePresente__Group__6"


    // $ANTLR start "rule__VerifiquePresente__Group__6__Impl"
    // InternalAtad.g:878:1: rule__VerifiquePresente__Group__6__Impl : ( 'presente' ) ;
    public final void rule__VerifiquePresente__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:882:1: ( ( 'presente' ) )
            // InternalAtad.g:883:1: ( 'presente' )
            {
            // InternalAtad.g:883:1: ( 'presente' )
            // InternalAtad.g:884:2: 'presente'
            {
             before(grammarAccess.getVerifiquePresenteAccess().getPresenteKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVerifiquePresenteAccess().getPresenteKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiquePresente__Group__6__Impl"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__0"
    // InternalAtad.g:894:1: rule__VerifiqueNaoPresente__Group__0 : rule__VerifiqueNaoPresente__Group__0__Impl rule__VerifiqueNaoPresente__Group__1 ;
    public final void rule__VerifiqueNaoPresente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:898:1: ( rule__VerifiqueNaoPresente__Group__0__Impl rule__VerifiqueNaoPresente__Group__1 )
            // InternalAtad.g:899:2: rule__VerifiqueNaoPresente__Group__0__Impl rule__VerifiqueNaoPresente__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__VerifiqueNaoPresente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifiqueNaoPresente__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__0"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__0__Impl"
    // InternalAtad.g:906:1: rule__VerifiqueNaoPresente__Group__0__Impl : ( 'Verifique' ) ;
    public final void rule__VerifiqueNaoPresente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:910:1: ( ( 'Verifique' ) )
            // InternalAtad.g:911:1: ( 'Verifique' )
            {
            // InternalAtad.g:911:1: ( 'Verifique' )
            // InternalAtad.g:912:2: 'Verifique'
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getVerifiqueKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVerifiqueNaoPresenteAccess().getVerifiqueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__0__Impl"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__1"
    // InternalAtad.g:921:1: rule__VerifiqueNaoPresente__Group__1 : rule__VerifiqueNaoPresente__Group__1__Impl rule__VerifiqueNaoPresente__Group__2 ;
    public final void rule__VerifiqueNaoPresente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:925:1: ( rule__VerifiqueNaoPresente__Group__1__Impl rule__VerifiqueNaoPresente__Group__2 )
            // InternalAtad.g:926:2: rule__VerifiqueNaoPresente__Group__1__Impl rule__VerifiqueNaoPresente__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__VerifiqueNaoPresente__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifiqueNaoPresente__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__1"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__1__Impl"
    // InternalAtad.g:933:1: rule__VerifiqueNaoPresente__Group__1__Impl : ( 'que' ) ;
    public final void rule__VerifiqueNaoPresente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:937:1: ( ( 'que' ) )
            // InternalAtad.g:938:1: ( 'que' )
            {
            // InternalAtad.g:938:1: ( 'que' )
            // InternalAtad.g:939:2: 'que'
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getQueKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVerifiqueNaoPresenteAccess().getQueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__1__Impl"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__2"
    // InternalAtad.g:948:1: rule__VerifiqueNaoPresente__Group__2 : rule__VerifiqueNaoPresente__Group__2__Impl rule__VerifiqueNaoPresente__Group__3 ;
    public final void rule__VerifiqueNaoPresente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:952:1: ( rule__VerifiqueNaoPresente__Group__2__Impl rule__VerifiqueNaoPresente__Group__3 )
            // InternalAtad.g:953:2: rule__VerifiqueNaoPresente__Group__2__Impl rule__VerifiqueNaoPresente__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__VerifiqueNaoPresente__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifiqueNaoPresente__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__2"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__2__Impl"
    // InternalAtad.g:960:1: rule__VerifiqueNaoPresente__Group__2__Impl : ( 'o' ) ;
    public final void rule__VerifiqueNaoPresente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:964:1: ( ( 'o' ) )
            // InternalAtad.g:965:1: ( 'o' )
            {
            // InternalAtad.g:965:1: ( 'o' )
            // InternalAtad.g:966:2: 'o'
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getOKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVerifiqueNaoPresenteAccess().getOKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__2__Impl"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__3"
    // InternalAtad.g:975:1: rule__VerifiqueNaoPresente__Group__3 : rule__VerifiqueNaoPresente__Group__3__Impl rule__VerifiqueNaoPresente__Group__4 ;
    public final void rule__VerifiqueNaoPresente__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:979:1: ( rule__VerifiqueNaoPresente__Group__3__Impl rule__VerifiqueNaoPresente__Group__4 )
            // InternalAtad.g:980:2: rule__VerifiqueNaoPresente__Group__3__Impl rule__VerifiqueNaoPresente__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__VerifiqueNaoPresente__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifiqueNaoPresente__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__3"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__3__Impl"
    // InternalAtad.g:987:1: rule__VerifiqueNaoPresente__Group__3__Impl : ( 'texto' ) ;
    public final void rule__VerifiqueNaoPresente__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:991:1: ( ( 'texto' ) )
            // InternalAtad.g:992:1: ( 'texto' )
            {
            // InternalAtad.g:992:1: ( 'texto' )
            // InternalAtad.g:993:2: 'texto'
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getTextoKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVerifiqueNaoPresenteAccess().getTextoKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__3__Impl"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__4"
    // InternalAtad.g:1002:1: rule__VerifiqueNaoPresente__Group__4 : rule__VerifiqueNaoPresente__Group__4__Impl rule__VerifiqueNaoPresente__Group__5 ;
    public final void rule__VerifiqueNaoPresente__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1006:1: ( rule__VerifiqueNaoPresente__Group__4__Impl rule__VerifiqueNaoPresente__Group__5 )
            // InternalAtad.g:1007:2: rule__VerifiqueNaoPresente__Group__4__Impl rule__VerifiqueNaoPresente__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__VerifiqueNaoPresente__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifiqueNaoPresente__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__4"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__4__Impl"
    // InternalAtad.g:1014:1: rule__VerifiqueNaoPresente__Group__4__Impl : ( ( rule__VerifiqueNaoPresente__NameAssignment_4 ) ) ;
    public final void rule__VerifiqueNaoPresente__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1018:1: ( ( ( rule__VerifiqueNaoPresente__NameAssignment_4 ) ) )
            // InternalAtad.g:1019:1: ( ( rule__VerifiqueNaoPresente__NameAssignment_4 ) )
            {
            // InternalAtad.g:1019:1: ( ( rule__VerifiqueNaoPresente__NameAssignment_4 ) )
            // InternalAtad.g:1020:2: ( rule__VerifiqueNaoPresente__NameAssignment_4 )
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getNameAssignment_4()); 
            // InternalAtad.g:1021:2: ( rule__VerifiqueNaoPresente__NameAssignment_4 )
            // InternalAtad.g:1021:3: rule__VerifiqueNaoPresente__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VerifiqueNaoPresente__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVerifiqueNaoPresenteAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__4__Impl"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__5"
    // InternalAtad.g:1029:1: rule__VerifiqueNaoPresente__Group__5 : rule__VerifiqueNaoPresente__Group__5__Impl rule__VerifiqueNaoPresente__Group__6 ;
    public final void rule__VerifiqueNaoPresente__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1033:1: ( rule__VerifiqueNaoPresente__Group__5__Impl rule__VerifiqueNaoPresente__Group__6 )
            // InternalAtad.g:1034:2: rule__VerifiqueNaoPresente__Group__5__Impl rule__VerifiqueNaoPresente__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__VerifiqueNaoPresente__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifiqueNaoPresente__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__5"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__5__Impl"
    // InternalAtad.g:1041:1: rule__VerifiqueNaoPresente__Group__5__Impl : ( 'nao' ) ;
    public final void rule__VerifiqueNaoPresente__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1045:1: ( ( 'nao' ) )
            // InternalAtad.g:1046:1: ( 'nao' )
            {
            // InternalAtad.g:1046:1: ( 'nao' )
            // InternalAtad.g:1047:2: 'nao'
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getNaoKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVerifiqueNaoPresenteAccess().getNaoKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__5__Impl"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__6"
    // InternalAtad.g:1056:1: rule__VerifiqueNaoPresente__Group__6 : rule__VerifiqueNaoPresente__Group__6__Impl rule__VerifiqueNaoPresente__Group__7 ;
    public final void rule__VerifiqueNaoPresente__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1060:1: ( rule__VerifiqueNaoPresente__Group__6__Impl rule__VerifiqueNaoPresente__Group__7 )
            // InternalAtad.g:1061:2: rule__VerifiqueNaoPresente__Group__6__Impl rule__VerifiqueNaoPresente__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__VerifiqueNaoPresente__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifiqueNaoPresente__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__6"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__6__Impl"
    // InternalAtad.g:1068:1: rule__VerifiqueNaoPresente__Group__6__Impl : ( 'esta' ) ;
    public final void rule__VerifiqueNaoPresente__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1072:1: ( ( 'esta' ) )
            // InternalAtad.g:1073:1: ( 'esta' )
            {
            // InternalAtad.g:1073:1: ( 'esta' )
            // InternalAtad.g:1074:2: 'esta'
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getEstaKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVerifiqueNaoPresenteAccess().getEstaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__6__Impl"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__7"
    // InternalAtad.g:1083:1: rule__VerifiqueNaoPresente__Group__7 : rule__VerifiqueNaoPresente__Group__7__Impl ;
    public final void rule__VerifiqueNaoPresente__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1087:1: ( rule__VerifiqueNaoPresente__Group__7__Impl )
            // InternalAtad.g:1088:2: rule__VerifiqueNaoPresente__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VerifiqueNaoPresente__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__7"


    // $ANTLR start "rule__VerifiqueNaoPresente__Group__7__Impl"
    // InternalAtad.g:1094:1: rule__VerifiqueNaoPresente__Group__7__Impl : ( 'presente' ) ;
    public final void rule__VerifiqueNaoPresente__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1098:1: ( ( 'presente' ) )
            // InternalAtad.g:1099:1: ( 'presente' )
            {
            // InternalAtad.g:1099:1: ( 'presente' )
            // InternalAtad.g:1100:2: 'presente'
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getPresenteKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVerifiqueNaoPresenteAccess().getPresenteKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__Group__7__Impl"


    // $ANTLR start "rule__AdicaoComando__Group__0"
    // InternalAtad.g:1110:1: rule__AdicaoComando__Group__0 : rule__AdicaoComando__Group__0__Impl rule__AdicaoComando__Group__1 ;
    public final void rule__AdicaoComando__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1114:1: ( rule__AdicaoComando__Group__0__Impl rule__AdicaoComando__Group__1 )
            // InternalAtad.g:1115:2: rule__AdicaoComando__Group__0__Impl rule__AdicaoComando__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__AdicaoComando__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdicaoComando__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoComando__Group__0"


    // $ANTLR start "rule__AdicaoComando__Group__0__Impl"
    // InternalAtad.g:1122:1: rule__AdicaoComando__Group__0__Impl : ( 'E' ) ;
    public final void rule__AdicaoComando__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1126:1: ( ( 'E' ) )
            // InternalAtad.g:1127:1: ( 'E' )
            {
            // InternalAtad.g:1127:1: ( 'E' )
            // InternalAtad.g:1128:2: 'E'
            {
             before(grammarAccess.getAdicaoComandoAccess().getEKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAdicaoComandoAccess().getEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoComando__Group__0__Impl"


    // $ANTLR start "rule__AdicaoComando__Group__1"
    // InternalAtad.g:1137:1: rule__AdicaoComando__Group__1 : rule__AdicaoComando__Group__1__Impl ;
    public final void rule__AdicaoComando__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1141:1: ( rule__AdicaoComando__Group__1__Impl )
            // InternalAtad.g:1142:2: rule__AdicaoComando__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdicaoComando__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoComando__Group__1"


    // $ANTLR start "rule__AdicaoComando__Group__1__Impl"
    // InternalAtad.g:1148:1: rule__AdicaoComando__Group__1__Impl : ( ( rule__AdicaoComando__ComandoAssignment_1 ) ) ;
    public final void rule__AdicaoComando__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1152:1: ( ( ( rule__AdicaoComando__ComandoAssignment_1 ) ) )
            // InternalAtad.g:1153:1: ( ( rule__AdicaoComando__ComandoAssignment_1 ) )
            {
            // InternalAtad.g:1153:1: ( ( rule__AdicaoComando__ComandoAssignment_1 ) )
            // InternalAtad.g:1154:2: ( rule__AdicaoComando__ComandoAssignment_1 )
            {
             before(grammarAccess.getAdicaoComandoAccess().getComandoAssignment_1()); 
            // InternalAtad.g:1155:2: ( rule__AdicaoComando__ComandoAssignment_1 )
            // InternalAtad.g:1155:3: rule__AdicaoComando__ComandoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AdicaoComando__ComandoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAdicaoComandoAccess().getComandoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoComando__Group__1__Impl"


    // $ANTLR start "rule__Quando__Group__0"
    // InternalAtad.g:1164:1: rule__Quando__Group__0 : rule__Quando__Group__0__Impl rule__Quando__Group__1 ;
    public final void rule__Quando__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1168:1: ( rule__Quando__Group__0__Impl rule__Quando__Group__1 )
            // InternalAtad.g:1169:2: rule__Quando__Group__0__Impl rule__Quando__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Quando__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quando__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quando__Group__0"


    // $ANTLR start "rule__Quando__Group__0__Impl"
    // InternalAtad.g:1176:1: rule__Quando__Group__0__Impl : ( 'Quando' ) ;
    public final void rule__Quando__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1180:1: ( ( 'Quando' ) )
            // InternalAtad.g:1181:1: ( 'Quando' )
            {
            // InternalAtad.g:1181:1: ( 'Quando' )
            // InternalAtad.g:1182:2: 'Quando'
            {
             before(grammarAccess.getQuandoAccess().getQuandoKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getQuandoAccess().getQuandoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quando__Group__0__Impl"


    // $ANTLR start "rule__Quando__Group__1"
    // InternalAtad.g:1191:1: rule__Quando__Group__1 : rule__Quando__Group__1__Impl ;
    public final void rule__Quando__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1195:1: ( rule__Quando__Group__1__Impl )
            // InternalAtad.g:1196:2: rule__Quando__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Quando__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quando__Group__1"


    // $ANTLR start "rule__Quando__Group__1__Impl"
    // InternalAtad.g:1202:1: rule__Quando__Group__1__Impl : ( ruleComandosAcao ) ;
    public final void rule__Quando__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1206:1: ( ( ruleComandosAcao ) )
            // InternalAtad.g:1207:1: ( ruleComandosAcao )
            {
            // InternalAtad.g:1207:1: ( ruleComandosAcao )
            // InternalAtad.g:1208:2: ruleComandosAcao
            {
             before(grammarAccess.getQuandoAccess().getComandosAcaoParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleComandosAcao();

            state._fsp--;

             after(grammarAccess.getQuandoAccess().getComandosAcaoParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quando__Group__1__Impl"


    // $ANTLR start "rule__DeclaraComando__ComandosAssignment"
    // InternalAtad.g:1218:1: rule__DeclaraComando__ComandosAssignment : ( ruleComando ) ;
    public final void rule__DeclaraComando__ComandosAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1222:1: ( ( ruleComando ) )
            // InternalAtad.g:1223:2: ( ruleComando )
            {
            // InternalAtad.g:1223:2: ( ruleComando )
            // InternalAtad.g:1224:3: ruleComando
            {
             before(grammarAccess.getDeclaraComandoAccess().getComandosComandoParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComando();

            state._fsp--;

             after(grammarAccess.getDeclaraComandoAccess().getComandosComandoParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaraComando__ComandosAssignment"


    // $ANTLR start "rule__Clicar__TipoLocalizadorAssignment_2"
    // InternalAtad.g:1233:1: rule__Clicar__TipoLocalizadorAssignment_2 : ( RULE_ID ) ;
    public final void rule__Clicar__TipoLocalizadorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1237:1: ( ( RULE_ID ) )
            // InternalAtad.g:1238:2: ( RULE_ID )
            {
            // InternalAtad.g:1238:2: ( RULE_ID )
            // InternalAtad.g:1239:3: RULE_ID
            {
             before(grammarAccess.getClicarAccess().getTipoLocalizadorIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClicarAccess().getTipoLocalizadorIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clicar__TipoLocalizadorAssignment_2"


    // $ANTLR start "rule__Clicar__NameAssignment_3"
    // InternalAtad.g:1248:1: rule__Clicar__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Clicar__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1252:1: ( ( RULE_STRING ) )
            // InternalAtad.g:1253:2: ( RULE_STRING )
            {
            // InternalAtad.g:1253:2: ( RULE_STRING )
            // InternalAtad.g:1254:3: RULE_STRING
            {
             before(grammarAccess.getClicarAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClicarAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clicar__NameAssignment_3"


    // $ANTLR start "rule__Navegar__NameAssignment_1"
    // InternalAtad.g:1263:1: rule__Navegar__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Navegar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1267:1: ( ( RULE_STRING ) )
            // InternalAtad.g:1268:2: ( RULE_STRING )
            {
            // InternalAtad.g:1268:2: ( RULE_STRING )
            // InternalAtad.g:1269:3: RULE_STRING
            {
             before(grammarAccess.getNavegarAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNavegarAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Navegar__NameAssignment_1"


    // $ANTLR start "rule__Escrever__TipoLocalizadorAssignment_2"
    // InternalAtad.g:1278:1: rule__Escrever__TipoLocalizadorAssignment_2 : ( RULE_ID ) ;
    public final void rule__Escrever__TipoLocalizadorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1282:1: ( ( RULE_ID ) )
            // InternalAtad.g:1283:2: ( RULE_ID )
            {
            // InternalAtad.g:1283:2: ( RULE_ID )
            // InternalAtad.g:1284:3: RULE_ID
            {
             before(grammarAccess.getEscreverAccess().getTipoLocalizadorIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEscreverAccess().getTipoLocalizadorIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escrever__TipoLocalizadorAssignment_2"


    // $ANTLR start "rule__Escrever__NameAssignment_3"
    // InternalAtad.g:1293:1: rule__Escrever__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Escrever__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1297:1: ( ( RULE_STRING ) )
            // InternalAtad.g:1298:2: ( RULE_STRING )
            {
            // InternalAtad.g:1298:2: ( RULE_STRING )
            // InternalAtad.g:1299:3: RULE_STRING
            {
             before(grammarAccess.getEscreverAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEscreverAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escrever__NameAssignment_3"


    // $ANTLR start "rule__Escrever__ConteudoAssignment_4"
    // InternalAtad.g:1308:1: rule__Escrever__ConteudoAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Escrever__ConteudoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1312:1: ( ( RULE_STRING ) )
            // InternalAtad.g:1313:2: ( RULE_STRING )
            {
            // InternalAtad.g:1313:2: ( RULE_STRING )
            // InternalAtad.g:1314:3: RULE_STRING
            {
             before(grammarAccess.getEscreverAccess().getConteudoSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEscreverAccess().getConteudoSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escrever__ConteudoAssignment_4"


    // $ANTLR start "rule__VerifiquePresente__NameAssignment_4"
    // InternalAtad.g:1323:1: rule__VerifiquePresente__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__VerifiquePresente__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1327:1: ( ( RULE_STRING ) )
            // InternalAtad.g:1328:2: ( RULE_STRING )
            {
            // InternalAtad.g:1328:2: ( RULE_STRING )
            // InternalAtad.g:1329:3: RULE_STRING
            {
             before(grammarAccess.getVerifiquePresenteAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVerifiquePresenteAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiquePresente__NameAssignment_4"


    // $ANTLR start "rule__VerifiqueNaoPresente__NameAssignment_4"
    // InternalAtad.g:1338:1: rule__VerifiqueNaoPresente__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__VerifiqueNaoPresente__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1342:1: ( ( RULE_STRING ) )
            // InternalAtad.g:1343:2: ( RULE_STRING )
            {
            // InternalAtad.g:1343:2: ( RULE_STRING )
            // InternalAtad.g:1344:3: RULE_STRING
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getNameSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVerifiqueNaoPresenteAccess().getNameSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifiqueNaoPresente__NameAssignment_4"


    // $ANTLR start "rule__AdicaoComando__ComandoAssignment_1"
    // InternalAtad.g:1353:1: rule__AdicaoComando__ComandoAssignment_1 : ( ruleComandosAcao ) ;
    public final void rule__AdicaoComando__ComandoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1357:1: ( ( ruleComandosAcao ) )
            // InternalAtad.g:1358:2: ( ruleComandosAcao )
            {
            // InternalAtad.g:1358:2: ( ruleComandosAcao )
            // InternalAtad.g:1359:3: ruleComandosAcao
            {
             before(grammarAccess.getAdicaoComandoAccess().getComandoComandosAcaoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComandosAcao();

            state._fsp--;

             after(grammarAccess.getAdicaoComandoAccess().getComandoComandosAcaoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdicaoComando__ComandoAssignment_1"

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