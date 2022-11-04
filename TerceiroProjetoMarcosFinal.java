package terceiro.projeto.marcos.pkgfinal;
import java.util.Scanner; // Importação Scanner
public class TerceiroProjetoMarcosFinal {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in); // Importação do Scanner
        
        String f1 = "Digite uma palavra para ficar a gigante:";
        String palavra; // Criei a string palavra sem definir o valor da mesma
        
        System.out.println(f1); // Pede para o usuário digitar uma frase
        palavra = in.nextLine().toUpperCase(); // O que o usuário digitar vai renomear a String "Palavra", e o ".toUpperCase()" vai deixar todas as letras maiúsculas

        char[] letra = palavra.toCharArray();//converte String para char

        int colmat = 7; //Quantidade de coluna
        int linmat = 5; //Quantidade de linha
        int tmn =letra.length * colmat; // O int TMN é o tamanho da frase/palavra
        
        System.out.println(" "); // Espaço para não embolar com as letras gigantes
        System.out.println(palavra);
        System.out.println(tmn); // Imprime o tamanho
        System.out.println(" "); // Espaço para não embolar com as letras gigantes
        
        char [][] matrizP = new char[linmat][];
        char [][] matrizG= new char[linmat][tmn];
         
        for(int i = 0;i<letra.length;i++){     
            if(letra[i]=='A'){
              matrizP = letraA();
            }else if(letra[i]=='B'){
               matrizP = letraB();
            }else if(letra[i]=='C'){
               matrizP = letraC();
            }else if(letra[i]=='D'){
               matrizP = letraD();
            }else if(letra[i]=='E'){
               matrizP = letraE();
            }else if(letra[i]=='F'){
               matrizP = letraF();
            }else if(letra[i]=='G'){
               matrizP = letraG();
            }else if(letra[i]=='H'){
               matrizP = letraH();
            }else if(letra[i]=='I'){
               matrizP = letraI();
            }else if(letra[i]=='J'){
               matrizP = letraJ();
            }else if(letra[i]=='K'){
               matrizP = letraK();
            }else if(letra[i]=='L'){
               matrizP = letraL();
            }else if(letra[i]=='M'){
               matrizP = letraM();
            }else if(letra[i]=='N'){
               matrizP = letraN();
            }else if(letra[i]=='O'){
               matrizP = letraO();
            }else if(letra[i]=='P'){
               matrizP = letraP();
            }else if(letra[i]=='Q'){
               matrizP = letraQ();
            }else if(letra[i]=='R'){
               matrizP = letraR();
            }else if(letra[i]=='S'){
               matrizP = letraS();
            }else if(letra[i]=='T'){
               matrizP = letraT();
            }else if(letra[i]=='U'){
               matrizP = letraU();
            }else if(letra[i]=='V'){
               matrizP = letraV();
            }else if(letra[i]=='W'){
               matrizP = letraW();
            }else if(letra[i]=='X'){
               matrizP = letraX();
            }else if(letra[i]=='Y'){
               matrizP = letraY();
            }else if(letra[i]=='Z'){
               matrizP = letraZ();
            }else if(letra[i]=='0'){
               matrizP = numero0();
            }else if(letra[i]=='1'){
               matrizP = numero1();
            }else if(letra[i]=='2'){
               matrizP = numero2();
            }else if(letra[i]=='3'){
               matrizP = numero3();
            }else if(letra[i]=='4'){
               matrizP = numero4();
            }else if(letra[i]=='5'){
               matrizP = numero5();
            }else if(letra[i]=='6'){
               matrizP = numero6();
            }else if(letra[i]=='7'){
               matrizP = numero7();
            }else if(letra[i]=='8'){
               matrizP = numero8();
            }else if(letra[i]=='9'){
               matrizP = numero9();
            }else{
                matrizP = letraEs();
            }

            for(int l=0;l<linmat;l++){
                for(int c=0;c<colmat;c++){
                matrizG[l][i*matrizP[0].length+c]=matrizP[l][c];
            }
        }
    }
      for(int i=0;i<linmat;i++){
          System.out.println(matrizG[i]);
    }   
}
    
    public static char[][] letraEs(){
       char[][]letraEs = {{' ',' ',' ',' ',' ',' ',' '},
                          {' ',' ',' ',' ',' ',' ',' '},
                          {' ',' ',' ',' ',' ',' ',' '},
                          {' ',' ',' ',' ',' ',' ',' '},
                          {' ',' ',' ',' ',' ',' ',' '}};
        return letraEs;
     }  
    public static char[][] letraA(){
        char[][]letraA = {{' ','X','X','X','X','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X','X','X','X','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X',' ',' ',' ','X',' '}};
        return letraA;
    }
    public static char[][] letraB(){
        char[][]letraB = {{' ','X','X','X','X',' ',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X','X','X','X','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X','X','X','X',' ',' '}};
        return letraB;
    }
    public static char[][] letraC(){
        char[][]letraC ={{' ','X','X','X','X','X',' '},
                         {' ','X',' ',' ',' ',' ',' '},
                         {' ','X',' ',' ',' ',' ',' '},
                         {' ','X',' ',' ',' ',' ',' '},
                         {' ','X','X','X','X','X',' '}};
        return letraC;
    }
    public static char[][] letraD(){
        char[][]letraD = {{' ','X','X','X','X',' ',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X','X','X','X',' ',' '}};
        return letraD;
    }
    public static char[][] letraE(){
        char[][]letraE = {{' ','X','X','X','X','X',' '},
                          {' ','X',' ',' ',' ',' ',' '},
                          {' ','X','X','X','X','X',' '},
                          {' ','X',' ',' ',' ',' ',' '},
                          {' ','X','X','X','X','X',' '}};
        return letraE;
    }
    public static char[][] letraF(){
        char[][]letraF = {{' ','X','X','X','X','X',' '},
                          {' ','X',' ',' ',' ',' ',' '},
                          {' ','X','X','X','X',' ',' '},
                          {' ','X',' ',' ',' ',' ',' '},
                          {' ','X',' ',' ',' ',' ',' '}};
        return letraF;
    }
    public static char[][] letraG(){
        char[][]letraG = {{' ','X','X','X','X','X',' '},
                          {' ','X',' ',' ',' ',' ',' '},
                          {' ','X',' ','X','X','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X','X','X','X','X',' '}};
        return letraG;
    }
    public static char[][] letraH(){
        char[][]letraH = {{' ','X',' ',' ',' ','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X','X','X','X','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X',' ',' ',' ','X',' '}};
        return letraH;
    }
    public static char[][] letraI(){
        char[][]letraI = {{' ','X','X','X','X','X',' '},
                          {' ',' ',' ','X',' ',' ',' '},
                          {' ',' ',' ','X',' ',' ',' '},
                          {' ',' ',' ','X',' ',' ',' '},
                          {' ','X','X','X','X','X',' '}};
        return letraI;
    }
    public static char[][] letraJ(){
        char[][]letraJ = {{' ',' ',' ','X','X','X',' '},
                          {' ',' ',' ',' ','X',' ',' '},
                          {' ',' ',' ',' ','X',' ',' '},
                          {' ','X',' ',' ','X',' ',' '},
                          {' ','X','X','X','X',' ',' '}};
        return letraJ;
    }
    public static char[][] letraK(){
        char[][]letraK = {{' ','X',' ',' ',' ','X',' '},
                          {' ','X',' ',' ','X',' ',' '},
                          {' ','X','X','X',' ',' ',' '},
                          {' ','X',' ',' ','X',' ',' '},
                          {' ','X',' ',' ',' ','X',' '}};
           return letraK;
    }
    public static char[][] letraL(){
        char[][]letraL = {{' ','X',' ',' ',' ',' ',' '},
                          {' ','X',' ',' ',' ',' ',' '},
                          {' ','X',' ',' ',' ',' ',' '},
                          {' ','X',' ',' ',' ',' ',' '},
                          {' ','X','X','X','X','X',' '}};  
        return letraL;
    }
    public static char[][] letraM(){
        char[][]letraM = {{' ','X',' ',' ',' ','X',' '},
                          {' ','X','X',' ','X','X',' '},
                          {' ','X',' ','X',' ','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X',' ',' ',' ','X',' '}};  
        return letraM;
    }
    public static char[][] letraN(){
        char[][]letraN = {{' ','X',' ',' ',' ','X',' '},
                          {' ','X','X',' ',' ','X',' '},
                          {' ','X',' ','X',' ','X',' '},
                          {' ','X',' ',' ','X','X',' '},
                          {' ','X',' ',' ',' ','X',' '}};  
        return letraN;
    }
    public static char[][] letraO(){
        char[][]letraO = {{' ',' ','X','X','X',' ',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ',' ','X','X','X',' ',' '}}; 
        return letraO;
    }
    public static char[][] letraP(){
       char[][]letraP =  {{' ','X','X','X','X','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X','X','X','X','X',' '},
                          {' ','X',' ',' ',' ',' ',' '},
                          {' ','X',' ',' ',' ',' ',' '}};
        return letraP;
    }
    public static char[][] letraQ(){
        char[][]letraG = {{' ','X','X','X','X','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X','X','X','X','X',' '},
                          {' ',' ',' ',' ',' ','X',' '}};
        return letraG;
    }
    public static char[][] letraR(){
        char[][]letraR = {{' ','X','X','X','X','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X','X','X','X','X',' '},
                          {' ','X',' ','X',' ',' ',' '},
                          {' ','X',' ',' ','X',' ',' '}};
        return letraR;
    }
    public static char[][] letraS(){
        char[][]letraS = {{' ','X','X','X','X','X',' '},
                          {' ','X',' ',' ',' ',' ',' '},
                          {' ','X','X','X','X','X',' '},
                          {' ',' ',' ',' ',' ','X',' '},
                          {' ','X','X','X','X','X',' '}};
        return letraS;
    }
    public static char[][] letraT(){
        char[][]letraT = {{' ','X','X','X','X','X',' '},
                          {' ',' ',' ','X',' ',' ',' '},
                          {' ',' ',' ','X',' ',' ',' '},
                          {' ',' ',' ','X',' ',' ',' '},
                          {' ',' ',' ','X',' ',' ',' '}};
        return letraT;
    }
    public static char[][] letraU(){
        char[][]letraU = {{' ','X',' ',' ',' ','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ','X','X','X','X','X',' '}};
        return letraU;
    }
    public static char[][] letraV(){
        char[][]letraV = {{' ','X',' ',' ',' ','X',' '},
                          {' ','X',' ',' ',' ','X',' '},
                          {' ',' ','X',' ','X',' ',' '},
                          {' ',' ',' ','X',' ',' ',' '},
                          {' ',' ',' ','X',' ',' ',' '}};
        return letraV;
    }
    public static char[][] letraW(){
        char[][]letraW = {{' ','X',' ','X',' ','X',' '},
                          {' ','X',' ','X',' ','X',' '},
                          {' ','X',' ','X',' ','X',' '},
                          {' ','X',' ','X',' ','X',' '},
                          {' ',' ','X',' ','X',' ',' '}};
        return letraW;
    }
    public static char[][] letraX(){
        char[][]letraX = {{' ','X',' ',' ',' ','X',' '},
                          {' ',' ','X',' ','X',' ',' '},
                          {' ',' ',' ','X',' ',' ',' '},
                          {' ',' ','X',' ','X',' ',' '},
                          {' ','X',' ',' ',' ','X',' '}};
        return letraX;
    }
    public static char[][] letraY(){
        char[][]letraY = {{' ','X',' ',' ',' ','X',' '},
                          {' ',' ','X',' ','X',' ',' '},
                          {' ',' ',' ','X',' ',' ',' '},
                          {' ',' ','X',' ',' ',' ',' '},
                          {' ','X',' ',' ',' ',' ',' '}};
        return letraY;
    }
    public static char[][] letraZ(){
        char[][]letraZ = {{' ','X','X','X','X','X',' '},
                          {' ',' ',' ',' ','X',' ',' '},
                          {' ',' ',' ','X',' ',' ',' '},
                          {' ',' ','X',' ',' ',' ',' '},
                          {' ','X','X','X','X','X',' '}};
        return letraZ;
    }
    public static char[][] numero0(){
        char[][]numero0 = {{' ','X','X','X','X','X',' '},
                           {' ','X',' ',' ',' ','X',' '},
                           {' ','X',' ',' ',' ','X',' '},
                           {' ','X',' ',' ',' ','X',' '},
                           {' ','X','X','X','X','X',' '}};
        return numero0;
    }
    public static char[][] numero1(){
        char[][]numero1 = {{' ','X','X','X',' ',' ',' '},
                           {' ','X',' ','X',' ',' ',' '},
                           {' ',' ',' ','X',' ',' ',' '},
                           {' ',' ',' ','X',' ',' ',' '},
                           {' ','X','X','X','X','X',' '}};
        return numero1;
    }
    public static char[][] numero2(){
        char[][]numero2 = {{' ','X','X','X','X','X',' '},
                           {' ',' ',' ',' ',' ','X',' '},
                           {' ','X','X','X','X','X',' '},
                           {' ','X',' ',' ',' ',' ',' '},
                           {' ','X','X','X','X','X',' '}};
        return numero2;
    }
    public static char[][] numero3(){
        char[][]numero3 = {{' ','X','X','X','X','X',' '},
                           {' ',' ',' ',' ',' ','X',' '},
                           {' ','X','X','X','X','X',' '},
                           {' ',' ',' ',' ',' ','X',' '},
                           {' ','X','X','X','X','X',' '}};
        return numero3;
    }
    public static char[][] numero4(){
        char[][]numero4 = {{' ','X',' ',' ',' ','X',' '},
                           {' ','X',' ',' ',' ','X',' '},
                           {' ','X','X','X','X','X',' '},
                           {' ',' ',' ',' ',' ','X',' '},
                           {' ',' ',' ',' ',' ','X',' '}};
        return numero4;
    }
    public static char[][] numero5(){
        char[][]numero5 = {{' ','X','X','X','X','X',' '},
                           {' ','X',' ',' ',' ',' ',' '},
                           {' ','X','X','X','X','X',' '},
                           {' ',' ',' ',' ',' ','X',' '},
                           {' ','X','X','X','X','X',' '}};
        return numero5;
    }
    public static char[][] numero6(){
        char[][]numero6 = {{' ','X','X','X','X','X',' '},
                           {' ','X',' ',' ',' ',' ',' '},
                           {' ','X','X','X','X','X',' '},
                           {' ','X',' ',' ',' ','X',' '},
                           {' ','X','X','X','X','X',' '}};
        return numero6;
    }
    public static char[][] numero7(){
        char[][]numero7 = {{' ','X','X','X','X','X',' '},
                           {' ',' ',' ',' ','X',' ',' '},
                           {' ',' ',' ','X',' ',' ',' '},
                           {' ',' ','X',' ',' ',' ',' '},
                           {' ','X',' ',' ',' ',' ',' '}};
        return numero7;
    }
    public static char[][] numero8(){
        char[][]numero8 = {{' ','X','X','X','X','X',' '},
                           {' ','X',' ',' ',' ','X',' '},
                           {' ','X','X','X','X','X',' '},
                           {' ','X',' ',' ',' ','X',' '},
                           {' ','X','X','X','X','X',' '}};
        return numero8;
    }
    public static char[][] numero9(){
        char[][]numero9 = {{' ','X','X','X','X','X',' '},
                           {' ','X',' ',' ',' ','X',' '},
                           {' ','X','X','X','X','X',' '},
                           {' ',' ',' ',' ',' ','X',' '},
                           {' ',' ',' ',' ',' ','X',' '}};
        return numero9;
    }
}
