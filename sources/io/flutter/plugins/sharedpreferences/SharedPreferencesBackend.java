package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.preference.PreferenceManager;
import cj.C1110A;
import dOYHB6.yFtIp6.svM7M6;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pg.j;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class SharedPreferencesBackend implements SharedPreferencesAsyncApi {
    private Context context;
    private SharedPreferencesListEncoder listEncoder;
    private j messenger;

    public SharedPreferencesBackend(j messenger, Context context, SharedPreferencesListEncoder listEncoder) {
        kotlin.jvm.internal.j.g(messenger, "messenger");
        kotlin.jvm.internal.j.g(context, "context");
        kotlin.jvm.internal.j.g(listEncoder, "listEncoder");
        this.messenger = messenger;
        this.context = context;
        this.listEncoder = listEncoder;
        try {
            SharedPreferencesAsyncApi.Companion.setUp(messenger, this, "shared_preferences");
        } catch (Exception e) {
            Log.e(SharedPreferencesPluginKt.TAG, "Received exception while setting up SharedPreferencesBackend", e);
        }
    }

    private final SharedPreferences createSharedPreferences(SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions) {
        if (sharedPreferencesPigeonOptions.getFileName() == null) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.context);
            kotlin.jvm.internal.j.d(defaultSharedPreferences);
            return defaultSharedPreferences;
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(sharedPreferencesPigeonOptions.getFileName(), 0);
        kotlin.jvm.internal.j.d(sharedPreferences);
        return sharedPreferences;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void clear(List<String> list, SharedPreferencesPigeonOptions options) {
        kotlin.jvm.internal.j.g(options, "options");
        SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
        SharedPreferences.Editor editorEdit = sharedPreferencesCreateSharedPreferences.edit();
        kotlin.jvm.internal.j.f(editorEdit, "edit(...)");
        Map<String, ?> all = sharedPreferencesCreateSharedPreferences.getAll();
        kotlin.jvm.internal.j.f(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (SharedPreferencesPluginKt.preferencesFilter(str, all.get(str), list != null ? C1110A.Z(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.j.f(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.j.f(next, "next(...)");
            editorEdit.remove((String) next);
        }
        editorEdit.apply();
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Map<String, Object> getAll(List<String> list, SharedPreferencesPigeonOptions options) {
        Object value;
        kotlin.jvm.internal.j.g(options, "options");
        Map<String, ?> all = createSharedPreferences(options).getAll();
        kotlin.jvm.internal.j.f(all, "getAll(...)");
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (SharedPreferencesPluginKt.preferencesFilter(entry.getKey(), entry.getValue(), list != null ? C1110A.Z(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object objTransformPref = SharedPreferencesPluginKt.transformPref(value, this.listEncoder);
                kotlin.jvm.internal.j.e(objTransformPref, "null cannot be cast to non-null type kotlin.Any");
                map.put(key, objTransformPref);
            }
        }
        return map;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Boolean getBool(String key, SharedPreferencesPigeonOptions options) {
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(options, "options");
        SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
        if (sharedPreferencesCreateSharedPreferences.contains(key)) {
            return Boolean.valueOf(sharedPreferencesCreateSharedPreferences.getBoolean(key, true));
        }
        return null;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Double getDouble(String key, SharedPreferencesPigeonOptions options) {
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(options, "options");
        SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
        if (!sharedPreferencesCreateSharedPreferences.contains(key)) {
            return null;
        }
        Object objTransformPref = SharedPreferencesPluginKt.transformPref(svM7M6.getString(sharedPreferencesCreateSharedPreferences, key, ""), this.listEncoder);
        kotlin.jvm.internal.j.e(objTransformPref, "null cannot be cast to non-null type kotlin.Double");
        return (Double) objTransformPref;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public Long getInt(String key, SharedPreferencesPigeonOptions options) {
        long j;
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(options, "options");
        SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
        if (!sharedPreferencesCreateSharedPreferences.contains(key)) {
            return null;
        }
        try {
            j = sharedPreferencesCreateSharedPreferences.getLong(key, 0L);
        } catch (ClassCastException unused) {
            j = sharedPreferencesCreateSharedPreferences.getInt(key, 0);
        }
        return Long.valueOf(j);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getKeys(List<String> list, SharedPreferencesPigeonOptions options) {
        kotlin.jvm.internal.j.g(options, "options");
        Map<String, ?> all = createSharedPreferences(options).getAll();
        kotlin.jvm.internal.j.f(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            kotlin.jvm.internal.j.f(key, "<get-key>(...)");
            if (SharedPreferencesPluginKt.preferencesFilter(key, entry.getValue(), list != null ? C1110A.Z(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return C1110A.V(linkedHashMap.keySet());
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public List<String> getPlatformEncodedStringList(String key, SharedPreferencesPigeonOptions options) {
        List list;
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(options, "options");
        SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
        if (!sharedPreferencesCreateSharedPreferences.contains(key)) {
            return null;
        }
        String string = svM7M6.getString(sharedPreferencesCreateSharedPreferences, key, "");
        kotlin.jvm.internal.j.d(string);
        if (!z.w(string, 2, SharedPreferencesPluginKt.LIST_PREFIX, false) || z.w(string, 2, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false) || (list = (List) SharedPreferencesPluginKt.transformPref(svM7M6.getString(sharedPreferencesCreateSharedPreferences, key, ""), this.listEncoder)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public String getString(String key, SharedPreferencesPigeonOptions options) {
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(options, "options");
        SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
        if (sharedPreferencesCreateSharedPreferences.contains(key)) {
            return svM7M6.getString(sharedPreferencesCreateSharedPreferences, key, "");
        }
        return null;
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public StringListResult getStringList(String key, SharedPreferencesPigeonOptions options) {
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(options, "options");
        SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(options);
        if (!sharedPreferencesCreateSharedPreferences.contains(key)) {
            return null;
        }
        String string = svM7M6.getString(sharedPreferencesCreateSharedPreferences, key, "");
        kotlin.jvm.internal.j.d(string);
        return z.w(string, 2, SharedPreferencesPluginKt.JSON_LIST_PREFIX, false) ? new StringListResult(string, StringListLookupResultType.JSON_ENCODED) : z.w(string, 2, SharedPreferencesPluginKt.LIST_PREFIX, false) ? new StringListResult(null, StringListLookupResultType.PLATFORM_ENCODED) : new StringListResult(null, StringListLookupResultType.UNEXPECTED_STRING);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setBool(String key, boolean z4, SharedPreferencesPigeonOptions options) {
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(options, "options");
        androidx.camera.core.impl.a.A(createSharedPreferences(options), key, z4);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDeprecatedStringList(String key, List<String> value, SharedPreferencesPigeonOptions options) {
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(value, "value");
        kotlin.jvm.internal.j.g(options, "options");
        androidx.media3.datasource.cache.c.u(createSharedPreferences(options), key, AbstractC1414e.h(SharedPreferencesPluginKt.LIST_PREFIX, this.listEncoder.encode(value)));
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setDouble(String key, double d10, SharedPreferencesPigeonOptions options) {
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(options, "options");
        createSharedPreferences(options).edit().putString(key, SharedPreferencesPluginKt.DOUBLE_PREFIX + d10).apply();
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setEncodedStringList(String key, String value, SharedPreferencesPigeonOptions options) {
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(value, "value");
        kotlin.jvm.internal.j.g(options, "options");
        androidx.media3.datasource.cache.c.u(createSharedPreferences(options), key, value);
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setInt(String key, long j, SharedPreferencesPigeonOptions options) {
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(options, "options");
        createSharedPreferences(options).edit().putLong(key, j).apply();
    }

    @Override // io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi
    public void setString(String key, String value, SharedPreferencesPigeonOptions options) {
        kotlin.jvm.internal.j.g(key, "key");
        kotlin.jvm.internal.j.g(value, "value");
        kotlin.jvm.internal.j.g(options, "options");
        androidx.media3.datasource.cache.c.u(createSharedPreferences(options), key, value);
    }

    public final void tearDown() {
        SharedPreferencesAsyncApi.Companion.setUp(this.messenger, null, "shared_preferences");
    }

    public /* synthetic */ SharedPreferencesBackend(j jVar, Context context, SharedPreferencesListEncoder sharedPreferencesListEncoder, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, context, (i & 4) != 0 ? new ListEncoder() : sharedPreferencesListEncoder);
    }
}
