package Ag;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.w;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f301b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f302d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f300a = i;
        this.f301b = obj;
        this.c = obj2;
        this.f302d = obj3;
        this.e = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = null;
        switch (this.f300a) {
            case 0:
                BufferedSource bufferedSource = (BufferedSource) this.c;
                CoroutineContext coroutineContext = (CoroutineContext) this.e;
                try {
                    ((w) this.f301b).f18193a = bufferedSource.read((ByteBuffer) obj);
                    return Unit.f18162a;
                } finally {
                    th = th;
                    try {
                        break;
                    } catch (Throwable th2) {
                    }
                }
            default:
                z2.h hVar = (z2.h) this.f301b;
                String str = (String) this.c;
                String str2 = (String) this.f302d;
                Preferences.Key key = (Preferences.Key) this.e;
                MutablePreferences mutablePreferences = (MutablePreferences) obj;
                hVar.getClass();
                Preferences.Key key2 = z2.h.f21363d;
                if (((String) r2.i.a(mutablePreferences, key2, "")).equals(str)) {
                    Preferences.Key keyE = hVar.e(mutablePreferences, str);
                    if (keyE != null && !keyE.getName().equals(str2)) {
                        synchronized (hVar) {
                            hVar.h(mutablePreferences, str);
                            HashSet hashSet = new HashSet((Collection) r2.i.a(mutablePreferences, key, new HashSet()));
                            hashSet.add(str);
                            mutablePreferences.set(key, hashSet);
                        }
                    }
                } else {
                    Preferences.Key key3 = z2.h.c;
                    long jLongValue = ((Long) r2.i.a(mutablePreferences, key3, 0L)).longValue();
                    if (jLongValue + 1 == 30) {
                        jLongValue = hVar.a(mutablePreferences);
                    }
                    HashSet hashSet2 = new HashSet((Collection) r2.i.a(mutablePreferences, key, new HashSet()));
                    hashSet2.add(str);
                    mutablePreferences.set(key, hashSet2);
                    mutablePreferences.set(key3, Long.valueOf(jLongValue + 1));
                    mutablePreferences.set(key2, str);
                }
                return null;
        }
    }
}
