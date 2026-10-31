# Cassino em Java

Projeto de estudo em **Java** que simula um cassino no terminal. Ele é desenvolvido de forma gradual, acompanhando a evolução dos meus conhecimentos na linguagem: começa com lógica de programação e conceitos básicos, sem Programação Orientada a Objetos, e evolui até uma versão com classes, objetos e persistência de dados.

> Projeto com fins exclusivamente educacionais. Todo o dinheiro do jogo é fictício.

---

## Status atual

**Em desenvolvimento: Etapa 1 (Java básico)**

O projeto está na fase de planejamento e construção da base. As regras principais já foram definidas, e as partes abaixo ainda precisam ser decididas ou implementadas.

| Item | Situação |
|---|---|
| Estrutura do projeto e regras gerais | Definidas |
| Menu principal (`while` + `switch/case`) | Em construção |
| Cadastro do jogador | Em construção |
| Consulta de saldo e depósitos | Em construção |
| Saque | Em construção |
| Menu de jogos | Planejado |
| Caça-níquel (apostas, probabilidades, prêmios) | Planejado |
| Segundo jogo | Ainda não definido |
| Sistema de pontuação | Ainda não definido |
| Regra de quando o saque é permitido | Ainda não definida |

---

## Objetivo

Criar um cassino executado pelo console, em que o usuário pode:

- cadastrar seu nome;
- adicionar dinheiro e consultar o saldo;
- participar de jogos;
- acumular ganhos (ou perdas);
- sacar o dinheiro.

---

## Menu principal

O programa fica em execução dentro de um laço `while` até o usuário escolher a opção 6. A navegação é feita com `switch/case`.

```
1. Cadastrar nome do jogador
2. Consultar saldo
3. Jogar
4. Sacar dinheiro
5. Adicionar saldo
6. Sair
```

---

## Regras do projeto

### Cadastro do jogador
- O nome é guardado em uma `String` e usado nas mensagens do cassino (boas-vindas, saldo, despedida).
- Exemplo: `Bem-vindo, Cesar!`

### Saldo e depósitos
- Saldo inicial: **R$ 0,00**.
- Não há limite máximo de depósito.
- É necessário ter pelo menos **R$ 300,00** para liberar o acesso aos jogos.
- Podem ser feitos vários depósitos até atingir o mínimo.
- O programa informa quanto ainda falta para chegar aos R$ 300,00.
- Ganhos e perdas das partidas são somados ou descontados do saldo.
- Os valores financeiros usam `double`, e o saldo é atualizado com `saldo += saldoAdicionado`.

### Jogos
Um menu secundário permite alternar entre os jogos sem encerrar o programa:

```
1. Caça-níquel
2. Outro jogo (ainda não definido)
3. Voltar ao menu principal
```

#### Caça-níquel (primeiro jogo)
Jogo com resultados aleatórios baseado em combinações de símbolos ou números, com probabilidades diferentes de vitória. Precisa conter:

- geração de números aleatórios (`Random`);
- combinações vencedoras e perdedoras;
- probabilidades diferentes de ganhar;
- sistema de apostas;
- cálculo das premiações;
- desconto da aposta e adição dos ganhos ao saldo.

> Os valores de aposta, as probabilidades e as premiações ainda serão definidos.

### Pontuação
Além do dinheiro, existe a ideia de ter um sistema de pontos para acompanhar o desempenho do jogador.

- **Saldo:** dinheiro disponível para apostar e sacar.
- **Pontuação:** pontos acumulados durante as partidas.

> A forma de uso ou conversão dos pontos ainda não foi definida.

### Saque
O sistema deve:

- consultar o saldo disponível;
- pedir o valor do saque;
- verificar se há saldo suficiente;
- impedir valores negativos ou iguais a zero;
- descontar o valor do saldo e mostrar o saldo atualizado.

> Ainda falta decidir se o saque será liberado a qualquer momento ou apenas ao final da sessão de jogos.

### Encerramento
Ao escolher a opção 6, o programa termina exibindo uma mensagem com o nome do jogador, o saldo final e um agradecimento.

---

## Conceitos de Java praticados

| Conceito | Uso no projeto |
|---|---|
| `Scanner` | Ler o que o usuário digita |
| `String` | Nome do jogador |
| `int` | Opções de menu e pontuação |
| `double` | Saldo, apostas, depósitos e prêmios |
| `while` | Manter o programa em execução |
| `switch/case` | Organizar as opções dos menus |
| `if/else` | Verificações e validações |
| `Random` | Resultados aleatórios dos jogos |
| Operadores matemáticos, relacionais e lógicos | Cálculos e comparações |
| `break` e `continue` | Controle de fluxo em repetições e `switch` |

---

## Roadmap

- [ ] **Etapa 1: Java básico.** Variáveis, `Scanner`, condicionais, repetição, `switch`, operadores e números aleatórios.
- [ ] **Etapa 2: Métodos.** Separar as funcionalidades (cadastro, depósito, saque, saldo e jogos) em métodos.
- [ ] **Etapa 3: POO.** Reestruturar com classes e objetos (`Jogador`, `Cassino`, `CacaNiquel` e outras), trabalhando encapsulamento, atributos, métodos e construtores.
- [ ] **Etapa 4: Melhorias futuras.** Histórico de partidas, ranking de jogadores, persistência de dados, interface gráfica e melhor arquitetura.

---

## Como executar

Pré-requisito: [JDK](https://adoptium.net/) instalado (versão 17 ou superior recomendada).

```bash
# Clone o repositório
git clone https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git
cd NOME-DO-REPOSITORIO

# Compile
javac Main.java

# Execute
java Main
```

> Ajuste o nome do arquivo (`Main`) e a estrutura de pastas conforme o seu projeto.

---

## Metodologia de estudo

Este projeto segue uma abordagem de aprendizado ativo:

- tentar resolver cada problema sozinho primeiro;
- pedir dicas e orientações em vez de soluções prontas;
- entender a lógica por trás de cada funcionalidade;
- corrigir erros e melhorar o código;
- aplicar na prática os conceitos aprendidos nos estudos;
- implementar e testar cada funcionalidade antes de avançar para a próxima.

---

## Autor

**Cesar**

Projeto criado para fins de estudo em Java.
