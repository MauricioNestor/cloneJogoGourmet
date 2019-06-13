Pequeno projeto feito como parte do processo de sele��o na Objective Solutions

Para n�o repetir algo que j� foi feito, o projeto foi alterado para adivinhar modelos de carros

Trata-se de um jogo de adivinha��o em que a m�quina solicita que pense em um modelo de carro, e ela tenta adivinhar qual foi pensado pelo ser humano. Ap�s investiga��o, foi visto que o jogo era bastante similar � um exerc�cio feito na faculdade, e com uma breve pesquisa nos arquivos daquela �poca, confirmou-se se tratar de uma busca por �rvore bin�ria.

Com isso, foi utilizado o c�digo feito em C++ na faculdade por base, e criado a aplica��o em java. A aplica��o foi feita de modo simples, sem se utilizar de persist�ncia. 
O projeto da mesma est� estruturado em uma classe modelo (Node.java), dentro do pacote model, uma classe que organiza os n�s em uma estrutura que fa�a sentido no contexto do aplicativo (Arvore.java), classe essa que concentra as "regras de neg�cio" da aplica��o. 
Na classe "CloneJogo.java" apenas fica a parcela do c�digo respons�vel por fazer a pergunta inicial para in�cio do jogo e manter o c�digo repetindo at� o jogador fechar a caixa de di�logo sem selecionar nenhuma op��o.
