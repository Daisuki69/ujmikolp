package com.squareup.wire.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class _PlatformKt {
    public static final String camelCase(String string, boolean z4) {
        j.g(string, "string");
        StringBuilder sb2 = new StringBuilder(string.length());
        int iCharCount = 0;
        while (iCharCount < string.length()) {
            int iCodePointAt = string.codePointAt(iCharCount);
            iCharCount += Character.charCount(iCodePointAt);
            if (iCodePointAt == 95) {
                z4 = true;
            } else {
                if (z4 && 97 <= iCodePointAt && iCodePointAt < 123) {
                    iCodePointAt -= 32;
                }
                sb2.appendCodePoint(iCodePointAt);
                z4 = false;
            }
        }
        String string2 = sb2.toString();
        j.f(string2, "toString(...)");
        return string2;
    }

    public static /* synthetic */ String camelCase$default(String str, boolean z4, int i, Object obj) {
        if ((i & 2) != 0) {
            z4 = false;
        }
        return camelCase(str, z4);
    }

    public static final <T> List<T> toUnmodifiableList(List<T> list) {
        j.g(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(list);
        j.f(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> toUnmodifiableMap(Map<K, V> map) {
        j.g(map, "<this>");
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        j.f(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }
}
