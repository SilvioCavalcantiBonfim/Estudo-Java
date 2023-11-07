# Dia 2

**Array**: É uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo de tal modo que cada elemento pode ser identificado por, pelo menos, um índice ou mais. Além disso o os arrays armazenam seus dados em espaços contínuos da memoria.

| Ação | Big O |
| --- | --- |
| Acesso a um elemento | O(1) |
| Inserir ou remover um elemento no início | O(n) |
| Inserir ou remover um elemento no meio | O(n) |
| Inserir ou remover um elemento no fim | O(1) |

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/c428d7a4-fef3-45ae-b210-75cdd22fb322/2f8fd467-5dd3-4954-9d49-a53aa4cddbcf/Untitled.png)

**Lista vinculada**: É uma estrutura de dados linear composta por uma sequência de nós, onde cada nó contém um valor e uma referencia para o próximo nó da sequência.

| Ação | Big O |
| --- | --- |
| Acesso a um elemento | O(n) |
| Inserir ou remover um elemento no início | O(1) |
| Inserir ou remover um elemento no meio | O(n) |
| Inserir ou remover um elemento no fim | O(n) |

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/c428d7a4-fef3-45ae-b210-75cdd22fb322/2942cd12-b8f1-4240-b42a-a4385f9fc06b/Untitled.png)

**Pilha**: É uma estrutura de dados do tipo LIFO (Last In, First Out) que armazena seus dados de forma sequencial, empilhando um elemento em cima do outro. Uma pilha permite acesso apenas ao último elemento inserido e possui dois operadores principais: o PUSH, que insere um elemento na pilha, e o POP, que remove o ultimo elemento inserido na pilha.

| Ação | Big O |
| --- | --- |
| Observar | O(1) |
| PUSH | O(1) |
| POP | O(1) |

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/c428d7a4-fef3-45ae-b210-75cdd22fb322/ba555bb0-a006-4ca4-8c21-6859681ff8de/Untitled.png)

********Fila********: É uma estrutura de dados do tipo FIFO (Frist In, Frist Out) que armazena seus dados de forma sequencial. Em uma fila a inserção dos dados é feito em uma extremidade e a saída é feita em outra extremidade. A fila permite acesso apenas ao elemento mais antigo inserido. Uma fila possui dois operadores: ENQUEUE (enfileirar) que insere elementos na fila e DEQUEUE  (desenfileirar) que remove elementos da fila.

| Ação | Big O |
| --- | --- |
| Observar | O(1) |
| ENQUEUE | O(1) |
| DEQUEUE | O(1) |

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/c428d7a4-fef3-45ae-b210-75cdd22fb322/6a9a49b6-c9bf-4e64-872b-d668b3c69867/Untitled.png)

********Mapa********: É uma estrutura de dados que armazena informações em pares do tipo chave-valor. As chaves são usadas para encontrar rapidamente um elemento e cada chave está associado a um único elemento e cada elemento inserido está associado a uma única chave. Normalmente essa chave é uma função hash com baixa colisão. 

| Ação | Big O |
| --- | --- |
| Acesso a um elemento | O(1) |
| Inserir ou remover um elemento no início | O(1) |
| Inserir ou remover um elemento no meio | O(1) |
| Inserir ou remover um elemento no fim | O(1) |

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/c428d7a4-fef3-45ae-b210-75cdd22fb322/49bc00c7-fef8-481e-bf7d-4784dea14c4a/Untitled.png)