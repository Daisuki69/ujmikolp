package N5;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3538b;
    public final TextView c;

    public /* synthetic */ A(ConstraintLayout constraintLayout, TextView textView, int i) {
        this.f3537a = i;
        this.f3538b = constraintLayout;
        this.c = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3537a) {
        }
        return this.f3538b;
    }
}
