# mini-cassino-java

Meu primeiro projeto em Java: um cassino simples que roda no terminal. O projeto está **em construção**, e a parte dos jogos ainda será desenvolvida.

## Como funciona

O programa mostra um menu em loop com as seguintes opções:

| Opção | Função | Status |
|-------|--------|--------|
| 1 | Cadastrar o nome do jogador | Pronto |
| 2 | Adicionar créditos (mínimo de 300 para jogar) | Pronto |
| 3 | Jogar | Em construção |
| 4 | Sacar créditos | Pronto (saque do saldo) |
| 5 | Consultar saldo | Pronto |
| 6 | Sair | Pronto |

## Como rodar

Requisito: Java (JDK) instalado.

```bash
javac Main.java
java Main
```

## Próximos passos

Jogos que serão adicionados na opção 3:

- [ ] **Jackpot**: caça-níquel com apostas em créditos
- [ ] **Adivinhar o número**: o jogador tenta acertar um número sorteado
- [ ] **Sacar os ganhos**: retirar o dinheiro ganho nos jogos, integrado ao saldo

## O que estou praticando

- Entrada de dados com `Scanner` e tratamento de entradas inválidas
- Estruturas `while` e `switch`
- Organização do código com métodos

## Autor

Feito por [cesartelless](https://github.com/cesartelless) como projeto de estudo.
