package Fd;

import N5.n1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.ui.invest.view.fragment.impl.InvestPreviewFragment;
import kotlin.jvm.internal.j;
import w5.C2383a;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends ListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestPreviewFragment f1573a;

    public a(InvestPreviewFragment investPreviewFragment) {
        super(new C2383a());
        this.f1573a = investPreviewFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Jd.a holder = (Jd.a) viewHolder;
        j.g(holder, "holder");
        Object item = getItem(i);
        j.f(item, "getItem(...)");
        OnlinePayment onlinePayment = (OnlinePayment) item;
        holder.f2510d = onlinePayment;
        Ae.a aVar = holder.c;
        aVar.getClass();
        String strMLogoUrl = onlinePayment.mLogoUrl();
        if (strMLogoUrl != null) {
            Jd.a aVar2 = (Jd.a) ((Id.a) aVar.c.get());
            aVar2.getClass();
            aVar2.itemView.getContext();
            C.d0(aVar2.f2508a.c, strMLogoUrl);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.pma_view_holder_investment_partner, (ViewGroup) null, false);
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.partner_logo);
        if (imageView != null) {
            return new Jd.a(new n1((ConstraintLayout) viewInflate, imageView, 2), this.f1573a);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.partner_logo)));
    }
}
