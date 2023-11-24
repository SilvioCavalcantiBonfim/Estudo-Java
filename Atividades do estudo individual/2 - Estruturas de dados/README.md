# 2 - Estruturas de dados

## Array
É uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo de tal modo que cada elemento pode ser identificado por, pelo menos, um índice ou mais. Além disso o os arrays armazenam seus dados em espaços contínuos da memoria.

| Ação | Big O |
| --- | --- |
| Acesso a um elemento | **O(1)** |
| Inserir ou remover um elemento no início | **O(n)** |
| Inserir ou remover um elemento no meio | **O(n)** |
| Inserir ou remover um elemento no fim | **O(1)** |


## Lista vinculada
É uma estrutura de dados linear composta por uma sequência de nós, onde cada nó contém um valor e uma referencia para o próximo nó da sequência.

| Ação | Big O |
| --- | --- |
| Acesso a um elemento | **O(n)** |
| Inserir ou remover um elemento no início | **O(1)** |
| Inserir ou remover um elemento no meio | **O(n)** |
| Inserir ou remover um elemento no fim | **O(n)** |

## Pilha
É uma estrutura de dados do tipo LIFO (Last In, First Out) que armazena seus dados de forma sequencial, empilhando um elemento em cima do outro. Uma pilha permite acesso apenas ao último elemento inserido e possui dois operadores principais: o PUSH, que insere um elemento na pilha, e o POP, que remove o ultimo elemento inserido na pilha.

| Ação | Big O |
| --- | --- |
| Observar | **O(1)** |
| PUSH | **O(1)** |
| POP | **O(1)** |

## Fila
É uma estrutura de dados do tipo FIFO (Frist In, Frist Out) que armazena seus dados de forma sequencial. Em uma fila a inserção dos dados é feito em uma extremidade e a saída é feita em outra extremidade. A fila permite acesso apenas ao elemento mais antigo inserido. Uma fila possui dois operadores: ENQUEUE (enfileirar) que insere elementos na fila e DEQUEUE  (desenfileirar) que remove elementos da fila.

| Ação | Big O |
| --- | --- |
| Observar | **O(1)** |
| ENQUEUE | **O(1)** |
| DEQUEUE | **O(1)** |

## Mapa
É uma estrutura de dados que armazena informações em pares do tipo chave-valor. As chaves são usadas para encontrar rapidamente um elemento e cada chave está associado a um único elemento e cada elemento inserido está associado a uma única chave. Normalmente essa chave é uma função hash com baixa colisão. 

| Ação | Big O |
| --- | --- |
| Acesso a um elemento | **O(1)** |
| Inserir ou remover um elemento no início | **O(1)** |
| Inserir ou remover um elemento no meio | **O(1)** |
| Inserir ou remover um elemento no fim | **O(1)** |
