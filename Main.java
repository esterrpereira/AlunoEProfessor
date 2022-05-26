class Main {
  static String[] nomeAluno = new String[2];
  static String[] matriculaAluno = new String[2];

  static String[] nomeProfessor = new String[2];
  static String[] idadeProfessor = new String[2];

  static int indiceAluno = 0;
  static int indiceProfessor = 0;

  public static void main(String[] args) {
    Aluno a1 = new Aluno();
    a1.setNome("Ester");
    a1.setMatricula(" 1");
    a1.exibeDados();

    Aluno aluno2 = new Aluno();
    aluno2.setNome("João");
    aluno2.setMatricula("2");
    aluno2.exibeDados();
    
    Aluno aluno3 = new Aluno();
    aluno3.exibeDados();
    
    Professor p1 = new Professor();
    Professor p2 = new Professor();

    p1.setNome ("Pedro\n");
    p1.setIdade(23);

    
    p2.setNome ("Fernanda\n");
    p2.setIdade(28);

    p1.exibeDados();
    p2.exibeDados();

    /*
     * InsereAluno("Nome Aluno 1", "Matricula Aluno 1");
     * InsereAluno("Nome Aluno 2", "Matricula Aluno 2");
     * 
     * InsereProfessor("Nome Professor 1", "Matricula Professor 1");
     * InsereProfessor("Nome Professor 2", "Matricula Professor 2");
     * 
     * for (int i = 0; i < 2; i++) {
     * 
     * System.out.println("Nome Aluno: " + nomesAlunos[i]);
     * System.out.println("Matricula Aluno: " + matriculasAlunos[i]);
     * System.out.println("Nome Professor: " + nomesProfessores[i]);
     * System.out.println("Matricula Aluno: " + idadeProfessores[i]);
     * }
     */
  }
  /*
   * private static void InsereAluno (String nomeAluno, String matriculaAluno){
   * nomesAlunos [indiceAluno] = nomeAluno;
   * matriculasAlunos[indiceAluno] = matriculaAluno;
   * indiceAluno++;
   * }
   * private static void InsereProfessor (String nomeProfessor, String
   * idadeProfessor){
   * nomesProfessores [indiceProfessor] = nomeAluno;
   * idadesProfessores[indiceProfessor] = matriculaAluno;
   * indiceProfessor++;
   * }
   */
}