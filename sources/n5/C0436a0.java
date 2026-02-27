package N5;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0436a0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0464l f4051b;

    public C0436a0(ConstraintLayout constraintLayout, C0464l c0464l) {
        this.f4050a = constraintLayout;
        this.f4051b = c0464l;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4050a;
    }
}
