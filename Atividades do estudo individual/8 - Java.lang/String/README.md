# java.lang.String

A classe `String` foi introduzida no ***JDK 1.0*** para representar cadeias de caracteres em Java. Ela é utilizada para armazenar sequências imutáveis de caracteres Unicode. Uma vez que uma instância de `String` é criada, seu conteúdo não pode ser alterado. Para manipulação de strings de forma mutável, Java oferece as classes `StringBuilder` e `StringBuffer`.

A classe `String` implementa interfaces importantes:

- `Serializable`: Permite a conversão de objetos String em sequências de bytes para facilitar a serialização e persistência em disco ou transmissão pela rede.

- `Comparable`: Permite a comparação de ordem entre duas instâncias de String usando o método compareTo, facilitando a ordenação.

- `CharSequence`: Fornece um acesso uniforme a diferentes tipos de sequências de caracteres, permitindo o uso de métodos compatíveis com strings.

A classe `String` oferece diversas funcionalidades, incluindo:

- Acesso a caracteres individuais: Permite acessar caracteres específicos por meio de índices.
- Operações de comparação e busca: Oferece métodos para comparar strings e buscar por subcadeias.
- Transformação de case: Métodos para converter strings para letras maiúsculas ou minúsculas.
- Concatenação: Permite a concatenação de strings utilizando o operador `+` ou por meio da classe `StringBuilder`, que é mais eficiente em operações de manipulação de texto devido à sua mutabilidade.

A codificação de caracteres em Java é baseada em UTF-16, o que significa que cada caractere em uma String é representado por um ou dois code units de 16 bits.

No contexto de internacionalização e suporte a vários idiomas, o uso de `String` como uma sequência de caracteres é crucial, e o Java oferece amplo suporte para manipulação eficiente de strings, garantindo a integridade dos dados e facilitando as operações com texto em diferentes contextos de aplicativos.

# Exercicíos

1. Escreva um programa que inverta uma String.