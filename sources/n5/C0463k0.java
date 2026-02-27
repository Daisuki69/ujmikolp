package N5;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0463k0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f4135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f4136b;
    public final Z c;

    public C0463k0(FrameLayout frameLayout, C c, Z z4) {
        this.f4135a = frameLayout;
        this.f4136b = c;
        this.c = z4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4135a;
    }
}
