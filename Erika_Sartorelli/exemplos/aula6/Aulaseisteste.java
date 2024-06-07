package exemplos.aula6;

public class Aulaseisteste {
    public static void main(String[] args){
        Professor profeUm =new Professor();
        Professor melhorProf = new Professor();

        profeUm.nome =" IgorBola ";
        profeUm.materia=" A.I ";

        melhorProf.nome =" sandro ";
        melhorProf.materia= " Poo ";

        profeUm.apresentarse();
        melhorProf.apresentarse();

       Arma vandal = new Arma();

       vandal.nome = "Vandal - valorant";
       vandal.skin = "saqueadora";
       vandal.dano = "180";
    }
}
