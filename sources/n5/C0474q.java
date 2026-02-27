package N5;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0474q implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4182b;
    public final Button c;

    public C0474q(ConstraintLayout constraintLayout, Button button, Button button2) {
        this.f4181a = constraintLayout;
        this.f4182b = button;
        this.c = button2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4181a;
    }
}
