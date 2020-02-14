import java.util.Objects;

public class Aluno {
    private String nome;
    private String sobrenome;
    private Integer codigo;

    public Aluno(String nome, String sobrenome, int codigo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return codigo == aluno.codigo;
    }


}
