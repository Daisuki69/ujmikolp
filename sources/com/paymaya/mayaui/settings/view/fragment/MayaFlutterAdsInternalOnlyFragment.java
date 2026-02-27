package com.paymaya.mayaui.settings.view.fragment;

import B5.i;
import Mb.a;
import Na.d;
import S5.c;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.settings.view.activity.impl.MayaAdsInternalOnlyActivity;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.TransparencyMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.FlutterEngineGroup;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin;
import kotlin.jvm.internal.j;
import og.C1978b;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaFlutterAdsInternalOnlyFragment extends Fragment {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final i f13877B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C1220i f13878K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final c f13879P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public FlutterEngineGroup f13880Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public FlutterEngineCache f13881R;

    public MayaFlutterAdsInternalOnlyFragment(i iVar, c cVar, C1220i c1220i) {
        this.f13877B = iVar;
        this.f13878K = c1220i;
        this.f13879P = cVar;
    }

    public final void l1() {
        FlutterEngineCache flutterEngineCache = this.f13881R;
        if (flutterEngineCache != null ? flutterEngineCache.contains("engine_flutter_ads") : false) {
            FlutterEngineCache flutterEngineCache2 = this.f13881R;
            FlutterEngine flutterEngine = flutterEngineCache2 != null ? flutterEngineCache2.get("engine_flutter_ads") : null;
            if (flutterEngine != null) {
                try {
                    DartExecutor dartExecutor = flutterEngine.getDartExecutor();
                    j.f(dartExecutor, "getDartExecutor(...)");
                    new u(dartExecutor.getBinaryMessenger(), "packages/maya_ad_kit").b(new d(this, 12));
                } catch (Exception e) {
                    Log.e("AD_KIT_INTERNAL_ONLY", "Error initializing method channel with dartExecutor for engine: engine_flutter_ads", e);
                }
                try {
                    FlutterFragment flutterFragmentBuild = FlutterFragment.withCachedEngine("engine_flutter_ads").renderMode(RenderMode.texture).transparencyMode(TransparencyMode.transparent).shouldAttachEngineToActivity(true).build();
                    j.f(flutterFragmentBuild, "build(...)");
                    getChildFragmentManager().beginTransaction().replace(R.id.frame_layout_flutter_ads_container, flutterFragmentBuild).commitAllowingStateLoss();
                } catch (Exception e7) {
                    Log.e("AD_KIT_INTERNAL_ONLY", "Error creating FlutterFragment builder", e7);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        super.onAttach(context);
        boolean z4 = getActivity() instanceof MayaAdsInternalOnlyActivity;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_flutter_ads_internal_only, viewGroup, false);
        if (((FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_flutter_ads_container)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.frame_layout_flutter_ads_container)));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        j.f(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        FlutterEngineCache flutterEngineCache = this.f13881R;
        if (flutterEngineCache != null) {
            flutterEngineCache.remove("engine_flutter_ads");
        }
        this.f13881R = null;
        this.f13880Q = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            KeyEventDispatcher.Component activity = getActivity();
            j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.settings.view.activity.IMayaAdsInternalOnlyActivityView");
            FlutterEngineGroup flutterEngineGroup = ((MayaAdsInternalOnlyActivity) ((a) activity)).f13832o;
            if (flutterEngineGroup == null) {
                j.n("flutterEngineGroup");
                throw null;
            }
            this.f13880Q = flutterEngineGroup;
            FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
            this.f13881R = flutterEngineCache;
            if (flutterEngineCache != null ? flutterEngineCache.contains("engine_flutter_ads") : false) {
                l1();
                return;
            }
            DartExecutor.DartEntrypoint dartEntrypoint = new DartExecutor.DartEntrypoint(C1978b.a().f18847a.findAppBundlePath(), "runMayaAdKit");
            FlutterEngineGroup.Options options = new FlutterEngineGroup.Options(requireContext());
            options.setDartEntrypoint(dartEntrypoint);
            options.setInitialRoute("/internalAdScreen");
            FlutterEngineGroup flutterEngineGroup2 = this.f13880Q;
            j.d(flutterEngineGroup2);
            FlutterEngine flutterEngineCreateAndRunEngine = flutterEngineGroup2.createAndRunEngine(options);
            FlutterEngineCache flutterEngineCache2 = this.f13881R;
            if (flutterEngineCache2 != null) {
                flutterEngineCache2.put("engine_flutter_ads", flutterEngineCreateAndRunEngine);
            }
            Context contextRequireContext = requireContext();
            j.f(contextRequireContext, "requireContext(...)");
            GoogleMobileAdsPlugin.registerNativeAdFactory(flutterEngineCreateAndRunEngine, "nativeAdFactory", new C4.d(contextRequireContext));
            l1();
        } catch (Exception e) {
            Log.e("AD_KIT_INTERNAL_ONLY_ERROR", "Failed to create and run Flutter engine", e);
        }
    }
}
