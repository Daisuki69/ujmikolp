package com.squareup.wire;

import We.s;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.EnumJsonFormatter;
import java.io.IOException;
import java.lang.Enum;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class EnumJsonAdapter<E extends Enum<E> & WireEnum> extends JsonAdapter<E> {
    private final EnumJsonFormatter<E> enumJsonFormatter;

    public EnumJsonAdapter(EnumJsonFormatter<E> enumJsonFormatter) {
        j.g(enumJsonFormatter, "enumJsonFormatter");
        this.enumJsonFormatter = enumJsonFormatter;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/squareup/moshi/JsonReader;)TE; */
    @Override // com.squareup.moshi.JsonAdapter
    public Enum fromJson(JsonReader input) throws IOException {
        j.g(input, "input");
        String strNextString = input.nextString();
        EnumJsonFormatter<E> enumJsonFormatter = this.enumJsonFormatter;
        j.d(strNextString);
        Enum r1 = (Enum) enumJsonFormatter.fromString(strNextString);
        if (r1 != null) {
            return r1;
        }
        StringBuilder sbW = s.w("Unexpected ", strNextString, " at path ");
        sbW.append(input.getPath());
        throw new JsonDataException(sbW.toString());
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/squareup/moshi/JsonWriter;TE;)V */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter out, Enum r32) throws IOException {
        j.g(out, "out");
        if (r32 == 0) {
            out.nullValue();
            return;
        }
        Object stringOrNumber = this.enumJsonFormatter.toStringOrNumber((WireEnum) r32);
        if (stringOrNumber instanceof Number) {
            out.value((Number) stringOrNumber);
        } else {
            out.value(stringOrNumber.toString());
        }
    }
}
