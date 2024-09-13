package repetitionStructure;

public class ForArray {
  public static void main(String[] args) {
    String alunos [] = {"Carlos Garza", "Maude Cox", "Timothy Malone"};
    //For Classico
    // for (int i = 0; i < alunos.length; i++) {
    //   System.out.println("O aluno no indice i= " + i + " é " + alunos[i]);
    // }
    //For abreviado
    for (String aluno : alunos) {
      System.out.println("Nome do aluno é " + aluno);
    }

  }
}
