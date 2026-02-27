package N5;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class p1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4179b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4180d;
    public final TextView e;

    public p1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.f4178a = constraintLayout;
        this.f4179b = constraintLayout2;
        this.c = textView;
        this.f4180d = textView2;
        this.e = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4178a;
    }
}
