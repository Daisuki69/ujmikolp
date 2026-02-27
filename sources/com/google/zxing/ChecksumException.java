package com.google.zxing;

/* JADX INFO: loaded from: classes3.dex */
public final class ChecksumException extends ReaderException {
    public static final ChecksumException c;

    static {
        ChecksumException checksumException = new ChecksumException();
        c = checksumException;
        checksumException.setStackTrace(ReaderException.f10140b);
    }

    private ChecksumException() {
    }

    public static ChecksumException a() {
        return ReaderException.f10139a ? new ChecksumException() : c;
    }
}
