package com.mastercard.mpqr.pushpayment.exception;

import x4.InterfaceC2466c;

/* JADX INFO: loaded from: classes3.dex */
public final class InvalidTagValueException extends FormatException {
    public InvalidTagValueException(InterfaceC2466c interfaceC2466c, String str) {
        super(String.format("The tag '%1$s' value as '%2$s' is invalid", interfaceC2466c, str));
        interfaceC2466c.getClass();
    }

    public InvalidTagValueException(String str, String str2, String str3) {
        super(String.format("The tag '%1$s' value as '%2$s' is invalid, %3$s", str, str2, str3));
    }

    public InvalidTagValueException(String str, InterfaceC2466c interfaceC2466c, String str2) {
        super(String.format("The sub-tag '%1$s' value as '%2$s' at root-tag '%3$s' is invalid", interfaceC2466c, str2, str));
        interfaceC2466c.getClass();
    }
}
