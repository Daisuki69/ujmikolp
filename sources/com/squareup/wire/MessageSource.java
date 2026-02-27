package com.squareup.wire;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface MessageSource<T> extends Closeable {
    T read() throws IOException;
}
