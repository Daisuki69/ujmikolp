package ac;

import D.C0187u;
import N5.A1;
import N5.C0446d1;
import N5.G0;
import N5.k1;
import N5.r1;
import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import cj.C1110A;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.model.ShopCleverTapPromosBanner;
import com.paymaya.domain.model.ShopHomeCarouselListItem;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopHomeSectionItem;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopHomePageFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import ue.C2311a;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.paymaya.data.preference.a f7106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1220i f7107b;
    public final Context c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MayaShopHomePageFragment f7108d;
    public final LifecycleOwner e;
    public final FragmentActivity f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MayaShopHomePageFragment f7109g;
    public final LayoutInflater h;
    public final ArrayList i;
    public final LinkedHashMap j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public dc.i f7110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7111l;

    public o(com.paymaya.data.preference.a aVar, C1220i c1220i, Context context, MayaShopHomePageFragment mayaShopHomePageFragment, LifecycleOwner lifecycleOwner, FragmentActivity fragmentActivity, MayaShopHomePageFragment mayaShopHomePageFragment2) {
        this.f7106a = aVar;
        this.f7107b = c1220i;
        this.c = context;
        this.f7108d = mayaShopHomePageFragment;
        this.e = lifecycleOwner;
        this.f = fragmentActivity;
        this.f7109g = mayaShopHomePageFragment2;
        Object systemService = context.getSystemService(numX49.tnTj78("buOP9"));
        kotlin.jvm.internal.j.e(systemService, numX49.tnTj78("buOPP"));
        this.h = (LayoutInflater) systemService;
        this.i = new ArrayList();
        this.j = new LinkedHashMap();
    }

    public final void e(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cj.x.s(arrayList, new l((ShopHomeSectionItem) it.next(), 0));
        }
        arrayList.addAll(list);
        f(arrayList);
    }

    public final void f(ArrayList arrayList) {
        List listQ = C1110A.Q(new B9.a(10), arrayList);
        ArrayList arrayList2 = this.i;
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new ue.o(arrayList2, listQ));
        kotlin.jvm.internal.j.f(diffResultCalculateDiff, numX49.tnTj78("buOPb"));
        arrayList2.clear();
        arrayList2.addAll(listQ);
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((ShopHomeSectionItem) this.i.get(i)).getViewType().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("buOP2"));
        ArrayList arrayList = this.i;
        if (i >= arrayList.size()) {
            return;
        }
        if (!(viewHolder instanceof dc.f)) {
            if (viewHolder instanceof dc.i) {
                Object obj = arrayList.get(i);
                kotlin.jvm.internal.j.e(obj, numX49.tnTj78("buOPB"));
                dc.i iVar = (dc.i) viewHolder;
                this.f7110k = iVar;
                Q6.s sVar = iVar.f16324b;
                sVar.getClass();
                dc.i iVar2 = (dc.i) sVar.f5293b;
                View view = iVar2.itemView;
                kotlin.jvm.internal.j.f(view, numX49.tnTj78("buOPu"));
                OneShotPreDrawListener.add(view, new S1.v(24, view, iVar2));
                String upperCase = ((ShopCleverTapPromosBanner) obj).getName().toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.j.f(upperCase, numX49.tnTj78("buOPV"));
                TextView textView = iVar2.c;
                textView.setText(textView.getContext().getString(R.string.maya_shop_title_with_gift, upperCase));
                MayaShopHomePageFragment mayaShopHomePageFragment = iVar2.f16323a;
                if (mayaShopHomePageFragment == null || !mayaShopHomePageFragment.isResumed()) {
                    return;
                }
                MayaCarousel mayaCarousel = iVar2.e;
                C0187u c0187u = mayaCarousel.f12035w;
                if (c0187u != null) {
                    c0187u.q(mayaCarousel);
                }
                mayaCarousel.k();
                return;
            }
            return;
        }
        Object obj2 = arrayList.get(i);
        kotlin.jvm.internal.j.e(obj2, numX49.tnTj78("buOPL"));
        ShopHomeSectionCarousel shopHomeSectionCarousel = (ShopHomeSectionCarousel) obj2;
        dc.f fVar = (dc.f) viewHolder;
        fVar.f = shopHomeSectionCarousel;
        fVar.f16318g.e = shopHomeSectionCarousel;
        Xb.g gVar = fVar.e;
        gVar.getClass();
        String name = shopHomeSectionCarousel.getName();
        dc.f fVar2 = gVar.f6569a;
        kotlin.jvm.internal.j.g(name, numX49.tnTj78("buOPr"));
        TextView textView2 = fVar2.h;
        textView2.setText(name);
        String viewAllTarget = shopHomeSectionCarousel.getViewAllTarget();
        TextView textView3 = fVar2.i;
        if (viewAllTarget == null || viewAllTarget.length() == 0) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
        }
        List<ShopHomeCarouselListItem> list = shopHomeSectionCarousel.getList();
        List listR = list != null ? C1110A.R(list, shopHomeSectionCarousel.getMaxItemsShown()) : null;
        List list2 = listR;
        if (list2 != null && !list2.isEmpty()) {
            kotlin.jvm.internal.j.g(listR, numX49.tnTj78("buOPZ"));
            k kVar = fVar2.f16318g;
            kVar.getClass();
            ArrayList arrayList2 = kVar.f7101d;
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new C2311a(arrayList2, listR));
            kotlin.jvm.internal.j.f(diffResultCalculateDiff, numX49.tnTj78("buOPk"));
            arrayList2.clear();
            arrayList2.addAll(listR);
            diffResultCalculateDiff.dispatchUpdatesTo(kVar);
        }
        List<ShopHomeCarouselListItem> list3 = shopHomeSectionCarousel.getList();
        if (list3 == null) {
            list3 = C1112C.f9377a;
        }
        List<ShopHomeCarouselListItem> list4 = list3;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            fVar2.j.setVisibility(8);
            textView2.setVisibility(0);
        } else {
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                if (((ShopHomeCarouselListItem) it.next()).getViewTypeShopHomeCarouselItem().getValue() <= 0) {
                    break;
                }
            }
            fVar2.j.setVisibility(8);
            textView2.setVisibility(0);
        }
        Parcelable parcelable = (Parcelable) this.j.get(Integer.valueOf(fVar.getLayoutPosition()));
        RecyclerView recyclerView = fVar.f16319k;
        if (parcelable != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.onRestoreInstanceState(parcelable);
                return;
            }
            return;
        }
        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        if (layoutManager2 != null) {
            layoutManager2.scrollToPosition(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("buOPS"));
        int value = ShopHomeSectionItem.VIEW_TYPE.VIEW_TYPE_SHOP_HOME_SECTION_CAROUSEL.getValue();
        String strTnTj78 = numX49.tnTj78("buOPj");
        LayoutInflater layoutInflater = this.h;
        if (i == value) {
            View viewInflate = layoutInflater.inflate(R.layout.maya_view_shop_home_section_carousel, viewGroup, false);
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            int i4 = R.id.shop_home_loading_carousel_items_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.shop_home_loading_carousel_items_recycler_view);
            if (recyclerView != null) {
                i4 = R.id.shop_home_loading_title;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.shop_home_loading_title);
                if (viewFindChildViewById != null) {
                    A1 a12 = new A1((CardView) viewFindChildViewById, 0);
                    i4 = R.id.shop_home_loading_view_all_text_view;
                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.shop_home_loading_view_all_text_view);
                    if (textView != null) {
                        i4 = R.id.shop_home_title_text_view;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.shop_home_title_text_view);
                        if (textView2 != null) {
                            return new dc.f(new k1((ViewGroup) constraintLayout, (View) recyclerView, (Object) a12, textView, (View) textView2, 6), this.f7106a, this.f7107b, this.c, this.f7108d);
                        }
                    }
                }
            }
            throw new NullPointerException(strTnTj78.concat(viewInflate.getResources().getResourceName(i4)));
        }
        int value2 = ShopHomeSectionItem.VIEW_TYPE.VIEW_TYPE_SHOP_HOME_SECTION_PROMOS_BANNER.getValue();
        MayaShopHomePageFragment mayaShopHomePageFragment = this.f7108d;
        if (i == value2) {
            View viewInflate2 = layoutInflater.inflate(R.layout.maya_view_shop_home_section_promos_banner, viewGroup, false);
            int i6 = R.id.barrier;
            if (((Barrier) ViewBindings.findChildViewById(viewInflate2, R.id.barrier)) != null) {
                i6 = R.id.shop_promo_loading_clevertap_carousel;
                MayaCarousel mayaCarousel = (MayaCarousel) ViewBindings.findChildViewById(viewInflate2, R.id.shop_promo_loading_clevertap_carousel);
                if (mayaCarousel != null) {
                    i6 = R.id.shop_promo_loading_title;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate2, R.id.shop_promo_loading_title);
                    if (viewFindChildViewById2 != null) {
                        A1 a13 = new A1((CardView) viewFindChildViewById2, 0);
                        i6 = R.id.shop_promo_title_text_view;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.shop_promo_title_text_view);
                        if (textView3 != null) {
                            dc.i iVar = new dc.i(new r1((ConstraintLayout) viewInflate2, mayaCarousel, a13, textView3, 3), mayaShopHomePageFragment);
                            iVar.f = this.f7111l;
                            return iVar;
                        }
                    }
                }
            }
            throw new NullPointerException(strTnTj78.concat(viewInflate2.getResources().getResourceName(i6)));
        }
        if (i != ShopHomeSectionItem.VIEW_TYPE.VIEW_TYPE_SHOP_HOME_SECTION_LOAD_V2_BANNER.getValue()) {
            if (i != ShopHomeSectionItem.VIEW_TYPE.VIEW_TYPE_SHOP_HOME_SECTION_GAM_BANNER.getValue()) {
                throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("buOPd")));
            }
            View viewInflate3 = layoutInflater.inflate(R.layout.maya_view_shop_home_section_gam_carousel, viewGroup, false);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate3;
            BannerAdCarousel bannerAdCarousel = (BannerAdCarousel) ViewBindings.findChildViewById(viewInflate3, R.id.shop_home_section_ad_banner);
            if (bannerAdCarousel != null) {
                return new dc.g(new C0446d1(constraintLayout2, bannerAdCarousel, 1), this.c, this.e, this.f, this.f7109g);
            }
            throw new NullPointerException(strTnTj78.concat(viewInflate3.getResources().getResourceName(R.id.shop_home_section_ad_banner)));
        }
        View viewInflate4 = layoutInflater.inflate(R.layout.maya_view_shop_home_section_load_v2_banner, viewGroup, false);
        int i10 = R.id.image_view_load_v2_chevron_right;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate4, R.id.image_view_load_v2_chevron_right);
        if (appCompatImageView != null) {
            i10 = R.id.image_view_load_v2_new_tag;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate4, R.id.image_view_load_v2_new_tag);
            if (appCompatImageView2 != null) {
                i10 = R.id.text_view_load_v2_banner_subtitle;
                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate4, R.id.text_view_load_v2_banner_subtitle);
                if (textView4 != null) {
                    i10 = R.id.text_view_load_v2_banner_title;
                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate4, R.id.text_view_load_v2_banner_title);
                    if (textView5 != null) {
                        return new dc.h(new G0((ConstraintLayout) viewInflate4, appCompatImageView, appCompatImageView2, textView4, textView5), this.f7106a, this.f7107b, mayaShopHomePageFragment);
                    }
                }
            }
        }
        throw new NullPointerException(strTnTj78.concat(viewInflate4.getResources().getResourceName(i10)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        kotlin.jvm.internal.j.g(recyclerView, numX49.tnTj78("buOPi"));
        super.onDetachedFromRecyclerView(recyclerView);
        ArrayList<ShopHomeSectionItem> arrayList = this.i;
        for (ShopHomeSectionItem shopHomeSectionItem : arrayList) {
            if ((shopHomeSectionItem instanceof ShopCleverTapPromosBanner) && (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(arrayList.indexOf(shopHomeSectionItem))) != null && (viewHolderFindViewHolderForAdapterPosition instanceof dc.i)) {
                ((dc.i) viewHolderFindViewHolderForAdapterPosition).e.m();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("buOPE"));
        if (viewHolder instanceof dc.f) {
            LinkedHashMap linkedHashMap = this.j;
            dc.f fVar = (dc.f) viewHolder;
            Integer numValueOf = Integer.valueOf(fVar.getLayoutPosition());
            RecyclerView.LayoutManager layoutManager = fVar.f16319k.getLayoutManager();
            linkedHashMap.put(numValueOf, layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
    }
}
