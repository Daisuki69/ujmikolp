package N4;

import C3.n;
import D.C0187u;
import D.S;
import M8.A0;
import Q3.h;
import S1.s;
import a0.InterfaceC0619a;
import android.content.Context;
import android.os.Bundle;
import cg.InterfaceC1101b;
import ch.l;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.dynatrace.android.agent.Global;
import com.google.firebase.messaging.r;
import com.paymaya.domain.model.FavoriteStatus;
import com.paymaya.mayaui.common.view.dialog.impl.MayaPostTransactionBottomSheetDialogFragment;
import g0.C1494c;
import gf.C1518a;
import hh.InterfaceC1573f;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import l1.InterfaceC1797a;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;
import n3.C1916a;
import o1.AbstractC1955a;
import p3.C2011b;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Fg.g, InterfaceC1101b, M5.f, n, hh.n, InterfaceC0619a, InterfaceC1573f, InterfaceC1797a, b2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f3528b = new d(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3529a;

    public /* synthetic */ d(int i) {
        this.f3529a = i;
    }

    public static Charset a(String str) {
        if (str == null) {
            return StandardCharsets.UTF_8;
        }
        Matcher matcher = Pattern.compile("charset\\s*=\\s*([^\\s;]+)", 2).matcher(str);
        if (matcher.find()) {
            String strReplaceAll = matcher.group(1).replaceAll("[\"']", "");
            try {
                return Charset.forName(strReplaceAll);
            } catch (Exception unused) {
                Ri.a.q("Unsupported charset: " + strReplaceAll + ", using UTF-8");
            }
        }
        return StandardCharsets.UTF_8;
    }

    public static boolean b(Bundle bundle) {
        String string = bundle.getString("pt_id");
        return ("0".equals(string) || string == null || string.isEmpty()) ? false : true;
    }

    public static MayaPostTransactionBottomSheetDialogFragment c(int i, String str, String str2, String str3, String str4, FavoriteStatus favoriteStatus) {
        j.g(favoriteStatus, "favoriteStatus");
        MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment = new MayaPostTransactionBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("image_res_id", i);
        bundle.putCharSequence("title", str);
        bundle.putCharSequence("description", str2);
        bundle.putString("primary_text", str3);
        bundle.putString("secondary_text", str4);
        bundle.putString("tertiary_text", null);
        bundle.putSerializable("favorite_status", favoriteStatus);
        mayaPostTransactionBottomSheetDialogFragment.setArguments(bundle);
        return mayaPostTransactionBottomSheetDialogFragment;
    }

    public static C1518a h(InputStream inputStream) throws IOException {
        int i = -1;
        String str = null;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            String strJ = j(inputStream);
            if (strJ == null || strJ.trim().isEmpty()) {
                break;
            }
            int iIndexOf = strJ.indexOf(58);
            if (iIndexOf > 0) {
                String strTrim = strJ.substring(0, iIndexOf).trim();
                String strTrim2 = strJ.substring(iIndexOf + 1).trim();
                Locale locale = Locale.US;
                String lowerCase = strTrim.toLowerCase(locale);
                if ("content-length".equals(lowerCase)) {
                    try {
                        i = Integer.parseInt(strTrim2);
                    } catch (NumberFormatException unused) {
                        Ri.a.q("Invalid Content-Length header: ".concat(strJ));
                    }
                } else if ("transfer-encoding".equals(lowerCase) && strTrim2.toLowerCase(locale).contains("chunked")) {
                    z4 = true;
                } else if ("connection".equals(lowerCase) && strTrim2.toLowerCase(locale).contains("close")) {
                    z5 = true;
                } else if ("content-type".equals(lowerCase)) {
                    str = strTrim2;
                }
            }
        }
        return new C1518a(str, i, z4, z5);
    }

    public static int i(String str) throws IOException {
        String[] strArrSplit = str.split(Global.BLANK);
        if (strArrSplit.length < 2) {
            throw new IOException("Invalid HTTP status line: ".concat(str));
        }
        try {
            return Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException e) {
            throw new IOException("Invalid HTTP status code in line: ".concat(str), e);
        }
    }

    public static String j(InputStream inputStream) throws IOException {
        int i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        loop0: while (true) {
            boolean z4 = false;
            while (true) {
                i = inputStream.read();
                if (i != -1) {
                    if (i != 13) {
                        if (i == 10 && z4) {
                            break loop0;
                        }
                        if (z4) {
                            break;
                        }
                        byteArrayOutputStream.write(i);
                    } else {
                        z4 = true;
                    }
                } else {
                    break loop0;
                }
            }
            byteArrayOutputStream.write(13);
            byteArrayOutputStream.write(i);
        }
        if (i == -1 && byteArrayOutputStream.size() == 0) {
            return null;
        }
        return new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
    }

    @Override // hh.InterfaceC1573f
    public void accept(Object obj) {
        Throwable nullPointerException = (Throwable) obj;
        String str = "The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + nullPointerException;
        if (nullPointerException == null) {
            nullPointerException = new NullPointerException();
        }
        s.r(new OnErrorNotImplementedException(str, nullPointerException));
    }

    @Override // hh.n
    public Object apply(Object obj) {
        List list = (List) obj;
        return list.isEmpty() ? l.empty() : l.just(new Ze.a(list));
    }

    @Override // M5.f
    public String d() {
        switch (this.f3529a) {
            case 6:
                return String.format("SELECT * FROM %s", Arrays.copyOf(new Object[]{"action_card_recommendation"}, 1));
            case 7:
                return String.format("SELECT * FROM %1$s", Arrays.copyOf(new Object[]{"financial_document"}, 1));
            case 8:
                return String.format("SELECT * FROM %1$s", "backup_identity");
            default:
                return String.format("SELECT * FROM %1$s WHERE %2$s IS NULL OR %2$s NOT LIKE '%3$s' GROUP BY %4$s ORDER BY %5$s DESC LIMIT %6$s", Arrays.copyOf(new Object[]{"shop_purchase_history", "other_fields", "%\"hidden\":true%", "product_id", MPDbAdapter.KEY_CREATED_AT, 5}, 6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r1v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r5v17, types: [Ff.f] */
    @Override // C3.n
    public K3.b e(String str, C3.a aVar, int i, int i4, HashMap map) {
        int i6;
        int i10;
        int i11;
        Q3.f fVar;
        int i12;
        char c;
        int i13;
        int i14;
        byte[] bArr;
        K3.b bVar;
        int i15;
        int i16;
        byte[] bArr2;
        boolean z4;
        int i17;
        int i18 = 0;
        int i19 = 13;
        int i20 = 2;
        int i21 = 1;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != C3.a.f) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got " + aVar);
        }
        if (i < 0 || i4 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i4);
        }
        Q3.g gVar = Q3.g.f5217a;
        if (map != null) {
            Q3.g gVar2 = (Q3.g) map.get(C3.c.c);
            if (gVar2 != null) {
                gVar = gVar2;
            }
            if (map.get(C3.c.f708d) != null) {
                throw new ClassCastException();
            }
            if (map.get(C3.c.e) != null) {
                throw new ClassCastException();
            }
        }
        int i22 = 3;
        int i23 = 0;
        Q3.c[] cVarArr = {new mg.c(i19), new C2011b(i19), new h(i18), new h(i21), new z2.d(i19), new C1916a(i19)};
        Q3.d dVar = new Q3.d(str);
        dVar.f5207b = gVar;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            dVar.d((char) 236);
            dVar.f5209g = 2;
            dVar.f5208d += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            dVar.d((char) 237);
            dVar.f5209g = 2;
            dVar.f5208d += 7;
        }
        int i24 = 0;
        while (dVar.b()) {
            cVarArr[i24].g(dVar);
            int i25 = dVar.e;
            if (i25 >= 0) {
                dVar.e = -1;
                i24 = i25;
            }
        }
        StringBuilder sb2 = dVar.c;
        int length = sb2.length();
        dVar.c(sb2.length());
        int i26 = dVar.f.f5214b;
        if (length < i26 && i24 != 0 && i24 != 5 && i24 != 4) {
            dVar.d((char) 254);
        }
        if (sb2.length() < i26) {
            sb2.append((char) 129);
        }
        while (sb2.length() < i26) {
            int length2 = ((sb2.length() + 1) * 149) % 253;
            int i27 = length2 + 130;
            if (i27 > 254) {
                i27 = length2 - 124;
            }
            sb2.append((char) i27);
        }
        String string = sb2.toString();
        Q3.f fVarE = Q3.f.e(string.length(), gVar);
        int[] iArr = Q3.e.f5210a;
        int length3 = string.length();
        int i28 = fVarE.f5214b;
        if (length3 != i28) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        int i29 = fVarE.c;
        StringBuilder sb3 = new StringBuilder(i28 + i29);
        sb3.append(string);
        int iC = fVarE.c();
        if (iC == 1) {
            sb3.append(Q3.e.a(i29, string));
        } else {
            sb3.setLength(sb3.capacity());
            int[] iArr2 = new int[iC];
            int[] iArr3 = new int[iC];
            int[] iArr4 = new int[iC];
            int i30 = 0;
            while (i30 < iC) {
                int i31 = i30 + 1;
                iArr2[i30] = fVarE.a(i31);
                iArr3[i30] = fVarE.h;
                iArr4[i30] = 0;
                if (i30 > 0) {
                    iArr4[i30] = iArr4[i30 - 1] + iArr2[i30];
                }
                i30 = i31;
            }
            for (int i32 = 0; i32 < iC; i32++) {
                StringBuilder sb4 = new StringBuilder(iArr2[i32]);
                for (int i33 = i32; i33 < i28; i33 += iC) {
                    sb4.append(string.charAt(i33));
                }
                String strA = Q3.e.a(iArr3[i32], sb4.toString());
                int i34 = i32;
                int i35 = 0;
                while (i34 < iArr3[i32] * iC) {
                    sb3.setCharAt(i28 + i34, strA.charAt(i35));
                    i34 += iC;
                    i35++;
                }
            }
        }
        String string2 = sb3.toString();
        int iB = fVarE.b();
        int i36 = fVarE.f5215d;
        int iD = fVarE.d();
        int i37 = fVarE.e;
        Q3.b bVar2 = new Q3.b(string2, iB * i36, iD * i37);
        int i38 = 4;
        int i39 = 0;
        int i40 = 0;
        while (true) {
            i6 = bVar2.f5204b;
            i10 = bVar2.f5203a;
            if (i38 == i10 && i40 == 0) {
                int i41 = i10 - 1;
                int i42 = i23;
                bVar2.c(i41, i42, i39, 1);
                bVar2.c(i41, 1, i39, i20);
                bVar2.c(i41, i20, i39, i22);
                bVar2.c(i42, i6 - 2, i39, 4);
                int i43 = i6 - 1;
                bVar2.c(i42, i43, i39, 5);
                bVar2.c(1, i43, i39, 6);
                bVar2.c(i20, i43, i39, 7);
                bVar2.c(3, i43, i39, 8);
                i39++;
            }
            i11 = i10 - 2;
            if (i38 == i11 && i40 == 0 && i6 % 4 != 0) {
                i13 = 1;
                fVar = fVarE;
                bVar2.c(i10 - 3, 0, i39, 1);
                bVar2.c(i11, 0, i39, i20);
                i12 = i20;
                bVar2.c(i10 - 1, 0, i39, 3);
                bVar2.c(0, i6 - 4, i39, 4);
                bVar2.c(0, i6 - 3, i39, 5);
                bVar2.c(0, i6 - 2, i39, 6);
                int i44 = i6 - 1;
                bVar2.c(0, i44, i39, 7);
                c = '\b';
                bVar2.c(1, i44, i39, 8);
                i39++;
            } else {
                fVar = fVarE;
                i12 = i20;
                c = '\b';
                i13 = 1;
            }
            if (i38 == i11 && i40 == 0 && i6 % 8 == 4) {
                bVar2.c(i10 - 3, 0, i39, i13);
                bVar2.c(i11, 0, i39, i12);
                bVar2.c(i10 - 1, 0, i39, 3);
                bVar2.c(0, i6 - 2, i39, 4);
                int i45 = i6 - 1;
                bVar2.c(0, i45, i39, 5);
                bVar2.c(i13, i45, i39, 6);
                i14 = i12;
                bVar2.c(i14, i45, i39, 7);
                bVar2.c(3, i45, i39, 8);
                i39++;
            } else {
                i14 = i12;
            }
            if (i38 == i10 + 4 && i40 == i14 && i6 % 8 == 0) {
                int i46 = i10 - 1;
                bVar2.c(i46, 0, i39, 1);
                int i47 = i6 - 1;
                bVar2.c(i46, i47, i39, i14);
                int i48 = i6 - 3;
                bVar2.c(0, i48, i39, 3);
                int i49 = i6 - 2;
                bVar2.c(0, i49, i39, 4);
                bVar2.c(0, i47, i39, 5);
                bVar2.c(1, i48, i39, 6);
                bVar2.c(1, i49, i39, 7);
                bVar2.c(1, i47, i39, 8);
                i39++;
            }
            while (true) {
                bArr = (byte[]) bVar2.f5205d;
                if (i38 < i10 && i40 >= 0 && bArr[(i38 * i6) + i40] < 0) {
                    bVar2.f(i38, i40, i39);
                    i39++;
                }
                int i50 = i38 - 2;
                int i51 = i40 + 2;
                if (i50 < 0 || i51 >= i6) {
                    break;
                }
                i40 = i51;
                i38 = i50;
            }
            int i52 = i38 - 1;
            int i53 = i40 + 5;
            while (true) {
                if (i52 >= 0 && i53 < i6 && bArr[(i52 * i6) + i53] < 0) {
                    bVar2.f(i52, i53, i39);
                    i39++;
                }
                int i54 = i52 + 2;
                int i55 = i53 - 2;
                if (i54 >= i10 || i55 < 0) {
                    break;
                }
                i52 = i54;
                i53 = i55;
            }
            i38 = i52 + 5;
            i40 = i53 - 1;
            if (i38 >= i10 && i40 >= i6) {
                break;
            }
            i23 = 0;
            fVarE = fVar;
            i20 = 2;
            i22 = 3;
        }
        int i56 = i6 - 1;
        int i57 = i10 - 1;
        if (bArr[(i57 * i6) + i56] < 0) {
            int i58 = (i57 * i6) + i56;
            byte b8 = (byte) 1;
            bArr[i58] = b8;
            bArr[(i11 * i6) + (i6 - 2)] = b8;
        }
        int iB2 = fVar.b() * i36;
        int iD2 = fVar.d() * i37;
        ?? fVar2 = new Ff.f((fVar.b() * i36) + (fVar.b() << 1), (fVar.d() * i37) + (fVar.d() << 1), 4);
        int i59 = 0;
        int i60 = 0;
        while (i60 < iD2) {
            int i61 = i60 % i37;
            if (i61 == 0) {
                int i62 = 0;
                int i63 = 0;
                while (true) {
                    bArr2 = bArr;
                    z4 = true;
                    if (i62 >= (fVar.b() * i36) + (fVar.b() << 1)) {
                        break;
                    }
                    fVar2.i(i63, i59, i62 % 2 == 0);
                    i63++;
                    i62++;
                    bArr = bArr2;
                }
                i59++;
            } else {
                bArr2 = bArr;
                z4 = true;
            }
            int i64 = 0;
            int i65 = 0;
            ?? r1 = z4;
            while (i64 < iB2) {
                int i66 = i64 % i36;
                if (i66 == 0) {
                    fVar2.i(i65, i59, r1);
                    i65 += r1;
                }
                fVar2.i(i65, i59, bArr2[(i60 * i6) + i64] == r1 ? r1 : 0);
                int i67 = i65 + 1;
                ?? r18 = r1;
                if (i66 == i36 - 1) {
                    fVar2.i(i67, i59, i60 % 2 == 0 ? r18 == true ? 1 : 0 : false);
                    i65 += 2;
                } else {
                    i65 = i67;
                }
                i64++;
                r1 = r18 == true ? 1 : 0;
            }
            ?? r182 = r1;
            int i68 = i59 + 1;
            if (i61 == i37 - 1) {
                int i69 = 0;
                for (int i70 = 0; i70 < (fVar.b() * i36) + (fVar.b() << 1); i70 += r182 == true ? 1 : 0) {
                    fVar2.i(i69, i68, r182);
                    i69 += r182 == true ? 1 : 0;
                }
                i17 = r182 == true ? 1 : 0;
                i59 += 2;
            } else {
                i17 = r182 == true ? 1 : 0;
                i59 = i68;
            }
            i60 += i17;
            bArr = bArr2;
        }
        int i71 = fVar2.f1581b;
        int iMax = Math.max(i, i71);
        int i72 = fVar2.c;
        int iMax2 = Math.max(i4, i72);
        int iMin = Math.min(iMax / i71, iMax2 / i72);
        int i73 = (iMax - (i71 * iMin)) / 2;
        int i74 = (iMax2 - (i72 * iMin)) / 2;
        if (i4 < i72 || i < i71) {
            bVar = new K3.b(i71, i72);
            i15 = 0;
            i16 = 0;
        } else {
            bVar = new K3.b(i, i4);
            i16 = i74;
            i15 = i73;
        }
        int[] iArr5 = bVar.f2591d;
        int length4 = iArr5.length;
        for (int i75 = 0; i75 < length4; i75++) {
            iArr5[i75] = 0;
        }
        int i76 = i16;
        int i77 = 0;
        while (i77 < i72) {
            int i78 = i15;
            int i79 = 0;
            while (i79 < i71) {
                if (fVar2.e(i79, i77) == 1) {
                    bVar.g(i78, i76, iMin, iMin);
                }
                i79++;
                i78 += iMin;
            }
            i77++;
            i76 += iMin;
        }
        return bVar;
    }

    @Override // l1.InterfaceC1797a
    public long f() {
        return System.currentTimeMillis();
    }

    public synchronized boolean g(Context context, Bundle bundle, String str) {
        try {
            bundle.putLong("omr_invoke_time_in_millis", System.currentTimeMillis());
            C0187u c0187uB = C0187u.b(context, bundle.getString("wzrk_acct_id", ""));
            if (!C0187u.h(bundle).f16771a) {
                return false;
            }
            if (c0187uB != null) {
                ((CleverTapInstanceConfig) c0187uB.f949b.f814a).e("PushProvider", str + "received notification from CleverTap: " + bundle.toString());
                b(bundle);
                "signedcall".equals(bundle.getString("source"));
                c0187uB.p(new C1494c(), context, bundle);
            } else {
                S.c("PushProvider", str + "received notification from CleverTap: " + bundle.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" not renderning since cleverTapAPI is null");
                S.c("PushProvider", sb2.toString());
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // aj.InterfaceC0716a
    public Object get() {
        K2.a aVarE = K2.a.e();
        AbstractC1955a.d(aVarE);
        return aVarE;
    }

    @Override // Fg.g
    public void log(String message) {
        j.g(message, "message");
        String strC = z.a(d.class).c();
        if (strC == null) {
            strC = "okttp";
        }
        A0.w(2, message, strC);
    }

    @Override // b2.c
    public Object v(Xh.b bVar) {
        return new C2011b(0);
    }

    public d(r rVar) {
        this.f3529a = 5;
    }
}
