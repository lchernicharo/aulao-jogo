package classes;

public class Personagem {
  private int id;
  private String nome;
  private Habilidade habilidade;

  public Personagem(int id, String nome, Habilidade habilidade) {
    this.id = id;
    this.nome = nome;
    this.habilidade = habilidade;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Habilidade getHabilidade() {
    return habilidade;
  }

  public void setHabilidade(Habilidade habilidade) {
    this.habilidade = habilidade;
  }

  public String getTipo() {
    return getClass().getSimpleName();
  }

  public int apresentarHabilidade() {
    return (int) (Math.random() * habilidade.getValorMaximo() + 1);
  }

  @Override
  public String toString() {
    return String.format("%d - %s (%s) - Habilidade: %s", id, nome, getTipo(), habilidade.getNome());
  }
}