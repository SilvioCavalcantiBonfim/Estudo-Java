# MEGA-SENA EM JAVA

Este projeto foi desenvolvido como parte do curso de backend com Java no Vai na Web. A aplicação simula um jogo da MEGA-SENA, permitindo que o usuário escolha 7 números de 0 a 100 e compare-os com os números sorteados para determinar se houve algum acerto.

## Funcionalidades

- O usuário pode escolher 7 números de 0 a 100.

- A aplicação valida se o dado inserido é um número inteiro e mantém o fluxo do programa mesmo se o usuário inserir um tipo de dado incorreto.

- Os números escolhidos são armazenados em um vetor.
- 7 números vencedores são sorteados utilizando a classe Random do Java.
Após o sorteio, a aplicação compara os números escolhidos pelo usuário com os números sorteados.
- Prêmios são atribuídos de acordo com a quantidade de números acertados pelo usuário:
  - 5 números corretos → Prêmio de 10 mil reais
  - 6 números corretos → Prêmio de 50 mil reais
  - 7 números corretos → Prêmio de 200 mil reais

## Melhorias Futuras
Planejo implementar o Service Provider API para melhorar o princípio OCP (Open/Closed Principle) nas interfaces de Input, Output e RandomNumberGenerate. Isso permitirá uma extensibilidade maior do código, possibilitando a fácil substituição e inclusão de novas implementações.

## Diagrama de Classes

O projeto foi estruturado em várias classes para separar responsabilidades e seguir boas práticas de programação. O diagrama de classes apresenta a estrutura do projeto:

```mermaid
classDiagram
     App ..> MegaSenaController
    MegaSenaController <|.. MegaSenaControllerImpl
    MegaSenaControllerImpl ..> MegaSenaView
    MegaSenaView <|.. MegaSenaViewImpl
    MegaSenaViewImpl ..> Output
    MegaSenaViewImpl ..> Input
    Input <|.. InputImpl
    Output <|.. OutputImpl
    MegaSenaControllerImpl ..> MegaSena
    MegaSena <|.. MegaSenaImpl
    MegaSenaControllerImpl ..> Chosen
    Chosen <|.. ChosenImpl
    RandomNumberGenerate <|.. RandomNumberGenerateImpl
    ChosenImpl ..> RandomNumberGenerate
    
    class App{
        + Static void main()
    }

      class MegaSenaController{
        <<interface>>
        void run()
        static MegaSenaController builder()
      }
      class MegaSenaControllerImpl{
        - int MAX_RANGE
        - int MIN_RANGE
        - int TOTAL_NUMBER
        - MegaSena megaSena
        - MegaSenaView megaSenaView
        - Chosen chosen

        + void run()
      }

    
      class MegaSenaView{
        <<interface>>
        void WelcomeMessage()
        int readParticipantNumber()
        void displayChosen(int[] chosen)
        void displayChoose(int[] choose)
        void displayResult(int result)
        void displayError(Exception e)
        void close()
        static MegaSenaView builder()
      }

      class MegaSenaViewImpl {
        - Output output
        - Input input
        + void WelcomeMessage()
        + int readParticipantNumber()
        + void displayResult(int result)
        + void displayChosen(int[] chosen)
        + void displayChoose(int[] choose)
        - String formatArray(int[] array)
        + void displayError(Exception e)
        + void close()
      }

      class Input {
        <<interface>>
        int nextInt() throws InputMismatchException
        void clearBuffer()
        void close()
        static Input builder()
      }

      class Output {
        <<interface>>
        void println(Object msg);
        void print(Object msg);
        static Output builder()
      }

      class RandomNumberGenerate {
        <<interface>>
        int nextInt(int bound)
        static RandomNumberGenerate builder()
      }

      class InputImpl {
        Scanner sc
        + int nextInt() throws InputMismatchException
        + void clearBuffer()
        + void close()
      }

      class OutputImpl {
        System.out
        + void println(Object msg);
        + void print(Object msg);
      }

      class RandomNumberGenerateImpl {
        - Random rng
        + int nextInt(int bound)
      }
    
      class MegaSena {
        <<interface>>
        void addInSelected(int value)
        void addInChosen(int value)
        int result()
        int[] getChose()
        int[] getChosen()
        boolean isCompleteFill()
        static MegaSena builder(int min, int max, int total)
      }

      class MegaSenaImpl {
        - int[] chose
        - int[] chosen
        - int minValue
        - int maxValue
        - int totalInsertionsInChose
        - int totalInsertionsInChosen
        + void addInSelected(int value)
        - boolean inSelected(int value)
        + void addInChosen(int value)
        + int result()
        + int[] getChose()
        + int[] getChosen()
        + boolean isCompleteFill()
      }

      class Chosen {
        <<Interface>>
        int[] nextChosen(int total)
        static Chosen builder(int min, int max)
      }

      class ChosenImpl {
        - int[] allNumberForChosen
        - int minNumberForChosen
        - int maxNumberForChosen
        - RandomNumberGenerate rng

        + int[] nextChosen(int total)
        - void initAllNumber()
        - int[] remove(int index)
      }

```

## Como Executar
Para executar este projeto, siga os passos abaixo:

- Clone este repositório.
- Compile os arquivos Java.
- Execute a classe App.java para iniciar o programa.

``Certifique-se de ter o JDK instalado para compilar e executar o código.``

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para melhorar este projeto.
