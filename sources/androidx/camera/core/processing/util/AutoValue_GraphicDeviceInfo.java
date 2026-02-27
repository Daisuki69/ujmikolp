package androidx.camera.core.processing.util;

import We.s;
import androidx.annotation.NonNull;
import androidx.camera.core.processing.util.GraphicDeviceInfo;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_GraphicDeviceInfo extends GraphicDeviceInfo {
    private final String eglExtensions;
    private final String eglVersion;
    private final String glExtensions;
    private final String glVersion;

    public static final class Builder extends GraphicDeviceInfo.Builder {
        private String eglExtensions;
        private String eglVersion;
        private String glExtensions;
        private String glVersion;

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public GraphicDeviceInfo build() {
            String strI = this.glVersion == null ? " glVersion" : "";
            if (this.eglVersion == null) {
                strI = s.i(strI, " eglVersion");
            }
            if (this.glExtensions == null) {
                strI = s.i(strI, " glExtensions");
            }
            if (this.eglExtensions == null) {
                strI = s.i(strI, " eglExtensions");
            }
            if (strI.isEmpty()) {
                return new AutoValue_GraphicDeviceInfo(this.glVersion, this.eglVersion, this.glExtensions, this.eglExtensions);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public GraphicDeviceInfo.Builder setEglExtensions(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.eglExtensions = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public GraphicDeviceInfo.Builder setEglVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.eglVersion = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public GraphicDeviceInfo.Builder setGlExtensions(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.glExtensions = str;
            return this;
        }

        @Override // androidx.camera.core.processing.util.GraphicDeviceInfo.Builder
        public GraphicDeviceInfo.Builder setGlVersion(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.glVersion = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GraphicDeviceInfo) {
            GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) obj;
            if (this.glVersion.equals(graphicDeviceInfo.getGlVersion()) && this.eglVersion.equals(graphicDeviceInfo.getEglVersion()) && this.glExtensions.equals(graphicDeviceInfo.getGlExtensions()) && this.eglExtensions.equals(graphicDeviceInfo.getEglExtensions())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    @NonNull
    public String getEglExtensions() {
        return this.eglExtensions;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    @NonNull
    public String getEglVersion() {
        return this.eglVersion;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    @NonNull
    public String getGlExtensions() {
        return this.glExtensions;
    }

    @Override // androidx.camera.core.processing.util.GraphicDeviceInfo
    @NonNull
    public String getGlVersion() {
        return this.glVersion;
    }

    public int hashCode() {
        return ((((((this.glVersion.hashCode() ^ 1000003) * 1000003) ^ this.eglVersion.hashCode()) * 1000003) ^ this.glExtensions.hashCode()) * 1000003) ^ this.eglExtensions.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb2.append(this.glVersion);
        sb2.append(", eglVersion=");
        sb2.append(this.eglVersion);
        sb2.append(", glExtensions=");
        sb2.append(this.glExtensions);
        sb2.append(", eglExtensions=");
        return s.p(sb2, this.eglExtensions, "}");
    }

    private AutoValue_GraphicDeviceInfo(String str, String str2, String str3, String str4) {
        this.glVersion = str;
        this.eglVersion = str2;
        this.glExtensions = str3;
        this.eglExtensions = str4;
    }
}
