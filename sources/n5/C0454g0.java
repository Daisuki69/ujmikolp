package N5;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0454g0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0491z f4097b;
    public final Z c;

    public C0454g0(ConstraintLayout constraintLayout, C0491z c0491z, Z z4) {
        this.f4096a = constraintLayout;
        this.f4097b = c0491z;
        this.c = z4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4096a;
    }
}
