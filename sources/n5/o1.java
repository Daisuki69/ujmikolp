package N5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class o1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4171b;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4172d;
    public final TextView e;
    public final TextView f;

    public o1(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.f4170a = constraintLayout;
        this.f4171b = constraintLayout2;
        this.c = imageView;
        this.f4172d = textView;
        this.e = textView2;
        this.f = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4170a;
    }
}
