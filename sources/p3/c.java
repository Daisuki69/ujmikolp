package p3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.PlatformVersion;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GmsLogger f19024a = new GmsLogger(CommonUtils.TAG, "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            f19024a.e(CommonUtils.TAG, "Exception thrown when trying to get app version ".concat(e.toString()));
            return "";
        }
    }

    public static String b(Locale locale) {
        if (PlatformVersion.isAtLeastLollipop()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb2 = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append(Global.HYPHEN);
            sb2.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb2.append(Global.HYPHEN);
            sb2.append(locale.getVariant());
        }
        return sb2.toString();
    }
}
