package com.squareup.wire.internal;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.Syntax;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import okio.ByteString;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes4.dex */
final class RuntimeMessageBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> implements MessageBinding<M, B> {
    private final Class<B> builderType;
    private final Function0<B> createBuilder;
    private final Map<Integer, FieldOrOneOfBinding<M, B>> fields;
    private final InterfaceC2488d messageType;
    private final Syntax syntax;
    private final String typeUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public RuntimeMessageBinding(InterfaceC2488d messageType, Class<B> builderType, Function0<? extends B> createBuilder, Map<Integer, ? extends FieldOrOneOfBinding<M, B>> fields, String str, Syntax syntax) {
        j.g(messageType, "messageType");
        j.g(builderType, "builderType");
        j.g(createBuilder, "createBuilder");
        j.g(fields, "fields");
        j.g(syntax, "syntax");
        this.messageType = messageType;
        this.builderType = builderType;
        this.createBuilder = createBuilder;
        this.fields = fields;
        this.typeUrl = str;
        this.syntax = syntax;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public Map<Integer, FieldOrOneOfBinding<M, B>> getFields() {
        return this.fields;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public InterfaceC2488d getMessageType() {
        return this.messageType;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public Syntax getSyntax() {
        return this.syntax;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public String getTypeUrl() {
        return this.typeUrl;
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public void addUnknownField(B builder, int i, FieldEncoding fieldEncoding, Object obj) throws IOException {
        j.g(builder, "builder");
        j.g(fieldEncoding, "fieldEncoding");
        builder.addUnknownField(i, fieldEncoding, obj);
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public M build(B builder) {
        j.g(builder, "builder");
        return (M) builder.build();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public void clearUnknownFields(B builder) throws EOFException {
        j.g(builder, "builder");
        builder.clearUnknownFields();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public int getCachedSerializedSize(M message) {
        j.g(message, "message");
        return message.getCachedSerializedSize$wire_runtime();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public B newBuilder() {
        return (B) this.createBuilder.invoke();
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public void setCachedSerializedSize(M message, int i) {
        j.g(message, "message");
        message.setCachedSerializedSize$wire_runtime(i);
    }

    @Override // com.squareup.wire.internal.MessageBinding
    public ByteString unknownFields(M message) {
        j.g(message, "message");
        return message.unknownFields();
    }
}
