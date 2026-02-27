package N5;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class z1 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f4318b;
    public final ConstraintLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f4319d;

    public /* synthetic */ z1(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, int i) {
        this.f4317a = i;
        this.f4318b = constraintLayout;
        this.c = constraintLayout2;
        this.f4319d = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f4317a) {
        }
        return this.f4318b;
    }
}
