package polimorfismo;

public class Main{
    public static void main(String[] args) {
    
        Calculadora calc = new Calculadora(); 

        calc.somar(2,3);
        calc.somar(2.3,2.3);

        Animal a1 = new Animal();
        a1.fazersom();

        Cachorro c1 = new Cachorro();
        c1.fazersom();

        Carro c2 = new Carro();
        acelerarVeiculo(c2);

        Moto m1 = new Moto();
        acelerarVeiculo(m1);
    }

public static void acelerarVeiculo(Veiculo v){
    v.acelerar();
}

}