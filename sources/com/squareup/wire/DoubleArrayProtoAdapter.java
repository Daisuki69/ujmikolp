package com.squareup.wire;

import java.io.IOException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public final class DoubleArrayProtoAdapter extends ProtoAdapter<double[]> {
    private final ProtoAdapter<Double> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleArrayProtoAdapter(ProtoAdapter<Double> originalAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, z.a(double[].class), null, originalAdapter.getSyntax(), new double[0], null, 32, null);
        j.g(originalAdapter, "originalAdapter");
        this.originalAdapter = originalAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public double[] redact(double[] value) {
        j.g(value, "value");
        return new double[0];
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(double[] value) {
        j.g(value, "value");
        int iEncodedSize = 0;
        for (double d10 : value) {
            iEncodedSize += this.originalAdapter.encodedSize(Double.valueOf(d10));
        }
        return iEncodedSize;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i, double[] dArr) {
        if (dArr == null || dArr.length == 0) {
            return 0;
        }
        return super.encodedSizeWithTag(i, dArr);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public double[] decode(ProtoReader reader) {
        j.g(reader, "reader");
        return new double[]{Double.longBitsToDouble(reader.readFixed64())};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, double[] value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        for (double d10 : value) {
            this.originalAdapter.encode(writer, Double.valueOf(d10));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter writer, int i, double[] dArr) throws IOException {
        j.g(writer, "writer");
        if (dArr != null) {
            if (dArr.length == 0) {
                return;
            }
            super.encodeWithTag(writer, i, dArr);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public double[] decode(ProtoReader32 reader) {
        j.g(reader, "reader");
        return new double[]{Double.longBitsToDouble(reader.readFixed64())};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, double[] value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        int length = value.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            } else {
                writer.writeFixed64(Double.doubleToLongBits(value[length]));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter writer, int i, double[] dArr) throws IOException {
        j.g(writer, "writer");
        if (dArr != null) {
            if (dArr.length == 0) {
                return;
            }
            super.encodeWithTag(writer, i, dArr);
        }
    }
}
