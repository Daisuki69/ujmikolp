package com.paymaya.mayaui.settings.view.fragment.impl;

import G7.F;
import Ke.b;
import N5.C0441c;
import N5.C0447e;
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
import com.paymaya.domain.store.M;
import com.paymaya.mayaui.settings.view.activity.impl.MayaAdsInternalOnlyActivity;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAdsViewerFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaNativeAdsInternalOnlyFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import m5.C1847a;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaNativeAdsInternalOnlyFragment extends Fragment {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0447e f13982B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public MayaAdsInternalOnlyActivity f13983K;

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        this.f13983K = activity instanceof MayaAdsInternalOnlyActivity ? (MayaAdsInternalOnlyActivity) activity : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_native_ads_internal_only, viewGroup, false);
        int i = R.id.nav_interstitial;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.nav_interstitial);
        if (viewFindChildViewById != null) {
            C0441c c0441cA = C0441c.a(viewFindChildViewById);
            i = R.id.nav_native_banner;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.nav_native_banner);
            if (viewFindChildViewById2 != null) {
                C0441c c0441cA2 = C0441c.a(viewFindChildViewById2);
                i = R.id.nav_native_inline;
                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.nav_native_inline);
                if (viewFindChildViewById3 != null) {
                    C0441c c0441cA3 = C0441c.a(viewFindChildViewById3);
                    i = R.id.nav_native_vertical;
                    View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.nav_native_vertical);
                    if (viewFindChildViewById4 != null) {
                        C0441c c0441cA4 = C0441c.a(viewFindChildViewById4);
                        i = R.id.text_view_footer;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_footer)) != null) {
                            i = R.id.text_view_header;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                                NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                this.f13982B = new C0447e(nestedScrollView, c0441cA, c0441cA2, c0441cA3, c0441cA4, 18);
                                j.f(nestedScrollView, "getRoot(...)");
                                return nestedScrollView;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f13982B = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f13982B;
        j.d(c0447e);
        ((TextView) ((LinearLayout) ((C0441c) c0447e.f4080d).f4066b).findViewById(R.id.horizontal_label_with_arrow_label_text_view)).setText(getString(R.string.maya_label_ads_banner_16_5_native));
        C0447e c0447e2 = this.f13982B;
        j.d(c0447e2);
        ((TextView) ((LinearLayout) ((C0441c) c0447e2.c).f4066b).findViewById(R.id.horizontal_label_with_arrow_label_text_view)).setText(getString(R.string.maya_label_ads_interstitial_9_16));
        C0447e c0447e3 = this.f13982B;
        j.d(c0447e3);
        ((TextView) ((LinearLayout) ((C0441c) c0447e3.f).f4066b).findViewById(R.id.horizontal_label_with_arrow_label_text_view)).setText(getString(R.string.maya_label_ads_vertical_video_native));
        C0447e c0447e4 = this.f13982B;
        j.d(c0447e4);
        ((TextView) ((LinearLayout) ((C0441c) c0447e4.e).f4066b).findViewById(R.id.horizontal_label_with_arrow_label_text_view)).setText(getString(R.string.maya_label_ads_inline_banner_native));
        C0447e c0447e5 = this.f13982B;
        j.d(c0447e5);
        final int i = 0;
        b.b((LinearLayout) ((C0441c) c0447e5.f4080d).c, new Function0(this) { // from class: Sb.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaNativeAdsInternalOnlyFragment f5713b;

            {
                this.f5713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MayaNativeAdsInternalOnlyFragment mayaNativeAdsInternalOnlyFragment = this.f5713b;
                switch (i) {
                    case 0:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity != null) {
                            mayaAdsInternalOnlyActivity.W1("runNativeBannerCarouselAds");
                            S5.c cVarM1 = mayaAdsInternalOnlyActivity.m1();
                            Bundle bundleD = androidx.media3.datasource.cache.c.d("adType", "runNativeBannerCarouselAds");
                            MayaAdsViewerFragment mayaAdsViewerFragment = new MayaAdsViewerFragment(cVarM1);
                            mayaAdsViewerFragment.setArguments(bundleD);
                            mayaAdsInternalOnlyActivity.V1(mayaAdsViewerFragment, "runNativeBannerCarouselAds");
                        }
                        break;
                    case 1:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity2 = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity2 != null) {
                            if (mayaAdsInternalOnlyActivity2.f13835r == null) {
                                s5.f fVar = s5.f.f20013a;
                                M m = new M(mayaAdsInternalOnlyActivity2);
                                F f = new F(18);
                                C1847a c1847a = (C1847a) m.f11371b;
                                c1847a.f17717d = f;
                                c1847a.e = new F(19);
                                c1847a.f = new Ag.j(mayaAdsInternalOnlyActivity2, 10);
                                mayaAdsInternalOnlyActivity2.f13835r = m;
                            }
                            M m2 = mayaAdsInternalOnlyActivity2.f13835r;
                            if (m2 != null) {
                                m2.j();
                            }
                        }
                        break;
                    case 2:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity3 = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity3 != null) {
                            mayaAdsInternalOnlyActivity3.W1("runNativeVerticalBannerCarouselAds");
                            S5.c cVarM12 = mayaAdsInternalOnlyActivity3.m1();
                            Bundle bundleD2 = androidx.media3.datasource.cache.c.d("adType", "runNativeVerticalBannerCarouselAds");
                            MayaAdsViewerFragment mayaAdsViewerFragment2 = new MayaAdsViewerFragment(cVarM12);
                            mayaAdsViewerFragment2.setArguments(bundleD2);
                            mayaAdsInternalOnlyActivity3.V1(mayaAdsViewerFragment2, "runNativeVerticalBannerCarouselAds");
                        }
                        break;
                    default:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity4 = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity4 != null) {
                            mayaAdsInternalOnlyActivity4.W1("runNativeInlineBannerAd");
                            S5.c cVarM13 = mayaAdsInternalOnlyActivity4.m1();
                            Bundle bundleD3 = androidx.media3.datasource.cache.c.d("adType", "runNativeInlineBannerAd");
                            MayaAdsViewerFragment mayaAdsViewerFragment3 = new MayaAdsViewerFragment(cVarM13);
                            mayaAdsViewerFragment3.setArguments(bundleD3);
                            mayaAdsInternalOnlyActivity4.V1(mayaAdsViewerFragment3, "runNativeInlineBannerAd");
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        C0447e c0447e6 = this.f13982B;
        j.d(c0447e6);
        final int i4 = 1;
        b.b((LinearLayout) ((C0441c) c0447e6.c).c, new Function0(this) { // from class: Sb.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaNativeAdsInternalOnlyFragment f5713b;

            {
                this.f5713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MayaNativeAdsInternalOnlyFragment mayaNativeAdsInternalOnlyFragment = this.f5713b;
                switch (i4) {
                    case 0:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity != null) {
                            mayaAdsInternalOnlyActivity.W1("runNativeBannerCarouselAds");
                            S5.c cVarM1 = mayaAdsInternalOnlyActivity.m1();
                            Bundle bundleD = androidx.media3.datasource.cache.c.d("adType", "runNativeBannerCarouselAds");
                            MayaAdsViewerFragment mayaAdsViewerFragment = new MayaAdsViewerFragment(cVarM1);
                            mayaAdsViewerFragment.setArguments(bundleD);
                            mayaAdsInternalOnlyActivity.V1(mayaAdsViewerFragment, "runNativeBannerCarouselAds");
                        }
                        break;
                    case 1:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity2 = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity2 != null) {
                            if (mayaAdsInternalOnlyActivity2.f13835r == null) {
                                s5.f fVar = s5.f.f20013a;
                                M m = new M(mayaAdsInternalOnlyActivity2);
                                F f = new F(18);
                                C1847a c1847a = (C1847a) m.f11371b;
                                c1847a.f17717d = f;
                                c1847a.e = new F(19);
                                c1847a.f = new Ag.j(mayaAdsInternalOnlyActivity2, 10);
                                mayaAdsInternalOnlyActivity2.f13835r = m;
                            }
                            M m2 = mayaAdsInternalOnlyActivity2.f13835r;
                            if (m2 != null) {
                                m2.j();
                            }
                        }
                        break;
                    case 2:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity3 = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity3 != null) {
                            mayaAdsInternalOnlyActivity3.W1("runNativeVerticalBannerCarouselAds");
                            S5.c cVarM12 = mayaAdsInternalOnlyActivity3.m1();
                            Bundle bundleD2 = androidx.media3.datasource.cache.c.d("adType", "runNativeVerticalBannerCarouselAds");
                            MayaAdsViewerFragment mayaAdsViewerFragment2 = new MayaAdsViewerFragment(cVarM12);
                            mayaAdsViewerFragment2.setArguments(bundleD2);
                            mayaAdsInternalOnlyActivity3.V1(mayaAdsViewerFragment2, "runNativeVerticalBannerCarouselAds");
                        }
                        break;
                    default:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity4 = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity4 != null) {
                            mayaAdsInternalOnlyActivity4.W1("runNativeInlineBannerAd");
                            S5.c cVarM13 = mayaAdsInternalOnlyActivity4.m1();
                            Bundle bundleD3 = androidx.media3.datasource.cache.c.d("adType", "runNativeInlineBannerAd");
                            MayaAdsViewerFragment mayaAdsViewerFragment3 = new MayaAdsViewerFragment(cVarM13);
                            mayaAdsViewerFragment3.setArguments(bundleD3);
                            mayaAdsInternalOnlyActivity4.V1(mayaAdsViewerFragment3, "runNativeInlineBannerAd");
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        C0447e c0447e7 = this.f13982B;
        j.d(c0447e7);
        final int i6 = 2;
        b.b((LinearLayout) ((C0441c) c0447e7.f).c, new Function0(this) { // from class: Sb.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaNativeAdsInternalOnlyFragment f5713b;

            {
                this.f5713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MayaNativeAdsInternalOnlyFragment mayaNativeAdsInternalOnlyFragment = this.f5713b;
                switch (i6) {
                    case 0:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity != null) {
                            mayaAdsInternalOnlyActivity.W1("runNativeBannerCarouselAds");
                            S5.c cVarM1 = mayaAdsInternalOnlyActivity.m1();
                            Bundle bundleD = androidx.media3.datasource.cache.c.d("adType", "runNativeBannerCarouselAds");
                            MayaAdsViewerFragment mayaAdsViewerFragment = new MayaAdsViewerFragment(cVarM1);
                            mayaAdsViewerFragment.setArguments(bundleD);
                            mayaAdsInternalOnlyActivity.V1(mayaAdsViewerFragment, "runNativeBannerCarouselAds");
                        }
                        break;
                    case 1:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity2 = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity2 != null) {
                            if (mayaAdsInternalOnlyActivity2.f13835r == null) {
                                s5.f fVar = s5.f.f20013a;
                                M m = new M(mayaAdsInternalOnlyActivity2);
                                F f = new F(18);
                                C1847a c1847a = (C1847a) m.f11371b;
                                c1847a.f17717d = f;
                                c1847a.e = new F(19);
                                c1847a.f = new Ag.j(mayaAdsInternalOnlyActivity2, 10);
                                mayaAdsInternalOnlyActivity2.f13835r = m;
                            }
                            M m2 = mayaAdsInternalOnlyActivity2.f13835r;
                            if (m2 != null) {
                                m2.j();
                            }
                        }
                        break;
                    case 2:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity3 = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity3 != null) {
                            mayaAdsInternalOnlyActivity3.W1("runNativeVerticalBannerCarouselAds");
                            S5.c cVarM12 = mayaAdsInternalOnlyActivity3.m1();
                            Bundle bundleD2 = androidx.media3.datasource.cache.c.d("adType", "runNativeVerticalBannerCarouselAds");
                            MayaAdsViewerFragment mayaAdsViewerFragment2 = new MayaAdsViewerFragment(cVarM12);
                            mayaAdsViewerFragment2.setArguments(bundleD2);
                            mayaAdsInternalOnlyActivity3.V1(mayaAdsViewerFragment2, "runNativeVerticalBannerCarouselAds");
                        }
                        break;
                    default:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity4 = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity4 != null) {
                            mayaAdsInternalOnlyActivity4.W1("runNativeInlineBannerAd");
                            S5.c cVarM13 = mayaAdsInternalOnlyActivity4.m1();
                            Bundle bundleD3 = androidx.media3.datasource.cache.c.d("adType", "runNativeInlineBannerAd");
                            MayaAdsViewerFragment mayaAdsViewerFragment3 = new MayaAdsViewerFragment(cVarM13);
                            mayaAdsViewerFragment3.setArguments(bundleD3);
                            mayaAdsInternalOnlyActivity4.V1(mayaAdsViewerFragment3, "runNativeInlineBannerAd");
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
        C0447e c0447e8 = this.f13982B;
        j.d(c0447e8);
        final int i10 = 3;
        b.b((LinearLayout) ((C0441c) c0447e8.e).c, new Function0(this) { // from class: Sb.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaNativeAdsInternalOnlyFragment f5713b;

            {
                this.f5713b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MayaNativeAdsInternalOnlyFragment mayaNativeAdsInternalOnlyFragment = this.f5713b;
                switch (i10) {
                    case 0:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity != null) {
                            mayaAdsInternalOnlyActivity.W1("runNativeBannerCarouselAds");
                            S5.c cVarM1 = mayaAdsInternalOnlyActivity.m1();
                            Bundle bundleD = androidx.media3.datasource.cache.c.d("adType", "runNativeBannerCarouselAds");
                            MayaAdsViewerFragment mayaAdsViewerFragment = new MayaAdsViewerFragment(cVarM1);
                            mayaAdsViewerFragment.setArguments(bundleD);
                            mayaAdsInternalOnlyActivity.V1(mayaAdsViewerFragment, "runNativeBannerCarouselAds");
                        }
                        break;
                    case 1:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity2 = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity2 != null) {
                            if (mayaAdsInternalOnlyActivity2.f13835r == null) {
                                s5.f fVar = s5.f.f20013a;
                                M m = new M(mayaAdsInternalOnlyActivity2);
                                F f = new F(18);
                                C1847a c1847a = (C1847a) m.f11371b;
                                c1847a.f17717d = f;
                                c1847a.e = new F(19);
                                c1847a.f = new Ag.j(mayaAdsInternalOnlyActivity2, 10);
                                mayaAdsInternalOnlyActivity2.f13835r = m;
                            }
                            M m2 = mayaAdsInternalOnlyActivity2.f13835r;
                            if (m2 != null) {
                                m2.j();
                            }
                        }
                        break;
                    case 2:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity3 = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity3 != null) {
                            mayaAdsInternalOnlyActivity3.W1("runNativeVerticalBannerCarouselAds");
                            S5.c cVarM12 = mayaAdsInternalOnlyActivity3.m1();
                            Bundle bundleD2 = androidx.media3.datasource.cache.c.d("adType", "runNativeVerticalBannerCarouselAds");
                            MayaAdsViewerFragment mayaAdsViewerFragment2 = new MayaAdsViewerFragment(cVarM12);
                            mayaAdsViewerFragment2.setArguments(bundleD2);
                            mayaAdsInternalOnlyActivity3.V1(mayaAdsViewerFragment2, "runNativeVerticalBannerCarouselAds");
                        }
                        break;
                    default:
                        MayaAdsInternalOnlyActivity mayaAdsInternalOnlyActivity4 = mayaNativeAdsInternalOnlyFragment.f13983K;
                        if (mayaAdsInternalOnlyActivity4 != null) {
                            mayaAdsInternalOnlyActivity4.W1("runNativeInlineBannerAd");
                            S5.c cVarM13 = mayaAdsInternalOnlyActivity4.m1();
                            Bundle bundleD3 = androidx.media3.datasource.cache.c.d("adType", "runNativeInlineBannerAd");
                            MayaAdsViewerFragment mayaAdsViewerFragment3 = new MayaAdsViewerFragment(cVarM13);
                            mayaAdsViewerFragment3.setArguments(bundleD3);
                            mayaAdsInternalOnlyActivity4.V1(mayaAdsViewerFragment3, "runNativeInlineBannerAd");
                        }
                        break;
                }
                return Unit.f18162a;
            }
        });
    }
}
