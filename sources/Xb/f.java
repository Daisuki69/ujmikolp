package Xb;

import Kh.T;
import M8.T2;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.ShopCleverTapPromosBanner;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopHomeSectionGamCarousel;
import com.paymaya.domain.model.ShopHomeSectionItem;
import com.paymaya.domain.model.ShopHomeSectionLoadV2Banner;
import com.paymaya.domain.model.ShopHomeSectionTemplate;
import com.paymaya.domain.model.ShopProviderBase;
import com.paymaya.domain.model.ShopProviderCategory;
import com.paymaya.domain.store.C1285t0;
import com.paymaya.domain.store.L0;
import com.paymaya.domain.store.O0;
import com.paymaya.domain.store.Q0;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractC2509a implements Wb.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O0 f6567d;
    public final L0 e;
    public final C1285t0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Q0 f6568g;
    public final com.paymaya.data.preference.a h;
    public final S5.c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(O0 o02, L0 l02, C1285t0 c1285t0, Q0 q02, com.paymaya.data.preference.a mPreference, S5.c mFlagConfigurationService, Uh.d dVar) {
        super(dVar);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(mFlagConfigurationService, "mFlagConfigurationService");
        this.f6567d = o02;
        this.e = l02;
        this.f = c1285t0;
        this.f6568g = q02;
        this.h = mPreference;
        this.i = mFlagConfigurationService;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        n();
    }

    public final Ah.p k(List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) next).getName(), "Buy Again")) {
                break;
            }
        }
        ShopHomeSectionTemplate shopHomeSectionTemplate = (ShopHomeSectionTemplate) next;
        if (shopHomeSectionTemplate != null) {
            return new Lh.i(new Lh.d(new Lh.d(new Lh.h(this.f6568g.a(), zh.b.a(), 0).d(C0612a.f6558d), new Lh.c(27, this, shopHomeSectionTemplate, false), 2).d(C0612a.e), new Q6.s(this, 9), 0), new C0613b(this, 1), null);
        }
        ((MayaShopHomePageFragment) ((bc.b) this.c.get())).T1("Buy Again");
        return Ah.p.c(new Pair(null, null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r8.equals("Load") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        r3 = com.paymaya.domain.model.ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_PROVIDER_LOGO_LOADING;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        return cj.C1132s.g(new com.paymaya.domain.model.ShopHomeCarouselLoadingItem(r3), new com.paymaya.domain.model.ShopHomeCarouselLoadingItem(r3), new com.paymaya.domain.model.ShopHomeCarouselLoadingItem(r3), new com.paymaya.domain.model.ShopHomeCarouselLoadingItem(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r8.equals("Brands for you") == false) goto L25;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List l(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            java.lang.String r3 = "sectionName"
            kotlin.jvm.internal.j.g(r8, r3)
            int r3 = r8.hashCode()
            switch(r3) {
                case -289441530: goto L7f;
                case 2373894: goto L4f;
                case 218729015: goto L3a;
                case 326861628: goto L1a;
                case 824926740: goto L11;
                default: goto Lf;
            }
        Lf:
            goto L87
        L11:
            java.lang.String r3 = "Brands for you"
            boolean r8 = r8.equals(r3)
            if (r8 != 0) goto L58
            goto L87
        L1a:
            java.lang.String r3 = "Most Popular"
            boolean r8 = r8.equals(r3)
            if (r8 != 0) goto L23
            goto L87
        L23:
            com.paymaya.domain.model.ShopHomeCarouselLoadingItem r8 = new com.paymaya.domain.model.ShopHomeCarouselLoadingItem
            com.paymaya.domain.model.ShopHomeCarouselListItem$VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM r3 = com.paymaya.domain.model.ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_MOST_POPULAR_PRODUCT_LOADING
            r8.<init>(r3)
            com.paymaya.domain.model.ShopHomeCarouselLoadingItem r4 = new com.paymaya.domain.model.ShopHomeCarouselLoadingItem
            r4.<init>(r3)
            com.paymaya.domain.model.ShopHomeCarouselLoadingItem[] r2 = new com.paymaya.domain.model.ShopHomeCarouselLoadingItem[r2]
            r2[r1] = r8
            r2[r0] = r4
            java.util.List r8 = cj.C1132s.g(r2)
            return r8
        L3a:
            java.lang.String r0 = "Favorites"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L43
            goto L87
        L43:
            com.paymaya.domain.model.ShopHomeCarouselLoadingItem r8 = new com.paymaya.domain.model.ShopHomeCarouselLoadingItem
            com.paymaya.domain.model.ShopHomeCarouselListItem$VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM r0 = com.paymaya.domain.model.ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_FAVORITE_LOADING
            r8.<init>(r0)
            java.util.List r8 = cj.r.c(r8)
            return r8
        L4f:
            java.lang.String r3 = "Load"
            boolean r8 = r8.equals(r3)
            if (r8 != 0) goto L58
            goto L87
        L58:
            com.paymaya.domain.model.ShopHomeCarouselLoadingItem r8 = new com.paymaya.domain.model.ShopHomeCarouselLoadingItem
            com.paymaya.domain.model.ShopHomeCarouselListItem$VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM r3 = com.paymaya.domain.model.ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_PROVIDER_LOGO_LOADING
            r8.<init>(r3)
            com.paymaya.domain.model.ShopHomeCarouselLoadingItem r4 = new com.paymaya.domain.model.ShopHomeCarouselLoadingItem
            r4.<init>(r3)
            com.paymaya.domain.model.ShopHomeCarouselLoadingItem r5 = new com.paymaya.domain.model.ShopHomeCarouselLoadingItem
            r5.<init>(r3)
            com.paymaya.domain.model.ShopHomeCarouselLoadingItem r6 = new com.paymaya.domain.model.ShopHomeCarouselLoadingItem
            r6.<init>(r3)
            r3 = 4
            com.paymaya.domain.model.ShopHomeCarouselLoadingItem[] r3 = new com.paymaya.domain.model.ShopHomeCarouselLoadingItem[r3]
            r3[r1] = r8
            r3[r0] = r4
            r3[r2] = r5
            r8 = 3
            r3[r8] = r6
            java.util.List r8 = cj.C1132s.g(r3)
            return r8
        L7f:
            java.lang.String r3 = "Buy Again"
            boolean r8 = r8.equals(r3)
            if (r8 != 0) goto L8a
        L87:
            cj.C r8 = cj.C1112C.f9377a
            return r8
        L8a:
            com.paymaya.domain.model.ShopHomeCarouselLoadingItem r8 = new com.paymaya.domain.model.ShopHomeCarouselLoadingItem
            com.paymaya.domain.model.ShopHomeCarouselListItem$VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM r3 = com.paymaya.domain.model.ShopHomeCarouselListItem.VIEW_TYPE_SHOP_HOME_CAROUSEL_ITEM.VIEW_TYPE_BUY_AGAIN_PURCHASE_LOADING
            r8.<init>(r3)
            com.paymaya.domain.model.ShopHomeCarouselLoadingItem r4 = new com.paymaya.domain.model.ShopHomeCarouselLoadingItem
            r4.<init>(r3)
            com.paymaya.domain.model.ShopHomeCarouselLoadingItem[] r2 = new com.paymaya.domain.model.ShopHomeCarouselLoadingItem[r2]
            r2[r1] = r8
            r2[r0] = r4
            java.util.List r8 = cj.C1132s.g(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Xb.f.l(java.lang.String):java.util.List");
    }

    public final ArrayList m() {
        ShopHomeSectionTemplate shopHomeSectionTemplate;
        List<ShopHomeSectionTemplate> sectionsAsList = this.h.e().mShopConfig().mHome().getSectionsAsList();
        kotlin.jvm.internal.j.f(sectionsAsList, "getSectionsAsList(...)");
        List listQ = C1110A.Q(new e(), sectionsAsList);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (!kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) obj).getName(), "Favorites")) {
                arrayList.add(obj);
            }
        }
        Object obj2 = null;
        if (S5.c.b(this.i, A5.b.f50A1)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) next).getListType(), "deals")) {
                    obj2 = next;
                    break;
                }
            }
            shopHomeSectionTemplate = (ShopHomeSectionTemplate) obj2;
        } else {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) next2).getListType(), "deals_gam")) {
                    obj2 = next2;
                    break;
                }
            }
            shopHomeSectionTemplate = (ShopHomeSectionTemplate) obj2;
        }
        return shopHomeSectionTemplate != null ? C1110A.K(arrayList, shopHomeSectionTemplate) : arrayList;
    }

    public final void n() {
        Object next;
        Ah.p iVar;
        Object next2;
        Ah.p pVarC;
        Object next3;
        Ah.p iVar2;
        int i = 10;
        int i4 = 1;
        int i6 = 2;
        int i10 = 0;
        if (((MayaShopHomePageFragment) ((bc.b) this.c.get())).t0 || !((MayaShopHomePageFragment) ((bc.b) this.c.get())).u0.isEmpty()) {
            return;
        }
        MayaShopHomePageFragment mayaShopHomePageFragment = (MayaShopHomePageFragment) ((bc.b) this.c.get());
        mayaShopHomePageFragment.t0 = true;
        mayaShopHomePageFragment.V1();
        MayaShopHomePageFragment mayaShopHomePageFragment2 = (MayaShopHomePageFragment) ((bc.b) this.c.get());
        f fVar = (f) mayaShopHomePageFragment2.R1();
        ArrayList arrayListM = fVar.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM) {
            if (!kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) obj).getName(), "Deals & Promos")) {
                arrayList.add(obj);
            }
        }
        ArrayList<ShopHomeSectionTemplate> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) obj2).getListType(), "deals_gam")) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(cj.t.l(arrayList2, 10));
        for (ShopHomeSectionTemplate shopHomeSectionTemplate : arrayList2) {
            arrayList3.add(new ShopHomeSectionCarousel(shopHomeSectionTemplate.getName(), shopHomeSectionTemplate.getListType(), shopHomeSectionTemplate.getPosition(), fVar.l(shopHomeSectionTemplate.getName()), 0, null, 16, null));
        }
        MayaShopHomePageFragment mayaShopHomePageFragment3 = (MayaShopHomePageFragment) ((bc.b) fVar.c.get());
        mayaShopHomePageFragment3.getClass();
        ac.o oVar = mayaShopHomePageFragment3.f14009v0;
        if (oVar != null) {
            oVar.e(arrayList3);
        }
        ((MayaShopHomePageFragment) ((bc.b) fVar.c.get())).L1();
        RecyclerView recyclerView = mayaShopHomePageFragment2.f14007r0;
        Object obj3 = null;
        if (recyclerView == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewItems");
            throw null;
        }
        recyclerView.scrollToPosition(0);
        ArrayList arrayListM2 = m();
        Ah.p pVarK = k(arrayListM2);
        Iterator it = arrayListM2.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) next).getName(), "Most Popular")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ShopHomeSectionTemplate shopHomeSectionTemplate2 = (ShopHomeSectionTemplate) next;
        if (shopHomeSectionTemplate2 == null) {
            ((MayaShopHomePageFragment) ((bc.b) this.c.get())).T1("Most Popular");
            iVar = Ah.p.c(new Pair(null, null));
        } else {
            iVar = new Lh.i(new Lh.d(new Lh.d(new Lh.h(this.f.d(), zh.b.a(), 0), new C0614c(this, new ShopHomeSectionCarousel(shopHomeSectionTemplate2.getName(), shopHomeSectionTemplate2.getListType(), shopHomeSectionTemplate2.getPosition(), null, 5, null, 8, null), i6), i6).d(C0612a.f6559g), new R4.i(this, 8), i10), new C0613b(this, i6), null);
        }
        ShopProviderCategory shopProviderCategoryA = this.e.a();
        Iterator it2 = arrayListM2.iterator();
        while (true) {
            if (it2.hasNext()) {
                next2 = it2.next();
                if (kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) next2).getName(), "Load")) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        ShopHomeSectionTemplate shopHomeSectionTemplate3 = (ShopHomeSectionTemplate) next2;
        if ((shopProviderCategoryA != null ? shopProviderCategoryA.getCode() : null) == null || shopHomeSectionTemplate3 == null) {
            ((MayaShopHomePageFragment) ((bc.b) this.c.get())).T1("Load");
            pVarC = Ah.p.c(new Pair(null, null));
        } else {
            ShopHomeSectionCarousel shopHomeSectionCarousel = new ShopHomeSectionCarousel(shopHomeSectionTemplate3.getName(), shopHomeSectionTemplate3.getListType(), shopHomeSectionTemplate3.getPosition(), null, 10, null, 8, null);
            pVarC = new Lh.i(new Lh.d(new Lh.d(new Lh.h(this.f6567d.c(shopProviderCategoryA.getCode()), zh.b.a(), 0), new C0614c(this, shopHomeSectionCarousel, i4), i6).d(C0612a.f), new Q6.n(this, i), i10), new Bb.c(12, this, shopProviderCategoryA, shopHomeSectionCarousel), null);
        }
        Iterator it3 = arrayListM2.iterator();
        while (true) {
            if (it3.hasNext()) {
                next3 = it3.next();
                if (kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) next3).getName(), "Brands for you")) {
                    break;
                }
            } else {
                next3 = null;
                break;
            }
        }
        ShopHomeSectionTemplate shopHomeSectionTemplate4 = (ShopHomeSectionTemplate) next3;
        if (shopHomeSectionTemplate4 == null) {
            ((MayaShopHomePageFragment) ((bc.b) this.c.get())).T1("Brands for you");
            iVar2 = Ah.p.c(new Pair(null, null));
        } else {
            ShopHomeSectionCarousel shopHomeSectionCarousel2 = new ShopHomeSectionCarousel(shopHomeSectionTemplate4.getName(), shopHomeSectionTemplate4.getListType(), shopHomeSectionTemplate4.getPosition(), null, 10, "Brands for you", 8, null);
            O0 o02 = this.f6567d;
            o02.getClass();
            HashMap mapS = T2.s();
            mapS.put("limit", "10");
            Ah.p<ShopProviderBase> shopProviders = o02.f11378b.getShopProviders(mapS);
            com.google.firebase.messaging.p pVar = new com.google.firebase.messaging.p(o02, 5);
            shopProviders.getClass();
            iVar2 = new Lh.i(new Lh.d(new Lh.d(new Lh.h(new Lh.d(shopProviders, pVar, i6), zh.b.a(), 0), new C0614c(this, shopHomeSectionCarousel2, i10), i6).d(C0612a.c), new C0615d(this, i10), i10), new A7.r(24, this, shopHomeSectionCarousel2), null);
        }
        if (this.h.e().isLoadV2Enabled()) {
            ((MayaShopHomePageFragment) ((bc.b) this.c.get())).P1(new ShopHomeSectionLoadV2Banner(null, null, 0, 3, null));
        } else {
            ((MayaShopHomePageFragment) ((bc.b) this.c.get())).U1(ShopHomeSectionItem.VIEW_TYPE.VIEW_TYPE_SHOP_HOME_SECTION_LOAD_V2_BANNER);
        }
        if (S5.c.b(this.i, A5.b.f50A1)) {
            Iterator it4 = arrayListM2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next4 = it4.next();
                if (kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) next4).getListType(), "deals_gam")) {
                    obj3 = next4;
                    break;
                }
            }
            ShopHomeSectionTemplate shopHomeSectionTemplate5 = (ShopHomeSectionTemplate) obj3;
            if (shopHomeSectionTemplate5 == null) {
                ((MayaShopHomePageFragment) ((bc.b) this.c.get())).U1(ShopHomeSectionItem.VIEW_TYPE.VIEW_TYPE_SHOP_HOME_SECTION_GAM_BANNER);
            } else {
                ((MayaShopHomePageFragment) ((bc.b) this.c.get())).P1(new ShopHomeSectionGamCarousel(shopHomeSectionTemplate5.getName(), shopHomeSectionTemplate5.getListType(), shopHomeSectionTemplate5.getPosition()));
            }
        } else {
            Iterator it5 = arrayListM2.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next5 = it5.next();
                if (kotlin.jvm.internal.j.b(((ShopHomeSectionTemplate) next5).getName(), "Deals & Promos")) {
                    obj3 = next5;
                    break;
                }
            }
            ShopHomeSectionTemplate shopHomeSectionTemplate6 = (ShopHomeSectionTemplate) obj3;
            if (shopHomeSectionTemplate6 == null) {
                ((MayaShopHomePageFragment) ((bc.b) this.c.get())).T1("Deals & Promos");
            } else {
                ShopCleverTapPromosBanner shopCleverTapPromosBanner = new ShopCleverTapPromosBanner(shopHomeSectionTemplate6.getName(), shopHomeSectionTemplate6.getListType(), shopHomeSectionTemplate6.getPosition());
                MayaShopHomePageFragment mayaShopHomePageFragment4 = (MayaShopHomePageFragment) ((bc.b) this.c.get());
                mayaShopHomePageFragment4.getClass();
                ac.o oVar2 = mayaShopHomePageFragment4.f14009v0;
                if (oVar2 != null) {
                    ArrayList arrayList4 = oVar2.i;
                    if (arrayList4 == null || !arrayList4.isEmpty()) {
                        Iterator it6 = arrayList4.iterator();
                        while (it6.hasNext()) {
                            if (kotlin.jvm.internal.j.b(((ShopHomeSectionItem) it6.next()).getName(), shopCleverTapPromosBanner.getName())) {
                                break;
                            }
                        }
                        ArrayList arrayListW = C1110A.W(arrayList4);
                        arrayListW.add(shopCleverTapPromosBanner);
                        oVar2.f(arrayListW);
                    } else {
                        ArrayList arrayListW2 = C1110A.W(arrayList4);
                        arrayListW2.add(shopCleverTapPromosBanner);
                        oVar2.f(arrayListW2);
                    }
                }
            }
        }
        T t5 = new T(5, new Lh.d(new Lh.h(Ah.p.j(pVarK, iVar, pVarC, iVar2, new T3.l(this, 7)), zh.b.a(), 0), new Q6.r(this, 9), i10), new C0613b(this, i10));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        e(t5.a(1000L).e());
    }

    public final void o(int i, String str) {
        if (this.h.e().isShopEventsV2Enabled()) {
            MayaShopHomePageFragment mayaShopHomePageFragment = (MayaShopHomePageFragment) ((bc.b) this.c.get());
            mayaShopHomePageFragment.getClass();
            C1219h c1219hE = C1219h.e("SHOP_ERROR_SCREEN");
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            HashMap map = c1219hE.j;
            map.put("section", "Home");
            map.put(StateEvent.Name.ERROR_CODE, String.valueOf(i));
            map.put("error_reason", str);
            mayaShopHomePageFragment.z1(c1219hE);
        }
    }
}
