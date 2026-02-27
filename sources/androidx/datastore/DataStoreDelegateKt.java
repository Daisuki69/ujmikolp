package androidx.datastore;

import Bj.E;
import Bj.H;
import Bj.U;
import Ij.d;
import Ij.e;
import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import cj.C1112C;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import tj.InterfaceC2288a;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreDelegateKt {

    /* JADX INFO: renamed from: androidx.datastore.DataStoreDelegateKt$dataStore$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final List invoke(Context it) {
            j.g(it, "it");
            return C1112C.f9377a;
        }
    }

    public static final <T> InterfaceC2288a dataStore(String fileName, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, Function1<? super Context, ? extends List<? extends DataMigration<T>>> produceMigrations, E scope) {
        j.g(fileName, "fileName");
        j.g(serializer, "serializer");
        j.g(produceMigrations, "produceMigrations");
        j.g(scope, "scope");
        return new DataStoreSingletonDelegate(fileName, new OkioSerializerWrapper(serializer), replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static InterfaceC2288a dataStore$default(String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, E e, int i, Object obj) {
        if ((i & 4) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 8) != 0) {
            function1 = AnonymousClass1.INSTANCE;
        }
        if ((i & 16) != 0) {
            e eVar = U.f603a;
            e = H.c(d.f2362a.plus(H.e(1)));
        }
        return dataStore(str, serializer, replaceFileCorruptionHandler, function1, e);
    }
}
