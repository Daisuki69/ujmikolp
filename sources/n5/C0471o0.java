package N5;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0471o0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f4168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f4169b;
    public final D0 c;

    public C0471o0(FrameLayout frameLayout, E e, D0 d02) {
        this.f4168a = frameLayout;
        this.f4169b = e;
        this.c = d02;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4168a;
    }
}
