package N5;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0472p implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4174b;
    public final Button c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f4175d;

    public C0472p(ConstraintLayout constraintLayout, Button button, Button button2, ImageView imageView) {
        this.f4173a = constraintLayout;
        this.f4174b = button;
        this.c = button2;
        this.f4175d = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4173a;
    }
}
