package org.joda.time.format;

import Ef.a;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.Global;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;

/* JADX INFO: loaded from: classes5.dex */
public class ISOPeriodFormat {
    private static PeriodFormatter cAlternate;
    private static PeriodFormatter cAlternateExtended;
    private static PeriodFormatter cAlternateExtendedWihWeeks;
    private static PeriodFormatter cAlternateWithWeeks;
    private static PeriodFormatter cStandard;

    public static PeriodFormatter alternate() {
        if (cAlternate == null) {
            cAlternate = new PeriodFormatterBuilder().appendLiteral(i.m).printZeroAlways().minimumPrintedDigits(4).appendYears().minimumPrintedDigits(2).appendMonths().appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendMinutes().appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternate;
    }

    public static PeriodFormatter alternateExtended() {
        if (cAlternateExtended == null) {
            cAlternateExtended = new PeriodFormatterBuilder().appendLiteral(i.m).printZeroAlways().minimumPrintedDigits(4).appendYears().appendSeparator(Global.HYPHEN).minimumPrintedDigits(2).appendMonths().appendSeparator(Global.HYPHEN).appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendSeparator(Global.COLON).appendMinutes().appendSeparator(Global.COLON).appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternateExtended;
    }

    public static PeriodFormatter alternateExtendedWithWeeks() {
        if (cAlternateExtendedWihWeeks == null) {
            cAlternateExtendedWihWeeks = new PeriodFormatterBuilder().appendLiteral(i.m).printZeroAlways().minimumPrintedDigits(4).appendYears().appendSeparator(Global.HYPHEN).minimumPrintedDigits(2).appendPrefix(ExifInterface.LONGITUDE_WEST).appendWeeks().appendSeparator(Global.HYPHEN).appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendSeparator(Global.COLON).appendMinutes().appendSeparator(Global.COLON).appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternateExtendedWihWeeks;
    }

    public static PeriodFormatter alternateWithWeeks() {
        if (cAlternateWithWeeks == null) {
            cAlternateWithWeeks = new PeriodFormatterBuilder().appendLiteral(i.m).printZeroAlways().minimumPrintedDigits(4).appendYears().minimumPrintedDigits(2).appendPrefix(ExifInterface.LONGITUDE_WEST).appendWeeks().appendDays().appendSeparatorIfFieldsAfter("T").appendHours().appendMinutes().appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternateWithWeeks;
    }

    public static PeriodFormatter standard() {
        if (cStandard == null) {
            cStandard = new PeriodFormatterBuilder().appendLiteral(i.m).appendYears().appendSuffix("Y").appendMonths().appendSuffix("M").appendWeeks().appendSuffix(ExifInterface.LONGITUDE_WEST).appendDays().appendSuffix(a.c).appendSeparatorIfFieldsAfter("T").appendHours().appendSuffix(i.f16182n).appendMinutes().appendSuffix("M").appendSecondsWithOptionalMillis().appendSuffix("S").toFormatter();
        }
        return cStandard;
    }
}
