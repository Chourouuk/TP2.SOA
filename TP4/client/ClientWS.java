package client;

import proxy.CalculWS;
import proxy.CalculWSService;
import service.CalculatriceWS;

public class ClientWS {

    public static void main(String[] args) {
        service.CalculWS proxy = new CalculWSService().getCalculWSPort();
        System.out.println(proxy.Somme(4,5));
    }
}
