


public interface Phone extends MusicPlayer, WebBrowser {
    void makeCall(String phoneNumber); // Passando o número formatado com o código do país
    void receiveCall(); // Aceitou uma chamada
    void hangUp(); // Encerrou a chamada


}
