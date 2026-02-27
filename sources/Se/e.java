package se;

import Ah.p;
import Kh.T;
import M8.T2;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import cj.t;
import com.paymaya.domain.model.ShopCleverTapPromosBanner;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopHomeSectionItem;
import com.paymaya.domain.model.ShopHomeSectionTemplate;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.domain.model.ShopProviderCategory;
import com.paymaya.domain.store.C1285t0;
import com.paymaya.domain.store.L0;
import com.paymaya.domain.store.O0;
import com.paymaya.domain.store.Q0;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import dOYHB6.tiZVw8.numX49;
import ha.u;
import i2.C1585a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import oi.C1983a;
import pg.C2038a;
import re.InterfaceC2201a;
import ue.n;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends AbstractC2509a implements InterfaceC2201a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O0 f20056d;
    public final L0 e;
    public final C1285t0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Q0 f20057g;
    public final com.paymaya.data.preference.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(O0 o02, L0 l02, C1285t0 c1285t0, Q0 q02, com.paymaya.data.preference.a aVar, Uh.d dVar) {
        super(dVar);
        kotlin.jvm.internal.j.g(aVar, numX49.tnTj78("bF3Pe"));
        this.f20056d = o02;
        this.e = l02;
        this.f = c1285t0;
        this.f20057g = q02;
        this.h = aVar;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        n();
    }

    public final p k(List list) {
        String strTnTj78;
        Object next;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            strTnTj78 = numX49.tnTj78("bF3P8");
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) next).getName(), strTnTj78)) {
                break;
            }
        }
        ShopHomeSectionTemplate shopHomeSectionTemplate = (ShopHomeSectionTemplate) next;
        if (shopHomeSectionTemplate != null) {
            return new Lh.i(new Lh.d(new Lh.h(this.f20057g.a(), zh.b.a(), 0).d(C2255a.f20049d), new C2038a(12, this, shopHomeSectionTemplate, false), 2).d(C2255a.e), new u(8, this, shopHomeSectionTemplate), null);
        }
        ((ShopV3HomePageFragment) ((ve.c) this.c.get())).C1(strTnTj78);
        return p.c(new Pair(null, null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r8.equals(dOYHB6.tiZVw8.numX49.tnTj78("bF3Pw")) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        r3 = com.paymaya.domain.model.ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_PROVIDER_LOGO_LOADING;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        return cj.C1132s.g(new com.paymaya.domain.model.ShopHomeCarouselLoadingItem(r3), new com.paymaya.domain.model.ShopHomeCarouselLoadingItem(r3), new com.paymaya.domain.model.ShopHomeCarouselLoadingItem(r3), new com.paymaya.domain.model.ShopHomeCarouselLoadingItem(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r8.equals(dOYHB6.tiZVw8.numX49.tnTj78("bF3P4")) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List l(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: se.e.l(java.lang.String):java.util.List");
    }

    public final ArrayList m() {
        List<ShopHomeSectionTemplate> sectionsAsList = this.h.e().mShopConfig().mHome().getSectionsAsList();
        kotlin.jvm.internal.j.f(sectionsAsList, numX49.tnTj78("bF3Pm"));
        List listQ = C1110A.Q(new d(), sectionsAsList);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (!kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) obj).getName(), numX49.tnTj78("bF3PD"))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void n() {
        String strTnTj78;
        String strTnTj782;
        Object next;
        p iVar;
        String strTnTj783;
        Object next2;
        p pVarC;
        String strTnTj784;
        Object next3;
        p iVar2;
        int i = 12;
        int i4 = 5;
        int i6 = 1;
        int i10 = 2;
        int i11 = 0;
        if (((ShopV3HomePageFragment) ((ve.c) this.c.get())).f14797f0 || !((ShopV3HomePageFragment) ((ve.c) this.c.get())).f14798g0.isEmpty()) {
            return;
        }
        ShopV3HomePageFragment shopV3HomePageFragment = (ShopV3HomePageFragment) ((ve.c) this.c.get());
        shopV3HomePageFragment.f14797f0 = true;
        shopV3HomePageFragment.D1();
        ShopV3HomePageFragment shopV3HomePageFragment2 = (ShopV3HomePageFragment) ((ve.c) this.c.get());
        e eVar = (e) shopV3HomePageFragment2.B1();
        ArrayList arrayListM = eVar.m();
        ArrayList<ShopHomeSectionTemplate> arrayList = new ArrayList();
        Iterator it = arrayListM.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            strTnTj78 = numX49.tnTj78("bF3Ph");
            if (!zHasNext) {
                break;
            }
            Object next4 = it.next();
            if (!kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) next4).getName(), strTnTj78)) {
                arrayList.add(next4);
            }
        }
        ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
        for (ShopHomeSectionTemplate shopHomeSectionTemplate : arrayList) {
            arrayList2.add(new ShopHomeSectionCarousel(shopHomeSectionTemplate.getName(), shopHomeSectionTemplate.getListType(), shopHomeSectionTemplate.getPosition(), eVar.l(shopHomeSectionTemplate.getName()), 0, null, 16, null));
        }
        ShopV3HomePageFragment shopV3HomePageFragment3 = (ShopV3HomePageFragment) ((ve.c) eVar.c.get());
        shopV3HomePageFragment3.getClass();
        n nVar = shopV3HomePageFragment3.f14799h0;
        if (nVar != null) {
            nVar.e(arrayList2);
        }
        ((ShopV3HomePageFragment) ((ve.c) eVar.c.get())).w1();
        RecyclerView recyclerView = shopV3HomePageFragment2.f14795d0;
        Object obj = null;
        if (recyclerView == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bF3P3"));
            throw null;
        }
        recyclerView.scrollToPosition(0);
        ArrayList arrayListM2 = m();
        p pVarK = k(arrayListM2);
        Iterator it2 = arrayListM2.iterator();
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            strTnTj782 = numX49.tnTj78("bF3PM");
            if (zHasNext2) {
                next = it2.next();
                if (kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) next).getName(), strTnTj782)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ShopHomeSectionTemplate shopHomeSectionTemplate2 = (ShopHomeSectionTemplate) next;
        if (shopHomeSectionTemplate2 == null) {
            ((ShopV3HomePageFragment) ((ve.c) this.c.get())).C1(strTnTj782);
            iVar = p.c(new Pair(null, null));
        } else {
            iVar = new Lh.i(new Lh.d(new Lh.h(this.f.d(), zh.b.a(), 0), new c(this, new ShopHomeSectionCarousel(shopHomeSectionTemplate2.getName(), shopHomeSectionTemplate2.getListType(), shopHomeSectionTemplate2.getPosition(), null, 5, null, 8, null), i10), i10).d(C2255a.f20050g), new C2256b(this, i6), null);
        }
        ShopProviderCategory shopProviderCategoryA = this.e.a();
        Iterator it3 = arrayListM2.iterator();
        while (true) {
            boolean zHasNext3 = it3.hasNext();
            strTnTj783 = numX49.tnTj78("bF3PN");
            if (zHasNext3) {
                next2 = it3.next();
                if (kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) next2).getName(), strTnTj783)) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        ShopHomeSectionTemplate shopHomeSectionTemplate3 = (ShopHomeSectionTemplate) next2;
        if ((shopProviderCategoryA != null ? shopProviderCategoryA.getCode() : null) == null || shopHomeSectionTemplate3 == null) {
            ((ShopV3HomePageFragment) ((ve.c) this.c.get())).C1(strTnTj783);
            pVarC = p.c(new Pair(null, null));
        } else {
            ShopHomeSectionCarousel shopHomeSectionCarousel = new ShopHomeSectionCarousel(shopHomeSectionTemplate3.getName(), shopHomeSectionTemplate3.getListType(), shopHomeSectionTemplate3.getPosition(), null, 10, null, 8, null);
            pVarC = new Lh.i(new Lh.d(new Lh.h(this.f20056d.c(shopProviderCategoryA.getCode()), zh.b.a(), 0), new c(this, shopHomeSectionCarousel, i6), i10).d(C2255a.f), new C1585a(5, this, shopProviderCategoryA, shopHomeSectionCarousel), null);
        }
        Iterator it4 = arrayListM2.iterator();
        while (true) {
            boolean zHasNext4 = it4.hasNext();
            strTnTj784 = numX49.tnTj78("bF3P6");
            if (zHasNext4) {
                next3 = it4.next();
                if (kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) next3).getName(), strTnTj784)) {
                    break;
                }
            } else {
                next3 = null;
                break;
            }
        }
        ShopHomeSectionTemplate shopHomeSectionTemplate4 = (ShopHomeSectionTemplate) next3;
        if (shopHomeSectionTemplate4 == null) {
            ((ShopV3HomePageFragment) ((ve.c) this.c.get())).C1(strTnTj784);
            iVar2 = p.c(new Pair(null, null));
        } else {
            ShopHomeSectionCarousel shopHomeSectionCarousel2 = new ShopHomeSectionCarousel(shopHomeSectionTemplate4.getName(), shopHomeSectionTemplate4.getListType(), shopHomeSectionTemplate4.getPosition(), null, 10, numX49.tnTj78("bF3Pa"), 8, null);
            O0 o02 = this.f20056d;
            o02.getClass();
            HashMap mapS = T2.s();
            mapS.put(numX49.tnTj78("bF3PX"), numX49.tnTj78("bF3PG"));
            p<ShopProviderBase> shopProviders = o02.f11378b.getShopProviders(mapS);
            com.google.firebase.messaging.p pVar = new com.google.firebase.messaging.p(o02, i4);
            shopProviders.getClass();
            iVar2 = new Lh.i(new Lh.d(new Lh.h(new Lh.d(shopProviders, pVar, i10), zh.b.a(), 0), new c(this, shopHomeSectionCarousel2, i11), i10).d(C2255a.c), new u(7, this, shopHomeSectionCarousel2), null);
        }
        Iterator it5 = arrayListM2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next5 = it5.next();
            if (kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) next5).getName(), strTnTj78)) {
                obj = next5;
                break;
            }
        }
        ShopHomeSectionTemplate shopHomeSectionTemplate5 = (ShopHomeSectionTemplate) obj;
        if (shopHomeSectionTemplate5 == null) {
            ((ShopV3HomePageFragment) ((ve.c) this.c.get())).C1(strTnTj78);
        } else {
            ShopCleverTapPromosBanner shopCleverTapPromosBanner = new ShopCleverTapPromosBanner(shopHomeSectionTemplate5.getName(), shopHomeSectionTemplate5.getListType(), shopHomeSectionTemplate5.getPosition());
            ShopV3HomePageFragment shopV3HomePageFragment4 = (ShopV3HomePageFragment) ((ve.c) this.c.get());
            shopV3HomePageFragment4.getClass();
            n nVar2 = shopV3HomePageFragment4.f14799h0;
            if (nVar2 != null) {
                ArrayList arrayList3 = nVar2.f20301d;
                if (arrayList3 == null || !arrayList3.isEmpty()) {
                    Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        if (kotlin.jvm.internal.j.b(((ShopHomeSectionItem) it6.next()).getName(), shopCleverTapPromosBanner.getName())) {
                            break;
                        }
                    }
                    ArrayList arrayListW = C1110A.W(arrayList3);
                    arrayListW.add(shopCleverTapPromosBanner);
                    nVar2.f(arrayListW);
                } else {
                    ArrayList arrayListW2 = C1110A.W(arrayList3);
                    arrayListW2.add(shopCleverTapPromosBanner);
                    nVar2.f(arrayListW2);
                }
            }
        }
        T t5 = new T(i4, new Lh.d(new Lh.h(p.j(pVarK, iVar, pVarC, iVar2, new p8.a(this, i)), zh.b.a(), 0), new C1983a(this, i), i11), new C2256b(this, i11));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        e(t5.a(1000L).e());
    }
}
