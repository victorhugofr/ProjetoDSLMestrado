# ATAD
## Acelerar o Desenvolvimento de Testes Automatizados 

Os testes automatizados web por vezes é muito verboso e inelegível, de difícil compreensão que leva a criação de vários métodos e padrões de projeto para torná-lo mais “legível” e menos verboso. Essa situação fica ainda pior quando visualizamos projetos em português.

### Vantagens

- O código fica mais limpo, mais legível e menos verboso
- Acelera de forma exponencial a escrita dos testes.
- O desenvolvimento fica mais lógico.
- Uso de linguagem natural para a escrita dos testes.

### Desvantagens

- Pode gerar códigos desnecessários
- Pode precisar de manutenção no código gerado visto que cada teste possui particularidades (colocar um wait a mais, fazer mais uma espera específica etc).

### Exemplo de código ATAD

```
Quando navegar "https://sigaa.ufrn.br/sigaa/public/home.jsf"
E clicar em xpath "//a[@title='Clique aqui para logar-se no SIGAA']"
Espere id "username" estar presente
E clicar em id "username"
E escrever no id "username" "teste"
E clicar em id "password"
E escrever no id "password" "teste"
E clicar em className "btn-login"
Verifique que o texto "Credenciais inválidas" esta presente
```



### Como executar

1. Com o xtext instalado, clique em ```Run As``` na classe com.ufrn.atad/src/com/atad/Atad.xtext e selecione ```Generate xtext artifacts```.
2. Após gerar o artefato, clique com o botão direito na pasta com.ufrn.atad selecione ```Run As``` e depois ```Eclipse Application```
3. Crie um projeto e uma file com o nome qualquer.atad
4. Comece a desfrutar da DSL

### Atualizações futuras

1. Integrar com o framework Cucumber, gerando o arquivo Cucumber e o teste junto.
2. Declarar de forma mais simples um clique, por exemplo: 
```
Quando clicar em id "teste","teste2"
``` 
ao invés de  
```
Quando clicar em id "teste"  
Quando clicar em id "teste2"
```
3. Inferir um tipo padrão, caso o desenvolvedor não desejar declarar, como:
```
Quando clicar em id "teste","teste2"
``` 
poderia ser escrito
```
Quando clicar em "teste","teste2"
``` 
e o sistema interpretaria ID como padrão

##### Observações Relevantes

A sintaxe da DSL está localizada em ```com.ufrn.atad/src/com/atad/Atad.xtext```

O gerador de código está localizado em ```com.ufrn.atad/src/com/atad/generator/Atad.xtext```

Esta linguagem gera o script de teste automatizado, sendo apenas necessário o desenvolvedor:

- Mudar o nome do caso de teste (não será necessário em novas atualizações)
- Mudar o nome da class (não será necessário em novas atualizações)
- Incorporar em um projeto com as bibliotecas do JUnit4 e Selenium presentes
