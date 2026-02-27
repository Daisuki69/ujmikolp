package com.squareup.wire;

import androidx.camera.video.AudioStats;
import java.io.IOException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public final class DoubleProtoAdapter extends ProtoAdapter<Double> {
    public DoubleProtoAdapter() {
        super(FieldEncoding.FIXED64, z.a(Double.TYPE), null, Syntax.PROTO_2, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE), null, 32, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Double d10) throws IOException {
        encode(protoWriter, d10.doubleValue());
    }

    public int encodedSize(double d10) {
        return 8;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ Double redact(Double d10) {
        return redact(d10.doubleValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Double d10) throws IOException {
        encode(reverseProtoWriter, d10.doubleValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ int encodedSize(Double d10) {
        return encodedSize(d10.doubleValue());
    }

    public Double redact(double d10) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Double decode(ProtoReader reader) {
        j.g(reader, "reader");
        return Double.valueOf(Double.longBitsToDouble(reader.readFixed64()));
    }

    public void encode(ProtoWriter writer, double d10) throws IOException {
        j.g(writer, "writer");
        writer.writeFixed64(Double.doubleToLongBits(d10));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Double decode(ProtoReader32 reader) {
        j.g(reader, "reader");
        return Double.valueOf(Double.longBitsToDouble(reader.readFixed64()));
    }

    public void encode(ReverseProtoWriter writer, double d10) throws IOException {
        j.g(writer, "writer");
        writer.writeFixed64(Double.doubleToLongBits(d10));
    }
}
