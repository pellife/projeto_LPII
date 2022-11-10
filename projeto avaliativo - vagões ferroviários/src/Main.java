import java.util.Stack;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception{
        Stack<vagao> locomotiva = new Stack<>(); //pilha locomotiva para guardar os vagões
        Scanner entrada = new Scanner(System.in);
        int op = 0; //variável para operar switch
        int op2 = 0; //variável para operar switch
        int op3 = 0; //variável para operar switch

         do{
            System.out.println("           MENU DE OPERAÇÕES");
            System.out.println("/////////////////////////////////////////");
            System.out.println("INFORME A SITUAÇÃO DA LOCOMOTIVA (1 - 3):");
            System.out.println("1 - PARADA NO TERMINAL;");
            System.out.println("2 - EM MOVIMENTO;");
            System.out.println("3 - EM PONTO DE INTERCONEXÃO;");
            System.out.println("4 - FECHAR MENU");
            System.out.println("");
             op = entrada.nextInt();
            System.out.println(""); 

             switch(op){
                case 1:
                 do{
                    System.out.println("INFOMRE A OPERAÇÃO DESEJADA (1 - 3):");
                    System.out.println("1 - EMBARCAR PRODUTO NO VAGÃO;");
                    System.out.println("2 - DESEMBARCAR VAGÃO;");
                    System.out.println("3 - VOLTAR PARA MENU DE OPERAÇÕES");
                    System.out.println("");
                     op2 = entrada.nextInt();
                    System.out.println(""); 

                     switch(op2){
                        case 1:
                         System.out.println("INFORME A VIA EM QUE O VAGÃO SE ENCONTRA (1 ou 2):");
                          int via = entrada.nextInt();
                         System.out.println("INFORME A IDENTIFICAÇÃO DO VAGÃO (LETRA):");
                          char nomeVagao = entrada.next().charAt(0);
                         System.out.println("INFORME O TIPO DE CARGA (MINÉRIOS OU GRÃOS):");
                          String tipoCarga = entrada.next();
                         System.out.println("INFORME O NOME DA CARGA:");
                          String nomeCarga = entrada.next();
                         System.out.println("INFORME O PESO, EM QUILOGRAMAS, DA CARGA:");
                          double pesoCarga = entrada.nextDouble();

                           vagao x = new vagao(nomeVagao, tipoCarga, nomeCarga, pesoCarga, via);
                           locomotiva.push(x);

                         System.out.println("PRODUTO EMBARCADO");
                         System.out.println("");
                          break;

                        case 2:
                         locomotiva.pop();

                         System.out.println("VAGÃO DESEMBARCADO");
                         System.out.println("");
                          break; 
                     }
                 }
                 while(op2 != 3);
                 break;

                case 2:
                System.out.println("LOCOMOTIVA EM MOVIMENTE, IMPOSSÍVEL FAZER OPERAÇÕES NO MOMENTO");
                 break; 
                
                case 3:
                 do{
                    System.out.println("VAGÃO NO MOMENTO SE ENCONTRA NA VIA: " + locomotiva.peek().getVia());
                    System.out.println("GOSTARIA DE TRANSFERIR A COMPOSIÇÃO DOS VAGÕES PARA OUTRA VIA? (1 - 2)");
                    System.out.println("1 - SIM");
                    System.out.println("2 - NÃO");
                    System.out.println("");
                     op3 = entrada.nextInt();
                    System.out.println(""); 

                     switch(op3){
                        case 1:
                         if(locomotiva.peek().getVia() == 1){
                            locomotiva.peek().setVia(2);
                             System.out.println("VAGÃO AGORA EM VIA 2");
                             System.out.println("");
                              break;
                         }
                         else{
                            locomotiva.peek().setVia(1);
                             System.out.println("VAGÃO AGORA EM VIA 1");
                             System.out.println("");
                              break;
                         }
                     }
                 }
                 while(op3 != 2);
             }
         }
         while(op != 4);
          entrada.close();
    }
}
