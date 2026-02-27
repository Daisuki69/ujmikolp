package androidx.camera.extensions.internal.compat.workaround;

import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.extensions.internal.compat.quirk.CrashWhenOnDisableTooSoon;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;

/* JADX INFO: loaded from: classes.dex */
public class OnEnableDisableSessionDurationCheck {

    @VisibleForTesting
    static final long MIN_DURATION_FOR_ENABLE_DISABLE_SESSION = 100;
    private static final String TAG = "OnEnableDisableSessionDurationCheck";
    private final boolean mEnabledMinimumDuration;
    private long mOnEnableSessionTimeStamp;

    public OnEnableDisableSessionDurationCheck() {
        this(DeviceQuirks.get(CrashWhenOnDisableTooSoon.class) != null);
    }

    private void ensureMinDurationAfterOnEnableSession() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.mOnEnableSessionTimeStamp;
        while (true) {
            long j6 = jElapsedRealtime - j;
            if (j6 >= MIN_DURATION_FOR_ENABLE_DISABLE_SESSION) {
                return;
            }
            long j7 = MIN_DURATION_FOR_ENABLE_DISABLE_SESSION - j6;
            try {
                Logger.d(TAG, "onDisableSession too soon, wait " + j7 + " ms");
                Thread.sleep(j7);
                jElapsedRealtime = SystemClock.elapsedRealtime();
                j = this.mOnEnableSessionTimeStamp;
            } catch (InterruptedException unused) {
                Logger.e(TAG, "sleep interrupted");
                return;
            }
        }
    }

    public void onDisableSessionInvoked() {
        if (this.mEnabledMinimumDuration) {
            ensureMinDurationAfterOnEnableSession();
        }
    }

    public void onEnableSessionInvoked() {
        if (this.mEnabledMinimumDuration) {
            this.mOnEnableSessionTimeStamp = SystemClock.elapsedRealtime();
        }
    }

    @VisibleForTesting
    public OnEnableDisableSessionDurationCheck(boolean z4) {
        this.mOnEnableSessionTimeStamp = 0L;
        this.mEnabledMinimumDuration = z4;
    }
}
