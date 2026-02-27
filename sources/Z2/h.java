package z2;

import Ag.n;
import Bj.H;
import android.content.Context;
import android.os.Build;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import defpackage.AbstractC1414e;
import io.flutter.plugins.webviewflutter.C1641g;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.j;
import o5.C1963b;
import r2.C2183d;
import r2.C2184e;
import r2.i;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Preferences.Key f21362b = PreferencesKeys.longKey("fire-global");
    public static final Preferences.Key c = PreferencesKeys.longKey("fire-count");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Preferences.Key f21363d = PreferencesKeys.stringKey("last-used-date");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2.h f21364a;

    public h(Context context, String str) {
        this.f21364a = new r2.h(context, AbstractC1414e.h("FirebaseHeartBeat", str));
    }

    public final synchronized long a(MutablePreferences mutablePreferences) {
        long j;
        try {
            long jLongValue = ((Long) i.a(mutablePreferences, c, 0L)).longValue();
            String name = "";
            Set hashSet = new HashSet();
            String str = null;
            for (Map.Entry<Preferences.Key<?>, Object> entry : mutablePreferences.asMap().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str2 : set) {
                        if (str == null || str.compareTo(str2) > 0) {
                            name = entry.getKey().getName();
                            hashSet = set;
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str);
            mutablePreferences.set(PreferencesKeys.stringSetKey(name), hashSet2);
            j = jLongValue - 1;
            mutablePreferences.set(c, Long.valueOf(j));
        } catch (Throwable th2) {
            throw th2;
        }
        return j;
    }

    public final synchronized void b() {
        this.f21364a.a(new com.squareup.wire.internal.a(this, 28));
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strD = d(System.currentTimeMillis());
            r2.h hVar = this.f21364a;
            hVar.getClass();
            for (Map.Entry entry : ((Map) H.x(kotlin.coroutines.g.f18170a, new C2183d(hVar, null))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strD);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C2551a(((Preferences.Key) entry.getKey()).getName(), new ArrayList(hashSet)));
                    }
                }
            }
            l(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized String d(long j) {
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
        }
        Instant instant = new Date(j).toInstant();
        ZoneOffset unused = ZoneOffset.UTC;
        LocalDateTime localDateTime = instant.atOffset(ZoneOffset.UTC).toLocalDateTime();
        DateTimeFormatter unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        return localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized Preferences.Key e(MutablePreferences mutablePreferences, String str) {
        for (Map.Entry<Preferences.Key<?>, Object> entry : mutablePreferences.asMap().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return PreferencesKeys.stringSetKey(entry.getKey().getName());
                    }
                }
            }
        }
        return null;
    }

    public final synchronized boolean f(long j, long j6) {
        return d(j).equals(d(j6));
    }

    public final synchronized void g() {
        this.f21364a.a(new C1963b(8, this, d(System.currentTimeMillis())));
    }

    public final synchronized void h(MutablePreferences mutablePreferences, String str) {
        try {
            Preferences.Key keyE = e(mutablePreferences, str);
            if (keyE == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) i.a(mutablePreferences, keyE, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                mutablePreferences.remove(keyE);
            } else {
                mutablePreferences.set(keyE, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean i(long j) {
        return j(f21362b, j);
    }

    public final synchronized boolean j(Preferences.Key key, long j) {
        r2.h hVar = this.f21364a;
        hVar.getClass();
        j.g(key, "key");
        C2184e c2184e = new C2184e(hVar, key, null);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f18170a;
        if (f(((Long) H.x(gVar, c2184e)).longValue(), j)) {
            return false;
        }
        r2.h hVar2 = this.f21364a;
        Long lValueOf = Long.valueOf(j);
        hVar2.getClass();
        return true;
    }

    public final synchronized void k(long j, String str) throws Throwable {
        try {
            try {
                String strD = d(j);
                Preferences.Key<Set<String>> keyStringSetKey = PreferencesKeys.stringSetKey(str);
                this.f21364a.a(new n(this, strD, str, keyStringSetKey, 1));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void l(long j) {
        this.f21364a.a(new C1641g(j, 1));
    }
}
