package N5;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0461j0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f4125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0450f f4126b;
    public final D0 c;

    public C0461j0(FrameLayout frameLayout, C0450f c0450f, D0 d02) {
        this.f4125a = frameLayout;
        this.f4126b = c0450f;
        this.c = d02;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4125a;
    }
}
