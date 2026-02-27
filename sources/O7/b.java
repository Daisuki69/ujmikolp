package o7;

import N5.C0447e;
import We.s;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.domain.model.OnlinePaymentListItem;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaCreatorStoreFragment;
import defpackage.AbstractC1414e;
import i8.C1593a;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import r7.InterfaceC2190a;
import s7.C2245a;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaCreatorStoreFragment f18809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18810b = new ArrayList();

    public b(MayaCreatorStoreFragment mayaCreatorStoreFragment) {
        this.f18809a = mayaCreatorStoreFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f18810b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((OnlinePaymentListItem) this.f18810b.get(i)).getViewType().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        j.g(holder, "holder");
        if (getItemViewType(i) == OnlinePaymentListItem.VIEW_TYPE.VIEW_TYPE_ITEM.getValue()) {
            Object obj = this.f18810b.get(i);
            j.e(obj, "null cannot be cast to non-null type com.paymaya.domain.model.OnlinePayment");
            OnlinePayment onlinePayment = (OnlinePayment) obj;
            C2245a c2245a = (C2245a) holder;
            c2245a.c = onlinePayment;
            C1593a c1593a = c2245a.f20029a;
            c1593a.getClass();
            InterfaceC2190a interfaceC2190a = (InterfaceC2190a) c1593a.c.get();
            String strMName = onlinePayment.mName();
            j.f(strMName, "mName(...)");
            C2245a c2245a2 = (C2245a) interfaceC2190a;
            c2245a2.getClass();
            c2245a2.f.setText(strMName);
            InterfaceC2190a interfaceC2190a2 = (InterfaceC2190a) c1593a.c.get();
            String strMBackgroundUrl = onlinePayment.mBackgroundUrl();
            if (strMBackgroundUrl == null) {
                strMBackgroundUrl = "";
            }
            C2245a c2245a3 = (C2245a) interfaceC2190a2;
            c2245a3.getClass();
            C.e0(strMBackgroundUrl, c2245a3.f20031d, R.drawable.maya_bg_neon_green_opacity_10);
            InterfaceC2190a interfaceC2190a3 = (InterfaceC2190a) c1593a.c.get();
            String strMIconUrl = onlinePayment.mIconUrl();
            String str = strMIconUrl != null ? strMIconUrl : "";
            C2245a c2245a4 = (C2245a) interfaceC2190a3;
            c2245a4.getClass();
            C.e0(str, c2245a4.e, R.drawable.maya_ic_creator_store_placeholder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        if (i != OnlinePaymentListItem.VIEW_TYPE.VIEW_TYPE_ITEM.getValue()) {
            if (i == OnlinePaymentListItem.VIEW_TYPE.VIEW_TYPE_LOADING.getValue()) {
                return new C1969a(AbstractC1414e.e(parent, R.layout.maya_view_loading, parent, false));
            }
            throw new PayMayaRuntimeException(s.f(i, "Invalid OnlinePaymentAdapter view type "));
        }
        View viewE = AbstractC1414e.e(parent, R.layout.maya_creator_store_view_holder_item, parent, false);
        CardView cardView = (CardView) viewE;
        int i4 = R.id.image_view_creator_store_header_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewE, R.id.image_view_creator_store_header_image);
        if (imageView != null) {
            i4 = R.id.image_view_creator_store_logo;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewE, R.id.image_view_creator_store_logo);
            if (imageView2 != null) {
                i4 = R.id.text_view_creator_store_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewE, R.id.text_view_creator_store_name);
                if (textView != null) {
                    return new C2245a(new C0447e(cardView, cardView, imageView, imageView2, textView, 5), this);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewE.getResources().getResourceName(i4)));
    }
}
