package K3;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    Cp437(new int[]{0, 2}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_2(new String[]{"ISO-8859-2"}, 4),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_3(new String[]{"ISO-8859-3"}, 5),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_4(new String[]{"ISO-8859-4"}, 6),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_5(new String[]{"ISO-8859-5"}, 7),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_6(new String[]{"ISO-8859-6"}, 8),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_7(new String[]{"ISO-8859-7"}, 9),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_8(new String[]{"ISO-8859-8"}, 10),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_9(new String[]{"ISO-8859-9"}, 11),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_10(new String[]{"ISO-8859-10"}, 12),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_11(new String[]{"ISO-8859-11"}, 13),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_13(new String[]{"ISO-8859-13"}, 15),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_14(new String[]{"ISO-8859-14"}, 16),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_15(new String[]{"ISO-8859-15"}, 17),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_16(new String[]{"ISO-8859-16"}, 18),
    /* JADX INFO: Fake field, exist only in values array */
    SJIS(new String[]{"Shift_JIS"}, 20),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1250(new String[]{"windows-1250"}, 21),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1251(new String[]{"windows-1251"}, 22),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1252(new String[]{"windows-1252"}, 23),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1256(new String[]{"windows-1256"}, 24),
    /* JADX INFO: Fake field, exist only in values array */
    UnicodeBigUnmarked(new String[]{"UTF-16BE", "UnicodeBig"}, 25),
    /* JADX INFO: Fake field, exist only in values array */
    UTF8(new String[]{"UTF-8"}, 26),
    /* JADX INFO: Fake field, exist only in values array */
    ASCII(new int[]{27, 170}, "US-ASCII"),
    /* JADX INFO: Fake field, exist only in values array */
    Big5(new int[]{28}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    GB18030(new String[]{"GB2312", "EUC_CN", "GBK"}, 29),
    /* JADX INFO: Fake field, exist only in values array */
    EUC_KR(new String[]{"EUC-KR"}, 30);

    public static final HashMap c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f2592d = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f2593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f2594b;

    static {
        for (c cVar : values()) {
            for (int i : cVar.f2593a) {
                c.put(Integer.valueOf(i), cVar);
            }
            f2592d.put(cVar.name(), cVar);
            for (String str : cVar.f2594b) {
                f2592d.put(str, cVar);
            }
        }
    }

    c(String[] strArr, int i) {
        this.f2593a = new int[]{i};
        this.f2594b = strArr;
    }

    c(int[] iArr, String... strArr) {
        this.f2593a = iArr;
        this.f2594b = strArr;
    }
}
