package com.appsflyer.internal;

import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1eSDK extends AFd1nSDK<Map<String, String>> {
    private final AFc1pSDK AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private String afErrorLogForExcManagerOnly;

    @Nullable
    public AFa1zSDK afRDLog;
    private String afWarnLog;
    private final boolean getLevel;
    private final UUID onInstallConversionFailureNative;

    public interface AFa1zSDK {
        void AFInAppEventParameterName(Map<String, String> map);

        void values(String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1eSDK(@NonNull AFc1zSDK aFc1zSDK, @NonNull UUID uuid, @NonNull Uri uri) throws Throwable {
        super(AFd1uSDK.ONELINK, new AFd1uSDK[]{AFd1uSDK.RC_CDN}, aFc1zSDK, uuid.toString());
        boolean zBooleanValue = false;
        this.AFLogger$LogLevel = aFc1zSDK.values();
        this.onInstallConversionFailureNative = uuid;
        if (!AFb1nSDK.values(uri.getHost()) && !AFb1nSDK.values(uri.getPath())) {
            try {
                try {
                    Object objInvoke = ((Class) AFb1lSDK.values(((byte) KeyEvent.getModifierMetaStateMask()) + 1, (char) (55782 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getPressedStateDuration() >> 16) + 36)).getMethod("AFInAppEventParameterName", null).invoke(((Class) AFb1lSDK.values(1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.getCapsMode("", 0, 0) + 55782), 35 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getDeclaredConstructor(Uri.class).newInstance(uri), null);
                    try {
                        boolean zBooleanValue2 = ((Boolean) ((Class) AFb1lSDK.values(37 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (7321 - (ViewConfiguration.getLongPressTimeout() >> 16)), KeyEvent.normalizeMetaState(0) + 51)).getMethod("AFInAppEventParameterName", null).invoke(objInvoke, null)).booleanValue();
                        try {
                            zBooleanValue = ((Boolean) ((Class) AFb1lSDK.values(36 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 7321), 52 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).getMethod("AFKeystoreWrapper", null).invoke(objInvoke, null)).booleanValue();
                            String[] strArrSplit = uri.getPath().split("/");
                            if (zBooleanValue2 && strArrSplit.length == 3) {
                                this.AFVersionDeclaration = strArrSplit[1];
                                this.afErrorLogForExcManagerOnly = strArrSplit[2];
                                this.afWarnLog = uri.toString();
                            }
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } catch (Throwable th3) {
                        Throwable cause2 = th3.getCause();
                        if (cause2 == null) {
                            throw th3;
                        }
                        throw cause2;
                    }
                } catch (Throwable th4) {
                    Throwable cause3 = th4.getCause();
                    if (cause3 == null) {
                        throw th4;
                    }
                    throw cause3;
                }
            } catch (Throwable th5) {
                Throwable cause4 = th5.getCause();
                if (cause4 == null) {
                    throw th5;
                }
                throw cause4;
            }
        }
        this.getLevel = zBooleanValue;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final AFc1iSDK<Map<String, String>> AFInAppEventParameterName(@NonNull String str) {
        return this.AFLogger$LogLevel.valueOf(this.AFVersionDeclaration, this.afErrorLogForExcManagerOnly, this.onInstallConversionFailureNative, str);
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1wSDK
    public final void AFInAppEventType() {
        ResponseNetwork responseNetwork;
        super.AFInAppEventType();
        AFa1zSDK aFa1zSDK = this.afRDLog;
        if (aFa1zSDK != null) {
            if (this.values == AFd1tSDK.SUCCESS && (responseNetwork = ((AFd1nSDK) this).afErrorLog) != null) {
                aFa1zSDK.AFInAppEventParameterName((Map) responseNetwork.getBody());
                return;
            }
            Throwable thAfRDLog = afRDLog();
            if (!(thAfRDLog instanceof ParsingException)) {
                String str = this.afWarnLog;
                aFa1zSDK.values(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) thAfRDLog).getRawResponse().isSuccessful()) {
                aFa1zSDK.values("Can't parse one link data");
            } else {
                String str2 = this.afWarnLog;
                aFa1zSDK.values(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean AFLogger$LogLevel() {
        return false;
    }

    public final boolean AFVersionDeclaration() {
        return (TextUtils.isEmpty(this.AFVersionDeclaration) || TextUtils.isEmpty(this.afErrorLogForExcManagerOnly) || this.AFVersionDeclaration.equals("app")) ? false : true;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    public final boolean afErrorLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFd1nSDK
    @Nullable
    public final AppsFlyerRequestListener afInfoLog() {
        return null;
    }

    public final boolean afWarnLog() {
        return this.getLevel;
    }

    @Override // com.appsflyer.internal.AFd1nSDK, com.appsflyer.internal.AFd1wSDK
    public final long valueOf() {
        return C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
    }
}
