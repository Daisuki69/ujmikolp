package gg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.media3.common.C;
import cj.C1129o;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: renamed from: gg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1521a implements s, FlutterPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f16842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f16843b;

    public static String b(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] bArrDigest = messageDigest.digest();
        j.d(bArrDigest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArrDigest.length * 2];
        int length = bArrDigest.length;
        for (int i = 0; i < length; i++) {
            byte b8 = bArrDigest[i];
            int i4 = i * 2;
            cArr2[i4] = cArr[(b8 & 255) >>> 4];
            cArr2[i4 + 1] = cArr[b8 & 15];
        }
        return new String(cArr2);
    }

    public final String a(PackageManager packageManager) {
        try {
            if (Build.VERSION.SDK_INT < 28) {
                Context context = this.f16842a;
                j.d(context);
                Signature[] signatureArr = packageManager.getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatureArr != null && signatureArr.length != 0 && C1129o.r(signatureArr) != null) {
                    byte[] byteArray = ((Signature) C1129o.r(signatureArr)).toByteArray();
                    j.f(byteArray, "toByteArray(...)");
                    return b(byteArray);
                }
                return null;
            }
            Context context2 = this.f16842a;
            j.d(context2);
            SigningInfo signingInfo = packageManager.getPackageInfo(context2.getPackageName(), C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
            if (signingInfo == null) {
                return null;
            }
            if (signingInfo.hasMultipleSigners()) {
                Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                j.f(apkContentsSigners, "getApkContentsSigners(...)");
                byte[] byteArray2 = ((Signature) C1129o.r(apkContentsSigners)).toByteArray();
                j.f(byteArray2, "toByteArray(...)");
                return b(byteArray2);
            }
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            j.f(signingCertificateHistory, "getSigningCertificateHistory(...)");
            byte[] byteArray3 = ((Signature) C1129o.r(signingCertificateHistory)).toByteArray();
            j.f(byteArray3, "toByteArray(...)");
            return b(byteArray3);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        this.f16842a = binding.getApplicationContext();
        u uVar = new u(binding.getBinaryMessenger(), "dev.fluttercommunity.plus/package_info");
        this.f16843b = uVar;
        uVar.b(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding binding) {
        j.g(binding, "binding");
        this.f16842a = null;
        u uVar = this.f16843b;
        j.d(uVar);
        uVar.b(null);
        this.f16843b = null;
    }

    @Override // pg.s
    public final void onMethodCall(r call, t result) {
        String string;
        CharSequence charSequenceLoadLabel;
        j.g(call, "call");
        j.g(result, "result");
        try {
            if (!j.b(call.f19112a, "getAll")) {
                result.notImplemented();
                return;
            }
            Context context = this.f16842a;
            j.d(context);
            PackageManager packageManager = context.getPackageManager();
            Context context2 = this.f16842a;
            j.d(context2);
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            String strA = a(packageManager);
            Context context3 = this.f16842a;
            j.d(context3);
            PackageManager packageManager2 = context3.getPackageManager();
            Context context4 = this.f16842a;
            j.d(context4);
            String packageName = context4.getPackageName();
            int i = Build.VERSION.SDK_INT;
            String initiatingPackageName = i >= 30 ? packageManager2.getInstallSourceInfo(packageName).getInitiatingPackageName() : packageManager2.getInstallerPackageName(packageName);
            long j = packageInfo.firstInstallTime;
            long j6 = packageInfo.lastUpdateTime;
            HashMap map = new HashMap();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str = "";
            if (applicationInfo == null || (charSequenceLoadLabel = applicationInfo.loadLabel(packageManager)) == null || (string = charSequenceLoadLabel.toString()) == null) {
                string = "";
            }
            map.put("appName", string);
            Context context5 = this.f16842a;
            j.d(context5);
            map.put("packageName", context5.getPackageName());
            String str2 = packageInfo.versionName;
            if (str2 != null) {
                str = str2;
            }
            map.put("version", str);
            map.put("buildNumber", String.valueOf(i >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
            if (strA != null) {
                map.put("buildSignature", strA);
            }
            if (initiatingPackageName != null) {
                map.put("installerStore", initiatingPackageName);
            }
            map.put("installTime", String.valueOf(j));
            map.put("updateTime", String.valueOf(j6));
            result.success(map);
        } catch (PackageManager.NameNotFoundException e) {
            result.error("Name not found", e.getMessage(), null);
        }
    }
}
