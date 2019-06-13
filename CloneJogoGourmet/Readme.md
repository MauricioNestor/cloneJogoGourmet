Pequeno projeto feito como parte do processo de seleção na Objective Solutions

Para não repetir algo que já foi feito, o projeto foi alterado para adivinhar modelos de carros

Trata-se de um jogo de adivinhação em que a máquina solicita que pense em um modelo de carro, e ela tenta adivinhar qual foi pensado pelo ser humano. Após investigação, foi visto que o jogo era bastante similar à um exercício feito na faculdade, e com uma breve pesquisa nos arquivos daquela época, confirmou-se se tratar de uma busca por árvore binária.

Com isso, foi utilizado o código feito em C++ na faculdade por base, e criado a aplicação em java. A aplicação foi feita de modo simples, sem se utilizar de persistência. 
O projeto da mesma está estruturado em uma classe modelo (Node.java), dentro do pacote model, uma classe que organiza os nós em uma estrutura que faça sentido no contexto do aplicativo (Arvore.java), classe essa que concentra as "regras de negócio" da aplicação. 
Na classe "CloneJogo.java" apenas fica a parcela do código responsável por fazer a pergunta inicial para início do jogo e manter o código repetindo até o jogador fechar a caixa de diálogo sem selecionar nenhuma opção.
