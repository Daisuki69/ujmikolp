package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.Storage;
import androidx.datastore.core.StorageConnection;
import bj.C1034e;
import bj.InterfaceC1033d;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
public final class OkioStorage<T> implements Storage<T> {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Synchronizer activeFilesLock = new Synchronizer();
    private final InterfaceC1033d canonicalPath$delegate;
    private final Function2<Path, FileSystem, InterProcessCoordinator> coordinatorProducer;
    private final FileSystem fileSystem;
    private final Function0<Path> producePath;
    private final OkioSerializer<T> serializer;

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioStorage$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function2<Path, FileSystem, InterProcessCoordinator> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final InterProcessCoordinator invoke(Path path, FileSystem fileSystem) {
            j.g(path, "path");
            j.g(fileSystem, "<anonymous parameter 1>");
            return OkioStorageKt.createSingleProcessCoordinator(path);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<String> getActiveFiles$datastore_core_okio() {
            return OkioStorage.activeFiles;
        }

        public final Synchronizer getActiveFilesLock() {
            return OkioStorage.activeFilesLock;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioStorage$createConnection$2, reason: invalid class name */
    public static final class AnonymousClass2 extends k implements Function0<Unit> {
        final /* synthetic */ OkioStorage<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OkioStorage<T> okioStorage) {
            super(0);
            this.this$0 = okioStorage;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m85invoke();
            return Unit.f18162a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m85invoke() {
            Companion companion = OkioStorage.Companion;
            Synchronizer activeFilesLock = companion.getActiveFilesLock();
            OkioStorage<T> okioStorage = this.this$0;
            synchronized (activeFilesLock) {
                companion.getActiveFiles$datastore_core_okio().remove(okioStorage.getCanonicalPath().toString());
                Unit unit = Unit.f18162a;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OkioStorage(FileSystem fileSystem, OkioSerializer<T> serializer, Function2<? super Path, ? super FileSystem, ? extends InterProcessCoordinator> coordinatorProducer, Function0<Path> producePath) {
        j.g(fileSystem, "fileSystem");
        j.g(serializer, "serializer");
        j.g(coordinatorProducer, "coordinatorProducer");
        j.g(producePath, "producePath");
        this.fileSystem = fileSystem;
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.producePath = producePath;
        this.canonicalPath$delegate = C1034e.b(new OkioStorage$canonicalPath$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Path getCanonicalPath() {
        return (Path) this.canonicalPath$delegate.getValue();
    }

    @Override // androidx.datastore.core.Storage
    public StorageConnection<T> createConnection() {
        String string = getCanonicalPath().toString();
        synchronized (activeFilesLock) {
            Set<String> set = activeFiles;
            if (set.contains(string)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + string + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(string);
        }
        return new OkioStorageConnection(this.fileSystem, getCanonicalPath(), this.serializer, (InterProcessCoordinator) this.coordinatorProducer.invoke(getCanonicalPath(), this.fileSystem), new AnonymousClass2(this));
    }

    public /* synthetic */ OkioStorage(FileSystem fileSystem, OkioSerializer okioSerializer, Function2 function2, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fileSystem, okioSerializer, (i & 4) != 0 ? AnonymousClass1.INSTANCE : function2, function0);
    }
}
