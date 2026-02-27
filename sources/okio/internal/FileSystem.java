package okio.internal;

import androidx.media3.extractor.ts.TsExtractor;
import bj.AbstractC1039j;
import cj.C1124j;
import cj.C1128n;
import d4.AbstractC1331a;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1609c;
import ij.AbstractC1615i;
import ij.InterfaceC1611e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import kotlin.sequences.Sequence;
import okio.FileMetadata;
import okio.Path;
import yj.k;
import yj.l;

/* JADX INFO: renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class FileSystem {

    /* JADX INFO: renamed from: okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
    @InterfaceC1611e(c = "okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, TsExtractor.TS_STREAM_TYPE_E_AC3, 145}, m = "collectRecursively")
    public static final class AnonymousClass1 extends AbstractC1609c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1611e(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend")
    public static final class C19961 extends AbstractC1615i implements Function2<k, InterfaceC1526a<? super Unit>, Object> {
        final /* synthetic */ Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19961(Path path, okio.FileSystem fileSystem, boolean z4, InterfaceC1526a<? super C19961> interfaceC1526a) {
            super(2, interfaceC1526a);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z4;
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            C19961 c19961 = new C19961(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, interfaceC1526a);
            c19961.L$0 = obj;
            return c19961;
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            k kVar;
            C1124j c1124j;
            Iterator<Path> it;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.label;
            if (i == 0) {
                AbstractC1039j.b(obj);
                k kVar2 = (k) this.L$0;
                C1124j c1124j2 = new C1124j();
                c1124j2.addLast(this.$dir);
                kVar = kVar2;
                c1124j = c1124j2;
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                C1124j c1124j3 = (C1124j) this.L$1;
                kVar = (k) this.L$0;
                AbstractC1039j.b(obj);
                c1124j = c1124j3;
            }
            while (it.hasNext()) {
                Path next = it.next();
                okio.FileSystem fileSystem = this.$this_commonListRecursively;
                boolean z4 = this.$followSymlinks;
                this.L$0 = kVar;
                this.L$1 = c1124j;
                this.L$2 = it;
                this.label = 1;
                if (FileSystem.collectRecursively(kVar, fileSystem, c1124j, next, z4, false, this) == enumC1578a) {
                    return enumC1578a;
                }
            }
            return Unit.f18162a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(k kVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
            return ((C19961) create(kVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v7, types: [cj.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collectRecursively(yj.k r16, okio.FileSystem r17, cj.C1124j<okio.Path> r18, okio.Path r19, boolean r20, boolean r21, gj.InterfaceC1526a<? super kotlin.Unit> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.FileSystem.collectRecursively(yj.k, okio.FileSystem, cj.j, okio.Path, boolean, boolean, gj.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #4 {all -> 0x003a, blocks: (B:3:0x0013, B:22:0x0040, B:28:0x004b, B:17:0x0036, B:14:0x0031, B:5:0x001c), top: B:46:0x0013, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x003a, blocks: (B:3:0x0013, B:22:0x0040, B:28:0x004b, B:17:0x0036, B:14:0x0031, B:5:0x001c), top: B:46:0x0013, inners: #1, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void commonCopy(okio.FileSystem r2, okio.Path r3, okio.Path r4) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.j.g(r2, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.j.g(r3, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.j.g(r4, r0)
            okio.Source r3 = r2.source(r3)
            okio.Sink r2 = r2.sink(r4)     // Catch: java.lang.Throwable -> L3a
            okio.BufferedSink r2 = okio.Okio.buffer(r2)     // Catch: java.lang.Throwable -> L3a
            r4 = 0
            long r0 = r2.writeAll(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L2c
            r2.close()     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r2 = move-exception
            goto L3e
        L2c:
            r2 = r4
            goto L3e
        L2e:
            r0 = move-exception
            if (r2 == 0) goto L3c
            r2.close()     // Catch: java.lang.Throwable -> L35
            goto L3c
        L35:
            r2 = move-exception
            bj.C1030a.a(r0, r2)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r2 = move-exception
            goto L4c
        L3c:
            r2 = r0
            r0 = r4
        L3e:
            if (r2 != 0) goto L4b
            r0.longValue()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L57
            r3.close()     // Catch: java.lang.Throwable -> L49
            goto L57
        L49:
            r4 = move-exception
            goto L57
        L4b:
            throw r2     // Catch: java.lang.Throwable -> L3a
        L4c:
            if (r3 == 0) goto L56
            r3.close()     // Catch: java.lang.Throwable -> L52
            goto L56
        L52:
            r3 = move-exception
            bj.C1030a.a(r2, r3)
        L56:
            r4 = r2
        L57:
            if (r4 != 0) goto L5a
            return
        L5a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.FileSystem.commonCopy(okio.FileSystem, okio.Path, okio.Path):void");
    }

    public static final void commonCreateDirectories(okio.FileSystem fileSystem, Path dir, boolean z4) throws IOException {
        j.g(fileSystem, "<this>");
        j.g(dir, "dir");
        C1124j c1124j = new C1124j();
        for (Path pathParent = dir; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            c1124j.addFirst(pathParent);
        }
        if (z4 && c1124j.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = c1124j.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(okio.FileSystem fileSystem, Path fileOrDirectory, boolean z4) throws IOException {
        j.g(fileSystem, "<this>");
        j.g(fileOrDirectory, "fileOrDirectory");
        yj.j jVarA = l.a(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, fileOrDirectory, null));
        while (jVarA.hasNext()) {
            fileSystem.delete((Path) jVarA.next(), z4 && !jVarA.hasNext());
        }
    }

    public static final boolean commonExists(okio.FileSystem fileSystem, Path path) throws IOException {
        j.g(fileSystem, "<this>");
        j.g(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final Sequence<Path> commonListRecursively(okio.FileSystem fileSystem, Path dir, boolean z4) throws IOException {
        j.g(fileSystem, "<this>");
        j.g(dir, "dir");
        return new C1128n(new C19961(dir, fileSystem, z4, null));
    }

    public static final FileMetadata commonMetadata(okio.FileSystem fileSystem, Path path) throws IOException {
        j.g(fileSystem, "<this>");
        j.g(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException(AbstractC1331a.p(path, "no such file: "));
    }

    public static final Path symlinkTarget(okio.FileSystem fileSystem, Path path) throws IOException {
        j.g(fileSystem, "<this>");
        j.g(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        j.d(pathParent);
        return pathParent.resolve(symlinkTarget);
    }
}
