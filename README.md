# javaifc

# Computador Personalizado - Simulador de Compra
Este projeto implementa um sistema simples de simulação de compra de computadores utilizando Java e uma interface gráfica com Swing. O usuário pode escolher entre desktops e notebooks, configurar os componentes (como processador, memória, HD, etc.) e ver o valor final da compra, incluindo a opção de adicionar garantia estendida.

Funcionalidades
Escolha entre dois tipos de computadores: Desktop ou Notebook.
Personalize os componentes principais do computador:
Processador
Placa Mãe
Memória RAM
HD
Placa de Vídeo (opcional)
Adicione periféricos no caso do Desktop (estabilizador, teclado, monitor).
Adicione acessórios no caso do Notebook (carregador, pasta).
Exibição do valor final da compra com ou sem garantia estendida.
Estrutura do Projeto
O projeto contém as seguintes classes:

1. Ex1Computador
Classe base para as configurações comuns de qualquer computador (Desktop ou Notebook). Contém os atributos e métodos para processador, memória, HD, placa-mãe, placa de vídeo, e métodos de cálculo e impressão do valor total.

2. Ex1Desktop
Extende a classe Ex1Computador e adiciona configurações específicas para desktop, como estabilizador, teclado, monitor, além de calcular o valor total com esses componentes extras.

3. Ex1Notebook
Extende a classe Ex1Computador e adiciona configurações específicas para notebooks, como carregador e pasta. Também redefine o cálculo do valor com a opção de garantia.

4. Ex1Principal
Classe principal que contém a interface gráfica (UI) do programa. Implementa o fluxo de seleção de componentes e exibe o valor final ao usuário.

Como Utilizar
Requisitos
Java JDK 8 ou superior
IDE de sua escolha (Eclipse, IntelliJ, etc.)
Instruções
Clone este repositório ou baixe o código fonte.
Importe o projeto em sua IDE preferida.
Execute a classe Ex1Principal para iniciar a aplicação.
Na interface gráfica, selecione o tipo de computador, os componentes desejados, e veja o valor total da compra.
Exemplo de Execução
Escolha do Tipo de Computador:
Desktop ou Notebook
Configuração dos Componentes:
Escolha o processador, placa-mãe, memória, etc.
Resultado Final:
O valor total da compra será exibido, com ou sem garantia estendida.
