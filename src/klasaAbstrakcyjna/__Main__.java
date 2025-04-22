package klasaAbstrakcyjna;

public class __Main__ {
    public static void main(String[] args) {
        Instrument perkusja = new Perkusja("Alesis Nitro Kit");
        Instrument skrzypce = new Skrzypce("Thomann Student");

        System.out.println(perkusja);
        perkusja.dajDzwiek();

        System.out.println(skrzypce);
        skrzypce.dajDzwiek();
    }
}
