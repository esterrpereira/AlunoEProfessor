public class Aluno {
  private String nome;
  private String matricula;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
public void exibeDados (){
  System.out.println("Nome Aluno: " + nome);
  System.out.println("Matricula Aluno: " + matricula);
}
}