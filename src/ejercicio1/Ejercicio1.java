package ejercicio1;
import java.util.Scanner;


public class Ejercicio1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cant, cant2;
        int menu, menu2, menu3;
        String menu4 = " ", menu5, telefono;
        int saldo = 0;
        int retirar;
        String opcion = "S";
        int recarga;
        
        while(opcion == "S"){
            System.out.print("----------- Menu -----------\n");
            System.out.print("| 1 - Abonar a cuenta      |\n");
            System.out.print("| 2 - Retirar de cuenta    |\n");
            System.out.print("| 3 - Visualizar saldo     |\n");
            System.out.print("| 4 - Comprar tiempo aire  |\n");
            System.out.print("| 5 - Salir                |\n");
            System.out.print("----------------------------\n");

            System.out.print("\nSelecciona una opcion para continuar: ");
            menu = sc.nextInt();

            switch(menu){
                case 1:

                    System.out.print("Ingresa una cantidad: ");
                    cant = sc.nextInt();

                    while(cant <= 1000){
                        System.out.print("Ingresa una cantidad mayor a 1000: ");
                        cant = sc.nextInt();
                    }

                    if(cant > 1000){
                        System.out.print("Usted ha abodado la cantidad de: "+cant+"\n");
                        System.out.print("1 = continuar | 2 = cancelar | 3 = cambiarla\n");
                        System.out.print("Escriba una opcion: ");
                        menu2 = sc.nextInt();

                        switch(menu2){
                            case 1:
                                saldo = saldo + cant;
                            break;

                            case 2:
                                saldo = 0;
                            break;

                            case 3:
                                System.out.print("Ingresa una cantidad mayor a 1000: ");
                                cant = sc.nextInt();

                                saldo = saldo + cant;
                            break;
                        }
                    }

                    System.out.print("Su saldo actual es de: "+saldo+"\n");

                break;
                
                case 2:
                    
                    System.out.print("Escriba la cantidad a retirar: ");
                    cant2 = sc.nextInt();
                    
                    while(cant2 > saldo){
                        System.out.print("SALDO INSUFICIENTE \n");
                        System.out.print("Escriba otra cantidad a retirar: ");
                        cant2 = sc.nextInt();
                    
                    }
                    
                    if(cant2 <= saldo){
                        System.out.print("La cantidad a retirar es: "+ cant2+"\n");
                        System.out.print("Desea: 1 - continuar 1 | 2 - cancelar\n");
                        System.out.print("Escriba una opcion: ");
                        menu3 = sc.nextInt();
                        
                        if(menu3 == 1){
                        
                            System.out.print("Desea donar a los becarios de la UTA?: si/no\n");
                            menu4 = sc.next();
                                
                            if(menu4.equals("si")){
                                saldo = saldo - cant2;
                                saldo = saldo - 100;
                            }
                            else if(menu4.equals("no")){
                                System.out.print("Su nuevo saldo es de: "+saldo+" - "+cant2+"\n\n");
                                saldo = saldo - cant2;
                                    
                                    
                            }
                                
                            System.out.print("Su nuevo saldo es de: "+saldo+"\n\n");
                                
                        }
                        if(menu3 == 2){
                            saldo = saldo + 0;
                        }
                        
                    }
                    
                break;
                
                case 3:
                    System.out.print("Su saldo actual es: "+ saldo+"\n");
                break;
                
                case 4:
                    System.out.print("Ingresa el precio de la recarga que desea: ");
                    recarga = sc.nextInt();
                    
                    System.out.print("\nEl precio de la recarga es correcta? si/no: ");
                    menu5 = sc.next();
                    
                    if(menu5.equals("si")){
                        System.out.print("Ingresa su numero telefonico: ");
                        telefono = sc.nextLine();
                        
                        saldo = saldo - recarga;
                        
                        System.out.print("\nSu recarga a sido exitosa\n");
                        System.out.print("\nSu saldo es de: "+saldo+" \n");
                    }
                    
                break;
                
                case 5:
                    System.out.print("Operacion terminada regrese pronto\n");
                    System.exit(0);
                    
                break;
                
                default:
                
                break;
                    
            }
        }
        
    }
    
}
