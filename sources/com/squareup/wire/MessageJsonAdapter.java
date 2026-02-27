package com.squareup.wire;

import Bj.C0149k;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.internal.RuntimeMessageAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MessageJsonAdapter<M extends Message<M, B>, B extends Message.Builder<M, B>> extends JsonAdapter<M> {
    private final List<JsonAdapter<Object>> jsonAdapters;
    private final List<String> jsonAlternateNames;
    private final List<String> jsonNames;
    private final RuntimeMessageAdapter<M, B> messageAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<List<String>> redactedFieldsAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageJsonAdapter(RuntimeMessageAdapter<M, B> messageAdapter, List<? extends JsonAdapter<Object>> jsonAdapters, JsonAdapter<List<String>> redactedFieldsAdapter) {
        j.g(messageAdapter, "messageAdapter");
        j.g(jsonAdapters, "jsonAdapters");
        j.g(redactedFieldsAdapter, "redactedFieldsAdapter");
        this.messageAdapter = messageAdapter;
        this.jsonAdapters = jsonAdapters;
        this.redactedFieldsAdapter = redactedFieldsAdapter;
        List<String> jsonNames = messageAdapter.getJsonNames();
        this.jsonNames = jsonNames;
        this.jsonAlternateNames = messageAdapter.getJsonAlternateNames();
        ArrayList arrayList = new ArrayList();
        int size = jsonNames.size();
        for (int i = 0; i < size; i++) {
            String str = this.jsonNames.get(i);
            arrayList.add(str);
            String str2 = this.jsonAlternateNames.get(i);
            if (str2 == null) {
                str2 = str + (char) 0;
            }
            arrayList.add(str2);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        JsonReader.Options optionsOf = JsonReader.Options.of((String[]) Arrays.copyOf(strArr, strArr.length));
        j.f(optionsOf, "run(...)");
        this.options = optionsOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toJson$lambda$1(JsonWriter jsonWriter, String name, Object obj, JsonAdapter jsonAdapter) throws IOException {
        j.g(name, "name");
        j.g(jsonAdapter, "jsonAdapter");
        jsonWriter.name(name);
        jsonAdapter.toJson(jsonWriter, obj);
        return Unit.f18162a;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public M fromJson(JsonReader input) throws IOException {
        j.g(input, "input");
        B bNewBuilder = this.messageAdapter.newBuilder();
        input.beginObject();
        while (input.hasNext()) {
            int iSelectName = input.selectName(this.options);
            if (iSelectName == -1) {
                input.skipName();
                input.skipValue();
            } else {
                int i = iSelectName / 2;
                Object objFromJson = this.jsonAdapters.get(i).fromJson(input);
                if (objFromJson != null) {
                    this.messageAdapter.getFieldBindingsArray()[i].set(bNewBuilder, objFromJson);
                }
            }
        }
        input.endObject();
        return (M) bNewBuilder.build();
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter out, M m) throws IOException {
        j.g(out, "out");
        RedactedTag redactedTag = (RedactedTag) out.tag(RedactedTag.class);
        JsonAdapter<List<String>> jsonAdapter = j.b(redactedTag != null ? Boolean.valueOf(redactedTag.getEnabled()) : null, Boolean.TRUE) ? this.redactedFieldsAdapter : null;
        out.beginObject();
        this.messageAdapter.writeAllFields(m, this.jsonAdapters, jsonAdapter, new C0149k(out, 3));
        out.endObject();
    }
}
