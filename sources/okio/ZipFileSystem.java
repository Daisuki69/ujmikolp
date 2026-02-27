package okio;

import bj.C1030a;
import cj.C1110A;
import d4.AbstractC1331a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import okio.Path;
import okio.internal.FixedLengthSource;
import okio.internal.ZipEntry;
import okio.internal.ZipFilesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ZipFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
    private final String comment;
    private final Map<Path, ZipEntry> entries;
    private final FileSystem fileSystem;
    private final Path zipPath;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Path getROOT() {
            return ZipFileSystem.ROOT;
        }

        private Companion() {
        }
    }

    public ZipFileSystem(Path zipPath, FileSystem fileSystem, Map<Path, ZipEntry> entries, String str) {
        j.g(zipPath, "zipPath");
        j.g(fileSystem, "fileSystem");
        j.g(entries, "entries");
        this.zipPath = zipPath;
        this.fileSystem = fileSystem;
        this.entries = entries;
        this.comment = str;
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    @Override // okio.FileSystem
    public Sink appendingSink(Path file, boolean z4) throws IOException {
        j.g(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        j.g(source, "source");
        j.g(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) throws FileNotFoundException {
        j.g(path, "path");
        Path pathCanonicalizeInternal = canonicalizeInternal(path);
        if (this.entries.containsKey(pathCanonicalizeInternal)) {
            return pathCanonicalizeInternal;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // okio.FileSystem
    public void createDirectory(Path dir, boolean z4) throws IOException {
        j.g(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        j.g(source, "source");
        j.g(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void delete(Path path, boolean z4) throws IOException {
        j.g(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public List<Path> list(Path dir) throws IOException {
        j.g(dir, "dir");
        List<Path> list = list(dir, true);
        j.d(list);
        return list;
    }

    @Override // okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        j.g(dir, "dir");
        return list(dir, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x004e, blocks: (B:8:0x0027, B:34:0x005f, B:22:0x004a, B:9:0x0033, B:19:0x0045), top: B:60:0x0027, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    @Override // okio.FileSystem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okio.FileMetadata metadataOrNull(okio.Path r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.j.g(r14, r0)
            okio.Path r14 = r13.canonicalizeInternal(r14)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r0 = r13.entries
            java.lang.Object r14 = r0.get(r14)
            okio.internal.ZipEntry r14 = (okio.internal.ZipEntry) r14
            r1 = 0
            if (r14 != 0) goto L15
            return r1
        L15:
            long r2 = r14.getOffset()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L70
            okio.FileSystem r0 = r13.fileSystem
            okio.Path r2 = r13.zipPath
            okio.FileHandle r2 = r0.openReadOnly(r2)
            long r3 = r14.getOffset()     // Catch: java.lang.Throwable -> L4e
            okio.Source r0 = r2.source(r3)     // Catch: java.lang.Throwable -> L4e
            okio.BufferedSource r3 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L4e
            okio.internal.ZipEntry r14 = okio.internal.ZipFilesKt.readLocalHeader(r3, r14)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L3f
            r3.close()     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r0 = move-exception
            goto L53
        L3f:
            r0 = r1
            goto L53
        L41:
            r0 = move-exception
            r14 = r0
            if (r3 == 0) goto L51
            r3.close()     // Catch: java.lang.Throwable -> L49
            goto L51
        L49:
            r0 = move-exception
            bj.C1030a.a(r14, r0)     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r0 = move-exception
            r14 = r0
            goto L60
        L51:
            r0 = r14
            r14 = r1
        L53:
            if (r0 != 0) goto L5f
            if (r2 == 0) goto L5d
            r2.close()     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r0 = move-exception
            goto L6c
        L5d:
            r0 = r1
            goto L6c
        L5f:
            throw r0     // Catch: java.lang.Throwable -> L4e
        L60:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.lang.Throwable -> L66
            goto L6a
        L66:
            r0 = move-exception
            bj.C1030a.a(r14, r0)
        L6a:
            r0 = r14
            r14 = r1
        L6c:
            if (r0 != 0) goto L6f
            goto L70
        L6f:
            throw r0
        L70:
            okio.FileMetadata r2 = new okio.FileMetadata
            boolean r0 = r14.isDirectory()
            r3 = r0 ^ 1
            boolean r4 = r14.isDirectory()
            boolean r0 = r14.isDirectory()
            if (r0 == 0) goto L84
        L82:
            r6 = r1
            goto L8d
        L84:
            long r0 = r14.getSize()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L82
        L8d:
            java.lang.Long r7 = r14.getCreatedAtMillis$okio()
            java.lang.Long r8 = r14.getLastModifiedAtMillis$okio()
            java.lang.Long r9 = r14.getLastAccessedAtMillis$okio()
            r11 = 128(0x80, float:1.8E-43)
            r12 = 0
            r5 = 0
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ZipFileSystem.metadataOrNull(okio.Path):okio.FileMetadata");
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path file) {
        j.g(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z4, boolean z5) throws IOException {
        j.g(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // okio.FileSystem
    public Sink sink(Path file, boolean z4) throws IOException {
        j.g(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // okio.FileSystem
    public Source source(Path file) throws IOException {
        j.g(file, "file");
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(file));
        if (zipEntry == null) {
            throw new FileNotFoundException(AbstractC1331a.p(file, "no such file: "));
        }
        FileHandle fileHandleOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        BufferedSource th2 = null;
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(zipEntry.getOffset()));
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = bufferedSourceBuffer;
        } catch (Throwable th4) {
            th = th4;
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th5) {
                    C1030a.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        ZipFilesKt.skipLocalHeader(th2);
        return zipEntry.getCompressionMethod() == 0 ? new FixedLengthSource(th2, zipEntry.getSize(), true) : new FixedLengthSource(new InflaterSource(new FixedLengthSource(th2, zipEntry.getCompressedSize(), true), new Inflater(true)), zipEntry.getSize(), false);
    }

    private final List<Path> list(Path path, boolean z4) throws IOException {
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(path));
        if (zipEntry != null) {
            return C1110A.V(zipEntry.getChildren());
        }
        if (z4) {
            throw new IOException(AbstractC1331a.p(path, "not a directory: "));
        }
        return null;
    }
}
