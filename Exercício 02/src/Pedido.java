import java.util.ArrayList;
import java.util.List;

// subject concreto: avisa todos os observadores quando o status muda
public class Pedido implements Subject {
    private List<Observer> observadores = new ArrayList<>();
    private StatusPedido status = StatusPedido.RECEBIDO;

    @Override
    public void registerObserver(Observer observer) {
        observadores.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observadores.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observadores) {
            observer.update(this);
        }
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
        notifyObservers();
    }

    public StatusPedido getStatus() {
        return status;
    }
}
