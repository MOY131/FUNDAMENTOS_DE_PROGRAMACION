package TEMA3;

public class DOWHILE_EXAMPLE {
    static void main() {
int contador= 0;
        do { // inicio de do-while
            System.out.println("contador="+ contador);
            contador=contador+1;
        } while(contador<=5);//fin de do-while
        System.out.println("Continua el programa");
    }
}