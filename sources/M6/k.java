package M6;

import N5.C0435a;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.base.MayaBaseFragment;
import w.C2360b;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBaseFragment f3117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f3118b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3119d;
    public final ImageView e;
    public final C2360b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3120g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(C0435a c0435a, J6.a listener) {
        super((ConstraintLayout) c0435a.f4047b);
        kotlin.jvm.internal.j.g(listener, "listener");
        this.f3117a = (MayaBaseFragment) listener;
        this.f3118b = (ImageView) c0435a.c;
        this.c = (TextView) c0435a.f4049g;
        this.f3119d = (TextView) c0435a.e;
        this.e = (ImageView) c0435a.f4048d;
        this.f = new C2360b(this, 29);
    }
}
