package Y6;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import cc.w;
import com.dynatrace.android.callback.Callback;
import com.paymaya.domain.model.ContactModel;
import com.paymaya.domain.model.ShareSaveAppInfo;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebInterstitialFragment;
import com.paymaya.mayaui.common.view.widget.MayaAutoCompleteInputLayout;
import com.paymaya.mayaui.common.view.widget.MayaCustomCardView;
import com.paymaya.mayaui.common.view.widget.MayaExpandableContainerView;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.favorite.view.dialog.impl.MayaFavoriteReminderSampleBottomSheetDialogFragment;
import com.paymaya.mayaui.login.view.dialog.impl.MayaPasswordTipsBottomSheetDialogFragment;
import com.paymaya.mayaui.regv2.view.bottomsheet.impl.MayaProminentDisclosureBottomSheetDialogFragment;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountProvisionFragment;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentConfirmationFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageFragment;
import com.paymaya.ui.qr.view.activity.impl.RequestMoneyActivity;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyFormFragment;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyFragment;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneySuccessFragment;
import dc.C1353d;
import dc.C1354e;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6772b;

    public /* synthetic */ o(Object obj, int i) {
        this.f6771a = i;
        this.f6772b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [Rc.e, com.google.android.material.bottomsheet.BottomSheetDialogFragment] */
    /* JADX WARN: Type inference failed for: r3v31, types: [ac.p, com.paymaya.common.base.MayaBaseLoadingFragment] */
    /* JADX WARN: Type inference failed for: r3v40, types: [ac.D, com.paymaya.common.base.MayaBaseFragment] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f6772b;
        switch (this.f6771a) {
            case 0:
                MayaWebInterstitialFragment mayaWebInterstitialFragment = (MayaWebInterstitialFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaWebInterstitialFragment.I1(mayaWebInterstitialFragment);
                    return;
                } finally {
                }
            case 1:
                Z6.d dVar = (Z6.d) obj;
                Callback.onClick_enter(view);
                try {
                    ContactModel contactModel = dVar.f;
                    if (contactModel != null) {
                        U6.c cVar = dVar.f6897a;
                        cVar.getClass();
                        cVar.f5952a.Q1(contactModel);
                    }
                    return;
                } finally {
                }
            case 2:
                MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) obj;
                int i = MayaShopV2Activity.f13985B;
                Callback.onClick_enter(view);
                try {
                    MayaShopV2Activity.Z1(mayaShopV2Activity);
                    return;
                } finally {
                }
            case 3:
                MayaAutoCompleteInputLayout mayaAutoCompleteInputLayout = (MayaAutoCompleteInputLayout) obj;
                int i4 = MayaAutoCompleteInputLayout.f11974K;
                Callback.onClick_enter(view);
                try {
                    mayaAutoCompleteInputLayout.f11977g.requestFocus();
                    InputMethodManager inputMethodManager = (InputMethodManager) mayaAutoCompleteInputLayout.getContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.showSoftInput(mayaAutoCompleteInputLayout.f11977g, 1);
                    }
                    return;
                } finally {
                }
            case 4:
                int i6 = MayaCustomCardView.f12038b;
                Callback.onClick_enter(view);
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    try {
                        function0.invoke();
                    } finally {
                    }
                }
                return;
            case 5:
                MayaExpandableContainerView mayaExpandableContainerView = (MayaExpandableContainerView) obj;
                int i10 = MayaExpandableContainerView.j;
                Callback.onClick_enter(view);
                try {
                    FrameLayout frameLayout = mayaExpandableContainerView.e;
                    if (frameLayout == null) {
                        kotlin.jvm.internal.j.n("mFrameLayoutContent");
                        throw null;
                    }
                    if (frameLayout.getVisibility() == 8) {
                        mayaExpandableContainerView.c();
                    } else {
                        mayaExpandableContainerView.b();
                    }
                    return;
                } catch (Throwable th2) {
                    throw th2;
                }
            case 6:
                MayaInputLayout mayaInputLayout = (MayaInputLayout) obj;
                int i11 = MayaInputLayout.f12049a0;
                Callback.onClick_enter(view);
                try {
                    mayaInputLayout.c();
                    return;
                } finally {
                }
            case 7:
                ad.b bVar = (ad.b) obj;
                Callback.onClick_enter(view);
                try {
                    ad.b.D(bVar);
                    return;
                } finally {
                }
            case 8:
                ad.d dVar2 = (ad.d) obj;
                Callback.onClick_enter(view);
                try {
                    ShareSaveAppInfo shareSaveAppInfo = dVar2.c;
                    if (shareSaveAppInfo != null) {
                        dVar2.f7135b.a(shareSaveAppInfo);
                    }
                    return;
                } finally {
                }
            case 9:
                Navigation.m118xe87b8eb4((NavDirections) obj, view);
                return;
            case 10:
                MayaFavoriteReminderSampleBottomSheetDialogFragment mayaFavoriteReminderSampleBottomSheetDialogFragment = (MayaFavoriteReminderSampleBottomSheetDialogFragment) obj;
                Callback.onClick_enter(view);
                try {
                    mayaFavoriteReminderSampleBottomSheetDialogFragment.dismiss();
                    return;
                } finally {
                }
            case 11:
                MayaProminentDisclosureBottomSheetDialogFragment mayaProminentDisclosureBottomSheetDialogFragment = (MayaProminentDisclosureBottomSheetDialogFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaProminentDisclosureBottomSheetDialogFragment.s1(mayaProminentDisclosureBottomSheetDialogFragment);
                    return;
                } finally {
                }
            case 12:
                MayaShopPaymentConfirmationFragment mayaShopPaymentConfirmationFragment = (MayaShopPaymentConfirmationFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaShopPaymentConfirmationFragment.G1(mayaShopPaymentConfirmationFragment);
                    return;
                } finally {
                }
            case 13:
                MayaShopProviderPageFragment mayaShopProviderPageFragment = (MayaShopProviderPageFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaShopProviderPageFragment.T1(mayaShopProviderPageFragment);
                    return;
                } finally {
                }
            case 14:
                w wVar = (w) obj;
                Callback.onClick_enter(view);
                try {
                    w.D(wVar);
                    return;
                } finally {
                }
            case 15:
                C1353d c1353d = (C1353d) obj;
                Callback.onClick_enter(view);
                try {
                    C1353d.D(c1353d);
                    return;
                } finally {
                }
            case 16:
                C1354e c1354e = (C1354e) obj;
                Callback.onClick_enter(view);
                try {
                    C1354e.D(c1354e);
                    return;
                } finally {
                }
            case 17:
                dc.f fVar = (dc.f) obj;
                Callback.onClick_enter(view);
                try {
                    dc.f.D(fVar);
                    return;
                } finally {
                }
            case 18:
                dc.h hVar = (dc.h) obj;
                Callback.onClick_enter(view);
                try {
                    dc.h.D(hVar);
                    return;
                } finally {
                }
            case 19:
                dc.j jVar = (dc.j) obj;
                Callback.onClick_enter(view);
                try {
                    dc.j.D(jVar);
                    return;
                } finally {
                }
            case 20:
                dc.k kVar = (dc.k) obj;
                Callback.onClick_enter(view);
                try {
                    kVar.h.j(kVar.i, kVar.j);
                    return;
                } finally {
                }
            case 21:
                dc.l lVar = (dc.l) obj;
                Callback.onClick_enter(view);
                try {
                    dc.l.D(lVar);
                    return;
                } finally {
                }
            case 22:
                dc.m mVar = (dc.m) obj;
                Callback.onClick_enter(view);
                try {
                    dc.m.D(mVar);
                    return;
                } finally {
                }
            case 23:
                dc.p pVar = (dc.p) obj;
                Callback.onClick_enter(view);
                try {
                    dc.p pVar2 = (dc.p) pVar.i.f5284b;
                    ShopPurchaseHistory shopPurchaseHistory = pVar2.j;
                    if (shopPurchaseHistory != null) {
                        pVar2.f16350a.e(shopPurchaseHistory);
                    }
                    return;
                } finally {
                }
            case 24:
                dc.q qVar = (dc.q) obj;
                Callback.onClick_enter(view);
                try {
                    qVar.h.d1(qVar.i, qVar.j);
                    return;
                } finally {
                }
            case 25:
                RequestMoneyFormFragment requestMoneyFormFragment = (RequestMoneyFormFragment) obj;
                Callback.onClick_enter(view);
                try {
                    RequestMoneyFormFragment.t1(requestMoneyFormFragment);
                    return;
                } finally {
                }
            case 26:
                RequestMoneyFragment requestMoneyFragment = (RequestMoneyFragment) obj;
                Callback.onClick_enter(view);
                try {
                    ((RequestMoneyActivity) requestMoneyFragment.f14714T).t1();
                    return;
                } finally {
                }
            case 27:
                RequestMoneySuccessFragment requestMoneySuccessFragment = (RequestMoneySuccessFragment) obj;
                Callback.onClick_enter(view);
                try {
                    RequestMoneyActivity requestMoneyActivity = (RequestMoneyActivity) requestMoneySuccessFragment.f14719T;
                    requestMoneyActivity.e.getClass();
                    B5.i.j(requestMoneyActivity);
                    return;
                } finally {
                }
            case 28:
                MayaAccountProvisionFragment mayaAccountProvisionFragment = (MayaAccountProvisionFragment) obj;
                Callback.onClick_enter(view);
                try {
                    MayaAccountProvisionFragment.O1(mayaAccountProvisionFragment);
                    return;
                } finally {
                }
            default:
                MayaPasswordTipsBottomSheetDialogFragment mayaPasswordTipsBottomSheetDialogFragment = (MayaPasswordTipsBottomSheetDialogFragment) obj;
                Callback.onClick_enter(view);
                try {
                    mayaPasswordTipsBottomSheetDialogFragment.dismiss();
                    return;
                } finally {
                }
        }
    }
}
