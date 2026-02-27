package androidx.core.location;

import android.location.GnssMeasurementsEvent$Callback;
import android.os.Build;
import android.os.LocaleList;
import android.view.PointerIcon;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ GnssMeasurementsEvent$Callback e(Object obj) {
        return (GnssMeasurementsEvent$Callback) obj;
    }

    public static /* bridge */ /* synthetic */ LocaleList h(Object obj) {
        return (LocaleList) obj;
    }

    public static /* bridge */ /* synthetic */ PointerIcon i(Object obj) {
        return (PointerIcon) obj;
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return GnssMeasurementsEvent$Callback.class;
    }

    public static /* bridge */ /* synthetic */ Consumer q(Object obj) {
        return (Consumer) obj;
    }

    public static /* synthetic */ void y(ExecutorService executorService) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z4 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z4) {
                        executorService.shutdownNow();
                        z4 = true;
                    }
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
