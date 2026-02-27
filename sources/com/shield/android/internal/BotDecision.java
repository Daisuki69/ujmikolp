package com.shield.android.internal;

import android.util.SparseArray;
import com.paymaya.common.utility.AbstractC1213b;
import java.util.EnumSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class BotDecision {
    public static final BotDecision ACCEPT;
    public static final BotDecision CHALLENGE;
    public static final BotDecision REJECT;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15407d = {1191408143, 608334331, -875078197, 556959611, 1567149120, 969963877};
    private static final SparseArray<BotDecision> fA;
    private static final /* synthetic */ BotDecision[] fC;
    private final int fB;

    static {
        String strG = g("霅震震霁霔霐");
        long[] jArr = f15407d;
        BotDecision botDecision = new BotDecision(strG, ((int) jArr[0]) ^ 1191408143, ((int) jArr[1]) ^ 608334330);
        ACCEPT = botDecision;
        String strG2 = g("霖霁霎霁震霐");
        long[] jArr2 = f15407d;
        BotDecision botDecision2 = new BotDecision(strG2, ((int) jArr2[1]) ^ 608334330, ((int) jArr2[2]) ^ 875078198);
        REJECT = botDecision2;
        String strG3 = g("震霌霅霈霈霁霊霃霁");
        long j = f15407d[3];
        BotDecision botDecision3 = new BotDecision(strG3, ((int) j) ^ 556959609, ((int) j) ^ 556959609);
        CHALLENGE = botDecision3;
        long[] jArr3 = f15407d;
        BotDecision[] botDecisionArr = new BotDecision[((int) jArr3[4]) ^ 1567149123];
        botDecisionArr[((int) jArr3[0]) ^ 1191408143] = botDecision;
        botDecisionArr[((int) jArr3[1]) ^ 608334330] = botDecision2;
        botDecisionArr[((int) jArr3[3]) ^ 556959609] = botDecision3;
        fC = botDecisionArr;
        fA = new SparseArray<>();
        for (BotDecision botDecision4 : EnumSet.allOf(BotDecision.class)) {
            fA.put(botDecision4.getCode(), botDecision4);
        }
    }

    private BotDecision(String str, int i, int i4) {
        this.fB = i4;
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15407d[0]) ^ 1191408143;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15407d;
            long j = jArr[5];
            long j6 = jArr[1];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 969993761) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 969993761) + (((int) j6) ^ 608334330), i4 | (~(((int) j) ^ 969993761)), i6, (((int) j) ^ 969993761) + cCharAt + (((int) j6) ^ 608334330) + ((~(((int) j) ^ 969993761)) | i4)));
            long j7 = f15407d[1];
            int i10 = ~i;
            i = i + (((int) j7) ^ 608334330) + (((int) j7) ^ 608334330) + ((~(((int) j7) ^ 608334330)) | i10) + (((((int) j7) ^ 608334330) + i) - ((((((int) j7) ^ 608334330) + i) + (((int) j7) ^ 608334330)) + ((~(((int) j7) ^ 608334330)) | i10)));
        }
        return sb2.toString();
    }

    public static BotDecision get(int i) {
        return fA.get(i);
    }

    public static BotDecision valueOf(String str) {
        return (BotDecision) Enum.valueOf(BotDecision.class, str);
    }

    public static BotDecision[] values() {
        return (BotDecision[]) fC.clone();
    }

    public final int getCode() {
        return this.fB;
    }
}
