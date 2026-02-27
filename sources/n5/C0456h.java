package N5;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0456h implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4102b;
    public final ConstraintLayout c;

    public /* synthetic */ C0456h(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, int i) {
        this.f4101a = i;
        this.f4102b = constraintLayout;
        this.c = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4101a) {
        }
        return this.f4102b;
    }
}
