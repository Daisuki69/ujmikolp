package N5;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0481u implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4219b;

    public C0481u(ConstraintLayout constraintLayout, Button button) {
        this.f4218a = constraintLayout;
        this.f4219b = button;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4218a;
    }
}
