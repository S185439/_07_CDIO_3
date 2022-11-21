public class Terning {
    private int antalSider;
    public static int DEFAUlT_SIDER = 6;
    private int oejenVaerdi = 1;

    /**
     * Constructor til terning med DEFAULT_SIDER, antalsider = 6
     */
    public Terning() {
        this.antalSider = DEFAUlT_SIDER;
    }

    /**
     * Constructor til terning med variabel antal sider
     * @param antalSider mængden af sider på terning
     */
    public Terning(int antalSider) {
        this.antalSider = antalSider;
    }

    /**
     *
     * @return En tilfaeldig vaerdi imellem 1 og antalSider
     */
    public int slaaTerning() {
        this.oejenVaerdi = (int) ((Math.random() * antalSider)+1);
        return oejenVaerdi;
    }
    public int getOejenVaerdi() {
        return oejenVaerdi;
    }

    /**
     *
     * @param oejenVaerdiInt en integer vaerdi, skal være imellem 1 og antalSider på terning
     * @return Hvis param overskrider antalsider eller er mindre end 1 returnerer
     * den oejenVaerdi som var inden forsøg paa aendring, hvis ikke returner ny oejenVaerdi
     */
    public int setOejenVaerdi(int oejenVaerdiInt) {
        if (oejenVaerdiInt <= antalSider && oejenVaerdiInt >= 1) {
            this.oejenVaerdi = oejenVaerdiInt;
            return oejenVaerdi;
        } else {
            System.out.println("Input er over eller under antalsider, skal være imellem 1 og antalsider");
            return oejenVaerdi;
        }
    }

    /**
     *
     * @return oejenVaerdi paa terning som String
     */
    @Override
    public String toString() {
        return Integer.toString(oejenVaerdi);
    }
}
