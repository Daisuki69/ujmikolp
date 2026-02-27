package com.paymaya.ui.common.view.widget;

import C.h;
import D.C0187u;
import E8.n;
import I.b;
import N5.C0435a;
import Rc.c;
import a7.C0644e;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import androidx.work.impl.e;
import bd.EnumC0938a;
import bd.EnumC0945h;
import bd.InterfaceC0942e;
import bd.InterfaceC0943f;
import bd.InterfaceC0944g;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1112C;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent;
import com.paymaya.R;
import com.paymaya.domain.model.ClevertapAd;
import com.paymaya.ui.common.view.widget.Carousel;
import d2.C1328c;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import yk.a;

/* JADX INFO: loaded from: classes4.dex */
public final class Carousel extends ConstraintLayout implements b {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ int f14436b0 = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f14437B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ClevertapAd.TextStyle f14438K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f14439P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f14440Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f14441R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f14442S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public EnumC0938a f14443T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public List f14444U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public InterfaceC0942e f14445V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f14446W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final e f14447a0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0435a f14448d;
    public final InterfaceC1033d e;
    public final InterfaceC1033d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1033d f14449g;
    public final InterfaceC1033d h;
    public final InterfaceC1033d i;
    public c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Handler f14450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f14451l;
    public final C0187u m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14452n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14453o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14454p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinearLayoutManager f14455q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AccelerateInterpolator f14456r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14457s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14458t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14459u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14460v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14461w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14462x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public EnumC0945h f14463y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pma_widget_carousel, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.carousel_loading_card_view_2_pma_widget_carousel;
        CardView cardView = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.carousel_loading_card_view_2_pma_widget_carousel);
        if (cardView != null) {
            i = R.id.carousel_loading_card_view_3_pma_widget_carousel;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.carousel_loading_card_view_3_pma_widget_carousel);
            if (cardView2 != null) {
                i = R.id.carousel_loading_card_view_pma_widget_carousel;
                CardView cardView3 = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.carousel_loading_card_view_pma_widget_carousel);
                if (cardView3 != null) {
                    i = R.id.carousel_recycler_view_pma_widget_carousel;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.carousel_recycler_view_pma_widget_carousel);
                    if (recyclerView != null) {
                        i = R.id.carousel_title_text_view_pma_widget_carousel;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.carousel_title_text_view_pma_widget_carousel);
                        if (textView != null) {
                            this.f14448d = new C0435a((ViewGroup) viewInflate, (Object) cardView, (Object) cardView2, (Object) cardView3, (View) recyclerView, (Object) textView, 26);
                            final int i4 = 0;
                            this.e = C1034e.b(new Function0(this) { // from class: bd.c

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ Carousel f8638b;

                                {
                                    this.f8638b = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i4) {
                                        case 0:
                                            return (TextView) this.f8638b.f14448d.f4049g;
                                        case 1:
                                            return (RecyclerView) this.f8638b.f14448d.f;
                                        case 2:
                                            return (CardView) this.f8638b.f14448d.e;
                                        case 3:
                                            return (CardView) this.f8638b.f14448d.c;
                                        default:
                                            return (CardView) this.f8638b.f14448d.f4048d;
                                    }
                                }
                            });
                            final int i6 = 1;
                            this.f = C1034e.b(new Function0(this) { // from class: bd.c

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ Carousel f8638b;

                                {
                                    this.f8638b = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i6) {
                                        case 0:
                                            return (TextView) this.f8638b.f14448d.f4049g;
                                        case 1:
                                            return (RecyclerView) this.f8638b.f14448d.f;
                                        case 2:
                                            return (CardView) this.f8638b.f14448d.e;
                                        case 3:
                                            return (CardView) this.f8638b.f14448d.c;
                                        default:
                                            return (CardView) this.f8638b.f14448d.f4048d;
                                    }
                                }
                            });
                            final int i10 = 2;
                            this.f14449g = C1034e.b(new Function0(this) { // from class: bd.c

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ Carousel f8638b;

                                {
                                    this.f8638b = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i10) {
                                        case 0:
                                            return (TextView) this.f8638b.f14448d.f4049g;
                                        case 1:
                                            return (RecyclerView) this.f8638b.f14448d.f;
                                        case 2:
                                            return (CardView) this.f8638b.f14448d.e;
                                        case 3:
                                            return (CardView) this.f8638b.f14448d.c;
                                        default:
                                            return (CardView) this.f8638b.f14448d.f4048d;
                                    }
                                }
                            });
                            final int i11 = 3;
                            this.h = C1034e.b(new Function0(this) { // from class: bd.c

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ Carousel f8638b;

                                {
                                    this.f8638b = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i11) {
                                        case 0:
                                            return (TextView) this.f8638b.f14448d.f4049g;
                                        case 1:
                                            return (RecyclerView) this.f8638b.f14448d.f;
                                        case 2:
                                            return (CardView) this.f8638b.f14448d.e;
                                        case 3:
                                            return (CardView) this.f8638b.f14448d.c;
                                        default:
                                            return (CardView) this.f8638b.f14448d.f4048d;
                                    }
                                }
                            });
                            final int i12 = 4;
                            this.i = C1034e.b(new Function0(this) { // from class: bd.c

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ Carousel f8638b;

                                {
                                    this.f8638b = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            return (TextView) this.f8638b.f14448d.f4049g;
                                        case 1:
                                            return (RecyclerView) this.f8638b.f14448d.f;
                                        case 2:
                                            return (CardView) this.f8638b.f14448d.e;
                                        case 3:
                                            return (CardView) this.f8638b.f14448d.c;
                                        default:
                                            return (CardView) this.f8638b.f14448d.f4048d;
                                    }
                                }
                            });
                            this.f14450k = new Handler(context.getMainLooper());
                            this.f14451l = new Handler(context.getMainLooper());
                            this.m = C0187u.f(context.getApplicationContext());
                            this.f14453o = -2;
                            this.f14454p = -1;
                            this.f14455q = new LinearLayoutManager(context, 0, false);
                            this.f14456r = new AccelerateInterpolator();
                            this.f14457s = 3000;
                            this.f14460v = 2;
                            this.f14463y = EnumC0945h.f8641a;
                            this.f14437B = context.getResources().getDimensionPixelSize(R.dimen.maya_margin_small);
                            this.f14438K = ClevertapAd.TextStyle.DEFAULT;
                            this.f14439P = getResources().getDimensionPixelSize(R.dimen.pma_radius_4dp);
                            this.f14441R = 1073741823;
                            this.f14442S = true;
                            this.f14443T = EnumC0938a.f8633a;
                            this.f14444U = C1112C.f9377a;
                            this.f14447a0 = new e(this, 5);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // I.b
    public final void a(ArrayList arrayList) {
        arrayList.toString();
        a.a();
        try {
            ArrayList arrayListC = c(arrayList);
            c cVar = this.j;
            if (cVar != null) {
                cVar.g(arrayListC);
            }
        } catch (Exception e) {
            C1328c.a().b(e);
        }
    }

    public final void b() {
        int height = getHeight();
        getLayoutParams().height = height;
        requestLayout();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, 0);
        valueAnimatorOfInt.setInterpolator(this.f14456r);
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addUpdateListener(new n(this, 3));
        valueAnimatorOfInt.addListener(new C0644e(this, 1));
        valueAnimatorOfInt.start();
    }

    public final ArrayList c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        j.f(it, "iterator(...)");
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            j.f(next, "next(...)");
            CleverTapDisplayUnit cleverTapDisplayUnit = (CleverTapDisplayUnit) next;
            String str = cleverTapDisplayUnit.f9462g;
            C0187u c0187u = this.m;
            if (c0187u != null) {
                c0187u.n(str);
            }
            HashMap map = cleverTapDisplayUnit.c;
            String str2 = map != null ? (String) map.get("screen") : null;
            String str3 = this.f14440Q;
            if (str3 == null || j.b(str2, str3)) {
                Iterator it2 = cleverTapDisplayUnit.f9460b.iterator();
                j.f(it2, "iterator(...)");
                int i4 = i;
                while (it2.hasNext()) {
                    CleverTapDisplayUnitContent cleverTapDisplayUnitContent = (CleverTapDisplayUnitContent) it2.next();
                    String str4 = cleverTapDisplayUnitContent.f9464b;
                    if (str4 != null && cleverTapDisplayUnitContent.e != null && str4.startsWith("image") && !str4.equals("image/gif")) {
                        int i6 = i4 + 1;
                        arrayList2.add(new ClevertapAd(i4, str + i6, str, cleverTapDisplayUnitContent.e, cleverTapDisplayUnitContent.f9463a, cleverTapDisplayUnitContent.i, cleverTapDisplayUnitContent.f, 0, null, null));
                        i4 = i6;
                    }
                    if (arrayList2.size() >= this.f14441R) {
                        break;
                    }
                }
                i = i4;
            }
        }
        return arrayList2;
    }

    public final void d() {
        if (this.f14458t) {
            c cVar = this.j;
            Integer numValueOf = cVar != null ? Integer.valueOf(cVar.getItemCount()) : null;
            j.d(numValueOf);
            if (numValueOf.intValue() > 1) {
                Handler handler = this.f14451l;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                if (handler != null) {
                    handler.post(new h(this, 15));
                }
            }
        }
    }

    public final int getAdCardCornerRadius() {
        return this.f14439P;
    }

    public final boolean getAutomaticScrolling() {
        return this.f14458t;
    }

    public final int getCarouselIntervalTime() {
        return this.f14457s;
    }

    public final InterfaceC0942e getCarouselListener() {
        return this.f14445V;
    }

    public final InterfaceC0943f getCarouselLoadedListener() {
        return null;
    }

    public final CardView getCarouselLoading() {
        return (CardView) this.f14449g.getValue();
    }

    public final CardView getCarouselLoading2() {
        return (CardView) this.h.getValue();
    }

    public final CardView getCarouselLoading3() {
        return (CardView) this.i.getValue();
    }

    public final RecyclerView getCarouselRecyclerView() {
        return (RecyclerView) this.f.getValue();
    }

    public final InterfaceC0944g getCarouselStateListener() {
        return null;
    }

    public final TextView getCarouselTitle() {
        return (TextView) this.e.getValue();
    }

    public final ClevertapAd.TextStyle getClevertapAdTextStyle() {
        return this.f14438K;
    }

    public final List<Object> getCustomCarouselViewTypes() {
        return this.f14444U;
    }

    public final EnumC0938a getDividerMode() {
        return this.f14443T;
    }

    public final int getDividerSizeInPx() {
        return this.f14437B;
    }

    public final boolean getEndlessScrolling() {
        return this.f14459u;
    }

    public final String getFilterAdsByScreen() {
        return this.f14440Q;
    }

    public final boolean getHideCarouselTitle() {
        return this.f14461w;
    }

    public final int getMaxItemsToShow() {
        return this.f14441R;
    }

    public final int getMinItemsToEndlessScroll() {
        return this.f14460v;
    }

    public final EnumC0945h getMultipleLoadingMode() {
        return this.f14463y;
    }

    public final boolean getShouldSetDisplayListener() {
        return this.f14442S;
    }

    public final boolean getShowMultipleAdLoading() {
        return this.f14462x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setAdCardCornerRadius(int i) {
        this.f14439P = i;
    }

    public final void setAdsCornerRadius(int i) {
        this.f14439P = i;
        float f = i;
        getCarouselLoading().setRadius(f);
        getCarouselLoading2().setRadius(f);
        getCarouselLoading3().setRadius(f);
    }

    public final void setAutomaticScrolling(boolean z4) {
        this.f14458t = z4;
    }

    public final void setCarouselIntervalTime(int i) {
        this.f14457s = i;
    }

    public final void setCarouselListener(InterfaceC0942e interfaceC0942e) {
        this.f14445V = interfaceC0942e;
    }

    public final void setCarouselLoadedListener(InterfaceC0943f interfaceC0943f) {
    }

    public final void setCarouselStateListener(InterfaceC0944g interfaceC0944g) {
    }

    public final void setClevertapAdTextStyle(ClevertapAd.TextStyle textStyle) {
        j.g(textStyle, "<set-?>");
        this.f14438K = textStyle;
    }

    public final void setCustomCarouselViewTypes(List<Object> list) {
        j.g(list, "<set-?>");
        this.f14444U = list;
    }

    public final void setDividerMode(EnumC0938a enumC0938a) {
        j.g(enumC0938a, "<set-?>");
        this.f14443T = enumC0938a;
    }

    public final void setDividerSizeInPx(int i) {
        this.f14437B = i;
    }

    public final void setEndlessScrolling(boolean z4) {
        this.f14459u = z4;
    }

    public final void setFilterAdsByScreen(String str) {
        this.f14440Q = str;
    }

    public final void setHideCarouselTitle(boolean z4) {
        this.f14461w = z4;
    }

    public final void setMaxItemsToShow(int i) {
        this.f14441R = i;
    }

    public final void setMinItemsToEndlessScroll(int i) {
        this.f14460v = i;
    }

    public final void setMultipleLoadingMode(EnumC0945h enumC0945h) {
        j.g(enumC0945h, "<set-?>");
        this.f14463y = enumC0945h;
    }

    public final void setShouldSetDisplayListener(boolean z4) {
        this.f14442S = z4;
    }

    public final void setShowMultipleAdLoading(boolean z4) {
        this.f14462x = z4;
    }

    public final void setV3(boolean z4) {
        this.f14446W = z4;
    }
}
