package W2;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f6223a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z4) {
        Clock clock = j.j;
        synchronized (j.class) {
            Iterator it = j.f6225l.values().iterator();
            while (it.hasNext()) {
                ((e) it.next()).h(z4);
            }
        }
    }
}
