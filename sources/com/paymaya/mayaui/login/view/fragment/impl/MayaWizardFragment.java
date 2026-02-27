package com.paymaya.mayaui.login.view.fragment.impl;

import A5.j;
import C.h;
import N5.C0447e;
import Q6.l;
import S5.c;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.mayaui.login.view.activity.impl.MayaWizardActivity;
import com.paymaya.mayaui.login.view.fragment.impl.MayaWizardFragment;
import d9.a;
import fa.ViewOnClickListenerC1479a;
import g9.InterfaceC1513h;
import h9.x;
import h9.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MayaWizardFragment extends MayaBaseFragment implements InterfaceC1513h {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public l f12829U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0447e f12830V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public LinearLayout f12831W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ViewPager2 f12832X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public x f12833Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Handler f12834Z;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public a f12836b0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f12838d0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f12835a0 = "";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final ArrayList f12837c0 = new ArrayList();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final InterfaceC1033d f12839e0 = C1034e.b(new j(25));

    public static final void H1(MayaWizardFragment mayaWizardFragment) {
        a aVar = mayaWizardFragment.f12836b0;
        if (aVar == null) {
            kotlin.jvm.internal.j.n("mMayaWizardPagerItemAdapter");
            throw null;
        }
        ViewPager2 viewPager2 = mayaWizardFragment.f12832X;
        if (viewPager2 == null) {
            kotlin.jvm.internal.j.n("mViewPagerContents");
            throw null;
        }
        String string = mayaWizardFragment.getString(((i9.a) mayaWizardFragment.G1().get(viewPager2.getCurrentItem() % aVar.f16297a.size())).f17126b);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        mayaWizardFragment.f12835a0 = string;
        C1220i c1220iO1 = mayaWizardFragment.o1();
        FragmentActivity activity = mayaWizardFragment.getActivity();
        C1219h c1219hE = C1219h.e(AbstractC1213b.o(1));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("user_action", "Button");
        map.put("source_page", mayaWizardFragment.f12835a0);
        map.put("destination_page", "Reg Maya Start Page");
        map.put("version", "v1_Oct2024");
        c1219hE.i();
        c1220iO1.c(activity, c1219hE);
        x xVar = mayaWizardFragment.f12833Y;
        if (xVar != null) {
            ((MayaWizardActivity) xVar).finish();
        }
    }

    public final List G1() {
        return (List) this.f12839e0.getValue();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().p().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a mPreference = (com.paymaya.data.preference.a) aVar.e.get();
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        this.f12829U = new l(16);
        KeyEventDispatcher.Component activity = getActivity();
        this.f12833Y = activity instanceof x ? (x) activity : null;
        l lVar = this.f12829U;
        if (lVar == null) {
            kotlin.jvm.internal.j.n("mMayaWizardFragmentPresenter");
            throw null;
        }
        lVar.h(this);
        this.f10338R = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_wizard, viewGroup, false);
        int i = R.id.button_get_started;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_get_started);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.linear_layout_dot_indicators;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_dot_indicators);
            if (linearLayout != null) {
                i = R.id.space_bottom_gap;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.space_bottom_gap);
                if (viewFindChildViewById != null) {
                    i = R.id.view_pager_contents;
                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(viewInflate, R.id.view_pager_contents);
                    if (viewPager2 != null) {
                        this.f12830V = new C0447e(constraintLayout, button, linearLayout, viewFindChildViewById, viewPager2);
                        kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Handler handler = this.f12834Z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f12834Z = null;
        l lVar = this.f12829U;
        if (lVar == null) {
            kotlin.jvm.internal.j.n("mMayaWizardFragmentPresenter");
            throw null;
        }
        lVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Handler handler = this.f12834Z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        x xVar = this.f12833Y;
        if (xVar != null) {
            ((MayaWizardActivity) xVar).Q(this);
        }
        Handler handler = this.f12834Z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f12834Z;
        if (handler2 != null) {
            handler2.postDelayed(new h(this, 19), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        }
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hE = C1219h.e(AbstractC1213b.u(1));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hE.j.put("version", "v1_Oct2024");
        c1219hE.i();
        c1220iO1.c(activity, c1219hE);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f12830V;
        kotlin.jvm.internal.j.d(c0447e);
        this.f12832X = (ViewPager2) c0447e.f;
        C0447e c0447e2 = this.f12830V;
        kotlin.jvm.internal.j.d(c0447e2);
        this.f12831W = (LinearLayout) c0447e2.f4079b;
        C0447e c0447e3 = this.f12830V;
        kotlin.jvm.internal.j.d(c0447e3);
        ((Button) c0447e3.c).setOnClickListener(new ViewOnClickListenerC1479a(this, 5));
        ViewPager2 viewPager2 = this.f12832X;
        if (viewPager2 == null) {
            kotlin.jvm.internal.j.n("mViewPagerContents");
            throw null;
        }
        final View childAt = viewPager2.getChildAt(0);
        if (childAt != null) {
            childAt.setOnTouchListener(new View.OnTouchListener() { // from class: h9.w
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    MayaWizardFragment mayaWizardFragment = this.f16967a;
                    View view3 = childAt;
                    Q6.l lVar = mayaWizardFragment.f12829U;
                    if (lVar == null) {
                        kotlin.jvm.internal.j.n("mMayaWizardFragmentPresenter");
                        throw null;
                    }
                    if (!((MayaWizardFragment) ((InterfaceC1513h) lVar.c.get())).f12838d0) {
                        ((MayaWizardFragment) ((InterfaceC1513h) lVar.c.get())).f12838d0 = true;
                        MayaWizardFragment mayaWizardFragment2 = (MayaWizardFragment) ((InterfaceC1513h) lVar.c.get());
                        Handler handler = mayaWizardFragment2.f12834Z;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                        mayaWizardFragment2.f12834Z = null;
                        MayaWizardFragment mayaWizardFragment3 = (MayaWizardFragment) ((InterfaceC1513h) lVar.c.get());
                        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                        d9.a aVar = mayaWizardFragment3.f12836b0;
                        if (aVar == null) {
                            kotlin.jvm.internal.j.n("mMayaWizardPagerItemAdapter");
                            throw null;
                        }
                        ViewPager2 viewPager22 = mayaWizardFragment3.f12832X;
                        if (viewPager22 == null) {
                            kotlin.jvm.internal.j.n("mViewPagerContents");
                            throw null;
                        }
                        wVar.f18193a = viewPager22.getCurrentItem() % aVar.f16297a.size();
                        ViewPager2 viewPager23 = mayaWizardFragment3.f12832X;
                        if (viewPager23 == null) {
                            kotlin.jvm.internal.j.n("mViewPagerContents");
                            throw null;
                        }
                        viewPager23.registerOnPageChangeCallback(new z(mayaWizardFragment3, wVar));
                    }
                    view3.setOnTouchListener(null);
                    return false;
                }
            });
        }
        ViewPager2 viewPager22 = this.f12832X;
        if (viewPager22 == null) {
            kotlin.jvm.internal.j.n("mViewPagerContents");
            throw null;
        }
        a aVar = new a();
        aVar.f16297a = new ArrayList();
        List itemList = G1();
        kotlin.jvm.internal.j.g(itemList, "itemList");
        if (!itemList.isEmpty()) {
            aVar.f16297a = itemList;
            aVar.notifyDataSetChanged();
        }
        viewPager22.setAdapter(aVar);
        this.f12836b0 = aVar;
        viewPager22.setCurrentItem(1073741823 - (1073741823 % G1().size()), false);
        int size = G1().size();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f12837c0;
            if (i >= size) {
                ((ImageView) arrayList.get(0)).setImageResource(R.drawable.maya_ic_pager_dots_indicator_selected);
                viewPager22.registerOnPageChangeCallback(new y(this));
                ViewPager2 viewPager23 = this.f12832X;
                if (viewPager23 == null) {
                    kotlin.jvm.internal.j.n("mViewPagerContents");
                    throw null;
                }
                this.f12834Z = new Handler(viewPager23.getContext().getMainLooper());
                l lVar = this.f12829U;
                if (lVar != null) {
                    lVar.j();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mMayaWizardFragmentPresenter");
                    throw null;
                }
            }
            LinearLayout linearLayout = this.f12831W;
            if (linearLayout == null) {
                kotlin.jvm.internal.j.n("mLinearLayoutDotIndicators");
                throw null;
            }
            ImageView imageView = new ImageView(linearLayout.getContext());
            imageView.setImageResource(R.drawable.maya_ic_pager_dots_indicator_default);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.maya_wizard_dots_indicator_dot_spacing) / 2;
            layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
            arrayList.add(imageView);
            LinearLayout linearLayout2 = this.f12831W;
            if (linearLayout2 == null) {
                kotlin.jvm.internal.j.n("mLinearLayoutDotIndicators");
                throw null;
            }
            linearLayout2.addView(imageView, layoutParams);
            i++;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.WIZARD_V2;
    }
}
