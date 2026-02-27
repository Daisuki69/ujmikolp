package gc;

import D7.c;
import Kh.B;
import Kh.C0310o;
import Kh.z;
import N5.G0;
import Uh.d;
import android.content.Intent;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import cj.C1132s;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.data.database.repository.x;
import com.paymaya.data.database.repository.y;
import com.paymaya.domain.model.AvailabilityConfig;
import com.paymaya.domain.model.SecondaryFeature;
import com.paymaya.domain.store.C1280q0;
import com.paymaya.domain.store.L;
import com.paymaya.domain.store.T;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelHomeFragment;
import fc.InterfaceC1481a;
import java.util.List;
import kc.b;
import kotlin.jvm.internal.j;
import n3.C1916a;
import y5.AbstractC2509a;

/* JADX INFO: renamed from: gc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1516a extends AbstractC2509a implements InterfaceC1481a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f16799d;
    public final C1280q0 e;
    public List f;

    public C1516a(com.paymaya.data.preference.a aVar, C1280q0 c1280q0, d dVar) {
        super(dVar);
        this.f16799d = aVar;
        this.e = c1280q0;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        Intent intent;
        Intent intent2;
        Intent intent3;
        super.j();
        if (!this.f16799d.e().isTravelAvailable()) {
            AvailabilityConfig availabilityConfigMTravelAvailability = this.f16799d.e().mMaintenanceConfig().mServiceAvailabilityConfig().mTravelAvailability();
            String strMMessage = availabilityConfigMTravelAvailability != null ? availabilityConfigMTravelAvailability.mMessage() : null;
            b bVar = ((MayaTravelHomeFragment) ((jc.b) this.c.get())).f14199c0;
            if (bVar != null) {
                AbstractC1236z.g((MayaTravelActivity) bVar, R.id.frame_layout_container, M2.b.a0(strMMessage, 3));
                return;
            }
            return;
        }
        jc.b bVar2 = (jc.b) this.c.get();
        String string = ((MayaTravelHomeFragment) ((jc.b) this.c.get())).getString(R.string.maya_label_travel_p2p_train);
        j.f(string, "getString(...)");
        String string2 = ((MayaTravelHomeFragment) ((jc.b) this.c.get())).getString(R.string.maya_label_travel_airfare);
        j.f(string2, "getString(...)");
        String string3 = ((MayaTravelHomeFragment) ((jc.b) this.c.get())).getString(R.string.maya_label_travel_toll);
        j.f(string3, "getString(...)");
        List travelServices = C1132s.g(SecondaryFeature.sBuilder().mId("p2p_train").mLabel(string).mImageResource(R.drawable.maya_ic_service_train).build(), SecondaryFeature.sBuilder().mId("airfare").mLabel(string2).mImageResource(R.drawable.maya_ic_service_plane).build(), SecondaryFeature.sBuilder().mId("toll").mLabel(string3).mImageResource(R.drawable.maya_ic_service_toll).build());
        MayaTravelHomeFragment mayaTravelHomeFragment = (MayaTravelHomeFragment) bVar2;
        mayaTravelHomeFragment.getClass();
        j.g(travelServices, "travelServices");
        c cVar = mayaTravelHomeFragment.f14200d0;
        if (cVar != null) {
            cVar.e(travelServices);
        }
        C1280q0 c1280q0 = this.e;
        c1280q0.getClass();
        M5.a aVar = new M5.a(2);
        aVar.f3080b = "transport";
        y yVar = c1280q0.e;
        B bE = new z(yVar.f11328a.d("online_payment", aVar), new x(yVar, 0), 0).e(zh.b.a());
        T t5 = new T(this, 9);
        C1916a c1916a = Eh.d.c;
        mg.c cVar2 = Eh.d.f1365b;
        e(new C0310o(bE, t5, c1916a, cVar2).f());
        e(new C0310o(this.e.f.e(zh.b.a()), new L(this, 10), c1916a, cVar2).f());
        G0 g02 = ((MayaTravelHomeFragment) ((jc.b) this.c.get())).f14196Z;
        if (g02 == null) {
            j.n("mViewFeaturedPartnersLoading");
            throw null;
        }
        g02.f3627b.setVisibility(0);
        Group group = ((MayaTravelHomeFragment) ((jc.b) this.c.get())).f14195Y;
        if (group == null) {
            j.n("mGroupFeaturedPartners");
            throw null;
        }
        group.setVisibility(8);
        this.e.a("transport");
        FragmentActivity activity = ((MayaTravelHomeFragment) ((jc.b) this.c.get())).getActivity();
        int iW = C.w((activity == null || (intent3 = activity.getIntent()) == null) ? null : intent3.getDataString());
        if (45 == iW) {
            FragmentActivity activity2 = ((MayaTravelHomeFragment) ((jc.b) this.c.get())).getActivity();
            if (activity2 == null || (intent2 = activity2.getIntent()) == null) {
                return;
            }
            intent2.setData(null);
            return;
        }
        if (44 == iW) {
            FragmentActivity activity3 = ((MayaTravelHomeFragment) ((jc.b) this.c.get())).getActivity();
            if (activity3 != null && (intent = activity3.getIntent()) != null) {
                intent.setData(null);
            }
            b bVar3 = ((MayaTravelHomeFragment) ((jc.b) this.c.get())).f14199c0;
            if (bVar3 != null) {
                ((MayaTravelActivity) bVar3).X1();
            }
        }
    }
}
