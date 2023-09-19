## Explorando Padrões de Projetos na Prática com Java

* Projeto proposto no Santander Bootcamp 2023 - Backend Java.

### Padrão de projeto Command:
* Padrão de projeto comportamental que converte solicitações ou operações simples em objetos.
* É identificado por métodos comportamentais em um tipo abstrato/interface que chama um método em uma implementação de um tipo abstrato/interface diferente que foi encapsulado pela implementação do comando durante a sua criação.
* As classes do Command geralmente são ações específicas.

### Sobre o exemplo implementado:
* O Cliente faz um Pedido e define o receptor como sendo o Chef.
* O pedido é enviado ao Garçom, que saberá quem deve executar este pedido.
* Quando quem invoca o pedido é executado, o método execute de Pedido é executado no receptor (Chef), que recebe o comando para preparar a refeição ou a sobremesa.

🛠️ Tecnologia
- Java
  
- ## 📧 Contato 
anachaubertf@gmail.com
