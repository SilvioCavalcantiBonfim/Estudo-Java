# 5 - Algoritmos de árvores

Uma árvore em estruturas de dados é uma estrutura hierárquica que é usada para representar e organizar dados de uma maneira que seja fácil de navegar e pesquisar. É uma coleção de nós que estão conectados por arestas e tem uma relação hierárquica entre os nós. 

## Termos básicos

- **Nó pai**: O nó que é um predecessor de um nó é chamado de nó pai desse nó.
- **Nó filho**: O nó que é o sucessor imediato de um nó é chamado de nó filho desse nó.
- **Nó raiz**: O nó mais alto de uma árvore ou o nó que não tem nenhum nó pai é chamado de nó raiz. Uma árvore não vazia deve conter exatamente um nó raiz e exatamente um caminho da raiz para todos os outros nós da árvore.
- **Nó folha ou nó externo**: Os nós que não têm nenhum nó filho são chamados de nós folha.
- **Antepassado de um nó**: Qualquer nó predecessor no caminho da raiz para aquele nó é chamado de antepassado daquele nó.
- **Descendente**: Qualquer nó sucessor no caminho do nó folha para aquele nó.
- **Irmão**: Filhos do mesmo nó pai são chamados de irmãos.
- **Nível de um nó**: A contagem de arestas no caminho do nó raiz para aquele nó. O nó raiz tem nível 0.
- **Nó interno**: Um nó com pelo menos um filho é chamado de nó interno.
- **Vizinho de um nó**: Nós pai ou filho daquele nó são chamados de vizinhos daquele nó.
- **Subárvore**: Qualquer nó da árvore junto com seu descendente.

## Árvore Binária

Uma árvore binária é uma estrutura de dados hierárquica em que cada nó tem no máximo dois filhos, geralmente referidos como o filho esquerdo e o filho direito.

### Operações Básicas

| Operação | Melhor caso | Pior caso |
| --- | --- | --- |
| Inserção | **O(log n)** | **O(n)** | 
| Pesquisa | **O(log n)** | **O(n)** |
| Remoção | **O(log n)** | **O(n)** |
| Percorrer a árvore | **O(n)** | **O(n)** |

### Formas de percorrer árvores binarias

- **Percurso em ordem (In-order)**: No percurso em ordem, primeiro percorremos a subárvore esquerda, depois visitamos o nó raiz e, finalmente, percorremos a subárvore direita. Isso é útil, por exemplo, para obter nós de uma Árvore Binária de Busca (BST) em ordem não decrescente.

- **Percurso em pré-ordem (Pre-order)**: No percurso em pré-ordem, primeiro visitamos o nó raiz, depois percorremos a subárvore esquerda e, finalmente, percorremos a subárvore direita. Isso é útil para criar uma cópia da árvore ou para obter expressões prefixadas em uma árvore de expressões.

- **Percurso em pós-ordem (Pos-order)**: No percurso em pós-ordem, primeiro percorremos a subárvore esquerda, depois percorremos a subárvore direita e, finalmente, visitamos o nó raiz. Isso é útil para excluir a árvore ou para obter expressões posfixadas em uma árvore de expressões.