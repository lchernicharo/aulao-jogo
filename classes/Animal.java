package classes;

public class Animal extends Personagem {
  private String raca;

  public Animal(int id, String nome, Habilidade habilidade) {
    super(id, nome, habilidade);
  }
  
  public String getRaca() {
    return raca;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }
}
