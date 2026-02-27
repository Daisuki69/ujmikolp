package androidx.datastore.core;

import Bj.E;
import Bj.H;
import Bj.U;
import Ij.d;
import Ij.e;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import cj.C1112C;
import cj.r;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreFactory {
    public static final DataStoreFactory INSTANCE = new DataStoreFactory();

    private DataStoreFactory() {
    }

    public static DataStore create$default(DataStoreFactory dataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, E e, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = replaceFileCorruptionHandler;
        if ((i & 4) != 0) {
            list = C1112C.f9377a;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            e eVar = U.f603a;
            e = H.c(d.f2362a.plus(H.e(1)));
        }
        return dataStoreFactory.create(serializer, replaceFileCorruptionHandler2, list2, e, function0);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, Function0<? extends File> produceFile) {
        j.g(serializer, "serializer");
        j.g(migrations, "migrations");
        j.g(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, migrations, null, produceFile, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, Function0<? extends File> produceFile) {
        j.g(serializer, "serializer");
        j.g(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, produceFile, 12, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, Function0<? extends File> produceFile) {
        j.g(serializer, "serializer");
        j.g(produceFile, "produceFile");
        return create$default(this, serializer, null, null, null, produceFile, 14, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage) {
        j.g(storage, "storage");
        return create$default(this, storage, null, null, null, 14, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        j.g(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, null, null, 12, null);
    }

    public static DataStore create$default(DataStoreFactory dataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, E e, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            list = C1112C.f9377a;
        }
        if ((i & 8) != 0) {
            e = H.c(Actual_jvmKt.ioDispatcher().plus(H.e(1)));
        }
        return dataStoreFactory.create(storage, replaceFileCorruptionHandler, list, e);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations) {
        j.g(storage, "storage");
        j.g(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, null, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, E scope, Function0<? extends File> produceFile) {
        j.g(serializer, "serializer");
        j.g(migrations, "migrations");
        j.g(scope, "scope");
        j.g(produceFile, "produceFile");
        return create(new FileStorage(serializer, null, produceFile, 2, null), replaceFileCorruptionHandler, migrations, scope);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, E scope) {
        j.g(storage, "storage");
        j.g(migrations, "migrations");
        j.g(scope, "scope");
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage, r.c(DataMigrationInitializer.Companion.getInitializer(migrations)), replaceFileCorruptionHandler, scope);
    }
}
