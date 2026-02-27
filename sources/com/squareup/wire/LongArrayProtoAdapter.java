package com.squareup.wire;

import java.io.IOException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public final class LongArrayProtoAdapter extends ProtoAdapter<long[]> {
    private final ProtoAdapter<Long> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongArrayProtoAdapter(ProtoAdapter<Long> originalAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, z.a(long[].class), null, originalAdapter.getSyntax(), new long[0], null, 32, null);
        j.g(originalAdapter, "originalAdapter");
        this.originalAdapter = originalAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public long[] redact(long[] value) {
        j.g(value, "value");
        return new long[0];
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(long[] value) {
        j.g(value, "value");
        int iEncodedSize = 0;
        for (long j : value) {
            iEncodedSize += this.originalAdapter.encodedSize(Long.valueOf(j));
        }
        return iEncodedSize;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i, long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return 0;
        }
        return super.encodedSizeWithTag(i, jArr);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public long[] decode(ProtoReader reader) {
        j.g(reader, "reader");
        return new long[]{this.originalAdapter.decode(reader).longValue()};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, long[] value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        for (long j : value) {
            this.originalAdapter.encode(writer, Long.valueOf(j));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter writer, int i, long[] jArr) throws IOException {
        j.g(writer, "writer");
        if (jArr != null) {
            if (jArr.length == 0) {
                return;
            }
            super.encodeWithTag(writer, i, jArr);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public long[] decode(ProtoReader32 reader) {
        j.g(reader, "reader");
        return new long[]{this.originalAdapter.decode(reader).longValue()};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, long[] value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        int length = value.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            } else {
                this.originalAdapter.encode(writer, Long.valueOf(value[length]));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter writer, int i, long[] jArr) throws IOException {
        j.g(writer, "writer");
        if (jArr != null) {
            if (jArr.length == 0) {
                return;
            }
            super.encodeWithTag(writer, i, jArr);
        }
    }
}
