package com.paymaya.mayaui.common.view.widget;

import D.C0187u;
import E8.n;
import I.b;
import N5.G0;
import R.a;
import Rc.c;
import a7.C0644e;
import a7.C0645f;
import a7.C0648i;
import a7.C0649j;
import a7.C0651l;
import a7.EnumC0650k;
import a7.InterfaceC0641b;
import a7.InterfaceC0642c;
import a7.InterfaceC0643d;
import a7.RunnableC0640a;
import a7.RunnableC0647h;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import androidx.annotation.DimenRes;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.C1110A;
import cj.C1112C;
import cj.C1132s;
import cj.t;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnitContent;
import com.google.gson.JsonParseException;
import com.paymaya.R;
import com.paymaya.domain.model.CleverTapUnlimitedBanner;
import com.paymaya.domain.model.ClevertapAd;
import d2.C1328c;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import zj.C2576A;
import zj.y;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaCarousel extends ConstraintLayout implements b {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f11992x0 = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f11993B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f11994K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final LinearLayoutManager f11995P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final AccelerateInterpolator f11996Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f11997R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f11998S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f11999T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f12000U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f12001V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f12002W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f12003a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f12004b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f12005c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G0 f12006d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f12007d0;
    public final TextView e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ClevertapAd.TextStyle f12008e0;
    public final RecyclerView f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public String f12009f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CardView f12010g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f12011g0;
    public final CardView h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f12012h0;
    public final CardView i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public EnumC0650k f12013i0;
    public final Guideline j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public List f12014j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CardView f12015k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public InterfaceC0641b f12016k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CardView f12017l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public InterfaceC0643d f12018l0;
    public final CardView m;
    public InterfaceC0642c m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CardView f12019n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f12020n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CardView f12021o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f12022o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CardView f12023p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f12024p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CardView f12025q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public double f12026q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CardView f12027r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f12028r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CardView f12029s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f12030s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f12031t;
    public boolean t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Handler f12032u;
    public Integer u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f12033v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f12034v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0187u f12035w;
    public final InterfaceC1033d w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12036x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12037y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MayaCarousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.maya_widget_carousel, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.card_view_large_loading_banner_1;
        CardView cardView = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_large_loading_banner_1);
        if (cardView != null) {
            i = R.id.card_view_large_loading_banner_2;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_large_loading_banner_2);
            if (cardView2 != null) {
                i = R.id.card_view_large_loading_banner_3;
                CardView cardView3 = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_large_loading_banner_3);
                if (cardView3 != null) {
                    i = R.id.card_view_loading_banner_1;
                    CardView cardView4 = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_loading_banner_1);
                    if (cardView4 != null) {
                        i = R.id.card_view_loading_banner_2;
                        CardView cardView5 = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_loading_banner_2);
                        if (cardView5 != null) {
                            i = R.id.card_view_loading_banner_3;
                            CardView cardView6 = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.card_view_loading_banner_3);
                            if (cardView6 != null) {
                                i = R.id.guideline_center_constraint;
                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_center_constraint);
                                if (guideline != null) {
                                    i = R.id.guideline_start_constraint;
                                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_start_constraint);
                                    if (guideline2 != null) {
                                        i = R.id.recycler_view_banners;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_banners);
                                        if (recyclerView != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            i = R.id.text_view_primary_loading_banner_1;
                                            CardView cardView7 = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_primary_loading_banner_1);
                                            if (cardView7 != null) {
                                                i = R.id.text_view_primary_loading_banner_2;
                                                CardView cardView8 = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_primary_loading_banner_2);
                                                if (cardView8 != null) {
                                                    i = R.id.text_view_primary_loading_banner_3;
                                                    CardView cardView9 = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_primary_loading_banner_3);
                                                    if (cardView9 != null) {
                                                        i = R.id.text_view_subtitle_loading_banner_1;
                                                        CardView cardView10 = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_subtitle_loading_banner_1);
                                                        if (cardView10 != null) {
                                                            i = R.id.text_view_subtitle_loading_banner_2;
                                                            CardView cardView11 = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_subtitle_loading_banner_2);
                                                            if (cardView11 != null) {
                                                                i = R.id.text_view_subtitle_loading_banner_3;
                                                                CardView cardView12 = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_subtitle_loading_banner_3);
                                                                if (cardView12 != null) {
                                                                    i = R.id.text_view_title;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title);
                                                                    if (textView != null) {
                                                                        this.f12006d = new G0(constraintLayout, cardView, cardView2, cardView3, cardView4, cardView5, cardView6, guideline, guideline2, recyclerView, cardView7, cardView8, cardView9, cardView10, cardView11, cardView12, textView);
                                                                        this.e = textView;
                                                                        this.f = recyclerView;
                                                                        this.f12010g = cardView4;
                                                                        this.h = cardView5;
                                                                        this.i = cardView6;
                                                                        this.j = guideline;
                                                                        this.f12015k = cardView;
                                                                        this.f12017l = cardView2;
                                                                        this.m = cardView3;
                                                                        this.f12019n = cardView7;
                                                                        this.f12021o = cardView8;
                                                                        this.f12023p = cardView9;
                                                                        this.f12025q = cardView10;
                                                                        this.f12027r = cardView11;
                                                                        this.f12029s = cardView12;
                                                                        this.f12032u = new Handler(context.getMainLooper());
                                                                        this.f12033v = new Handler(context.getMainLooper());
                                                                        this.f12035w = C0187u.f(context.getApplicationContext());
                                                                        this.f12037y = -2;
                                                                        this.f11993B = -1;
                                                                        this.f11995P = new LinearLayoutManager(context, 0, false);
                                                                        this.f11996Q = new AccelerateInterpolator();
                                                                        this.f11997R = getResources().getDimensionPixelSize(R.dimen.pma_radius_4dp);
                                                                        this.f11998S = 3000;
                                                                        this.f12001V = 2;
                                                                        this.f12003a0 = true;
                                                                        this.f12005c0 = 3;
                                                                        this.f12007d0 = context.getResources().getDimensionPixelSize(R.dimen.maya_margin_small);
                                                                        this.f12008e0 = ClevertapAd.TextStyle.DEFAULT;
                                                                        this.f12011g0 = 1073741823;
                                                                        this.f12012h0 = true;
                                                                        this.f12013i0 = EnumC0650k.f7025a;
                                                                        this.f12014j0 = C1112C.f9377a;
                                                                        this.w0 = C1034e.b(new W4.b(this, 3));
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    private final Rc.b getAdapterListener() {
        return new Xa.c(this, 13);
    }

    private final SnapHelper getMLinearSnapHelper() {
        return (SnapHelper) this.w0.getValue();
    }

    public static void i(MayaCarousel mayaCarousel, int i, int i4) {
        mayaCarousel.h(i, i4, 0);
        mayaCarousel.j(i, i4, 0);
    }

    public static Pair l(int i, int i4, int i6) {
        float f = i6 < i ? i6 / i : 1.0f;
        return new Pair(Integer.valueOf((int) (i * f)), Integer.valueOf((int) (i4 * f)));
    }

    public static void n(View view, int i, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i4;
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    @Override // I.b
    public final void a(ArrayList arrayList) {
        try {
            List listC = c(arrayList);
            c cVar = this.f12031t;
            if (cVar != null) {
                cVar.g(listC);
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
        valueAnimatorOfInt.setInterpolator(this.f11996Q);
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addUpdateListener(new n(this, 2));
        valueAnimatorOfInt.addListener(new C0644e(this, 0));
        valueAnimatorOfInt.start();
    }

    public final List c(ArrayList arrayList) {
        ArrayList arrayList2;
        ClevertapAd clevertapAd;
        CleverTapUnlimitedBanner cleverTapUnlimitedBanner;
        int i;
        if (arrayList.isEmpty()) {
            return C1112C.f9377a;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        j.f(it, "iterator(...)");
        int size = 0;
        while (it.hasNext()) {
            Object next = it.next();
            j.f(next, "next(...)");
            CleverTapDisplayUnit cleverTapDisplayUnit = (CleverTapDisplayUnit) next;
            C0187u c0187u = this.f12035w;
            if (c0187u != null) {
                c0187u.n(cleverTapDisplayUnit.f9462g);
            }
            HashMap map = cleverTapDisplayUnit.c;
            String str = map != null ? (String) map.get("screen") : null;
            this.t0 = j.b(map.get("unli_banners"), "true");
            String str2 = (String) map.get("duration");
            Integer numF = str2 != null ? y.f(str2) : null;
            if (numF != null) {
                this.f11998S = numF.intValue() * 1000;
            }
            String str3 = this.f12009f0;
            if (str3 == null || j.b(str, str3)) {
                if (this.t0) {
                    String str4 = cleverTapDisplayUnit.f9462g;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        String str5 = (String) entry.getKey();
                        j.d(str5);
                        if (C2576A.z(str5, "main_banner", false, 2)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    arrayList2 = new ArrayList();
                    int i4 = size;
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        String str6 = (String) entry2.getKey();
                        String str7 = (String) entry2.getValue();
                        try {
                            CleverTapUnlimitedBanner.Factory factory = CleverTapUnlimitedBanner.Factory;
                            j.d(str7);
                            cleverTapUnlimitedBanner = factory.parse(str7);
                        } catch (JsonParseException e) {
                            e = e;
                        } catch (IllegalStateException e7) {
                            e = e7;
                        } catch (UnsupportedOperationException e10) {
                            e = e10;
                        } catch (Exception e11) {
                            e = e11;
                        }
                        if (cleverTapUnlimitedBanner.getActive()) {
                            int i6 = i4 + 1;
                            try {
                                try {
                                    try {
                                        i = i6;
                                    } catch (JsonParseException e12) {
                                        e = e12;
                                        i = i6;
                                    } catch (IllegalStateException e13) {
                                        e = e13;
                                        i = i6;
                                    } catch (UnsupportedOperationException e14) {
                                        e = e14;
                                        i = i6;
                                    } catch (Exception e15) {
                                        e = e15;
                                        i = i6;
                                    }
                                } catch (JsonParseException e16) {
                                    e = e16;
                                    i = i6;
                                } catch (IllegalStateException e17) {
                                    e = e17;
                                    i = i6;
                                } catch (UnsupportedOperationException e18) {
                                    e = e18;
                                    i = i6;
                                } catch (Exception e19) {
                                    e = e19;
                                    i = i6;
                                }
                            } catch (JsonParseException e20) {
                                e = e20;
                                i = i6;
                            } catch (IllegalStateException e21) {
                                e = e21;
                                i = i6;
                            } catch (UnsupportedOperationException e22) {
                                e = e22;
                                i = i6;
                            } catch (Exception e23) {
                                e = e23;
                                i = i6;
                            }
                            try {
                                clevertapAd = new ClevertapAd(i4, str4 + i6, str4, cleverTapUnlimitedBanner.getImageUrl(), cleverTapUnlimitedBanner.getDeeplink(), null, null, cleverTapUnlimitedBanner.getPriority(), cleverTapUnlimitedBanner.getName(), str6);
                                i4 = i;
                            } catch (JsonParseException e24) {
                                e = e24;
                                i4 = i;
                                C1328c.a().b(e);
                                clevertapAd = null;
                            } catch (IllegalStateException e25) {
                                e = e25;
                                i4 = i;
                                C1328c.a().b(e);
                                clevertapAd = null;
                            } catch (UnsupportedOperationException e26) {
                                e = e26;
                                i4 = i;
                                C1328c.a().b(e);
                                clevertapAd = null;
                            } catch (Exception e27) {
                                e = e27;
                                i4 = i;
                                C1328c.a().b(e);
                                clevertapAd = null;
                            }
                        } else {
                            clevertapAd = null;
                        }
                        if (clevertapAd != null) {
                            arrayList2.add(clevertapAd);
                        }
                    }
                    ArrayList arrayList4 = arrayList2;
                    C1110A.Q(new a(new B9.a(9), 1), arrayList4);
                    if (this.f12034v0) {
                        int i10 = 0;
                        for (Object obj : arrayList4) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                C1132s.k();
                                throw null;
                            }
                            ((ClevertapAd) obj).setCarouselPosition(i10);
                            i10 = i11;
                        }
                    }
                } else {
                    ArrayList arrayList5 = cleverTapDisplayUnit.f9460b;
                    j.f(arrayList5, "getContents(...)");
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : arrayList5) {
                        CleverTapDisplayUnitContent cleverTapDisplayUnitContent = (CleverTapDisplayUnitContent) obj2;
                        String str8 = cleverTapDisplayUnitContent.f9464b;
                        if (str8 != null && cleverTapDisplayUnitContent.e != null && str8.startsWith("image") && !str8.equals("image/gif")) {
                            arrayList6.add(obj2);
                        }
                    }
                    List<CleverTapDisplayUnitContent> listR = C1110A.R(arrayList6, this.f12011g0);
                    ArrayList arrayList7 = new ArrayList(t.l(listR, 10));
                    int i12 = size;
                    for (CleverTapDisplayUnitContent cleverTapDisplayUnitContent2 : listR) {
                        int i13 = i12 + 1;
                        StringBuilder sb2 = new StringBuilder();
                        String str9 = cleverTapDisplayUnit.f9462g;
                        arrayList7.add(new ClevertapAd(i12, androidx.camera.core.impl.a.o(sb2, str9, i13), str9, cleverTapDisplayUnitContent2.e, cleverTapDisplayUnitContent2.f9463a, cleverTapDisplayUnitContent2.i, cleverTapDisplayUnitContent2.f, 0, null, null));
                        i12 = i13;
                    }
                    arrayList2 = arrayList7;
                }
                size += arrayList2.size();
                arrayList3.addAll(arrayList2);
            }
        }
        return C1110A.V(arrayList3);
    }

    public final void d() {
        this.f12015k.setVisibility(8);
        this.f12017l.setVisibility(8);
        this.m.setVisibility(8);
        this.f12019n.setVisibility(8);
        this.f12021o.setVisibility(8);
        this.f12023p.setVisibility(8);
        this.f12025q.setVisibility(8);
        this.f12027r.setVisibility(8);
        this.f12029s.setVisibility(8);
    }

    public final void e() {
        C0187u c0187u;
        C0645f c0645f = new C0645f();
        RecyclerView recyclerView = this.f;
        recyclerView.addOnItemTouchListener(c0645f);
        recyclerView.setLayoutManager(this.f11995P);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.maya_carousel_v4_indicator_inactive_radius);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.maya_carousel_v4_indicator_active_radius);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.maya_margin_6);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.maya_margin_16);
        int color = ContextCompat.getColor(getContext(), R.color.maya_shades_of_grey_5);
        int color2 = ContextCompat.getColor(getContext(), R.color.maya_shades_of_grey_4);
        if (this.f12024p0) {
            recyclerView.addItemDecoration(new C0649j(this.f12007d0, this.f12013i0, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize * 4, dimensionPixelSize3, dimensionPixelSize4, color2, color));
        } else {
            recyclerView.addItemDecoration(new C0651l(this.f12007d0, this.f12013i0, this.f12030s0));
        }
        ViewCompat.setNestedScrollingEnabled(this, false);
        if (recyclerView.getOnFlingListener() == null) {
            getMLinearSnapHelper().attachToRecyclerView(recyclerView);
        }
        c cVar = new c(getContext(), this.f12016k0, getAdapterListener(), this.f12014j0, this.f11993B, this.f12037y, this.f11997R, Boolean.valueOf(this.f12000U), this.f12001V, this.f12020n0, Double.valueOf(this.f12026q0), this.u0);
        this.f12031t = cVar;
        cVar.f5483p = this.f12008e0;
        recyclerView.setAdapter(cVar);
        recyclerView.addOnScrollListener(new C0648i(this));
        if (this.f12012h0 && (c0187u = this.f12035w) != null) {
            c0187u.q(this);
        }
        this.f12022o0 = true;
    }

    public final void f() {
        if (this.f12003a0) {
            this.i.setVisibility(8);
            this.h.setVisibility(8);
            this.f12010g.setVisibility(8);
            d();
            return;
        }
        if (this.f12004b0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            j.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f11994K;
        }
    }

    public final void g() {
        if (this.f11999T) {
            c cVar = this.f12031t;
            Integer numValueOf = cVar != null ? Integer.valueOf(cVar.getItemCount()) : null;
            j.d(numValueOf);
            if (numValueOf.intValue() > 1) {
                Handler handler = this.f12033v;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                if (handler != null) {
                    handler.postDelayed(new RunnableC0647h(this), this.f11998S);
                }
            }
        }
    }

    public final boolean getAutomaticScrolling() {
        return this.f11999T;
    }

    public final int getBannerCount() {
        c cVar = this.f12031t;
        if (cVar != null) {
            return cVar.f5477d.size();
        }
        return 0;
    }

    public final boolean getBannerPriorityFixEnabled() {
        return this.f12034v0;
    }

    public final int getCarouselIntervalTime() {
        return this.f11998S;
    }

    public final InterfaceC0641b getCarouselListener() {
        return this.f12016k0;
    }

    public final InterfaceC0642c getCarouselLoadedListener() {
        return this.m0;
    }

    public final InterfaceC0643d getCarouselStateListener() {
        return this.f12018l0;
    }

    public final ClevertapAd.TextStyle getClevertapAdTextStyle() {
        return this.f12008e0;
    }

    public final List<Object> getCustomCarouselViewTypes() {
        return this.f12014j0;
    }

    public final Integer getDefaultImagePlaceholder() {
        return this.u0;
    }

    public final EnumC0650k getDividerMode() {
        return this.f12013i0;
    }

    public final int getDividerSizeInPx() {
        return this.f12007d0;
    }

    public final boolean getEndlessScrolling() {
        return this.f12000U;
    }

    public final String getFilterAdsByScreen() {
        return this.f12009f0;
    }

    public final boolean getHideCarouselTitle() {
        return this.f12002W;
    }

    public final double getImageRatio() {
        return this.f12026q0;
    }

    public final int getLoadingMode() {
        return this.f12005c0;
    }

    public final int getMaxItemsToShow() {
        return this.f12011g0;
    }

    public final int getMinItemsToEndlessScroll() {
        return this.f12001V;
    }

    public final boolean getRemoveTopMarginOnLoading() {
        return this.f12004b0;
    }

    public final boolean getShimmerEnabled() {
        return this.f12003a0;
    }

    public final boolean getShouldSetDisplayListener() {
        return this.f12012h0;
    }

    public final void h(int i, int i4, int i6) {
        Pair pairL = i6 > 0 ? l(i, i4, i6) : new Pair(Integer.valueOf(i), Integer.valueOf(i4));
        this.f11993B = ((Number) pairL.f18160a).intValue();
        this.f12037y = ((Number) pairL.f18161b).intValue();
    }

    public final void j(int i, int i4, int i6) {
        Pair pairL = i6 > 0 ? l(i, i4, i6) : new Pair(Integer.valueOf(i), Integer.valueOf(i4));
        Number number = (Number) pairL.f18160a;
        int iIntValue = number.intValue();
        Number number2 = (Number) pairL.f18161b;
        n(this.f12010g, iIntValue, number2.intValue());
        n(this.h, number.intValue(), number2.intValue());
        n(this.i, number.intValue(), number2.intValue());
        n(this.f12015k, number.intValue(), number2.intValue());
        n(this.f12017l, number.intValue(), number2.intValue());
        n(this.m, number.intValue(), number2.intValue());
        this.f12019n.getLayoutParams().width = number.intValue();
        this.f12021o.getLayoutParams().width = number.intValue();
        this.f12023p.getLayoutParams().width = number.intValue();
        this.f12025q.getLayoutParams().width = number.intValue() / 2;
        this.f12027r.getLayoutParams().width = number.intValue() / 2;
        this.f12029s.getLayoutParams().width = number.intValue() / 2;
    }

    public final void k() {
        if (this.f12028r0) {
            return;
        }
        this.f12028r0 = true;
        c cVar = this.f12031t;
        TextView textView = this.e;
        if (cVar != null && !cVar.f5477d.isEmpty()) {
            f();
            textView.setVisibility(this.f12002W ? 8 : 0);
            this.f.setVisibility(0);
            g();
            this.f12028r0 = false;
            return;
        }
        if (this.f12003a0) {
            if (getLayoutParams().height != -2) {
                getLayoutParams().height = -2;
                requestLayout();
                setVisibility(0);
            }
            ClevertapAd.TextStyle textStyle = this.f12008e0;
            ClevertapAd.TextStyle textStyle2 = ClevertapAd.TextStyle.V4_WITH_TEXT_BANNER;
            CardView cardView = this.f12010g;
            CardView cardView2 = this.h;
            CardView cardView3 = this.i;
            if (textStyle == textStyle2) {
                this.f12015k.setVisibility(0);
                this.f12019n.setVisibility(0);
                this.f12025q.setVisibility(0);
                int i = this.f12005c0;
                CardView cardView4 = this.f12029s;
                CardView cardView5 = this.f12023p;
                CardView cardView6 = this.f12027r;
                CardView cardView7 = this.f12021o;
                CardView cardView8 = this.f12017l;
                if (i != 1) {
                    CardView cardView9 = this.m;
                    if (i != 2) {
                        cardView8.setVisibility(0);
                        cardView7.setVisibility(0);
                        cardView6.setVisibility(0);
                        cardView9.setVisibility(0);
                        cardView5.setVisibility(0);
                        cardView4.setVisibility(0);
                    } else {
                        cardView8.setVisibility(0);
                        cardView7.setVisibility(0);
                        cardView6.setVisibility(0);
                        cardView9.setVisibility(8);
                        cardView5.setVisibility(8);
                        cardView4.setVisibility(8);
                    }
                } else {
                    cardView8.setVisibility(8);
                    cardView7.setVisibility(8);
                    cardView6.setVisibility(8);
                    cardView3.setVisibility(8);
                    cardView5.setVisibility(8);
                    cardView4.setVisibility(8);
                }
                cardView3.setVisibility(8);
                cardView2.setVisibility(8);
                cardView.setVisibility(8);
            } else {
                d();
                cardView.setVisibility(0);
                int i4 = this.f12005c0;
                if (i4 == 1) {
                    cardView2.setVisibility(8);
                    cardView3.setVisibility(8);
                } else if (i4 != 2) {
                    cardView2.setVisibility(0);
                    cardView3.setVisibility(0);
                } else {
                    cardView2.setVisibility(0);
                    cardView3.setVisibility(8);
                }
            }
        } else if (this.f12004b0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            j.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f11994K = marginLayoutParams.topMargin;
            marginLayoutParams.topMargin = 0;
            requestLayout();
        }
        textView.setVisibility(this.f12002W ? 8 : 0);
        Handler handler = this.f12032u;
        if (handler == null) {
            this.f12032u = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f12032u;
        if (handler2 != null) {
            handler2.postDelayed(new RunnableC0640a(this, 0), 5000L);
        }
    }

    public final void m() {
        Handler handler = this.f12032u;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f12033v;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setAdsCornerRadiusDimens(@DimenRes int i) {
        Resources resources = getResources();
        j.f(resources, "getResources(...)");
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        this.f11997R = dimensionPixelSize;
        float f = dimensionPixelSize;
        this.f12010g.setRadius(f);
        this.h.setRadius(f);
        this.i.setRadius(f);
        this.f12015k.setRadius(f);
        this.f12017l.setRadius(f);
        this.m.setRadius(f);
    }

    public final void setAdsCornerRadiusPixel(int i) {
        this.f11997R = i;
        float f = i;
        this.f12010g.setRadius(f);
        this.h.setRadius(f);
        this.i.setRadius(f);
        this.f12015k.setRadius(f);
        this.f12017l.setRadius(f);
        this.m.setRadius(f);
    }

    public final void setAutomaticScrolling(boolean z4) {
        this.f11999T = z4;
    }

    public final void setBannerCenterConstraint(int i) {
        this.f12030s0 = true;
        this.f12005c0 = 1;
        this.f12011g0 = i;
        n(this.f, -2, -2);
        ConstraintSet constraintSet = new ConstraintSet();
        G0 g02 = this.f12006d;
        constraintSet.clone(g02.f3627b);
        CardView cardView = this.f12010g;
        int id = cardView.getId();
        Guideline guideline = this.j;
        constraintSet.connect(id, 6, guideline.getId(), 6);
        constraintSet.connect(cardView.getId(), 7, guideline.getId(), 7);
        CardView cardView2 = this.f12015k;
        constraintSet.connect(cardView2.getId(), 6, guideline.getId(), 6);
        constraintSet.connect(cardView2.getId(), 7, guideline.getId(), 7);
        constraintSet.applyTo(g02.f3627b);
    }

    public final void setBannerDefaultConstraint(int i) {
        this.f12005c0 = i;
        n(this.f, -1, -2);
        ConstraintSet constraintSet = new ConstraintSet();
        G0 g02 = this.f12006d;
        constraintSet.clone(g02.f3627b);
        CardView cardView = this.f12010g;
        int id = cardView.getId();
        Guideline guideline = this.j;
        constraintSet.connect(id, 6, guideline.getId(), 6);
        constraintSet.connect(cardView.getId(), 7, guideline.getId(), 7);
        CardView cardView2 = this.f12015k;
        constraintSet.connect(cardView2.getId(), 6, guideline.getId(), 6);
        constraintSet.connect(cardView2.getId(), 7, guideline.getId(), 7);
        constraintSet.applyTo(g02.f3627b);
    }

    public final void setBannerPriorityFixEnabled(boolean z4) {
        this.f12034v0 = z4;
    }

    public final void setCarouselIntervalTime(int i) {
        this.f11998S = i;
    }

    public final void setCarouselListener(InterfaceC0641b interfaceC0641b) {
        this.f12016k0 = interfaceC0641b;
    }

    public final void setCarouselLoadedListener(InterfaceC0642c interfaceC0642c) {
        this.m0 = interfaceC0642c;
    }

    public final void setCarouselStateListener(InterfaceC0643d interfaceC0643d) {
        this.f12018l0 = interfaceC0643d;
    }

    public final void setClevertapAdTextStyle(ClevertapAd.TextStyle textStyle) {
        j.g(textStyle, "<set-?>");
        this.f12008e0 = textStyle;
    }

    public final void setCustomCarouselViewTypes(List<Object> list) {
        j.g(list, "<set-?>");
        this.f12014j0 = list;
    }

    public final void setDefaultImagePlaceholder(Integer num) {
        this.u0 = num;
    }

    public final void setDividerMode(EnumC0650k enumC0650k) {
        j.g(enumC0650k, "<set-?>");
        this.f12013i0 = enumC0650k;
    }

    public final void setDividerSizeInPx(int i) {
        this.f12007d0 = i;
    }

    public final void setEndlessScrolling(boolean z4) {
        this.f12000U = z4;
    }

    public final void setFilterAdsByScreen(String str) {
        this.f12009f0 = str;
    }

    public final void setHideCarouselTitle(boolean z4) {
        this.f12002W = z4;
    }

    public final void setImageRatio(double d10) {
        this.f12026q0 = d10;
    }

    public final void setIndicatorEnabled(boolean z4) {
        this.f12024p0 = z4;
    }

    public final void setInitialized(boolean z4) {
        this.f12022o0 = z4;
    }

    public final void setLoadingMode(int i) {
        this.f12005c0 = i;
    }

    public final void setMaxItemsToShow(int i) {
        this.f12011g0 = i;
    }

    public final void setMinItemsToEndlessScroll(int i) {
        this.f12001V = i;
    }

    public final void setRemoveTopMarginOnLoading(boolean z4) {
        this.f12004b0 = z4;
    }

    public final void setShimmerEnabled(boolean z4) {
        this.f12003a0 = z4;
    }

    public final void setShouldSetDisplayListener(boolean z4) {
        this.f12012h0 = z4;
    }

    public final void setV3(boolean z4) {
        this.f12020n0 = z4;
    }
}
