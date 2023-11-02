package Clases;

import java.util.HashMap;
import java.lang.Integer;
public class Factura {
    //•	Número de factura: Un número único para identificar la factura.
    private long numeroFactura;
    //•	Fecha de emisión: La fecha en la que se emitió la factura.
    private int fecha;
    //•	Cliente: El cliente al que se le emite la factura.
    private String cliente;
    //•	Artículos: Una lista de artículos vendidos en la factura.
    private HashMap<String, Integer> produtosSell = new HashMap<>();
    //lista de precio por articulo
    private HashMap<String, Integer> priceProd = new HashMap<>();
    private int cantVend;
    //•	Subtotal: El subtotal de la factura sin impuestos.
    private double subTotal;
    //•	IVA: El impuesto sobre el valor añadido (IVA) de la factura.
    private double iva;
    //•	Total: El total de la factura, incluyendo el IVA.
    private double totalFactura;
    private String article;

    //•
    //La clase debe tener los siguientes métodos:
    //
    //•	Constructor: Un constructor que inicializa los atributos de la factura.
    public Factura(long numeroFactura, int fecha, String cliente) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public void setPriceProd(HashMap<String, Integer> priceProd) {
        this.priceProd = priceProd;
    }

    public void setProdutosSell(HashMap<String, Integer> produtosSell) {
        this.produtosSell = produtosSell;
    }

    //•	Agregar artículo: Un método que agrega un artículo a la factura.
    public void setArticle(String article) {
        this.article = article;
    }

    public HashMap<String, Integer> getProdutosSell() {
        return produtosSell;
    }

    //calcular subtotal


    public void calcularSubtotal(){
        this.subTotal=0   ;
        for (String product: this.priceProd.keySet()) {
                subTotal+=this.priceProd.get(product)*this.produtosSell.get(product);
        }
        System.out.println("El subtotal es "+ subTotal);
    }


    //•	Calcular IVA: Un método que calcula el IVA de la factura.
    public void calcIva(){
        this.iva = (this.subTotal * 0.21);

        System.out.println("El Iva de la factura es : " + this.iva);
    }
    //•	Calcular total: Un método que calcula el total de la factura
    public void calcTotal(){
        this.totalFactura=this.subTotal+this.iva;
        System.out.println("El total de la factura es de "+totalFactura);
    }

}