package com.google.zxing;

/* JADX INFO: loaded from: classes3.dex */
public final class NotFoundException extends ReaderException {
    public static final NotFoundException c;

    static {
        NotFoundException notFoundException = new NotFoundException();
        c = notFoundException;
        notFoundException.setStackTrace(ReaderException.f10140b);
    }

    private NotFoundException() {
    }
}
