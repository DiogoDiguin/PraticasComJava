
package propaganda;

/* @author SAMSUNG */
public class Propaganda {

    public static void main(String[] args) {
        // TODO code application logic here
        long qtd_assinantes = 0;
        Cliente C;
        Anunciante A;
        Anuncio An;
        InteresseCliente IC;
        SecaoDeInteresse SI;
        AnuncioDestaque AD;
        
        C = new Cliente("cliente@hotmail.com");
        C.setIdUsuario(99999);
        C.setIdCliente(123456);
        C.setCod_assinante(1111);
        qtd_assinantes += 1;
        C.imprimeCliente();
        
        C.setLogin("Teste");
        C.setSenha("Teste");
        C.login(C.getLogin(), C.getSenha());
        
        C.setIdCliente(123456);
        C.setLogin("12345d");
        C.setSenha("d12345");
        C.login(C.getLogin(), C.getSenha());
        
/*Novo Cliente*/ 
        C = new Cliente("fregues@hotmail.com");
        C.setIdUsuario(88888);
        C.setIdCliente(789101);
        C.setCod_assinante(2222);
        qtd_assinantes += 1;
        C.imprimeCliente();
/**/      
        System.out.println("Qtd assinantes:" + qtd_assinantes);/*Qtd de clientes*/
/*Anunciante*/     
        System.out.println("-");
        A = new Anunciante();
        A.setIdUsuario(77777);
        A.setLogin("AAAAAA");
        A.setSenha("AAAAAA");
        A.setIdAnunciante(66666);
        A.imprimeAnunciante();
        
/*Anúncios*/
        System.out.println("-");
        An = new Anuncio();
        An.setId(123123);
        An.setPalavras("Beba já!");
        An.setDataInsercao("09/03/2022");
        An.setDataPublicacao("10/03/2022");
        An.setValor(1245.65);
        An.setTitulo("COCA-COLA é UAU!");
        An.setPublicar(1);
        An.setNomeContato("Diogo");
        An.setTelefone("3981-3981");
        An.setObservacao("Nos pontos comerciais mais próximos.");
        An.anunciar();    
        
        System.out.println("");
        An = new Anuncio();
        An.setId(321321);
        An.setPalavras("Coma já!");
        An.setDataInsercao("07/03/2022");
        An.setDataPublicacao("11/03/2022");
        An.setValor(1300.75);
        An.setTitulo("DORITOS é UOU!");
        An.setPublicar(1);
        An.setNomeContato("Diogo");
        An.setTelefone("4871-4871");
        An.setObservacao("Nos pontos comerciais mais próximos.");
        An.anunciar();  
/**/       
        System.out.println("-");
        SI = new SecaoDeInteresse();
        SI.localizarInteresse(An.getId());
        SI.setId_Secao_Interesse(44444);
        
        IC = new InteresseCliente();
        IC.remeterInteresse(C.getIdCliente(), SI.getId_Secao_Interesse());

/*Anúncio Destaque*/
        AD = new AnuncioDestaque();
        AD.setInsercaoDestaque(An.getDataInsercao());
        AD.setObservacaoDestaque(An.getObservacao());
        AD.setPalavrasDestaque(An.getPalavras());
        AD.setPublicacaoDestaque(An.getDataPublicacao());
        AD.setTituloDestaque(An.getTitulo());
        AD.anunciarDestaque();
  
    }
    
}
