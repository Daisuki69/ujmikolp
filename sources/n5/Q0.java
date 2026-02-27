package N5;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class Q0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3876b;
    public final ConstraintLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f3877d;

    public /* synthetic */ Q0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, int i) {
        this.f3875a = i;
        this.f3876b = constraintLayout;
        this.c = constraintLayout2;
        this.f3877d = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3875a) {
        }
        return this.f3876b;
    }
}
