package androidx.customview.poolingcontainer;

import cj.C1132s;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
final class PoolingContainerListenerHolder {
    private final ArrayList<PoolingContainerListener> listeners = new ArrayList<>();

    public final void addListener(PoolingContainerListener listener) {
        j.g(listener, "listener");
        this.listeners.add(listener);
    }

    public final void onRelease() {
        for (int iF = C1132s.f(this.listeners); -1 < iF; iF--) {
            this.listeners.get(iF).onRelease();
        }
    }

    public final void removeListener(PoolingContainerListener listener) {
        j.g(listener, "listener");
        this.listeners.remove(listener);
    }
}
