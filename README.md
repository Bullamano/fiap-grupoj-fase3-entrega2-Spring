# fiap-grupoj-fase3-entrega2-Spring
Entrega 2 da Fase 3 do MBA de full stack development da FIAP pelo grupo J.

  ##
  
Esta entrega da atividade 3 foi desenvolvida em API REST para um CRUD (Create, Read, Update e Delete - em português Criar, Ler, Atualizar e Remover) utilizando Spring Boot 4, Hibernate, JPA e MySQL.

## Ferramentas

Para completar o desenvolvimento foram utilizadas as seguintes ferramentas:

Java JDK (v8+) (https://www.oracle.com/technetwork/java/javase/downloads/index.html)
Maven (v3+) (https://maven.apache.org/download.cgi)
MySQL + MySQL Workbench (última versão disponível) (https://dev.mysql.com/downloads/workbench/)

## A API desenvolvida

Foi criado um Package Controller para  API de Tutorial Itens que irá expor cinco métodos HTTP (URIs RESTFul) definidos abaixo:
Listar todos tutoriaisitem - @GetMapping(“/api/v1/tutorialItem)
Obter um tutoriaisitem específico pelo ID - @GetMapping(“/{id}”)
Remover um tutoriaisitem pelo ID - @DeleteMapping(“/tutorialItem /{id}”)
Criar um novo tutoriaisitem - @PostMapping(“/tutorialItem”)
Atualizar detalhes de um tutoriaisitem - @PutMapping(“/tutorialItem /{id}”)

### Spring Boot

O primeiro passo foi criar o projeto com Spring Boot, podendo utilizar o serviço do https://start.spring.io ou o JHIPSTER que fornece um projeto pronto para ser importado por uma IDE, além de uma classe main e arquivo pom.xml do Maven com as dependências. As dependências necessárias são: JPA, Lombok e MySQL

### Criando a classe de entidade JPA Repository
A primeira classe que será criada é a entidade JPA, ou seja, a classe que representa a tabela que está no banco de dados. A classe se chamará Tutorialitem com uma chave primária id.

@Getter @Setter
@Entity
@Relation(collectionRelation = "tutorialItens")

As seguintes anotações (annotations) são do projeto Lombok (https://projectlombok.org/) que ajuda a manter o código mais limpo e enxuto já que não é necessário gerar os métodos getters e setters, além dos construtores (esse código será gerado e estará presente nos arquivos .class quando o código for compilado).
A anotação @Entity será automaticamente mapeada à tabela com o mesmo nome (classe TutorialItem e tabela TutorialItem). Todos os atributos dessa classe também serão mapeados com as respectivas colunas. 

A estrutura do arquétipo ficou  assim:

src
<br/>├── main
<br/>│&emsp;&emsp;├── java
<br/>│&emsp;&emsp;│&emsp;&emsp;└── com
<br/>│&emsp;&emsp;│&emsp;&emsp;&emsp;&emsp;└── atividade3fiap
<br/>│&emsp;&emsp;│&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;└── fase3 	
<br/>│&emsp;&emsp;│&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;├── Fase2Application.java
<br/>│&emsp;&emsp;│&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;├── api
<br/>│&emsp;&emsp;│&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;│&emsp;&emsp;└── controller
<br/>│&emsp;&emsp;│&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;│&emsp;&emsp;└── docs
<br/>│&emsp;&emsp;│&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;│&emsp;&emsp;└── dto
<br/>│&emsp;&emsp;│&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;│&emsp;&emsp;└── exceções
<br/>│&emsp;&emsp;│&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;│&emsp;&emsp;└── hateoas
<br/>│&emsp;&emsp;│&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;│&emsp;&emsp;└── mapeadores
<br/>│&emsp;&emsp;│&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;├── entidade
<br/>│&emsp;&emsp;│&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;├── repositorios
<br/>│&emsp;&emsp;│&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;└── servicos
<br/>│&emsp;&emsp;│&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
<br/>│&emsp;&emsp;└── resources
<br/>└── test

  ##
