package N8;

import M8.M1;
import N5.k1;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f4333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M1 f4334b;
    public final J5.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k1 k1Var, M1 onSelected) {
        super((LinearLayout) k1Var.e);
        j.g(onSelected, "onSelected");
        this.f4333a = k1Var;
        this.f4334b = onSelected;
        this.c = new J5.a(this, 17);
    }
}
