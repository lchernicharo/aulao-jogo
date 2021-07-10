package classes;

import java.util.List;

public interface MotorJogo {
  List<Personagem> obterPersonagens();
  Personagem escolherAdversario();
  Personagem obterPersonagem(int id);
}
