
/**
 * Interface que define as funcionalidades básicas de um navegador web.
 * <p>
 * Esta interface define métodos que são comumente encontrados em navegadores,
 * permitindo abrir um navegador, realizar buscas e fechar o navegador.
 * </p>
 */
public interface WebBrowser {

    /**
     * Abre o navegador.
     * <p>
     * Esse método deve ser responsável por inicializar e abrir uma janela do navegador.
     * O comportamento exato pode variar dependendo da implementação (por exemplo,
     * pode abrir o navegador padrão do sistema ou iniciar um navegador embutido).
     * </p>
     */
    public void openBrowser();

    /**
     * Realiza uma busca na web com a consulta fornecida.
     * <p>
     * Esse método deve iniciar uma busca no navegador com a consulta fornecida como parâmetro.
     * A consulta pode ser um termo de pesquisa ou uma URL específica.
     * O comportamento da busca pode depender do mecanismo de pesquisa utilizado.
     * </p>
     *
     * @param query A consulta de pesquisa que será realizada. Pode ser uma palavra-chave ou uma URL.
     */
    public void search_query_String_(String query);

    /**
     * Fecha o navegador.
     * <p>
     * Este método deve fechar a janela do navegador ou interromper o processo de navegação.
     * Ele pode envolver liberar recursos ou finalizar sessões de navegação ativas.
     * </p>
     */
    public void closeBrowser();
}
