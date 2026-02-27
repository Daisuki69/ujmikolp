package E3;

import G6.r;
import K3.b;
import K3.d;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.webkit.ProxyConfig;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.zxing.FormatException;
import com.google.zxing.ReaderException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import java.util.Arrays;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f1249b = {"CTRL_PS", Global.BLANK, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", Ef.a.c, ExifInterface.LONGITUDE_EAST, "F", RequestConfiguration.MAX_AD_CONTENT_RATING_G, i.f16182n, "I", "J", "K", i.f16189u, "M", "N", "O", i.m, "Q", "R", "S", "T", "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] c = {"CTRL_PS", Global.BLANK, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "d", "e", "f", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "j", "k", CmcdData.Factory.STREAM_TYPE_LIVE, "m", "n", "o", TtmlNode.TAG_P, "q", "r", CmcdData.Factory.STREAMING_FORMAT_SS, "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f1250d = {"CTRL_PS", Global.BLANK, "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", Global.NEWLINE, "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", Global.UNDERSCORE, "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    public static final String[] e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", ProxyConfig.MATCH_ALL_SCHEMES, "+", ",", Global.HYPHEN, ".", "/", Global.COLON, Global.SEMICOLON, "<", "=", ">", Global.QUESTION, "[", "]", "{", "}", "CTRL_UL"};
    public static final String[] f = {"CTRL_PS", Global.BLANK, "0", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D3.a f1251a;

    public static int b(boolean[] zArr, int i, int i4) {
        int i6 = 0;
        for (int i10 = i; i10 < i + i4; i10++) {
            i6 <<= 1;
            if (zArr[i10]) {
                i6 |= 1;
            }
        }
        return i6;
    }

    public final d a(D3.a aVar) throws FormatException {
        int i;
        int i4;
        int i6;
        M3.a aVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        int i16;
        int i17 = 2;
        int i18 = 1;
        this.f1251a = aVar;
        b bVar = aVar.f976a;
        boolean z4 = aVar.c;
        int i19 = z4 ? 11 : 14;
        int i20 = aVar.e;
        int i21 = i19 + (i20 << 2);
        int[] iArr = new int[i21];
        int i22 = ((z4 ? 88 : 112) + (i20 << 4)) * i20;
        boolean[] zArr = new boolean[i22];
        if (z4) {
            i = 3;
            for (int i23 = 0; i23 < i21; i23++) {
                iArr[i23] = i23;
            }
            i4 = 4;
        } else {
            i = 3;
            i4 = 4;
            int i24 = i21 / 2;
            int i25 = ((((i24 - 1) / 15) * 2) + (i21 + 1)) / 2;
            for (int i26 = 0; i26 < i24; i26++) {
                iArr[(i24 - i26) - 1] = (i25 - r20) - 1;
                iArr[i24 + i26] = i25 + (i26 / 15) + i26 + 1;
            }
        }
        int i27 = 0;
        int i28 = 0;
        while (true) {
            if (i27 >= i20) {
                break;
            }
            int i29 = ((i20 - i27) << 2) + (z4 ? 9 : 12);
            int i30 = i27 << 1;
            int i31 = (i21 - 1) - i30;
            int i32 = 0;
            while (i32 < i29) {
                int i33 = i32 << 1;
                int i34 = 0;
                while (i34 < i17) {
                    int i35 = i30 + i34;
                    int i36 = i18;
                    int i37 = i30 + i32;
                    zArr[i28 + i33 + i34] = bVar.b(iArr[i35], iArr[i37]);
                    int i38 = i31 - i34;
                    zArr[(i29 * 2) + i28 + i33 + i34] = bVar.b(iArr[i37], iArr[i38]);
                    int i39 = i31 - i32;
                    zArr[(i29 * 4) + i28 + i33 + i34] = bVar.b(iArr[i38], iArr[i39]);
                    zArr[(i29 * 6) + i28 + i33 + i34] = bVar.b(iArr[i39], iArr[i35]);
                    i34++;
                    i20 = i20;
                    i18 = i36;
                    i17 = 2;
                }
                i32++;
                i17 = 2;
            }
            i28 += i29 << 3;
            i27++;
            i20 = i20;
            i17 = 2;
        }
        int i40 = i18;
        int i41 = 6;
        D3.a aVar3 = this.f1251a;
        int i42 = aVar3.e;
        if (i42 <= 2) {
            aVar2 = M3.a.j;
            i10 = 6;
        } else if (i42 <= 8) {
            aVar2 = M3.a.f3051n;
            i10 = 8;
        } else {
            if (i42 <= 22) {
                aVar2 = M3.a.i;
                i6 = 10;
            } else {
                aVar2 = M3.a.h;
            }
            i10 = i6;
        }
        int i43 = i22 / i10;
        int i44 = aVar3.f978d;
        if (i43 < i44) {
            throw FormatException.a();
        }
        int i45 = i22 % i10;
        int[] iArr2 = new int[i43];
        int i46 = 0;
        while (i46 < i43) {
            iArr2[i46] = b(zArr, i45, i10);
            i46++;
            i45 += i10;
        }
        try {
            new r(aVar2, 19).e(i43 - i44, iArr2);
            int i47 = i40 << i10;
            int i48 = i47 - 1;
            int i49 = 0;
            int i50 = 0;
            while (i49 < i44) {
                int i51 = iArr2[i49];
                if (i51 == 0 || i51 == i48) {
                    throw FormatException.a();
                }
                int i52 = i40;
                if (i51 == i52 || i51 == i47 - 2) {
                    i50 += i52;
                }
                i49 += i52;
                i40 = i52;
            }
            int i53 = (i44 * i10) - i50;
            boolean[] zArr2 = new boolean[i53];
            int i54 = 0;
            int i55 = 0;
            while (i54 < i44) {
                int i56 = iArr2[i54];
                int i57 = 1;
                if (i56 == 1 || i56 == i47 - 2) {
                    i16 = 1;
                    Arrays.fill(zArr2, i55, (i55 + i10) - 1, i56 > 1);
                    i55 = (i10 - 1) + i55;
                } else {
                    int i58 = i10 - 1;
                    while (i58 >= 0) {
                        int i59 = i55 + 1;
                        zArr2[i55] = (i56 & (i57 << i58)) != 0;
                        i58--;
                        i55 = i59;
                        i57 = 1;
                    }
                    i16 = i57;
                }
                i54 += i16;
            }
            int i60 = 8;
            int i61 = (i53 + 7) / 8;
            byte[] bArr = new byte[i61];
            int i62 = 0;
            while (i62 < i61) {
                int i63 = i62 << 3;
                int i64 = i53 - i63;
                bArr[i62] = i64 >= i60 ? (byte) b(zArr2, i63, i60) : (byte) (b(zArr2, i63, i64) << (8 - i64));
                i62++;
                i60 = 8;
            }
            StringBuilder sb2 = new StringBuilder(20);
            int i65 = 0;
            int i66 = 1;
            int i67 = 1;
            while (i65 < i53) {
                if (i67 != i41) {
                    int i68 = i67 == i4 ? 4 : 5;
                    if (i53 - i65 < i68) {
                        break;
                    }
                    int iB = b(zArr2, i65, i68);
                    i65 += i68;
                    int iC = AbstractC2217b.c(i67);
                    if (iC != 0) {
                        i12 = 1;
                        if (iC != 1) {
                            i13 = 2;
                            if (iC != 2) {
                                i11 = i;
                                if (iC != i11) {
                                    i14 = 4;
                                    if (iC != 4) {
                                        throw new IllegalStateException("Bad table");
                                    }
                                    str = e[iB];
                                } else {
                                    i14 = 4;
                                    str = f[iB];
                                }
                            } else {
                                i11 = i;
                                i14 = 4;
                                str = f1250d[iB];
                            }
                        } else {
                            i11 = i;
                            i13 = 2;
                            i14 = 4;
                            str = c[iB];
                        }
                    } else {
                        i11 = i;
                        i12 = 1;
                        i13 = 2;
                        i14 = 4;
                        str = f1249b[iB];
                    }
                    if (str.startsWith("CTRL_")) {
                        char cCharAt = str.charAt(5);
                        i66 = cCharAt != 'B' ? cCharAt != 'D' ? cCharAt != 'P' ? cCharAt != 'L' ? cCharAt != 'M' ? i12 : i11 : i13 : 5 : i14 : 6;
                        i15 = 6;
                        if (str.charAt(6) != 'L') {
                            int i69 = i67;
                            i67 = i66;
                            i66 = i69;
                        }
                        i41 = i15;
                        i = i11;
                        i4 = i14;
                    } else {
                        i15 = 6;
                        sb2.append(str);
                    }
                    i67 = i66;
                    i41 = i15;
                    i = i11;
                    i4 = i14;
                } else {
                    if (i53 - i65 < 5) {
                        break;
                    }
                    int iB2 = b(zArr2, i65, 5);
                    int i70 = i65 + 5;
                    if (iB2 == 0) {
                        if (i53 - i70 < 11) {
                            break;
                        }
                        iB2 = b(zArr2, i70, 11) + 31;
                        i70 = i65 + 16;
                    }
                    int i71 = 0;
                    while (true) {
                        if (i71 >= iB2) {
                            i65 = i70;
                            break;
                        }
                        if (i53 - i70 < 8) {
                            i65 = i53;
                            break;
                        }
                        sb2.append((char) b(zArr2, i70, 8));
                        i70 += 8;
                        i71++;
                    }
                    i67 = i66;
                    i41 = 6;
                }
            }
            return new d(bArr, sb2.toString(), null, null);
        } catch (ReedSolomonException e7) {
            FormatException formatException = FormatException.c;
            if (ReaderException.f10139a) {
                throw new FormatException(e7);
            }
            throw FormatException.c;
        }
    }
}
