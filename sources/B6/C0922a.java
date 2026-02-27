package b6;

import Ah.p;
import Kh.C0310o;
import Lh.h;
import N5.A;
import N5.C0489y;
import N5.D1;
import Q6.s;
import Uh.d;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.datasource.cache.c;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import com.paymaya.common.base.BaseLoadingFragment;
import com.paymaya.common.base.MayaAbstractBaseOTPFragmentImpl;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.BankTransferV3;
import com.paymaya.domain.model.BankTransferV3CreateResponse;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.ShopProviderCategory;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C1249b;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.C1278p0;
import com.paymaya.domain.store.L0;
import com.paymaya.domain.store.M;
import com.paymaya.domain.store.V0;
import com.paymaya.domain.store.X;
import com.paymaya.mayaui.accountlimits.view.fragment.impl.MayaAccountLimitsFragment;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferOTPFragment;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopActivity;
import com.paymaya.ui.common.view.fragment.impl.ServiceUnavailableFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3Fragment;
import d4.AbstractC1331a;
import e2.C1421c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.j;
import o6.C1967a;
import ph.C2070f1;
import s6.InterfaceC2243d;
import se.C2255a;
import t6.i;
import we.C2417f;
import we.C2419h;
import we.InterfaceC2418g;
import y5.AbstractC2509a;
import y5.e;
import y5.f;
import zj.C2576A;

