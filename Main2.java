public class Main2 {
    public static void main(String[] args) {
        // les primitives sont en minuscules
        int x = 10; // 32 bit.
        long y = 10; // 64 bit.
        short s = 16; // 16 bit.
        byte b = 8; // 8 bit.
        // char c = 'a'; 
        float f = 1.0f; //
        double d = 1.0f; //
        String nom = "John";
        String nom2 = "John";

        if (nom == nom2) {
            System.out.println("Les noms sont identiques");
        } else {
            System.out.println("Les noms sont différents");
        }

        System.out.printf("La valeur de x est: %d et le nom est %s \n", x, nom);
        /*
         * %c character
         * %d decimal (integer) number (base 10)
         * %e exponential floating-point number
         * %."x"f floating-point number   x pour le nombre de chiffre après la virgule
         * %i integer (base 10)
         * %o octal number (base 8)
         * %s String
         * %u unsigned decimal (integer) number
         * %x number in hexadecimal (base 16)
         * %t formats date/time
         * %% print a percent sign
         * \% print a percent sign
         */
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        int i = 0;
        while (i<10){
            System.out.printf("i est égal à:%d \n",i);
            i++;
        }
        for (int j=0 ; j<10; j++){
            System.out.printf("j est égal à:%d \n",j);
        }
        String Cars[] = {"Volvo","Renault","Citroen"};
        for (String car : Cars){
            System.out.println(car);
        }
    }
}