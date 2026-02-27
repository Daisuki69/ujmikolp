package N5;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0470o implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4167b;
    public final Button c;

    public C0470o(ConstraintLayout constraintLayout, Button button, Button button2) {
        this.f4166a = constraintLayout;
        this.f4167b = button;
        this.c = button2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4166a;
    }
}
