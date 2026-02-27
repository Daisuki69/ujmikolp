package x3;

import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import w3.C2376a;

/* JADX INFO: renamed from: x3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2462a {
    public static final GmsLogger c = new GmsLogger("StreamingFormatChecker", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f20892a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20893b = -1;

    public final void a(C2376a c2376a) {
        if (c2376a.f != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LinkedList linkedList = this.f20892a;
        linkedList.add(Long.valueOf(jElapsedRealtime));
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() != 5 || jElapsedRealtime - ((Long) Preconditions.checkNotNull((Long) linkedList.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j = this.f20893b;
        if (j == -1 || jElapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f20893b = jElapsedRealtime;
            c.w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
