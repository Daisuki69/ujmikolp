package E8;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import bg.AbstractC0983W;
import com.google.android.material.textfield.TextInputEditText;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseDialogFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.model.FundSource;
import com.paymaya.mayaui.common.view.dialog.impl.MayaLoadingDialogFragment;
import com.paymaya.mayaui.dataprivacy.view.dialog.impl.MayaDataPrivacyDialogFragment;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaDynamicMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditAssignContactReferenceFragment;
import com.paymaya.ui.dataprivacy.view.activity.impl.DataPrivacyActivity;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.AbstractBaseEDDFormFragmentImpl;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment;
import java.util.ArrayList;
import java.util.List;
import sd.AbstractC2252a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class D implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1268b;

    public /* synthetic */ D(Object obj, int i) {
        this.f1267a = i;
        this.f1268b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, final int i) {
        int i4 = 1;
        switch (this.f1267a) {
            case 0:
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                FragmentActivity fragmentActivity = (FragmentActivity) this.f1268b;
                intent.setData(Uri.fromParts("package", fragmentActivity.getPackageName(), null));
                fragmentActivity.startActivity(intent);
                return;
            case 1:
                MayaDataPrivacyDialogFragment mayaDataPrivacyDialogFragment = (MayaDataPrivacyDialogFragment) this.f1268b;
                M7.c cVar = mayaDataPrivacyDialogFragment.f12268T;
                if (cVar == null) {
                    kotlin.jvm.internal.j.n("mPresenter");
                    throw null;
                }
                Fragment fragment = (MayaDataPrivacyDialogFragment) ((P7.a) cVar.c.get());
                fragment.getParentFragmentManager().beginTransaction().hide(fragment).commit();
                MayaBaseDialogFragment mayaBaseDialogFragment = (MayaBaseDialogFragment) ((P7.a) cVar.c.get());
                com.paymaya.common.utility.C.R(mayaBaseDialogFragment.getActivity());
                String string = mayaBaseDialogFragment.getString(R.string.pma_progress_message_please_wait);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                Bundle bundle = new Bundle();
                bundle.putString("message", string);
                bundle.putBoolean("cancelable", false);
                MayaLoadingDialogFragment mayaLoadingDialogFragment = new MayaLoadingDialogFragment();
                mayaLoadingDialogFragment.setArguments(bundle);
                mayaBaseDialogFragment.f10331K = mayaLoadingDialogFragment;
                mayaLoadingDialogFragment.show(mayaBaseDialogFragment.getChildFragmentManager(), "loading_dialog");
                Ah.p<List<Consent>> userConsent = cVar.e.f11481b.getUserConsent();
                Ah.o oVarA = zh.b.a();
                userConsent.getClass();
                G7.t tVar = new G7.t(cVar, 23);
                Gh.d dVar = new Gh.d(i4, new G6.r(cVar, 21), new G6.u(cVar, 20));
                try {
                    try {
                        userConsent.f(new Lh.g(new Hh.d(dVar, tVar, i4), oVarA));
                        cVar.e(dVar);
                        C1220i c1220iL1 = mayaDataPrivacyDialogFragment.l1();
                        C1219h c1219hE = C1219h.e(AbstractC1213b.l(2));
                        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                        c1219hE.j.put("page_name", C2576A.b0(Ke.d.a(mayaDataPrivacyDialogFragment.n1())).toString());
                        c1219hE.j.put("modal", "Data privacy");
                        c1219hE.j.put("button", mayaDataPrivacyDialogFragment.getString(R.string.maya_label_view_terms_and_conditions));
                        c1219hE.j.put("destination_page", "Data personalization");
                        c1219hE.i();
                        c1220iL1.b(c1219hE);
                        return;
                    } catch (NullPointerException e) {
                        throw e;
                    } catch (Throwable th2) {
                        AbstractC0983W.G(th2);
                        NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                        nullPointerException.initCause(th2);
                        throw nullPointerException;
                    }
                } catch (NullPointerException e7) {
                    throw e7;
                } catch (Throwable th3) {
                    throw AbstractC1213b.L(th3, "subscribeActual failed", th3);
                }
            case 2:
                dialogInterface.dismiss();
                Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = (NewMayaCreditAssignContactReferenceFragment) this.f1268b;
                intent2.setData(Uri.fromParts("package", newMayaCreditAssignContactReferenceFragment.requireContext().getPackageName(), null));
                newMayaCreditAssignContactReferenceFragment.startActivity(intent2);
                return;
            case 3:
                int i6 = DataPrivacyActivity.f14472s;
                DataPrivacyActivity dataPrivacyActivity = (DataPrivacyActivity) this.f1268b;
                C1220i c1220i = dataPrivacyActivity.c;
                C1219h c1219hD = C1219h.d(EnumC1215d.DATA_PRIVACY);
                c1219hD.n(17);
                c1219hD.t(EnumC1217f.DISAGREE);
                c1220i.c(dataPrivacyActivity, c1219hD);
                dataPrivacyActivity.e.getClass();
                Intent intentQ0 = B5.i.q0(dataPrivacyActivity);
                intentQ0.setFlags(268468224);
                dataPrivacyActivity.startActivity(intentQ0);
                dataPrivacyActivity.finish();
                return;
            case 4:
                int i10 = MayaDynamicMerchantActivity.f12840r;
                ((MayaDynamicMerchantActivity) this.f1268b).finish();
                return;
            case 5:
                int i11 = MayaMerchantActivity.f12845s;
                ((MayaMerchantActivity) this.f1268b).finish();
                return;
            case 6:
                int i12 = MayaQRPHMerchantActivity.f12851t;
                ((MayaQRPHMerchantActivity) this.f1268b).finish();
                return;
            case 7:
                int i13 = EDDActivity.m;
                EDDActivity eDDActivity = (EDDActivity) this.f1268b;
                eDDActivity.finish();
                eDDActivity.e.a();
                return;
            case 8:
                ShopV3PaymentFragment shopV3PaymentFragment = (ShopV3PaymentFragment) this.f1268b;
                TextInputEditText textInputEditTextD1 = shopV3PaymentFragment.D1();
                com.paymaya.common.adapter.a aVar = shopV3PaymentFragment.f14816e0;
                if (aVar == null) {
                    kotlin.jvm.internal.j.n("mFundSourceAdapter");
                    throw null;
                }
                textInputEditTextD1.setText(aVar.f10232b.b(aVar.f10231a.get(i)));
                com.paymaya.common.adapter.a aVar2 = shopV3PaymentFragment.f14816e0;
                if (aVar2 == null) {
                    kotlin.jvm.internal.j.n("mFundSourceAdapter");
                    throw null;
                }
                shopV3PaymentFragment.f14823l0 = (FundSource) aVar2.f10231a.get(i);
                dialogInterface.dismiss();
                return;
            default:
                AbstractBaseEDDFormFragmentImpl abstractBaseEDDFormFragmentImpl = (AbstractBaseEDDFormFragmentImpl) this.f1268b;
                Object objU1 = abstractBaseEDDFormFragmentImpl.u1();
                int i14 = abstractBaseEDDFormFragmentImpl.f14506T;
                AbstractC2252a abstractC2252a = (AbstractC2252a) objU1;
                if (i == i14) {
                    return;
                }
                if (i14 == 0 && i == 1) {
                    final AbstractBaseEDDFormFragmentImpl abstractBaseEDDFormFragmentImpl2 = (AbstractBaseEDDFormFragmentImpl) abstractC2252a.o();
                    Context context = abstractBaseEDDFormFragmentImpl2.getContext();
                    if (context != null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        builder.setTitle(context.getString(R.string.pma_label_edd_change_confirmation_title));
                        builder.setMessage(R.string.pma_label_edd_change_confirmation_spiel).setPositiveButton(R.string.pma_label_yes, new DialogInterface.OnClickListener() { // from class: zd.b
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface2, int i15) {
                                AbstractBaseEDDFormFragmentImpl abstractBaseEDDFormFragmentImpl3 = abstractBaseEDDFormFragmentImpl2;
                                abstractBaseEDDFormFragmentImpl3.f14506T = 1;
                                abstractBaseEDDFormFragmentImpl3.t1().setText((CharSequence) abstractBaseEDDFormFragmentImpl3.f14510X[i].get("choice"));
                                abstractBaseEDDFormFragmentImpl3.f14508V = new ArrayList();
                                abstractBaseEDDFormFragmentImpl3.s1().removeAllViews();
                                abstractBaseEDDFormFragmentImpl3.i(null, false);
                                abstractBaseEDDFormFragmentImpl3.v1();
                            }
                        }).setNegativeButton(R.string.pma_label_cancel, new E(8));
                        builder.show();
                        return;
                    }
                    return;
                }
                if (i != 0) {
                    if (i == 1) {
                        AbstractBaseEDDFormFragmentImpl abstractBaseEDDFormFragmentImpl3 = (AbstractBaseEDDFormFragmentImpl) abstractC2252a.o();
                        abstractBaseEDDFormFragmentImpl3.f14506T = 1;
                        abstractBaseEDDFormFragmentImpl3.t1().setText((CharSequence) abstractBaseEDDFormFragmentImpl3.f14510X[1].get("choice"));
                        return;
                    }
                    return;
                }
                AbstractBaseEDDFormFragmentImpl abstractBaseEDDFormFragmentImpl4 = (AbstractBaseEDDFormFragmentImpl) abstractC2252a.o();
                Group group = abstractBaseEDDFormFragmentImpl4.mAddItemGroup;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mAddItemGroup");
                    throw null;
                }
                group.setVisibility(0);
                View view = abstractBaseEDDFormFragmentImpl4.mAddItemButton;
                if (view == null) {
                    kotlin.jvm.internal.j.n("mAddItemButton");
                    throw null;
                }
                view.setVisibility(0);
                ((AbstractBaseEDDFormFragmentImpl) abstractC2252a.o()).x1();
                return;
        }
    }
}
