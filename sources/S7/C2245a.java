package s7;

import N5.C0447e;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.domain.model.OnlinePayment;
import i8.C1593a;
import kotlin.jvm.internal.j;
import o7.b;
import qf.d;
import r7.InterfaceC2190a;

/* JADX INFO: renamed from: s7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2245a extends RecyclerView.ViewHolder implements InterfaceC2190a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1593a f20029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f20030b;
    public OnlinePayment c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f20031d;
    public final ImageView e;
    public final TextView f;

    public C2245a(C0447e c0447e, b bVar) {
        super((CardView) c0447e.f4079b);
        this.f20030b = bVar;
        j.f(this.itemView.getContext(), "getContext(...)");
        this.f20031d = (ImageView) c0447e.f4080d;
        this.e = (ImageView) c0447e.e;
        this.f = (TextView) c0447e.f;
        C1593a c1593a = new C1593a(4);
        this.f20029a = c1593a;
        c1593a.h(this);
        ((CardView) c0447e.c).setOnClickListener(new d(this, 1));
    }
}
