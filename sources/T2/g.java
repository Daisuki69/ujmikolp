package T2;

import androidx.media3.common.C;
import java.util.concurrent.TimeUnit;
import n1.AbstractC1894G;
import n1.C1893F;
import n1.InterfaceC1896b;
import n1.y;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements InterfaceC1896b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5758b;
    public final Object c;

    public g(long j, long j6, TimeUnit timeUnit) {
        this.f5757a = j;
        this.f5758b = j6;
        this.c = timeUnit;
    }

    public static void c(y yVar, long j) {
        long currentPosition = yVar.getCurrentPosition() + j;
        long duration = yVar.getDuration();
        if (duration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        yVar.seekTo(yVar.getCurrentWindowIndex(), Math.max(currentPosition, 0L));
    }

    public void a(y yVar) {
        AbstractC1894G currentTimeline = yVar.getCurrentTimeline();
        if (currentTimeline.n() || yVar.isPlayingAd()) {
            return;
        }
        int currentWindowIndex = yVar.getCurrentWindowIndex();
        C1893F c1893f = (C1893F) this.c;
        currentTimeline.l(currentWindowIndex, c1893f);
        int nextWindowIndex = yVar.getNextWindowIndex();
        if (nextWindowIndex != -1) {
            yVar.seekTo(nextWindowIndex, C.TIME_UNSET);
        } else {
            c1893f.a();
        }
    }

    public void b(y yVar) {
        AbstractC1894G currentTimeline = yVar.getCurrentTimeline();
        if (currentTimeline.n() || yVar.isPlayingAd()) {
            return;
        }
        int currentWindowIndex = yVar.getCurrentWindowIndex();
        C1893F c1893f = (C1893F) this.c;
        currentTimeline.l(currentWindowIndex, c1893f);
        int previousWindowIndex = yVar.getPreviousWindowIndex();
        c1893f.a();
        if (previousWindowIndex == -1 || yVar.getCurrentPosition() > C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
            yVar.seekTo(currentWindowIndex, 0L);
        } else {
            yVar.seekTo(previousWindowIndex, C.TIME_UNSET);
        }
    }

    public g(long j, long j6) {
        this.f5758b = j;
        this.f5757a = j6;
        this.c = new C1893F();
    }
}
