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
    // InternalAtad.g:62:1: ruleDeclaraComando : ( ( rule__DeclaraComando__Group__0 ) ) ;
    public final void ruleDeclaraComando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:66:2: ( ( ( rule__DeclaraComando__Group__0 ) ) )
            // InternalAtad.g:67:2: ( ( rule__DeclaraComando__Group__0 ) )
            {
            // InternalAtad.g:67:2: ( ( rule__DeclaraComando__Group__0 ) )
            // InternalAtad.g:68:3: ( rule__DeclaraComando__Group__0 )
            {
             before(grammarAccess.getDeclaraComandoAccess().getGroup()); 
            // InternalAtad.g:69:3: ( rule__DeclaraComando__Group__0 )
            // InternalAtad.g:69:4: rule__DeclaraComando__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclaraComando__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclaraComandoAccess().getGroup()); 

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


    // $ANTLR start "entryRuleClicar"
    // InternalAtad.g:78:1: entryRuleClicar : ruleClicar EOF ;
    public final void entryRuleClicar() throws RecognitionException {
        try {
            // InternalAtad.g:79:1: ( ruleClicar EOF )
            // InternalAtad.g:80:1: ruleClicar EOF
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
    // InternalAtad.g:87:1: ruleClicar : ( ( rule__Clicar__Group__0 ) ) ;
    public final void ruleClicar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:91:2: ( ( ( rule__Clicar__Group__0 ) ) )
            // InternalAtad.g:92:2: ( ( rule__Clicar__Group__0 ) )
            {
            // InternalAtad.g:92:2: ( ( rule__Clicar__Group__0 ) )
            // InternalAtad.g:93:3: ( rule__Clicar__Group__0 )
            {
             before(grammarAccess.getClicarAccess().getGroup()); 
            // InternalAtad.g:94:3: ( rule__Clicar__Group__0 )
            // InternalAtad.g:94:4: rule__Clicar__Group__0
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
    // InternalAtad.g:103:1: entryRuleNavegar : ruleNavegar EOF ;
    public final void entryRuleNavegar() throws RecognitionException {
        try {
            // InternalAtad.g:104:1: ( ruleNavegar EOF )
            // InternalAtad.g:105:1: ruleNavegar EOF
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
    // InternalAtad.g:112:1: ruleNavegar : ( ( rule__Navegar__Group__0 ) ) ;
    public final void ruleNavegar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:116:2: ( ( ( rule__Navegar__Group__0 ) ) )
            // InternalAtad.g:117:2: ( ( rule__Navegar__Group__0 ) )
            {
            // InternalAtad.g:117:2: ( ( rule__Navegar__Group__0 ) )
            // InternalAtad.g:118:3: ( rule__Navegar__Group__0 )
            {
             before(grammarAccess.getNavegarAccess().getGroup()); 
            // InternalAtad.g:119:3: ( rule__Navegar__Group__0 )
            // InternalAtad.g:119:4: rule__Navegar__Group__0
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
    // InternalAtad.g:128:1: entryRuleEscrever : ruleEscrever EOF ;
    public final void entryRuleEscrever() throws RecognitionException {
        try {
            // InternalAtad.g:129:1: ( ruleEscrever EOF )
            // InternalAtad.g:130:1: ruleEscrever EOF
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
    // InternalAtad.g:137:1: ruleEscrever : ( ( rule__Escrever__Group__0 ) ) ;
    public final void ruleEscrever() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:141:2: ( ( ( rule__Escrever__Group__0 ) ) )
            // InternalAtad.g:142:2: ( ( rule__Escrever__Group__0 ) )
            {
            // InternalAtad.g:142:2: ( ( rule__Escrever__Group__0 ) )
            // InternalAtad.g:143:3: ( rule__Escrever__Group__0 )
            {
             before(grammarAccess.getEscreverAccess().getGroup()); 
            // InternalAtad.g:144:3: ( rule__Escrever__Group__0 )
            // InternalAtad.g:144:4: rule__Escrever__Group__0
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
    // InternalAtad.g:153:1: entryRuleComandosAcao : ruleComandosAcao EOF ;
    public final void entryRuleComandosAcao() throws RecognitionException {
        try {
            // InternalAtad.g:154:1: ( ruleComandosAcao EOF )
            // InternalAtad.g:155:1: ruleComandosAcao EOF
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
    // InternalAtad.g:162:1: ruleComandosAcao : ( ( rule__ComandosAcao__Alternatives ) ) ;
    public final void ruleComandosAcao() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:166:2: ( ( ( rule__ComandosAcao__Alternatives ) ) )
            // InternalAtad.g:167:2: ( ( rule__ComandosAcao__Alternatives ) )
            {
            // InternalAtad.g:167:2: ( ( rule__ComandosAcao__Alternatives ) )
            // InternalAtad.g:168:3: ( rule__ComandosAcao__Alternatives )
            {
             before(grammarAccess.getComandosAcaoAccess().getAlternatives()); 
            // InternalAtad.g:169:3: ( rule__ComandosAcao__Alternatives )
            // InternalAtad.g:169:4: rule__ComandosAcao__Alternatives
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


    // $ANTLR start "entryRuleVerifique"
    // InternalAtad.g:178:1: entryRuleVerifique : ruleVerifique EOF ;
    public final void entryRuleVerifique() throws RecognitionException {
        try {
            // InternalAtad.g:179:1: ( ruleVerifique EOF )
            // InternalAtad.g:180:1: ruleVerifique EOF
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
    // InternalAtad.g:187:1: ruleVerifique : ( ( rule__Verifique__Group__0 ) ) ;
    public final void ruleVerifique() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:191:2: ( ( ( rule__Verifique__Group__0 ) ) )
            // InternalAtad.g:192:2: ( ( rule__Verifique__Group__0 ) )
            {
            // InternalAtad.g:192:2: ( ( rule__Verifique__Group__0 ) )
            // InternalAtad.g:193:3: ( rule__Verifique__Group__0 )
            {
             before(grammarAccess.getVerifiqueAccess().getGroup()); 
            // InternalAtad.g:194:3: ( rule__Verifique__Group__0 )
            // InternalAtad.g:194:4: rule__Verifique__Group__0
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
    // InternalAtad.g:203:1: entryRuleComandosValidadores : ruleComandosValidadores EOF ;
    public final void entryRuleComandosValidadores() throws RecognitionException {
        try {
            // InternalAtad.g:204:1: ( ruleComandosValidadores EOF )
            // InternalAtad.g:205:1: ruleComandosValidadores EOF
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
    // InternalAtad.g:212:1: ruleComandosValidadores : ( ruleVerifique ) ;
    public final void ruleComandosValidadores() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:216:2: ( ( ruleVerifique ) )
            // InternalAtad.g:217:2: ( ruleVerifique )
            {
            // InternalAtad.g:217:2: ( ruleVerifique )
            // InternalAtad.g:218:3: ruleVerifique
            {
             before(grammarAccess.getComandosValidadoresAccess().getVerifiqueParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleVerifique();

            state._fsp--;

             after(grammarAccess.getComandosValidadoresAccess().getVerifiqueParserRuleCall()); 

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
    // InternalAtad.g:228:1: entryRuleAdicaoComando : ruleAdicaoComando EOF ;
    public final void entryRuleAdicaoComando() throws RecognitionException {
        try {
            // InternalAtad.g:229:1: ( ruleAdicaoComando EOF )
            // InternalAtad.g:230:1: ruleAdicaoComando EOF
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
    // InternalAtad.g:237:1: ruleAdicaoComando : ( ( rule__AdicaoComando__Group__0 ) ) ;
    public final void ruleAdicaoComando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:241:2: ( ( ( rule__AdicaoComando__Group__0 ) ) )
            // InternalAtad.g:242:2: ( ( rule__AdicaoComando__Group__0 ) )
            {
            // InternalAtad.g:242:2: ( ( rule__AdicaoComando__Group__0 ) )
            // InternalAtad.g:243:3: ( rule__AdicaoComando__Group__0 )
            {
             before(grammarAccess.getAdicaoComandoAccess().getGroup()); 
            // InternalAtad.g:244:3: ( rule__AdicaoComando__Group__0 )
            // InternalAtad.g:244:4: rule__AdicaoComando__Group__0
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
    // InternalAtad.g:253:1: entryRuleQuando : ruleQuando EOF ;
    public final void entryRuleQuando() throws RecognitionException {
        try {
            // InternalAtad.g:254:1: ( ruleQuando EOF )
            // InternalAtad.g:255:1: ruleQuando EOF
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
    // InternalAtad.g:262:1: ruleQuando : ( ( rule__Quando__Group__0 ) ) ;
    public final void ruleQuando() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:266:2: ( ( ( rule__Quando__Group__0 ) ) )
            // InternalAtad.g:267:2: ( ( rule__Quando__Group__0 ) )
            {
            // InternalAtad.g:267:2: ( ( rule__Quando__Group__0 ) )
            // InternalAtad.g:268:3: ( rule__Quando__Group__0 )
            {
             before(grammarAccess.getQuandoAccess().getGroup()); 
            // InternalAtad.g:269:3: ( rule__Quando__Group__0 )
            // InternalAtad.g:269:4: rule__Quando__Group__0
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


    // $ANTLR start "rule__ComandosAcao__Alternatives"
    // InternalAtad.g:277:1: rule__ComandosAcao__Alternatives : ( ( ruleClicar ) | ( ruleNavegar ) | ( ruleEscrever ) );
    public final void rule__ComandosAcao__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:281:1: ( ( ruleClicar ) | ( ruleNavegar ) | ( ruleEscrever ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalAtad.g:282:2: ( ruleClicar )
                    {
                    // InternalAtad.g:282:2: ( ruleClicar )
                    // InternalAtad.g:283:3: ruleClicar
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
                    // InternalAtad.g:288:2: ( ruleNavegar )
                    {
                    // InternalAtad.g:288:2: ( ruleNavegar )
                    // InternalAtad.g:289:3: ruleNavegar
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
                    // InternalAtad.g:294:2: ( ruleEscrever )
                    {
                    // InternalAtad.g:294:2: ( ruleEscrever )
                    // InternalAtad.g:295:3: ruleEscrever
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


    // $ANTLR start "rule__DeclaraComando__Group__0"
    // InternalAtad.g:304:1: rule__DeclaraComando__Group__0 : rule__DeclaraComando__Group__0__Impl rule__DeclaraComando__Group__1 ;
    public final void rule__DeclaraComando__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:308:1: ( rule__DeclaraComando__Group__0__Impl rule__DeclaraComando__Group__1 )
            // InternalAtad.g:309:2: rule__DeclaraComando__Group__0__Impl rule__DeclaraComando__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DeclaraComando__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaraComando__Group__1();

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
    // $ANTLR end "rule__DeclaraComando__Group__0"


    // $ANTLR start "rule__DeclaraComando__Group__0__Impl"
    // InternalAtad.g:316:1: rule__DeclaraComando__Group__0__Impl : ( ( rule__DeclaraComando__ComandosAssignment_0 )* ) ;
    public final void rule__DeclaraComando__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:320:1: ( ( ( rule__DeclaraComando__ComandosAssignment_0 )* ) )
            // InternalAtad.g:321:1: ( ( rule__DeclaraComando__ComandosAssignment_0 )* )
            {
            // InternalAtad.g:321:1: ( ( rule__DeclaraComando__ComandosAssignment_0 )* )
            // InternalAtad.g:322:2: ( rule__DeclaraComando__ComandosAssignment_0 )*
            {
             before(grammarAccess.getDeclaraComandoAccess().getComandosAssignment_0()); 
            // InternalAtad.g:323:2: ( rule__DeclaraComando__ComandosAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAtad.g:323:3: rule__DeclaraComando__ComandosAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DeclaraComando__ComandosAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDeclaraComandoAccess().getComandosAssignment_0()); 

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
    // $ANTLR end "rule__DeclaraComando__Group__0__Impl"


    // $ANTLR start "rule__DeclaraComando__Group__1"
    // InternalAtad.g:331:1: rule__DeclaraComando__Group__1 : rule__DeclaraComando__Group__1__Impl rule__DeclaraComando__Group__2 ;
    public final void rule__DeclaraComando__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:335:1: ( rule__DeclaraComando__Group__1__Impl rule__DeclaraComando__Group__2 )
            // InternalAtad.g:336:2: rule__DeclaraComando__Group__1__Impl rule__DeclaraComando__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__DeclaraComando__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclaraComando__Group__2();

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
    // $ANTLR end "rule__DeclaraComando__Group__1"


    // $ANTLR start "rule__DeclaraComando__Group__1__Impl"
    // InternalAtad.g:343:1: rule__DeclaraComando__Group__1__Impl : ( ( rule__DeclaraComando__AcoesAssignment_1 )* ) ;
    public final void rule__DeclaraComando__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:347:1: ( ( ( rule__DeclaraComando__AcoesAssignment_1 )* ) )
            // InternalAtad.g:348:1: ( ( rule__DeclaraComando__AcoesAssignment_1 )* )
            {
            // InternalAtad.g:348:1: ( ( rule__DeclaraComando__AcoesAssignment_1 )* )
            // InternalAtad.g:349:2: ( rule__DeclaraComando__AcoesAssignment_1 )*
            {
             before(grammarAccess.getDeclaraComandoAccess().getAcoesAssignment_1()); 
            // InternalAtad.g:350:2: ( rule__DeclaraComando__AcoesAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAtad.g:350:3: rule__DeclaraComando__AcoesAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__DeclaraComando__AcoesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDeclaraComandoAccess().getAcoesAssignment_1()); 

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
    // $ANTLR end "rule__DeclaraComando__Group__1__Impl"


    // $ANTLR start "rule__DeclaraComando__Group__2"
    // InternalAtad.g:358:1: rule__DeclaraComando__Group__2 : rule__DeclaraComando__Group__2__Impl ;
    public final void rule__DeclaraComando__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:362:1: ( rule__DeclaraComando__Group__2__Impl )
            // InternalAtad.g:363:2: rule__DeclaraComando__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclaraComando__Group__2__Impl();

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
    // $ANTLR end "rule__DeclaraComando__Group__2"


    // $ANTLR start "rule__DeclaraComando__Group__2__Impl"
    // InternalAtad.g:369:1: rule__DeclaraComando__Group__2__Impl : ( ( rule__DeclaraComando__VerificacaoAssignment_2 )* ) ;
    public final void rule__DeclaraComando__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:373:1: ( ( ( rule__DeclaraComando__VerificacaoAssignment_2 )* ) )
            // InternalAtad.g:374:1: ( ( rule__DeclaraComando__VerificacaoAssignment_2 )* )
            {
            // InternalAtad.g:374:1: ( ( rule__DeclaraComando__VerificacaoAssignment_2 )* )
            // InternalAtad.g:375:2: ( rule__DeclaraComando__VerificacaoAssignment_2 )*
            {
             before(grammarAccess.getDeclaraComandoAccess().getVerificacaoAssignment_2()); 
            // InternalAtad.g:376:2: ( rule__DeclaraComando__VerificacaoAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAtad.g:376:3: rule__DeclaraComando__VerificacaoAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DeclaraComando__VerificacaoAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDeclaraComandoAccess().getVerificacaoAssignment_2()); 

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
    // $ANTLR end "rule__DeclaraComando__Group__2__Impl"


    // $ANTLR start "rule__Clicar__Group__0"
    // InternalAtad.g:385:1: rule__Clicar__Group__0 : rule__Clicar__Group__0__Impl rule__Clicar__Group__1 ;
    public final void rule__Clicar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:389:1: ( rule__Clicar__Group__0__Impl rule__Clicar__Group__1 )
            // InternalAtad.g:390:2: rule__Clicar__Group__0__Impl rule__Clicar__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalAtad.g:397:1: rule__Clicar__Group__0__Impl : ( 'clicar' ) ;
    public final void rule__Clicar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:401:1: ( ( 'clicar' ) )
            // InternalAtad.g:402:1: ( 'clicar' )
            {
            // InternalAtad.g:402:1: ( 'clicar' )
            // InternalAtad.g:403:2: 'clicar'
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
    // InternalAtad.g:412:1: rule__Clicar__Group__1 : rule__Clicar__Group__1__Impl rule__Clicar__Group__2 ;
    public final void rule__Clicar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:416:1: ( rule__Clicar__Group__1__Impl rule__Clicar__Group__2 )
            // InternalAtad.g:417:2: rule__Clicar__Group__1__Impl rule__Clicar__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalAtad.g:424:1: rule__Clicar__Group__1__Impl : ( 'em' ) ;
    public final void rule__Clicar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:428:1: ( ( 'em' ) )
            // InternalAtad.g:429:1: ( 'em' )
            {
            // InternalAtad.g:429:1: ( 'em' )
            // InternalAtad.g:430:2: 'em'
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
    // InternalAtad.g:439:1: rule__Clicar__Group__2 : rule__Clicar__Group__2__Impl ;
    public final void rule__Clicar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:443:1: ( rule__Clicar__Group__2__Impl )
            // InternalAtad.g:444:2: rule__Clicar__Group__2__Impl
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
    // InternalAtad.g:450:1: rule__Clicar__Group__2__Impl : ( ( rule__Clicar__NameAssignment_2 ) ) ;
    public final void rule__Clicar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:454:1: ( ( ( rule__Clicar__NameAssignment_2 ) ) )
            // InternalAtad.g:455:1: ( ( rule__Clicar__NameAssignment_2 ) )
            {
            // InternalAtad.g:455:1: ( ( rule__Clicar__NameAssignment_2 ) )
            // InternalAtad.g:456:2: ( rule__Clicar__NameAssignment_2 )
            {
             before(grammarAccess.getClicarAccess().getNameAssignment_2()); 
            // InternalAtad.g:457:2: ( rule__Clicar__NameAssignment_2 )
            // InternalAtad.g:457:3: rule__Clicar__NameAssignment_2
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
    // InternalAtad.g:466:1: rule__Navegar__Group__0 : rule__Navegar__Group__0__Impl rule__Navegar__Group__1 ;
    public final void rule__Navegar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:470:1: ( rule__Navegar__Group__0__Impl rule__Navegar__Group__1 )
            // InternalAtad.g:471:2: rule__Navegar__Group__0__Impl rule__Navegar__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAtad.g:478:1: rule__Navegar__Group__0__Impl : ( 'navegar' ) ;
    public final void rule__Navegar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:482:1: ( ( 'navegar' ) )
            // InternalAtad.g:483:1: ( 'navegar' )
            {
            // InternalAtad.g:483:1: ( 'navegar' )
            // InternalAtad.g:484:2: 'navegar'
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
    // InternalAtad.g:493:1: rule__Navegar__Group__1 : rule__Navegar__Group__1__Impl ;
    public final void rule__Navegar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:497:1: ( rule__Navegar__Group__1__Impl )
            // InternalAtad.g:498:2: rule__Navegar__Group__1__Impl
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
    // InternalAtad.g:504:1: rule__Navegar__Group__1__Impl : ( ( rule__Navegar__NameAssignment_1 ) ) ;
    public final void rule__Navegar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:508:1: ( ( ( rule__Navegar__NameAssignment_1 ) ) )
            // InternalAtad.g:509:1: ( ( rule__Navegar__NameAssignment_1 ) )
            {
            // InternalAtad.g:509:1: ( ( rule__Navegar__NameAssignment_1 ) )
            // InternalAtad.g:510:2: ( rule__Navegar__NameAssignment_1 )
            {
             before(grammarAccess.getNavegarAccess().getNameAssignment_1()); 
            // InternalAtad.g:511:2: ( rule__Navegar__NameAssignment_1 )
            // InternalAtad.g:511:3: rule__Navegar__NameAssignment_1
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
    // InternalAtad.g:520:1: rule__Escrever__Group__0 : rule__Escrever__Group__0__Impl rule__Escrever__Group__1 ;
    public final void rule__Escrever__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:524:1: ( rule__Escrever__Group__0__Impl rule__Escrever__Group__1 )
            // InternalAtad.g:525:2: rule__Escrever__Group__0__Impl rule__Escrever__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalAtad.g:532:1: rule__Escrever__Group__0__Impl : ( 'escrever' ) ;
    public final void rule__Escrever__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:536:1: ( ( 'escrever' ) )
            // InternalAtad.g:537:1: ( 'escrever' )
            {
            // InternalAtad.g:537:1: ( 'escrever' )
            // InternalAtad.g:538:2: 'escrever'
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
    // InternalAtad.g:547:1: rule__Escrever__Group__1 : rule__Escrever__Group__1__Impl ;
    public final void rule__Escrever__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:551:1: ( rule__Escrever__Group__1__Impl )
            // InternalAtad.g:552:2: rule__Escrever__Group__1__Impl
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
    // InternalAtad.g:558:1: rule__Escrever__Group__1__Impl : ( ( rule__Escrever__NameAssignment_1 ) ) ;
    public final void rule__Escrever__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:562:1: ( ( ( rule__Escrever__NameAssignment_1 ) ) )
            // InternalAtad.g:563:1: ( ( rule__Escrever__NameAssignment_1 ) )
            {
            // InternalAtad.g:563:1: ( ( rule__Escrever__NameAssignment_1 ) )
            // InternalAtad.g:564:2: ( rule__Escrever__NameAssignment_1 )
            {
             before(grammarAccess.getEscreverAccess().getNameAssignment_1()); 
            // InternalAtad.g:565:2: ( rule__Escrever__NameAssignment_1 )
            // InternalAtad.g:565:3: rule__Escrever__NameAssignment_1
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
    // InternalAtad.g:574:1: rule__Verifique__Group__0 : rule__Verifique__Group__0__Impl rule__Verifique__Group__1 ;
    public final void rule__Verifique__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:578:1: ( rule__Verifique__Group__0__Impl rule__Verifique__Group__1 )
            // InternalAtad.g:579:2: rule__Verifique__Group__0__Impl rule__Verifique__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalAtad.g:586:1: rule__Verifique__Group__0__Impl : ( 'Verifique' ) ;
    public final void rule__Verifique__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:590:1: ( ( 'Verifique' ) )
            // InternalAtad.g:591:1: ( 'Verifique' )
            {
            // InternalAtad.g:591:1: ( 'Verifique' )
            // InternalAtad.g:592:2: 'Verifique'
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
    // InternalAtad.g:601:1: rule__Verifique__Group__1 : rule__Verifique__Group__1__Impl rule__Verifique__Group__2 ;
    public final void rule__Verifique__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:605:1: ( rule__Verifique__Group__1__Impl rule__Verifique__Group__2 )
            // InternalAtad.g:606:2: rule__Verifique__Group__1__Impl rule__Verifique__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalAtad.g:613:1: rule__Verifique__Group__1__Impl : ( 'que' ) ;
    public final void rule__Verifique__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:617:1: ( ( 'que' ) )
            // InternalAtad.g:618:1: ( 'que' )
            {
            // InternalAtad.g:618:1: ( 'que' )
            // InternalAtad.g:619:2: 'que'
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
    // InternalAtad.g:628:1: rule__Verifique__Group__2 : rule__Verifique__Group__2__Impl ;
    public final void rule__Verifique__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:632:1: ( rule__Verifique__Group__2__Impl )
            // InternalAtad.g:633:2: rule__Verifique__Group__2__Impl
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
    // InternalAtad.g:639:1: rule__Verifique__Group__2__Impl : ( ( rule__Verifique__NameAssignment_2 ) ) ;
    public final void rule__Verifique__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:643:1: ( ( ( rule__Verifique__NameAssignment_2 ) ) )
            // InternalAtad.g:644:1: ( ( rule__Verifique__NameAssignment_2 ) )
            {
            // InternalAtad.g:644:1: ( ( rule__Verifique__NameAssignment_2 ) )
            // InternalAtad.g:645:2: ( rule__Verifique__NameAssignment_2 )
            {
             before(grammarAccess.getVerifiqueAccess().getNameAssignment_2()); 
            // InternalAtad.g:646:2: ( rule__Verifique__NameAssignment_2 )
            // InternalAtad.g:646:3: rule__Verifique__NameAssignment_2
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
    // InternalAtad.g:655:1: rule__AdicaoComando__Group__0 : rule__AdicaoComando__Group__0__Impl rule__AdicaoComando__Group__1 ;
    public final void rule__AdicaoComando__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:659:1: ( rule__AdicaoComando__Group__0__Impl rule__AdicaoComando__Group__1 )
            // InternalAtad.g:660:2: rule__AdicaoComando__Group__0__Impl rule__AdicaoComando__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalAtad.g:667:1: rule__AdicaoComando__Group__0__Impl : ( 'E' ) ;
    public final void rule__AdicaoComando__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:671:1: ( ( 'E' ) )
            // InternalAtad.g:672:1: ( 'E' )
            {
            // InternalAtad.g:672:1: ( 'E' )
            // InternalAtad.g:673:2: 'E'
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
    // InternalAtad.g:682:1: rule__AdicaoComando__Group__1 : rule__AdicaoComando__Group__1__Impl ;
    public final void rule__AdicaoComando__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:686:1: ( rule__AdicaoComando__Group__1__Impl )
            // InternalAtad.g:687:2: rule__AdicaoComando__Group__1__Impl
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
    // InternalAtad.g:693:1: rule__AdicaoComando__Group__1__Impl : ( ruleComandosAcao ) ;
    public final void rule__AdicaoComando__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:697:1: ( ( ruleComandosAcao ) )
            // InternalAtad.g:698:1: ( ruleComandosAcao )
            {
            // InternalAtad.g:698:1: ( ruleComandosAcao )
            // InternalAtad.g:699:2: ruleComandosAcao
            {
             before(grammarAccess.getAdicaoComandoAccess().getComandosAcaoParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleComandosAcao();

            state._fsp--;

             after(grammarAccess.getAdicaoComandoAccess().getComandosAcaoParserRuleCall_1()); 

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
    // InternalAtad.g:709:1: rule__Quando__Group__0 : rule__Quando__Group__0__Impl rule__Quando__Group__1 ;
    public final void rule__Quando__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:713:1: ( rule__Quando__Group__0__Impl rule__Quando__Group__1 )
            // InternalAtad.g:714:2: rule__Quando__Group__0__Impl rule__Quando__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalAtad.g:721:1: rule__Quando__Group__0__Impl : ( 'Quando' ) ;
    public final void rule__Quando__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:725:1: ( ( 'Quando' ) )
            // InternalAtad.g:726:1: ( 'Quando' )
            {
            // InternalAtad.g:726:1: ( 'Quando' )
            // InternalAtad.g:727:2: 'Quando'
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
    // InternalAtad.g:736:1: rule__Quando__Group__1 : rule__Quando__Group__1__Impl ;
    public final void rule__Quando__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:740:1: ( rule__Quando__Group__1__Impl )
            // InternalAtad.g:741:2: rule__Quando__Group__1__Impl
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
    // InternalAtad.g:747:1: rule__Quando__Group__1__Impl : ( ruleComandosAcao ) ;
    public final void rule__Quando__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:751:1: ( ( ruleComandosAcao ) )
            // InternalAtad.g:752:1: ( ruleComandosAcao )
            {
            // InternalAtad.g:752:1: ( ruleComandosAcao )
            // InternalAtad.g:753:2: ruleComandosAcao
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


    // $ANTLR start "rule__DeclaraComando__ComandosAssignment_0"
    // InternalAtad.g:763:1: rule__DeclaraComando__ComandosAssignment_0 : ( ruleQuando ) ;
    public final void rule__DeclaraComando__ComandosAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:767:1: ( ( ruleQuando ) )
            // InternalAtad.g:768:2: ( ruleQuando )
            {
            // InternalAtad.g:768:2: ( ruleQuando )
            // InternalAtad.g:769:3: ruleQuando
            {
             before(grammarAccess.getDeclaraComandoAccess().getComandosQuandoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQuando();

            state._fsp--;

             after(grammarAccess.getDeclaraComandoAccess().getComandosQuandoParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DeclaraComando__ComandosAssignment_0"


    // $ANTLR start "rule__DeclaraComando__AcoesAssignment_1"
    // InternalAtad.g:778:1: rule__DeclaraComando__AcoesAssignment_1 : ( ruleAdicaoComando ) ;
    public final void rule__DeclaraComando__AcoesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:782:1: ( ( ruleAdicaoComando ) )
            // InternalAtad.g:783:2: ( ruleAdicaoComando )
            {
            // InternalAtad.g:783:2: ( ruleAdicaoComando )
            // InternalAtad.g:784:3: ruleAdicaoComando
            {
             before(grammarAccess.getDeclaraComandoAccess().getAcoesAdicaoComandoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdicaoComando();

            state._fsp--;

             after(grammarAccess.getDeclaraComandoAccess().getAcoesAdicaoComandoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DeclaraComando__AcoesAssignment_1"


    // $ANTLR start "rule__DeclaraComando__VerificacaoAssignment_2"
    // InternalAtad.g:793:1: rule__DeclaraComando__VerificacaoAssignment_2 : ( ruleComandosValidadores ) ;
    public final void rule__DeclaraComando__VerificacaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:797:1: ( ( ruleComandosValidadores ) )
            // InternalAtad.g:798:2: ( ruleComandosValidadores )
            {
            // InternalAtad.g:798:2: ( ruleComandosValidadores )
            // InternalAtad.g:799:3: ruleComandosValidadores
            {
             before(grammarAccess.getDeclaraComandoAccess().getVerificacaoComandosValidadoresParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComandosValidadores();

            state._fsp--;

             after(grammarAccess.getDeclaraComandoAccess().getVerificacaoComandosValidadoresParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DeclaraComando__VerificacaoAssignment_2"


    // $ANTLR start "rule__Clicar__NameAssignment_2"
    // InternalAtad.g:808:1: rule__Clicar__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Clicar__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:812:1: ( ( RULE_STRING ) )
            // InternalAtad.g:813:2: ( RULE_STRING )
            {
            // InternalAtad.g:813:2: ( RULE_STRING )
            // InternalAtad.g:814:3: RULE_STRING
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
    // InternalAtad.g:823:1: rule__Navegar__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Navegar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:827:1: ( ( RULE_STRING ) )
            // InternalAtad.g:828:2: ( RULE_STRING )
            {
            // InternalAtad.g:828:2: ( RULE_STRING )
            // InternalAtad.g:829:3: RULE_STRING
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
    // InternalAtad.g:838:1: rule__Escrever__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Escrever__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:842:1: ( ( RULE_STRING ) )
            // InternalAtad.g:843:2: ( RULE_STRING )
            {
            // InternalAtad.g:843:2: ( RULE_STRING )
            // InternalAtad.g:844:3: RULE_STRING
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


    // $ANTLR start "rule__Verifique__NameAssignment_2"
    // InternalAtad.g:853:1: rule__Verifique__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Verifique__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAtad.g:857:1: ( ( RULE_STRING ) )
            // InternalAtad.g:858:2: ( RULE_STRING )
            {
            // InternalAtad.g:858:2: ( RULE_STRING )
            // InternalAtad.g:859:3: RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000006800L});

}