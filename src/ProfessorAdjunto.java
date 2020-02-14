public class ProfessorAdjunto extends Professor {
    private Integer qtdHorasMonitoria;

    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor,Integer qtdHorasMonitoria) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.qtdHorasMonitoria=qtdHorasMonitoria;
    }

    public Integer getQtdHorasMonitoria() {
        return qtdHorasMonitoria;
    }

    public void setQtdHorasMonitoria(Integer qtdHorasMonitoria) {
        this.qtdHorasMonitoria = qtdHorasMonitoria;
    }
}
