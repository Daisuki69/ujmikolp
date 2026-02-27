package N5;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: renamed from: N5.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0486w0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f4253b;
    public final LinearLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f4254d;

    public C0486w0(ConstraintLayout constraintLayout, Button button, LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f4252a = constraintLayout;
        this.f4253b = button;
        this.c = linearLayout;
        this.f4254d = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f4252a;
    }
}
