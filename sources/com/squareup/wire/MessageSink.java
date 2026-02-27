package com.squareup.wire;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface MessageSink<T> extends Closeable {
    void cancel() throws IOException;

    void write(T t5) throws IOException;
}
