package N8;

import N5.q1;
import We.A;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f4330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f4331b;
    public final J5.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q1 q1Var, A picasso) {
        super(q1Var.f4188b);
        j.g(picasso, "picasso");
        this.f4330a = q1Var;
        this.f4331b = picasso;
        this.c = new J5.a(this, 14);
    }
}
