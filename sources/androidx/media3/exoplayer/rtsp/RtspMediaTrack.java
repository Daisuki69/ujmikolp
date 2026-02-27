package androidx.media3.exoplayer.rtsp;

import O1.S;
import O1.X;
import O1.t0;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.rtsp.MediaDescription;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.ts.PsExtractor;
import com.paymaya.domain.model.MfaTencentErrorResult;

/* JADX INFO: loaded from: classes2.dex */
final class RtspMediaTrack {
    private static final String AAC_CODECS_PREFIX = "mp4a.40.";
    private static final int DEFAULT_H263_HEIGHT = 288;
    private static final int DEFAULT_H263_WIDTH = 352;
    private static final int DEFAULT_MP4V_HEIGHT = 288;
    private static final int DEFAULT_MP4V_WIDTH = 352;
    private static final int DEFAULT_VP8_HEIGHT = 240;
    private static final int DEFAULT_VP8_WIDTH = 320;
    private static final int DEFAULT_VP9_HEIGHT = 240;
    private static final int DEFAULT_VP9_WIDTH = 320;
    private static final String GENERIC_CONTROL_ATTR = "*";
    private static final String H264_CODECS_PREFIX = "avc1.";
    private static final String MPEG4_CODECS_PREFIX = "mp4v.";
    private static final int OPUS_CLOCK_RATE = 48000;
    private static final String PARAMETER_AMR_INTERLEAVING = "interleaving";
    private static final String PARAMETER_AMR_OCTET_ALIGN = "octet-align";
    private static final String PARAMETER_H265_SPROP_MAX_DON_DIFF = "sprop-max-don-diff";
    private static final String PARAMETER_H265_SPROP_PPS = "sprop-pps";
    private static final String PARAMETER_H265_SPROP_SPS = "sprop-sps";
    private static final String PARAMETER_H265_SPROP_VPS = "sprop-vps";
    private static final String PARAMETER_MP4A_CONFIG = "config";
    private static final String PARAMETER_MP4A_C_PRESENT = "cpresent";
    private static final String PARAMETER_PROFILE_LEVEL_ID = "profile-level-id";
    private static final String PARAMETER_SPROP_PARAMS = "sprop-parameter-sets";
    public final RtpPayloadFormat payloadFormat;
    public final Uri uri;

    public RtspMediaTrack(RtspHeaders rtspHeaders, MediaDescription mediaDescription, Uri uri) {
        Assertions.checkArgument(mediaDescription.attributes.containsKey(SessionDescription.ATTR_CONTROL), "missing attribute control");
        this.payloadFormat = generatePayloadFormat(mediaDescription);
        this.uri = extractTrackUri(rtspHeaders, uri, (String) Util.castNonNull((String) mediaDescription.attributes.get(SessionDescription.ATTR_CONTROL)));
    }

    private static Uri extractTrackUri(RtspHeaders rtspHeaders, Uri uri, String str) {
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        if (!TextUtils.isEmpty(rtspHeaders.get(RtspHeaders.CONTENT_BASE))) {
            uri = Uri.parse(rtspHeaders.get(RtspHeaders.CONTENT_BASE));
        } else if (!TextUtils.isEmpty(rtspHeaders.get(RtspHeaders.CONTENT_LOCATION))) {
            uri = Uri.parse(rtspHeaders.get(RtspHeaders.CONTENT_LOCATION));
        }
        return str.equals("*") ? uri : uri.buildUpon().appendEncodedPath(str).build();
    }

