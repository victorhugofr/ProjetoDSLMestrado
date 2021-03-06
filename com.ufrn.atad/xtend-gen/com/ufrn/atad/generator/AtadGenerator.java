/**
 * generated by Xtext 2.25.0
 */
package com.ufrn.atad.generator;

import com.ufrn.atad.atad.Clicar;
import com.ufrn.atad.atad.Escrever;
import com.ufrn.atad.atad.EsperaClicavel;
import com.ufrn.atad.atad.EsperaPresente;
import com.ufrn.atad.atad.EsperaVisivel;
import com.ufrn.atad.atad.Navegar;
import com.ufrn.atad.atad.TipoLocalizadores;
import com.ufrn.atad.atad.VerifiqueNaoPresente;
import com.ufrn.atad.atad.VerifiquePresente;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class AtadGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String a = "";
    String _a = a;
    CharSequence _buildTestPre = this.buildTestPre();
    a = (_a + _buildTestPre);
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(resource.getAllContents());
    for (final EObject e : _iterable) {
      if ((e instanceof Clicar)) {
        String _a_1 = a;
        CharSequence _comandoClicar = this.comandoClicar(((Clicar)e));
        a = (_a_1 + _comandoClicar);
      } else {
        if ((e instanceof Navegar)) {
          String _a_2 = a;
          CharSequence _comandoNavegar = this.comandoNavegar(((Navegar)e));
          a = (_a_2 + _comandoNavegar);
        } else {
          if ((e instanceof EsperaPresente)) {
            String _a_3 = a;
            CharSequence _comandoEsperaPresente = this.comandoEsperaPresente(((EsperaPresente)e));
            a = (_a_3 + _comandoEsperaPresente);
          } else {
            if ((e instanceof EsperaVisivel)) {
              String _a_4 = a;
              CharSequence _comandoEsperaVisivel = this.comandoEsperaVisivel(((EsperaVisivel)e));
              a = (_a_4 + _comandoEsperaVisivel);
            } else {
              if ((e instanceof EsperaClicavel)) {
                String _a_5 = a;
                CharSequence _comandoEsperaClicavel = this.comandoEsperaClicavel(((EsperaClicavel)e));
                a = (_a_5 + _comandoEsperaClicavel);
              } else {
                if ((e instanceof VerifiquePresente)) {
                  String _a_6 = a;
                  CharSequence _comandoVerifique = this.comandoVerifique(((VerifiquePresente)e));
                  a = (_a_6 + _comandoVerifique);
                } else {
                  if ((e instanceof VerifiqueNaoPresente)) {
                    String _a_7 = a;
                    CharSequence _comandoNaoVerifique = this.comandoNaoVerifique(((VerifiqueNaoPresente)e));
                    a = (_a_7 + _comandoNaoVerifique);
                  } else {
                    if ((e instanceof Escrever)) {
                      String _a_8 = a;
                      CharSequence _comandoEscrever = this.comandoEscrever(((Escrever)e));
                      a = (_a_8 + _comandoEscrever);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    String _a_9 = a;
    CharSequence _buildTestPos = this.buildTestPos();
    a = (_a_9 + _buildTestPos);
    fsa.generateFile("Teste.java", a);
  }
  
  private CharSequence buildTestPre() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import org.junit.Test;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.By;");
    _builder.newLine();
    _builder.append("import static org.junit.Assert.assertTrue;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.WebDriver;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.support.ui.ExpectedConditions;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.support.ui.WebDriverWait;");
    _builder.newLine();
    _builder.append("import org.openqa.selenium.firefox.FirefoxDriver;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Teste{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected WebDriver driver = new FirefoxDriver();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected WebDriverWait wait = new WebDriverWait(driver,30);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Test");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void teste() throws InterruptedException{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("driver.manage().window().maximize();");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence buildTestPos() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence comandoEsperaPresente(final EsperaPresente ep) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wait.until(ExpectedConditions.presenceOfElementLocated(By.");
    TipoLocalizadores _tipoLocalizador = ep.getTipoLocalizador();
    _builder.append(_tipoLocalizador);
    _builder.append("(\"");
    String _name = ep.getName();
    _builder.append(_name);
    _builder.append("\")));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence comandoEsperaVisivel(final EsperaVisivel ev) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wait.until(ExpectedConditions.visibilityOfElementLocated(By.");
    TipoLocalizadores _tipoLocalizador = ev.getTipoLocalizador();
    _builder.append(_tipoLocalizador);
    _builder.append("(\"");
    String _name = ev.getName();
    _builder.append(_name);
    _builder.append("\")));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence comandoEsperaClicavel(final EsperaClicavel ec) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("wait.until(ExpectedConditions.elementToBeClickable(By.");
    TipoLocalizadores _tipoLocalizador = ec.getTipoLocalizador();
    _builder.append(_tipoLocalizador);
    _builder.append("(\"");
    String _name = ec.getName();
    _builder.append(_name);
    _builder.append("\")));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence comandoClicar(final Clicar c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("driver.findElement(By.");
    TipoLocalizadores _tipoLocalizador = c.getTipoLocalizador();
    _builder.append(_tipoLocalizador);
    _builder.append("(\"");
    String _name = c.getName();
    _builder.append(_name);
    _builder.append("\")).click();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence comandoVerifique(final VerifiquePresente v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("assertTrue(driver.getPageSource().contains(\"");
    String _name = v.getName();
    _builder.append(_name);
    _builder.append("\"));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence comandoNaoVerifique(final VerifiqueNaoPresente v) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("assertTrue(!driver.getPageSource().contains(\"");
    String _name = v.getName();
    _builder.append(_name);
    _builder.append("\"));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence comandoNavegar(final Navegar n) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("driver.get(\"");
    String _name = n.getName();
    _builder.append(_name);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private CharSequence comandoEscrever(final Escrever e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("driver.findElement(By.");
    TipoLocalizadores _tipoLocalizador = e.getTipoLocalizador();
    _builder.append(_tipoLocalizador);
    _builder.append("(\"");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append("\")).sendKeys(\"");
    String _conteudo = e.getConteudo();
    _builder.append(_conteudo);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
