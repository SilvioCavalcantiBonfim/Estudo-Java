# Method Reference

O Method Reference é um recurso poderoso introduzido no Java 8 para referenciar métodos de interfaces funcionais de maneira concisa. Ele oferece uma alternativa mais enxuta e legível às expressões lambda quando se trata apenas de chamar um método existente.

## Tipos de Method Reference

Exitem quatro tipos de method reference:

### Métodos estaticos 

O Method Reference para métodos estáticos referencia um método estático de uma classe. Isso é útil quando desejamos invocar métodos estáticos em interfaces funcionais.

```java
mport java.util.function.BiFunction;

public class MethodReferencesExamples {

    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }

    public static String appendStrings(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Reference to a static method
        System.out.println(MethodReferencesExamples.mergeThings("Hello ", "World!", MethodReferencesExamples::appendStrings));
    }
}
```

### Referência a um método de instância de um objeto específico

Este tipo de Method Reference invoca um método que pertence a um objeto específico. É útil ao utilizar métodos de instância em interfaces funcionais.

```java
import java.util.function.BiFunction;

public class MethodReferencesExamples {

    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }

    public String appendStrings2(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        MethodReferencesExamples myApp = new MethodReferencesExamples();

        System.out.println(MethodReferencesExamples.mergeThings("Hello ", "World!", myApp::appendStrings2));
    }
}
```

### Referência a um método de instância de um objeto arbitrário de um tipo específico

Neste caso, a referência de método invoca um método que pertence a um objeto arbitrário com um tipo específico.

```java
public class MethodReferencesExamples {

    public static void main(String[] args) {

        String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
      Arrays.sort(stringArray, String::compareToIgnoreCase);
    }
}
```

### Referência a um construtor

A referência a um construtor é usada para fazer referência a um construtor e é útil em situações onde a criação de objetos é necessária, por exemplo, em operações de mapeamento.

```java

public class Person{
  private final String name;
  public Person(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
}

public class MethodReferencesExamples {

    public static void main(String[] args) {

        String[] names = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };

        List<Person> person = names.asList().stream().map(Person::new);
    }
}
```

O Method Reference é uma adição valiosa ao Java, simplificando a chamada de métodos e a criação de instâncias, tornando o código mais legível e conciso.
