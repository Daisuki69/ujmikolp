package com.squareup.wire;

import java.io.IOException;
import kotlin.jvm.internal.j;
import okio.Buffer;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtoReader32AsProtoReader extends ProtoReader {
    private final ProtoReader32 delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProtoReader32AsProtoReader(ProtoReader32 delegate) {
        super(new Buffer());
        j.g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.squareup.wire.ProtoReader
    public void addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
        j.g(fieldEncoding, "fieldEncoding");
        this.delegate.addUnknownField(i, fieldEncoding, obj);
    }

    @Override // com.squareup.wire.ProtoReader
    public boolean beforePossiblyPackedScalar$wire_runtime() {
        return this.delegate.beforePossiblyPackedScalar();
    }

    @Override // com.squareup.wire.ProtoReader
    public long beginMessage() {
        return this.delegate.beginMessage();
    }

    @Override // com.squareup.wire.ProtoReader
    public ByteString endMessageAndGetUnknownFields(long j) {
        return this.delegate.endMessageAndGetUnknownFields((int) j);
    }

    public final ProtoReader32 getDelegate() {
        return this.delegate;
    }

    @Override // com.squareup.wire.ProtoReader
    public long nextFieldMinLengthInBytes() {
        return this.delegate.nextFieldMinLengthInBytes();
    }

    @Override // com.squareup.wire.ProtoReader
    public int nextLengthDelimited() {
        return this.delegate.nextLengthDelimited();
    }

    @Override // com.squareup.wire.ProtoReader
    public int nextTag() {
        return this.delegate.nextTag();
    }

    @Override // com.squareup.wire.ProtoReader
    public FieldEncoding peekFieldEncoding() {
        return this.delegate.peekFieldEncoding();
    }

    @Override // com.squareup.wire.ProtoReader
    public ByteString readBytes() {
        return this.delegate.readBytes();
    }

    @Override // com.squareup.wire.ProtoReader
    public int readFixed32() {
        return this.delegate.readFixed32();
    }

    @Override // com.squareup.wire.ProtoReader
    public long readFixed64() {
        return this.delegate.readFixed64();
    }

    @Override // com.squareup.wire.ProtoReader
    public String readString() {
        return this.delegate.readString();
    }

    @Override // com.squareup.wire.ProtoReader
    public void readUnknownField(int i) {
        this.delegate.readUnknownField(i);
    }

    @Override // com.squareup.wire.ProtoReader
    public int readVarint32() {
        return this.delegate.readVarint32();
    }

    @Override // com.squareup.wire.ProtoReader
    public long readVarint64() {
        return this.delegate.readVarint64();
    }

    @Override // com.squareup.wire.ProtoReader
    public void skip() throws IOException {
        this.delegate.skip();
    }
}
