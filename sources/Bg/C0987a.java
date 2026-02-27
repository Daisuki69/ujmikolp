package bg;

import android.app.WallpaperManager;
import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.os.Build;
import android.os.UserManager;
import android.provider.Settings;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import cj.C1129o;
import com.dynatrace.android.agent.Global;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import zj.C2576A;

/* JADX INFO: renamed from: bg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0987a extends kotlin.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0998f0 f8918b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0987a(C0998f0 c0998f0, int i) {
        super(1);
        this.f8917a = i;
        this.f8918b = c0998f0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws NoSuchAlgorithmException {
        SignalStrength signalStrength;
        switch (this.f8917a) {
            case 0:
                return String.valueOf(Integer.valueOf(((WallpaperManager) this.f8918b.f.getValue()).isWallpaperSupported() ? 1 : 0));
            case 1:
                return String.valueOf(this.f8918b.f8970d.keyboard);
            case 2:
                int i = Build.VERSION.SDK_INT;
                Configuration _configuration = this.f8918b.f8970d;
                if (i < 24) {
                    Locale locale = _configuration.locale;
                    kotlin.jvm.internal.j.c(locale, "_configuration.locale");
                    return locale.getISO3Country();
                }
                kotlin.jvm.internal.j.c(_configuration, "_configuration");
                Locale locale2 = _configuration.getLocales().get(0);
                kotlin.jvm.internal.j.c(locale2, "_configuration.locales[0]");
                return locale2.getISO3Country();
            case 3:
                int i4 = Build.VERSION.SDK_INT;
                Configuration _configuration2 = this.f8918b.f8970d;
                if (i4 < 24) {
                    Locale locale3 = _configuration2.locale;
                    kotlin.jvm.internal.j.c(locale3, "_configuration.locale");
                    return locale3.getISO3Language();
                }
                kotlin.jvm.internal.j.c(_configuration2, "_configuration");
                Locale locale4 = _configuration2.getLocales().get(0);
                kotlin.jvm.internal.j.c(locale4, "_configuration.locales[0]");
                return locale4.getISO3Language();
            case 4:
                return String.valueOf(this.f8918b.f8970d.mcc);
            case 5:
                return String.valueOf(this.f8918b.f8970d.mnc);
            case 6:
                return C0998f0.h(this.f8918b).getNetworkOperator();
            case 7:
                return C0998f0.h(this.f8918b).getNetworkOperatorName();
            case 8:
                return this.f8918b.f7198b.getPackageName();
            case 9:
                C0998f0 c0998f0 = this.f8918b;
                return c0998f0.f7198b.getPackageManager().getPackageInfo(c0998f0.f7198b.getPackageName(), 128).versionName;
            case 10:
                return String.valueOf(C0998f0.h(this.f8918b).getPhoneCount());
            case 11:
                return String.valueOf(C0998f0.h(this.f8918b).getPhoneType());
            case 12:
                if (Build.VERSION.SDK_INT < 28 || (signalStrength = ((TelephonyManager) this.f8918b.c.getValue()).getSignalStrength()) == null) {
                    return null;
                }
                return String.valueOf(signalStrength.getLevel());
            case 13:
                return C0998f0.h(this.f8918b).getSimCountryIso();
            case 14:
                return C0998f0.h(this.f8918b).getSimOperatorName();
            case 15:
                C0998f0 c0998f02 = this.f8918b;
                Signature[] signatureArr = c0998f02.f7198b.getPackageManager().getPackageInfo(c0998f02.f7198b.getPackageName(), 64).signatures;
                kotlin.jvm.internal.j.c(signatureArr, "info.signatures");
                Signature signature = (Signature) C1129o.r(signatureArr);
                MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                messageDigest.update(signature.toByteArray());
                byte[] digest = messageDigest.digest();
                StringBuilder sb2 = new StringBuilder();
                kotlin.jvm.internal.j.c(digest, "digest");
                int length = digest.length;
                for (int i6 = 0; i6 < length; i6++) {
                    if (i6 != 0) {
                        sb2.append(Global.COLON);
                    }
                    String hexString = Integer.toHexString(digest[i6] & 255);
                    if (hexString.length() == 1) {
                        sb2.append("0");
                    }
                    sb2.append(hexString);
                }
                return sb2.toString();
            case 16:
                return Settings.Secure.getString(this.f8918b.f7198b.getContentResolver(), "android_id");
            case 17:
                Context context = this.f8918b.f7198b;
                File filesDir = context.getFilesDir();
                kotlin.jvm.internal.j.c(filesDir, "context.filesDir");
                String path = filesDir.getPath();
                kotlin.jvm.internal.j.c(path, "context.filesDir.path");
                for (String str : C2576A.T(path, new String[]{"/"}, 6)) {
                    if (C2576A.z(str, ".", false, 2)) {
                        return String.valueOf(Integer.valueOf(!str.equals(context.getPackageName()) ? 1 : 0));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 18:
                UserManager userManager = (UserManager) this.f8918b.e.getValue();
                if (userManager != null) {
                    return String.valueOf(Integer.valueOf(userManager.isDemoUser() ? 1 : 0));
                }
                return null;
            case 19:
                UserManager userManager2 = (UserManager) this.f8918b.e.getValue();
                if (userManager2 != null) {
                    return String.valueOf(Integer.valueOf(userManager2.isSystemUser() ? 1 : 0));
                }
                return null;
            case 20:
                UserManager userManager3 = (UserManager) this.f8918b.e.getValue();
                if (userManager3 != null) {
                    return String.valueOf(Integer.valueOf(userManager3.isUserAGoat() ? 1 : 0));
                }
                return null;
            default:
                UserManager userManager4 = (UserManager) this.f8918b.e.getValue();
                if (userManager4 != null) {
                    return String.valueOf(Integer.valueOf(userManager4.isUserUnlocked() ? 1 : 0));
                }
                return null;
        }
    }
}
