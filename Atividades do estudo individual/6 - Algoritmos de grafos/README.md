# 6 - Algoritmos de grafos

Um grafo é uma estrutura de dados não linear que consiste em vértices e arestas. Os vértices são às vezes também referidos como nós e as arestas são linhas ou arcos que conectam quaisquer dois nós no grafo. Mais formalmente, um grafo é composto por um conjunto de vértices (V) e um conjunto de arestas (E).

> Os grafos são usados para resolver muitos problemas do mundo real. Os grafos são usados para representar redes. As redes podem incluir caminhos em uma cidade ou rede telefônica ou rede de circuitos. Os grafos também são usados em redes sociais como LinkedIn, Facebook. Por exemplo, no Facebook, cada pessoa é representada com um vértice (ou nó). Cada nó é uma estrutura e contém informações como id da pessoa, nome, gênero, local etc.

## Termos básicos

- **Vértices**: Os vértices são as unidades fundamentais do grafo. Cada vértice/nó pode ser rotulado ou não rotulado.

- **Arestas**: As arestas são desenhadas ou usadas para conectar dois nós do grafo. As arestas podem conectar quaisquer dois nós de qualquer maneira possível. Não há regras. Cada aresta pode ser rotulada/não rotulada.

## Grafos ponderados

Um grafo ponderado é uma estrutura de dados de grafo na qual cada aresta tem um peso numérico ou custo associado a ela. O peso representa algum atributo ou quantidade associada à aresta, como distância, custo, tempo ou capacidade.

## Algoritmo de Dijkstra

O algoritmo de Dijkstra é um **algoritmo guloso** usado para encontrar os caminhos mais curtos entre os nós em um grafo ponderado com pesos positivos. Foi concebido pelo cientista da computação **Edsger W. Dijkstra** em 1956 e publicado três anos depois.

O algoritmo começa no nó que você escolhe (o nó de origem) e analisa o grafo para encontrar o caminho mais curto entre esse nó e todos os outros nós no grafo. O algoritmo mantém o controle da distância mais curta atualmente conhecida de cada nó para o nó de origem e atualiza esses valores se encontrar um caminho mais curto.

### Passo a Passo

1. **Inicialização**: Inicialize as distâncias de todos os vértices como infinitas, exceto a distância do vértice de origem, que é definida como 0. Crie uma fila de prioridade vazia e insira o vértice de origem com uma distância de 0.

2. **Extração do vértice mínimo**: Extraia o vértice com a distância mínima da fila de prioridade. Vamos chamar este vértice de `u`.

3. **Atualização das distâncias**: Para cada vértice `v` adjacente a `u`, se a distância de `v` for maior do que a distância de `u` mais o peso da aresta `(u, v)`, atualize a distância de `v` para ser a distância de `u` mais o peso da aresta `(u, v)`.

4. `Inserção na fila de prioridade`: Insira o vértice `v` na fila de prioridade.

5. **Repetição**: Repita os passos 2 a 4 até que a fila de prioridade esteja vazia.