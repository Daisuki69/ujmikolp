package N5;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0473p0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f4176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f4177b;
    public final D0 c;

    public C0473p0(FrameLayout frameLayout, M m, D0 d02) {
        this.f4176a = frameLayout;
        this.f4177b = m;
        this.c = d02;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4176a;
    }
}
