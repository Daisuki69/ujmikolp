package a;

import D.S;
import F7.i;
import F7.m;
import F7.n;
import F7.p;
import Ng.C;
import Qh.c;
import Rg.t;
import S1.s;
import a7.C0633A;
import a7.C0663x;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.collection.ScatterMapKt;
import androidx.media3.extractor.ts.PsExtractor;
import bj.C1030a;
import ch.r;
import cj.AbstractC1121g;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.domain.model.Fee;
import com.paymaya.domain.model.TotalAmount;
import com.paymaya.domain.model.UserActivity;
import dOYHB6.tiZVw8.numX49;
import io.flutter.embedding.android.KeyboardMap;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;
import t4.h;
import vh.AbstractC2353d;
import x5.C2467a;

/* JADX INFO: renamed from: a.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0617a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f6972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C2467a f6973b;

    public static final String A(int i) {
        return i + B(i);
    }

    public static final String B(int i) {
        int i4 = i % 100;
        String strTnTj78 = numX49.tnTj78("PLP");
        if (11 <= i4 && i4 < 14) {
            return strTnTj78;
        }
        int i6 = i % 10;
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? strTnTj78 : numX49.tnTj78("PLb") : numX49.tnTj78("PL2") : numX49.tnTj78("PLL");
    }

    public static final ArrayList C(Bundle bundle, String str, Class cls) {
        return Build.VERSION.SDK_INT > 33 ? bundle.getParcelableArrayList(str, cls) : bundle.getParcelableArrayList(str);
    }

    public static final Object D(Bundle bundle, String str, Class cls) {
        j.g(bundle, numX49.tnTj78("PLr"));
        if (Build.VERSION.SDK_INT > 33) {
            return bundle.getParcelable(str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable == null) {
            return null;
        }
        return parcelable;
    }

    public static SecretKey E() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return (SecretKey) keyStore.getKey("paymaya_security_key", null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e) {
            e.getMessage();
            yk.a.c();
            throw new PayMayaRuntimeException(numX49.tnTj78("PLZ") + e.getMessage(), e);
        }
    }

    public static final boolean F(C c) {
        j.g(c, numX49.tnTj78("PLk"));
        String strTnTj78 = numX49.tnTj78("PLB");
        String str = c.f4409a;
        return j.b(str, strTnTj78) || j.b(str, numX49.tnTj78("PLu"));
    }

    public static long G(int i, int i4, String str) {
        int i6 = i4;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < i) {
            int i14 = i10 + 1;
            int iCharAt = str.charAt(i10);
            int i15 = 8;
            if (iCharAt < 128) {
                i10 = i14;
            } else if (iCharAt < 2048) {
                iCharAt = (((iCharAt & 63) | 128) << 8) | (iCharAt >> 6) | PsExtractor.AUDIO_STREAM;
                i10 = i14;
                i15 = 16;
            } else if (iCharAt < 55296 || iCharAt > 57343 || i14 >= i) {
                iCharAt = (((iCharAt & 63) | 128) << 16) | (iCharAt >> 12) | 224 | ((((iCharAt >> 6) & 63) | 128) << 8);
                i10 = i14;
                i15 = 24;
            } else {
                i10 += 2;
                int iCharAt2 = ((iCharAt - Utf8.HIGH_SURROGATE_HEADER) << 10) + (str.charAt(i14) & 1023);
                iCharAt = (((iCharAt2 & 63) | 128) << 24) | (((iCharAt2 >> 18) | PsExtractor.VIDEO_STREAM_MASK) & 255) | ((((iCharAt2 >> 12) & 63) | 128) << 8) | ((((iCharAt2 >> 6) & 63) | 128) << 16);
                i15 = 32;
            }
            i13 |= iCharAt << i11;
            i11 += i15;
            if (i11 >= 32) {
                int i16 = i13 * ScatterMapKt.MurmurHashC1;
                int i17 = i6 ^ (((i16 >>> 17) | (i16 << 15)) * 461845907);
                i6 = (((i17 >>> 19) | (i17 << 13)) * 5) - 430675100;
                i11 -= 32;
                i13 = i11 != 0 ? iCharAt >>> (i15 - i11) : 0;
                i12 += 4;
            }
        }
        if (i11 > 0) {
            i12 += i11 >> 3;
            int i18 = i13 * ScatterMapKt.MurmurHashC1;
            i6 ^= ((i18 << 15) | (i18 >>> 17)) * 461845907;
        }
        int i19 = i6 ^ i12;
        int i20 = (i19 ^ (i19 >>> 16)) * (-2048144789);
        int i21 = (i20 ^ (i20 >>> 13)) * (-1028477387);
        return ((long) (i21 ^ (i21 >>> 16))) & KeyboardMap.kValueMask;
    }

    public static void H(r rVar, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            cVar.getClass();
            Throwable thB = AbstractC2353d.b(cVar);
            if (thB != null) {
                rVar.onError(thB);
            } else {
                rVar.onComplete();
            }
        }
    }

    public static void I(r rVar, Throwable th2, AtomicInteger atomicInteger, c cVar) {
        cVar.getClass();
        if (!AbstractC2353d.a(cVar, th2)) {
            s.r(th2);
        } else if (atomicInteger.getAndIncrement() == 0) {
            rVar.onError(AbstractC2353d.b(cVar));
        }
    }

    public static void J(r rVar, Object obj, AtomicInteger atomicInteger, c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            rVar.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                cVar.getClass();
                Throwable thB = AbstractC2353d.b(cVar);
                if (thB != null) {
                    rVar.onError(thB);
                } else {
                    rVar.onComplete();
                }
            }
        }
    }

    public static final void L(int i, int i4, Object[] objArr) {
        j.g(objArr, numX49.tnTj78("PLV"));
        while (i < i4) {
            objArr[i] = null;
            i++;
        }
    }

    public static final boolean i(Object[] objArr, int i, int i4, List list) {
        if (i4 == list.size()) {
            for (int i6 = 0; i6 < i4; i6++) {
                if (j.b(objArr[i + i6], list.get(i6))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String j(Object[] objArr, int i, int i4, AbstractC1121g abstractC1121g) {
        StringBuilder sb2 = new StringBuilder((i4 * 3) + 2);
        sb2.append(numX49.tnTj78("PLS"));
        for (int i6 = 0; i6 < i4; i6++) {
            if (i6 > 0) {
                sb2.append(numX49.tnTj78("PLj"));
            }
            Object obj = objArr[i + i6];
            if (obj == abstractC1121g) {
                sb2.append(numX49.tnTj78("PLd"));
            } else {
                sb2.append(obj);
            }
        }
        sb2.append(numX49.tnTj78("PLi"));
        String string = sb2.toString();
        j.f(string, numX49.tnTj78("PLE"));
        return string;
    }

    public static void k(C0633A c0633a, final i iVar, UserActivity userActivity) {
        final int i = 1;
        final int i4 = 0;
        j.g(userActivity, numX49.tnTj78("PLF"));
        Fee feeMFee = userActivity.mFee();
        TotalAmount totalAmountMTotalAmount = userActivity.mTotalAmount();
        MayaAbstractBaseUserActivityFragmentImpl mayaAbstractBaseUserActivityFragmentImpl = (MayaAbstractBaseUserActivityFragmentImpl) iVar;
        String string = mayaAbstractBaseUserActivityFragmentImpl.getString(R.string.maya_label_convenience_fee);
        String strTnTj78 = numX49.tnTj78("PLH");
        j.f(string, strTnTj78);
        boolean zA = C0633A.a(c0633a, string, feeMFee != null ? feeMFee.mLabel() : null, feeMFee != null ? feeMFee.mValue() : null, false, new Function1() { // from class: J7.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String it = (String) obj;
                switch (i4) {
                    case 0:
                        kotlin.jvm.internal.j.g(it, "it");
                        break;
                    default:
                        kotlin.jvm.internal.j.g(it, "it");
                        break;
                }
                return ((MayaAbstractBaseUserActivityFragmentImpl) iVar).K1().concat(it);
            }
        }, 8);
        String string2 = mayaAbstractBaseUserActivityFragmentImpl.getString(R.string.maya_label_amount_paid);
        j.f(string2, strTnTj78);
        C0633A.d(c0633a, new boolean[]{zA, C0633A.a(c0633a, string2, totalAmountMTotalAmount != null ? totalAmountMTotalAmount.getLabel() : null, totalAmountMTotalAmount != null ? totalAmountMTotalAmount.getValue() : null, false, new Function1() { // from class: J7.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String it = (String) obj;
                switch (i) {
                    case 0:
                        kotlin.jvm.internal.j.g(it, "it");
                        break;
                    default:
                        kotlin.jvm.internal.j.g(it, "it");
                        break;
                }
                return ((MayaAbstractBaseUserActivityFragmentImpl) iVar).K1().concat(it);
            }
        }, 8)});
    }

    public static void l(int i, int i4, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            Log.e(numX49.tnTj78("PLQ"), GLES20.glGetShaderInfoLog(iGlCreateShader) + numX49.tnTj78("PLO") + str);
        }
        GLES20.glAttachShader(i4, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        n();
    }

    public static final void m(t tVar, t tVar2) {
        j.g(tVar, numX49.tnTj78("PLt"));
        j.g(tVar2, numX49.tnTj78("PLU"));
        for (Map.Entry entry : tVar2.a()) {
            tVar.e((List) entry.getValue(), (String) entry.getKey());
        }
    }

    public static void n() {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            Log.e(numX49.tnTj78("PL8"), numX49.tnTj78("PLe") + GLU.gluErrorString(iGlGetError));
        }
    }

    public static void o(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + numX49.tnTj78("PLC") + j + numX49.tnTj78("PL4"));
    }

    public static final void p(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                C1030a.a(th2, th3);
            }
        }
    }

    public static int q(String str, String str2) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        n();
        l(35633, iGlCreateProgram, str);
        l(35632, iGlCreateProgram, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            Log.e(numX49.tnTj78("PLK"), numX49.tnTj78("PLo") + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        }
        n();
        return iGlCreateProgram;
    }

    public static String r(String str, String str2) {
        byte[] bArrY = y(str2);
        if (com.paymaya.common.utility.C.e(str)) {
            return numX49.tnTj78("PLw");
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(2, E(), new IvParameterSpec(bArrY));
            return new String(cipher.doFinal(y(str)), "UTF-8");
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            e.getMessage();
            yk.a.c();
            throw new PayMayaRuntimeException(numX49.tnTj78("PLc") + e.getMessage(), e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a7.C0633A s(F7.e r11, com.paymaya.domain.model.UserActivity r12) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0617a.s(F7.e, com.paymaya.domain.model.UserActivity):a7.A");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0633A t(n nVar, UserActivity userActivity) {
        C0633A c0633a = new C0633A();
        C0633A.d(c0633a, new boolean[]{C0633A.c(c0633a, nVar.t(), userActivity.getInstapayAccountType(), null, 12), C0633A.c(c0633a, nVar.R0(), userActivity.getInstapayAccountNumber(), null, 12), C0633A.c(c0633a, nVar.E0(), userActivity.getInstapayAccountName(), null, 12)});
        k(c0633a, nVar, userActivity);
        C0633A.d(c0633a, new boolean[]{C0633A.c(c0633a, ((MayaAbstractBaseUserActivityFragmentImpl) nVar).L1(), userActivity.getParsedReferenceNoWithSpaces(), null, 12), C0633A.a(c0633a, nVar.p(), userActivity.mTraceNumberLabel(), userActivity.mTraceNumber(), false, null, 24), C0633A.a(c0633a, nVar.o(), userActivity.mInvoiceNumberLabel(), userActivity.mInvoiceNumber(), false, null, 24)});
        return c0633a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0633A u(m mVar, UserActivity userActivity) {
        String upperCase;
        C0633A c0633a = new C0633A();
        k(c0633a, mVar, userActivity);
        boolean zC = C0633A.c(c0633a, ((MayaAbstractBaseUserActivityFragmentImpl) mVar).L1(), userActivity.getParsedReferenceNoWithSpaces(), null, 12);
        String strN = mVar.n();
        String parsedPaymentIdWithSpaces = userActivity.getParsedPaymentIdWithSpaces();
        if (parsedPaymentIdWithSpaces != null) {
            upperCase = parsedPaymentIdWithSpaces.toUpperCase(Locale.ROOT);
            j.f(upperCase, numX49.tnTj78("PLA"));
        } else {
            upperCase = null;
        }
        C0633A.d(c0633a, new boolean[]{zC, C0633A.c(c0633a, strN, upperCase, null, 12)});
        return c0633a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0633A v(m mVar, UserActivity userActivity) {
        String upperCase;
        C0633A c0633a = new C0633A();
        C0633A.d(c0633a, new boolean[]{c0633a.add(new C0663x(mVar.W0(), R.drawable.maya_ic_qrph_logo_small))});
        C0633A.d(c0633a, new boolean[]{C0633A.c(c0633a, mVar.M0(), userActivity.mMerchantId(), null, 12), C0633A.c(c0633a, mVar.I0(), userActivity.mBankName(), null, 12)});
        k(c0633a, mVar, userActivity);
        boolean zC = C0633A.c(c0633a, ((MayaAbstractBaseUserActivityFragmentImpl) mVar).L1(), userActivity.getParsedReferenceNoWithSpaces(), null, 12);
        String strN = mVar.n();
        String parsedPaymentIdWithSpaces = userActivity.getParsedPaymentIdWithSpaces();
        if (parsedPaymentIdWithSpaces != null) {
            upperCase = parsedPaymentIdWithSpaces.toUpperCase(Locale.ROOT);
            j.f(upperCase, numX49.tnTj78("PLY"));
        } else {
            upperCase = null;
        }
        C0633A.d(c0633a, new boolean[]{zC, C0633A.c(c0633a, strN, upperCase, null, 12), C0633A.a(c0633a, mVar.p(), userActivity.mTraceNumberLabel(), userActivity.mTraceNumber(), false, null, 24), C0633A.a(c0633a, mVar.o(), userActivity.mInvoiceNumberLabel(), userActivity.mInvoiceNumber(), false, null, 24)});
        return c0633a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0633A w(p pVar, UserActivity userActivity) {
        String upperCase;
        C0633A c0633a = new C0633A();
        boolean zC = C0633A.c(c0633a, pVar.O0(), userActivity.mRecipient(), null, 12);
        String strP0 = pVar.p0();
        String strMItem = userActivity.mItem();
        if (strMItem == null || strMItem.length() == 0) {
            strMItem = null;
        }
        if (strMItem == null) {
            strMItem = userActivity.mProductName();
        }
        C0633A.d(c0633a, new boolean[]{zC, C0633A.c(c0633a, strP0, strMItem, null, 12)});
        k(c0633a, pVar, userActivity);
        boolean zC2 = C0633A.c(c0633a, ((MayaAbstractBaseUserActivityFragmentImpl) pVar).L1(), userActivity.getParsedReferenceNoWithSpaces(), null, 12);
        String strN = pVar.n();
        String parsedPaymentIdWithSpaces = userActivity.getParsedPaymentIdWithSpaces();
        if (parsedPaymentIdWithSpaces != null) {
            upperCase = parsedPaymentIdWithSpaces.toUpperCase(Locale.ROOT);
            j.f(upperCase, numX49.tnTj78("PLT"));
        } else {
            upperCase = null;
        }
        C0633A.d(c0633a, new boolean[]{zC2, C0633A.c(c0633a, strN, upperCase, null, 12)});
        return c0633a;
    }

    public static Bundle x(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        j.f(itKeys, numX49.tnTj78("PLR"));
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            j.e(next, numX49.tnTj78("PLp"));
            String str = next;
            try {
                Object obj = jSONObject.get(str);
                if (obj instanceof String) {
                    bundle.putString(str, (String) obj);
                } else if (obj instanceof Character) {
                    bundle.putChar(str, ((Character) obj).charValue());
                } else if (obj instanceof Integer) {
                    bundle.putInt(str, ((Number) obj).intValue());
                } else if (obj instanceof Float) {
                    bundle.putFloat(str, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(str, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(str, ((Number) obj).longValue());
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    bundle.putBundle(str, x((JSONObject) obj));
                }
            } catch (JSONException unused) {
                S.l(numX49.tnTj78("PL0"));
            }
        }
        return bundle;
    }

    public static byte[] y(String str) {
        try {
            return Base64.decode(str.getBytes("UTF-8"), 3);
        } catch (UnsupportedEncodingException e) {
            yk.a.b();
            throw new PayMayaRuntimeException(numX49.tnTj78("PLg") + e.getMessage());
        }
    }

    public static long z(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public abstract void K(String str);

    @Override // t4.h
    public void c() {
    }

    @Override // t4.h
    public void e() {
    }

    @Override // t4.h
    public void g() {
    }
}
