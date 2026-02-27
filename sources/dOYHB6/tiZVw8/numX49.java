package dOYHB6.tiZVw8;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import dOYHB6.dhgju5;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.speLp8.ilLni8;
import dOYHB6.spsrN3.jHyoO3;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class numX49 {
    private static int GZCcwJ;
    private static int JsBPwb;
    private static int LgnYXB;
    private static Map<Character, Integer> MSHrnp = null;
    private static final String TAG = numX49.class.getName();
    private static int jOnekN;
    private Map<String, String> gymXfx;
    private Map<String, byte[]> wKpszA;

    private static class qwWbG7 {
        private static final numX49 iIDgLC = new numX49();

        private qwWbG7() {
        }

        public static numX49 getInstance() {
            return iIDgLC;
        }
    }

    static {
        ilLni8.d8ErU0();
    }

    private numX49() {
        this.wKpszA = dhgju5.s3BdS0.ekoM83();
        this.gymXfx = dhgju5.s3BdS0.ekoM83();
        MSHrnp = dhgju5.s3BdS0.ekoM83();
        kCyn35();
    }

    private String cQFqw9(String str) {
        int i = (LgnYXB - GZCcwJ) - 2;
        int iFlRHO7 = ((int) flRHO7(dhgju5.w0rgj5.nVRnM1(str, (GZCcwJ / 2) - 2, i))) + i;
        int iFlRHO72 = (int) flRHO7(dhgju5.w0rgj5.nVRnM1(str, iFlRHO7));
        byte[] bArrW7YFq9 = w7YFq9(dhgju5.w0rgj5.nVRnM1(str, i, iFlRHO7));
        return new String(bArrW7YFq9, sGmT18(str, 0, bArrW7YFq9) + (LgnYXB - 3) + sGmT18(str, ((iFlRHO72 - 1) * GZCcwJ) + GZCcwJ, bArrW7YFq9) + 4, sGmT18(str, r1, bArrW7YFq9) - 1, StandardCharsets.UTF_8);
    }

    private long flRHO7(String str) {
        int i = jOnekN;
        long jIntValue = 0;
        for (char c : dhgju5.w0rgj5.nfd4k1(str)) {
            jIntValue = (jIntValue * ((long) i)) + ((long) ((Integer) dhgju5.s3BdS0.wEbX23(MSHrnp, Character.valueOf(c))).intValue());
        }
        return jIntValue;
    }

    private void kCyn35() {
        String[] strArrAI4Yd9 = dhgju5.w0rgj5.aI4Yd9(fChUQ4.d8uzX8(), ",");
        GZCcwJ = Integer.parseInt(strArrAI4Yd9[Integer.parseInt("0")]);
        LgnYXB = Integer.parseInt(strArrAI4Yd9[Integer.parseInt(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)]);
        JsBPwb = Integer.parseInt(strArrAI4Yd9[Integer.parseInt(ExifInterface.GPS_MEASUREMENT_2D)]);
        jOnekN = Integer.parseInt(strArrAI4Yd9[Integer.parseInt(ExifInterface.GPS_MEASUREMENT_3D)]);
        String str = strArrAI4Yd9[Integer.parseInt("4")];
        for (int i = 0; i < jOnekN; i++) {
            dhgju5.s3BdS0.dbht22(MSHrnp, Character.valueOf(str.charAt(i)), Integer.valueOf(i));
        }
    }

    private int sGmT18(String str, int i, byte[] bArr) {
        if (bArr == null) {
            return i;
        }
        int length = bArr.length;
        return (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    private String tcluK0(String str) {
        if (dhgju5.s3BdS0.m2aSD3(this.gymXfx, str)) {
            return (String) dhgju5.s3BdS0.wEbX23(this.gymXfx, str);
        }
        String strIntern = jHyoO3.uLZH83(cQFqw9(str)).intern();
        dhgju5.s3BdS0.dbht22(this.gymXfx, str, strIntern);
        return strIntern;
    }

    public static String tnTj78(String str) {
        return qwWbG7.getInstance().tcluK0(str);
    }

    private byte[] w7YFq9(String str) {
        if (dhgju5.s3BdS0.m2aSD3(this.wKpszA, str)) {
            return (byte[]) dhgju5.s3BdS0.wEbX23(this.wKpszA, str);
        }
        byte[] bArrLLocO2 = fChUQ4.lLocO2();
        dhgju5.s3BdS0.dbht22(this.wKpszA, str, bArrLLocO2);
        return bArrLLocO2;
    }
}
