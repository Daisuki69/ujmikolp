package N5;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.paymaya.mayaui.common.view.widget.MultiColorTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class B0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f3552b;
    public final Button c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f3553d;
    public final MultiColorTextView e;
    public final TextView f;

    public B0(ConstraintLayout constraintLayout, Button button, Button button2, ConstraintLayout constraintLayout2, MultiColorTextView multiColorTextView, TextView textView) {
        this.f3551a = constraintLayout;
        this.f3552b = button;
        this.c = button2;
        this.f3553d = constraintLayout2;
        this.e = multiColorTextView;
        this.f = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f3551a;
    }
}
