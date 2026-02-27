package Xb;

import N5.C0435a;
import N5.C0447e;
import ac.C0674C;
import ac.C0677a;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.domain.model.DateHeader;
import com.paymaya.domain.model.Dated;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.domain.model.ShopPurchaseHistoryBase;
import com.paymaya.domain.store.C1283s0;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryPageFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PurchaseHistoryPageFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import ph.C2070f1;
import uj.AbstractC2324c;
import w1.RunnableC2367e;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6549d;
    public final C1283s0 e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6550g;
    public boolean h;
    public final Comparator i;

    public A(C1283s0 c1283s0, com.paymaya.data.preference.a mPreference, int i) {
        this.f6549d = i;
        switch (i) {
            case 1:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = c1283s0;
                this.i = new A7.l(15);
                this.f = "";
                this.f6550g = 1;
                break;
            default:
                kotlin.jvm.internal.j.g(mPreference, "mPreference");
                this.e = c1283s0;
                this.i = new A7.l(3);
                this.f = "";
                this.f6550g = 1;
                break;
        }
    }

    public final void k() {
        switch (this.f6549d) {
            case 0:
                if (!this.h) {
                    this.h = true;
                    new Lh.d(new Lh.d(new Lh.h(this.e.a(1, this.f), zh.b.a(), 0), new T3.l(this, 12), 2), new Q6.r(this, 14), 0).e();
                }
                break;
            default:
                if (!this.h) {
                    this.h = true;
                    new Lh.d(new Lh.d(new Lh.h(this.e.a(1, this.f), zh.b.a(), 0), new qc.c(this, 11), 2), new C2070f1(this, 13), 0).e();
                }
                break;
        }
    }

    public final void l(PayMayaError payMayaError) {
        switch (this.f6549d) {
            case 0:
                ((MayaShopPurchaseHistoryPageFragment) ((bc.l) this.c.get())).R1().i();
                C0674C c0674c = ((MayaShopPurchaseHistoryPageFragment) ((bc.l) this.c.get())).f14114s0;
                if (c0674c == null) {
                    kotlin.jvm.internal.j.n("mShopV3PurchaseHistoryItemAdapter");
                    throw null;
                }
                if (c0674c.e) {
                    c0674c.f(false);
                }
                this.h = false;
                ArrayList arrayList = new ArrayList(this.e.b(this.f));
                if (!arrayList.isEmpty()) {
                    n(arrayList);
                    ((MayaShopPurchaseHistoryPageFragment) ((bc.l) this.c.get())).L1();
                    return;
                } else {
                    if (payMayaError.isSessionTimeout()) {
                        return;
                    }
                    if (payMayaError.isNetworkError()) {
                        MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment = (MayaShopPurchaseHistoryPageFragment) ((bc.l) this.c.get());
                        mayaShopPurchaseHistoryPageFragment.getClass();
                        MayaBaseLoadingFragment.N1(mayaShopPurchaseHistoryPageFragment, 100, null, null, new cc.z(mayaShopPurchaseHistoryPageFragment, 2), 30);
                        return;
                    } else {
                        MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment2 = (MayaShopPurchaseHistoryPageFragment) ((bc.l) this.c.get());
                        mayaShopPurchaseHistoryPageFragment2.getClass();
                        MayaBaseLoadingFragment.N1(mayaShopPurchaseHistoryPageFragment2, 200, null, null, new cc.z(mayaShopPurchaseHistoryPageFragment2, 0), 30);
                        return;
                    }
                }
            default:
                ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment = (ShopV3PurchaseHistoryPageFragment) ((ve.j) this.c.get());
                if (shopV3PurchaseHistoryPageFragment.B1().isRefreshing()) {
                    shopV3PurchaseHistoryPageFragment.B1().post(new RunnableC2367e(shopV3PurchaseHistoryPageFragment, 2));
                }
                ue.x xVar = ((ShopV3PurchaseHistoryPageFragment) ((ve.j) this.c.get())).f14870f0;
                if (xVar == null) {
                    kotlin.jvm.internal.j.n("mShopV3PurchaseHistoryItemAdapter");
                    throw null;
                }
                if (xVar.e) {
                    xVar.f(false);
                }
                this.h = false;
                ArrayList arrayList2 = new ArrayList(this.e.b(this.f));
                if (!arrayList2.isEmpty()) {
                    n(arrayList2);
                    ((ShopV3PurchaseHistoryPageFragment) ((ve.j) this.c.get())).w1();
                    return;
                }
                if (payMayaError.isSessionTimeout()) {
                    return;
                }
                if (payMayaError.isNetworkError()) {
                    final ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment2 = (ShopV3PurchaseHistoryPageFragment) ((ve.j) this.c.get());
                    shopV3PurchaseHistoryPageFragment2.getClass();
                    final int i = 0;
                    shopV3PurchaseHistoryPageFragment2.x1(100, new View.OnClickListener() { // from class: we.G
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i) {
                                case 0:
                                    ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment3 = shopV3PurchaseHistoryPageFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3PurchaseHistoryPageFragment3.z1();
                                        shopV3PurchaseHistoryPageFragment3.A1().k();
                                        return;
                                    } finally {
                                    }
                                default:
                                    ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment4 = shopV3PurchaseHistoryPageFragment2;
                                    Callback.onClick_enter(view);
                                    try {
                                        shopV3PurchaseHistoryPageFragment4.z1();
                                        shopV3PurchaseHistoryPageFragment4.A1().k();
                                        return;
                                    } finally {
                                    }
                            }
                        }
                    });
                    return;
                }
                final ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment3 = (ShopV3PurchaseHistoryPageFragment) ((ve.j) this.c.get());
                shopV3PurchaseHistoryPageFragment3.getClass();
                final int i4 = 1;
                shopV3PurchaseHistoryPageFragment3.x1(200, new View.OnClickListener() { // from class: we.G
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i4) {
                            case 0:
                                ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment32 = shopV3PurchaseHistoryPageFragment3;
                                Callback.onClick_enter(view);
                                try {
                                    shopV3PurchaseHistoryPageFragment32.z1();
                                    shopV3PurchaseHistoryPageFragment32.A1().k();
                                    return;
                                } finally {
                                }
                            default:
                                ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment4 = shopV3PurchaseHistoryPageFragment3;
                                Callback.onClick_enter(view);
                                try {
                                    shopV3PurchaseHistoryPageFragment4.z1();
                                    shopV3PurchaseHistoryPageFragment4.A1().k();
                                    return;
                                } finally {
                                }
                        }
                    }
                });
                return;
        }
    }

    public final void m(ShopPurchaseHistoryBase shopPurchaseHistoryBase) {
        switch (this.f6549d) {
            case 0:
                kotlin.jvm.internal.j.g(shopPurchaseHistoryBase, "shopPurchaseHistoryBase");
                this.f6550g = shopPurchaseHistoryBase.mMeta().mCurrentPage();
                ArrayList arrayList = new ArrayList(this.e.b(this.f));
                if (arrayList.isEmpty()) {
                    String str = this.f;
                    if (kotlin.jvm.internal.j.b(str, "KYUUBI_PENDING")) {
                        C0447e c0447e = ((MayaShopPurchaseHistoryPageFragment) ((bc.l) this.c.get())).u0;
                        kotlin.jvm.internal.j.d(c0447e);
                        ((LinearLayoutCompat) c0447e.f).setVisibility(0);
                    } else if (kotlin.jvm.internal.j.b(str, "DISBURSEMENT_SUCCESSFUL")) {
                        C0447e c0447e2 = ((MayaShopPurchaseHistoryPageFragment) ((bc.l) this.c.get())).u0;
                        kotlin.jvm.internal.j.d(c0447e2);
                        ((LinearLayoutCompat) c0447e2.f).setVisibility(0);
                    }
                    RecyclerView recyclerView = ((MayaShopPurchaseHistoryPageFragment) ((bc.l) this.c.get())).f14115v0;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.j.n("mRecyclerViewItems");
                        throw null;
                    }
                    recyclerView.setVisibility(8);
                } else {
                    n(arrayList);
                }
                this.h = false;
                ((MayaShopPurchaseHistoryPageFragment) ((bc.l) this.c.get())).R1().i();
                C0674C c0674c = ((MayaShopPurchaseHistoryPageFragment) ((bc.l) this.c.get())).f14114s0;
                if (c0674c == null) {
                    kotlin.jvm.internal.j.n("mShopV3PurchaseHistoryItemAdapter");
                    throw null;
                }
                if (c0674c.e) {
                    c0674c.f(false);
                }
                ((MayaShopPurchaseHistoryPageFragment) ((bc.l) this.c.get())).L1();
                return;
            default:
                kotlin.jvm.internal.j.g(shopPurchaseHistoryBase, "shopPurchaseHistoryBase");
                this.f6550g = shopPurchaseHistoryBase.mMeta().mCurrentPage();
                ArrayList arrayList2 = new ArrayList(this.e.b(this.f));
                if (arrayList2.isEmpty()) {
                    String str2 = this.f;
                    if (kotlin.jvm.internal.j.b(str2, "KYUUBI_PENDING")) {
                        ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment = (ShopV3PurchaseHistoryPageFragment) ((ve.j) this.c.get());
                        String[] stringArray = shopV3PurchaseHistoryPageFragment.getResources().getStringArray(R.array.pma_shop_purchase_history_processing_dynamic_spiels);
                        kotlin.jvm.internal.j.f(stringArray, "getStringArray(...)");
                        AbstractC2324c.a aVar = AbstractC2324c.f20347a;
                        int length = stringArray.length;
                        aVar.getClass();
                        int iD = AbstractC2324c.f20348b.d(length);
                        C0435a c0435a = shopV3PurchaseHistoryPageFragment.f14872h0;
                        kotlin.jvm.internal.j.d(c0435a);
                        ((TextView) c0435a.e).setText(stringArray[iD]);
                        C0435a c0435a2 = ((ShopV3PurchaseHistoryPageFragment) ((ve.j) this.c.get())).f14872h0;
                        kotlin.jvm.internal.j.d(c0435a2);
                        ((Group) c0435a2.f4048d).setVisibility(0);
                    } else if (kotlin.jvm.internal.j.b(str2, "DISBURSEMENT_SUCCESSFUL")) {
                        C0435a c0435a3 = ((ShopV3PurchaseHistoryPageFragment) ((ve.j) this.c.get())).f14872h0;
                        kotlin.jvm.internal.j.d(c0435a3);
                        ((Group) c0435a3.f4048d).setVisibility(0);
                    }
                    RecyclerView recyclerView2 = ((ShopV3PurchaseHistoryPageFragment) ((ve.j) this.c.get())).f14873i0;
                    if (recyclerView2 == null) {
                        kotlin.jvm.internal.j.n("mRecyclerViewItems");
                        throw null;
                    }
                    recyclerView2.setVisibility(8);
                } else {
                    n(arrayList2);
                }
                this.h = false;
                ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment2 = (ShopV3PurchaseHistoryPageFragment) ((ve.j) this.c.get());
                if (shopV3PurchaseHistoryPageFragment2.B1().isRefreshing()) {
                    shopV3PurchaseHistoryPageFragment2.B1().post(new RunnableC2367e(shopV3PurchaseHistoryPageFragment2, 2));
                }
                ue.x xVar = ((ShopV3PurchaseHistoryPageFragment) ((ve.j) this.c.get())).f14870f0;
                if (xVar == null) {
                    kotlin.jvm.internal.j.n("mShopV3PurchaseHistoryItemAdapter");
                    throw null;
                }
                if (xVar.e) {
                    xVar.f(false);
                }
                ((ShopV3PurchaseHistoryPageFragment) ((ve.j) this.c.get())).w1();
                return;
        }
    }

    public final void n(ArrayList arrayList) {
        switch (this.f6549d) {
            case 0:
                C0447e c0447e = ((MayaShopPurchaseHistoryPageFragment) ((bc.l) this.c.get())).u0;
                kotlin.jvm.internal.j.d(c0447e);
                ((LinearLayoutCompat) c0447e.f).setVisibility(8);
                RecyclerView recyclerView = ((MayaShopPurchaseHistoryPageFragment) ((bc.l) this.c.get())).f14115v0;
                if (recyclerView == null) {
                    kotlin.jvm.internal.j.n("mRecyclerViewItems");
                    throw null;
                }
                recyclerView.setVisibility(0);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                DateHeader dateHeader = null;
                while (it.hasNext()) {
                    Dated dated = (Dated) it.next();
                    if (dateHeader == null || !dateHeader.getLocalDateTime().withTimeAtStartOfDay().isEqual(dated.getLocalDateTime().withTimeAtStartOfDay())) {
                        dateHeader = new DateHeader(dated.getLocalDateTime().withTime(23, 59, 59, 999));
                        arrayList2.add(dateHeader);
                    }
                }
                arrayList2.addAll(arrayList);
                Collections.sort(arrayList2, (A7.l) this.i);
                ArrayList arrayList3 = new ArrayList(cj.t.l(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new C0677a((Dated) it2.next()));
                }
                int size = arrayList3.size();
                C0677a c0677a = null;
                double dMPrice = 0.0d;
                for (int i = 0; i < size; i++) {
                    C0677a c0677a2 = (C0677a) arrayList3.get(i);
                    Dated dated2 = c0677a2.f7090a;
                    if (dated2 instanceof DateHeader) {
                        dMPrice = 0.0d;
                        c0677a = c0677a2;
                    } else if (dated2 instanceof ShopPurchaseHistory) {
                        dMPrice += ((ShopPurchaseHistory) dated2).mPrice();
                        if (c0677a != null) {
                            c0677a.f7091b = String.valueOf(dMPrice);
                        }
                    }
                }
                MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment = (MayaShopPurchaseHistoryPageFragment) ((bc.l) this.c.get());
                mayaShopPurchaseHistoryPageFragment.getClass();
                C0674C c0674c = mayaShopPurchaseHistoryPageFragment.f14114s0;
                if (c0674c == null) {
                    kotlin.jvm.internal.j.n("mShopV3PurchaseHistoryItemAdapter");
                    throw null;
                }
                ArrayList arrayList4 = c0674c.f;
                ArrayList arrayList5 = new ArrayList(cj.t.l(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((C0677a) it3.next()).f7090a);
                }
                ArrayList arrayList6 = new ArrayList(cj.t.l(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(((C0677a) it4.next()).f7090a);
                }
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new ed.b(arrayList5, arrayList6));
                kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                diffResultCalculateDiff.dispatchUpdatesTo(c0674c);
                LinearLayoutManager linearLayoutManager = mayaShopPurchaseHistoryPageFragment.w0;
                if (linearLayoutManager != null) {
                    int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    C0674C c0674c2 = mayaShopPurchaseHistoryPageFragment.f14114s0;
                    if (c0674c2 != null) {
                        c0674c2.notifyItemChanged(iFindLastVisibleItemPosition);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mShopV3PurchaseHistoryItemAdapter");
                        throw null;
                    }
                }
                return;
            default:
                C0435a c0435a = ((ShopV3PurchaseHistoryPageFragment) ((ve.j) this.c.get())).f14872h0;
                kotlin.jvm.internal.j.d(c0435a);
                ((Group) c0435a.f4048d).setVisibility(8);
                RecyclerView recyclerView2 = ((ShopV3PurchaseHistoryPageFragment) ((ve.j) this.c.get())).f14873i0;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.j.n("mRecyclerViewItems");
                    throw null;
                }
                recyclerView2.setVisibility(0);
                ve.j jVar = (ve.j) this.c.get();
                ArrayList arrayList7 = new ArrayList();
                Iterator it5 = arrayList.iterator();
                DateHeader dateHeader2 = null;
                while (it5.hasNext()) {
                    Dated dated3 = (Dated) it5.next();
                    if (dateHeader2 == null || !dateHeader2.getLocalDateTime().withTimeAtStartOfDay().isEqual(dated3.getLocalDateTime().withTimeAtStartOfDay())) {
                        dateHeader2 = new DateHeader(dated3.getLocalDateTime().withTime(23, 59, 59, 999));
                        arrayList7.add(dateHeader2);
                    }
                }
                arrayList7.addAll(arrayList);
                Collections.sort(arrayList7, (A7.l) this.i);
                ShopV3PurchaseHistoryPageFragment shopV3PurchaseHistoryPageFragment = (ShopV3PurchaseHistoryPageFragment) jVar;
                shopV3PurchaseHistoryPageFragment.getClass();
                ue.x xVar = shopV3PurchaseHistoryPageFragment.f14870f0;
                if (xVar == null) {
                    kotlin.jvm.internal.j.n("mShopV3PurchaseHistoryItemAdapter");
                    throw null;
                }
                ArrayList arrayList8 = xVar.f;
                DiffUtil.DiffResult diffResultCalculateDiff2 = DiffUtil.calculateDiff(new ed.b(arrayList8, arrayList7));
                kotlin.jvm.internal.j.f(diffResultCalculateDiff2, "calculateDiff(...)");
                arrayList8.clear();
                arrayList8.addAll(arrayList7);
                diffResultCalculateDiff2.dispatchUpdatesTo(xVar);
                return;
        }
    }
}
