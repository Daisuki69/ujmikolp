package I7;

import A5.l;
import N5.u1;
import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends RecyclerView.ViewHolder implements H7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D7.h f2254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2255b;
    public final ConstraintLayout c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Guideline f2256d;
    public final Guideline e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f2257g;
    public final TextView h;
    public final Context i;
    public final l j;

    public k(u1 u1Var, D7.h hVar) {
        super(u1Var.f4227b);
        this.f2254a = hVar;
        this.f2255b = true;
        ConstraintLayout viewHolderContainer = u1Var.h;
        kotlin.jvm.internal.j.f(viewHolderContainer, "viewHolderContainer");
        this.c = viewHolderContainer;
        this.f2256d = u1Var.f4228d;
        this.e = u1Var.c;
        this.f = u1Var.e;
        this.f2257g = u1Var.f4229g;
        this.h = u1Var.f;
        Context context = viewHolderContainer.getContext();
        kotlin.jvm.internal.j.f(context, "getContext(...)");
        this.i = context;
        this.j = new l(this);
    }

    @Override // H7.c
    public final Locale a() {
        return this.i.getResources().getConfiguration().locale;
    }

    @Override // H7.c
    public final void b(String str) {
        this.h.setText(str);
    }

    @Override // H7.c
    public final void c() {
        int dimensionPixelSize = this.i.getResources().getDimensionPixelSize(R.dimen.maya_margin_normal);
        this.f2256d.setGuidelineBegin(dimensionPixelSize);
        this.e.setGuidelineEnd(dimensionPixelSize);
    }

    @Override // H7.c
    public final void d(String str) {
        this.f.setText(str);
    }

    @Override // H7.c
    public final void e() {
        int dimensionPixelSize = this.i.getResources().getDimensionPixelSize(R.dimen.maya_margin_large);
        this.f2256d.setGuidelineBegin(dimensionPixelSize);
        this.e.setGuidelineEnd(dimensionPixelSize);
    }

    @Override // H7.c
    public final void f(String str) {
        this.f2257g.setText(str);
    }
}
