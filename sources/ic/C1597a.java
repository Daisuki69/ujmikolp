package ic;

import N5.t1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.H;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelHomeFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import lc.C1825b;
import zj.C2576A;

/* JADX INFO: renamed from: ic.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1597a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaTravelHomeFragment f17129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17130b = new ArrayList();

    public C1597a(MayaTravelHomeFragment mayaTravelHomeFragment) {
        this.f17129a = mayaTravelHomeFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f17130b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1825b c1825b = (C1825b) viewHolder;
        j.g(c1825b, numX49.tnTj78("bSmP"));
        OnlinePayment onlinePayment = (OnlinePayment) this.f17130b.get(i);
        j.g(onlinePayment, numX49.tnTj78("bSmb"));
        C1825b c1825b2 = (C1825b) c1825b.e.f11441b;
        String strMLogoUrl = onlinePayment.mLogoUrl();
        ImageView imageView = c1825b2.f18291d;
        ImageView imageView2 = c1825b2.c;
        if (strMLogoUrl == null || C2576A.H(strMLogoUrl)) {
            imageView2.setVisibility(8);
            imageView.setVisibility(0);
        } else {
            String strMLogoUrl2 = onlinePayment.mLogoUrl();
            imageView2.setVisibility(0);
            imageView.setVisibility(8);
            c1825b2.itemView.getContext();
            C.d0(imageView2, strMLogoUrl2);
        }
        c1825b.f18290b.setOnClickListener(new H(3, c1825b, onlinePayment));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.g(viewGroup, numX49.tnTj78("bSm2"));
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.maya_view_holder_travel_partner_merchant, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i4 = R.id.image_view_default_travel_partner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_default_travel_partner);
        if (imageView != null) {
            i4 = R.id.image_view_travel_partner;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_travel_partner);
            if (imageView2 != null) {
                return new C1825b(new t1(constraintLayout, constraintLayout, imageView, imageView2, 0), this.f17129a);
            }
        }
        throw new NullPointerException(numX49.tnTj78("bSmL").concat(viewInflate.getResources().getResourceName(i4)));
    }
}
