package com.paymaya.mayaui.settings.view.fragment.impl;

import Ke.b;
import N5.C0441c;
import N5.C0450f;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.mayaui.settings.view.activity.impl.MayaAdsInternalOnlyActivity;
import com.paymaya.mayaui.settings.view.fragment.MayaFlutterAdsInternalOnlyFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAdsInternalOnlyFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaNativeAdsInternalOnlyFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaAdsInternalOnlyFragment extends Fragment {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0450f f13924B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public MayaAdsInternalOnlyActivity f13925K;

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        this.f13925K = activity instanceof MayaAdsInternalOnlyActivity ? (MayaAdsInternalOnlyActivity) activity : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_ads_internal_only, viewGroup, false);
        int i = R.id.nav_flutter_views;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.nav_flutter_views);
        if (viewFindChildViewById != null) {
            C0441c c0441cA = C0441c.a(viewFindChildViewById);
            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.nav_native_views);
            if (viewFindChildViewById2 != null) {
                C0441c c0441cA2 = C0441c.a(viewFindChildViewById2);
                int i4 = R.id.text_view_footer;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_footer)) != null) {
                    i4 = R.id.text_view_header;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                        this.f13924B = new C0450f(nestedScrollView, c0441cA, c0441cA2, 5);
                        j.f(nestedScrollView, "getRoot(...)");
                        return nestedScrollView;
                    }
                }
                i = i4;
            } else {
                i = R.id.nav_native_views;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f13924B = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0450f c0450f = this.f13924B;
        j.d(c0450f);
        ((TextView) ((LinearLayout) ((C0441c) c0450f.f4088d).f4066b).findViewById(R.id.horizontal_label_with_arrow_label_text_view)).setText(getString(R.string.maya_label_native_ad_views));
        C0450f c0450f2 = this.f13924B;
        j.d(c0450f2);
        ((TextView) ((LinearLayout) ((C0441c) c0450f2.f4087b).f4066b).findViewById(R.id.horizontal_label_with_arrow_label_text_view)).setText(getString(R.string.maya_label_flutter_ad_views));
        C0450f c0450f3 = this.f13924B;
        j.d(c0450f3);
        final int i = 0;
        b.b((LinearLayout) ((C0441c) c0450f3.f4088d).c, new Function0(this) { // from class: Sb.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAdsInternalOnlyFragment f5702b;

            {
                this.f5702b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity = this.f5702b.f13925K;
                        if (mayaAdsInternalOnlyActivity != null) {
                            String string = mayaAdsInternalOnlyActivity.getString(R.string.maya_label_native_ad_views);
                            kotlin.jvm.internal.j.f(string, "getString(...)");
                            mayaAdsInternalOnlyActivity.W1(string);
                            mayaAdsInternalOnlyActivity.V1(new MayaNativeAdsInternalOnlyFragment(), "runNativeAds");
                        }
                        break;
                    default:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity2 = this.f5702b.f13925K;
                        if (mayaAdsInternalOnlyActivity2 != null) {
                            String string2 = mayaAdsInternalOnlyActivity2.getString(R.string.maya_label_flutter_ad_views);
                            kotlin.jvm.internal.j.f(string2, "getString(...)");
                            mayaAdsInternalOnlyActivity2.W1(string2);
                            mayaAdsInternalOnlyActivity2.V1(new MayaFlutterAdsInternalOnlyFragment(mayaAdsInternalOnlyActivity2.n1(), mayaAdsInternalOnlyActivity2.m1(), mayaAdsInternalOnlyActivity2.k1()), "runFlutterAds");
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        C0450f c0450f4 = this.f13924B;
        j.d(c0450f4);
        final int i4 = 1;
        b.b((LinearLayout) ((C0441c) c0450f4.f4087b).c, new Function0(this) { // from class: Sb.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAdsInternalOnlyFragment f5702b;

            {
                this.f5702b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity = this.f5702b.f13925K;
                        if (mayaAdsInternalOnlyActivity != null) {
                            String string = mayaAdsInternalOnlyActivity.getString(R.string.maya_label_native_ad_views);
                            kotlin.jvm.internal.j.f(string, "getString(...)");
                            mayaAdsInternalOnlyActivity.W1(string);
                            mayaAdsInternalOnlyActivity.V1(new MayaNativeAdsInternalOnlyFragment(), "runNativeAds");
                        }
                        break;
                    default:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity2 = this.f5702b.f13925K;
                        if (mayaAdsInternalOnlyActivity2 != null) {
                            String string2 = mayaAdsInternalOnlyActivity2.getString(R.string.maya_label_flutter_ad_views);
                            kotlin.jvm.internal.j.f(string2, "getString(...)");
                            mayaAdsInternalOnlyActivity2.W1(string2);
                            mayaAdsInternalOnlyActivity2.V1(new MayaFlutterAdsInternalOnlyFragment(mayaAdsInternalOnlyActivity2.n1(), mayaAdsInternalOnlyActivity2.m1(), mayaAdsInternalOnlyActivity2.k1()), "runFlutterAds");
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
    }
}
