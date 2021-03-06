package AbstractFactories.CouleurFactories;

public class Blanc implements Couleur {

    private int R=255, V=255, B=255;

    @Override
    public Blanc getCouleur() {
        return this;
    }

    @Override
    public void SetCouleur(int R, int V, int B) {
        this.R = R;
        this.V = V;
        this.B = B;
    }

    @Override
    public void SetCouleur(int RGB) {

    }

    @Override
    public void SetCouleur(String RGB) {

    }
    @Override
    public int getR() {
        return R;
    }

    @Override
    public int getV() {
        return V;
    }

    @Override
    public int getB() {
        return B;
    }
}