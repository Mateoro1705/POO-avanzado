package model;

public class Reserva {

    //! Atributos
    private int idReserva;
    private  String cliente;
    private String fecha;
    private int duracionHoras;

    //! Constructores

    public Reserva(){

    }

    public Reserva(int idReserva, String cliente, String fecha, int duracionHoras) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.fecha = fecha;
        this.duracionHoras = duracionHoras;
    }

    //! Creacion de setters y getters
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    //! Metodos

    public void mostrarInfo(){

        System.out.println("Id de reserva: " +idReserva);
        System.out.println("El nombre del cliente es: " + cliente);
        System.out.println("La fecha: " + fecha);
        System.out.println("Duracion: " + duracionHoras +" Horas");
    }

}
