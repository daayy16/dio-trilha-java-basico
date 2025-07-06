public class IPhone {
    private String modelo;

    private AppMusicPlayer musicPlayer = new AppMusicPlayer();
    private AppPhone phone = new AppPhone();
    private AppNavegador navegador = new AppNavegador();

    public IPhone(String modelo){
        this.modelo = modelo;
    }

    public Object abrirApp(String nome) {
        if(nome.equals("musicPlayer")){
            System.out.println("Abrindo app " + nome);
            return musicPlayer;
        }else if(nome.equals("phone")){
            System.out.println("Abrindo app " + nome);
            return phone;
        } else if(nome.equals("navegador")){
            System.out.println("Abrindo app " + nome);
            return navegador;
        }
        System.out.println("App não encontrado");
        return null;
    }

    public String getModelo(){
        return this.modelo;
    }
}
