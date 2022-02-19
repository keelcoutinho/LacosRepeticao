// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)


int pares =0, impares = 0;				
int numero;
 Scanner leia = new Scanner(System.in);

for (int a =1; a <= 10; a++) {
    System.out.println("\n Digite um número: ");
    numero = leia.nextInt(); 
    
    if(numero % 2 ==0){
        pares++;
}
    else {
        impares++;
    }
                        
}


System.out.println("Pares = "+pares+ ". Ímpares = "+impares);
