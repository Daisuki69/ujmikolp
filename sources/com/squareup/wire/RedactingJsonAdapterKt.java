package com.squareup.wire;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RedactingJsonAdapterKt {
    public static final <T> JsonAdapter<T> redacting(final JsonAdapter<T> jsonAdapter) {
        j.g(jsonAdapter, "<this>");
        return new JsonAdapter<T>() { // from class: com.squareup.wire.RedactingJsonAdapterKt.redacting.1
            @Override // com.squareup.moshi.JsonAdapter
            public T fromJson(JsonReader reader) {
                j.g(reader, "reader");
                return jsonAdapter.fromJson(reader);
            }

            @Override // com.squareup.moshi.JsonAdapter
            public void toJson(JsonWriter writer, T t5) {
                j.g(writer, "writer");
                RedactedTag redactedTag = (RedactedTag) writer.tag(RedactedTag.class);
                if (redactedTag == null) {
                    redactedTag = new RedactedTag();
                    writer.setTag(RedactedTag.class, redactedTag);
                }
                boolean enabled = redactedTag.getEnabled();
                redactedTag.setEnabled(true);
                try {
                    jsonAdapter.toJson(writer, t5);
                } finally {
                    redactedTag.setEnabled(enabled);
                }
            }
        };
    }
}
