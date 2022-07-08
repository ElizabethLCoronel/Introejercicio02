public class Main {
    public static void main(String[] args) {

        System.out.println("Resultados IF: ");
        var numeroif = -5;
        if (numeroif>0){
            System.out.println("el numero es positivo");
        }
        else System.out.println("el numero es negativo");


        System.out.println("Resultados While: ");
        var numeroWhile = -5;
        while (numeroWhile<3){
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        System.out.println("Resultados Do-While: ");
        var contador = 5;
        do {
            System.out.println(contador);
            contador = contador +1;

        } while (contador<3);

        System.out.println("Resultados For: ");
        for (int numeroFor=0; numeroFor<=3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("Resultados Switch: ");
        var estacion ="otoño";

        switch (estacion){
            case "primavera":
                System.out.println("es primavera");
                break;
            case "verano":
                System.out.println("es verano");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            default:
                System.out.println("no es una estacion");
        }
    }
}