package androidx.media3.exoplayer.dash.manifest;

import We.s;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class RangedUri {
    private int hashCode;
    public final long length;
    private final String referenceUri;
    public final long start;

    public RangedUri(@Nullable String str, long j, long j6) {
        this.referenceUri = str == null ? "" : str;
        this.start = j;
        this.length = j6;
    }

    @Nullable
    public RangedUri attemptMerge(@Nullable RangedUri rangedUri, String str) {
        String strResolveUriString = resolveUriString(str);
        RangedUri rangedUri2 = null;
        if (rangedUri != null && strResolveUriString.equals(rangedUri.resolveUriString(str))) {
            long j = this.length;
            if (j != -1) {
                long j6 = this.start;
                if (j6 + j == rangedUri.start) {
                    long j7 = rangedUri.length;
                    return new RangedUri(strResolveUriString, j6, j7 != -1 ? j + j7 : -1L);
                }
            }
            long j9 = rangedUri.length;
            if (j9 != -1) {
                long j10 = rangedUri.start;
                if (j10 + j9 == this.start) {
                    rangedUri2 = new RangedUri(strResolveUriString, j10, j != -1 ? j9 + j : -1L);
                }
            }
        }
        return rangedUri2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RangedUri.class == obj.getClass()) {
            RangedUri rangedUri = (RangedUri) obj;
            if (this.start == rangedUri.start && this.length == rangedUri.length && this.referenceUri.equals(rangedUri.referenceUri)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = this.referenceUri.hashCode() + ((((527 + ((int) this.start)) * 31) + ((int) this.length)) * 31);
        }
        return this.hashCode;
    }

    public Uri resolveUri(String str) {
        return UriUtil.resolveToUri(str, this.referenceUri);
    }

    public String resolveUriString(String str) {
        return UriUtil.resolve(str, this.referenceUri);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.referenceUri);
        sb2.append(", start=");
        sb2.append(this.start);
        sb2.append(", length=");
        return s.h(this.length, ")", sb2);
    }
}
