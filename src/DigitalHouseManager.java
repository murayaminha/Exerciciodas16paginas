import java.util.List;

public class DigitalHouseManager {
    private List <Aluno> listaDeAlunos;
    private List <Professor> listaDeProfessores;
    private List <Curso> listaDeCursos;
    private List <Matricula>listaDeMatriculas;


    public DigitalHouseManager(List<Aluno> listaDeAlunos, List<Professor> listaDeProfessores, List<Curso> listaDeCursos, List<Matricula> listaDeMatriculas) {
        this.listaDeAlunos = listaDeAlunos;
        this.listaDeProfessores = listaDeProfessores;
        this.listaDeCursos = listaDeCursos;
        this.listaDeMatriculas = listaDeMatriculas;
    }


    public List getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public List getListaDeProfessores() {
        return listaDeProfessores;
    }

    public void setListaDeProfessores(List listaDeProfessores) {
        this.listaDeProfessores = listaDeProfessores;
    }

    public List getListaDeCursos() {
        return listaDeCursos;
    }

    public void setListaDeCursos(List listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
    }

    public List getListaDeMatriculas() {
        return listaDeMatriculas;
    }

    public void setListaDeMatriculas(List listaDeMatriculas) {
        this.listaDeMatriculas = listaDeMatriculas;
    }
}
