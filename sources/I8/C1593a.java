package i8;

import android.os.Bundle;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.domain.model.InboxMessage;
import com.paymaya.domain.model.ShopProvider;
import com.paymaya.mayaui.forgotpassword.view.activity.impl.MayaForgotPasswordActivity;
import com.paymaya.mayaui.forgotpassword.view.fragment.impl.MayaForgotPasswordEnterMinFragment;
import com.paymaya.mayaui.inbox.view.activity.impl.MayaInboxDetailsActivity;
import com.paymaya.mayaui.inbox.view.fragment.impl.MayaInboxDetailsFragment;
import com.paymaya.ui.dataprivacy.view.activity.impl.DataPrivacyActivity;
import com.paymaya.ui.dataprivacy.view.fragment.impl.DataAndPersonalizationFragment;
import com.paymaya.ui.dataprivacy.view.fragment.impl.DataPrivacyPolicyFragment;
import com.paymaya.ui.ekyc.view.activity.impl.EDDSearchActivity;
import com.paymaya.ui.ekyc.view.activity.impl.EKycPhotoCaptureActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDSearchFragment;
import com.paymaya.ui.ekyc.view.fragment.impl.EKycPhotoCaptureFragment;
import com.paymaya.ui.shopv3.view.activity.impl.ShopV3Activity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PaymentFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProviderProductsListFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProvidersCollectionFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PurchaseHistoryFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3SearchFragment;
import j8.InterfaceC1671a;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.j;
import td.InterfaceC2284b;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: renamed from: i8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1593a extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17123d;

    public /* synthetic */ C1593a(int i) {
        this.f17123d = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // y5.AbstractC2509a
    public void j() {
        EKycPhotoCaptureFragment eKycPhotoCaptureFragment;
        String lowerCase;
        String string;
        switch (this.f17123d) {
            case 0:
                super.j();
                MayaForgotPasswordActivity mayaForgotPasswordActivity = (MayaForgotPasswordActivity) ((InterfaceC1671a) this.c.get());
                mayaForgotPasswordActivity.getClass();
                AbstractC1236z.g(mayaForgotPasswordActivity, R.id.fragment_container, new MayaForgotPasswordEnterMinFragment());
                break;
            case 3:
                super.j();
                String str = ((DataPrivacyActivity) ((kd.a) this.c.get())).f14474l;
                j.d(str);
                if (!str.equalsIgnoreCase("settings")) {
                    DataPrivacyActivity dataPrivacyActivity = (DataPrivacyActivity) ((kd.a) this.c.get());
                    Bundle bundleD = c.d("source", dataPrivacyActivity.f14474l);
                    DataPrivacyPolicyFragment dataPrivacyPolicyFragment = new DataPrivacyPolicyFragment();
                    dataPrivacyPolicyFragment.setArguments(bundleD);
                    AbstractC1236z.g(dataPrivacyActivity, R.id.pma_activity_data_privacy_container, dataPrivacyPolicyFragment);
                } else {
                    DataPrivacyActivity dataPrivacyActivity2 = (DataPrivacyActivity) ((kd.a) this.c.get());
                    dataPrivacyActivity2.getClass();
                    AbstractC1236z.g(dataPrivacyActivity2, R.id.pma_activity_data_privacy_container, new DataAndPersonalizationFragment());
                }
                break;
            case 8:
                super.j();
                InboxMessage inboxMessage = (InboxMessage) ((MayaInboxDetailsActivity) ((q8.a) this.c.get())).getIntent().getParcelableExtra("message");
                if (inboxMessage != null) {
                    MayaInboxDetailsActivity mayaInboxDetailsActivity = (MayaInboxDetailsActivity) ((q8.a) this.c.get());
                    mayaInboxDetailsActivity.getClass();
                    MayaInboxDetailsFragment mayaInboxDetailsFragment = new MayaInboxDetailsFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("message", inboxMessage);
                    mayaInboxDetailsFragment.setArguments(bundle);
                    AbstractC1236z.g(mayaInboxDetailsActivity, R.id.inbox_details_fragment_container, mayaInboxDetailsFragment);
                }
                break;
            case 9:
                super.j();
                EDDSearchActivity eDDSearchActivity = (EDDSearchActivity) ((InterfaceC2284b) this.c.get());
                Bundle extras = eDDSearchActivity.getIntent().getExtras();
                if (extras != null) {
                    eDDSearchActivity.f14498k = extras.getString("title");
                    eDDSearchActivity.f14499l = extras.getInt(TtmlNode.ATTR_ID);
                    ArrayList<String> stringArrayList = extras.getStringArrayList("search_list");
                    if (stringArrayList == null) {
                        stringArrayList = new ArrayList<>();
                    }
                    ArrayList<String> stringArrayList2 = extras.getStringArrayList("selected_list");
                    if (stringArrayList2 == null) {
                        stringArrayList2 = new ArrayList<>();
                    }
                    boolean z4 = extras.getBoolean("has_other_option", false);
                    EDDSearchFragment eDDSearchFragment = new EDDSearchFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putStringArrayList("search_list", new ArrayList<>(stringArrayList));
                    bundle2.putStringArrayList("selected_list", new ArrayList<>(stringArrayList2));
                    bundle2.putBoolean("has_other_option", z4);
                    eDDSearchFragment.setArguments(bundle2);
                    AbstractC1236z.g(eDDSearchActivity, R.id.fragment_container_frame_layout_pma_activity_edd_search, eDDSearchFragment);
                }
                break;
            case 10:
                super.j();
                EKycPhotoCaptureActivity eKycPhotoCaptureActivity = (EKycPhotoCaptureActivity) ((td.c) this.c.get());
                String stringExtra = eKycPhotoCaptureActivity.getIntent().getStringExtra("capture_mode");
                boolean booleanExtra = eKycPhotoCaptureActivity.getIntent().getBooleanExtra("should_show_tutorial", false);
                String stringExtra2 = eKycPhotoCaptureActivity.getIntent().getStringExtra("id_type");
                if (stringExtra2 == null || C2576A.H(stringExtra2)) {
                    eKycPhotoCaptureFragment = new EKycPhotoCaptureFragment();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("capture_mode", stringExtra);
                    bundle3.putBoolean("should_show_tutorial", booleanExtra);
                    eKycPhotoCaptureFragment.setArguments(bundle3);
                } else {
                    eKycPhotoCaptureFragment = new EKycPhotoCaptureFragment();
                    Bundle bundleE = c.e("capture_mode", stringExtra, "id_type", stringExtra2);
                    bundleE.putBoolean("should_show_tutorial", booleanExtra);
                    eKycPhotoCaptureFragment.setArguments(bundleE);
                }
                AbstractC1236z.g(eKycPhotoCaptureActivity, R.id.container_pma_activity_ekyc_photo_capture_fragment, eKycPhotoCaptureFragment);
                break;
            case 12:
                super.j();
                Bundle extras2 = ((ShopV3Activity) ((te.a) this.c.get())).getIntent().getExtras();
                String string2 = extras2 != null ? extras2.getString("flow_to_screen") : null;
                if (string2 != null) {
                    lowerCase = string2.toLowerCase(Locale.ROOT);
                    j.f(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = null;
                }
                if (lowerCase != null) {
                    switch (lowerCase.hashCode()) {
                        case -1786842533:
                            if (lowerCase.equals("providers_collection")) {
                                ShopV3Activity shopV3Activity = (ShopV3Activity) ((te.a) this.c.get());
                                shopV3Activity.getClass();
                                AbstractC1236z.g(shopV3Activity, R.id.pma_activity_shop_v3_fragment_container, new ShopV3ProvidersCollectionFragment());
                                break;
                            }
                            break;
                        case -906336856:
                            if (lowerCase.equals("search")) {
                                ShopV3Activity shopV3Activity2 = (ShopV3Activity) ((te.a) this.c.get());
                                Bundle extras3 = shopV3Activity2.getIntent().getExtras();
                                Bundle bundleD2 = c.d("search_query", extras3 != null ? extras3.getString("search_query") : null);
                                ShopV3SearchFragment shopV3SearchFragment = new ShopV3SearchFragment();
                                shopV3SearchFragment.setArguments(bundleD2);
                                AbstractC1236z.g(shopV3Activity2, R.id.pma_activity_shop_v3_fragment_container, shopV3SearchFragment);
                                break;
                            }
                            break;
                        case -786681338:
                            if (lowerCase.equals("payment")) {
                                ShopV3Activity shopV3Activity3 = (ShopV3Activity) ((te.a) this.c.get());
                                Bundle extras4 = shopV3Activity3.getIntent().getExtras();
                                string = extras4 != null ? extras4.getString("product_id") : null;
                                ShopV3PaymentFragment shopV3PaymentFragment = new ShopV3PaymentFragment();
                                Bundle bundle4 = new Bundle();
                                bundle4.putString("product_id", string);
                                shopV3PaymentFragment.setArguments(bundle4);
                                AbstractC1236z.g(shopV3Activity3, R.id.pma_activity_shop_v3_fragment_container, shopV3PaymentFragment);
                            }
                            break;
                        case 489160534:
                            if (lowerCase.equals("purchase_history")) {
                                ShopV3Activity shopV3Activity4 = (ShopV3Activity) ((te.a) this.c.get());
                                Bundle extras5 = shopV3Activity4.getIntent().getExtras();
                                string = extras5 != null ? extras5.getString("status") : null;
                                ShopV3PurchaseHistoryFragment shopV3PurchaseHistoryFragment = new ShopV3PurchaseHistoryFragment();
                                Bundle bundle5 = new Bundle();
                                bundle5.putString("status", string);
                                shopV3PurchaseHistoryFragment.setArguments(bundle5);
                                AbstractC1236z.g(shopV3Activity4, R.id.pma_activity_shop_v3_fragment_container, shopV3PurchaseHistoryFragment);
                                break;
                            }
                            break;
                        case 1798024572:
                            if (lowerCase.equals("provider_product_list")) {
                                ShopV3Activity shopV3Activity5 = (ShopV3Activity) ((te.a) this.c.get());
                                Bundle extras6 = shopV3Activity5.getIntent().getExtras();
                                ShopProvider shopProvider = extras6 != null ? (ShopProvider) extras6.getParcelable("shop_provider") : null;
                                String str2 = ShopV3ProviderProductsListFragment.f14827o0;
                                Bundle bundle6 = new Bundle();
                                bundle6.putParcelable("shop_provider", shopProvider);
                                ShopV3ProviderProductsListFragment shopV3ProviderProductsListFragment = new ShopV3ProviderProductsListFragment();
                                shopV3ProviderProductsListFragment.setArguments(bundle6);
                                AbstractC1236z.g(shopV3Activity5, R.id.pma_activity_shop_v3_fragment_container, shopV3ProviderProductsListFragment);
                                shopV3Activity5.m1(shopProvider != null ? shopProvider.getDisplayName() : null);
                                break;
                            }
                            break;
                    }
                }
                break;
            default:
                super.j();
                break;
        }
    }
}
