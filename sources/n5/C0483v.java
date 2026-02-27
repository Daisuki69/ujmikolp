package N5;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0483v implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4231b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4232d;

    public C0483v(Button button, TextView textView, TextView textView2, ConstraintLayout constraintLayout) {
        this.f4230a = constraintLayout;
        this.f4231b = button;
        this.c = textView;
        this.f4232d = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4230a;
    }
}
