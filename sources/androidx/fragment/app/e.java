package androidx.fragment.app;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements SavedStateRegistry.SavedStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7855b;

    public /* synthetic */ e(Object obj, int i) {
        this.f7854a = i;
        this.f7855b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        switch (this.f7854a) {
            case 0:
                return ((FragmentActivity) this.f7855b).lambda$init$0();
            default:
                return ((FragmentManager) this.f7855b).lambda$attachController$4();
        }
    }
}
