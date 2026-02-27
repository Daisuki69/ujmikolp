package com.squareup.wire;

import java.io.IOException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public final class FloatArrayProtoAdapter extends ProtoAdapter<float[]> {
    private final ProtoAdapter<Float> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatArrayProtoAdapter(ProtoAdapter<Float> originalAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, z.a(float[].class), null, originalAdapter.getSyntax(), new float[0], null, 32, null);
        j.g(originalAdapter, "originalAdapter");
        this.originalAdapter = originalAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public float[] redact(float[] value) {
        j.g(value, "value");
        return new float[0];
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(float[] value) {
        j.g(value, "value");
        int iEncodedSize = 0;
        for (float f : value) {
            iEncodedSize += this.originalAdapter.encodedSize(Float.valueOf(f));
        }
        return iEncodedSize;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i, float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return 0;
        }
        return super.encodedSizeWithTag(i, fArr);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public float[] decode(ProtoReader reader) {
        j.g(reader, "reader");
        return new float[]{Float.intBitsToFloat(reader.readFixed32())};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, float[] value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        for (float f : value) {
            this.originalAdapter.encode(writer, Float.valueOf(f));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter writer, int i, float[] fArr) throws IOException {
        j.g(writer, "writer");
        if (fArr != null) {
            if (fArr.length == 0) {
                return;
            }
            super.encodeWithTag(writer, i, fArr);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public float[] decode(ProtoReader32 reader) {
        j.g(reader, "reader");
        return new float[]{Float.intBitsToFloat(reader.readFixed32())};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, float[] value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        int length = value.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            } else {
                writer.writeFixed32(Float.floatToIntBits(value[length]));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter writer, int i, float[] fArr) throws IOException {
        j.g(writer, "writer");
        if (fArr != null) {
            if (fArr.length == 0) {
                return;
            }
            super.encodeWithTag(writer, i, fArr);
        }
    }
}
