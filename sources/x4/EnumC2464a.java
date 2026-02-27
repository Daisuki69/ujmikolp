package x4;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: x4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2464a implements InterfaceC2466c {
    /* JADX INFO: Fake field, exist only in values array */
    TAG_00("00", "^.{1,32}$"),
    TAG_01_BILL_NUMBER("01", "^.{1,26}$"),
    TAG_02_MOBILE_NUMBER("02", "^.{1,26}$"),
    TAG_03_STORE_ID("03", "^.{1,26}$"),
    TAG_04_LOYALTY_NUMBER("04", "^.{1,26}$"),
    TAG_05_REFERENCE_ID("05", "^.{1,26}$"),
    TAG_06_CONSUMER_ID("06", "^.{1,26}$"),
    TAG_07_TERMINAL_ID("07", "^.{1,26}$"),
    TAG_08_PURPOSE("08", "^.{1,26}$"),
    TAG_09_ADDITIONAL_CONSUMER_DATA_REQUEST("09", "(?i)^(?!.?(.).?\\1)[AEM]?[AEM][AEM]?$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_10_MERCHANT_TAX_ID("10", "^.{1,20}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_11_MERCHANT_CHANNEL("11", "^.{1,3}$");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f20908b;

    EnumC2464a(String str, String str2) {
        this.f20908b = null;
        this.f20907a = str;
        this.f20908b = Pattern.compile(str2);
    }

    @Override // x4.InterfaceC2466c
    public final String getTag() {
        return this.f20907a;
    }

    @Override // x4.InterfaceC2466c
    public final boolean m() {
        return false;
    }

    @Override // x4.InterfaceC2466c
    public final Pattern r() {
        return this.f20908b;
    }
}
