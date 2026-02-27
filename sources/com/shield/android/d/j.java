package com.shield.android.d;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.paymaya.common.utility.AbstractC1213b;

/* JADX INFO: loaded from: classes4.dex */
public final class j {
    private static TelephonyManager gC;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15215d = {304910533, 898872227, 816550441, 625420353, 1112996174, 1450473760, 1424893549};
    public static final j gI = new j();

    private j() {
    }

    public static void a(Context context, PhoneStateListener phoneStateListener) {
        kotlin.jvm.internal.j.g(context, d("ᦝ貐䘑⍋ᇺ袷쐓"));
        kotlin.jvm.internal.j.g(phoneStateListener, d("ᦒ貖䘌⍋ᇺ袡쐂\ue241"));
        if (gC == null) {
            Object systemService = context.getSystemService(d("ᦎ貗䘐⍑ᇺ"));
            kotlin.jvm.internal.j.e(systemService, d("ᦐ貊䘓⍓ᆿ袬쐆\ue25d煷㣣ᰲ踃䝳ꏭ퇤\ue881\uf410穋㵨Ắ༳ߌϱ膆䂛—တࡰѺ艫䅯ꂡ퀴桙둠婭괤훣欯뗄\udaa2洇㛝ᬾ趃䚢ꌎ퇙\ue8bf\uf41d穞㵴ợ輿잍掅농墘Ⱏᙍ୶נ芩䄚\u20fc္衂쑷\ue26c煠㣰"));
            gC = (TelephonyManager) systemService;
        }
        TelephonyManager telephonyManager = gC;
        if (telephonyManager != null) {
            telephonyManager.listen(phoneStateListener, ((int) f15215d[0]) ^ 304910565);
        }
    }

    public static String d(String str) {
        int i = ((int) f15215d[2]) ^ 816554452;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15215d[1]) ^ 898872227;
        while (i4 < str.length()) {
            long[] jArr = f15215d;
            int i6 = (((i >> (((int) jArr[1]) ^ 898872227)) ^ (i >> (((int) jArr[3]) ^ 625420355))) ^ (i >> (((int) jArr[4]) ^ 1112996173))) ^ (i >> 5);
            long j = jArr[5];
            i = (char) ((i >> (((int) j) ^ 1450473761)) | (((char) (i6 & (((int) j) ^ 1450473761))) << (((int) jArr[6]) ^ 1424893538)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15215d[5];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 1450473761, i11, i10, (((int) j6) ^ 1450473761) + i10 + i11));
            long j7 = f15215d[5];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 1450473761) + (((int) j7) ^ 1450473761) + ((~(((int) j7) ^ 1450473761)) | i12) + (((((int) j7) ^ 1450473761) + i4) - ((((((int) j7) ^ 1450473761) + i4) + (((int) j7) ^ 1450473761)) + ((~(((int) j7) ^ 1450473761)) | i12)));
        }
        return sb2.toString();
    }

    public static void a(PhoneStateListener phoneStateListener) {
        kotlin.jvm.internal.j.g(phoneStateListener, d("ᦒ貖䘌⍋ᇺ袡쐂\ue241"));
        TelephonyManager telephonyManager = gC;
        if (telephonyManager != null) {
            telephonyManager.listen(phoneStateListener, ((int) f15215d[1]) ^ 898872227);
        }
        gC = null;
    }
}
