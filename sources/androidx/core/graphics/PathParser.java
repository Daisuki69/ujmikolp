package androidx.core.graphics;

import We.s;
import android.graphics.Path;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import defpackage.AbstractC1414e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class PathParser {
    private static final String LOGTAG = "PathParser";

    public static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;
    }

    private PathParser() {
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c, float[] fArr) {
        arrayList.add(new PathDataNode(c, fArr));
    }

    public static boolean canMorph(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            if (pathDataNodeArr[i].mType != pathDataNodeArr2[i].mType || pathDataNodeArr[i].mParams.length != pathDataNodeArr2[i].mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] copyOfRange(float[] fArr, int i, int i4) {
        if (i > i4) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i6 = i4 - i;
        int iMin = Math.min(i6, length - i);
        float[] fArr2 = new float[i6];
        System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            int iNextStart = nextStart(str, i4);
            String strTrim = str.substring(i, iNextStart).trim();
            if (!strTrim.isEmpty()) {
                addNode(arrayList, strTrim.charAt(0), getFloats(strTrim));
            }
            i = iNextStart;
            i4 = iNextStart + 1;
        }
        if (i4 - i == 1 && i < str.length()) {
            addNode(arrayList, str.charAt(i), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[0]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        try {
            PathDataNode.nodesToPath(createNodesFromPathData(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(AbstractC1414e.h("Error in parsing ", str), e);
        }
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr2[i] = new PathDataNode(pathDataNodeArr[i]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[LOOP:0: B:3:0x0007->B:24:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void extract(java.lang.String r8, int r9, androidx.core.graphics.PathParser.ExtractFloatResult r10) {
        /*
            r0 = 0
            r10.mEndWithNegOrDot = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L36
        L27:
            r10.mEndWithNegOrDot = r7
        L29:
            r2 = r0
            r4 = r7
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.mEndWithNegOrDot = r7
            goto L29
        L33:
            r2 = r0
            goto L36
        L35:
            r2 = r7
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.mEndPosition = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.extract(java.lang.String, int, androidx.core.graphics.PathParser$ExtractFloatResult):void");
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i = 1;
            int i4 = 0;
            while (i < length) {
                extract(str, i, extractFloatResult);
                int i6 = extractFloatResult.mEndPosition;
                if (i < i6) {
                    fArr[i4] = Float.parseFloat(str.substring(i, i6));
                    i4++;
                }
                i = extractFloatResult.mEndWithNegOrDot ? i6 : i6 + 1;
            }
            return copyOfRange(fArr, 0, i4);
        } catch (NumberFormatException e) {
            throw new RuntimeException(s.j("error in parsing \"", str, "\""), e);
        }
    }

    public static void interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, float f, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3) {
        if (!interpolatePathDataNodes(pathDataNodeArr, pathDataNodeArr2, pathDataNodeArr3, f)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    private static int nextStart(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                    continue;
                }
                i++;
            }
            if (cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
        float[] fArr = new float[6];
        char c = 'm';
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            PathDataNode.addCommand(path, fArr, c, pathDataNode.mType, pathDataNode.mParams);
            c = pathDataNode.mType;
        }
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i = 0; i < pathDataNodeArr2.length; i++) {
            pathDataNodeArr[i].mType = pathDataNodeArr2[i].mType;
            for (int i4 = 0; i4 < pathDataNodeArr2[i].mParams.length; i4++) {
                pathDataNodeArr[i].mParams[i4] = pathDataNodeArr2[i].mParams[i4];
            }
        }
    }

    public static class PathDataNode {
        private final float[] mParams;
        private char mType;

        public PathDataNode(char c, float[] fArr) {
            this.mType = c;
            this.mParams = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void addCommand(Path path, float[] fArr, char c, char c10, float[] fArr2) {
            int i;
            int i4;
            boolean z4;
            boolean z5;
            char c11;
            char c12;
            int i6;
            float f;
            boolean z8;
            float f3;
            float f7;
            float f10;
            float f11;
            float f12;
            boolean z9;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            Path path2 = path;
            boolean z10 = false;
            float f23 = fArr[0];
            boolean z11 = true;
            float f24 = fArr[1];
            char c13 = 2;
            float f25 = fArr[2];
            char c14 = 3;
            float f26 = fArr[3];
            float f27 = fArr[4];
            float f28 = fArr[5];
            switch (c10) {
                case 'A':
                case 'a':
                    i = 7;
                    i4 = i;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    i4 = i;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i4 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i4 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i4 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f27, f28);
                    f23 = f27;
                    f25 = f23;
                    f24 = f28;
                    f26 = f24;
                    i4 = 2;
                    break;
            }
            float f29 = f23;
            float f30 = f24;
            float f31 = f27;
            float f32 = f28;
            int i10 = 0;
            char c15 = c;
            while (i10 < fArr2.length) {
                if (c10 == 'A') {
                    float f33 = f29;
                    float f34 = f30;
                    z4 = z10;
                    z5 = z11;
                    c11 = c13;
                    c12 = c14;
                    i6 = i10;
                    int i11 = i6 + 5;
                    float f35 = fArr2[i11];
                    int i12 = i6 + 6;
                    float f36 = fArr2[i12];
                    float f37 = fArr2[i6];
                    float f38 = fArr2[i6 + 1];
                    float f39 = fArr2[i6 + 2];
                    if (fArr2[i6 + 3] != 0.0f) {
                        f = 0.0f;
                        z8 = z5;
                    } else {
                        f = 0.0f;
                        z8 = z4;
                    }
                    drawArc(path, f33, f34, f35, f36, f37, f38, f39, z8, fArr2[i6 + 4] != f ? z5 : z4);
                    f25 = fArr2[i11];
                    f29 = f25;
                    f26 = fArr2[i12];
                    f30 = f26;
                } else if (c10 == 'C') {
                    z4 = z10;
                    z5 = z11;
                    c11 = c13;
                    c12 = c14;
                    i6 = i10;
                    int i13 = i6 + 2;
                    int i14 = i6 + 3;
                    int i15 = i6 + 4;
                    int i16 = i6 + 5;
                    path2.cubicTo(fArr2[i6], fArr2[i6 + 1], fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                    float f40 = fArr2[i15];
                    float f41 = fArr2[i16];
                    float f42 = fArr2[i13];
                    float f43 = fArr2[i14];
                    f29 = f40;
                    f30 = f41;
                    f26 = f43;
                    f25 = f42;
                } else if (c10 != 'H') {
                    if (c10 != 'Q') {
                        z4 = z10;
                        if (c10 == 'V') {
                            z5 = z11;
                            c11 = c13;
                            c12 = c14;
                            i6 = i10;
                            path2.lineTo(f29, fArr2[i6]);
                            f10 = fArr2[i6];
                        } else if (c10 != 'a') {
                            if (c10 != 'c') {
                                z5 = z11;
                                if (c10 != 'h') {
                                    if (c10 != 'q') {
                                        c11 = c13;
                                        if (c10 != 'v') {
                                            if (c10 != 'L') {
                                                if (c10 != 'M') {
                                                    c12 = c14;
                                                    if (c10 == 'S') {
                                                        if (c15 == 'c' || c15 == 's' || c15 == 'C' || c15 == 'S') {
                                                            f29 = (f29 * 2.0f) - f25;
                                                            f30 = (f30 * 2.0f) - f26;
                                                        }
                                                        float f44 = f29;
                                                        float f45 = f30;
                                                        int i17 = i10 + 1;
                                                        int i18 = i10 + 2;
                                                        int i19 = i10 + 3;
                                                        path2.cubicTo(f44, f45, fArr2[i10], fArr2[i17], fArr2[i18], fArr2[i19]);
                                                        f3 = fArr2[i10];
                                                        f7 = fArr2[i17];
                                                        f29 = fArr2[i18];
                                                        f30 = fArr2[i19];
                                                        i6 = i10;
                                                    } else if (c10 == 'T') {
                                                        if (c15 == 'q' || c15 == 't' || c15 == 'Q' || c15 == 'T') {
                                                            f29 = (f29 * 2.0f) - f25;
                                                            f30 = (f30 * 2.0f) - f26;
                                                        }
                                                        int i20 = i10 + 1;
                                                        path2.quadTo(f29, f30, fArr2[i10], fArr2[i20]);
                                                        float f46 = fArr2[i10];
                                                        f10 = fArr2[i20];
                                                        f25 = f29;
                                                        f26 = f30;
                                                        i6 = i10;
                                                        f29 = f46;
                                                    } else if (c10 == 'l') {
                                                        int i21 = i10 + 1;
                                                        path2.rLineTo(fArr2[i10], fArr2[i21]);
                                                        f29 += fArr2[i10];
                                                        f16 = fArr2[i21];
                                                    } else if (c10 == 'm') {
                                                        float f47 = fArr2[i10];
                                                        f29 += f47;
                                                        float f48 = fArr2[i10 + 1];
                                                        f30 += f48;
                                                        if (i10 > 0) {
                                                            path2.rLineTo(f47, f48);
                                                        } else {
                                                            path2.rMoveTo(f47, f48);
                                                            f31 = f29;
                                                        }
                                                    } else if (c10 == 's') {
                                                        if (c15 == 'c' || c15 == 's' || c15 == 'C' || c15 == 'S') {
                                                            f19 = f30 - f26;
                                                            f20 = f29 - f25;
                                                        } else {
                                                            f20 = 0.0f;
                                                            f19 = 0.0f;
                                                        }
                                                        int i22 = i10 + 1;
                                                        int i23 = i10 + 2;
                                                        int i24 = i10 + 3;
                                                        path2.rCubicTo(f20, f19, fArr2[i10], fArr2[i22], fArr2[i23], fArr2[i24]);
                                                        f13 = fArr2[i10] + f29;
                                                        f14 = fArr2[i22] + f30;
                                                        f29 += fArr2[i23];
                                                        f15 = fArr2[i24];
                                                    } else if (c10 == 't') {
                                                        if (c15 == 'q' || c15 == 't' || c15 == 'Q' || c15 == 'T') {
                                                            f21 = f29 - f25;
                                                            f22 = f30 - f26;
                                                        } else {
                                                            f22 = 0.0f;
                                                            f21 = 0.0f;
                                                        }
                                                        int i25 = i10 + 1;
                                                        path2.rQuadTo(f21, f22, fArr2[i10], fArr2[i25]);
                                                        float f49 = f21 + f29;
                                                        float f50 = f22 + f30;
                                                        f29 += fArr2[i10];
                                                        f30 += fArr2[i25];
                                                        f26 = f50;
                                                        f25 = f49;
                                                    }
                                                } else {
                                                    c12 = c14;
                                                    f17 = fArr2[i10];
                                                    f18 = fArr2[i10 + 1];
                                                    if (i10 > 0) {
                                                        path2.lineTo(f17, f18);
                                                    } else {
                                                        path2.moveTo(f17, f18);
                                                        f29 = f17;
                                                        f31 = f29;
                                                        f30 = f18;
                                                    }
                                                }
                                                f32 = f30;
                                            } else {
                                                c12 = c14;
                                                int i26 = i10 + 1;
                                                path2.lineTo(fArr2[i10], fArr2[i26]);
                                                f17 = fArr2[i10];
                                                f18 = fArr2[i26];
                                            }
                                            f29 = f17;
                                            f30 = f18;
                                        } else {
                                            c12 = c14;
                                            path2.rLineTo(0.0f, fArr2[i10]);
                                            f16 = fArr2[i10];
                                        }
                                        f30 += f16;
                                    } else {
                                        c11 = c13;
                                        c12 = c14;
                                        int i27 = i10 + 1;
                                        int i28 = i10 + 2;
                                        int i29 = i10 + 3;
                                        path2.rQuadTo(fArr2[i10], fArr2[i27], fArr2[i28], fArr2[i29]);
                                        f13 = fArr2[i10] + f29;
                                        f14 = fArr2[i27] + f30;
                                        f29 += fArr2[i28];
                                        f15 = fArr2[i29];
                                    }
                                    f30 += f15;
                                    f25 = f13;
                                    f26 = f14;
                                } else {
                                    c11 = c13;
                                    c12 = c14;
                                    path2.rLineTo(fArr2[i10], 0.0f);
                                    f29 += fArr2[i10];
                                }
                            } else {
                                z5 = z11;
                                c11 = c13;
                                c12 = c14;
                                int i30 = i10 + 2;
                                int i31 = i10 + 3;
                                int i32 = i10 + 4;
                                int i33 = i10 + 5;
                                path2.rCubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                                float f51 = fArr2[i30] + f29;
                                float f52 = fArr2[i31] + f30;
                                f29 += fArr2[i32];
                                f30 += fArr2[i33];
                                f25 = f51;
                                f26 = f52;
                            }
                            i6 = i10;
                        } else {
                            z5 = z11;
                            c11 = c13;
                            c12 = c14;
                            int i34 = i10 + 5;
                            float f53 = fArr2[i34] + f29;
                            int i35 = i10 + 6;
                            float f54 = fArr2[i35] + f30;
                            float f55 = fArr2[i10];
                            float f56 = fArr2[i10 + 1];
                            float f57 = fArr2[i10 + 2];
                            if (fArr2[i10 + 3] != 0.0f) {
                                f11 = 0.0f;
                                f12 = f30;
                                z9 = z5;
                            } else {
                                f11 = 0.0f;
                                f12 = f30;
                                z9 = z4;
                            }
                            i6 = i10;
                            boolean z12 = fArr2[i10 + 4] != f11 ? z5 : z4;
                            float f58 = f29;
                            drawArc(path, f58, f12, f53, f54, f55, f56, f57, z9, z12);
                            f29 = f58 + fArr2[i34];
                            f30 = f12 + fArr2[i35];
                            f25 = f29;
                            f26 = f30;
                        }
                        f30 = f10;
                    } else {
                        z4 = z10;
                        z5 = z11;
                        c11 = c13;
                        c12 = c14;
                        i6 = i10;
                        int i36 = i6 + 1;
                        int i37 = i6 + 2;
                        int i38 = i6 + 3;
                        path2.quadTo(fArr2[i6], fArr2[i36], fArr2[i37], fArr2[i38]);
                        f3 = fArr2[i6];
                        f7 = fArr2[i36];
                        f29 = fArr2[i37];
                        f30 = fArr2[i38];
                    }
                    f25 = f3;
                    f26 = f7;
                } else {
                    z4 = z10;
                    z5 = z11;
                    c11 = c13;
                    c12 = c14;
                    i6 = i10;
                    path2.lineTo(fArr2[i6], f30);
                    f29 = fArr2[i6];
                }
                i10 = i6 + i4;
                path2 = path;
                c15 = c10;
                z10 = z4;
                z11 = z5;
                c13 = c11;
                c14 = c12;
            }
            fArr[z10 ? 1 : 0] = f29;
            fArr[z11 ? 1 : 0] = f30;
            fArr[c13] = f25;
            fArr[c14] = f26;
            fArr[4] = f31;
            fArr[5] = f32;
        }

        private static void arcToBezier(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
            double d19 = d12;
            int iCeil = (int) Math.ceil(Math.abs((d18 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d16);
            double dSin = Math.sin(d16);
            double dCos2 = Math.cos(d17);
            double dSin2 = Math.sin(d17);
            double d20 = -d19;
            double d21 = d20 * dCos;
            double d22 = d13 * dSin;
            double d23 = (d21 * dSin2) - (d22 * dCos2);
            double d24 = d20 * dSin;
            double d25 = d13 * dCos;
            double d26 = (dCos2 * d25) + (dSin2 * d24);
            double d27 = d18 / ((double) iCeil);
            double d28 = d26;
            double d29 = d23;
            int i = 0;
            double d30 = d14;
            double d31 = d15;
            double d32 = d17;
            while (i < iCeil) {
                double d33 = d32 + d27;
                double dSin3 = Math.sin(d33);
                double dCos3 = Math.cos(d33);
                double d34 = (((d19 * dCos) * dCos3) + d10) - (d22 * dSin3);
                int i4 = i;
                double d35 = (d25 * dSin3) + (d12 * dSin * dCos3) + d11;
                double d36 = (d21 * dSin3) - (d22 * dCos3);
                double d37 = (dCos3 * d25) + (dSin3 * d24);
                double d38 = d33 - d32;
                double dTan = Math.tan(d38 / 2.0d);
                double dSqrt = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d38)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d29 * dSqrt) + d30), (float) ((d28 * dSqrt) + d31), (float) (d34 - (dSqrt * d36)), (float) (d35 - (dSqrt * d37)), (float) d34, (float) d35);
                dSin = dSin;
                d27 = d27;
                d30 = d34;
                d24 = d24;
                dCos = dCos;
                d28 = d37;
                d29 = d36;
                d19 = d12;
                d31 = d35;
                i = i4 + 1;
                iCeil = iCeil;
                d32 = d33;
            }
        }

        private static void drawArc(Path path, float f, float f3, float f7, float f10, float f11, float f12, float f13, boolean z4, boolean z5) {
            double d10;
            double d11;
            double radians = Math.toRadians(f13);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d12 = f;
            double d13 = f3;
            double d14 = f11;
            double d15 = ((d13 * dSin) + (d12 * dCos)) / d14;
            double d16 = f12;
            double d17 = ((d13 * dCos) + (((double) (-f)) * dSin)) / d16;
            double d18 = f10;
            double d19 = ((d18 * dSin) + (((double) f7) * dCos)) / d14;
            double d20 = ((d18 * dCos) + (((double) (-f7)) * dSin)) / d16;
            double d21 = d15 - d19;
            double d22 = d17 - d20;
            double d23 = (d15 + d19) / 2.0d;
            double d24 = (d17 + d20) / 2.0d;
            double d25 = (d22 * d22) + (d21 * d21);
            if (d25 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                Log.w(PathParser.LOGTAG, " Points are coincident");
                return;
            }
            double d26 = (1.0d / d25) - 0.25d;
            if (d26 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                Log.w(PathParser.LOGTAG, "Points are too far apart " + d25);
                float fSqrt = (float) (Math.sqrt(d25) / 1.99999d);
                drawArc(path, f, f3, f7, f10, f11 * fSqrt, fSqrt * f12, f13, z4, z5);
                return;
            }
            double dSqrt = Math.sqrt(d26);
            double d27 = dSqrt * d21;
            double d28 = dSqrt * d22;
            if (z4 == z5) {
                d10 = d23 - d28;
                d11 = d24 + d27;
            } else {
                d10 = d23 + d28;
                d11 = d24 - d27;
            }
            double dAtan2 = Math.atan2(d17 - d11, d15 - d10);
            double dAtan22 = Math.atan2(d20 - d11, d19 - d10) - dAtan2;
            if (z5 != (dAtan22 >= AudioStats.AUDIO_AMPLITUDE_NONE)) {
                dAtan22 = dAtan22 > AudioStats.AUDIO_AMPLITUDE_NONE ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d29 = d10 * d14;
            double d30 = d11 * d16;
            arcToBezier(path, (d29 * dCos) - (d30 * dSin), (d30 * dCos) + (d29 * dSin), d14, d16, d12, d13, radians, dAtan2, dAtan22);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            PathParser.nodesToPath(pathDataNodeArr, path);
        }

        public float[] getParams() {
            return this.mParams;
        }

        public char getType() {
            return this.mType;
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f) {
            this.mType = pathDataNode.mType;
            int i = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i >= fArr.length) {
                    return;
                }
                this.mParams[i] = (pathDataNode2.mParams[i] * f) + ((1.0f - f) * fArr[i]);
                i++;
            }
        }

        public PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f) {
        if (pathDataNodeArr.length == pathDataNodeArr2.length && pathDataNodeArr2.length == pathDataNodeArr3.length) {
            if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
                return false;
            }
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                pathDataNodeArr[i].interpolatePathDataNode(pathDataNodeArr2[i], pathDataNodeArr3[i], f);
            }
            return true;
        }
        throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
    }
}
