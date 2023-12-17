package Adapter_new;

import Adapter.AliPay;
import Adapter.Pay;

public class AliAdapter extends AliPay implements Pay {
    //适配器类，用于适配支付宝和普通Pay
    @Override
    public void pay() {
        this.specialPay();
    }
}