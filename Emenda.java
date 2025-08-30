import java.util.ArrayList;
import java.util.List;

public class Emenda {
    private String id;
    private String autor;
    private double valor;
    private int ano;
    private List<DocumentoRelacionado> documentosRelacionados;

    public Emenda(String id, String autor, double valor, int ano){
        this.id = id;
        this.autor = autor;
        this.valor = valor;
        this.ano = ano;
        this.documentosRelacionados = new ArrayList<>();
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public List<DocumentoRelacionado> getDocumentosRelacionado(){
        return documentosRelacionados;
    }
    public void setDocumentosRelacionados(List<DocumentoRelacionado> documentosRelacionados){
        this.documentosRelacionados = documentosRelacionados;
    }

    public void addDocumento(DocumentoRelacionado doc){
        if (doc != null){
            documentosRelacionados.add(doc);
        }
    }

    public double calcTotalporFase(String fase){
        double total = 0.0;
        for (DocumentoRelacionado doc : documentosRelacionados){
            if (doc.getFase().equals(fase)){
                total += doc.getValor();
            }
        }
        return total;
    }
     public void imprimirDocumentos(){
        if(documentosRelacionados.isEmpty()){
            System.out.println("Nenhum documento relacionado.");
        }else{
            System.out.println("Documentos relacionado: ");
            for(DocumentoRelacionado doc : documentosRelacionados){
                System.out.println("Data: " + doc.getData() + ", fase: " + doc.getFase() + ", valor: " + doc.getValor());
            }
        }
     }


}


