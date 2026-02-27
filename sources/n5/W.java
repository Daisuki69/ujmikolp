package N5;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class W implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f3970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f3971b;
    public final Z c;

    public W(FrameLayout frameLayout, X x6, Z z4) {
        this.f3970a = frameLayout;
        this.f3971b = x6;
        this.c = z4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f3970a;
    }
}
