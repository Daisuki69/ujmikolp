package com.google.gson.internal.bind;

import java.io.Reader;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends Reader implements AutoCloseable {
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new AssertionError();
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i4) {
        throw new AssertionError();
    }
}
