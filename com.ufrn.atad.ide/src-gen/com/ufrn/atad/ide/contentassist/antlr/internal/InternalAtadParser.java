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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'xpath'", "'id'", "'cssSelector'", "'className'", "'linkText'", "'clicar'", "'em'", "'navegar'", "'escrever'", "'no'", "'Espere'", "'estar presente'", "'estar visivel'", "'estar clicavel'", "'Verifique'", "'que'", "'o'", "'texto'", "'esta'", "'presente'", "'nao'", "'E'", "'Quando'"
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

                if ( (LA1_0==16||(LA1_0>=18 && LA1_0<=19)||LA1_0==21||LA1_0==25||(LA1_0>=32 && LA1_0<=33)) ) {
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


    // $ANTLR start "entryRuleEspera"
    // InternalAtad.g:203:1: entryRuleEspera : ruleEspera EOF ;
    public final void entryRuleEspera() throws RecognitionException {
        try {
            // InternalAtad.g:204:1: ( ruleEspera EOF )
            // InternalAtad.g:205:1: ruleEspera EOF
            {
             before(grammarAccess.getEsperaRule()); 
            pushFollow(FOLLOW_1);
            ruleEspera();

            state._fsp--;

             after(grammarAccess.getEsperaRule()); 
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
    // $ANTLR end "entryRuleEspera"


    // $ANTLR start "ruleEspera"
    // InternalAtad.g:212:1: ruleEspera : ( ( rule__Espera__Alternatives ) ) ;
    public final void ruleEspera() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:216:2: ( ( ( rule__Espera__Alternatives ) ) )
            // InternalAtad.g:217:2: ( ( rule__Espera__Alternatives ) )
            {
            // InternalAtad.g:217:2: ( ( rule__Espera__Alternatives ) )
            // InternalAtad.g:218:3: ( rule__Espera__Alternatives )
            {
             before(grammarAccess.getEsperaAccess().getAlternatives()); 
            // InternalAtad.g:219:3: ( rule__Espera__Alternatives )
            // InternalAtad.g:219:4: rule__Espera__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Espera__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEsperaAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEspera"


    // $ANTLR start "entryRuleEsperaPresente"
    // InternalAtad.g:228:1: entryRuleEsperaPresente : ruleEsperaPresente EOF ;
    public final void entryRuleEsperaPresente() throws RecognitionException {
        try {
            // InternalAtad.g:229:1: ( ruleEsperaPresente EOF )
            // InternalAtad.g:230:1: ruleEsperaPresente EOF
            {
             before(grammarAccess.getEsperaPresenteRule()); 
            pushFollow(FOLLOW_1);
            ruleEsperaPresente();

            state._fsp--;

             after(grammarAccess.getEsperaPresenteRule()); 
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
    // $ANTLR end "entryRuleEsperaPresente"


    // $ANTLR start "ruleEsperaPresente"
    // InternalAtad.g:237:1: ruleEsperaPresente : ( ( rule__EsperaPresente__Group__0 ) ) ;
    public final void ruleEsperaPresente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:241:2: ( ( ( rule__EsperaPresente__Group__0 ) ) )
            // InternalAtad.g:242:2: ( ( rule__EsperaPresente__Group__0 ) )
            {
            // InternalAtad.g:242:2: ( ( rule__EsperaPresente__Group__0 ) )
            // InternalAtad.g:243:3: ( rule__EsperaPresente__Group__0 )
            {
             before(grammarAccess.getEsperaPresenteAccess().getGroup()); 
            // InternalAtad.g:244:3: ( rule__EsperaPresente__Group__0 )
            // InternalAtad.g:244:4: rule__EsperaPresente__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EsperaPresente__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEsperaPresenteAccess().getGroup()); 

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
    // $ANTLR end "ruleEsperaPresente"


    // $ANTLR start "entryRuleEsperaVisivel"
    // InternalAtad.g:253:1: entryRuleEsperaVisivel : ruleEsperaVisivel EOF ;
    public final void entryRuleEsperaVisivel() throws RecognitionException {
        try {
            // InternalAtad.g:254:1: ( ruleEsperaVisivel EOF )
            // InternalAtad.g:255:1: ruleEsperaVisivel EOF
            {
             before(grammarAccess.getEsperaVisivelRule()); 
            pushFollow(FOLLOW_1);
            ruleEsperaVisivel();

            state._fsp--;

             after(grammarAccess.getEsperaVisivelRule()); 
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
    // $ANTLR end "entryRuleEsperaVisivel"


    // $ANTLR start "ruleEsperaVisivel"
    // InternalAtad.g:262:1: ruleEsperaVisivel : ( ( rule__EsperaVisivel__Group__0 ) ) ;
    public final void ruleEsperaVisivel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:266:2: ( ( ( rule__EsperaVisivel__Group__0 ) ) )
            // InternalAtad.g:267:2: ( ( rule__EsperaVisivel__Group__0 ) )
            {
            // InternalAtad.g:267:2: ( ( rule__EsperaVisivel__Group__0 ) )
            // InternalAtad.g:268:3: ( rule__EsperaVisivel__Group__0 )
            {
             before(grammarAccess.getEsperaVisivelAccess().getGroup()); 
            // InternalAtad.g:269:3: ( rule__EsperaVisivel__Group__0 )
            // InternalAtad.g:269:4: rule__EsperaVisivel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EsperaVisivel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEsperaVisivelAccess().getGroup()); 

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
    // $ANTLR end "ruleEsperaVisivel"


    // $ANTLR start "entryRuleEsperaClicavel"
    // InternalAtad.g:278:1: entryRuleEsperaClicavel : ruleEsperaClicavel EOF ;
    public final void entryRuleEsperaClicavel() throws RecognitionException {
        try {
            // InternalAtad.g:279:1: ( ruleEsperaClicavel EOF )
            // InternalAtad.g:280:1: ruleEsperaClicavel EOF
            {
             before(grammarAccess.getEsperaClicavelRule()); 
            pushFollow(FOLLOW_1);
            ruleEsperaClicavel();

            state._fsp--;

             after(grammarAccess.getEsperaClicavelRule()); 
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
    // $ANTLR end "entryRuleEsperaClicavel"


    // $ANTLR start "ruleEsperaClicavel"
    // InternalAtad.g:287:1: ruleEsperaClicavel : ( ( rule__EsperaClicavel__Group__0 ) ) ;
    public final void ruleEsperaClicavel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:291:2: ( ( ( rule__EsperaClicavel__Group__0 ) ) )
            // InternalAtad.g:292:2: ( ( rule__EsperaClicavel__Group__0 ) )
            {
            // InternalAtad.g:292:2: ( ( rule__EsperaClicavel__Group__0 ) )
            // InternalAtad.g:293:3: ( rule__EsperaClicavel__Group__0 )
            {
             before(grammarAccess.getEsperaClicavelAccess().getGroup()); 
            // InternalAtad.g:294:3: ( rule__EsperaClicavel__Group__0 )
            // InternalAtad.g:294:4: rule__EsperaClicavel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EsperaClicavel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEsperaClicavelAccess().getGroup()); 

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
    // $ANTLR end "ruleEsperaClicavel"


    // $ANTLR start "entryRuleVerifiquePresente"
    // InternalAtad.g:303:1: entryRuleVerifiquePresente : ruleVerifiquePresente EOF ;
    public final void entryRuleVerifiquePresente() throws RecognitionException {
        try {
            // InternalAtad.g:304:1: ( ruleVerifiquePresente EOF )
            // InternalAtad.g:305:1: ruleVerifiquePresente EOF
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
    // InternalAtad.g:312:1: ruleVerifiquePresente : ( ( rule__VerifiquePresente__Group__0 ) ) ;
    public final void ruleVerifiquePresente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:316:2: ( ( ( rule__VerifiquePresente__Group__0 ) ) )
            // InternalAtad.g:317:2: ( ( rule__VerifiquePresente__Group__0 ) )
            {
            // InternalAtad.g:317:2: ( ( rule__VerifiquePresente__Group__0 ) )
            // InternalAtad.g:318:3: ( rule__VerifiquePresente__Group__0 )
            {
             before(grammarAccess.getVerifiquePresenteAccess().getGroup()); 
            // InternalAtad.g:319:3: ( rule__VerifiquePresente__Group__0 )
            // InternalAtad.g:319:4: rule__VerifiquePresente__Group__0
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
    // InternalAtad.g:328:1: entryRuleVerifiqueNaoPresente : ruleVerifiqueNaoPresente EOF ;
    public final void entryRuleVerifiqueNaoPresente() throws RecognitionException {
        try {
            // InternalAtad.g:329:1: ( ruleVerifiqueNaoPresente EOF )
            // InternalAtad.g:330:1: ruleVerifiqueNaoPresente EOF
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
    // InternalAtad.g:337:1: ruleVerifiqueNaoPresente : ( ( rule__VerifiqueNaoPresente__Group__0 ) ) ;
    public final void ruleVerifiqueNaoPresente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:341:2: ( ( ( rule__VerifiqueNaoPresente__Group__0 ) ) )
            // InternalAtad.g:342:2: ( ( rule__VerifiqueNaoPresente__Group__0 ) )
            {
            // InternalAtad.g:342:2: ( ( rule__VerifiqueNaoPresente__Group__0 ) )
            // InternalAtad.g:343:3: ( rule__VerifiqueNaoPresente__Group__0 )
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getGroup()); 
            // InternalAtad.g:344:3: ( rule__VerifiqueNaoPresente__Group__0 )
            // InternalAtad.g:344:4: rule__VerifiqueNaoPresente__Group__0
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
    // InternalAtad.g:353:1: entryRuleComandosValidadores : ruleComandosValidadores EOF ;
    public final void entryRuleComandosValidadores() throws RecognitionException {
        try {
            // InternalAtad.g:354:1: ( ruleComandosValidadores EOF )
            // InternalAtad.g:355:1: ruleComandosValidadores EOF
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
    // InternalAtad.g:362:1: ruleComandosValidadores : ( ( rule__ComandosValidadores__Alternatives ) ) ;
    public final void ruleComandosValidadores() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:366:2: ( ( ( rule__ComandosValidadores__Alternatives ) ) )
            // InternalAtad.g:367:2: ( ( rule__ComandosValidadores__Alternatives ) )
            {
            // InternalAtad.g:367:2: ( ( rule__ComandosValidadores__Alternatives ) )
            // InternalAtad.g:368:3: ( rule__ComandosValidadores__Alternatives )
            {
             before(grammarAccess.getComandosValidadoresAccess().getAlternatives()); 
            // InternalAtad.g:369:3: ( rule__ComandosValidadores__Alternatives )
            // InternalAtad.g:369:4: rule__ComandosValidadores__Alternatives
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
    // InternalAtad.g:378:1: entryRuleAdicaoComando : ruleAdicaoComando EOF ;
    public final void entryRuleAdicaoComando() throws RecognitionException {
        try {
            // InternalAtad.g:379:1: ( ruleAdicaoComando EOF )
            // InternalAtad.g:380:1: ruleAdicaoComando EOF
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
    // InternalAtad.g:387:1: ruleAdicaoComando : ( ( rule__AdicaoComando__Group__0 ) ) ;
    public final void ruleAdicaoComando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:391:2: ( ( ( rule__AdicaoComando__Group__0 ) ) )
            // InternalAtad.g:392:2: ( ( rule__AdicaoComando__Group__0 ) )
            {
            // InternalAtad.g:392:2: ( ( rule__AdicaoComando__Group__0 ) )
            // InternalAtad.g:393:3: ( rule__AdicaoComando__Group__0 )
            {
             before(grammarAccess.getAdicaoComandoAccess().getGroup()); 
            // InternalAtad.g:394:3: ( rule__AdicaoComando__Group__0 )
            // InternalAtad.g:394:4: rule__AdicaoComando__Group__0
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
    // InternalAtad.g:403:1: entryRuleQuando : ruleQuando EOF ;
    public final void entryRuleQuando() throws RecognitionException {
        try {
            // InternalAtad.g:404:1: ( ruleQuando EOF )
            // InternalAtad.g:405:1: ruleQuando EOF
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
    // InternalAtad.g:412:1: ruleQuando : ( ( rule__Quando__Group__0 ) ) ;
    public final void ruleQuando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:416:2: ( ( ( rule__Quando__Group__0 ) ) )
            // InternalAtad.g:417:2: ( ( rule__Quando__Group__0 ) )
            {
            // InternalAtad.g:417:2: ( ( rule__Quando__Group__0 ) )
            // InternalAtad.g:418:3: ( rule__Quando__Group__0 )
            {
             before(grammarAccess.getQuandoAccess().getGroup()); 
            // InternalAtad.g:419:3: ( rule__Quando__Group__0 )
            // InternalAtad.g:419:4: rule__Quando__Group__0
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


    // $ANTLR start "ruleTipoLocalizadores"
    // InternalAtad.g:428:1: ruleTipoLocalizadores : ( ( rule__TipoLocalizadores__Alternatives ) ) ;
    public final void ruleTipoLocalizadores() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:432:1: ( ( ( rule__TipoLocalizadores__Alternatives ) ) )
            // InternalAtad.g:433:2: ( ( rule__TipoLocalizadores__Alternatives ) )
            {
            // InternalAtad.g:433:2: ( ( rule__TipoLocalizadores__Alternatives ) )
            // InternalAtad.g:434:3: ( rule__TipoLocalizadores__Alternatives )
            {
             before(grammarAccess.getTipoLocalizadoresAccess().getAlternatives()); 
            // InternalAtad.g:435:3: ( rule__TipoLocalizadores__Alternatives )
            // InternalAtad.g:435:4: rule__TipoLocalizadores__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoLocalizadores__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoLocalizadoresAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTipoLocalizadores"


    // $ANTLR start "rule__Comando__Alternatives"
    // InternalAtad.g:443:1: rule__Comando__Alternatives : ( ( ruleComandosAcao ) | ( ruleComandosValidadores ) | ( ruleAdicaoComando ) | ( ruleQuando ) | ( ruleEspera ) );
    public final void rule__Comando__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:447:1: ( ( ruleComandosAcao ) | ( ruleComandosValidadores ) | ( ruleAdicaoComando ) | ( ruleQuando ) | ( ruleEspera ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 16:
            case 18:
            case 19:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 33:
                {
                alt2=4;
                }
                break;
            case 21:
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
                    // InternalAtad.g:448:2: ( ruleComandosAcao )
                    {
                    // InternalAtad.g:448:2: ( ruleComandosAcao )
                    // InternalAtad.g:449:3: ruleComandosAcao
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
                    // InternalAtad.g:454:2: ( ruleComandosValidadores )
                    {
                    // InternalAtad.g:454:2: ( ruleComandosValidadores )
                    // InternalAtad.g:455:3: ruleComandosValidadores
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
                    // InternalAtad.g:460:2: ( ruleAdicaoComando )
                    {
                    // InternalAtad.g:460:2: ( ruleAdicaoComando )
                    // InternalAtad.g:461:3: ruleAdicaoComando
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
                    // InternalAtad.g:466:2: ( ruleQuando )
                    {
                    // InternalAtad.g:466:2: ( ruleQuando )
                    // InternalAtad.g:467:3: ruleQuando
                    {
                     before(grammarAccess.getComandoAccess().getQuandoParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleQuando();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getQuandoParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAtad.g:472:2: ( ruleEspera )
                    {
                    // InternalAtad.g:472:2: ( ruleEspera )
                    // InternalAtad.g:473:3: ruleEspera
                    {
                     before(grammarAccess.getComandoAccess().getEsperaParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleEspera();

                    state._fsp--;

                     after(grammarAccess.getComandoAccess().getEsperaParserRuleCall_4()); 

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
    // InternalAtad.g:482:1: rule__ComandosAcao__Alternatives : ( ( ruleClicar ) | ( ruleNavegar ) | ( ruleEscrever ) );
    public final void rule__ComandosAcao__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:486:1: ( ( ruleClicar ) | ( ruleNavegar ) | ( ruleEscrever ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
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
                    // InternalAtad.g:487:2: ( ruleClicar )
                    {
                    // InternalAtad.g:487:2: ( ruleClicar )
                    // InternalAtad.g:488:3: ruleClicar
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
                    // InternalAtad.g:493:2: ( ruleNavegar )
                    {
                    // InternalAtad.g:493:2: ( ruleNavegar )
                    // InternalAtad.g:494:3: ruleNavegar
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
                    // InternalAtad.g:499:2: ( ruleEscrever )
                    {
                    // InternalAtad.g:499:2: ( ruleEscrever )
                    // InternalAtad.g:500:3: ruleEscrever
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


    // $ANTLR start "rule__Espera__Alternatives"
    // InternalAtad.g:509:1: rule__Espera__Alternatives : ( ( ruleEsperaPresente ) | ( ruleEsperaVisivel ) | ( ruleEsperaClicavel ) );
    public final void rule__Espera__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:513:1: ( ( ruleEsperaPresente ) | ( ruleEsperaVisivel ) | ( ruleEsperaClicavel ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalAtad.g:514:2: ( ruleEsperaPresente )
                    {
                    // InternalAtad.g:514:2: ( ruleEsperaPresente )
                    // InternalAtad.g:515:3: ruleEsperaPresente
                    {
                     before(grammarAccess.getEsperaAccess().getEsperaPresenteParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEsperaPresente();

                    state._fsp--;

                     after(grammarAccess.getEsperaAccess().getEsperaPresenteParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAtad.g:520:2: ( ruleEsperaVisivel )
                    {
                    // InternalAtad.g:520:2: ( ruleEsperaVisivel )
                    // InternalAtad.g:521:3: ruleEsperaVisivel
                    {
                     before(grammarAccess.getEsperaAccess().getEsperaVisivelParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEsperaVisivel();

                    state._fsp--;

                     after(grammarAccess.getEsperaAccess().getEsperaVisivelParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAtad.g:526:2: ( ruleEsperaClicavel )
                    {
                    // InternalAtad.g:526:2: ( ruleEsperaClicavel )
                    // InternalAtad.g:527:3: ruleEsperaClicavel
                    {
                     before(grammarAccess.getEsperaAccess().getEsperaClicavelParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEsperaClicavel();

                    state._fsp--;

                     after(grammarAccess.getEsperaAccess().getEsperaClicavelParserRuleCall_2()); 

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
    // $ANTLR end "rule__Espera__Alternatives"


    // $ANTLR start "rule__ComandosValidadores__Alternatives"
    // InternalAtad.g:536:1: rule__ComandosValidadores__Alternatives : ( ( ruleVerifiquePresente ) | ( ruleVerifiqueNaoPresente ) );
    public final void rule__ComandosValidadores__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:540:1: ( ( ruleVerifiquePresente ) | ( ruleVerifiqueNaoPresente ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==26) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==27) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==28) ) {
                            int LA5_4 = input.LA(5);

                            if ( (LA5_4==RULE_STRING) ) {
                                int LA5_5 = input.LA(6);

                                if ( (LA5_5==31) ) {
                                    alt5=2;
                                }
                                else if ( (LA5_5==29) ) {
                                    alt5=1;
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
                    // InternalAtad.g:541:2: ( ruleVerifiquePresente )
                    {
                    // InternalAtad.g:541:2: ( ruleVerifiquePresente )
                    // InternalAtad.g:542:3: ruleVerifiquePresente
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
                    // InternalAtad.g:547:2: ( ruleVerifiqueNaoPresente )
                    {
                    // InternalAtad.g:547:2: ( ruleVerifiqueNaoPresente )
                    // InternalAtad.g:548:3: ruleVerifiqueNaoPresente
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


    // $ANTLR start "rule__TipoLocalizadores__Alternatives"
    // InternalAtad.g:557:1: rule__TipoLocalizadores__Alternatives : ( ( ( 'xpath' ) ) | ( ( 'id' ) ) | ( ( 'cssSelector' ) ) | ( ( 'className' ) ) | ( ( 'linkText' ) ) );
    public final void rule__TipoLocalizadores__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:561:1: ( ( ( 'xpath' ) ) | ( ( 'id' ) ) | ( ( 'cssSelector' ) ) | ( ( 'className' ) ) | ( ( 'linkText' ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
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
                    // InternalAtad.g:562:2: ( ( 'xpath' ) )
                    {
                    // InternalAtad.g:562:2: ( ( 'xpath' ) )
                    // InternalAtad.g:563:3: ( 'xpath' )
                    {
                     before(grammarAccess.getTipoLocalizadoresAccess().getXPATHEnumLiteralDeclaration_0()); 
                    // InternalAtad.g:564:3: ( 'xpath' )
                    // InternalAtad.g:564:4: 'xpath'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoLocalizadoresAccess().getXPATHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAtad.g:568:2: ( ( 'id' ) )
                    {
                    // InternalAtad.g:568:2: ( ( 'id' ) )
                    // InternalAtad.g:569:3: ( 'id' )
                    {
                     before(grammarAccess.getTipoLocalizadoresAccess().getIDEnumLiteralDeclaration_1()); 
                    // InternalAtad.g:570:3: ( 'id' )
                    // InternalAtad.g:570:4: 'id'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoLocalizadoresAccess().getIDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAtad.g:574:2: ( ( 'cssSelector' ) )
                    {
                    // InternalAtad.g:574:2: ( ( 'cssSelector' ) )
                    // InternalAtad.g:575:3: ( 'cssSelector' )
                    {
                     before(grammarAccess.getTipoLocalizadoresAccess().getCSSSELECTOREnumLiteralDeclaration_2()); 
                    // InternalAtad.g:576:3: ( 'cssSelector' )
                    // InternalAtad.g:576:4: 'cssSelector'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoLocalizadoresAccess().getCSSSELECTOREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAtad.g:580:2: ( ( 'className' ) )
                    {
                    // InternalAtad.g:580:2: ( ( 'className' ) )
                    // InternalAtad.g:581:3: ( 'className' )
                    {
                     before(grammarAccess.getTipoLocalizadoresAccess().getCLASSNAMEEnumLiteralDeclaration_3()); 
                    // InternalAtad.g:582:3: ( 'className' )
                    // InternalAtad.g:582:4: 'className'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoLocalizadoresAccess().getCLASSNAMEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAtad.g:586:2: ( ( 'linkText' ) )
                    {
                    // InternalAtad.g:586:2: ( ( 'linkText' ) )
                    // InternalAtad.g:587:3: ( 'linkText' )
                    {
                     before(grammarAccess.getTipoLocalizadoresAccess().getLINKTEXTEnumLiteralDeclaration_4()); 
                    // InternalAtad.g:588:3: ( 'linkText' )
                    // InternalAtad.g:588:4: 'linkText'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoLocalizadoresAccess().getLINKTEXTEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__TipoLocalizadores__Alternatives"


    // $ANTLR start "rule__Clicar__Group__0"
    // InternalAtad.g:596:1: rule__Clicar__Group__0 : rule__Clicar__Group__0__Impl rule__Clicar__Group__1 ;
    public final void rule__Clicar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:600:1: ( rule__Clicar__Group__0__Impl rule__Clicar__Group__1 )
            // InternalAtad.g:601:2: rule__Clicar__Group__0__Impl rule__Clicar__Group__1
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
    // InternalAtad.g:608:1: rule__Clicar__Group__0__Impl : ( 'clicar' ) ;
    public final void rule__Clicar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:612:1: ( ( 'clicar' ) )
            // InternalAtad.g:613:1: ( 'clicar' )
            {
            // InternalAtad.g:613:1: ( 'clicar' )
            // InternalAtad.g:614:2: 'clicar'
            {
             before(grammarAccess.getClicarAccess().getClicarKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalAtad.g:623:1: rule__Clicar__Group__1 : rule__Clicar__Group__1__Impl rule__Clicar__Group__2 ;
    public final void rule__Clicar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:627:1: ( rule__Clicar__Group__1__Impl rule__Clicar__Group__2 )
            // InternalAtad.g:628:2: rule__Clicar__Group__1__Impl rule__Clicar__Group__2
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
    // InternalAtad.g:635:1: rule__Clicar__Group__1__Impl : ( 'em' ) ;
    public final void rule__Clicar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:639:1: ( ( 'em' ) )
            // InternalAtad.g:640:1: ( 'em' )
            {
            // InternalAtad.g:640:1: ( 'em' )
            // InternalAtad.g:641:2: 'em'
            {
             before(grammarAccess.getClicarAccess().getEmKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalAtad.g:650:1: rule__Clicar__Group__2 : rule__Clicar__Group__2__Impl rule__Clicar__Group__3 ;
    public final void rule__Clicar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:654:1: ( rule__Clicar__Group__2__Impl rule__Clicar__Group__3 )
            // InternalAtad.g:655:2: rule__Clicar__Group__2__Impl rule__Clicar__Group__3
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
    // InternalAtad.g:662:1: rule__Clicar__Group__2__Impl : ( ( rule__Clicar__TipoLocalizadorAssignment_2 ) ) ;
    public final void rule__Clicar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:666:1: ( ( ( rule__Clicar__TipoLocalizadorAssignment_2 ) ) )
            // InternalAtad.g:667:1: ( ( rule__Clicar__TipoLocalizadorAssignment_2 ) )
            {
            // InternalAtad.g:667:1: ( ( rule__Clicar__TipoLocalizadorAssignment_2 ) )
            // InternalAtad.g:668:2: ( rule__Clicar__TipoLocalizadorAssignment_2 )
            {
             before(grammarAccess.getClicarAccess().getTipoLocalizadorAssignment_2()); 
            // InternalAtad.g:669:2: ( rule__Clicar__TipoLocalizadorAssignment_2 )
            // InternalAtad.g:669:3: rule__Clicar__TipoLocalizadorAssignment_2
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
    // InternalAtad.g:677:1: rule__Clicar__Group__3 : rule__Clicar__Group__3__Impl ;
    public final void rule__Clicar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:681:1: ( rule__Clicar__Group__3__Impl )
            // InternalAtad.g:682:2: rule__Clicar__Group__3__Impl
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
    // InternalAtad.g:688:1: rule__Clicar__Group__3__Impl : ( ( rule__Clicar__NameAssignment_3 ) ) ;
    public final void rule__Clicar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:692:1: ( ( ( rule__Clicar__NameAssignment_3 ) ) )
            // InternalAtad.g:693:1: ( ( rule__Clicar__NameAssignment_3 ) )
            {
            // InternalAtad.g:693:1: ( ( rule__Clicar__NameAssignment_3 ) )
            // InternalAtad.g:694:2: ( rule__Clicar__NameAssignment_3 )
            {
             before(grammarAccess.getClicarAccess().getNameAssignment_3()); 
            // InternalAtad.g:695:2: ( rule__Clicar__NameAssignment_3 )
            // InternalAtad.g:695:3: rule__Clicar__NameAssignment_3
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
    // InternalAtad.g:704:1: rule__Navegar__Group__0 : rule__Navegar__Group__0__Impl rule__Navegar__Group__1 ;
    public final void rule__Navegar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:708:1: ( rule__Navegar__Group__0__Impl rule__Navegar__Group__1 )
            // InternalAtad.g:709:2: rule__Navegar__Group__0__Impl rule__Navegar__Group__1
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
    // InternalAtad.g:716:1: rule__Navegar__Group__0__Impl : ( 'navegar' ) ;
    public final void rule__Navegar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:720:1: ( ( 'navegar' ) )
            // InternalAtad.g:721:1: ( 'navegar' )
            {
            // InternalAtad.g:721:1: ( 'navegar' )
            // InternalAtad.g:722:2: 'navegar'
            {
             before(grammarAccess.getNavegarAccess().getNavegarKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalAtad.g:731:1: rule__Navegar__Group__1 : rule__Navegar__Group__1__Impl ;
    public final void rule__Navegar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:735:1: ( rule__Navegar__Group__1__Impl )
            // InternalAtad.g:736:2: rule__Navegar__Group__1__Impl
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
    // InternalAtad.g:742:1: rule__Navegar__Group__1__Impl : ( ( rule__Navegar__NameAssignment_1 ) ) ;
    public final void rule__Navegar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:746:1: ( ( ( rule__Navegar__NameAssignment_1 ) ) )
            // InternalAtad.g:747:1: ( ( rule__Navegar__NameAssignment_1 ) )
            {
            // InternalAtad.g:747:1: ( ( rule__Navegar__NameAssignment_1 ) )
            // InternalAtad.g:748:2: ( rule__Navegar__NameAssignment_1 )
            {
             before(grammarAccess.getNavegarAccess().getNameAssignment_1()); 
            // InternalAtad.g:749:2: ( rule__Navegar__NameAssignment_1 )
            // InternalAtad.g:749:3: rule__Navegar__NameAssignment_1
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
    // InternalAtad.g:758:1: rule__Escrever__Group__0 : rule__Escrever__Group__0__Impl rule__Escrever__Group__1 ;
    public final void rule__Escrever__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:762:1: ( rule__Escrever__Group__0__Impl rule__Escrever__Group__1 )
            // InternalAtad.g:763:2: rule__Escrever__Group__0__Impl rule__Escrever__Group__1
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
    // InternalAtad.g:770:1: rule__Escrever__Group__0__Impl : ( 'escrever' ) ;
    public final void rule__Escrever__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:774:1: ( ( 'escrever' ) )
            // InternalAtad.g:775:1: ( 'escrever' )
            {
            // InternalAtad.g:775:1: ( 'escrever' )
            // InternalAtad.g:776:2: 'escrever'
            {
             before(grammarAccess.getEscreverAccess().getEscreverKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalAtad.g:785:1: rule__Escrever__Group__1 : rule__Escrever__Group__1__Impl rule__Escrever__Group__2 ;
    public final void rule__Escrever__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:789:1: ( rule__Escrever__Group__1__Impl rule__Escrever__Group__2 )
            // InternalAtad.g:790:2: rule__Escrever__Group__1__Impl rule__Escrever__Group__2
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
    // InternalAtad.g:797:1: rule__Escrever__Group__1__Impl : ( 'no' ) ;
    public final void rule__Escrever__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:801:1: ( ( 'no' ) )
            // InternalAtad.g:802:1: ( 'no' )
            {
            // InternalAtad.g:802:1: ( 'no' )
            // InternalAtad.g:803:2: 'no'
            {
             before(grammarAccess.getEscreverAccess().getNoKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalAtad.g:812:1: rule__Escrever__Group__2 : rule__Escrever__Group__2__Impl rule__Escrever__Group__3 ;
    public final void rule__Escrever__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:816:1: ( rule__Escrever__Group__2__Impl rule__Escrever__Group__3 )
            // InternalAtad.g:817:2: rule__Escrever__Group__2__Impl rule__Escrever__Group__3
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
    // InternalAtad.g:824:1: rule__Escrever__Group__2__Impl : ( ( rule__Escrever__TipoLocalizadorAssignment_2 ) ) ;
    public final void rule__Escrever__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:828:1: ( ( ( rule__Escrever__TipoLocalizadorAssignment_2 ) ) )
            // InternalAtad.g:829:1: ( ( rule__Escrever__TipoLocalizadorAssignment_2 ) )
            {
            // InternalAtad.g:829:1: ( ( rule__Escrever__TipoLocalizadorAssignment_2 ) )
            // InternalAtad.g:830:2: ( rule__Escrever__TipoLocalizadorAssignment_2 )
            {
             before(grammarAccess.getEscreverAccess().getTipoLocalizadorAssignment_2()); 
            // InternalAtad.g:831:2: ( rule__Escrever__TipoLocalizadorAssignment_2 )
            // InternalAtad.g:831:3: rule__Escrever__TipoLocalizadorAssignment_2
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
    // InternalAtad.g:839:1: rule__Escrever__Group__3 : rule__Escrever__Group__3__Impl rule__Escrever__Group__4 ;
    public final void rule__Escrever__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:843:1: ( rule__Escrever__Group__3__Impl rule__Escrever__Group__4 )
            // InternalAtad.g:844:2: rule__Escrever__Group__3__Impl rule__Escrever__Group__4
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
    // InternalAtad.g:851:1: rule__Escrever__Group__3__Impl : ( ( rule__Escrever__NameAssignment_3 ) ) ;
    public final void rule__Escrever__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:855:1: ( ( ( rule__Escrever__NameAssignment_3 ) ) )
            // InternalAtad.g:856:1: ( ( rule__Escrever__NameAssignment_3 ) )
            {
            // InternalAtad.g:856:1: ( ( rule__Escrever__NameAssignment_3 ) )
            // InternalAtad.g:857:2: ( rule__Escrever__NameAssignment_3 )
            {
             before(grammarAccess.getEscreverAccess().getNameAssignment_3()); 
            // InternalAtad.g:858:2: ( rule__Escrever__NameAssignment_3 )
            // InternalAtad.g:858:3: rule__Escrever__NameAssignment_3
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
    // InternalAtad.g:866:1: rule__Escrever__Group__4 : rule__Escrever__Group__4__Impl ;
    public final void rule__Escrever__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:870:1: ( rule__Escrever__Group__4__Impl )
            // InternalAtad.g:871:2: rule__Escrever__Group__4__Impl
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
    // InternalAtad.g:877:1: rule__Escrever__Group__4__Impl : ( ( rule__Escrever__ConteudoAssignment_4 ) ) ;
    public final void rule__Escrever__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:881:1: ( ( ( rule__Escrever__ConteudoAssignment_4 ) ) )
            // InternalAtad.g:882:1: ( ( rule__Escrever__ConteudoAssignment_4 ) )
            {
            // InternalAtad.g:882:1: ( ( rule__Escrever__ConteudoAssignment_4 ) )
            // InternalAtad.g:883:2: ( rule__Escrever__ConteudoAssignment_4 )
            {
             before(grammarAccess.getEscreverAccess().getConteudoAssignment_4()); 
            // InternalAtad.g:884:2: ( rule__Escrever__ConteudoAssignment_4 )
            // InternalAtad.g:884:3: rule__Escrever__ConteudoAssignment_4
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


    // $ANTLR start "rule__EsperaPresente__Group__0"
    // InternalAtad.g:893:1: rule__EsperaPresente__Group__0 : rule__EsperaPresente__Group__0__Impl rule__EsperaPresente__Group__1 ;
    public final void rule__EsperaPresente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:897:1: ( rule__EsperaPresente__Group__0__Impl rule__EsperaPresente__Group__1 )
            // InternalAtad.g:898:2: rule__EsperaPresente__Group__0__Impl rule__EsperaPresente__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EsperaPresente__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EsperaPresente__Group__1();

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
    // $ANTLR end "rule__EsperaPresente__Group__0"


    // $ANTLR start "rule__EsperaPresente__Group__0__Impl"
    // InternalAtad.g:905:1: rule__EsperaPresente__Group__0__Impl : ( 'Espere' ) ;
    public final void rule__EsperaPresente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:909:1: ( ( 'Espere' ) )
            // InternalAtad.g:910:1: ( 'Espere' )
            {
            // InternalAtad.g:910:1: ( 'Espere' )
            // InternalAtad.g:911:2: 'Espere'
            {
             before(grammarAccess.getEsperaPresenteAccess().getEspereKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEsperaPresenteAccess().getEspereKeyword_0()); 

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
    // $ANTLR end "rule__EsperaPresente__Group__0__Impl"


    // $ANTLR start "rule__EsperaPresente__Group__1"
    // InternalAtad.g:920:1: rule__EsperaPresente__Group__1 : rule__EsperaPresente__Group__1__Impl rule__EsperaPresente__Group__2 ;
    public final void rule__EsperaPresente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:924:1: ( rule__EsperaPresente__Group__1__Impl rule__EsperaPresente__Group__2 )
            // InternalAtad.g:925:2: rule__EsperaPresente__Group__1__Impl rule__EsperaPresente__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__EsperaPresente__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EsperaPresente__Group__2();

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
    // $ANTLR end "rule__EsperaPresente__Group__1"


    // $ANTLR start "rule__EsperaPresente__Group__1__Impl"
    // InternalAtad.g:932:1: rule__EsperaPresente__Group__1__Impl : ( ( rule__EsperaPresente__TipoLocalizadorAssignment_1 ) ) ;
    public final void rule__EsperaPresente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:936:1: ( ( ( rule__EsperaPresente__TipoLocalizadorAssignment_1 ) ) )
            // InternalAtad.g:937:1: ( ( rule__EsperaPresente__TipoLocalizadorAssignment_1 ) )
            {
            // InternalAtad.g:937:1: ( ( rule__EsperaPresente__TipoLocalizadorAssignment_1 ) )
            // InternalAtad.g:938:2: ( rule__EsperaPresente__TipoLocalizadorAssignment_1 )
            {
             before(grammarAccess.getEsperaPresenteAccess().getTipoLocalizadorAssignment_1()); 
            // InternalAtad.g:939:2: ( rule__EsperaPresente__TipoLocalizadorAssignment_1 )
            // InternalAtad.g:939:3: rule__EsperaPresente__TipoLocalizadorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EsperaPresente__TipoLocalizadorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEsperaPresenteAccess().getTipoLocalizadorAssignment_1()); 

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
    // $ANTLR end "rule__EsperaPresente__Group__1__Impl"


    // $ANTLR start "rule__EsperaPresente__Group__2"
    // InternalAtad.g:947:1: rule__EsperaPresente__Group__2 : rule__EsperaPresente__Group__2__Impl rule__EsperaPresente__Group__3 ;
    public final void rule__EsperaPresente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:951:1: ( rule__EsperaPresente__Group__2__Impl rule__EsperaPresente__Group__3 )
            // InternalAtad.g:952:2: rule__EsperaPresente__Group__2__Impl rule__EsperaPresente__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__EsperaPresente__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EsperaPresente__Group__3();

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
    // $ANTLR end "rule__EsperaPresente__Group__2"


    // $ANTLR start "rule__EsperaPresente__Group__2__Impl"
    // InternalAtad.g:959:1: rule__EsperaPresente__Group__2__Impl : ( ( rule__EsperaPresente__NameAssignment_2 ) ) ;
    public final void rule__EsperaPresente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:963:1: ( ( ( rule__EsperaPresente__NameAssignment_2 ) ) )
            // InternalAtad.g:964:1: ( ( rule__EsperaPresente__NameAssignment_2 ) )
            {
            // InternalAtad.g:964:1: ( ( rule__EsperaPresente__NameAssignment_2 ) )
            // InternalAtad.g:965:2: ( rule__EsperaPresente__NameAssignment_2 )
            {
             before(grammarAccess.getEsperaPresenteAccess().getNameAssignment_2()); 
            // InternalAtad.g:966:2: ( rule__EsperaPresente__NameAssignment_2 )
            // InternalAtad.g:966:3: rule__EsperaPresente__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EsperaPresente__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEsperaPresenteAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__EsperaPresente__Group__2__Impl"


    // $ANTLR start "rule__EsperaPresente__Group__3"
    // InternalAtad.g:974:1: rule__EsperaPresente__Group__3 : rule__EsperaPresente__Group__3__Impl ;
    public final void rule__EsperaPresente__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:978:1: ( rule__EsperaPresente__Group__3__Impl )
            // InternalAtad.g:979:2: rule__EsperaPresente__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EsperaPresente__Group__3__Impl();

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
    // $ANTLR end "rule__EsperaPresente__Group__3"


    // $ANTLR start "rule__EsperaPresente__Group__3__Impl"
    // InternalAtad.g:985:1: rule__EsperaPresente__Group__3__Impl : ( 'estar presente' ) ;
    public final void rule__EsperaPresente__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:989:1: ( ( 'estar presente' ) )
            // InternalAtad.g:990:1: ( 'estar presente' )
            {
            // InternalAtad.g:990:1: ( 'estar presente' )
            // InternalAtad.g:991:2: 'estar presente'
            {
             before(grammarAccess.getEsperaPresenteAccess().getEstarPresenteKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEsperaPresenteAccess().getEstarPresenteKeyword_3()); 

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
    // $ANTLR end "rule__EsperaPresente__Group__3__Impl"


    // $ANTLR start "rule__EsperaVisivel__Group__0"
    // InternalAtad.g:1001:1: rule__EsperaVisivel__Group__0 : rule__EsperaVisivel__Group__0__Impl rule__EsperaVisivel__Group__1 ;
    public final void rule__EsperaVisivel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1005:1: ( rule__EsperaVisivel__Group__0__Impl rule__EsperaVisivel__Group__1 )
            // InternalAtad.g:1006:2: rule__EsperaVisivel__Group__0__Impl rule__EsperaVisivel__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EsperaVisivel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EsperaVisivel__Group__1();

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
    // $ANTLR end "rule__EsperaVisivel__Group__0"


    // $ANTLR start "rule__EsperaVisivel__Group__0__Impl"
    // InternalAtad.g:1013:1: rule__EsperaVisivel__Group__0__Impl : ( 'Espere' ) ;
    public final void rule__EsperaVisivel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1017:1: ( ( 'Espere' ) )
            // InternalAtad.g:1018:1: ( 'Espere' )
            {
            // InternalAtad.g:1018:1: ( 'Espere' )
            // InternalAtad.g:1019:2: 'Espere'
            {
             before(grammarAccess.getEsperaVisivelAccess().getEspereKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEsperaVisivelAccess().getEspereKeyword_0()); 

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
    // $ANTLR end "rule__EsperaVisivel__Group__0__Impl"


    // $ANTLR start "rule__EsperaVisivel__Group__1"
    // InternalAtad.g:1028:1: rule__EsperaVisivel__Group__1 : rule__EsperaVisivel__Group__1__Impl rule__EsperaVisivel__Group__2 ;
    public final void rule__EsperaVisivel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1032:1: ( rule__EsperaVisivel__Group__1__Impl rule__EsperaVisivel__Group__2 )
            // InternalAtad.g:1033:2: rule__EsperaVisivel__Group__1__Impl rule__EsperaVisivel__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__EsperaVisivel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EsperaVisivel__Group__2();

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
    // $ANTLR end "rule__EsperaVisivel__Group__1"


    // $ANTLR start "rule__EsperaVisivel__Group__1__Impl"
    // InternalAtad.g:1040:1: rule__EsperaVisivel__Group__1__Impl : ( ( rule__EsperaVisivel__TipoLocalizadorAssignment_1 ) ) ;
    public final void rule__EsperaVisivel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1044:1: ( ( ( rule__EsperaVisivel__TipoLocalizadorAssignment_1 ) ) )
            // InternalAtad.g:1045:1: ( ( rule__EsperaVisivel__TipoLocalizadorAssignment_1 ) )
            {
            // InternalAtad.g:1045:1: ( ( rule__EsperaVisivel__TipoLocalizadorAssignment_1 ) )
            // InternalAtad.g:1046:2: ( rule__EsperaVisivel__TipoLocalizadorAssignment_1 )
            {
             before(grammarAccess.getEsperaVisivelAccess().getTipoLocalizadorAssignment_1()); 
            // InternalAtad.g:1047:2: ( rule__EsperaVisivel__TipoLocalizadorAssignment_1 )
            // InternalAtad.g:1047:3: rule__EsperaVisivel__TipoLocalizadorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EsperaVisivel__TipoLocalizadorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEsperaVisivelAccess().getTipoLocalizadorAssignment_1()); 

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
    // $ANTLR end "rule__EsperaVisivel__Group__1__Impl"


    // $ANTLR start "rule__EsperaVisivel__Group__2"
    // InternalAtad.g:1055:1: rule__EsperaVisivel__Group__2 : rule__EsperaVisivel__Group__2__Impl rule__EsperaVisivel__Group__3 ;
    public final void rule__EsperaVisivel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1059:1: ( rule__EsperaVisivel__Group__2__Impl rule__EsperaVisivel__Group__3 )
            // InternalAtad.g:1060:2: rule__EsperaVisivel__Group__2__Impl rule__EsperaVisivel__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__EsperaVisivel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EsperaVisivel__Group__3();

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
    // $ANTLR end "rule__EsperaVisivel__Group__2"


    // $ANTLR start "rule__EsperaVisivel__Group__2__Impl"
    // InternalAtad.g:1067:1: rule__EsperaVisivel__Group__2__Impl : ( ( rule__EsperaVisivel__NameAssignment_2 ) ) ;
    public final void rule__EsperaVisivel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1071:1: ( ( ( rule__EsperaVisivel__NameAssignment_2 ) ) )
            // InternalAtad.g:1072:1: ( ( rule__EsperaVisivel__NameAssignment_2 ) )
            {
            // InternalAtad.g:1072:1: ( ( rule__EsperaVisivel__NameAssignment_2 ) )
            // InternalAtad.g:1073:2: ( rule__EsperaVisivel__NameAssignment_2 )
            {
             before(grammarAccess.getEsperaVisivelAccess().getNameAssignment_2()); 
            // InternalAtad.g:1074:2: ( rule__EsperaVisivel__NameAssignment_2 )
            // InternalAtad.g:1074:3: rule__EsperaVisivel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EsperaVisivel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEsperaVisivelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__EsperaVisivel__Group__2__Impl"


    // $ANTLR start "rule__EsperaVisivel__Group__3"
    // InternalAtad.g:1082:1: rule__EsperaVisivel__Group__3 : rule__EsperaVisivel__Group__3__Impl ;
    public final void rule__EsperaVisivel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1086:1: ( rule__EsperaVisivel__Group__3__Impl )
            // InternalAtad.g:1087:2: rule__EsperaVisivel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EsperaVisivel__Group__3__Impl();

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
    // $ANTLR end "rule__EsperaVisivel__Group__3"


    // $ANTLR start "rule__EsperaVisivel__Group__3__Impl"
    // InternalAtad.g:1093:1: rule__EsperaVisivel__Group__3__Impl : ( 'estar visivel' ) ;
    public final void rule__EsperaVisivel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1097:1: ( ( 'estar visivel' ) )
            // InternalAtad.g:1098:1: ( 'estar visivel' )
            {
            // InternalAtad.g:1098:1: ( 'estar visivel' )
            // InternalAtad.g:1099:2: 'estar visivel'
            {
             before(grammarAccess.getEsperaVisivelAccess().getEstarVisivelKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEsperaVisivelAccess().getEstarVisivelKeyword_3()); 

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
    // $ANTLR end "rule__EsperaVisivel__Group__3__Impl"


    // $ANTLR start "rule__EsperaClicavel__Group__0"
    // InternalAtad.g:1109:1: rule__EsperaClicavel__Group__0 : rule__EsperaClicavel__Group__0__Impl rule__EsperaClicavel__Group__1 ;
    public final void rule__EsperaClicavel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1113:1: ( rule__EsperaClicavel__Group__0__Impl rule__EsperaClicavel__Group__1 )
            // InternalAtad.g:1114:2: rule__EsperaClicavel__Group__0__Impl rule__EsperaClicavel__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EsperaClicavel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EsperaClicavel__Group__1();

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
    // $ANTLR end "rule__EsperaClicavel__Group__0"


    // $ANTLR start "rule__EsperaClicavel__Group__0__Impl"
    // InternalAtad.g:1121:1: rule__EsperaClicavel__Group__0__Impl : ( 'Espere' ) ;
    public final void rule__EsperaClicavel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1125:1: ( ( 'Espere' ) )
            // InternalAtad.g:1126:1: ( 'Espere' )
            {
            // InternalAtad.g:1126:1: ( 'Espere' )
            // InternalAtad.g:1127:2: 'Espere'
            {
             before(grammarAccess.getEsperaClicavelAccess().getEspereKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEsperaClicavelAccess().getEspereKeyword_0()); 

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
    // $ANTLR end "rule__EsperaClicavel__Group__0__Impl"


    // $ANTLR start "rule__EsperaClicavel__Group__1"
    // InternalAtad.g:1136:1: rule__EsperaClicavel__Group__1 : rule__EsperaClicavel__Group__1__Impl rule__EsperaClicavel__Group__2 ;
    public final void rule__EsperaClicavel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1140:1: ( rule__EsperaClicavel__Group__1__Impl rule__EsperaClicavel__Group__2 )
            // InternalAtad.g:1141:2: rule__EsperaClicavel__Group__1__Impl rule__EsperaClicavel__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__EsperaClicavel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EsperaClicavel__Group__2();

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
    // $ANTLR end "rule__EsperaClicavel__Group__1"


    // $ANTLR start "rule__EsperaClicavel__Group__1__Impl"
    // InternalAtad.g:1148:1: rule__EsperaClicavel__Group__1__Impl : ( ( rule__EsperaClicavel__TipoLocalizadorAssignment_1 ) ) ;
    public final void rule__EsperaClicavel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1152:1: ( ( ( rule__EsperaClicavel__TipoLocalizadorAssignment_1 ) ) )
            // InternalAtad.g:1153:1: ( ( rule__EsperaClicavel__TipoLocalizadorAssignment_1 ) )
            {
            // InternalAtad.g:1153:1: ( ( rule__EsperaClicavel__TipoLocalizadorAssignment_1 ) )
            // InternalAtad.g:1154:2: ( rule__EsperaClicavel__TipoLocalizadorAssignment_1 )
            {
             before(grammarAccess.getEsperaClicavelAccess().getTipoLocalizadorAssignment_1()); 
            // InternalAtad.g:1155:2: ( rule__EsperaClicavel__TipoLocalizadorAssignment_1 )
            // InternalAtad.g:1155:3: rule__EsperaClicavel__TipoLocalizadorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EsperaClicavel__TipoLocalizadorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEsperaClicavelAccess().getTipoLocalizadorAssignment_1()); 

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
    // $ANTLR end "rule__EsperaClicavel__Group__1__Impl"


    // $ANTLR start "rule__EsperaClicavel__Group__2"
    // InternalAtad.g:1163:1: rule__EsperaClicavel__Group__2 : rule__EsperaClicavel__Group__2__Impl rule__EsperaClicavel__Group__3 ;
    public final void rule__EsperaClicavel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1167:1: ( rule__EsperaClicavel__Group__2__Impl rule__EsperaClicavel__Group__3 )
            // InternalAtad.g:1168:2: rule__EsperaClicavel__Group__2__Impl rule__EsperaClicavel__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__EsperaClicavel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EsperaClicavel__Group__3();

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
    // $ANTLR end "rule__EsperaClicavel__Group__2"


    // $ANTLR start "rule__EsperaClicavel__Group__2__Impl"
    // InternalAtad.g:1175:1: rule__EsperaClicavel__Group__2__Impl : ( ( rule__EsperaClicavel__NameAssignment_2 ) ) ;
    public final void rule__EsperaClicavel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1179:1: ( ( ( rule__EsperaClicavel__NameAssignment_2 ) ) )
            // InternalAtad.g:1180:1: ( ( rule__EsperaClicavel__NameAssignment_2 ) )
            {
            // InternalAtad.g:1180:1: ( ( rule__EsperaClicavel__NameAssignment_2 ) )
            // InternalAtad.g:1181:2: ( rule__EsperaClicavel__NameAssignment_2 )
            {
             before(grammarAccess.getEsperaClicavelAccess().getNameAssignment_2()); 
            // InternalAtad.g:1182:2: ( rule__EsperaClicavel__NameAssignment_2 )
            // InternalAtad.g:1182:3: rule__EsperaClicavel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EsperaClicavel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEsperaClicavelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__EsperaClicavel__Group__2__Impl"


    // $ANTLR start "rule__EsperaClicavel__Group__3"
    // InternalAtad.g:1190:1: rule__EsperaClicavel__Group__3 : rule__EsperaClicavel__Group__3__Impl ;
    public final void rule__EsperaClicavel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1194:1: ( rule__EsperaClicavel__Group__3__Impl )
            // InternalAtad.g:1195:2: rule__EsperaClicavel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EsperaClicavel__Group__3__Impl();

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
    // $ANTLR end "rule__EsperaClicavel__Group__3"


    // $ANTLR start "rule__EsperaClicavel__Group__3__Impl"
    // InternalAtad.g:1201:1: rule__EsperaClicavel__Group__3__Impl : ( 'estar clicavel' ) ;
    public final void rule__EsperaClicavel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1205:1: ( ( 'estar clicavel' ) )
            // InternalAtad.g:1206:1: ( 'estar clicavel' )
            {
            // InternalAtad.g:1206:1: ( 'estar clicavel' )
            // InternalAtad.g:1207:2: 'estar clicavel'
            {
             before(grammarAccess.getEsperaClicavelAccess().getEstarClicavelKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEsperaClicavelAccess().getEstarClicavelKeyword_3()); 

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
    // $ANTLR end "rule__EsperaClicavel__Group__3__Impl"


    // $ANTLR start "rule__VerifiquePresente__Group__0"
    // InternalAtad.g:1217:1: rule__VerifiquePresente__Group__0 : rule__VerifiquePresente__Group__0__Impl rule__VerifiquePresente__Group__1 ;
    public final void rule__VerifiquePresente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1221:1: ( rule__VerifiquePresente__Group__0__Impl rule__VerifiquePresente__Group__1 )
            // InternalAtad.g:1222:2: rule__VerifiquePresente__Group__0__Impl rule__VerifiquePresente__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalAtad.g:1229:1: rule__VerifiquePresente__Group__0__Impl : ( 'Verifique' ) ;
    public final void rule__VerifiquePresente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1233:1: ( ( 'Verifique' ) )
            // InternalAtad.g:1234:1: ( 'Verifique' )
            {
            // InternalAtad.g:1234:1: ( 'Verifique' )
            // InternalAtad.g:1235:2: 'Verifique'
            {
             before(grammarAccess.getVerifiquePresenteAccess().getVerifiqueKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAtad.g:1244:1: rule__VerifiquePresente__Group__1 : rule__VerifiquePresente__Group__1__Impl rule__VerifiquePresente__Group__2 ;
    public final void rule__VerifiquePresente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1248:1: ( rule__VerifiquePresente__Group__1__Impl rule__VerifiquePresente__Group__2 )
            // InternalAtad.g:1249:2: rule__VerifiquePresente__Group__1__Impl rule__VerifiquePresente__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalAtad.g:1256:1: rule__VerifiquePresente__Group__1__Impl : ( 'que' ) ;
    public final void rule__VerifiquePresente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1260:1: ( ( 'que' ) )
            // InternalAtad.g:1261:1: ( 'que' )
            {
            // InternalAtad.g:1261:1: ( 'que' )
            // InternalAtad.g:1262:2: 'que'
            {
             before(grammarAccess.getVerifiquePresenteAccess().getQueKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAtad.g:1271:1: rule__VerifiquePresente__Group__2 : rule__VerifiquePresente__Group__2__Impl rule__VerifiquePresente__Group__3 ;
    public final void rule__VerifiquePresente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1275:1: ( rule__VerifiquePresente__Group__2__Impl rule__VerifiquePresente__Group__3 )
            // InternalAtad.g:1276:2: rule__VerifiquePresente__Group__2__Impl rule__VerifiquePresente__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalAtad.g:1283:1: rule__VerifiquePresente__Group__2__Impl : ( 'o' ) ;
    public final void rule__VerifiquePresente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1287:1: ( ( 'o' ) )
            // InternalAtad.g:1288:1: ( 'o' )
            {
            // InternalAtad.g:1288:1: ( 'o' )
            // InternalAtad.g:1289:2: 'o'
            {
             before(grammarAccess.getVerifiquePresenteAccess().getOKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAtad.g:1298:1: rule__VerifiquePresente__Group__3 : rule__VerifiquePresente__Group__3__Impl rule__VerifiquePresente__Group__4 ;
    public final void rule__VerifiquePresente__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1302:1: ( rule__VerifiquePresente__Group__3__Impl rule__VerifiquePresente__Group__4 )
            // InternalAtad.g:1303:2: rule__VerifiquePresente__Group__3__Impl rule__VerifiquePresente__Group__4
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
    // InternalAtad.g:1310:1: rule__VerifiquePresente__Group__3__Impl : ( 'texto' ) ;
    public final void rule__VerifiquePresente__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1314:1: ( ( 'texto' ) )
            // InternalAtad.g:1315:1: ( 'texto' )
            {
            // InternalAtad.g:1315:1: ( 'texto' )
            // InternalAtad.g:1316:2: 'texto'
            {
             before(grammarAccess.getVerifiquePresenteAccess().getTextoKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAtad.g:1325:1: rule__VerifiquePresente__Group__4 : rule__VerifiquePresente__Group__4__Impl rule__VerifiquePresente__Group__5 ;
    public final void rule__VerifiquePresente__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1329:1: ( rule__VerifiquePresente__Group__4__Impl rule__VerifiquePresente__Group__5 )
            // InternalAtad.g:1330:2: rule__VerifiquePresente__Group__4__Impl rule__VerifiquePresente__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalAtad.g:1337:1: rule__VerifiquePresente__Group__4__Impl : ( ( rule__VerifiquePresente__NameAssignment_4 ) ) ;
    public final void rule__VerifiquePresente__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1341:1: ( ( ( rule__VerifiquePresente__NameAssignment_4 ) ) )
            // InternalAtad.g:1342:1: ( ( rule__VerifiquePresente__NameAssignment_4 ) )
            {
            // InternalAtad.g:1342:1: ( ( rule__VerifiquePresente__NameAssignment_4 ) )
            // InternalAtad.g:1343:2: ( rule__VerifiquePresente__NameAssignment_4 )
            {
             before(grammarAccess.getVerifiquePresenteAccess().getNameAssignment_4()); 
            // InternalAtad.g:1344:2: ( rule__VerifiquePresente__NameAssignment_4 )
            // InternalAtad.g:1344:3: rule__VerifiquePresente__NameAssignment_4
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
    // InternalAtad.g:1352:1: rule__VerifiquePresente__Group__5 : rule__VerifiquePresente__Group__5__Impl rule__VerifiquePresente__Group__6 ;
    public final void rule__VerifiquePresente__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1356:1: ( rule__VerifiquePresente__Group__5__Impl rule__VerifiquePresente__Group__6 )
            // InternalAtad.g:1357:2: rule__VerifiquePresente__Group__5__Impl rule__VerifiquePresente__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalAtad.g:1364:1: rule__VerifiquePresente__Group__5__Impl : ( 'esta' ) ;
    public final void rule__VerifiquePresente__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1368:1: ( ( 'esta' ) )
            // InternalAtad.g:1369:1: ( 'esta' )
            {
            // InternalAtad.g:1369:1: ( 'esta' )
            // InternalAtad.g:1370:2: 'esta'
            {
             before(grammarAccess.getVerifiquePresenteAccess().getEstaKeyword_5()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAtad.g:1379:1: rule__VerifiquePresente__Group__6 : rule__VerifiquePresente__Group__6__Impl ;
    public final void rule__VerifiquePresente__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1383:1: ( rule__VerifiquePresente__Group__6__Impl )
            // InternalAtad.g:1384:2: rule__VerifiquePresente__Group__6__Impl
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
    // InternalAtad.g:1390:1: rule__VerifiquePresente__Group__6__Impl : ( 'presente' ) ;
    public final void rule__VerifiquePresente__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1394:1: ( ( 'presente' ) )
            // InternalAtad.g:1395:1: ( 'presente' )
            {
            // InternalAtad.g:1395:1: ( 'presente' )
            // InternalAtad.g:1396:2: 'presente'
            {
             before(grammarAccess.getVerifiquePresenteAccess().getPresenteKeyword_6()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAtad.g:1406:1: rule__VerifiqueNaoPresente__Group__0 : rule__VerifiqueNaoPresente__Group__0__Impl rule__VerifiqueNaoPresente__Group__1 ;
    public final void rule__VerifiqueNaoPresente__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1410:1: ( rule__VerifiqueNaoPresente__Group__0__Impl rule__VerifiqueNaoPresente__Group__1 )
            // InternalAtad.g:1411:2: rule__VerifiqueNaoPresente__Group__0__Impl rule__VerifiqueNaoPresente__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalAtad.g:1418:1: rule__VerifiqueNaoPresente__Group__0__Impl : ( 'Verifique' ) ;
    public final void rule__VerifiqueNaoPresente__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1422:1: ( ( 'Verifique' ) )
            // InternalAtad.g:1423:1: ( 'Verifique' )
            {
            // InternalAtad.g:1423:1: ( 'Verifique' )
            // InternalAtad.g:1424:2: 'Verifique'
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getVerifiqueKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAtad.g:1433:1: rule__VerifiqueNaoPresente__Group__1 : rule__VerifiqueNaoPresente__Group__1__Impl rule__VerifiqueNaoPresente__Group__2 ;
    public final void rule__VerifiqueNaoPresente__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1437:1: ( rule__VerifiqueNaoPresente__Group__1__Impl rule__VerifiqueNaoPresente__Group__2 )
            // InternalAtad.g:1438:2: rule__VerifiqueNaoPresente__Group__1__Impl rule__VerifiqueNaoPresente__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalAtad.g:1445:1: rule__VerifiqueNaoPresente__Group__1__Impl : ( 'que' ) ;
    public final void rule__VerifiqueNaoPresente__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1449:1: ( ( 'que' ) )
            // InternalAtad.g:1450:1: ( 'que' )
            {
            // InternalAtad.g:1450:1: ( 'que' )
            // InternalAtad.g:1451:2: 'que'
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getQueKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAtad.g:1460:1: rule__VerifiqueNaoPresente__Group__2 : rule__VerifiqueNaoPresente__Group__2__Impl rule__VerifiqueNaoPresente__Group__3 ;
    public final void rule__VerifiqueNaoPresente__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1464:1: ( rule__VerifiqueNaoPresente__Group__2__Impl rule__VerifiqueNaoPresente__Group__3 )
            // InternalAtad.g:1465:2: rule__VerifiqueNaoPresente__Group__2__Impl rule__VerifiqueNaoPresente__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalAtad.g:1472:1: rule__VerifiqueNaoPresente__Group__2__Impl : ( 'o' ) ;
    public final void rule__VerifiqueNaoPresente__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1476:1: ( ( 'o' ) )
            // InternalAtad.g:1477:1: ( 'o' )
            {
            // InternalAtad.g:1477:1: ( 'o' )
            // InternalAtad.g:1478:2: 'o'
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getOKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAtad.g:1487:1: rule__VerifiqueNaoPresente__Group__3 : rule__VerifiqueNaoPresente__Group__3__Impl rule__VerifiqueNaoPresente__Group__4 ;
    public final void rule__VerifiqueNaoPresente__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1491:1: ( rule__VerifiqueNaoPresente__Group__3__Impl rule__VerifiqueNaoPresente__Group__4 )
            // InternalAtad.g:1492:2: rule__VerifiqueNaoPresente__Group__3__Impl rule__VerifiqueNaoPresente__Group__4
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
    // InternalAtad.g:1499:1: rule__VerifiqueNaoPresente__Group__3__Impl : ( 'texto' ) ;
    public final void rule__VerifiqueNaoPresente__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1503:1: ( ( 'texto' ) )
            // InternalAtad.g:1504:1: ( 'texto' )
            {
            // InternalAtad.g:1504:1: ( 'texto' )
            // InternalAtad.g:1505:2: 'texto'
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getTextoKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAtad.g:1514:1: rule__VerifiqueNaoPresente__Group__4 : rule__VerifiqueNaoPresente__Group__4__Impl rule__VerifiqueNaoPresente__Group__5 ;
    public final void rule__VerifiqueNaoPresente__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1518:1: ( rule__VerifiqueNaoPresente__Group__4__Impl rule__VerifiqueNaoPresente__Group__5 )
            // InternalAtad.g:1519:2: rule__VerifiqueNaoPresente__Group__4__Impl rule__VerifiqueNaoPresente__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalAtad.g:1526:1: rule__VerifiqueNaoPresente__Group__4__Impl : ( ( rule__VerifiqueNaoPresente__NameAssignment_4 ) ) ;
    public final void rule__VerifiqueNaoPresente__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1530:1: ( ( ( rule__VerifiqueNaoPresente__NameAssignment_4 ) ) )
            // InternalAtad.g:1531:1: ( ( rule__VerifiqueNaoPresente__NameAssignment_4 ) )
            {
            // InternalAtad.g:1531:1: ( ( rule__VerifiqueNaoPresente__NameAssignment_4 ) )
            // InternalAtad.g:1532:2: ( rule__VerifiqueNaoPresente__NameAssignment_4 )
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getNameAssignment_4()); 
            // InternalAtad.g:1533:2: ( rule__VerifiqueNaoPresente__NameAssignment_4 )
            // InternalAtad.g:1533:3: rule__VerifiqueNaoPresente__NameAssignment_4
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
    // InternalAtad.g:1541:1: rule__VerifiqueNaoPresente__Group__5 : rule__VerifiqueNaoPresente__Group__5__Impl rule__VerifiqueNaoPresente__Group__6 ;
    public final void rule__VerifiqueNaoPresente__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1545:1: ( rule__VerifiqueNaoPresente__Group__5__Impl rule__VerifiqueNaoPresente__Group__6 )
            // InternalAtad.g:1546:2: rule__VerifiqueNaoPresente__Group__5__Impl rule__VerifiqueNaoPresente__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalAtad.g:1553:1: rule__VerifiqueNaoPresente__Group__5__Impl : ( 'nao' ) ;
    public final void rule__VerifiqueNaoPresente__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1557:1: ( ( 'nao' ) )
            // InternalAtad.g:1558:1: ( 'nao' )
            {
            // InternalAtad.g:1558:1: ( 'nao' )
            // InternalAtad.g:1559:2: 'nao'
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getNaoKeyword_5()); 
            match(input,31,FOLLOW_2); 
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
    // InternalAtad.g:1568:1: rule__VerifiqueNaoPresente__Group__6 : rule__VerifiqueNaoPresente__Group__6__Impl rule__VerifiqueNaoPresente__Group__7 ;
    public final void rule__VerifiqueNaoPresente__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1572:1: ( rule__VerifiqueNaoPresente__Group__6__Impl rule__VerifiqueNaoPresente__Group__7 )
            // InternalAtad.g:1573:2: rule__VerifiqueNaoPresente__Group__6__Impl rule__VerifiqueNaoPresente__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalAtad.g:1580:1: rule__VerifiqueNaoPresente__Group__6__Impl : ( 'esta' ) ;
    public final void rule__VerifiqueNaoPresente__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1584:1: ( ( 'esta' ) )
            // InternalAtad.g:1585:1: ( 'esta' )
            {
            // InternalAtad.g:1585:1: ( 'esta' )
            // InternalAtad.g:1586:2: 'esta'
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getEstaKeyword_6()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAtad.g:1595:1: rule__VerifiqueNaoPresente__Group__7 : rule__VerifiqueNaoPresente__Group__7__Impl ;
    public final void rule__VerifiqueNaoPresente__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1599:1: ( rule__VerifiqueNaoPresente__Group__7__Impl )
            // InternalAtad.g:1600:2: rule__VerifiqueNaoPresente__Group__7__Impl
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
    // InternalAtad.g:1606:1: rule__VerifiqueNaoPresente__Group__7__Impl : ( 'presente' ) ;
    public final void rule__VerifiqueNaoPresente__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1610:1: ( ( 'presente' ) )
            // InternalAtad.g:1611:1: ( 'presente' )
            {
            // InternalAtad.g:1611:1: ( 'presente' )
            // InternalAtad.g:1612:2: 'presente'
            {
             before(grammarAccess.getVerifiqueNaoPresenteAccess().getPresenteKeyword_7()); 
            match(input,30,FOLLOW_2); 
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
    // InternalAtad.g:1622:1: rule__AdicaoComando__Group__0 : rule__AdicaoComando__Group__0__Impl rule__AdicaoComando__Group__1 ;
    public final void rule__AdicaoComando__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1626:1: ( rule__AdicaoComando__Group__0__Impl rule__AdicaoComando__Group__1 )
            // InternalAtad.g:1627:2: rule__AdicaoComando__Group__0__Impl rule__AdicaoComando__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalAtad.g:1634:1: rule__AdicaoComando__Group__0__Impl : ( 'E' ) ;
    public final void rule__AdicaoComando__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1638:1: ( ( 'E' ) )
            // InternalAtad.g:1639:1: ( 'E' )
            {
            // InternalAtad.g:1639:1: ( 'E' )
            // InternalAtad.g:1640:2: 'E'
            {
             before(grammarAccess.getAdicaoComandoAccess().getEKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalAtad.g:1649:1: rule__AdicaoComando__Group__1 : rule__AdicaoComando__Group__1__Impl ;
    public final void rule__AdicaoComando__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1653:1: ( rule__AdicaoComando__Group__1__Impl )
            // InternalAtad.g:1654:2: rule__AdicaoComando__Group__1__Impl
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
    // InternalAtad.g:1660:1: rule__AdicaoComando__Group__1__Impl : ( ( rule__AdicaoComando__ComandoAssignment_1 ) ) ;
    public final void rule__AdicaoComando__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1664:1: ( ( ( rule__AdicaoComando__ComandoAssignment_1 ) ) )
            // InternalAtad.g:1665:1: ( ( rule__AdicaoComando__ComandoAssignment_1 ) )
            {
            // InternalAtad.g:1665:1: ( ( rule__AdicaoComando__ComandoAssignment_1 ) )
            // InternalAtad.g:1666:2: ( rule__AdicaoComando__ComandoAssignment_1 )
            {
             before(grammarAccess.getAdicaoComandoAccess().getComandoAssignment_1()); 
            // InternalAtad.g:1667:2: ( rule__AdicaoComando__ComandoAssignment_1 )
            // InternalAtad.g:1667:3: rule__AdicaoComando__ComandoAssignment_1
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
    // InternalAtad.g:1676:1: rule__Quando__Group__0 : rule__Quando__Group__0__Impl rule__Quando__Group__1 ;
    public final void rule__Quando__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1680:1: ( rule__Quando__Group__0__Impl rule__Quando__Group__1 )
            // InternalAtad.g:1681:2: rule__Quando__Group__0__Impl rule__Quando__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalAtad.g:1688:1: rule__Quando__Group__0__Impl : ( 'Quando' ) ;
    public final void rule__Quando__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1692:1: ( ( 'Quando' ) )
            // InternalAtad.g:1693:1: ( 'Quando' )
            {
            // InternalAtad.g:1693:1: ( 'Quando' )
            // InternalAtad.g:1694:2: 'Quando'
            {
             before(grammarAccess.getQuandoAccess().getQuandoKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalAtad.g:1703:1: rule__Quando__Group__1 : rule__Quando__Group__1__Impl ;
    public final void rule__Quando__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1707:1: ( rule__Quando__Group__1__Impl )
            // InternalAtad.g:1708:2: rule__Quando__Group__1__Impl
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
    // InternalAtad.g:1714:1: rule__Quando__Group__1__Impl : ( ruleComandosAcao ) ;
    public final void rule__Quando__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1718:1: ( ( ruleComandosAcao ) )
            // InternalAtad.g:1719:1: ( ruleComandosAcao )
            {
            // InternalAtad.g:1719:1: ( ruleComandosAcao )
            // InternalAtad.g:1720:2: ruleComandosAcao
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
    // InternalAtad.g:1730:1: rule__DeclaraComando__ComandosAssignment : ( ruleComando ) ;
    public final void rule__DeclaraComando__ComandosAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1734:1: ( ( ruleComando ) )
            // InternalAtad.g:1735:2: ( ruleComando )
            {
            // InternalAtad.g:1735:2: ( ruleComando )
            // InternalAtad.g:1736:3: ruleComando
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
    // InternalAtad.g:1745:1: rule__Clicar__TipoLocalizadorAssignment_2 : ( ruleTipoLocalizadores ) ;
    public final void rule__Clicar__TipoLocalizadorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1749:1: ( ( ruleTipoLocalizadores ) )
            // InternalAtad.g:1750:2: ( ruleTipoLocalizadores )
            {
            // InternalAtad.g:1750:2: ( ruleTipoLocalizadores )
            // InternalAtad.g:1751:3: ruleTipoLocalizadores
            {
             before(grammarAccess.getClicarAccess().getTipoLocalizadorTipoLocalizadoresEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoLocalizadores();

            state._fsp--;

             after(grammarAccess.getClicarAccess().getTipoLocalizadorTipoLocalizadoresEnumRuleCall_2_0()); 

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
    // InternalAtad.g:1760:1: rule__Clicar__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Clicar__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1764:1: ( ( RULE_STRING ) )
            // InternalAtad.g:1765:2: ( RULE_STRING )
            {
            // InternalAtad.g:1765:2: ( RULE_STRING )
            // InternalAtad.g:1766:3: RULE_STRING
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
    // InternalAtad.g:1775:1: rule__Navegar__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Navegar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1779:1: ( ( RULE_STRING ) )
            // InternalAtad.g:1780:2: ( RULE_STRING )
            {
            // InternalAtad.g:1780:2: ( RULE_STRING )
            // InternalAtad.g:1781:3: RULE_STRING
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
    // InternalAtad.g:1790:1: rule__Escrever__TipoLocalizadorAssignment_2 : ( ruleTipoLocalizadores ) ;
    public final void rule__Escrever__TipoLocalizadorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1794:1: ( ( ruleTipoLocalizadores ) )
            // InternalAtad.g:1795:2: ( ruleTipoLocalizadores )
            {
            // InternalAtad.g:1795:2: ( ruleTipoLocalizadores )
            // InternalAtad.g:1796:3: ruleTipoLocalizadores
            {
             before(grammarAccess.getEscreverAccess().getTipoLocalizadorTipoLocalizadoresEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoLocalizadores();

            state._fsp--;

             after(grammarAccess.getEscreverAccess().getTipoLocalizadorTipoLocalizadoresEnumRuleCall_2_0()); 

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
    // InternalAtad.g:1805:1: rule__Escrever__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Escrever__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1809:1: ( ( RULE_STRING ) )
            // InternalAtad.g:1810:2: ( RULE_STRING )
            {
            // InternalAtad.g:1810:2: ( RULE_STRING )
            // InternalAtad.g:1811:3: RULE_STRING
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
    // InternalAtad.g:1820:1: rule__Escrever__ConteudoAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Escrever__ConteudoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1824:1: ( ( RULE_STRING ) )
            // InternalAtad.g:1825:2: ( RULE_STRING )
            {
            // InternalAtad.g:1825:2: ( RULE_STRING )
            // InternalAtad.g:1826:3: RULE_STRING
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


    // $ANTLR start "rule__EsperaPresente__TipoLocalizadorAssignment_1"
    // InternalAtad.g:1835:1: rule__EsperaPresente__TipoLocalizadorAssignment_1 : ( ruleTipoLocalizadores ) ;
    public final void rule__EsperaPresente__TipoLocalizadorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1839:1: ( ( ruleTipoLocalizadores ) )
            // InternalAtad.g:1840:2: ( ruleTipoLocalizadores )
            {
            // InternalAtad.g:1840:2: ( ruleTipoLocalizadores )
            // InternalAtad.g:1841:3: ruleTipoLocalizadores
            {
             before(grammarAccess.getEsperaPresenteAccess().getTipoLocalizadorTipoLocalizadoresEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoLocalizadores();

            state._fsp--;

             after(grammarAccess.getEsperaPresenteAccess().getTipoLocalizadorTipoLocalizadoresEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__EsperaPresente__TipoLocalizadorAssignment_1"


    // $ANTLR start "rule__EsperaPresente__NameAssignment_2"
    // InternalAtad.g:1850:1: rule__EsperaPresente__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EsperaPresente__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1854:1: ( ( RULE_STRING ) )
            // InternalAtad.g:1855:2: ( RULE_STRING )
            {
            // InternalAtad.g:1855:2: ( RULE_STRING )
            // InternalAtad.g:1856:3: RULE_STRING
            {
             before(grammarAccess.getEsperaPresenteAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEsperaPresenteAccess().getNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__EsperaPresente__NameAssignment_2"


    // $ANTLR start "rule__EsperaVisivel__TipoLocalizadorAssignment_1"
    // InternalAtad.g:1865:1: rule__EsperaVisivel__TipoLocalizadorAssignment_1 : ( ruleTipoLocalizadores ) ;
    public final void rule__EsperaVisivel__TipoLocalizadorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1869:1: ( ( ruleTipoLocalizadores ) )
            // InternalAtad.g:1870:2: ( ruleTipoLocalizadores )
            {
            // InternalAtad.g:1870:2: ( ruleTipoLocalizadores )
            // InternalAtad.g:1871:3: ruleTipoLocalizadores
            {
             before(grammarAccess.getEsperaVisivelAccess().getTipoLocalizadorTipoLocalizadoresEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoLocalizadores();

            state._fsp--;

             after(grammarAccess.getEsperaVisivelAccess().getTipoLocalizadorTipoLocalizadoresEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__EsperaVisivel__TipoLocalizadorAssignment_1"


    // $ANTLR start "rule__EsperaVisivel__NameAssignment_2"
    // InternalAtad.g:1880:1: rule__EsperaVisivel__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EsperaVisivel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1884:1: ( ( RULE_STRING ) )
            // InternalAtad.g:1885:2: ( RULE_STRING )
            {
            // InternalAtad.g:1885:2: ( RULE_STRING )
            // InternalAtad.g:1886:3: RULE_STRING
            {
             before(grammarAccess.getEsperaVisivelAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEsperaVisivelAccess().getNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__EsperaVisivel__NameAssignment_2"


    // $ANTLR start "rule__EsperaClicavel__TipoLocalizadorAssignment_1"
    // InternalAtad.g:1895:1: rule__EsperaClicavel__TipoLocalizadorAssignment_1 : ( ruleTipoLocalizadores ) ;
    public final void rule__EsperaClicavel__TipoLocalizadorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1899:1: ( ( ruleTipoLocalizadores ) )
            // InternalAtad.g:1900:2: ( ruleTipoLocalizadores )
            {
            // InternalAtad.g:1900:2: ( ruleTipoLocalizadores )
            // InternalAtad.g:1901:3: ruleTipoLocalizadores
            {
             before(grammarAccess.getEsperaClicavelAccess().getTipoLocalizadorTipoLocalizadoresEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoLocalizadores();

            state._fsp--;

             after(grammarAccess.getEsperaClicavelAccess().getTipoLocalizadorTipoLocalizadoresEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__EsperaClicavel__TipoLocalizadorAssignment_1"


    // $ANTLR start "rule__EsperaClicavel__NameAssignment_2"
    // InternalAtad.g:1910:1: rule__EsperaClicavel__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EsperaClicavel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1914:1: ( ( RULE_STRING ) )
            // InternalAtad.g:1915:2: ( RULE_STRING )
            {
            // InternalAtad.g:1915:2: ( RULE_STRING )
            // InternalAtad.g:1916:3: RULE_STRING
            {
             before(grammarAccess.getEsperaClicavelAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEsperaClicavelAccess().getNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__EsperaClicavel__NameAssignment_2"


    // $ANTLR start "rule__VerifiquePresente__NameAssignment_4"
    // InternalAtad.g:1925:1: rule__VerifiquePresente__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__VerifiquePresente__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1929:1: ( ( RULE_STRING ) )
            // InternalAtad.g:1930:2: ( RULE_STRING )
            {
            // InternalAtad.g:1930:2: ( RULE_STRING )
            // InternalAtad.g:1931:3: RULE_STRING
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
    // InternalAtad.g:1940:1: rule__VerifiqueNaoPresente__NameAssignment_4 : ( RULE_STRING ) ;
    public final void rule__VerifiqueNaoPresente__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1944:1: ( ( RULE_STRING ) )
            // InternalAtad.g:1945:2: ( RULE_STRING )
            {
            // InternalAtad.g:1945:2: ( RULE_STRING )
            // InternalAtad.g:1946:3: RULE_STRING
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
    // InternalAtad.g:1955:1: rule__AdicaoComando__ComandoAssignment_1 : ( ruleComandosAcao ) ;
    public final void rule__AdicaoComando__ComandoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:1959:1: ( ( ruleComandosAcao ) )
            // InternalAtad.g:1960:2: ( ruleComandosAcao )
            {
            // InternalAtad.g:1960:2: ( ruleComandosAcao )
            // InternalAtad.g:1961:3: ruleComandosAcao
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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\25\1\13\5\4\1\26\3\uffff";
    static final String dfa_3s = "\1\25\1\17\5\4\1\30\3\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\3\1\2";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\1\3\1\4\1\5\1\6",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\10\1\12\1\11",
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
            return "509:1: rule__Espera__Alternatives : ( ( ruleEsperaPresente ) | ( ruleEsperaVisivel ) | ( ruleEsperaClicavel ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000003022D0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000D0000L});

}