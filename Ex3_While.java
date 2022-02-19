/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas 
com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa 
termina quando idade for =-99. (WHILE)*/


int idade, menor21 = 0, maior50 = 0; 
Scanner leia = new Scanner(System.in);
                
System.out.println("\n Entre com a idade: ");
idade = leia.nextInt();
while(idade != -99) {
    if (idade < 21) {
        menor21++;
    }
    else if(idade > 50) {
        maior50++;
    }
    System.out.println("\n Para sair entre com -99.");
    System.out.println("\n Entre com a próxima idade:");
    idade = leia.nextInt();
}
System.out.println("\n O total de pessoas com menos de 21 anos é = "+menor21);
System.out.println("\n O total de pessoas com mais de 50 anos é = "+maior50); 
