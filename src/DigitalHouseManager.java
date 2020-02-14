import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List <Aluno> listaDeAlunos=new ArrayList<>();
    private List <Professor> listaDeProfessores=new ArrayList<>();
    private List <Curso> listaDeCursos=new ArrayList<>();
    private List <Matricula>listaDeMatriculas=new ArrayList<>();

    public DigitalHouseManager(){}

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso cursinho = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        int cont = 0;
        for (Curso curso : listaDeCursos) {
            if(curso.getCodigoCurso().equals(codigoCurso)){
                cont +=1;
            }
            }
        if (cont ==0){
            listaDeCursos.add(cursinho);
            System.out.println("adicionado");
        }
        else {
            System.out.println("Não é possivel adicionar");
        }
    }


    public void excluirCurso(Integer codigoCurso) {
        for (int i = 0; i < listaDeCursos.size(); i++) {
            if (codigoCurso.equals(listaDeCursos.get(i).getCodigoCurso())) {
                listaDeCursos.remove(i);
                System.out.println("Curso removido com sucesso!");
            } else {
                System.out.println("curso não existe");
            }
        }
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
