
package propaganda;

/* @author SAMSUNG */
public class AnuncioDestaque extends Anuncio{
    protected String publicacaoDestaque;
    protected String insercaoDestaque;
    protected String tituloDestaque;
    protected String palavrasDestaque;
    protected String observacaoDestaque;

    public void setPublicacaoDestaque(String publicacaoDestaque) {
        this.publicacaoDestaque = publicacaoDestaque;
    }

    public void setInsercaoDestaque(String insercaoDestaque) {
        this.insercaoDestaque = insercaoDestaque;
    }

    public void setTituloDestaque(String tituloDestaque) {
        this.tituloDestaque = tituloDestaque;
    }

    public void setPalavrasDestaque(String palavrasDestaque) {
        this.palavrasDestaque = palavrasDestaque;
    }

    public void setObservacaoDestaque(String observacaoDestaque) {
        this.observacaoDestaque = observacaoDestaque;
    }

    
    
    void anunciarDestaque(){
        System.out.println("");
        System.out.println("ANUNCIO DESTAQUE");
        System.out.println(tituloDestaque);
        System.out.println(palavrasDestaque);
        System.out.println(observacaoDestaque);
        System.out.println("");
        System.out.println("Inserção: " + insercaoDestaque + " | Publicação: " + publicacaoDestaque);
        
    }
            
}
