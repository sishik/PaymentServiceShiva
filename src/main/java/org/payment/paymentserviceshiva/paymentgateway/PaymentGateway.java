package org.payment.paymentserviceshiva.stripe;

public interface PaymentGateway {
    String generatePaymentLink(Long amount);

}
