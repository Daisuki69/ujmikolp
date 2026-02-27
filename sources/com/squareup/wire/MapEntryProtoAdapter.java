package com.squareup.wire;

import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
final class MapEntryProtoAdapter<K, V> extends ProtoAdapter<Map.Entry<? extends K, ? extends V>> {
    private final ProtoAdapter<K> keyAdapter;
    private final ProtoAdapter<V> valueAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntryProtoAdapter(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, z.a(Map.Entry.class), null, valueAdapter.getSyntax(), null, null, 48, null);
        j.g(keyAdapter, "keyAdapter");
        j.g(valueAdapter, "valueAdapter");
        this.keyAdapter = keyAdapter;
        this.valueAdapter = valueAdapter;
    }

    public final ProtoAdapter<K> getKeyAdapter$wire_runtime() {
        return this.keyAdapter;
    }

    public final ProtoAdapter<V> getValueAdapter$wire_runtime() {
        return this.valueAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map.Entry<K, V> decode(ProtoReader reader) {
        j.g(reader, "reader");
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(Map.Entry<? extends K, ? extends V> value) {
        j.g(value, "value");
        return this.valueAdapter.encodedSizeWithTag(2, value.getValue()) + this.keyAdapter.encodedSizeWithTag(1, value.getKey());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map.Entry<K, V> redact(Map.Entry<? extends K, ? extends V> value) {
        j.g(value, "value");
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, Map.Entry<? extends K, ? extends V> value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        this.keyAdapter.encodeWithTag(writer, 1, value.getKey());
        this.valueAdapter.encodeWithTag(writer, 2, value.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, Map.Entry<? extends K, ? extends V> value) throws IOException {
        j.g(writer, "writer");
        j.g(value, "value");
        this.valueAdapter.encodeWithTag(writer, 2, value.getValue());
        this.keyAdapter.encodeWithTag(writer, 1, value.getKey());
    }
}
