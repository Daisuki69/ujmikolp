package A7;

import Bj.C0165x;
import Kh.B;
import Kh.C0307l;
import Kh.C0310o;
import L9.C0326d;
import M8.C0332a;
import N5.C0441c;
import N5.C0491z;
import N5.K;
import N5.O0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b9.InterfaceC0926b;
import b9.InterfaceC0927c;
import bg.AbstractC0983W;
import bj.AbstractC1039j;
import bj.C1037h;
import bj.C1038i;
import cj.C1110A;
import cj.C1129o;
import cj.L;
import cj.M;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mastercard.mpqr.pushpayment.exception.FormatException;
import com.mastercard.mpqr.pushpayment.exception.InvalidTagValueException;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1233w;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.J;
import com.paymaya.common.utility.T;
import com.paymaya.common.utility.V;
import com.paymaya.common.utility.Y;
import com.paymaya.common.utility.Z;
import com.paymaya.common.utility.c0;
import com.paymaya.common.utility.i0;
import com.paymaya.common.widget.MayaButtonWithIcon;
import com.paymaya.domain.model.AccountBalance;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.model.CreditConsent;
import com.paymaya.domain.model.CreditInitialEligibility;
import com.paymaya.domain.model.DeviceInformation;
import com.paymaya.domain.model.DeviceInformationResponse;
import com.paymaya.domain.model.Ekyc;
import com.paymaya.domain.model.FundSource;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.MFAChallengeInformationV2;
import com.paymaya.domain.model.MFAChallengeVerificationResult;
import com.paymaya.domain.model.MFAChallengeVerificationResultV2;
import com.paymaya.domain.model.MerchantPaymentV2;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.domain.model.MfaMetaKt;
import com.paymaya.domain.model.OpenMFAStartChallengeOtpRequest;
import com.paymaya.domain.model.OpenMFAStartChallengeOtpRequestParams;
import com.paymaya.domain.model.OpenMfaChallengeIdentity;
import com.paymaya.domain.model.OpenMfaChallengeRequest;
import com.paymaya.domain.model.OpenMfaMeta;
import com.paymaya.domain.model.OpenMfaVerifyRequestOtp;
import com.paymaya.domain.model.OpenMfaVerifyRequestOtpParams;
import com.paymaya.domain.model.Operator;
import com.paymaya.domain.model.OrderProviderField;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PayMayaErrorAction;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.model.ProductProviderDetails;
import com.paymaya.domain.model.ProductProviderField;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.domain.model.QRBankTransferRecipient;
import com.paymaya.domain.model.QRMerchant;
import com.paymaya.domain.model.QRPHAdditionalData;
import com.paymaya.domain.model.QRPHMerchantPaymentRequest;
import com.paymaya.domain.model.QRRecipient;
import com.paymaya.domain.model.ScreensBannerIndex;
import com.paymaya.domain.model.ServicesFeatureCategoryDetails;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.domain.model.TransferAppLink;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C1250b0;
import com.paymaya.domain.store.C1261h;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.C1268k0;
import com.paymaya.domain.store.C1270l0;
import com.paymaya.domain.store.C1273n;
import com.paymaya.domain.store.C1278p0;
import com.paymaya.domain.store.C1281r0;
import com.paymaya.domain.store.C1283s0;
import com.paymaya.domain.store.E0;
import com.paymaya.domain.store.I0;
import com.paymaya.domain.store.P;
import com.paymaya.domain.store.W0;
import com.paymaya.domain.store.Z0;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaAutoCashinWalletSettingsFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaMaintenanceFragment;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaServicesV2Fragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityBankPullFundsFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityCardPullFundsFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityCashOutFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityDefaultFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityMoneyInFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityPayBillsFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityPurchaseFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivitySendMoneyFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivitySystemAlertFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaUserActivityTransportFragment;
import com.paymaya.mayaui.inbox.view.activity.impl.MayaInboxV2Activity;
import com.paymaya.mayaui.inbox.view.fragment.impl.MayaInboxFragment;
import com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaWelcomeActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaRegistrationUserFragment;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMfaFaceAuthFragment;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMultiTypeMfaInitialFragment;
import com.paymaya.mayaui.mfa.view.fragment.impl.MayaMultiTypeOtpFragment;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.MayaCreditInterstitialActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.qr.view.fragment.impl.MayaQRScannerFragment;
import com.paymaya.mayaui.qr.view.widget.MayaCameraHeaderQRPH;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaDeviceManagementMainFragment;
import com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelOperatorSelectionFragment;
import com.paymaya.mayaui.travel.view.widget.MayaTravelViewDataSelection;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUserProfileUpdateActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDApplicationStatusFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDIntroFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ConfirmationBottomSheetFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PurchaseHistoryReceiptFragment;
import com.tencent.could.huiyansdk.overseas.HuiYanOsApi;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d4.AbstractC1331a;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import dj.C1406d;
import ic.C1599c;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import k2.v0;
import k3.C1757b;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o1.AbstractC1955a;
import o6.C1967a;
import oi.C1983a;
import okhttp3.RequestBody;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Interval;
import org.joda.time.format.DateTimeFormatter;
import org.json.JSONException;
import org.json.JSONObject;
import ph.C2070f1;
import s.AbstractC2217b;
import t9.C2278a;
import tc.InterfaceC2281b;
import v.AbstractC2329d;
import ve.InterfaceC2347a;
import w1.RunnableC2367e;
import x4.EnumC2464a;
import y4.C2506b;
import y4.C2508d;
import y5.AbstractC2509a;
import zj.C2576A;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends AbstractC2509a implements y5.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f219d;
    public Object e;
    public Object f;

    public /* synthetic */ j() {
        this.f219d = 18;
    }

    private final void E() {
        ArrayList<OrderProviderField> arrayList;
        super.j();
        ShopPurchaseHistory shopPurchaseHistory = ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).f14877X;
        if (shopPurchaseHistory == null) {
            return;
        }
        String strMNetwork = shopPurchaseHistory.mNetwork();
        String price = AbstractC1414e.h("PHP ", J.f10420a.format(shopPurchaseHistory.mPrice()));
        String strMProductName = shopPurchaseHistory.mProductName();
        String strMIconUrl = shopPurchaseHistory.mIconUrl();
        String strMCode = shopPurchaseHistory.mCode();
        if (strMCode == null) {
            strMCode = "";
        }
        boolean zH = C2576A.H(strMCode);
        boolean zX = x(strMNetwork);
        boolean zMIsGifted = shopPurchaseHistory.mIsGifted();
        if ("KYUUBI_PENDING".equalsIgnoreCase(shopPurchaseHistory.mStatus())) {
            ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).J1(R.string.pma_label_shop_purchase_history_receipt_processing_title);
        } else {
            ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).J1(R.string.pma_label_shop_purchase_history_receipt_completed_title);
        }
        if ("KYUUBI_PENDING".equalsIgnoreCase(shopPurchaseHistory.mStatus())) {
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment = (ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get());
            shopV3PurchaseHistoryReceiptFragment.b2().setText(shopV3PurchaseHistoryReceiptFragment.getString(R.string.pma_label_processing));
            shopV3PurchaseHistoryReceiptFragment.b2().setCompoundDrawablesWithIntrinsicBounds(R.drawable.pma_ic_processing_status, 0, 0, 0);
        } else {
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment2 = (ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get());
            shopV3PurchaseHistoryReceiptFragment2.b2().setText(shopV3PurchaseHistoryReceiptFragment2.getString(R.string.pma_label_completed));
            shopV3PurchaseHistoryReceiptFragment2.b2().setCompoundDrawablesWithIntrinsicBounds(R.drawable.pma_ic_check_status, 0, 0, 0);
        }
        if (zH) {
            O0 o02 = ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).f14878Y;
            kotlin.jvm.internal.j.d(o02);
            ((Group) o02.f3832t).setVisibility(0);
            ve.k kVar = (ve.k) this.c.get();
            String str = strMProductName == null ? "" : strMProductName;
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment3 = (ShopV3PurchaseHistoryReceiptFragment) kVar;
            shopV3PurchaseHistoryReceiptFragment3.getClass();
            O0 o03 = shopV3PurchaseHistoryReceiptFragment3.f14878Y;
            kotlin.jvm.internal.j.d(o03);
            ((TextView) o03.f3833u).setText(str);
        } else {
            O0 o04 = ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).f14878Y;
            kotlin.jvm.internal.j.d(o04);
            ((Group) o04.f3832t).setVisibility(8);
        }
        kotlin.jvm.internal.j.g(price, "price");
        ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment4 = (ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get());
        shopV3PurchaseHistoryReceiptFragment4.getClass();
        O0 o05 = shopV3PurchaseHistoryReceiptFragment4.f14878Y;
        kotlin.jvm.internal.j.d(o05);
        ((TextView) o05.f3824k).setText(price);
        if (!zMIsGifted) {
            O0 o06 = ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).f14878Y;
            kotlin.jvm.internal.j.d(o06);
            ((TextView) o06.f3829q).setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        String strMRecipient = shopPurchaseHistory.mRecipient();
        String strMNetwork2 = shopPurchaseHistory.mNetwork();
        if (strMRecipient == null || C2576A.H(strMRecipient) || ((strMNetwork2 == null || C2576A.H(strMNetwork2) || !"beep".equalsIgnoreCase(strMNetwork2)) && (strMNetwork2 == null || C2576A.H(strMNetwork2) || !"Cignal".equalsIgnoreCase(strMNetwork2)))) {
            if (strMRecipient == null || C2576A.H(strMRecipient)) {
                ve.k kVar2 = (ve.k) this.c.get();
                String strR = ((com.paymaya.data.preference.a) this.f).r();
                kotlin.jvm.internal.j.f(strR, "getMobileNumber(...)");
                O0 o07 = ((ShopV3PurchaseHistoryReceiptFragment) kVar2).f14878Y;
                kotlin.jvm.internal.j.d(o07);
                ((TextView) o07.f3829q).setText(strR);
            } else {
                O0 o08 = ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).f14878Y;
                kotlin.jvm.internal.j.d(o08);
                ((TextView) o08.f3829q).setText(strMRecipient);
            }
            O0 o09 = ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).f14878Y;
            kotlin.jvm.internal.j.d(o09);
            o09.c.setVisibility(8);
            O0 o010 = ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).f14878Y;
            kotlin.jvm.internal.j.d(o010);
            o010.i.setVisibility(0);
        } else {
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment5 = (ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get());
            shopV3PurchaseHistoryReceiptFragment5.getClass();
            O0 o011 = shopV3PurchaseHistoryReceiptFragment5.f14878Y;
            kotlin.jvm.internal.j.d(o011);
            ((TextView) o011.j).setText(strMRecipient);
            O0 o012 = ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).f14878Y;
            kotlin.jvm.internal.j.d(o012);
            o012.c.setVisibility(0);
            O0 o013 = ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).f14878Y;
            kotlin.jvm.internal.j.d(o013);
            o013.i.setVisibility(8);
        }
        String strMStatus = shopPurchaseHistory.mStatus();
        kotlin.jvm.internal.j.f(strMStatus, "mStatus(...)");
        boolean zMWithReceipt = shopPurchaseHistory.mWithReceipt();
        boolean zMAvailableReceipt = shopPurchaseHistory.mAvailableReceipt();
        if (strMStatus.equals("DISBURSEMENT_SUCCESSFUL") && zMWithReceipt && ((com.paymaya.data.preference.a) this.f).e().isShopPurchaseDigitalOREnabled()) {
            O0 o014 = ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).f14878Y;
            kotlin.jvm.internal.j.d(o014);
            o014.f3823g.setVisibility(0);
            if (zMAvailableReceipt) {
                ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).Z1().setVisibility(0);
                ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).a2().setText(R.string.pma_label_shop_purchase_history_official_receipt_link_expiry_note);
            } else {
                ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).Z1().setVisibility(8);
                ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment6 = (ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get());
                shopV3PurchaseHistoryReceiptFragment6.a2().setText(shopV3PurchaseHistoryReceiptFragment6.getString(R.string.pma_label_shop_purchase_history_official_receipt_link_availability));
            }
            ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).a2().setVisibility(0);
        } else {
            O0 o015 = ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).f14878Y;
            kotlin.jvm.internal.j.d(o015);
            o015.f3823g.setVisibility(8);
            ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).Z1().setVisibility(8);
            ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).a2().setVisibility(8);
        }
        String strMProductDescription = shopPurchaseHistory.mProductDescription();
        if (zMIsGifted || C2576A.H(strMCode)) {
            ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).d2().setVisibility(8);
            ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).c2().setVisibility(8);
            O0 o016 = ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).f14878Y;
            kotlin.jvm.internal.j.d(o016);
            o016.h.setVisibility(8);
        } else if (zX) {
            ve.k kVar3 = (ve.k) this.c.get();
            if (strMProductName == null) {
                strMProductName = "";
            }
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment7 = (ShopV3PurchaseHistoryReceiptFragment) kVar3;
            shopV3PurchaseHistoryReceiptFragment7.getClass();
            ((TextView) shopV3PurchaseHistoryReceiptFragment7.W1().f).setText(strMProductName);
            ve.k kVar4 = (ve.k) this.c.get();
            if (strMProductDescription == null) {
                strMProductDescription = "";
            }
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment8 = (ShopV3PurchaseHistoryReceiptFragment) kVar4;
            shopV3PurchaseHistoryReceiptFragment8.getClass();
            ((TextView) shopV3PurchaseHistoryReceiptFragment8.W1().c).setText(strMProductDescription);
            ve.k kVar5 = (ve.k) this.c.get();
            if (strMIconUrl == null) {
                strMIconUrl = "";
            }
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment9 = (ShopV3PurchaseHistoryReceiptFragment) kVar5;
            shopV3PurchaseHistoryReceiptFragment9.getClass();
            shopV3PurchaseHistoryReceiptFragment9.getActivity();
            C.e0(strMIconUrl, (ImageView) shopV3PurchaseHistoryReceiptFragment9.W1().f4138b, 2131232014);
            StringBuilder sb2 = new StringBuilder();
            String strT = zj.z.t(strMCode, Global.NEWLINE, "");
            for (int i = 0; i < 3; i++) {
                if (sb2.length() > 0) {
                    sb2.append(Global.NEWLINE);
                }
                int i4 = i * 13;
                int iMin = Math.min(strT.length(), i4 + 13);
                String strSubstring = strT.substring(i4, iMin);
                kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                if (strT.length() == iMin) {
                    break;
                }
            }
            ve.k kVar6 = (ve.k) this.c.get();
            String string = sb2.toString();
            kotlin.jvm.internal.j.f(string, "toString(...)");
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment10 = (ShopV3PurchaseHistoryReceiptFragment) kVar6;
            shopV3PurchaseHistoryReceiptFragment10.getClass();
            ((TextView) shopV3PurchaseHistoryReceiptFragment10.W1().f4139d).setText(string);
            ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).c2().setVisibility(8);
            ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).d2().setVisibility(0);
        } else {
            ve.k kVar7 = (ve.k) this.c.get();
            if (strMProductName == null) {
                strMProductName = "";
            }
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment11 = (ShopV3PurchaseHistoryReceiptFragment) kVar7;
            shopV3PurchaseHistoryReceiptFragment11.getClass();
            ((TextView) shopV3PurchaseHistoryReceiptFragment11.V1().h).setText(strMProductName);
            ve.k kVar8 = (ve.k) this.c.get();
            if (strMProductDescription == null) {
                strMProductDescription = "";
            }
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment12 = (ShopV3PurchaseHistoryReceiptFragment) kVar8;
            shopV3PurchaseHistoryReceiptFragment12.getClass();
            ((TextView) shopV3PurchaseHistoryReceiptFragment12.V1().f).setText(strMProductDescription);
            ve.k kVar9 = (ve.k) this.c.get();
            if (strMIconUrl == null) {
                strMIconUrl = "";
            }
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment13 = (ShopV3PurchaseHistoryReceiptFragment) kVar9;
            shopV3PurchaseHistoryReceiptFragment13.getClass();
            shopV3PurchaseHistoryReceiptFragment13.getActivity();
            C.e0(strMIconUrl, (ImageView) shopV3PurchaseHistoryReceiptFragment13.V1().f3584g, 2131232014);
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment14 = (ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get());
            shopV3PurchaseHistoryReceiptFragment14.getClass();
            ((TextView) shopV3PurchaseHistoryReceiptFragment14.V1().f3583d).setText(strMCode);
            ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).d2().setVisibility(8);
            ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).c2().setVisibility(0);
        }
        List<OrderProviderField> listMOtherFields = shopPurchaseHistory.mOtherFields();
        if (listMOtherFields != null && !listMOtherFields.isEmpty()) {
            O0 o017 = ((ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get())).f14878Y;
            kotlin.jvm.internal.j.d(o017);
            o017.i.setVisibility(8);
        }
        List<OrderProviderField> listMOtherFields2 = shopPurchaseHistory.mOtherFields();
        if (listMOtherFields2 != null) {
            arrayList = new ArrayList();
            for (Object obj : listMOtherFields2) {
                if (!kotlin.jvm.internal.j.b(((OrderProviderField) obj).mIsHidden(), Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            HashMap map = new HashMap();
            for (OrderProviderField orderProviderField : arrayList) {
                map.put(orderProviderField.mName(), orderProviderField.mValue());
            }
            ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment15 = (ShopV3PurchaseHistoryReceiptFragment) ((ve.k) this.c.get());
            shopV3PurchaseHistoryReceiptFragment15.getClass();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(shopV3PurchaseHistoryReceiptFragment15.getContext());
            O0 o018 = shopV3PurchaseHistoryReceiptFragment15.f14878Y;
            kotlin.jvm.internal.j.d(o018);
            Barrier barrier = (Barrier) o018.f3831s;
            View view = barrier;
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                View viewInflate = layoutInflaterFrom.inflate(R.layout.pma_view_shop_dynamic_field_label_text_view, (ViewGroup) shopV3PurchaseHistoryReceiptFragment15.X1(), false);
                kotlin.jvm.internal.j.e(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) viewInflate;
                textView.setId(ViewCompat.generateViewId());
                textView.setText(str2);
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
                layoutParams.topToBottom = view.getId();
                layoutParams.startToStart = shopV3PurchaseHistoryReceiptFragment15.X1().getId();
                O0 o019 = shopV3PurchaseHistoryReceiptFragment15.f14878Y;
                kotlin.jvm.internal.j.d(o019);
                layoutParams.endToEnd = ((Guideline) o019.m).getId();
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = shopV3PurchaseHistoryReceiptFragment15.getResources().getDimensionPixelSize(R.dimen.pma_margin_normal);
                View viewInflate2 = layoutInflaterFrom.inflate(R.layout.pma_view_shop_dynamic_field_value_text_view, (ViewGroup) shopV3PurchaseHistoryReceiptFragment15.X1(), false);
                kotlin.jvm.internal.j.e(viewInflate2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView2 = (TextView) viewInflate2;
                textView2.setId(ViewCompat.generateViewId());
                textView2.setText(str3);
                ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, -2);
                layoutParams2.baselineToBaseline = textView.getId();
                O0 o020 = shopV3PurchaseHistoryReceiptFragment15.f14878Y;
                kotlin.jvm.internal.j.d(o020);
                layoutParams2.startToStart = ((Guideline) o020.m).getId();
                layoutParams2.endToEnd = shopV3PurchaseHistoryReceiptFragment15.X1().getId();
                shopV3PurchaseHistoryReceiptFragment15.X1().addView(textView, layoutParams);
                shopV3PurchaseHistoryReceiptFragment15.X1().addView(textView2, layoutParams2);
                view = textView2;
            }
            O0 o021 = shopV3PurchaseHistoryReceiptFragment15.f14878Y;
            kotlin.jvm.internal.j.d(o021);
            ViewGroup.LayoutParams layoutParams3 = o021.f3822d.getLayoutParams();
            kotlin.jvm.internal.j.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.topToBottom = view.getId();
            O0 o022 = shopV3PurchaseHistoryReceiptFragment15.f14878Y;
            kotlin.jvm.internal.j.d(o022);
            ((TextView) o022.j).setLayoutParams(layoutParams4);
        }
        ve.k kVar10 = (ve.k) this.c.get();
        String localDateTimeForDisplay = shopPurchaseHistory.getLocalDateTimeForDisplay(Locale.getDefault());
        kotlin.jvm.internal.j.f(localDateTimeForDisplay, "getLocalDateTimeForDisplay(...)");
        ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment16 = (ShopV3PurchaseHistoryReceiptFragment) kVar10;
        shopV3PurchaseHistoryReceiptFragment16.getClass();
        O0 o023 = shopV3PurchaseHistoryReceiptFragment16.f14878Y;
        kotlin.jvm.internal.j.d(o023);
        ((TextView) o023.f3825l).setText(localDateTimeForDisplay);
        ve.k kVar11 = (ve.k) this.c.get();
        String strMPaymentTrn = shopPurchaseHistory.mPaymentTrn();
        String str4 = strMPaymentTrn != null ? strMPaymentTrn : "";
        ShopV3PurchaseHistoryReceiptFragment shopV3PurchaseHistoryReceiptFragment17 = (ShopV3PurchaseHistoryReceiptFragment) kVar11;
        shopV3PurchaseHistoryReceiptFragment17.getClass();
        O0 o024 = shopV3PurchaseHistoryReceiptFragment17.f14878Y;
        kotlin.jvm.internal.j.d(o024);
        ((TextView) o024.f3830r).setText(str4);
        if (((com.paymaya.data.preference.a) this.f).e().isInAppReviewPurchaseHistoryEnabled()) {
            ((BaseFragment) ((ve.k) this.c.get())).q1("purchase history");
        }
    }

    public static /* synthetic */ void O(j jVar, String str, String str2, String str3, String str4, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        jVar.N(null, str, str2, str3, (i & 16) != 0 ? null : str4);
    }

    public static String n(TransferAppLink transferAppLink) {
        kotlin.jvm.internal.j.g(transferAppLink, "transferAppLink");
        return androidx.camera.core.impl.a.j(transferAppLink.mCurrency(), Global.BLANK, C.v(transferAppLink.mAmount()));
    }

    public static /* synthetic */ void s(j jVar, PayMayaError payMayaError, int i) {
        if ((i & 1) != 0) {
            payMayaError = null;
        }
        jVar.r(payMayaError, false);
    }

    public void A() {
        int i = 0;
        MayaTravelViewDataSelection mayaTravelViewDataSelectionQ1 = ((MayaTravelOperatorSelectionFragment) ((jc.c) this.c.get())).Q1();
        ArrayList arrayList = mayaTravelViewDataSelectionQ1 != null ? mayaTravelViewDataSelectionQ1.f14230b : null;
        if (arrayList != null && !arrayList.isEmpty()) {
            ((MayaTravelOperatorSelectionFragment) ((jc.c) this.c.get())).L1();
            U(arrayList);
        } else {
            ((MayaTravelOperatorSelectionFragment) ((jc.c) this.c.get())).O1();
            Ah.p<List<Operator>> operators = ((W0) this.f).f11403b.getOperators();
            e(new Lh.d(new Lh.d(AbstractC1331a.l(operators, operators, zh.b.a()), new com.google.firebase.messaging.p(this, 10), 2), new A0(this, 8), i).e());
        }
    }

    public void B() {
        MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) ((Ma.b) this.c.get());
        mayaQRScannerFragment.getClass();
        B bE = AbstractC1955a.k(mayaQRScannerFragment).e(zh.b.a());
        Gh.f fVar = new Gh.f(new Ja.e(this, 0), Eh.d.f1366d);
        bE.g(fVar);
        e(fVar);
    }

    public void C(String str) {
        if (C.Y(str)) {
            G7.q qVar = ((MayaServicesV2Fragment) ((F7.b) this.c.get())).m0;
            if (qVar != null) {
                MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) qVar;
                mayaDashboardActivity.n1();
                B5.i.l(mayaDashboardActivity, str, AttributionSource.f10368d);
                return;
            }
            return;
        }
        MayaServicesV2Fragment mayaServicesV2Fragment = (MayaServicesV2Fragment) ((F7.b) this.c.get());
        if (str == null) {
            mayaServicesV2Fragment.getClass();
            return;
        }
        G7.q qVar2 = mayaServicesV2Fragment.m0;
        if (qVar2 != null) {
            ((MayaDashboardActivity) qVar2).v2(str);
        }
    }

    public void D() {
        int i;
        Object objA;
        Integer servicesScreen;
        C1406d c1406dB = cj.r.b();
        I0 i02 = (I0) this.f;
        i02.getClass();
        c1406dB.add(new J7.h(new ArrayList(i02.f11359g)));
        I0 i03 = (I0) this.f;
        i03.getClass();
        ArrayList arrayList = new ArrayList(i03.h);
        ArrayList arrayList2 = new ArrayList(cj.t.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new J7.g((ServicesFeatureCategoryDetails) it.next()));
        }
        c1406dB.addAll(arrayList2);
        if (S5.c.b((S5.c) this.e, A5.b.f146x1)) {
            String strD = ((S5.c) this.e).d(A5.f.e);
            try {
                C1037h.a aVar = C1037h.f9166b;
                objA = (ScreensBannerIndex) com.paymaya.common.utility.A.f10366a.e(strD, ScreensBannerIndex.class);
            } catch (Throwable th2) {
                C1037h.a aVar2 = C1037h.f9166b;
                objA = AbstractC1039j.a(th2);
            }
            if (objA instanceof C1038i) {
                objA = null;
            }
            ScreensBannerIndex screensBannerIndex = (ScreensBannerIndex) objA;
            int iIntValue = (screensBannerIndex == null || (servicesScreen = screensBannerIndex.getServicesScreen()) == null) ? 1 : servicesScreen.intValue();
            if (iIntValue >= 0 && iIntValue < c1406dB.size()) {
                c1406dB.add(iIntValue + 1, new J7.i(3));
            }
        } else if (S5.c.b((S5.c) this.e, A5.b.f143w1) && (i = ((I0) this.f).i) >= 0 && i < c1406dB.size()) {
            String SERVICES_BANNER_APPEAR_EVENT = AbstractC1233w.f11241p;
            kotlin.jvm.internal.j.f(SERVICES_BANNER_APPEAR_EVENT, "SERVICES_BANNER_APPEAR_EVENT");
            c1406dB.add(1 + i, new J7.f(SERVICES_BANNER_APPEAR_EVENT, i));
        }
        C1406d sectionItems = cj.r.a(c1406dB);
        MayaServicesV2Fragment mayaServicesV2Fragment = (MayaServicesV2Fragment) ((F7.b) this.c.get());
        mayaServicesV2Fragment.getClass();
        kotlin.jvm.internal.j.g(sectionItems, "sectionItems");
        D7.f fVar = mayaServicesV2Fragment.f12198n0;
        if (fVar != null) {
            ArrayList arrayList3 = fVar.e;
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new D7.g(arrayList3, sectionItems));
            kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
            arrayList3.clear();
            arrayList3.addAll(sectionItems);
            diffResultCalculateDiff.dispatchUpdatesTo(fVar);
        }
    }

    public void F(PayMayaError payMayaError, Throwable throwable) {
        kotlin.jvm.internal.j.g(throwable, "throwable");
        if (!payMayaError.isSessionTimeout() && !payMayaError.isNetworkError()) {
            M9.b bVar = (M9.b) this.c.get();
            Map mapC = L.c(new Pair("product", "mec"));
            ((MayaCreditInterstitialActivity) bVar).getClass();
            E.b(throwable, mapC);
        }
        yk.a.e();
    }

    public void G(int i, PayMayaError payMayaError, String keyword) {
        kotlin.jvm.internal.j.g(keyword, "keyword");
        if (!((com.paymaya.data.preference.a) this.f).e().isBillsPayEventsV2Enabled()) {
            y5.s sVar = (ga.g) this.c.get();
            C1219h c1219hH = AbstractC2329d.h(12);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH.j.put("keyword", keyword);
            c1219hH.j.put("page", String.valueOf(i));
            c1219hH.j.put(Constants.REASON, payMayaError.mSpiel());
            c1219hH.i();
            ((MayaBaseFragment) sVar).A1(c1219hH);
            return;
        }
        ga.g gVar = (ga.g) this.c.get();
        int iMErrorCode = payMayaError.mErrorCode();
        String strMSpiel = payMayaError.mSpiel();
        kotlin.jvm.internal.j.f(strMSpiel, "mSpiel(...)");
        MayaPayBillsSearchFragment mayaPayBillsSearchFragment = (MayaPayBillsSearchFragment) gVar;
        mayaPayBillsSearchFragment.getClass();
        C1219h c1219hE = C1219h.e("BILLS_PAY_ERROR_SCREEN");
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        String strValueOf = String.valueOf(iMErrorCode);
        HashMap map = c1219hE.j;
        map.put(StateEvent.Name.ERROR_CODE, strValueOf);
        map.put("error_reason", strMSpiel);
        map.put("page", "Search");
        mayaPayBillsSearchFragment.o1().b(c1219hE);
    }

    public void H(int i, int i4, String keyword) {
        kotlin.jvm.internal.j.g(keyword, "keyword");
        y5.s sVar = (ga.g) this.c.get();
        C1219h c1219hH = AbstractC2329d.h(14);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("keyword", keyword);
        c1219hH.j.put("page", String.valueOf(i));
        c1219hH.j.put("count", String.valueOf(i4));
        c1219hH.i();
        ((MayaBaseFragment) sVar).A1(c1219hH);
    }

    public void I(Map map) {
        C1219h c1219hE = C1219h.e(AbstractC1213b.a(5));
        for (Map.Entry entry : map.entrySet()) {
            c1219hE.f((EnumC1212a) entry.getKey(), (String) entry.getValue());
        }
        MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) ((Ma.b) this.c.get());
        mayaQRScannerFragment.o1().c(mayaQRScannerFragment.getActivity(), c1219hE);
    }

    public void J(Map map) {
        C1219h c1219hE = C1219h.e(AbstractC1213b.C(2).concat("_SCANNED"));
        for (Map.Entry entry : map.entrySet()) {
            c1219hE.f((EnumC1212a) entry.getKey(), (String) entry.getValue());
        }
        MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) ((Ma.b) this.c.get());
        mayaQRScannerFragment.o1().c(mayaQRScannerFragment.getActivity(), c1219hE);
    }

    public void K(int i, String str) {
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        if (i == 0) {
            y5.s sVar = (Ma.b) this.c.get();
            C1219h c1219hH = AbstractC2329d.h(12);
            c1219hH.t(EnumC1217f.SCAN);
            c1219hH.j.put(Constants.REASON, str);
            ((MayaBaseFragment) sVar).A1(c1219hH);
            return;
        }
        if (i != 1) {
            return;
        }
        y5.s sVar2 = (Ma.b) this.c.get();
        C1219h c1219hH2 = AbstractC2329d.h(12);
        c1219hH2.t(EnumC1217f.GALLERY);
        c1219hH2.j.put(Constants.REASON, str);
        ((MayaBaseFragment) sVar2).A1(c1219hH2);
    }

    public void L(int i, String str) {
        if (((com.paymaya.data.preference.a) this.e).e().isQREventsV2Enabled()) {
            I(M.i(new Pair(EnumC1212a.QR_CLASS, "Instapay"), new Pair(EnumC1212a.ERROR_REASON, str), new Pair(EnumC1212a.PAGE, "Pay with QR")));
        } else {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            K(i, "Invalid InstaPay Code");
        }
    }

    public void M(int i, String str) {
        if (!((com.paymaya.data.preference.a) this.e).e().isQREventsV2Enabled()) {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            K(i, "Invalid P2M Code");
            return;
        }
        O(this, str, null, "Off us", null, 21);
        Ma.b bVar = (Ma.b) this.c.get();
        C1219h c1219hE = C1219h.e(AbstractC1213b.a(5));
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219hE.j.put("qr_class", "P2M");
        MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) bVar;
        mayaQRScannerFragment.o1().c(mayaQRScannerFragment.getActivity(), c1219hE);
    }

    public void N(String str, String str2, String str3, String str4, String str5) {
        if (((com.paymaya.data.preference.a) this.e).e().isQREventsV2Enabled()) {
            LinkedHashMap linkedHashMapI = M.i(new Pair(EnumC1212a.PAGE, "Pay with QR"));
            if (str != null && !C2576A.H(str)) {
                linkedHashMapI.put(EnumC1212a.ERROR_CODE, str);
            }
            if (str2 != null && !C2576A.H(str2)) {
                linkedHashMapI.put(EnumC1212a.ERROR_REASON, str2);
            }
            if (str3 != null && !C2576A.H(str3)) {
                linkedHashMapI.put(EnumC1212a.QR_TYPE, str3);
            }
            if (str4 != null && !C2576A.H(str4)) {
                linkedHashMapI.put(EnumC1212a.MERCHANT_TYPE, str4);
            }
            if (str5 != null && !C2576A.H(str5)) {
                linkedHashMapI.put(EnumC1212a.MERCHANT_NAME, str5);
            }
            I(linkedHashMapI);
        }
    }

    public void P(int i, String str) {
        if (((com.paymaya.data.preference.a) this.e).e().isQREventsV2Enabled()) {
            J(L.c(new Pair(EnumC1212a.QR_CLASS, "P2P")));
        } else {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            R(i, str);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    public void Q(String keyword) {
        kotlin.jvm.internal.j.g(keyword, "keyword");
        if (!((com.paymaya.data.preference.a) this.f).e().isBillsPayEventsV2Enabled() || keyword.length() < 2) {
            return;
        }
        MayaPayBillsSearchFragment mayaPayBillsSearchFragment = (MayaPayBillsSearchFragment) ((ga.g) this.c.get());
        mayaPayBillsSearchFragment.getClass();
        C1219h c1219hE = C1219h.e(AbstractC1173g.b(16));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        ea.h hVar = mayaPayBillsSearchFragment.f13480c0;
        if (hVar == null) {
            kotlin.jvm.internal.j.n("mBillerSearchListAdapter");
            throw null;
        }
        c1219hE.j.put("no_of_results", String.valueOf(hVar.e.size()));
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219hE.j.put("keyword", keyword);
        mayaPayBillsSearchFragment.o1().b(c1219hE);
    }

    public void R(int i, String str) {
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        if (i == 0) {
            y5.s sVar = (Ma.b) this.c.get();
            C1219h c1219hH = AbstractC2329d.h(14);
            c1219hH.t(EnumC1217f.SCAN);
            c1219hH.j.put(SessionDescription.ATTR_TYPE, str);
            ((MayaBaseFragment) sVar).A1(c1219hH);
            return;
        }
        if (i != 1) {
            return;
        }
        y5.s sVar2 = (Ma.b) this.c.get();
        C1219h c1219hH2 = AbstractC2329d.h(14);
        c1219hH2.t(EnumC1217f.GALLERY);
        c1219hH2.j.put(SessionDescription.ATTR_TYPE, str);
        ((MayaBaseFragment) sVar2).A1(c1219hH2);
    }

    public void S(int i) {
        if (((com.paymaya.data.preference.a) this.e).e().isQREventsV2Enabled()) {
            I(M.h(new Pair(EnumC1212a.QR_CLASS, "Unknown"), new Pair(EnumC1212a.ERROR_REASON, "Not Supported"), new Pair(EnumC1212a.PAGE, "Pay with QR")));
        } else {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            K(i, "Not Supported");
        }
    }

    public QRMerchant T(String str, y4.f fVar) {
        if (!((com.paymaya.data.preference.a) this.e).e().isQrWithCheckoutFlowEnabled()) {
            QRMerchant qRMerchantD = Z.d(fVar.o("28").b("03"), fVar.b("59"), fVar.b("54"), fVar.n().b("05"));
            kotlin.jvm.internal.j.d(qRMerchantD);
            return qRMerchantD;
        }
        String strB = fVar.o("28").b("03");
        String strB2 = fVar.b("59");
        String strB3 = fVar.b("54");
        String strB4 = fVar.n().b("05");
        T t5 = Z.f10458a;
        QRMerchant qRMerchantBuild = QRMerchant.sBuilder().mMerchantId(strB).mName(strB2).mAmount(Amount.sBuilder().mValue(strB3).mCurrency("PHP").build()).mPaymentId(strB4).mType("QR_ON_US_DYNAMIC_QRPH").mQrPayload(str).build();
        kotlin.jvm.internal.j.d(qRMerchantBuild);
        return qRMerchantBuild;
    }

    public void U(List operators) {
        kotlin.jvm.internal.j.g(operators, "operators");
        List list = operators;
        ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new mc.c((Operator) it.next()));
        }
        MayaTravelOperatorSelectionFragment mayaTravelOperatorSelectionFragment = (MayaTravelOperatorSelectionFragment) ((jc.c) this.c.get());
        mayaTravelOperatorSelectionFragment.getClass();
        C1599c c1599c = mayaTravelOperatorSelectionFragment.f14205r0;
        if (c1599c != null) {
            c1599c.e(arrayList);
        }
    }

    public QRMerchant V(String str, y4.f fVar) {
        if (!((com.paymaya.data.preference.a) this.e).e().isQrWithCheckoutFlowEnabled()) {
            String strB = fVar.n().b("05");
            String strB2 = fVar.b("59");
            T t5 = Z.f10458a;
            QRMerchant qRMerchantBuild = QRMerchant.sBuilder().mMerchantId(strB).mName(strB2).build();
            kotlin.jvm.internal.j.d(qRMerchantBuild);
            return qRMerchantBuild;
        }
        String strB3 = fVar.o("28").b("03");
        String strB4 = fVar.n().b("05");
        String strB5 = fVar.b("59");
        T t10 = Z.f10458a;
        QRMerchant qRMerchantBuild2 = QRMerchant.sBuilder().mMerchantId(strB3).mPaymentId(strB4).mName(strB5).mType("QR_ON_US_STATIC_QRPH").mQrPayload(str).build();
        kotlin.jvm.internal.j.d(qRMerchantBuild2);
        return qRMerchantBuild2;
    }

    public void W(QRMerchant qRMerchant) {
        int i = 0;
        int i4 = 5;
        int i6 = 1;
        if (!((com.paymaya.data.preference.a) this.e).e().isMerchantPaymentAvailable()) {
            String strMMessage = ((com.paymaya.data.preference.a) this.e).e().mMaintenanceConfig().mServiceAvailabilityConfig().mMerchantPaymentAvailability().mMessage();
            Ma.b bVar = (Ma.b) this.c.get();
            kotlin.jvm.internal.j.d(strMMessage);
            Na.i iVar = ((MayaQRScannerFragment) bVar).f13610k0;
            if (iVar != null) {
                MayaQRActivity mayaQRActivity = (MayaQRActivity) iVar;
                mayaQRActivity.n1();
                B5.i.U(mayaQRActivity, mayaQRActivity.getString(R.string.pma_label_pay), strMMessage);
                return;
            }
            return;
        }
        if (!((com.paymaya.data.preference.a) this.e).e().isQrWithCheckoutFlowEnabled()) {
            MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) ((Ma.b) this.c.get());
            mayaQRScannerFragment.getClass();
            Na.i iVar2 = mayaQRScannerFragment.f13610k0;
            if (iVar2 != null) {
                MayaQRActivity mayaQRActivity2 = (MayaQRActivity) iVar2;
                mayaQRActivity2.n1();
                B5.i.m(mayaQRActivity2, qRMerchant, true);
                return;
            }
            return;
        }
        ((MayaBaseFragment) ((Ma.b) this.c.get())).D1();
        C1268k0 c1268k0 = (C1268k0) this.f;
        c1268k0.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("claim_id", qRMerchant.mPaymentId());
        } catch (JSONException unused) {
            yk.a.e();
        }
        try {
            jSONObject2.put(TtmlNode.ATTR_ID, qRMerchant.mMerchantId());
        } catch (JSONException unused2) {
            yk.a.e();
        }
        try {
            jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, qRMerchant.mName());
        } catch (JSONException unused3) {
            yk.a.e();
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("currency", qRMerchant.mAmount().mCurrency());
        } catch (JSONException unused4) {
            yk.a.e();
        }
        try {
            jSONObject3.put("value", qRMerchant.mAmount().mValue());
        } catch (JSONException unused5) {
            yk.a.e();
        }
        try {
            jSONObject.put("merchant", jSONObject2);
        } catch (JSONException unused6) {
            yk.a.e();
        }
        try {
            jSONObject.put("amount", jSONObject3);
        } catch (JSONException unused7) {
            yk.a.e();
        }
        try {
            jSONObject.put(SessionDescription.ATTR_TYPE, qRMerchant.mType());
        } catch (JSONException unused8) {
            yk.a.e();
        }
        try {
            jSONObject.put("qr_payload", qRMerchant.mQrPayload());
        } catch (JSONException unused9) {
            yk.a.e();
        }
        Ah.p<MerchantPaymentV2> pVarCreateMerchantPayment = c1268k0.c.createMerchantPayment(RequestBody.create(C1268k0.e, jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
        e(new Kh.T(i4, new Lh.d(new Lh.d(AbstractC1331a.l(pVarCreateMerchantPayment, pVarCreateMerchantPayment, zh.b.a()), new Gb.d(this, 3), 2), new G6.v(this, i4), i), new Ja.c(this, i6)).e());
    }

    public void X(QRMerchant qRMerchant) {
        if (((com.paymaya.data.preference.a) this.e).e().isMerchantPaymentAvailable()) {
            MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) ((Ma.b) this.c.get());
            mayaQRScannerFragment.getClass();
            Na.i iVar = mayaQRScannerFragment.f13610k0;
            if (iVar != null) {
                MayaQRActivity mayaQRActivity = (MayaQRActivity) iVar;
                mayaQRActivity.n1();
                B5.i.I(mayaQRActivity, qRMerchant, true);
                return;
            }
            return;
        }
        String strMMessage = ((com.paymaya.data.preference.a) this.e).e().mMaintenanceConfig().mServiceAvailabilityConfig().mMerchantPaymentAvailability().mMessage();
        Ma.b bVar = (Ma.b) this.c.get();
        kotlin.jvm.internal.j.d(strMMessage);
        Na.i iVar2 = ((MayaQRScannerFragment) bVar).f13610k0;
        if (iVar2 != null) {
            MayaQRActivity mayaQRActivity2 = (MayaQRActivity) iVar2;
            mayaQRActivity2.n1();
            B5.i.U(mayaQRActivity2, mayaQRActivity2.getString(R.string.pma_label_pay), strMMessage);
        }
    }

    public void Y(QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest) {
        int i = 5;
        int i4 = 2;
        int i6 = 0;
        int i10 = 1;
        if (!((com.paymaya.data.preference.a) this.e).e().isMerchantPaymentAvailable()) {
            String strMMessage = ((com.paymaya.data.preference.a) this.e).e().mMaintenanceConfig().mServiceAvailabilityConfig().mMerchantPaymentAvailability().mMessage();
            String strAnalyticsEventQRType = qRPHMerchantPaymentRequest.analyticsEventQRType();
            String type = qRPHMerchantPaymentRequest.getType();
            O(this, strMMessage, strAnalyticsEventQRType, type == null ? "" : type, qRPHMerchantPaymentRequest.getMerchantDetails().getName(), 1);
            Ma.b bVar = (Ma.b) this.c.get();
            kotlin.jvm.internal.j.d(strMMessage);
            Na.i iVar = ((MayaQRScannerFragment) bVar).f13610k0;
            if (iVar != null) {
                MayaQRActivity mayaQRActivity = (MayaQRActivity) iVar;
                mayaQRActivity.n1();
                B5.i.U(mayaQRActivity, mayaQRActivity.getString(R.string.pma_label_pay), strMMessage);
                return;
            }
            return;
        }
        if (((com.paymaya.data.preference.a) this.e).e().isQrWithCheckoutFlowEnabled() && qRPHMerchantPaymentRequest.isDynamicPointOfInitiation()) {
            ((MayaBaseFragment) ((Ma.b) this.c.get())).D1();
            Ah.p pVarB = ((C1268k0) this.f).b(qRPHMerchantPaymentRequest);
            e(new Kh.T(i, new Lh.d(new Lh.d(AbstractC1331a.l(pVarB, pVarB, zh.b.a()), new Ja.e(this, i10), i4), new f(23, this, qRPHMerchantPaymentRequest), i6), new Ja.c(this, i6)).e());
            return;
        }
        String qrType = qRPHMerchantPaymentRequest.analyticsEventQRType();
        String type2 = qRPHMerchantPaymentRequest.getType();
        String str = type2 != null ? type2 : "";
        String merchantName = qRPHMerchantPaymentRequest.getMerchantDetails().getName();
        kotlin.jvm.internal.j.g(qrType, "qrType");
        kotlin.jvm.internal.j.g(merchantName, "merchantName");
        if (((com.paymaya.data.preference.a) this.e).e().isQREventsV2Enabled()) {
            J(M.i(new Pair(EnumC1212a.QR_TYPE, qrType), new Pair(EnumC1212a.QR_CLASS, "P2M"), new Pair(EnumC1212a.MERCHANT_TYPE, str), new Pair(EnumC1212a.MERCHANT_NAME, merchantName), new Pair(EnumC1212a.PAGE, "Pay with QR")));
        }
        MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) ((Ma.b) this.c.get());
        mayaQRScannerFragment.getClass();
        Na.i iVar2 = mayaQRScannerFragment.f13610k0;
        if (iVar2 != null) {
            MayaQRActivity mayaQRActivity2 = (MayaQRActivity) iVar2;
            mayaQRActivity2.n1();
            B5.i.P(mayaQRActivity2, qRPHMerchantPaymentRequest, true);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void Z(UserActivity userActivity, PurchasedTicket purchasedTicket) {
        String strMType = userActivity != null ? userActivity.mType() : null;
        if (strMType != null) {
            switch (strMType.hashCode()) {
                case -2031037397:
                    if (strMType.equals("System Alert")) {
                        MayaTransactionsActivity mayaTransactionsActivity = (MayaTransactionsActivity) ((B7.b) this.c.get());
                        mayaTransactionsActivity.getClass();
                        kotlin.jvm.internal.j.g(userActivity, "userActivity");
                        boolean z4 = mayaTransactionsActivity.f12154o;
                        MayaUserActivitySystemAlertFragment mayaUserActivitySystemAlertFragment = new MayaUserActivitySystemAlertFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("user_activity", userActivity);
                        bundle.putBoolean("is_from_dashboard", z4);
                        mayaUserActivitySystemAlertFragment.setArguments(bundle);
                        mayaTransactionsActivity.W1(mayaUserActivitySystemAlertFragment);
                        return;
                    }
                    break;
                case -2000393993:
                    if (strMType.equals("Bank Pull Funds")) {
                        MayaTransactionsActivity mayaTransactionsActivity2 = (MayaTransactionsActivity) ((B7.b) this.c.get());
                        mayaTransactionsActivity2.getClass();
                        kotlin.jvm.internal.j.g(userActivity, "userActivity");
                        boolean z5 = mayaTransactionsActivity2.f12154o;
                        MayaUserActivityBankPullFundsFragment mayaUserActivityBankPullFundsFragment = new MayaUserActivityBankPullFundsFragment();
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("user_activity", userActivity);
                        bundle2.putBoolean("is_from_dashboard", z5);
                        mayaUserActivityBankPullFundsFragment.setArguments(bundle2);
                        mayaTransactionsActivity2.W1(mayaUserActivityBankPullFundsFragment);
                        return;
                    }
                    break;
                case -1238034679:
                    if (strMType.equals(RtspHeaders.TRANSPORT)) {
                        MayaTransactionsActivity mayaTransactionsActivity3 = (MayaTransactionsActivity) ((B7.b) this.c.get());
                        mayaTransactionsActivity3.getClass();
                        kotlin.jvm.internal.j.g(userActivity, "userActivity");
                        boolean z8 = mayaTransactionsActivity3.f12154o;
                        MayaUserActivityTransportFragment mayaUserActivityTransportFragment = new MayaUserActivityTransportFragment();
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("user_activity", userActivity);
                        bundle3.putParcelable("purchased_ticket", purchasedTicket);
                        bundle3.putBoolean("is_from_dashboard", z8);
                        mayaUserActivityTransportFragment.setArguments(bundle3);
                        mayaTransactionsActivity3.W1(mayaUserActivityTransportFragment);
                        return;
                    }
                    break;
                case -319474796:
                    if (strMType.equals("Pay Bills")) {
                        MayaTransactionsActivity mayaTransactionsActivity4 = (MayaTransactionsActivity) ((B7.b) this.c.get());
                        mayaTransactionsActivity4.getClass();
                        kotlin.jvm.internal.j.g(userActivity, "userActivity");
                        boolean z9 = mayaTransactionsActivity4.f12154o;
                        MayaUserActivityPayBillsFragment mayaUserActivityPayBillsFragment = new MayaUserActivityPayBillsFragment();
                        Bundle bundle4 = new Bundle();
                        bundle4.putParcelable("user_activity", userActivity);
                        bundle4.putBoolean("is_from_dashboard", z9);
                        mayaUserActivityPayBillsFragment.setArguments(bundle4);
                        mayaTransactionsActivity4.W1(mayaUserActivityPayBillsFragment);
                        return;
                    }
                    break;
                case -267776827:
                    if (strMType.equals("Money In")) {
                        MayaTransactionsActivity mayaTransactionsActivity5 = (MayaTransactionsActivity) ((B7.b) this.c.get());
                        mayaTransactionsActivity5.getClass();
                        kotlin.jvm.internal.j.g(userActivity, "userActivity");
                        boolean z10 = mayaTransactionsActivity5.f12154o;
                        MayaUserActivityMoneyInFragment mayaUserActivityMoneyInFragment = new MayaUserActivityMoneyInFragment();
                        Bundle bundle5 = new Bundle();
                        bundle5.putParcelable("user_activity", userActivity);
                        bundle5.putBoolean("is_from_dashboard", z10);
                        mayaUserActivityMoneyInFragment.setArguments(bundle5);
                        mayaTransactionsActivity5.W1(mayaUserActivityMoneyInFragment);
                        return;
                    }
                    break;
                case 87150817:
                    if (strMType.equals("Cash Out")) {
                        MayaTransactionsActivity mayaTransactionsActivity6 = (MayaTransactionsActivity) ((B7.b) this.c.get());
                        mayaTransactionsActivity6.getClass();
                        kotlin.jvm.internal.j.g(userActivity, "userActivity");
                        boolean z11 = mayaTransactionsActivity6.f12154o;
                        MayaUserActivityCashOutFragment mayaUserActivityCashOutFragment = new MayaUserActivityCashOutFragment();
                        Bundle bundle6 = new Bundle();
                        bundle6.putParcelable("user_activity", userActivity);
                        bundle6.putBoolean("is_from_dashboard", z11);
                        mayaUserActivityCashOutFragment.setArguments(bundle6);
                        mayaTransactionsActivity6.W1(mayaUserActivityCashOutFragment);
                        return;
                    }
                    break;
                case 982264360:
                    if (strMType.equals("Send Money")) {
                        MayaTransactionsActivity mayaTransactionsActivity7 = (MayaTransactionsActivity) ((B7.b) this.c.get());
                        mayaTransactionsActivity7.getClass();
                        kotlin.jvm.internal.j.g(userActivity, "userActivity");
                        boolean z12 = mayaTransactionsActivity7.f12154o;
                        MayaUserActivitySendMoneyFragment mayaUserActivitySendMoneyFragment = new MayaUserActivitySendMoneyFragment();
                        Bundle bundle7 = new Bundle();
                        bundle7.putParcelable("user_activity", userActivity);
                        bundle7.putBoolean("is_from_dashboard", z12);
                        mayaUserActivitySendMoneyFragment.setArguments(bundle7);
                        mayaTransactionsActivity7.W1(mayaUserActivitySendMoneyFragment);
                        return;
                    }
                    break;
                case 1724934051:
                    if (strMType.equals("Card Pull Funds")) {
                        MayaTransactionsActivity mayaTransactionsActivity8 = (MayaTransactionsActivity) ((B7.b) this.c.get());
                        mayaTransactionsActivity8.getClass();
                        kotlin.jvm.internal.j.g(userActivity, "userActivity");
                        boolean z13 = mayaTransactionsActivity8.f12154o;
                        MayaUserActivityCardPullFundsFragment mayaUserActivityCardPullFundsFragment = new MayaUserActivityCardPullFundsFragment();
                        Bundle bundle8 = new Bundle();
                        bundle8.putParcelable("user_activity", userActivity);
                        bundle8.putBoolean("is_from_dashboard", z13);
                        mayaUserActivityCardPullFundsFragment.setArguments(bundle8);
                        mayaTransactionsActivity8.W1(mayaUserActivityCardPullFundsFragment);
                        return;
                    }
                    break;
                case 1807968545:
                    if (strMType.equals("Purchase")) {
                        MayaTransactionsActivity mayaTransactionsActivity9 = (MayaTransactionsActivity) ((B7.b) this.c.get());
                        mayaTransactionsActivity9.getClass();
                        kotlin.jvm.internal.j.g(userActivity, "userActivity");
                        boolean z14 = mayaTransactionsActivity9.f12154o;
                        MayaUserActivityPurchaseFragment mayaUserActivityPurchaseFragment = new MayaUserActivityPurchaseFragment();
                        Bundle bundle9 = new Bundle();
                        bundle9.putParcelable("user_activity", userActivity);
                        bundle9.putBoolean("is_from_dashboard", z14);
                        mayaUserActivityPurchaseFragment.setArguments(bundle9);
                        mayaTransactionsActivity9.W1(mayaUserActivityPurchaseFragment);
                        return;
                    }
                    break;
            }
        }
        MayaTransactionsActivity mayaTransactionsActivity10 = (MayaTransactionsActivity) ((B7.b) this.c.get());
        boolean z15 = mayaTransactionsActivity10.f12154o;
        MayaUserActivityDefaultFragment mayaUserActivityDefaultFragment = new MayaUserActivityDefaultFragment();
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("user_activity", userActivity);
        bundle10.putBoolean("is_from_dashboard", z15);
        mayaUserActivityDefaultFragment.setArguments(bundle10);
        mayaTransactionsActivity10.W1(mayaUserActivityDefaultFragment);
    }

    public void a0(PayMayaError payMayaError) {
        ((MayaCreditInterstitialActivity) ((M9.b) this.c.get())).W1();
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        MayaCreditInterstitialActivity mayaCreditInterstitialActivity = (MayaCreditInterstitialActivity) ((M9.b) this.c.get());
        mayaCreditInterstitialActivity.getClass();
        E.a("MayaCreditInterstitialActivity", "showConsentErrorDialog");
        String string = mayaCreditInterstitialActivity.getString(R.string.maya_label_credit_interstitial_consent_error_message);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        mayaCreditInterstitialActivity.X1(string, new N9.c(mayaCreditInterstitialActivity, 0));
    }

    @Override // y5.e
    public void b() {
        MfaMeta mfaMetaJ1;
        int i = 5;
        int i4 = 2;
        int i6 = 0;
        y9.f fVar = ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).f12943W;
        if ((fVar != null ? ((MayaMfaActivity) fVar).f12929p : null) != null) {
            if (((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).K1() != null) {
                if (((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).K1() == null || (mfaMetaJ1 = ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).J1()) == null) {
                    return;
                }
                ((MayaBaseFragment) ((x9.c) this.c.get())).E1();
                C1270l0 c1270l0 = (C1270l0) this.e;
                c1270l0.getClass();
                Ah.p<MFAChallengeInformationV2> pVarOpenResendChallengeOtp = c1270l0.f11459b.openResendChallengeOtp(mfaMetaJ1.getChallengeId());
                e(new Kh.T(i, new Lh.d(new Lh.d(AbstractC1331a.l(pVarOpenResendChallengeOtp, pVarOpenResendChallengeOtp, zh.b.a()), new t9.f(this, i6), i4), new t9.g(this, i6), i6), new t9.e(this, i4)).e());
                return;
            }
            MfaMeta mfaMetaJ12 = ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).J1();
            if (mfaMetaJ12 != null) {
                ((MayaBaseFragment) ((x9.c) this.c.get())).E1();
                C1270l0 c1270l02 = (C1270l0) this.e;
                c1270l02.getClass();
                Ah.p<MFAChallengeInformationV2> pVarResendChallengeOtp = c1270l02.f11459b.resendChallengeOtp(mfaMetaJ12.getChallengeId());
                e(new Kh.T(i, new Lh.d(new Lh.d(AbstractC1331a.l(pVarResendChallengeOtp, pVarResendChallengeOtp, zh.b.a()), new t9.h(this, i6), i4), new t9.i(this, i6), i6), new t9.e(this, i6)).e());
            }
        }
    }

    public void b0(PayMayaError payMayaError) {
        String string;
        String strMSpiel = payMayaError.mSpiel();
        if (!payMayaError.isSessionTimeout()) {
            if (payMayaError.isNetworkError()) {
                string = ((MayaDeviceManagementMainFragment) ((Rb.h) this.c.get())).getString(R.string.maya_label_device_management_error_no_internet_connection);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment = (MayaDeviceManagementMainFragment) ((Rb.h) this.c.get());
                mayaDeviceManagementMainFragment.R1();
                String string2 = mayaDeviceManagementMainFragment.getString(R.string.maya_label_device_management_error_no_internet_connection);
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                MayaBaseLoadingFragment.N1(mayaDeviceManagementMainFragment, TypedValues.TransitionType.TYPE_DURATION, string2, mayaDeviceManagementMainFragment.getString(R.string.maya_label_that_didnt_load_right), new Sb.r(mayaDeviceManagementMainFragment, 1), 8);
            } else if (payMayaError.isDefault()) {
                string = ((MayaDeviceManagementMainFragment) ((Rb.h) this.c.get())).getString(R.string.maya_label_connection_issue);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment2 = (MayaDeviceManagementMainFragment) ((Rb.h) this.c.get());
                mayaDeviceManagementMainFragment2.R1();
                String string3 = mayaDeviceManagementMainFragment2.getString(R.string.maya_label_connection_issue);
                kotlin.jvm.internal.j.f(string3, "getString(...)");
                MayaBaseLoadingFragment.N1(mayaDeviceManagementMainFragment2, 200, string3, null, new Sb.r(mayaDeviceManagementMainFragment2, 2), 28);
            } else {
                MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment3 = (MayaDeviceManagementMainFragment) ((Rb.h) this.c.get());
                mayaDeviceManagementMainFragment3.R1();
                MayaBaseLoadingFragment.N1(mayaDeviceManagementMainFragment3, 200, strMSpiel, null, new Sb.r(mayaDeviceManagementMainFragment3, 3), 28);
            }
            strMSpiel = string;
        }
        y5.s sVar = (Rb.h) this.c.get();
        C1219h c1219hH = AbstractC2329d.h(12);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put(StateEvent.Name.ERROR_CODE, String.valueOf(payMayaError.mErrorCode()));
        c1219hH.j.put("error_message", strMSpiel);
        ((MayaBaseFragment) sVar).z1(c1219hH);
    }

    @Override // y5.e
    public void c() {
        MfaMeta mfaMetaJ1;
        int i = 5;
        int i4 = 2;
        int i6 = 0;
        int i10 = 1;
        ((MayaBaseFragment) ((x9.c) this.c.get())).E1();
        if (((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).K1() != null) {
            if (((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).K1() == null || (mfaMetaJ1 = ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).J1()) == null) {
                return;
            }
            C1270l0 c1270l0 = (C1270l0) this.e;
            MayaProfileInputLayout mayaProfileInputLayout = ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).f12944X;
            if (mayaProfileInputLayout == null) {
                kotlin.jvm.internal.j.n("mOtpInput");
                throw null;
            }
            String otp = C2576A.b0(String.valueOf(mayaProfileInputLayout.getInputEditText().getText())).toString();
            c1270l0.getClass();
            kotlin.jvm.internal.j.g(otp, "otp");
            Ah.p<MFAChallengeVerificationResultV2> pVarOpenVerifyChallenge = c1270l0.f11459b.openVerifyChallenge(mfaMetaJ1.getChallengeId(), new OpenMfaVerifyRequestOtp("OTP", new OpenMfaVerifyRequestOtpParams(otp)));
            e(new Kh.T(i, new Lh.d(new Lh.d(AbstractC1331a.l(pVarOpenVerifyChallenge, pVarOpenVerifyChallenge, zh.b.a()), new t9.f(this, i10), i4), new t9.g(this, i10), i6), new t9.e(this, i10)).e());
            return;
        }
        MfaMeta mfaMetaJ12 = ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).J1();
        if (mfaMetaJ12 != null) {
            C1270l0 c1270l02 = (C1270l0) this.e;
            MayaProfileInputLayout mayaProfileInputLayout2 = ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).f12944X;
            if (mayaProfileInputLayout2 == null) {
                kotlin.jvm.internal.j.n("mOtpInput");
                throw null;
            }
            String otp2 = C2576A.b0(String.valueOf(mayaProfileInputLayout2.getInputEditText().getText())).toString();
            c1270l02.getClass();
            kotlin.jvm.internal.j.g(otp2, "otp");
            Ah.p<MFAChallengeVerificationResultV2> pVarVerifyChallenge = c1270l02.f11459b.verifyChallenge(mfaMetaJ12.getChallengeId(), mfaMetaJ12);
            e(new Kh.T(i, new Lh.d(new Lh.d(AbstractC1331a.l(pVarVerifyChallenge, pVarVerifyChallenge, zh.b.a()), new t9.h(this, i10), i4), new t9.i(this, i10), i6), new t9.e(this, 3)).e());
        }
    }

    public void c0(DeviceInformationResponse deviceInfoResponse) {
        Object next;
        kotlin.jvm.internal.j.g(deviceInfoResponse, "deviceInfoResponse");
        String strE = S5.c.e((S5.c) this.e, A5.g.f163g);
        ((MayaDeviceManagementMainFragment) ((Rb.h) this.c.get())).S1();
        MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment = (MayaDeviceManagementMainFragment) ((Rb.h) this.c.get());
        TextView textView = mayaDeviceManagementMainFragment.f13971r0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewDescription");
            throw null;
        }
        textView.setText(mayaDeviceManagementMainFragment.getString(R.string.maya_label_device_management_manage_devices_description, strE));
        List<DeviceInformation> devices = deviceInfoResponse.getDevices();
        kotlin.jvm.internal.j.g(devices, "devices");
        ((MayaBaseFragment) ((Rb.h) this.c.get())).z1(AbstractC2329d.h(14));
        List<DeviceInformation> list = devices;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((DeviceInformation) next).isActive()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        DeviceInformation deviceInformation = (DeviceInformation) next;
        if (devices.isEmpty() || deviceInformation == null) {
            MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment2 = (MayaDeviceManagementMainFragment) ((Rb.h) this.c.get());
            mayaDeviceManagementMainFragment2.R1();
            MayaBaseLoadingFragment.N1(mayaDeviceManagementMainFragment2, 800, null, null, null, 30);
            return;
        }
        ((MayaDeviceManagementMainFragment) ((Rb.h) this.c.get())).S1();
        MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment3 = (MayaDeviceManagementMainFragment) ((Rb.h) this.c.get());
        mayaDeviceManagementMainFragment3.getClass();
        TextView textView2 = mayaDeviceManagementMainFragment3.f13973v0;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewActiveDeviceName");
            throw null;
        }
        textView2.setText(deviceInformation.getModelName());
        ConstraintLayout constraintLayout = mayaDeviceManagementMainFragment3.t0;
        if (constraintLayout == null) {
            kotlin.jvm.internal.j.n("mViewActiveDevice");
            throw null;
        }
        constraintLayout.setOnClickListener(new Ad.a(24, mayaDeviceManagementMainFragment3, deviceInformation));
        String platform = deviceInformation.getPlatformLowercase();
        kotlin.jvm.internal.j.g(platform, "platform");
        if (platform.equals("android")) {
            MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment4 = (MayaDeviceManagementMainFragment) ((Rb.h) this.c.get());
            TextView textView3 = mayaDeviceManagementMainFragment4.u0;
            if (textView3 == null) {
                kotlin.jvm.internal.j.n("mTextViewActiveDeviceIcon");
                throw null;
            }
            textView3.setText(mayaDeviceManagementMainFragment4.getString(R.string.maya_label_device_management_platform_android));
        } else if (platform.equals(DeviceInformation.PLATFORM_IOS)) {
            MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment5 = (MayaDeviceManagementMainFragment) ((Rb.h) this.c.get());
            TextView textView4 = mayaDeviceManagementMainFragment5.u0;
            if (textView4 == null) {
                kotlin.jvm.internal.j.n("mTextViewActiveDeviceIcon");
                throw null;
            }
            textView4.setText(mayaDeviceManagementMainFragment5.getString(R.string.maya_label_device_management_platform_ios));
        } else {
            MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment6 = (MayaDeviceManagementMainFragment) ((Rb.h) this.c.get());
            TextView textView5 = mayaDeviceManagementMainFragment6.u0;
            if (textView5 == null) {
                kotlin.jvm.internal.j.n("mTextViewActiveDeviceIcon");
                throw null;
            }
            textView5.setText(mayaDeviceManagementMainFragment6.getString(R.string.maya_label_device_management_platform_unknown));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((DeviceInformation) obj).isActive()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment7 = (MayaDeviceManagementMainFragment) ((Rb.h) this.c.get());
            TextView textView6 = mayaDeviceManagementMainFragment7.w0;
            if (textView6 == null) {
                kotlin.jvm.internal.j.n("mTextViewLoggedOutDevicesTitle");
                throw null;
            }
            textView6.setVisibility(8);
            RecyclerView recyclerView = mayaDeviceManagementMainFragment7.f13974x0;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.j.n("mRecyclerViewDevices");
                throw null;
            }
        }
        MayaDeviceManagementMainFragment mayaDeviceManagementMainFragment8 = (MayaDeviceManagementMainFragment) ((Rb.h) this.c.get());
        mayaDeviceManagementMainFragment8.getClass();
        Ob.a aVar = mayaDeviceManagementMainFragment8.f13964A0;
        if (aVar != null) {
            ArrayList oldList = aVar.f4789b;
            kotlin.jvm.internal.j.g(oldList, "oldList");
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Ub.a(oldList, arrayList));
            kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
            oldList.clear();
            oldList.addAll(arrayList);
            diffResultCalculateDiff.dispatchUpdatesTo(aVar);
        }
    }

    @Override // y5.e
    public long d() {
        return ((com.paymaya.data.preference.a) this.f).e().mResendCodeCountdown();
    }

    public void d0(PayMayaError payMayaError) {
        y5.s sVar = (Ma.b) this.c.get();
        C1219h c1219hH = AbstractC2329d.h(12);
        c1219hH.t(EnumC1217f.CREATE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put(Constants.REASON, payMayaError.mSpiel());
        c1219hH.i();
        ((MayaBaseFragment) sVar).A1(c1219hH);
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) ((Ma.b) this.c.get());
        mayaQRScannerFragment.getClass();
        Na.i iVar = mayaQRScannerFragment.f13610k0;
        if (iVar != null) {
            ((MayaQRActivity) iVar).a2(mayaQRScannerFragment.getString(R.string.pma_toast_error_title_merchant_payment_error), payMayaError, new Gc.h(mayaQRScannerFragment, 20));
        }
    }

    public void e0(MerchantPaymentV2 merchantPaymentV2) {
        y5.s sVar = (Ma.b) this.c.get();
        C1219h c1219hH = AbstractC2329d.h(14);
        c1219hH.t(EnumC1217f.CREATE);
        c1219hH.i();
        ((MayaBaseFragment) sVar).A1(c1219hH);
        if (merchantPaymentV2 != null) {
            Ma.b bVar = (Ma.b) this.c.get();
            String merchantPaymentId = merchantPaymentV2.getId();
            MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) bVar;
            mayaQRScannerFragment.getClass();
            kotlin.jvm.internal.j.g(merchantPaymentId, "merchantPaymentId");
            Na.i iVar = mayaQRScannerFragment.f13610k0;
            if (iVar != null) {
                ((MayaQRActivity) iVar).f13572p = merchantPaymentId;
            }
            Ma.b bVar2 = (Ma.b) this.c.get();
            String paymentId = merchantPaymentV2.getPaymentDetails().getPaymentId();
            MayaQRScannerFragment mayaQRScannerFragment2 = (MayaQRScannerFragment) bVar2;
            mayaQRScannerFragment2.getClass();
            kotlin.jvm.internal.j.g(paymentId, "paymentId");
            Na.i iVar2 = mayaQRScannerFragment2.f13610k0;
            if (iVar2 != null) {
                ((MayaQRActivity) iVar2).Z1(paymentId);
            }
        }
    }

    public void f0(PayMayaError payMayaError) {
        y9.f fVar;
        int iMErrorCode = payMayaError.mErrorCode();
        String str = "";
        if (iMErrorCode == 30100) {
            ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).L1(Boolean.TRUE);
        } else if (iMErrorCode == -340) {
            MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment = (MayaMultiTypeOtpFragment) ((x9.c) this.c.get());
            mayaMultiTypeOtpFragment.getClass();
            y9.f fVar2 = mayaMultiTypeOtpFragment.f12943W;
            if (fVar2 != null) {
                ((MayaMfaActivity) fVar2).i2(2131231241, mayaMultiTypeOtpFragment.getString(R.string.maya_label_something_went_wrong_title), payMayaError.mSpiel(), new y9.e(mayaMultiTypeOtpFragment, 4));
            }
            y9.f fVar3 = mayaMultiTypeOtpFragment.f12943W;
            if (fVar3 != null) {
                String strS = AbstractC1213b.s(11);
                kotlin.jvm.internal.j.f(strS, "viewed(...)");
                Pair pair = new Pair(EnumC1212a.SCREEN_NAME, "Max resend attempts reached (Dialog)");
                EnumC1212a enumC1212a = EnumC1212a.CHALLENGE_ID;
                MfaMeta mfaMetaJ1 = mayaMultiTypeOtpFragment.J1();
                String challengeId = mfaMetaJ1 != null ? mfaMetaJ1.getChallengeId() : null;
                if (challengeId == null) {
                    challengeId = "";
                }
                ((MayaMfaActivity) fVar3).f2(strS, "Enter the OTP", M.h(pair, new Pair(enumC1212a, challengeId)));
            }
        } else if (iMErrorCode == -329) {
            ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).M1();
            str = "Challenge ID expired";
        } else {
            ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).L1(Boolean.FALSE);
        }
        if (str.length() <= 0 || (fVar = ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).f12943W) == null) {
            return;
        }
        String strF = AbstractC1213b.f(15);
        kotlin.jvm.internal.j.f(strF, "failure(...)");
        ((MayaMfaActivity) fVar).b2(strF, str);
    }

    public void g0(PayMayaError payMayaError) {
        String str;
        y9.f fVar;
        int iMErrorCode = payMayaError.mErrorCode();
        str = "";
        if (iMErrorCode == -340) {
            MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment = (MayaMultiTypeOtpFragment) ((x9.c) this.c.get());
            y5.k kVar = mayaMultiTypeOtpFragment.f12949c0;
            if (kVar != null) {
                kVar.cancel();
            }
            MayaProfileInputLayout mayaProfileInputLayout = mayaMultiTypeOtpFragment.f12944X;
            if (mayaProfileInputLayout == null) {
                kotlin.jvm.internal.j.n("mOtpInput");
                throw null;
            }
            mayaProfileInputLayout.getInputEditText().setEnabled(false);
            Button button = mayaMultiTypeOtpFragment.f12947a0;
            if (button == null) {
                kotlin.jvm.internal.j.n("mVerifyButton");
                throw null;
            }
            button.setEnabled(false);
            y9.f fVar2 = mayaMultiTypeOtpFragment.f12943W;
            if (fVar2 != null) {
                String string = mayaMultiTypeOtpFragment.getString(R.string.maya_label_otp_fallback_title);
                String string2 = mayaMultiTypeOtpFragment.getString(R.string.maya_label_otp_error_limit_reached);
                String string3 = mayaMultiTypeOtpFragment.getString(R.string.maya_label_got_it);
                kotlin.jvm.internal.j.f(string3, "getString(...)");
                ((MayaMfaActivity) fVar2).h2(2131231347, string, string2, string3, new y9.e(mayaMultiTypeOtpFragment, 3));
            }
            y9.f fVar3 = mayaMultiTypeOtpFragment.f12943W;
            if (fVar3 != null) {
                String strS = AbstractC1213b.s(10);
                kotlin.jvm.internal.j.f(strS, "viewed(...)");
                Pair pair = new Pair(EnumC1212a.SCREEN_NAME, "Max OTP attempts reached (Dialog)");
                EnumC1212a enumC1212a = EnumC1212a.CHALLENGE_ID;
                MfaMeta mfaMetaJ1 = mayaMultiTypeOtpFragment.J1();
                String challengeId = mfaMetaJ1 != null ? mfaMetaJ1.getChallengeId() : null;
                ((MayaMfaActivity) fVar3).f2(strS, "Enter the OTP", M.h(pair, new Pair(enumC1212a, challengeId != null ? challengeId : "")));
            }
            str = "Max OTP attempts reached";
        } else if (iMErrorCode == -332) {
            MayaMultiTypeOtpFragment mayaMultiTypeOtpFragment2 = (MayaMultiTypeOtpFragment) ((x9.c) this.c.get());
            String string4 = mayaMultiTypeOtpFragment2.getString(R.string.maya_label_otp_error_invalid);
            kotlin.jvm.internal.j.f(string4, "getString(...)");
            TextView textView = mayaMultiTypeOtpFragment2.f12945Y;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mOtpErrorTextView");
                throw null;
            }
            textView.setText(string4);
            TextView textView2 = mayaMultiTypeOtpFragment2.f12945Y;
            if (textView2 == null) {
                kotlin.jvm.internal.j.n("mOtpErrorTextView");
                throw null;
            }
            textView2.setVisibility(0);
            str = "Invalid OTP";
        } else if (iMErrorCode == 30100) {
            ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).L1(Boolean.TRUE);
        } else if (iMErrorCode == -329) {
            ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).M1();
            str = "Challenge ID expired";
        } else {
            ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).L1(Boolean.FALSE);
        }
        if (str.length() <= 0 || (fVar = ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).f12943W) == null) {
            return;
        }
        String strF = AbstractC1213b.f(15);
        kotlin.jvm.internal.j.f(strF, "failure(...)");
        ((MayaMfaActivity) fVar).b2(strF, str);
    }

    @Override // y5.AbstractC2509a
    public void h(Object obj) {
        Intent intent;
        Intent intent2;
        switch (this.f219d) {
            case 12:
                InterfaceC0927c view = (InterfaceC0927c) obj;
                kotlin.jvm.internal.j.g(view, "view");
                super.h(view);
                W4.b bVar = new W4.b(this, 2);
                ((A5.m) this.f).getClass();
                A5.m.c(bVar);
                MayaWelcomeActivity mayaWelcomeActivity = (MayaWelcomeActivity) ((InterfaceC0927c) this.c.get());
                mayaWelcomeActivity.getClass();
                e(E1.c.r(new Ze.c(mayaWelcomeActivity).b("android.permission.RECEIVE_SMS")).e(zh.b.a()).f());
                break;
            case 17:
                s8.b view2 = (s8.b) obj;
                kotlin.jvm.internal.j.g(view2, "view");
                super.h(view2);
                FragmentActivity activity = ((MayaInboxFragment) ((s8.b) this.c.get())).getActivity();
                if (39 == C.w((activity == null || (intent2 = activity.getIntent()) == null) ? null : intent2.getDataString())) {
                    MayaInboxFragment mayaInboxFragment = (MayaInboxFragment) ((s8.b) this.c.get());
                    C1219h c1219hM1 = mayaInboxFragment.m1();
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    c1219hM1.j.put("from_deep_link", "true");
                    FragmentActivity activity2 = mayaInboxFragment.getActivity();
                    if (activity2 != null && (intent = activity2.getIntent()) != null) {
                        intent.setData(null);
                        break;
                    }
                }
                break;
            default:
                super.h(obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y5.AbstractC2509a
    public void j() {
        ArrayList<ProductProviderField> arrayList;
        String str;
        int i;
        String tencentToken;
        MfaMeta mfaMetaJ1;
        int i4 = 7;
        int i6 = 21;
        int i10 = 17;
        String str2 = null;
        int i11 = 1;
        int i12 = 2;
        int i13 = 0;
        switch (this.f219d) {
            case 0:
                super.j();
                if (S5.c.b((S5.c) this.e, A5.b.f144x)) {
                    MayaServicesV2Fragment mayaServicesV2Fragment = (MayaServicesV2Fragment) ((F7.b) this.c.get());
                    O0 o02 = mayaServicesV2Fragment.f12180U;
                    kotlin.jvm.internal.j.d(o02);
                    Toolbar toolbar = (Toolbar) ((C0491z) o02.f3835w).e;
                    toolbar.setVisibility(0);
                    toolbar.setNavigationIcon(R.drawable.maya_ic_close);
                    toolbar.setNavigationOnClickListener(new G7.o(mayaServicesV2Fragment, i4));
                    Space space = mayaServicesV2Fragment.f12185Z;
                    if (space == null) {
                        kotlin.jvm.internal.j.n("mSpaceServicesTitleTop");
                        throw null;
                    }
                    space.setVisibility(8);
                    TextView textView = mayaServicesV2Fragment.f12181V;
                    if (textView == null) {
                        kotlin.jvm.internal.j.n("mToolbarTitleTextView");
                        throw null;
                    }
                    textView.setAlpha(0.0f);
                    TextView textView2 = mayaServicesV2Fragment.f12181V;
                    if (textView2 == null) {
                        kotlin.jvm.internal.j.n("mToolbarTitleTextView");
                        throw null;
                    }
                    textView2.setText(mayaServicesV2Fragment.getString(R.string.maya_label_services));
                    NestedScrollView nestedScrollView = mayaServicesV2Fragment.f12183X;
                    if (nestedScrollView == null) {
                        kotlin.jvm.internal.j.n("mScrollViewContainer");
                        throw null;
                    }
                    TextView textView3 = mayaServicesV2Fragment.f12184Y;
                    if (textView3 == null) {
                        kotlin.jvm.internal.j.n("mTextViewServicesTitle");
                        throw null;
                    }
                    G5.C.a(nestedScrollView, textView3, new Ag.j(mayaServicesV2Fragment, i12));
                } else {
                    Space space2 = ((MayaServicesV2Fragment) ((F7.b) this.c.get())).f12185Z;
                    if (space2 == null) {
                        kotlin.jvm.internal.j.n("mSpaceServicesTitleTop");
                        throw null;
                    }
                    space2.setVisibility(0);
                }
                if (S5.c.b((S5.c) this.e, A5.b.f150z1)) {
                    Group group = ((MayaServicesV2Fragment) ((F7.b) this.c.get())).f12188c0;
                    if (group == null) {
                        kotlin.jvm.internal.j.n("mGroupMessages");
                        throw null;
                    }
                    group.setVisibility(0);
                } else {
                    Group group2 = ((MayaServicesV2Fragment) ((F7.b) this.c.get())).f12188c0;
                    if (group2 == null) {
                        kotlin.jvm.internal.j.n("mGroupMessages");
                        throw null;
                    }
                    group2.setVisibility(8);
                }
                MayaServicesV2Fragment mayaServicesV2Fragment2 = (MayaServicesV2Fragment) ((F7.b) this.c.get());
                Context contextRequireContext = mayaServicesV2Fragment2.requireContext();
                kotlin.jvm.internal.j.f(contextRequireContext, "requireContext(...)");
                D7.f fVar = new D7.f(contextRequireContext, mayaServicesV2Fragment2.t1(), mayaServicesV2Fragment2);
                fVar.f998g = S5.c.b(mayaServicesV2Fragment2.q1(), A5.b.f125o1);
                mayaServicesV2Fragment2.f12198n0 = fVar;
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mayaServicesV2Fragment2.getActivity(), 1, false);
                RecyclerView recyclerView = mayaServicesV2Fragment2.f12182W;
                if (recyclerView == null) {
                    kotlin.jvm.internal.j.n("mRecyclerView");
                    throw null;
                }
                recyclerView.setAdapter(mayaServicesV2Fragment2.f12198n0);
                RecyclerView recyclerView2 = mayaServicesV2Fragment2.f12182W;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.j.n("mRecyclerView");
                    throw null;
                }
                recyclerView2.setLayoutManager(linearLayoutManager);
                D();
                Bundle arguments = ((MayaServicesV2Fragment) ((F7.b) this.c.get())).getArguments();
                if (kotlin.jvm.internal.j.b(arguments != null ? arguments.getString("category") : null, "more_actions")) {
                    MayaServicesV2Fragment mayaServicesV2Fragment3 = (MayaServicesV2Fragment) ((F7.b) this.c.get());
                    O0 o03 = mayaServicesV2Fragment3.f12180U;
                    kotlin.jvm.internal.j.d(o03);
                    o03.f3821b.postDelayed(new E8.l(mayaServicesV2Fragment3, i12), 200L);
                } else {
                    F7.b bVar = (F7.b) this.c.get();
                    Bundle arguments2 = ((MayaServicesV2Fragment) ((F7.b) this.c.get())).getArguments();
                    ((MayaServicesV2Fragment) bVar).I1(arguments2 != null ? arguments2.getString("category") : null);
                }
                if (S5.c.b((S5.c) this.e, A5.b.f87X0)) {
                    Group group3 = ((MayaServicesV2Fragment) ((F7.b) this.c.get())).f12195j0;
                    if (group3 == null) {
                        kotlin.jvm.internal.j.n("mConstraintGroupSecurityCenter");
                        throw null;
                    }
                    group3.setVisibility(0);
                } else {
                    Group group4 = ((MayaServicesV2Fragment) ((F7.b) this.c.get())).f12195j0;
                    if (group4 == null) {
                        kotlin.jvm.internal.j.n("mConstraintGroupSecurityCenter");
                        throw null;
                    }
                    group4.setVisibility(8);
                }
                if (S5.c.b((S5.c) this.e, A5.b.f108h1)) {
                    ConstraintLayout constraintLayout = ((MayaServicesV2Fragment) ((F7.b) this.c.get())).f12193h0;
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(0);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mContainerAdsInternalOnly");
                        throw null;
                    }
                }
                return;
            case 1:
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 16:
            default:
                super.j();
                return;
            case 2:
                super.j();
                if (((com.paymaya.data.preference.a) this.e).e().isTransactionWalletLimitWalletSettingsEnabled()) {
                    AppCompatTextView appCompatTextView = ((MayaAutoCashinWalletSettingsFragment) ((K6.a) this.c.get())).f11615V;
                    if (appCompatTextView == null) {
                        kotlin.jvm.internal.j.n("mTextViewTransactionLimit");
                        throw null;
                    }
                    appCompatTextView.setVisibility(0);
                } else {
                    AppCompatTextView appCompatTextView2 = ((MayaAutoCashinWalletSettingsFragment) ((K6.a) this.c.get())).f11615V;
                    if (appCompatTextView2 == null) {
                        kotlin.jvm.internal.j.n("mTextViewTransactionLimit");
                        throw null;
                    }
                    appCompatTextView2.setVisibility(8);
                }
                if (((com.paymaya.data.preference.a) this.e).e().isAutoCashinWalletSettingsEnabled()) {
                    AppCompatTextView appCompatTextView3 = ((MayaAutoCashinWalletSettingsFragment) ((K6.a) this.c.get())).f11616W;
                    if (appCompatTextView3 == null) {
                        kotlin.jvm.internal.j.n("mTextViewAutoCashin");
                        throw null;
                    }
                    appCompatTextView3.setVisibility(0);
                } else {
                    AppCompatTextView appCompatTextView4 = ((MayaAutoCashinWalletSettingsFragment) ((K6.a) this.c.get())).f11616W;
                    if (appCompatTextView4 == null) {
                        kotlin.jvm.internal.j.n("mTextViewAutoCashin");
                        throw null;
                    }
                    appCompatTextView4.setVisibility(8);
                }
                if (((com.paymaya.data.preference.a) this.e).e().isInstaFillWalletSettingsEnabled()) {
                    AppCompatTextView appCompatTextView5 = ((MayaAutoCashinWalletSettingsFragment) ((K6.a) this.c.get())).f11617X;
                    if (appCompatTextView5 == null) {
                        kotlin.jvm.internal.j.n("mTextViewInstaFill");
                        throw null;
                    }
                    appCompatTextView5.setVisibility(0);
                } else {
                    AppCompatTextView appCompatTextView6 = ((MayaAutoCashinWalletSettingsFragment) ((K6.a) this.c.get())).f11617X;
                    if (appCompatTextView6 == null) {
                        kotlin.jvm.internal.j.n("mTextViewInstaFill");
                        throw null;
                    }
                    appCompatTextView6.setVisibility(8);
                }
                MayaAutoCashinWalletSettingsFragment mayaAutoCashinWalletSettingsFragment = (MayaAutoCashinWalletSettingsFragment) ((K6.a) this.c.get());
                C1220i c1220iO1 = mayaAutoCashinWalletSettingsFragment.o1();
                FragmentActivity activity = mayaAutoCashinWalletSettingsFragment.getActivity();
                C1219h c1219h = new C1219h();
                c1219h.p(EnumC1215d.WALLET);
                AbstractC1414e.m(c1219h, EnumC1216e.OPTIONS_SCREEN, 2);
                c1220iO1.c(activity, c1219h);
                return;
            case 3:
                super.j();
                B();
                if (((com.paymaya.data.preference.a) this.e).e().isQRScreensUpdateEnabled()) {
                    MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) ((Ma.b) this.c.get());
                    C0441c c0441c = mayaQRScannerFragment.f13599Z;
                    if (c0441c == null) {
                        kotlin.jvm.internal.j.n("mViewScanQRHeaderDefault");
                        throw null;
                    }
                    ((ConstraintLayout) c0441c.f4066b).setVisibility(8);
                    MayaCameraHeaderQRPH mayaCameraHeaderQRPH = mayaQRScannerFragment.f13601b0;
                    if (mayaCameraHeaderQRPH == null) {
                        kotlin.jvm.internal.j.n("mViewCameraHeaderQRPH");
                        throw null;
                    }
                    mayaCameraHeaderQRPH.setVisibility(0);
                    MayaButtonWithIcon mayaButtonWithIcon = mayaQRScannerFragment.f13603d0;
                    if (mayaButtonWithIcon == null) {
                        kotlin.jvm.internal.j.n("mUploadQrButton");
                        throw null;
                    }
                    mayaButtonWithIcon.setIconDrawable(R.drawable.maya_ic_upload_qr);
                    MayaCameraHeaderQRPH mayaCameraHeaderQRPH2 = mayaQRScannerFragment.f13601b0;
                    if (mayaCameraHeaderQRPH2 != null) {
                        mayaCameraHeaderQRPH2.b(mayaQRScannerFragment.v1());
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mViewCameraHeaderQRPH");
                        throw null;
                    }
                }
                MayaQRScannerFragment mayaQRScannerFragment2 = (MayaQRScannerFragment) ((Ma.b) this.c.get());
                C0441c c0441c2 = mayaQRScannerFragment2.f13599Z;
                if (c0441c2 == null) {
                    kotlin.jvm.internal.j.n("mViewScanQRHeaderDefault");
                    throw null;
                }
                ((ConstraintLayout) c0441c2.f4066b).setVisibility(0);
                MayaCameraHeaderQRPH mayaCameraHeaderQRPH3 = mayaQRScannerFragment2.f13601b0;
                if (mayaCameraHeaderQRPH3 == null) {
                    kotlin.jvm.internal.j.n("mViewCameraHeaderQRPH");
                    throw null;
                }
                mayaCameraHeaderQRPH3.setVisibility(8);
                TextView textView4 = mayaQRScannerFragment2.f13598Y;
                if (textView4 == null) {
                    kotlin.jvm.internal.j.n("mTextViewToolbar");
                    throw null;
                }
                textView4.setVisibility(0);
                MayaButtonWithIcon mayaButtonWithIcon2 = mayaQRScannerFragment2.f13603d0;
                if (mayaButtonWithIcon2 == null) {
                    kotlin.jvm.internal.j.n("mUploadQrButton");
                    throw null;
                }
                mayaButtonWithIcon2.setIconDrawable(R.drawable.maya_ic_resources);
                MayaButtonWithIcon mayaButtonWithIcon3 = mayaQRScannerFragment2.f13604e0;
                if (mayaButtonWithIcon3 != null) {
                    mayaButtonWithIcon3.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mButtonShowMyQR");
                    throw null;
                }
            case 5:
                super.j();
                BackUpIdentity backUpIdentityA = ((C1265j) this.f).a();
                if (backUpIdentityA != null && "email".equals(backUpIdentityA.mType())) {
                    y();
                    return;
                }
                Sb.g gVar = ((MayaAccountRecoveryFragment) ((Rb.b) this.c.get())).f13923c0;
                if (gVar != null) {
                    ((MayaSettingsActivity) gVar).Y1(false);
                    return;
                }
                return;
            case 9:
                super.j();
                ((A5.m) this.f).i(((com.paymaya.data.preference.a) this.e).C());
                C0332a c0332a = new C0332a(this, 22);
                Uh.b bVar2 = X5.f.f6541d;
                if (bVar2 != null) {
                    new C0310o(new C0307l(bVar2.c(A5.k.f172d), i12), new A5.l(c0332a, i13), Eh.d.c, Eh.d.f1365b).f();
                    return;
                }
                return;
            case 11:
                super.j();
                MayaRegistrationActivity mayaRegistrationActivity = (MayaRegistrationActivity) ((InterfaceC0926b) this.c.get());
                mayaRegistrationActivity.getClass();
                AbstractC1236z.g(mayaRegistrationActivity, R.id.fragment_container, new MayaRegistrationUserFragment());
                return;
            case 14:
                super.j();
                ((MayaPayBillsSearchFragment) ((ga.g) this.c.get())).L1();
                return;
            case 15:
                super.j();
                A();
                DateTime dateTime = new DateTime(((com.paymaya.data.preference.a) this.e).f11330b.getLong("key_last_travel_qr_timestamp", 0L));
                DateTimeFormatter dateTimeFormatter = AbstractC1234x.f11248a;
                if (new Interval(DateTime.now().minusDays(1), Days.ONE).contains(dateTime)) {
                    ConstraintLayout constraintLayout2 = ((MayaTravelOperatorSelectionFragment) ((jc.c) this.c.get())).f14204q0;
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(0);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mConstraintLayoutViewSavedQRTickets");
                        throw null;
                    }
                }
                ConstraintLayout constraintLayout3 = ((MayaTravelOperatorSelectionFragment) ((jc.c) this.c.get())).f14204q0;
                if (constraintLayout3 != null) {
                    constraintLayout3.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mConstraintLayoutViewSavedQRTickets");
                    throw null;
                }
            case 17:
                super.j();
                if (((com.paymaya.data.preference.a) this.f).e().isInboxAvailable()) {
                    new Lh.d(new Lh.d(new Lh.h(((C1250b0) this.e).a(""), zh.b.a(), i13), new p8.a(this, i13), i12), new C1983a(this, 1), i13).e();
                    return;
                }
                t8.d dVar = ((MayaInboxFragment) ((s8.b) this.c.get())).f12409X;
                if (dVar != null) {
                    MayaInboxV2Activity mayaInboxV2Activity = (MayaInboxV2Activity) dVar;
                    MayaMaintenanceFragment mayaMaintenanceFragmentA0 = M2.b.a0(null, 7);
                    C1220i c1220iK1 = mayaInboxV2Activity.k1();
                    C1219h c1219hD = C1219h.d(EnumC1215d.DEFAULT);
                    c1219hD.r(EnumC1216e.MAINTENANCE_SCREEN);
                    c1219hD.n(17);
                    c1219hD.t(EnumC1217f.INBOX);
                    c1219hD.i();
                    c1220iK1.c(mayaInboxV2Activity, c1219hD);
                    AbstractC1236z.g(mayaInboxV2Activity, R.id.fragment_container, mayaMaintenanceFragmentA0);
                    return;
                }
                return;
            case 18:
                super.j();
                if (((MayaUserProfileUpdateActivity) ((InterfaceC2281b) this.c.get())).getIntent().getDataString() != null) {
                    String dataString = ((MayaUserProfileUpdateActivity) ((InterfaceC2281b) this.c.get())).getIntent().getDataString();
                    int iW = C.w(dataString);
                    if (iW == 0) {
                        return;
                    }
                    HashMap mapA = C.A(dataString);
                    this.e = (String) jk.b.m(mapA, "next", null);
                    this.f = (String) jk.b.m(mapA, "back", null);
                    switch (AbstractC2217b.c(iW)) {
                        case 86:
                            ((MayaUserProfileUpdateActivity) ((InterfaceC2281b) this.c.get())).b2();
                            return;
                        case 87:
                            ((MayaUserProfileUpdateActivity) ((InterfaceC2281b) this.c.get())).c2();
                            return;
                        case 88:
                            ((MayaUserProfileUpdateActivity) ((InterfaceC2281b) this.c.get())).a2();
                            return;
                        default:
                            return;
                    }
                }
                MayaUserProfileUpdateActivity mayaUserProfileUpdateActivity = (MayaUserProfileUpdateActivity) ((InterfaceC2281b) this.c.get());
                String stringExtra = mayaUserProfileUpdateActivity.getIntent().getStringExtra("FRAGMENT_TO_OPEN");
                if (stringExtra != null) {
                    int iHashCode = stringExtra.hashCode();
                    if (iHashCode != -1010557821) {
                        if (iHashCode != -736899) {
                            if (iHashCode == 1869692830 && stringExtra.equals("FRAGMENT_PERSONAL_INFO")) {
                                mayaUserProfileUpdateActivity.b2();
                                return;
                            }
                        } else if (stringExtra.equals("FRAGMENT_CONTACT_REFERENCE")) {
                            mayaUserProfileUpdateActivity.a2();
                            return;
                        }
                    } else if (stringExtra.equals("FRAGMENT_WORK_DETAILS")) {
                        mayaUserProfileUpdateActivity.c2();
                        return;
                    }
                }
                mayaUserProfileUpdateActivity.b2();
                return;
            case 19:
                super.j();
                o();
                return;
            case 20:
                super.j();
                yd.h hVar = (yd.h) this.c.get();
                String strMFirstName = ((Z0) this.e).a().mFirstName();
                kotlin.jvm.internal.j.f(strMFirstName, "mFirstName(...)");
                EDDIntroFragment eDDIntroFragment = (EDDIntroFragment) hVar;
                eDDIntroFragment.getClass();
                TextView textView5 = eDDIntroFragment.mNameTextView;
                if (textView5 != null) {
                    textView5.setText(eDDIntroFragment.getString(R.string.pma_label_edd_intro_hello_name, strMFirstName));
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mNameTextView");
                    throw null;
                }
            case 21:
                super.j();
                PaymentConfirmationSummary paymentConfirmationSummary = ((ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) this.c.get())).f14781S;
                if (paymentConfirmationSummary == null) {
                    kotlin.jvm.internal.j.n("mPaymentConfirmationSummary");
                    throw null;
                }
                ProductV3 targetProduct = paymentConfirmationSummary.getTargetProduct();
                String iconUrl = targetProduct.getIconUrl();
                if (iconUrl != null && !C2576A.H(iconUrl)) {
                    ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) this.c.get());
                    shopV3ConfirmationBottomSheetFragment.getClass();
                    shopV3ConfirmationBottomSheetFragment.requireContext();
                    K k8 = shopV3ConfirmationBottomSheetFragment.f14780R;
                    kotlin.jvm.internal.j.d(k8);
                    C.e0(iconUrl, (ImageView) k8.f3706s, 2131232014);
                }
                InterfaceC2347a interfaceC2347a = (InterfaceC2347a) this.c.get();
                String productName = targetProduct.getName();
                ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment2 = (ShopV3ConfirmationBottomSheetFragment) interfaceC2347a;
                shopV3ConfirmationBottomSheetFragment2.getClass();
                kotlin.jvm.internal.j.g(productName, "productName");
                K k10 = shopV3ConfirmationBottomSheetFragment2.f14780R;
                kotlin.jvm.internal.j.d(k10);
                k10.j.setText(productName);
                boolean zIsPromo = targetProduct.isPromo();
                Amount amountOriginal = targetProduct.getAmountOriginal();
                Amount amountDiscounted = targetProduct.getAmountDiscounted();
                kotlin.jvm.internal.j.g(amountOriginal, "amountOriginal");
                if (!zIsPromo || amountDiscounted == null) {
                    InterfaceC2347a interfaceC2347a2 = (InterfaceC2347a) this.c.get();
                    String currencyFormattedValue = amountOriginal.getCurrencyFormattedValue();
                    kotlin.jvm.internal.j.f(currencyFormattedValue, "getCurrencyFormattedValue(...)");
                    K k11 = ((ShopV3ConfirmationBottomSheetFragment) interfaceC2347a2).f14780R;
                    kotlin.jvm.internal.j.d(k11);
                    k11.f.setText(currencyFormattedValue);
                } else {
                    InterfaceC2347a interfaceC2347a3 = (InterfaceC2347a) this.c.get();
                    String currencyFormattedValue2 = amountDiscounted.getCurrencyFormattedValue();
                    kotlin.jvm.internal.j.f(currencyFormattedValue2, "getCurrencyFormattedValue(...)");
                    K k12 = ((ShopV3ConfirmationBottomSheetFragment) interfaceC2347a3).f14780R;
                    kotlin.jvm.internal.j.d(k12);
                    k12.f.setText(currencyFormattedValue2);
                }
                String displayedRecipient = paymentConfirmationSummary.getDisplayedRecipient();
                String targetNumber = paymentConfirmationSummary.getTargetNumber();
                K k13 = ((ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) this.c.get())).f14780R;
                kotlin.jvm.internal.j.d(k13);
                ((Group) k13.f3701n).setVisibility(8);
                K k14 = ((ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) this.c.get())).f14780R;
                kotlin.jvm.internal.j.d(k14);
                ((Group) k14.f3703p).setVisibility(8);
                if (targetNumber != null && targetNumber.length() != 0 && (targetProduct.isProductCignal() || targetProduct.isProductBeepCard())) {
                    ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment3 = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) this.c.get());
                    shopV3ConfirmationBottomSheetFragment3.getClass();
                    K k15 = shopV3ConfirmationBottomSheetFragment3.f14780R;
                    kotlin.jvm.internal.j.d(k15);
                    k15.f3697d.setText(targetNumber);
                    K k16 = ((ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) this.c.get())).f14780R;
                    kotlin.jvm.internal.j.d(k16);
                    ((Group) k16.f3703p).setVisibility(0);
                } else if (displayedRecipient != null && displayedRecipient.length() != 0) {
                    ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment4 = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) this.c.get());
                    shopV3ConfirmationBottomSheetFragment4.getClass();
                    K k17 = shopV3ConfirmationBottomSheetFragment4.f14780R;
                    kotlin.jvm.internal.j.d(k17);
                    k17.m.setText(displayedRecipient);
                    K k18 = ((ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) this.c.get())).f14780R;
                    kotlin.jvm.internal.j.d(k18);
                    ((Group) k18.f3701n).setVisibility(0);
                }
                ProductProviderDetails productProviderDetails = targetProduct.getProductProviderDetails();
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
                if (arrayList == null || arrayList.isEmpty() || dynamicFieldsCodeAndInput == null || dynamicFieldsCodeAndInput.isEmpty()) {
                    str = null;
                    i = 1;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (ProductProviderField productProviderField : arrayList) {
                        String str3 = dynamicFieldsCodeAndInput.get(productProviderField.mCode());
                        if (str3 == null) {
                            str3 = "";
                        }
                        linkedHashMap.put(productProviderField.mName(), str3);
                    }
                    ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment5 = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) this.c.get());
                    shopV3ConfirmationBottomSheetFragment5.getClass();
                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(shopV3ConfirmationBottomSheetFragment5.getContext());
                    K k19 = shopV3ConfirmationBottomSheetFragment5.f14780R;
                    kotlin.jvm.internal.j.d(k19);
                    Barrier barrier = (Barrier) k19.f3704q;
                    View view = barrier;
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str4 = (String) entry.getKey();
                        String str5 = (String) entry.getValue();
                        View viewInflate = layoutInflaterFrom.inflate(R.layout.pma_view_shop_v3_dynamic_field_label_text_view, (ViewGroup) shopV3ConfirmationBottomSheetFragment5.o1(), false);
                        kotlin.jvm.internal.j.e(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                        TextView textView6 = (TextView) viewInflate;
                        String str6 = str2;
                        textView6.setId(ViewCompat.generateViewId());
                        textView6.setText(str4);
                        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
                        layoutParams.topToBottom = view.getId();
                        K k20 = shopV3ConfirmationBottomSheetFragment5.f14780R;
                        kotlin.jvm.internal.j.d(k20);
                        layoutParams.rightToLeft = ((Guideline) k20.f3711x).getId();
                        int i14 = i11;
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = shopV3ConfirmationBottomSheetFragment5.getResources().getDimensionPixelSize(R.dimen.pma_margin_20dp);
                        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.pma_view_shop_v3_dynamic_field_value_text_view, (ViewGroup) shopV3ConfirmationBottomSheetFragment5.o1(), false);
                        kotlin.jvm.internal.j.e(viewInflate2, "null cannot be cast to non-null type android.widget.TextView");
                        TextView textView7 = (TextView) viewInflate2;
                        textView7.setId(ViewCompat.generateViewId());
                        textView7.setText(str5);
                        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, -2);
                        layoutParams2.baselineToBaseline = textView6.getId();
                        K k21 = shopV3ConfirmationBottomSheetFragment5.f14780R;
                        kotlin.jvm.internal.j.d(k21);
                        layoutParams2.leftToRight = ((Space) k21.f3710w).getId();
                        K k22 = shopV3ConfirmationBottomSheetFragment5.f14780R;
                        kotlin.jvm.internal.j.d(k22);
                        layoutParams2.rightToRight = ((Guideline) k22.f3702o).getId();
                        shopV3ConfirmationBottomSheetFragment5.o1().addView(textView6, layoutParams);
                        shopV3ConfirmationBottomSheetFragment5.o1().addView(textView7, layoutParams2);
                        str2 = str6;
                        i11 = i14;
                        view = textView7;
                    }
                    str = str2;
                    i = i11;
                    K k23 = shopV3ConfirmationBottomSheetFragment5.f14780R;
                    kotlin.jvm.internal.j.d(k23);
                    ViewGroup.LayoutParams layoutParams3 = k23.f3700l.getLayoutParams();
                    kotlin.jvm.internal.j.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                    layoutParams4.topToBottom = view.getId();
                    K k24 = shopV3ConfirmationBottomSheetFragment5.f14780R;
                    kotlin.jvm.internal.j.d(k24);
                    k24.f3700l.setLayoutParams(layoutParams4);
                }
                FundSource appliedFundSource = paymentConfirmationSummary.getAppliedFundSource();
                AccountBalance appliedAccountBalance = paymentConfirmationSummary.getAppliedAccountBalance();
                Amount amountMAvailableBalance = appliedAccountBalance != null ? appliedAccountBalance.mAvailableBalance() : str;
                String strMName = appliedFundSource != null ? appliedFundSource.mName() : str;
                if (strMName != null && strMName.length() != 0) {
                    if (!appliedFundSource.isTypeVirtual() || amountMAvailableBalance == null) {
                        ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment6 = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) this.c.get());
                        shopV3ConfirmationBottomSheetFragment6.getClass();
                        K k25 = shopV3ConfirmationBottomSheetFragment6.f14780R;
                        kotlin.jvm.internal.j.d(k25);
                        k25.h.setText(strMName);
                    } else {
                        InterfaceC2347a interfaceC2347a4 = (InterfaceC2347a) this.c.get();
                        String currencyFormattedValue3 = amountMAvailableBalance.getCurrencyFormattedValue();
                        kotlin.jvm.internal.j.f(currencyFormattedValue3, "getCurrencyFormattedValue(...)");
                        ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment7 = (ShopV3ConfirmationBottomSheetFragment) interfaceC2347a4;
                        shopV3ConfirmationBottomSheetFragment7.getClass();
                        K k26 = shopV3ConfirmationBottomSheetFragment7.f14780R;
                        kotlin.jvm.internal.j.d(k26);
                        TextView textView8 = k26.h;
                        Object[] objArr = new Object[2];
                        objArr[0] = strMName;
                        objArr[i] = currencyFormattedValue3;
                        textView8.setText(shopV3ConfirmationBottomSheetFragment7.getString(R.string.pma_format_shop_v3_fund_source_with_balance, objArr));
                    }
                }
                String message = paymentConfirmationSummary.getMessage();
                K k27 = ((ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) this.c.get())).f14780R;
                kotlin.jvm.internal.j.d(k27);
                ((Group) k27.f3709v).setVisibility(8);
                if (message != null && message.length() != 0) {
                    ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment8 = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) this.c.get());
                    shopV3ConfirmationBottomSheetFragment8.getClass();
                    K k28 = shopV3ConfirmationBottomSheetFragment8.f14780R;
                    kotlin.jvm.internal.j.d(k28);
                    k28.i.setText(message);
                    K k29 = ((ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) this.c.get())).f14780R;
                    kotlin.jvm.internal.j.d(k29);
                    ((Group) k29.f3709v).setVisibility(0);
                }
                ShopV3ConfirmationBottomSheetFragment shopV3ConfirmationBottomSheetFragment9 = (ShopV3ConfirmationBottomSheetFragment) ((InterfaceC2347a) this.c.get());
                K k30 = shopV3ConfirmationBottomSheetFragment9.f14780R;
                kotlin.jvm.internal.j.d(k30);
                ((Group) k30.f3708u).setVisibility(8);
                shopV3ConfirmationBottomSheetFragment9.o1().setVisibility(0);
                K k31 = shopV3ConfirmationBottomSheetFragment9.f14780R;
                kotlin.jvm.internal.j.d(k31);
                ConstraintLayout constraintLayout4 = k31.e;
                kotlin.jvm.internal.j.f(constraintLayout4, "containerLayoutPmaFragme…V3ConfirmationBottomSheet");
                shopV3ConfirmationBottomSheetFragment9.n1(constraintLayout4);
                return;
            case 22:
                E();
                return;
            case 23:
                super.j();
                if (((MayaMfaActivity) ((v9.a) this.c.get())).g0() != null) {
                    MayaMfaActivity mayaMfaActivity = (MayaMfaActivity) ((v9.a) this.c.get());
                    mayaMfaActivity.getClass();
                    AbstractC1236z.g(mayaMfaActivity, R.id.fragment_container, new MayaMultiTypeMfaInitialFragment());
                    return;
                } else {
                    MayaMfaActivity mayaMfaActivity2 = (MayaMfaActivity) ((v9.a) this.c.get());
                    mayaMfaActivity2.getClass();
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2367e(mayaMfaActivity2, i11), 500L);
                    return;
                }
            case 24:
                super.j();
                MayaMfaFaceAuthFragment mayaMfaFaceAuthFragment = (MayaMfaFaceAuthFragment) ((x9.a) this.c.get());
                mayaMfaFaceAuthFragment.getClass();
                C1983a c1983a = new C1983a(new W4.b(mayaMfaFaceAuthFragment, 29), i6);
                mayaMfaFaceAuthFragment.K1();
                HuiYanOsApi.setAuthEventCallBack(c1983a);
                if (g()) {
                    y9.b bVar3 = ((MayaMfaFaceAuthFragment) ((x9.a) this.c.get())).f12936X;
                    MFAChallengeInformationV2 mFAChallengeInformationV2 = bVar3 != null ? ((MayaMfaActivity) bVar3).f12929p : null;
                    if (mFAChallengeInformationV2 != null) {
                        ((MayaMfaFaceAuthFragment) ((x9.a) this.c.get())).getClass();
                        y9.b bVar4 = ((MayaMfaFaceAuthFragment) ((x9.a) this.c.get())).f12936X;
                        if ((bVar4 != null ? ((MayaMfaActivity) bVar4).g0() : null) != null) {
                            String tencentToken2 = mFAChallengeInformationV2.getTencentToken();
                            if (tencentToken2 == null) {
                                s(this, null, 3);
                                return;
                            }
                            MayaMfaFaceAuthFragment mayaMfaFaceAuthFragment2 = (MayaMfaFaceAuthFragment) ((x9.a) this.c.get());
                            mayaMfaFaceAuthFragment2.getClass();
                            C2070f1 c2070f1 = new C2070f1(mayaMfaFaceAuthFragment2, i10);
                            mayaMfaFaceAuthFragment2.K1();
                            HuiYanOsApi.startHuiYanAuth(tencentToken2, mayaMfaFaceAuthFragment2.f14176W, c2070f1);
                            return;
                        }
                        MFAChallengeInformation mFAChallengeInformationTransformToMfaChallengeInformation = mFAChallengeInformationV2.transformToMfaChallengeInformation();
                        if (mFAChallengeInformationTransformToMfaChallengeInformation == null || (tencentToken = mFAChallengeInformationTransformToMfaChallengeInformation.getTencentToken()) == null) {
                            s(this, null, 3);
                            return;
                        }
                        MayaMfaFaceAuthFragment mayaMfaFaceAuthFragment3 = (MayaMfaFaceAuthFragment) ((x9.a) this.c.get());
                        mayaMfaFaceAuthFragment3.getClass();
                        C2070f1 c2070f12 = new C2070f1(mayaMfaFaceAuthFragment3, i10);
                        mayaMfaFaceAuthFragment3.K1();
                        HuiYanOsApi.startHuiYanAuth(tencentToken, mayaMfaFaceAuthFragment3.f14176W, c2070f12);
                        return;
                    }
                    y9.b bVar5 = ((MayaMfaFaceAuthFragment) ((x9.a) this.c.get())).f12936X;
                    OpenMfaMeta openMfaMetaG0 = bVar5 != null ? ((MayaMfaActivity) bVar5).g0() : null;
                    if (openMfaMetaG0 != null) {
                        MfaMeta mfaMetaM1 = ((MayaMfaFaceAuthFragment) ((x9.a) this.c.get())).M1();
                        if (mfaMetaM1 != null) {
                            C1270l0 c1270l0 = (C1270l0) this.e;
                            c1270l0.getClass();
                            Ah.p<MFAChallengeInformationV2> pVarOpenStartChallenge = c1270l0.f11459b.openStartChallenge(mfaMetaM1.getChallengeId(), new OpenMfaChallengeRequest(mfaMetaM1.getMethod(), new OpenMfaChallengeIdentity("msisdn", openMfaMetaG0.getMobileNumber()), null, 4, null));
                            e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarOpenStartChallenge, pVarOpenStartChallenge, zh.b.a()), new p8.a(this, mfaMetaM1), i12), new C1983a(this, 18), i13).e());
                            return;
                        }
                        return;
                    }
                    MfaMeta mfaMetaM12 = ((MayaMfaFaceAuthFragment) ((x9.a) this.c.get())).M1();
                    if (mfaMetaM12 == null) {
                        s(this, null, 3);
                        return;
                    }
                    String lifeStyleId = mfaMetaM12.getLifeStyleId();
                    if (lifeStyleId == null) {
                        s(this, null, 3);
                        return;
                    }
                    String transactionType = mfaMetaM12.getTransactionType();
                    String challengeId = mfaMetaM12.getChallengeId();
                    C1278p0 c1278p0 = (C1278p0) this.f;
                    c1278p0.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("lifestyle_id", lifeStyleId);
                        break;
                    } catch (JSONException unused) {
                        yk.a.e();
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(Constants.METHOD, "FACE");
                        break;
                    } catch (JSONException unused2) {
                        yk.a.e();
                    }
                    try {
                        jSONObject2.put("params", jSONObject);
                        break;
                    } catch (JSONException unused3) {
                        yk.a.e();
                    }
                    String string = jSONObject2.toString();
                    kotlin.jvm.internal.j.f(string, "toString(...)");
                    byte[] bytes = string.getBytes(C2581c.f21468b);
                    kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
                    Ah.p<MFAChallengeInformation> pVarStartMFAChallenge = c1278p0.f11471b.startMFAChallenge(transactionType, challengeId, RequestBody.create(y5.f.f21063a, bytes));
                    e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarStartMFAChallenge, pVarStartMFAChallenge, zh.b.a()), new C2278a(this, mfaMetaM12), i12), new t9.b(this, i13), i13).e());
                    return;
                }
                return;
            case 25:
                super.j();
                OpenMfaMeta openMfaMetaK1 = ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).K1();
                if (openMfaMetaK1 == null || (mfaMetaJ1 = ((MayaMultiTypeOtpFragment) ((x9.c) this.c.get())).J1()) == null) {
                    return;
                }
                ((MayaBaseFragment) ((x9.c) this.c.get())).E1();
                C1270l0 c1270l02 = (C1270l0) this.e;
                c1270l02.getClass();
                Ah.p<MFAChallengeInformationV2> pVarOpenStartChallengeOTP = c1270l02.f11459b.openStartChallengeOTP(mfaMetaJ1.getChallengeId(), new OpenMFAStartChallengeOtpRequest("OTP", new OpenMFAStartChallengeOtpRequestParams("msisdn", openMfaMetaK1.getMobileNumber(), AbstractC1955a.o(), "client-api")));
                e(new Kh.T(5, new Lh.d(new Lh.d(AbstractC1331a.l(pVarOpenStartChallengeOTP, pVarOpenStartChallengeOTP, zh.b.a()), new p8.a(this, i6), i12), new C1983a(this, 20), i13), new t9.e(this, 4)).e());
                return;
        }
    }

    public void k() {
        MayaServicesV2Fragment mayaServicesV2Fragment;
        BannerAdCarousel bannerAdCarousel;
        if (!S5.c.b((S5.c) this.e, A5.b.f146x1) || (bannerAdCarousel = (mayaServicesV2Fragment = (MayaServicesV2Fragment) ((F7.b) this.c.get())).f12199o0) == null) {
            return;
        }
        f5.f fVar = new f5.f(bannerAdCarousel);
        fVar.f16717b = s5.d.e;
        LifecycleOwner viewLifecycleOwner = mayaServicesV2Fragment.getViewLifecycleOwner();
        kotlin.jvm.internal.j.f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fVar.c = viewLifecycleOwner;
        FragmentActivity fragmentActivityRequireActivity = mayaServicesV2Fragment.requireActivity();
        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
        fVar.f16718d = fragmentActivityRequireActivity;
        fVar.i = Integer.valueOf(mayaServicesV2Fragment.getResources().getDimensionPixelSize(R.dimen.maya_margin_normal));
        fVar.f16719g = Float.valueOf(16.0f);
        fVar.j = new Ag.a(25);
        fVar.f16720k = new Ag.a(26);
        fVar.f16721l = new C0165x(8);
        fVar.a();
    }

    public void l(int i, boolean z4) {
        ((MayaQRScannerFragment) ((Ma.b) this.c.get())).P1();
        int i4 = R.string.maya_label_qr_not_supported;
        if (i != 0) {
            ((MayaQRScannerFragment) ((Ma.b) this.c.get())).L1(z4 ? Integer.valueOf(R.string.maya_label_qr_not_supported) : null);
            return;
        }
        if (!((com.paymaya.data.preference.a) this.e).e().isQRScreensUpdateEnabled()) {
            final MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) ((Ma.b) this.c.get());
            Oa.g gVar = mayaQRScannerFragment.f13609j0;
            if (gVar != null) {
                gVar.setBorderColor(mayaQRScannerFragment.getResources().getColor(R.color.begonia_pink));
            }
            Oa.g gVar2 = mayaQRScannerFragment.f13609j0;
            if (gVar2 != null) {
                gVar2.setErrorState(true);
            }
            AppCompatTextView appCompatTextView = mayaQRScannerFragment.f13600a0;
            if (appCompatTextView == null) {
                kotlin.jvm.internal.j.n("mTextViewScanErrorDefault");
                throw null;
            }
            appCompatTextView.setVisibility(0);
            final int i6 = 1;
            new Handler().postDelayed(new Runnable() { // from class: Na.g
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i6) {
                        case 0:
                            MayaQRScannerFragment mayaQRScannerFragment2 = mayaQRScannerFragment;
                            if (mayaQRScannerFragment2.isAdded()) {
                                Oa.g gVar3 = mayaQRScannerFragment2.f13609j0;
                                if (gVar3 != null) {
                                    gVar3.setBorderColor(0);
                                }
                                Oa.g gVar4 = mayaQRScannerFragment2.f13609j0;
                                if (gVar4 != null) {
                                    gVar4.setErrorState(false);
                                }
                                Yj.b bVar = mayaQRScannerFragment2.f13608i0;
                                if (bVar != null) {
                                    bVar.f6795l = mayaQRScannerFragment2;
                                    Xj.e eVar = bVar.f6683b;
                                    if (eVar != null) {
                                        eVar.d();
                                    }
                                }
                                AppCompatTextView appCompatTextView2 = mayaQRScannerFragment2.f13602c0;
                                if (appCompatTextView2 != null) {
                                    appCompatTextView2.setVisibility(8);
                                    return;
                                } else {
                                    kotlin.jvm.internal.j.n(numX49.tnTj78("bdVa"));
                                    throw null;
                                }
                            }
                            return;
                        default:
                            MayaQRScannerFragment mayaQRScannerFragment3 = mayaQRScannerFragment;
                            Oa.g gVar5 = mayaQRScannerFragment3.f13609j0;
                            if (gVar5 != null) {
                                gVar5.setBorderColor(0);
                            }
                            Oa.g gVar6 = mayaQRScannerFragment3.f13609j0;
                            if (gVar6 != null) {
                                gVar6.setErrorState(false);
                            }
                            Yj.b bVar2 = mayaQRScannerFragment3.f13608i0;
                            if (bVar2 != null) {
                                bVar2.f6795l = mayaQRScannerFragment3;
                                Xj.e eVar2 = bVar2.f6683b;
                                if (eVar2 != null) {
                                    eVar2.d();
                                }
                            }
                            AppCompatTextView appCompatTextView3 = mayaQRScannerFragment3.f13600a0;
                            if (appCompatTextView3 != null) {
                                appCompatTextView3.setVisibility(8);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n(numX49.tnTj78("bdV6"));
                                throw null;
                            }
                    }
                }
            }, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
            return;
        }
        final MayaQRScannerFragment mayaQRScannerFragment2 = (MayaQRScannerFragment) ((Ma.b) this.c.get());
        Oa.g gVar3 = mayaQRScannerFragment2.f13609j0;
        if (gVar3 != null) {
            gVar3.setBorderColor(mayaQRScannerFragment2.getResources().getColor(R.color.begonia_pink));
        }
        Oa.g gVar4 = mayaQRScannerFragment2.f13609j0;
        if (gVar4 != null) {
            gVar4.setErrorState(true);
        }
        if (!z4) {
            i4 = R.string.maya_label_please_scan_another_code;
        }
        String string = mayaQRScannerFragment2.getString(i4);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        AppCompatTextView appCompatTextView2 = mayaQRScannerFragment2.f13602c0;
        if (appCompatTextView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewCameraHeaderErrorQRPH");
            throw null;
        }
        appCompatTextView2.setText(string);
        AppCompatTextView appCompatTextView3 = mayaQRScannerFragment2.f13602c0;
        if (appCompatTextView3 == null) {
            kotlin.jvm.internal.j.n("mTextViewCameraHeaderErrorQRPH");
            throw null;
        }
        appCompatTextView3.setVisibility(0);
        FrameLayout frameLayout = mayaQRScannerFragment2.f13605f0;
        if (frameLayout == null) {
            kotlin.jvm.internal.j.n("mFrameLayoutScannerContainer");
            throw null;
        }
        final int i10 = 0;
        frameLayout.postDelayed(new Runnable() { // from class: Na.g
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        MayaQRScannerFragment mayaQRScannerFragment22 = mayaQRScannerFragment2;
                        if (mayaQRScannerFragment22.isAdded()) {
                            Oa.g gVar32 = mayaQRScannerFragment22.f13609j0;
                            if (gVar32 != null) {
                                gVar32.setBorderColor(0);
                            }
                            Oa.g gVar42 = mayaQRScannerFragment22.f13609j0;
                            if (gVar42 != null) {
                                gVar42.setErrorState(false);
                            }
                            Yj.b bVar = mayaQRScannerFragment22.f13608i0;
                            if (bVar != null) {
                                bVar.f6795l = mayaQRScannerFragment22;
                                Xj.e eVar = bVar.f6683b;
                                if (eVar != null) {
                                    eVar.d();
                                }
                            }
                            AppCompatTextView appCompatTextView22 = mayaQRScannerFragment22.f13602c0;
                            if (appCompatTextView22 != null) {
                                appCompatTextView22.setVisibility(8);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n(numX49.tnTj78("bdVa"));
                                throw null;
                            }
                        }
                        return;
                    default:
                        MayaQRScannerFragment mayaQRScannerFragment3 = mayaQRScannerFragment2;
                        Oa.g gVar5 = mayaQRScannerFragment3.f13609j0;
                        if (gVar5 != null) {
                            gVar5.setBorderColor(0);
                        }
                        Oa.g gVar6 = mayaQRScannerFragment3.f13609j0;
                        if (gVar6 != null) {
                            gVar6.setErrorState(false);
                        }
                        Yj.b bVar2 = mayaQRScannerFragment3.f13608i0;
                        if (bVar2 != null) {
                            bVar2.f6795l = mayaQRScannerFragment3;
                            Xj.e eVar2 = bVar2.f6683b;
                            if (eVar2 != null) {
                                eVar2.d();
                            }
                        }
                        AppCompatTextView appCompatTextView32 = mayaQRScannerFragment3.f13600a0;
                        if (appCompatTextView32 != null) {
                            appCompatTextView32.setVisibility(8);
                            return;
                        } else {
                            kotlin.jvm.internal.j.n(numX49.tnTj78("bdV6"));
                            throw null;
                        }
                }
            }
        }, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }

    public String m() {
        MfaMeta mfaMeta = ((MayaMfaActivity) ((v9.a) this.c.get())).f12930q;
        String mfaPurposeType = mfaMeta != null ? MfaMetaKt.getMfaPurposeType(mfaMeta) : null;
        String strT = "";
        if (mfaPurposeType == null) {
            mfaPurposeType = "";
        }
        MfaMeta mfaMeta2 = ((MayaMfaActivity) ((v9.a) this.c.get())).f12930q;
        String mobileNumber = mfaMeta2 != null ? mfaMeta2.getMobileNumber() : null;
        if (mobileNumber == null) {
            mobileNumber = "";
        }
        zj.o oVar = Je.c.f2514a;
        C1757b c1757bB = C1757b.b();
        try {
            String strA = c1757bB.a(c1757bB.i(mobileNumber, "PH"), 3);
            kotlin.jvm.internal.j.d(strA);
            strT = zj.z.t(strA, Global.BLANK, "");
        } catch (Exception e) {
            e.toString();
            yk.a.d();
        }
        String strY1 = ((MayaMfaActivity) ((v9.a) this.c.get())).Y1();
        StringBuilder sbX = We.s.x("https://support.maya.ph/s/faceauthloginerror?type=", mfaPurposeType, "&min=", strT, "&challengeId=");
        sbX.append(strY1);
        return sbX.toString();
    }

    public void o() {
        ((EDDApplicationStatusFragment) ((yd.d) this.c.get())).z1();
        Ah.p<Ekyc> ekycApplicationInfoV4 = ((P) this.e).f11380b.getEkycApplicationInfoV4();
        e(new Lh.d(new Lh.d(AbstractC1331a.l(ekycApplicationInfoV4, ekycApplicationInfoV4, zh.b.a()), new C1967a(this, 11), 2), new qc.c(this, 4), 0).e());
    }

    public void p() {
        int i = 0;
        C1264i0 c1264i0 = (C1264i0) this.f;
        String strB = i0.b();
        kotlin.jvm.internal.j.f(strB, "getSessionId(...)");
        String lowerCase = EventMetricsAggregator.OS_NAME.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        ((MayaCreditInterstitialActivity) ((M9.b) this.c.get())).getClass();
        int i4 = Build.VERSION.SDK_INT;
        c1264i0.getClass();
        RequestBody.Companion companion = RequestBody.Companion;
        byte[] bArrA = I5.a.a(strB, lowerCase, string, String.valueOf(i4), null, null, null);
        kotlin.jvm.internal.j.f(bArrA, "buildCreditEligibilityAndCreditScore(...)");
        Ah.p<CreditInitialEligibility> initialEligibility = c1264i0.c.getInitialEligibility(RequestBody.Companion.create$default(companion, y5.f.f21063a, bArrA, 0, 0, 12, (Object) null));
        kotlin.jvm.internal.j.f(initialEligibility, "getInitialEligibility(...)");
        e(new Kh.T(5, new Lh.d(new Lh.d(new Lh.h(initialEligibility, zh.b.a(), i), new G6.v(this, 8), 2), new Gc.h(this, 4), i), new C0326d(this, 1)).e());
    }

    public void q(String action) {
        kotlin.jvm.internal.j.g(action, "action");
        if (((Set) this.f).contains(action) || !g()) {
            return;
        }
        ((MayaMfaActivity) ((v9.a) this.c.get())).finish();
    }

    public void r(PayMayaError payMayaError, boolean z4) {
        String str;
        String strS;
        MfaMeta mfaMeta;
        int i = 4;
        int i4 = 2;
        final int i6 = 1;
        final int i10 = 0;
        switch (this.f219d) {
            case 23:
                String strMTitle = null;
                Integer numValueOf = payMayaError != null ? Integer.valueOf(payMayaError.mErrorCode()) : null;
                if (numValueOf != null && numValueOf.intValue() == -423) {
                    v9.a aVar = (v9.a) this.c.get();
                    String strS2 = AbstractC1213b.s(6);
                    kotlin.jvm.internal.j.f(strS2, "viewed(...)");
                    ((MayaMfaActivity) aVar).f2(strS2, "Tencent Face Auth Screen", M.h(new Pair(EnumC1212a.SCREEN_NAME, "Face authentication failed (Dialog)"), new Pair(EnumC1212a.CHALLENGE_ID, ((MayaMfaActivity) ((v9.a) this.c.get())).Y1())));
                    final MayaMfaActivity mayaMfaActivity = (MayaMfaActivity) ((v9.a) this.c.get());
                    boolean zB = S5.c.b(mayaMfaActivity.m1(), A5.b.f94b0);
                    final PayMayaErrorAction payMayaErrorActionMAction = payMayaError != null ? payMayaError.mAction() : null;
                    if (zB && (mfaMeta = mayaMfaActivity.f12930q) != null && !mfaMeta.getHasChangedMin()) {
                        strMTitle = mayaMfaActivity.getString(R.string.maya_label_face_auth_button_submit_support_ticket);
                    } else if (payMayaErrorActionMAction != null) {
                        strMTitle = payMayaErrorActionMAction.mTitle();
                    }
                    final String str2 = strMTitle;
                    final String str3 = zB ? "Submit ticket (Webview)" : "Customer support (Webview)";
                    final MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231347, mayaMfaActivity.getString(R.string.maya_label_face_auth_error_title), mayaMfaActivity.getString(R.string.maya_label_face_auth_mismatch_error_message), str2, mayaMfaActivity.getString(R.string.maya_label_face_auth_button_got_it), false, null, null, false, 480);
                    mayaErrorDialogFragmentZ.f11852e0 = new View.OnClickListener() { // from class: w9.d
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MayaMfaActivity mayaMfaActivity2 = mayaMfaActivity;
                            String str4 = str3;
                            String str5 = str2;
                            MayaErrorDialogFragment mayaErrorDialogFragment = mayaErrorDialogFragmentZ;
                            PayMayaErrorAction payMayaErrorAction = payMayaErrorActionMAction;
                            int i11 = MayaMfaActivity.f12926w;
                            Callback.onClick_enter(view);
                            try {
                                MayaMfaActivity.j2(mayaMfaActivity2, str4, str5, mayaErrorDialogFragment, payMayaErrorAction);
                            } finally {
                                Callback.onClick_exit();
                            }
                        }
                    };
                    mayaErrorDialogFragmentZ.f11851d0 = new w9.j(mayaMfaActivity, mayaErrorDialogFragmentZ, i10);
                    mayaErrorDialogFragmentZ.f11850c0 = new w9.k(mayaMfaActivity, i10);
                    FragmentManager supportFragmentManager = mayaMfaActivity.getSupportFragmentManager();
                    kotlin.jvm.internal.j.f(supportFragmentManager, "getSupportFragmentManager(...)");
                    AbstractC0983W.D(mayaErrorDialogFragmentZ, supportFragmentManager, "alert_dialog");
                    str = "Face mismatch";
                } else {
                    if (numValueOf != null && numValueOf.intValue() == -424) {
                        OpenMfaMeta openMfaMetaG0 = ((MayaMfaActivity) ((v9.a) this.c.get())).g0();
                        String str4 = "You’re almost there! (Dialog)";
                        if (openMfaMetaG0 == null) {
                            strS = AbstractC1213b.s(8);
                            kotlin.jvm.internal.j.f(strS, "viewed(...)");
                            MayaMfaActivity mayaMfaActivity2 = (MayaMfaActivity) ((v9.a) this.c.get());
                            MayaErrorDialogFragment mayaErrorDialogFragmentZ2 = M2.b.Z(2131231313, mayaMfaActivity2.getString(R.string.maya_face_auth_verification_via_otp_error_title), mayaMfaActivity2.getString(R.string.maya_face_auth_verification_via_otp_error_message), mayaMfaActivity2.getString(R.string.maya_label_face_auth_button_send_otp), mayaMfaActivity2.getString(R.string.maya_label_face_auth_button_take_me_back), false, null, null, false, 480);
                            mayaErrorDialogFragmentZ2.f11852e0 = new w9.e(mayaMfaActivity2, mayaErrorDialogFragmentZ2, i10);
                            mayaErrorDialogFragmentZ2.f11851d0 = new w9.i(mayaMfaActivity2, i6);
                            mayaErrorDialogFragmentZ2.f11850c0 = new w9.k(mayaMfaActivity2, i6);
                            FragmentManager supportFragmentManager2 = mayaMfaActivity2.getSupportFragmentManager();
                            kotlin.jvm.internal.j.f(supportFragmentManager2, "getSupportFragmentManager(...)");
                            AbstractC0983W.D(mayaErrorDialogFragmentZ2, supportFragmentManager2, "alert_dialog");
                        } else if (z4) {
                            strS = AbstractC1213b.s(4);
                            kotlin.jvm.internal.j.f(strS, "viewed(...)");
                            v9.a aVar2 = (v9.a) this.c.get();
                            final String mobileNumber = openMfaMetaG0.getMobileNumber();
                            final MayaMfaActivity mayaMfaActivity3 = (MayaMfaActivity) aVar2;
                            mayaMfaActivity3.getClass();
                            kotlin.jvm.internal.j.g(mobileNumber, "mobileNumber");
                            final MayaErrorDialogFragment mayaErrorDialogFragmentZ3 = M2.b.Z(2131231241, mayaMfaActivity3.getString(R.string.maya_label_otp_fallback_title), mayaMfaActivity3.getString(R.string.maya_label_otp_fallback_error), mayaMfaActivity3.getString(R.string.maya_label_face_auth_button_verify_otp), mayaMfaActivity3.getString(R.string.maya_label_close), false, null, null, false, 480);
                            mayaErrorDialogFragmentZ3.f11852e0 = new View.OnClickListener() { // from class: w9.f
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    MayaErrorDialogFragment mayaErrorDialogFragment = mayaErrorDialogFragmentZ3;
                                    String str5 = mobileNumber;
                                    switch (i6) {
                                        case 0:
                                            MayaMfaActivity mayaMfaActivity4 = mayaMfaActivity3;
                                            int i11 = MayaMfaActivity.f12926w;
                                            Callback.onClick_enter(view);
                                            try {
                                                mayaMfaActivity4.f12931r = "to_multi_type_otp";
                                                mayaMfaActivity4.n2(str5, "You’re almost there! (Dialog)");
                                                String strM = AbstractC1213b.m(8);
                                                kotlin.jvm.internal.j.f(strM, "tapped(...)");
                                                String string = mayaErrorDialogFragment.getString(R.string.maya_label_face_auth_button_send_otp);
                                                kotlin.jvm.internal.j.f(string, "getString(...)");
                                                mayaMfaActivity4.e2(strM, "You’re almost there! (Dialog)", "Enter the OTP", string, null);
                                                return;
                                            } finally {
                                            }
                                        default:
                                            MayaMfaActivity mayaMfaActivity5 = mayaMfaActivity3;
                                            int i12 = MayaMfaActivity.f12926w;
                                            Callback.onClick_enter(view);
                                            try {
                                                mayaMfaActivity5.f12931r = "to_multi_type_otp";
                                                mayaMfaActivity5.n2(str5, "No face data - OTP fallback (Dialog)");
                                                String strM2 = AbstractC1213b.m(4);
                                                kotlin.jvm.internal.j.f(strM2, "tapped(...)");
                                                String string2 = mayaErrorDialogFragment.getString(R.string.maya_label_face_auth_button_verify_otp);
                                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                                mayaMfaActivity5.e2(strM2, "No face data - OTP fallback (Dialog)", "Enter the OTP", string2, null);
                                                return;
                                            } finally {
                                            }
                                    }
                                }
                            };
                            mayaErrorDialogFragmentZ3.f11851d0 = new w9.j(mayaMfaActivity3, mayaErrorDialogFragmentZ3, i6);
                            mayaErrorDialogFragmentZ3.f11850c0 = new w9.g(mayaMfaActivity3, i4);
                            FragmentManager supportFragmentManager3 = mayaMfaActivity3.getSupportFragmentManager();
                            kotlin.jvm.internal.j.f(supportFragmentManager3, "getSupportFragmentManager(...)");
                            AbstractC0983W.D(mayaErrorDialogFragmentZ3, supportFragmentManager3, "alert_dialog");
                            str4 = "Please verify your identity (Bottom sheet)";
                        } else {
                            strS = AbstractC1213b.s(8);
                            kotlin.jvm.internal.j.f(strS, "viewed(...)");
                            v9.a aVar3 = (v9.a) this.c.get();
                            final String mobileNumber2 = openMfaMetaG0.getMobileNumber();
                            final MayaMfaActivity mayaMfaActivity4 = (MayaMfaActivity) aVar3;
                            mayaMfaActivity4.getClass();
                            kotlin.jvm.internal.j.g(mobileNumber2, "mobileNumber");
                            final MayaErrorDialogFragment mayaErrorDialogFragmentZ4 = M2.b.Z(2131231313, mayaMfaActivity4.getString(R.string.maya_face_auth_verification_via_otp_error_title), mayaMfaActivity4.getString(R.string.maya_face_auth_verification_via_otp_error_message), mayaMfaActivity4.getString(R.string.maya_label_face_auth_button_send_otp), mayaMfaActivity4.getString(R.string.maya_label_face_auth_button_take_me_back), false, null, null, false, 480);
                            mayaErrorDialogFragmentZ4.f11852e0 = new View.OnClickListener() { // from class: w9.f
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    MayaErrorDialogFragment mayaErrorDialogFragment = mayaErrorDialogFragmentZ4;
                                    String str5 = mobileNumber2;
                                    switch (i10) {
                                        case 0:
                                            MayaMfaActivity mayaMfaActivity42 = mayaMfaActivity4;
                                            int i11 = MayaMfaActivity.f12926w;
                                            Callback.onClick_enter(view);
                                            try {
                                                mayaMfaActivity42.f12931r = "to_multi_type_otp";
                                                mayaMfaActivity42.n2(str5, "You’re almost there! (Dialog)");
                                                String strM = AbstractC1213b.m(8);
                                                kotlin.jvm.internal.j.f(strM, "tapped(...)");
                                                String string = mayaErrorDialogFragment.getString(R.string.maya_label_face_auth_button_send_otp);
                                                kotlin.jvm.internal.j.f(string, "getString(...)");
                                                mayaMfaActivity42.e2(strM, "You’re almost there! (Dialog)", "Enter the OTP", string, null);
                                                return;
                                            } finally {
                                            }
                                        default:
                                            MayaMfaActivity mayaMfaActivity5 = mayaMfaActivity4;
                                            int i12 = MayaMfaActivity.f12926w;
                                            Callback.onClick_enter(view);
                                            try {
                                                mayaMfaActivity5.f12931r = "to_multi_type_otp";
                                                mayaMfaActivity5.n2(str5, "No face data - OTP fallback (Dialog)");
                                                String strM2 = AbstractC1213b.m(4);
                                                kotlin.jvm.internal.j.f(strM2, "tapped(...)");
                                                String string2 = mayaErrorDialogFragment.getString(R.string.maya_label_face_auth_button_verify_otp);
                                                kotlin.jvm.internal.j.f(string2, "getString(...)");
                                                mayaMfaActivity5.e2(strM2, "No face data - OTP fallback (Dialog)", "Enter the OTP", string2, null);
                                                return;
                                            } finally {
                                            }
                                    }
                                }
                            };
                            mayaErrorDialogFragmentZ4.f11851d0 = new w9.l(mayaMfaActivity4);
                            mayaErrorDialogFragmentZ4.f11850c0 = new w9.m(mayaMfaActivity4);
                            FragmentManager supportFragmentManager4 = mayaMfaActivity4.getSupportFragmentManager();
                            kotlin.jvm.internal.j.f(supportFragmentManager4, "getSupportFragmentManager(...)");
                            AbstractC0983W.D(mayaErrorDialogFragmentZ4, supportFragmentManager4, "alert_dialog");
                        }
                        ((MayaMfaActivity) ((v9.a) this.c.get())).f2(strS, "Tencent Face Auth Screen", M.h(new Pair(EnumC1212a.SCREEN_NAME, str4), new Pair(EnumC1212a.CHALLENGE_ID, ((MayaMfaActivity) ((v9.a) this.c.get())).Y1())));
                    } else if (numValueOf != null && numValueOf.intValue() == -329) {
                        ((MayaMfaActivity) ((v9.a) this.c.get())).k2(new n0.e(i), new n0.e(5));
                        str = "Challenge ID expired";
                    } else {
                        ((MayaMfaActivity) ((v9.a) this.c.get())).g2(payMayaError);
                    }
                    str = "";
                }
                if (str.length() > 0) {
                    v9.a aVar4 = (v9.a) this.c.get();
                    String strF = AbstractC1213b.f(14);
                    kotlin.jvm.internal.j.f(strF, "failure(...)");
                    ((MayaMfaActivity) aVar4).b2(strF, str);
                }
                break;
            default:
                ((MayaBaseFragment) ((x9.a) this.c.get())).w1();
                MayaMfaFaceAuthFragment mayaMfaFaceAuthFragment = (MayaMfaFaceAuthFragment) ((x9.a) this.c.get());
                mayaMfaFaceAuthFragment.f12937Y = false;
                y9.b bVar = mayaMfaFaceAuthFragment.f12936X;
                if (bVar != null) {
                    ((MayaMfaActivity) bVar).Z1().r(payMayaError, z4);
                }
                break;
        }
    }

    public void t() {
        ((MayaQRScannerFragment) ((Ma.b) this.c.get())).L1(null);
        if (((com.paymaya.data.preference.a) this.e).e().isQREventsV2Enabled()) {
            I(M.h(new Pair(EnumC1212a.ERROR_REASON, "No qr detected"), new Pair(EnumC1212a.PAGE, "Pay with QR")));
        } else {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            K(1, "No qr detected");
        }
    }

    public void u(y4.f fVar, String bankBic, int i) throws InvalidTagValueException {
        QRBankTransferRecipient qRBankTransferRecipientC;
        Double dValueOf;
        String strC;
        String strC2;
        String strC3;
        kotlin.jvm.internal.j.g(bankBic, "bankBic");
        String strB = fVar.o("27").b("00");
        if (!kotlin.jvm.internal.j.b(((com.paymaya.data.preference.a) this.e).l(), "kyc1")) {
            MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) ((Ma.b) this.c.get());
            mayaQRScannerFragment.getClass();
            Na.i iVar = mayaQRScannerFragment.f13610k0;
            if (iVar != null) {
                MayaQRActivity mayaQRActivity = (MayaQRActivity) iVar;
                mayaQRActivity.setResult(10, new Intent().putExtra("module_name", EnumC1215d.BANK_TRANSFER));
                mayaQRActivity.finish();
                return;
            }
            return;
        }
        if (((com.paymaya.data.preference.a) this.e).e().isQRPHAdjustmentsEnabled() && strB == null) {
            L(i, "Invalid InstaPay Code");
            l(i, false);
            return;
        }
        String strB2 = fVar.o("27").b("04");
        if (((com.paymaya.data.preference.a) this.e).e().isQRPHAdjustmentsEnabled()) {
            Pattern pattern = c0.f10694a;
            String string = fVar.toString();
            kotlin.jvm.internal.j.f(string, "toString(...)");
            try {
                y4.f fVarA = v0.A(string);
                c0.a(string, fVarA);
                try {
                    C2508d c2508dO = fVarA.o("27");
                    kotlin.jvm.internal.j.f(c2508dO, "getMAIData(...)");
                    if (fVarA.p() == null) {
                        dValueOf = null;
                    } else {
                        String strP = fVarA.p();
                        kotlin.jvm.internal.j.f(strP, "getTransactionAmount(...)");
                        dValueOf = Double.valueOf(Double.parseDouble(strP));
                    }
                    C2506b c2506bN = fVarA.n();
                    qRBankTransferRecipientC = QRBankTransferRecipient.sBuilder().mBankBic(C.P("01", c2508dO)).mAccountNumber(C.P("04", c2508dO)).mAccountName(fVarA.c(x4.f.m)).mAmount(dValueOf).mQRPHAdditionalData(new QRPHAdditionalData(C.P("00", c2508dO), C.P("02", c2508dO), C.P("05", c2508dO), (c2506bN == null || (strC3 = c2506bN.c(EnumC2464a.TAG_04_LOYALTY_NUMBER)) == null || strC3.equals("***")) ? null : strC3, fVarA.c(x4.f.f), fVarA.c(x4.f.f20921n), fVarA.c(x4.f.f20922o), c2506bN != null ? c2506bN.c(EnumC2464a.TAG_01_BILL_NUMBER) : null, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_03_STORE_ID) : null, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_05_REFERENCE_ID) : null, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_07_TERMINAL_ID) : null, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_09_ADDITIONAL_CONSUMER_DATA_REQUEST) : null, (c2506bN == null || (strC2 = c2506bN.c(EnumC2464a.TAG_02_MOBILE_NUMBER)) == null || strC2.equals("***")) ? null : strC2, (c2506bN == null || (strC = c2506bN.c(EnumC2464a.TAG_06_CONSUMER_ID)) == null || strC.equals("***")) ? null : strC)).build();
                    kotlin.jvm.internal.j.f(qRBankTransferRecipientC, "build(...)");
                } catch (FormatException unused) {
                    yk.a.b();
                    throw new InvalidTagValueException("27", (String) null, "Unknown tag=".concat("27"));
                }
            } catch (InvalidTagValueException e) {
                throw e;
            } catch (Exception unused2) {
                yk.a.b();
                throw new InvalidTagValueException(String.format("Request for value at tag '%1$s' is invalid, %2$s", null, "Cannot parse QRPH P2P code"));
            }
        } else {
            String strP2 = fVar.p();
            qRBankTransferRecipientC = Z.c(strP2 != null ? Double.valueOf(Double.parseDouble(strP2)) : null, bankBic, strB2);
        }
        if (((com.paymaya.data.preference.a) this.e).e().isQREventsV2Enabled()) {
            J(L.c(new Pair(EnumC1212a.QR_CLASS, "Instapay")));
        } else {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            R(i, "SEND_MONEY_INSTAPAY_QR_BANK");
        }
        ((MayaQRScannerFragment) ((Ma.b) this.c.get())).O1();
        ((MayaQRScannerFragment) ((Ma.b) this.c.get())).P1();
        Ma.b bVar = (Ma.b) this.c.get();
        kotlin.jvm.internal.j.d(qRBankTransferRecipientC);
        MayaQRScannerFragment mayaQRScannerFragment2 = (MayaQRScannerFragment) bVar;
        mayaQRScannerFragment2.getClass();
        Na.i iVar2 = mayaQRScannerFragment2.f13610k0;
        if (iVar2 != null) {
            MayaQRActivity mayaQRActivity2 = (MayaQRActivity) iVar2;
            mayaQRActivity2.n1();
            B5.i.d(mayaQRActivity2, qRBankTransferRecipientC);
        }
    }

    public void v(C3.j jVar, int i, V[] vArr) {
        final int i4 = 0;
        final int i6 = 1;
        String str = jVar.f719a;
        Y yK = ((com.paymaya.data.preference.a) this.e).e().isQrphEnhancementsEnabled() ? Z.k(str) : Z.j(str);
        ArrayList arrayList = new ArrayList(vArr.length);
        for (V v7 : vArr) {
            arrayList.add(v7.f10449a);
        }
        if (!C1129o.p((Y[]) C1110A.V(arrayList).toArray(new Y[0]), yK)) {
            S(i);
            l(i, true);
            return;
        }
        int i10 = Ja.d.f2502a[yK.ordinal()];
        if (i10 == 1) {
            QRRecipient qRRecipientI = Z.i(jVar.f719a);
            ((MayaQRScannerFragment) ((Ma.b) this.c.get())).O1();
            if (qRRecipientI == null) {
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                K(i, "Invalid Send Money Code");
                l(i, false);
                return;
            }
            ((MayaQRScannerFragment) ((Ma.b) this.c.get())).P1();
            P(i, "SEND_MONEY");
            Na.i iVar = ((MayaQRScannerFragment) ((Ma.b) this.c.get())).f13610k0;
            if (iVar != null) {
                MayaQRActivity mayaQRActivity = (MayaQRActivity) iVar;
                mayaQRActivity.n1().T(mayaQRActivity, qRRecipientI);
                return;
            }
            return;
        }
        if (i10 == 2) {
            if (((com.paymaya.data.preference.a) this.e).e().isInstaPayQREnabled()) {
                try {
                    y4.f fVarA = v0.A(jVar.f719a);
                    C2508d c2508dO = fVarA.o("27");
                    String strB = c2508dO != null ? c2508dO.b("01") : null;
                    if (strB == null || !strB.equalsIgnoreCase("PAPHPHM1XXX")) {
                        if (strB != null && !C2576A.H(strB)) {
                            u(fVarA, strB, i);
                            return;
                        }
                        L(i, "Invalid InstaPay Code");
                        l(i, false);
                        return;
                    }
                    fVarA.j();
                    String strB2 = fVarA.o("27").b("04");
                    String strP = fVarA.p();
                    String string = strP != null ? strP.toString() : null;
                    C2506b c2506bN = fVarA.n();
                    QRRecipient qRRecipientE = Z.e(strB2, string, c2506bN != null ? c2506bN.c(EnumC2464a.TAG_08_PURPOSE) : null);
                    P(i, "SEND_MONEY_INSTAPAY_QR");
                    ((MayaQRScannerFragment) ((Ma.b) this.c.get())).O1();
                    ((MayaQRScannerFragment) ((Ma.b) this.c.get())).P1();
                    Ma.b bVar = (Ma.b) this.c.get();
                    kotlin.jvm.internal.j.d(qRRecipientE);
                    Na.i iVar2 = ((MayaQRScannerFragment) bVar).f13610k0;
                    if (iVar2 != null) {
                        MayaQRActivity mayaQRActivity2 = (MayaQRActivity) iVar2;
                        mayaQRActivity2.n1().T(mayaQRActivity2, qRRecipientE);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    L(i, message);
                    l(i, false);
                    yk.a.b();
                    return;
                }
            }
            return;
        }
        if (i10 == 3) {
            try {
                y4.f fVarZ = v0.z(jVar.f719a);
                String strB3 = fVarZ.b("01");
                if (kotlin.jvm.internal.j.b(strB3, "11")) {
                    if (fVarZ.n() == null || fVarZ.n().b("05") == null) {
                        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                        K(i, "Invalid InstaPay Code");
                        l(i, false);
                    } else {
                        QRMerchant qRMerchantV = V(jVar.f719a, fVarZ);
                        ((MayaQRScannerFragment) ((Ma.b) this.c.get())).O1();
                        ((MayaQRScannerFragment) ((Ma.b) this.c.get())).P1();
                        X(qRMerchantV);
                    }
                } else if (kotlin.jvm.internal.j.b(strB3, "12")) {
                    QRMerchant qRMerchantT = T(jVar.f719a, fVarZ);
                    ((MayaQRScannerFragment) ((Ma.b) this.c.get())).O1();
                    ((MayaQRScannerFragment) ((Ma.b) this.c.get())).P1();
                    W(qRMerchantT);
                } else {
                    EnumC1212a enumC1212a3 = EnumC1212a.ACCOUNT_NUMBER;
                    K(i, "Invalid InstaPay Code");
                    l(i, false);
                }
                return;
            } catch (Exception unused) {
                yk.a.b();
                EnumC1212a enumC1212a4 = EnumC1212a.ACCOUNT_NUMBER;
                K(i, "Invalid InstaPay Code");
                l(i, false);
                return;
            }
        }
        if (i10 != 4) {
            if (i10 != 5) {
                S(i);
                l(i, false);
                return;
            } else {
                S(i);
                l(i, false);
                return;
            }
        }
        try {
            y4.f fVarZ2 = v0.z(jVar.f719a);
            QRPHMerchantPaymentRequest qRPHMerchantPaymentRequestN = ((com.paymaya.data.preference.a) this.e).e().isQrWithCheckoutFlowEnabled() ? Z.n(fVarZ2, jVar.f719a, Boolean.TRUE) : Z.n(fVarZ2, null, Boolean.FALSE);
            if (qRPHMerchantPaymentRequestN == null) {
                M(i, "Invalid P2M Code");
                l(i, false);
                return;
            }
            ((MayaQRScannerFragment) ((Ma.b) this.c.get())).P1();
            if (kotlin.jvm.internal.j.b(((com.paymaya.data.preference.a) this.e).l(), "kyc1")) {
                ((MayaQRScannerFragment) ((Ma.b) this.c.get())).O1();
                Y(qRPHMerchantPaymentRequestN);
                return;
            }
            final MayaQRScannerFragment mayaQRScannerFragment = (MayaQRScannerFragment) ((Ma.b) this.c.get());
            Na.i iVar3 = mayaQRScannerFragment.f13610k0;
            if (iVar3 != null) {
                ((MayaQRActivity) iVar3).c2(new Function0() { // from class: Na.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                i iVar4 = mayaQRScannerFragment.f13610k0;
                                if (iVar4 != null) {
                                    MayaQRActivity mayaQRActivity3 = (MayaQRActivity) iVar4;
                                    mayaQRActivity3.n1().s(mayaQRActivity3, false);
                                }
                                break;
                            default:
                                MayaQRScannerFragment mayaQRScannerFragment2 = mayaQRScannerFragment;
                                Yj.b bVar2 = mayaQRScannerFragment2.f13608i0;
                                if (bVar2 != null) {
                                    bVar2.f6795l = mayaQRScannerFragment2;
                                    Xj.e eVar = bVar2.f6683b;
                                    if (eVar != null) {
                                        eVar.d();
                                    }
                                }
                                break;
                        }
                        return Unit.f18162a;
                    }
                }, new Function0() { // from class: Na.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                i iVar4 = mayaQRScannerFragment.f13610k0;
                                if (iVar4 != null) {
                                    MayaQRActivity mayaQRActivity3 = (MayaQRActivity) iVar4;
                                    mayaQRActivity3.n1().s(mayaQRActivity3, false);
                                }
                                break;
                            default:
                                MayaQRScannerFragment mayaQRScannerFragment2 = mayaQRScannerFragment;
                                Yj.b bVar2 = mayaQRScannerFragment2.f13608i0;
                                if (bVar2 != null) {
                                    bVar2.f6795l = mayaQRScannerFragment2;
                                    Xj.e eVar = bVar2.f6683b;
                                    if (eVar != null) {
                                        eVar.d();
                                    }
                                }
                                break;
                        }
                        return Unit.f18162a;
                    }
                });
            }
        } catch (Exception e7) {
            yk.a.b();
            M(i, e7.getMessage());
            l(i, false);
        }
    }

    public void w(String resultToken) {
        String lifeStyleId;
        int i = 2;
        int i4 = 0;
        int i6 = 1;
        if (g()) {
            ((MayaBaseFragment) ((x9.a) this.c.get())).E1();
            MayaMfaFaceAuthFragment mayaMfaFaceAuthFragment = (MayaMfaFaceAuthFragment) ((x9.a) this.c.get());
            C1229s c1229s = mayaMfaFaceAuthFragment.f12939a0;
            if (c1229s == null) {
                kotlin.jvm.internal.j.n("mAuthAnalyticsUtils");
                throw null;
            }
            FragmentActivity fragmentActivityRequireActivity = mayaMfaFaceAuthFragment.requireActivity();
            kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
            String strI = AbstractC1213b.i(1);
            kotlin.jvm.internal.j.f(strI, "success(...)");
            EnumC1212a enumC1212a = EnumC1212a.PURPOSE;
            MfaMeta mfaMetaM1 = mayaMfaFaceAuthFragment.M1();
            c1229s.b(fragmentActivityRequireActivity, strI, L.c(new Pair(enumC1212a, mfaMetaM1 != null ? mfaMetaM1.getTransactionType() : null)));
            y9.b bVar = ((MayaMfaFaceAuthFragment) ((x9.a) this.c.get())).f12936X;
            OpenMfaMeta openMfaMetaG0 = bVar != null ? ((MayaMfaActivity) bVar).g0() : null;
            if (openMfaMetaG0 != null) {
                MfaMeta mfaMetaM12 = ((MayaMfaFaceAuthFragment) ((x9.a) this.c.get())).M1();
                if (mfaMetaM12 != null) {
                    C1270l0 c1270l0 = (C1270l0) this.e;
                    c1270l0.getClass();
                    Ah.p<MFAChallengeVerificationResultV2> pVarOpenVerifyChallenge = c1270l0.f11459b.openVerifyChallenge(mfaMetaM12.getChallengeId(), new OpenMfaChallengeRequest(mfaMetaM12.getMethod(), new OpenMfaChallengeIdentity("msisdn", openMfaMetaG0.getMobileNumber()), resultToken));
                    e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarOpenVerifyChallenge, pVarOpenVerifyChallenge, zh.b.a()), new C2278a(this), i), new t9.b(this, i6), i4).e());
                } else {
                    s(this, null, 3);
                }
            } else {
                MfaMeta mfaMetaM13 = ((MayaMfaFaceAuthFragment) ((x9.a) this.c.get())).M1();
                if (mfaMetaM13 == null || (lifeStyleId = mfaMetaM13.getLifeStyleId()) == null) {
                    s(this, null, 3);
                } else {
                    String transactionType = mfaMetaM13.getTransactionType();
                    String challengeId = mfaMetaM13.getChallengeId();
                    C1278p0 c1278p0 = (C1278p0) this.f;
                    c1278p0.getClass();
                    kotlin.jvm.internal.j.g(resultToken, "resultToken");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("lifestyle_id", lifeStyleId);
                    } catch (JSONException unused) {
                        yk.a.e();
                    }
                    try {
                        jSONObject.put("result_token", resultToken);
                    } catch (JSONException unused2) {
                        yk.a.e();
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(Constants.METHOD, "FACE");
                    } catch (JSONException unused3) {
                        yk.a.e();
                    }
                    try {
                        jSONObject2.put("params", jSONObject);
                    } catch (JSONException unused4) {
                        yk.a.e();
                    }
                    String string = jSONObject2.toString();
                    kotlin.jvm.internal.j.f(string, "toString(...)");
                    byte[] bytes = string.getBytes(C2581c.f21468b);
                    kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
                    Ah.p<MFAChallengeVerificationResult> pVarVerifyMFAChallenge = c1278p0.f11471b.verifyMFAChallenge(transactionType, challengeId, RequestBody.create(y5.f.f21063a, bytes));
                    e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarVerifyMFAChallenge, pVarVerifyMFAChallenge, zh.b.a()), new o6.f(this, 17), i), new C1967a(this, 19), i4).e());
                }
            }
            y9.b bVar2 = ((MayaMfaFaceAuthFragment) ((x9.a) this.c.get())).f12936X;
            if (bVar2 != null) {
                ((MayaMfaActivity) bVar2).f12929p = null;
            }
        }
    }

    public boolean x(String str) {
        for (String str2 : ((com.paymaya.data.preference.a) this.f).e().mShopConfig().mTreatsNetworks()) {
            kotlin.jvm.internal.j.d(str2);
            int length = str2.length() - 1;
            int i = 0;
            boolean z4 = false;
            while (i <= length) {
                boolean z5 = kotlin.jvm.internal.j.i(str2.charAt(!z4 ? i : length), 32) <= 0;
                if (z4) {
                    if (!z5) {
                        break;
                    }
                    length--;
                } else if (z5) {
                    i++;
                } else {
                    z4 = true;
                }
            }
            if (zj.z.o(str2.subSequence(i, length + 1).toString(), str, true)) {
                return true;
            }
        }
        return false;
    }

    public void y() {
        BackUpIdentity backUpIdentityA = ((C1265j) this.f).a();
        if (backUpIdentityA != null) {
            MayaAccountRecoveryFragment mayaAccountRecoveryFragment = (MayaAccountRecoveryFragment) ((Rb.b) this.c.get());
            TextView textView = mayaAccountRecoveryFragment.f13917W;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mTextViewRegisteredRecoveryEmail");
                throw null;
            }
            textView.setText(backUpIdentityA.mValue());
            j jVarG1 = mayaAccountRecoveryFragment.G1();
            if (backUpIdentityA.mIsVerified() == null || !kotlin.jvm.internal.j.b(backUpIdentityA.mIsVerified(), Boolean.TRUE)) {
                MayaAccountRecoveryFragment mayaAccountRecoveryFragment2 = (MayaAccountRecoveryFragment) ((Rb.b) jVarG1.c.get());
                TextView textView2 = mayaAccountRecoveryFragment2.f13918X;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n("mTextViewRecoveryEmailStatus");
                    throw null;
                }
                TextViewCompat.setTextAppearance(textView2, R.style.JekoExtraBoldOverlineMedium_Error);
                TextView textView3 = mayaAccountRecoveryFragment2.f13918X;
                if (textView3 == null) {
                    kotlin.jvm.internal.j.n("mTextViewRecoveryEmailStatus");
                    throw null;
                }
                textView3.setText(mayaAccountRecoveryFragment2.getString(R.string.maya_label_account_recovery_unverified));
                Button button = ((MayaAccountRecoveryFragment) ((Rb.b) jVarG1.c.get())).f13919Y;
                if (button != null) {
                    button.setVisibility(0);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mButtonSendVerification");
                    throw null;
                }
            }
            MayaAccountRecoveryFragment mayaAccountRecoveryFragment3 = (MayaAccountRecoveryFragment) ((Rb.b) jVarG1.c.get());
            TextView textView4 = mayaAccountRecoveryFragment3.f13918X;
            if (textView4 == null) {
                kotlin.jvm.internal.j.n("mTextViewRecoveryEmailStatus");
                throw null;
            }
            TextViewCompat.setTextAppearance(textView4, R.style.JekoExtraBoldOverlineMedium_Accent);
            TextView textView5 = mayaAccountRecoveryFragment3.f13918X;
            if (textView5 == null) {
                kotlin.jvm.internal.j.n("mTextViewRecoveryEmailStatus");
                throw null;
            }
            textView5.setText(mayaAccountRecoveryFragment3.getString(R.string.maya_label_account_recovery_verified));
            Button button2 = ((MayaAccountRecoveryFragment) ((Rb.b) jVarG1.c.get())).f13919Y;
            if (button2 != null) {
                button2.setVisibility(8);
            } else {
                kotlin.jvm.internal.j.n("mButtonSendVerification");
                throw null;
            }
        }
    }

    public void z() {
        Ah.p<List<CreditConsent>> mayaCreditConsents;
        int i = 0;
        ((MayaCreditInterstitialActivity) ((M9.b) this.c.get())).Y1();
        C1264i0 c1264i0 = (C1264i0) this.f;
        if (c1264i0.i()) {
            mayaCreditConsents = c1264i0.c.getMayaCreditConsents(C1264i0.a(c1264i0));
            kotlin.jvm.internal.j.d(mayaCreditConsents);
        } else {
            mayaCreditConsents = c1264i0.f11449b.getMayaCreditConsents();
            kotlin.jvm.internal.j.d(mayaCreditConsents);
        }
        e(new Lh.d(new Lh.d(new Lh.h(mayaCreditConsents, zh.b.a(), i), new G6.w(this, 8), 2), new G6.r(this, 10), i).e());
    }

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.f219d = i;
        this.e = obj;
        this.f = obj2;
    }

    public /* synthetic */ j(Object obj, int i) {
        this.f219d = i;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, y5.f fVar, Uh.d dVar, int i) {
        super(dVar);
        this.f219d = i;
        this.e = obj;
        this.f = fVar;
    }

    public j(com.paymaya.data.preference.a mPreference, A5.m mFlagConfigurationLifecycleHandler) {
        this.f219d = 9;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(mFlagConfigurationLifecycleHandler, "mFlagConfigurationLifecycleHandler");
        this.e = mPreference;
        this.f = mFlagConfigurationLifecycleHandler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(P p10, Uh.d sessionPublishSubject) {
        super(sessionPublishSubject);
        this.f219d = 19;
        kotlin.jvm.internal.j.g(sessionPublishSubject, "sessionPublishSubject");
        this.e = p10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C1264i0 c1264i0, Uh.d payMayaErrorPublishSubject) {
        super(payMayaErrorPublishSubject);
        this.f219d = 10;
        kotlin.jvm.internal.j.g(payMayaErrorPublishSubject, "payMayaErrorPublishSubject");
        this.e = c1264i0;
    }

    public j(com.paymaya.data.preference.a mPreference, C1265j c1265j) {
        this.f219d = 1;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.e = mPreference;
        this.f = c1265j;
    }

    public j(C1261h c1261h, com.paymaya.data.preference.a mPreference) {
        this.f219d = 8;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.e = c1261h;
        this.f = mPreference;
    }

    public j(S5.c flagConfigurationService, A5.m flagConfigurationLifecycleHandler, com.paymaya.data.preference.a preference) {
        this.f219d = 12;
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        kotlin.jvm.internal.j.g(flagConfigurationLifecycleHandler, "flagConfigurationLifecycleHandler");
        kotlin.jvm.internal.j.g(preference, "preference");
        this.e = flagConfigurationService;
        this.f = flagConfigurationLifecycleHandler;
    }

    public j(C1250b0 c1250b0, com.paymaya.data.preference.a mPreference) {
        this.f219d = 17;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.e = c1250b0;
        this.f = mPreference;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C1281r0 c1281r0, com.paymaya.data.preference.a mPreference, Uh.d sessionPublishSubject) {
        super(sessionPublishSubject);
        this.f219d = 21;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(sessionPublishSubject, "sessionPublishSubject");
        this.e = c1281r0;
        this.f = mPreference;
    }

    public j(com.paymaya.data.preference.a mPreference, E0 e02) {
        this.f219d = 11;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.e = mPreference;
        this.f = e02;
    }

    public j(com.paymaya.data.preference.a mPreference, C1264i0 c1264i0) {
        this.f219d = 4;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.e = mPreference;
        this.f = c1264i0;
    }

    public j(S5.c mFlagConfigurationService, I0 i02, com.paymaya.data.preference.a mPreference) {
        this.f219d = 0;
        kotlin.jvm.internal.j.g(mFlagConfigurationService, "mFlagConfigurationService");
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.e = mFlagConfigurationService;
        this.f = i02;
    }

    public j(C1283s0 c1283s0, com.paymaya.data.preference.a mPreference) {
        this.f219d = 22;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.e = c1283s0;
        this.f = mPreference;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C1273n c1273n, com.paymaya.data.preference.a mPreference, Uh.d dVar) {
        super(dVar);
        this.f219d = 14;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.e = c1273n;
        this.f = mPreference;
    }

    public j(com.paymaya.data.preference.a mPreference, C1268k0 c1268k0) {
        this.f219d = 3;
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.e = mPreference;
        this.f = c1268k0;
    }

    public j(com.paymaya.data.preference.a aVar, S5.c cVar) {
        this.f219d = 23;
        this.e = cVar;
        this.f = C1129o.C(new String[]{"retry", "max_attempt", "mfa_with_fallback", "start_face_auth", "to_multi_type_otp", "catch_all_error"});
    }
}
