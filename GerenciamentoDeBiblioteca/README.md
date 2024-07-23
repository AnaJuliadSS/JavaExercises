# Sistema de Gerenciamento de Biblioteca com Menu Interativo utilizando `JOptionPane`

Você deve implementar um sistema para gerenciamento de biblioteca utilizando os modificadores de acesso `public`, `private`, e `protected`.

O sistema deve ser composto por duas classes: `Livro` e `Principal`.

A classe `Principal` deve conter o método `main` e implementar um menu interativo usando `JOptionPane` para permitir ao usuário adicionar e consultar livros na biblioteca.

## Requisitos:

### Classe `Livro`

- **Atributos:**
  - `titulo` (String) - Atributo público, acessível de qualquer lugar.
  - `autor` (String) - Atributo protegido, acessível apenas dentro do mesmo pacote ou subclasses.
  - `anoPublicacao` (int) - Atributo privado, acessível apenas dentro da classe `Livro`.

- **Construtor:**
  - Construtor público que inicializa todos os atributos.

- **Métodos:**
  - `getAnoPublicacao()` - Método público que retorna o ano de publicação.
  - `setAnoPublicacao(int ano)` - Método público que define o ano de publicação.
  - `exibirDetalhes()` - Método público que exibe os detalhes do livro (título, autor e ano de publicação).

### Classe `Principal`

- **Objetivo:**
  - Implementar um menu interativo para permitir ao usuário:
    - Adicionar um novo livro à biblioteca.
    - Listar todos os livros presentes na biblioteca.
    - Sair do programa.

1. **Adicionar Livro:**
   - Solicitar ao usuário que informe o título, autor e ano de publicação do livro.
   - Criar um objeto `Livro` com as informações fornecidas.
   - Adicionar o objeto `Livro` à lista de livros.

2. **Listar Livros:**
   - Exibir uma lista de todos os livros presentes na biblioteca.
   - Para cada livro, exibir os detalhes: título, autor e ano de publicação.

3. **Sair:**
   - Encerrar o programa.
