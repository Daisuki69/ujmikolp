package U1;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f5899a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z4) {
        synchronized (g.f5902k) {
            try {
                for (g gVar : new ArrayList(g.f5903l.values())) {
                    if (gVar.e.get()) {
                        gVar.l(z4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
