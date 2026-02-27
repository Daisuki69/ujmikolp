package N5;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0467m0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0464l f4154b;

    public C0467m0(ConstraintLayout constraintLayout, C0464l c0464l) {
        this.f4153a = constraintLayout;
        this.f4154b = c0464l;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4153a;
    }
}
