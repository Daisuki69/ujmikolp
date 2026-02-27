package M6;

import N5.C0453g;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.base.MayaBaseFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBaseFragment f3088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f3089b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J5.a f3090d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(C0453g c0453g, J6.a listener) {
        super((ConstraintLayout) c0453g.f4094b);
        kotlin.jvm.internal.j.g(listener, "listener");
        this.f3088a = (MayaBaseFragment) listener;
        this.f3089b = (ImageView) c0453g.c;
        this.c = (TextView) c0453g.f4095d;
        this.f3090d = new J5.a(this, 27);
    }
}
