# 4 - Algoritmos de pesquisa

## Busca linear
É um método de busca simples e direto que verifica cada elemento de uma lista sequencialmente até encontrar o elemento desejado ou até que todos os elementos tenham sido verificados. Este algoritmo é fácil de implementar e entender, mas não é o mais eficiente, especialmente para listas grandes, pois sua complexidade de tempo é linear, ou seja, aumenta proporcionalmente ao tamanho da lista. Em uma lista ordenada, existem algoritmos de busca mais eficientes disponíveis, como a busca binária, que têm uma complexidade de tempo logarítmica. No entanto, a busca linear ainda é útil em certos cenários, especialmente quando a lista está desordenada ou quando é necessário verificar todos os elementos, independentemente da ordem.

- **Melhor caso**: O primeiro elemento é o elemento buscado.
- **Caso Médio**: O elemento buscado está depois do indicie $(N+1)/2$.
- **Pior caso**: O ultimo elemento é o elemento buscado.

| Caso | Big O |
| --- | --- |
| Melhor caso | **O(1)** |
| Caso médio | **O(n)** |
| Pior caso | **O(n)** |

## Busca binária 

É um algoritmo eficiente para encontrar um item específico em uma lista ordenada de itens. Ele opera no princípio da divisão e conquista, dividindo repetidamente a lista pela metade até que o item seja encontrado ou até que reste apenas uma sublista vazia.

- **Melhor caso**: O melhor caso ocorre quando o elemento buscado é o elemento do meio.
- **Pior caso**: Ocorre quando temos que continuar reduzindo o espaço de busca até que ele tenha apenas um elemento.

| Caso | Big O |
| --- | --- |
| Melhor caso | **O(1)** |
| Caso médio | **O(log n)** |
| Pior caso | **O(log n)** |