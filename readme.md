## Componentes do jogo
- Personagens
- "Motor" do jogo (onde está a inteligência)
<br />
### Personagens
- Tipos:
  - Humano
  - Animal

- Cada **personagem** tem uma **habilidade**. Essa habilidade tem um **nome** e uma **pontuação máxima**.

- Além da habilidade, cada personagem possui um **identificador**, um **nome**.

- **Animais** possuem, além dos demais atributos (características) de **Personagem**, uma **raça**.

- **Humanos** possuem, além dos demais atributos (características) de **Personagem**, um **sexo**.

**Personagens possuem a capacidade de *apresentar sua habilidade*. (COMPORTAMENTO)**
<br />
### "Motor" do jogo
É o componente com a inteligência para controlar os elementos básicos de funcionalidade do jogo.

No nosso jogo teremos três comportamentos controlados pelo motor:
- obter a lista de personagens;
- escolher o adversário
- recuperar os detalhes de um personagem a partir de seu identificador.

### Durante o jogo
Passos do jogo:
1. Listar os personagens para o usuário escolher
2. Ler a escolha do usuário
3. Confirmar a escolha
4. O computador escolhe o adversário do jogador
5. Apresentar a habilidade do jogador
6. Apresentar a habilidade do adversário
7. Verificar o ganhador
8. Apresentar o resultado