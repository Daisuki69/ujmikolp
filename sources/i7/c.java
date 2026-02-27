package I7;

import N5.C0450f;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.domain.model.DynamicStatusBadge;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.ViewHolder implements H7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D7.b f2223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f2224b;
    public final AppCompatImageButton c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DynamicStatusBadge f2225d;
    public final A7.i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C0450f c0450f, D7.b listener) {
        super((ConstraintLayout) c0450f.c);
        kotlin.jvm.internal.j.g(listener, "listener");
        this.f2223a = listener;
        this.f2224b = (TextView) c0450f.f4088d;
        this.c = (AppCompatImageButton) c0450f.f4087b;
        this.e = new A7.i(this);
    }
}
