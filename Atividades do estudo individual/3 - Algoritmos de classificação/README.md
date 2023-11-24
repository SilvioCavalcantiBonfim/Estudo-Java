# 3 - Algoritmos de classificação

## Bubble sort 
É um algoritmo de ordenação simples e intuitivo que funciona por repetidas passagens através de uma lista de elementos. Em cada passagem, o algoritmo compara pares de elementos adjacentes e os troca se estiverem na ordem errada. Este processo é repetido até que a lista esteja ordenada. 

A característica distintiva do Bubble Sort é que ele “flutua” o maior elemento para o final da lista durante cada passagem. Assim, após a primeira passagem, o maior elemento estará no final da lista; após a segunda passagem, o segundo maior elemento estará no penúltimo lugar da lista, e assim por diante. Este comportamento é semelhante ao de uma “bolha” que sobe à superfície de um líquido, daí o nome “Bubble Sort”.

- **Melhor caso**: O melhor caso do bubble sort ocorre quando o conjunto de dados já está ordenado.
- **Pior caso**: O pior caso do bubble sort ocorre quando o conjunto de dados já está ordenado porém de forma inversa.

| Caso | Big O |
| --- | --- |
| Melhor caso | O(n) |
| Caso médio | O(n²) |
| Pior caso | O(n²) |

```js
procedimento bubbleSort( A : vertor [] de inteiros)
	var
		trocado: logico
		i: inteiro
	inicio
  faca
    trocado <- falso
    para i de 0 ate tamanho(A)-2 faca
      se A[ i ] > A[ i + 1 ] entao
        trocar( A[ i ], A[ i + 1 ] )
        trocado <- verdadeiro
      fimse
    fimpara
  enquanto trocado
fimprocedimento
```

## Selection sort
É um algoritmo de ordenação que opera encontrando o menor elemento em uma lista e movendo-o para a posição correta. Ele faz isso repetidamente, passando por toda a lista várias vezes.

Em cada passagem, o algoritmo busca o menor elemento na parte não ordenada da lista. Quando o menor elemento é encontrado, ele é trocado com o primeiro elemento da parte não ordenada da lista. Este processo continua até que toda a lista esteja ordenada.

Por exemplo, na primeira passagem, o menor elemento é selecionado e trocado com o elemento na primeira posição. Na segunda passagem, o menor elemento restante é selecionado e trocado com o elemento na segunda posição, e assim por diante.

- **Melhor/Pior caso**: Como é feito comparações com cada elemento da lista para encontrar o menor valor, o selection sort só possui o caso médio.

| Caso | Big O |
| --- | --- |
| Melhor caso | O(n²) |
| Caso médio | O(n²) |
| Pior caso | O(n²) |

```js
procedimento selectionSort( A : vertor [] de inteiros)
	var
		i,j, indexMin: inteiro
	inicio
	  para i de 0 ate tamanho(A)-1 faca
			para j de i+1 ate tamanho(A) faca
				se A[j] < A[indexMin] entao
					indexMin = j
				fimse
			fimpara
			se indexMin <> i entao
				troca(A[i], A[indexMin])
			fimse
		fimpara
fimprocedimento
```

## Insertion Sort

É um algoritmo de ordenação que constrói a lista ordenada um elemento de cada vez. Ele é muito semelhante à maneira como você ordena cartas de baralho em suas mãos.

O algoritmo começa na segunda posição da lista, considerando o primeiro elemento já ordenado. Em seguida, ele compara o elemento atual com os elementos anteriores. Se o elemento atual for menor, ele troca de posição com o elemento anterior e continua a comparação com os próximos elementos anteriores até encontrar uma posição onde o elemento anterior não seja maior, ou até que todos os elementos anteriores tenham sido verificados. Ele então insere o elemento nesta posição.

Este processo é repetido para todos os elementos na lista, resultando em uma lista ordenada.

- **Melhor caso**: Quando a lista está ordenado.
- **Pior caso**: Quando a lista está em ordem inversa.

| Caso | Big O |
| --- | --- |
| Melhor caso | O(n) |
| Caso médio | O(n²) |
| Pior caso | O(n²) |

## Quicksort
É um algoritmo de ordenação eficiente que utiliza a estratégia de divisão e conquista. Esta estratégia envolve dividir a lista em duas partes com base em um elemento selecionado, chamado de pivô. Os elementos menores que o pivô são movidos para a esquerda do pivô e os elementos maiores são movidos para a direita. Este processo de rearranjo é conhecido como partição.

Após a partição, o pivô está em sua posição final ordenada. Em seguida, o Quicksort é aplicado recursivamente às duas sublistas de elementos menores e maiores. Este processo de divisão, partição e recursão continua até que todas as sublistas contenham apenas um elemento, momento em que a lista completa se encontra ordenada.

- **Melhor caso**: O melhor caso ocorre quando o pivô sempre divide o array em duas metades quase iguais.
- **Pior caso**: O pior caso ocorre quando o pivô sempre vai para uma das extremidades do array.

| Caso | Big O |
| --- | --- |
| Melhor caso | O(n log n) |
| Caso médio | O(n log n) |
| Pior caso | O(n²) |