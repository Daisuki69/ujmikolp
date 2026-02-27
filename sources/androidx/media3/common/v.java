package androidx.media3.common;

import android.os.SystemClock;
import androidx.media3.common.SimpleBasePlayer;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class v {
    static {
        SimpleBasePlayer.PositionSupplier positionSupplier = SimpleBasePlayer.PositionSupplier.ZERO;
    }

    public static SimpleBasePlayer.PositionSupplier a(long j) {
        return new u(j);
    }

    public static SimpleBasePlayer.PositionSupplier b(final long j, final float f) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.t
            @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
            public final long get() {
                return v.d(j, jElapsedRealtime, f);
            }
        };
    }

    public static /* synthetic */ long c(long j) {
        return j;
    }

    public static /* synthetic */ long d(long j, long j6, float f) {
        return j + ((long) ((SystemClock.elapsedRealtime() - j6) * f));
    }
}
