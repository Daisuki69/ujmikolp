package zc;

import N5.Y0;
import androidx.recyclerview.widget.RecyclerView;
import eb.g;
import kotlin.jvm.internal.j;
import ph.C2070f1;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y0 f21370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f21371b;
    public final C2070f1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Y0 y0, g onSelected) {
        super(y0.f4038b);
        j.g(onSelected, "onSelected");
        this.f21370a = y0;
        this.f21371b = onSelected;
        this.c = new C2070f1(this, 3);
    }
}
