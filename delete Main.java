import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu;


            System.out.println("Portal de Noticias ADS: Os 18 tipos de golpes registrado pelo sistema financeiro lista pelo Banco Central do Brasil.");
            System.out.println("A Febraban, por exemplo, divulgou em 2024 os 10 golpes mais aplicados contra clientes bancários, com base em reclamações registradas:\n ");
            System.out.println("1-Golpe do WhatsApp");
            System.out.println("2-Falsas vendas");
            System.out.println("3-Falsa central telefônica");
            System.out.println("4-Phishing");
            System.out.println("5-Falso investimento");
            System.out.println("6-Troca de cartão");
            System.out.println("7-Envio de falso boleto");
            System.out.println("8-Devolução de empréstimo");
            System.out.println("9-Mão fantasma");
            System.out.println("10-Falso motoboy");
            System.out.println("11-Golpe do PIX Agendado");
            System.out.println("12-Golpe da Falsa Central de Segurança");
            System.out.println("13-Golpe do PIX de Devolução");
            System.out.println("14-Golpe do Laranja");
            System.out.println("15-Golpe do falso funcionário público");
            System.out.println("16-Golpe do empréstimo falso");
            System.out.println("17-Golpe do falso sequestro");
            System.out.println("18-Golpe do falso prêmio ou herança");
            System.out.println("0-Não desejo saber sobre nenhuma das opções listadas acima.\n");
            System.out.println("Escolha um dos golpes listados para saber mais sobre o assunto");
            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Golpe do WhatsApp");
                    System.out.println("Criminosos tentam clonar a conta de WhatsApp da vítima para solicitar dinheiro aos seus contatos.");
                    break;
                case 2:
                    System.out.println("Falsas vendas");
                    System.out.println("Criação de sites ou perfis falsos oferecendo produtos inexistentes.");
                    break;
                case 3:
                    System.out.println("Falsa central telefônica");
                    System.out.println("Golpistas se passam por funcionários de bancos para obter dados pessoais e financeiros.");
                    break;
                case 4:
                    System.out.println("Phishing");
                    System.out.println("Envio de e-mails ou mensagens falsas para roubar informações sensíveis.");
                    break;
                case 5:
                    System.out.println("Falso investimento");
                    System.out.println("Ofertas de investimentos fraudulentos para capturar recursos das vítimas.");
                    break;
                case 6:
                    System.out.println("Troca de cartão");
                    System.out.println("Substituição do cartão bancário legítimo por um falso.");
                    break;
                case 7:
                    System.out.println("Envio de falso boleto");
                    System.out.println("Envio de boletos falsificados para induzir ao pagamento.");
                    break;
                case 8:
                    System.out.println("Devolução de empréstimo");
                    System.out.println("Golpes relacionados à devolução de valores de empréstimos inexistentes.");
                    break;
                case 9:
                    System.out.println("Mão fantasma");
                    System.out.println("Utilização de dispositivos para realizar transações bancárias sem o conhecimento do titular.");
                    break;
                case 10:
                    System.out.println("Falso motoboy");
                    System.out.println("Entrega de documentos falsos ou cartões bancários por entregadores fraudulentos.");
                    break;
                case 11:
                    System.out.println("Golpe do PIX Agendado");
                    System.out.println("Golpistas fingem ser de uma instituição financeira e solicitam o cancelamento de um PIX agendado, induzindo a vítima a realizar uma transferência para a conta dos criminosos.");
                    break;
                case 12:
                    System.out.println("Golpe da Falsa Central de Segurança");
                    System.out.println("Criminosos se passam por funcionários do banco e solicitam transferências urgentes para \"proteger\" a conta da vítima.");
                    break;
                case 13:
                    System.out.println("Golpe do PIX de Devolução");
                    System.out.println("Golpistas enviam um PIX para a vítima e, posteriormente, solicitam a devolução do valor, alegando erro.");
                    break;
                case 14:
                    System.out.println("Golpe do Laranja");
                    System.out.println("Utilização de contas de terceiros para realizar transações fraudulentas, muitas vezes sem o conhecimento do titular da conta.");
                    break;
                case 15:
                    System.out.println("Golpe do falso funcionário público");
                    System.out.println("Pedem dados e dinheiro alegando pendências fiscais ou legais.");
                    break;
                case 16:
                    System.out.println("Golpe do empréstimo falso");
                    System.out.println("Cobram taxas ou pedem dados para empréstimos inexistentes.");
                    break;
                case 17:
                    System.out.println("Golpe do falso sequestro");
                    System.out.println("Ligação pedindo resgate com pedido de transferência bancária.");
                    break;
                case 18:
                    System.out.println("Golpe do falso prêmio ou herança");
                    System.out.println("Promessas de prêmios ou herança que exigem pagamento antecipado.");
                    break;

                case 0:
                    System.out.println("Obrigado pela participação, saindo do site de noticias....");
                    System.out.println("Aguardamos que você volte novamente :)");
                    break;


                default:
                    System.out.println("Nenhuma das opções selecionadas, por gentileza digite novamente qual a opção que deseja. ");
                    break;
            }
        entrada.close();
    }
}



