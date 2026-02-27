package com.dynatrace.agent.storage.preference;

import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1112C;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerConfigurationV4 {
    public static final Companion Companion = new Companion(null);
    private static final ServerConfigurationV4 DEFAULT_CONFIG = new ServerConfigurationV4(0, 1024, 256, true, C1112C.f9377a);
    private final boolean capture;
    private final int maxBeaconSizeKib;
    private final int maxEventSizeKib;
    private final long revision;
    private final List<String> userInteractionsCapture;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ServerConfigurationV4 getDEFAULT_CONFIG() {
            return ServerConfigurationV4.DEFAULT_CONFIG;
        }

        private Companion() {
        }
    }

    public ServerConfigurationV4(long j, int i, int i4, boolean z4, List<String> userInteractionsCapture) {
        j.g(userInteractionsCapture, "userInteractionsCapture");
        this.revision = j;
        this.maxBeaconSizeKib = i;
        this.maxEventSizeKib = i4;
        this.capture = z4;
        this.userInteractionsCapture = userInteractionsCapture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServerConfigurationV4 copy$default(ServerConfigurationV4 serverConfigurationV4, long j, int i, int i4, boolean z4, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            j = serverConfigurationV4.revision;
        }
        long j6 = j;
        if ((i6 & 2) != 0) {
            i = serverConfigurationV4.maxBeaconSizeKib;
        }
        int i10 = i;
        if ((i6 & 4) != 0) {
            i4 = serverConfigurationV4.maxEventSizeKib;
        }
        int i11 = i4;
        if ((i6 & 8) != 0) {
            z4 = serverConfigurationV4.capture;
        }
        boolean z5 = z4;
        if ((i6 & 16) != 0) {
            list = serverConfigurationV4.userInteractionsCapture;
        }
        return serverConfigurationV4.copy(j6, i10, i11, z5, list);
    }

    public final long component1() {
        return this.revision;
    }

    public final int component2() {
        return this.maxBeaconSizeKib;
    }

    public final int component3() {
        return this.maxEventSizeKib;
    }

    public final boolean component4() {
        return this.capture;
    }

    public final List<String> component5() {
        return this.userInteractionsCapture;
    }

    public final ServerConfigurationV4 copy(long j, int i, int i4, boolean z4, List<String> userInteractionsCapture) {
        j.g(userInteractionsCapture, "userInteractionsCapture");
        return new ServerConfigurationV4(j, i, i4, z4, userInteractionsCapture);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerConfigurationV4)) {
            return false;
        }
        ServerConfigurationV4 serverConfigurationV4 = (ServerConfigurationV4) obj;
        return this.revision == serverConfigurationV4.revision && this.maxBeaconSizeKib == serverConfigurationV4.maxBeaconSizeKib && this.maxEventSizeKib == serverConfigurationV4.maxEventSizeKib && this.capture == serverConfigurationV4.capture && j.b(this.userInteractionsCapture, serverConfigurationV4.userInteractionsCapture);
    }

    public final boolean getCapture() {
        return this.capture;
    }

    public final int getMaxBeaconSizeKib() {
        return this.maxBeaconSizeKib;
    }

    public final int getMaxEventSizeKib() {
        return this.maxEventSizeKib;
    }

    public final long getRevision() {
        return this.revision;
    }

    public final List<String> getUserInteractionsCapture() {
        return this.userInteractionsCapture;
    }

    public int hashCode() {
        long j = this.revision;
        return this.userInteractionsCapture.hashCode() + (((((((((int) (j ^ (j >>> 32))) * 31) + this.maxBeaconSizeKib) * 31) + this.maxEventSizeKib) * 31) + (this.capture ? 1231 : 1237)) * 31);
    }

    public final boolean isTouchUserInteractionEnabled() {
        return this.userInteractionsCapture.contains(TtmlNode.COMBINE_ALL);
    }

    public String toString() {
        return "ServerConfigurationV4(revision=" + this.revision + ", maxBeaconSizeKib=" + this.maxBeaconSizeKib + ", maxEventSizeKib=" + this.maxEventSizeKib + ", capture=" + this.capture + ", userInteractionsCapture=" + this.userInteractionsCapture + ')';
    }
}
