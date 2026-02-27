package okio;

import M8.A0;
import cj.C1110A;
import cj.M;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes5.dex */
public final class FileMetadata {
    private final Long createdAtMillis;
    private final Map<InterfaceC2488d, Object> extras;
    private final boolean isDirectory;
    private final boolean isRegularFile;
    private final Long lastAccessedAtMillis;
    private final Long lastModifiedAtMillis;
    private final Long size;
    private final Path symlinkTarget;

    public FileMetadata() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileMetadata copy$default(FileMetadata fileMetadata, boolean z4, boolean z5, Path path, Long l6, Long l8, Long l10, Long l11, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            z4 = fileMetadata.isRegularFile;
        }
        if ((i & 2) != 0) {
            z5 = fileMetadata.isDirectory;
        }
        if ((i & 4) != 0) {
            path = fileMetadata.symlinkTarget;
        }
        if ((i & 8) != 0) {
            l6 = fileMetadata.size;
        }
        if ((i & 16) != 0) {
            l8 = fileMetadata.createdAtMillis;
        }
        if ((i & 32) != 0) {
            l10 = fileMetadata.lastModifiedAtMillis;
        }
        if ((i & 64) != 0) {
            l11 = fileMetadata.lastAccessedAtMillis;
        }
        if ((i & 128) != 0) {
            map = fileMetadata.extras;
        }
        Long l12 = l11;
        Map map2 = map;
        Long l13 = l8;
        Long l14 = l10;
        return fileMetadata.copy(z4, z5, path, l6, l13, l14, l12, map2);
    }

    public final FileMetadata copy(boolean z4, boolean z5, Path path, Long l6, Long l8, Long l10, Long l11, Map<InterfaceC2488d, ? extends Object> extras) {
        j.g(extras, "extras");
        return new FileMetadata(z4, z5, path, l6, l8, l10, l11, extras);
    }

    public final <T> T extra(InterfaceC2488d type) {
        j.g(type, "type");
        T t5 = (T) this.extras.get(type);
        if (t5 == null) {
            return null;
        }
        A0.j(type, t5);
        return t5;
    }

    public final Long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public final Map<InterfaceC2488d, Object> getExtras() {
        return this.extras;
    }

    public final Long getLastAccessedAtMillis() {
        return this.lastAccessedAtMillis;
    }

    public final Long getLastModifiedAtMillis() {
        return this.lastModifiedAtMillis;
    }

    public final Long getSize() {
        return this.size;
    }

    public final Path getSymlinkTarget() {
        return this.symlinkTarget;
    }

    public final boolean isDirectory() {
        return this.isDirectory;
    }

    public final boolean isRegularFile() {
        return this.isRegularFile;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.isRegularFile) {
            arrayList.add("isRegularFile");
        }
        if (this.isDirectory) {
            arrayList.add("isDirectory");
        }
        if (this.size != null) {
            arrayList.add("byteCount=" + this.size);
        }
        if (this.createdAtMillis != null) {
            arrayList.add("createdAt=" + this.createdAtMillis);
        }
        if (this.lastModifiedAtMillis != null) {
            arrayList.add("lastModifiedAt=" + this.lastModifiedAtMillis);
        }
        if (this.lastAccessedAtMillis != null) {
            arrayList.add("lastAccessedAt=" + this.lastAccessedAtMillis);
        }
        if (!this.extras.isEmpty()) {
            arrayList.add("extras=" + this.extras);
        }
        return C1110A.F(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public FileMetadata(boolean z4, boolean z5, Path path, Long l6, Long l8, Long l10, Long l11, Map<InterfaceC2488d, ? extends Object> extras) {
        j.g(extras, "extras");
        this.isRegularFile = z4;
        this.isDirectory = z5;
        this.symlinkTarget = path;
        this.size = l6;
        this.createdAtMillis = l8;
        this.lastModifiedAtMillis = l10;
        this.lastAccessedAtMillis = l11;
        this.extras = M.m(extras);
    }

    public /* synthetic */ FileMetadata(boolean z4, boolean z5, Path path, Long l6, Long l8, Long l10, Long l11, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z4, (i & 2) != 0 ? false : z5, (i & 4) != 0 ? null : path, (i & 8) != 0 ? null : l6, (i & 16) != 0 ? null : l8, (i & 32) != 0 ? null : l10, (i & 64) != 0 ? null : l11, (i & 128) != 0 ? M.e() : map);
    }
}
