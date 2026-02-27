package N5;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0448e0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4082b;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4083d;

    public C0448e0(ConstraintLayout constraintLayout, Button button, ImageView imageView, TextView textView) {
        this.f4081a = constraintLayout;
        this.f4082b = button;
        this.c = imageView;
        this.f4083d = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4081a;
    }
}
