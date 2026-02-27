package N5;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0490y0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0492z0 f4298b;
    public final Z c;

    public C0490y0(ConstraintLayout constraintLayout, C0492z0 c0492z0, Z z4) {
        this.f4297a = constraintLayout;
        this.f4298b = c0492z0;
        this.c = z4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4297a;
    }
}
