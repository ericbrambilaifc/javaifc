# javaifc

# Computador Personalizado - Simulador de Compra
Este projeto implementa um sistema simples de simulação de compra de computadores utilizando Java e uma interface gráfica com Swing. O usuário pode escolher entre desktops e notebooks, configurar os componentes (como processador, memória, HD, etc.) e ver o valor final da compra, incluindo a opção de adicionar garantia estendida.

## Funcionalidades
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

Exemplo de Execução
Escolha do Tipo de Computador:
Desktop ou Notebook
Configuração dos Componentes:
Escolha o processador, placa-mãe, memória, etc.
Resultado Final:
O valor total da compra será exibido, com ou sem garantia estendida.

# Veículo Manager
É uma aplicação Java que permite gerenciar diferentes tipos de veículos e calcular seus respectivos valores de IPVA, seguro, e valor atual com base no ano de fabricação e no tipo do veículo. A aplicação suporta caminhões, automóveis e motos, cada um com regras específicas para o cálculo dos valores.

## Funcionalidades
Cálculo do IPVA: Baseado no tempo de uso do veículo e no tipo (Caminhão, Automóvel ou Moto).
Cálculo do Seguro: Cálculo variável de acordo com o tipo do veículo.
Cálculo do Valor Total: Aplica depreciação conforme o ano de fabricação.
Interface Gráfica: Interface desenvolvida com JFrame para facilitar a entrada de dados e a visualização dos resultados.
Estrutura do Projeto
O projeto contém as seguintes classes:

Ex2Veiculo: Classe base para todos os veículos, contendo atributos como modelo, ano de fabricação e valor, além de métodos genéricos para cálculo de valores.

Ex2Automovel: Extensão da classe Ex2Veiculo, implementa cálculos específicos de automóveis para IPVA, seguro e valor total.

Ex2Moto: Extensão da classe Ex2Veiculo, implementa cálculos específicos de motos para IPVA e valor total.

Ex2Caminhao: Extensão da classe Ex2Veiculo, implementa cálculos específicos de caminhões para IPVA, seguro e valor total. Também considera a capacidade de carga do caminhão no cálculo do seguro.

Ex2Principal: Classe principal que implementa a interface gráfica (JFrame), permitindo ao usuário selecionar o tipo de veículo, inserir os dados necessários, e exibir os resultados.

Como Usar
Interface Gráfica: Ao iniciar o programa, uma janela será exibida onde você poderá selecionar o tipo de veículo (Caminhão, Automóvel ou Moto).

Entrada de Dados:

Preencha os campos de Modelo, Ano de Fabricação e Valor.
Para caminhões, será necessário inserir também a capacidade em toneladas.
Cálculo: Após inserir os dados, clique no botão Calcular para visualizar os resultados de IPVA, seguro e valor total do veículo.


Exemplo de Uso
Selecionar Caminhão: Preencher os dados do caminhão, incluindo a capacidade, ano e valor, e clicar em "Calcular". O programa exibirá o valor do IPVA, seguro e valor total do caminhão.

Selecionar Automóvel: Inserir o ano de fabricação e o valor, e clicar em "Calcular". O programa exibirá o valor do IPVA, seguro (se aplicável) e o valor total do automóvel.

Selecionar Moto: Inserir os dados da moto e clicar em "Calcular" para ver os valores correspondentes.

# Calculadora de Azulejos

## Descrição

Este projeto é uma calculadora de azulejos desenvolvida em Java que permite calcular a quantidade de azulejos necessários para revestir uma parede com base nas dimensões da parede e dos azulejos. O usuário pode escolher entre diferentes formas de azulejos, incluindo quadrados, retangulares, e triângulos de lados iguais e diferentes.

## Funcionalidades

- Cálculo da quantidade de azulejos necessários para revestir uma parede.
- Suporte para diferentes formatos de azulejos:
  - Quadrado
  - Retangular
  - Triangular (Lados Iguais)
  - Triangular (Lados Diferentes)
  
## Tecnologias Utilizadas

- Java
- Swing (para a interface gráfica)
