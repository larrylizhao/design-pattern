package proxy;

public class Client {
    public static void main(String[] args) {
        System.out.println("Proxy main");
        // HKMacSeller代理商帮我们做了去美国买这个事情
        IMacSeller seller = new HKMacSeller();
        seller.buy();
    }
}
