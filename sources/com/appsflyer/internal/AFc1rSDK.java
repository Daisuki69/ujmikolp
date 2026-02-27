package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class AFc1rSDK {
    public static final AFa1wSDK AFa1wSDK = new AFa1wSDK(null);
    public static String valueOf = "https://%smonitorsdk.%s/remote-debug/exception-manager";
    public Map<String, String> AFInAppEventType;
    public byte[] AFKeystoreWrapper;
    public int values;

    public static final class AFa1wSDK {
        private AFa1wSDK() {
        }

        public /* synthetic */ AFa1wSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFc1rSDK(byte[] bArr, Map<String, String> map, int i) {
        j.g(bArr, "");
        this.AFKeystoreWrapper = bArr;
        this.AFInAppEventType = map;
        this.values = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x017c  */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFInAppEventType() {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1rSDK.AFInAppEventType():boolean");
    }
}
