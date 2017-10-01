package composite;

import java.util.ArrayList;

/**
 *
 * @author roger
 */
public class Trajeto implements IModal {

    private ArrayList<IModal> trajetos = new ArrayList<>();

    /**
     * @return the trajetos
     */
    public ArrayList<IModal> getTrajetos() {
        return trajetos;
    }

    /**
     * @param o trajeto a ser adicionado
     */
    public void addTrajeto(IModal trajeto) {
        this.trajetos.add(trajeto);
    }

    @Override
    public void getInfo() {
        trajetos.forEach((trajeto) -> {
            trajeto.getInfo();
        });
    }
}
