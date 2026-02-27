package com.squareup.wire;

import cj.C1129o;
import cj.L;
import cj.M;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public final class MapProtoAdapter<K, V> extends ProtoAdapter<Map<K, ? extends V>> {
    private final MapEntryProtoAdapter<K, V> entryAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapProtoAdapter(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, z.a(Map.class), null, valueAdapter.getSyntax(), M.e(), null, 32, null);
        j.g(keyAdapter, "keyAdapter");
        j.g(valueAdapter, "valueAdapter");
        this.entryAdapter = new MapEntryProtoAdapter<>(keyAdapter, valueAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(Map<K, ? extends V> value) {
        j.g(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int i, Map<K, ? extends V> map) {
        int iEncodedSizeWithTag = 0;
        if (map == null) {
            return 0;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            iEncodedSizeWithTag += this.entryAdapter.encodedSizeWithTag(i, it.next());
        }
        return iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map<K, V> redact(Map<K, ? extends V> value) {
        j.g(value, "value");
        return M.e();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map<K, V> decode(ProtoReader reader) throws IOException {
        j.g(reader, "reader");
        K identity = this.entryAdapter.getKeyAdapter$wire_runtime().getIdentity();
        V identity2 = this.entryAdapter.getValueAdapter$wire_runtime().getIdentity();
        long jBeginMessage = reader.beginMessage();
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                break;
            }
            if (iNextTag == 1) {
                identity = this.entryAdapter.getKeyAdapter$wire_runtime().decode(reader);
            } else if (iNextTag == 2) {
                identity2 = this.entryAdapter.getValueAdapter$wire_runtime().decode(reader);
            }
        }
        reader.endMessageAndGetUnknownFields(jBeginMessage);
        if (identity == null) {
            throw new IllegalStateException("Map entry with null key");
        }
        if (identity2 != null) {
            return L.c(new Pair(identity, identity2));
        }
        throw new IllegalStateException("Map entry with null value");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, Map<K, ? extends V> value) {
        j.g(writer, "writer");
        j.g(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter writer, int i, Map<K, ? extends V> map) throws IOException {
        j.g(writer, "writer");
        if (map == null) {
            return;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.entryAdapter.encodeWithTag(writer, i, it.next());
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, Map<K, ? extends V> value) {
        j.g(writer, "writer");
        j.g(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter writer, int i, Map<K, ? extends V> map) throws IOException {
        j.g(writer, "writer");
        if (map == null) {
            return;
        }
        Map.Entry[] entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
        C1129o.x(entryArr);
        for (Map.Entry entry : entryArr) {
            this.entryAdapter.encodeWithTag(writer, i, entry);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Map<K, V> decode(ProtoReader32 reader) throws IOException {
        j.g(reader, "reader");
        K identity = this.entryAdapter.getKeyAdapter$wire_runtime().getIdentity();
        V identity2 = this.entryAdapter.getValueAdapter$wire_runtime().getIdentity();
        int iBeginMessage = reader.beginMessage();
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                break;
            }
            if (iNextTag == 1) {
                identity = this.entryAdapter.getKeyAdapter$wire_runtime().decode(reader);
            } else if (iNextTag == 2) {
                identity2 = this.entryAdapter.getValueAdapter$wire_runtime().decode(reader);
            }
        }
        reader.endMessageAndGetUnknownFields(iBeginMessage);
        if (identity == null) {
            throw new IllegalStateException("Map entry with null key");
        }
        if (identity2 != null) {
            return L.c(new Pair(identity, identity2));
        }
        throw new IllegalStateException("Map entry with null value");
    }
}
