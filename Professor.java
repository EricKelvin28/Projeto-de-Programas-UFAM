
public class Professor {
    String titulacao;
    String nome;
    int matricula;
    
    Professor(){
        this("","",0);
    }
    Professor(String titulacao,String nome, int matricula){
        this.titulacao = titulacao;
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getDescricao(){
        String desc = "Prof. " + this.titulacao + " " + this.nome + " - mat " + this.matricula;
        return desc;
    }
}
