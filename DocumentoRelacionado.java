public class DocumentoRelacionado{
    private String data;
    private String fase;
    private double valor;
    private String documento;
    private String favorecido;

    public DocumentoRelacionado(String data, String fase, double valor, String documento, String favorecido){
        this.data = data;
        this.fase = fase;
        this.valor = valor;
        this.documento = documento;
        this.favorecido = favorecido;
    }

    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }
    
    public String getFase(){
        return fase;
    }
    public void setFase(String fase){
        this.fase = fase;
    }

    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    public String getDocumento(){
        return documento;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }

    public String getFavorecido(){
        return favorecido;
    }
    public void setFavorecido(String favorecido){
        this.favorecido = favorecido;
    }
}