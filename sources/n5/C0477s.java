package N5;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0477s implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4201b;
    public final Button c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f4202d;

    public C0477s(ConstraintLayout constraintLayout, Button button, Button button2, ImageView imageView) {
        this.f4200a = constraintLayout;
        this.f4201b = button;
        this.c = button2;
        this.f4202d = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4200a;
    }
}
