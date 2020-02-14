public class Main {
    public static void main(String[] args) {


    Curso curso = new Curso("mat", 52615,13);
    Curso curso1 = new Curso("mah",1,20);

    DigitalHouseManager digitalHouseManager = new DigitalHouseManager();


    digitalHouseManager.registrarCurso("mah",1,20);
    digitalHouseManager.registrarCurso("mah",2,20);
    digitalHouseManager.registrarCurso("mah",1,20);
    digitalHouseManager.registrarCurso("mah",2,20);
    digitalHouseManager.registrarCurso("mah",3,20);
    digitalHouseManager.registrarCurso("mah",4,20);


        System.out.println(digitalHouseManager.getListaDeCursos());



}}
