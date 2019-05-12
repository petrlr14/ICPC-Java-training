import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int cases=Integer.parseInt(entrada.nextLine());
        int money=0;
        for(int i=0; i<cases; i++){
            String[] line=entrada.nextLine().split(" ");
            if((line[0].charAt(0))=='d'){
                money+=Integer.parseInt(line[1]);
            }else{
                System.out.println(money);
            }
        }
    }
}
