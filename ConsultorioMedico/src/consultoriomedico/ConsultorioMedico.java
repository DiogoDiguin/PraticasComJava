
package consultoriomedico;

/* @author 836846 */
public class ConsultorioMedico {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Situacoes s;
        s = new Situacoes();
        System.out.println("\t\tINÍCIO");
        s.mostraAtributosM();
        s.mostraAtributosP();
        s.atendePaciente();
        System.out.println("\n");
        s.marcar("11/01/2022");
        s.atendePaciente();
        s.remarcar("27/10/2022");
        s.atendePaciente();
        s.cancelar('I');
        
        System.out.println("\n");
        
//ALTERAÇÃO DE INFORMAÇÕES  
        System.out.println("\t\tALTERAÇÃO DE INFORMAÇÕES");
        s.setMedico("PAULO", "SOUSA");
        s.setEspecialidade("DERMATOLOGIA");
        s.setCrm(22222);
        s.setPaciente("GIOVANA", "COSTA");
        s.setCodigo(123456789);
        s.setSexo('F');
        s.setEndereco("AUGUSTO FREITAS Nº 111");
        s.setTelefone(998541276);
        s.mostraAtributosM();
        s.mostraAtributosP();
        s.atendePaciente();
        System.out.println("\n");
        s.marcar("25/11/2022");
        s.atendePaciente();
        s.remarcar("30/12/2022");
        s.atendePaciente();
        s.cancelar('I');
//    
    }//MAIN 
}
