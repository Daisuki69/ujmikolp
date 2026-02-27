package N5;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4191b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4192d;

    public r(Button button, TextView textView, TextView textView2, ConstraintLayout constraintLayout) {
        this.f4190a = constraintLayout;
        this.f4191b = button;
        this.c = textView;
        this.f4192d = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4190a;
    }
}
