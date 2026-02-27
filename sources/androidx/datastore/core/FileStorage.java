package androidx.datastore.core;

import androidx.annotation.GuardedBy;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes.dex */
public final class FileStorage<T> implements Storage<T> {
    public static final Companion Companion = new Companion(null);

    @GuardedBy("activeFilesLock")
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final Function1<File, InterProcessCoordinator> coordinatorProducer;
    private final Function0<File> produceFile;
    private final Serializer<T> serializer;

    /* JADX INFO: renamed from: androidx.datastore.core.FileStorage$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function1<File, InterProcessCoordinator> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterProcessCoordinator invoke(File it) {
            j.g(it, "it");
            return InterProcessCoordinator_jvmKt.createSingleProcessCoordinator(it);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<String> getActiveFiles$datastore_core_release() {
            return FileStorage.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core_release() {
            return FileStorage.activeFilesLock;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.FileStorage$createConnection$2, reason: invalid class name */
    public static final class AnonymousClass2 extends k implements Function0<Unit> {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(File file) {
            super(0);
            this.$file = file;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m83invoke();
            return Unit.f18162a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m83invoke() {
            Companion companion = FileStorage.Companion;
            Object activeFilesLock$datastore_core_release = companion.getActiveFilesLock$datastore_core_release();
            File file = this.$file;
            synchronized (activeFilesLock$datastore_core_release) {
                companion.getActiveFiles$datastore_core_release().remove(file.getAbsolutePath());
                Unit unit = Unit.f18162a;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FileStorage(Serializer<T> serializer, Function1<? super File, ? extends InterProcessCoordinator> coordinatorProducer, Function0<? extends File> produceFile) {
        j.g(serializer, "serializer");
        j.g(coordinatorProducer, "coordinatorProducer");
        j.g(produceFile, "produceFile");
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.produceFile = produceFile;
    }

    @Override // androidx.datastore.core.Storage
    public StorageConnection<T> createConnection() throws IOException {
        File canonicalFile = ((File) this.produceFile.invoke()).getCanonicalFile();
        synchronized (activeFilesLock) {
            String path = canonicalFile.getAbsolutePath();
            Set<String> set = activeFiles;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            j.f(path, "path");
            set.add(path);
        }
        return new FileStorageConnection(canonicalFile, this.serializer, (InterProcessCoordinator) this.coordinatorProducer.invoke(canonicalFile), new AnonymousClass2(canonicalFile));
    }

    public /* synthetic */ FileStorage(Serializer serializer, Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(serializer, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function1, function0);
    }
}
