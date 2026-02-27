package com.liaoinstan.springview.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import ph.U2;
import q4.AbstractC2162a;
import r4.C2188a;
import r4.C2189b;
import t4.C2269a;
import t4.b;
import t4.c;
import t4.d;
import t4.e;
import t4.f;
import t4.g;
import t4.h;
import t4.i;
import t4.j;
import t4.k;

/* JADX INFO: loaded from: classes3.dex */
public class SpringView extends ViewGroup {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f10155q0 = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public k f10156B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public k f10157K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public View f10158P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public View f10159Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public View f10160R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public View f10161S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final int f10162T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final int f10163U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f10164V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f10165W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutInflater f10166a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f10167a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OverScroller f10168b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public e f10169b0;
    public final C2269a c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public f f10170c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f10171d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public g f10172d0;
    public int e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final b f10173e0;
    public boolean f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f10174f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10175g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f10176g0;
    public boolean h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f10177h0;
    public boolean i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f10178i0;
    public boolean j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f10179j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10180k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f10181k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10182l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public h f10183l0;
    public float m;
    public h m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10184n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public h f10185n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10186o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public h f10187o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10188p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f10189p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10190q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f10193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f10194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f10195v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f10196w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f10197x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f10198y;

    public SpringView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new Handler();
        C2269a c2269a = new C2269a();
        c2269a.f20150a = 0;
        c2269a.f20151b = 0;
        c2269a.c = false;
        c2269a.f20152d = false;
        c2269a.e = false;
        c2269a.f = 0;
        c2269a.h = false;
        this.c = c2269a;
        this.f = false;
        this.f10175g = false;
        this.h = false;
        this.i = true;
        this.j = true;
        this.f10180k = false;
        this.f10182l = 600;
        this.m = 2.0f;
        this.f10184n = 600;
        this.f10186o = 600;
        this.f10197x = false;
        this.f10198y = i.f20162a;
        this.f10156B = k.f20166b;
        this.f10189p0 = 1;
        this.f10164V = false;
        b bVar = new b();
        bVar.f20154a = -1;
        bVar.f20155b = -1;
        bVar.c = null;
        bVar.f20156d = true;
        bVar.e = true;
        bVar.f = true;
        bVar.f20157g = true;
        this.f10173e0 = bVar;
        this.f10181k0 = -1;
        this.f10166a = LayoutInflater.from(context);
        this.f10168b = new OverScroller(context);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2162a.f19740a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f10156B = k.values()[typedArrayObtainStyledAttributes.getInt(3, 0)];
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f10198y = i.values()[typedArrayObtainStyledAttributes.getInt(1, 0)];
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f10162T = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f10163U = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public boolean __replaced_14537_2_onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f10177h0;
    }

    public final void a(h hVar) {
        this.f10187o0 = hVar;
        View view = this.f10159Q;
        if (view != null) {
            removeView(view);
        }
        View viewH = hVar.h(this.f10166a, this);
        if (viewH instanceof SpringView) {
            this.f10159Q = getChildAt(getChildCount() - 1);
        } else {
            addView(viewH);
            this.f10159Q = viewH;
        }
        m();
        requestLayout();
    }

    public final void b(h hVar) {
        this.f10185n0 = hVar;
        View view = this.f10158P;
        if (view != null) {
            removeView(view);
        }
        View viewH = hVar.h(this.f10166a, this);
        if (viewH instanceof SpringView) {
            this.f10158P = getChildAt(getChildCount() - 1);
        } else {
            addView(viewH);
            this.f10158P = viewH;
        }
        m();
        requestLayout();
    }

    public final void c() {
        if (h(this.f10185n0) == k.f20167d || g()) {
            return;
        }
        this.f10180k = true;
        C2269a c2269a = this.c;
        c2269a.f20153g = 1;
        this.f10175g = true;
        c2269a.f20152d = false;
        c2269a.c = false;
        c2269a.f = 1;
        h hVar = this.f10185n0;
        if (hVar != null) {
            hVar.c();
            this.f10185n0.b();
        }
        n(Boolean.TRUE, Boolean.FALSE);
        this.f10168b.startScroll(0, getScrollY(), 0, (-getScrollY()) - this.f10191r, this.f10182l);
        invalidate();
    }

    @Override // android.view.View
    public final void computeScroll() {
        h hVar;
        h hVar2;
        OverScroller overScroller = this.f10168b;
        if (overScroller.computeScrollOffset()) {
            scrollTo(0, overScroller.getCurrY());
            this.e = getScrollY();
            d();
            invalidate();
        }
        if (this.h || !overScroller.isFinished()) {
            return;
        }
        C2269a c2269a = this.c;
        int i = c2269a.f20153g;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 || c2269a.e) {
                    return;
                }
                c2269a.e = true;
                h hVar3 = g() ? this.f10185n0 : this.f10187o0;
                if (hVar3 == null) {
                    return;
                }
                new Handler().postDelayed(new U2(this, hVar3), 0);
                return;
            }
            if (c2269a.f20152d) {
                return;
            }
            c2269a.f20152d = true;
            if (g()) {
                this.f10171d.onRefresh();
                return;
            } else {
                if (f()) {
                    this.f10171d.i();
                    return;
                }
                return;
            }
        }
        if (c2269a.c) {
            return;
        }
        c2269a.c = true;
        int i4 = c2269a.f;
        if (i4 == 1 || i4 == 3) {
            h hVar4 = this.f10185n0;
            if (hVar4 != null && c2269a.f20150a == 2) {
                hVar4.e();
                c2269a.f20150a = 0;
            }
        } else if ((i4 == 2 || i4 == 4) && (hVar2 = this.f10187o0) != null && c2269a.f20151b == 2) {
            hVar2.e();
            c2269a.f20151b = 0;
        }
        int i6 = c2269a.f;
        i iVar = i.f20164d;
        if (i6 == 1) {
            h hVar5 = this.f10185n0;
            if (hVar5 != null) {
                hVar5.g();
            }
            i iVar2 = this.f10198y;
            if (iVar2 == i.c || (iVar2 == iVar && !this.f10180k)) {
                this.f10171d.onRefresh();
            }
            this.f10180k = false;
        } else if (i6 == 2) {
            h hVar6 = this.f10187o0;
            if (hVar6 != null) {
                hVar6.g();
            }
            i iVar3 = this.f10198y;
            if (iVar3 == i.f20163b || iVar3 == iVar) {
                this.f10171d.i();
            }
        } else if (i6 == 3) {
            h hVar7 = this.f10185n0;
            if (hVar7 != null) {
                hVar7.g();
            }
        } else if (i6 == 4 && (hVar = this.f10187o0) != null) {
            hVar.g();
        }
        c2269a.f = 0;
        h hVar8 = this.f10183l0;
        if (hVar8 != null) {
            b(hVar8);
            this.f10183l0 = null;
        }
        h hVar9 = this.m0;
        if (hVar9 != null) {
            a(hVar9);
            this.m0 = null;
        }
        if (this.f) {
            this.f10156B = this.f10157K;
            m();
            requestLayout();
            this.f = false;
            View view = this.f10158P;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            View view2 = this.f10159Q;
            if (view2 != null) {
                view2.setTranslationY(0.0f);
            }
        }
    }

    public final void d() {
        k kVarH;
        h hVar;
        h hVar2;
        h hVar3;
        h hVar4;
        if (getScrollY() < 0 && (hVar4 = this.f10185n0) != null) {
            hVar4.a(-getScrollY(), this.f10158P);
        }
        if (getScrollY() > 0 && (hVar3 = this.f10187o0) != null) {
            hVar3.a(-getScrollY(), this.f10159Q);
        }
        int scrollY = getScrollY();
        C2269a c2269a = this.c;
        if (scrollY < 0 && getScrollY() > -10 && (hVar2 = this.f10185n0) != null && c2269a.f20150a == 1) {
            hVar2.d();
            c2269a.f20150a = 2;
        }
        if (getScrollY() > 0 && getScrollY() < 10 && (hVar = this.f10187o0) != null && c2269a.f20151b == 1) {
            hVar.d();
            c2269a.f20151b = 2;
        }
        boolean zG = g();
        boolean zF = f();
        if (zG) {
            kVarH = h(this.f10185n0);
        } else if (!zF) {
            return;
        } else {
            kVarH = h(this.f10187o0);
        }
        if (!this.f10161S.canScrollVertically(1) && this.f10196w <= 0.0f && this.f10195v > 0.0f) {
            requestLayout();
        } else if (!this.f10161S.canScrollVertically(-1) && this.f10196w >= 0.0f && this.f10195v < 0.0f) {
            requestLayout();
        }
        if (kVarH == k.f20165a) {
            View view = this.f10158P;
            if (view != null) {
                view.setTranslationY(getScrollY() + view.getHeight());
            }
            View view2 = this.f10159Q;
            if (view2 != null) {
                view2.setTranslationY(getScrollY() + (-view2.getHeight()));
            }
            View view3 = this.f10160R;
            if (view3 != null) {
                view3.setTranslationY(0.0f);
            }
        } else if (kVarH == k.c) {
            View view4 = this.f10160R;
            if (view4 != null) {
                view4.setTranslationY(getScrollY());
            }
            View view5 = this.f10158P;
            if (view5 != null) {
                view5.setTranslationY(0.0f);
            }
            View view6 = this.f10159Q;
            if (view6 != null) {
                view6.setTranslationY(0.0f);
            }
        } else if (kVarH == k.f20166b || kVarH == k.f20167d) {
            View view7 = this.f10160R;
            if (view7 != null) {
                view7.setTranslationY(0.0f);
            }
            View view8 = this.f10158P;
            if (view8 != null) {
                view8.setTranslationY(0.0f);
            }
            View view9 = this.f10159Q;
            if (view9 != null) {
                view9.setTranslationY(0.0f);
            }
        }
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liaoinstan.springview.widget.SpringView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void e() {
        boolean zG = g();
        C2269a c2269a = this.c;
        if (zG) {
            c2269a.f = 1;
            h hVar = this.f10185n0;
            if (hVar != null) {
                int i = c2269a.f20150a;
                if (i == 0 || i == 2) {
                    hVar.b();
                    c2269a.f20150a = 1;
                    return;
                }
                return;
            }
            return;
        }
        if (f()) {
            c2269a.f = 2;
            h hVar2 = this.f10187o0;
            if (hVar2 != null) {
                int i4 = c2269a.f20151b;
                if (i4 == 0 || i4 == 2) {
                    hVar2.b();
                    c2269a.f20151b = 1;
                }
            }
        }
    }

    public final boolean f() {
        return getScrollY() > 0;
    }

    public final boolean g() {
        return getScrollY() < 0;
    }

    public View getContentLay() {
        return this.f10160R;
    }

    public View getContentView() {
        return this.f10161S;
    }

    public h getFooter() {
        return this.f10187o0;
    }

    public View getFooterView() {
        return this.f10159Q;
    }

    public h getHeader() {
        return this.f10185n0;
    }

    public View getHeaderView() {
        return this.f10158P;
    }

    public k getType() {
        return this.f10156B;
    }

    public final k h(h hVar) {
        if (hVar == null) {
            return null;
        }
        k kVar = this.f10156B;
        return kVar != null ? kVar : k.f20166b;
    }

    public final void i() {
        i iVar;
        i iVar2;
        if (this.h || !this.f10175g) {
            return;
        }
        if (this.f10180k) {
            if (g()) {
                k();
                return;
            } else {
                k();
                return;
            }
        }
        boolean zG = g();
        i iVar3 = i.f20162a;
        boolean z4 = false;
        boolean z5 = zG && ((iVar2 = this.f10198y) == i.f20163b || iVar2 == iVar3);
        if (f() && ((iVar = this.f10198y) == i.c || iVar == iVar3)) {
            z4 = true;
        }
        if (z5 || z4) {
            k();
        }
    }

    public final void j() {
        int measuredHeight;
        int scrollY;
        int measuredHeight2;
        int paddingTop;
        int iComputeVerticalScrollExtent;
        k kVarH = h(this.f10185n0);
        k kVar = k.f20167d;
        if (kVarH == kVar || h(this.f10187o0) == kVar) {
            View view = this.f10161S;
            if (view instanceof RecyclerView) {
                measuredHeight = ((RecyclerView) view).computeVerticalScrollRange();
                scrollY = ((RecyclerView) this.f10161S).computeVerticalScrollOffset();
                iComputeVerticalScrollExtent = ((RecyclerView) this.f10161S).computeVerticalScrollExtent();
            } else {
                if (view instanceof NestedScrollView) {
                    measuredHeight = ((NestedScrollView) view).computeVerticalScrollRange() - this.f10161S.getPaddingTop();
                    scrollY = ((NestedScrollView) this.f10161S).computeVerticalScrollOffset();
                    measuredHeight2 = ((NestedScrollView) this.f10161S).computeVerticalScrollExtent() - this.f10161S.getPaddingBottom();
                    paddingTop = this.f10161S.getPaddingTop();
                } else if (view instanceof ScrollView) {
                    measuredHeight = ((ViewGroup) view).getChildAt(0).getMeasuredHeight();
                    scrollY = this.f10161S.getScrollY();
                    measuredHeight2 = this.f10161S.getMeasuredHeight() - this.f10161S.getPaddingBottom();
                    paddingTop = this.f10161S.getPaddingTop();
                } else {
                    measuredHeight = view.getMeasuredHeight();
                    scrollY = this.f10161S.getScrollY();
                    measuredHeight2 = this.f10161S.getMeasuredHeight() - this.f10161S.getPaddingBottom();
                    paddingTop = this.f10161S.getPaddingTop();
                }
                iComputeVerticalScrollExtent = measuredHeight2 - paddingTop;
            }
            int i = measuredHeight - iComputeVerticalScrollExtent;
            if (i < 0) {
                i = 0;
            }
            int i4 = this.f10192s - (i - scrollY);
            int i6 = this.f10191r - scrollY;
            k kVarH2 = h(this.f10185n0);
            b bVar = this.f10173e0;
            if (kVarH2 == kVar) {
                if (i6 > 0) {
                    this.f10158P.setVisibility(0);
                    this.f10158P.setTranslationY(i6);
                    h hVar = this.f10185n0;
                    View view2 = this.f10158P;
                    if (bVar.f20154a != i6) {
                        hVar.a(i6, view2);
                        if (i6 == 0 && bVar.f20157g) {
                            hVar.d();
                            bVar.f20157g = false;
                            bVar.f = true;
                        }
                    }
                    bVar.f20154a = i6;
                } else {
                    this.f10158P.setTranslationY(0.0f);
                    h hVar2 = this.f10185n0;
                    View view3 = this.f10158P;
                    if (bVar.f20154a != 0) {
                        hVar2.a(0, view3);
                        if (bVar.f20157g) {
                            hVar2.d();
                            bVar.f20157g = false;
                            bVar.f = true;
                        }
                    }
                    bVar.f20154a = 0;
                }
            }
            if (h(this.f10187o0) == kVar) {
                if (i4 > 0) {
                    this.f10159Q.setVisibility(0);
                    this.f10159Q.setTranslationY(-i4);
                    h hVar3 = this.f10187o0;
                    View view4 = this.f10159Q;
                    if (bVar.f20155b != i4) {
                        hVar3.a(i4, view4);
                        if (i4 == 0 && bVar.e) {
                            hVar3.d();
                            bVar.e = false;
                            bVar.f20156d = true;
                        }
                    }
                    bVar.f20155b = i4;
                } else {
                    this.f10159Q.setTranslationY(0.0f);
                    h hVar4 = this.f10187o0;
                    View view5 = this.f10159Q;
                    if (bVar.f20155b != 0) {
                        hVar4.a(0, view5);
                        if (bVar.e) {
                            hVar4.d();
                            bVar.e = false;
                            bVar.f20156d = true;
                        }
                    }
                    bVar.f20155b = 0;
                }
            }
            if (scrollY == 0 && h(this.f10185n0) == kVar) {
                h hVar5 = this.f10185n0;
                j jVar = this.f10171d;
                if (bVar.f) {
                    if (hVar5 != null) {
                        hVar5.b();
                    }
                    if (jVar != null) {
                        jVar.onRefresh();
                    }
                    bVar.f = false;
                    bVar.f20157g = true;
                }
            }
            if (scrollY >= i && h(this.f10187o0) == kVar) {
                h hVar6 = this.f10187o0;
                j jVar2 = this.f10171d;
                if (bVar.f20156d) {
                    if (hVar6 != null) {
                        hVar6.b();
                    }
                    if (jVar2 != null) {
                        jVar2.i();
                    }
                    bVar.f20156d = false;
                    bVar.e = true;
                }
            }
            if (i <= this.f10192s) {
                if (h(this.f10187o0) == kVar) {
                    h hVar7 = this.f10187o0;
                    View view6 = this.f10159Q;
                    Boolean bool = bVar.c;
                    if (bool == null || bool.booleanValue()) {
                        hVar7.f(view6, false);
                        bVar.c = Boolean.FALSE;
                        return;
                    }
                    return;
                }
                return;
            }
            if (h(this.f10187o0) == kVar) {
                h hVar8 = this.f10187o0;
                View view7 = this.f10159Q;
                Boolean bool2 = bVar.c;
                if (bool2 == null || true != bool2.booleanValue()) {
                    hVar8.f(view7, true);
                    bVar.c = Boolean.TRUE;
                }
            }
        }
    }

    public final void k() {
        this.c.f20153g = 0;
        this.f10197x = false;
        this.f10168b.startScroll(0, getScrollY(), 0, -getScrollY(), this.f10182l);
        invalidate();
    }

    public final void l() {
        this.c.f20153g = 1;
        this.f10197x = false;
        int scrollY = getScrollY();
        OverScroller overScroller = this.f10168b;
        if (scrollY < 0) {
            overScroller.startScroll(0, getScrollY(), 0, (-getScrollY()) - this.f10191r, this.f10182l);
            invalidate();
        } else {
            overScroller.startScroll(0, getScrollY(), 0, (-getScrollY()) + this.f10192s, this.f10182l);
            invalidate();
        }
    }

    public final void m() {
        k kVarH = h(this.f10185n0);
        k kVar = k.f20167d;
        if (kVarH == kVar || h(this.f10187o0) == kVar) {
            View view = this.f10161S;
            if (view instanceof RecyclerView) {
                ((RecyclerView) view).removeOnScrollListener(this.f10169b0);
                ((RecyclerView) this.f10161S).addOnScrollListener(this.f10169b0);
            } else if (view instanceof NestedScrollView) {
                ((NestedScrollView) view).setOnScrollChangeListener(this.f10170c0);
            } else {
                view.setOnScrollChangeListener(this.f10172d0);
            }
        }
    }

    public final void n(Boolean bool, Boolean bool2) {
        View view = this.f10158P;
        if (view != null) {
            view.setVisibility(bool.booleanValue() ? 0 : 4);
        }
        View view2 = this.f10159Q;
        if (view2 != null) {
            view2.setVisibility(bool2.booleanValue() ? 0 : 4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AppBarLayout appBarLayout;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof CoordinatorLayout)) {
            parent = parent.getParent();
        }
        boolean z4 = true;
        if (parent != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = coordinatorLayout.getChildAt(childCount);
                if (childAt instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) childAt;
                    break;
                }
            }
            appBarLayout = null;
        } else {
            appBarLayout = null;
        }
        if (appBarLayout == null) {
            z4 = false;
        } else {
            for (int i = 0; i < appBarLayout.getChildCount(); i++) {
                View childAt2 = appBarLayout.getChildAt(i);
                if (childAt2.getLayoutParams() instanceof AppBarLayout.LayoutParams) {
                    if ((((AppBarLayout.LayoutParams) childAt2.getLayoutParams()).getScrollFlags() & 1) == 1) {
                        break;
                    }
                } else {
                    Log.e("SpringView", "view检查出现异常");
                }
            }
            z4 = false;
        }
        this.f10164V = z4;
        if (appBarLayout != null) {
            appBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new d(this));
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        setPadding(0, 0, 0, 0);
        if (c.b(childAt)) {
            this.f10160R = childAt;
            this.f10161S = childAt;
        } else {
            View viewA = c.a(childAt);
            if (viewA != null) {
                this.f10161S = viewA;
            } else {
                this.f10161S = childAt;
            }
            this.f10160R = childAt;
        }
        this.f10165W = this.f10161S.getPaddingTop();
        this.f10167a0 = this.f10161S.getPaddingBottom();
        this.f10169b0 = new e(this);
        this.f10170c0 = new f(this);
        this.f10172d0 = new g(this);
        int i = this.f10162T;
        if (i != 0) {
            b(new C2189b(i));
        }
        int i4 = this.f10163U;
        if (i4 != 0) {
            a(new C2188a(i4));
        }
        super.onFinishInflate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return __replaced_14537_2_onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i4, int i6, int i10) {
        if (this.f10160R != null) {
            View view = this.f10158P;
            if (view != null) {
                view.layout(0, -view.getMeasuredHeight(), getWidth(), 0);
            }
            View view2 = this.f10159Q;
            if (view2 != null) {
                view2.layout(0, getHeight(), getWidth(), this.f10159Q.getMeasuredHeight() + getHeight());
            }
            View view3 = this.f10160R;
            view3.layout(0, 0, view3.getMeasuredWidth(), this.f10160R.getMeasuredHeight());
            k kVarH = h(this.f10185n0);
            k kVar = k.f20165a;
            if (kVarH == kVar) {
                if (h(this.f10187o0) == kVar) {
                    this.f10160R.bringToFront();
                } else {
                    View view4 = this.f10158P;
                    if (view4 != null) {
                        view4.bringToFront();
                    }
                    View view5 = this.f10159Q;
                    if (view5 != null) {
                        view5.bringToFront();
                    }
                    this.f10160R.bringToFront();
                }
            } else if (h(this.f10187o0) == kVar) {
                View view6 = this.f10159Q;
                if (view6 != null) {
                    view6.bringToFront();
                }
                this.f10160R.bringToFront();
                View view7 = this.f10158P;
                if (view7 != null) {
                    view7.bringToFront();
                }
            } else {
                View view8 = this.f10158P;
                if (view8 != null) {
                    view8.bringToFront();
                }
                View view9 = this.f10159Q;
                if (view9 != null) {
                    view9.bringToFront();
                }
            }
            k kVarH2 = h(this.f10185n0);
            k kVar2 = k.f20167d;
            if (kVarH2 == kVar2 || h(this.f10187o0) == kVar2) {
                j();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        if (getChildCount() > 0) {
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                measureChild(getChildAt(i6), i, i4);
            }
        }
        if (this.f10185n0 != null) {
            this.f10188p = this.f10158P.getMeasuredHeight();
            this.f10185n0.getClass();
            this.f10191r = this.f10188p;
            this.f10185n0.getClass();
        } else {
            View view = this.f10158P;
            if (view != null) {
                this.f10188p = view.getMeasuredHeight();
            }
            this.f10191r = this.f10188p;
        }
        if (this.f10187o0 != null) {
            this.f10190q = this.f10159Q.getMeasuredHeight();
            this.f10187o0.getClass();
            this.f10192s = this.f10190q;
            this.f10187o0.getClass();
        } else {
            View view2 = this.f10159Q;
            if (view2 != null) {
                this.f10190q = view2.getMeasuredHeight();
            }
            this.f10192s = this.f10190q;
        }
        h hVar = this.f10185n0;
        k kVar = k.f20167d;
        boolean z4 = hVar != null && h(hVar) == kVar;
        h hVar2 = this.f10187o0;
        boolean z5 = hVar2 != null && h(hVar2) == kVar;
        if (z4 || z5) {
            int i10 = z4 ? this.f10191r : 0;
            int i11 = z5 ? this.f10192s : 0;
            View view3 = this.f10161S;
            view3.setPadding(view3.getPaddingLeft(), this.f10165W + i10, this.f10161S.getPaddingRight(), this.f10167a0 + i11);
            View view4 = this.f10161S;
            if (view4 instanceof ViewGroup) {
                ((ViewGroup) view4).setClipToPadding(false);
            }
        } else {
            View view5 = this.f10161S;
            view5.setPadding(view5.getPaddingLeft(), this.f10165W, this.f10161S.getPaddingRight(), this.f10167a0);
            ((ViewGroup) this.f10161S).setClipToPadding(false);
        }
        setMeasuredDimension(i, i4);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i4, int i6, int i10) {
        super.onScrollChanged(i, i4, i6, i10);
        this.f10195v = i4;
        this.f10196w = i10;
        if (i4 == 0) {
            View view = this.f10160R;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            View view2 = this.f10158P;
            if (view2 != null) {
                view2.setTranslationY(0.0f);
            }
            View view3 = this.f10159Q;
            if (view3 != null) {
                view3.setTranslationY(0.0f);
            }
        }
        j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r0 != 3) goto L90;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liaoinstan.springview.widget.SpringView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setEnable(boolean z4) {
        this.i = z4;
        this.j = z4;
    }

    public void setEnableFooter(boolean z4) {
        this.j = z4;
    }

    public void setEnableHeader(boolean z4) {
        this.i = z4;
    }

    public void setFooter(h hVar) {
        if (this.f10187o0 == null || !f()) {
            a(hVar);
        } else {
            this.m0 = hVar;
            k();
        }
    }

    public void setGive(i iVar) {
        this.f10198y = iVar;
    }

    public void setHeader(h hVar) {
        if (this.f10185n0 == null || !g()) {
            b(hVar);
        } else {
            this.f10183l0 = hVar;
            k();
        }
    }

    public void setListener(j jVar) {
        this.f10171d = jVar;
    }

    @Deprecated
    public void setMovePara(double d10) {
        setMovePara((float) d10);
    }

    public void setMoveTime(int i) {
        this.f10182l = i;
    }

    public void setType(k kVar) {
        if (g() || f()) {
            this.f = true;
            this.f10157K = kVar;
            return;
        }
        this.f10156B = kVar;
        m();
        requestLayout();
        this.f = false;
        View view = this.f10158P;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        View view2 = this.f10159Q;
        if (view2 != null) {
            view2.setTranslationY(0.0f);
        }
    }

    public void setMovePara(float f) {
        this.m = f;
    }
}
