import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int cont=1;
        String cases;
        while(!(cases=entrada.nextLine()).equals("*")){
            System.out.println(String.format("Case %d: Hajj-e-%s", cont, cases.equals("Hajj")?"Akbar":"Asghar"));
            cont++;
        }
    }
}
