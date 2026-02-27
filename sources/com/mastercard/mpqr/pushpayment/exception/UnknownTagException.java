package com.mastercard.mpqr.pushpayment.exception;

/* JADX INFO: loaded from: classes3.dex */
public final class UnknownTagException extends FormatException {
    public UnknownTagException(String str) {
        super(String.format("Unknown tag '%1$s' is not defined", str));
    }
}
