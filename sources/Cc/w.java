package cc;

import N5.C0435a;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPageFragment;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ac.w f9357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T3.l f9358b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ShopProvider f9359d;
    public final ImageView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f9360g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C0435a c0435a, FragmentActivity fragmentActivity, ac.w wVar) {
        super((ConstraintLayout) c0435a.f4047b);
        kotlin.jvm.internal.j.g(fragmentActivity, numX49.tnTj78("btQP"));
        this.f9357a = wVar;
        this.c = -1;
        ConstraintLayout constraintLayout = (ConstraintLayout) c0435a.c;
        kotlin.jvm.internal.j.f(constraintLayout, numX49.tnTj78("btQb"));
        this.e = (ImageView) c0435a.f4048d;
        this.f = (TextView) c0435a.f4049g;
        this.f9360g = (ImageView) c0435a.e;
        this.f9358b = new T3.l(this, 11);
        constraintLayout.setOnClickListener(new Y6.o(this, 14));
    }

    public static final void D(w wVar) {
        ac.w wVar2 = wVar.f9357a;
        if (wVar2 != null) {
            int i = wVar.c;
            ShopProvider shopProvider = wVar.f9359d;
            MayaShopPageFragment mayaShopPageFragment = wVar2.f7120b;
            String strH = AbstractC1414e.h(numX49.tnTj78("btQr"), mayaShopPageFragment.w0.toLowerCase(Locale.getDefault()).replace(numX49.tnTj78("btQ2"), numX49.tnTj78("btQL")));
            InterfaceC1096i interfaceC1096i = mayaShopPageFragment.t0;
            if (interfaceC1096i != null) {
                ((MayaShopV2Activity) interfaceC1096i).getIntent().putExtra(numX49.tnTj78("btQZ"), strH);
            }
            InterfaceC1096i interfaceC1096i2 = mayaShopPageFragment.t0;
            if (interfaceC1096i2 != null) {
                kotlin.jvm.internal.j.d(shopProvider);
                MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) interfaceC1096i2;
                mayaShopV2Activity.n1();
                Intent intent = new Intent(mayaShopV2Activity.getApplicationContext(), (Class<?>) MayaShopV2Activity.class);
                intent.setData(mayaShopV2Activity.getIntent().getData());
                intent.putExtra(numX49.tnTj78("btQk"), numX49.tnTj78("btQB"));
                intent.putExtra(numX49.tnTj78("btQu"), numX49.tnTj78("btQV"));
                intent.putExtra(numX49.tnTj78("btQS"), shopProvider);
                B5.i.w0(mayaShopV2Activity, intent);
                B5.i.v0(mayaShopV2Activity, intent);
                mayaShopV2Activity.startActivityForResult(intent, 500);
            }
            boolean zIsShopEventsV2Enabled = mayaShopPageFragment.t1().e().isShopEventsV2Enabled();
            String strTnTj78 = numX49.tnTj78("btQj");
            if (zIsShopEventsV2Enabled) {
                C1219h c1219hE = C1219h.e(AbstractC1213b.q(2));
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                String name = shopProvider != null ? shopProvider.getName() : null;
                if (name != null) {
                    c1219hE.j.put(numX49.tnTj78("btQd"), name);
                }
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                String displayName = shopProvider != null ? shopProvider.getDisplayName() : null;
                if (displayName != null) {
                    c1219hE.j.put(numX49.tnTj78("btQi"), displayName);
                }
                c1219hE.j.put(strTnTj78, mayaShopPageFragment.w0);
                mayaShopPageFragment.o1().b(c1219hE);
                return;
            }
            C1220i c1220iO1 = mayaShopPageFragment.o1();
            FragmentActivity activity = mayaShopPageFragment.getActivity();
            C1219h c1219hD = C1219h.d(mayaShopPageFragment.f14012B0);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.PROVIDER);
            EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
            String str = mayaShopPageFragment.w0;
            HashMap map = c1219hD.j;
            map.put(strTnTj78, str);
            map.put(numX49.tnTj78("btQE"), shopProvider != null ? shopProvider.getName() : null);
            map.put(numX49.tnTj78("btQF"), shopProvider != null ? shopProvider.getId() : null);
            map.put(numX49.tnTj78("btQH"), String.valueOf(i + 1));
            map.put(numX49.tnTj78("btQO"), String.valueOf(1));
            map.put(numX49.tnTj78("btQQ"), strH);
            map.put(numX49.tnTj78("btQt"), numX49.tnTj78("btQU"));
            c1220iO1.c(activity, c1219hD);
        }
    }
}
