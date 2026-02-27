package com.squareup.moshi;

import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.j;
import xj.o;
import xj.y;

/* JADX INFO: loaded from: classes4.dex */
public final class _MoshiKotlinExtensionsKt {
    public static final <T> JsonAdapter<T> adapter(Moshi moshi, o ktype) {
        j.g(moshi, "<this>");
        j.g(ktype, "ktype");
        JsonAdapter<T> jsonAdapterAdapter = moshi.adapter(y.b(ktype, false));
        if ((jsonAdapterAdapter instanceof NullSafeJsonAdapter) || (jsonAdapterAdapter instanceof NonNullJsonAdapter)) {
            return jsonAdapterAdapter;
        }
        if ((((F) ktype).c & 1) != 0) {
            JsonAdapter<T> jsonAdapterNullSafe = jsonAdapterAdapter.nullSafe();
            j.f(jsonAdapterNullSafe, "{\n    adapter.nullSafe()\n  }");
            return jsonAdapterNullSafe;
        }
        JsonAdapter<T> jsonAdapterNonNull = jsonAdapterAdapter.nonNull();
        j.f(jsonAdapterNonNull, "{\n    adapter.nonNull()\n  }");
        return jsonAdapterNonNull;
    }

    public static final <T> Moshi.Builder addAdapter(Moshi.Builder builder, JsonAdapter<T> adapter) {
        j.g(builder, "<this>");
        j.g(adapter, "adapter");
        j.m();
        throw null;
    }

    public static final <T> JsonAdapter<T> adapter(Moshi moshi) {
        j.g(moshi, "<this>");
        j.m();
        throw null;
    }
}
