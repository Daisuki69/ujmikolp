package com.squareup.wire.internal;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class Internal__InternalJvmKt {
    public static final <E extends WireEnum> E getIdentityOrNull(Class<E> cls) {
        E e;
        j.g(cls, "<this>");
        E[] enumConstants = cls.getEnumConstants();
        j.f(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                e = null;
                break;
            }
            e = enumConstants[i];
            E e7 = e;
            j.e(e7, "null cannot be cast to non-null type com.squareup.wire.WireEnum");
            if (e7.getValue() == 0) {
                break;
            }
            i++;
        }
        return e;
    }

    public static final <T> void redactElements(List<T> list, ProtoAdapter<T> adapter) {
        j.g(list, "list");
        j.g(adapter, "adapter");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.set(i, adapter.redact(list.get(i)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void redactElements(Map<?, T> map, ProtoAdapter<T> adapter) {
        j.g(map, "map");
        j.g(adapter, "adapter");
        for (Map.Entry entry : map.entrySet()) {
            entry.setValue(adapter.redact(entry.getValue()));
        }
    }
}
