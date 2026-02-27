package N5;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0488x0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4262b;
    public final C0437a1 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q0 f4263d;

    public C0488x0(ConstraintLayout constraintLayout, Button button, C0437a1 c0437a1, Q0 q02) {
        this.f4261a = constraintLayout;
        this.f4262b = button;
        this.c = c0437a1;
        this.f4263d = q02;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4261a;
    }
}
