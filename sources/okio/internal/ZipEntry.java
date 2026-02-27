package okio.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import okio.Path;

/* JADX INFO: loaded from: classes5.dex */
public final class ZipEntry {
    private final Path canonicalPath;
    private final List<Path> children;
    private final String comment;
    private final long compressedSize;
    private final int compressionMethod;
    private final long crc;
    private final int dosLastModifiedAtDate;
    private final int dosLastModifiedAtTime;
    private final Integer extendedCreatedAtSeconds;
    private final Integer extendedLastAccessedAtSeconds;
    private final Integer extendedLastModifiedAtSeconds;
    private final boolean isDirectory;
    private final Long ntfsCreatedAtFiletime;
    private final Long ntfsLastAccessedAtFiletime;
    private final Long ntfsLastModifiedAtFiletime;
    private final long offset;
    private final long size;

    public ZipEntry(Path canonicalPath, boolean z4, String comment, long j, long j6, long j7, int i, long j9, int i4, int i6, Long l6, Long l8, Long l10, Integer num, Integer num2, Integer num3) {
        j.g(canonicalPath, "canonicalPath");
        j.g(comment, "comment");
        this.canonicalPath = canonicalPath;
        this.isDirectory = z4;
        this.comment = comment;
        this.crc = j;
        this.compressedSize = j6;
        this.size = j7;
        this.compressionMethod = i;
        this.offset = j9;
        this.dosLastModifiedAtDate = i4;
        this.dosLastModifiedAtTime = i6;
        this.ntfsLastModifiedAtFiletime = l6;
        this.ntfsLastAccessedAtFiletime = l8;
        this.ntfsCreatedAtFiletime = l10;
        this.extendedLastModifiedAtSeconds = num;
        this.extendedLastAccessedAtSeconds = num2;
        this.extendedCreatedAtSeconds = num3;
        this.children = new ArrayList();
    }

    public final ZipEntry copy$okio(Integer num, Integer num2, Integer num3) {
        return new ZipEntry(this.canonicalPath, this.isDirectory, this.comment, this.crc, this.compressedSize, this.size, this.compressionMethod, this.offset, this.dosLastModifiedAtDate, this.dosLastModifiedAtTime, this.ntfsLastModifiedAtFiletime, this.ntfsLastAccessedAtFiletime, this.ntfsCreatedAtFiletime, num, num2, num3);
    }

    public final Path getCanonicalPath() {
        return this.canonicalPath;
    }

    public final List<Path> getChildren() {
        return this.children;
    }

    public final String getComment() {
        return this.comment;
    }

    public final long getCompressedSize() {
        return this.compressedSize;
    }

    public final int getCompressionMethod() {
        return this.compressionMethod;
    }

    public final long getCrc() {
        return this.crc;
    }

    public final Long getCreatedAtMillis$okio() {
        Long l6 = this.ntfsCreatedAtFiletime;
        if (l6 != null) {
            return Long.valueOf(ZipFilesKt.filetimeToEpochMillis(l6.longValue()));
        }
        Integer num = this.extendedCreatedAtSeconds;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final int getDosLastModifiedAtDate() {
        return this.dosLastModifiedAtDate;
    }

    public final int getDosLastModifiedAtTime() {
        return this.dosLastModifiedAtTime;
    }

    public final Integer getExtendedCreatedAtSeconds() {
        return this.extendedCreatedAtSeconds;
    }

    public final Integer getExtendedLastAccessedAtSeconds() {
        return this.extendedLastAccessedAtSeconds;
    }

    public final Integer getExtendedLastModifiedAtSeconds() {
        return this.extendedLastModifiedAtSeconds;
    }

    public final Long getLastAccessedAtMillis$okio() {
        Long l6 = this.ntfsLastAccessedAtFiletime;
        if (l6 != null) {
            return Long.valueOf(ZipFilesKt.filetimeToEpochMillis(l6.longValue()));
        }
        Integer num = this.extendedLastAccessedAtSeconds;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        return null;
    }

    public final Long getLastModifiedAtMillis$okio() {
        Long l6 = this.ntfsLastModifiedAtFiletime;
        if (l6 != null) {
            return Long.valueOf(ZipFilesKt.filetimeToEpochMillis(l6.longValue()));
        }
        Integer num = this.extendedLastModifiedAtSeconds;
        if (num != null) {
            return Long.valueOf(((long) num.intValue()) * 1000);
        }
        int i = this.dosLastModifiedAtTime;
        if (i != -1) {
            return ZipFilesKt.dosDateTimeToEpochMillis(this.dosLastModifiedAtDate, i);
        }
        return null;
    }

    public final Long getNtfsCreatedAtFiletime() {
        return this.ntfsCreatedAtFiletime;
    }

    public final Long getNtfsLastAccessedAtFiletime() {
        return this.ntfsLastAccessedAtFiletime;
    }

    public final Long getNtfsLastModifiedAtFiletime() {
        return this.ntfsLastModifiedAtFiletime;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getSize() {
        return this.size;
    }

    public final boolean isDirectory() {
        return this.isDirectory;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ZipEntry(Path path, boolean z4, String str, long j, long j6, long j7, int i, long j9, int i4, int i6, Long l6, Long l8, Long l10, Integer num, Integer num2, Integer num3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num4;
        boolean z5;
        Integer num5;
        boolean z8 = (i10 & 2) != 0 ? false : z4;
        String str2 = (i10 & 4) != 0 ? "" : str;
        long j10 = (i10 & 8) != 0 ? -1L : j;
        long j11 = (i10 & 16) != 0 ? -1L : j6;
        long j12 = (i10 & 32) != 0 ? -1L : j7;
        int i11 = (i10 & 64) != 0 ? -1 : i;
        long j13 = (i10 & 128) == 0 ? j9 : -1L;
        int i12 = (i10 & 256) != 0 ? -1 : i4;
        int i13 = (i10 & 512) == 0 ? i6 : -1;
        Long l11 = (i10 & 1024) != 0 ? null : l6;
        Long l12 = (i10 & 2048) != 0 ? null : l8;
        boolean z9 = z8;
        Long l13 = (i10 & 4096) != 0 ? null : l10;
        Integer num6 = (i10 & 8192) != 0 ? null : num;
        Integer num7 = (i10 & 16384) != 0 ? null : num2;
        if ((i10 & 32768) != 0) {
            num4 = num6;
            z5 = z9;
            num5 = null;
        } else {
            num4 = num6;
            z5 = z9;
            num5 = num3;
        }
        this(path, z5, str2, j10, j11, j12, i11, j13, i12, i13, l11, l12, l13, num4, num7, num5);
    }
}
