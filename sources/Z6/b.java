package Z6;

import G6.w;
import N5.C0455g1;
import Q6.n;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f6893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f6894b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f6895d;
    public final w e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C0455g1 c0455g1, n mViewHolder) {
        super(c0455g1.f4099b);
        j.g(mViewHolder, "mViewHolder");
        this.f6893a = mViewHolder;
        ConstraintLayout constraintLayoutChoicesContainer = c0455g1.c;
        j.f(constraintLayoutChoicesContainer, "constraintLayoutChoicesContainer");
        this.f6894b = constraintLayoutChoicesContainer;
        this.c = c0455g1.e;
        this.f6895d = c0455g1.f4100d;
        this.e = new w(this, 24);
    }
}
