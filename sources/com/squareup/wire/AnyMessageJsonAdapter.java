package com.squareup.wire;

import We.s;
import X5.f;
import a.AbstractC0617a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.wire.AnyMessage;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.j;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes4.dex */
public final class AnyMessageJsonAdapter extends JsonAdapter<AnyMessage> {
    private final Moshi moshi;
    private final Map<String, ProtoAdapter<?>> typeUrlToAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    public AnyMessageJsonAdapter(Moshi moshi, Map<String, ? extends ProtoAdapter<?>> typeUrlToAdapter) {
        j.g(moshi, "moshi");
        j.g(typeUrlToAdapter, "typeUrlToAdapter");
        this.moshi = moshi;
        this.typeUrlToAdapter = typeUrlToAdapter;
    }

    private final String readStringNamed(JsonReader jsonReader, String str) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (j.b(jsonReader.nextName(), str)) {
                return jsonReader.nextString();
            }
            jsonReader.skipValue();
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public AnyMessage fromJson(JsonReader reader) throws IOException {
        j.g(reader, "reader");
        if (reader.peek() == JsonReader.Token.NULL) {
            reader.nextNull();
            return null;
        }
        JsonReader jsonReaderPeekJson = reader.peekJson();
        try {
            j.d(jsonReaderPeekJson);
            String stringNamed = readStringNamed(jsonReaderPeekJson, "@type");
            AbstractC0617a.p(jsonReaderPeekJson, null);
            if (stringNamed == null) {
                throw new JsonDataException("expected @type in " + reader.getPath());
            }
            ProtoAdapter<?> protoAdapter = this.typeUrlToAdapter.get(stringNamed);
            if (protoAdapter == null) {
                StringBuilder sbW = s.w("Cannot resolve type: ", stringNamed, " in ");
                sbW.append(reader.getPath());
                throw new JsonDataException(sbW.toString());
            }
            Moshi moshi = this.moshi;
            InterfaceC2488d type = protoAdapter.getType();
            j.d(type);
            JsonAdapter jsonAdapterAdapter = moshi.adapter(f.n(type));
            j.e(jsonAdapterAdapter, "null cannot be cast to non-null type com.squareup.moshi.JsonAdapter<com.squareup.wire.Message<*, *>>");
            Message<?, ?> message = (Message) jsonAdapterAdapter.fromJson(reader);
            AnyMessage.Companion companion = AnyMessage.Companion;
            j.d(message);
            return companion.pack(message);
        } finally {
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, AnyMessage anyMessage) throws IOException {
        j.g(writer, "writer");
        if (anyMessage == null) {
            writer.nullValue();
            return;
        }
        writer.beginObject();
        writer.name("@type");
        writer.value(anyMessage.getTypeUrl());
        ProtoAdapter<?> protoAdapter = this.typeUrlToAdapter.get(anyMessage.getTypeUrl());
        if (protoAdapter == null) {
            throw new JsonDataException("Cannot find type for url: " + anyMessage.getTypeUrl() + " in " + writer.getPath());
        }
        Moshi moshi = this.moshi;
        InterfaceC2488d type = protoAdapter.getType();
        j.d(type);
        JsonAdapter jsonAdapterAdapter = moshi.adapter(f.n(type));
        j.e(jsonAdapterAdapter, "null cannot be cast to non-null type com.squareup.moshi.JsonAdapter<com.squareup.wire.Message<*, *>>");
        int iBeginFlatten = writer.beginFlatten();
        Object objUnpack = anyMessage.unpack(protoAdapter);
        j.e(objUnpack, "null cannot be cast to non-null type com.squareup.wire.Message<*, *>");
        jsonAdapterAdapter.toJson(writer, (Message) objUnpack);
        writer.endFlatten(iBeginFlatten);
        writer.endObject();
    }
}
