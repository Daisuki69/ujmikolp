package androidx.camera.extensions.internal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class ClientVersion {
    private static ClientVersion sCurrent = new ClientVersion("1.4.0");
    private final Version mVersion;

    public ClientVersion(@NonNull String str) {
        this.mVersion = Version.parse(str);
    }

    @NonNull
    public static ClientVersion getCurrentVersion() {
        return sCurrent;
    }

    public static boolean isMaximumCompatibleVersion(@NonNull Version version) {
        return getCurrentVersion().mVersion.compareTo(version.getMajor(), version.getMinor()) <= 0;
    }

    public static boolean isMinimumCompatibleVersion(@NonNull Version version) {
        return getCurrentVersion().mVersion.compareTo(version.getMajor(), version.getMinor()) >= 0;
    }

    @VisibleForTesting
    public static void setCurrentVersion(@NonNull ClientVersion clientVersion) {
        sCurrent = clientVersion;
    }

    @NonNull
    public Version getVersion() {
        return this.mVersion;
    }

    @NonNull
    public String toVersionString() {
        return this.mVersion.toString();
    }
}
