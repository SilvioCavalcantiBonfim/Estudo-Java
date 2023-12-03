# java.util.Date

A classe Date foi introduzida no ***JDK 1.0*** para representar uma instância específica no tempo com precisão de milissegundos. Ela 

implementa várias interfaces importantes:

- `Serializable`, permitindo a transformação do *estado* de um objeto em uma sequência de bytes para facilitar sua serialização.

- `Cloneable`, possibilitando a criação de cópias de objetos Date campo a campo.
- `Comparable`, permitindo a comparação de duas instâncias Date por meio do método compareTo.

Embora a classe Date tenha sido originalmente projetada para refletir o Tempo Universal Coordenado (UTC), na prática, sua precisão pode ser afetada pelo ambiente em que a JVM está sendo executada. Por exemplo, em sistemas operacionais modernos, é comum assumir que um dia tem 86400 segundos. No entanto, o UTC incorpora ajustes adicionais para garantir sua sincronia com o Tempo Atômico Internacional (TAI).

O UTC periodicamente introduz um segundo extra, conhecido como segundo bissexto, que é adicionado no último segundo do dia 31 de dezembro ou 30 de junho. Essa adição tem como objetivo manter o UTC dentro de 0.9 segundos à frente do UT1, que é a versão do Tempo Universal (UT) com correções aplicadas.

Diferentemente do UTC, o Tempo Médio de Greenwich (GMT), também conhecido como Tempo Universal (UT) no meio científico, baseia-se em observações astronômicas da rotação da Terra em relação a corpos celestes distantes, em vez de depender exclusivamente de relógios atômicos.

>**Nota:** A partir do **Java 8**, foi introduzida a API `java.time` para melhorar a manipulação de datas e horas, corrigindo várias limitações encontradas na classe Date.

# Java.time

A API `java.time` é a principal e mais moderna introdução do **Java 8** para datas, horas, instantes e durações. Ela é baseada no sistema de calendário ISO, seguindo as regras do calendário gregoriano proléptico e oferece diversas melhorias em relação à `java.util.Date`, como:

- **Imutabilidade** e **Thread-Safety**: Todas as classes em `java.time` são imutáveis e thread-safe, o que significa que são mais seguras em ambientes concorrentes.

- Maior Precisão: Fornece classes específicas para diferentes necessidades, como `LocalDate`, `LocalTime`, `LocalDateTime`, `Instant`, entre outras, para representar datas, horas, instantes e fusos horários de maneira mais precisa.

- Manuseio de Fusos Horários: Possui suporte mais robusto e fácil para manipular diferentes fusos horários e operações com datas e horas em fusos horários específicos.

- API Mais Expressiva: Oferece métodos claros e específicos para realizar operações com datas e horas, além de recursos como `Period` para expressar períodos de tempo entre datas e `Duration` para representar uma medida precisa de tempo.

>**Note:** A transição para as classes `java.time` é altamente recomendada para uma manipulação mais segura, precisa e fácil de datas e horas em aplicações Java modernas.

# Exercícios

1. Escreva um programa que converta uma data em uma string formatada.

2. Converta essa string de volta para uma data.

3. Escreva um programa que calcule a diferença entre duas datas em dias.

4. Escreva um programa que adicione 5 dias a uma data.