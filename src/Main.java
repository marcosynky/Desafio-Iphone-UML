//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone() {

            @Override
            public void openBrowser() {
                System.out.println("Abriu o navegador");
            }

            @Override
            public void search_query_String_(String query) {
                System.out.println("Realizou uma busca na web com a consulta: " + query);
            }

            @Override
            public void closeBrowser() {
                System.out.println("Fechei o navegador");
            }

            @Override
            public void playMusic() {
                System.out.println("Iniciou a reproducao da musica");
            }

            @Override
            public void pauseMusic() {
                System.out.println("Pausou a musica");
            }

            @Override
            public void stopMusic() {
                System.out.println("Parou a musica");
            }

            @Override
            public void makeCall(String phoneNumber) {
                System.out.println("Realizou uma chamada para o numero: " + phoneNumber);
            }

            @Override
            public void receiveCall() {
                System.out.println("Aceitou uma chamada");
            }

            @Override
            public void hangUp() {
                System.out.println("Encerrou a chamada");
            }
        };

        phone.openBrowser();
        phone.search_query_String_("https://www.google.com.br");
        phone.closeBrowser();
        phone.playMusic();
        phone.pauseMusic();
        phone.stopMusic();
        phone.makeCall("11999999999");
        phone.receiveCall();
        phone.hangUp();

    }
}