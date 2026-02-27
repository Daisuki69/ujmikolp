package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_Camera2CameraImpl_UseCaseInfo extends Camera2CameraImpl.UseCaseInfo {
    private final List<UseCaseConfigFactory.CaptureType> captureTypes;
    private final SessionConfig sessionConfig;
    private final StreamSpec streamSpec;
    private final Size surfaceResolution;
    private final UseCaseConfig<?> useCaseConfig;
    private final String useCaseId;
    private final Class<?> useCaseType;

    public AutoValue_Camera2CameraImpl_UseCaseInfo(String str, Class<?> cls, SessionConfig sessionConfig, UseCaseConfig<?> useCaseConfig, @Nullable Size size, @Nullable StreamSpec streamSpec, @Nullable List<UseCaseConfigFactory.CaptureType> list) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.useCaseId = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.useCaseType = cls;
        if (sessionConfig == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.sessionConfig = sessionConfig;
        if (useCaseConfig == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.useCaseConfig = useCaseConfig;
        this.surfaceResolution = size;
        this.streamSpec = streamSpec;
        this.captureTypes = list;
    }

    public boolean equals(Object obj) {
        Size size;
        StreamSpec streamSpec;
        List<UseCaseConfigFactory.CaptureType> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Camera2CameraImpl.UseCaseInfo) {
            Camera2CameraImpl.UseCaseInfo useCaseInfo = (Camera2CameraImpl.UseCaseInfo) obj;
            if (this.useCaseId.equals(useCaseInfo.getUseCaseId()) && this.useCaseType.equals(useCaseInfo.getUseCaseType()) && this.sessionConfig.equals(useCaseInfo.getSessionConfig()) && this.useCaseConfig.equals(useCaseInfo.getUseCaseConfig()) && ((size = this.surfaceResolution) != null ? size.equals(useCaseInfo.getSurfaceResolution()) : useCaseInfo.getSurfaceResolution() == null) && ((streamSpec = this.streamSpec) != null ? streamSpec.equals(useCaseInfo.getStreamSpec()) : useCaseInfo.getStreamSpec() == null) && ((list = this.captureTypes) != null ? list.equals(useCaseInfo.getCaptureTypes()) : useCaseInfo.getCaptureTypes() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    @Nullable
    public List<UseCaseConfigFactory.CaptureType> getCaptureTypes() {
        return this.captureTypes;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    @NonNull
    public SessionConfig getSessionConfig() {
        return this.sessionConfig;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    @Nullable
    public StreamSpec getStreamSpec() {
        return this.streamSpec;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    @Nullable
    public Size getSurfaceResolution() {
        return this.surfaceResolution;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    @NonNull
    public UseCaseConfig<?> getUseCaseConfig() {
        return this.useCaseConfig;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    @NonNull
    public String getUseCaseId() {
        return this.useCaseId;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraImpl.UseCaseInfo
    @NonNull
    public Class<?> getUseCaseType() {
        return this.useCaseType;
    }

    public int hashCode() {
        int iHashCode = (((((((this.useCaseId.hashCode() ^ 1000003) * 1000003) ^ this.useCaseType.hashCode()) * 1000003) ^ this.sessionConfig.hashCode()) * 1000003) ^ this.useCaseConfig.hashCode()) * 1000003;
        Size size = this.surfaceResolution;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        StreamSpec streamSpec = this.streamSpec;
        int iHashCode3 = (iHashCode2 ^ (streamSpec == null ? 0 : streamSpec.hashCode())) * 1000003;
        List<UseCaseConfigFactory.CaptureType> list = this.captureTypes;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("UseCaseInfo{useCaseId=");
        sb2.append(this.useCaseId);
        sb2.append(", useCaseType=");
        sb2.append(this.useCaseType);
        sb2.append(", sessionConfig=");
        sb2.append(this.sessionConfig);
        sb2.append(", useCaseConfig=");
        sb2.append(this.useCaseConfig);
        sb2.append(", surfaceResolution=");
        sb2.append(this.surfaceResolution);
        sb2.append(", streamSpec=");
        sb2.append(this.streamSpec);
        sb2.append(", captureTypes=");
        return We.s.r(sb2, this.captureTypes, "}");
    }
}
