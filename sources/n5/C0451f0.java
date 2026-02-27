package N5;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0451f0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f4090b;
    public final C0450f c;

    public C0451f0(ConstraintLayout constraintLayout, ImageView imageView, C0450f c0450f) {
        this.f4089a = constraintLayout;
        this.f4090b = imageView;
        this.c = c0450f;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4089a;
    }
}
