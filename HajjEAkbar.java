import java.util.Scanner;

class HajjEAkbar {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String cases=entrada.nextLine();
        int cont=1;
        while(!cases.equals("*")){
            StringBuffer resp=new StringBuffer();
            resp.append("Case ").append(cont).append(": Hajj-e-");
            resp.append(cases.equals("Hajj")? "Akbar":"Asghar");
            System.out.println(resp.toString());
            cont++;
            cases=entrada.nextLine();
        }
    }
}
