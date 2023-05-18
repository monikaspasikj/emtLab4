package mk.ukim.finki.payment.domain.models;

import mk.ukim.finki.sharedkernel.domain.base.DomainObjectId;

public class PaymentId extends DomainObjectId {
    private PaymentId() {
        super(PaymentId.randomId(PaymentId.class).getId());
    }

    public PaymentId(String uuid) {
        super(uuid);
    }

    public static PaymentId of(String uuid) {
        return new PaymentId(uuid);
    }
}