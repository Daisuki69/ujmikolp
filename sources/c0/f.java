package c0;

import android.graphics.Bitmap;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f9191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f9192b;
    public final long c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9193d;

    public f(Bitmap bitmap, e eVar, long j, byte[] bArr) {
        this.f9191a = bitmap;
        this.f9192b = eVar;
        this.c = j;
        this.f9193d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type com.clevertap.android.sdk.network.DownloadedBitmap");
        f fVar = (f) obj;
        return kotlin.jvm.internal.j.b(this.f9191a, fVar.f9191a) && this.f9192b == fVar.f9192b && this.c == fVar.c && Arrays.equals(this.f9193d, fVar.f9193d);
    }

    public final int hashCode() {
        Bitmap bitmap = this.f9191a;
        int iHashCode = bitmap != null ? bitmap.hashCode() : 0;
        int iHashCode2 = this.f9192b.hashCode();
        long j = this.c;
        return Arrays.hashCode(this.f9193d) + ((((iHashCode2 + (iHashCode * 31)) * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "DownloadedBitmap(bitmap=" + this.f9191a + ", status=" + this.f9192b + ", downloadTime=" + this.c + ", bytes=" + Arrays.toString(this.f9193d) + ')';
    }
}
