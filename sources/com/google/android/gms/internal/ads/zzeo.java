package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.conf.ServerConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.paymaya.domain.model.MfaTencentErrorResult;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;
import java.util.zip.Inflater;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeo {
    public static final String zza;
    public static final byte[] zzb;
    private static final Pattern zzc;

    @Nullable
    private static HashMap zzd;
    private static final String[] zze;
    private static final String[] zzf;
    private static final int[] zzg;
    private static final int[] zzh;
    private static final int[] zzi;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        String str3 = Build.MANUFACTURER;
        int i = Build.VERSION.SDK_INT;
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 2 + String.valueOf(str2).length() + 2 + String.valueOf(str3).length() + 2 + String.valueOf(i).length());
        androidx.media3.datasource.cache.c.A(sb2, str, ", ", str2, ", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(i);
        zza = sb2.toString();
        zzb = new byte[0];
        zzc = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zze = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", TtmlNode.ATTR_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", CmcdConfiguration.KEY_BUFFER_STARVATION, "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzf = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzg = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzh = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        zzi = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, MfaTencentErrorResult.TENCENT_ERROR_INIT_SDK, MfaTencentErrorResult.TENCENT_ERROR_PREPARE_TIME_OUT, MfaTencentErrorResult.TENCENT_ERROR_APP_SWITCH, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, TsExtractor.TS_STREAM_TYPE_DTS_UHD, 130, 133, DateTimeConstants.HOURS_PER_WEEK, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, MfaTencentErrorResult.TENCENT_ERROR_APP_STOP, MfaTencentErrorResult.TENCENT_ERROR_LIVE_DATA, MfaTencentErrorResult.TENCENT_ERROR_INNER_ERROR_CODE, 210, 255, 248, 241, 246, 227, MfaTencentErrorResult.TENCENT_ERROR_NO_FACE_WHILE_CAPTURING, 237, 234, 183, 176, 185, 190, 171, TsExtractor.TS_STREAM_TYPE_AC4, 165, 162, 143, TsExtractor.TS_STREAM_TYPE_DTS_HD, TsExtractor.TS_STREAM_TYPE_AC3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, TsExtractor.TS_STREAM_TYPE_E_AC3, 128, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, 193, 198, 207, 200, 221, MfaTencentErrorResult.TENCENT_ERROR_PERMISSION_CHECK, MfaTencentErrorResult.TENCENT_ERROR_LOCAL_REF_FAILED, MfaTencentErrorResult.TENCENT_ERROR_USER_STOPS, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, TsExtractor.TS_PACKET_SIZE, 187, ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS, 145, 152, 159, TsExtractor.TS_STREAM_TYPE_DTS, 141, 132, 131, MfaTencentErrorResult.TENCENT_ERROR_LOCAL_TIME_OUT, MfaTencentErrorResult.TENCENT_ERROR_FACE_DETECTION_TIMED_OUT, 208, MfaTencentErrorResult.TENCENT_ERROR_CAMERA_PERMISSION, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static boolean zzA(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    @SuppressLint({"InlinedApi"})
    public static int zzB(int i) {
        int i4;
        int i6 = 6396;
        if (i == 10) {
            i4 = 737532;
        } else {
            if (i == 12) {
                return 743676;
            }
            if (i != 24) {
                switch (i) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return MfaTencentErrorResult.TENCENT_ERROR_LIVE_DATA;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        return 0;
                }
            }
            i4 = 67108860;
            i6 = 0;
        }
        return Build.VERSION.SDK_INT >= 32 ? i4 : i6;
    }

    public static AudioFormat zzC(int i, int i4, int i6) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i4).setEncoding(i6).build();
    }

    public static int zzD(int i) {
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i) {
                            case 20:
                                return 30;
                            case 21:
                            case 22:
                                return 31;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
        }
    }

    public static int zzE(int i) {
        if (i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int zzF(int i) {
        if (i == 2 || i == 4) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 10) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i == 7) {
            return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
        }
        if (i == 8) {
            return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        switch (i) {
            case 15:
                return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
            case 16:
            case 18:
                return PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
                    default:
                        return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzG(android.net.Uri r7) {
        /*
            java.lang.String r0 = r7.getScheme()
            r1 = 3
            if (r0 == 0) goto L19
            java.lang.String r2 = "rtsp"
            boolean r2 = com.google.android.gms.internal.ads.zzggj.zze(r2, r0)
            if (r2 != 0) goto L18
            java.lang.String r2 = "rtspt"
            boolean r0 = com.google.android.gms.internal.ads.zzggj.zze(r2, r0)
            if (r0 != 0) goto L18
            goto L19
        L18:
            return r1
        L19:
            java.lang.String r0 = r7.getLastPathSegment()
            r2 = 4
            if (r0 != 0) goto L21
            return r2
        L21:
            r3 = 46
            int r3 = r0.lastIndexOf(r3)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 < 0) goto L79
            int r3 = r3 + r6
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r0 = com.google.android.gms.internal.ads.zzggj.zza(r0)
            int r3 = r0.hashCode()
            switch(r3) {
                case 104579: goto L5b;
                case 108321: goto L51;
                case 3242057: goto L47;
                case 3299913: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L65
        L3d:
            java.lang.String r3 = "m3u8"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L65
            r0 = r6
            goto L66
        L47:
            java.lang.String r3 = "isml"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L65
            r0 = r1
            goto L66
        L51:
            java.lang.String r3 = "mpd"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L65
            r0 = r4
            goto L66
        L5b:
            java.lang.String r3 = "ism"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L65
            r0 = r5
            goto L66
        L65:
            r0 = -1
        L66:
            if (r0 == 0) goto L74
            if (r0 == r6) goto L72
            if (r0 == r5) goto L70
            if (r0 == r1) goto L70
            r0 = r2
            goto L75
        L70:
            r0 = r6
            goto L75
        L72:
            r0 = r5
            goto L75
        L74:
            r0 = r4
        L75:
            if (r0 != r2) goto L78
            goto L79
        L78:
            return r0
        L79:
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzeo.zzc
            java.lang.String r7 = r7.getPath()
            r7.getClass()
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.matches()
            if (r0 == 0) goto La5
            java.lang.String r7 = r7.group(r5)
            if (r7 == 0) goto La4
            java.lang.String r0 = "format=mpd-time-csf"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L9b
            return r4
        L9b:
            java.lang.String r0 = "format=m3u8-aapl"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto La4
            return r5
        La4:
            return r6
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeo.zzG(android.net.Uri):int");
    }

    public static int zzH(byte[] bArr, int i, int i4, int i6) {
        while (i < i4) {
            i6 = zzg[(i6 >>> 24) ^ (bArr[i] & 255)] ^ (i6 << 8);
            i++;
        }
        return i6;
    }

    public static int zzI(byte[] bArr, int i, int i4, int i6) {
        int iZzU = 65535;
        for (int i10 = 0; i10 < i4; i10++) {
            byte b8 = bArr[i10];
            iZzU = zzU(b8 & 15, zzU((b8 & 255) >> 4, iZzU));
        }
        return iZzU;
    }

    public static int zzJ(byte[] bArr, int i, int i4, int i6) {
        int i10 = 0;
        while (i < i4) {
            i10 = zzi[i10 ^ (bArr[i] & 255)];
            i++;
        }
        return i10;
    }

    public static int zzK(ByteBuffer byteBuffer, int i) {
        int i4 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i4 : Integer.reverseBytes(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r4.zzf(r3);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzL(com.google.android.gms.internal.ads.zzef r3, com.google.android.gms.internal.ads.zzef r4, @androidx.annotation.Nullable java.util.zip.Inflater r5) {
        /*
            int r0 = r3.zzd()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r4.zzj()
            int r2 = r3.zzd()
            if (r0 >= r2) goto L1a
            int r0 = r3.zzd()
            int r0 = r0 + r0
            r4.zzc(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.zzi()
            int r2 = r3.zzg()
            int r3 = r3.zzd()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L31:
            byte[] r0 = r4.zzi()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r4.zzj()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L4c
            r4.zzf(r3)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            r1 = 1
            goto L6c
        L4a:
            r3 = move-exception
            goto L68
        L4c:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 != 0) goto L6c
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L59
            goto L6c
        L59:
            int r0 = r4.zzj()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            if (r3 != r0) goto L31
            int r0 = r4.zzj()     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            int r0 = r0 + r0
            r4.zzc(r0)     // Catch: java.lang.Throwable -> L4a java.util.zip.DataFormatException -> L6c
            goto L31
        L68:
            r5.reset()
            throw r3
        L6c:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeo.zzL(com.google.android.gms.internal.ads.zzef, com.google.android.gms.internal.ads.zzef, java.util.zip.Inflater):boolean");
    }

    public static boolean zzM(zzef zzefVar, zzef zzefVar2, @Nullable Inflater inflater) {
        return zzefVar.zzd() > 0 && zzefVar.zzn() == 120 && zzL(zzefVar, zzefVar2, inflater);
    }

    public static boolean zzN(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzO(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Point zzP(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzN(context)) {
            String strZzV = Build.VERSION.SDK_INT < 28 ? zzV("sys.display-size") : zzV("vendor.display-size");
            if (!TextUtils.isEmpty(strZzV)) {
                try {
                    String[] strArrSplit = strZzV.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        if (i > 0 && i4 > 0) {
                            return new Point(i, i4);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzds.zze("Util", "Invalid display size: ".concat(String.valueOf(strZzV)));
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static String zzQ(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            default:
                return "camera motion";
        }
    }

    public static int zzR(@Nullable String str) {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split(Global.UNDERSCORE, -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z4 = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            if (str2 == null) {
                throw null;
            }
            int i = Integer.parseInt(str2);
            return z4 ? -i : i;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static boolean zzS(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i == 30) {
            String str = Build.MODEL;
            if (zzggj.zze(str, "moto g(20)") || zzggj.zze(str, "rmx3231")) {
                return true;
            }
        }
        return i == 34 && zzggj.zze(Build.MODEL, "sm-x200");
    }

    private static long zzT(long j, long j6, long j7, RoundingMode roundingMode) {
        long jZzc = zzgmz.zzc(j, j6);
        if (jZzc != Long.MAX_VALUE && jZzc != Long.MIN_VALUE) {
            return zzgmz.zza(jZzc, j7, roundingMode);
        }
        long jZzb = zzgmz.zzb(Math.abs(j6), Math.abs(j7));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jZza = zzgmz.zza(j6, jZzb, roundingMode2);
        long jZza2 = zzgmz.zza(j7, jZzb, roundingMode2);
        long jZzb2 = zzgmz.zzb(Math.abs(j), Math.abs(jZza2));
        long jZza3 = zzgmz.zza(j, jZzb2, roundingMode2);
        long jZza4 = zzgmz.zza(jZza2, jZzb2, roundingMode2);
        long jZzc2 = zzgmz.zzc(jZza3, jZza);
        if (jZzc2 != Long.MAX_VALUE && jZzc2 != Long.MIN_VALUE) {
            return zzgmz.zza(jZzc2, jZza4, roundingMode);
        }
        double d10 = (jZza / jZza4) * jZza3;
        if (d10 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d10 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgmu.zza(d10, roundingMode);
    }

    private static int zzU(int i, int i4) {
        return (char) (zzh[(i ^ (i4 >> 12)) & 255] ^ ((char) (i4 << 4)));
    }

    @Nullable
    private static String zzV(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            zzds.zzf("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    private static HashMap zzW() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zze.length;
        HashMap map = new HashMap(length + 88);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zze;
            int length3 = strArr.length;
            if (i >= 88) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static boolean zza(SparseArray sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static Object[] zzb(Object[] objArr, int i) {
        zzghc.zza(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    public static Handler zzc(@Nullable Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        return new Handler(looperMyLooper, null);
    }

    public static boolean zzd(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Looper zze() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static ExecutorService zzf(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.google.android.gms.internal.ads.zzen
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str2 = zzeo.zza;
                return new Thread(runnable, str);
            }
        });
    }

    public static ScheduledExecutorService zzg(String str) {
        final String str2 = "ExoPlayer:AudioTrackReleaseThread";
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.zzem
            @Override // java.util.concurrent.ThreadFactory
            public final /* synthetic */ Thread newThread(Runnable runnable) {
                String str3 = zzeo.zza;
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            }
        });
    }

    public static String zzh(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(androidx.media3.common.C.LANGUAGE_UNDETERMINED)) {
            str = strReplace;
        }
        String strZza = zzggj.zza(str);
        int i = 0;
        String str2 = strZza.split(Global.HYPHEN, 2)[0];
        if (zzd == null) {
            zzd = zzW();
        }
        String str3 = (String) zzd.get(str2);
        if (str3 != null) {
            strZza = str3.concat(String.valueOf(strZza.substring(str2.length())));
            str2 = str3;
        }
        if ("no".equals(str2) || CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT.equals(str2) || "zh".equals(str2)) {
            while (true) {
                String[] strArr = zzf;
                int length = strArr.length;
                if (i >= 18) {
                    break;
                }
                if (strZza.startsWith(strArr[i])) {
                    return String.valueOf(strArr[i + 1]).concat(String.valueOf(strZza.substring(strArr[i].length())));
                }
                i += 2;
            }
        }
        return strZza;
    }

    public static String zzi(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String zzj(byte[] bArr, int i, int i4) {
        return new String(bArr, i, i4, StandardCharsets.UTF_8);
    }

    public static boolean zzk(int i) {
        return i == 10 || i == 13;
    }

    public static int zzl(int[] iArr, int i, boolean z4, boolean z5) {
        int i4;
        int i6;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i6 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i4 = iBinarySearch - 1;
                if (i4 < 0 || iArr[i4] != i) {
                    break;
                }
                iBinarySearch = i4;
            }
            i6 = z4 ? iBinarySearch : i4;
        }
        return z5 ? Math.max(0, i6) : i6;
    }

    public static int zzm(long[] jArr, long j, boolean z4, boolean z5) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i4 = iBinarySearch - 1;
                if (i4 < 0 || jArr[i4] != j) {
                    break;
                }
                iBinarySearch = i4;
            }
            i = iBinarySearch;
        }
        return z5 ? Math.max(0, i) : i;
    }

    public static int zzn(zzdt zzdtVar, long j, boolean z4, boolean z5) {
        int iZzd = zzdtVar.zzd() - 1;
        int i = 0;
        while (i <= iZzd) {
            int i4 = (i + iZzd) >>> 1;
            if (zzdtVar.zzc(i4) < j) {
                i = i4 + 1;
            } else {
                iZzd = i4 - 1;
            }
        }
        int i6 = iZzd + 1;
        if (i6 < zzdtVar.zzd() && zzdtVar.zzc(i6) == j) {
            return i6;
        }
        if (iZzd == -1) {
            return 0;
        }
        return iZzd;
    }

    public static int zzo(long[] jArr, long j, boolean z4, boolean z5) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i = iBinarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            iBinarySearch = i;
        }
        return !z4 ? i : iBinarySearch;
    }

    public static long zzp(long j) {
        return (j == androidx.media3.common.C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static long zzq(long j) {
        return (j == androidx.media3.common.C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long zzr(long j, int i) {
        return zzt(j, 1000000L, i, RoundingMode.DOWN);
    }

    public static long zzs(long j, int i) {
        return zzt(j, i, 1000000L, RoundingMode.UP);
    }

    public static long zzt(long j, long j6, long j7, RoundingMode roundingMode) {
        if (j == 0 || j6 == 0) {
            return 0L;
        }
        return (j7 < j6 || j7 % j6 != 0) ? (j7 >= j6 || j6 % j7 != 0) ? (j7 < j || j7 % j != 0) ? (j7 >= j || j % j7 != 0) ? zzT(j, j6, j7, roundingMode) : zzgmz.zzc(j6, zzgmz.zza(j, j7, RoundingMode.UNNECESSARY)) : zzgmz.zza(j6, zzgmz.zza(j7, j, RoundingMode.UNNECESSARY), roundingMode) : zzgmz.zzc(j, zzgmz.zza(j6, j7, RoundingMode.UNNECESSARY)) : zzgmz.zza(j, zzgmz.zza(j7, j6, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static void zzu(long[] jArr, long j, long j6) {
        long j7;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i = 0;
        if (j6 >= 1000000 && j6 % 1000000 == 0) {
            long jZza = zzgmz.zza(j6, 1000000L, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = zzgmz.zza(jArr[i], jZza, roundingMode);
                i++;
            }
            return;
        }
        if (j6 < 1000000 && 1000000 % j6 == 0) {
            long jZza2 = zzgmz.zza(1000000L, j6, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = zzgmz.zzc(jArr[i], jZza2);
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < jArr.length) {
            long j9 = jArr[i4];
            if (j9 != 0) {
                if (j6 >= j9 && j6 % j9 == 0) {
                    jArr[i4] = zzgmz.zza(1000000L, zzgmz.zza(j6, j9, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j6 >= j9 || j9 % j6 != 0) {
                    j7 = j6;
                    jArr[i4] = zzT(j9, 1000000L, j7, roundingMode);
                } else {
                    jArr[i4] = zzgmz.zzc(1000000L, zzgmz.zza(j9, j6, RoundingMode.UNNECESSARY));
                }
                j7 = j6;
            } else {
                j7 = j6;
            }
            i4++;
            j6 = j7;
        }
    }

    public static long zzv(long j, float f) {
        return f == 1.0f ? j : Math.round(j * ((double) f));
    }

    public static long zzw(long j, float f) {
        return f == 1.0f ? j : Math.round(j / ((double) f));
    }

    public static String zzx(int i) {
        return new String(new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i}, StandardCharsets.US_ASCII);
    }

    public static zzu zzy(int i, int i4, int i6) {
        zzs zzsVar = new zzs();
        zzsVar.zzm(MimeTypes.AUDIO_RAW);
        zzsVar.zzE(i4);
        zzsVar.zzF(i6);
        zzsVar.zzG(i);
        return zzsVar.zzM();
    }

    public static int zzz(int i, ByteOrder byteOrder) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i == 24) {
            if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                return 21;
            }
            return androidx.media3.common.C.ENCODING_PCM_24BIT_BIG_ENDIAN;
        }
        if (i != 32) {
            return 0;
        }
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            return 22;
        }
        return androidx.media3.common.C.ENCODING_PCM_32BIT_BIG_ENDIAN;
    }
}
