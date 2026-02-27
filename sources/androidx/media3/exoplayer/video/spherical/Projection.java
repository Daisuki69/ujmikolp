package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
final class Projection {
    public static final int DRAW_MODE_TRIANGLES = 0;
    public static final int DRAW_MODE_TRIANGLES_FAN = 2;
    public static final int DRAW_MODE_TRIANGLES_STRIP = 1;
    public static final int POSITION_COORDS_PER_VERTEX = 3;
    public static final int TEXTURE_COORDS_PER_VERTEX = 2;
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    public static final class Mesh {
        private final SubMesh[] subMeshes;

        public Mesh(SubMesh... subMeshArr) {
            this.subMeshes = subMeshArr;
        }

        public SubMesh getSubMesh(int i) {
            return this.subMeshes[i];
        }

        public int getSubMeshCount() {
            return this.subMeshes.length;
        }
    }

    public static final class SubMesh {
        public static final int VIDEO_TEXTURE_ID = 0;
        public final int mode;
        public final float[] textureCoords;
        public final int textureId;
        public final float[] vertices;

        public SubMesh(int i, float[] fArr, float[] fArr2, int i4) {
            this.textureId = i;
            Assertions.checkArgument(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.vertices = fArr;
            this.textureCoords = fArr2;
            this.mode = i4;
        }

        public int getVertexCount() {
            return this.vertices.length / 3;
        }
    }

    public Projection(Mesh mesh, int i) {
        this(mesh, mesh, i);
    }

    public static Projection createEquirectangular(int i) {
        return createEquirectangular(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public Projection(Mesh mesh, Mesh mesh2, int i) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i;
        this.singleMesh = mesh == mesh2;
    }

    public static Projection createEquirectangular(float f, int i, int i4, float f3, float f7, int i6) {
        int i10;
        int i11;
        int i12 = i;
        int i13 = 3;
        int i14 = 1;
        Assertions.checkArgument(f > 0.0f);
        Assertions.checkArgument(i12 >= 1);
        Assertions.checkArgument(i4 >= 1);
        Assertions.checkArgument(f3 > 0.0f && f3 <= 180.0f);
        Assertions.checkArgument(f7 > 0.0f && f7 <= 360.0f);
        float radians = (float) Math.toRadians(f3);
        float radians2 = (float) Math.toRadians(f7);
        float f10 = radians / i12;
        float f11 = radians2 / i4;
        int i15 = i4 + 1;
        int i16 = ((i15 * 2) + 2) * i12;
        float[] fArr = new float[i16 * 3];
        float[] fArr2 = new float[i16 * 2];
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i17 < i12) {
            float f12 = radians / 2.0f;
            float f13 = (i17 * f10) - f12;
            int i20 = i13;
            int i21 = i17 + 1;
            int i22 = i14;
            float f14 = (i21 * f10) - f12;
            int i23 = 0;
            while (i23 < i15) {
                float f15 = radians;
                float f16 = radians2;
                int i24 = i19;
                int i25 = 0;
                int i26 = 2;
                while (i25 < i26) {
                    int i27 = i21;
                    float f17 = i23 * f11;
                    float f18 = f10;
                    float f19 = f11;
                    double d10 = f;
                    double d11 = (f17 + 3.1415927f) - (f16 / 2.0f);
                    double d12 = i25 == 0 ? f13 : f14;
                    fArr[i18] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                    fArr[i18 + 1] = (float) (Math.sin(d12) * d10);
                    int i28 = i18 + 3;
                    fArr[i18 + 2] = (float) (Math.cos(d11) * d10 * Math.cos(d12));
                    fArr2[i24] = f17 / f16;
                    int i29 = i24 + 2;
                    fArr2[i24 + 1] = ((i17 + i25) * f18) / f15;
                    if ((i23 == 0 && i25 == 0) || (i23 == i4 && i25 == i22)) {
                        i10 = i20;
                        System.arraycopy(fArr, i18, fArr, i28, i10);
                        i18 += 6;
                        i11 = 2;
                        System.arraycopy(fArr2, i24, fArr2, i29, 2);
                        i24 += 4;
                    } else {
                        i10 = i20;
                        i11 = 2;
                        i18 = i28;
                        i24 = i29;
                    }
                    i25++;
                    i20 = i10;
                    i22 = 1;
                    i26 = i11;
                    i21 = i27;
                    f10 = f18;
                    f11 = f19;
                }
                i23 += i22;
                radians = f15;
                i19 = i24;
                i21 = i21;
                f11 = f11;
                radians2 = f16;
            }
            int i30 = i21;
            i12 = i;
            i13 = i20;
            i14 = i22;
            i17 = i30;
        }
        int i31 = i14;
        SubMesh[] subMeshArr = new SubMesh[i31];
        subMeshArr[0] = new SubMesh(0, fArr, fArr2, i31);
        return new Projection(new Mesh(subMeshArr), i6);
    }
}
