package o6;

import Ah.p;
import a7.InterfaceC0643d;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.C;
import b6.C0922a;
import com.google.android.exoplayer2.Format;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.EDDFinancialDocument;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.MFAChallengeVerificationResult;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMfaFaceAuthFragment;
import com.paymaya.mayaui.profile.view.fragment.impl.BaseMayaProfileFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ConfirmationBottomSheetFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3SearchFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import o5.C1963b;
import okhttp3.ResponseBody;
import pc.EnumC2032a;
import pg.C2038a;
import s6.InterfaceC2243d;
import ve.InterfaceC2347a;
import w1.E;
import wc.InterfaceC2394e;
import y5.AbstractActivityC2512d;
import y5.q;
import ya.C2516a;
import z1.AbstractC2550e;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Ch.c, InterfaceC0643d, Ch.f, W6.e, E, Sc.b, Bd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18793b;

    public /* synthetic */ f(Object obj, int i) {
        this.f18792a = i;
        this.f18793b = obj;
    }

    public String a(Format format) {
        String displayName;
        String str = format.c;
        if (TextUtils.isEmpty(str) || C.LANGUAGE_UNDETERMINED.equals(str)) {
            displayName = "";
        } else {
            displayName = (AbstractC2550e.f21351a >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayName();
        }
        int i = format.e & 2;
        Resources resources = (Resources) this.f18793b;
        String string = i != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        int i4 = format.e;
        if ((i4 & 4) != 0) {
            string = b(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i4 & 8) != 0) {
            string = b(string, resources.getString(R.string.exo_track_role_commentary));
        }
        if ((i4 & 1088) != 0) {
            string = b(string, resources.getString(R.string.exo_track_role_closed_captions));
        }
        String strB = b(displayName, string);
        if (!TextUtils.isEmpty(strB)) {
            return strB;
        }
        String str2 = format.f9619b;
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        boolean z4 = false;
        switch (this.f18792a) {
            case 0:
                ((g) this.f18793b).f((Throwable) obj, true);
                return;
            case 1:
                kotlin.jvm.internal.j.g((MFAChallengeInformation) obj, "it");
                ((MayaBaseFragment) ((InterfaceC2243d) ((C0922a) this.f18793b).c.get())).w1();
                return;
            case 2:
            case 3:
            case 4:
            case 8:
            case 10:
            case 12:
            case 15:
            case 16:
            case 18:
            case 19:
            default:
                Throwable p02 = (Throwable) obj;
                kotlin.jvm.internal.j.g(p02, "p0");
                C2516a c2516a = (C2516a) this.f18793b;
                c2516a.getClass();
                c2516a.n(p02, new com.squareup.wire.internal.a(c2516a, 25));
                return;
            case 5:
                io.reactivex.rxjava3.disposables.b it = (io.reactivex.rxjava3.disposables.b) obj;
                kotlin.jvm.internal.j.g(it, "it");
                ((rc.k) this.f18793b).e(it);
                return;
            case 6:
                Throwable it2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                ((MayaBaseFragment) ((InterfaceC2394e) ((rc.m) this.f18793b).c.get())).w1();
                rc.m mVar = (rc.m) this.f18793b;
                mVar.m(it2, new C1963b(4, mVar, it2));
                return;
            case 7:
                Throwable it3 = (Throwable) obj;
                kotlin.jvm.internal.j.g(it3, "it");
                ((MayaBaseFragment) ((wc.f) ((rc.o) this.f18793b).c.get())).w1();
                ((rc.o) this.f18793b).n(it3, EnumC2032a.f19083a, false);
                return;
            case 9:
                Order executedOrder = (Order) obj;
                kotlin.jvm.internal.j.g(executedOrder, "executedOrder");
                A7.j jVar = (A7.j) this.f18793b;
                ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVar.c.get());
                C1220i c1220i = shopV3ConfirmationBottomSheetFragment.f10238B;
                FragmentActivity activity = shopV3ConfirmationBottomSheetFragment.getActivity();
                C1219h c1219hD = C1219h.d(EnumC1215d.SHOP);
                c1219hD.t(EnumC1217f.PURCHASE);
                c1219hD.n(14);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                PaymentConfirmationSummary paymentConfirmationSummary = shopV3ConfirmationBottomSheetFragment.f14781S;
                if (paymentConfirmationSummary == null) {
                    kotlin.jvm.internal.j.n("mPaymentConfirmationSummary");
                    throw null;
                }
                String productCode = paymentConfirmationSummary.getTargetProduct().getProductCode();
                HashMap map = c1219hD.j;
                map.put("product", productCode);
                PaymentConfirmationSummary paymentConfirmationSummary2 = shopV3ConfirmationBottomSheetFragment.f14781S;
                if (paymentConfirmationSummary2 == null) {
                    kotlin.jvm.internal.j.n("mPaymentConfirmationSummary");
                    throw null;
                }
                map.put("provider", paymentConfirmationSummary2.getTargetProduct().getProvider());
                AttributionSource attributionSource = (shopV3ConfirmationBottomSheetFragment.getActivity() == null || !(shopV3ConfirmationBottomSheetFragment.getActivity() instanceof AbstractActivityC2512d)) ? (shopV3ConfirmationBottomSheetFragment.getActivity() == null || !(shopV3ConfirmationBottomSheetFragment.getActivity() instanceof q)) ? null : (AttributionSource) ((q) shopV3ConfirmationBottomSheetFragment.getActivity()).getIntent().getParcelableExtra("extra_attribution_source") : (AttributionSource) ((AbstractActivityC2512d) shopV3ConfirmationBottomSheetFragment.getActivity()).getIntent().getParcelableExtra("extra_attribution_source");
                if (attributionSource == null) {
                    attributionSource = AttributionSource.c;
                }
                map.put("attribution", attributionSource.f10371a);
                c1220i.c(activity, c1219hD);
                PaymentConfirmationSummary paymentConfirmationSummary3 = ((ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVar.c.get())).f14781S;
                if (paymentConfirmationSummary3 == null) {
                    kotlin.jvm.internal.j.n("mPaymentConfirmationSummary");
                    throw null;
                }
                String unformattedTargetNumber = paymentConfirmationSummary3.getUnformattedTargetNumber();
                if (unformattedTargetNumber != null && !C2576A.H(unformattedTargetNumber)) {
                    androidx.media3.datasource.cache.c.u(((com.paymaya.data.preference.a) jVar.f).f11330b, "key_shop_recent_recipient_number", unformattedTargetNumber);
                }
                ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment2 = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) jVar.c.get());
                shopV3ConfirmationBottomSheetFragment2.getClass();
                shopV3ConfirmationBottomSheetFragment2.r1().setLoadFinishingAnimationDuration(300L);
                shopV3ConfirmationBottomSheetFragment2.r1().setMStateFinishedListener(new C2038a(26, shopV3ConfirmationBottomSheetFragment2, executedOrder, z4));
                shopV3ConfirmationBottomSheetFragment2.r1().d(R.drawable.pma_ic_check_with_circle);
                return;
            case 11:
                ProductV3 product = (ProductV3) obj;
                kotlin.jvm.internal.j.g(product, "product");
                ((se.f) this.f18793b).r(product);
                return;
            case 13:
                kotlin.jvm.internal.j.g((List) obj, "it");
                ((ShopV3ProviderProductsListFragment) ((ve.f) ((se.i) this.f18793b).c.get())).f14840i0 = 1;
                return;
            case 14:
                Throwable throwable = (Throwable) obj;
                kotlin.jvm.internal.j.g(throwable, "throwable");
                se.l lVar = (se.l) this.f18793b;
                PayMayaError payMayaErrorF = lVar.f(throwable, false);
                kotlin.jvm.internal.j.f(payMayaErrorF, "paymayaErrorHandling(...)");
                lVar.m(payMayaErrorF);
                return;
            case 17:
                MFAChallengeVerificationResult result = (MFAChallengeVerificationResult) obj;
                kotlin.jvm.internal.j.g(result, "result");
                ((MayaBaseFragment) ((x9.a) ((A7.j) this.f18793b).c.get())).w1();
                MayaMfaFaceAuthFragment mayaMfaFaceAuthFragment = (MayaMfaFaceAuthFragment) ((x9.a) ((A7.j) this.f18793b).c.get());
                mayaMfaFaceAuthFragment.getClass();
                y9.b bVar = mayaMfaFaceAuthFragment.f12936X;
                if (bVar != null) {
                    MayaMfaActivity mayaMfaActivity = (MayaMfaActivity) bVar;
                    String strI = AbstractC1213b.i(14);
                    kotlin.jvm.internal.j.f(strI, "success(...)");
                    mayaMfaActivity.d2(strI);
                    Intent intent = new Intent();
                    intent.putExtra("mfa_success_verification_result", result);
                    mayaMfaActivity.setResult(1011, intent);
                    mayaMfaActivity.finish();
                    return;
                }
                return;
            case 20:
                CharSequence search = (CharSequence) obj;
                kotlin.jvm.internal.j.g(search, "search");
                String string = search.toString();
                ShopV3SearchFragment shopV3SearchFragment = (ShopV3SearchFragment) this.f18793b;
                shopV3SearchFragment.f14894j0 = string;
                shopV3SearchFragment.A1().l();
                return;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        ResponseBody it = (ResponseBody) obj;
        kotlin.jvm.internal.j.g(it, "it");
        return p.c((EDDFinancialDocument) this.f18793b);
    }

    public String b(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : ((Resources) this.f18793b).getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    @Override // Sc.b
    public void e() {
        MayaBaseFragment mayaBaseFragment = (MayaBaseFragment) this.f18793b;
        if (mayaBaseFragment.r1()) {
            return;
        }
        mayaBaseFragment.s1().g();
    }

    @Override // W6.e
    public void onDismiss() {
        ((MayaErrorDialogFragment) this.f18793b).dismiss();
    }

    @Override // a7.InterfaceC0643d
    public boolean u0() {
        return ((BaseMayaProfileFragment) this.f18793b).isVisible();
    }

    public f(com.paymaya.data.preference.a mPreference, xe.l lVar) {
        this.f18792a = 15;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f18793b = lVar;
    }

    public f(Resources resources) {
        this.f18792a = 19;
        resources.getClass();
        this.f18793b = resources;
    }
}
