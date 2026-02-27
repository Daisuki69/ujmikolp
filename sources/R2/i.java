package r2;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.io.Serializable;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {
    public static final Object a(MutablePreferences mutablePreferences, Preferences.Key key, Serializable serializable) {
        j.g(mutablePreferences, "<this>");
        j.g(key, "key");
        Object obj = mutablePreferences.get(key);
        return obj == null ? serializable : obj;
    }
}
