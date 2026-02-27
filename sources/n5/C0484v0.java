package N5;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0484v0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4234b;
    public final ConstraintLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f4235d;
    public final TextView e;

    public C0484v0(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, RecyclerView recyclerView, TextView textView) {
        this.f4233a = constraintLayout;
        this.f4234b = button;
        this.c = constraintLayout2;
        this.f4235d = recyclerView;
        this.e = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4233a;
    }
}
