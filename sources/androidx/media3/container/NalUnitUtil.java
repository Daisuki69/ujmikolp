package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.camera.core.impl.a;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    private static final int H264_NAL_UNIT_TYPE_SEI = 6;
    private static final int H264_NAL_UNIT_TYPE_SPS = 7;
    private static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    public static final int NAL_UNIT_TYPE_AUD = 9;
    public static final int NAL_UNIT_TYPE_IDR = 5;
    public static final int NAL_UNIT_TYPE_NON_IDR = 1;
    public static final int NAL_UNIT_TYPE_PARTITION_A = 2;
    public static final int NAL_UNIT_TYPE_PPS = 8;
    public static final int NAL_UNIT_TYPE_PREFIX = 14;
    public static final int NAL_UNIT_TYPE_SEI = 6;
    public static final int NAL_UNIT_TYPE_SPS = 7;
    private static final String TAG = "NalUnitUtil";
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    public static final class H265SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;
        public final int height;
        public final int maxNumReorderPics;
        public final float pixelWidthHeightRatio;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(int i, boolean z4, int i4, int i6, int i10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f, int i17, int i18, int i19, int i20) {
            this.generalProfileSpace = i;
            this.generalTierFlag = z4;
            this.generalProfileIdc = i4;
            this.generalProfileCompatibilityFlags = i6;
            this.chromaFormatIdc = i10;
            this.bitDepthLumaMinus8 = i11;
            this.bitDepthChromaMinus8 = i12;
            this.constraintBytes = iArr;
            this.generalLevelIdc = i13;
            this.seqParameterSetId = i14;
            this.width = i15;
            this.height = i16;
            this.pixelWidthHeightRatio = f;
            this.maxNumReorderPics = i17;
            this.colorSpace = i18;
            this.colorRange = i19;
            this.colorTransfer = i20;
        }
    }

    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i, int i4, boolean z4) {
            this.picParameterSetId = i;
            this.seqParameterSetId = i4;
            this.bottomFieldPicOrderInFramePresentFlag = z4;
        }
    }

    public static final class SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int maxNumRefFrames;
        public final int maxNumReorderFrames;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i, int i4, int i6, int i10, int i11, int i12, int i13, float f, int i14, int i15, boolean z4, boolean z5, int i16, int i17, int i18, boolean z8, int i19, int i20, int i21, int i22) {
            this.profileIdc = i;
            this.constraintsFlagsAndReservedZero2Bits = i4;
            this.levelIdc = i6;
            this.seqParameterSetId = i10;
            this.maxNumRefFrames = i11;
            this.width = i12;
            this.height = i13;
            this.pixelWidthHeightRatio = f;
            this.bitDepthLumaMinus8 = i14;
            this.bitDepthChromaMinus8 = i15;
            this.separateColorPlaneFlag = z4;
            this.frameMbsOnlyFlag = z5;
            this.frameNumLength = i16;
            this.picOrderCountType = i17;
            this.picOrderCntLsbLength = i18;
            this.deltaPicOrderAlwaysZeroFlag = z8;
            this.colorSpace = i19;
            this.colorRange = i20;
            this.colorTransfer = i21;
            this.maxNumReorderFrames = i22;
        }
    }

    private NalUnitUtil() {
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i = 0;
        int i4 = 0;
        while (true) {
            int i6 = i + 1;
            if (i6 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i10 = byteBuffer.get(i) & 255;
            if (i4 == 3) {
                if (i10 == 1 && (byteBuffer.get(i6) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i10 == 0) {
                i4++;
            }
            if (i10 != 0) {
                i4 = 0;
            }
            i = i6;
        }
    }

    public static int findNalUnit(byte[] bArr, int i, int i4, boolean[] zArr) {
        int i6 = i4 - i;
        Assertions.checkState(i6 >= 0);
        if (i6 == 0) {
            return i4;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i - 3;
        }
        if (i6 > 1 && zArr[1] && bArr[i] == 1) {
            clearPrefixFlags(zArr);
            return i - 2;
        }
        if (i6 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            clearPrefixFlags(zArr);
            return i - 1;
        }
        int i10 = i4 - 1;
        int i11 = i + 2;
        while (i11 < i10) {
            byte b8 = bArr[i11];
            if ((b8 & 254) == 0) {
                int i12 = i11 - 2;
                if (bArr[i12] == 0 && bArr[i11 - 1] == 0 && b8 == 1) {
                    clearPrefixFlags(zArr);
                    return i12;
                }
                i11 -= 2;
            }
            i11 += 3;
        }
        zArr[0] = i6 <= 2 ? !(i6 != 2 ? !(zArr[1] && bArr[i10] == 1) : !(zArr[2] && bArr[i4 + (-2)] == 0 && bArr[i10] == 1)) : bArr[i4 + (-3)] == 0 && bArr[i4 + (-2)] == 0 && bArr[i10] == 1;
        zArr[1] = i6 <= 1 ? zArr[2] && bArr[i10] == 0 : bArr[i4 + (-2)] == 0 && bArr[i10] == 0;
        zArr[2] = bArr[i10] == 0;
        return i4;
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i, int i4) {
        while (i < i4 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static int getH265NalUnitType(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static boolean isNalUnitSei(@Nullable String str, byte b8) {
        return ("video/avc".equals(str) && (b8 & 31) == 6) || (MimeTypes.VIDEO_H265.equals(str) && ((b8 & 126) >> 1) == 39);
    }

    public static H265SpsData parseH265SpsNalUnit(byte[] bArr, int i, int i4) {
        return parseH265SpsNalUnitPayload(bArr, i + 2, i4);
    }

    public static H265SpsData parseH265SpsNalUnitPayload(byte[] bArr, int i, int i4) {
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iIsoTransferCharacteristicsToColorTransfer;
        int i15;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i, i4);
        parsableNalUnitBitArray.skipBits(4);
        int bits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        int bits2 = parsableNalUnitBitArray.readBits(2);
        boolean bit = parsableNalUnitBitArray.readBit();
        int bits3 = parsableNalUnitBitArray.readBits(5);
        int i16 = 0;
        for (int i17 = 0; i17 < 32; i17++) {
            if (parsableNalUnitBitArray.readBit()) {
                i16 |= 1 << i17;
            }
        }
        int[] iArr = new int[6];
        for (int i18 = 0; i18 < 6; i18++) {
            iArr[i18] = parsableNalUnitBitArray.readBits(8);
        }
        int bits4 = parsableNalUnitBitArray.readBits(8);
        int i19 = 0;
        for (int i20 = 0; i20 < bits; i20++) {
            if (parsableNalUnitBitArray.readBit()) {
                i19 += 89;
            }
            if (parsableNalUnitBitArray.readBit()) {
                i19 += 8;
            }
        }
        parsableNalUnitBitArray.skipBits(i19);
        if (bits > 0) {
            parsableNalUnitBitArray.skipBits((8 - bits) * 2);
        }
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt2 == 3) {
            parsableNalUnitBitArray.skipBit();
        }
        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            unsignedExpGolombCodedInt3 -= (unsignedExpGolombCodedInt5 + unsignedExpGolombCodedInt6) * ((unsignedExpGolombCodedInt2 == 1 || unsignedExpGolombCodedInt2 == 2) ? 2 : 1);
            unsignedExpGolombCodedInt4 -= (unsignedExpGolombCodedInt7 + unsignedExpGolombCodedInt8) * (unsignedExpGolombCodedInt2 == 1 ? 2 : 1);
        }
        int unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int iIsoColorPrimariesToColorSpace = -1;
        int iMax = -1;
        for (int i21 = parsableNalUnitBitArray.readBit() ? 0 : bits; i21 <= bits; i21++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            iMax = Math.max(parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(), iMax);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit() && parsableNalUnitBitArray.readBit()) {
            skipH265ScalingList(parsableNalUnitBitArray);
        }
        parsableNalUnitBitArray.skipBits(2);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(8);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        skipShortTermReferencePictureSets(parsableNalUnitBitArray);
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            for (int i22 = 0; i22 < unsignedExpGolombCodedInt12; i22++) {
                parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt11 + 5);
            }
        }
        parsableNalUnitBitArray.skipBits(2);
        float f = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int bits5 = parsableNalUnitBitArray.readBits(8);
                if (bits5 == 255) {
                    int bits6 = parsableNalUnitBitArray.readBits(16);
                    int bits7 = parsableNalUnitBitArray.readBits(16);
                    if (bits6 != 0 && bits7 != 0) {
                        f = bits6 / bits7;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (bits5 < fArr.length) {
                        f = fArr[bits5];
                    } else {
                        a.y(bits5, "Unexpected aspect_ratio_idc value: ", TAG);
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                i15 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                if (parsableNalUnitBitArray.readBit()) {
                    int bits8 = parsableNalUnitBitArray.readBits(8);
                    int bits9 = parsableNalUnitBitArray.readBits(8);
                    parsableNalUnitBitArray.skipBits(8);
                    iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(bits8);
                    iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(bits9);
                } else {
                    iIsoTransferCharacteristicsToColorTransfer = -1;
                }
            } else {
                iIsoTransferCharacteristicsToColorTransfer = -1;
                i15 = -1;
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                unsignedExpGolombCodedInt4 *= 2;
            }
            i14 = iIsoTransferCharacteristicsToColorTransfer;
            i13 = i15;
            i6 = unsignedExpGolombCodedInt;
            i10 = unsignedExpGolombCodedInt3;
            i11 = unsignedExpGolombCodedInt4;
            i12 = iIsoColorPrimariesToColorSpace;
        } else {
            i6 = unsignedExpGolombCodedInt;
            i10 = unsignedExpGolombCodedInt3;
            i11 = unsignedExpGolombCodedInt4;
            i12 = -1;
            i13 = -1;
            i14 = -1;
        }
        return new H265SpsData(bits2, bit, bits3, i16, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt9, unsignedExpGolombCodedInt10, iArr, bits4, i6, i10, i11, f, iMax, i12, i13, i14);
    }

    public static PpsData parsePpsNalUnit(byte[] bArr, int i, int i4) {
        return parsePpsNalUnitPayload(bArr, i + 1, i4);
    }

    public static PpsData parsePpsNalUnitPayload(byte[] bArr, int i, int i4) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i, i4);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    public static SpsData parseSpsNalUnit(byte[] bArr, int i, int i4) {
        return parseSpsNalUnitPayload(bArr, i + 1, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.container.NalUnitUtil.SpsData parseSpsNalUnitPayload(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.parseSpsNalUnitPayload(byte[], int, int):androidx.media3.container.NalUnitUtil$SpsData");
    }

    private static void skipH265ScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i = 0; i < 4; i++) {
            int i4 = 0;
            while (i4 < 6) {
                int i6 = 1;
                if (parsableNalUnitBitArray.readBit()) {
                    int iMin = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i10 = 0; i10 < iMin; i10++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                } else {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (i == 3) {
                    i6 = 3;
                }
                i4 += i6;
            }
        }
    }

    private static void skipHrdParameters(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        parsableNalUnitBitArray.skipBits(8);
        for (int i = 0; i < unsignedExpGolombCodedInt; i++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBits(20);
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int i) {
        int signedExpGolombCodedInt = 8;
        int i4 = 8;
        for (int i6 = 0; i6 < i; i6++) {
            if (signedExpGolombCodedInt != 0) {
                signedExpGolombCodedInt = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i4) + 256) % 256;
            }
            if (signedExpGolombCodedInt != 0) {
                i4 = signedExpGolombCodedInt;
            }
        }
    }

    private static void skipShortTermReferencePictureSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i = -1;
        int i4 = -1;
        for (int i6 = 0; i6 < unsignedExpGolombCodedInt; i6++) {
            if (i6 == 0 || !parsableNalUnitBitArray.readBit()) {
                int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int[] iArr2 = new int[unsignedExpGolombCodedInt2];
                int i10 = 0;
                while (i10 < unsignedExpGolombCodedInt2) {
                    iArr2[i10] = (i10 > 0 ? iArr2[i10 - 1] : 0) - (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                    parsableNalUnitBitArray.skipBit();
                    i10++;
                }
                int[] iArr3 = new int[unsignedExpGolombCodedInt3];
                int i11 = 0;
                while (i11 < unsignedExpGolombCodedInt3) {
                    iArr3[i11] = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1 + (i11 > 0 ? iArr3[i11 - 1] : 0);
                    parsableNalUnitBitArray.skipBit();
                    i11++;
                }
                i = unsignedExpGolombCodedInt2;
                iArr = iArr2;
                i4 = unsignedExpGolombCodedInt3;
                iArrCopyOf = iArr3;
            } else {
                int i12 = i + i4;
                int unsignedExpGolombCodedInt4 = (1 - ((parsableNalUnitBitArray.readBit() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                int i13 = i12 + 1;
                boolean[] zArr = new boolean[i13];
                for (int i14 = 0; i14 <= i12; i14++) {
                    if (parsableNalUnitBitArray.readBit()) {
                        zArr[i14] = true;
                    } else {
                        zArr[i14] = parsableNalUnitBitArray.readBit();
                    }
                }
                int[] iArr4 = new int[i13];
                int[] iArr5 = new int[i13];
                int i15 = 0;
                for (int i16 = i4 - 1; i16 >= 0; i16--) {
                    int i17 = iArrCopyOf[i16] + unsignedExpGolombCodedInt4;
                    if (i17 < 0 && zArr[i + i16]) {
                        iArr4[i15] = i17;
                        i15++;
                    }
                }
                if (unsignedExpGolombCodedInt4 < 0 && zArr[i12]) {
                    iArr4[i15] = unsignedExpGolombCodedInt4;
                    i15++;
                }
                for (int i18 = 0; i18 < i; i18++) {
                    int i19 = iArr[i18] + unsignedExpGolombCodedInt4;
                    if (i19 < 0 && zArr[i18]) {
                        iArr4[i15] = i19;
                        i15++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i15);
                int i20 = 0;
                for (int i21 = i - 1; i21 >= 0; i21--) {
                    int i22 = iArr[i21] + unsignedExpGolombCodedInt4;
                    if (i22 > 0 && zArr[i21]) {
                        iArr5[i20] = i22;
                        i20++;
                    }
                }
                if (unsignedExpGolombCodedInt4 > 0 && zArr[i12]) {
                    iArr5[i20] = unsignedExpGolombCodedInt4;
                    i20++;
                }
                for (int i23 = 0; i23 < i4; i23++) {
                    int i24 = iArrCopyOf[i23] + unsignedExpGolombCodedInt4;
                    if (i24 > 0 && zArr[i + i23]) {
                        iArr5[i20] = i24;
                        i20++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr5, i20);
                iArr = iArrCopyOf2;
                i = i15;
                i4 = i20;
            }
        }
    }

    public static int unescapeStream(byte[] bArr, int i) {
        int i4;
        synchronized (scratchEscapePositionsLock) {
            int iFindNextUnescapeIndex = 0;
            int i6 = 0;
            while (iFindNextUnescapeIndex < i) {
                try {
                    iFindNextUnescapeIndex = findNextUnescapeIndex(bArr, iFindNextUnescapeIndex, i);
                    if (iFindNextUnescapeIndex < i) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i6) {
                            scratchEscapePositions = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i6] = iFindNextUnescapeIndex;
                        iFindNextUnescapeIndex += 3;
                        i6++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i4 = i - i6;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < i6; i12++) {
                int i13 = scratchEscapePositions[i12] - i11;
                System.arraycopy(bArr, i11, bArr, i10, i13);
                int i14 = i10 + i13;
                int i15 = i14 + 1;
                bArr[i14] = 0;
                i10 = i14 + 2;
                bArr[i15] = 0;
                i11 += i13 + 3;
            }
            System.arraycopy(bArr, i11, bArr, i10, i4 - i10);
        }
        return i4;
    }
}
