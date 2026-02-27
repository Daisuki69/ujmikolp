package org.joda.time.format;

import We.s;
import androidx.media3.datasource.cache.c;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
public class FormatUtils {
    private static final double LOG_10 = Math.log(10.0d);

    private FormatUtils() {
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, int i, int i4) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, i, i4);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, int i) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, i);
        } catch (IOException unused) {
        }
    }

    public static int calculateDigitCount(long j) {
        int iLog;
        if (j < 0) {
            if (j == Long.MIN_VALUE) {
                return 20;
            }
            iLog = calculateDigitCount(-j);
        } else {
            if (j < 10) {
                return 1;
            }
            if (j < 100) {
                return 2;
            }
            if (j < 1000) {
                return 3;
            }
            if (j < 10000) {
                return 4;
            }
            iLog = (int) (Math.log(j) / LOG_10);
        }
        return iLog + 1;
    }

    public static String createErrorMessage(String str, int i) {
        String strConcat = str.length() <= i + 35 ? str : str.substring(0, i + 32).concat("...");
        if (i <= 0) {
            return c.g('\"', "Invalid format: \"", strConcat);
        }
        if (i >= str.length()) {
            return s.j("Invalid format: \"", strConcat, "\" is too short");
        }
        StringBuilder sbW = s.w("Invalid format: \"", strConcat, "\" is malformed at \"");
        sbW.append(strConcat.substring(i));
        sbW.append('\"');
        return sbW.toString();
    }

    public static int parseTwoDigits(CharSequence charSequence, int i) {
        int iCharAt = charSequence.charAt(i) - '0';
        return (charSequence.charAt(i + 1) + ((iCharAt << 3) + (iCharAt << 1))) - 48;
    }

    public static void writePaddedInteger(Writer writer, int i, int i4) throws IOException {
        if (i < 0) {
            writer.write(45);
            if (i == Integer.MIN_VALUE) {
                while (i4 > 10) {
                    writer.write(48);
                    i4--;
                }
                writer.write("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            while (i4 > 1) {
                writer.write(48);
                i4--;
            }
            writer.write(i + 48);
            return;
        }
        if (i >= 100) {
            int iLog = i < 1000 ? 3 : i < 10000 ? 4 : ((int) (Math.log(i) / LOG_10)) + 1;
            while (i4 > iLog) {
                writer.write(48);
                i4--;
            }
            writer.write(Integer.toString(i));
            return;
        }
        while (i4 > 2) {
            writer.write(48);
            i4--;
        }
        int i6 = ((i + 1) * 13421772) >> 27;
        writer.write(i6 + 48);
        writer.write(((i - (i6 << 3)) - (i6 << 1)) + 48);
    }

    public static void writeUnpaddedInteger(Writer writer, int i) throws IOException {
        if (i < 0) {
            writer.write(45);
            if (i == Integer.MIN_VALUE) {
                writer.write("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            writer.write(i + 48);
        } else {
            if (i >= 100) {
                writer.write(Integer.toString(i));
                return;
            }
            int i4 = ((i + 1) * 13421772) >> 27;
            writer.write(i4 + 48);
            writer.write(((i - (i4 << 3)) - (i4 << 1)) + 48);
        }
    }

    public static void appendPaddedInteger(Appendable appendable, int i, int i4) throws IOException {
        if (i < 0) {
            appendable.append('-');
            if (i == Integer.MIN_VALUE) {
                while (i4 > 10) {
                    appendable.append('0');
                    i4--;
                }
                appendable.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            while (i4 > 1) {
                appendable.append('0');
                i4--;
            }
            appendable.append((char) (i + 48));
            return;
        }
        if (i >= 100) {
            int iLog = i < 1000 ? 3 : i < 10000 ? 4 : ((int) (Math.log(i) / LOG_10)) + 1;
            while (i4 > iLog) {
                appendable.append('0');
                i4--;
            }
            appendable.append(Integer.toString(i));
            return;
        }
        while (i4 > 2) {
            appendable.append('0');
            i4--;
        }
        int i6 = ((i + 1) * 13421772) >> 27;
        appendable.append((char) (i6 + 48));
        appendable.append((char) (((i - (i6 << 3)) - (i6 << 1)) + 48));
    }

    public static void appendUnpaddedInteger(Appendable appendable, int i) throws IOException {
        if (i < 0) {
            appendable.append('-');
            if (i == Integer.MIN_VALUE) {
                appendable.append("2147483648");
                return;
            }
            i = -i;
        }
        if (i < 10) {
            appendable.append((char) (i + 48));
        } else {
            if (i >= 100) {
                appendable.append(Integer.toString(i));
                return;
            }
            int i4 = ((i + 1) * 13421772) >> 27;
            appendable.append((char) (i4 + 48));
            appendable.append((char) (((i - (i4 << 3)) - (i4 << 1)) + 48));
        }
    }

    public static void writeUnpaddedInteger(Writer writer, long j) throws IOException {
        int i = (int) j;
        if (i == j) {
            writeUnpaddedInteger(writer, i);
        } else {
            writer.write(Long.toString(j));
        }
    }

    public static void appendUnpaddedInteger(StringBuffer stringBuffer, long j) {
        try {
            appendUnpaddedInteger((Appendable) stringBuffer, j);
        } catch (IOException unused) {
        }
    }

    public static void appendUnpaddedInteger(Appendable appendable, long j) throws IOException {
        int i = (int) j;
        if (i == j) {
            appendUnpaddedInteger(appendable, i);
        } else {
            appendable.append(Long.toString(j));
        }
    }

    public static void writePaddedInteger(Writer writer, long j, int i) throws IOException {
        int i4 = (int) j;
        if (i4 == j) {
            writePaddedInteger(writer, i4, i);
            return;
        }
        if (i <= 19) {
            writer.write(Long.toString(j));
            return;
        }
        if (j < 0) {
            writer.write(45);
            if (j == Long.MIN_VALUE) {
                while (i > 19) {
                    writer.write(48);
                    i--;
                }
                writer.write("9223372036854775808");
                return;
            }
            j = -j;
        }
        int iLog = ((int) (Math.log(j) / LOG_10)) + 1;
        while (i > iLog) {
            writer.write(48);
            i--;
        }
        writer.write(Long.toString(j));
    }

    public static void appendPaddedInteger(StringBuffer stringBuffer, long j, int i) {
        try {
            appendPaddedInteger((Appendable) stringBuffer, j, i);
        } catch (IOException unused) {
        }
    }

    public static void appendPaddedInteger(Appendable appendable, long j, int i) throws IOException {
        int i4 = (int) j;
        if (i4 == j) {
            appendPaddedInteger(appendable, i4, i);
            return;
        }
        if (i <= 19) {
            appendable.append(Long.toString(j));
            return;
        }
        if (j < 0) {
            appendable.append('-');
            if (j == Long.MIN_VALUE) {
                while (i > 19) {
                    appendable.append('0');
                    i--;
                }
                appendable.append("9223372036854775808");
                return;
            }
            j = -j;
        }
        int iLog = ((int) (Math.log(j) / LOG_10)) + 1;
        while (i > iLog) {
            appendable.append('0');
            i--;
        }
        appendable.append(Long.toString(j));
    }
}
