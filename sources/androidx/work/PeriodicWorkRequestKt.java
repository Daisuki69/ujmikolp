package androidx.work;

import androidx.annotation.RequiresApi;
import androidx.work.PeriodicWorkRequest;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class PeriodicWorkRequestKt {
    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, TimeUnit repeatIntervalTimeUnit) {
        j.g(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        j.m();
        throw null;
    }

    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, TimeUnit repeatIntervalTimeUnit, long j6, TimeUnit flexTimeIntervalUnit) {
        j.g(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        j.g(flexTimeIntervalUnit, "flexTimeIntervalUnit");
        j.m();
        throw null;
    }

    @RequiresApi(26)
    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration repeatInterval) {
        j.g(repeatInterval, "repeatInterval");
        j.m();
        throw null;
    }

    @RequiresApi(26)
    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration repeatInterval, Duration flexTimeInterval) {
        j.g(repeatInterval, "repeatInterval");
        j.g(flexTimeInterval, "flexTimeInterval");
        j.m();
        throw null;
    }
}
