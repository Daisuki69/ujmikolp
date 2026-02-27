package N5;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0439b0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f4059b;
    public final Button c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f4060d;
    public final NestedScrollView e;
    public final RecyclerView f;

    public C0439b0(ConstraintLayout constraintLayout, LinearLayout linearLayout, Button button, Button button2, NestedScrollView nestedScrollView, RecyclerView recyclerView) {
        this.f4058a = constraintLayout;
        this.f4059b = linearLayout;
        this.c = button;
        this.f4060d = button2;
        this.e = nestedScrollView;
        this.f = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4058a;
    }
}
