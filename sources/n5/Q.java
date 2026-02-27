package N5;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3872a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3873b;
    public final RecyclerView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Group f3874d;

    public Q(ConstraintLayout constraintLayout, Group group, RecyclerView recyclerView) {
        this.f3873b = constraintLayout;
        this.f3874d = group;
        this.c = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3872a) {
        }
        return this.f3873b;
    }

    public Q(ConstraintLayout constraintLayout, RecyclerView recyclerView, Group group) {
        this.f3873b = constraintLayout;
        this.c = recyclerView;
        this.f3874d = group;
    }
}
