package mx_android.support.v4.text;

import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class BidiFormatter {
    private static final int DEFAULT_FLAGS = 2;
    private static final int DIR_LTR = -1;
    private static final int DIR_RTL = 1;
    private static final int DIR_UNKNOWN = 0;
    private static final String EMPTY_STRING = "";
    private static final int FLAG_STEREO_RESET = 2;
    private static final char LRE = 8234;
    private static final char PDF = 8236;
    private static final char RLE = 8235;
    private final TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
    private final int mFlags;
    private final boolean mIsRtlContext;
    private static TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
    private static final char LRM = 8206;
    private static final String LRM_STRING = Character.toString(LRM);
    private static final char RLM = 8207;
    private static final String RLM_STRING = Character.toString(RLM);
    private static final BidiFormatter DEFAULT_LTR_INSTANCE = new BidiFormatter(false, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);
    private static final BidiFormatter DEFAULT_RTL_INSTANCE = new BidiFormatter(true, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);

    public static final class Builder {
        private int mFlags;
        private boolean mIsRtlContext;
        private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;

        public Builder() {
            initialize(BidiFormatter.isRtlLocale(Locale.getDefault()));
        }

        public Builder(boolean z4) {
            initialize(z4);
        }

        public Builder(Locale locale) {
            initialize(BidiFormatter.isRtlLocale(locale));
        }

        private void initialize(boolean z4) {
            this.mIsRtlContext = z4;
            this.mTextDirectionHeuristicCompat = BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC;
            this.mFlags = 2;
        }

        public Builder stereoReset(boolean z4) {
            if (z4) {
                this.mFlags |= 2;
            } else {
                this.mFlags &= -3;
            }
            return this;
        }

        public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
            this.mTextDirectionHeuristicCompat = textDirectionHeuristicCompat;
            return this;
        }

        private static BidiFormatter getDefaultInstanceFromContext(boolean z4) {
            return z4 ? BidiFormatter.DEFAULT_RTL_INSTANCE : BidiFormatter.DEFAULT_LTR_INSTANCE;
        }

        public BidiFormatter build() {
            if (this.mFlags == 2 && this.mTextDirectionHeuristicCompat == BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC) {
                return getDefaultInstanceFromContext(this.mIsRtlContext);
            }
            return new BidiFormatter(this.mIsRtlContext, this.mFlags, this.mTextDirectionHeuristicCompat);
        }
    }

    public static BidiFormatter getInstance() {
        return new Builder().build();
    }

    public static BidiFormatter getInstance(boolean z4) {
        return new Builder(z4).build();
    }

    public static BidiFormatter getInstance(Locale locale) {
        return new Builder(locale).build();
    }

    private BidiFormatter(boolean z4, int i, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.mIsRtlContext = z4;
        this.mFlags = i;
        this.mDefaultTextDirectionHeuristicCompat = textDirectionHeuristicCompat;
    }

    public boolean isRtlContext() {
        return this.mIsRtlContext;
    }

    public boolean getStereoReset() {
        return (this.mFlags & 2) != 0;
    }

    private String markAfter(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean zIsRtl = textDirectionHeuristicCompat.isRtl(str, 0, str.length());
        if (this.mIsRtlContext || !(zIsRtl || getExitDir(str) == 1)) {
            return this.mIsRtlContext ? (!zIsRtl || getExitDir(str) == -1) ? RLM_STRING : "" : "";
        }
        return LRM_STRING;
    }

    private String markBefore(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean zIsRtl = textDirectionHeuristicCompat.isRtl(str, 0, str.length());
        if (this.mIsRtlContext || !(zIsRtl || getEntryDir(str) == 1)) {
            return this.mIsRtlContext ? (!zIsRtl || getEntryDir(str) == -1) ? RLM_STRING : "" : "";
        }
        return LRM_STRING;
    }

    public boolean isRtl(String str) {
        return this.mDefaultTextDirectionHeuristicCompat.isRtl(str, 0, str.length());
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z4) {
        boolean zIsRtl = textDirectionHeuristicCompat.isRtl(str, 0, str.length());
        StringBuilder sb2 = new StringBuilder();
        if (getStereoReset() && z4) {
            sb2.append(markBefore(str, zIsRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR));
        }
        if (zIsRtl != this.mIsRtlContext) {
            sb2.append(zIsRtl ? RLE : LRE);
            sb2.append(str);
            sb2.append(PDF);
        } else {
            sb2.append(str);
        }
        if (z4) {
            sb2.append(markAfter(str, zIsRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR));
        }
        return sb2.toString();
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        return unicodeWrap(str, textDirectionHeuristicCompat, true);
    }

    public String unicodeWrap(String str, boolean z4) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, z4);
    }

    public String unicodeWrap(String str) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isRtlLocale(Locale locale) {
        return TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1;
    }

    private static int getExitDir(String str) {
        return new DirectionalityEstimator(str, false).getExitDir();
    }

    private static int getEntryDir(String str) {
        return new DirectionalityEstimator(str, false).getEntryDir();
    }

    private static class DirectionalityEstimator {
        private int charIndex;
        private final boolean isHtml;
        private char lastChar;
        private final int length;
        private final String text;
        private static final int DIR_TYPE_CACHE_SIZE = 1792;
        private static final byte[] DIR_TYPE_CACHE = new byte[DIR_TYPE_CACHE_SIZE];

        static {
            for (int i = 0; i < DIR_TYPE_CACHE_SIZE; i++) {
                DIR_TYPE_CACHE[i] = Character.getDirectionality(i);
            }
        }

        DirectionalityEstimator(String str, boolean z4) {
            this.text = str;
            this.isHtml = z4;
            this.length = str.length();
        }

        int getEntryDir() {
            this.charIndex = 0;
            int i = 0;
            int i4 = 0;
            int i6 = 0;
            while (this.charIndex < this.length && i == 0) {
                byte bDirTypeForward = dirTypeForward();
                if (bDirTypeForward != 0) {
                    if (bDirTypeForward == 1 || bDirTypeForward == 2) {
                        if (i6 == 0) {
                            return 1;
                        }
                    } else if (bDirTypeForward != 9) {
                        switch (bDirTypeForward) {
                            case 14:
                            case 15:
                                i6++;
                                i4 = -1;
                                continue;
                            case 16:
                            case 17:
                                i6++;
                                i4 = 1;
                                continue;
                            case 18:
                                i6--;
                                i4 = 0;
                                continue;
                        }
                    }
                } else if (i6 == 0) {
                    return -1;
                }
                i = i6;
            }
            if (i == 0) {
                return 0;
            }
            if (i4 != 0) {
                return i4;
            }
            while (this.charIndex > 0) {
                switch (dirTypeBackward()) {
                    case 14:
                    case 15:
                        if (i == i6) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i6) {
                            return 1;
                        }
                        break;
                    case 18:
                        i6++;
                        continue;
                }
                i6--;
            }
            return 0;
        }

        int getExitDir() {
            this.charIndex = this.length;
            int i = 0;
            int i4 = 0;
            while (this.charIndex > 0) {
                byte bDirTypeBackward = dirTypeBackward();
                if (bDirTypeBackward == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i4 == 0) {
                        i4 = i;
                    }
                } else if (bDirTypeBackward == 1 || bDirTypeBackward == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i4 == 0) {
                        i4 = i;
                    }
                } else if (bDirTypeBackward != 9) {
                    switch (bDirTypeBackward) {
                        case 14:
                        case 15:
                            if (i4 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i4 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i4 == 0) {
                                i4 = i;
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }

        private static byte getCachedDirectionality(char c) {
            return c < DIR_TYPE_CACHE_SIZE ? DIR_TYPE_CACHE[c] : Character.getDirectionality(c);
        }

        byte dirTypeForward() {
            char cCharAt = this.text.charAt(this.charIndex);
            this.lastChar = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.text, this.charIndex);
                this.charIndex += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.charIndex++;
            byte cachedDirectionality = getCachedDirectionality(this.lastChar);
            if (!this.isHtml) {
                return cachedDirectionality;
            }
            char c = this.lastChar;
            if (c == '<') {
                return skipTagForward();
            }
            return c == '&' ? skipEntityForward() : cachedDirectionality;
        }

        byte dirTypeBackward() {
            char cCharAt = this.text.charAt(this.charIndex - 1);
            this.lastChar = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.text, this.charIndex);
                this.charIndex -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.charIndex--;
            byte cachedDirectionality = getCachedDirectionality(this.lastChar);
            if (!this.isHtml) {
                return cachedDirectionality;
            }
            char c = this.lastChar;
            if (c == '>') {
                return skipTagBackward();
            }
            return c == ';' ? skipEntityBackward() : cachedDirectionality;
        }

        private byte skipTagForward() {
            char cCharAt;
            int i = this.charIndex;
            while (true) {
                int i4 = this.charIndex;
                if (i4 < this.length) {
                    String str = this.text;
                    this.charIndex = i4 + 1;
                    char cCharAt2 = str.charAt(i4);
                    this.lastChar = cCharAt2;
                    if (cCharAt2 == '>') {
                        return (byte) 12;
                    }
                    if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                        do {
                            int i6 = this.charIndex;
                            if (i6 < this.length) {
                                String str2 = this.text;
                                this.charIndex = i6 + 1;
                                cCharAt = str2.charAt(i6);
                                this.lastChar = cCharAt;
                            }
                        } while (cCharAt != cCharAt2);
                    }
                } else {
                    this.charIndex = i;
                    this.lastChar = '<';
                    return (byte) 13;
                }
            }
        }

        private byte skipTagBackward() {
            char cCharAt;
            int i = this.charIndex;
            while (true) {
                int i4 = this.charIndex;
                if (i4 <= 0) {
                    break;
                }
                String str = this.text;
                int i6 = i4 - 1;
                this.charIndex = i6;
                char cCharAt2 = str.charAt(i6);
                this.lastChar = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i10 = this.charIndex;
                        if (i10 > 0) {
                            String str2 = this.text;
                            int i11 = i10 - 1;
                            this.charIndex = i11;
                            cCharAt = str2.charAt(i11);
                            this.lastChar = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.charIndex = i;
            this.lastChar = '>';
            return (byte) 13;
        }

        private byte skipEntityForward() {
            char cCharAt;
            do {
                int i = this.charIndex;
                if (i >= this.length) {
                    return (byte) 12;
                }
                String str = this.text;
                this.charIndex = i + 1;
                cCharAt = str.charAt(i);
                this.lastChar = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte skipEntityBackward() {
            char cCharAt;
            int i = this.charIndex;
            do {
                int i4 = this.charIndex;
                if (i4 <= 0) {
                    break;
                }
                String str = this.text;
                int i6 = i4 - 1;
                this.charIndex = i6;
                cCharAt = str.charAt(i6);
                this.lastChar = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.charIndex = i;
            this.lastChar = ';';
            return (byte) 13;
        }
    }
}
