
package propaganda;

/* @author SAMSUNG */
public class InteresseCliente {
    protected long idCliente;
    protected long id_Secao_Interesse;
    
    void remeterInteresse(long idCliente, long id_Secao_Interesse){
        this.idCliente = idCliente;
        this.id_Secao_Interesse = id_Secao_Interesse;
        System.out.println("ID Cliente: " + idCliente);
        System.out.println("ID Secão de Interesse: " + id_Secao_Interesse);
    }
    
}
