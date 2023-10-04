#java #retorno #return
O tipo de retorno de um método especifica o tipo de valor que o método retorna quando é chamado.

- Void 
Um método com tipo de retorno `void` não retorna nenhum valor. Geralmente, é usado para métodos que executam uma ação, mas não produzem um resultado que precise ser retornado.
```java
public void imprimirMensagem() { 
	System.out.println("Olá, Mundo!"); 
}
```

- Primitivos (Números ou caracteres)
Métodos podem retornar qualquer tipo primitivo em Java, como `int`, `double`, `boolean`, `char`, etc.
```java
public int somar(int a, int b) { 
	return a + b; 
}
```

- Objetos
Métodos também podem retornar objetos de classes personalizadas ou objetos de classes Java incorporadas, como `String`, `ArrayList`, `Date`, etc.

- Arrays
Um método pode retornar um array de qualquer tipo. O tipo de retorno do método será o tipo de array, como `int[]`, `String[]`, etc.
```java
public int[] gerarArray(int tamanho) { 
	int[] numeros = new int[tamanho]; 
// Preencher o array aqui return numeros; 
}
```

- Genéricos
Os métodos podem retornar tipos genéricos que permitem maior flexibilidade no uso do método.
```java
public <T> T retornarElemento(T[] array, int indice) { 
	return array[indice]; 
}
```