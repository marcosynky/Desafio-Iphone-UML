public class Main {
    public static void main(String[] args) {
        // Número de telefone sem o código de país
        String phoneNumber = "0000000000000"; // 13 dígitos, sem o código do país

        // Chamando o método para formatar o número
        String formattedNumber = formatPhoneNumber(phoneNumber);

        // Adicionando o código de país
        String finalFormattedNumber = "+55" + formattedNumber;

        // Exibindo o número formatado com o código do país
        System.out.println(finalFormattedNumber); // Exemplo de saída: +55 00 00000-0000

        // Criando uma instância anônima de Phone, implementando todos os métodos das interfaces MusicPlayer e WebBrowser
        Phone phone = new Phone() {
            // Implementação dos métodos conforme o código anterior...
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
                System.out.println("Iniciou a reprodução da música");
            }

            @Override
            public void pauseMusic() {
                System.out.println("Pausou a música");
            }

            @Override
            public void stopMusic() {
                System.out.println("Parou a música");
            }

            @Override
            public void makeCall(String phoneNumber) {
                System.out.println("Realizou uma chamada para o número: " + phoneNumber);
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

        // Testando os métodos implementados
        phone.openBrowser();
        phone.search_query_String_("https://www.google.com.br");
        phone.closeBrowser();
        phone.playMusic();
        phone.pauseMusic();
        phone.stopMusic();
        phone.makeCall(finalFormattedNumber); // Passando o número formatado com o código do país
        phone.receiveCall();
        phone.hangUp();
    }

    /**
     * Formata um número de telefone no formato "00 00 00000-0000".
     *
     * @param phoneNumber o número de telefone sem formatação (apenas dígitos)
     * @return o número de telefone formatado
     */
    public static String formatPhoneNumber(String phoneNumber) {
        // Verifica se o número tem a quantidade certa de caracteres
        if (phoneNumber.length() != 13) {
            throw new IllegalArgumentException("Número de telefone inválido. Esperado 13 dígitos.");
        }

        // Formata o número no formato 00 00 00000-0000
        return phoneNumber.substring(0, 2) + " " + // 00 (código do estado)
                phoneNumber.substring(2, 4) + " " +  // 00 (DDD)
                phoneNumber.substring(4, 9) + "-" +  // 00000
                phoneNumber.substring(9);             // 0000
    }
}
