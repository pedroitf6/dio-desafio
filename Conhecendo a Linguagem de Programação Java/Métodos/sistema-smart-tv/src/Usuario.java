public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        smartTV.dimunuirVolume();
        smartTV.dimunuirVolume();
        
        System.out.println("TV Ligada ? " + smartTV.ligada);
        System.out.println("Canal Atual : " + smartTV.canal);
        System.out.println("Volume Atual : " + smartTV.volume);
    }
    
}
