package dc;

import N5.G0;
import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cc.InterfaceC1094g;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.mayaui.load.view.activity.impl.MayaLoadActivity;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaShopHomePageFragment f16321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U8.c f16322b;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(G0 g02, com.paymaya.data.preference.a mPreference, C1220i mAnalyticsUtils, MayaShopHomePageFragment mayaShopHomePageFragment) {
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(mAnalyticsUtils, "mAnalyticsUtils");
        ConstraintLayout constraintLayout = g02.f3627b;
        super(constraintLayout);
        this.f16321a = mayaShopHomePageFragment;
        this.f16322b = new U8.c(this, mPreference, mAnalyticsUtils);
        constraintLayout.setOnClickListener(new Y6.o(this, 18));
    }

    public static final void D(h hVar) {
        InterfaceC1094g interfaceC1094g;
        U8.c cVar = hVar.f16322b;
        if (((com.paymaya.data.preference.a) cVar.c).e().isShopEventsV2Enabled()) {
            C1219h c1219hE = C1219h.e(AbstractC1213b.q(11));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hE.j;
            map.put("button", "Airtime Banner");
            map.put("page", "Home");
            ((C1220i) cVar.f5965d).b(c1219hE);
        }
        MayaShopHomePageFragment mayaShopHomePageFragment = ((h) cVar.f5964b).f16321a;
        if (mayaShopHomePageFragment == null || (interfaceC1094g = mayaShopHomePageFragment.w0) == null) {
            return;
        }
        MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) interfaceC1094g;
        mayaShopV2Activity.n1();
        Intent intent = new Intent(mayaShopV2Activity, (Class<?>) MayaLoadActivity.class);
        intent.putExtra("sub_route", "");
        intent.setData(mayaShopV2Activity.getIntent().getData());
        mayaShopV2Activity.startActivity(intent);
    }
}
