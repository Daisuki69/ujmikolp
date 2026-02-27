package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import cj.w;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.z;
import kotlin.sequences.Sequence;
import yj.q;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ForwardingFileSystem extends FileSystem {
    private final FileSystem delegate;

    /* JADX INFO: renamed from: okio.ForwardingFileSystem$listRecursively$1, reason: invalid class name */
    public static final class AnonymousClass1 extends k implements Function1<Path, Path> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Path invoke(Path it) {
            j.g(it, "it");
            return ForwardingFileSystem.this.onPathResult(it, "listRecursively");
        }
    }

    public ForwardingFileSystem(FileSystem delegate) {
        j.g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // okio.FileSystem
    public Sink appendingSink(Path file, boolean z4) throws IOException {
        j.g(file, "file");
        return this.delegate.appendingSink(onPathParameter(file, "appendingSink", Constants.FILE), z4);
    }

    @Override // okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        j.g(source, "source");
        j.g(target, "target");
        this.delegate.atomicMove(onPathParameter(source, "atomicMove", "source"), onPathParameter(target, "atomicMove", TypedValues.AttributesType.S_TARGET));
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        j.g(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // okio.FileSystem
    public void createDirectory(Path dir, boolean z4) throws IOException {
        j.g(dir, "dir");
        this.delegate.createDirectory(onPathParameter(dir, "createDirectory", "dir"), z4);
    }

    @Override // okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        j.g(source, "source");
        j.g(target, "target");
        this.delegate.createSymlink(onPathParameter(source, "createSymlink", "source"), onPathParameter(target, "createSymlink", TypedValues.AttributesType.S_TARGET));
    }

    public final FileSystem delegate() {
        return this.delegate;
    }

    @Override // okio.FileSystem
    public void delete(Path path, boolean z4) throws IOException {
        j.g(path, "path");
        this.delegate.delete(onPathParameter(path, "delete", "path"), z4);
    }

    @Override // okio.FileSystem
    public List<Path> list(Path dir) throws IOException {
        j.g(dir, "dir");
        List<Path> list = this.delegate.list(onPathParameter(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "list"));
        }
        w.n(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        j.g(dir, "dir");
        List<Path> listListOrNull = this.delegate.listOrNull(onPathParameter(dir, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
        }
        w.n(arrayList);
        return arrayList;
    }

    @Override // okio.FileSystem
    public Sequence<Path> listRecursively(Path dir, boolean z4) {
        j.g(dir, "dir");
        return q.n(this.delegate.listRecursively(onPathParameter(dir, "listRecursively", "dir"), z4), new AnonymousClass1());
    }

    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        j.g(path, "path");
        FileMetadata fileMetadataMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (fileMetadataMetadataOrNull == null) {
            return null;
        }
        return fileMetadataMetadataOrNull.getSymlinkTarget() == null ? fileMetadataMetadataOrNull : FileMetadata.copy$default(fileMetadataMetadataOrNull, false, false, onPathResult(fileMetadataMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    public Path onPathParameter(Path path, String functionName, String parameterName) {
        j.g(path, "path");
        j.g(functionName, "functionName");
        j.g(parameterName, "parameterName");
        return path;
    }

    public Path onPathResult(Path path, String functionName) {
        j.g(path, "path");
        j.g(functionName, "functionName");
        return path;
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path file) throws IOException {
        j.g(file, "file");
        return this.delegate.openReadOnly(onPathParameter(file, "openReadOnly", Constants.FILE));
    }

    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z4, boolean z5) throws IOException {
        j.g(file, "file");
        return this.delegate.openReadWrite(onPathParameter(file, "openReadWrite", Constants.FILE), z4, z5);
    }

    @Override // okio.FileSystem
    public Sink sink(Path file, boolean z4) throws IOException {
        j.g(file, "file");
        return this.delegate.sink(onPathParameter(file, "sink", Constants.FILE), z4);
    }

    @Override // okio.FileSystem
    public Source source(Path file) throws IOException {
        j.g(file, "file");
        return this.delegate.source(onPathParameter(file, "source", Constants.FILE));
    }

    public String toString() {
        return z.a(getClass()).c() + '(' + this.delegate + ')';
    }
}
