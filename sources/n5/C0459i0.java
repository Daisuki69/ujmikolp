package N5;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0459i0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z f4118b;
    public final A c;

    public C0459i0(ConstraintLayout constraintLayout, Z z4, A a8) {
        this.f4117a = constraintLayout;
        this.f4118b = z4;
        this.c = a8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4117a;
    }
}
