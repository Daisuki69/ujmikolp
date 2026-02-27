package l9;

import G5.t;
import M8.C0332a;
import N5.k1;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.dynatrace.agent.events.enrichment.sanitation.AttributeRetentionRule;
import com.dynatrace.agent.events.enrichment.sanitation.AttributeSanitizer;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttribute;
import com.dynatrace.agent.events.enrichment.sanitation.JsonAttributeSanitationKt;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.g0;
import com.paymaya.common.utility.h0;
import com.paymaya.domain.model.InboxMessage;
import com.paymaya.domain.store.C1250b0;
import com.paymaya.mayaui.cryptocurrency.view.activity.impl.CryptocurrencyV2Activity;
import com.paymaya.mayaui.inbox.view.activity.impl.MayaInboxDetailsActivity;
import com.paymaya.mayaui.inbox.view.fragment.impl.MayaInboxDetailsFragment;
import com.paymaya.mayaui.inbox.view.fragment.impl.MayaInboxFragment;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentReceiptFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaV2MerchantPaymentReceiptFragment;
import com.paymaya.mayaui.profile.view.activity.impl.MayaProfileActivity;
import com.paymaya.mayaui.profile.view.fragment.impl.BaseMayaProfileFragment;
import com.paymaya.mayaui.rewardscatalog.view.fragment.MayaRewardsCatalogFragment;
import com.paymaya.mayaui.score.view.activity.impl.MayaScoreActivity;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PageFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ProvidersCollectionFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PurchaseHistoryPageFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3ReceiptFragment;
import io.split.android.client.dtos.TargetingRulesChange;
import java.io.File;
import java.util.LinkedHashMap;
import ma.C1859a;
import o9.InterfaceC1970a;
import o9.InterfaceC1972c;
import p9.InterfaceC2030o;
import pb.InterfaceC2031a;
import pg.r;
import pg.s;
import qb.C2168a;
import rc.C2194a;
import rc.C2196c;
import s6.InterfaceC2240a;
import wc.InterfaceC2390a;
import wc.InterfaceC2392c;

