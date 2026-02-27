package okio.internal;

import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1110A;
import cj.t;
import cj.x;
import com.dynatrace.android.callback.Callback;
import d4.AbstractC1331a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import okio.Source;
import zj.C2576A;
import zj.z;

/* JADX INFO: loaded from: classes5.dex */
public final class ResourceFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, "/", false, 1, (Object) null);
    private final ClassLoader classLoader;
    private final InterfaceC1033d roots$delegate;
    private final FileSystem systemFileSystem;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean keepPath(Path path) {
            return !z.m(path.name(), ".class", true);
        }

        public final Path getROOT() {
            return ResourceFileSystem.ROOT;
        }

        public final Path removeBase(Path path, Path base) {
            j.g(path, "<this>");
            j.g(base, "base");
            return getROOT().resolve(z.s(C2576A.M(path.toString(), base.toString()), '\\', '/'));
        }

        private Companion() {
        }
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z4, FileSystem fileSystem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z4, (i & 4) != 0 ? FileSystem.SYSTEM : fileSystem);
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    private final List<Pair<FileSystem, Path>> getRoots() {
        return (List) this.roots$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Pair<FileSystem, Path>> toClasspathRoots(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        j.f(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        j.f(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            j.d(url);
            Pair<FileSystem, Path> fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        j.f(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        j.f(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            j.d(url2);
            Pair<FileSystem, Path> jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList2.add(jarRoot);
            }
        }
        return C1110A.L(arrayList2, arrayList);
    }

    private final Pair<FileSystem, Path> toFileRoot(URL url) {
        if (j.b(url.getProtocol(), Constants.FILE)) {
            return new Pair<>(this.systemFileSystem, Path.Companion.get$default(Path.Companion, new File(url.toURI()), false, 1, (Object) null));
        }
        return null;
    }

    private final Pair<FileSystem, Path> toJarRoot(URL url) {
        int iJ;
        String string = url.toString();
        j.f(string, "toString(...)");
        if (!z.w(string, 2, "jar:file:", false) || (iJ = C2576A.J(string, 0, 6, false, "!")) == -1) {
            return null;
        }
        Path.Companion companion = Path.Companion;
        String strSubstring = string.substring(4, iJ);
        j.f(strSubstring, "substring(...)");
        return new Pair<>(ZipFilesKt.openZip(Path.Companion.get$default(companion, new File(URI.create(strSubstring)), false, 1, (Object) null), this.systemFileSystem, ResourceFileSystem$toJarRoot$zip$1.INSTANCE), ROOT);
    }

    private final String toRelativePath(Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }

    @Override // okio.FileSystem
    public Sink appendingSink(Path file, boolean z4) throws IOException {
        j.g(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        j.g(source, "source");
        j.g(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) {
        j.g(path, "path");
        return canonicalizeInternal(path);
    }

    @Override // okio.FileSystem
    public void createDirectory(Path dir, boolean z4) throws IOException {
        j.g(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        j.g(source, "source");
        j.g(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void delete(Path path, boolean z4) throws IOException {
        j.g(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public List<Path> list(Path dir) throws FileNotFoundException {
        j.g(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z4 = false;
        for (Pair<FileSystem, Path> pair : getRoots()) {
            FileSystem fileSystem = (FileSystem) pair.f18160a;
            Path path = (Path) pair.f18161b;
            try {
                List<Path> list = fileSystem.list(path.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Companion.removeBase((Path) it.next(), path));
                }
                x.p(arrayList2, linkedHashSet);
                z4 = true;
            } catch (IOException unused) {
            }
        }
        if (z4) {
            return C1110A.V(linkedHashSet);
        }
        throw new FileNotFoundException(AbstractC1331a.p(dir, "file not found: "));
    }

    @Override // okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        j.g(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Pair<FileSystem, Path>> it = getRoots().iterator();
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair<FileSystem, Path> next = it.next();
            FileSystem fileSystem = (FileSystem) next.f18160a;
            Path path = (Path) next.f18161b;
            List<Path> listListOrNull = fileSystem.listOrNull(path.resolve(relativePath));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(t.l(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Companion.removeBase((Path) it2.next(), path));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                x.p(arrayList, linkedHashSet);
                z4 = true;
            }
        }
        if (z4) {
            return C1110A.V(linkedHashSet);
        }
        return null;
    }

    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        j.g(path, "path");
        if (!Companion.keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (Pair<FileSystem, Path> pair : getRoots()) {
            FileMetadata fileMetadataMetadataOrNull = ((FileSystem) pair.f18160a).metadataOrNull(((Path) pair.f18161b).resolve(relativePath));
            if (fileMetadataMetadataOrNull != null) {
                return fileMetadataMetadataOrNull;
            }
        }
        return null;
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path file) throws FileNotFoundException {
        j.g(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException(AbstractC1331a.p(file, "file not found: "));
        }
        String relativePath = toRelativePath(file);
        for (Pair<FileSystem, Path> pair : getRoots()) {
            try {
                return ((FileSystem) pair.f18160a).openReadOnly(((Path) pair.f18161b).resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException(AbstractC1331a.p(file, "file not found: "));
    }

    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z4, boolean z5) throws IOException {
        j.g(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // okio.FileSystem
    public Sink sink(Path file, boolean z4) throws IOException {
        j.g(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public Source source(Path file) throws Exception {
        j.g(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException(AbstractC1331a.p(file, "file not found: "));
        }
        Path path = ROOT;
        URL resource = this.classLoader.getResource(Path.resolve$default(path, file, false, 2, (Object) null).relativeTo(path).toString());
        if (resource == null) {
            throw new FileNotFoundException(AbstractC1331a.p(file, "file not found: "));
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = Callback.getInputStream(uRLConnectionOpenConnection);
        j.f(inputStream, "getInputStream(...)");
        return Okio.source(inputStream);
    }

    public ResourceFileSystem(ClassLoader classLoader, boolean z4, FileSystem systemFileSystem) {
        j.g(classLoader, "classLoader");
        j.g(systemFileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = systemFileSystem;
        this.roots$delegate = C1034e.b(new ResourceFileSystem$roots$2(this));
        if (z4) {
            getRoots().size();
        }
    }
}
