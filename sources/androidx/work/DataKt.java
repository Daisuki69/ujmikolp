package androidx.work;

import androidx.work.Data;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class DataKt {
    public static final <T> boolean hasKeyWithValueOfType(Data data, String key) {
        j.g(data, "<this>");
        j.g(key, "key");
        j.m();
        throw null;
    }

    public static final Data workDataOf(Pair<String, ? extends Object>... pairs) {
        j.g(pairs, "pairs");
        Data.Builder builder = new Data.Builder();
        for (Pair<String, ? extends Object> pair : pairs) {
            builder.put((String) pair.f18160a, pair.f18161b);
        }
        return builder.build();
    }
}
