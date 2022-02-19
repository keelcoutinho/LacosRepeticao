//Escrever um programa que receba vários números inteiros no teclado. E no final 
//imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)


int numero, soma=0, multiplos=-2;
Scanner leia = new Scanner(System.in);

do {
    System.out.println("\n Entre com um número: ");
    numero = leia.nextInt();
    if(numero%3==0 && numero >=0) {
        soma+=numero;
        multiplos+=1;
    }
    
    System.out.println("\n Didite 0 para sair.");
    
}
while(numero != 0);
soma++;
multiplos++;
System.out.println("\n a média dos numeros multipos de três é: "+ soma/multiplos);

