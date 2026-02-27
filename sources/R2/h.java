package r2;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.PreferencesFactory;
import cj.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f19845d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f19847b;
    public final DataStore c;

    static {
        s sVar = new s(h.class);
        z.f18196a.getClass();
        f19845d = new KProperty[]{sVar};
    }

    public h(Context context, String name) {
        j.g(context, "context");
        j.g(name, "name");
        this.f19846a = name;
        this.f19847b = new ThreadLocal();
        final int i = 0;
        final int i4 = 1;
        this.c = (DataStore) PreferenceDataStoreDelegateKt.preferencesDataStore$default(name, new ReplaceFileCorruptionHandler(new Function1(this) { // from class: r2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f19832b;

            {
                this.f19832b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        CorruptionException ex = (CorruptionException) obj;
                        j.g(ex, "ex");
                        Log.w(z.a(h.class).c(), "CorruptionException in " + this.f19832b.f19846a + " DataStore running in process " + Process.myPid(), ex);
                        return PreferencesFactory.createEmpty();
                    default:
                        Context it = (Context) obj;
                        j.g(it, "it");
                        return r.c(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(it, this.f19832b.f19846a, null, 4, null));
                }
            }
        }), new Function1(this) { // from class: r2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f19832b;

            {
                this.f19832b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i4) {
                    case 0:
                        CorruptionException ex = (CorruptionException) obj;
                        j.g(ex, "ex");
                        Log.w(z.a(h.class).c(), "CorruptionException in " + this.f19832b.f19846a + " DataStore running in process " + Process.myPid(), ex);
                        return PreferencesFactory.createEmpty();
                    default:
                        Context it = (Context) obj;
                        j.g(it, "it");
                        return r.c(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(it, this.f19832b.f19846a, null, 4, null));
                }
            }
        }, null, 8, null).getValue(context, f19845d[0]);
    }

    public final void a(Function1 function1) {
    }
}