/* JADX INFO: renamed from: b6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0922a extends AbstractC2509a implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8539d = 2;
    public final com.paymaya.data.preference.a e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f8540g;
    public final Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0922a(L0 l02, com.paymaya.data.preference.a mPreference, d mPushNotificationSubject, d dVar) {
        super(dVar);
        j.g(mPreference, "mPreference");
        j.g(mPushNotificationSubject, "mPushNotificationSubject");
        this.f8540g = l02;
        this.e = mPreference;
        this.h = mPushNotificationSubject;
    }

    @Override // y5.e
    public void b() {
        String authChallengeId;
        BankTransferV3CreateResponse bankTransferV3CreateResponseW1 = ((MayaBankTransferOTPFragment) ((InterfaceC2243d) this.c.get())).W1();
        if (bankTransferV3CreateResponseW1 == null || (authChallengeId = bankTransferV3CreateResponseW1.getAuthChallengeId()) == null) {
            return;
        }
        ((MayaBaseFragment) ((InterfaceC2243d) this.c.get())).E1();
        p<MFAChallengeInformation> pVarResendMFAChallenge = ((C1278p0) this.h).f11471b.resendMFAChallenge(authChallengeId);
        e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarResendMFAChallenge, pVarResendMFAChallenge, zh.b.a()), new o6.f(this, 1), 2), new C1967a(this, 2), 0).e());
    }

    @Override // y5.e
    public void c() {
        BankTransferV3CreateResponse bankTransferV3CreateResponseW1 = ((MayaBankTransferOTPFragment) ((InterfaceC2243d) this.c.get())).W1();
        BankTransferV3CreateResponse bankTransferV3CreateResponseW12 = ((MayaBankTransferOTPFragment) ((InterfaceC2243d) this.c.get())).W1();
        String authChallengeId = bankTransferV3CreateResponseW12 != null ? bankTransferV3CreateResponseW12.getAuthChallengeId() : null;
        String strL1 = ((MayaAbstractBaseOTPFragmentImpl) ((InterfaceC2243d) this.c.get())).L1();
        if (strL1.length() == 0) {
            MayaBankTransferOTPFragment mayaBankTransferOTPFragment = (MayaBankTransferOTPFragment) ((InterfaceC2243d) this.c.get());
            String string = mayaBankTransferOTPFragment.getString(R.string.pma_label_otp_missing);
            j.f(string, "getString(...)");
            i iVar = mayaBankTransferOTPFragment.f11579k0;
            if (iVar != null) {
                ((MayaBankTransferActivity) iVar).o(mayaBankTransferOTPFragment.getString(R.string.pma_toast_error_title_otp_error), string);
                return;
            }
            return;
        }
        if (strL1.length() < 6) {
            MayaBankTransferOTPFragment mayaBankTransferOTPFragment2 = (MayaBankTransferOTPFragment) ((InterfaceC2243d) this.c.get());
            String string2 = mayaBankTransferOTPFragment2.getString(R.string.pma_label_otp_invalid);
            j.f(string2, "getString(...)");
            i iVar2 = mayaBankTransferOTPFragment2.f11579k0;
            if (iVar2 != null) {
                ((MayaBankTransferActivity) iVar2).o(mayaBankTransferOTPFragment2.getString(R.string.pma_toast_error_title_otp_error), string2);
                return;
            }
            return;
        }
        if (authChallengeId == null || bankTransferV3CreateResponseW1 == null) {
            return;
        }
        ((MayaBaseFragment) ((InterfaceC2243d) this.c.get())).E1();
        if (this.f) {
            k(bankTransferV3CreateResponseW1);
        } else {
            p pVarB = ((C1278p0) this.h).b("instapay", authChallengeId, ((MayaAbstractBaseOTPFragmentImpl) ((InterfaceC2243d) this.c.get())).L1());
            e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarB, pVarB, zh.b.a()), new C1421c(25, this, bankTransferV3CreateResponseW1), 2), new M(this, 26), 0).e());
        }
    }

    @Override // y5.e
    public long d() {
        return this.e.e().mResendCodeCountdown();
    }

    @Override // y5.AbstractC2509a
    public void h(Object obj) {
        Intent intent;
        Intent intent2;
        switch (this.f8539d) {
            case 0:
                e6.a view = (e6.a) obj;
                j.g(view, "view");
                super.h(view);
                FragmentActivity activity = ((MayaAccountLimitsFragment) ((e6.a) this.c.get())).getActivity();
                String dataString = (activity == null || (intent2 = activity.getIntent()) == null) ? null : intent2.getDataString();
                if (dataString != null && 38 == C.w(dataString)) {
                    MayaAccountLimitsFragment mayaAccountLimitsFragment = (MayaAccountLimitsFragment) ((e6.a) this.c.get());
                    mayaAccountLimitsFragment.getClass();
                    C1219h c1219hM1 = mayaAccountLimitsFragment.m1();
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hM1.j.put("from_deep_link", "true");
                    FragmentActivity activity2 = mayaAccountLimitsFragment.getActivity();
                    if (activity2 != null && (intent = activity2.getIntent()) != null) {
                        intent.setData(null);
                        break;
                    }
                }
                break;
            case 1:
            default:
                super.h(obj);
                break;
            case 2:
                ve.b view2 = (ve.b) obj;
                j.g(view2, "view");
                super.h(view2);
                if (this.e.e().isShopAvailable()) {
                    m(((ShopV3Fragment) ((ve.b) this.c.get())).B1());
                    break;
                }
                break;
        }
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        String string = null;
        int i = 0;
        switch (this.f8539d) {
            case 0:
                super.j();
                if (this.e.e().isAccountLimitsAvailable()) {
                    if (!((X) this.h).a().isEmpty()) {
                        ((MayaAccountLimitsFragment) ((e6.a) this.c.get())).I1();
                        ((MayaAccountLimitsFragment) ((e6.a) this.c.get())).K1();
                        l();
                        return;
                    } else {
                        C0489y c0489y = ((MayaAccountLimitsFragment) ((e6.a) this.c.get())).f11511X;
                        if (c0489y == null) {
                            j.n("mViewAccountLimitsNoCash");
                            throw null;
                        }
                        c0489y.f4296b.setVisibility(0);
                        ((MayaAccountLimitsFragment) ((e6.a) this.c.get())).H1();
                        return;
                    }
                }
                String strMMessage = this.e.e().mMaintenanceConfig().mServiceAvailabilityConfig().mAccountLimitsAvailability().mMessage();
                MayaAccountLimitsFragment mayaAccountLimitsFragment = (MayaAccountLimitsFragment) ((e6.a) this.c.get());
                mayaAccountLimitsFragment.H1();
                mayaAccountLimitsFragment.I1();
                A a8 = mayaAccountLimitsFragment.f11515b0;
                if (a8 == null) {
                    j.n("mViewAccountLimitsMaintenance");
                    throw null;
                }
                a8.f3538b.setVisibility(0);
                TextView textView = mayaAccountLimitsFragment.f11516c0;
                if (textView != null) {
                    textView.setText(strMMessage);
                    return;
                } else {
                    j.n("mTextViewAccountLimitsMaintenanceMessage");
                    throw null;
                }
            case 1:
                super.j();
                MayaBankTransferOTPFragment mayaBankTransferOTPFragment = (MayaBankTransferOTPFragment) ((InterfaceC2243d) this.c.get());
                mayaBankTransferOTPFragment.J1().setText(Html.fromHtml(mayaBankTransferOTPFragment.getString(R.string.maya_format_enter_otp_sent_to_mobile_number, C.p(this.e.r()))));
                return;
            default:
                super.j();
                if (!this.e.e().isShopAvailable()) {
                    InterfaceC2418g interfaceC2418g = ((ShopV3Fragment) ((ve.b) this.c.get())).f14787d0;
                    if (interfaceC2418g != null) {
                        MayaShopActivity mayaShopActivity = (MayaShopActivity) interfaceC2418g;
                        if (mayaShopActivity.getSupportActionBar() != null && mayaShopActivity.getSupportActionBar().getTitle() != null) {
                            string = mayaShopActivity.getSupportActionBar().getTitle().toString();
                        }
                        String string2 = mayaShopActivity.getString(R.string.pma_label_come_back_again_to_try_it_out);
                        ServiceUnavailableFragment serviceUnavailableFragment = new ServiceUnavailableFragment();
                        Bundle bundleE = c.e("page", string, "description", string2);
                        bundleE.putBoolean("is_show_for_the_meantime", false);
                        serviceUnavailableFragment.setArguments(bundleE);
                        Xa.c cVar = new Xa.c(mayaShopActivity, 11);
                        serviceUnavailableFragment.f14404V = true;
                        serviceUnavailableFragment.f14405W = true;
                        serviceUnavailableFragment.f14403U = cVar;
                        AbstractC1236z.g(mayaShopActivity, R.id.frame_layout_fragment_container, serviceUnavailableFragment);
                        return;
                    }
                    return;
                }
                if (((L0) this.f8540g).b().isEmpty()) {
                    ((ShopV3Fragment) ((ve.b) this.c.get())).z1();
                    return;
                }
                Bundle arguments = ((ShopV3Fragment) ((ve.b) this.c.get())).getArguments();
                if (arguments != null ? arguments.getBoolean("is_in_activity") : false) {
                    ((ShopV3Fragment) ((ve.b) this.c.get())).D1().setVisibility(8);
                } else if (!this.f) {
                    ShopV3Fragment shopV3Fragment = (ShopV3Fragment) ((ve.b) this.c.get());
                    shopV3Fragment.D1().inflateMenu(R.menu.pma_menu_shop_v3);
                    shopV3Fragment.D1().setOnMenuItemClickListener(new C2417f(shopV3Fragment, i));
                    this.f = true;
                    ShopV3Fragment shopV3Fragment2 = (ShopV3Fragment) ((ve.b) this.c.get());
                    shopV3Fragment2.D1().getMenu().findItem(R.id.pma_menu_shop_purchase_history_icon).setVisible(true);
                    shopV3Fragment2.D1().getMenu().findItem(R.id.pma_menu_shop_purchase_history_icon).setEnabled(true);
                }
                ShopV3Fragment shopV3Fragment3 = (ShopV3Fragment) ((ve.b) this.c.get());
                shopV3Fragment3.f10248Q.s(((ShopProviderCategory) ((L0) shopV3Fragment3.C1().f8540g).b().get(0)).getName());
                FragmentManager childFragmentManager = shopV3Fragment3.getChildFragmentManager();
                j.f(childFragmentManager, "getChildFragmentManager(...)");
                shopV3Fragment3.f14785b0 = new E9.e(childFragmentManager, ((L0) shopV3Fragment3.C1().f8540g).b(), 1);
                D1 d12 = shopV3Fragment3.f14791h0;
                j.d(d12);
                ViewPager viewPager = (ViewPager) d12.h;
                viewPager.setAdapter(shopV3Fragment3.f14785b0);
                D1 d13 = shopV3Fragment3.f14791h0;
                j.d(d13);
                ((TabLayout) d13.f3584g).setupWithViewPager(viewPager);
                viewPager.setOffscreenPageLimit(1);
                viewPager.addOnPageChangeListener(new C2419h(shopV3Fragment3));
                shopV3Fragment3.w1();
                ((BaseLoadingFragment) ((ve.b) this.c.get())).f10257Z = true;
                m(((ShopV3Fragment) ((ve.b) this.c.get())).B1());
                e(new C0310o(((d) this.h).e(zh.b.a()).c(C2255a.f20048b), new C2070f1(this, 8), Eh.d.c, Eh.d.f1365b).f());
                return;
        }
    }

    public void k(BankTransferV3CreateResponse bankTransferV3CreateResponse) {
        p<BankTransferV3> pVarExecuteBankTransferV3 = ((V0) this.f8540g).f11400b.executeBankTransferV3(bankTransferV3CreateResponse.getId());
        e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarExecuteBankTransferV3, pVarExecuteBankTransferV3, zh.b.a()), new A0(this, 28), 2), new C1258f0(this, 29), 0).e());
    }

    public void l() {
        if (this.f) {
            return;
        }
        this.f = true;
        C0489y c0489y = ((MayaAccountLimitsFragment) ((e6.a) this.c.get())).f11513Z;
        if (c0489y == null) {
            j.n("mViewAccountLimitsError");
            throw null;
        }
        c0489y.f4296b.setVisibility(8);
        ((MayaAccountLimitsFragment) ((e6.a) this.c.get())).K1();
        new Lh.d(new Lh.d(new h(((C1249b) this.f8540g).a(), zh.b.a(), 0), new Qd.a(this, 22), 2), new s(this, 22), 0).e();
    }

    public void m(String str) {
        int i;
        if (4 == C.w(str)) {
            String strL = C.L(str, "search");
            if (strL != null && !C2576A.H(strL)) {
                ShopV3Fragment shopV3Fragment = (ShopV3Fragment) ((ve.b) this.c.get());
                shopV3Fragment.getClass();
                shopV3Fragment.requireActivity().getIntent().setData(shopV3Fragment.B1() != null ? Uri.parse(shopV3Fragment.B1()) : null);
                InterfaceC2418g interfaceC2418g = shopV3Fragment.f14787d0;
                if (interfaceC2418g != null) {
                    MayaShopActivity mayaShopActivity = (MayaShopActivity) interfaceC2418g;
                    mayaShopActivity.e.getClass();
                    B5.i.c0(mayaShopActivity, strL);
                }
                ((ShopV3Fragment) ((ve.b) this.c.get())).E1();
                return;
            }
            String strL2 = C.L(str, "product");
            if (strL2 != null && !C2576A.H(strL2)) {
                ShopV3Fragment shopV3Fragment2 = (ShopV3Fragment) ((ve.b) this.c.get());
                shopV3Fragment2.requireActivity().getIntent().setData(shopV3Fragment2.B1() == null ? null : Uri.parse(shopV3Fragment2.B1()));
                InterfaceC2418g interfaceC2418g2 = shopV3Fragment2.f14787d0;
                if (interfaceC2418g2 != null) {
                    MayaShopActivity mayaShopActivity2 = (MayaShopActivity) interfaceC2418g2;
                    mayaShopActivity2.e.getClass();
                    B5.i.Z(mayaShopActivity2, null);
                }
                ((ShopV3Fragment) ((ve.b) this.c.get())).E1();
                return;
            }
            String strL3 = C.L(str, "brand");
            if (strL3 != null && !C2576A.H(strL3)) {
                ShopV3Fragment shopV3Fragment3 = (ShopV3Fragment) ((ve.b) this.c.get());
                shopV3Fragment3.requireActivity().getIntent().setData(shopV3Fragment3.B1() != null ? Uri.parse(shopV3Fragment3.B1()) : null);
                InterfaceC2418g interfaceC2418g3 = shopV3Fragment3.f14787d0;
                if (interfaceC2418g3 != null) {
                    MayaShopActivity mayaShopActivity3 = (MayaShopActivity) interfaceC2418g3;
                    mayaShopActivity3.e.getClass();
                    B5.i.b0(mayaShopActivity3);
                }
                ((ShopV3Fragment) ((ve.b) this.c.get())).E1();
                return;
            }
            String strL4 = C.L(str, "category");
            if (strL4 != null && !C2576A.H(strL4) && ((BaseLoadingFragment) ((ve.b) this.c.get())).f10257Z) {
                ShopV3Fragment shopV3Fragment4 = (ShopV3Fragment) ((ve.b) this.c.get());
                E9.e eVar = shopV3Fragment4.f14785b0;
                if (eVar == null || strL4.length() == 0) {
                    i = -1;
                } else {
                    Iterator it = ((ArrayList) eVar.f1339b).iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (j.b(((ShopProviderCategory) it.next()).getCode(), strL4)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    i = -1;
                }
                if (i > -1) {
                    D1 d12 = shopV3Fragment4.f14791h0;
                    j.d(d12);
                    ((ViewPager) d12.h).setCurrentItem(i);
                }
                ((ShopV3Fragment) ((ve.b) this.c.get())).E1();
                return;
            }
        }
        ((ve.b) this.c.get()).getClass();
    }

    public C0922a(C1249b c1249b, X x6, com.paymaya.data.preference.a aVar, d dVar) {
        super(dVar);
        this.f8540g = c1249b;
        this.h = x6;
        this.e = aVar;
    }

    public C0922a(V0 v02, com.paymaya.data.preference.a aVar, C1278p0 c1278p0, d dVar) {
        super(dVar);
        this.f8540g = v02;
        this.e = aVar;
        this.h = c1278p0;
    }
}
