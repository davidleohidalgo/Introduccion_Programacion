public class Main {
    // PRIMERA PARTE DEL EJERCICIO
    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 220;
        int var3 = 15;
        var resulatdo = operacion(var1,var2,var3);
        System.out.println(resulatdo);
        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        System.out.println(miCoche.numeroPuertas);
    }
    public static int operacion(int var1, int var2, int var3){
        return var1 + var2 + var3;
    }
}
    // SEGUNDA PARTE DEL EJERCICIO
class Coche {
        public int numeroPuertas = 4;
        public void sumarPuertas() {
            this.numeroPuertas++;
        }
}



