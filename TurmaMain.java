
public class TurmaMain {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Eric",21752731,1998);
        String desc = aluno1.getDescricao();
        /*System.out.println(desc);*/
        Professor prof = new Professor("Dr.","Horacio Fernandes", 2208);

        String descProf = prof.getDescricao(); 
        /*System.out.println(descProf);*/
        Turma turma = new Turma("Projeto de programas", 2024, 1, prof);
        turma.addAluno(aluno1);
        String descricao = turma.getDescricao();
        System.out.println(descricao);



    }
    
}
