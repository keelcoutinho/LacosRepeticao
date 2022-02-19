/* Uma empresa desenvolveu uma pesquisa para saber as características 
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas era 
perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se 
a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.*/


int total =0, idade =0, sexo =0, fem = 0, masc = 0, outro = 0;
int temperamento = 0, calmo = 0, nerv =0, agre = 0;
int femNerv = 0, mascAgre =0, outroCalmo = 0;
int nerv40=0, calma18=0;

Scanner leia = new Scanner(System.in);

while(total < 150) {
    System.out.println("\n Digite a idade: ");
    idade = leia.nextInt();
    
    if (idade >=0 && idade <=100 ) {
        total++;
    }
    else {System.out.println("\n Você não digitou uma idade válida");}
    System.out.println("\n Digite a idade: ");
    idade = leia.nextInt();
    

while(sexo == 0) {
    System.out.println("\n Informe o sexo:");
    System.out.println("\n 1 - feminino");
    System.out.println("\n 2 - masculino");
    System.out.println("\n 3 - outro");
    sexo = leia.nextInt();
    
    switch(sexo) {
    case 1:
        fem++;
    case 2:
        masc++;
    case 3:
        outro++;
    break;
    default:
        System.out.println("\n Opção inválida!");
    sexo = 0;
    break;
        
    }
}
while (temperamento == 0) {
    System.out.println("\n Informe o temperamento:");
    System.out.println("\n 1 - calmo");
    System.out.println("\n 2 - nervoso");
    System.out.println("\n 3 - agressivo");
    temperamento = leia.nextInt();
    
    switch(temperamento) {
    case 1:
        calmo++;
    case 2:
        nerv++;
    case 3:
        agre++;
    break;
    default:
        System.out.println("\n Opção inválida!");
    temperamento = 0;
    break;
    }
}
if (sexo == 1 && temperamento == 2) {
    femNerv++;
}	
if (sexo == 2 && temperamento == 3) {
    mascAgre++;
}
if (sexo == 3 && temperamento == 1) {
    outroCalmo++;
}
if (temperamento == 2 && idade > 40) {
    nerv40++;
}
if (temperamento == 1 && idade < 18) {
    calma18++;
}

idade = 0;
sexo = 0;
temperamento =0;

}

System.out.println("\n Quantidade de pessoas calmas: "+calmo);
System.out.println("\n Quantidade de mulheres nervosas: "+femNerv);
System.out.println("\n Quantidade de homens agressivos: "+mascAgre);
System.out.println("\n Quantidade de outros calmos: "+outroCalmo);
System.out.println("\n Quantidade de pessoas nervosas com mais de 40: "+nerv40);
System.out.println("\n Quantidade de de pessoas calmas com menos de 18: "+calma18);
