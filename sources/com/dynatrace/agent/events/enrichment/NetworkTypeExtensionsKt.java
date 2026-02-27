package com.dynatrace.agent.events.enrichment;

import com.dynatrace.agent.common.connectivity.NetworkType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class NetworkTypeExtensionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkType.values().length];
            try {
                iArr[NetworkType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkType.CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkType.ETHERNET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkType.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NetworkType.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getStringRepresentation(NetworkType networkType) {
        j.g(networkType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[networkType.ordinal()];
        if (i == 1) {
            return "wifi";
        }
        if (i == 2) {
            return "cell";
        }
        if (i == 3) {
            return "wired";
        }
        if (i == 4) {
            return "unknown";
        }
        if (i == 5) {
            return "unavailable";
        }
        throw new NoWhenBranchMatchedException();
    }
}
