package androidx.datastore.preferences;

import Bj.E;
import Bj.H;
import Bj.U;
import Ij.d;
import Ij.e;
import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.Preferences;
import cj.C1112C;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import tj.InterfaceC2288a;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreDelegateKt {

    /* JADX INFO: renamed from: androidx.datastore.preferences.PreferenceDataStoreDelegateKt$preferencesDataStore$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function1<Context, List<? extends DataMigration<Preferences>>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<DataMigration<Preferences>> invoke(Context it) {
            j.g(it, "it");
            return C1112C.f9377a;
        }
    }

    public static final InterfaceC2288a preferencesDataStore(String name, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, Function1<? super Context, ? extends List<? extends DataMigration<Preferences>>> produceMigrations, E scope) {
        j.g(name, "name");
        j.g(produceMigrations, "produceMigrations");
        j.g(scope, "scope");
        return new PreferenceDataStoreSingletonDelegate(name, replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static InterfaceC2288a preferencesDataStore$default(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, E e, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            function1 = AnonymousClass1.INSTANCE;
        }
        if ((i & 8) != 0) {
            e eVar = U.f603a;
            e = H.c(d.f2362a.plus(H.e(1)));
        }
        return preferencesDataStore(str, replaceFileCorruptionHandler, function1, e);
    }
}
