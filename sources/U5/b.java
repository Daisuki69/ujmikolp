package u5;

import We.s;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f20269d;
    public static final b e;
    public static final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b[] f20270g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20272b;

    static {
        b bVar = new b("APP_INTEGRITY_ERROR", 0, "AppIntegrityError", true);
        c = bVar;
        b bVar2 = new b("ROOTED_DEVICE", 1, "RootedDevice", true);
        f20269d = bVar2;
        b bVar3 = new b("EMULATOR_FOUND", 2, "EmulatorFound", false);
        e = bVar3;
        b bVar4 = new b("DEBUGGER_THREAT_DETECTED", 3, "DebuggerThreatDetected", true);
        b bVar5 = new b("DEVELOPER_OPTIONS_ENABLED", 4, "DeveloperOptionsEnabled", true);
        b bVar6 = new b("HOOK_FRAMEWORK_DETECTED", 5, "HookFrameworkDetected", false);
        b bVar7 = new b("RUNNING_IN_VIRTUAL_SPACE", 6, "RunningInVirtualSpace", true);
        b bVar8 = new b("ACTIVE_VPN_DETECTED", 7, "ActiveVpnDetected", true);
        b bVar9 = new b("SSL_CERTIFICATE_VALIDATION_FAILED", 8, "SslCertificateValidationFailed", false);
        b bVar10 = new b("GEOLOCATION_SPOOFIING_DETECTED", 9, "GeoLocationSpoofingDetected", false);
        b bVar11 = new b("GEOLOCATION_MOCK_BY_APP_DETECTED", 10, "GeoLocationMockByAppDetected", false);
        b bVar12 = new b("BLOCKED_SCREEN_CAPTURE_EVENT", 11, "BlockedScreenCaptureEvent", false);
        b bVar13 = new b("CLICK_BOT_DETECTED", 12, "ClickBotDetected", false);
        b bVar14 = new b("NETWORK_PROXY_CONFIGURED", 13, "NetworkProxyConfigured", false);
        b bVar15 = new b("UNKNOWN", 14, "Unknown", false);
        f = bVar15;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15};
        f20270g = bVarArr;
        v0.h(bVarArr);
    }

    public b(String str, int i, String str2, boolean z4) {
        this.f20271a = str2;
        this.f20272b = z4;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f20270g.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sbV = s.v((this == c || this == f20269d || this == e) ? "Long-lived" : "User-Initiated", " - ");
        sbV.append(this.f20271a);
        return sbV.toString();
    }
}
