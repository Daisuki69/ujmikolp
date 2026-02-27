package x4;

import androidx.room.RoomMasterTable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public enum f implements InterfaceC2466c {
    f20917d("00", "^\\d{2}$", true),
    e("01", "^\\d{2}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("02", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("03", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("04", "^\\d+$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("05", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("06", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("07", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("08", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("09", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("10", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("11", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("12", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF13("13", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("14", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("15", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF16("16", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF17("17", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF18("18", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF19("19", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF20("20", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("21", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF22("22", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF23("23", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF24("24", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF25("25", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF26("26", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("27", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF28("28", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF29("29", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF30("30", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF31("31", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF32("32", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("33", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF34("34", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF35("35", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF36("36", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF37("37", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF38("38", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF39("39", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF40("40", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF41("41", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF42(RoomMasterTable.DEFAULT_ID, null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF43("43", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF44("44", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("45", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF46("46", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF47("47", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF48("48", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF49("49", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF50("50", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF51("51", null, false),
    f("52", "^\\d{4}$", true),
    f20918g("53", "^\\d{3}$", true),
    h("54", "^(?!.{14,})((\\d+)(\\.\\d*)?)$", false),
    i("55", "^(01|02|03)$", false),
    j("56", "^(?!.{14,})(\\d+(\\.\\d*)?)$", false),
    f20919k("57", "^(?!.{6,})0*(\\d{1,2}(\\.\\d*)?|100)$", false),
    f20920l("58", "^[a-zA-Z]{2}$", true),
    m("59", "^.{1,25}$", true),
    f20921n("60", "^.{1,15}$", true),
    f20922o("61", "^.{1,10}$", false),
    f20923p("62", "^.{1,99}$", false),
    f20924q("64", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF64("65", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF65("66", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF66("67", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF67("68", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF68("69", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF69("70", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF70("71", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF71("72", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF72("73", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF73("74", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF74("75", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF75("76", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF76("77", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF77("78", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF78("79", null, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF79("80", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF80("81", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF81("82", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF82("83", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF83("84", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF84("85", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF85("86", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF86("87", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF87("88", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF88("89", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF89(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f16095W0, "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF90("91", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF91("92", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF92("93", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF93("94", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF94("95", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF95("96", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF96("97", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF97("98", "^.{1,99}$", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF98("99", "^.{1,99}$", false),
    f20925r("63", "^.{4}$", false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f20928b;
    public final boolean c;

    f(String str, String str2, boolean z4) {
        this.f20928b = null;
        this.f20927a = str;
        this.c = z4;
        if (str2 != null) {
            this.f20928b = Pattern.compile(str2);
        }
    }

    @Override // x4.InterfaceC2466c
    public final String getTag() {
        return this.f20927a;
    }

    @Override // x4.InterfaceC2466c
    public final boolean m() {
        return this.c;
    }

    @Override // x4.InterfaceC2466c
    public final Pattern r() {
        return this.f20928b;
    }
}
