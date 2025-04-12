

/**
 * Interface que define as funcionalidades de um telefone.
 * A interface herda as funcionalidades de MusicPlayer e WebBrowser.
 */
public interface Phone extends MusicPlayer, WebBrowser {

    /**
     * Realiza uma chamada telefônica para o número especificado.
     *
     * @param phoneNumber o número de telefone para o qual a chamada será feita.
     */
    void makeCall(String phoneNumber);

    /**
     * Aceita uma chamada recebida.
     */
    void receiveCall();

    /**
     * Encerra a chamada atual.
     */
    void hangUp();
}
