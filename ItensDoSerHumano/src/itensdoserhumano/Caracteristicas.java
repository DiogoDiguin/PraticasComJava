
package itensdoserhumano;

/* @author 836846 */

public class Caracteristicas {
 
    void carro(){ //CARRO
        String modelo = "Tracker";
        String fabricante = "Chevrolet";
        String consumo = "13 km/l";
        int ano = 2022;
        int cavalos = 120;
        String cor = "Cinza";
        String placa = "BEE4R22";
        
        System.out.println("\tCARRO");
        System.out.println("Modelo: " + fabricante + " " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Consumo: " + consumo + " com " + cavalos + " cavalos de potência");
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
    }
    void empresa(){//EMPRESA
        String nome = "Netshoes";
        String produtos = "Setores variados, focado em esportes";
        int anoFundacao = 2000;
        String cnpj = "09.339.936/0001-16";
        
        System.out.println("\tEMPRESA");
        System.out.println("Nome: " + nome);
        System.out.println("Tipos de produto: " + produtos);
        System.out.println("Ano de fundação: " + anoFundacao);
        System.out.println("CNPJ: " + cnpj);
    }
    void pessoa (){//PESSOA
        String nome = "Diogo Vitor Oliveira Leme";
        String cidade = "Pradópolis - SP";
        int anoNascimento = 2002;
        String cidadeNasc = "Jaboticabal - SP";
        int idade = 19;
        double altura = 1.85;
        
        System.out.println("\tPESSOA");
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Ano Nascimento: " + anoNascimento);
        System.out.println("Cidade Nascimento: " + cidadeNasc);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
    void notebook (){//NOTEBOOK
        String marca = "Samsung";
        String linha = "Book";
        String serie = "X40";
        String proc = "Intel Core I5 10ª Geração";
        String sistema = "Windows 10";
        int hd = 1024;
        int ram = 8;
        double tela = 15.6;
        
        System.out.println("\tPESSOA");
        System.out.println("Nome: " + marca + " " + linha + " " + serie);
        System.out.println("Procssador: " + proc);
        System.out.println("Sistema: " + sistema);
        System.out.println("HD: " + hd + " GB");
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Tamanho da Tela: " + tela + " ''");
    }
    void animal (){//ANIMAL
        String raca = "Golden Retriever";
        String pelo = "Mediana e Lisa";
        int alturaF = 55;
        int alturaM = 58;
        int pesoF = 28;
        int pesoM = 32;
        String cor = "Dourado Escuro, Dourado Claro, Creme e Dourado";
        String pais = "Reino Unido, Escócia, Inglaterra";
        
        System.out.println("\tANIMAL");
        System.out.println("Raça: " + raca);
        System.out.println("Pelagem: " + pelo);
        System.out.println("Fêmea: " + alturaF + " cm e " + pesoF + " Kg");
        System.out.println("Macho: " + alturaM + " cm e " + pesoM + " Kg");
        System.out.println("Cores: " + cor);
        System.out.println("País de Origem: " + pais);
    }
}
