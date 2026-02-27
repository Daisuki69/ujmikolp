package gi;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: gi.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1525c implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16847a = new ArrayList();

    public C1525c() {
        new Handler(Looper.getMainLooper()).post(new RunnableC1524b(this, 0));
    }

    public final void a(boolean z4) {
        InterfaceC1523a interfaceC1523a;
        for (WeakReference weakReference : this.f16847a) {
            if (weakReference != null && (interfaceC1523a = (InterfaceC1523a) weakReference.get()) != null) {
                if (z4) {
                    interfaceC1523a.resume();
                } else {
                    interfaceC1523a.pause();
                }
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.b.a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.b.b(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        a(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        a(true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.b.e(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.b.f(this, lifecycleOwner);
    }
}
