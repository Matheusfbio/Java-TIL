Aqui estão dois desafios sobre estruturas de tratamento de exceções em Java:

### Desafio 1: **Calculadora com Tratamento de Exceções**

**Descrição:**  
Implemente uma calculadora simples que realiza as operações básicas de adição, subtração, multiplicação e divisão. O programa deve receber dois números e o operador desejado (`+`, `-`, `*`, `/`). A calculadora deve lidar com os seguintes casos:

1. **Divisão por zero:** Lance e trate uma `ArithmeticException`.
2. **Operador inválido:** Lance e trate uma `IllegalArgumentException` se o operador não for válido.
3. **Entradas não numéricas:** Se o usuário fornecer algo que não seja um número, trate a exceção apropriada (ex.: `NumberFormatException`).

**Objetivo:**  
Criar um programa que capture as exceções mencionadas e forneça mensagens de erro adequadas ao usuário, permitindo que ele tente novamente.

**Exemplo de Saída:**

```java
Digite o primeiro número: 10
Digite o segundo número: 0
Digite o operador (+, -, *, /): /
Erro: Divisão por zero. Tente novamente.

Digite o primeiro número: 10
Digite o segundo número: 2
Digite o operador (+, -, *, /): x
Erro: Operador inválido. Tente novamente.
```

---

### Desafio 2: **Leitura de Arquivo com Exceções Personalizadas**

**Descrição:**  
Implemente um programa que leia o conteúdo de um arquivo de texto. O caminho do arquivo deve ser fornecido pelo usuário. O programa deve lidar com os seguintes casos:

1. **Arquivo não encontrado:** Trate a exceção `FileNotFoundException`.
2. **Erro de leitura do arquivo:** Trate a exceção `IOException`.
3. **Arquivo vazio:** Se o arquivo estiver vazio, crie e lance uma exceção personalizada chamada `EmptyFileException`, que deve estender a classe `Exception`.

**Objetivo:**  
Criar um programa que capture as exceções mencionadas e forneça mensagens de erro adequadas ao usuário. Se o arquivo for lido com sucesso, exiba o conteúdo na tela.

**Exemplo de Saída:**

```java
Digite o caminho do arquivo: /caminho/para/arquivo.txt
Erro: Arquivo não encontrado. Tente novamente.

Digite o caminho do arquivo: /caminho/para/arquivo.txt
Erro: O arquivo está vazio.

Conteúdo do arquivo:
Este é o conteúdo do arquivo.
```

Esses desafios ajudarão a praticar a criação e o uso de estruturas de tratamento de exceções em Java, além de desenvolver a habilidade de escrever código mais robusto e resiliente.
