package N5;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class T implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f3921b;
    public final Z c;

    public T(ConstraintLayout constraintLayout, E e, Z z4) {
        this.f3920a = constraintLayout;
        this.f3921b = e;
        this.c = z4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f3920a;
    }
}
