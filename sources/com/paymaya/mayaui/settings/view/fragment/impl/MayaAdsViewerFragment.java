package com.paymaya.mayaui.settings.view.fragment.impl;

import Bj.C0165x;
import N5.G0;
import Rg.g;
import S5.c;
import Sb.i;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBindings;
import b5.p;
import com.google.android.gms.ads.nativead.NativeAd;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.adkit.presentation.inlinebannerad.view.InlineBannerAd;
import com.paymaya.adkit.presentation.verticalbannerad.view.VerticalBannerAd;
import f5.f;
import k5.C1766b;
import kotlin.jvm.internal.j;
import l5.k;
import o5.C1962a;
import r5.m;
import s5.d;
import s5.e;
import yk.a;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaAdsViewerFragment extends Fragment {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final c f13926B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public InlineBannerAd f13927K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public BannerAdCarousel f13928P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public VerticalBannerAd f13929Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public String f13930R;

    public MayaAdsViewerFragment(c cVar) {
        this.f13926B = cVar;
    }

    public final void l1() {
        BannerAdCarousel bannerAdCarousel = this.f13928P;
        if (bannerAdCarousel != null) {
            f fVar = new f(bannerAdCarousel);
            fVar.f16717b = d.h;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            j.f(fragmentActivityRequireActivity, "requireActivity(...)");
            fVar.f16718d = fragmentActivityRequireActivity;
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            j.f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            fVar.c = viewLifecycleOwner;
            fVar.e = this;
            fVar.j = new g(2);
            fVar.f16720k = new g(3);
            fVar.f16721l = new C0165x(29);
            fVar.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13930R = arguments.getString("adType");
        }
        String str = this.f13930R;
        if (j.b(str, "runNativeVerticalBannerCarouselAds")) {
            View viewInflate = inflater.inflate(R.layout.fragment_maya_ads_native_vertical_banner, viewGroup, false);
            VerticalBannerAd verticalBannerAd = (VerticalBannerAd) ViewBindings.findChildViewById(viewInflate, R.id.pms_internal_vertical_banner_ad_carousel);
            if (verticalBannerAd == null) {
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.pms_internal_vertical_banner_ad_carousel)));
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            this.f13929Q = verticalBannerAd;
            j.d(constraintLayout);
            return constraintLayout;
        }
        if (j.b(str, "runNativeInlineBannerAd")) {
            View viewInflate2 = inflater.inflate(R.layout.fragment_maya_ads_native_inline_banner, viewGroup, false);
            InlineBannerAd inlineBannerAd = (InlineBannerAd) ViewBindings.findChildViewById(viewInflate2, R.id.pms_internal_inline_banner_ad);
            if (inlineBannerAd == null) {
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(R.id.pms_internal_inline_banner_ad)));
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate2;
            this.f13927K = inlineBannerAd;
            j.d(constraintLayout2);
            return constraintLayout2;
        }
        View viewInflate3 = inflater.inflate(R.layout.fragment_maya_ads_native_banner_carousel, viewGroup, false);
        BannerAdCarousel bannerAdCarousel = (BannerAdCarousel) ViewBindings.findChildViewById(viewInflate3, R.id.pms_internal_banner_ad_carousel);
        if (bannerAdCarousel == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(R.id.pms_internal_banner_ad_carousel)));
        }
        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate3;
        new G0(constraintLayout3, bannerAdCarousel);
        this.f13928P = bannerAdCarousel;
        j.d(constraintLayout3);
        return constraintLayout3;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        BannerAdCarousel bannerAdCarousel = this.f13928P;
        if (bannerAdCarousel != null) {
            bannerAdCarousel.c();
            a.a();
            this.f13928P = null;
        }
        VerticalBannerAd verticalBannerAd = this.f13929Q;
        if (verticalBannerAd != null) {
            if (verticalBannerAd.c != null) {
                verticalBannerAd.f10226b.setAdapter(null);
                m mVar = verticalBannerAd.c;
                if (mVar == null) {
                    j.n("viewModel");
                    throw null;
                }
                mVar.b();
            }
            this.f13929Q = null;
        }
        InlineBannerAd inlineBannerAd = this.f13927K;
        if (inlineBannerAd != null) {
            k kVar = inlineBannerAd.f10223b;
            if (kVar != null) {
                NativeAd nativeAd = kVar.f;
                if (nativeAd != null) {
                    nativeAd.destroy();
                }
                kVar.f = null;
            }
            this.f13927K = null;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        p pVar;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        String str = this.f13930R;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -163184852) {
                if (iHashCode != 780765698) {
                    if (iHashCode == 1165339978 && str.equals("runNativeInlineBannerAd")) {
                        InlineBannerAd inlineBannerAd = this.f13927K;
                        if (inlineBannerAd != null) {
                            e eVar = e.f20011a;
                            C1766b c1766b = new C1766b();
                            c1766b.i = inlineBannerAd;
                            FragmentActivity fragmentActivityRequireActivity = requireActivity();
                            j.g(fragmentActivityRequireActivity, "<set-?>");
                            c1766b.f17715a = fragmentActivityRequireActivity;
                            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                            j.g(viewLifecycleOwner, "<set-?>");
                            c1766b.f17716b = viewLifecycleOwner;
                            c1766b.c = this;
                            c1766b.j = eVar;
                            c1766b.f17717d = new g(6);
                            c1766b.e = new g(7);
                            c1766b.f = new i(1);
                            c1766b.d();
                            return;
                        }
                        return;
                    }
                } else if (str.equals("runNativeBannerCarouselAds")) {
                    l1();
                    return;
                }
            } else if (str.equals("runNativeVerticalBannerCarouselAds")) {
                VerticalBannerAd verticalBannerAd = this.f13929Q;
                if (verticalBannerAd != null) {
                    try {
                        pVar = (p) new com.google.gson.j().e(this.f13926B.d(A5.f.h), p.class);
                    } catch (Exception e) {
                        Log.e("ConfigParser", "Failed to parse VerticalBannerHeaderConfig", e);
                        pVar = null;
                    }
                    if (pVar == null) {
                        pVar = new p();
                    }
                    s5.m mVar = s5.m.f20027a;
                    C1962a c1962a = new C1962a();
                    c1962a.i = verticalBannerAd;
                    FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
                    j.g(fragmentActivityRequireActivity2, "<set-?>");
                    c1962a.f17715a = fragmentActivityRequireActivity2;
                    LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
                    j.g(viewLifecycleOwner2, "<set-?>");
                    c1962a.f17716b = viewLifecycleOwner2;
                    c1962a.c = this;
                    c1962a.j = mVar;
                    c1962a.f18773k = pVar;
                    c1962a.f17717d = new g(4);
                    c1962a.e = new g(5);
                    c1962a.f = new i(0);
                    c1962a.d();
                    return;
                }
                return;
            }
        }
        l1();
    }
}
