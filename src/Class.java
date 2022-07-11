public class Class {
    private int san;
    private String soz;
    private int[] massiv;


    public Class() {
    }

    public Class(int san, String soz, int[] massiv) {
        this.san = san;
        this.soz = soz;
        this.massiv = massiv;
    }

    public int getSan() {
        return san;
    }

    public void setSan() {
        this.san = san;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(java.lang.String soz) {
        this.soz = soz;
    }

    public int[] getMassiv() {
        int i;
        for (i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        } return massiv;
    }

    public void setMassiv(int[] massiv) {
        this.massiv = massiv;
    }


}

