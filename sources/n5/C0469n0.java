package N5;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0469n0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f4162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0462k f4163b;
    public final D0 c;

    public C0469n0(FrameLayout frameLayout, C0462k c0462k, D0 d02) {
        this.f4162a = frameLayout;
        this.f4163b = c0462k;
        this.c = d02;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4162a;
    }
}
