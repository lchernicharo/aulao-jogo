package app;

import java.util.ArrayList;
import java.util.List;

import classes.Animal;
import classes.Habilidade;
import classes.Humano;
import classes.MotorJogo;
import classes.Personagem;

public class MotorJogoDuelo implements MotorJogo {
  private List<Personagem> personagens;

  public MotorJogoDuelo() {
    personagens = new ArrayList<>();

    personagens.add(new Humano(21, "Chung Lee", new Habilidade("Equilibrar pratos", 10)));
    personagens.add(new Humano(23, "Michael Jackson", new Habilidade("Dançar", 9)));
    personagens.add(new Animal(35, "Bidu", new Habilidade("Fingir de morto", 7)));
    personagens.add(new Animal(47, "Flipper", new Habilidade("Dançar sobre a água", 15)));
  }

  @Override
  public List<Personagem> obterPersonagens() {
    return personagens;
  }

  @Override
  public Personagem escolherAdversario() {
    int indice = (int)(Math.random() * personagens.size());
    return personagens.get(indice);
  }

  @Override
  public Personagem obterPersonagem(int id) {
    return personagens.stream().filter(personagem -> personagem.getId() == id).findFirst().get();
  }
  
}
