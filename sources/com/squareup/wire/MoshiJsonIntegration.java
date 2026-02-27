package com.squareup.wire;

import We.s;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.wire.internal.JsonFormatter;
import com.squareup.wire.internal.JsonIntegration;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MoshiJsonIntegration extends JsonIntegration<Moshi, JsonAdapter<Object>> {
    public static final MoshiJsonIntegration INSTANCE = new MoshiJsonIntegration();

    public static final class FormatterJsonAdapter<T> extends JsonAdapter<T> {
        private final JsonFormatter<T> formatter;

        public FormatterJsonAdapter(JsonFormatter<T> formatter) {
            j.g(formatter, "formatter");
            this.formatter = formatter;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public T fromJson(JsonReader reader) throws IOException {
            j.g(reader, "reader");
            String strNextString = reader.nextString();
            try {
                JsonFormatter<T> jsonFormatter = this.formatter;
                j.d(strNextString);
                return jsonFormatter.fromString(strNextString);
            } catch (RuntimeException unused) {
                StringBuilder sbW = s.w("decode failed: ", strNextString, " at path ");
                sbW.append(reader.getPath());
                throw new JsonDataException(sbW.toString());
            }
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter writer, T t5) throws IOException {
            j.g(writer, "writer");
            JsonFormatter<T> jsonFormatter = this.formatter;
            j.d(t5);
            Object stringOrNumber = jsonFormatter.toStringOrNumber(t5);
            if (stringOrNumber instanceof Number) {
                writer.value((Number) stringOrNumber);
            } else {
                j.e(stringOrNumber, "null cannot be cast to non-null type kotlin.String");
                writer.value((String) stringOrNumber);
            }
        }
    }

    public static final class ListJsonAdapter<T> extends JsonAdapter<List<? extends T>> {
        private final JsonAdapter<T> single;

        public ListJsonAdapter(JsonAdapter<T> single) {
            j.g(single, "single");
            this.single = single;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public List<T> fromJson(JsonReader reader) throws IOException {
            j.g(reader, "reader");
            ArrayList arrayList = new ArrayList();
            reader.beginArray();
            while (reader.hasNext()) {
                arrayList.add(this.single.fromJson(reader));
            }
            reader.endArray();
            return arrayList;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter writer, List<? extends T> list) throws IOException {
            j.g(writer, "writer");
            writer.beginArray();
            j.d(list);
            Iterator<? extends T> it = list.iterator();
            while (it.hasNext()) {
                this.single.toJson(writer, it.next());
            }
            writer.endArray();
        }
    }

    public static final class MapJsonAdapter<K, V> extends JsonAdapter<Map<K, ? extends V>> {
        private final JsonFormatter<K> keyFormatter;
        private final JsonAdapter<V> valueAdapter;

        public MapJsonAdapter(JsonFormatter<K> keyFormatter, JsonAdapter<V> valueAdapter) {
            j.g(keyFormatter, "keyFormatter");
            j.g(valueAdapter, "valueAdapter");
            this.keyFormatter = keyFormatter;
            this.valueAdapter = valueAdapter;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Map<K, V> fromJson(JsonReader reader) throws IOException {
            j.g(reader, "reader");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            reader.beginObject();
            while (reader.hasNext()) {
                String strNextName = reader.nextName();
                JsonFormatter<K> jsonFormatter = this.keyFormatter;
                j.d(strNextName);
                K kFromString = jsonFormatter.fromString(strNextName);
                j.e(kFromString, "null cannot be cast to non-null type K of com.squareup.wire.MoshiJsonIntegration.MapJsonAdapter");
                V vFromJson = this.valueAdapter.fromJson(reader);
                j.d(vFromJson);
                linkedHashMap.put(kFromString, vFromJson);
            }
            reader.endObject();
            return linkedHashMap;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public void toJson(JsonWriter writer, Map<K, ? extends V> map) throws IOException {
            j.g(writer, "writer");
            writer.beginObject();
            j.d(map);
            for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
                K key = entry.getKey();
                V value = entry.getValue();
                writer.name(this.keyFormatter.toStringOrNumber(key).toString());
                this.valueAdapter.toJson(writer, value);
            }
            writer.endObject();
        }
    }

    private MoshiJsonIntegration() {
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public /* bridge */ /* synthetic */ JsonAdapter<Object> formatterAdapter(JsonFormatter jsonFormatter) {
        return formatterAdapter((JsonFormatter<?>) jsonFormatter);
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public /* bridge */ /* synthetic */ JsonAdapter<Object> mapAdapter(Moshi moshi, JsonFormatter jsonFormatter, JsonAdapter<Object> jsonAdapter) {
        return mapAdapter2(moshi, (JsonFormatter<?>) jsonFormatter, jsonAdapter);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.internal.JsonIntegration
    public JsonAdapter<Object> formatterAdapter(JsonFormatter<?> jsonStringAdapter) {
        j.g(jsonStringAdapter, "jsonStringAdapter");
        JsonAdapter<T> jsonAdapterNullSafe = new FormatterJsonAdapter(jsonStringAdapter).nullSafe();
        j.e(jsonAdapterNullSafe, "null cannot be cast to non-null type com.squareup.moshi.JsonAdapter<kotlin.Any?>");
        return jsonAdapterNullSafe;
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public JsonAdapter<Object> frameworkAdapter(Moshi framework, Type type) {
        j.g(framework, "framework");
        j.g(type, "type");
        JsonAdapter<Object> jsonAdapterNullSafe = framework.adapter(type).nullSafe();
        j.f(jsonAdapterNullSafe, "nullSafe(...)");
        return jsonAdapterNullSafe;
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public JsonAdapter<Object> listAdapter(JsonAdapter<Object> elementAdapter) {
        j.g(elementAdapter, "elementAdapter");
        JsonAdapter<List<? extends T>> jsonAdapterNullSafe = new ListJsonAdapter(elementAdapter).nullSafe();
        j.e(jsonAdapterNullSafe, "null cannot be cast to non-null type com.squareup.moshi.JsonAdapter<kotlin.Any?>");
        return jsonAdapterNullSafe;
    }

    /* JADX INFO: renamed from: mapAdapter, reason: avoid collision after fix types in other method */
    public JsonAdapter<Object> mapAdapter2(Moshi framework, JsonFormatter<?> keyFormatter, JsonAdapter<Object> valueAdapter) {
        j.g(framework, "framework");
        j.g(keyFormatter, "keyFormatter");
        j.g(valueAdapter, "valueAdapter");
        JsonAdapter<Map<K, ? extends V>> jsonAdapterNullSafe = new MapJsonAdapter(keyFormatter, valueAdapter).nullSafe();
        j.e(jsonAdapterNullSafe, "null cannot be cast to non-null type com.squareup.moshi.JsonAdapter<kotlin.Any?>");
        return jsonAdapterNullSafe;
    }

    @Override // com.squareup.wire.internal.JsonIntegration
    public JsonAdapter<Object> structAdapter(Moshi framework) {
        j.g(framework, "framework");
        JsonAdapter<Object> jsonAdapterNullSafe = framework.adapter(Object.class).serializeNulls().nullSafe();
        j.f(jsonAdapterNullSafe, "nullSafe(...)");
        return jsonAdapterNullSafe;
    }
}
