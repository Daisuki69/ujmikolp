package com.squareup.wire.internal;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Syntax;
import java.util.Map;
import okio.ByteString;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes4.dex */
public interface MessageBinding<M, B> {
    void addUnknownField(B b8, int i, FieldEncoding fieldEncoding, Object obj);

    M build(B b8);

    void clearUnknownFields(B b8);

    int getCachedSerializedSize(M m);

    Map<Integer, FieldOrOneOfBinding<M, B>> getFields();

    InterfaceC2488d getMessageType();

    Syntax getSyntax();

    String getTypeUrl();

    B newBuilder();

    void setCachedSerializedSize(M m, int i);

    ByteString unknownFields(M m);
}
