package androidx.core.view;

import android.view.ViewConfiguration;
import androidx.core.util.Supplier;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewConfiguration f7820b;

    public /* synthetic */ m(ViewConfiguration viewConfiguration, int i) {
        this.f7819a = i;
        this.f7820b = viewConfiguration;
    }

    @Override // androidx.core.util.Supplier
    public final Object get() {
        switch (this.f7819a) {
            case 0:
                return Integer.valueOf(this.f7820b.getScaledMaximumFlingVelocity());
            default:
                return Integer.valueOf(this.f7820b.getScaledMinimumFlingVelocity());
        }
    }
}
