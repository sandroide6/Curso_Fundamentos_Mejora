import java.util.*;

public class Sensor{

    private String tipo;
    private double valor;

    public Sensor(String t,double v){
        this.tipo=t;
        this.valor=v;
    }

    public String getTipo(){
        return this.tipo;
    }

    public double getValor(){
        return this.valor;
    }

    public void setTipo(String t){
        this.tipo=t;
    }

    public void setValor(double v){
        this.valor=v;
    }

    public String toString(){
        String text1="Tipo:"+ this.tipo+"\n";
        String text2 ="Valor:"+ String.valueOf(this.valor)+"\n";
        String text3=" "+text1+"   "+text2;
        return text3;
    }

}