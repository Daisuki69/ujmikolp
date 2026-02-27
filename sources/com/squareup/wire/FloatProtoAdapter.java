package com.squareup.wire;

import java.io.IOException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public final class FloatProtoAdapter extends ProtoAdapter<Float> {
    public FloatProtoAdapter() {
        super(FieldEncoding.FIXED32, z.a(Float.TYPE), null, Syntax.PROTO_2, Float.valueOf(0.0f), null, 32, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Float f) throws IOException {
        encode(protoWriter, f.floatValue());
    }

    public int encodedSize(float f) {
        return 4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ Float redact(Float f) {
        return redact(f.floatValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Float f) throws IOException {
        encode(reverseProtoWriter, f.floatValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ int encodedSize(Float f) {
        return encodedSize(f.floatValue());
    }

    public Float redact(float f) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Float decode(ProtoReader reader) {
        j.g(reader, "reader");
        return Float.valueOf(Float.intBitsToFloat(reader.readFixed32()));
    }

    public void encode(ProtoWriter writer, float f) throws IOException {
        j.g(writer, "writer");
        writer.writeFixed32(Float.floatToIntBits(f));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Float decode(ProtoReader32 reader) {
        j.g(reader, "reader");
        return Float.valueOf(Float.intBitsToFloat(reader.readFixed32()));
    }

    public void encode(ReverseProtoWriter writer, float f) throws IOException {
        j.g(writer, "writer");
        writer.writeFixed32(Float.floatToIntBits(f));
    }
}
