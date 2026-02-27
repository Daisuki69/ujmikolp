package x4;

import androidx.room.RoomMasterTable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public enum e implements InterfaceC2466c {
    /* JADX INFO: Fake field, exist only in values array */
    TAG_01_ALIAS("01", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_02_MAID("02", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_03_PFID("03", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_04_MARKET_SPECIFIC_ALIAS("04", "^.{1,73}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_05_MASTERCARD_DATA_SUB_TAG("05", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_06_MASTERCARD_DATA_SUB_TAG("06", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_07_MASTERCARD_DATA_SUB_TAG("07", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_08_MASTERCARD_DATA_SUB_TAG("08", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_09_MASTERCARD_DATA_SUB_TAG("09", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_10_MASTERCARD_DATA_SUB_TAG("10", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_11_MASTERCARD_DATA_SUB_TAG("11", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_12_MASTERCARD_DATA_SUB_TAG("12", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_13_MASTERCARD_DATA_SUB_TAG("13", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_14_MASTERCARD_DATA_SUB_TAG("14", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_15_MASTERCARD_DATA_SUB_TAG("15", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_16_MASTERCARD_DATA_SUB_TAG("16", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_17_MASTERCARD_DATA_SUB_TAG("17", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_18_MASTERCARD_DATA_SUB_TAG("18", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_19_MASTERCARD_DATA_SUB_TAG("19", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_20_MASTERCARD_DATA_SUB_TAG("20", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_21_MASTERCARD_DATA_SUB_TAG("21", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_22_MASTERCARD_DATA_SUB_TAG("22", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_23_MASTERCARD_DATA_SUB_TAG("23", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_24_MASTERCARD_DATA_SUB_TAG("24", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_25_MASTERCARD_DATA_SUB_TAG("25", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_26_MASTERCARD_DATA_SUB_TAG("26", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_27_MASTERCARD_DATA_SUB_TAG("27", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_28_MASTERCARD_DATA_SUB_TAG("28", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_29_MASTERCARD_DATA_SUB_TAG("29", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_30_MASTERCARD_DATA_SUB_TAG("30", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_31_MASTERCARD_DATA_SUB_TAG("31", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_32_MASTERCARD_DATA_SUB_TAG("32", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_33_MASTERCARD_DATA_SUB_TAG("33", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_34_MASTERCARD_DATA_SUB_TAG("34", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_35_MASTERCARD_DATA_SUB_TAG("35", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_36_MASTERCARD_DATA_SUB_TAG("36", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_37_MASTERCARD_DATA_SUB_TAG("37", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_38_MASTERCARD_DATA_SUB_TAG("38", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_39_MASTERCARD_DATA_SUB_TAG("39", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_40_MASTERCARD_DATA_SUB_TAG("40", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_41_MASTERCARD_DATA_SUB_TAG("41", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_42_MASTERCARD_DATA_SUB_TAG(RoomMasterTable.DEFAULT_ID, "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_43_MASTERCARD_DATA_SUB_TAG("43", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_44_MASTERCARD_DATA_SUB_TAG("44", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_45_MASTERCARD_DATA_SUB_TAG("45", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_46_MASTERCARD_DATA_SUB_TAG("46", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_47_MASTERCARD_DATA_SUB_TAG("47", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_48_MASTERCARD_DATA_SUB_TAG("48", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_49_MASTERCARD_DATA_SUB_TAG("49", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_50_MASTERCARD_DATA_SUB_TAG("50", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_51_MASTERCARD_DATA_SUB_TAG("51", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_52_MASTERCARD_DATA_SUB_TAG("52", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_53_MASTERCARD_DATA_SUB_TAG("53", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_54_MASTERCARD_DATA_SUB_TAG("54", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_55_MASTERCARD_DATA_SUB_TAG("55", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_56_MASTERCARD_DATA_SUB_TAG("56", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_57_MASTERCARD_DATA_SUB_TAG("57", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_58_MASTERCARD_DATA_SUB_TAG("58", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_59_MASTERCARD_DATA_SUB_TAG("59", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_60_MASTERCARD_DATA_SUB_TAG("60", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_61_MASTERCARD_DATA_SUB_TAG("61", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_62_MASTERCARD_DATA_SUB_TAG("62", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_63_MASTERCARD_DATA_SUB_TAG("63", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_64_MASTERCARD_DATA_SUB_TAG("64", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_65_MASTERCARD_DATA_SUB_TAG("65", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_66_MASTERCARD_DATA_SUB_TAG("66", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_67_MASTERCARD_DATA_SUB_TAG("67", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_68_MASTERCARD_DATA_SUB_TAG("68", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_69_MASTERCARD_DATA_SUB_TAG("69", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_70_MASTERCARD_DATA_SUB_TAG("70", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_71_MASTERCARD_DATA_SUB_TAG("71", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_72_MASTERCARD_DATA_SUB_TAG("72", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_73_MASTERCARD_DATA_SUB_TAG("73", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_74_MASTERCARD_DATA_SUB_TAG("74", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_75_MASTERCARD_DATA_SUB_TAG("75", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_76_MASTERCARD_DATA_SUB_TAG("76", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_77_MASTERCARD_DATA_SUB_TAG("77", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_78_MASTERCARD_DATA_SUB_TAG("78", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_79_MASTERCARD_DATA_SUB_TAG("79", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_80_MASTERCARD_DATA_SUB_TAG("80", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_81_MASTERCARD_DATA_SUB_TAG("81", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_82_MASTERCARD_DATA_SUB_TAG("82", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_83_MASTERCARD_DATA_SUB_TAG("83", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_84_MASTERCARD_DATA_SUB_TAG("84", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_85_MASTERCARD_DATA_SUB_TAG("85", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_86_MASTERCARD_DATA_SUB_TAG("86", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_87_MASTERCARD_DATA_SUB_TAG("87", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_88_MASTERCARD_DATA_SUB_TAG("88", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_89_MASTERCARD_DATA_SUB_TAG("89", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_90_MASTERCARD_DATA_SUB_TAG(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f16095W0, "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_91_MASTERCARD_DATA_SUB_TAG("91", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_92_MASTERCARD_DATA_SUB_TAG("92", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_93_MASTERCARD_DATA_SUB_TAG("93", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_94_MASTERCARD_DATA_SUB_TAG("94", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_95_MASTERCARD_DATA_SUB_TAG("95", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_96_MASTERCARD_DATA_SUB_TAG("96", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_97_MASTERCARD_DATA_SUB_TAG("97", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_98_MASTERCARD_DATA_SUB_TAG("98", "^.{1,25}$"),
    /* JADX INFO: Fake field, exist only in values array */
    TAG_99_MASTERCARD_DATA_SUB_TAG("99", "^.{1,25}$");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f20916b;

    e(String str, String str2) {
        this.f20916b = null;
        this.f20915a = str;
        this.f20916b = Pattern.compile(str2);
    }

    @Override // x4.InterfaceC2466c
    public final String getTag() {
        return this.f20915a;
    }

    @Override // x4.InterfaceC2466c
    public final boolean m() {
        return false;
    }

    @Override // x4.InterfaceC2466c
    public final Pattern r() {
        return this.f20916b;
    }
}
