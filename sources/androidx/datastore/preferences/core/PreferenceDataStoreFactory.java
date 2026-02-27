package androidx.datastore.preferences.core;

import Bj.E;
import Bj.H;
import Bj.U;
import Ij.d;
import Ij.e;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.FileStorage;
import androidx.datastore.core.Storage;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import cj.C1112C;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreFactory {
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.PreferenceDataStoreFactory$createWithPath$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<File> {
        final /* synthetic */ Function0<Path> $produceFile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Path> function0) {
            super(0);
            this.$produceFile = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            return ((Path) this.$produceFile.invoke()).toFile();
        }
    }

    private PreferenceDataStoreFactory() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, E e, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 4) != 0) {
            list = C1112C.f9377a;
        }
        if ((i & 8) != 0) {
            e = H.c(Actual_jvmAndroidKt.ioDispatcher().plus(H.e(1)));
        }
        return preferenceDataStoreFactory.create((Storage<Preferences>) storage, (ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DataStore createWithPath$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, E e, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 2) != 0) {
            list = C1112C.f9377a;
        }
        if ((i & 4) != 0) {
            e = H.c(Actual_jvmAndroidKt.ioDispatcher().plus(H.e(1)));
        }
        return preferenceDataStoreFactory.createWithPath(replaceFileCorruptionHandler, list, e, function0);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage) {
        j.g(storage, "storage");
        return create$default(this, storage, (ReplaceFileCorruptionHandler) null, (List) null, (E) null, 14, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, Function0<Path> produceFile) {
        j.g(migrations, "migrations");
        j.g(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, migrations, null, produceFile, 4, null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler) {
        j.g(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, (List) null, (E) null, 12, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, Function0<Path> produceFile) {
        j.g(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, null, null, produceFile, 6, null);
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations) {
        j.g(storage, "storage");
        j.g(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, (E) null, 8, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(Function0<Path> produceFile) {
        j.g(produceFile, "produceFile");
        return createWithPath$default(this, null, null, null, produceFile, 7, null);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, Function0<? extends File> produceFile) {
        j.g(migrations, "migrations");
        j.g(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, migrations, (E) null, produceFile, 4, (Object) null);
    }

    public final DataStore<Preferences> createWithPath(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, E scope, Function0<Path> produceFile) {
        j.g(migrations, "migrations");
        j.g(scope, "scope");
        j.g(produceFile, "produceFile");
        return create(replaceFileCorruptionHandler, migrations, scope, new AnonymousClass1(produceFile));
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, Function0<? extends File> produceFile) {
        j.g(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, (List) null, (E) null, produceFile, 6, (Object) null);
    }

    public final DataStore<Preferences> create(Function0<? extends File> produceFile) {
        j.g(produceFile, "produceFile");
        return create$default(this, (ReplaceFileCorruptionHandler) null, (List) null, (E) null, produceFile, 7, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, E e, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 2) != 0) {
            list = C1112C.f9377a;
        }
        if ((i & 4) != 0) {
            e eVar = U.f603a;
            e = H.c(d.f2362a.plus(H.e(1)));
        }
        return preferenceDataStoreFactory.create((ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, e, (Function0<? extends File>) function0);
    }

    public final DataStore<Preferences> create(ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, E scope, Function0<? extends File> produceFile) {
        j.g(migrations, "migrations");
        j.g(scope, "scope");
        j.g(produceFile, "produceFile");
        return new PreferenceDataStore(create(new FileStorage(PreferencesFileSerializer.INSTANCE, null, new PreferenceDataStoreFactory$create$delegate$1(produceFile), 2, null), replaceFileCorruptionHandler, migrations, scope));
    }

    public final DataStore<Preferences> create(Storage<Preferences> storage, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, List<? extends DataMigration<Preferences>> migrations, E scope) {
        j.g(storage, "storage");
        j.g(migrations, "migrations");
        j.g(scope, "scope");
        return new PreferenceDataStore(DataStoreFactory.INSTANCE.create(storage, replaceFileCorruptionHandler, migrations, scope));
    }
}
