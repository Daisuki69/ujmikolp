package androidx.datastore.core;

import androidx.datastore.core.SharedCounter;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes.dex */
public final class MultiProcessCoordinator$lazySharedCounter$1 extends k implements Function0<SharedCounter> {
    final /* synthetic */ MultiProcessCoordinator this$0;

    /* JADX INFO: renamed from: androidx.datastore.core.MultiProcessCoordinator$lazySharedCounter$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function0<File> {
        final /* synthetic */ MultiProcessCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MultiProcessCoordinator multiProcessCoordinator) {
            super(0);
            this.this$0 = multiProcessCoordinator;
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() throws IOException {
            MultiProcessCoordinator multiProcessCoordinator = this.this$0;
            File fileFileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.VERSION_SUFFIX);
            this.this$0.createIfNotExists(fileFileWithSuffix);
            return fileFileWithSuffix;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$lazySharedCounter$1(MultiProcessCoordinator multiProcessCoordinator) {
        super(0);
        this.this$0 = multiProcessCoordinator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedCounter invoke() {
        SharedCounter.Factory factory = SharedCounter.Factory;
        factory.loadLib();
        return factory.create$datastore_core_release(new AnonymousClass1(this.this$0));
    }
}
