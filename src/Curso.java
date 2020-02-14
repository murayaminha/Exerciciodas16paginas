import java.util.List;
import java.util.Objects;

public class Curso {
    private String nome;
    private Integer codigoCurso;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;
    private Integer qtdMaxAlunos;
    private List alunosMatriculados;


    public Curso(String nome, Integer codigoCurso,Integer qtdMaxAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.qtdMaxAlunos = qtdMaxAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public Integer getQtdMaxAlunos() {
        return qtdMaxAlunos;
    }

    public void setQtdMaxAlunos(Integer qtdMaxAlunos) {
        this.qtdMaxAlunos = qtdMaxAlunos;
    }

    public List getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codigoCurso.equals(curso.codigoCurso);
    }

}
