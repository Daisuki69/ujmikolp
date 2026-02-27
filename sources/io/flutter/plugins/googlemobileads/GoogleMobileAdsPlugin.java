package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.firebase.messaging.p;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.plugins.googlemobileads.FlutterAdSize;
import io.flutter.plugins.googlemobileads.FlutterNativeAd;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateStyle;
import io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import pg.E;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public class GoogleMobileAdsPlugin implements FlutterPlugin, ActivityAware, s {
    private static final String TAG = "GoogleMobileAdsPlugin";

    @Nullable
    private AdMessageCodec adMessageCodec;

    @Nullable
    private AppStateNotifier appStateNotifier;
    private final FlutterMobileAdsWrapper flutterMobileAds;

    @Nullable
    private AdInstanceManager instanceManager;

    @Nullable
    private MediationNetworkExtrasProvider mediationNetworkExtrasProvider;
    private final Map<String, NativeAdFactory> nativeAdFactories;

    @Nullable
    private FlutterPlugin.FlutterPluginBinding pluginBinding;

    @Nullable
    private UserMessagingPlatformManager userMessagingPlatformManager;

    public static final class FlutterInitializationListener implements OnInitializationCompleteListener {
        private boolean isInitializationCompleted;
        private final t result;

        public /* synthetic */ FlutterInitializationListener(t tVar, int i) {
            this(tVar);
        }

        @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
        public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {
            if (this.isInitializationCompleted) {
                return;
            }
            try {
                Method declaredMethod = MobileAds.class.getDeclaredMethod("setPlugin", String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, Constants.REQUEST_AGENT_PREFIX_VERSIONED);
            } catch (Exception unused) {
            }
            this.result.success(new FlutterInitializationStatus(initializationStatus));
            this.isInitializationCompleted = true;
        }

        private FlutterInitializationListener(@NonNull t tVar) {
            this.result = tVar;
            this.isInitializationCompleted = false;
        }
    }

    public interface NativeAdFactory {
        NativeAdView createNativeAd(NativeAd nativeAd, Map<String, Object> map);
    }

    public GoogleMobileAdsPlugin() {
        this.nativeAdFactories = new HashMap();
        this.flutterMobileAds = new FlutterMobileAdsWrapper();
    }

    private boolean addNativeAdFactory(String str, NativeAdFactory nativeAdFactory) {
        if (!this.nativeAdFactories.containsKey(str)) {
            this.nativeAdFactories.put(str, nativeAdFactory);
            return true;
        }
        Log.e(TAG, "A NativeAdFactory with the following factoryId already exists: " + str);
        return false;
    }

    @Deprecated
    public static boolean registerMediationNetworkExtrasProvider(FlutterEngine flutterEngine, MediationNetworkExtrasProvider mediationNetworkExtrasProvider) {
        GoogleMobileAdsPlugin googleMobileAdsPlugin = (GoogleMobileAdsPlugin) flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class);
        if (googleMobileAdsPlugin == null) {
            return false;
        }
        googleMobileAdsPlugin.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider;
        AdMessageCodec adMessageCodec = googleMobileAdsPlugin.adMessageCodec;
        if (adMessageCodec == null) {
            return true;
        }
        adMessageCodec.setMediationNetworkExtrasProvider(mediationNetworkExtrasProvider);
        return true;
    }

    public static boolean registerNativeAdFactory(FlutterEngine flutterEngine, String str, NativeAdFactory nativeAdFactory) {
        return registerNativeAdFactory((GoogleMobileAdsPlugin) flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class), str, nativeAdFactory);
    }

    private NativeAdFactory removeNativeAdFactory(String str) {
        return this.nativeAdFactories.remove(str);
    }

    private static <T> T requireNonNull(T t5) {
        if (t5 != null) {
            return t5;
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public static void unregisterMediationNetworkExtrasProvider(FlutterEngine flutterEngine) {
        GoogleMobileAdsPlugin googleMobileAdsPlugin = (GoogleMobileAdsPlugin) flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class);
        if (googleMobileAdsPlugin == null) {
            return;
        }
        AdMessageCodec adMessageCodec = googleMobileAdsPlugin.adMessageCodec;
        if (adMessageCodec != null) {
            adMessageCodec.setMediationNetworkExtrasProvider(null);
        }
        googleMobileAdsPlugin.mediationNetworkExtrasProvider = null;
    }

    @Nullable
    public static NativeAdFactory unregisterNativeAdFactory(FlutterEngine flutterEngine, String str) {
        FlutterPlugin flutterPlugin = flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class);
        if (flutterPlugin != null) {
            return ((GoogleMobileAdsPlugin) flutterPlugin).removeNativeAdFactory(str);
        }
        return null;
    }

    @VisibleForTesting
    public BannerAdCreator getBannerAdCreator(@NonNull Context context) {
        return new BannerAdCreator(context);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity(activityPluginBinding.getActivity());
        }
        AdMessageCodec adMessageCodec = this.adMessageCodec;
        if (adMessageCodec != null) {
            adMessageCodec.setContext(activityPluginBinding.getActivity());
        }
        UserMessagingPlatformManager userMessagingPlatformManager = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager != null) {
            userMessagingPlatformManager.setActivity(activityPluginBinding.getActivity());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = flutterPluginBinding;
        AdMessageCodec adMessageCodec = new AdMessageCodec(flutterPluginBinding.getApplicationContext(), new FlutterRequestAgentProvider(flutterPluginBinding.getApplicationContext()));
        this.adMessageCodec = adMessageCodec;
        MediationNetworkExtrasProvider mediationNetworkExtrasProvider = this.mediationNetworkExtrasProvider;
        if (mediationNetworkExtrasProvider != null) {
            adMessageCodec.setMediationNetworkExtrasProvider(mediationNetworkExtrasProvider);
        }
        u uVar = new u(flutterPluginBinding.getBinaryMessenger(), "plugins.flutter.io/google_mobile_ads", new E(this.adMessageCodec), null);
        uVar.b(this);
        this.instanceManager = new AdInstanceManager(uVar);
        ((p) flutterPluginBinding.getPlatformViewRegistry()).x("plugins.flutter.io/google_mobile_ads/ad_widget", new GoogleMobileAdsViewFactory(this.instanceManager));
        this.appStateNotifier = new AppStateNotifier(flutterPluginBinding.getBinaryMessenger());
        this.userMessagingPlatformManager = new UserMessagingPlatformManager(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding;
        AdMessageCodec adMessageCodec = this.adMessageCodec;
        if (adMessageCodec != null && (flutterPluginBinding = this.pluginBinding) != null) {
            adMessageCodec.setContext(flutterPluginBinding.getApplicationContext());
        }
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity(null);
        }
        UserMessagingPlatformManager userMessagingPlatformManager = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager != null) {
            userMessagingPlatformManager.setActivity(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding;
        AdMessageCodec adMessageCodec = this.adMessageCodec;
        if (adMessageCodec != null && (flutterPluginBinding = this.pluginBinding) != null) {
            adMessageCodec.setContext(flutterPluginBinding.getApplicationContext());
        }
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity(null);
        }
        UserMessagingPlatformManager userMessagingPlatformManager = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager != null) {
            userMessagingPlatformManager.setActivity(null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AppStateNotifier appStateNotifier = this.appStateNotifier;
        if (appStateNotifier != null) {
            appStateNotifier.stop();
            this.appStateNotifier = null;
        }
    }

    @Override // pg.s
    public void onMethodCall(@NonNull r rVar, @NonNull final t tVar) {
        Context activity;
        FlutterRewardedAd flutterRewardedAd;
        FlutterRewardedInterstitialAd flutterRewardedInterstitialAd;
        int i = 0;
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager == null || this.pluginBinding == null) {
            Log.e(TAG, "method call received before instanceManager initialized: " + rVar.f19112a);
            return;
        }
        activity = adInstanceManager.getActivity() != null ? this.instanceManager.getActivity() : this.pluginBinding.getApplicationContext();
        String str = rVar.f19112a;
        str.getClass();
        switch (str) {
            case "MobileAds#openDebugMenu":
                this.flutterMobileAds.openDebugMenu(activity, (String) rVar.a("adUnitId"));
                tVar.success(null);
                break;
            case "loadInterstitialAd":
                FlutterInterstitialAd flutterInterstitialAd = new FlutterInterstitialAd(((Integer) rVar.a("adId")).intValue(), this.instanceManager, (String) rVar.a("adUnitId"), (FlutterAdRequest) rVar.a("request"), new FlutterAdLoader(activity));
                this.instanceManager.trackAd(flutterInterstitialAd, ((Integer) rVar.a("adId")).intValue());
                flutterInterstitialAd.load();
                tVar.success(null);
                break;
            case "MobileAds#setAppMuted":
                this.flutterMobileAds.setAppMuted(((Boolean) rVar.a("muted")).booleanValue());
                tVar.success(null);
                break;
            case "loadAppOpenAd":
                FlutterAppOpenAd flutterAppOpenAd = new FlutterAppOpenAd(((Integer) rVar.a("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), (String) requireNonNull((String) rVar.a("adUnitId")), (FlutterAdRequest) rVar.a("request"), (FlutterAdManagerAdRequest) rVar.a("adManagerRequest"), new FlutterAdLoader(activity));
                this.instanceManager.trackAd(flutterAppOpenAd, ((Integer) rVar.a("adId")).intValue());
                flutterAppOpenAd.load();
                tVar.success(null);
                break;
            case "MobileAds#registerWebView":
                this.flutterMobileAds.registerWebView(((Integer) rVar.a("webViewId")).intValue(), this.pluginBinding.getFlutterEngine());
                tVar.success(null);
                break;
            case "loadRewardedAd":
                String str2 = (String) requireNonNull((String) rVar.a("adUnitId"));
                FlutterAdRequest flutterAdRequest = (FlutterAdRequest) rVar.a("request");
                FlutterAdManagerAdRequest flutterAdManagerAdRequest = (FlutterAdManagerAdRequest) rVar.a("adManagerRequest");
                if (flutterAdRequest == null) {
                    if (flutterAdManagerAdRequest == null) {
                        tVar.error("InvalidRequest", "A null or invalid ad request was provided.", null);
                    } else {
                        flutterRewardedAd = new FlutterRewardedAd(((Integer) rVar.a("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str2, flutterAdManagerAdRequest, new FlutterAdLoader(activity));
                    }
                    break;
                } else {
                    flutterRewardedAd = new FlutterRewardedAd(((Integer) rVar.a("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str2, flutterAdRequest, new FlutterAdLoader(activity));
                }
                this.instanceManager.trackAd(flutterRewardedAd, ((Integer) requireNonNull((Integer) rVar.a("adId"))).intValue());
                flutterRewardedAd.load();
                tVar.success(null);
                break;
            case "MobileAds#getRequestConfiguration":
                tVar.success(this.flutterMobileAds.getRequestConfiguration());
                break;
            case "loadFluidAd":
                FluidAdManagerBannerAd fluidAdManagerBannerAd = new FluidAdManagerBannerAd(((Integer) rVar.a("adId")).intValue(), this.instanceManager, (String) rVar.a("adUnitId"), (FlutterAdManagerAdRequest) rVar.a("request"), getBannerAdCreator(activity));
                this.instanceManager.trackAd(fluidAdManagerBannerAd, ((Integer) rVar.a("adId")).intValue());
                fluidAdManagerBannerAd.load();
                tVar.success(null);
                break;
            case "loadNativeAd":
                String str3 = (String) rVar.a("factoryId");
                NativeAdFactory nativeAdFactory = this.nativeAdFactories.get(str3);
                FlutterNativeTemplateStyle flutterNativeTemplateStyle = (FlutterNativeTemplateStyle) rVar.a("nativeTemplateStyle");
                if (nativeAdFactory != null || flutterNativeTemplateStyle != null) {
                    FlutterNativeAd flutterNativeAdBuild = new FlutterNativeAd.Builder(activity).setManager(this.instanceManager).setAdUnitId((String) rVar.a("adUnitId")).setAdFactory(nativeAdFactory).setRequest((FlutterAdRequest) rVar.a("request")).setAdManagerRequest((FlutterAdManagerAdRequest) rVar.a("adManagerRequest")).setCustomOptions((Map) rVar.a("customOptions")).setId(((Integer) rVar.a("adId")).intValue()).setNativeAdOptions((FlutterNativeAdOptions) rVar.a("nativeAdOptions")).setFlutterAdLoader(new FlutterAdLoader(activity)).setNativeTemplateStyle((FlutterNativeTemplateStyle) rVar.a("nativeTemplateStyle")).build();
                    this.instanceManager.trackAd(flutterNativeAdBuild, ((Integer) rVar.a("adId")).intValue());
                    flutterNativeAdBuild.load();
                    tVar.success(null);
                    break;
                } else {
                    tVar.error("NativeAdError", We.s.j("No NativeAdFactory with id: ", str3, " or nativeTemplateStyle"), null);
                    break;
                }
                break;
            case "setServerSideVerificationOptions":
                FlutterAd flutterAdAdForId = this.instanceManager.adForId(((Integer) rVar.a("adId")).intValue());
                FlutterServerSideVerificationOptions flutterServerSideVerificationOptions = (FlutterServerSideVerificationOptions) rVar.a("serverSideVerificationOptions");
                if (flutterAdAdForId == null) {
                    Log.w(TAG, "Error - null ad in setServerSideVerificationOptions");
                } else if (flutterAdAdForId instanceof FlutterRewardedAd) {
                    ((FlutterRewardedAd) flutterAdAdForId).setServerSideVerificationOptions(flutterServerSideVerificationOptions);
                } else if (flutterAdAdForId instanceof FlutterRewardedInterstitialAd) {
                    ((FlutterRewardedInterstitialAd) flutterAdAdForId).setServerSideVerificationOptions(flutterServerSideVerificationOptions);
                } else {
                    Log.w(TAG, "Error - setServerSideVerificationOptions called on non-rewarded ad");
                }
                tVar.success(null);
                break;
            case "AdSize#getAnchoredAdaptiveBannerAdSize":
                FlutterAdSize.AnchoredAdaptiveBannerAdSize anchoredAdaptiveBannerAdSize = new FlutterAdSize.AnchoredAdaptiveBannerAdSize(activity, new FlutterAdSize.AdSizeFactory(), (String) rVar.a("orientation"), ((Integer) rVar.a("width")).intValue());
                if (AdSize.INVALID.equals(anchoredAdaptiveBannerAdSize.size)) {
                    tVar.success(null);
                    break;
                } else {
                    tVar.success(Integer.valueOf(anchoredAdaptiveBannerAdSize.height));
                    break;
                }
                break;
            case "loadAdManagerInterstitialAd":
                FlutterAdManagerInterstitialAd flutterAdManagerInterstitialAd = new FlutterAdManagerInterstitialAd(((Integer) rVar.a("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), (String) requireNonNull((String) rVar.a("adUnitId")), (FlutterAdManagerAdRequest) rVar.a("request"), new FlutterAdLoader(activity));
                this.instanceManager.trackAd(flutterAdManagerInterstitialAd, ((Integer) requireNonNull((Integer) rVar.a("adId"))).intValue());
                flutterAdManagerInterstitialAd.load();
                tVar.success(null);
                break;
            case "loadBannerAd":
                FlutterBannerAd flutterBannerAd = new FlutterBannerAd(((Integer) rVar.a("adId")).intValue(), this.instanceManager, (String) rVar.a("adUnitId"), (FlutterAdRequest) rVar.a("request"), (FlutterAdSize) rVar.a("size"), getBannerAdCreator(activity));
                this.instanceManager.trackAd(flutterBannerAd, ((Integer) rVar.a("adId")).intValue());
                flutterBannerAd.load();
                tVar.success(null);
                break;
            case "MobileAds#setAppVolume":
                this.flutterMobileAds.setAppVolume(((Double) rVar.a(MediaRouteProviderProtocol.CLIENT_DATA_VOLUME)).doubleValue());
                tVar.success(null);
                break;
            case "MobileAds#getVersionString":
                tVar.success(this.flutterMobileAds.getVersionString());
                break;
            case "loadAdManagerBannerAd":
                FlutterAdManagerBannerAd flutterAdManagerBannerAd = new FlutterAdManagerBannerAd(((Integer) rVar.a("adId")).intValue(), this.instanceManager, (String) rVar.a("adUnitId"), (List) rVar.a("sizes"), (FlutterAdManagerAdRequest) rVar.a("request"), getBannerAdCreator(activity));
                this.instanceManager.trackAd(flutterAdManagerBannerAd, ((Integer) rVar.a("adId")).intValue());
                flutterAdManagerBannerAd.load();
                tVar.success(null);
                break;
            case "_init":
                this.instanceManager.disposeAllAds();
                tVar.success(null);
                break;
            case "disposeAd":
                this.instanceManager.disposeAd(((Integer) rVar.a("adId")).intValue());
                tVar.success(null);
                break;
            case "getAdSize":
                FlutterAd flutterAdAdForId2 = this.instanceManager.adForId(((Integer) rVar.a("adId")).intValue());
                if (flutterAdAdForId2 == null) {
                    tVar.success(null);
                    break;
                } else {
                    if (flutterAdAdForId2 instanceof FlutterBannerAd) {
                        tVar.success(((FlutterBannerAd) flutterAdAdForId2).getAdSize());
                    } else if (!(flutterAdAdForId2 instanceof FlutterAdManagerBannerAd)) {
                        tVar.error("unexpected_ad_type", "Unexpected ad type for getAdSize: " + flutterAdAdForId2, null);
                    } else {
                        tVar.success(((FlutterAdManagerBannerAd) flutterAdAdForId2).getAdSize());
                    }
                    break;
                }
                break;
            case "MobileAds#updateRequestConfiguration":
                RequestConfiguration.Builder builder = MobileAds.getRequestConfiguration().toBuilder();
                String str4 = (String) rVar.a("maxAdContentRating");
                Integer num = (Integer) rVar.a("tagForChildDirectedTreatment");
                Integer num2 = (Integer) rVar.a("tagForUnderAgeOfConsent");
                List<String> list = (List) rVar.a("testDeviceIds");
                if (str4 != null) {
                    builder.setMaxAdContentRating(str4);
                }
                if (num != null) {
                    builder.setTagForChildDirectedTreatment(num.intValue());
                }
                if (num2 != null) {
                    builder.setTagForUnderAgeOfConsent(num2.intValue());
                }
                if (list != null) {
                    builder.setTestDeviceIds(list);
                }
                MobileAds.setRequestConfiguration(builder.build());
                tVar.success(null);
                break;
            case "MobileAds#disableMediationInitialization":
                this.flutterMobileAds.disableMediationInitialization(activity);
                tVar.success(null);
                break;
            case "MobileAds#openAdInspector":
                this.flutterMobileAds.openAdInspector(activity, new OnAdInspectorClosedListener() { // from class: io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin.1
                    @Override // com.google.android.gms.ads.OnAdInspectorClosedListener
                    public void onAdInspectorClosed(@Nullable AdInspectorError adInspectorError) {
                        if (adInspectorError == null) {
                            tVar.success(null);
                        } else {
                            tVar.error(Integer.toString(adInspectorError.getCode()), adInspectorError.getMessage(), adInspectorError.getDomain());
                        }
                    }
                });
                break;
            case "showAdWithoutView":
                if (this.instanceManager.showAdWithId(((Integer) rVar.a("adId")).intValue())) {
                    tVar.success(null);
                    break;
                } else {
                    tVar.error("AdShowError", "Ad failed to show.", null);
                    break;
                }
                break;
            case "MobileAds#initialize":
                this.flutterMobileAds.initialize(activity, new FlutterInitializationListener(tVar, i));
                break;
            case "setImmersiveMode":
                ((FlutterAd.FlutterOverlayAd) this.instanceManager.adForId(((Integer) rVar.a("adId")).intValue())).setImmersiveMode(((Boolean) rVar.a("immersiveModeEnabled")).booleanValue());
                tVar.success(null);
                break;
            case "loadRewardedInterstitialAd":
                String str5 = (String) requireNonNull((String) rVar.a("adUnitId"));
                FlutterAdRequest flutterAdRequest2 = (FlutterAdRequest) rVar.a("request");
                FlutterAdManagerAdRequest flutterAdManagerAdRequest2 = (FlutterAdManagerAdRequest) rVar.a("adManagerRequest");
                if (flutterAdRequest2 == null) {
                    if (flutterAdManagerAdRequest2 == null) {
                        tVar.error("InvalidRequest", "A null or invalid ad request was provided.", null);
                    } else {
                        flutterRewardedInterstitialAd = new FlutterRewardedInterstitialAd(((Integer) rVar.a("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str5, flutterAdManagerAdRequest2, new FlutterAdLoader(activity));
                    }
                    break;
                } else {
                    flutterRewardedInterstitialAd = new FlutterRewardedInterstitialAd(((Integer) rVar.a("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str5, flutterAdRequest2, new FlutterAdLoader(activity));
                }
                this.instanceManager.trackAd(flutterRewardedInterstitialAd, ((Integer) requireNonNull((Integer) rVar.a("adId"))).intValue());
                flutterRewardedInterstitialAd.load();
                tVar.success(null);
                break;
            default:
                tVar.notImplemented();
                break;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity(activityPluginBinding.getActivity());
        }
        AdMessageCodec adMessageCodec = this.adMessageCodec;
        if (adMessageCodec != null) {
            adMessageCodec.setContext(activityPluginBinding.getActivity());
        }
        UserMessagingPlatformManager userMessagingPlatformManager = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager != null) {
            userMessagingPlatformManager.setActivity(activityPluginBinding.getActivity());
        }
    }

    private static boolean registerNativeAdFactory(GoogleMobileAdsPlugin googleMobileAdsPlugin, String str, NativeAdFactory nativeAdFactory) {
        if (googleMobileAdsPlugin != null) {
            return googleMobileAdsPlugin.addNativeAdFactory(str, nativeAdFactory);
        }
        throw new IllegalStateException("Could not find a GoogleMobileAdsPlugin instance. The plugin may have not been registered.");
    }

    @VisibleForTesting
    public GoogleMobileAdsPlugin(@Nullable FlutterPlugin.FlutterPluginBinding flutterPluginBinding, @Nullable AdInstanceManager adInstanceManager, @NonNull FlutterMobileAdsWrapper flutterMobileAdsWrapper) {
        this.nativeAdFactories = new HashMap();
        this.pluginBinding = flutterPluginBinding;
        this.instanceManager = adInstanceManager;
        this.flutterMobileAds = flutterMobileAdsWrapper;
    }

    @VisibleForTesting
    public GoogleMobileAdsPlugin(@NonNull AppStateNotifier appStateNotifier) {
        this.nativeAdFactories = new HashMap();
        this.appStateNotifier = appStateNotifier;
        this.flutterMobileAds = new FlutterMobileAdsWrapper();
    }
}
