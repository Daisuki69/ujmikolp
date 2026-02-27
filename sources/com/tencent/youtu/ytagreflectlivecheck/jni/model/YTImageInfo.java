package com.tencent.youtu.ytagreflectlivecheck.jni.model;

import android.util.Base64;
import com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectImage;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class YTImageInfo {
    public String checksum;
    public ArrayList<Float> five_points;
    public String image;

    public YTImageInfo(YTActReflectImage yTActReflectImage) {
        this.image = new String(Base64.encode(yTActReflectImage.image, 2));
        this.checksum = yTActReflectImage.checksum;
        ArrayList<Float> arrayList = new ArrayList<>();
        this.five_points = arrayList;
        float[] fArr = yTActReflectImage.xys;
        if (fArr != null) {
            arrayList.add(Float.valueOf(fArr[176]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[177]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[178]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[179]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[64]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[65]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[90]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[91]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[102]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[103]));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0057 A[Catch: Exception -> 0x0033, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0033, blocks: (B:17:0x002f, B:42:0x0057), top: B:68:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.OutputStream] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x005b -> B:60:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void createFileWithByte(java.lang.String r3, byte[] r4) throws java.lang.Throwable {
        /*
            r2 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r3 = 0
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L12
            if (r1 == 0) goto L14
            r0.delete()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L12
            goto L14
        L10:
            r4 = move-exception
            goto L43
        L12:
            r4 = move-exception
            goto L45
        L14:
            r0.createNewFile()     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L12
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L12
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L10 java.lang.Exception -> L12
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            r0.write(r4)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r0.flush()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r1.close()     // Catch: java.io.IOException -> L2b
            goto L2f
        L2b:
            r3 = move-exception
            r3.printStackTrace()
        L2f:
            r0.close()     // Catch: java.lang.Exception -> L33
            goto L5e
        L33:
            r3 = move-exception
            goto L5b
        L35:
            r3 = move-exception
            goto L5f
        L37:
            r3 = move-exception
            goto L48
        L39:
            r4 = move-exception
            goto L3d
        L3b:
            r4 = move-exception
            goto L40
        L3d:
            r0 = r3
        L3e:
            r3 = r1
            goto L61
        L40:
            r0 = r3
        L41:
            r3 = r4
            goto L48
        L43:
            r0 = r3
            goto L61
        L45:
            r0 = r3
            r1 = r0
            goto L41
        L48:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L55
            r1.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r3 = move-exception
            r3.printStackTrace()
        L55:
            if (r0 == 0) goto L5e
            r0.close()     // Catch: java.lang.Exception -> L33
            goto L5e
        L5b:
            r3.printStackTrace()
        L5e:
            return
        L5f:
            r4 = r3
            goto L3e
        L61:
            if (r3 == 0) goto L6b
            r3.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r3 = move-exception
            r3.printStackTrace()
        L6b:
            if (r0 == 0) goto L75
            r0.close()     // Catch: java.lang.Exception -> L71
            goto L75
        L71:
            r3 = move-exception
            r3.printStackTrace()
        L75:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.youtu.ytagreflectlivecheck.jni.model.YTImageInfo.createFileWithByte(java.lang.String, byte[]):void");
    }
}
