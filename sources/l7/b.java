package l7;

import B5.i;
import S5.c;
import Uh.d;
import android.content.Intent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.R;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.AvailabilityConfig;
import com.paymaya.domain.model.MaintenanceDate;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.domain.model.OnlinePaymentListItem;
import com.paymaya.domain.store.C1280q0;
import com.paymaya.mayaui.common.view.activity.impl.MayaServiceUnavailableActivity;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.creatorstore.view.activity.impl.MayaCreatorStoreActivity;
import com.paymaya.mayaui.creatorstore.view.fragment.impl.MayaCreatorStoreFragment;
import com.paymaya.mayaui.funds.view.activity.impl.FundsActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import m7.InterfaceC1853a;
import p7.InterfaceC2015a;
import t7.C2277a;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC2509a implements k7.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1280q0 f18251d;
    public final com.paymaya.data.preference.a e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f18252g;
    public boolean h;
    public boolean i;
    public ArrayList j;

    public b(C1280q0 c1280q0, com.paymaya.data.preference.a aVar, c cVar, d dVar) {
        super(dVar);
        this.f18251d = c1280q0;
        this.e = aVar;
        this.f = cVar;
        this.i = true;
        this.j = new ArrayList();
    }

    public final void k() {
        ((MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get())).O1();
        this.f18251d.a(this.f18252g);
    }

    public final void l(String str) {
        if (C.Y(str)) {
            q7.b bVar = ((MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get())).f12117x0;
            if (bVar != null) {
                MayaCreatorStoreActivity mayaCreatorStoreActivity = (MayaCreatorStoreActivity) bVar;
                mayaCreatorStoreActivity.n1();
                i.l(mayaCreatorStoreActivity, str, AttributionSource.f10368d);
                return;
            }
            return;
        }
        MayaCreatorStoreFragment mayaCreatorStoreFragment = (MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get());
        if (str == null) {
            mayaCreatorStoreFragment.getClass();
            return;
        }
        q7.b bVar2 = mayaCreatorStoreFragment.f12117x0;
        if (bVar2 != null) {
            ((MayaCreatorStoreActivity) bVar2).Z1(str, "");
        }
    }

    public final void m(OnlinePayment onlinePayment) {
        String str;
        j.g(onlinePayment, "onlinePayment");
        if (!onlinePayment.isAvailable()) {
            MaintenanceDate maintenanceDateMMaintenance = onlinePayment.mMaintenance();
            if (maintenanceDateMMaintenance != null) {
                InterfaceC2015a interfaceC2015a = (InterfaceC2015a) this.c.get();
                String strMMessage = maintenanceDateMMaintenance.mMessage();
                j.f(strMMessage, "mMessage(...)");
                MayaCreatorStoreFragment mayaCreatorStoreFragment = (MayaCreatorStoreFragment) interfaceC2015a;
                mayaCreatorStoreFragment.getClass();
                q7.b bVar = mayaCreatorStoreFragment.f12117x0;
                if (bVar != null) {
                    String string = mayaCreatorStoreFragment.getString(R.string.maya_label_thats_not_it);
                    j.f(string, "getString(...)");
                    MayaCreatorStoreActivity mayaCreatorStoreActivity = (MayaCreatorStoreActivity) bVar;
                    C.Q(mayaCreatorStoreActivity, mayaCreatorStoreActivity.getCurrentFocus());
                    M2.b.Z(2131231347, string, strMMessage, null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT).show(mayaCreatorStoreActivity.getSupportFragmentManager(), "error_dialog");
                    return;
                }
                return;
            }
            return;
        }
        if (onlinePayment.isInternal()) {
            InterfaceC2015a interfaceC2015a2 = (InterfaceC2015a) this.c.get();
            String strMExternalLink = onlinePayment.mExternalLink();
            j.f(strMExternalLink, "mExternalLink(...)");
            String strMName = onlinePayment.mName();
            j.f(strMName, "mName(...)");
            MayaCreatorStoreFragment mayaCreatorStoreFragment2 = (MayaCreatorStoreFragment) interfaceC2015a2;
            mayaCreatorStoreFragment2.getClass();
            q7.b bVar2 = mayaCreatorStoreFragment2.f12117x0;
            if (bVar2 != null) {
                ((MayaCreatorStoreActivity) bVar2).Z1(strMExternalLink, strMName);
                return;
            }
            return;
        }
        if (onlinePayment.isMiniApp()) {
            if (!j.b(this.e.l(), "kyc1") && onlinePayment.isKycRequired()) {
                q7.b bVar3 = ((MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get())).f12117x0;
                if (bVar3 != null) {
                    ((MayaCreatorStoreActivity) bVar3).Y1();
                    return;
                }
                return;
            }
            InterfaceC2015a interfaceC2015a3 = (InterfaceC2015a) this.c.get();
            String strMCode = onlinePayment.mCode();
            str = strMCode != null ? strMCode : "";
            String strMName2 = onlinePayment.mName();
            j.f(strMName2, "mName(...)");
            MayaCreatorStoreFragment mayaCreatorStoreFragment3 = (MayaCreatorStoreFragment) interfaceC2015a3;
            mayaCreatorStoreFragment3.getClass();
            q7.b bVar4 = mayaCreatorStoreFragment3.f12117x0;
            if (bVar4 != null) {
                MayaCreatorStoreActivity mayaCreatorStoreActivity2 = (MayaCreatorStoreActivity) ((InterfaceC1853a) ((MayaCreatorStoreActivity) bVar4).V1().c.get());
                mayaCreatorStoreActivity2.getClass();
                mayaCreatorStoreActivity2.n1();
                Intent intentS0 = i.s0(mayaCreatorStoreActivity2);
                intentS0.putExtra("allowed_as_in_house_url", true);
                intentS0.putExtra("code", str);
                intentS0.putExtra("title", strMName2);
                intentS0.putExtra("has_session", true);
                intentS0.putExtra("can_landscape_mode", true);
                mayaCreatorStoreActivity2.startActivity(intentS0);
                return;
            }
            return;
        }
        if (!onlinePayment.isFlutter()) {
            InterfaceC2015a interfaceC2015a4 = (InterfaceC2015a) this.c.get();
            String strMExternalLink2 = onlinePayment.mExternalLink();
            j.f(strMExternalLink2, "mExternalLink(...)");
            MayaCreatorStoreFragment mayaCreatorStoreFragment4 = (MayaCreatorStoreFragment) interfaceC2015a4;
            mayaCreatorStoreFragment4.getClass();
            q7.b bVar5 = mayaCreatorStoreFragment4.f12117x0;
            if (bVar5 != null) {
                MayaCreatorStoreActivity mayaCreatorStoreActivity3 = (MayaCreatorStoreActivity) bVar5;
                mayaCreatorStoreActivity3.n1();
                i.f(mayaCreatorStoreActivity3, strMExternalLink2);
                return;
            }
            return;
        }
        InterfaceC2015a interfaceC2015a5 = (InterfaceC2015a) this.c.get();
        String strMCode2 = onlinePayment.mCode();
        str = strMCode2 != null ? strMCode2 : "";
        MayaCreatorStoreFragment mayaCreatorStoreFragment5 = (MayaCreatorStoreFragment) interfaceC2015a5;
        mayaCreatorStoreFragment5.getClass();
        q7.b bVar6 = mayaCreatorStoreFragment5.f12117x0;
        if (bVar6 != null) {
            M7.a aVarV1 = ((MayaCreatorStoreActivity) bVar6).V1();
            if (str.equals("seedbox") && aVarV1.e.e().isFundsEnabled()) {
                if (aVarV1.e.e().isFundsAvailable()) {
                    if (!j.b(aVarV1.e.l(), "kyc1")) {
                        ((MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get())).Y1();
                        return;
                    }
                    MayaCreatorStoreActivity mayaCreatorStoreActivity4 = (MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get());
                    mayaCreatorStoreActivity4.n1();
                    Intent intent = new Intent(mayaCreatorStoreActivity4, (Class<?>) FundsActivity.class);
                    intent.setData(mayaCreatorStoreActivity4.getIntent().getData());
                    mayaCreatorStoreActivity4.startActivity(intent);
                    return;
                }
                AvailabilityConfig availabilityConfigMFundsAvailability = aVarV1.e.e().mMaintenanceConfig().mServiceAvailabilityConfig().mFundsAvailability();
                String strMMessage2 = availabilityConfigMFundsAvailability != null ? availabilityConfigMFundsAvailability.mMessage() : null;
                MayaCreatorStoreActivity mayaCreatorStoreActivity5 = (MayaCreatorStoreActivity) ((InterfaceC1853a) aVarV1.c.get());
                mayaCreatorStoreActivity5.n1();
                String string2 = mayaCreatorStoreActivity5.getString(R.string.maya_label_service_funds);
                Intent intent2 = new Intent(mayaCreatorStoreActivity5, (Class<?>) MayaServiceUnavailableActivity.class);
                intent2.putExtra("unavailable_page_title", string2);
                intent2.putExtra("unavailable_description", strMMessage2);
                mayaCreatorStoreActivity5.startActivity(intent2);
            }
        }
    }

    public final void n() {
        MayaCarousel mayaCarousel = ((MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get())).f12109A0;
        if (j.b(mayaCarousel != null ? Boolean.valueOf(mayaCarousel.f12022o0) : null, Boolean.TRUE)) {
            NestedScrollView nestedScrollView = ((MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get())).f12113q0;
            if (nestedScrollView == null) {
                j.n("mViewGroupEmptyPartners");
                throw null;
            }
            if (nestedScrollView.getVisibility() == 0) {
                return;
            }
            MayaCreatorStoreFragment mayaCreatorStoreFragment = (MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get());
            MayaCarousel mayaCarousel2 = mayaCreatorStoreFragment.f12109A0;
            if (mayaCarousel2 != null) {
                mayaCarousel2.setVisibility(0);
            }
            MayaCarousel mayaCarousel3 = mayaCreatorStoreFragment.f12109A0;
            if (mayaCarousel3 != null) {
                mayaCarousel3.k();
            }
        }
    }

    public final void o(List onlinePayments) {
        j.g(onlinePayments, "onlinePayments");
        List list = onlinePayments;
        this.j = new ArrayList(list);
        if (list.isEmpty()) {
            if (this.h) {
                ((MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get())).L1();
                MayaCreatorStoreFragment mayaCreatorStoreFragment = (MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get());
                NestedScrollView nestedScrollView = mayaCreatorStoreFragment.f12113q0;
                if (nestedScrollView == null) {
                    j.n("mViewGroupEmptyPartners");
                    throw null;
                }
                nestedScrollView.setVisibility(0);
                mayaCreatorStoreFragment.m1().r(EnumC1216e.EMPTY);
                ((MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get())).R1().setVisibility(8);
                ((MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get())).T1();
                ((MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get())).S1();
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (!this.h) {
            arrayList.add(new OnlinePaymentListItem.OnlinePaymentLoading());
        }
        MayaCreatorStoreFragment mayaCreatorStoreFragment2 = (MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get());
        mayaCreatorStoreFragment2.getClass();
        o7.b bVar = mayaCreatorStoreFragment2.y0;
        if (bVar != null) {
            ArrayList arrayList2 = bVar.f18810b;
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new C2277a(arrayList2, arrayList));
            j.f(diffResultCalculateDiff, "calculateDiff(...)");
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            diffResultCalculateDiff.dispatchUpdatesTo(bVar);
        }
        mayaCreatorStoreFragment2.P1();
        MayaCreatorStoreFragment mayaCreatorStoreFragment3 = (MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get());
        NestedScrollView nestedScrollView2 = mayaCreatorStoreFragment3.f12113q0;
        if (nestedScrollView2 == null) {
            j.n("mViewGroupEmptyPartners");
            throw null;
        }
        nestedScrollView2.setVisibility(8);
        mayaCreatorStoreFragment3.m1().r(null);
        ((MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get())).R1().setVisibility(0);
        ((MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get())).T1();
        ((MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get())).L1();
        MayaCarousel mayaCarousel = ((MayaCreatorStoreFragment) ((InterfaceC2015a) this.c.get())).f12109A0;
        if (mayaCarousel == null || !mayaCarousel.f12022o0) {
            return;
        }
        mayaCarousel.setVisibility(0);
    }
}
