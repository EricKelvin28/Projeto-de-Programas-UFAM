import java.util.ArrayList;

public class Turma {
    String disciplina;
    int ano;
    int semestre;
    Professor professor;
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    Turma(String disciplina, int ano, int semestre, Professor professor){
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
        this.professor = professor;
    }
    void addAluno(Aluno aluno){
        Aluno existe = this.getAluno(aluno.matricula);
        if (existe == null) {  
            this.alunos.add(aluno);
        }
    }

    Aluno getAluno(int matricula){
        Aluno alunoBuscado = null;
        for(int i = 0; i< this.alunos.size(); i++){
            Aluno aux = this.alunos.get(i);
            if (aux.matricula == matricula) {
                alunoBuscado = aux;
            }
        }
        return alunoBuscado;

    }
    double getMediaIdade (){
        double soma = 0;
        for(int i = 0; i< this.alunos.size(); i++){
            Aluno aux = this.alunos.get(i);
            soma = soma + aux.getIdade();
        }
        double media = soma/this.alunos.size();
        return media;
        
    }
    String getDescricao(){
        String descricao = "Turma " + this.disciplina +" - "+ this.ano + "/" + this.semestre + " ("+ this.professor.getDescricao() +"):" + "\n";
        for(int i = 0; i < this.alunos.size(); i++){

            descricao += "- Aluno "+(i+1)+ ":" +this.alunos.get(i).getDescricao()+"\n";
        }
        return descricao;
    }

}
