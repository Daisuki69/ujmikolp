package androidx.lifecycle;

import Dj.r;
import Ej.h0;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7870b;

    public /* synthetic */ f(Object obj, int i) {
        this.f7869a = i;
        this.f7870b = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.f7869a) {
            case 0:
                LifecycleKt$eventFlow$1.invokeSuspend$lambda$0((r) this.f7870b, lifecycleOwner, event);
                break;
            default:
                Lifecycle._get_currentStateFlow_$lambda$0((h0) this.f7870b, lifecycleOwner, event);
                break;
        }
    }
}
