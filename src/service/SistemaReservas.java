package service;

import model.Reserva;
import java.util.ArrayList;

public class SistemaReservas {

    //creo el array
    private ArrayList<Reserva> reservas = new ArrayList<>();

    // un metodo que recibe la reserva y la almacena en el array
    public void agregarReserva(Reserva r) {
        reservas.add(r);
    }

    public void eliminarReserva(int id) throws Exception {
        //! creacion de un bucle para que haga el recorrido en la lista
        for (Reserva r : reservas) {
            if (r.getIdReserva() == id) {
                reservas.remove(r);
                System.out.println("Reserva eliminada correctamente." );
                return;
            }
        }

        throw new Exception("No existe una reserva con ese ID.");
    }
    //! verifico para saber si la lista esta vacia o no
    public void listarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            for (Reserva r : reservas) {
                r.mostrarInfo();
                System.out.println("------------------------");
            }
        }
    }

    public int contarReservas() {
        return reservas.size();
    }
}
