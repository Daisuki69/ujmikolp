package M6;

import N5.C0453g;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaCashInFragment f3106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f3107b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J5.c f3108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C0453g c0453g, MayaCashInFragment listener) {
        super((CardView) c0453g.f4094b);
        kotlin.jvm.internal.j.g(listener, "listener");
        this.f3106a = listener;
        this.f3107b = (ImageView) c0453g.c;
        this.c = (TextView) c0453g.f4095d;
        this.f3108d = new J5.c(this, 29);
    }
}
