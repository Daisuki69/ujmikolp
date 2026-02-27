package com.paymaya.adkit.presentation.banneradcarousel.view;

import Bj.B0;
import Bj.H;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.C;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import androidx.window.layout.adapter.extensions.a;
import b5.C0912d;
import cj.C1132s;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import f5.C1463a;
import f5.C1464b;
import f5.g;
import g5.C1501a;
import i5.C1590a;
import i5.C1591b;
import i5.c;
import i5.d;
import i5.e;
import i5.f;
import i5.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class BannerAdCarousel extends FrameLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f10214o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f10215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f10216b;
    public C1501a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LifecycleOwner f10217d;
    public B0 e;
    public Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f10218g;
    public final WeakReference h;
    public boolean i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10219k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f10220l;
    public Integer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10221n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdCarousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.banner_ad_carousel_container, (ViewGroup) this, false);
        addView(viewInflate);
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.ad_carousel_recycler_view);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.ad_carousel_recycler_view)));
        }
        this.f10215a = recyclerView;
        WeakReference weakReference = new WeakReference(context);
        this.h = weakReference;
        this.j = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
        this.f10219k = -1;
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context2, 0, false));
        }
        new PagerSnapHelper().attachToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(new C1463a(this));
        recyclerView.addOnItemTouchListener(new C1464b(this));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            setLayoutParams(layoutParams);
        }
        this.f10215a.setVisibility(8);
    }

    public static void a(BannerAdCarousel bannerAdCarousel) {
        C1501a c1501a = bannerAdCarousel.c;
        if (c1501a != null && c1501a.f16788a.size() > 1) {
            C1501a c1501a2 = bannerAdCarousel.c;
            if (c1501a2 == null) {
                j.n("adapter");
                throw null;
            }
            boolean z4 = c1501a2.f16789b;
            if (!z4) {
                if (!z4) {
                    c1501a2.f16789b = true;
                }
                RecyclerView recyclerView = bannerAdCarousel.f10215a;
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                j.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int iFindFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                C1501a c1501a3 = bannerAdCarousel.c;
                if (c1501a3 == null) {
                    j.n("adapter");
                    throw null;
                }
                int size = 1073741823 - (1073741823 % c1501a3.f16788a.size());
                C1501a c1501a4 = bannerAdCarousel.c;
                if (c1501a4 == null) {
                    j.n("adapter");
                    throw null;
                }
                int size2 = (iFindFirstVisibleItemPosition % c1501a4.f16788a.size()) + size;
                recyclerView.scrollToPosition(size2);
                bannerAdCarousel.f10219k = size2;
            }
        }
        bannerAdCarousel.setAutoScrollEnabled(true);
    }

    public static Unit b(BannerAdCarousel bannerAdCarousel, g gVar, f fVar) {
        if (fVar instanceof e) {
            bannerAdCarousel.getClass();
            List newAdItems = C1132s.g(new C0912d("loadingAdUnit1", null, null), new C0912d("loadingAdUnit2", null, null), new C0912d("loadingAdUnit3", null, null));
            C1501a c1501a = bannerAdCarousel.c;
            if (c1501a == null) {
                j.n("adapter");
                throw null;
            }
            j.g(newAdItems, "newAdItems");
            ArrayList arrayList = c1501a.f16788a;
            arrayList.clear();
            arrayList.addAll(newAdItems);
            c1501a.notifyDataSetChanged();
            RecyclerView recyclerView = bannerAdCarousel.f10215a;
            recyclerView.setVisibility(0);
            C1501a c1501a2 = bannerAdCarousel.c;
            if (c1501a2 == null) {
                j.n("adapter");
                throw null;
            }
            if (c1501a2.getItemCount() > 0) {
                C1501a c1501a3 = bannerAdCarousel.c;
                if (c1501a3 == null) {
                    j.n("adapter");
                    throw null;
                }
                recyclerView.scrollToPosition(c1501a3.getItemCount() / 2);
            }
            bannerAdCarousel.setAutoScrollEnabled(false);
            ViewGroup.LayoutParams layoutParams = bannerAdCarousel.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                Integer num = bannerAdCarousel.f10220l;
                if (num != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = num.intValue();
                }
                Integer num2 = bannerAdCarousel.m;
                if (num2 != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = num2.intValue();
                }
                bannerAdCarousel.setLayoutParams(layoutParams);
            }
        } else if (fVar instanceof c) {
            List newAdItems2 = ((c) fVar).f17100a;
            B0 b02 = bannerAdCarousel.e;
            if (b02 != null) {
                b02.b(null);
            }
            bannerAdCarousel.e = null;
            C1501a c1501a4 = bannerAdCarousel.c;
            if (c1501a4 == null) {
                j.n("adapter");
                throw null;
            }
            j.g(newAdItems2, "newAdItems");
            ArrayList arrayList2 = c1501a4.f16788a;
            arrayList2.clear();
            arrayList2.addAll(newAdItems2);
            c1501a4.notifyDataSetChanged();
            bannerAdCarousel.f10215a.post(new a(bannerAdCarousel, 13));
        } else if (fVar instanceof C1591b) {
            Function1 function1 = gVar.j;
            if (function1 != null) {
                function1.invoke(((C1591b) fVar).f17099a);
            }
        } else if (fVar instanceof C1590a) {
            Function2 function2 = gVar.f16727k;
            if (function2 != null) {
                C1590a c1590a = (C1590a) fVar;
                function2.invoke(c1590a.f17097a, c1590a.f17098b);
            }
        } else if (fVar instanceof d) {
            ViewGroup.LayoutParams layoutParams2 = bannerAdCarousel.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.bottomMargin = 0;
                bannerAdCarousel.setLayoutParams(layoutParams2);
            }
            bannerAdCarousel.f10215a.setVisibility(8);
        }
        return Unit.f18162a;
    }

    private final void setAutoScrollEnabled(boolean z4) {
        this.i = z4;
        if (z4) {
            d();
            return;
        }
        B0 b02 = this.e;
        if (b02 != null) {
            b02.b(null);
        }
        this.e = null;
    }

    public final void c() {
        if (this.f10216b == null) {
            return;
        }
        B0 b02 = this.e;
        if (b02 != null) {
            b02.b(null);
        }
        this.e = null;
        this.f10215a.setAdapter(null);
        l lVar = this.f10216b;
        if (lVar != null) {
            lVar.b();
        } else {
            j.n("viewModel");
            throw null;
        }
    }

    public final void d() {
        C1501a c1501a = this.c;
        if (c1501a == null || c1501a.getItemCount() <= 1) {
            return;
        }
        B0 b02 = this.e;
        if (b02 != null) {
            b02.b(null);
        }
        LifecycleOwner lifecycleOwner = this.f10217d;
        if (lifecycleOwner != null) {
            this.e = H.w(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new f5.d(this, null), 3);
        } else {
            j.n("lifecycleOwner");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAutoScrollEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAutoScrollEnabled(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }
}