/* JADX INFO: renamed from: l9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1803a implements Ch.a, OnCompleteListener, s, g0, OnSuccessListener, t, Toolbar.OnMenuItemClickListener, ug.c, AttributeSanitizer, SwipeRefreshLayout.OnRefreshListener, OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18254b;

    public /* synthetic */ C1803a(Object obj, int i) {
        this.f18253a = i;
        this.f18254b = obj;
    }

    @Override // ug.c
    public boolean a(View view) {
        int i = 0;
        while (true) {
            Class[] clsArr = (Class[]) this.f18254b;
            if (i >= clsArr.length) {
                return false;
            }
            if (clsArr[i].isInstance(view)) {
                return true;
            }
            i++;
        }
    }

    @Override // com.paymaya.common.utility.g0
    public void b(File file) {
        switch (this.f18253a) {
            case 9:
                h0.g(((MayaMerchantPaymentReceiptFragment) this.f18254b).getActivity(), "Share Receipt", file);
                break;
            case 10:
            default:
                h0.g(((ShopV3ReceiptFragment) this.f18254b).getActivity(), "Share Receipt", file);
                break;
            case 11:
                MayaV2MerchantPaymentReceiptFragment mayaV2MerchantPaymentReceiptFragment = (MayaV2MerchantPaymentReceiptFragment) this.f18254b;
                InterfaceC2030o interfaceC2030o = mayaV2MerchantPaymentReceiptFragment.f12924x0;
                if (interfaceC2030o != null) {
                    interfaceC2030o.B("Share Receipt", h0.c(mayaV2MerchantPaymentReceiptFragment.getActivity(), file));
                }
                break;
        }
    }

    public TargetingRulesChange c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(CmcdData.Factory.STREAMING_FORMAT_SS, "1.3");
        linkedHashMap.put("since", -1);
        linkedHashMap.put("rbSince", -1);
        return (TargetingRulesChange) ((U8.c) this.f18254b).k(linkedHashMap, io.split.android.client.network.l.f17603b);
    }

    @Override // G5.t
    public void m(String str, View view) {
        switch (this.f18253a) {
            case 18:
                MayaInboxDetailsFragment mayaInboxDetailsFragment = (MayaInboxDetailsFragment) this.f18254b;
                C1220i c1220iO1 = mayaInboxDetailsFragment.o1();
                InboxMessage inboxMessage = mayaInboxDetailsFragment.f12405X;
                c1220iO1.e(inboxMessage != null ? inboxMessage.mId() : null);
                t8.b bVar = mayaInboxDetailsFragment.f12404W;
                if (bVar != null) {
                    MayaInboxDetailsActivity mayaInboxDetailsActivity = (MayaInboxDetailsActivity) bVar;
                    mayaInboxDetailsActivity.e.k0(mayaInboxDetailsActivity, str);
                }
                break;
            default:
                kotlin.jvm.internal.j.d(str);
                ((com.squareup.wire.internal.a) this.f18254b).invoke(str);
                break;
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        kotlin.jvm.internal.j.g(insets, "insets");
        ((MayaBaseFragment) this.f18254b).f10339S = insets.getSystemWindowInsetTop();
        return WindowInsetsCompat.CONSUMED;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        C0332a c0332a = (C0332a) this.f18254b;
        kotlin.jvm.internal.j.g(task, "task");
        c0332a.invoke();
    }

    @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.pma_menu_inbox_mark_all_as_read) {
            return false;
        }
        MayaInboxFragment mayaInboxFragment = (MayaInboxFragment) this.f18254b;
        C1220i c1220iO1 = mayaInboxFragment.o1();
        FragmentActivity activity = mayaInboxFragment.getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.INBOX);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.OPTION);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hD.j.put("option", "mark all as read");
        c1220iO1.c(activity, c1219hD);
        A7.j jVar = mayaInboxFragment.f12407V;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("mInboxFragmentPresenter");
            throw null;
        }
        C1250b0 c1250b0 = (C1250b0) jVar.e;
        if (!c1250b0.b()) {
            return false;
        }
        c1250b0.c();
        return false;
    }

    @Override // pg.s
    public void onMethodCall(r methodCall, pg.t result) {
        Object obj = this.f18254b;
        switch (this.f18253a) {
            case 5:
                int i = MayaMerchantActivity.f12845s;
                MayaMerchantActivity mayaMerchantActivity = (MayaMerchantActivity) obj;
                mayaMerchantActivity.getClass();
                new Handler(Looper.getMainLooper()).post(new androidx.work.impl.b(20, methodCall, mayaMerchantActivity, result));
                break;
            case 6:
                int i4 = MayaQRPHMerchantActivity.f12851t;
                MayaQRPHMerchantActivity mayaQRPHMerchantActivity = (MayaQRPHMerchantActivity) obj;
                mayaQRPHMerchantActivity.getClass();
                new Handler(Looper.getMainLooper()).post(new androidx.work.impl.b(21, methodCall, mayaQRPHMerchantActivity, result));
                break;
            case 26:
                int i6 = MayaScoreActivity.f13733p;
                kotlin.jvm.internal.j.g(methodCall, "methodCall");
                kotlin.jvm.internal.j.g(result, "result");
                MayaScoreActivity mayaScoreActivity = (MayaScoreActivity) obj;
                mayaScoreActivity.getClass();
                new Handler(Looper.getMainLooper()).post(new androidx.work.impl.b(24, methodCall, mayaScoreActivity, result));
                break;
            default:
                int i10 = CryptocurrencyV2Activity.f12131o;
                new Handler(Looper.getMainLooper()).post(new androidx.work.impl.b(25, methodCall, (CryptocurrencyV2Activity) obj, result));
                break;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        switch (this.f18253a) {
            case 23:
                ShopV3ProvidersCollectionFragment shopV3ProvidersCollectionFragment = (ShopV3ProvidersCollectionFragment) this.f18254b;
                Callback.onRefresh_enter();
                try {
                    ShopV3ProvidersCollectionFragment.D1(shopV3ProvidersCollectionFragment);
                    return;
                } finally {
                }
            default:
                ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment = (ShopV3PurchaseHistoryPageFragment) this.f18254b;
                Callback.onRefresh_enter();
                try {
                    shopV3PurchaseHistoryPageFragment.A1().k();
                    return;
                } finally {
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f18253a) {
            case 10:
                ((com.squareup.wire.internal.a) this.f18254b).invoke(obj);
                break;
            default:
                ((com.squareup.wire.internal.a) this.f18254b).invoke(obj);
                break;
        }
    }

    @Override // Ch.a
    public void run() {
        switch (this.f18253a) {
            case 0:
                ((MayaBaseFragment) ((InterfaceC1970a) ((C1804b) this.f18254b).c.get())).w1();
                return;
            case 1:
                ((MayaBaseFragment) ((InterfaceC1972c) ((C1804b) this.f18254b).c.get())).w1();
                return;
            case 2:
                ((MayaBaseFragment) ((o9.g) ((Bb.f) this.f18254b).c.get())).w1();
                return;
            case 3:
                C1859a c1859a = (C1859a) this.f18254b;
                ((MayaBaseFragment) ((pa.a) c1859a.c.get())).w1();
                qa.d dVar = ((BaseMayaProfileFragment) ((pa.a) c1859a.c.get())).f13505L0;
                if (dVar != null) {
                    MayaProfileActivity mayaProfileActivity = (MayaProfileActivity) dVar;
                    mayaProfileActivity.n1().z(mayaProfileActivity);
                    return;
                }
                return;
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            default:
                ShopV3PageFragment shopV3PageFragment = (ShopV3PageFragment) ((ve.d) ((Xb.h) this.f18254b).c.get());
                shopV3PageFragment.f14811j0 = false;
                k1 k1Var = shopV3PageFragment.f14802a0;
                kotlin.jvm.internal.j.d(k1Var);
                SwipeRefreshLayout containerSwipeRefreshLayoutPmaFragmentShopV3Page = (SwipeRefreshLayout) k1Var.f4138b;
                kotlin.jvm.internal.j.f(containerSwipeRefreshLayoutPmaFragmentShopV3Page, "containerSwipeRefreshLayoutPmaFragmentShopV3Page");
                containerSwipeRefreshLayoutPmaFragmentShopV3Page.setRefreshing(false);
                return;
            case 7:
                ((MayaBaseFragment) ((InterfaceC2240a) ((o6.c) this.f18254b).c.get())).w1();
                return;
            case 8:
                MayaRewardsCatalogFragment mayaRewardsCatalogFragment = (MayaRewardsCatalogFragment) ((InterfaceC2031a) ((Bb.f) this.f18254b).c.get());
                C2168a c2168a = mayaRewardsCatalogFragment.f13719X;
                if (c2168a == null) {
                    kotlin.jvm.internal.j.n("mMayaMilesAdapter");
                    throw null;
                }
                c2168a.c = false;
                c2168a.notifyDataSetChanged();
                ConstraintLayout constraintLayout = mayaRewardsCatalogFragment.f13728g0;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mMilesLoadingView");
                    throw null;
                }
            case 12:
                ((MayaBaseFragment) ((InterfaceC2390a) ((C2194a) this.f18254b).c.get())).w1();
                return;
            case 13:
                ((MayaBaseFragment) ((InterfaceC2392c) ((C2196c) this.f18254b).c.get())).w1();
                return;
            case 14:
                ((BaseFragment) ((yd.h) ((A7.j) this.f18254b).c.get())).n1();
                return;
            case 15:
                ((BaseFragment) ((yd.k) ((Lb.a) this.f18254b).c.get())).n1();
                return;
        }
    }

    @Override // com.dynatrace.agent.events.enrichment.sanitation.AttributeSanitizer
    public JsonAttribute sanitize(JsonAttribute jsonAttribute) {
        return JsonAttributeSanitationKt.removeAllAttributes$lambda$9((AttributeRetentionRule[]) this.f18254b, jsonAttribute);
    }
}
