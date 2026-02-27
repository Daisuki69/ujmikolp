package com.squareup.wire.internal;

import X5.f;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.OneOf;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import kotlin.jvm.internal.j;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes4.dex */
public final class OneOfBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> extends FieldOrOneOfBinding<M, B> {
    private final Field builderField;
    private final OneOf.Key<?> key;
    private final Field messageField;
    private final boolean writeIdentityValues;

    public OneOfBinding(Field messageField, Class<B> builderType, OneOf.Key<?> key, boolean z4) throws NoSuchFieldException {
        j.g(messageField, "messageField");
        j.g(builderType, "builderType");
        j.g(key, "key");
        this.messageField = messageField;
        this.key = key;
        this.writeIdentityValues = z4;
        Field declaredField = builderType.getDeclaredField(messageField.getName());
        j.f(declaredField, "getDeclaredField(...)");
        this.builderField = declaredField;
    }

    public static /* synthetic */ void getSingleAdapter$annotations() {
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getDeclaredName() {
        return this.key.getDeclaredName();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public /* bridge */ /* synthetic */ ProtoAdapter getKeyAdapter() {
        return (ProtoAdapter) m190getKeyAdapter();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public WireField.Label getLabel() {
        return WireField.Label.OPTIONAL;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getName() {
        return this.key.getDeclaredName();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getRedacted() {
        return this.key.getRedacted();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<Object> getSingleAdapter() {
        ProtoAdapter<?> adapter = this.key.getAdapter();
        j.e(adapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        return adapter;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public int getTag() {
        return this.key.getTag();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getWireFieldJsonName() {
        return this.key.getJsonName();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getWriteIdentityValues() {
        return this.writeIdentityValues;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMap() {
        return false;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMessage() {
        InterfaceC2488d type = getSingleAdapter().getType();
        return Message.class.isAssignableFrom(type != null ? f.o(type) : null);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object get(M message) {
        j.g(message, "message");
        OneOf oneOf = (OneOf) this.messageField.get(message);
        if (oneOf != null) {
            return oneOf.getOrNull(this.key);
        }
        return null;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object getFromBuilder(B builder) {
        j.g(builder, "builder");
        OneOf oneOf = (OneOf) this.builderField.get(builder);
        if (oneOf != null) {
            return oneOf.getOrNull(this.key);
        }
        return null;
    }

    /* JADX INFO: renamed from: getKeyAdapter, reason: collision with other method in class */
    public Void m190getKeyAdapter() {
        throw new IllegalStateException("not a map");
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void set(B builder, Object obj) throws IllegalAccessException {
        j.g(builder, "builder");
        Field field = this.builderField;
        OneOf.Key<?> key = this.key;
        j.e(key, "null cannot be cast to non-null type com.squareup.wire.OneOf.Key<kotlin.Any>");
        j.d(obj);
        field.set(builder, new OneOf(key, obj));
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void value(B builder, Object value) throws IllegalAccessException {
        j.g(builder, "builder");
        j.g(value, "value");
        set((Message.Builder) builder, value);
    }
}
