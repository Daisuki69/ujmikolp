package io.flutter.plugins;

import B4.c;
import F0.a;
import Qe.f;
import Re.e;
import V4.g;
import W0.n;
import af.l;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import eg.C1441c;
import fg.C1484a;
import gg.C1521a;
import hg.C1567a;
import ig.C1602a;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.PluginRegistry;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin;
import io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import io.flutter.plugins.localauth.LocalAuthPlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import io.flutter.plugins.webviewflutter.WebViewFlutterPlugin;
import jg.C1681a;
import kg.C1773a;
import ng.C1949d;
import o4.ViewTreeObserverOnGlobalLayoutListenerC1961a;
import vg.C2349a;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(@NonNull FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add(new f());
        } catch (Exception e) {
            Log.e(TAG, "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", e);
        }
        try {
            flutterEngine.getPlugins().add(new C1441c());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e7);
        }
        try {
            flutterEngine.getPlugins().add(new c());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin credolab, com.maya.credolab.CredolabPlugin", e10);
        }
        try {
            flutterEngine.getPlugins().add(new C1484a());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e11);
        }
        try {
            flutterEngine.getPlugins().add(new n());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin fast_contacts, com.github.s0nerik.fast_contacts.FastContactsPlugin", e12);
        }
        try {
            flutterEngine.getPlugins().add(new g());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e13);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCorePlugin());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e14);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCrashlyticsPlugin());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e15);
        }
        try {
            flutterEngine.getPlugins().add(new C2349a());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin fk_user_agent, io.flutterfastkit.fk_user_agent.FkUserAgentPlugin", e16);
        }
        try {
            PluginRegistry plugins = flutterEngine.getPlugins();
            a aVar = new a();
            SparseArray sparseArray = J0.a.f2376a;
            L0.a aVar2 = new L0.a(0);
            SparseArray sparseArray2 = J0.a.f2376a;
            sparseArray2.append(aVar2.c(), aVar2);
            L0.a aVar3 = new L0.a(1);
            sparseArray2.append(aVar3.c(), aVar3);
            sparseArray2.append(2, new M0.a());
            L0.a aVar4 = new L0.a(3);
            sparseArray2.append(aVar4.c(), aVar4);
            plugins.add(aVar);
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin flutter_image_compress_common, com.fluttercandies.flutter_image_compress.ImageCompressPlugin", e17);
        }
        try {
            flutterEngine.getPlugins().add(new ViewTreeObserverOnGlobalLayoutListenerC1961a());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin flutter_keyboard_visibility, com.jrai.flutter_keyboard_visibility.FlutterKeyboardVisibilityPlugin", e18);
        }
        try {
            flutterEngine.getPlugins().add(new C1949d());
        } catch (Exception e19) {
            Log.e(TAG, "Error registering plugin flutter_pdfview, io.endigo.plugins.pdfviewflutter.PDFViewFlutterPlugin", e19);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterAndroidLifecyclePlugin());
        } catch (Exception e20) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e20);
        }
        try {
            flutterEngine.getPlugins().add(new GoogleMobileAdsPlugin());
        } catch (Exception e21) {
            Log.e(TAG, "Error registering plugin google_mobile_ads, io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin", e21);
        }
        try {
            flutterEngine.getPlugins().add(new C1773a());
        } catch (Exception e22) {
            Log.e(TAG, "Error registering plugin http_certificate_pinning, diefferson.http_certificate_pinning.HttpCertificatePinningPlugin", e22);
        }
        try {
            flutterEngine.getPlugins().add(new E0.a());
        } catch (Exception e23) {
            Log.e(TAG, "Error registering plugin image_gallery_saver, com.example.imagegallerysaver.ImageGallerySaverPlugin", e23);
        }
        try {
            flutterEngine.getPlugins().add(new D0.a());
        } catch (Exception e24) {
            Log.e(TAG, "Error registering plugin image_gallery_saver_plus, com.example.image_gallery_saver_plus.ImageGallerySaverPlusPlugin", e24);
        }
        try {
            flutterEngine.getPlugins().add(new ImagePickerPlugin());
        } catch (Exception e25) {
            Log.e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e25);
        }
        try {
            flutterEngine.getPlugins().add(new C1681a());
        } catch (Exception e26) {
            Log.e(TAG, "Error registering plugin isar_community_flutter_libs, dev.isar.isar_flutter_libs.IsarFlutterLibsPlugin", e26);
        }
        try {
            flutterEngine.getPlugins().add(new e());
        } catch (Exception e27) {
            Log.e(TAG, "Error registering plugin just_audio, com.ryanheise.just_audio.JustAudioPlugin", e27);
        }
        try {
            flutterEngine.getPlugins().add(new LocalAuthPlugin());
        } catch (Exception e28) {
            Log.e(TAG, "Error registering plugin local_auth_android, io.flutter.plugins.localauth.LocalAuthPlugin", e28);
        }
        try {
            flutterEngine.getPlugins().add(new C4.c());
        } catch (Exception e29) {
            Log.e(TAG, "Error registering plugin maya_ad_kit, com.maya.maya_ad_kit.MayaAdKitPlugin", e29);
        }
        try {
            flutterEngine.getPlugins().add(new S4.a());
        } catch (Exception e30) {
            Log.e(TAG, "Error registering plugin maya_mobile_permissions, com.maya.sdk.permission.maya_mobile_permissions.MayaMobilePermissionsPlugin", e30);
        }
        try {
            flutterEngine.getPlugins().add(new C1521a());
        } catch (Exception e31) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e31);
        }
        try {
            flutterEngine.getPlugins().add(new Ye.a());
        } catch (Exception e32) {
            Log.e(TAG, "Error registering plugin password_protected_pdf_checker, com.tarique.password_protected_pdf_checker.PasswordProtectedPdfCheckerPlugin", e32);
        }
        try {
            flutterEngine.getPlugins().add(new PathProviderPlugin());
        } catch (Exception e33) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e33);
        }
        try {
            flutterEngine.getPlugins().add(new C1567a());
        } catch (Exception e34) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e34);
        }
        try {
            flutterEngine.getPlugins().add(new SharedPreferencesPlugin());
        } catch (Exception e35) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e35);
        }
        try {
            flutterEngine.getPlugins().add(new T4.a());
        } catch (Exception e36) {
            Log.e(TAG, "Error registering plugin snap_safe, com.maya.snap_safe.SnapSafePlugin", e36);
        }
        try {
            flutterEngine.getPlugins().add(new U4.c());
        } catch (Exception e37) {
            Log.e(TAG, "Error registering plugin spki_pinner, com.maya.spki_pinner.SpkiPinnerPlugin", e37);
        }
        try {
            flutterEngine.getPlugins().add(new l());
        } catch (Exception e38) {
            Log.e(TAG, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin", e38);
        }
        try {
            flutterEngine.getPlugins().add(new UrlLauncherPlugin());
        } catch (Exception e39) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e39);
        }
        try {
            flutterEngine.getPlugins().add(new VideoPlayerPlugin());
        } catch (Exception e40) {
            Log.e(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e40);
        }
        try {
            flutterEngine.getPlugins().add(new C1602a());
        } catch (Exception e41) {
            Log.e(TAG, "Error registering plugin wakelock_plus, dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin", e41);
        }
        try {
            flutterEngine.getPlugins().add(new WebViewFlutterPlugin());
        } catch (Exception e42) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e42);
        }
    }
}
