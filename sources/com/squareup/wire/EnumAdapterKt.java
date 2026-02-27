package com.squareup.wire;

import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class EnumAdapterKt {
    public static final <E extends WireEnum> E commonDecode(EnumAdapter<E> enumAdapter, ProtoReader reader, Function1<? super Integer, ? extends E> fromValue) throws IOException {
        j.g(enumAdapter, "<this>");
        j.g(reader, "reader");
        j.g(fromValue, "fromValue");
        int varint32 = reader.readVarint32();
        E e = (E) fromValue.invoke(Integer.valueOf(varint32));
        if (e != null) {
            return e;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(varint32, enumAdapter.getType());
    }

    public static final <E extends WireEnum> void commonEncode(ProtoWriter writer, E value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeVarint32(value.getValue());
    }

    public static final <E extends WireEnum> int commonEncodedSize(E value) {
        j.g(value, "value");
        return ProtoWriter.Companion.varint32Size$wire_runtime(value.getValue());
    }

    public static final <E extends WireEnum> E commonRedact(E value) {
        j.g(value, "value");
        throw new UnsupportedOperationException();
    }

    public static final <E extends WireEnum> void commonEncode(ReverseProtoWriter writer, E value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeVarint32(value.getValue());
    }

    public static final <E extends WireEnum> E commonDecode(EnumAdapter<E> enumAdapter, ProtoReader32 reader, Function1<? super Integer, ? extends E> fromValue) throws IOException {
        j.g(enumAdapter, "<this>");
        j.g(reader, "reader");
        j.g(fromValue, "fromValue");
        int varint32 = reader.readVarint32();
        E e = (E) fromValue.invoke(Integer.valueOf(varint32));
        if (e != null) {
            return e;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(varint32, enumAdapter.getType());
    }
}
