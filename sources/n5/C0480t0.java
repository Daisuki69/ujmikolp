package N5;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0480t0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0464l f4214b;

    public C0480t0(ConstraintLayout constraintLayout, C0464l c0464l) {
        this.f4213a = constraintLayout;
        this.f4214b = c0464l;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4213a;
    }
}
