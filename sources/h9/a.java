package H9;

import E9.i;
import N5.k1;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.domain.model.MissionV2;
import kotlin.jvm.internal.j;
import w.C2360b;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f2144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2360b f2145b;
    public MissionV2 c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f2146d;
    public final TextView e;
    public final ProgressBar f;

    public a(k1 k1Var, i iVar) {
        super((ConstraintLayout) k1Var.e);
        this.f2146d = (TextView) k1Var.f4139d;
        this.e = (TextView) k1Var.c;
        ConstraintLayout completedItemContainerLayout = (ConstraintLayout) k1Var.f4138b;
        j.f(completedItemContainerLayout, "completedItemContainerLayout");
        this.f = (ProgressBar) k1Var.f;
        this.f2145b = new C2360b(this, 4);
        this.f2144a = iVar;
        completedItemContainerLayout.setOnClickListener(new Ba.a(this, 11));
    }
}