    @VisibleForTesting
    public static RtpPayloadFormat generatePayloadFormat(MediaDescription mediaDescription) {
        Format.Builder builder;
        String str;
        int i;
        int iInferChannelCount;
        X fmtpParametersAsMap;
        builder = new Format.Builder();
        int i4 = mediaDescription.bitrate;
        if (i4 > 0) {
            builder.setAverageBitrate(i4);
        }
        MediaDescription.RtpMapAttribute rtpMapAttribute = mediaDescription.rtpMapAttribute;
        int i6 = rtpMapAttribute.payloadType;
        str = rtpMapAttribute.mediaEncoding;
        String mimeTypeFromRtpMediaType = RtpPayloadFormat.getMimeTypeFromRtpMediaType(str);
        builder.setSampleMimeType(mimeTypeFromRtpMediaType);
        i = mediaDescription.rtpMapAttribute.clockRate;
        if ("audio".equals(mediaDescription.mediaType)) {
            iInferChannelCount = inferChannelCount(mediaDescription.rtpMapAttribute.encodingParameters, mimeTypeFromRtpMediaType);
            builder.setSampleRate(i).setChannelCount(iInferChannelCount);
        } else {
            iInferChannelCount = -1;
        }
        fmtpParametersAsMap = mediaDescription.getFmtpParametersAsMap();
        switch (mimeTypeFromRtpMediaType) {
            case "audio/mp4a-latm":
                Assertions.checkArgument(iInferChannelCount != -1);
                Assertions.checkArgument(!fmtpParametersAsMap.isEmpty(), "missing attribute fmtp");
                if (str.equals(RtpPayloadFormat.RTP_MEDIA_MPEG4_LATM_AUDIO)) {
                    Assertions.checkArgument(fmtpParametersAsMap.containsKey(PARAMETER_MP4A_C_PRESENT) && ((String) fmtpParametersAsMap.get(PARAMETER_MP4A_C_PRESENT)).equals("0"), "Only supports cpresent=0 in AAC audio.");
                    String str2 = (String) fmtpParametersAsMap.get(PARAMETER_MP4A_CONFIG);
                    Assertions.checkNotNull(str2, "AAC audio stream must include config fmtp parameter");
                    Assertions.checkArgument(str2.length() % 2 == 0, "Malformat MPEG4 config: ".concat(str2));
                    AacUtil.Config aacStreamMuxConfig = parseAacStreamMuxConfig(str2);
                    builder.setSampleRate(aacStreamMuxConfig.sampleRateHz).setChannelCount(aacStreamMuxConfig.channelCount).setCodecs(aacStreamMuxConfig.codecs);
                }
                processAacFmtpAttribute(builder, fmtpParametersAsMap, str, iInferChannelCount, i);
                break;
            case "audio/3gpp":
            case "audio/amr-wb":
                Assertions.checkArgument(iInferChannelCount == 1, "Multi channel AMR is not currently supported.");
                Assertions.checkArgument(!fmtpParametersAsMap.isEmpty(), "fmtp parameters must include octet-align.");
                Assertions.checkArgument(fmtpParametersAsMap.containsKey(PARAMETER_AMR_OCTET_ALIGN), "Only octet aligned mode is currently supported.");
                Assertions.checkArgument(!fmtpParametersAsMap.containsKey(PARAMETER_AMR_INTERLEAVING), "Interleaving mode is not currently supported.");
                break;
            case "audio/opus":
                Assertions.checkArgument(iInferChannelCount != -1);
                Assertions.checkArgument(i == 48000, "Invalid OPUS clock rate.");
                break;
            case "video/mp4v-es":
                Assertions.checkArgument(!fmtpParametersAsMap.isEmpty());
                processMPEG4FmtpAttribute(builder, fmtpParametersAsMap);
                break;
            case "video/3gpp":
                builder.setWidth(352).setHeight(288);
                break;
            case "video/avc":
                Assertions.checkArgument(!fmtpParametersAsMap.isEmpty(), "missing attribute fmtp");
                processH264FmtpAttribute(builder, fmtpParametersAsMap);
                break;
            case "video/hevc":
                Assertions.checkArgument(!fmtpParametersAsMap.isEmpty(), "missing attribute fmtp");
                processH265FmtpAttribute(builder, fmtpParametersAsMap);
                break;
            case "video/x-vnd.on2.vp8":
                builder.setWidth(320).setHeight(PsExtractor.VIDEO_STREAM_MASK);
                break;
            case "video/x-vnd.on2.vp9":
                builder.setWidth(320).setHeight(PsExtractor.VIDEO_STREAM_MASK);
                break;
            case "audio/raw":
                builder.setPcmEncoding(RtpPayloadFormat.getRawPcmEncodingType(str));
                break;
        }
        Assertions.checkArgument(i > 0);
        return new RtpPayloadFormat(builder.build(), i6, i, fmtpParametersAsMap, str);
    }

