package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFa1tSDK {
    public final Map<String, Object> AFInAppEventParameterName;

    @Nullable
    public AppsFlyerRequestListener AFInAppEventType;

    @Nullable
    public Application AFKeystoreWrapper;
    String AFLogger;
    private final boolean AFVersionDeclaration;
    public String afDebugLog;
    String afErrorLog;
    public String afInfoLog;
    public int afRDLog;
    private byte[] afWarnLog;

    @Nullable
    String valueOf;

    @Nullable
    Map<String, Object> values;

    public AFa1tSDK() {
        this(null, null, null, null);
    }

    public AFa1tSDK AFInAppEventParameterName(String str) {
        this.afInfoLog = str;
        return this;
    }

    public final byte[] AFInAppEventType() {
        return this.afWarnLog;
    }

    public final AFa1tSDK AFKeystoreWrapper(Map<String, ?> map) {
        synchronized (map) {
            this.AFInAppEventParameterName.putAll(map);
        }
        return this;
    }

    public abstract AFd1uSDK AFKeystoreWrapper();

    public boolean AFLogger() {
        return false;
    }

    public boolean afDebugLog() {
        return true;
    }

    public boolean afInfoLog() {
        return true;
    }

    public boolean afRDLog() {
        return true;
    }

    public final boolean valueOf() {
        return this.AFVersionDeclaration;
    }

    public final Map<String, Object> values() {
        return this.AFInAppEventParameterName;
    }

    public AFa1tSDK(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Context context) {
        this.AFInAppEventParameterName = new HashMap();
        this.afErrorLog = str;
        this.afInfoLog = str2;
        this.AFVersionDeclaration = bool != null ? bool.booleanValue() : true;
        if (context != null) {
            this.AFKeystoreWrapper = (Application) context.getApplicationContext();
        }
    }

    public static boolean AFInAppEventType(double d10) {
        if (d10 < AudioStats.AUDIO_AMPLITUDE_NONE || d10 >= 1.0d) {
            return false;
        }
        if (d10 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return true;
        }
        int i = (int) (1.0d / d10);
        if (i + 1 > 0) {
            return ((int) ((Math.random() * ((double) i)) + 1.0d)) != i;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }

    public final boolean AFInAppEventParameterName() {
        return this.afErrorLog == null && this.afDebugLog == null;
    }

    public final AFa1tSDK values(byte[] bArr) {
        this.afWarnLog = bArr;
        return this;
    }

    @NonNull
    public final String values(String str) {
        String strValues = AFb1wSDK.AFKeystoreWrapper().values(this.AFKeystoreWrapper);
        return strValues != null ? Uri.parse(str).buildUpon().appendQueryParameter(AppsFlyerProperties.CHANNEL, strValues).build().toString() : str;
    }

    public final AFa1tSDK AFKeystoreWrapper(String str, Object obj) {
        synchronized (this.AFInAppEventParameterName) {
            this.AFInAppEventParameterName.put(str, obj);
        }
        return this;
    }

    public final AFa1tSDK AFKeystoreWrapper(int i) {
        this.afRDLog = i;
        synchronized (this.AFInAppEventParameterName) {
            try {
                if (this.AFInAppEventParameterName.containsKey("counter")) {
                    this.AFInAppEventParameterName.put("counter", Integer.toString(i));
                }
                if (this.AFInAppEventParameterName.containsKey("launch_counter")) {
                    this.AFInAppEventParameterName.put("launch_counter", Integer.toString(i));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }
}
