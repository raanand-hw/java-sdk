package com.hyperwallet.clientsdk.model;

public class HyperwalletPaymentListOptions extends HyperwalletPaginationOptions {

    private String clientPaymentId;

    public String getClientPaymentId() {
        return clientPaymentId;
    }

    public void setClientPaymentId(String clientPaymentId) {
        this.clientPaymentId = clientPaymentId;
    }

    public HyperwalletPaymentListOptions clientPaymentId(String clientPaymentId) {
        this.clientPaymentId = clientPaymentId;
        return this;
    }
}
