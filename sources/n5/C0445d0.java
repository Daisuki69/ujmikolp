package N5;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0445d0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0464l f4075b;

    public C0445d0(ConstraintLayout constraintLayout, C0464l c0464l) {
        this.f4074a = constraintLayout;
        this.f4075b = c0464l;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4074a;
    }
}
