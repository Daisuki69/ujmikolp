package androidx.datastore.core.okio;

import androidx.datastore.core.WriteScope;
import com.paymaya.domain.model.MfaTencentErrorResult;
import gj.InterfaceC1526a;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;
import kotlin.jvm.internal.j;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes.dex */
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioWriteScope$writeData$1, reason: invalid class name */
    @InterfaceC1611e(c = "androidx.datastore.core.okio.OkioWriteScope", f = "OkioStorage.kt", l = {MfaTencentErrorResult.TENCENT_ERROR_INIT_SDK}, m = "writeData")
    public static final class AnonymousClass1 extends AbstractC1609c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OkioWriteScope<T> okioWriteScope, InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
            this.this$0 = okioWriteScope;
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(FileSystem fileSystem, Path path, OkioSerializer<T> serializer) {
        super(fileSystem, path, serializer);
        j.g(fileSystem, "fileSystem");
        j.g(path, "path");
        j.g(serializer, "serializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #6 {all -> 0x008e, blocks: (B:42:0x0095, B:48:0x00a2, B:37:0x008a, B:34:0x0085), top: B:66:0x0085, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2 A[Catch: all -> 0x008e, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x008e, blocks: (B:42:0x0095, B:48:0x00a2, B:37:0x008a, B:34:0x0085), top: B:66:0x0085, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, okio.FileHandle] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [okio.FileHandle] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // androidx.datastore.core.WriteScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeData(T r9, gj.InterfaceC1526a<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.datastore.core.okio.OkioWriteScope.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.datastore.core.okio.OkioWriteScope$writeData$1 r0 = (androidx.datastore.core.okio.OkioWriteScope.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.okio.OkioWriteScope$writeData$1 r0 = new androidx.datastore.core.okio.OkioWriteScope$writeData$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r9 = r0.L$2
            java.io.Closeable r9 = (java.io.Closeable) r9
            java.lang.Object r1 = r0.L$1
            okio.FileHandle r1 = (okio.FileHandle) r1
            java.lang.Object r0 = r0.L$0
            java.io.Closeable r0 = (java.io.Closeable) r0
            bj.AbstractC1039j.b(r10)     // Catch: java.lang.Throwable -> L34
            goto L70
        L34:
            r10 = move-exception
            goto L83
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            bj.AbstractC1039j.b(r10)
            r8.checkClose()
            okio.FileSystem r10 = r8.getFileSystem()
            okio.Path r2 = r8.getPath()
            okio.FileHandle r10 = r10.openReadWrite(r2)
            r5 = 0
            okio.Sink r2 = okio.FileHandle.sink$default(r10, r5, r3, r4)     // Catch: java.lang.Throwable -> La3
            okio.BufferedSink r2 = okio.Okio.buffer(r2)     // Catch: java.lang.Throwable -> La3
            androidx.datastore.core.okio.OkioSerializer r5 = r8.getSerializer()     // Catch: java.lang.Throwable -> L7f
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L7f
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L7f
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L7f
            r0.label = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r9 = r5.writeTo(r9, r2, r0)     // Catch: java.lang.Throwable -> L7f
            if (r9 != r1) goto L6d
            return r1
        L6d:
            r0 = r10
            r1 = r0
            r9 = r2
        L70:
            r1.flush()     // Catch: java.lang.Throwable -> L34
            kotlin.Unit r10 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L7d
            r9.close()     // Catch: java.lang.Throwable -> L7b
            goto L7d
        L7b:
            r9 = move-exception
            goto L93
        L7d:
            r9 = r4
            goto L93
        L7f:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r2
        L83:
            if (r9 == 0) goto L91
            r9.close()     // Catch: java.lang.Throwable -> L89
            goto L91
        L89:
            r9 = move-exception
            bj.C1030a.a(r10, r9)     // Catch: java.lang.Throwable -> L8e
            goto L91
        L8e:
            r9 = move-exception
            r10 = r0
            goto La4
        L91:
            r9 = r10
            r10 = r4
        L93:
            if (r9 != 0) goto La2
            kotlin.jvm.internal.j.d(r10)     // Catch: java.lang.Throwable -> L8e
            kotlin.Unit r9 = kotlin.Unit.f18162a     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto Lb1
            r0.close()     // Catch: java.lang.Throwable -> La0
            goto Lb1
        La0:
            r4 = move-exception
            goto Lb1
        La2:
            throw r9     // Catch: java.lang.Throwable -> L8e
        La3:
            r9 = move-exception
        La4:
            if (r10 == 0) goto Lae
            r10.close()     // Catch: java.lang.Throwable -> Laa
            goto Lae
        Laa:
            r10 = move-exception
            bj.C1030a.a(r9, r10)
        Lae:
            r7 = r4
            r4 = r9
            r9 = r7
        Lb1:
            if (r4 != 0) goto Lb9
            kotlin.jvm.internal.j.d(r9)
            kotlin.Unit r9 = kotlin.Unit.f18162a
            return r9
        Lb9:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioWriteScope.writeData(java.lang.Object, gj.a):java.lang.Object");
    }
}
