package Xb;

import Kh.T;
import N5.C0447e;
import N5.k1;
import android.os.Bundle;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.domain.store.O0;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPageFragment;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PageFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import l9.C1803a;
import ph.C2070f1;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6570d;
    public final O0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(O0 o02, Uh.d dVar, int i) {
        super(dVar);
        this.f6570d = i;
        this.e = o02;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        switch (this.f6570d) {
            case 0:
                super.j();
                if (!((MayaShopPageFragment) ((bc.c) this.c.get())).u0) {
                    k();
                    return;
                }
                MayaShopPageFragment mayaShopPageFragment = (MayaShopPageFragment) ((bc.c) this.c.get());
                Bundle bundle = mayaShopPageFragment.f14019x0;
                if (bundle != null && bundle.containsKey("provider_list_items")) {
                    Bundle bundle2 = mayaShopPageFragment.f14019x0;
                    kotlin.jvm.internal.j.d(bundle2);
                    List parcelableArrayList = bundle2.getParcelableArrayList("provider_list_items");
                    if (parcelableArrayList == null) {
                        parcelableArrayList = C1112C.f9377a;
                    }
                    mayaShopPageFragment.Q1().l(parcelableArrayList);
                }
                Bundle bundle3 = mayaShopPageFragment.f14019x0;
                kotlin.jvm.internal.j.d(bundle3);
                if (bundle3.containsKey("layout_manager")) {
                    RecyclerView recyclerView = mayaShopPageFragment.f14014p0;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.j.n("mRecyclerViewItems");
                        throw null;
                    }
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        Bundle bundle4 = mayaShopPageFragment.f14019x0;
                        kotlin.jvm.internal.j.d(bundle4);
                        layoutManager.onRestoreInstanceState(bundle4.getParcelable("layout_manager"));
                    }
                }
                ((MayaShopPageFragment) ((bc.c) this.c.get())).L1();
                return;
            default:
                super.j();
                if (!((ShopV3PageFragment) ((ve.d) this.c.get())).f14807f0) {
                    k();
                    return;
                }
                ShopV3PageFragment shopV3PageFragment = (ShopV3PageFragment) ((ve.d) this.c.get());
                Bundle bundle5 = shopV3PageFragment.f14810i0;
                if (bundle5 != null && bundle5.containsKey("provider_list_items")) {
                    Bundle bundle6 = shopV3PageFragment.f14810i0;
                    kotlin.jvm.internal.j.d(bundle6);
                    List parcelableArrayList2 = bundle6.getParcelableArrayList("provider_list_items");
                    if (parcelableArrayList2 == null) {
                        parcelableArrayList2 = C1112C.f9377a;
                    }
                    shopV3PageFragment.A1().l(parcelableArrayList2);
                }
                Bundle bundle7 = shopV3PageFragment.f14810i0;
                kotlin.jvm.internal.j.d(bundle7);
                if (bundle7.containsKey("layout_manager")) {
                    RecyclerView recyclerView2 = shopV3PageFragment.f14803b0;
                    if (recyclerView2 == null) {
                        kotlin.jvm.internal.j.n("mRecyclerViewItems");
                        throw null;
                    }
                    RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
                    if (layoutManager2 != null) {
                        Bundle bundle8 = shopV3PageFragment.f14810i0;
                        kotlin.jvm.internal.j.d(bundle8);
                        layoutManager2.onRestoreInstanceState(bundle8.getParcelable("layout_manager"));
                    }
                }
                ((ShopV3PageFragment) ((ve.d) this.c.get())).w1();
                return;
        }
    }

    public final void k() {
        switch (this.f6570d) {
            case 0:
                if (!((MayaShopPageFragment) ((bc.c) this.c.get())).y0) {
                    ((MayaShopPageFragment) ((bc.c) this.c.get())).y0 = true;
                    new T(5, new Lh.d(new Lh.d(new Lh.h(this.e.b(((MayaShopPageFragment) ((bc.c) this.c.get())).f14018v0), zh.b.a(), 0), new R4.i(this, 9), 2), new T3.l(this, 8), 0), new Xa.c(this, 1)).e();
                    break;
                }
                break;
            default:
                if (!((ShopV3PageFragment) ((ve.d) this.c.get())).f14811j0) {
                    ((ShopV3PageFragment) ((ve.d) this.c.get())).f14811j0 = true;
                    ((ShopV3PageFragment) ((ve.d) this.c.get())).z1();
                    new T(5, new Lh.d(new Lh.d(new Lh.h(this.e.b(((ShopV3PageFragment) ((ve.d) this.c.get())).f14808g0), zh.b.a(), 0), new C2070f1(this, 9), 2), new p8.a(this, 13), 0), new C1803a(this, 16)).e();
                    break;
                }
                break;
        }
    }

    public final void l(List list) {
        switch (this.f6570d) {
            case 0:
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    C0447e c0447e = ((MayaShopPageFragment) ((bc.c) this.c.get())).f14013o0;
                    kotlin.jvm.internal.j.d(c0447e);
                    ((Group) c0447e.f4080d).setVisibility(0);
                } else {
                    C0447e c0447e2 = ((MayaShopPageFragment) ((bc.c) this.c.get())).f14013o0;
                    kotlin.jvm.internal.j.d(c0447e2);
                    ((Group) c0447e2.f4080d).setVisibility(8);
                    ac.w wVar = ((MayaShopPageFragment) ((bc.c) this.c.get())).f14017s0;
                    if (wVar != null) {
                        kotlin.jvm.internal.j.d(list);
                        ArrayList arrayList = wVar.c;
                        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new ue.e(arrayList, list));
                        kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
                        arrayList.clear();
                        arrayList.addAll(list);
                        diffResultCalculateDiff.dispatchUpdatesTo(wVar);
                    }
                }
                ((MayaShopPageFragment) ((bc.c) this.c.get())).L1();
                if (!((MayaShopPageFragment) ((bc.c) this.c.get())).u0) {
                    MayaShopPageFragment mayaShopPageFragment = (MayaShopPageFragment) ((bc.c) this.c.get());
                    mayaShopPageFragment.u0 = true;
                    mayaShopPageFragment.R1().i();
                }
                break;
            default:
                List list3 = list;
                if (list3 == null || list3.isEmpty()) {
                    ShopV3PageFragment shopV3PageFragment = (ShopV3PageFragment) ((ve.d) this.c.get());
                    String[] stringArray = shopV3PageFragment.getResources().getStringArray(R.array.pma_shop_purchase_history_processing_dynamic_spiels);
                    kotlin.jvm.internal.j.f(stringArray, "getStringArray(...)");
                    int iNextInt = new Random().nextInt(stringArray.length);
                    k1 k1Var = shopV3PageFragment.f14802a0;
                    kotlin.jvm.internal.j.d(k1Var);
                    ((TextView) k1Var.f4139d).setText(stringArray[iNextInt]);
                    k1 k1Var2 = ((ShopV3PageFragment) ((ve.d) this.c.get())).f14802a0;
                    kotlin.jvm.internal.j.d(k1Var2);
                    ((Group) k1Var2.c).setVisibility(0);
                } else {
                    k1 k1Var3 = ((ShopV3PageFragment) ((ve.d) this.c.get())).f14802a0;
                    kotlin.jvm.internal.j.d(k1Var3);
                    ((Group) k1Var3.c).setVisibility(8);
                    ue.d dVar = ((ShopV3PageFragment) ((ve.d) this.c.get())).f14805d0;
                    if (dVar != null) {
                        kotlin.jvm.internal.j.d(list);
                        ArrayList arrayList2 = dVar.c;
                        DiffUtil.DiffResult diffResultCalculateDiff2 = DiffUtil.calculateDiff(new ue.e(arrayList2, list));
                        kotlin.jvm.internal.j.f(diffResultCalculateDiff2, "calculateDiff(...)");
                        arrayList2.clear();
                        arrayList2.addAll(list);
                        diffResultCalculateDiff2.dispatchUpdatesTo(dVar);
                    }
                }
                ((ShopV3PageFragment) ((ve.d) this.c.get())).w1();
                if (!((ShopV3PageFragment) ((ve.d) this.c.get())).f14807f0) {
                    ((ShopV3PageFragment) ((ve.d) this.c.get())).f14807f0 = true;
                }
                break;
        }
    }
}
