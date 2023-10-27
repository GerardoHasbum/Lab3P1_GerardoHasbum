/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_gerardohasbum;
import java.util.Scanner;
/**
 *
 * @author ghasb
 */
public class Lab3P1_GerardoHasbum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
            Scanner jhin = new Scanner(System.in);
            char res_u_menu = 's';
            while(res_u_menu == 's' || res_u_menu == 'S'){
                System.out.println("1. Sucesiones y mas sucesiones!");
                System.out.println("2. Pocket Monsters");
                System.out.println("3. Asterisco en casa!");
                System.out.println("Ingrese la opcion deseada: ");
                int opcion_menu = jhin.nextInt();
                switch(opcion_menu){
                    //Sucesiones
                    case 1:
                        System.out.println("Sucesiones y mas sucesiones!");
                        System.out.print("Ingrese la diferencia: ");
                        int dif_in = jhin.nextInt();
                        int dif = dif_in;
                        System.out.print("Ingrese el valor inicial: ");
                        int val_in = jhin.nextInt();
                        int val = val_in;
                        System.out.print("Ingrese la cantidad de valores que desea: ");
                        int cant = jhin.nextInt();
                        System.out.println("Diferencia: "+ dif);
                        System.out.println("Inicial: "+ val_in);
                        System.out.println("Cantidad: "+ cant);
                        System.out.print(val_in);
                        for(int cont = 1;cont<cant;cont++){
                            System.out.print(", ");
                            val_in+=dif_in;
                            dif_in++;
                            System.out.print(val_in);
                        }
                        System.out.println("");
                        System.out.print("Que numero desea ver mas adelante en la sucesion? ");
                        int ade = jhin.nextInt();
                        for(int cont = 1;cont<ade;cont++){
                            val=val+dif;
                            dif++;
                        }
                        System.out.println("El numero seria: "+ val);
                        break;
                    //fin Sucesiones
                    //Pocket Monsters
                    case 2:
                        System.out.println("Pocket Monsters");
                        System.out.println("Ingrese el modo de pelea pokemon que desea: ");
                        System.out.println("1. Hasta la muerte");
                        System.out.println("2. Por rondas");
                        int pok_res_u=jhin.nextInt();
                        System.out.println("Estadisticas de los pokemones");
                        System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                        System.out.println("Gyarados Vida:300 Ataque:50 Defensa:10%");
                        System.out.println("Giratina Vida:300 Ataque:70 Defensa:25%");
                        System.out.println("Dragonite Vida:250 Ataque:75 Defensa:20%");
                        System.out.println("");
                        System.out.println("Ingrese una pelea determinada");
                        System.out.println("1.- Sylveon vrs Dragonite");
                        System.out.println("2.- Gyarados vrs Giratina");
                        System.out.println("3.- Dragonite vrs Giratina");
                        System.out.println("4.- Giratina vrs Sylveon");
                        int pokepelea = jhin.nextInt();
                        int cont=1;
                        double vida1 = 0,vida2=0,atk1=0,atk2=0,def1=0,def2=0,real_atk1=0,real_atk2=0;
                        switch(pokepelea){
                            case 1://sylveon vs dragonite
                                vida1=280;//sylveon
                                atk1=80;//sylveon
                                def1=0.15;//sylveon
                                vida2=250;//dragonite
                                atk2=75;//dragonite
                                def2=0.20;//dragonite
                                real_atk1=atk1-(atk1*def2);//real sylv
                                real_atk2=atk2-(atk2*def1);//real drag
                                break;
                            case 2://gyarados vs giratina
                                vida1=300;//gyarados
                                vida2=300;//giratina
                                atk1=50;//gyarados
                                atk2=70;//giratina
                                def1=0.10;//gyarados
                                def2=0.25;//giratina
                                real_atk1=atk1-(atk1*def2);//real gyar
                                real_atk2=atk2-(atk2*def1);//real gira
                                break;
                            case 3://dragonite vs giratina
                                vida1=250;//dragonite
                                atk1=75;//dragonite
                                def1=0.20;//dragonite
                                vida2=300;//giratina
                                atk2=70;//giratina
                                def2=0.25;//giratina
                                real_atk1=atk1-(atk1*def2);//real drag
                                real_atk2=atk2-(atk2*def1);//real gira
                                break;
                            case 4://giratina vs sylveon
                                vida1=300;
                                atk1=70;
                                def1=0.25;
                                vida2=280;
                                atk2=80;
                                def2=0.15;
                                real_atk1=atk1-(atk1*def2);
                                real_atk2=atk2-(atk2*def1);
                        }
                        if (pok_res_u==1) {
                            while(vida1>0 && vida2>0){
                                System.out.println("------------ RONDA "+ cont+ " -----------");
                                System.out.println("Vida de pokemon 1: "+ vida1);
                                System.out.println("Vida de pokemon 2: "+ vida2);
                                System.out.println("");
                                System.out.println("Pokemon 1 ha atacado!");
                                vida2=vida2-real_atk1;
                                System.out.println("Pokemon 2 ha atacado!");
                                vida1=vida1-real_atk2;
                                if(vida1>0&&vida2>0){
                                    System.out.println("Vida de pokemon 1: "+ vida1);
                                    System.out.println("Vida de pokemon 2: "+ vida2);
                                }
                                else if(vida1<=0&&vida2>0){
                                    System.out.println("Vida de pokemon 1: 0");
                                    System.out.println("Vida de pokemon 2: "+vida2);
                                    System.out.println("Pokemon 2 ha ganado!");
                                }
                                else if(vida2<=0&&vida1>0){
                                    System.out.println("Vida de pokemon 1: "+vida1);
                                    System.out.println("Vida de pokemon 2: 0");
                                    System.out.println("Pokemon 1 ha ganado!");
                                }
                                else if(vida1<=0&&vida2<0){
                                    System.out.println("Vida de pokemon 1: 0");
                                    System.out.println("Vida de pokemon 2: 0");
                                    System.out.println("Los pokemon no pueden continuar peleando");
                                }
                                cont++;
                            }
                            break;
                        }
                        else if (pok_res_u==2){
                            System.out.println("Cuantas rondas desea jugar?");
                            int rondas=jhin.nextInt();
                            cont=1;
                            while(cont<=rondas && vida1>0 && vida2>0){
                                System.out.println("------------ RONDA "+ cont+ " -----------");
                                System.out.println("Vida de pokemon 1: "+ vida1);
                                System.out.println("Vida de pokemon2: "+ vida2);
                                System.out.println("");
                                System.out.println("Pokemon 1 ha atacado!");
                                vida2=vida2-real_atk1;
                                System.out.println("Pokemon 2 ha atacado!");
                                vida1=vida1-real_atk2;
                                if(vida1>0&&vida2>0){
                                    System.out.println("Vida de pokemon 1: "+ vida1);
                                    System.out.println("Vida de pokemon 2: "+ vida2);
                                }
                                else if(vida1<=0&&vida2>0){
                                    System.out.println("Vida de pokemon 1: 0");
                                    System.out.println("Vida de pokemon 2: "+vida2);
                                    System.out.println("Pokemon 2 ha ganado!");
                                }
                                else if(vida2<=0&&vida1>0){
                                    System.out.println("Vida de pokemon 1: "+vida1);
                                    System.out.println("Vida de pokemon 2: 0");
                                    System.out.println("Pokemon 1 ha ganado!");
                                }
                                else if(vida1<=0&&vida2<0){
                                    System.out.println("Vida de pokemon 1: 0");
                                    System.out.println("Vida de pokemon 2: 0");
                                    System.out.println("Los pokemon no pueden continuar peleando");
                                }
                                cont++;
                            }
                            System.out.println("La pelea ha terminado");
                        }
                        else{
                            System.out.println("No es un metodo de batalla");
                        }
                        break;

                    //Pocket Monsters
                    //Asterisco en casa
                    case 3:
                        System.out.println("Asterisco en casa!");
                        System.out.println("Ingrese un numero mayor a 7 y impar");
                        int N = jhin.nextInt();
                        int var_ind = 2;
                        int r = 1;
                        int d = N - r;
                        if(N>=7 && N%2!=0){
                            for(int e =1; e<=N;e++){
                            for(r=1;r<=N;r++){
                                if(e==1 || e==N){
                                    System.out.print("* ");
                                }
                                else if(r == (N-2)/2+2){
                                    System.out.print("| ");
                                }
                                else if(r == 1 || r == N){
                                    System.out.print("* ");
                                }
                                else if(var_ind!=(N-2)/2+2 && e==r || r==e){
                                    System.out.print("> ");
                                }
                                else if(var_ind!=(N-2)/2+2 && e==d){
                                    System.out.print("> ");
                                }
                                else{
                                    System.out.print("  ");
                                }
                                d = N - r;
                            }//fin for interno
                            System.out.println("");
                        }
                        }
                        else{
                            System.out.println("El numero es menor a 7 o no es impar");
                        }
                        break;
                }
                //Respuesta de usuario
                System.out.print("Desea ingresar a otro programa? [s/n]: ");
                res_u_menu = jhin.next().charAt(0);
                //Fin de respuestra de usuario
        }
    }
}
