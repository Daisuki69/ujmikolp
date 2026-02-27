package com.squareup.wire;

import com.squareup.wire.OneOf.Key;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class OneOf<K extends Key<T>, T> {
    private final K key;
    private final T value;

    public OneOf(K key, T t5) {
        j.g(key, "key");
        this.key = key;
        this.value = t5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneOf copy$default(OneOf oneOf, Key key, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            key = oneOf.key;
        }
        if ((i & 2) != 0) {
            obj = oneOf.value;
        }
        return oneOf.copy(key, obj);
    }

    public final K component1() {
        return this.key;
    }

    public final T component2() {
        return this.value;
    }

    public final OneOf<K, T> copy(K key, T t5) {
        j.g(key, "key");
        return new OneOf<>(key, t5);
    }

    public final void encodeWithTag(ProtoWriter writer) throws IOException {
        j.g(writer, "writer");
        this.key.getAdapter().encodeWithTag(writer, this.key.getTag(), this.value);
    }

    public final int encodedSizeWithTag() {
        return this.key.getAdapter().encodedSizeWithTag(this.key.getTag(), this.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneOf)) {
            return false;
        }
        OneOf oneOf = (OneOf) obj;
        return j.b(this.key, oneOf.key) && j.b(this.value, oneOf.value);
    }

    public final K getKey() {
        return this.key;
    }

    public final <X> X getOrNull(Key<X> key) {
        j.g(key, "key");
        if (j.b(this.key, key)) {
            return this.value;
        }
        return null;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        T t5 = this.value;
        return iHashCode + (t5 == null ? 0 : t5.hashCode());
    }

    public String toString() {
        ProtoAdapter<T> adapter = this.key.getAdapter();
        return this.key.getDeclaredName() + '=' + ((j.b(adapter, ProtoAdapter.STRING) || j.b(adapter, ProtoAdapter.STRING_VALUE)) ? Internal.sanitize(String.valueOf(this.value)) : String.valueOf(this.value));
    }

    public final void encodeWithTag(ReverseProtoWriter writer) throws IOException {
        j.g(writer, "writer");
        this.key.getAdapter().encodeWithTag(writer, this.key.getTag(), this.value);
    }

    public static abstract class Key<T> {
        private final ProtoAdapter<T> adapter;
        private final String declaredName;
        private final String jsonName;
        private final boolean redacted;
        private final int tag;

        public Key(int i, ProtoAdapter<T> adapter, String declaredName, boolean z4, String jsonName) {
            j.g(adapter, "adapter");
            j.g(declaredName, "declaredName");
            j.g(jsonName, "jsonName");
            this.tag = i;
            this.adapter = adapter;
            this.declaredName = declaredName;
            this.redacted = z4;
            this.jsonName = jsonName;
        }

        public final ProtoAdapter<T> getAdapter() {
            return this.adapter;
        }

        public final String getDeclaredName() {
            return this.declaredName;
        }

        public final String getJsonName() {
            return this.jsonName;
        }

        public final boolean getRedacted() {
            return this.redacted;
        }

        public final int getTag() {
            return this.tag;
        }

        public /* synthetic */ Key(int i, ProtoAdapter protoAdapter, String str, boolean z4, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, protoAdapter, str, (i4 & 8) != 0 ? false : z4, (i4 & 16) != 0 ? "" : str2);
        }
    }
}
