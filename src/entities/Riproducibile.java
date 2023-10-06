package entities;

public interface Riproducibile {
    public void play();
    public int getDurata();
    public int getVolume();
    public int abbassaVolume();
    public int alzaVolume();
}
