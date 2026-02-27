package com.squareup.wire;

import X5.f;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumAdapter<E extends WireEnum> extends ProtoAdapter<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(InterfaceC2488d type, Syntax syntax, E e) {
        super(FieldEncoding.VARINT, type, (String) null, syntax, e);
        j.g(type, "type");
        j.g(syntax, "syntax");
    }

    public abstract E fromValue(int i);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(InterfaceC2488d type) {
        this(type, Syntax.PROTO_2, Internal.getIdentityOrNull(f.n(type)));
        j.g(type, "type");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(E value) {
        j.g(value, "value");
        return ProtoWriter.Companion.varint32Size$wire_runtime(value.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public E redact(E value) {
        j.g(value, "value");
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(InterfaceC2488d type, Syntax syntax) {
        this(type, syntax, Internal.getIdentityOrNull(f.n(type)));
        j.g(type, "type");
        j.g(syntax, "syntax");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public E decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        int varint32 = reader.readVarint32();
        E e = (E) fromValue(varint32);
        if (e != null) {
            return e;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(varint32, getType());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, E value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeVarint32(value.getValue());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(Class<E> type) {
        this(z.a(type), Syntax.PROTO_2, Internal.getIdentityOrNull(type));
        j.g(type, "type");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, E value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeVarint32(value.getValue());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(Class<E> type, Syntax syntax) {
        this(z.a(type), syntax, Internal.getIdentityOrNull(type));
        j.g(type, "type");
        j.g(syntax, "syntax");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public E decode(ProtoReader32 reader) throws IOException {
        j.g(reader, "reader");
        int varint32 = reader.readVarint32();
        E e = (E) fromValue(varint32);
        if (e != null) {
            return e;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(varint32, getType());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(Class<E> type, Syntax syntax, E e) {
        this(z.a(type), syntax, e);
        j.g(type, "type");
        j.g(syntax, "syntax");
    }
}
