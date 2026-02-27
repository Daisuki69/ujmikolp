package G6;

import Kh.C0310o;
import Kh.z;
import N5.C0462k;
import N5.D1;
import N5.I;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.AvailabilityConfig;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1260g0;
import com.paymaya.domain.store.C1262h0;
import com.paymaya.domain.store.C1273n;
import com.paymaya.domain.store.E;
import com.paymaya.domain.store.W0;
import com.paymaya.domain.store.X;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaBankPullV2Activity;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCardPullV2Activity;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullV2Fragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaVaultedCardsFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaWesternUnionFragment;
import com.paymaya.ui.dashboard.view.fragment.impl.UserActivityFragment;
import com.paymaya.ui.sendmoney.view.fragment.impl.SendMoneyCardFragment;
import d4.AbstractC1331a;
import java.util.List;
import je.InterfaceC1679a;
import p3.C2011b;
import retrofit2.Response;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1807d = 0;
    public final Object e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1808g;
    public Object h;
    public Object i;

    public p(E e) {
        this.e = e;
    }

    @Override // y5.AbstractC2509a
    public void j() {
        int i = 1;
        switch (this.f1807d) {
            case 0:
                super.j();
                ((MayaCashInFragment) ((K6.h) this.c.get())).L1();
                C1262h0 c1262h0 = (C1262h0) this.f1808g;
                C2011b c2011b = new C2011b(7);
                com.paymaya.data.database.repository.v vVar = c1262h0.f11446d;
                e(new C0310o(new z(vVar.f11324a.d("load_up_partner", c2011b), new com.paymaya.data.database.repository.x(vVar, 6), 0).e(zh.b.a()).c(l.c), new o(this, i), Eh.d.c, Eh.d.f1365b).f());
                break;
            default:
                super.j();
                break;
        }
    }

    public void k(LoadUpPartner loadUpPartner) {
        if (!loadUpPartner.mMaintenance().isAvailable()) {
            K6.h hVar = (K6.h) this.c.get();
            kotlin.jvm.internal.j.f(loadUpPartner.mName(), "mName(...)");
            String strMMessage = loadUpPartner.mMaintenance().mMessage();
            kotlin.jvm.internal.j.f(strMMessage, "mMessage(...)");
            MayaCashInFragment mayaCashInFragment = (MayaCashInFragment) hVar;
            mayaCashInFragment.getClass();
            L6.q qVar = mayaCashInFragment.f11690G0;
            if (qVar != null) {
                AbstractC1236z.i((MayaCashInActivity) qVar, R.id.frame_layout_container, M2.b.a0(strMMessage, 3), R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
                return;
            }
            return;
        }
        String strMType = loadUpPartner.mType();
        if (strMType != null) {
            int iHashCode = strMType.hashCode();
            if (iHashCode != 2782) {
                if (iHashCode != 109330445) {
                    ((MayaBaseFragment) ((K6.h) this.c.get())).E1();
                    Ah.p pVarA = ((C1262h0) this.f1808g).a(loadUpPartner.mId());
                    new Lh.d(new Lh.d(AbstractC1331a.l(pVarA, pVarA, zh.b.a()), new n(this, 0), 2), new o(this, 0), 0).e();
                    return;
                } else {
                    ((MayaBaseFragment) ((K6.h) this.c.get())).E1();
                    Ah.p pVarA2 = ((C1262h0) this.f1808g).a(loadUpPartner.mId());
                    new Lh.d(new Lh.d(AbstractC1331a.l(pVarA2, pVarA2, zh.b.a()), new n(this, 0), 2), new o(this, 0), 0).e();
                    return;
                }
            }
            if (strMType.equals("WU")) {
                if (!kotlin.jvm.internal.j.b(((com.paymaya.data.preference.a) this.e).l(), "kyc1")) {
                    K6.h hVar2 = (K6.h) this.c.get();
                    String strMName = loadUpPartner.mName();
                    kotlin.jvm.internal.j.f(strMName, "mName(...)");
                    ((MayaCashInFragment) hVar2).X1(strMName);
                    return;
                }
                if (((com.paymaya.data.preference.a) this.e).f11330b.getBoolean("key_has_government_id", false)) {
                    MayaCashInFragment mayaCashInFragment2 = (MayaCashInFragment) ((K6.h) this.c.get());
                    mayaCashInFragment2.getClass();
                    L6.q qVar2 = mayaCashInFragment2.f11690G0;
                    if (qVar2 != null) {
                        AbstractC1236z.i((MayaCashInActivity) qVar2, R.id.frame_layout_container, new MayaWesternUnionFragment(), R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
                        return;
                    }
                    return;
                }
                MayaCashInFragment mayaCashInFragment3 = (MayaCashInFragment) ((K6.h) this.c.get());
                L6.q qVar3 = mayaCashInFragment3.f11690G0;
                if (qVar3 != null) {
                    mayaCashInFragment3.getString(R.string.pma_toast_error_title_western_union_error);
                    M2.b.Z(0, null, mayaCashInFragment3.getString(R.string.pma_toast_error_has_no_government_id), null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_Y).show(((MayaCashInActivity) qVar3).getSupportFragmentManager(), "error_dialog");
                    return;
                }
                return;
            }
        }
        ((MayaBaseFragment) ((K6.h) this.c.get())).E1();
        Ah.p pVarA3 = ((C1262h0) this.f1808g).a(loadUpPartner.mId());
        new Lh.d(new Lh.d(AbstractC1331a.l(pVarA3, pVarA3, zh.b.a()), new J5.c(this, 28), 2), new V2.c(this, 27), 0).e();
    }

    public void l() {
        Ah.p dVar;
        int i = 24;
        int i4 = 2;
        int i6 = 1;
        int i10 = 0;
        if (!com.paymaya.data.database.repository.v.a(((C1262h0) this.f1808g).f11446d.f11324a.f2811a.query(String.format("SELECT * FROM %1$s ", "load_up_partner"))).isEmpty() || ((MayaBaseLoadingFragment) ((K6.h) this.c.get())).f10359n0) {
            ((MayaCashInFragment) ((K6.h) this.c.get())).R1();
            ((MayaCashInFragment) ((K6.h) this.c.get())).Q1();
            RecyclerView recyclerView = ((MayaCashInFragment) ((K6.h) this.c.get())).f11699v0;
            if (recyclerView == null) {
                kotlin.jvm.internal.j.n("mRecyclerViewPartners");
                throw null;
            }
            recyclerView.setVisibility(0);
        } else {
            C0462k c0462k = ((MayaCashInFragment) ((K6.h) this.c.get())).w0;
            if (c0462k == null) {
                kotlin.jvm.internal.j.n("mViewPartnersLoading");
                throw null;
            }
            ((ConstraintLayout) c0462k.f4131b).setVisibility(0);
            ((MayaCashInFragment) ((K6.h) this.c.get())).Q1();
            RecyclerView recyclerView2 = ((MayaCashInFragment) ((K6.h) this.c.get())).f11699v0;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.j.n("mRecyclerViewPartners");
                throw null;
            }
            recyclerView2.setVisibility(8);
        }
        C1262h0 c1262h0 = (C1262h0) this.f1808g;
        if (c1262h0.e.e().isTopUpServiceEnabled()) {
            Ah.p<Response<Void>> topUpPartnersHead = c1262h0.c.getTopUpPartnersHead();
            C1260g0 c1260g0 = new C1260g0(c1262h0, i10);
            topUpPartnersHead.getClass();
            dVar = new Lh.f(new Lh.d(new Lh.f(topUpPartnersHead, c1260g0, 0), new C1260g0(c1262h0, i6), i4), new com.google.firebase.messaging.n(24), 0);
        } else {
            Ah.p<List<LoadUpPartner>> loadUpPartners = c1262h0.f11445b.getLoadUpPartners();
            C1260g0 c1260g02 = new C1260g0(c1262h0, i4);
            loadUpPartners.getClass();
            dVar = new Lh.d(loadUpPartners, c1260g02, i4);
        }
        e(new Lh.d(new Lh.h(dVar, zh.b.a(), 0), new A5.l(this, i), i10).e());
    }

    public void m() {
        if (!((com.paymaya.data.preference.a) this.e).e().isAddMoneyViaCardServiceAvailable()) {
            String strMMessage = ((com.paymaya.data.preference.a) this.e).e().mMaintenanceConfig().mServiceAvailabilityConfig().mAddMoneyViaCardService().mMessage();
            L6.q qVar = ((MayaCashInFragment) ((K6.h) this.c.get())).f11690G0;
            if (qVar != null) {
                AbstractC1236z.i((MayaCashInActivity) qVar, R.id.frame_layout_container, M2.b.a0(strMMessage, 3), R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.j.b(((com.paymaya.data.preference.a) this.e).l(), "kyc1")) {
            ((MayaCashInFragment) ((K6.h) this.c.get())).X1("Debit or Credit Card");
            return;
        }
        if (!S5.c.b((S5.c) this.h, A5.b.f116l)) {
            L6.q qVar2 = ((MayaCashInFragment) ((K6.h) this.c.get())).f11690G0;
            if (qVar2 != null) {
                AbstractC1236z.i((MayaCashInActivity) qVar2, R.id.frame_layout_container, new MayaVaultedCardsFragment(), R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
                return;
            }
            return;
        }
        L6.q qVar3 = ((MayaCashInFragment) ((K6.h) this.c.get())).f11690G0;
        if (qVar3 != null) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) qVar3;
            mayaCashInActivity.n1();
            mayaCashInActivity.startActivity(new Intent(mayaCashInActivity, (Class<?>) MayaCardPullV2Activity.class));
        }
    }

    public void n() {
        if (!((com.paymaya.data.preference.a) this.e).e().isCashInViaBankServiceAvailable()) {
            AvailabilityConfig availabilityConfigMCashInViaBankServiceAvailability = ((com.paymaya.data.preference.a) this.e).e().mMaintenanceConfig().mServiceAvailabilityConfig().mCashInViaBankServiceAvailability();
            String strMMessage = availabilityConfigMCashInViaBankServiceAvailability != null ? availabilityConfigMCashInViaBankServiceAvailability.mMessage() : null;
            L6.q qVar = ((MayaCashInFragment) ((K6.h) this.c.get())).f11690G0;
            if (qVar != null) {
                AbstractC1236z.i((MayaCashInActivity) qVar, R.id.frame_layout_container, M2.b.a0(strMMessage, 3), R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left, R.anim.maya_slide_out_to_right);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.j.b(((com.paymaya.data.preference.a) this.e).l(), "kyc1")) {
            ((MayaCashInFragment) ((K6.h) this.c.get())).X1("Bank Account");
            return;
        }
        if (S5.c.b((S5.c) this.h, A5.b.f105g)) {
            L6.q qVar2 = ((MayaCashInFragment) ((K6.h) this.c.get())).f11690G0;
            if (qVar2 != null) {
                MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) qVar2;
                mayaCashInActivity.n1();
                Intent intent = new Intent(mayaCashInActivity, (Class<?>) MayaBankPullV2Activity.class);
                intent.putExtra("sub_route", "?source_page=Cash In Landing");
                mayaCashInActivity.startActivity(intent);
                return;
            }
            return;
        }
        L6.q qVar3 = ((MayaCashInFragment) ((K6.h) this.c.get())).f11690G0;
        if (qVar3 != null) {
            Bb.a aVarW1 = ((MayaCashInActivity) qVar3).W1();
            if (aVarW1.e.e().isMayaCashInV3BankPullEnabled()) {
                MayaCashInActivity mayaCashInActivity2 = (MayaCashInActivity) ((H6.c) aVarW1.c.get());
                mayaCashInActivity2.getClass();
                AbstractC1236z.i(mayaCashInActivity2, R.id.frame_layout_container, new MayaBankPullV2Fragment(), R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
            } else {
                MayaCashInActivity mayaCashInActivity3 = (MayaCashInActivity) ((H6.c) aVarW1.c.get());
                mayaCashInActivity3.getClass();
                AbstractC1236z.i(mayaCashInActivity3, R.id.frame_layout_container, new MayaBankPullFragment(), R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
            }
        }
    }

    public void o(Decoration decoration) {
        kotlin.jvm.internal.j.g(decoration, "decoration");
        if (decoration.getMImageUrl() == null || decoration.getMImageUrl().length() == 0) {
            ((SendMoneyCardFragment) ((InterfaceC1679a) this.c.get())).y1();
        } else {
            InterfaceC1679a interfaceC1679a = (InterfaceC1679a) this.c.get();
            String imageUrl = decoration.getMImageUrl();
            SendMoneyCardFragment sendMoneyCardFragment = (SendMoneyCardFragment) interfaceC1679a;
            sendMoneyCardFragment.getClass();
            kotlin.jvm.internal.j.g(imageUrl, "imageUrl");
            D1 d12 = sendMoneyCardFragment.f14764S;
            kotlin.jvm.internal.j.d(d12);
            ((FrameLayout) ((I) d12.h).f3648g).setVisibility(4);
            sendMoneyCardFragment.requireContext();
            D1 d13 = sendMoneyCardFragment.f14764S;
            kotlin.jvm.internal.j.d(d13);
            C.h0(imageUrl, (ImageView) ((I) d13.h).f, sendMoneyCardFragment.f14765T);
        }
        InterfaceC1679a interfaceC1679a2 = (InterfaceC1679a) this.c.get();
        String decorationId = decoration.getMId();
        SendMoneyCardFragment sendMoneyCardFragment2 = (SendMoneyCardFragment) interfaceC1679a2;
        sendMoneyCardFragment2.getClass();
        kotlin.jvm.internal.j.g(decorationId, "decorationId");
        C1219h c1219h = sendMoneyCardFragment2.f10248Q;
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("theme_id", decorationId);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put(SessionDescription.ATTR_TYPE, "theme");
    }

    public void p(String str) {
        if (((com.paymaya.data.preference.a) this.e).e().isAppEventsV2CashInEnabled()) {
            MayaCashInFragment mayaCashInFragment = (MayaCashInFragment) ((K6.h) this.c.get());
            mayaCashInFragment.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1213b.j(7));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("button", str);
            mayaCashInFragment.o1().b(c1219hE);
        }
    }

    public void q(EnumC1212a enumC1212a, String str, boolean z4) {
        UserActivityFragment userActivityFragment = (UserActivityFragment) this.c.get();
        C1219h c1219h = new C1219h();
        c1219h.r(z4 ? EnumC1216e.RECEIVE_MONEY : EnumC1216e.SEND_MONEY);
        c1219h.n(17);
        c1219h.t(EnumC1217f.PREVIEW);
        c1219h.j.put(enumC1212a.f10691a, str);
        C1220i c1220i = userActivityFragment.f10245B;
        FragmentActivity activity = userActivityFragment.getActivity();
        c1219h.p(EnumC1215d.ACTIVITY_LIST);
        c1220i.c(activity, c1219h);
    }

    public void r() {
        if (this.f) {
            MayaCashInFragment mayaCashInFragment = (MayaCashInFragment) ((K6.h) this.c.get());
            AppCompatTextView appCompatTextView = mayaCashInFragment.f11697r0;
            if (appCompatTextView == null) {
                kotlin.jvm.internal.j.n("mTextViewPadalaAgents");
                throw null;
            }
            appCompatTextView.setVisibility(0);
            View view = mayaCashInFragment.f11698s0;
            if (view != null) {
                view.setVisibility(0);
                return;
            } else {
                kotlin.jvm.internal.j.n("mViewPadalaAgentsDivider");
                throw null;
            }
        }
        MayaCashInFragment mayaCashInFragment2 = (MayaCashInFragment) ((K6.h) this.c.get());
        AppCompatTextView appCompatTextView2 = mayaCashInFragment2.f11697r0;
        if (appCompatTextView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewPadalaAgents");
            throw null;
        }
        appCompatTextView2.setVisibility(8);
        View view2 = mayaCashInFragment2.f11698s0;
        if (view2 != null) {
            view2.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mViewPadalaAgentsDivider");
            throw null;
        }
    }

    public void s(PayMayaError payMayaError) {
        ((MayaBaseFragment) ((K6.h) this.c.get())).w1();
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        K6.h hVar = (K6.h) this.c.get();
        String strMSpiel = payMayaError.mSpiel();
        MayaCashInFragment mayaCashInFragment = (MayaCashInFragment) hVar;
        L6.q qVar = mayaCashInFragment.f11690G0;
        if (qVar != null) {
            mayaCashInFragment.getString(R.string.pma_toast_error_title_add_money_options_error);
            M2.b.Z(0, null, strMSpiel, null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_Y).show(((MayaCashInActivity) qVar).getSupportFragmentManager(), "error_dialog");
        }
    }

    public p(com.paymaya.data.preference.a aVar, C1262h0 c1262h0, S5.c cVar, Uh.d dVar) {
        super(dVar);
        this.e = aVar;
        this.f1808g = c1262h0;
        this.h = cVar;
    }

    public p(X x6, C1273n c1273n, com.paymaya.data.preference.a mPreference, W0 w0) {
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f1808g = x6;
        this.h = c1273n;
        this.e = mPreference;
        this.i = w0;
    }
}
