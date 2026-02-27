package x1;

/* JADX INFO: renamed from: x1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2453c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f20859b = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};
    public static final String[] c = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20860a;
}
