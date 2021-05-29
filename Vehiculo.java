import java.util.ArrayList;
public class Vehiculo{
    public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    private ArrayList<Sensor> sensores = new ArrayList<Sensor>();
    public static int idActual = 1; 
    private int id;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;

    public Vehiculo(){
        this.id = idActual;
        idActual = idActual +1;
        Vehiculo.vehiculos.add(this);
    }

    public Vehiculo(int mo, String ma, double va){
        this(mo, ma, va,"verde"); 

    }

    public Vehiculo(int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va; 
        this.color = co;
        this.id = idActual;
        idActual = idActual +1;
        Vehiculo.vehiculos.add(this);
    }

    public int getIdActual(){
        return idActual;
    }

    public void setIdActual(int idA){
        this.idActual = idA;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getModelo(){
        return modelo;
    }

    public void setModelo(int mo){
        this.modelo = mo;
    }

    public ArrayList<Sensor> getSensores(){
        return this.sensores;
    }

    public void setSensores(ArrayList<Sensor> s){
        this.sensores = s;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String ma){
        this.marca = ma;
    }

    public double getValorComercial(){
        return this.valorComercial;
    }

    public void setValorComercial(double va){
        this.valorComercial = va;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String co){
        this.color = co;
    }

    public String toString(){
        String infoModelo="Modelo:"+ String.valueOf(this.modelo)+"\n";
        String infoValorcomercial ="ValorComercial:"+ String.valueOf(this.valorComercial)+"\n";
        String infoColor="Color:"+ this.color+"\n";
        String infoMarca="Marca:"+ this.marca+"\n";
        String infoId="Id:"+ this.id+"\n";
        String infoTotal="  "+infoModelo+"  "+infoValorcomercial+"  "+infoColor+"  "+infoMarca+"  "+infoId+"\n";
        String infoTotalSensores="";
        for (int i=0; i<this.sensores.size(); i++){ 
            infoTotalSensores = infoTotalSensores + sensores.get(i).toString(); 
        }
        String InfoConcatenada= infoTotal + infoTotalSensores;
        return InfoConcatenada;
    }

    public static String toStringVehiculos(){
        String InfoTodosVehiculos="";
        for (Vehiculo iterador : vehiculos) {
            InfoTodosVehiculos= InfoTodosVehiculos + iterador.toString();
        }
        return InfoTodosVehiculos;
    }

    public static String VehiculosVerdes(){
        String carrosVerdes="";

        for(Vehiculo iterador: vehiculos){
            if(iterador.getColor().equals("verde")){
                carrosVerdes= carrosVerdes+ iterador.toString();

            }
        }

        return carrosVerdes;
    }

    public static  String VehiculoId(int id){
        String busquedaId="";
        for(Vehiculo iterador: vehiculos){
            if(iterador.id == id){
                busquedaId= iterador.toString();

            }else{
                System.out.println("No se encontro un vehiculo con ese Id");

            }
        }
        return busquedaId;

    }

    public static int cantidadVehiculos(){
        int CantidadVehiculos= Vehiculo.vehiculos.size();
        return CantidadVehiculos;
    }
}