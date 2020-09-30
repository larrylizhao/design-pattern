package proxy;

import java.awt.image.ImageConsumer;

public class HKMacSeller implements IMacSeller {
    // 被代理者
    IMacSeller seller = new USAMacSeller();

    @Override
    public void buy() {
        // 对USAMacSeller进行代理
        seller.buy();
        // 利用代理将无关乎主逻辑的东西进行解耦合, 如: 打印日志
        System.out.println("But MacBook from Hong Kong");
    }
}
