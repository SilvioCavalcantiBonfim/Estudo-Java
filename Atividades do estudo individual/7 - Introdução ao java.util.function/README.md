# java.util.function

O pacote java.util.function em Java fornece interfaces funcionais para expressões lambda e referências de métodos1. Uma interface funcional tem um único método abstrato, chamado de método funcional, que recebe uma entrada e retorna uma saída. O pacote **java.util.function** tem diferentes interfaces funcionais para diferentes cenários de mapeamento, como `Function<T, R>` que recebe um objeto do tipo T e o converte para o tipo R.

## Interface `Function<T, R>`

A interface `Function<T, R>` é uma interface funcional em Java que aceita uma entrada do tipo `T` e produz uma saída do tipo `R`. Em programação funcional, as funções são cidadãos de primeira classe, o que significa que podem ser passadas como valores, armazenadas em variáveis ou estruturas de dados, e usadas como argumentos ou valores de retorno de outras funções.

### Métodos padrão

- `apply()`: Este é o método funcional abstrato da interface Function. Ele aceita como entrada um parâmetro `t` do tipo `T` e retorna um objeto do tipo `R`.

- `andThen()`: Este método retorna uma função composta que primeiro aplica a função atual à entrada e, em seguida, aplica a função **after** ao resultado. Se a avaliação de qualquer função lançar uma exceção, ela será repassada ao chamador da função composta.

- `compose()`: Este método retorna uma função composta que primeiro aplica a função **before** à entrada e, em seguida, aplica a função atual ao resultado. Assim, a função combinada obtida como resultado de `compose()` aplica ambas as funções, no processo convertendo o tipo `V` para `R`.

- `identity()`: Este método retorna uma função que sempre retorna seu argumento de entrada. Isso pode ser útil quando você precisa de uma função que não faz nada.