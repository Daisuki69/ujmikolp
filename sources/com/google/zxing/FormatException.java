package com.google.zxing;

/* JADX INFO: loaded from: classes3.dex */
public final class FormatException extends ReaderException {
    public static final FormatException c;

    static {
        FormatException formatException = new FormatException();
        c = formatException;
        formatException.setStackTrace(ReaderException.f10140b);
    }

    private FormatException() {
    }

    public static FormatException a() {
        return ReaderException.f10139a ? new FormatException() : c;
    }
}
