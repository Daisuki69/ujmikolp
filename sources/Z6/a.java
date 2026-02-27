package Z6;

import N5.C0452f1;
import Q6.n;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f6891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f6892b;
    public final Gc.h c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C0452f1 c0452f1, n mViewHolder) {
        super(c0452f1.f4092b);
        j.g(mViewHolder, "mViewHolder");
        this.f6891a = mViewHolder;
        this.f6892b = c0452f1.c;
        this.c = new Gc.h(this, 25);
    }
}
