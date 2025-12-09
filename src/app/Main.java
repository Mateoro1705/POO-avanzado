package app;

import model.Reserva;
import service.SistemaReservas;

public class Main {

    public static void main(String[] args) {

        SistemaReservas sistema = new SistemaReservas();
        //Cree las reservas
        Reserva reserva1 = new Reserva(1, "Carlos", "09-12-2025", 2);
        Reserva reserva2 = new Reserva(2, "María", "10-12-2025", 3);

        // Las agrego al array
        sistema.agregarReserva(reserva1);
        sistema.agregarReserva(reserva2);

        //! aca use el setter para cambiar a carlos por otro nombre
        reserva1.setCliente("profe nath usando Set");
        //! aca muestro la lista
        System.out.println("--- Reservas actuales ---");
        sistema.listarReservas();

        // la cantidad total
        System.out.println("Total de reservas: " + sistema.contarReservas());
        System.out.println("------------------------");

        //! lo que hice fue tratar de eliminar la reserva 2
        try {
            sistema.eliminarReserva(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //! hice lo mismo del de arriba pero no existe entonces manda el mensaje de que no existe
        try {
            sistema.eliminarReserva(10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //! muestro lo que quedo
        System.out.println("--- Después de eliminar ---");
        sistema.listarReservas();
    }
}
