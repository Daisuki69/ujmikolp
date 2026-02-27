package J2;

import U2.i;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements b {
    private final c appStateMonitor;
    private boolean isRegisteredForAppState = false;
    private i currentAppState = i.APPLICATION_PROCESS_STATE_UNKNOWN;
    private final WeakReference<b> appStateCallback = new WeakReference<>(this);

    public d(c cVar) {
        this.appStateMonitor = cVar;
    }

    public i getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public WeakReference<b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.h.addAndGet(i);
    }

    @Override // J2.b
    public void onUpdateAppState(i iVar) {
        i iVar2 = this.currentAppState;
        i iVar3 = i.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (iVar2 == iVar3) {
            this.currentAppState = iVar;
        } else {
            if (iVar2 == iVar || iVar == iVar3) {
                return;
            }
            this.currentAppState = i.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        c cVar = this.appStateMonitor;
        this.currentAppState = cVar.f2401o;
        cVar.d(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            c cVar = this.appStateMonitor;
            WeakReference<b> weakReference = this.appStateCallback;
            synchronized (cVar.f) {
                cVar.f.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }
}
