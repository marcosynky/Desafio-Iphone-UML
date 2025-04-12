

/**
 * Interface que define as funcionalidades básicas de um reprodutor de música.
 * <p>
 * Esta interface define métodos essenciais para um player de música, permitindo
 * que a música seja tocada, pausada ou interrompida.
 * </p>
 */
public interface MusicPlayer {

    /**
     * Inicia a reprodução da música.
     * <p>
     * Este método deve ser responsável por iniciar ou continuar a reprodução da música.
     * Ele pode envolver a leitura de um arquivo de música ou streaming de uma fonte externa.
     * </p>
     */
    public void playMusic();

    /**
     * Pausa a música que está sendo reproduzida.
     * <p>
     * Este método deve pausar a reprodução da música no ponto atual.
     * Isso permite que o usuário retome a reprodução a partir do mesmo ponto quando desejar.
     * </p>
     */
    public void pauseMusic();

    /**
     * Interrompe a reprodução da música.
     * <p>
     * Este método deve parar a música e redefinir a posição de reprodução,
     * possivelmente retornando ao início ou ao ponto de início configurado.
     * </p>
     */
    public void stopMusic();
}
