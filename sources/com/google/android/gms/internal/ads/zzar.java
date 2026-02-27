package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzar {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean zza(@Nullable String str) {
        return "audio".equals(zzk(str));
    }

    public static boolean zzb(@Nullable String str) {
        return "video".equals(zzk(str));
    }

    public static boolean zzc(@Nullable String str) {
        return "image".equals(zzk(str)) || MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE.equals(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzd(@androidx.annotation.Nullable java.lang.String r3, @androidx.annotation.Nullable java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzar.zzd(java.lang.String, java.lang.String):boolean");
    }

    public static boolean zze(@Nullable String str, String str2) {
        String strZzf;
        zzaq zzaqVarZzj;
        String string = null;
        if (str != null) {
            String str3 = zzeo.zza;
            String[] strArrSplit = TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
            StringBuilder sb2 = new StringBuilder();
            for (String str4 : strArrSplit) {
                if (str4 == null) {
                    strZzf = null;
                } else {
                    String strZza = zzggj.zza(str4.trim());
                    if (strZza.startsWith("avc1") || strZza.startsWith("avc3")) {
                        strZzf = "video/avc";
                    } else if (strZza.startsWith("hev1") || strZza.startsWith("hvc1")) {
                        strZzf = MimeTypes.VIDEO_H265;
                    } else if (strZza.startsWith("dvav") || strZza.startsWith("dva1") || strZza.startsWith("dvhe") || strZza.startsWith("dvh1")) {
                        strZzf = MimeTypes.VIDEO_DOLBY_VISION;
                    } else if (strZza.startsWith("av01")) {
                        strZzf = MimeTypes.VIDEO_AV1;
                    } else if (strZza.startsWith("vp9") || strZza.startsWith("vp09")) {
                        strZzf = MimeTypes.VIDEO_VP9;
                    } else if (strZza.startsWith("vp8") || strZza.startsWith("vp08")) {
                        strZzf = MimeTypes.VIDEO_VP8;
                    } else if (strZza.startsWith("mp4a")) {
                        strZzf = (!strZza.startsWith("mp4a.") || (zzaqVarZzj = zzj(strZza)) == null) ? null : zzf(zzaqVarZzj.zza);
                        if (strZzf == null) {
                            strZzf = MimeTypes.AUDIO_AAC;
                        }
                    } else if (strZza.startsWith("mha1")) {
                        strZzf = MimeTypes.AUDIO_MPEGH_MHA1;
                    } else if (strZza.startsWith("mhm1")) {
                        strZzf = MimeTypes.AUDIO_MPEGH_MHM1;
                    } else if (strZza.startsWith("ac-3") || strZza.startsWith("dac3")) {
                        strZzf = MimeTypes.AUDIO_AC3;
                    } else if (strZza.startsWith("ec-3") || strZza.startsWith("dec3")) {
                        strZzf = MimeTypes.AUDIO_E_AC3;
                    } else if (strZza.startsWith(MimeTypes.CODEC_E_AC3_JOC)) {
                        strZzf = MimeTypes.AUDIO_E_AC3_JOC;
                    } else if (strZza.startsWith("ac-4") || strZza.startsWith("dac4")) {
                        strZzf = MimeTypes.AUDIO_AC4;
                    } else if (strZza.startsWith("dtsc")) {
                        strZzf = MimeTypes.AUDIO_DTS;
                    } else if (strZza.startsWith("dtse")) {
                        strZzf = MimeTypes.AUDIO_DTS_EXPRESS;
                    } else if (strZza.startsWith("dtsh") || strZza.startsWith("dtsl")) {
                        strZzf = MimeTypes.AUDIO_DTS_HD;
                    } else if (strZza.startsWith("dtsx")) {
                        strZzf = MimeTypes.AUDIO_DTS_X;
                    } else if (strZza.startsWith("opus")) {
                        strZzf = MimeTypes.AUDIO_OPUS;
                    } else if (strZza.startsWith("vorbis")) {
                        strZzf = MimeTypes.AUDIO_VORBIS;
                    } else if (strZza.startsWith("flac")) {
                        strZzf = MimeTypes.AUDIO_FLAC;
                    } else if (strZza.startsWith("stpp")) {
                        strZzf = MimeTypes.APPLICATION_TTML;
                    } else if (strZza.startsWith("wvtt")) {
                        strZzf = MimeTypes.TEXT_VTT;
                    } else if (strZza.contains("cea708")) {
                        strZzf = MimeTypes.APPLICATION_CEA708;
                    } else if (strZza.contains("eia608") || strZza.contains("cea608")) {
                        strZzf = MimeTypes.APPLICATION_CEA608;
                    } else {
                        ArrayList arrayList = zzb;
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str5 = ((zzap) arrayList.get(i)).zzb;
                            if (strZza.startsWith(null)) {
                                break;
                            }
                        }
                        strZzf = null;
                    }
                }
                if (str2.equals(strZzf)) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str4);
                }
            }
            if (sb2.length() > 0) {
                string = sb2.toString();
            }
        }
        return string != null;
    }

    @Nullable
    public static String zzf(int i) {
        if (i == 32) {
            return MimeTypes.VIDEO_MP4V;
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return MimeTypes.VIDEO_H265;
        }
        if (i == 64) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i == 163) {
            return MimeTypes.VIDEO_VC1;
        }
        if (i == 177) {
            return MimeTypes.VIDEO_VP9;
        }
        if (i == 221) {
            return MimeTypes.AUDIO_VORBIS;
        }
        if (i == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i == 166) {
            return MimeTypes.AUDIO_E_AC3;
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return MimeTypes.VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return MimeTypes.AUDIO_AAC;
            case 105:
            case 107:
                return MimeTypes.AUDIO_MPEG;
            case 106:
                return MimeTypes.VIDEO_MPEG;
            case 108:
                return MimeTypes.IMAGE_JPEG;
            default:
                switch (i) {
                    case 169:
                    case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                        return MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return MimeTypes.AUDIO_DTS_HD;
                    case 173:
                        return MimeTypes.AUDIO_OPUS;
                    case 174:
                        return MimeTypes.AUDIO_AC4;
                    default:
                        return null;
                }
        }
    }

    public static int zzg(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zza(str)) {
            return 1;
        }
        if (zzb(str)) {
            return 2;
        }
        if ("text".equals(zzk(str)) || MimeTypes.APPLICATION_MEDIA3_CUES.equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return 3;
        }
        if (zzc(str)) {
            return 4;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || MimeTypes.APPLICATION_ICY.equals(str) || MimeTypes.APPLICATION_AIT.equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        ArrayList arrayList = zzb;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = ((zzap) arrayList.get(i)).zza;
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzh(java.lang.String r7, @androidx.annotation.Nullable java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzar.zzh(java.lang.String, java.lang.String):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String zzi(java.lang.String r1) {
        /*
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzggj.zza(r1)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1833600100: goto L4c;
                case -1007807498: goto L42;
                case -979095690: goto L38;
                case -586683234: goto L2e;
                case -432836268: goto L24;
                case -432836267: goto L1a;
                case 187090231: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L56
        L10:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            r0 = 2
            goto L57
        L1a:
            java.lang.String r0 = "audio/mpeg-l2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            r0 = 6
            goto L57
        L24:
            java.lang.String r0 = "audio/mpeg-l1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            r0 = 5
            goto L57
        L2e:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            r0 = 3
            goto L57
        L38:
            java.lang.String r0 = "application/x-mpegurl"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            r0 = 4
            goto L57
        L42:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            r0 = 1
            goto L57
        L4c:
            java.lang.String r0 = "video/x-mvhevc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L56
            r0 = 0
            goto L57
        L56:
            r0 = -1
        L57:
            switch(r0) {
                case 0: goto L6d;
                case 1: goto L6a;
                case 2: goto L67;
                case 3: goto L64;
                case 4: goto L61;
                case 5: goto L5e;
                case 6: goto L5b;
                default: goto L5a;
            }
        L5a:
            return r1
        L5b:
            java.lang.String r1 = "audio/mpeg-L2"
            return r1
        L5e:
            java.lang.String r1 = "audio/mpeg-L1"
            return r1
        L61:
            java.lang.String r1 = "application/x-mpegURL"
            return r1
        L64:
            java.lang.String r1 = "audio/wav"
            return r1
        L67:
            java.lang.String r1 = "audio/mpeg"
            return r1
        L6a:
            java.lang.String r1 = "audio/flac"
            return r1
        L6d:
            java.lang.String r1 = "video/mv-hevc"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzar.zzi(java.lang.String):java.lang.String");
    }

    @Nullable
    @VisibleForTesting
    public static zzaq zzj(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new zzaq(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    private static String zzk(@Nullable String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
