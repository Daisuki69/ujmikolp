package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;
import tj.InterfaceC2288a;

/* JADX INFO: loaded from: classes4.dex */
public final class SharedPreferencesPluginKt {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    public static final String DOUBLE_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu";
    public static final String JSON_LIST_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!";
    public static final String LIST_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";
    public static final String SHARED_PREFERENCES_NAME = "FlutterSharedPreferences";
    public static final String TAG = "SharedPreferencesPlugin";
    private static final InterfaceC2288a sharedPreferencesDataStore$delegate;

    static {
        r rVar = new r(SharedPreferencesPluginKt.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        z.f18196a.getClass();
        $$delegatedProperties = new KProperty[]{rVar};
        sharedPreferencesDataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default(SHARED_PREFERENCES_NAME, null, null, null, 14, null);
    }

    public static final DataStore<Preferences> getSharedPreferencesDataStore(Context context) {
        j.g(context, "<this>");
        return (DataStore) sharedPreferencesDataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }

    public static final boolean preferencesFilter(String key, Object obj, Set<String> set) {
        j.g(key, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(key);
    }

    public static final Object transformPref(Object obj, SharedPreferencesListEncoder listEncoder) {
        j.g(listEncoder, "listEncoder");
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (!zj.z.w(str, 2, LIST_PREFIX, false)) {
            if (!zj.z.w(str, 2, DOUBLE_PREFIX, false)) {
                return obj;
            }
            String strSubstring = str.substring(40);
            j.f(strSubstring, "substring(...)");
            return Double.valueOf(Double.parseDouble(strSubstring));
        }
        if (zj.z.w(str, 2, JSON_LIST_PREFIX, false)) {
            return obj;
        }
        String strSubstring2 = str.substring(40);
        j.f(strSubstring2, "substring(...)");
        List<String> listDecode = listEncoder.decode(strSubstring2);
        j.d(listDecode);
        return listDecode;
    }
}
