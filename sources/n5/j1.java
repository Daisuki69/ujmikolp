package N5;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class j1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f4128b;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4129d;
    public final TextView e;

    public j1(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.f4127a = constraintLayout;
        this.f4128b = frameLayout;
        this.c = imageView;
        this.f4129d = textView;
        this.e = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4127a;
    }
}
