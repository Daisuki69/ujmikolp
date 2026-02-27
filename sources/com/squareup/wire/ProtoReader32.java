package com.squareup.wire;

import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public interface ProtoReader32 {
    void addUnknownField(int i, FieldEncoding fieldEncoding, Object obj);

    ProtoReader asProtoReader();

    boolean beforePossiblyPackedScalar() throws IOException;

    int beginMessage() throws IOException;

    ByteString endMessageAndGetUnknownFields(int i) throws IOException;

    int nextFieldMinLengthInBytes();

    int nextLengthDelimited() throws IOException;

    int nextTag() throws IOException;

    FieldEncoding peekFieldEncoding();

    ByteString readBytes() throws IOException;

    int readFixed32() throws IOException;

    long readFixed64() throws IOException;

    String readString() throws IOException;

    void readUnknownField(int i);

    int readVarint32() throws IOException;

    long readVarint64() throws IOException;

    void skip() throws IOException;
}
