
package Ejercicio9;
    
    public class Main {
    public static void main(String[] args) {
        NarutoUzumaki naruto = new NarutoUzumaki(17, "Konoha", 50);
        RockLee rockLee = new RockLee(18, "Konoha", 40);
        KakashiHatake kakashi = new KakashiHatake(30, "Konoha", 60);
        SakuraHaruno sakura = new SakuraHaruno(17, "Konoha", 45);

        // Acciones de Naruto
        naruto.concentrarChakra();
        naruto.realizarAtaqueBasico();
        naruto.atacarBolaFuego();
        naruto.invocarKuchiyose();

        System.out.println(); // Separador

        // Acciones de Rock Lee
        rockLee.concentrarChakra();
        rockLee.realizarAtaqueBasico();
        rockLee.atacarPuñoDinamico();
        rockLee.atacarLotoPrimario();

        System.out.println(); // Separador

        // Acciones de Kakashi
        kakashi.concentrarChakra();
        kakashi.realizarAtaqueBasico();
        kakashi.atacarBolaFuego();
        kakashi.invocarKuchiyose();
        kakashi.atacarIlusionOscura();
        kakashi.atacarParalisisMental();

        System.out.println(); // Separador

        // Acciones de Sakura
        sakura.concentrarChakra();
        sakura.realizarAtaqueBasico();
        sakura.atacarIlusionOscura();
        sakura.atacarParalisisMental();
    }
}

    
