package classes;

public class Humano extends Personagem {
  private char sexo;
  
  public Humano(int id, String nome, Habilidade habilidade) {
    super(id, nome, habilidade);
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    if(!"MmFf".contains(String.valueOf(sexo))) {
      throw new IllegalArgumentException("Sexo deve ser M ou F.");
    }

    this.sexo = sexo;
  }
}
