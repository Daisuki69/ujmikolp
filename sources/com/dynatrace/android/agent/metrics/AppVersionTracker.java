package com.dynatrace.android.agent.metrics;

import We.s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.dynatrace.agent.metrics.AppVersion;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.SdkVersionProvider;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes2.dex */
public class AppVersionTracker {
    private static final String LOGTAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "AppVersionTracker");
    private final Context context;
    private final SdkVersionProvider sdkVersionProvider;

    public AppVersionTracker(Context context, SdkVersionProvider sdkVersionProvider) {
        this.context = context;
        this.sdkVersionProvider = sdkVersionProvider;
    }

    @SuppressLint({"NewApi"})
    public AppVersion determineAppVersion() {
        try {
            PackageInfo packageInfo = this.sdkVersionProvider.sdkVersion() >= 33 ? this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return new AppVersion(this.sdkVersionProvider.sdkVersion() >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode, packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e) {
            if (!Global.DEBUG) {
                return null;
            }
            Utility.zlogD(LOGTAG, "Failed to determine app version from PackageInfo", e);
            return null;
        }
    }
}
