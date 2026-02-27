package Bb;

import G7.t;
import K8.InterfaceC0284i;
import K8.x;
import Kh.B;
import M8.InterfaceC0345d0;
import N5.C0447e;
import N5.C0450f;
import N5.C0453g;
import N5.C0457h0;
import N5.C0463k0;
import N5.K;
import We.s;
import ae.InterfaceC0685a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Html;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.C1042m;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.EnumC1235y;
import com.paymaya.common.utility.Z;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.model.FundSource;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycIntro;
import com.paymaya.domain.model.KycUnlockEverythingDetails;
import com.paymaya.domain.model.KycUpgradeStepImage;
import com.paymaya.domain.model.KycUpgradeStepsGuide;
import com.paymaya.domain.model.MerchantPayment;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.model.ProductProviderDetails;
import com.paymaya.domain.model.ProductProviderField;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.ProfileBadgesConfig;
import com.paymaya.domain.model.QRBankTransferRecipient;
import com.paymaya.domain.model.QRMerchant;
import com.paymaya.domain.model.QRPHMerchantPaymentRequest;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.domain.model.QRRecipient;
import com.paymaya.domain.model.ReKycNudgeInfoContent;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.store.c1;
import com.paymaya.mayaui.autodebitarrangement.view.activity.impl.MayaAutoDebitArrangementActivity;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaAutoCashinWalletSettingsFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaWebInterstitialFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyPolicyFragment;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycCompleteYourMayaExperienceFragmentV2;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycMaintenanceFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycPersonalInfoConfirmSubmissionFragment;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentReceiptFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHDynamicMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantPaymentFragment;
import com.paymaya.mayaui.profile.view.activity.impl.MayaProfileActivity;
import com.paymaya.mayaui.profile.view.fragment.impl.MayaProfileFragment;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaMLKitQRScannerFragment;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaQRScannerFragment;
import com.paymaya.mayaui.rekyc.view.fragment.impl.ReKycNudgeFragment;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyFragment;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryEmailFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangePasswordFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaSettingsFragment;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPaymentFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderPageFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProviderProductsListFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopProvidersCollectionFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryFragment;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopSearchFragment;
import com.paymaya.ui.qr.view.activity.impl.BarcodeScannerActivity;
import com.paymaya.ui.qr.view.activity.impl.QRActivity;
import com.paymaya.ui.qr.view.activity.impl.RequestMoneyV3Activity;
import com.paymaya.ui.qr.view.dialog.impl.MeralcoBillDialogFragment;
import com.paymaya.ui.qr.view.fragment.impl.MLKitBarcodeScannerFragment;
import com.paymaya.ui.qr.view.fragment.impl.MyQRFragment;
import com.paymaya.ui.qr.view.fragment.impl.QRScannerFragment;
import com.paymaya.ui.qr.view.fragment.impl.RequestMoneyV3NewFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ReceiptFragment;
import dOYHB6.yFtIp6.svM7M6;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k2.v0;
import k6.InterfaceC1767a;
import kotlin.Pair;
import m9.InterfaceC1857b;
import m9.InterfaceC1858c;
import na.InterfaceC1942a;
import o1.AbstractC1955a;
import p9.InterfaceC2023h;
import pg.u;
import v.AbstractC2329d;
import x4.EnumC2464a;
import y4.C2506b;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.C2578C;
import zj.C2579a;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f389d;
    public final com.paymaya.data.preference.a e;

    public /* synthetic */ a(com.paymaya.data.preference.a aVar, int i, boolean z4) {
        this.f389d = i;
        this.e = aVar;
    }

    private final void q() {
        super.j();
        kb.b bVar = (kb.b) this.c.get();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReKycNudgeInfoContent("", "Wallet"));
        arrayList.add(new ReKycNudgeInfoContent("", "Savings"));
        arrayList.add(new ReKycNudgeInfoContent("", "Credit"));
        arrayList.add(new ReKycNudgeInfoContent("", "Crypto"));
        ReKycNudgeFragment reKycNudgeFragment = (ReKycNudgeFragment) bVar;
        reKycNudgeFragment.getClass();
        Context contextRequireContext = reKycNudgeFragment.requireContext();
        kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
        reKycNudgeFragment.f13710X = new jb.a(contextRequireContext, arrayList);
        C0453g c0453g = reKycNudgeFragment.f13707U;
        kotlin.jvm.internal.j.d(c0453g);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(reKycNudgeFragment.requireContext(), 4, 1, false);
        RecyclerView recyclerView = (RecyclerView) c0453g.e;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.addItemDecoration(new J8.n(0, recyclerView.getResources().getDimensionPixelSize(R.dimen.maya_margin_small), 0, 5));
        jb.a aVar = reKycNudgeFragment.f13710X;
        if (aVar != null) {
            recyclerView.setAdapter(aVar);
        } else {
            kotlin.jvm.internal.j.n("mReKycNudgeInfoAdapter");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void r() {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bb.a.r():void");
    }

    private final void s() {
        super.j();
        InterfaceC1857b interfaceC1857b = (InterfaceC1857b) this.c.get();
        Bundle extras = ((MayaMerchantActivity) ((InterfaceC1857b) this.c.get())).getIntent().getExtras();
        QRMerchant qRMerchant = extras != null ? (QRMerchant) extras.getParcelable("merchant") : null;
        MayaMerchantActivity mayaMerchantActivity = (MayaMerchantActivity) interfaceC1857b;
        mayaMerchantActivity.getClass();
        MayaMerchantPaymentFragment mayaMerchantPaymentFragment = new MayaMerchantPaymentFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("merchant", qRMerchant);
        mayaMerchantPaymentFragment.setArguments(bundle);
        AbstractC1236z.g(mayaMerchantActivity, R.id.maya_activity_merchant_fragment_container, mayaMerchantPaymentFragment);
        if (this.e.e().isQrWithCheckoutFlowEnabled()) {
            ((MayaMerchantActivity) ((InterfaceC1857b) this.c.get())).W1();
        }
    }

    private final void t() {
        String str;
        Amount amountMAvailableBalance;
        String currencyFormattedValue;
        super.j();
        Bundle arguments = ((MayaMerchantPaymentReceiptFragment) ((o9.e) this.c.get())).getArguments();
        MerchantPayment merchantPayment = arguments != null ? (MerchantPayment) arguments.getParcelable("merchant_payment") : null;
        Bundle arguments2 = ((MayaMerchantPaymentReceiptFragment) ((o9.e) this.c.get())).getArguments();
        QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction = arguments2 != null ? (QRPHMerchantPaymentTransaction) arguments2.getParcelable("qr_ph_merchant_payment_transaction") : null;
        str = "";
        if (merchantPayment != null) {
            o9.e eVar = (o9.e) this.c.get();
            String strMMerchantName = merchantPayment.mMerchantName();
            if (strMMerchantName == null) {
                strMMerchantName = "";
            }
            MayaMerchantPaymentReceiptFragment mayaMerchantPaymentReceiptFragment = (MayaMerchantPaymentReceiptFragment) eVar;
            mayaMerchantPaymentReceiptFragment.getClass();
            TextView textView = mayaMerchantPaymentReceiptFragment.f12882V;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mMerchantNameText");
                throw null;
            }
            textView.setText(strMMerchantName);
            o9.e eVar2 = (o9.e) this.c.get();
            String amountFormattedValue = merchantPayment.getAmountFormattedValue();
            kotlin.jvm.internal.j.f(amountFormattedValue, "getAmountFormattedValue(...)");
            TextView textView2 = ((MayaMerchantPaymentReceiptFragment) eVar2).f12883W;
            if (textView2 == null) {
                kotlin.jvm.internal.j.n("mAmountText");
                throw null;
            }
            textView2.setText(amountFormattedValue);
            o9.e eVar3 = (o9.e) this.c.get();
            String strMRequestReferenceNo = merchantPayment.mRequestReferenceNo();
            str = strMRequestReferenceNo != null ? strMRequestReferenceNo : "";
            TextView textView3 = ((MayaMerchantPaymentReceiptFragment) eVar3).f12884X;
            if (textView3 == null) {
                kotlin.jvm.internal.j.n("mReferenceIdText");
                throw null;
            }
            textView3.setText(str);
            o9.e eVar4 = (o9.e) this.c.get();
            String availableBalanceFormattedValue = merchantPayment.getAvailableBalanceFormattedValue();
            kotlin.jvm.internal.j.f(availableBalanceFormattedValue, "getAvailableBalanceFormattedValue(...)");
            MayaMerchantPaymentReceiptFragment mayaMerchantPaymentReceiptFragment2 = (MayaMerchantPaymentReceiptFragment) eVar4;
            mayaMerchantPaymentReceiptFragment2.getClass();
            mayaMerchantPaymentReceiptFragment2.L1(availableBalanceFormattedValue);
            InterfaceC2023h interfaceC2023h = ((MayaMerchantPaymentReceiptFragment) ((o9.e) this.c.get())).f12886Z;
            if ((interfaceC2023h != null ? interfaceC2023h.w() : false) || merchantPayment.normalizeRedirectUrl() != null) {
                ((MayaMerchantPaymentReceiptFragment) ((o9.e) this.c.get())).D1(R.string.maya_label_back_to_merchant);
            } else {
                ((MayaMerchantPaymentReceiptFragment) ((o9.e) this.c.get())).D1(R.string.pma_label_back_to_home);
            }
            ((MayaMerchantPaymentReceiptFragment) ((o9.e) this.c.get())).U1();
            if (this.e.e().isInAppReviewQrPaymentEnabled()) {
                ((BaseFragment) ((o9.e) this.c.get())).q1("qr payment");
                return;
            }
            return;
        }
        if (qRPHMerchantPaymentTransaction != null) {
            o9.e eVar5 = (o9.e) this.c.get();
            String merchantName = qRPHMerchantPaymentTransaction.getMerchantDetails().getName();
            MayaMerchantPaymentReceiptFragment mayaMerchantPaymentReceiptFragment3 = (MayaMerchantPaymentReceiptFragment) eVar5;
            mayaMerchantPaymentReceiptFragment3.getClass();
            kotlin.jvm.internal.j.g(merchantName, "merchantName");
            TextView textView4 = mayaMerchantPaymentReceiptFragment3.f12882V;
            if (textView4 == null) {
                kotlin.jvm.internal.j.n("mMerchantNameText");
                throw null;
            }
            textView4.setText(merchantName);
            o9.e eVar6 = (o9.e) this.c.get();
            String currencyFormattedValue2 = qRPHMerchantPaymentTransaction.getAmount().getCurrencyFormattedValue();
            kotlin.jvm.internal.j.f(currencyFormattedValue2, "getCurrencyFormattedValue(...)");
            TextView textView5 = ((MayaMerchantPaymentReceiptFragment) eVar6).f12883W;
            if (textView5 == null) {
                kotlin.jvm.internal.j.n("mAmountText");
                throw null;
            }
            textView5.setText(currencyFormattedValue2);
            o9.e eVar7 = (o9.e) this.c.get();
            String strF0 = C2578C.f0(12, z.t(qRPHMerchantPaymentTransaction.getPaymentToken().getId(), Global.HYPHEN, ""));
            TextView textView6 = ((MayaMerchantPaymentReceiptFragment) eVar7).f12884X;
            if (textView6 == null) {
                kotlin.jvm.internal.j.n("mReferenceIdText");
                throw null;
            }
            textView6.setText(strF0);
            o9.e eVar8 = (o9.e) this.c.get();
            AccountBalance accountBalance = qRPHMerchantPaymentTransaction.getAccountBalance();
            if (accountBalance != null && (amountMAvailableBalance = accountBalance.mAvailableBalance()) != null && (currencyFormattedValue = amountMAvailableBalance.getCurrencyFormattedValue()) != null) {
                str = currencyFormattedValue;
            }
            MayaMerchantPaymentReceiptFragment mayaMerchantPaymentReceiptFragment4 = (MayaMerchantPaymentReceiptFragment) eVar8;
            mayaMerchantPaymentReceiptFragment4.getClass();
            mayaMerchantPaymentReceiptFragment4.L1(str);
            ((MayaMerchantPaymentReceiptFragment) ((o9.e) this.c.get())).D1(R.string.pma_label_back_to_home);
            ((MayaMerchantPaymentReceiptFragment) ((o9.e) this.c.get())).T1();
            ((MayaMerchantPaymentReceiptFragment) ((o9.e) this.c.get())).U1();
            if (this.e.e().isInAppReviewQrPaymentEnabled()) {
                ((BaseFragment) ((o9.e) this.c.get())).q1("qr payment");
            }
        }
    }

    private final void u() {
        super.j();
        Bundle extras = ((MayaQRPHMerchantActivity) ((InterfaceC1858c) this.c.get())).getIntent().getExtras();
        QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest = extras != null ? (QRPHMerchantPaymentRequest) extras.getParcelable("qr_ph_merchant_payment_request") : null;
        if (this.e.e().isQrWithCheckoutFlowEnabled()) {
            ((MayaQRPHMerchantActivity) ((InterfaceC1858c) this.c.get())).Y1();
        }
        if (qRPHMerchantPaymentRequest != null && qRPHMerchantPaymentRequest.isStaticPointOfInitiation()) {
            MayaQRPHMerchantActivity mayaQRPHMerchantActivity = (MayaQRPHMerchantActivity) ((InterfaceC1858c) this.c.get());
            mayaQRPHMerchantActivity.getClass();
            MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment = new MayaQRPHMerchantPaymentFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("qrph_merchant_payment_request", qRPHMerchantPaymentRequest);
            mayaQRPHMerchantPaymentFragment.setArguments(bundle);
            AbstractC1236z.g(mayaQRPHMerchantActivity, R.id.maya_activity_qr_ph_merchant_fragment_container, mayaQRPHMerchantPaymentFragment);
            return;
        }
        if (qRPHMerchantPaymentRequest == null || !qRPHMerchantPaymentRequest.isDynamicPointOfInitiation()) {
            ((MayaQRPHMerchantActivity) ((InterfaceC1858c) this.c.get())).finish();
            return;
        }
        MayaQRPHMerchantActivity mayaQRPHMerchantActivity2 = (MayaQRPHMerchantActivity) ((InterfaceC1858c) this.c.get());
        mayaQRPHMerchantActivity2.getClass();
        MayaQRPHDynamicMerchantPaymentFragment mayaQRPHDynamicMerchantPaymentFragment = new MayaQRPHDynamicMerchantPaymentFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("qrph_merchant_payment_request", qRPHMerchantPaymentRequest);
        mayaQRPHDynamicMerchantPaymentFragment.setArguments(bundle2);
        AbstractC1236z.g(mayaQRPHMerchantActivity2, R.id.maya_activity_qr_ph_merchant_fragment_container, mayaQRPHDynamicMerchantPaymentFragment);
    }

    private final void v() {
        List<String> listVerifiedSellerLevelList;
        super.j();
        MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) ((InterfaceC1942a) this.c.get());
        mayaProfileActivity.getClass();
        AbstractC1236z.g(mayaProfileActivity, R.id.frame_layout_container, new MayaProfileFragment());
        if (!kotlin.jvm.internal.j.b(this.e.l(), "kyc1")) {
            MayaProfileActivity mayaProfileActivity2 = (MayaProfileActivity) ((InterfaceC1942a) this.c.get());
            AppCompatTextView appCompatTextView = mayaProfileActivity2.f13494q;
            if (appCompatTextView == null) {
                kotlin.jvm.internal.j.n("mAccountStatusTextView");
                throw null;
            }
            appCompatTextView.setText(mayaProfileActivity2.getString(R.string.maya_label_basic_account));
            appCompatTextView.setBackgroundResource(R.drawable.maya_bg_no_border_yellow);
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.maya_ic_profile_basic_account, 0, 0, 0);
            return;
        }
        com.paymaya.data.preference.a aVar = this.e;
        ProfileBadgesConfig profileBadgesConfigMProfileBadgesConfig = aVar.e().mProfileBadgesConfig();
        if (profileBadgesConfigMProfileBadgesConfig == null || (listVerifiedSellerLevelList = profileBadgesConfigMProfileBadgesConfig.verifiedSellerLevelList()) == null || !listVerifiedSellerLevelList.contains(svM7M6.getString(aVar.f11330b, "key_customer_account_product_offering_level", ""))) {
            MayaProfileActivity mayaProfileActivity3 = (MayaProfileActivity) ((InterfaceC1942a) this.c.get());
            AppCompatTextView appCompatTextView2 = mayaProfileActivity3.f13494q;
            if (appCompatTextView2 == null) {
                kotlin.jvm.internal.j.n("mAccountStatusTextView");
                throw null;
            }
            appCompatTextView2.setText(mayaProfileActivity3.getString(R.string.maya_label_upgraded_account));
            appCompatTextView2.setBackgroundResource(R.drawable.maya_bg_no_border_green);
            appCompatTextView2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.maya_ic_profile_upgraded_account, 0, 0, 0);
            return;
        }
        MayaProfileActivity mayaProfileActivity4 = (MayaProfileActivity) ((InterfaceC1942a) this.c.get());
        mayaProfileActivity4.getClass();
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = mayaProfileActivity4.getTheme();
        if (theme != null) {
            theme.resolveAttribute(R.attr.mayaTextPrimaryNegativeColor, typedValue, true);
        }
        int color = ContextCompat.getColor(mayaProfileActivity4, typedValue.resourceId);
        AppCompatTextView appCompatTextView3 = mayaProfileActivity4.f13494q;
        if (appCompatTextView3 == null) {
            kotlin.jvm.internal.j.n("mAccountStatusTextView");
            throw null;
        }
        appCompatTextView3.setText(mayaProfileActivity4.getString(R.string.maya_label_verified_seller));
        appCompatTextView3.setTextColor(color);
        appCompatTextView3.setBackgroundResource(R.drawable.maya_bg_no_border_dark_green);
        appCompatTextView3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.maya_ic_profile_verified_seller, 0, 0, 0);
    }

    private final void w() {
        String strMName;
        String currencyFormattedValue;
        ArrayList<ProductProviderField> arrayList;
        Intent intent;
        Intent intent2;
        String strI;
        super.j();
        Order order = ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).f14880V;
        PaymentConfirmationSummary paymentConfirmationSummary = ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).f14881W;
        if (paymentConfirmationSummary == null || order == null) {
            return;
        }
        ProductV3 targetProduct = paymentConfirmationSummary.getTargetProduct();
        if (o(order.mStatus())) {
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).H1();
        } else {
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).I1();
        }
        if (o(order.mStatus())) {
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).J1(R.string.pma_label_shop_receipt_title_status_processing);
        } else {
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).J1(R.string.pma_label_shop_receipt_title_status_success);
        }
        String strMStatus = order.mStatus();
        if (targetProduct != null && targetProduct.isProductBeepCard()) {
            ShopV3ReceiptFragment shopV3ReceiptFragment = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            shopV3ReceiptFragment.G1(shopV3ReceiptFragment.getString(R.string.pma_label_beep_card_spiel));
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).N1();
        } else if (o(strMStatus)) {
            ShopV3ReceiptFragment shopV3ReceiptFragment2 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            shopV3ReceiptFragment2.G1(shopV3ReceiptFragment2.getString(R.string.pma_label_shop_receipt_subtitle_status_processing));
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).N1();
        } else {
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).w1();
        }
        if (o(order.mStatus())) {
            ShopV3ReceiptFragment shopV3ReceiptFragment3 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            shopV3ReceiptFragment3.Z1().setText(shopV3ReceiptFragment3.getString(R.string.pma_label_processing));
            shopV3ReceiptFragment3.Z1().setCompoundDrawablesWithIntrinsicBounds(R.drawable.pma_ic_processing_status, 0, 0, 0);
        } else {
            ShopV3ReceiptFragment shopV3ReceiptFragment4 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            shopV3ReceiptFragment4.Z1().setText(shopV3ReceiptFragment4.getString(R.string.pma_label_completed));
            shopV3ReceiptFragment4.Z1().setCompoundDrawablesWithIntrinsicBounds(R.drawable.pma_ic_check_status, 0, 0, 0);
        }
        String productName = targetProduct.getName();
        String iconUrl = targetProduct.getIconUrl();
        String strMCode = order.mCode();
        boolean z4 = strMCode == null || C2576A.H(strMCode);
        kotlin.jvm.internal.j.g(productName, "productName");
        if (z4) {
            K k8 = ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).f14879U;
            kotlin.jvm.internal.j.d(k8);
            ((Group) k8.f3709v).setVisibility(8);
            ShopV3ReceiptFragment shopV3ReceiptFragment5 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            shopV3ReceiptFragment5.getClass();
            K k10 = shopV3ReceiptFragment5.f14879U;
            kotlin.jvm.internal.j.d(k10);
            k10.f3700l.setText(productName);
            ShopV3ReceiptFragment shopV3ReceiptFragment6 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            shopV3ReceiptFragment6.getClass();
            int iO = v0.o(56);
            K k11 = shopV3ReceiptFragment6.f14879U;
            kotlin.jvm.internal.j.d(k11);
            C.c0(iconUrl, 2131232014, k11.f3699k, iO, iO, 0);
        } else {
            K k12 = ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).f14879U;
            kotlin.jvm.internal.j.d(k12);
            ((RelativeLayout) k12.f3705r).setVisibility(8);
            if (this.e.e().isMayaShopWithCheckoutFlowEnabled()) {
                ShopV3ReceiptFragment shopV3ReceiptFragment7 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
                K k13 = shopV3ReceiptFragment7.f14879U;
                kotlin.jvm.internal.j.d(k13);
                ((TextView) k13.f3702o).setVisibility(8);
                K k14 = shopV3ReceiptFragment7.f14879U;
                kotlin.jvm.internal.j.d(k14);
                ((TextView) k14.f3710w).setVisibility(8);
            } else {
                ShopV3ReceiptFragment shopV3ReceiptFragment8 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
                K k15 = shopV3ReceiptFragment8.f14879U;
                kotlin.jvm.internal.j.d(k15);
                ((TextView) k15.f3702o).setVisibility(0);
                K k16 = shopV3ReceiptFragment8.f14879U;
                kotlin.jvm.internal.j.d(k16);
                ((TextView) k16.f3710w).setVisibility(0);
                ShopV3ReceiptFragment shopV3ReceiptFragment9 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
                shopV3ReceiptFragment9.getClass();
                K k17 = shopV3ReceiptFragment9.f14879U;
                kotlin.jvm.internal.j.d(k17);
                ((TextView) k17.f3710w).setText(productName);
            }
        }
        boolean zIsPromo = targetProduct.isPromo();
        Amount amountOriginal = targetProduct.getAmountOriginal();
        Amount amountDiscounted = targetProduct.getAmountDiscounted();
        kotlin.jvm.internal.j.g(amountOriginal, "amountOriginal");
        ve.l lVar = (ve.l) this.c.get();
        String currencyFormattedValue2 = (!zIsPromo || amountDiscounted == null) ? amountOriginal.getCurrencyFormattedValue() : amountDiscounted.getCurrencyFormattedValue();
        kotlin.jvm.internal.j.d(currencyFormattedValue2);
        ShopV3ReceiptFragment shopV3ReceiptFragment10 = (ShopV3ReceiptFragment) lVar;
        shopV3ReceiptFragment10.getClass();
        K k18 = shopV3ReceiptFragment10.f14879U;
        kotlin.jvm.internal.j.d(k18);
        k18.f3697d.setText(currencyFormattedValue2);
        FundSource appliedFundSource = paymentConfirmationSummary.getAppliedFundSource();
        if (this.e.e().isMayaShopWithCheckoutFlowEnabled()) {
            ShopV3ReceiptFragment shopV3ReceiptFragment11 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            K k19 = shopV3ReceiptFragment11.f14879U;
            kotlin.jvm.internal.j.d(k19);
            k19.f.setVisibility(8);
            K k20 = shopV3ReceiptFragment11.f14879U;
            kotlin.jvm.internal.j.d(k20);
            k20.f3698g.setVisibility(8);
        } else {
            ShopV3ReceiptFragment shopV3ReceiptFragment12 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            K k21 = shopV3ReceiptFragment12.f14879U;
            kotlin.jvm.internal.j.d(k21);
            k21.f.setVisibility(0);
            K k22 = shopV3ReceiptFragment12.f14879U;
            kotlin.jvm.internal.j.d(k22);
            k22.f3698g.setVisibility(0);
            ve.l lVar2 = (ve.l) this.c.get();
            if (appliedFundSource == null || (strMName = appliedFundSource.mName()) == null) {
                strMName = "PayMaya";
            }
            ShopV3ReceiptFragment shopV3ReceiptFragment13 = (ShopV3ReceiptFragment) lVar2;
            shopV3ReceiptFragment13.getClass();
            K k23 = shopV3ReceiptFragment13.f14879U;
            kotlin.jvm.internal.j.d(k23);
            k23.f3698g.setText(strMName);
        }
        String strMPaymentId = order.mPaymentId();
        if (strMPaymentId == null || strMPaymentId.length() == 0 || !this.e.e().isMayaShopWithCheckoutFlowEnabled()) {
            ShopV3ReceiptFragment shopV3ReceiptFragment14 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            K k24 = shopV3ReceiptFragment14.f14879U;
            kotlin.jvm.internal.j.d(k24);
            k24.i.setVisibility(8);
            K k25 = shopV3ReceiptFragment14.f14879U;
            kotlin.jvm.internal.j.d(k25);
            k25.j.setVisibility(8);
        } else {
            ShopV3ReceiptFragment shopV3ReceiptFragment15 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            K k26 = shopV3ReceiptFragment15.f14879U;
            kotlin.jvm.internal.j.d(k26);
            k26.i.setVisibility(0);
            K k27 = shopV3ReceiptFragment15.f14879U;
            kotlin.jvm.internal.j.d(k27);
            k27.j.setVisibility(0);
            ve.l lVar3 = (ve.l) this.c.get();
            if (strMPaymentId.length() >= 12) {
                String strSubstring = strMPaymentId.substring(strMPaymentId.length() - 12);
                kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
                strMPaymentId = strSubstring.toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.j.f(strMPaymentId, "toUpperCase(...)");
            }
            ShopV3ReceiptFragment shopV3ReceiptFragment16 = (ShopV3ReceiptFragment) lVar3;
            shopV3ReceiptFragment16.getClass();
            K k28 = shopV3ReceiptFragment16.f14879U;
            kotlin.jvm.internal.j.d(k28);
            k28.j.setText(strMPaymentId);
        }
        Amount amountMAvailableBalance = order.mAvailableBalance();
        if (amountMAvailableBalance == null || (currencyFormattedValue = amountMAvailableBalance.getCurrencyFormattedValue()) == null) {
            currencyFormattedValue = "";
        }
        if (this.e.e().isMayaShopWithCheckoutFlowEnabled()) {
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).z1();
        } else {
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).S1();
            ShopV3ReceiptFragment shopV3ReceiptFragment17 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            shopV3ReceiptFragment17.getClass();
            shopV3ReceiptFragment17.L1(currencyFormattedValue);
        }
        String displayedRecipient = paymentConfirmationSummary.getDisplayedRecipient();
        String targetNumber = paymentConfirmationSummary.getTargetNumber();
        if (targetNumber != null && targetNumber.length() != 0 && (targetProduct.isProductCignal() || targetProduct.isProductBeepCard())) {
            ShopV3ReceiptFragment shopV3ReceiptFragment18 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            shopV3ReceiptFragment18.getClass();
            K k29 = shopV3ReceiptFragment18.f14879U;
            kotlin.jvm.internal.j.d(k29);
            ((TextView) k29.f3701n).setText(targetNumber);
            shopV3ReceiptFragment18.Y1().setText(R.string.pma_label_account_number);
        } else if (displayedRecipient == null || displayedRecipient.length() == 0) {
            ve.l lVar4 = (ve.l) this.c.get();
            String strR = this.e.r();
            kotlin.jvm.internal.j.f(strR, "getMobileNumber(...)");
            ShopV3ReceiptFragment shopV3ReceiptFragment19 = (ShopV3ReceiptFragment) lVar4;
            K k30 = shopV3ReceiptFragment19.f14879U;
            kotlin.jvm.internal.j.d(k30);
            ((TextView) k30.f3701n).setText(strR);
            shopV3ReceiptFragment19.Y1().setText(R.string.pma_label_recipient);
        } else {
            ShopV3ReceiptFragment shopV3ReceiptFragment20 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            K k31 = shopV3ReceiptFragment20.f14879U;
            kotlin.jvm.internal.j.d(k31);
            ((TextView) k31.f3701n).setText(displayedRecipient);
            shopV3ReceiptFragment20.Y1().setText(R.string.pma_label_recipient);
        }
        if (targetProduct.hasProductProviderFields()) {
            K k32 = ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).f14879U;
            kotlin.jvm.internal.j.d(k32);
            ((Group) k32.f3707t).setVisibility(8);
        }
        String message = paymentConfirmationSummary.getMessage();
        if (targetProduct.isProductBeepCard() || targetProduct.isProductShareTreats() || message == null || C2576A.H(message)) {
            K k33 = ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).f14879U;
            kotlin.jvm.internal.j.d(k33);
            k33.h.setVisibility(8);
        } else {
            K k34 = ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).f14879U;
            kotlin.jvm.internal.j.d(k34);
            k34.h.setVisibility(0);
            ShopV3ReceiptFragment shopV3ReceiptFragment21 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            shopV3ReceiptFragment21.getClass();
            K k35 = shopV3ReceiptFragment21.f14879U;
            kotlin.jvm.internal.j.d(k35);
            TextView textView = k35.h;
            Matcher matcher = Pattern.compile("(- From .*)").matcher(message);
            int iStart = 0;
            String strGroup = "";
            while (matcher.find()) {
                strGroup = matcher.group();
                iStart = matcher.toMatchResult().start();
            }
            if (strGroup.isEmpty()) {
                strI = Html.fromHtml(message).toString();
                if (C.X(strI)) {
                    strI = s.j("\"", strI, "\"");
                }
            } else {
                String string = Html.fromHtml(message.substring(0, iStart)).toString();
                if (!string.isEmpty() && C.X(string)) {
                    string = "\"" + string.substring(0, string.length() - 1) + "\"\n";
                }
                strI = s.i(string, strGroup);
            }
            textView.setText(strI);
        }
        boolean zIsProductShareTreats = targetProduct.isProductShareTreats();
        String productName2 = targetProduct.getName();
        String iconUrl2 = targetProduct.getIconUrl();
        String description = targetProduct.getDescription();
        String strMCode2 = order.mCode();
        kotlin.jvm.internal.j.g(productName2, "productName");
        if (strMCode2 == null || C2576A.H(strMCode2)) {
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).b2().setVisibility(8);
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).a2().setVisibility(8);
        } else if (zIsProductShareTreats) {
            ShopV3ReceiptFragment shopV3ReceiptFragment22 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            shopV3ReceiptFragment22.getClass();
            ((TextView) shopV3ReceiptFragment22.W1().f).setText(productName2);
            ve.l lVar5 = (ve.l) this.c.get();
            if (description == null) {
                description = "";
            }
            ShopV3ReceiptFragment shopV3ReceiptFragment23 = (ShopV3ReceiptFragment) lVar5;
            shopV3ReceiptFragment23.getClass();
            ((TextView) shopV3ReceiptFragment23.W1().c).setText(description);
            ShopV3ReceiptFragment shopV3ReceiptFragment24 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            shopV3ReceiptFragment24.getActivity();
            C.e0(iconUrl2, (ImageView) shopV3ReceiptFragment24.W1().f4138b, 2131232014);
            StringBuilder sb2 = new StringBuilder();
            String strT = z.t(strMCode2, Global.NEWLINE, "");
            for (int i = 0; i < 3; i++) {
                if (sb2.length() > 0) {
                    sb2.append(Global.NEWLINE);
                }
                int i4 = i * 13;
                int iMin = Math.min(strT.length(), i4 + 13);
                String strSubstring2 = strT.substring(i4, iMin);
                kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
                sb2.append(strSubstring2);
                if (strT.length() == iMin) {
                    break;
                }
            }
            ve.l lVar6 = (ve.l) this.c.get();
            String string2 = sb2.toString();
            kotlin.jvm.internal.j.f(string2, "toString(...)");
            ShopV3ReceiptFragment shopV3ReceiptFragment25 = (ShopV3ReceiptFragment) lVar6;
            shopV3ReceiptFragment25.getClass();
            ((TextView) shopV3ReceiptFragment25.W1().f4139d).setText(string2);
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).a2().setVisibility(8);
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).b2().setVisibility(0);
        } else {
            ShopV3ReceiptFragment shopV3ReceiptFragment26 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            shopV3ReceiptFragment26.getClass();
            ((TextView) shopV3ReceiptFragment26.V1().h).setText(productName2);
            ve.l lVar7 = (ve.l) this.c.get();
            if (description == null) {
                description = "";
            }
            ShopV3ReceiptFragment shopV3ReceiptFragment27 = (ShopV3ReceiptFragment) lVar7;
            shopV3ReceiptFragment27.getClass();
            ((TextView) shopV3ReceiptFragment27.V1().f).setText(description);
            ShopV3ReceiptFragment shopV3ReceiptFragment28 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            shopV3ReceiptFragment28.getActivity();
            C.e0(iconUrl2, (ImageView) shopV3ReceiptFragment28.V1().f3584g, 2131232014);
            ShopV3ReceiptFragment shopV3ReceiptFragment29 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            shopV3ReceiptFragment29.getClass();
            ((TextView) shopV3ReceiptFragment29.V1().f3583d).setText(strMCode2);
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).b2().setVisibility(8);
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).a2().setVisibility(0);
        }
        ProductProviderDetails productProviderDetails = paymentConfirmationSummary.getTargetProduct().getProductProviderDetails();
        List<ProductProviderField> listMProductProviderFields = productProviderDetails != null ? productProviderDetails.mProductProviderFields() : null;
        Map<String, String> dynamicFieldsCodeAndInput = paymentConfirmationSummary.getDynamicFieldsCodeAndInput();
        if (listMProductProviderFields != null) {
            arrayList = new ArrayList();
            for (Object obj : listMProductProviderFields) {
                if (!kotlin.jvm.internal.j.b(((ProductProviderField) obj).mIsHidden(), Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty() && dynamicFieldsCodeAndInput != null && !dynamicFieldsCodeAndInput.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (ProductProviderField productProviderField : arrayList) {
                String str = dynamicFieldsCodeAndInput.get(productProviderField.mCode());
                if (str == null) {
                    str = "";
                }
                linkedHashMap.put(productProviderField.mName(), str);
            }
            ShopV3ReceiptFragment shopV3ReceiptFragment30 = (ShopV3ReceiptFragment) ((ve.l) this.c.get());
            shopV3ReceiptFragment30.getClass();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(shopV3ReceiptFragment30.getContext());
            K k36 = shopV3ReceiptFragment30.f14879U;
            kotlin.jvm.internal.j.d(k36);
            Barrier barrier = (Barrier) k36.f3708u;
            View view = barrier;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                View viewInflate = layoutInflaterFrom.inflate(R.layout.pma_view_shop_dynamic_field_label_text_view, (ViewGroup) shopV3ReceiptFragment30.X1(), false);
                kotlin.jvm.internal.j.e(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView2 = (TextView) viewInflate;
                textView2.setId(ViewCompat.generateViewId());
                textView2.setText(shopV3ReceiptFragment30.getString(R.string.pma_label_format_dynamic_field_label_colon, str2));
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
                layoutParams.topToBottom = view.getId();
                layoutParams.startToStart = shopV3ReceiptFragment30.X1().getId();
                K k37 = shopV3ReceiptFragment30.f14879U;
                kotlin.jvm.internal.j.d(k37);
                layoutParams.endToEnd = ((Guideline) k37.f3703p).getId();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = shopV3ReceiptFragment30.getResources().getDimensionPixelSize(R.dimen.pma_margin_normal);
                View viewInflate2 = layoutInflaterFrom.inflate(R.layout.pma_view_shop_dynamic_field_value_text_view, (ViewGroup) shopV3ReceiptFragment30.X1(), false);
                kotlin.jvm.internal.j.e(viewInflate2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView3 = (TextView) viewInflate2;
                textView3.setId(ViewCompat.generateViewId());
                textView3.setText(str3);
                ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, -2);
                layoutParams2.baselineToBaseline = textView2.getId();
                K k38 = shopV3ReceiptFragment30.f14879U;
                kotlin.jvm.internal.j.d(k38);
                layoutParams2.startToStart = ((Guideline) k38.f3703p).getId();
                layoutParams2.endToEnd = shopV3ReceiptFragment30.X1().getId();
                shopV3ReceiptFragment30.X1().addView(textView2, layoutParams);
                shopV3ReceiptFragment30.X1().addView(textView3, layoutParams2);
                view = textView3;
            }
            ViewGroup.LayoutParams layoutParams3 = shopV3ReceiptFragment30.Y1().getLayoutParams();
            kotlin.jvm.internal.j.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.topToBottom = view.getId();
            shopV3ReceiptFragment30.Y1().setLayoutParams(layoutParams4);
        }
        FragmentActivity activity = ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).getActivity();
        String dataString = (activity == null || (intent2 = activity.getIntent()) == null) ? null : intent2.getDataString();
        if (dataString == null || C2576A.H(dataString) || C.w(dataString) != 4) {
            ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).D1(R.string.pma_label_back_to_home);
        } else {
            if (DevicePublicKeyStringDef.DIRECT.equals(C.L(dataString, "mode"))) {
                ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).C1();
            } else {
                ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).D1(R.string.pma_label_back_to_home);
            }
            FragmentActivity activity2 = ((ShopV3ReceiptFragment) ((ve.l) this.c.get())).getActivity();
            if (activity2 != null && (intent = activity2.getIntent()) != null) {
                intent.setData(null);
            }
        }
        if (this.e.e().isInAppReviewShopPurchaseEnabled()) {
            ((BaseFragment) ((ve.l) this.c.get())).q1("shop purchase");
        }
    }

    public void A(String str) {
        if (this.e.e().isAppEventsV2CashInEnabled()) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) ((H6.c) this.c.get());
            mayaCashInActivity.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1213b.j(2));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("button", str);
            mayaCashInActivity.k1().b(c1219hE);
        }
    }

    public void B(QRMerchant qRMerchant) {
        if (this.e.e().isMerchantPaymentAvailable()) {
            QRActivity qRActivity = (QRActivity) ((QRScannerFragment) ((ce.d) this.c.get())).f14690V;
            qRActivity.e.getClass();
            B5.i.m(qRActivity, qRMerchant, true);
        } else {
            String strMMessage = this.e.e().mMaintenanceConfig().mServiceAvailabilityConfig().mMerchantPaymentAvailability().mMessage();
            QRActivity qRActivity2 = (QRActivity) ((QRScannerFragment) ((ce.d) this.c.get())).f14690V;
            B5.i iVar = qRActivity2.e;
            String string = qRActivity2.getString(R.string.pma_label_pay);
            iVar.getClass();
            B5.i.U(qRActivity2, string, strMMessage);
        }
    }

    public void C(QRMerchant qRMerchant) {
        if (this.e.e().isMerchantPaymentAvailable()) {
            QRActivity qRActivity = (QRActivity) ((QRScannerFragment) ((ce.d) this.c.get())).f14690V;
            qRActivity.e.getClass();
            B5.i.I(qRActivity, qRMerchant, true);
        } else {
            String strMMessage = this.e.e().mMaintenanceConfig().mServiceAvailabilityConfig().mMerchantPaymentAvailability().mMessage();
            QRActivity qRActivity2 = (QRActivity) ((QRScannerFragment) ((ce.d) this.c.get())).f14690V;
            B5.i iVar = qRActivity2.e;
            String string = qRActivity2.getString(R.string.pma_label_pay);
            iVar.getClass();
            B5.i.U(qRActivity2, string, strMMessage);
        }
    }

    public void D(QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest) {
        if (this.e.e().isMerchantPaymentAvailable()) {
            QRActivity qRActivity = (QRActivity) ((QRScannerFragment) ((ce.d) this.c.get())).f14690V;
            qRActivity.e.getClass();
            B5.i.P(qRActivity, qRPHMerchantPaymentRequest, true);
        } else {
            String strMMessage = this.e.e().mMaintenanceConfig().mServiceAvailabilityConfig().mMerchantPaymentAvailability().mMessage();
            QRActivity qRActivity2 = (QRActivity) ((QRScannerFragment) ((ce.d) this.c.get())).f14690V;
            B5.i iVar = qRActivity2.e;
            String string = qRActivity2.getString(R.string.pma_label_pay);
            iVar.getClass();
            B5.i.U(qRActivity2, string, strMMessage);
        }
    }

    public void E(int i) {
        String str;
        BarcodeScannerActivity barcodeScannerActivity = (BarcodeScannerActivity) ((InterfaceC0685a) this.c.get());
        barcodeScannerActivity.getClass();
        if (i == 1) {
            str = "MERALCO";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "DEFAULT";
        }
        MLKitBarcodeScannerFragment mLKitBarcodeScannerFragment = new MLKitBarcodeScannerFragment();
        Bundle bundle = new Bundle();
        bundle.putString("source", str);
        mLKitBarcodeScannerFragment.setArguments(bundle);
        AbstractC1236z.g(barcodeScannerActivity, R.id.pma_activity_qr_fragment_container, mLKitBarcodeScannerFragment);
    }

    @Override // y5.AbstractC2509a
    public void h(Object obj) {
        Parcelable parcelable;
        int i = 6;
        switch (this.f389d) {
            case 0:
                Object view = (Cb.a) obj;
                kotlin.jvm.internal.j.g(view, "view");
                super.h(view);
                MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) ((Cb.a) this.c.get());
                mayaSendMoneyActivity.getClass();
                B bE = AbstractC1955a.m(mayaSendMoneyActivity).e(zh.b.a());
                Gh.f fVar = new Gh.f(new V2.c(this, i), new A5.l(this, i));
                bE.g(fVar);
                e(fVar);
                String strL = this.e.l();
                Bundle extras = ((MayaSendMoneyActivity) ((Cb.a) this.c.get())).getIntent().getExtras();
                if ((extras != null ? (QRRecipient) extras.getParcelable("recipient") : null) != null && "kyc1".equalsIgnoreCase(strL)) {
                    Cb.a aVar = (Cb.a) this.c.get();
                    Bundle extras2 = ((MayaSendMoneyActivity) ((Cb.a) this.c.get())).getIntent().getExtras();
                    parcelable = extras2 != null ? (QRRecipient) extras2.getParcelable("recipient") : null;
                    MayaSendMoneyActivity mayaSendMoneyActivity2 = (MayaSendMoneyActivity) aVar;
                    mayaSendMoneyActivity2.getClass();
                    Bundle bundle = new Bundle();
                    MayaSendMoneyFragment mayaSendMoneyFragment = new MayaSendMoneyFragment();
                    bundle.putParcelable("recipient", parcelable);
                    mayaSendMoneyFragment.setArguments(bundle);
                    AbstractC1236z.g(mayaSendMoneyActivity2, R.id.fragment_container_frame_layout, mayaSendMoneyFragment);
                } else {
                    Bundle extras3 = ((MayaSendMoneyActivity) ((Cb.a) this.c.get())).getIntent().getExtras();
                    if ((extras3 != null ? (Favorite) extras3.getParcelable("favorite") : null) == null) {
                        MayaSendMoneyActivity mayaSendMoneyActivity3 = (MayaSendMoneyActivity) ((Cb.a) this.c.get());
                        mayaSendMoneyActivity3.getClass();
                        AbstractC1236z.g(mayaSendMoneyActivity3, R.id.fragment_container_frame_layout, new MayaSendMoneyFragment());
                    } else {
                        Cb.a aVar2 = (Cb.a) this.c.get();
                        Bundle extras4 = ((MayaSendMoneyActivity) ((Cb.a) this.c.get())).getIntent().getExtras();
                        parcelable = extras4 != null ? (Favorite) extras4.getParcelable("favorite") : null;
                        MayaSendMoneyActivity mayaSendMoneyActivity4 = (MayaSendMoneyActivity) aVar2;
                        mayaSendMoneyActivity4.getClass();
                        Bundle bundle2 = new Bundle();
                        MayaSendMoneyFragment mayaSendMoneyFragment2 = new MayaSendMoneyFragment();
                        bundle2.putParcelable("favorite", parcelable);
                        mayaSendMoneyFragment2.setArguments(bundle2);
                        AbstractC1236z.g(mayaSendMoneyActivity4, R.id.fragment_container_frame_layout, mayaSendMoneyFragment2);
                    }
                }
                break;
            default:
                super.h(obj);
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // y5.AbstractC2509a
    public void j() {
        KycCmsContentData data;
        KycIntro intro;
        String strG;
        String strInstructions;
        List<KycUpgradeStepImage> images;
        String featureIconUrl;
        KycCmsContentData data2;
        KycIntro intro2;
        String dataPrivacyDescription;
        String str;
        String str2;
        int iW;
        String lowerCase;
        String displayName;
        String displayName2;
        DartExecutor dartExecutor;
        String str3 = "";
        switch (this.f389d) {
            case 2:
                super.j();
                com.paymaya.data.preference.a aVar = this.e;
                if (kotlin.jvm.internal.j.b(aVar.l(), "submitted") || kotlin.jvm.internal.j.b(aVar.x(), "submitted")) {
                    InterfaceC0345d0 interfaceC0345d0 = ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).f12499X;
                    if (interfaceC0345d0 != null) {
                        MayaKycActivity mayaKycActivity = (MayaKycActivity) interfaceC0345d0;
                        mayaKycActivity.n1();
                        B5.i.N(mayaKycActivity);
                        mayaKycActivity.finish();
                        return;
                    }
                    return;
                }
                KeyEventDispatcher.Component componentRequireActivity = ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                KycCmsContent kycCmsContent = ((MayaKycActivity) ((H8.b) componentRequireActivity)).Z1().f;
                if (kycCmsContent == null || (data = kycCmsContent.getData()) == null || (intro = data.getIntro()) == null) {
                    return;
                }
                String strL = this.e.l();
                if (kotlin.jvm.internal.j.b(strL, "kyc0")) {
                    KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    Intent intent = ((MayaKycActivity) ((H8.b) componentRequireActivity2)).getIntent();
                    if (intent != null ? intent.getBooleanExtra("INTENT_EXTRA_FROM_OTP_REGISTRATION", false) : false) {
                        String newRegistrationUpgradeIntroHeader = intro.getNewRegistrationUpgradeIntroHeader();
                        if (newRegistrationUpgradeIntroHeader != null) {
                            if (newRegistrationUpgradeIntroHeader.length() <= 0) {
                                newRegistrationUpgradeIntroHeader = null;
                            }
                            if (newRegistrationUpgradeIntroHeader != null) {
                                ((C0457h0) ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).G1()).f4105d.setText(newRegistrationUpgradeIntroHeader);
                            }
                        }
                        String newRegistrationUpgradeIntroDescription = intro.getNewRegistrationUpgradeIntroDescription();
                        if (newRegistrationUpgradeIntroDescription != null) {
                            if (newRegistrationUpgradeIntroDescription.length() <= 0) {
                                newRegistrationUpgradeIntroDescription = null;
                            }
                            if (newRegistrationUpgradeIntroDescription != null) {
                                ((C0457h0) ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).G1()).e.setTextHTML(newRegistrationUpgradeIntroDescription);
                            }
                        }
                    } else {
                        String kyc0UpgradeIntroHeader = intro.getKyc0UpgradeIntroHeader();
                        if (kyc0UpgradeIntroHeader != null) {
                            if (kyc0UpgradeIntroHeader.length() <= 0) {
                                kyc0UpgradeIntroHeader = null;
                            }
                            if (kyc0UpgradeIntroHeader != null) {
                                ((C0457h0) ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).G1()).f4105d.setText(kyc0UpgradeIntroHeader);
                            }
                        }
                        String kyc0UpgradeIntroDescription = intro.getKyc0UpgradeIntroDescription();
                        if (kyc0UpgradeIntroDescription != null) {
                            if (kyc0UpgradeIntroDescription.length() <= 0) {
                                kyc0UpgradeIntroDescription = null;
                            }
                            if (kyc0UpgradeIntroDescription != null) {
                                ((C0457h0) ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).G1()).e.setTextHTML(kyc0UpgradeIntroDescription);
                            }
                        }
                    }
                    ((C0457h0) ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).G1()).f4106g.setVisibility(this.e.e().isMgmRedesignEnabled() ? 0 : 8);
                    String inviteCodeDescription = intro.getInviteCodeDescription();
                    if (inviteCodeDescription != null) {
                        if (inviteCodeDescription.length() <= 0) {
                            inviteCodeDescription = null;
                        }
                        if (inviteCodeDescription != null) {
                            MayaKycCompleteYourMayaExperienceFragmentV2 mayaKycCompleteYourMayaExperienceFragmentV2 = (MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get());
                            mayaKycCompleteYourMayaExperienceFragmentV2.getClass();
                            C0457h0 c0457h0 = (C0457h0) mayaKycCompleteYourMayaExperienceFragmentV2.G1();
                            if (inviteCodeDescription.length() != 0) {
                                inviteCodeDescription = new zj.o("\\\\u([0-9A-Fa-f]{4})").g(AbstractC1213b.M("\\\\u([0-9A-Fa-f]{4})", AbstractC1213b.M("\\\\\\s*u([0-9A-Fa-f]{4})", inviteCodeDescription, "\\\\u$1"), "\\\\u$1"), new Ag.a(18));
                            }
                            HtmlTextView htmlTextView = c0457h0.f4106g;
                            htmlTextView.setTextHTML(inviteCodeDescription);
                            htmlTextView.setEnableClickableTextListener(true);
                            htmlTextView.setOnLinkClickListener(mayaKycCompleteYourMayaExperienceFragmentV2);
                        }
                    }
                    String kyc0UnlockEverythingHeader = intro.getKyc0UnlockEverythingHeader();
                    if (kyc0UnlockEverythingHeader != null) {
                        if (kyc0UnlockEverythingHeader.length() <= 0) {
                            kyc0UnlockEverythingHeader = null;
                        }
                        if (kyc0UnlockEverythingHeader != null) {
                            ((C0457h0) ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).G1()).f4107k.setText(kyc0UnlockEverythingHeader);
                        }
                    }
                    String upgradeBtnTitleKyc0 = intro.getUpgradeBtnTitleKyc0();
                    if (upgradeBtnTitleKyc0 != null) {
                        if (upgradeBtnTitleKyc0.length() <= 0) {
                            upgradeBtnTitleKyc0 = null;
                        }
                        if (upgradeBtnTitleKyc0 != null) {
                            ((C0457h0) ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).G1()).c.setText(upgradeBtnTitleKyc0);
                        }
                    }
                    String kyc0UpgradeNowHeader = intro.getKyc0UpgradeNowHeader();
                    if (kyc0UpgradeNowHeader != null) {
                        if (kyc0UpgradeNowHeader.length() <= 0) {
                            kyc0UpgradeNowHeader = null;
                        }
                        if (kyc0UpgradeNowHeader != null) {
                            ((C0457h0) ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).G1()).f4108l.setText(kyc0UpgradeNowHeader);
                        }
                    }
                } else if (kotlin.jvm.internal.j.b(strL, "kyc1")) {
                    ((C0457h0) ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).G1()).f4106g.setVisibility(8);
                    String kyc1UpgradeIntroHeader = intro.getKyc1UpgradeIntroHeader();
                    if (kyc1UpgradeIntroHeader != null) {
                        if (kyc1UpgradeIntroHeader.length() <= 0) {
                            kyc1UpgradeIntroHeader = null;
                        }
                        if (kyc1UpgradeIntroHeader != null) {
                            ((C0457h0) ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).G1()).f4105d.setText(kyc1UpgradeIntroHeader);
                        }
                    }
                    String kyc1UpgradeIntroDescription = intro.getKyc1UpgradeIntroDescription();
                    if (kyc1UpgradeIntroDescription != null) {
                        if (kyc1UpgradeIntroDescription.length() <= 0) {
                            kyc1UpgradeIntroDescription = null;
                        }
                        if (kyc1UpgradeIntroDescription != null) {
                            ((C0457h0) ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).G1()).e.setTextHTML(kyc1UpgradeIntroDescription);
                        }
                    }
                    String kyc1UnlockEverythingHeader = intro.getKyc1UnlockEverythingHeader();
                    if (kyc1UnlockEverythingHeader != null) {
                        if (kyc1UnlockEverythingHeader.length() <= 0) {
                            kyc1UnlockEverythingHeader = null;
                        }
                        if (kyc1UnlockEverythingHeader != null) {
                            ((C0457h0) ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).G1()).f4107k.setText(kyc1UnlockEverythingHeader);
                        }
                    }
                    String upgradeBtnTitleKyc1 = intro.getUpgradeBtnTitleKyc1();
                    if (upgradeBtnTitleKyc1 != null) {
                        if (upgradeBtnTitleKyc1.length() <= 0) {
                            upgradeBtnTitleKyc1 = null;
                        }
                        if (upgradeBtnTitleKyc1 != null) {
                            ((C0457h0) ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).G1()).c.setText(upgradeBtnTitleKyc1);
                        }
                    }
                    String kyc1UpgradeNowHeader = intro.getKyc1UpgradeNowHeader();
                    if (kyc1UpgradeNowHeader != null) {
                        if (kyc1UpgradeNowHeader.length() <= 0) {
                            kyc1UpgradeNowHeader = null;
                        }
                        if (kyc1UpgradeNowHeader != null) {
                            ((C0457h0) ((MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get())).G1()).f4108l.setText(kyc1UpgradeNowHeader);
                        }
                    }
                }
                KycUnlockEverythingDetails unlockEverythingDetails = intro.getUnlockEverythingDetails();
                if (unlockEverythingDetails != null && (featureIconUrl = unlockEverythingDetails.getFeatureIconUrl()) != null) {
                    if (featureIconUrl.length() <= 0) {
                        featureIconUrl = null;
                    }
                    if (featureIconUrl != null) {
                        MayaKycCompleteYourMayaExperienceFragmentV2 mayaKycCompleteYourMayaExperienceFragmentV22 = (MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get());
                        mayaKycCompleteYourMayaExperienceFragmentV22.getClass();
                        AbstractC1955a.w(((C0457h0) mayaKycCompleteYourMayaExperienceFragmentV22.G1()).f4104b, featureIconUrl, false);
                    }
                }
                String upgradeNowDescription = intro.getUpgradeNowDescription();
                if (upgradeNowDescription != null) {
                    if (upgradeNowDescription.length() <= 0) {
                        upgradeNowDescription = null;
                    }
                    if (upgradeNowDescription != null) {
                        MayaKycCompleteYourMayaExperienceFragmentV2 mayaKycCompleteYourMayaExperienceFragmentV23 = (MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get());
                        mayaKycCompleteYourMayaExperienceFragmentV23.getClass();
                        ((C0457h0) mayaKycCompleteYourMayaExperienceFragmentV23.G1()).m.setText(upgradeNowDescription);
                    }
                }
                KycUpgradeStepsGuide upgradeStepsGuide = intro.getUpgradeStepsGuide();
                if (upgradeStepsGuide != null && (images = upgradeStepsGuide.getImages()) != null) {
                    if (images.isEmpty()) {
                        images = null;
                    }
                    if (images != null) {
                        MayaKycCompleteYourMayaExperienceFragmentV2 mayaKycCompleteYourMayaExperienceFragmentV24 = (MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get());
                        mayaKycCompleteYourMayaExperienceFragmentV24.getClass();
                        J8.p pVar = (J8.p) mayaKycCompleteYourMayaExperienceFragmentV24.f12500Y.getValue();
                        pVar.getClass();
                        ArrayList arrayList = pVar.f2484b;
                        arrayList.clear();
                        arrayList.addAll(images);
                        pVar.notifyDataSetChanged();
                    }
                }
                KycUnlockEverythingDetails unlockEverythingDetails2 = intro.getUnlockEverythingDetails();
                if (unlockEverythingDetails2 != null && (strInstructions = unlockEverythingDetails2.instructions()) != null) {
                    if (strInstructions.length() <= 0) {
                        strInstructions = null;
                    }
                    if (strInstructions != null) {
                        MayaKycCompleteYourMayaExperienceFragmentV2 mayaKycCompleteYourMayaExperienceFragmentV25 = (MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get());
                        mayaKycCompleteYourMayaExperienceFragmentV25.getClass();
                        C0457h0 c0457h02 = (C0457h0) mayaKycCompleteYourMayaExperienceFragmentV25.G1();
                        if (strInstructions.length() != 0) {
                            strInstructions = new zj.o("\\\\u([0-9A-Fa-f]{4})").g(AbstractC1213b.M("\\\\(\\s*)u(\\s*)([0-9A-Fa-f]{4})", strInstructions, "\\\\u$3"), new Ag.a(19));
                        }
                        c0457h02.j.setText(strInstructions);
                    }
                }
                String safeTransactionHeader = intro.getSafeTransactionHeader();
                if (safeTransactionHeader != null) {
                    if (safeTransactionHeader.length() <= 0) {
                        safeTransactionHeader = null;
                    }
                    if (safeTransactionHeader != null) {
                        MayaKycCompleteYourMayaExperienceFragmentV2 mayaKycCompleteYourMayaExperienceFragmentV26 = (MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get());
                        mayaKycCompleteYourMayaExperienceFragmentV26.getClass();
                        ((C0457h0) mayaKycCompleteYourMayaExperienceFragmentV26.G1()).i.setText(safeTransactionHeader);
                    }
                }
                String safeTransactionDescription = intro.getSafeTransactionDescription();
                if (safeTransactionDescription != null) {
                    if (safeTransactionDescription.length() <= 0) {
                        safeTransactionDescription = null;
                    }
                    if (safeTransactionDescription != null) {
                        MayaKycCompleteYourMayaExperienceFragmentV2 mayaKycCompleteYourMayaExperienceFragmentV27 = (MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get());
                        mayaKycCompleteYourMayaExperienceFragmentV27.getClass();
                        HtmlTextView htmlTextView2 = ((C0457h0) mayaKycCompleteYourMayaExperienceFragmentV27.G1()).h;
                        htmlTextView2.setTextHTML(safeTransactionDescription);
                        htmlTextView2.setEnableClickableTextListener(true);
                        htmlTextView2.setOnLinkClickListener(mayaKycCompleteYourMayaExperienceFragmentV27);
                    }
                }
                String doItLaterBtnTitle = intro.getDoItLaterBtnTitle();
                if (doItLaterBtnTitle != null) {
                    strG = doItLaterBtnTitle.length() > 0 ? doItLaterBtnTitle : null;
                    if (strG != null) {
                        MayaKycCompleteYourMayaExperienceFragmentV2 mayaKycCompleteYourMayaExperienceFragmentV28 = (MayaKycCompleteYourMayaExperienceFragmentV2) ((InterfaceC0284i) this.c.get());
                        mayaKycCompleteYourMayaExperienceFragmentV28.getClass();
                        ((C0457h0) mayaKycCompleteYourMayaExperienceFragmentV28.G1()).f4109n.setText(strG);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                super.j();
                String strK = this.e.k();
                if (kotlin.jvm.internal.j.b(strK, "0")) {
                    KeyEventDispatcher.Component componentRequireActivity3 = ((MayaKycMaintenanceFragment) ((x) this.c.get())).requireActivity();
                    kotlin.jvm.internal.j.e(componentRequireActivity3, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                    ((MayaKycActivity) ((H8.b) componentRequireActivity3)).v2(R.string.maya_kyc_maintenance_title_kyc);
                    return;
                } else {
                    if (kotlin.jvm.internal.j.b(strK, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                        KeyEventDispatcher.Component componentRequireActivity4 = ((MayaKycMaintenanceFragment) ((x) this.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity4, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) componentRequireActivity4)).v2(R.string.maya_kyc_maintenance_title_rekyc);
                        return;
                    }
                    return;
                }
            case 4:
                super.j();
                KeyEventDispatcher.Component componentRequireActivity5 = ((MayaKycPersonalInfoConfirmSubmissionFragment) ((K8.z) this.c.get())).requireActivity();
                kotlin.jvm.internal.j.e(componentRequireActivity5, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                KycCmsContent kycCmsContent2 = ((MayaKycActivity) ((H8.b) componentRequireActivity5)).Z1().f;
                if (kycCmsContent2 == null || (data2 = kycCmsContent2.getData()) == null || (intro2 = data2.getIntro()) == null || (dataPrivacyDescription = intro2.getDataPrivacyDescription()) == null) {
                    return;
                }
                strG = dataPrivacyDescription.length() > 0 ? dataPrivacyDescription : null;
                if (strG != null) {
                    MayaKycPersonalInfoConfirmSubmissionFragment mayaKycPersonalInfoConfirmSubmissionFragment = (MayaKycPersonalInfoConfirmSubmissionFragment) ((K8.z) this.c.get());
                    mayaKycPersonalInfoConfirmSubmissionFragment.getClass();
                    HtmlTextView htmlTextView3 = (HtmlTextView) ((C0463k0) mayaKycPersonalInfoConfirmSubmissionFragment.G1()).f4136b.f3564n;
                    if (strG.length() != 0) {
                        strG = new zj.o("\\\\u([0-9A-Fa-f]{4})").g(AbstractC1213b.M("\\\\u([0-9A-Fa-f]{4})", AbstractC1213b.M("\\\\\\s*u([0-9A-Fa-f]{4})", strG, "\\\\u$1"), "\\\\u$1"), new Ag.a(18));
                    }
                    htmlTextView3.setTextHTML(strG);
                    htmlTextView3.setEnableClickableTextListener(true);
                    htmlTextView3.setOnLinkClickListener(mayaKycPersonalInfoConfirmSubmissionFragment);
                    return;
                }
                return;
            case 5:
            case 6:
            case 7:
            case 11:
            case 12:
            case 13:
            case 16:
            case 20:
            default:
                super.j();
                return;
            case 8:
                super.j();
                if (this.e.e().isAutoCashinWalletSettingsEnabled()) {
                    MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) ((H6.c) this.c.get());
                    mayaCashInActivity.getClass();
                    FlutterEngine flutterEngine = new FlutterEngine(mayaCashInActivity);
                    mayaCashInActivity.f11612p = flutterEngine;
                    flutterEngine.getNavigationChannel().setInitialRoute("runAutoCashIn");
                    FlutterEngine flutterEngine2 = mayaCashInActivity.f11612p;
                    if (flutterEngine2 == null) {
                        kotlin.jvm.internal.j.n("autoCashinFlutterFullscreenEngine");
                        throw null;
                    }
                    flutterEngine2.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "package:paymaya_module/main.dart", "runAutoCashIn"));
                    FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
                    FlutterEngine flutterEngine3 = mayaCashInActivity.f11612p;
                    if (flutterEngine3 == null) {
                        kotlin.jvm.internal.j.n("autoCashinFlutterFullscreenEngine");
                        throw null;
                    }
                    flutterEngineCache.put("runAutoCashIn", flutterEngine3);
                    FlutterEngine flutterEngine4 = mayaCashInActivity.f11612p;
                    if (flutterEngine4 == null) {
                        kotlin.jvm.internal.j.n("autoCashinFlutterFullscreenEngine");
                        throw null;
                    }
                    u uVar = new u(flutterEngine4.getDartExecutor().getBinaryMessenger(), "packages/paymaya_auto_cash_in");
                    mayaCashInActivity.f11613q = uVar;
                    uVar.b(new t(mayaCashInActivity, 7));
                }
                Bundle extras = ((MayaCashInActivity) ((H6.c) this.c.get())).getIntent().getExtras();
                String string = extras != null ? extras.getString("action") : null;
                if (kotlin.jvm.internal.j.b(string, "wallet_settings")) {
                    MayaCashInActivity mayaCashInActivity2 = (MayaCashInActivity) ((H6.c) this.c.get());
                    mayaCashInActivity2.getClass();
                    AbstractC1236z.g(mayaCashInActivity2, R.id.frame_layout_container, new MayaAutoCashinWalletSettingsFragment());
                } else if (kotlin.jvm.internal.j.b(string, "auto_cash_in")) {
                    MayaCashInActivity mayaCashInActivity3 = (MayaCashInActivity) ((H6.c) this.c.get());
                    mayaCashInActivity3.getClass();
                    AbstractC1236z.g(mayaCashInActivity3, R.id.frame_layout_container, new MayaAutoCashinWalletSettingsFragment());
                    if (kotlin.jvm.internal.j.b(this.e.k(), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                        MayaCashInActivity mayaCashInActivity4 = (MayaCashInActivity) ((H6.c) this.c.get());
                        mayaCashInActivity4.n1();
                        Intent intentBuild = FlutterActivity.withCachedEngine("runAutoCashIn").build(mayaCashInActivity4);
                        intentBuild.putExtra("engineId", "runAutoCashIn");
                        mayaCashInActivity4.startActivity(intentBuild);
                    } else {
                        ((MayaCashInActivity) ((H6.c) this.c.get())).c2();
                    }
                } else {
                    MayaCashInActivity mayaCashInActivity5 = (MayaCashInActivity) ((H6.c) this.c.get());
                    mayaCashInActivity5.getClass();
                    AbstractC1236z.g(mayaCashInActivity5, R.id.frame_layout_container, new MayaCashInFragment());
                }
                String dataString = ((MayaCashInActivity) ((H6.c) this.c.get())).getIntent().getDataString();
                if (!this.e.e().isAppEventsV2CashInEnabled() || dataString == null || C2576A.H(dataString)) {
                    return;
                }
                H6.c cVar = (H6.c) this.c.get();
                String strL2 = C.L(dataString, "source");
                ((MayaCashInActivity) cVar).getIntent().putExtra("analytics_source_page", strL2 != null ? strL2 : "Deep Link");
                ((MayaCashInActivity) ((H6.c) this.c.get())).getIntent().setData(null);
                return;
            case 9:
                super.j();
                if ("scan".equals(((MayaQRActivity) ((Ka.a) this.c.get())).getIntent().getStringExtra("action"))) {
                    MayaQRActivity mayaQRActivity = (MayaQRActivity) ((Ka.a) this.c.get());
                    mayaQRActivity.getClass();
                    if (v0.q(mayaQRActivity)) {
                        MayaQRActivity mayaQRActivity2 = (MayaQRActivity) ((Ka.a) this.c.get());
                        mayaQRActivity2.getClass();
                        AbstractC1236z.g(mayaQRActivity2, R.id.fragment_container, new MayaMLKitQRScannerFragment());
                    } else {
                        MayaQRActivity mayaQRActivity3 = (MayaQRActivity) ((Ka.a) this.c.get());
                        mayaQRActivity3.getClass();
                        AbstractC1236z.g(mayaQRActivity3, R.id.fragment_container, new MayaQRScannerFragment());
                    }
                } else {
                    MayaQRActivity mayaQRActivity4 = (MayaQRActivity) ((Ka.a) this.c.get());
                    mayaQRActivity4.getClass();
                    AbstractC1236z.g(mayaQRActivity4, R.id.fragment_container, new MyQRFragment());
                }
                if (this.e.e().isQrWithCheckoutFlowEnabled()) {
                    ((MayaQRActivity) ((Ka.a) this.c.get())).X1();
                    return;
                }
                return;
            case 10:
                super.j();
                String stringExtra = ((MayaSettingsActivity) ((Mb.c) this.c.get())).getIntent().getStringExtra("first_fragment");
                if (stringExtra != null) {
                    switch (stringExtra.hashCode()) {
                        case -2131586749:
                            if (stringExtra.equals("change_min")) {
                                MayaSettingsActivity mayaSettingsActivity = (MayaSettingsActivity) ((Mb.c) this.c.get());
                                mayaSettingsActivity.getClass();
                                AbstractC1236z.g(mayaSettingsActivity, R.id.frame_layout_container, new MayaChangeMinFragment());
                                return;
                            }
                            break;
                        case -958726582:
                            if (stringExtra.equals("change_password")) {
                                MayaSettingsActivity mayaSettingsActivity2 = (MayaSettingsActivity) ((Mb.c) this.c.get());
                                mayaSettingsActivity2.getClass();
                                AbstractC1236z.g(mayaSettingsActivity2, R.id.frame_layout_container, new MayaChangePasswordFragment());
                                return;
                            }
                            break;
                        case 20203879:
                            if (stringExtra.equals("account_recovery")) {
                                MayaSettingsActivity mayaSettingsActivity3 = (MayaSettingsActivity) ((Mb.c) this.c.get());
                                mayaSettingsActivity3.getClass();
                                AbstractC1236z.g(mayaSettingsActivity3, R.id.frame_layout_container, new MayaAccountRecoveryFragment());
                                return;
                            }
                            break;
                        case 1523563286:
                            if (stringExtra.equals("no_email_recovery")) {
                                MayaSettingsActivity mayaSettingsActivity4 = (MayaSettingsActivity) ((Mb.c) this.c.get());
                                mayaSettingsActivity4.getClass();
                                MayaAccountRecoveryEmailFragment mayaAccountRecoveryEmailFragment = new MayaAccountRecoveryEmailFragment();
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("has_no_recovery_email", false);
                                mayaAccountRecoveryEmailFragment.setArguments(bundle);
                                AbstractC1236z.g(mayaSettingsActivity4, R.id.frame_layout_container, mayaAccountRecoveryEmailFragment);
                                return;
                            }
                            break;
                    }
                }
                MayaSettingsActivity mayaSettingsActivity5 = (MayaSettingsActivity) ((Mb.c) this.c.get());
                mayaSettingsActivity5.getClass();
                AbstractC1236z.g(mayaSettingsActivity5, R.id.frame_layout_container, new MayaSettingsFragment());
                return;
            case 14:
                super.j();
                X6.i iVar = (X6.i) this.c.get();
                EnumC1235y enumC1235yG1 = ((MayaWebInterstitialFragment) ((X6.i) this.c.get())).G1();
                MayaWebInterstitialFragment mayaWebInterstitialFragment = (MayaWebInterstitialFragment) ((X6.i) this.c.get());
                mayaWebInterstitialFragment.getClass();
                if (mayaWebInterstitialFragment.H1().containsKey(enumC1235yG1)) {
                    MayaWebInterstitialFragment mayaWebInterstitialFragment2 = (MayaWebInterstitialFragment) iVar;
                    C1042m c1042m = (C1042m) mayaWebInterstitialFragment2.H1().get(mayaWebInterstitialFragment2.G1());
                    if (c1042m == null || (str = (String) c1042m.f9175b) == null) {
                        str = "";
                    }
                    for (String str4 : C2576A.T(str, new String[]{Global.NEWLINE}, 6)) {
                        C0450f c0450fD = C0450f.d(mayaWebInterstitialFragment2.getLayoutInflater());
                        int length = str4.length();
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                i = -1;
                            } else if (!C2579a.b(str4.charAt(i))) {
                                i++;
                            }
                            break;
                        }
                        String strSubstring = str4.substring(0, i);
                        kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
                        ((TextView) c0450fD.f4087b).setText(C2576A.b0(strSubstring).toString());
                        HtmlTextView htmlTextView4 = (HtmlTextView) c0450fD.f4088d;
                        htmlTextView4.setOnLinkClickListener(mayaWebInterstitialFragment2);
                        String strSubstring2 = str4.substring(i);
                        kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
                        htmlTextView4.setTextHTML(C2576A.b0(strSubstring2).toString());
                        C0447e c0447e = mayaWebInterstitialFragment2.f11967U;
                        kotlin.jvm.internal.j.d(c0447e);
                        ((LinearLayout) c0447e.f4079b).addView((ConstraintLayout) c0450fD.c);
                    }
                    C1042m c1042m2 = (C1042m) mayaWebInterstitialFragment2.H1().get(mayaWebInterstitialFragment2.G1());
                    if (c1042m2 != null && (str2 = (String) c1042m2.f9174a) != null) {
                        str3 = str2;
                    }
                    C0447e c0447e2 = mayaWebInterstitialFragment2.f11967U;
                    kotlin.jvm.internal.j.d(c0447e2);
                    ((TextView) c0447e2.f).setText(str3);
                    C1042m c1042m3 = (C1042m) mayaWebInterstitialFragment2.H1().get(mayaWebInterstitialFragment2.G1());
                    int iIntValue = c1042m3 != null ? ((Number) c1042m3.c).intValue() : 0;
                    C0447e c0447e3 = mayaWebInterstitialFragment2.f11967U;
                    kotlin.jvm.internal.j.d(c0447e3);
                    ((ImageView) c0447e3.e).setImageDrawable(ContextCompat.getDrawable(mayaWebInterstitialFragment2.requireContext(), iIntValue));
                    return;
                }
                return;
            case 15:
                super.j();
                if (this.e.e().isMayaShopWithCheckoutFlowEnabled() || this.e.e().isLoadV2Enabled()) {
                    ((MayaShopV2Activity) ((Yb.b) this.c.get())).X1();
                }
                if (this.e.e().isLoadV2Enabled()) {
                    MayaShopV2Activity mayaShopV2Activity = (MayaShopV2Activity) ((Yb.b) this.c.get());
                    mayaShopV2Activity.getClass();
                    FlutterEngineCache flutterEngineCache2 = FlutterEngineCache.getInstance();
                    kotlin.jvm.internal.j.f(flutterEngineCache2, "getInstance(...)");
                    if (flutterEngineCache2.get("loadFullscreen") == null) {
                        flutterEngineCache2.put("loadFullscreen", new FlutterEngine(mayaShopV2Activity));
                    }
                }
                Bundle extras2 = ((MayaShopV2Activity) ((Yb.b) this.c.get())).getIntent().getExtras();
                String string2 = extras2 != null ? extras2.getString("flow_to_screen") : null;
                if (string2 != null && !C2576A.H(string2)) {
                    Bundle extras3 = ((MayaShopV2Activity) ((Yb.b) this.c.get())).getIntent().getExtras();
                    String string3 = extras3 != null ? extras3.getString("flow_to_screen") : null;
                    if (string3 != null) {
                        lowerCase = string3.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        switch (lowerCase.hashCode()) {
                            case -1786842533:
                                if (lowerCase.equals("providers_collection")) {
                                    MayaShopV2Activity mayaShopV2Activity2 = (MayaShopV2Activity) ((Yb.b) this.c.get());
                                    mayaShopV2Activity2.getClass();
                                    AbstractC1236z.g(mayaShopV2Activity2, R.id.frame_layout_fragment_container, new MayaShopProvidersCollectionFragment());
                                }
                                break;
                            case -906336856:
                                if (lowerCase.equals("search")) {
                                    MayaShopV2Activity mayaShopV2Activity3 = (MayaShopV2Activity) ((Yb.b) this.c.get());
                                    Bundle extras4 = mayaShopV2Activity3.getIntent().getExtras();
                                    String string4 = extras4 != null ? extras4.getString("search_query") : null;
                                    MayaShopSearchFragment mayaShopSearchFragment = new MayaShopSearchFragment();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("shop_search_query", string4);
                                    mayaShopSearchFragment.setArguments(bundle2);
                                    AbstractC1236z.g(mayaShopV2Activity3, R.id.frame_layout_fragment_container, mayaShopSearchFragment);
                                }
                                break;
                            case -786681338:
                                if (lowerCase.equals("payment")) {
                                    MayaShopV2Activity mayaShopV2Activity4 = (MayaShopV2Activity) ((Yb.b) this.c.get());
                                    Bundle extras5 = mayaShopV2Activity4.getIntent().getExtras();
                                    String string5 = extras5 != null ? extras5.getString("product_id") : null;
                                    Bundle extras6 = mayaShopV2Activity4.getIntent().getExtras();
                                    String string6 = extras6 != null ? extras6.getString("source_page") : null;
                                    MayaShopPaymentFragment mayaShopPaymentFragment = new MayaShopPaymentFragment();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("product_id", string5);
                                    bundle3.putString("source_page", string6);
                                    mayaShopPaymentFragment.setArguments(bundle3);
                                    AbstractC1236z.g(mayaShopV2Activity4, R.id.frame_layout_fragment_container, mayaShopPaymentFragment);
                                }
                                break;
                            case 489160534:
                                if (lowerCase.equals("purchase_history")) {
                                    MayaShopV2Activity mayaShopV2Activity5 = (MayaShopV2Activity) ((Yb.b) this.c.get());
                                    Bundle extras7 = mayaShopV2Activity5.getIntent().getExtras();
                                    String string7 = extras7 != null ? extras7.getString("status") : null;
                                    MayaShopPurchaseHistoryFragment mayaShopPurchaseHistoryFragment = new MayaShopPurchaseHistoryFragment();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putString("status", string7);
                                    bundle4.putString("shop_history_source_page", "Home");
                                    mayaShopPurchaseHistoryFragment.setArguments(bundle4);
                                    AbstractC1236z.g(mayaShopV2Activity5, R.id.frame_layout_fragment_container, mayaShopPurchaseHistoryFragment);
                                }
                                break;
                            case 1798024572:
                                if (lowerCase.equals("provider_product_list")) {
                                    a aVarV1 = ((MayaShopV2Activity) ((Yb.b) this.c.get())).V1();
                                    if (aVarV1.e.e().isMayaShopProviderSubcategoriesEnabled()) {
                                        MayaShopV2Activity mayaShopV2Activity6 = (MayaShopV2Activity) ((Yb.b) aVarV1.c.get());
                                        Bundle extras8 = mayaShopV2Activity6.getIntent().getExtras();
                                        ShopProvider shopProvider = extras8 != null ? (ShopProvider) extras8.getParcelable("shop_provider") : null;
                                        Bundle extras9 = mayaShopV2Activity6.getIntent().getExtras();
                                        String string8 = extras9 != null ? extras9.getString("source_page") : null;
                                        MayaShopProviderPageFragment mayaShopProviderPageFragment = new MayaShopProviderPageFragment();
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putParcelable("shop_provider", shopProvider);
                                        bundle5.putString("source_page", string8);
                                        mayaShopProviderPageFragment.setArguments(bundle5);
                                        AbstractC1236z.g(mayaShopV2Activity6, R.id.frame_layout_fragment_container, mayaShopProviderPageFragment);
                                        if (shopProvider != null && (displayName2 = shopProvider.getDisplayName()) != null) {
                                            str3 = displayName2;
                                        }
                                        ActionBar supportActionBar = mayaShopV2Activity6.getSupportActionBar();
                                        if (supportActionBar != null) {
                                            supportActionBar.setTitle(str3);
                                        }
                                    } else {
                                        MayaShopV2Activity mayaShopV2Activity7 = (MayaShopV2Activity) ((Yb.b) aVarV1.c.get());
                                        Bundle extras10 = mayaShopV2Activity7.getIntent().getExtras();
                                        ShopProvider shopProvider2 = extras10 != null ? (ShopProvider) extras10.getParcelable("shop_provider") : null;
                                        String str5 = MayaShopProviderProductsListFragment.f14064E0;
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putParcelable("shop_provider", shopProvider2);
                                        MayaShopProviderProductsListFragment mayaShopProviderProductsListFragment = new MayaShopProviderProductsListFragment();
                                        mayaShopProviderProductsListFragment.setArguments(bundle6);
                                        AbstractC1236z.g(mayaShopV2Activity7, R.id.frame_layout_fragment_container, mayaShopProviderProductsListFragment);
                                        if (shopProvider2 != null && (displayName = shopProvider2.getDisplayName()) != null) {
                                            str3 = displayName;
                                        }
                                        ActionBar supportActionBar2 = mayaShopV2Activity7.getSupportActionBar();
                                        if (supportActionBar2 != null) {
                                            supportActionBar2.setTitle(str3);
                                        }
                                    }
                                }
                                break;
                        }
                    }
                } else {
                    MayaShopV2Activity mayaShopV2Activity8 = (MayaShopV2Activity) ((Yb.b) this.c.get());
                    String dataString2 = mayaShopV2Activity8.getIntent().getDataString();
                    MayaShopFragment mayaShopFragment = new MayaShopFragment();
                    Bundle bundle7 = new Bundle();
                    bundle7.putString("shop_list_data", dataString2);
                    bundle7.putBoolean("is_in_activity", true);
                    mayaShopFragment.setArguments(bundle7);
                    AbstractC1236z.g(mayaShopV2Activity8, R.id.frame_layout_fragment_container, mayaShopFragment);
                }
                String dataString3 = ((MayaShopV2Activity) ((Yb.b) this.c.get())).getIntent().getDataString();
                if (dataString3 == null || C2576A.H(dataString3) || !C.Y(dataString3) || (iW = C.w(dataString3)) == 0) {
                    return;
                }
                Yb.b bVar = (Yb.b) this.c.get();
                String strL3 = C.L(dataString3, "source");
                if (strL3 == null) {
                    strL3 = "Deep Link";
                }
                ((MayaShopV2Activity) bVar).f13997y = strL3;
                if (iW == 3) {
                    MayaShopV2Activity mayaShopV2Activity9 = (MayaShopV2Activity) ((Yb.b) this.c.get());
                    mayaShopV2Activity9.getClass();
                    MayaShopPurchaseHistoryFragment mayaShopPurchaseHistoryFragment2 = new MayaShopPurchaseHistoryFragment();
                    Bundle bundle8 = new Bundle();
                    bundle8.putString("status", null);
                    bundle8.putString("shop_history_source_page", "Deep Link");
                    mayaShopPurchaseHistoryFragment2.setArguments(bundle8);
                    AbstractC1236z.h(mayaShopV2Activity9, R.id.frame_layout_fragment_container, mayaShopPurchaseHistoryFragment2);
                }
                ((MayaShopV2Activity) ((Yb.b) this.c.get())).getIntent().setData(null);
                return;
            case 17:
                super.j();
                if ("MERALCO".equalsIgnoreCase(((BarcodeScannerActivity) ((InterfaceC0685a) this.c.get())).getIntent().getExtras().getString("source")) && !this.e.f11330b.getBoolean("key_has_displayed_meralco_instruction", false)) {
                    BarcodeScannerActivity barcodeScannerActivity = (BarcodeScannerActivity) ((InterfaceC0685a) this.c.get());
                    barcodeScannerActivity.getClass();
                    new MeralcoBillDialogFragment().show(barcodeScannerActivity.getSupportFragmentManager(), "meralco_bill_instruction_dialog");
                    androidx.camera.core.impl.a.A(this.e.f11330b, "key_has_displayed_meralco_instruction", true);
                }
                if ("MERALCO".equalsIgnoreCase(((BarcodeScannerActivity) ((InterfaceC0685a) this.c.get())).getIntent().getExtras().getString("source"))) {
                    E(1);
                    return;
                } else {
                    E(2);
                    return;
                }
            case 18:
                super.j();
                if (AbstractC1955a.u(((QRScannerFragment) ((ce.d) this.c.get())).getContext(), "android.permission.CAMERA")) {
                    ((QRScannerFragment) ((ce.d) this.c.get())).u1();
                } else {
                    ((QRScannerFragment) ((ce.d) this.c.get())).t1();
                }
                ((QRScannerFragment) ((ce.d) this.c.get())).s1();
                return;
            case 19:
                super.j();
                RequestMoneyV3Activity requestMoneyV3Activity = (RequestMoneyV3Activity) ((ae.d) this.c.get());
                requestMoneyV3Activity.getClass();
                RequestMoneyV3NewFragment requestMoneyV3NewFragment = new RequestMoneyV3NewFragment();
                Bundle bundle9 = new Bundle();
                bundle9.putParcelable("transfer_app_link", null);
                requestMoneyV3NewFragment.setArguments(bundle9);
                AbstractC1236z.g(requestMoneyV3Activity, R.id.pma_activity_request_money_v3_fragment_container, requestMoneyV3NewFragment);
                return;
            case 21:
                q();
                return;
            case 22:
                super.j();
                MayaAutoDebitArrangementActivity mayaAutoDebitArrangementActivity = (MayaAutoDebitArrangementActivity) ((InterfaceC1767a) this.c.get());
                mayaAutoDebitArrangementActivity.getClass();
                C.i("MayaAutoDebitArrangementActivity", "showAutoDebitArrangementFlutterFragment");
                FlutterEngine flutterEngine5 = FlutterEngineCache.getInstance().get("autoDebitArrangementFullscreen");
                if (flutterEngine5 != null && (dartExecutor = flutterEngine5.getDartExecutor()) != null) {
                    dartExecutor.executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "package:paymaya_module/main.dart", "runAutoDebitArrangement"));
                }
                AbstractC1236z.g(mayaAutoDebitArrangementActivity, R.id.constraint_layout_auto_debit_arrangment, FlutterFragment.withCachedEngine("autoDebitArrangementFullscreen").renderMode(RenderMode.texture).shouldAutomaticallyHandleOnBackPressed(true).build());
                return;
            case 23:
                r();
                return;
            case 24:
                s();
                return;
            case 25:
                t();
                return;
            case 26:
                u();
                return;
            case 27:
                v();
                return;
            case 28:
                w();
                return;
        }
    }

    public void k(int i) {
        ((QRScannerFragment) ((ce.d) this.c.get())).w1();
        if (i == 0) {
            QRScannerFragment qRScannerFragment = (QRScannerFragment) ((ce.d) this.c.get());
            qRScannerFragment.f14689U.setBorderColor(-65536);
            qRScannerFragment.f14689U.setErrorState(true);
            new Handler().postDelayed(new C.h(qRScannerFragment, 17), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
            return;
        }
        QRScannerFragment qRScannerFragment2 = (QRScannerFragment) ((ce.d) this.c.get());
        ((QRActivity) qRScannerFragment2.f14690V).t1(qRScannerFragment2.getString(R.string.pma_label_import_qr_error), qRScannerFragment2.getString(R.string.pma_label_import_qr_error_content), new de.m(qRScannerFragment2, 0));
    }

    public void l(C3.j jVar, int i) {
        QRBankTransferRecipient qRBankTransferRecipientC;
        String str = jVar.f719a;
        int i4 = Zd.e.f6928a[(this.e.e().isQrphEnhancementsEnabled() ? Z.k(str) : Z.j(str)).ordinal()];
        if (i4 == 1) {
            QRRecipient qRRecipientI = Z.i(jVar.f719a);
            ((QRScannerFragment) ((ce.d) this.c.get())).v1();
            if (qRRecipientI == null) {
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                y(i, "Invalid Send Money Code");
                k(i);
                return;
            } else {
                ((QRScannerFragment) ((ce.d) this.c.get())).w1();
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                z(i, "SEND_MONEY");
                QRActivity qRActivity = (QRActivity) ((QRScannerFragment) ((ce.d) this.c.get())).f14690V;
                qRActivity.e.T(qRActivity, qRRecipientI);
                return;
            }
        }
        if (i4 == 2) {
            if (this.e.e().isInstaPayQREnabled()) {
                try {
                    y4.f fVarZ = v0.z(jVar.f719a);
                    String strB = fVarZ.o("27").b("01");
                    if (z.o(strB, "PAPHPHM1XXX", true)) {
                        String strB2 = fVarZ.o("27").b("04");
                        String strP = fVarZ.p();
                        String string = strP != null ? strP.toString() : null;
                        C2506b c2506bN = fVarZ.n();
                        QRRecipient qRRecipientE = Z.e(strB2, string, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_08_PURPOSE) : null);
                        EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                        z(i, "SEND_MONEY_INSTAPAY_QR");
                        ((QRScannerFragment) ((ce.d) this.c.get())).v1();
                        ((QRScannerFragment) ((ce.d) this.c.get())).w1();
                        QRActivity qRActivity2 = (QRActivity) ((QRScannerFragment) ((ce.d) this.c.get())).f14690V;
                        qRActivity2.e.T(qRActivity2, qRRecipientE);
                        return;
                    }
                    if (strB != null && !C2576A.H(strB)) {
                        String strB3 = fVarZ.o("27").b("04");
                        String strP2 = fVarZ.p();
                        Double dValueOf = strP2 != null ? Double.valueOf(Double.parseDouble(strP2)) : null;
                        if (dValueOf == null) {
                            qRBankTransferRecipientC = QRBankTransferRecipient.sBuilder().mBankBic(strB).mAccountNumber(strB3).build();
                            kotlin.jvm.internal.j.d(qRBankTransferRecipientC);
                        } else {
                            qRBankTransferRecipientC = Z.c(dValueOf, strB, strB3);
                            kotlin.jvm.internal.j.d(qRBankTransferRecipientC);
                        }
                        EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                        z(i, "SEND_MONEY_INSTAPAY_QR_BANK");
                        ((QRScannerFragment) ((ce.d) this.c.get())).v1();
                        ((QRScannerFragment) ((ce.d) this.c.get())).w1();
                        QRActivity qRActivity3 = (QRActivity) ((QRScannerFragment) ((ce.d) this.c.get())).f14690V;
                        qRActivity3.e.getClass();
                        B5.i.d(qRActivity3, qRBankTransferRecipientC);
                        return;
                    }
                    EnumC1212a enumC1212a5 = EnumC1212a.ACCOUNT_NUMBER;
                    y(i, "Invalid InstaPay Code");
                    k(i);
                    return;
                } catch (Exception unused) {
                    EnumC1212a enumC1212a6 = EnumC1212a.ACCOUNT_NUMBER;
                    y(i, "Invalid InstaPay Code");
                    k(i);
                    yk.a.b();
                    return;
                }
            }
            return;
        }
        if (i4 == 3) {
            try {
                y4.f fVarZ2 = v0.z(jVar.f719a);
                String strB4 = fVarZ2.b("01");
                if (kotlin.jvm.internal.j.b(strB4, "11")) {
                    if (fVarZ2.n() == null || fVarZ2.n().b("05") == null) {
                        EnumC1212a enumC1212a7 = EnumC1212a.ACCOUNT_NUMBER;
                        y(i, "Invalid InstaPay Code");
                        k(i);
                    } else {
                        QRMerchant qRMerchantBuild = QRMerchant.sBuilder().mMerchantId(fVarZ2.n().b("05")).mName(fVarZ2.b("59")).build();
                        ((QRScannerFragment) ((ce.d) this.c.get())).v1();
                        ((QRScannerFragment) ((ce.d) this.c.get())).w1();
                        C(qRMerchantBuild);
                    }
                } else if (kotlin.jvm.internal.j.b(strB4, "12")) {
                    QRMerchant qRMerchantD = Z.d(fVarZ2.o("28").b("03"), fVarZ2.b("59"), fVarZ2.b("54"), fVarZ2.n().b("05"));
                    ((QRScannerFragment) ((ce.d) this.c.get())).v1();
                    ((QRScannerFragment) ((ce.d) this.c.get())).w1();
                    B(qRMerchantD);
                } else {
                    EnumC1212a enumC1212a8 = EnumC1212a.ACCOUNT_NUMBER;
                    y(i, "Invalid InstaPay Code");
                    k(i);
                }
                return;
            } catch (Exception unused2) {
                yk.a.b();
                EnumC1212a enumC1212a9 = EnumC1212a.ACCOUNT_NUMBER;
                y(i, "Invalid InstaPay Code");
                k(i);
                return;
            }
        }
        if (i4 != 4) {
            if (i4 != 5) {
                EnumC1212a enumC1212a10 = EnumC1212a.ACCOUNT_NUMBER;
                y(i, "Not Supported");
                k(i);
                return;
            } else {
                EnumC1212a enumC1212a11 = EnumC1212a.ACCOUNT_NUMBER;
                y(i, "Not Supported");
                k(i);
                return;
            }
        }
        try {
            QRPHMerchantPaymentRequest qRPHMerchantPaymentRequestN = Z.n(v0.z(jVar.f719a), null, Boolean.FALSE);
            if (qRPHMerchantPaymentRequestN != null) {
                ((QRScannerFragment) ((ce.d) this.c.get())).v1();
                ((QRScannerFragment) ((ce.d) this.c.get())).w1();
                if (kotlin.jvm.internal.j.b(this.e.l(), "kyc1")) {
                    D(qRPHMerchantPaymentRequestN);
                } else {
                    QRActivity qRActivity4 = (QRActivity) ((QRScannerFragment) ((ce.d) this.c.get())).f14690V;
                    qRActivity4.e.getClass();
                    B5.i.P(qRActivity4, null, false);
                }
            } else {
                EnumC1212a enumC1212a12 = EnumC1212a.ACCOUNT_NUMBER;
                y(i, "Invalid P2M Code");
                k(i);
            }
        } catch (Exception unused3) {
            yk.a.b();
            EnumC1212a enumC1212a13 = EnumC1212a.ACCOUNT_NUMBER;
            y(i, "Invalid P2M Code");
            k(i);
        }
    }

    public void m(String str) {
        C1219h c1219hE;
        if (kotlin.jvm.internal.j.b(((MayaDataPrivacyPolicyFragment) ((R7.c) this.c.get())).f12299a0, "login")) {
            Pair pair = str.equals("purpose_terms_and_conditions") ? new Pair(AbstractC1213b.A(4).concat("_EXPANDED"), "Maya PH Terms and Conditions (Bottom sheet)") : new Pair(AbstractC1213b.A(5).concat("_EXPANDED"), "Maya PH Privacy Policy (Bottom sheet)");
            String str2 = (String) pair.f18160a;
            String str3 = (String) pair.f18161b;
            c1219hE = C1219h.e(str2);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("modal", str3);
        } else {
            c1219hE = null;
        }
        MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment = (MayaDataPrivacyPolicyFragment) ((R7.c) this.c.get());
        if (c1219hE == null) {
            mayaDataPrivacyPolicyFragment.getClass();
            return;
        }
        C1220i c1220iO1 = mayaDataPrivacyPolicyFragment.o1();
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219hE.j.put("page_name", mayaDataPrivacyPolicyFragment.f12300b0);
        c1219hE.i();
        c1220iO1.b(c1219hE);
    }

    public void n(String str) {
        C1219h c1219hE;
        String str2 = ((MayaDataPrivacyPolicyFragment) ((R7.c) this.c.get())).f12299a0;
        if (kotlin.jvm.internal.j.b(str2, "login")) {
            Pair pair = str.equals("purpose_terms_and_conditions") ? new Pair(AbstractC1213b.l(4), "Maya PH Terms and Conditions (Bottom sheet)") : new Pair(AbstractC1213b.l(5), "Maya PH Privacy Policy (Bottom sheet)");
            String str3 = (String) pair.f18160a;
            String str4 = (String) pair.f18161b;
            c1219hE = C1219h.e(str3);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("page_name", ((MayaDataPrivacyPolicyFragment) ((R7.c) this.c.get())).f12300b0);
            c1219hE.j.put("modal", str4);
        } else if (kotlin.jvm.internal.j.b(str2, "registration")) {
            String str5 = str.equals("purpose_terms_and_conditions") ? "Terms and conditions" : "Privacy policy";
            C1219h c1219hE2 = C1219h.e(AbstractC1213b.o(5));
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE2.j.put("source_page", str5);
            c1219hE = c1219hE2;
        } else {
            c1219hE = null;
        }
        MayaDataPrivacyPolicyFragment mayaDataPrivacyPolicyFragment = (MayaDataPrivacyPolicyFragment) ((R7.c) this.c.get());
        if (c1219hE == null) {
            mayaDataPrivacyPolicyFragment.getClass();
            return;
        }
        C1220i c1220iO1 = mayaDataPrivacyPolicyFragment.o1();
        EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
        c1219hE.j.put("button", "Done");
        c1219hE.i();
        c1220iO1.b(c1219hE);
    }

    public boolean o(String str) {
        if ("KYUUBI_PENDING".equalsIgnoreCase(str)) {
            return true;
        }
        if (this.e.e().isMayaShopWithCheckoutFlowEnabled()) {
            return "PROCESSING".equalsIgnoreCase(str) || "PAYMENT_SUCCESSFUL".equalsIgnoreCase(str);
        }
        return false;
    }

    public void p() {
        Bundle extras = ((MayaSendMoneyActivity) ((Cb.a) this.c.get())).getIntent().getExtras();
        if (!(extras != null ? extras.getBoolean("is_from_my_favorites") : false)) {
            Bundle extras2 = ((MayaSendMoneyActivity) ((Cb.a) this.c.get())).getIntent().getExtras();
            if (!(extras2 != null ? extras2.getBoolean("recipient") : false)) {
                ((MayaSendMoneyActivity) ((Cb.a) this.c.get())).finish();
                return;
            }
        }
        MayaSendMoneyActivity mayaSendMoneyActivity = (MayaSendMoneyActivity) ((Cb.a) this.c.get());
        mayaSendMoneyActivity.n1();
        B5.i.j(mayaSendMoneyActivity);
    }

    public void x(String str) {
        if (this.e.e().isAppEventsV2CashInEnabled()) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) ((H6.c) this.c.get());
            mayaCashInActivity.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1213b.j(1));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("button", str);
            mayaCashInActivity.k1().b(c1219hE);
        }
    }

    public void y(int i, String str) {
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        if (i == 0) {
            Object obj = (ce.d) this.c.get();
            C1219h c1219hH = AbstractC2329d.h(12);
            c1219hH.t(EnumC1217f.SCAN);
            c1219hH.j.put(Constants.REASON, str);
            ((BaseFragment) obj).o1(c1219hH);
            return;
        }
        if (i != 1) {
            return;
        }
        Object obj2 = (ce.d) this.c.get();
        C1219h c1219hH2 = AbstractC2329d.h(12);
        c1219hH2.t(EnumC1217f.GALLERY);
        c1219hH2.j.put(Constants.REASON, str);
        ((BaseFragment) obj2).o1(c1219hH2);
    }

    public void z(int i, String str) {
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        if (i == 0) {
            Object obj = (ce.d) this.c.get();
            C1219h c1219hH = AbstractC2329d.h(14);
            c1219hH.t(EnumC1217f.SCAN);
            c1219hH.j.put(SessionDescription.ATTR_TYPE, str);
            ((BaseFragment) obj).o1(c1219hH);
            return;
        }
        if (i != 1) {
            return;
        }
        Object obj2 = (ce.d) this.c.get();
        C1219h c1219hH2 = AbstractC2329d.h(14);
        c1219hH2.t(EnumC1217f.GALLERY);
        c1219hH2.j.put(SessionDescription.ATTR_TYPE, str);
        ((BaseFragment) obj2).o1(c1219hH2);
    }

    public a(com.paymaya.data.preference.a mPreference, S5.c mFlagConfigurationService, int i) {
        this.f389d = i;
        switch (i) {
            case 16:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                kotlin.jvm.internal.j.g(mFlagConfigurationService, "mFlagConfigurationService");
                this.e = mPreference;
                break;
            default:
                this.e = mPreference;
                break;
        }
    }

    public a(com.paymaya.data.preference.a mPreference, c1 c1Var) {
        this.f389d = 6;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.e = mPreference;
    }

    public a(com.paymaya.data.preference.a mPreference, int i) {
        this.f389d = i;
        switch (i) {
            case 9:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = mPreference;
                break;
            case 10:
            case 11:
            case 12:
            case 16:
            case 22:
            case 23:
            default:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = mPreference;
                break;
            case 13:
                kotlin.jvm.internal.j.g(mPreference, "preference");
                this.e = mPreference;
                break;
            case 14:
                kotlin.jvm.internal.j.g(mPreference, "preference");
                this.e = mPreference;
                break;
            case 15:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = mPreference;
                break;
            case 17:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = mPreference;
                break;
            case 18:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = mPreference;
                break;
            case 19:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = mPreference;
                break;
            case 20:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = mPreference;
                break;
            case 21:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = mPreference;
                break;
            case 24:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = mPreference;
                break;
            case 25:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = mPreference;
                break;
            case 26:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = mPreference;
                break;
            case 27:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = mPreference;
                break;
            case 28:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = mPreference;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Uh.d dVar, com.paymaya.data.preference.a aVar) {
        super(dVar);
        this.f389d = 12;
        this.e = aVar;
    }
}
