package com.paymaya.adkit.presentation.verticalbannerad.view;

import Bj.B0;
import Bj.E;
import Bj.H;
import Bj.U;
import Ij.d;
import Ij.e;
import N5.C0435a;
import N5.C0452f1;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import b5.o;
import b5.p;
import cj.C1110A;
import cj.C1129o;
import cj.C1132s;
import cj.t;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import f5.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.j;
import o5.C1963b;
import o5.C1964c;
import o5.C1965d;
import o5.C1966e;
import p5.C2013a;
import r5.h;
import r5.l;
import r5.m;
import s5.AbstractC2238b;
import s5.g;

/* JADX INFO: loaded from: classes3.dex */
public final class VerticalBannerAd extends FrameLayout {
    public static final /* synthetic */ int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0435a f10225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f10226b;
    public m c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2013a f10227d;
    public LifecycleOwner e;
    public final WeakReference f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f10228g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalBannerAd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.g(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.vertical_banner_ad, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.ad_badge_container;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.ad_badge_container);
        if (viewFindChildViewById != null) {
            TextView textView = (TextView) viewFindChildViewById;
            C0452f1 c0452f1 = new C0452f1(textView, textView, 6);
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            i = R.id.text_subtitle;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_subtitle);
            if (textView2 != null) {
                i = R.id.text_title;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_title);
                if (textView3 != null) {
                    i = R.id.vertical_banner_ad_card_view;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(viewInflate, R.id.vertical_banner_ad_card_view);
                    if (cardView != null) {
                        i = R.id.vertical_banner_ad_recycler_view;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.vertical_banner_ad_recycler_view);
                        if (recyclerView != null) {
                            i = R.id.vertical_banner_header;
                            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.vertical_banner_header)) != null) {
                                this.f10225a = new C0435a(frameLayout, c0452f1, frameLayout, textView2, textView3, cardView, recyclerView);
                                this.f10226b = recyclerView;
                                this.f = new WeakReference(context);
                                this.f10228g = "";
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public static final int a(VerticalBannerAd verticalBannerAd, View view) {
        verticalBannerAd.getClass();
        return ((view.getWidth() - verticalBannerAd.getResources().getDimensionPixelSize(R.dimen.adkit_spacing_4dp)) - verticalBannerAd.getResources().getDimensionPixelSize(R.dimen.adkit_spacing_47dp)) / 2;
    }

    public static final void b(VerticalBannerAd verticalBannerAd, int i, int i4, C1966e c1966e) {
        int i6 = 0;
        WeakReference weakReference = verticalBannerAd.f;
        Context context = (Context) weakReference.get();
        if (context == null) {
            return;
        }
        verticalBannerAd.f10227d = new C2013a(new ArrayList(), i, i4);
        Context context2 = (Context) weakReference.get();
        RecyclerView recyclerView = verticalBannerAd.f10226b;
        if (context2 != null) {
            C2013a c2013a = verticalBannerAd.f10227d;
            if (c2013a == null) {
                j.n("adapter");
                throw null;
            }
            recyclerView.setAdapter(c2013a);
            recyclerView.setLayoutManager(new LinearLayoutManager(context2, 0, false));
        }
        new g().attachToRecyclerView(recyclerView);
        C0435a c0435a = verticalBannerAd.f10225a;
        TextView textView = (TextView) c0435a.f;
        p pVar = c1966e.e;
        textView.setText(pVar.c());
        TextView textView2 = ((C0452f1) c0435a.c).c;
        textView2.setVisibility(pVar.a().length() == 0 ? 8 : 0);
        textView2.setText(pVar.a());
        String strB = pVar.b();
        int i10 = (strB == null || strB.length() == 0) ? 8 : 0;
        TextView textView3 = (TextView) c0435a.e;
        textView3.setVisibility(i10);
        textView3.setText(pVar.b());
        recyclerView.addOnScrollListener(new C1964c(verticalBannerAd));
        recyclerView.addOnItemTouchListener(new C1965d(verticalBannerAd));
        verticalBannerAd.f10226b.setVisibility(8);
        ((CardView) verticalBannerAd.f10225a.f4049g).setVisibility(8);
        if (!(context instanceof ViewModelStoreOwner)) {
            Log.e("MayaAdKit/VerticalBannerAd", "Context must implement ViewModelStoreOwner for ViewModel.");
            return;
        }
        m mVar = verticalBannerAd.c;
        if (mVar == null) {
            j.n("viewModel");
            throw null;
        }
        mVar.b();
        m mVar2 = verticalBannerAd.c;
        if (mVar2 == null) {
            j.n("viewModel");
            throw null;
        }
        MutableLiveData mutableLiveData = mVar2.e;
        LifecycleOwner lifecycleOwner = verticalBannerAd.e;
        if (lifecycleOwner == null) {
            j.n("lifecycleOwner");
            throw null;
        }
        mutableLiveData.observe(lifecycleOwner, new c(3, new C1963b(i6, verticalBannerAd, c1966e)));
        s5.m placement = c1966e.f18779b;
        j.g(placement, "placement");
        if (AbstractC2238b.f20004a[placement.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        String[] stringArray = context.getResources().getStringArray(R.array.vertical_banner_ad_unit_id_pms_internal_view);
        j.f(stringArray, "getStringArray(...)");
        List allAdUnitIds = C1129o.z(stringArray);
        m mVar3 = verticalBannerAd.c;
        if (mVar3 == null) {
            j.n("viewModel");
            throw null;
        }
        j.g(allAdUnitIds, "allAdUnitIds");
        MutableLiveData mutableLiveData2 = mVar3.f19871d;
        mutableLiveData2.postValue(h.f19861a);
        mVar3.j = placement;
        mVar3.f19872g = allAdUnitIds;
        if (allAdUnitIds.isEmpty()) {
            mutableLiveData2.postValue(r5.g.f19860a);
            return;
        }
        List list = allAdUnitIds;
        ArrayList arrayList = new ArrayList(t.l(list, 10));
        for (Object obj : list) {
            int i11 = i6 + 1;
            if (i6 < 0) {
                C1132s.k();
                throw null;
            }
            arrayList.add(new o(androidx.media3.datasource.cache.c.h(i6, (String) obj, Global.HYPHEN), null));
            i6 = i11;
        }
        mVar3.f19873k = C1110A.W(arrayList);
        mVar3.i.clear();
        mVar3.h.clear();
        B0 b02 = mVar3.f;
        if (b02 != null) {
            b02.b(null);
        }
        E viewModelScope = ViewModelKt.getViewModelScope(mVar3);
        mVar3.c.getClass();
        e eVar = U.f603a;
        mVar3.f = H.w(viewModelScope, d.f2362a, null, new l(mVar3, null), 2);
    }

    public final void c(List list) {
        Log.d("VerticalBannerAd", "Updating adapter with " + list.size() + " ads.");
        C2013a c2013a = this.f10227d;
        if (c2013a == null) {
            j.n("adapter");
            throw null;
        }
        ArrayList arrayList = c2013a.f19070a;
        arrayList.clear();
        arrayList.addAll(list);
        c2013a.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Context context = getContext();
        hxOD26.getInstance().gSVOV1(new eTp7v2(motionEvent, context instanceof Activity ? (Activity) context : null));
        return super.onInterceptTouchEvent(motionEvent);
    }
}
