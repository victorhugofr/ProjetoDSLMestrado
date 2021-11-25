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

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=15)||(LA1_0>=17 && LA1_0<=18)) ) {
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
    // InternalAtad.g:187:1: ruleComandosAcao : ( ( rule__ComandosAcao__ComandoAssignment ) ) ;
    public final void ruleComandosAcao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:191:2: ( ( ( rule__ComandosAcao__ComandoAssignment ) ) )
            // InternalAtad.g:192:2: ( ( rule__ComandosAcao__ComandoAssignment ) )
            {
            // InternalAtad.g:192:2: ( ( rule__ComandosAcao__ComandoAssignment ) )
            // InternalAtad.g:193:3: ( rule__ComandosAcao__ComandoAssignment )
            {
             before(grammarAccess.getComandosAcaoAccess().getComandoAssignment()); 
            // InternalAtad.g:194:3: ( rule__ComandosAcao__ComandoAssignment )
            // InternalAtad.g:194:4: rule__ComandosAcao__ComandoAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ComandosAcao__ComandoAssignment();

            state._fsp--;


            }

             after(grammarAccess.getComandosAcaoAccess().getComandoAssignment()); 

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


    // $ANTLR start "entryRuleVerifique"
    // InternalAtad.g:203:1: entryRuleVerifique : ruleVerifique EOF ;
    public final void entryRuleVerifique() throws RecognitionException {
        try {
            // InternalAtad.g:204:1: ( ruleVerifique EOF )
            // InternalAtad.g:205:1: ruleVerifique EOF
            {
             before(grammarAccess.getVerifiqueRule()); 
            pushFollow(FOLLOW_1);
            ruleVerifique();

            state._fsp--;

             after(grammarAccess.getVerifiqueRule()); 
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
    // $ANTLR end "entryRuleVerifique"


    // $ANTLR start "ruleVerifique"
    // InternalAtad.g:212:1: ruleVerifique : ( ( rule__Verifique__Group__0 ) ) ;
    public final void ruleVerifique() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:216:2: ( ( ( rule__Verifique__Group__0 ) ) )
            // InternalAtad.g:217:2: ( ( rule__Verifique__Group__0 ) )
            {
            // InternalAtad.g:217:2: ( ( rule__Verifique__Group__0 ) )
            // InternalAtad.g:218:3: ( rule__Verifique__Group__0 )
            {
             before(grammarAccess.getVerifiqueAccess().getGroup()); 
            // InternalAtad.g:219:3: ( rule__Verifique__Group__0 )
            // InternalAtad.g:219:4: rule__Verifique__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Verifique__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerifiqueAccess().getGroup()); 

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
    // $ANTLR end "ruleVerifique"


    // $ANTLR start "entryRuleComandosValidadores"
    // InternalAtad.g:228:1: entryRuleComandosValidadores : ruleComandosValidadores EOF ;
    public final void entryRuleComandosValidadores() throws RecognitionException {
        try {
            // InternalAtad.g:229:1: ( ruleComandosValidadores EOF )
            // InternalAtad.g:230:1: ruleComandosValidadores EOF
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
    // InternalAtad.g:237:1: ruleComandosValidadores : ( ( rule__ComandosValidadores__VerifiqueAssignment ) ) ;
    public final void ruleComandosValidadores() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:241:2: ( ( ( rule__ComandosValidadores__VerifiqueAssignment ) ) )
            // InternalAtad.g:242:2: ( ( rule__ComandosValidadores__VerifiqueAssignment ) )
            {
            // InternalAtad.g:242:2: ( ( rule__ComandosValidadores__VerifiqueAssignment ) )
            // InternalAtad.g:243:3: ( rule__ComandosValidadores__VerifiqueAssignment )
            {
             before(grammarAccess.getComandosValidadoresAccess().getVerifiqueAssignment()); 
            // InternalAtad.g:244:3: ( rule__ComandosValidadores__VerifiqueAssignment )
            // InternalAtad.g:244:4: rule__ComandosValidadores__VerifiqueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ComandosValidadores__VerifiqueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getComandosValidadoresAccess().getVerifiqueAssignment()); 

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
    // InternalAtad.g:253:1: entryRuleAdicaoComando : ruleAdicaoComando EOF ;
    public final void entryRuleAdicaoComando() throws RecognitionException {
        try {
            // InternalAtad.g:254:1: ( ruleAdicaoComando EOF )
            // InternalAtad.g:255:1: ruleAdicaoComando EOF
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
    // InternalAtad.g:262:1: ruleAdicaoComando : ( ( rule__AdicaoComando__Group__0 ) ) ;
    public final void ruleAdicaoComando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:266:2: ( ( ( rule__AdicaoComando__Group__0 ) ) )
            // InternalAtad.g:267:2: ( ( rule__AdicaoComando__Group__0 ) )
            {
            // InternalAtad.g:267:2: ( ( rule__AdicaoComando__Group__0 ) )
            // InternalAtad.g:268:3: ( rule__AdicaoComando__Group__0 )
            {
             before(grammarAccess.getAdicaoComandoAccess().getGroup()); 
            // InternalAtad.g:269:3: ( rule__AdicaoComando__Group__0 )
            // InternalAtad.g:269:4: rule__AdicaoComando__Group__0
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
    // InternalAtad.g:278:1: entryRuleQuando : ruleQuando EOF ;
    public final void entryRuleQuando() throws RecognitionException {
        try {
            // InternalAtad.g:279:1: ( ruleQuando EOF )
            // InternalAtad.g:280:1: ruleQuando EOF
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
    // InternalAtad.g:287:1: ruleQuando : ( ( rule__Quando__Group__0 ) ) ;
    public final void ruleQuando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:291:2: ( ( ( rule__Quando__Group__0 ) ) )
            // InternalAtad.g:292:2: ( ( rule__Quando__Group__0 ) )
            {
            // InternalAtad.g:292:2: ( ( rule__Quando__Group__0 ) )
            // InternalAtad.g:293:3: ( rule__Quando__Group__0 )
            {
             before(grammarAccess.getQuandoAccess().getGroup()); 
            // InternalAtad.g:294:3: ( rule__Quando__Group__0 )
            // InternalAtad.g:294:4: rule__Quando__Group__0
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
    // InternalAtad.g:302:1: rule__Comando__Alternatives : ( ( ruleComandosAcao ) | ( ruleComandosValidadores ) | ( ruleAdicaoComando ) | ( ruleQuando ) );
    public final void rule__Comando__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:306:1: ( ( ruleComandosAcao ) | ( ruleComandosValidadores ) | ( ruleAdicaoComando ) | ( ruleQuando ) )
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
                    // InternalAtad.g:307:2: ( ruleComandosAcao )
                    {
                    // InternalAtad.g:307:2: ( ruleComandosAcao )
                    // InternalAtad.g:308:3: ruleComandosAcao
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
                    // InternalAtad.g:313:2: ( ruleComandosValidadores )
                    {
                    // InternalAtad.g:313:2: ( ruleComandosValidadores )
                    // InternalAtad.g:314:3: ruleComandosValidadores
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
                    // InternalAtad.g:319:2: ( ruleAdicaoComando )
                    {
                    // InternalAtad.g:319:2: ( ruleAdicaoComando )
                    // InternalAtad.g:320:3: ruleAdicaoComando
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
                    // InternalAtad.g:325:2: ( ruleQuando )
                    {
                    // InternalAtad.g:325:2: ( ruleQuando )
                    // InternalAtad.g:326:3: ruleQuando
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


    // $ANTLR start "rule__ComandosAcao__ComandoAlternatives_0"
    // InternalAtad.g:335:1: rule__ComandosAcao__ComandoAlternatives_0 : ( ( ruleClicar ) | ( ruleNavegar ) | ( ruleEscrever ) );
    public final void rule__ComandosAcao__ComandoAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:339:1: ( ( ruleClicar ) | ( ruleNavegar ) | ( ruleEscrever ) )
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
                    // InternalAtad.g:340:2: ( ruleClicar )
                    {
                    // InternalAtad.g:340:2: ( ruleClicar )
                    // InternalAtad.g:341:3: ruleClicar
                    {
                     before(grammarAccess.getComandosAcaoAccess().getComandoClicarParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClicar();

                    state._fsp--;

                     after(grammarAccess.getComandosAcaoAccess().getComandoClicarParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAtad.g:346:2: ( ruleNavegar )
                    {
                    // InternalAtad.g:346:2: ( ruleNavegar )
                    // InternalAtad.g:347:3: ruleNavegar
                    {
                     before(grammarAccess.getComandosAcaoAccess().getComandoNavegarParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNavegar();

                    state._fsp--;

                     after(grammarAccess.getComandosAcaoAccess().getComandoNavegarParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAtad.g:352:2: ( ruleEscrever )
                    {
                    // InternalAtad.g:352:2: ( ruleEscrever )
                    // InternalAtad.g:353:3: ruleEscrever
                    {
                     before(grammarAccess.getComandosAcaoAccess().getComandoEscreverParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEscrever();

                    state._fsp--;

                     after(grammarAccess.getComandosAcaoAccess().getComandoEscreverParserRuleCall_0_2()); 

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
    // $ANTLR end "rule__ComandosAcao__ComandoAlternatives_0"


    // $ANTLR start "rule__Clicar__Group__0"
    // InternalAtad.g:362:1: rule__Clicar__Group__0 : rule__Clicar__Group__0__Impl rule__Clicar__Group__1 ;
    public final void rule__Clicar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:366:1: ( rule__Clicar__Group__0__Impl rule__Clicar__Group__1 )
            // InternalAtad.g:367:2: rule__Clicar__Group__0__Impl rule__Clicar__Group__1
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
    // InternalAtad.g:374:1: rule__Clicar__Group__0__Impl : ( 'clicar' ) ;
    public final void rule__Clicar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:378:1: ( ( 'clicar' ) )
            // InternalAtad.g:379:1: ( 'clicar' )
            {
            // InternalAtad.g:379:1: ( 'clicar' )
            // InternalAtad.g:380:2: 'clicar'
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
    // InternalAtad.g:389:1: rule__Clicar__Group__1 : rule__Clicar__Group__1__Impl rule__Clicar__Group__2 ;
    public final void rule__Clicar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:393:1: ( rule__Clicar__Group__1__Impl rule__Clicar__Group__2 )
            // InternalAtad.g:394:2: rule__Clicar__Group__1__Impl rule__Clicar__Group__2
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
    // InternalAtad.g:401:1: rule__Clicar__Group__1__Impl : ( 'em' ) ;
    public final void rule__Clicar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:405:1: ( ( 'em' ) )
            // InternalAtad.g:406:1: ( 'em' )
            {
            // InternalAtad.g:406:1: ( 'em' )
            // InternalAtad.g:407:2: 'em'
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
    // InternalAtad.g:416:1: rule__Clicar__Group__2 : rule__Clicar__Group__2__Impl ;
    public final void rule__Clicar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:420:1: ( rule__Clicar__Group__2__Impl )
            // InternalAtad.g:421:2: rule__Clicar__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clicar__Group__2__Impl();

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
    // InternalAtad.g:427:1: rule__Clicar__Group__2__Impl : ( ( rule__Clicar__NameAssignment_2 ) ) ;
    public final void rule__Clicar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:431:1: ( ( ( rule__Clicar__NameAssignment_2 ) ) )
            // InternalAtad.g:432:1: ( ( rule__Clicar__NameAssignment_2 ) )
            {
            // InternalAtad.g:432:1: ( ( rule__Clicar__NameAssignment_2 ) )
            // InternalAtad.g:433:2: ( rule__Clicar__NameAssignment_2 )
            {
             before(grammarAccess.getClicarAccess().getNameAssignment_2()); 
            // InternalAtad.g:434:2: ( rule__Clicar__NameAssignment_2 )
            // InternalAtad.g:434:3: rule__Clicar__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Clicar__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClicarAccess().getNameAssignment_2()); 

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


    // $ANTLR start "rule__Navegar__Group__0"
    // InternalAtad.g:443:1: rule__Navegar__Group__0 : rule__Navegar__Group__0__Impl rule__Navegar__Group__1 ;
    public final void rule__Navegar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:447:1: ( rule__Navegar__Group__0__Impl rule__Navegar__Group__1 )
            // InternalAtad.g:448:2: rule__Navegar__Group__0__Impl rule__Navegar__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAtad.g:455:1: rule__Navegar__Group__0__Impl : ( 'navegar' ) ;
    public final void rule__Navegar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:459:1: ( ( 'navegar' ) )
            // InternalAtad.g:460:1: ( 'navegar' )
            {
            // InternalAtad.g:460:1: ( 'navegar' )
            // InternalAtad.g:461:2: 'navegar'
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
    // InternalAtad.g:470:1: rule__Navegar__Group__1 : rule__Navegar__Group__1__Impl ;
    public final void rule__Navegar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:474:1: ( rule__Navegar__Group__1__Impl )
            // InternalAtad.g:475:2: rule__Navegar__Group__1__Impl
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
    // InternalAtad.g:481:1: rule__Navegar__Group__1__Impl : ( ( rule__Navegar__NameAssignment_1 ) ) ;
    public final void rule__Navegar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:485:1: ( ( ( rule__Navegar__NameAssignment_1 ) ) )
            // InternalAtad.g:486:1: ( ( rule__Navegar__NameAssignment_1 ) )
            {
            // InternalAtad.g:486:1: ( ( rule__Navegar__NameAssignment_1 ) )
            // InternalAtad.g:487:2: ( rule__Navegar__NameAssignment_1 )
            {
             before(grammarAccess.getNavegarAccess().getNameAssignment_1()); 
            // InternalAtad.g:488:2: ( rule__Navegar__NameAssignment_1 )
            // InternalAtad.g:488:3: rule__Navegar__NameAssignment_1
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
    // InternalAtad.g:497:1: rule__Escrever__Group__0 : rule__Escrever__Group__0__Impl rule__Escrever__Group__1 ;
    public final void rule__Escrever__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:501:1: ( rule__Escrever__Group__0__Impl rule__Escrever__Group__1 )
            // InternalAtad.g:502:2: rule__Escrever__Group__0__Impl rule__Escrever__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAtad.g:509:1: rule__Escrever__Group__0__Impl : ( 'escrever' ) ;
    public final void rule__Escrever__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:513:1: ( ( 'escrever' ) )
            // InternalAtad.g:514:1: ( 'escrever' )
            {
            // InternalAtad.g:514:1: ( 'escrever' )
            // InternalAtad.g:515:2: 'escrever'
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
    // InternalAtad.g:524:1: rule__Escrever__Group__1 : rule__Escrever__Group__1__Impl ;
    public final void rule__Escrever__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:528:1: ( rule__Escrever__Group__1__Impl )
            // InternalAtad.g:529:2: rule__Escrever__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Escrever__Group__1__Impl();

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
    // InternalAtad.g:535:1: rule__Escrever__Group__1__Impl : ( ( rule__Escrever__NameAssignment_1 ) ) ;
    public final void rule__Escrever__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:539:1: ( ( ( rule__Escrever__NameAssignment_1 ) ) )
            // InternalAtad.g:540:1: ( ( rule__Escrever__NameAssignment_1 ) )
            {
            // InternalAtad.g:540:1: ( ( rule__Escrever__NameAssignment_1 ) )
            // InternalAtad.g:541:2: ( rule__Escrever__NameAssignment_1 )
            {
             before(grammarAccess.getEscreverAccess().getNameAssignment_1()); 
            // InternalAtad.g:542:2: ( rule__Escrever__NameAssignment_1 )
            // InternalAtad.g:542:3: rule__Escrever__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Escrever__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEscreverAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__Verifique__Group__0"
    // InternalAtad.g:551:1: rule__Verifique__Group__0 : rule__Verifique__Group__0__Impl rule__Verifique__Group__1 ;
    public final void rule__Verifique__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:555:1: ( rule__Verifique__Group__0__Impl rule__Verifique__Group__1 )
            // InternalAtad.g:556:2: rule__Verifique__Group__0__Impl rule__Verifique__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Verifique__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verifique__Group__1();

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
    // $ANTLR end "rule__Verifique__Group__0"


    // $ANTLR start "rule__Verifique__Group__0__Impl"
    // InternalAtad.g:563:1: rule__Verifique__Group__0__Impl : ( 'Verifique' ) ;
    public final void rule__Verifique__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:567:1: ( ( 'Verifique' ) )
            // InternalAtad.g:568:1: ( 'Verifique' )
            {
            // InternalAtad.g:568:1: ( 'Verifique' )
            // InternalAtad.g:569:2: 'Verifique'
            {
             before(grammarAccess.getVerifiqueAccess().getVerifiqueKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVerifiqueAccess().getVerifiqueKeyword_0()); 

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
    // $ANTLR end "rule__Verifique__Group__0__Impl"


    // $ANTLR start "rule__Verifique__Group__1"
    // InternalAtad.g:578:1: rule__Verifique__Group__1 : rule__Verifique__Group__1__Impl rule__Verifique__Group__2 ;
    public final void rule__Verifique__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:582:1: ( rule__Verifique__Group__1__Impl rule__Verifique__Group__2 )
            // InternalAtad.g:583:2: rule__Verifique__Group__1__Impl rule__Verifique__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Verifique__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verifique__Group__2();

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
    // $ANTLR end "rule__Verifique__Group__1"


    // $ANTLR start "rule__Verifique__Group__1__Impl"
    // InternalAtad.g:590:1: rule__Verifique__Group__1__Impl : ( 'que' ) ;
    public final void rule__Verifique__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:594:1: ( ( 'que' ) )
            // InternalAtad.g:595:1: ( 'que' )
            {
            // InternalAtad.g:595:1: ( 'que' )
            // InternalAtad.g:596:2: 'que'
            {
             before(grammarAccess.getVerifiqueAccess().getQueKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVerifiqueAccess().getQueKeyword_1()); 

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
    // $ANTLR end "rule__Verifique__Group__1__Impl"


    // $ANTLR start "rule__Verifique__Group__2"
    // InternalAtad.g:605:1: rule__Verifique__Group__2 : rule__Verifique__Group__2__Impl ;
    public final void rule__Verifique__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:609:1: ( rule__Verifique__Group__2__Impl )
            // InternalAtad.g:610:2: rule__Verifique__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verifique__Group__2__Impl();

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
    // $ANTLR end "rule__Verifique__Group__2"


    // $ANTLR start "rule__Verifique__Group__2__Impl"
    // InternalAtad.g:616:1: rule__Verifique__Group__2__Impl : ( ( rule__Verifique__NameAssignment_2 ) ) ;
    public final void rule__Verifique__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:620:1: ( ( ( rule__Verifique__NameAssignment_2 ) ) )
            // InternalAtad.g:621:1: ( ( rule__Verifique__NameAssignment_2 ) )
            {
            // InternalAtad.g:621:1: ( ( rule__Verifique__NameAssignment_2 ) )
            // InternalAtad.g:622:2: ( rule__Verifique__NameAssignment_2 )
            {
             before(grammarAccess.getVerifiqueAccess().getNameAssignment_2()); 
            // InternalAtad.g:623:2: ( rule__Verifique__NameAssignment_2 )
            // InternalAtad.g:623:3: rule__Verifique__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Verifique__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVerifiqueAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Verifique__Group__2__Impl"


    // $ANTLR start "rule__AdicaoComando__Group__0"
    // InternalAtad.g:632:1: rule__AdicaoComando__Group__0 : rule__AdicaoComando__Group__0__Impl rule__AdicaoComando__Group__1 ;
    public final void rule__AdicaoComando__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:636:1: ( rule__AdicaoComando__Group__0__Impl rule__AdicaoComando__Group__1 )
            // InternalAtad.g:637:2: rule__AdicaoComando__Group__0__Impl rule__AdicaoComando__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalAtad.g:644:1: rule__AdicaoComando__Group__0__Impl : ( 'E' ) ;
    public final void rule__AdicaoComando__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:648:1: ( ( 'E' ) )
            // InternalAtad.g:649:1: ( 'E' )
            {
            // InternalAtad.g:649:1: ( 'E' )
            // InternalAtad.g:650:2: 'E'
            {
             before(grammarAccess.getAdicaoComandoAccess().getEKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalAtad.g:659:1: rule__AdicaoComando__Group__1 : rule__AdicaoComando__Group__1__Impl ;
    public final void rule__AdicaoComando__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:663:1: ( rule__AdicaoComando__Group__1__Impl )
            // InternalAtad.g:664:2: rule__AdicaoComando__Group__1__Impl
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
    // InternalAtad.g:670:1: rule__AdicaoComando__Group__1__Impl : ( ( rule__AdicaoComando__ComandoAssignment_1 ) ) ;
    public final void rule__AdicaoComando__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:674:1: ( ( ( rule__AdicaoComando__ComandoAssignment_1 ) ) )
            // InternalAtad.g:675:1: ( ( rule__AdicaoComando__ComandoAssignment_1 ) )
            {
            // InternalAtad.g:675:1: ( ( rule__AdicaoComando__ComandoAssignment_1 ) )
            // InternalAtad.g:676:2: ( rule__AdicaoComando__ComandoAssignment_1 )
            {
             before(grammarAccess.getAdicaoComandoAccess().getComandoAssignment_1()); 
            // InternalAtad.g:677:2: ( rule__AdicaoComando__ComandoAssignment_1 )
            // InternalAtad.g:677:3: rule__AdicaoComando__ComandoAssignment_1
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
    // InternalAtad.g:686:1: rule__Quando__Group__0 : rule__Quando__Group__0__Impl rule__Quando__Group__1 ;
    public final void rule__Quando__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:690:1: ( rule__Quando__Group__0__Impl rule__Quando__Group__1 )
            // InternalAtad.g:691:2: rule__Quando__Group__0__Impl rule__Quando__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalAtad.g:698:1: rule__Quando__Group__0__Impl : ( 'Quando' ) ;
    public final void rule__Quando__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:702:1: ( ( 'Quando' ) )
            // InternalAtad.g:703:1: ( 'Quando' )
            {
            // InternalAtad.g:703:1: ( 'Quando' )
            // InternalAtad.g:704:2: 'Quando'
            {
             before(grammarAccess.getQuandoAccess().getQuandoKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalAtad.g:713:1: rule__Quando__Group__1 : rule__Quando__Group__1__Impl ;
    public final void rule__Quando__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:717:1: ( rule__Quando__Group__1__Impl )
            // InternalAtad.g:718:2: rule__Quando__Group__1__Impl
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
    // InternalAtad.g:724:1: rule__Quando__Group__1__Impl : ( ruleComandosAcao ) ;
    public final void rule__Quando__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:728:1: ( ( ruleComandosAcao ) )
            // InternalAtad.g:729:1: ( ruleComandosAcao )
            {
            // InternalAtad.g:729:1: ( ruleComandosAcao )
            // InternalAtad.g:730:2: ruleComandosAcao
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
    // InternalAtad.g:740:1: rule__DeclaraComando__ComandosAssignment : ( ruleComando ) ;
    public final void rule__DeclaraComando__ComandosAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:744:1: ( ( ruleComando ) )
            // InternalAtad.g:745:2: ( ruleComando )
            {
            // InternalAtad.g:745:2: ( ruleComando )
            // InternalAtad.g:746:3: ruleComando
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


    // $ANTLR start "rule__Clicar__NameAssignment_2"
    // InternalAtad.g:755:1: rule__Clicar__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Clicar__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:759:1: ( ( RULE_STRING ) )
            // InternalAtad.g:760:2: ( RULE_STRING )
            {
            // InternalAtad.g:760:2: ( RULE_STRING )
            // InternalAtad.g:761:3: RULE_STRING
            {
             before(grammarAccess.getClicarAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClicarAccess().getNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Clicar__NameAssignment_2"


    // $ANTLR start "rule__Navegar__NameAssignment_1"
    // InternalAtad.g:770:1: rule__Navegar__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Navegar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:774:1: ( ( RULE_STRING ) )
            // InternalAtad.g:775:2: ( RULE_STRING )
            {
            // InternalAtad.g:775:2: ( RULE_STRING )
            // InternalAtad.g:776:3: RULE_STRING
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


    // $ANTLR start "rule__Escrever__NameAssignment_1"
    // InternalAtad.g:785:1: rule__Escrever__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Escrever__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:789:1: ( ( RULE_STRING ) )
            // InternalAtad.g:790:2: ( RULE_STRING )
            {
            // InternalAtad.g:790:2: ( RULE_STRING )
            // InternalAtad.g:791:3: RULE_STRING
            {
             before(grammarAccess.getEscreverAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEscreverAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Escrever__NameAssignment_1"


    // $ANTLR start "rule__ComandosAcao__ComandoAssignment"
    // InternalAtad.g:800:1: rule__ComandosAcao__ComandoAssignment : ( ( rule__ComandosAcao__ComandoAlternatives_0 ) ) ;
    public final void rule__ComandosAcao__ComandoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:804:1: ( ( ( rule__ComandosAcao__ComandoAlternatives_0 ) ) )
            // InternalAtad.g:805:2: ( ( rule__ComandosAcao__ComandoAlternatives_0 ) )
            {
            // InternalAtad.g:805:2: ( ( rule__ComandosAcao__ComandoAlternatives_0 ) )
            // InternalAtad.g:806:3: ( rule__ComandosAcao__ComandoAlternatives_0 )
            {
             before(grammarAccess.getComandosAcaoAccess().getComandoAlternatives_0()); 
            // InternalAtad.g:807:3: ( rule__ComandosAcao__ComandoAlternatives_0 )
            // InternalAtad.g:807:4: rule__ComandosAcao__ComandoAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__ComandosAcao__ComandoAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getComandosAcaoAccess().getComandoAlternatives_0()); 

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
    // $ANTLR end "rule__ComandosAcao__ComandoAssignment"


    // $ANTLR start "rule__Verifique__NameAssignment_2"
    // InternalAtad.g:815:1: rule__Verifique__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Verifique__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:819:1: ( ( RULE_STRING ) )
            // InternalAtad.g:820:2: ( RULE_STRING )
            {
            // InternalAtad.g:820:2: ( RULE_STRING )
            // InternalAtad.g:821:3: RULE_STRING
            {
             before(grammarAccess.getVerifiqueAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVerifiqueAccess().getNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Verifique__NameAssignment_2"


    // $ANTLR start "rule__ComandosValidadores__VerifiqueAssignment"
    // InternalAtad.g:830:1: rule__ComandosValidadores__VerifiqueAssignment : ( ruleVerifique ) ;
    public final void rule__ComandosValidadores__VerifiqueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:834:1: ( ( ruleVerifique ) )
            // InternalAtad.g:835:2: ( ruleVerifique )
            {
            // InternalAtad.g:835:2: ( ruleVerifique )
            // InternalAtad.g:836:3: ruleVerifique
            {
             before(grammarAccess.getComandosValidadoresAccess().getVerifiqueVerifiqueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVerifique();

            state._fsp--;

             after(grammarAccess.getComandosValidadoresAccess().getVerifiqueVerifiqueParserRuleCall_0()); 

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
    // $ANTLR end "rule__ComandosValidadores__VerifiqueAssignment"


    // $ANTLR start "rule__AdicaoComando__ComandoAssignment_1"
    // InternalAtad.g:845:1: rule__AdicaoComando__ComandoAssignment_1 : ( ruleComandosAcao ) ;
    public final void rule__AdicaoComando__ComandoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:849:1: ( ( ruleComandosAcao ) )
            // InternalAtad.g:850:2: ( ruleComandosAcao )
            {
            // InternalAtad.g:850:2: ( ruleComandosAcao )
            // InternalAtad.g:851:3: ruleComandosAcao
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000006E802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006800L});

}