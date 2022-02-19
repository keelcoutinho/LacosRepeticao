//Crie um programa que leia um número do teclado até que encontre um número igual a zero.
//No final, mostre a soma dos números digitados.(DO...WHILE)


int numero, soma=0;
Scanner leia = new Scanner(System.in);
do {
    System.out.println("\n Entre com um número: ");
    numero = leia.nextInt();
    soma += numero;
    System.out.println("\n Para sair digite 0.");
}
while(numero != 0);

System.out.println("\n A soma dos numeros importados é = "+ soma);
