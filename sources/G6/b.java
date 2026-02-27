package G6;

import D8.C0214w;
import L6.F;
import L6.InterfaceC0319e;
import L6.InterfaceC0320f;
import android.content.ContentValues;
import androidx.constraintlayout.widget.Group;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.recyclerview.widget.DiffUtil;
import com.dynatrace.agent.RumEventDispatcher;
import com.dynatrace.android.agent.DTXActionImpl;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.GuardedEventDispatcher;
import com.dynatrace.android.agent.data.Session;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.A;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.database.repository.C1246j;
import com.paymaya.data.database.repository.D;
import com.paymaya.data.database.repository.J;
import com.paymaya.domain.model.BankPullPaymentOption;
import com.paymaya.domain.model.LinkedPaymentOption;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.domain.model.ShopPurchaseHistoryBase;
import com.paymaya.domain.model.VaultedCard;
import com.paymaya.domain.model.Voucher;
import com.paymaya.domain.model.VoucherBase;
import com.paymaya.domain.model.VoucherReminder;
import com.paymaya.domain.store.C1273n;
import com.paymaya.domain.store.C1283s0;
import com.paymaya.domain.store.c1;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaBankPullLinkedAccountsFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaVaultedCardsFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k1.InterfaceC1690a;
import kotlin.Pair;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Ch.a, ListenerSet.Event, GuardedEventDispatcher.GuardedOperation, Ch.c, InterfaceC1690a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1777b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1778d;

    public /* synthetic */ b(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        this.f1776a = 3;
        this.f1777b = i;
        this.f1778d = positionInfo;
        this.c = positionInfo2;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f1776a) {
            case 7:
                List list = (List) obj;
                C1246j c1246j = ((C1273n) this.f1778d).e;
                if (this.f1777b == 1) {
                    c1246j.f11312a.b("biller_v2", "categorySlug = ?", new String[]{(String) this.c});
                }
                c1246j.getClass();
                c1246j.f11312a.c("biller_v2", C1246j.b(list));
                break;
            case 8:
                C1283s0 c1283s0 = (C1283s0) this.f1778d;
                c1283s0.getClass();
                ArrayList<ShopPurchaseHistory> arrayList = new ArrayList();
                Iterator<ShopPurchaseHistory> it = ((ShopPurchaseHistoryBase) obj).mData().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    String str = (String) this.c;
                    int i = this.f1777b;
                    if (!zHasNext) {
                        D d10 = c1283s0.c;
                        if (i <= 1) {
                            d10.f11296a.b("shop_purchase_history", "status=?", new String[]{str});
                        }
                        d10.getClass();
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        for (ShopPurchaseHistory shopPurchaseHistory : arrayList) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("product_id", shopPurchaseHistory.mProductId());
                            contentValues.put("product_name", shopPurchaseHistory.mProductName());
                            contentValues.put("product_description", shopPurchaseHistory.mProductDescription());
                            contentValues.put("image_url", shopPurchaseHistory.mImageUrl());
                            contentValues.put("recipient", shopPurchaseHistory.mRecipient());
                            contentValues.put("status", shopPurchaseHistory.mStatus());
                            contentValues.put(MPDbAdapter.KEY_CREATED_AT, shopPurchaseHistory.mCreatedAt());
                            contentValues.put("updated_at", shopPurchaseHistory.mUpdatedAt());
                            contentValues.put("icon_url", shopPurchaseHistory.mIconUrl());
                            contentValues.put("page", Integer.valueOf(shopPurchaseHistory.mPage()));
                            contentValues.put("payment_trn", shopPurchaseHistory.mPaymentTrn());
                            contentValues.put("order_reference_number", shopPurchaseHistory.mOrderReferenceNumber());
                            contentValues.put("price", Double.valueOf(shopPurchaseHistory.mPrice()));
                            contentValues.put("code", shopPurchaseHistory.mCode());
                            contentValues.put("network", shopPurchaseHistory.mNetwork());
                            contentValues.put("gifted", Boolean.valueOf(shopPurchaseHistory.mIsGifted()));
                            contentValues.put("with_receipt", Boolean.valueOf(shopPurchaseHistory.mWithReceipt()));
                            contentValues.put("available_receipt", Boolean.valueOf(shopPurchaseHistory.mAvailableReceipt()));
                            if (!C.e(shopPurchaseHistory.mOtherFields())) {
                                contentValues.put("other_fields", A.f10366a.k(shopPurchaseHistory.mOtherFields()));
                            }
                            arrayList2.add(contentValues);
                        }
                        d10.f11296a.c("shop_purchase_history", Collections.unmodifiableList(arrayList2));
                    } else {
                        arrayList.add(it.next().toBuilder().mStatus(str).mPage(i).build());
                    }
                    break;
                }
                break;
            default:
                c1 c1Var = (c1) this.f1778d;
                c1Var.getClass();
                ArrayList arrayList3 = new ArrayList();
                Iterator<Voucher> it2 = ((VoucherBase) obj).mData().iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    String str2 = (String) this.c;
                    int i4 = this.f1777b;
                    if (!zHasNext2) {
                        J j = c1Var.c;
                        if (i4 == 1) {
                            j.f11302a.b("voucher", "status=?", new String[]{str2});
                        }
                        j.a(arrayList3);
                        break;
                    } else {
                        Voucher next = it2.next();
                        VoucherReminder voucherReminderC = c1Var.c(next);
                        if (voucherReminderC != null) {
                            c1Var.e(next.mAssignmentId(), voucherReminderC.mHasReminder());
                            arrayList3.add(next.toBuilder().mStatus(str2).mPage(i4).mHasReminder(voucherReminderC.mHasReminder()).build());
                        } else {
                            c1Var.a(next.mAssignmentId());
                            arrayList3.add(next.toBuilder().mStatus(str2).mPage(i4).mHasReminder(false).build());
                        }
                    }
                }
                break;
        }
    }

    @Override // com.dynatrace.android.agent.GuardedEventDispatcher.GuardedOperation
    public void execute(RumEventDispatcher rumEventDispatcher) {
        switch (this.f1776a) {
            case 5:
                ((DTXActionImpl) this.f1778d).lambda$reportError$0((String) this.c, this.f1777b, rumEventDispatcher);
                break;
            default:
                Dynatrace.lambda$reportError$0((Session) this.f1778d, (String) this.c, this.f1777b, rumEventDispatcher);
                break;
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f1776a) {
            case 3:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$33(this.f1777b, (Player.PositionInfo) this.f1778d, (Player.PositionInfo) this.c, (Player.Listener) obj);
                break;
            default:
                ((AnalyticsListener) obj).onMediaItemTransition((AnalyticsListener.EventTime) this.f1778d, (MediaItem) this.c, this.f1777b);
                break;
        }
    }

    @Override // Ch.a
    public void run() {
        switch (this.f1776a) {
            case 0:
                c cVar = (c) this.f1778d;
                int i = this.f1777b;
                BankPullPaymentOption bankPullPaymentOption = (BankPullPaymentOption) this.c;
                MayaBankPullFragment mayaBankPullFragment = (MayaBankPullFragment) ((K6.c) cVar.c.get());
                mayaBankPullFragment.getClass();
                C1219h c1219h = new C1219h();
                c1219h.n(14);
                c1219h.t(EnumC1217f.UNLINK);
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219h.j.put("bank", bankPullPaymentOption.getId());
                LinkedPaymentOption paymentOption = bankPullPaymentOption.getPaymentOption();
                c1219h.j.put("account_number", paymentOption != null ? paymentOption.getLastFourDigits() : null);
                mayaBankPullFragment.A1(c1219h);
                J6.b bVar = mayaBankPullFragment.t0;
                if (bVar != null) {
                    bVar.f2420b.remove(i);
                    bVar.notifyItemRemoved(i);
                }
                InterfaceC0319e interfaceC0319e = mayaBankPullFragment.f11631r0;
                if (interfaceC0319e != null) {
                    ((MayaCashInActivity) interfaceC0319e).b2(bankPullPaymentOption.getName());
                    return;
                }
                return;
            case 1:
                d dVar = (d) this.f1778d;
                int i4 = this.f1777b;
                BankPullPaymentOption bankPullPaymentOption2 = (BankPullPaymentOption) this.c;
                MayaBankPullLinkedAccountsFragment mayaBankPullLinkedAccountsFragment = (MayaBankPullLinkedAccountsFragment) ((K6.d) dVar.c.get());
                mayaBankPullLinkedAccountsFragment.getClass();
                C1219h c1219h2 = new C1219h();
                c1219h2.n(14);
                c1219h2.t(EnumC1217f.UNLINK);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219h2.j.put("bank", bankPullPaymentOption2.getId());
                LinkedPaymentOption paymentOption2 = bankPullPaymentOption2.getPaymentOption();
                c1219h2.j.put("account_number", paymentOption2 != null ? paymentOption2.getLastFourDigits() : null);
                mayaBankPullLinkedAccountsFragment.A1(c1219h2);
                J6.b bVar2 = mayaBankPullLinkedAccountsFragment.f11639Y;
                if (bVar2 != null) {
                    bVar2.f2420b.remove(i4);
                    bVar2.notifyItemRemoved(i4);
                }
                InterfaceC0320f interfaceC0320f = mayaBankPullLinkedAccountsFragment.f11638X;
                if (interfaceC0320f != null) {
                    ((MayaCashInActivity) interfaceC0320f).b2(bankPullPaymentOption2.getName());
                    return;
                }
                return;
            default:
                C0214w c0214w = (C0214w) this.f1778d;
                int i6 = this.f1777b;
                VaultedCard vaultedCard = (VaultedCard) this.c;
                kotlin.jvm.internal.j.g(vaultedCard, "vaultedCard");
                ArrayList arrayList = (ArrayList) c0214w.f1106g;
                if (arrayList != null) {
                }
                ((MayaBaseFragment) ((K6.n) c0214w.c.get())).w1();
                K6.n nVar = (K6.n) c0214w.c.get();
                String cardSchemeName = vaultedCard.getCardSchemeName();
                kotlin.jvm.internal.j.f(cardSchemeName, "getCardSchemeName(...)");
                MayaVaultedCardsFragment mayaVaultedCardsFragment = (MayaVaultedCardsFragment) nVar;
                mayaVaultedCardsFragment.getClass();
                F f = mayaVaultedCardsFragment.t0;
                if (f != null) {
                    MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) f;
                    String string = mayaCashInActivity.getString(R.string.maya_label_remove_card_success_title);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    z2.d.n(R.drawable.maya_ic_success, string, mayaCashInActivity.getString(R.string.maya_format_remove_card_success_message, cardSchemeName), new Pair(mayaCashInActivity.getString(R.string.maya_label_back_to_cash_in), new I6.c(mayaCashInActivity, 5)), null, null, 112).show(mayaCashInActivity.getSupportFragmentManager(), "alert_dialog");
                }
                MayaVaultedCardsFragment mayaVaultedCardsFragment2 = (MayaVaultedCardsFragment) ((K6.n) c0214w.c.get());
                J6.g gVar = mayaVaultedCardsFragment2.u0;
                if (gVar != null) {
                    ArrayList newList = gVar.f2432b;
                    ArrayList arrayList2 = new ArrayList(newList);
                    newList.remove(i6);
                    kotlin.jvm.internal.j.g(newList, "newList");
                    DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new N6.c(arrayList2, newList));
                    kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
                    diffResultCalculateDiff.dispatchUpdatesTo(gVar);
                }
                J6.g gVar2 = mayaVaultedCardsFragment2.u0;
                if (gVar2 == null || gVar2.f2432b.size() != 0) {
                    return;
                }
                Group group = mayaVaultedCardsFragment2.f11764q0;
                if (group != null) {
                    group.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mVaultedCardsGroup");
                    throw null;
                }
        }
    }

    public /* synthetic */ b(Object obj, int i, Object obj2, int i4) {
        this.f1776a = i4;
        this.f1778d = obj;
        this.f1777b = i;
        this.c = obj2;
    }

    @Override // k1.InterfaceC1690a
    public Object execute() {
        ((i1.f) this.f1778d).f17080d.a((c1.i) this.c, this.f1777b + 1, false);
        return null;
    }

    public /* synthetic */ b(Object obj, Object obj2, int i, int i4) {
        this.f1776a = i4;
        this.f1778d = obj;
        this.c = obj2;
        this.f1777b = i;
    }
}
