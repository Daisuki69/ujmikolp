package androidx.media3.datasource.cache;

import We.s;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.UnstableApi;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class CacheSpan implements Comparable<CacheSpan> {

    @Nullable
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastTouchTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(String str, long j, long j6) {
        this(str, j, j6, C.TIME_UNSET, null);
    }

    public boolean isHoleSpan() {
        return !this.isCached;
    }

    public boolean isOpenEnded() {
        return this.length == -1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.position);
        sb2.append(", ");
        return s.h(this.length, "]", sb2);
    }

    public CacheSpan(String str, long j, long j6, long j7, @Nullable File file) {
        this.key = str;
        this.position = j;
        this.length = j6;
        this.isCached = file != null;
        this.file = file;
        this.lastTouchTimestamp = j7;
    }

    @Override // java.lang.Comparable
    public int compareTo(CacheSpan cacheSpan) {
        if (!this.key.equals(cacheSpan.key)) {
            return this.key.compareTo(cacheSpan.key);
        }
        long j = this.position - cacheSpan.position;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }
}
