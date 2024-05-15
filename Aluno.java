import java.util.Calendar;

/**
 * Aluno
 */
public class Aluno {
    String nome;
    int matricula;
    int anoNascimento;
    Aluno(){
        this("",0,0);
    }
    Aluno(String nome, int matricula, int anoNascimento){
        this.nome = nome;
        this.matricula = matricula;
        this.anoNascimento = anoNascimento;
    }
    public int getIdade(){
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int idade =anoAtual - this.anoNascimento;
        return idade;
    }
    public String getDescricao(){
        String descricao = (this.nome + " (mat=" + this.matricula + ", idade=" + this.getIdade() + ")");
        
        return descricao;

    }
    
}