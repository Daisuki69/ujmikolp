package N5;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0442c0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f4067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0466m f4068b;

    public C0442c0(FrameLayout frameLayout, C0466m c0466m) {
        this.f4067a = frameLayout;
        this.f4068b = c0466m;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4067a;
    }
}
