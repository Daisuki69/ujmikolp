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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes.dex */
public final class MultiProcessDataStoreFactory {
    public static final MultiProcessDataStoreFactory INSTANCE = new MultiProcessDataStoreFactory();

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessDataStoreFactory$create$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function1<File, InterProcessCoordinator> {
        final /* synthetic */ E $scope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(E e) {
            super(1);
            this.$scope = e;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterProcessCoordinator invoke(File it) {
            j.g(it, "it");
            return new MultiProcessCoordinator(this.$scope.getCoroutineContext(), it);
        }
    }

    private MultiProcessDataStoreFactory() {
    }

    public static DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, E e, Function0 function0, int i, Object obj) {
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
        return multiProcessDataStoreFactory.create(serializer, replaceFileCorruptionHandler2, list2, e, function0);
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

    public static DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, E e, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            list = C1112C.f9377a;
        }
        if ((i & 8) != 0) {
            e eVar = U.f603a;
            e = H.c(d.f2362a.plus(H.e(1)));
        }
        return multiProcessDataStoreFactory.create(storage, replaceFileCorruptionHandler, list, e);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations) {
        j.g(storage, "storage");
        j.g(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, null, 8, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, E scope) {
        j.g(storage, "storage");
        j.g(migrations, "migrations");
        j.g(scope, "scope");
        List listC = r.c(DataMigrationInitializer.Companion.getInitializer(migrations));
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage, listC, replaceFileCorruptionHandler, scope);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, E scope, Function0<? extends File> produceFile) {
        j.g(serializer, "serializer");
        j.g(migrations, "migrations");
        j.g(scope, "scope");
        j.g(produceFile, "produceFile");
        FileStorage fileStorage = new FileStorage(serializer, new AnonymousClass1(scope), produceFile);
        List listC = r.c(DataMigrationInitializer.Companion.getInitializer(migrations));
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(fileStorage, listC, replaceFileCorruptionHandler, scope);
    }
}
