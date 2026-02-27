package com.squareup.wire.internal;

import W4.b;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FieldOrOneOfBinding<M, B> {
    private final InterfaceC1033d adapter$delegate = C1034e.b(new b(this, 14));

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter adapter_delegate$lambda$0(FieldOrOneOfBinding fieldOrOneOfBinding) {
        if (!fieldOrOneOfBinding.isMap()) {
            ProtoAdapter<?> protoAdapterWithLabel$wire_runtime = fieldOrOneOfBinding.getSingleAdapter().withLabel$wire_runtime(fieldOrOneOfBinding.getLabel());
            j.e(protoAdapterWithLabel$wire_runtime, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            return protoAdapterWithLabel$wire_runtime;
        }
        ProtoAdapter.Companion companion = ProtoAdapter.Companion;
        ProtoAdapter<?> keyAdapter = fieldOrOneOfBinding.getKeyAdapter();
        j.e(keyAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        ProtoAdapter<?> singleAdapter = fieldOrOneOfBinding.getSingleAdapter();
        j.e(singleAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        ProtoAdapter protoAdapterNewMapAdapter = companion.newMapAdapter(keyAdapter, singleAdapter);
        j.e(protoAdapterNewMapAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        return protoAdapterNewMapAdapter;
    }

    public static /* synthetic */ void getAdapter$annotations() {
    }

    private final boolean omitIdentity(Syntax syntax) {
        if (getWriteIdentityValues()) {
            return false;
        }
        if (getLabel() == WireField.Label.OMIT_IDENTITY) {
            return true;
        }
        if (getLabel().isRepeated() && syntax == Syntax.PROTO_3) {
            return true;
        }
        return isMap() && syntax == Syntax.PROTO_3;
    }

    public abstract Object get(M m);

    public final ProtoAdapter<Object> getAdapter() {
        return (ProtoAdapter) this.adapter$delegate.getValue();
    }

    public abstract String getDeclaredName();

    public abstract Object getFromBuilder(B b8);

    public abstract ProtoAdapter<?> getKeyAdapter();

    public abstract WireField.Label getLabel();

    public abstract String getName();

    public abstract boolean getRedacted();

    public abstract ProtoAdapter<?> getSingleAdapter();

    public abstract int getTag();

    public abstract String getWireFieldJsonName();

    public abstract boolean getWriteIdentityValues();

    public abstract boolean isMap();

    public abstract boolean isMessage();

    public final boolean omitFromJson(Syntax syntax, Object obj) {
        j.g(syntax, "syntax");
        if (obj == null) {
            return true;
        }
        return omitIdentity(syntax) && obj.equals(getAdapter().getIdentity());
    }

    public abstract void set(B b8, Object obj);

    public abstract void value(B b8, Object obj);
}
