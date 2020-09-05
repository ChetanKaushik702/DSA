import java.util.Random;
// A simple formatting example program
class Formatter {
    public static void main(String[] args) {
        
        for (int i=1; i<=20; i++) {
            System.out.printf("%-4d %-4d %-4d\n", i, i*i, i*i*i);
        }

        //printing binary equivalent, octal equivalent and hexadecimal equivalent of a decimal number
        System.out.printf("%o %#X", 10, 10);

        //formatting a string
        System.out.printf("%-20s", "Enjoying formatting with Java.\n");

        //Getting a random number b/w 0 and 9
        var rand = new Random();
        for (int i=0; i<10; i++) 
            System.out.println("i: " + rand.nextInt(10));

        //generating a random password
        String cap = "Aa1!Bb2@Cc3#Dd4$Ee5%Ff6^Gg7&Hh8*Ii9(Jj?Kk<Ll>Mm{Nn[Oo}Pp)Qq]RrS|sT\tUu:Vv/WwX:xY_y+Z=z";
        
        char[] password = new char[8];
        for (int i=0; i<8; i++) {
            password[i] = cap.charAt(rand.nextInt(cap.length()));
        }

        System.out.println("Your password is: " + new String(password));
        
        //representation in exponential form
        double val = 123.45;
        System.out.printf("\n%1.4e", val);
    }
}