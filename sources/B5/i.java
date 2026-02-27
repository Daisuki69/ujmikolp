package B5;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;
import androidx.core.app.TaskStackBuilder;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.R;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.V;
import com.paymaya.common.utility.b0;
import com.paymaya.domain.model.DataPrivacyProvision;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.domain.model.QRBankTransferRecipient;
import com.paymaya.domain.model.QRMerchant;
import com.paymaya.domain.model.QRPHMerchantPaymentRequest;
import com.paymaya.domain.model.QRRecipient;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.domain.store.C1282s;
import com.paymaya.mayaui.accountlimits.view.activity.impl.MayaAccountLimitsActivity;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaAnimatedFullScreenActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaFullScreenFlutterFragmentActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaPostLoginActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaSupportWebActivity;
import com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaShareSaveDialogFragment;
import com.paymaya.mayaui.creatorstore.view.activity.impl.MayaCreatorStoreActivity;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaSecurityFlutterScreen;
import com.paymaya.mayaui.dataprivacy.view.activity.impl.MayaDataPrivacyActivity;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaFavoriteActivity;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.loanscreditcard.view.activity.impl.MayaLoansCreditCardActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaLoginActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaRegistrationActivity;
import com.paymaya.mayaui.login.view.activity.impl.MayaWelcomeActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaDynamicMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.MayaCreditIneligibleActivity;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.profile.view.activity.impl.MayaProfileActivity;
import com.paymaya.mayaui.purchasefinancing.view.activity.impl.MayaPurchaseFinancingActivity;
import com.paymaya.mayaui.qr.view.activity.impl.MayaQRActivity;
import com.paymaya.mayaui.qr.view.activity.impl.MayaRequestMoneyActivity;
import com.paymaya.mayaui.referral.view.activity.impl.MayaReferralV2Activity;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.settings.view.activity.impl.MayaSettingsActivity;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopActivity;
import com.paymaya.mayaui.shop.view.activity.impl.MayaShopV2Activity;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUpdateProfileActivity;
import com.paymaya.mayaui.userprofileupdate.view.activity.impl.MayaUserProfileUpdateActivity;
import com.paymaya.mayaui.vouchers.view.activity.impl.MayaVouchersActivity;
import com.paymaya.ui.common.view.activity.impl.FullScreenFlutterActivity;
import com.paymaya.ui.common.view.activity.impl.ServiceUnavailableActivity;
import com.paymaya.ui.common.view.dialog.impl.ShareSaveDialogFragment;
import com.paymaya.ui.dataprivacy.view.activity.impl.DataPrivacyActivity;
import com.paymaya.ui.ekyc.view.activity.impl.EDDSearchActivity;
import com.paymaya.ui.login.view.activity.impl.DeepLinkActivity;
import com.paymaya.ui.login.view.activity.impl.LauncherActivity;
import com.paymaya.ui.qr.view.activity.impl.QRActivity;
import com.paymaya.ui.qr.view.activity.impl.RequestMoneyV3Activity;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.travel.view.activity.impl.TravelActivity;
import dOYHB6.yFtIp6.svM7M6;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function0;
import y5.AbstractActivityC2512d;
import y5.q;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.paymaya.data.preference.a f367a;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f369d;
    public final l e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.b f370g;
    public final S5.c h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f368b = new Handler();
    public final String[] i = {"https://support.maya.ph/s/", "https://support.mayabank.ph/s/", "https://support.mayabank.ph", "https://support.maya.ph"};
    public final String[] j = {"https://cares.paymaya.com/s/article/What-do-I-do-if-my-PayMaya-account-is-tagged-as-a-duplicate-one", "https://cares.paymaya.com/s/article/I-lost-the-SIM-and-or-phone-with-the-number-that-s-registered-to-my-PayMaya-account", "https://cares.paymaya.com/s/article/How-do-I-change-the-registered-mobile-number-in-my-PayMaya-account", "https://cares.paymaya.com/s/article/I-lost-the-SIM-and-or-phone-with-the-number-that-s-registered-to-my-PayMaya-account", "https://cares.paymaya.com/s/topic/0TO2y0000000CbuGAE/transport", "https://cares.paymaya.com/s/article/What-is-a-One-Time-PIN-OTP", "https://cares.paymaya.com/s/article/What-do-I-do-if-my-upgrade-application-was-put-on-hold-or-declined", "https://cares.paymaya.com/s/article/Account-Closure"};

    public i(Application application, com.paymaya.data.preference.a aVar, C1282s c1282s, l lVar, c cVar, d dVar, S5.c cVar2) {
        this.f367a = aVar;
        this.e = lVar;
        this.f = cVar;
        this.h = cVar2;
        application.registerActivityLifecycleCallbacks(new h(this, c1282s, dVar, application));
    }

    public static void A(y5.l lVar, List list, String str) {
        Intent intent = new Intent(lVar.getApplicationContext(), (Class<?>) MayaDataPrivacyActivity.class);
        intent.putExtra("consents", new ArrayList(list));
        intent.putExtra("source", str);
        if (str.equalsIgnoreCase("login")) {
            lVar.startActivity(intent);
        } else {
            lVar.startActivityForResult(intent, 100);
        }
    }

    public static void D(Activity activity, String str, String str2, Uri uri) {
        kotlin.jvm.internal.j.g(activity, "activity");
        ComponentName componentName = activity.getComponentName();
        Intent action = new Intent().setAction("android.intent.action.SEND");
        action.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE, activity.getPackageName());
        action.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE_INTEROP, activity.getPackageName());
        action.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY, componentName);
        action.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY_INTEROP, componentName);
        action.addFlags(524288);
        action.addFlags(1);
        action.setType(MimeTypes.IMAGE_JPEG);
        action.putExtra("android.intent.extra.TEXT", str2);
        action.putExtra("android.intent.extra.STREAM", uri);
        MayaShareSaveDialogFragment mayaShareSaveDialogFragment = new MayaShareSaveDialogFragment();
        Bundle bundleE = androidx.media3.datasource.cache.c.e("title", str, "filename", null);
        bundleE.putParcelable("intent", action);
        mayaShareSaveDialogFragment.setArguments(bundleE);
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity != null) {
            mayaShareSaveDialogFragment.show(fragmentActivity.getSupportFragmentManager(), "share");
        }
    }

    public static void E(MayaShopV2Activity mayaShopV2Activity, String str) {
        Intent intent = new Intent(mayaShopV2Activity.getApplicationContext(), (Class<?>) MayaShopV2Activity.class);
        intent.setData(mayaShopV2Activity.getIntent().getData());
        intent.putExtra("flow_to_screen", "payment");
        intent.putExtra("product_id", str);
        intent.putExtra("source_page", "Home");
        w0(mayaShopV2Activity, intent);
        v0(mayaShopV2Activity, intent);
        mayaShopV2Activity.startActivityForResult(intent, 500);
    }

    public static void F(MayaShopV2Activity mayaShopV2Activity) {
        Intent intent = new Intent(mayaShopV2Activity.getApplicationContext(), (Class<?>) MayaShopV2Activity.class);
        intent.setData(mayaShopV2Activity.getIntent().getData());
        intent.putExtra("flow_to_screen", "providers_collection");
        w0(mayaShopV2Activity, intent);
        v0(mayaShopV2Activity, intent);
        mayaShopV2Activity.startActivityForResult(intent, 500);
    }

    public static void H(Activity activity, String str) {
        Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) MayaShopV2Activity.class);
        intent.setData(activity.getIntent().getData());
        intent.addFlags(65536);
        intent.putExtra("flow_to_screen", "search");
        intent.putExtra("search_query", str);
        w0(activity, intent);
        v0(activity, intent);
        activity.startActivityForResult(intent, 500);
    }

    public static void I(AppCompatActivity appCompatActivity, QRMerchant qRMerchant, boolean z4) {
        Intent intent = new Intent(appCompatActivity.getApplicationContext(), (Class<?>) MayaMerchantActivity.class);
        intent.putExtra("merchant", qRMerchant);
        v0(appCompatActivity, intent);
        appCompatActivity.startActivity(intent);
        if (z4) {
            appCompatActivity.finish();
        }
    }

    public static void J(MayaDashboardActivity mayaDashboardActivity, String str, String str2) {
        Intent intentS0 = s0(mayaDashboardActivity);
        intentS0.putExtra("allowed_as_in_house_url", true);
        intentS0.putExtra("code", str);
        intentS0.putExtra("title", str2);
        intentS0.putExtra("has_session", true);
        mayaDashboardActivity.startActivity(intentS0);
    }

    public static void L(Activity activity, String str, String str2) {
        Intent intent = new Intent(activity, (Class<?>) MayaCreatorStoreActivity.class);
        intent.setData(activity.getIntent().getData());
        intent.putExtra("creator_store_category", str);
        intent.putExtra("creator_store_title", str2);
        v0(activity, intent);
        activity.startActivity(intent);
    }

    public static void M(Activity activity, String str) {
        boolean z4 = ((activity instanceof MayaSessionExpiredActivity) && !activity.isTaskRoot() && activity.getIntent().getData() == null) || !(activity instanceof Qc.b);
        Intent intent = new Intent(activity, (Class<?>) MayaPostLoginActivity.class);
        intent.setFlags(335544320);
        intent.putExtra("entry_point", str);
        intent.putExtra("is_session_timeout", z4);
        intent.setData(activity.getIntent().getData());
        v0(activity, intent);
        activity.startActivity(intent);
        activity.finish();
    }

    public static void N(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) MayaProfileActivity.class);
        intent.setData(activity.getIntent().getData());
        v0(activity, intent);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.pma_slide_in_from_left_short, R.anim.pma_hold);
    }

    public static void O(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) MayaPurchaseFinancingActivity.class);
        intent.putExtra("sub_route", str);
        intent.setData(activity.getIntent().getData());
        activity.startActivity(intent);
    }

    public static void P(AppCompatActivity appCompatActivity, QRPHMerchantPaymentRequest qRPHMerchantPaymentRequest, boolean z4) {
        Intent intent = new Intent(appCompatActivity.getApplicationContext(), (Class<?>) MayaQRPHMerchantActivity.class);
        intent.putExtra("qr_ph_merchant_payment_request", qRPHMerchantPaymentRequest);
        v0(appCompatActivity, intent);
        appCompatActivity.startActivity(intent);
        if (z4) {
            appCompatActivity.finish();
        }
    }

    public static void Q(Activity activity, String str, String str2, ActivityResultLauncher activityResultLauncher) {
        Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) MayaReferralV2Activity.class);
        intent.putExtra("route_page", str);
        intent.putExtra("source_page", str2);
        intent.putExtra("referral_type", DataPrivacyProvision.ID_WALLET);
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(intent);
        } else {
            activity.startActivity(intent);
        }
    }

    public static void S(Activity activity, String str, String str2, Function0 function0) {
        Function0 function02 = MayaSecurityFlutterScreen.f12178g;
        kotlin.jvm.internal.j.g(activity, "activity");
        FlutterEngine flutterEngine = FlutterEngineCache.getInstance().get("securityCenter");
        if (flutterEngine == null) {
            flutterEngine = new FlutterEngine(activity.getApplicationContext());
        }
        flutterEngine.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "runSecurityCenterTech"));
        FlutterEngineCache.getInstance().put("securityCenter", flutterEngine);
        MayaSecurityFlutterScreen.f12178g = function0;
        Intent intentBuild = new FlutterFragmentActivity.CachedEngineIntentBuilder(MayaSecurityFlutterScreen.class, "securityCenter").build(activity);
        intentBuild.putExtra("engineId", "securityCenter");
        intentBuild.putExtra("page_source", str);
        intentBuild.putExtra("page_button", str2);
        activity.startActivityForResult(intentBuild, 66);
    }

    public static void U(AppCompatActivity appCompatActivity, String str, String str2) {
        Intent intent = new Intent(appCompatActivity, (Class<?>) ServiceUnavailableActivity.class);
        intent.putExtra("unavailable_page_title", str);
        intent.putExtra("unavailable_description", str2);
        appCompatActivity.startActivity(intent);
    }

    public static void V(Activity activity, String str) {
        Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) MayaSettingsActivity.class);
        intent.putExtra("first_fragment", str);
        intent.setData(activity.getIntent().getData());
        v0(activity, intent);
        activity.startActivity(intent);
    }

    public static void W(Activity activity, String str, Uri uri) {
        kotlin.jvm.internal.j.g(activity, "activity");
        ComponentName componentName = activity.getComponentName();
        Intent action = new Intent().setAction("android.intent.action.SEND");
        action.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE, activity.getPackageName());
        action.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE_INTEROP, activity.getPackageName());
        action.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY, componentName);
        action.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY_INTEROP, componentName);
        action.addFlags(524288);
        action.addFlags(1);
        action.setType(MimeTypes.IMAGE_JPEG);
        String string = activity.getString(R.string.pma_label_share_or_save);
        action.putExtra("android.intent.extra.TEXT", str);
        action.putExtra("android.intent.extra.STREAM", uri);
        ShareSaveDialogFragment shareSaveDialogFragment = new ShareSaveDialogFragment();
        Bundle bundleE = androidx.media3.datasource.cache.c.e("title", string, "filename", null);
        bundleE.putParcelable("intent", action);
        shareSaveDialogFragment.setArguments(bundleE);
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity != null) {
            shareSaveDialogFragment.show(fragmentActivity.getSupportFragmentManager(), "share");
        }
    }

    public static void X(Activity activity, String str, String str2, Uri uri) {
        kotlin.jvm.internal.j.g(activity, "activity");
        ComponentName componentName = activity.getComponentName();
        Intent action = new Intent().setAction("android.intent.action.SEND");
        action.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE, activity.getPackageName());
        action.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE_INTEROP, activity.getPackageName());
        action.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY, componentName);
        action.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY_INTEROP, componentName);
        action.addFlags(524288);
        action.addFlags(1);
        action.setType(MimeTypes.IMAGE_JPEG);
        action.putExtra("android.intent.extra.TEXT", str2);
        action.putExtra("android.intent.extra.STREAM", uri);
        ShareSaveDialogFragment shareSaveDialogFragment = new ShareSaveDialogFragment();
        Bundle bundleE = androidx.media3.datasource.cache.c.e("title", str, "filename", null);
        bundleE.putParcelable("intent", action);
        shareSaveDialogFragment.setArguments(bundleE);
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity != null) {
            shareSaveDialogFragment.show(fragmentActivity.getSupportFragmentManager(), "share");
        }
    }

    public static void Z(MayaShopActivity mayaShopActivity, String str) {
        Intent intent = new Intent(mayaShopActivity.getApplicationContext(), (Class<?>) ShopV3Activity.class);
        intent.setData(mayaShopActivity.getIntent().getData());
        intent.putExtra("flow_to_screen", "payment");
        intent.putExtra("product_id", str);
        v0(mayaShopActivity, intent);
        mayaShopActivity.startActivityForResult(intent, 500);
    }

    public static void a0(MayaShopActivity mayaShopActivity, ShopProvider shopProvider) {
        Intent intent = new Intent(mayaShopActivity.getApplicationContext(), (Class<?>) ShopV3Activity.class);
        intent.setData(mayaShopActivity.getIntent().getData());
        intent.putExtra("flow_to_screen", "provider_product_list");
        intent.putExtra("shop_provider", shopProvider);
        v0(mayaShopActivity, intent);
        mayaShopActivity.startActivityForResult(intent, 500);
    }

    public static void b(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) MayaAccountLimitsActivity.class);
        intent.setData(activity.getIntent().getData());
        v0(activity, intent);
        activity.startActivity(intent);
    }

    public static void b0(MayaShopActivity mayaShopActivity) {
        Intent intent = new Intent(mayaShopActivity.getApplicationContext(), (Class<?>) ShopV3Activity.class);
        intent.setData(mayaShopActivity.getIntent().getData());
        intent.putExtra("flow_to_screen", "providers_collection");
        v0(mayaShopActivity, intent);
        mayaShopActivity.startActivityForResult(intent, 500);
    }

    public static void c(q qVar) {
        Intent intent = new Intent(qVar.getApplicationContext(), (Class<?>) MayaBankTransferActivity.class);
        intent.setData(qVar.getIntent().getData());
        intent.putExtra("source_page", "Dashboard");
        v0(qVar, intent);
        qVar.startActivity(intent);
    }

    public static void c0(MayaShopActivity mayaShopActivity, String str) {
        Intent intent = new Intent(mayaShopActivity.getApplicationContext(), (Class<?>) ShopV3Activity.class);
        intent.setData(mayaShopActivity.getIntent().getData());
        intent.putExtra("flow_to_screen", "search");
        intent.putExtra("search_query", str);
        v0(mayaShopActivity, intent);
        mayaShopActivity.startActivityForResult(intent, 500);
    }

    public static void d(AppCompatActivity appCompatActivity, QRBankTransferRecipient qRBankTransferRecipient) {
        Intent intent = new Intent(appCompatActivity.getApplicationContext(), (Class<?>) MayaBankTransferActivity.class);
        intent.setData(appCompatActivity.getIntent().getData());
        intent.putExtra("bank_recipient", qRBankTransferRecipient);
        intent.putExtra("shortcut", false);
        intent.putExtra("is_from_qr", true);
        intent.putExtra("source_page", "QR Scanner Screen");
        v0(appCompatActivity, intent);
        appCompatActivity.startActivity(intent);
        appCompatActivity.finish();
    }

    public static void d0(q qVar, PurchasedTicket purchasedTicket) {
        Intent intent = new Intent(qVar, (Class<?>) TravelActivity.class);
        intent.setData(qVar.getIntent().getData());
        intent.putExtra("purchased_ticket", purchasedTicket);
        v0(qVar, intent);
        qVar.startActivity(intent);
        qVar.finish();
    }

    public static void e(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) MayaPayBillsActivity.class);
        intent.setData(activity.getIntent().getData());
        v0(activity, intent);
        intent.putExtra("is_redirect_to_pay_bills_form", true);
        if (activity.getIntent().getBooleanExtra("should_dismiss_flutter_engine", false)) {
            intent.putExtra("should_dismiss_flutter_engine", true);
        }
        activity.startActivityForResult(intent, 200);
    }

    public static void e0(MayaLoansCreditCardActivity mayaLoansCreditCardActivity, String str, String str2) {
        Intent intent = new Intent(mayaLoansCreditCardActivity.getApplicationContext(), (Class<?>) MayaUpdateProfileActivity.class);
        intent.putExtra("FRAGMENT_TO_OPEN", str);
        intent.putExtra("SOURCE_SCREEN", str2);
        intent.putExtra("PRODUCT_CODE", "");
        intent.putExtra("CARD_TYPE", "");
        intent.putExtra("DESTINATION_SCREEN", "");
        mayaLoansCreditCardActivity.startActivityForResult(intent, 321);
    }

    public static void f(Activity activity, String str) {
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public static void f0(Activity activity, String str, String str2) {
        Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) MayaUserProfileUpdateActivity.class);
        intent.putExtra("FRAGMENT_TO_OPEN", str);
        intent.putExtra("SOURCE_SCREEN", str2);
        activity.startActivityForResult(intent, 321);
    }

    public static void g(Activity activity) {
        Intent intentBuild = new FlutterFragmentActivity.CachedEngineIntentBuilder(MayaFullScreenFlutterFragmentActivity.class, "checkoutFullscreen").build(activity.getApplicationContext());
        intentBuild.putExtra("engineId", "checkoutFullscreen");
        activity.startActivityForResult(intentBuild, 500);
    }

    public static void g0(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) MayaVouchersActivity.class);
        intent.putExtra("voucher_code", str);
        intent.setData(activity.getIntent().getData());
        v0(activity, intent);
        activity.startActivity(intent);
    }

    public static void h(Activity activity) {
        Intent intentBuild = new FlutterActivity.CachedEngineIntentBuilder(FullScreenFlutterActivity.class, "creditScoringFullscreen").backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.transparent).build(activity);
        intentBuild.putExtra("applyTransition", false);
        intentBuild.putExtra("engineId", "creditScoringFullscreen");
        activity.startActivity(intentBuild);
    }

    public static void h0(Activity activity) {
        Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) MayaCashInActivity.class);
        intent.setData(activity.getIntent().getData());
        intent.putExtra("action", "wallet_settings");
        v0(activity, intent);
        activity.startActivity(intent);
    }

    public static void i(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) MayaDashboardActivity.class);
        intent.setFlags(335544320);
        v0(activity, intent);
        activity.startActivity(intent);
        activity.finish();
    }

    public static void j(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) MayaDashboardActivity.class));
        activity.finishAffinity();
    }

    public static void k(Activity activity, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        b0 b0Var = AttributionSource.f10367b;
        intent.setData(Uri.parse(C.d(str, "extra_attribution_source", "organic")));
        activity.startActivity(intent);
    }

    public static void l(Activity activity, String str, AttributionSource attributionSource) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(C.d(str, "extra_attribution_source", attributionSource.f10371a)));
        activity.startActivity(intent);
    }

    public static void m(AppCompatActivity appCompatActivity, QRMerchant qRMerchant, boolean z4) {
        Intent intent = new Intent(appCompatActivity.getApplicationContext(), (Class<?>) MayaDynamicMerchantActivity.class);
        intent.putExtra("merchant", qRMerchant);
        v0(appCompatActivity, intent);
        appCompatActivity.startActivity(intent);
        if (z4) {
            appCompatActivity.finish();
        }
    }

    public static void m0(Activity activity, String str, String str2) {
        Intent intentS0 = s0(activity);
        intentS0.putExtra("web_url", str);
        intentS0.putExtra("title", "");
        intentS0.putExtra("has_session", true);
        intentS0.putExtra("inbox_event_attributes", str2);
        activity.startActivity(intentS0);
    }

    public static void n(q qVar, String str, boolean z4) {
        Intent intent = new Intent(qVar.getApplicationContext(), (Class<?>) MayaDynamicMerchantActivity.class);
        intent.putExtra("payment_id", str);
        intent.putExtra("is_from_webview", z4);
        v0(qVar, intent);
        qVar.startActivity(intent);
    }

    public static void o(Activity activity, int i, String str, ArrayList arrayList, ArrayList arrayList2, boolean z4) {
        Intent intent = new Intent(activity, (Class<?>) EDDSearchActivity.class);
        intent.putExtra(TtmlNode.ATTR_ID, i);
        intent.putExtra("title", str);
        intent.putStringArrayListExtra("search_list", arrayList);
        intent.putStringArrayListExtra("selected_list", arrayList2);
        intent.putExtra("has_other_option", z4);
        activity.startActivityForResult(intent, 900);
    }

    public static void p(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) MayaFavoriteActivity.class);
        intent.setData(Uri.parse("paymaya://favorites?type=".concat(str)));
        v0(activity, intent);
        activity.startActivity(intent);
    }

    public static Intent q0(Activity activity) {
        return new Intent(activity.getApplicationContext(), (Class<?>) MayaWelcomeActivity.class);
    }

    public static void r(q qVar, boolean z4, boolean z5, EnumC1216e enumC1216e) {
        Intent intent = new Intent(qVar, (Class<?>) MayaCreditIneligibleActivity.class);
        intent.putExtra("analytic_screen_event", enumC1216e.f10904a);
        intent.putExtra("use_deeplink_to_credit", z5);
        qVar.startActivity(intent);
        if (z4) {
            qVar.finish();
        }
    }

    public static Intent s0(Activity activity) {
        return new Intent(activity.getApplicationContext(), (Class<?>) MayaWebActivity.class);
    }

    public static void v0(Activity activity, Intent intent) {
        intent.putExtra("extra_attribution_source", activity.getIntent().getParcelableExtra("extra_attribution_source"));
        activity.getIntent().removeExtra("extra_attribution_source");
    }

    public static void w0(Activity activity, Intent intent) {
        intent.putExtra("origin_screen", activity.getIntent().getStringExtra("origin_screen"));
    }

    public static void y(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) MayaLoansCreditCardActivity.class);
        intent.putExtra("sub_route", str);
        intent.setData(activity.getIntent().getData());
        activity.startActivity(intent);
    }

    public final void B(y5.l lVar, ArrayList arrayList, String str) {
        if (this.h.a(A5.b.f83V0)) {
            A(lVar, arrayList, str);
            return;
        }
        Intent intent = new Intent(lVar.getApplicationContext(), (Class<?>) DataPrivacyActivity.class);
        intent.putExtra("consents", new ArrayList(arrayList));
        intent.putExtra("source", str);
        if (str.equalsIgnoreCase("login")) {
            lVar.startActivity(intent);
        } else {
            lVar.startActivityForResult(intent, 100);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(Activity activity, ActivityResultLauncher activityResultLauncher, String str, Boolean bool, V[] vArr, Boolean bool2, String str2) {
        Intent intent;
        if (this.f367a.e().isMayaScanQREnabled()) {
            intent = new Intent(activity.getApplicationContext(), (Class<?>) MayaQRActivity.class);
            intent.putExtra("action", "scan");
            intent.putExtra("should_redirect_to_previous_activity", bool);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            intent.putExtra("source_page", str);
            intent.putExtra("allowed_qrph_code_types", (Serializable) vArr);
            intent.putExtra("is_show_qr_button_visible", bool2);
            intent.putExtra("qr_scanner_header_title", str2);
        } else {
            intent = new Intent(activity.getApplicationContext(), (Class<?>) QRActivity.class);
            intent.putExtra("action", "scan");
        }
        activityResultLauncher.launch(intent);
    }

    public final void G(MayaShopV2Activity mayaShopV2Activity, String str) {
        com.paymaya.data.preference.a aVar = this.f367a;
        if (!aVar.e().isShopPurchaseHistoryAvailable()) {
            U(mayaShopV2Activity, mayaShopV2Activity.getString(R.string.pma_label_toolbar_title_shop_purchase_history), aVar.e().mMaintenanceConfig().mServiceAvailabilityConfig().mShopPurchaseHistoryAvailability().mMessage());
            return;
        }
        Intent intent = new Intent(mayaShopV2Activity.getApplicationContext(), (Class<?>) MayaShopV2Activity.class);
        intent.setData(mayaShopV2Activity.getIntent().getData());
        intent.putExtra("flow_to_screen", "purchase_history");
        intent.putExtra("status", str);
        v0(mayaShopV2Activity, intent);
        mayaShopV2Activity.startActivityForResult(intent, 500);
    }

    public final void K(Activity activity) {
        Intent intent;
        com.paymaya.data.preference.a aVar = this.f367a;
        if (aVar.e().isMayaV2RequestMoneyEnabled()) {
            intent = new Intent(activity, (Class<?>) MayaRequestMoneyActivity.class);
        } else if (aVar.e().isRequestMoneyV2Enabled()) {
            intent = new Intent(activity, (Class<?>) RequestMoneyV3Activity.class);
        } else {
            intent = new Intent(activity.getApplicationContext(), (Class<?>) QRActivity.class);
            intent.putExtra("action", "myQR");
        }
        activity.startActivity(intent);
    }

    public final void R(AppCompatActivity appCompatActivity) {
        Intent intentR0 = r0(appCompatActivity);
        intentR0.setData(appCompatActivity.getIntent().getData());
        v0(appCompatActivity, intentR0);
        if (!(appCompatActivity instanceof LauncherActivity) && !(appCompatActivity instanceof DeepLinkActivity)) {
            appCompatActivity.startActivity(intentR0);
            return;
        }
        Intent intentQ0 = q0(appCompatActivity);
        intentQ0.setFlags(268468224);
        TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(appCompatActivity);
        taskStackBuilderCreate.addNextIntent(intentQ0);
        taskStackBuilderCreate.addNextIntent(intentR0);
        taskStackBuilderCreate.startActivities();
        appCompatActivity.finish();
    }

    public final void T(AppCompatActivity appCompatActivity, QRRecipient qRRecipient) {
        if (!this.f367a.e().isSendMoneyAvailable()) {
            U(appCompatActivity, appCompatActivity.getString(R.string.pma_label_send_money), this.f367a.e().mMaintenanceConfig().mServiceAvailabilityConfig().mSendMoneyAvailability().mMessage());
            return;
        }
        Intent intent = new Intent(appCompatActivity, (Class<?>) MayaSendMoneyActivity.class);
        intent.putExtra("recipient", qRRecipient);
        intent.putExtra("shortcut", false);
        intent.putExtra("source_page", "QR Scanner Screen");
        appCompatActivity.startActivity(intent);
        appCompatActivity.finish();
    }

    public final void Y(AppCompatActivity appCompatActivity, String str) {
        com.paymaya.data.preference.a aVar = this.f367a;
        if (!aVar.e().isShopPurchaseHistoryAvailable()) {
            U(appCompatActivity, appCompatActivity.getString(R.string.pma_label_toolbar_title_shop_purchase_history), aVar.e().mMaintenanceConfig().mServiceAvailabilityConfig().mShopPurchaseHistoryAvailability().mMessage());
            return;
        }
        Intent intent = new Intent(appCompatActivity.getApplicationContext(), (Class<?>) ShopV3Activity.class);
        intent.setData(appCompatActivity.getIntent().getData());
        intent.putExtra("flow_to_screen", "purchase_history");
        intent.putExtra("status", str);
        v0(appCompatActivity, intent);
        appCompatActivity.startActivityForResult(intent, 500);
    }

    public final void a() {
        this.e.b();
    }

    public final void i0(Activity activity, String str, String str2) {
        Intent intentT0 = t0(activity, str);
        intentT0.putExtra("web_url", str);
        intentT0.putExtra("title", str2);
        intentT0.putExtra("has_session", true);
        activity.startActivity(intentT0);
    }

    public final void j0(AppCompatActivity appCompatActivity, String str, String str2) {
        Intent intentT0 = t0(appCompatActivity, str);
        intentT0.putExtra("web_url", str);
        intentT0.putExtra("title", str2);
        intentT0.putExtra("has_session", false);
        appCompatActivity.startActivity(intentT0);
    }

    public final void k0(Activity activity, String str) {
        Intent intentT0 = t0(activity, str);
        intentT0.putExtra("web_url", str);
        intentT0.putExtra("title", "");
        intentT0.putExtra("has_session", true);
        activity.startActivity(intentT0);
    }

    public final void l0(FragmentActivity fragmentActivity, String str) {
        Boolean bool = Boolean.FALSE;
        Intent intentT0 = t0(fragmentActivity, str);
        intentT0.putExtra("web_url", str);
        intentT0.putExtra("title", "");
        intentT0.putExtra("has_session", bool);
        fragmentActivity.startActivity(intentT0);
    }

    public final void n0(Activity activity, ActivityResultLauncher activityResultLauncher, String str) {
        Boolean bool = Boolean.FALSE;
        Intent intentT0 = t0(activity, "https://support.maya.ph/s/");
        intentT0.putExtra("web_url", "https://support.maya.ph/s/");
        intentT0.putExtra("title", "");
        intentT0.putExtra("has_session", bool);
        intentT0.putExtra("source", str);
        activityResultLauncher.launch(intentT0);
    }

    public final Intent o0(Activity activity) {
        com.paymaya.data.preference.a aVar = this.f367a;
        if (aVar.e().isPartnerOnboardingEnabled() && !svM7M6.getString(aVar.f11330b, "key_maya_kyc_onboarding_entry_point", "").isEmpty()) {
            return p0(activity, svM7M6.getString(aVar.f11330b, "key_maya_kyc_onboarding_entry_point", ""));
        }
        Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) MayaKycActivity.class);
        EnumC1215d enumC1215dQ1 = EnumC1215d.DEFAULT;
        if (activity instanceof AbstractActivityC2512d) {
            enumC1215dQ1 = ((AbstractActivityC2512d) activity).k1();
        } else if (activity instanceof q) {
            enumC1215dQ1 = ((q) activity).q1();
        }
        intent.putExtra("cta_source", enumC1215dQ1);
        return intent;
    }

    public final Intent p0(Activity activity, String str) {
        this.f367a.e0(str);
        Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) MayaKycActivity.class);
        EnumC1215d enumC1215dQ1 = EnumC1215d.DEFAULT;
        if (activity instanceof AbstractActivityC2512d) {
            enumC1215dQ1 = ((AbstractActivityC2512d) activity).k1();
        } else if (activity instanceof q) {
            enumC1215dQ1 = ((q) activity).q1();
        }
        intent.putExtra("cta_source", enumC1215dQ1);
        return intent;
    }

    public final void q(Activity activity) {
        if (((activity instanceof MayaSessionExpiredActivity) && !activity.isTaskRoot() && activity.getIntent().getData() == null) || !(activity instanceof Qc.b)) {
            activity.finish();
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) MayaDashboardActivity.class);
        intent.setFlags(335544320);
        intent.setData(activity.getIntent().getData());
        if (activity instanceof MayaLoginActivity) {
            com.paymaya.data.preference.a aVar = this.f367a;
            if (!svM7M6.getString(aVar.f11330b, "key_deeplink", "").isEmpty()) {
                intent.setData(Uri.parse(svM7M6.getString(aVar.f11330b, "key_deeplink", "")));
                androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_deeplink", "");
            }
        }
        v0(activity, intent);
        activity.startActivity(intent);
        activity.finish();
    }

    public final Intent r0(AppCompatActivity appCompatActivity) {
        return this.h.a(A5.b.f53B1) ? new Intent(appCompatActivity.getApplicationContext(), (Class<?>) MayaRegistrationV2Activity.class) : new Intent(appCompatActivity.getApplicationContext(), (Class<?>) MayaRegistrationActivity.class);
    }

    public final void s(Activity activity, boolean z4) {
        Intent intentO0 = o0(activity);
        intentO0.setData(activity.getIntent().getData());
        v0(activity, intentO0);
        activity.startActivity(intentO0);
        if (z4) {
            activity.finish();
        }
    }

    public final void t(AppCompatActivity appCompatActivity, String str) {
        Intent intentT0 = t0(appCompatActivity, str);
        intentT0.putExtra("web_url", str);
        intentT0.putExtra("title", "");
        intentT0.putExtra("limit_links", true);
        intentT0.putExtra("use_web_title", true);
        intentT0.putExtra("has_session", true);
        appCompatActivity.startActivity(intentT0);
    }

    public final Intent t0(Activity activity, String str) {
        String[] strArr = this.i;
        int length = strArr.length;
        boolean z4 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (str.contains(strArr[i])) {
                z4 = true;
                break;
            }
            i++;
        }
        return (z4 || Arrays.asList(this.j).contains(str)) ? new Intent(activity.getApplicationContext(), (Class<?>) MayaSupportWebActivity.class) : new Intent(activity.getApplicationContext(), (Class<?>) MayaWebActivity.class);
    }

    public final void u(Activity activity, String str, String str2) {
        Intent intentT0 = t0(activity, str);
        intentT0.putExtra("web_url", str);
        intentT0.putExtra("title", str2);
        intentT0.putExtra("limit_links", true);
        intentT0.putExtra("has_session", true);
        activity.startActivity(intentT0);
    }

    public final void u0(Activity activity) {
        l lVar = this.e;
        lVar.getClass();
        kotlin.jvm.internal.j.g(activity, "activity");
        if ((activity instanceof Qc.b) || lVar.f) {
            return;
        }
        k kVar = lVar.e;
        if (kVar != null) {
            kVar.cancel();
        }
        lVar.a(activity);
        k kVar2 = lVar.e;
        if (kVar2 != null) {
            kVar2.start();
        }
    }

    public final void v(Activity activity, String str, String str2) {
        Intent intentT0 = t0(activity, str);
        intentT0.putExtra("web_url", str);
        intentT0.putExtra("title", str2);
        intentT0.putExtra("limit_links", true);
        intentT0.putExtra("has_session", true);
        intentT0.putExtra("use_file_access", true);
        activity.startActivity(intentT0);
    }

    public final void w(Activity activity, String str) {
        Intent intentT0 = t0(activity, str);
        intentT0.putExtra("web_url", str);
        intentT0.putExtra("title", "");
        intentT0.putExtra("limit_links", true);
        intentT0.putExtra("has_session", true);
        activity.startActivity(intentT0);
    }

    public final void x(Activity activity, String str, Boolean bool, boolean z4) {
        Intent intentT0 = t0(activity, str);
        intentT0.putExtra("web_url", str);
        intentT0.putExtra("title", "");
        intentT0.putExtra("limit_links", true);
        intentT0.putExtra("has_session", bool);
        intentT0.putExtra("should_bypass_maintenance", z4);
        activity.startActivity(intentT0);
    }

    public final void z(Activity activity) {
        Intent intent = new Intent(activity.getApplicationContext(), (Class<?>) MayaLoginActivity.class);
        Intent intentQ0 = q0(activity);
        if (activity instanceof DeepLinkActivity) {
            intentQ0.setData(activity.getIntent().getData());
            intent.setData(activity.getIntent().getData());
            v0(activity, intent);
        }
        intentQ0.setFlags(268468224);
        TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(activity);
        taskStackBuilderCreate.addNextIntent(intentQ0);
        if (this.f367a.E()) {
            taskStackBuilderCreate.addNextIntent(intent);
        } else {
            Intent intent2 = new Intent(activity, (Class<?>) MayaAnimatedFullScreenActivity.class);
            intent2.putExtra("extra_next_activity", MayaLoginActivity.class.getName());
            taskStackBuilderCreate.addNextIntent(intent2);
        }
        taskStackBuilderCreate.startActivities();
        activity.finish();
    }
}
