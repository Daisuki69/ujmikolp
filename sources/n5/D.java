package N5;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.liaoinstan.springview.widget.SpringView;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3576a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f3577b;
    public final SpringView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f3578d;

    public D(ConstraintLayout constraintLayout, RecyclerView recyclerView, SpringView springView) {
        this.f3577b = constraintLayout;
        this.f3578d = recyclerView;
        this.c = springView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3576a) {
        }
        return this.f3577b;
    }

    public D(ConstraintLayout constraintLayout, SpringView springView, RecyclerView recyclerView) {
        this.f3577b = constraintLayout;
        this.c = springView;
        this.f3578d = recyclerView;
    }
}
