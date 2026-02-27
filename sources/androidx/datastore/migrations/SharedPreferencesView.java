package androidx.datastore.migrations;

import android.content.SharedPreferences;
import cj.C1110A;
import cj.L;
import dOYHB6.yFtIp6.svM7M6;
import defpackage.AbstractC1414e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesView {
    private final Set<String> keySet;
    private final SharedPreferences prefs;

    public SharedPreferencesView(SharedPreferences prefs, Set<String> set) {
        j.g(prefs, "prefs");
        this.prefs = prefs;
        this.keySet = set;
    }

    private final String checkKey(String str) {
        Set<String> set = this.keySet;
        if (set == null || set.contains(str)) {
            return str;
        }
        throw new IllegalStateException(AbstractC1414e.h("Can't access key outside migration: ", str).toString());
    }

    public static /* synthetic */ String getString$default(SharedPreferencesView sharedPreferencesView, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return sharedPreferencesView.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Set getStringSet$default(SharedPreferencesView sharedPreferencesView, String str, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        return sharedPreferencesView.getStringSet(str, set);
    }

    public final boolean contains(String key) {
        j.g(key, "key");
        return this.prefs.contains(checkKey(key));
    }

    public final Map<String, Object> getAll() {
        Map<String, ?> all = this.prefs.getAll();
        j.f(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set<String> set = this.keySet;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(L.b(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = C1110A.Z((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }

    public final boolean getBoolean(String key, boolean z4) {
        j.g(key, "key");
        return this.prefs.getBoolean(checkKey(key), z4);
    }

    public final float getFloat(String key, float f) {
        j.g(key, "key");
        return this.prefs.getFloat(checkKey(key), f);
    }

    public final int getInt(String key, int i) {
        j.g(key, "key");
        return this.prefs.getInt(checkKey(key), i);
    }

    public final long getLong(String key, long j) {
        j.g(key, "key");
        return this.prefs.getLong(checkKey(key), j);
    }

    public final String getString(String key, String str) {
        j.g(key, "key");
        return svM7M6.getString(this.prefs, checkKey(key), str);
    }

    public final Set<String> getStringSet(String key, Set<String> set) {
        j.g(key, "key");
        Set<String> stringSet = this.prefs.getStringSet(checkKey(key), set);
        if (stringSet != null) {
            return C1110A.Y(stringSet);
        }
        return null;
    }
}
