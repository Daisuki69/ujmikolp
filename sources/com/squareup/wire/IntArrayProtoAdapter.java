package com.squareup.wire;

import java.io.IOException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public final class IntArrayProtoAdapter extends ProtoAdapter<int[]> {
    private final ProtoAdapter<Integer> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntArrayProtoAdapter(ProtoAdapter<Integer> originalAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, z.a(int[].class), null, originalAdapter.getSyntax(), new int[0], null, 32, null);
        j.g(originalAdapter, "originalAdapter");
        this.originalAdapter = originalAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int[] redact(int[] value) {
        j.g(value, "value");
        return new int[0];
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(int[] value) {
        j.g(value, "value");
        int iEncodedSize = 0;
        for (int i : value) {
            iEncodedSize += this.originalAdapter.encodedSize(Integer.valueOf(i));
        }
        return iEncodedSize;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i, int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return 0;
        }
        return super.encodedSizeWithTag(i, iArr);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int[] decode(ProtoReader reader) {
        j.g(reader, "reader");
        return new int[]{this.originalAdapter.decode(reader).intValue()};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, int[] value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        for (int i : value) {
            this.originalAdapter.encode(writer, Integer.valueOf(i));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter writer, int i, int[] iArr) throws IOException {
        j.g(writer, "writer");
        if (iArr != null) {
            if (iArr.length == 0) {
                return;
            }
            super.encodeWithTag(writer, i, iArr);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int[] decode(ProtoReader32 reader) {
        j.g(reader, "reader");
        return new int[]{this.originalAdapter.decode(reader).intValue()};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, int[] value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        int length = value.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            } else {
                this.originalAdapter.encode(writer, Integer.valueOf(value[length]));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter writer, int i, int[] iArr) throws IOException {
        j.g(writer, "writer");
        if (iArr != null) {
            if (iArr.length == 0) {
                return;
            }
            super.encodeWithTag(writer, i, iArr);
        }
    }
}
