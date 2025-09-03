import java.util.ArrayList;
import java.util.List;

public class Emenda {
    private int ano;
    private String tipo;
    private String autor;
    private int numero;
    private boolean possuiApoiador;

    private String localidade;
    private String funcao;
    private String subfuncao;
    private String programaOrcamentario;
    private String acaoOrcamentaria;
    private String planoOrcamentario;
    private String codigo;

    private double valorEmpenhado;
    private double valorLiquidado;
    private double valorPago;
    private double valorRestosInscritos;
    private double valorRestosCancelados;
    private double valorRestosPagos;
    private List<DocumentoRelacionado> documentosRelacionados;

    public Emenda(int ano, String tipo, String autor, int numero, boolean possuiApoiador, String localidade, String funcao, String subfuncao, String programaOrcamentario, String acaoOrcamentaria, String planoOrcamentario, String codigo, double valorEmpenhado, double valorLiquidado, double valorPago, double valorRestosInscritos, double valorRestosCancelados, double valorRestosPagos) {
        this.ano = ano;
        this.tipo = tipo;
        this.autor = autor;
        this.numero = numero;
        this.possuiApoiador = possuiApoiador;
        this.localidade = localidade;
        this.funcao = funcao;
        this.subfuncao = subfuncao;
        this.programaOrcamentario = programaOrcamentario;
        this.acaoOrcamentaria = acaoOrcamentaria;
        this.planoOrcamentario = planoOrcamentario;
        this.codigo = codigo;
        this.valorEmpenhado = valorEmpenhado;
        this.valorLiquidado = valorLiquidado;
        this.valorPago = valorPago;
        this.valorRestosInscritos = valorRestosInscritos;
        this.valorRestosCancelados = valorRestosCancelados;
        this.valorRestosPagos = valorRestosPagos;
        this.documentosRelacionados = new ArrayList<>();
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public boolean getPossuiApoiador(){
        return possuiApoiador;
    }
    public void setPossuiApoiador(boolean possuiApoiador){
        this.possuiApoiador = possuiApoiador;
    }

    public String getLocalidade(){
        return localidade;
    }
    public void setLocalidade(String localidade){
        this.localidade = localidade;
    }

    public String getFuncao(){
        return funcao;
    }
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }

    public String getSubfuncao(){
        return subfuncao;
    }
    public void setSubfuncao(String subfuncao){
        this.subfuncao = subfuncao;
    }

    public String getProgramaOrcamentario(){
        return programaOrcamentario;
    }
    public void setProgramaOrcamentario(String programaOrcamentario){
        this.programaOrcamentario = programaOrcamentario;
    }

    public String getAcaoOrcamentaria(){
        return acaoOrcamentaria;
    }
    public void setAcaoOrcamentaria(String acaoOrcamentaria){
        this.acaoOrcamentaria = acaoOrcamentaria;
    }

    public String getPlanoOrcamentario(){
        return planoOrcamentario;
    }
    public void setPlanoOrcamentario(String planoOrcamentario){
        this.planoOrcamentario = planoOrcamentario;
    }

    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public double getValorEmpenhado(){
        return valorEmpenhado;
    }
    public void setValorEmpenhado(double valorEmpenhado){
        this.valorEmpenhado = valorEmpenhado;
    }

    public double getValorLiquidado(){
        return valorLiquidado;
    }
    public void setValorLiquidado(double valorLiquidado){
        this.valorLiquidado = valorLiquidado;
    }

    public double getValorPago(){
        return valorPago;
    }
    public void setValorPago(double valorPago){
        this.valorPago = valorPago;
    }  

    public double getValorRestosInscritos(){
        return valorRestosInscritos;
    }
    public void setValorRestosInscritos(double valorRestosInscritos){
        this.valorRestosInscritos = valorRestosInscritos;
    }

    public double getValorRestosCancelados(){
        return valorRestosCancelados;
    }
    public void setValorRestosCancelados(double valorRestosCancelados){
        this.valorRestosCancelados = valorRestosCancelados;
    }

    public double getValorRestosPagos(){
        return valorRestosPagos;
    }
    public void setValorRestosPagos(double valorRestosPagos){
        this.valorRestosPagos = valorRestosPagos;
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
    System.out.println("Documentos da Emenda " + codigo + " (" + tipo + ") - Autor: " + autor);
        if(documentosRelacionados.isEmpty()){
            System.out.println("  — Nenhum documento relacionado —");
        }else{
            for(DocumentoRelacionado doc : documentosRelacionados){
            System.out.println("  Data: " + doc.getData() + 
                               " | Fase: " + doc.getFase() + 
                               " | Valor: R$ " + String.format("%.2f", doc.getValor()));
            }
        }
    } 


}


