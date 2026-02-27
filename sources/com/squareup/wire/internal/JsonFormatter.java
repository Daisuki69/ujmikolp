package com.squareup.wire.internal;

/* JADX INFO: loaded from: classes4.dex */
public interface JsonFormatter<W> {
    W fromString(String str);

    Object toStringOrNumber(W w6);
}
