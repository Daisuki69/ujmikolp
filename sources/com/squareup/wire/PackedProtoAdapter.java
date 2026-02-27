package com.squareup.wire;

import cj.C1112C;
import cj.r;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public final class PackedProtoAdapter<E> extends ProtoAdapter<List<? extends E>> {
    private final ProtoAdapter<E> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackedProtoAdapter(ProtoAdapter<E> originalAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, z.a(List.class), null, originalAdapter.getSyntax(), C1112C.f9377a, null, 32, null);
        j.g(originalAdapter, "originalAdapter");
        this.originalAdapter = originalAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public List<E> redact(List<? extends E> value) {
        j.g(value, "value");
        return C1112C.f9377a;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(List<? extends E> value) {
        j.g(value, "value");
        int size = value.size();
        int iEncodedSize = 0;
        for (int i = 0; i < size; i++) {
            iEncodedSize += this.originalAdapter.encodedSize(value.get(i));
        }
        return iEncodedSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i, List<? extends E> list) {
        if (list == 0 || list.isEmpty()) {
            return 0;
        }
        return super.encodedSizeWithTag(i, list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public List<E> decode(ProtoReader reader) {
        j.g(reader, "reader");
        return r.c(this.originalAdapter.decode(reader));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, List<? extends E> value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        int size = value.size();
        for (int i = 0; i < size; i++) {
            this.originalAdapter.encode(writer, value.get(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter writer, int i, List<? extends E> list) throws IOException {
        j.g(writer, "writer");
        if (list == 0 || list.isEmpty()) {
            return;
        }
        super.encodeWithTag(writer, i, list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public List<E> decode(ProtoReader32 reader) {
        j.g(reader, "reader");
        return r.c(this.originalAdapter.decode(reader));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, List<? extends E> value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        int size = value.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                this.originalAdapter.encode(writer, value.get(size));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter writer, int i, List<? extends E> list) throws IOException {
        j.g(writer, "writer");
        if (list == 0 || list.isEmpty()) {
            return;
        }
        super.encodeWithTag(writer, i, list);
    }
}
