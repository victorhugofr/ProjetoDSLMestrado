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


### Como executar

1. Com o xtext instalado, clique em ```Run As``` na classe com.ufrn.atad/src/com/atad/Atad.xtext e selecione ```Generate xtext artifacts```.
2. Após gerar o artefato, clique com o botão direito na pasta com.ufrn.atad selecione ```Run As``` e depois ```Eclipse Application```
3. Crie um projeto e uma file com o nome qualquer.atad
4. Comece a desfrutar da DSL


##### Observações Relevantes

Esta linguagem gera o script de teste automatizado, sendo apenas necessário o desenvolvedor:

- Mudar o nome do caso de teste (não será necessário em novas atualizações)
- Mudar o nome da class (não será necessário em novas atualizações)
- Incorporar em um projeto com as bibliotecas do JUnit4 e Selenium presentes