    private static byte[] getInitializationDataFromParameterSet(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        int length = bArrDecode.length;
        byte[] bArr = NalUnitUtil.NAL_START_CODE;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrDecode, 0, bArr2, bArr.length, bArrDecode.length);
        return bArr2;
    }

    private static int inferChannelCount(int i, String str) {
        return i != -1 ? i : str.equals(MimeTypes.AUDIO_AC3) ? 6 : 1;
    }

    private static AacUtil.Config parseAacStreamMuxConfig(String str) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(Util.getBytesFromHexString(str));
        Assertions.checkArgument(parsableBitArray.readBits(1) == 0, "Only supports audio mux version 0.");
        Assertions.checkArgument(parsableBitArray.readBits(1) == 1, "Only supports allStreamsSameTimeFraming.");
        parsableBitArray.skipBits(6);
        Assertions.checkArgument(parsableBitArray.readBits(4) == 0, "Only supports one program.");
        Assertions.checkArgument(parsableBitArray.readBits(3) == 0, "Only supports one numLayer.");
        try {
            return AacUtil.parseAudioSpecificConfig(parsableBitArray, false);
        } catch (ParserException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static void processAacFmtpAttribute(Format.Builder builder, X x6, String str, int i, int i4) {
        String str2 = (String) x6.get(PARAMETER_PROFILE_LEVEL_ID);
        if (str2 == null && str.equals(RtpPayloadFormat.RTP_MEDIA_MPEG4_LATM_AUDIO)) {
            str2 = "30";
        }
        Assertions.checkArgument((str2 == null || str2.isEmpty()) ? false : true, "missing profile-level-id param");
        builder.setCodecs(AAC_CODECS_PREFIX + str2);
        builder.setInitializationData(S.p(AacUtil.buildAacLcAudioSpecificConfig(i4, i)));
    }

    private static void processH264FmtpAttribute(Format.Builder builder, X x6) {
        Assertions.checkArgument(x6.containsKey(PARAMETER_SPROP_PARAMS), "missing sprop parameter");
        String[] strArrSplit = Util.split((String) Assertions.checkNotNull((String) x6.get(PARAMETER_SPROP_PARAMS)), ",");
        Assertions.checkArgument(strArrSplit.length == 2, "empty sprop value");
        t0 t0VarQ = S.q(getInitializationDataFromParameterSet(strArrSplit[0]), getInitializationDataFromParameterSet(strArrSplit[1]));
        builder.setInitializationData(t0VarQ);
        byte[] bArr = (byte[]) t0VarQ.get(0);
        NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit(bArr, NalUnitUtil.NAL_START_CODE.length, bArr.length);
        builder.setPixelWidthHeightRatio(spsNalUnit.pixelWidthHeightRatio);
        builder.setHeight(spsNalUnit.height);
        builder.setWidth(spsNalUnit.width);
        builder.setColorInfo(new ColorInfo.Builder().setColorSpace(spsNalUnit.colorSpace).setColorRange(spsNalUnit.colorRange).setColorTransfer(spsNalUnit.colorTransfer).setLumaBitdepth(spsNalUnit.bitDepthLumaMinus8 + 8).setChromaBitdepth(spsNalUnit.bitDepthChromaMinus8 + 8).build());
        String str = (String) x6.get(PARAMETER_PROFILE_LEVEL_ID);
        if (str != null) {
            builder.setCodecs(H264_CODECS_PREFIX.concat(str));
        } else {
            builder.setCodecs(CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc));
        }
    }

    private static void processH265FmtpAttribute(Format.Builder builder, X x6) {
        if (x6.containsKey(PARAMETER_H265_SPROP_MAX_DON_DIFF)) {
            int i = Integer.parseInt((String) Assertions.checkNotNull((String) x6.get(PARAMETER_H265_SPROP_MAX_DON_DIFF)));
            Assertions.checkArgument(i == 0, "non-zero sprop-max-don-diff " + i + " is not supported");
        }
        Assertions.checkArgument(x6.containsKey(PARAMETER_H265_SPROP_VPS), "missing sprop-vps parameter");
        String str = (String) Assertions.checkNotNull((String) x6.get(PARAMETER_H265_SPROP_VPS));
        Assertions.checkArgument(x6.containsKey(PARAMETER_H265_SPROP_SPS), "missing sprop-sps parameter");
        String str2 = (String) Assertions.checkNotNull((String) x6.get(PARAMETER_H265_SPROP_SPS));
        Assertions.checkArgument(x6.containsKey(PARAMETER_H265_SPROP_PPS), "missing sprop-pps parameter");
        t0 t0VarS = S.s(getInitializationDataFromParameterSet(str), getInitializationDataFromParameterSet(str2), getInitializationDataFromParameterSet((String) Assertions.checkNotNull((String) x6.get(PARAMETER_H265_SPROP_PPS))));
        builder.setInitializationData(t0VarS);
        byte[] bArr = (byte[]) t0VarS.get(1);
        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, NalUnitUtil.NAL_START_CODE.length, bArr.length);
        builder.setPixelWidthHeightRatio(h265SpsNalUnit.pixelWidthHeightRatio);
        builder.setHeight(h265SpsNalUnit.height).setWidth(h265SpsNalUnit.width);
        builder.setColorInfo(new ColorInfo.Builder().setColorSpace(h265SpsNalUnit.colorSpace).setColorRange(h265SpsNalUnit.colorRange).setColorTransfer(h265SpsNalUnit.colorTransfer).setLumaBitdepth(h265SpsNalUnit.bitDepthLumaMinus8 + 8).setChromaBitdepth(h265SpsNalUnit.bitDepthChromaMinus8 + 8).build());
        builder.setCodecs(CodecSpecificDataUtil.buildHevcCodecString(h265SpsNalUnit.generalProfileSpace, h265SpsNalUnit.generalTierFlag, h265SpsNalUnit.generalProfileIdc, h265SpsNalUnit.generalProfileCompatibilityFlags, h265SpsNalUnit.constraintBytes, h265SpsNalUnit.generalLevelIdc));
    }

    private static void processMPEG4FmtpAttribute(Format.Builder builder, X x6) {
        String str = (String) x6.get(PARAMETER_MP4A_CONFIG);
        if (str != null) {
            byte[] bytesFromHexString = Util.getBytesFromHexString(str);
            builder.setInitializationData(S.p(bytesFromHexString));
            Pair<Integer, Integer> videoResolutionFromMpeg4VideoConfig = CodecSpecificDataUtil.getVideoResolutionFromMpeg4VideoConfig(bytesFromHexString);
            builder.setWidth(((Integer) videoResolutionFromMpeg4VideoConfig.first).intValue()).setHeight(((Integer) videoResolutionFromMpeg4VideoConfig.second).intValue());
        } else {
            builder.setWidth(352).setHeight(288);
        }
        String str2 = (String) x6.get(PARAMETER_PROFILE_LEVEL_ID);
        if (str2 == null) {
            str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        }
        builder.setCodecs(MPEG4_CODECS_PREFIX.concat(str2));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RtspMediaTrack.class == obj.getClass()) {
            RtspMediaTrack rtspMediaTrack = (RtspMediaTrack) obj;
            if (this.payloadFormat.equals(rtspMediaTrack.payloadFormat) && this.uri.equals(rtspMediaTrack.uri)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.uri.hashCode() + ((this.payloadFormat.hashCode() + MfaTencentErrorResult.TENCENT_ERROR_FACE_DETECTION_TIMED_OUT) * 31);
    }
}
