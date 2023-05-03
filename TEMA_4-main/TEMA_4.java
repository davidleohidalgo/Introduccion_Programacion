public class Main {
    public static void main(String[] args) {
        // Usando el Condicional If , else If y else.
        int numIf = 5;

        if (numIf > 0){
            System.out.println("El número " + numIf + " es Positivo");
        } else if (numIf < 0){
            System.out.println("El número " + numIf + " es Negativo");
        } else {
            System.out.println("El numero es igual a " + numIf);
        }

        // Usando el Bucle While, para incrementar la variable.
        int numWhile = 0;

        while (numWhile < 3) {
            System.out.println(numWhile);
            numWhile = numWhile + 1;
        }

        //Usando el DO While, para incrementar la variable
        int numDoWhile = 2;
        do {
            System.out.println(numDoWhile);
            numDoWhile = numDoWhile + 1;
           } while (numDoWhile < 2);

        // Usando el Bucle FOR para incrementar la variable
        for (int numFor = 0; numFor <= 3; numFor = numFor + 1){
            System.out.println(numFor);
        }
        
        // Usando el condicional Switch para seleccioanr una variable
        var estacion = "Primavera";

        switch (estacion){
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otono":
                System.out.println("Es Otono");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default: System.out.println("Esa estacion no existe, probar con un valor valido");
        }

    }

}


