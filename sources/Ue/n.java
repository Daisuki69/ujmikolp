package ue;

import D.C0187u;
import N5.C0450f;
import N5.r1;
import android.content.Context;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import bd.C0939b;
import bd.C0946i;
import bd.C0947j;
import bd.EnumC0938a;
import bd.RunnableC0941d;
import cj.C1110A;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.common.utility.AbstractC1233w;
import com.paymaya.domain.model.ShopCleverTapPromosBanner;
import com.paymaya.domain.model.ShopHomeCarouselListItem;
import com.paymaya.domain.model.ShopHomeSectionCarousel;
import com.paymaya.domain.model.ShopHomeSectionItem;
import com.paymaya.ui.common.view.widget.Carousel;
import com.paymaya.ui.shopv3.view.fragment.impl.ShopV3HomePageFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import o6.C1967a;
import xe.C2472c;
import xe.C2473d;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShopV3HomePageFragment f20300b;
    public final LayoutInflater c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f20301d;
    public final LinkedHashMap e;

    public n(Context context, ShopV3HomePageFragment shopV3HomePageFragment) {
        this.f20299a = context;
        this.f20300b = shopV3HomePageFragment;
        Object systemService = context.getSystemService(numX49.tnTj78("bFlP"));
        kotlin.jvm.internal.j.e(systemService, numX49.tnTj78("bFlb"));
        this.c = (LayoutInflater) systemService;
        this.f20301d = new ArrayList();
        this.e = new LinkedHashMap();
    }

    public final void e(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f20301d);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cj.x.s(arrayList, new ac.l((ShopHomeSectionItem) it.next(), 1));
        }
        arrayList.addAll(list);
        f(arrayList);
    }

    public final void f(ArrayList arrayList) {
        List listQ = C1110A.Q(new B9.a(13), arrayList);
        ArrayList arrayList2 = this.f20301d;
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new o(arrayList2, listQ));
        kotlin.jvm.internal.j.f(diffResultCalculateDiff, numX49.tnTj78("bFl2"));
        arrayList2.clear();
        arrayList2.addAll(listQ);
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f20301d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((ShopHomeSectionItem) this.f20301d.get(i)).getViewType().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0187u c0187u;
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("bFlL"));
        ArrayList arrayList = this.f20301d;
        if (i >= arrayList.size()) {
            return;
        }
        if (viewHolder instanceof C2472c) {
            Object obj = arrayList.get(i);
            kotlin.jvm.internal.j.e(obj, numX49.tnTj78("bFlr"));
            ShopHomeSectionCarousel shopHomeSectionCarousel = (ShopHomeSectionCarousel) obj;
            C2472c c2472c = (C2472c) viewHolder;
            c2472c.c = shopHomeSectionCarousel;
            o6.f fVar = c2472c.f20943b;
            fVar.getClass();
            String name = shopHomeSectionCarousel.getName();
            C2472c c2472c2 = (C2472c) fVar.f18793b;
            kotlin.jvm.internal.j.g(name, numX49.tnTj78("bFlZ"));
            c2472c2.e.setText(name);
            String viewAllTarget = shopHomeSectionCarousel.getViewAllTarget();
            TextView textView = c2472c2.f;
            if (viewAllTarget == null || viewAllTarget.length() == 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
            List<ShopHomeCarouselListItem> list = shopHomeSectionCarousel.getList();
            List listR = list != null ? C1110A.R(list, shopHomeSectionCarousel.getMaxItemsShown()) : null;
            List list2 = listR;
            if (list2 != null && !list2.isEmpty()) {
                kotlin.jvm.internal.j.g(listR, numX49.tnTj78("bFlk"));
                l lVar = c2472c2.f20944d;
                lVar.getClass();
                ArrayList arrayList2 = lVar.f20298d;
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new C2311a(arrayList2, listR));
                kotlin.jvm.internal.j.f(diffResultCalculateDiff, numX49.tnTj78("bFlB"));
                arrayList2.clear();
                arrayList2.addAll(listR);
                diffResultCalculateDiff.dispatchUpdatesTo(lVar);
            }
            Parcelable parcelable = (Parcelable) this.e.get(Integer.valueOf(c2472c.getLayoutPosition()));
            RecyclerView recyclerView = c2472c.f20945g;
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
                return;
            }
            return;
        }
        if (viewHolder instanceof C2473d) {
            Object obj2 = arrayList.get(i);
            kotlin.jvm.internal.j.e(obj2, numX49.tnTj78("bFlu"));
            C1967a c1967a = ((C2473d) viewHolder).f20947b;
            c1967a.getClass();
            String name2 = ((ShopCleverTapPromosBanner) obj2).getName();
            C2473d c2473d = (C2473d) c1967a.f18783b;
            kotlin.jvm.internal.j.g(name2, numX49.tnTj78("bFlV"));
            c2473d.c.setText(name2);
            int dimensionPixelSize = c2473d.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.pma_shop_deals_and_promos_card_width);
            int dimensionPixelSize2 = c2473d.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.pma_shop_deals_and_promos_card_height);
            Carousel carousel = c2473d.f20948d;
            carousel.f14454p = dimensionPixelSize;
            carousel.f14453o = dimensionPixelSize2;
            ViewGroup.LayoutParams layoutParams = carousel.getCarouselLoading().getLayoutParams();
            layoutParams.height = dimensionPixelSize2;
            layoutParams.width = dimensionPixelSize;
            carousel.getCarouselLoading().setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = carousel.getCarouselLoading2().getLayoutParams();
            layoutParams2.height = dimensionPixelSize2;
            layoutParams2.width = dimensionPixelSize;
            carousel.getCarouselLoading2().setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = carousel.getCarouselLoading3().getLayoutParams();
            layoutParams3.height = dimensionPixelSize2;
            layoutParams3.width = dimensionPixelSize;
            carousel.getCarouselLoading3().setLayoutParams(layoutParams3);
            carousel.setDividerMode(EnumC0938a.f8634b);
            carousel.setAdCardCornerRadius(c2473d.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.maya_radius_2dp));
            carousel.setCarouselListener(c2473d.f20946a);
            carousel.setEndlessScrolling(true);
            carousel.setAutomaticScrolling(true);
            carousel.setHideCarouselTitle(true);
            carousel.setFilterAdsByScreen(AbstractC1233w.j);
            carousel.setMaxItemsToShow(3);
            Rc.c cVar = carousel.j;
            if (cVar == null || cVar.f5477d.isEmpty()) {
                if (carousel.getLayoutParams().height != -2) {
                    carousel.getLayoutParams().height = -2;
                    carousel.requestLayout();
                    carousel.setVisibility(0);
                }
                carousel.getCarouselLoading().setVisibility(0);
                if (carousel.f14462x) {
                    int iOrdinal = carousel.f14463y.ordinal();
                    if (iOrdinal == 0) {
                        carousel.getCarouselLoading2().setVisibility(0);
                        carousel.getCarouselLoading3().setVisibility(8);
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        carousel.getCarouselLoading2().setVisibility(0);
                        carousel.getCarouselLoading3().setVisibility(0);
                    }
                }
                carousel.getCarouselTitle().setVisibility(carousel.f14461w ? 8 : 0);
                Handler handler = carousel.f14450k;
                if (handler == null) {
                    carousel.f14450k = new Handler();
                } else {
                    handler.removeCallbacksAndMessages(null);
                }
                Handler handler2 = carousel.f14450k;
                if (handler2 != null) {
                    handler2.postDelayed(new RunnableC0941d(carousel, 1), 5000L);
                }
            } else {
                carousel.getCarouselTitle().setVisibility(carousel.f14461w ? 8 : 0);
                carousel.getCarouselRecyclerView().setVisibility(0);
                carousel.getCarouselLoading3().setVisibility(8);
                carousel.getCarouselLoading2().setVisibility(8);
                carousel.getCarouselLoading().setVisibility(8);
                carousel.d();
            }
            carousel.getCarouselRecyclerView().addOnItemTouchListener(new C0946i());
            C0947j c0947j = new C0947j(carousel);
            carousel.getCarouselRecyclerView().setLayoutManager(carousel.f14455q);
            carousel.getCarouselRecyclerView().addItemDecoration(new C0939b(carousel.f14437B, carousel.f14443T));
            ViewCompat.setNestedScrollingEnabled(carousel, false);
            if (carousel.getCarouselRecyclerView().getOnFlingListener() == null) {
                c0947j.attachToRecyclerView(carousel.getCarouselRecyclerView());
            }
            Rc.c cVar2 = new Rc.c(carousel.getContext(), carousel.f14445V, carousel.f14447a0, carousel.f14444U, carousel.f14454p, carousel.f14453o, carousel.f14439P, Boolean.valueOf(carousel.f14459u), carousel.f14460v, carousel.f14446W, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE), null);
            carousel.j = cVar2;
            cVar2.f5483p = carousel.f14438K;
            carousel.getCarouselRecyclerView().setAdapter(carousel.j);
            carousel.getCarouselRecyclerView().addOnScrollListener(new bd.k(carousel));
            if (!carousel.f14442S || (c0187u = carousel.m) == null) {
                return;
            }
            c0187u.q(carousel);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("bFlS"));
        int value = ShopHomeSectionItem.VIEW_TYPE.VIEW_TYPE_SHOP_HOME_SECTION_CAROUSEL.getValue();
        ShopV3HomePageFragment shopV3HomePageFragment = this.f20300b;
        String strTnTj78 = numX49.tnTj78("bFlj");
        LayoutInflater layoutInflater = this.c;
        if (i != value) {
            if (i != ShopHomeSectionItem.VIEW_TYPE.VIEW_TYPE_SHOP_HOME_SECTION_PROMOS_BANNER.getValue()) {
                throw new PayMayaRuntimeException(We.s.f(i, numX49.tnTj78("bFld")));
            }
            View viewInflate = layoutInflater.inflate(R.layout.pma_view_shop_v3_home_section_promos_banner, viewGroup, false);
            int i4 = R.id.clevertap_carousel_pma_view_shop_v3_home_section_promos_banner;
            Carousel carousel = (Carousel) ViewBindings.findChildViewById(viewInflate, R.id.clevertap_carousel_pma_view_shop_v3_home_section_promos_banner);
            if (carousel != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.section_name_text_view_pma_view_shop_v3_home_section_promos_banner);
                if (textView != null) {
                    return new C2473d(new C0450f((ViewGroup) constraintLayout, (Object) carousel, (Object) textView, 28), shopV3HomePageFragment);
                }
                i4 = R.id.section_name_text_view_pma_view_shop_v3_home_section_promos_banner;
            }
            throw new NullPointerException(strTnTj78.concat(viewInflate.getResources().getResourceName(i4)));
        }
        View viewInflate2 = layoutInflater.inflate(R.layout.pma_view_shop_v3_home_section_carousel, viewGroup, false);
        int i6 = R.id.carousel_items_recycler_view_pma_view_shop_v3_home_section_carousel;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate2, R.id.carousel_items_recycler_view_pma_view_shop_v3_home_section_carousel);
        if (recyclerView != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate2;
            int i10 = R.id.section_name_text_view_pma_view_shop_v3_home_section_carousel;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.section_name_text_view_pma_view_shop_v3_home_section_carousel);
            if (textView2 != null) {
                i10 = R.id.view_all_text_view_pma_view_shop_v3_home_section_carousel;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.view_all_text_view_pma_view_shop_v3_home_section_carousel);
                if (textView3 != null) {
                    return new C2472c(new r1(constraintLayout2, recyclerView, textView2, textView3), this.f20299a, shopV3HomePageFragment);
                }
            }
            i6 = i10;
        }
        throw new NullPointerException(strTnTj78.concat(viewInflate2.getResources().getResourceName(i6)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        kotlin.jvm.internal.j.g(recyclerView, numX49.tnTj78("bFli"));
        super.onDetachedFromRecyclerView(recyclerView);
        ArrayList<ShopHomeSectionItem> arrayList = this.f20301d;
        for (ShopHomeSectionItem shopHomeSectionItem : arrayList) {
            if ((shopHomeSectionItem instanceof ShopCleverTapPromosBanner) && (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(arrayList.indexOf(shopHomeSectionItem))) != null && (viewHolderFindViewHolderForAdapterPosition instanceof C2473d)) {
                Carousel carousel = ((C2473d) viewHolderFindViewHolderForAdapterPosition).f20948d;
                Handler handler = carousel.f14450k;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                Handler handler2 = carousel.f14451l;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("bFlE"));
        if (viewHolder instanceof C2472c) {
            LinkedHashMap linkedHashMap = this.e;
            C2472c c2472c = (C2472c) viewHolder;
            Integer numValueOf = Integer.valueOf(c2472c.getLayoutPosition());
            RecyclerView.LayoutManager layoutManager = c2472c.f20945g.getLayoutManager();
            linkedHashMap.put(numValueOf, layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        }
    }
}
