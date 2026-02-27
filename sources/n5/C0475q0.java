package N5;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0475q0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4184b;
    public final Button c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f4185d;
    public final ConstraintLayout e;
    public final ImageView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f4186g;

    public C0475q0(ConstraintLayout constraintLayout, Button button, Button button2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, TextView textView) {
        this.f4183a = constraintLayout;
        this.f4184b = button;
        this.c = button2;
        this.f4185d = constraintLayout2;
        this.e = constraintLayout3;
        this.f = imageView;
        this.f4186g = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4183a;
    }
}
